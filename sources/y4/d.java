package y4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public final class d implements b, IInterface {

    /* renamed from: a  reason: collision with root package name */
    public final IBinder f9553a;

    public d(IBinder iBinder) {
        this.f9553a = iBinder;
    }

    public final boolean a() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        int i10 = a.f9551a;
        boolean z = true;
        obtain.writeInt(1);
        obtain = Parcel.obtain();
        try {
            this.f9553a.transact(2, obtain, obtain, 0);
            obtain.readException();
            obtain.recycle();
            if (obtain.readInt() == 0) {
                z = false;
            }
            return z;
        } catch (RuntimeException e10) {
            throw e10;
        } finally {
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f9553a;
    }

    public final String getId() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        obtain = Parcel.obtain();
        try {
            this.f9553a.transact(1, obtain, obtain, 0);
            obtain.readException();
            obtain.recycle();
            return obtain.readString();
        } catch (RuntimeException e10) {
            throw e10;
        } finally {
            obtain.recycle();
        }
    }
}
