package k5;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import z4.a;
import z4.b;

public final class i implements f, IInterface {

    /* renamed from: a  reason: collision with root package name */
    public final IBinder f6703a;

    public i(IBinder iBinder) {
        this.f6703a = iBinder;
    }

    public final IBinder asBinder() {
        return this.f6703a;
    }

    public final void m(l lVar, d dVar) {
        a aVar;
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInService");
        int i10 = b.f9928a;
        obtain.writeInt(1);
        lVar.writeToParcel(obtain, 0);
        if (dVar == null) {
            aVar = null;
        } else {
            aVar = (a) dVar;
        }
        obtain.writeStrongBinder(aVar);
        Parcel obtain2 = Parcel.obtain();
        try {
            this.f6703a.transact(12, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }
}
