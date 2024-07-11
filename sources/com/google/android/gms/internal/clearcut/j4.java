package com.google.android.gms.internal.clearcut;

import android.os.Parcel;
import android.os.Parcelable;
import o4.b;

public final class j4 implements Parcelable.Creator<i4> {
    public final Object createFromParcel(Parcel parcel) {
        int o10 = b.o(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        int i10 = 0;
        int i11 = 0;
        boolean z = false;
        int i12 = 0;
        boolean z10 = true;
        while (parcel.dataPosition() < o10) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    str = b.e(parcel, readInt);
                    break;
                case 3:
                    i10 = b.k(parcel, readInt);
                    break;
                case 4:
                    i11 = b.k(parcel, readInt);
                    break;
                case 5:
                    str2 = b.e(parcel, readInt);
                    break;
                case 6:
                    str3 = b.e(parcel, readInt);
                    break;
                case 7:
                    z10 = b.h(parcel, readInt);
                    break;
                case 8:
                    str4 = b.e(parcel, readInt);
                    break;
                case 9:
                    z = b.h(parcel, readInt);
                    break;
                case 10:
                    i12 = b.k(parcel, readInt);
                    break;
                default:
                    b.n(parcel, readInt);
                    break;
            }
        }
        b.g(parcel, o10);
        return new i4(str, i10, i11, str2, str3, z10, str4, z, i12);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new i4[i10];
    }
}
