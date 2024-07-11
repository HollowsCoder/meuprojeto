package v4;

import android.os.IBinder;
import android.os.Parcel;
import b5.c;
import u4.a;

public final class b extends b5.b implements c {
    public b(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    public final a C(u4.b bVar, String str, int i10) {
        Parcel I = I();
        c.b(I, bVar);
        I.writeString(str);
        I.writeInt(i10);
        Parcel J = J(I, 4);
        a J2 = a.C0136a.J(J.readStrongBinder());
        J.recycle();
        return J2;
    }

    public final int H(u4.b bVar, String str, boolean z) {
        Parcel I = I();
        c.b(I, bVar);
        I.writeString(str);
        I.writeInt(z ? 1 : 0);
        Parcel J = J(I, 5);
        int readInt = J.readInt();
        J.recycle();
        return readInt;
    }

    public final int a() {
        Parcel J = J(I(), 6);
        int readInt = J.readInt();
        J.recycle();
        return readInt;
    }

    public final a b(u4.b bVar, String str, int i10, u4.b bVar2) {
        Parcel I = I();
        c.b(I, bVar);
        I.writeString(str);
        I.writeInt(i10);
        c.b(I, bVar2);
        Parcel J = J(I, 8);
        a J2 = a.C0136a.J(J.readStrongBinder());
        J.recycle();
        return J2;
    }

    public final a f(u4.b bVar, String str, boolean z) {
        Parcel I = I();
        c.b(I, bVar);
        I.writeString(str);
        I.writeInt(z ? 1 : 0);
        Parcel J = J(I, 7);
        a J2 = a.C0136a.J(J.readStrongBinder());
        J.recycle();
        return J2;
    }

    public final a s(u4.b bVar, String str, int i10) {
        Parcel I = I();
        c.b(I, bVar);
        I.writeString(str);
        I.writeInt(i10);
        Parcel J = J(I, 2);
        a J2 = a.C0136a.J(J.readStrongBinder());
        J.recycle();
        return J2;
    }

    public final int x(u4.b bVar, String str, boolean z) {
        Parcel I = I();
        c.b(I, bVar);
        I.writeString(str);
        I.writeInt(z ? 1 : 0);
        Parcel J = J(I, 3);
        int readInt = J.readInt();
        J.recycle();
        return readInt;
    }
}
