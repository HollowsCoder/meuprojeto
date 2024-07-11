package z0;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.MultiInstanceInvalidationService;
import z0.a;

public abstract class b extends Binder implements IInterface {
    public b() {
        attachInterface(this, "androidx.room.IMultiInstanceInvalidationService");
    }

    public final IBinder asBinder() {
        return this;
    }

    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        IInterface iInterface = null;
        int i12 = 0;
        if (i10 == 1) {
            parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
                if (queryLocalInterface == null || !(queryLocalInterface instanceof a)) {
                    iInterface = new a.C0171a.C0172a(readStrongBinder);
                } else {
                    iInterface = (a) queryLocalInterface;
                }
            }
            String readString = parcel.readString();
            MultiInstanceInvalidationService.b bVar = (MultiInstanceInvalidationService.b) this;
            if (readString != null) {
                synchronized (MultiInstanceInvalidationService.this.f1872q) {
                    MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
                    int i13 = multiInstanceInvalidationService.f1870o + 1;
                    multiInstanceInvalidationService.f1870o = i13;
                    if (multiInstanceInvalidationService.f1872q.register(iInterface, Integer.valueOf(i13))) {
                        MultiInstanceInvalidationService.this.f1871p.put(Integer.valueOf(i13), readString);
                        i12 = i13;
                    } else {
                        MultiInstanceInvalidationService multiInstanceInvalidationService2 = MultiInstanceInvalidationService.this;
                        multiInstanceInvalidationService2.f1870o--;
                    }
                }
            }
            parcel2.writeNoException();
            parcel2.writeInt(i12);
            return true;
        } else if (i10 == 2) {
            parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
                if (queryLocalInterface2 == null || !(queryLocalInterface2 instanceof a)) {
                    iInterface = new a.C0171a.C0172a(readStrongBinder2);
                } else {
                    iInterface = (a) queryLocalInterface2;
                }
            }
            int readInt = parcel.readInt();
            MultiInstanceInvalidationService.b bVar2 = (MultiInstanceInvalidationService.b) this;
            synchronized (MultiInstanceInvalidationService.this.f1872q) {
                MultiInstanceInvalidationService.this.f1872q.unregister(iInterface);
                MultiInstanceInvalidationService.this.f1871p.remove(Integer.valueOf(readInt));
            }
            parcel2.writeNoException();
            return true;
        } else if (i10 == 3) {
            parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
            int readInt2 = parcel.readInt();
            String[] createStringArray = parcel.createStringArray();
            MultiInstanceInvalidationService.b bVar3 = (MultiInstanceInvalidationService.b) this;
            synchronized (MultiInstanceInvalidationService.this.f1872q) {
                String str = MultiInstanceInvalidationService.this.f1871p.get(Integer.valueOf(readInt2));
                if (str == null) {
                    Log.w("ROOM", "Remote invalidation client ID not registered");
                } else {
                    int beginBroadcast = MultiInstanceInvalidationService.this.f1872q.beginBroadcast();
                    while (i12 < beginBroadcast) {
                        try {
                            int intValue = ((Integer) MultiInstanceInvalidationService.this.f1872q.getBroadcastCookie(i12)).intValue();
                            String str2 = MultiInstanceInvalidationService.this.f1871p.get(Integer.valueOf(intValue));
                            if (readInt2 != intValue && str.equals(str2)) {
                                ((a) MultiInstanceInvalidationService.this.f1872q.getBroadcastItem(i12)).j(createStringArray);
                            }
                        } catch (RemoteException e10) {
                            Log.w("ROOM", "Error invoking a remote callback", e10);
                        } catch (Throwable th) {
                            MultiInstanceInvalidationService.this.f1872q.finishBroadcast();
                            throw th;
                        }
                        i12++;
                    }
                    MultiInstanceInvalidationService.this.f1872q.finishBroadcast();
                }
            }
            return true;
        } else if (i10 != 1598968902) {
            return super.onTransact(i10, parcel, parcel2, i11);
        } else {
            parcel2.writeString("androidx.room.IMultiInstanceInvalidationService");
            return true;
        }
    }
}
