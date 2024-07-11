package q5;

import android.os.Parcel;
import android.os.Parcelable;
import o4.b;

public final class g implements Parcelable.Creator<h> {
    public final Object createFromParcel(Parcel parcel) {
        int o10 = b.o(parcel);
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        boolean z = false;
        boolean z10 = false;
        float f10 = -1.0f;
        while (parcel.dataPosition() < o10) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    i10 = b.k(parcel, readInt);
                    break;
                case 3:
                    i11 = b.k(parcel, readInt);
                    break;
                case 4:
                    i12 = b.k(parcel, readInt);
                    break;
                case 5:
                    z = b.h(parcel, readInt);
                    break;
                case 6:
                    z10 = b.h(parcel, readInt);
                    break;
                case 7:
                    f10 = b.i(parcel, readInt);
                    break;
                default:
                    b.n(parcel, readInt);
                    break;
            }
        }
        b.g(parcel, o10);
        return new h(i10, i11, i12, z, z10, f10);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new h[i10];
    }
}
