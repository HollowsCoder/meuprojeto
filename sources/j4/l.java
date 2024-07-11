package j4;

import android.os.Parcel;
import android.os.Parcelable;
import o4.b;

public final class l implements Parcelable.Creator<d> {
    public final Object createFromParcel(Parcel parcel) {
        int o10 = b.o(parcel);
        String str = null;
        int i10 = 0;
        long j8 = -1;
        while (parcel.dataPosition() < o10) {
            int readInt = parcel.readInt();
            int i11 = 65535 & readInt;
            if (i11 == 1) {
                str = b.e(parcel, readInt);
            } else if (i11 == 2) {
                i10 = b.k(parcel, readInt);
            } else if (i11 != 3) {
                b.n(parcel, readInt);
            } else {
                j8 = b.l(parcel, readInt);
            }
        }
        b.g(parcel, o10);
        return new d(str, j8, i10);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new d[i10];
    }
}
