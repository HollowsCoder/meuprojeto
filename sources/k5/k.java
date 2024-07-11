package k5;

import android.os.Parcel;
import android.os.Parcelable;
import n4.v;
import o4.b;

public final class k implements Parcelable.Creator<l> {
    public final Object createFromParcel(Parcel parcel) {
        int o10 = b.o(parcel);
        int i10 = 0;
        v vVar = null;
        while (parcel.dataPosition() < o10) {
            int readInt = parcel.readInt();
            int i11 = 65535 & readInt;
            if (i11 == 1) {
                i10 = b.k(parcel, readInt);
            } else if (i11 != 2) {
                b.n(parcel, readInt);
            } else {
                vVar = (v) b.d(parcel, readInt, v.CREATOR);
            }
        }
        b.g(parcel, o10);
        return new l(i10, vVar);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new l[i10];
    }
}
