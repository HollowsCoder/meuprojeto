package n4;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import j4.d;
import o4.b;

public final class z implements Parcelable.Creator<a0> {
    public final Object createFromParcel(Parcel parcel) {
        int o10 = b.o(parcel);
        Bundle bundle = null;
        int i10 = 0;
        d[] dVarArr = null;
        while (parcel.dataPosition() < o10) {
            int readInt = parcel.readInt();
            int i11 = 65535 & readInt;
            if (i11 == 1) {
                bundle = b.a(parcel, readInt);
            } else if (i11 == 2) {
                dVarArr = (d[]) b.f(parcel, readInt, d.CREATOR);
            } else if (i11 == 3) {
                i10 = b.k(parcel, readInt);
            } else if (i11 != 4) {
                b.n(parcel, readInt);
            } else {
                d dVar = (d) b.d(parcel, readInt, d.CREATOR);
            }
        }
        b.g(parcel, o10);
        return new a0(bundle, dVarArr, i10);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new a0[i10];
    }
}
