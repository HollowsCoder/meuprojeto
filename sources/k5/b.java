package k5;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

public final class b implements Parcelable.Creator<c> {
    public final Object createFromParcel(Parcel parcel) {
        int o10 = o4.b.o(parcel);
        int i10 = 0;
        Intent intent = null;
        int i11 = 0;
        while (parcel.dataPosition() < o10) {
            int readInt = parcel.readInt();
            int i12 = 65535 & readInt;
            if (i12 == 1) {
                i10 = o4.b.k(parcel, readInt);
            } else if (i12 == 2) {
                i11 = o4.b.k(parcel, readInt);
            } else if (i12 != 3) {
                o4.b.n(parcel, readInt);
            } else {
                intent = (Intent) o4.b.d(parcel, readInt, Intent.CREATOR);
            }
        }
        o4.b.g(parcel, o10);
        return new c(i10, i11, intent);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new c[i10];
    }
}
