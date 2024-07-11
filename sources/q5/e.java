package q5;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import o4.b;

public final class e implements Parcelable.Creator<c> {
    public final Object createFromParcel(Parcel parcel) {
        int o10 = b.o(parcel);
        PointF[] pointFArr = null;
        int i10 = 0;
        while (parcel.dataPosition() < o10) {
            int readInt = parcel.readInt();
            int i11 = 65535 & readInt;
            if (i11 == 2) {
                pointFArr = (PointF[]) b.f(parcel, readInt, PointF.CREATOR);
            } else if (i11 != 3) {
                b.n(parcel, readInt);
            } else {
                i10 = b.k(parcel, readInt);
            }
        }
        b.g(parcel, o10);
        return new c(pointFArr, i10);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new c[i10];
    }
}
