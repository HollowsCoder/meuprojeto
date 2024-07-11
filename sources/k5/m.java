package k5;

import android.os.Parcel;
import android.os.Parcelable;
import n4.w;
import o4.b;

public final class m implements Parcelable.Creator<n> {
    public final Object createFromParcel(Parcel parcel) {
        int o10 = b.o(parcel);
        int i10 = 0;
        j4.b bVar = null;
        w wVar = null;
        while (parcel.dataPosition() < o10) {
            int readInt = parcel.readInt();
            int i11 = 65535 & readInt;
            if (i11 == 1) {
                i10 = b.k(parcel, readInt);
            } else if (i11 == 2) {
                bVar = (j4.b) b.d(parcel, readInt, j4.b.CREATOR);
            } else if (i11 != 3) {
                b.n(parcel, readInt);
            } else {
                wVar = (w) b.d(parcel, readInt, w.CREATOR);
            }
        }
        b.g(parcel, o10);
        return new n(i10, bVar, wVar);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new n[i10];
    }
}
