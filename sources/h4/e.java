package h4;

import android.os.Parcel;
import android.os.Parcelable;
import o4.b;

public final class e implements Parcelable.Creator<d> {
    public final Object createFromParcel(Parcel parcel) {
        int o10 = b.o(parcel);
        boolean z = false;
        long j8 = 0;
        long j10 = 0;
        while (parcel.dataPosition() < o10) {
            int readInt = parcel.readInt();
            int i10 = 65535 & readInt;
            if (i10 == 1) {
                z = b.h(parcel, readInt);
            } else if (i10 == 2) {
                j10 = b.l(parcel, readInt);
            } else if (i10 != 3) {
                b.n(parcel, readInt);
            } else {
                j8 = b.l(parcel, readInt);
            }
        }
        b.g(parcel, o10);
        return new d(z, j8, j10);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new d[i10];
    }
}
