package n4;

import android.os.Parcel;
import android.os.Parcelable;
import o4.b;

public final class q0 implements Parcelable.Creator<n> {
    public final Object createFromParcel(Parcel parcel) {
        int o10 = b.o(parcel);
        int i10 = 0;
        boolean z = false;
        boolean z10 = false;
        int i11 = 0;
        int i12 = 0;
        while (parcel.dataPosition() < o10) {
            int readInt = parcel.readInt();
            int i13 = 65535 & readInt;
            if (i13 == 1) {
                i10 = b.k(parcel, readInt);
            } else if (i13 == 2) {
                z = b.h(parcel, readInt);
            } else if (i13 == 3) {
                z10 = b.h(parcel, readInt);
            } else if (i13 == 4) {
                i11 = b.k(parcel, readInt);
            } else if (i13 != 5) {
                b.n(parcel, readInt);
            } else {
                i12 = b.k(parcel, readInt);
            }
        }
        b.g(parcel, o10);
        return new n(i10, z, z10, i11, i12);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new n[i10];
    }
}
