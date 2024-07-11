package n4;

import android.os.IBinder;
import android.os.Parcel;
import b5.b;
import b5.c;
import j4.t;

public final class o0 extends b implements n0 {
    public o0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    public final boolean v(t tVar, u4.b bVar) {
        Parcel I = I();
        int i10 = c.f1957a;
        boolean z = true;
        I.writeInt(1);
        tVar.writeToParcel(I, 0);
        c.b(I, bVar);
        Parcel J = J(I, 5);
        if (J.readInt() == 0) {
            z = false;
        }
        J.recycle();
        return z;
    }
}
