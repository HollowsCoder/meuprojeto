package v4;

import android.os.IBinder;
import android.os.Parcel;
import b5.b;
import b5.c;
import u4.a;

public final class d extends b implements e {
    public d(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    public final a b(u4.b bVar, String str, int i10, u4.b bVar2) {
        Parcel I = I();
        c.b(I, bVar);
        I.writeString(str);
        I.writeInt(i10);
        c.b(I, bVar2);
        Parcel J = J(I, 2);
        a J2 = a.C0136a.J(J.readStrongBinder());
        J.recycle();
        return J2;
    }

    public final a w(u4.b bVar, String str, int i10, u4.b bVar2) {
        Parcel I = I();
        c.b(I, bVar);
        I.writeString(str);
        I.writeInt(i10);
        c.b(I, bVar2);
        Parcel J = J(I, 3);
        a J2 = a.C0136a.J(J.readStrongBinder());
        J.recycle();
        return J2;
    }
}
