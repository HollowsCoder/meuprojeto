package q5;

import android.os.Parcel;
import android.os.Parcelable;
import o4.b;

public final class n implements Parcelable.Creator<b> {
    public final Object createFromParcel(Parcel parcel) {
        int o10 = b.o(parcel);
        int i10 = 0;
        float f10 = 0.0f;
        float f11 = 0.0f;
        int i11 = 0;
        while (parcel.dataPosition() < o10) {
            int readInt = parcel.readInt();
            int i12 = 65535 & readInt;
            if (i12 == 1) {
                i10 = b.k(parcel, readInt);
            } else if (i12 == 2) {
                f10 = b.i(parcel, readInt);
            } else if (i12 == 3) {
                f11 = b.i(parcel, readInt);
            } else if (i12 != 4) {
                b.n(parcel, readInt);
            } else {
                i11 = b.k(parcel, readInt);
            }
        }
        b.g(parcel, o10);
        return new b(f10, f11, i10, i11);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new b[i10];
    }
}
