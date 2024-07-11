package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import o4.b;

public final class x0 implements Parcelable.Creator<w0> {
    public final Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int o10 = b.o(parcel);
        long j8 = 0;
        long j10 = 0;
        boolean z = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        Bundle bundle = null;
        String str4 = null;
        while (parcel.dataPosition() < o10) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    j8 = b.l(parcel2, readInt);
                    break;
                case 2:
                    j10 = b.l(parcel2, readInt);
                    break;
                case 3:
                    z = b.h(parcel2, readInt);
                    break;
                case 4:
                    str = b.e(parcel2, readInt);
                    break;
                case 5:
                    str2 = b.e(parcel2, readInt);
                    break;
                case 6:
                    str3 = b.e(parcel2, readInt);
                    break;
                case 7:
                    bundle = b.a(parcel2, readInt);
                    break;
                case 8:
                    str4 = b.e(parcel2, readInt);
                    break;
                default:
                    b.n(parcel2, readInt);
                    break;
            }
        }
        b.g(parcel2, o10);
        return new w0(j8, j10, z, str, str2, str3, bundle, str4);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i10) {
        return new w0[i10];
    }
}
