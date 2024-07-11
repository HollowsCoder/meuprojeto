package com.google.android.gms.internal.vision;

import android.os.Parcel;
import android.os.Parcelable;
import o4.b;

public final class r4 implements Parcelable.Creator<p4> {
    public final Object createFromParcel(Parcel parcel) {
        int o10 = b.o(parcel);
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        long j8 = 0;
        while (parcel.dataPosition() < o10) {
            int readInt = parcel.readInt();
            int i14 = 65535 & readInt;
            if (i14 == 2) {
                i10 = b.k(parcel, readInt);
            } else if (i14 == 3) {
                i11 = b.k(parcel, readInt);
            } else if (i14 == 4) {
                i12 = b.k(parcel, readInt);
            } else if (i14 == 5) {
                j8 = b.l(parcel, readInt);
            } else if (i14 != 6) {
                b.n(parcel, readInt);
            } else {
                i13 = b.k(parcel, readInt);
            }
        }
        b.g(parcel, o10);
        return new p4(i10, i11, i12, j8, i13);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new p4[i10];
    }
}
