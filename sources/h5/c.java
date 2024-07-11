package h5;

import android.os.Parcel;
import android.os.Parcelable;
import o4.b;

public final class c implements Parcelable.Creator<b> {
    public final Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int o10 = b.o(parcel);
        String str = null;
        String str2 = null;
        c7 c7Var = null;
        String str3 = null;
        p pVar = null;
        p pVar2 = null;
        p pVar3 = null;
        long j8 = 0;
        long j10 = 0;
        long j11 = 0;
        boolean z = false;
        while (parcel.dataPosition() < o10) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    str = b.e(parcel2, readInt);
                    break;
                case 3:
                    str2 = b.e(parcel2, readInt);
                    break;
                case 4:
                    c7Var = (c7) b.d(parcel2, readInt, c7.CREATOR);
                    break;
                case 5:
                    j8 = b.l(parcel2, readInt);
                    break;
                case 6:
                    z = b.h(parcel2, readInt);
                    break;
                case 7:
                    str3 = b.e(parcel2, readInt);
                    break;
                case 8:
                    pVar = (p) b.d(parcel2, readInt, p.CREATOR);
                    break;
                case 9:
                    j10 = b.l(parcel2, readInt);
                    break;
                case 10:
                    pVar2 = (p) b.d(parcel2, readInt, p.CREATOR);
                    break;
                case 11:
                    j11 = b.l(parcel2, readInt);
                    break;
                case 12:
                    pVar3 = (p) b.d(parcel2, readInt, p.CREATOR);
                    break;
                default:
                    b.n(parcel2, readInt);
                    break;
            }
        }
        b.g(parcel2, o10);
        return new b(str, str2, c7Var, j8, z, str3, pVar, j10, pVar2, j11, pVar3);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i10) {
        return new b[i10];
    }
}
