package n4;

import android.os.IBinder;
import android.os.Parcel;
import b5.b;
import u4.a;

public final class k0 extends b implements j0 {
    public k0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    public final a a() {
        Parcel J = J(I(), 1);
        a J2 = a.C0136a.J(J.readStrongBinder());
        J.recycle();
        return J2;
    }

    public final int zzc() {
        Parcel J = J(I(), 2);
        int readInt = J.readInt();
        J.recycle();
        return readInt;
    }
}
