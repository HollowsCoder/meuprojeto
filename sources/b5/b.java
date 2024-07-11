package b5;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class b implements IInterface {

    /* renamed from: a  reason: collision with root package name */
    public final IBinder f1955a;

    /* renamed from: b  reason: collision with root package name */
    public final String f1956b;

    public b(IBinder iBinder, String str) {
        this.f1955a = iBinder;
        this.f1956b = str;
    }

    public final Parcel I() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f1956b);
        return obtain;
    }

    public final Parcel J(Parcel parcel, int i10) {
        parcel = Parcel.obtain();
        try {
            this.f1955a.transact(i10, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e10) {
            throw e10;
        } finally {
            parcel.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f1955a;
    }
}
