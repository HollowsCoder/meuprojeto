package h5;

import android.os.Parcel;
import android.os.Parcelable;
import o4.b;
import o4.c;

public final class q implements Parcelable.Creator<p> {
    public static void a(p pVar, Parcel parcel, int i10) {
        int h10 = c.h(parcel, 20293);
        c.f(parcel, 2, pVar.f5621o);
        c.e(parcel, 3, pVar.f5622p, i10);
        c.f(parcel, 4, pVar.f5623q);
        c.i(parcel, 5, 8);
        parcel.writeLong(pVar.f5624r);
        c.k(parcel, h10);
    }

    public final Object createFromParcel(Parcel parcel) {
        int o10 = b.o(parcel);
        String str = null;
        n nVar = null;
        String str2 = null;
        long j8 = 0;
        while (parcel.dataPosition() < o10) {
            int readInt = parcel.readInt();
            int i10 = 65535 & readInt;
            if (i10 == 2) {
                str = b.e(parcel, readInt);
            } else if (i10 == 3) {
                nVar = (n) b.d(parcel, readInt, n.CREATOR);
            } else if (i10 == 4) {
                str2 = b.e(parcel, readInt);
            } else if (i10 != 5) {
                b.n(parcel, readInt);
            } else {
                j8 = b.l(parcel, readInt);
            }
        }
        b.g(parcel, o10);
        return new p(str, nVar, str2, j8);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i10) {
        return new p[i10];
    }
}
