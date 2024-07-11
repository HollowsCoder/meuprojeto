package q5;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.a0;
import com.google.android.gms.internal.vision.p4;
import u4.b;

public final class k extends a0 implements i {
    public k(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.vision.face.internal.client.INativeFaceDetector", 1);
    }

    public final a[] k(b bVar, p4 p4Var) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f2608b);
        int i10 = com.google.android.gms.internal.vision.b.f3056a;
        obtain.writeStrongBinder(bVar);
        obtain.writeInt(1);
        p4Var.writeToParcel(obtain, 0);
        Parcel K = K(obtain, 1);
        a[] aVarArr = (a[]) K.createTypedArray(a.CREATOR);
        K.recycle();
        return aVarArr;
    }

    public final void zza() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f2608b);
        Parcel obtain2 = Parcel.obtain();
        try {
            this.f2607a.transact(3, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }
}
