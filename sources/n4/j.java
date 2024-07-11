package n4;

import android.os.IBinder;
import android.os.Parcel;
import n4.b;

public final class j implements k {

    /* renamed from: a  reason: collision with root package name */
    public final IBinder f7446a;

    public j(IBinder iBinder) {
        this.f7446a = iBinder;
    }

    public final IBinder asBinder() {
        return this.f7446a;
    }

    public final void i(b.i iVar, e eVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            obtain.writeStrongBinder(iVar);
            obtain.writeInt(1);
            eVar.writeToParcel(obtain, 0);
            this.f7446a.transact(46, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
