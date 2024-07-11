package h5;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.a0;
import com.google.android.gms.internal.measurement.c0;
import java.util.ArrayList;
import java.util.List;

public final class v2 extends a0 implements x2 {
    public v2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService", 0);
    }

    public final byte[] A(p pVar, String str) {
        Parcel J = J();
        c0.b(J, pVar);
        J.writeString(str);
        Parcel I = I(J, 9);
        byte[] createByteArray = I.createByteArray();
        I.recycle();
        return createByteArray;
    }

    public final List<b> B(String str, String str2, String str3) {
        Parcel J = J();
        J.writeString((String) null);
        J.writeString(str2);
        J.writeString(str3);
        Parcel I = I(J, 17);
        ArrayList<b> createTypedArrayList = I.createTypedArrayList(b.CREATOR);
        I.recycle();
        return createTypedArrayList;
    }

    public final void E(i7 i7Var) {
        Parcel J = J();
        c0.b(J, i7Var);
        L(J, 18);
    }

    public final void F(i7 i7Var) {
        Parcel J = J();
        c0.b(J, i7Var);
        L(J, 4);
    }

    public final List<c7> G(String str, String str2, String str3, boolean z) {
        Parcel J = J();
        J.writeString((String) null);
        J.writeString(str2);
        J.writeString(str3);
        ClassLoader classLoader = c0.f2650a;
        J.writeInt(z ? 1 : 0);
        Parcel I = I(J, 15);
        ArrayList<c7> createTypedArrayList = I.createTypedArrayList(c7.CREATOR);
        I.recycle();
        return createTypedArrayList;
    }

    public final void d(Bundle bundle, i7 i7Var) {
        Parcel J = J();
        c0.b(J, bundle);
        c0.b(J, i7Var);
        L(J, 19);
    }

    public final List<c7> g(String str, String str2, boolean z, i7 i7Var) {
        Parcel J = J();
        J.writeString(str);
        J.writeString(str2);
        ClassLoader classLoader = c0.f2650a;
        J.writeInt(z ? 1 : 0);
        c0.b(J, i7Var);
        Parcel I = I(J, 14);
        ArrayList<c7> createTypedArrayList = I.createTypedArrayList(c7.CREATOR);
        I.recycle();
        return createTypedArrayList;
    }

    public final void l(p pVar, i7 i7Var) {
        Parcel J = J();
        c0.b(J, pVar);
        c0.b(J, i7Var);
        L(J, 1);
    }

    public final void n(i7 i7Var) {
        Parcel J = J();
        c0.b(J, i7Var);
        L(J, 20);
    }

    public final void o(i7 i7Var) {
        Parcel J = J();
        c0.b(J, i7Var);
        L(J, 6);
    }

    public final List<b> p(String str, String str2, i7 i7Var) {
        Parcel J = J();
        J.writeString(str);
        J.writeString(str2);
        c0.b(J, i7Var);
        Parcel I = I(J, 16);
        ArrayList<b> createTypedArrayList = I.createTypedArrayList(b.CREATOR);
        I.recycle();
        return createTypedArrayList;
    }

    public final String q(i7 i7Var) {
        Parcel J = J();
        c0.b(J, i7Var);
        Parcel I = I(J, 11);
        String readString = I.readString();
        I.recycle();
        return readString;
    }

    public final void r(b bVar, i7 i7Var) {
        Parcel J = J();
        c0.b(J, bVar);
        c0.b(J, i7Var);
        L(J, 12);
    }

    public final void t(c7 c7Var, i7 i7Var) {
        Parcel J = J();
        c0.b(J, c7Var);
        c0.b(J, i7Var);
        L(J, 2);
    }

    public final void u(long j8, String str, String str2, String str3) {
        Parcel J = J();
        J.writeLong(j8);
        J.writeString(str);
        J.writeString(str2);
        J.writeString(str3);
        L(J, 10);
    }
}
