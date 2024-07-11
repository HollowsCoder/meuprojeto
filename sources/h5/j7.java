package h5;

import android.os.Parcel;
import android.os.Parcelable;
import com.karumi.dexter.BuildConfig;
import java.util.ArrayList;
import o4.b;

public final class j7 implements Parcelable.Creator<i7> {
    public final Object createFromParcel(Parcel parcel) {
        boolean z;
        Parcel parcel2 = parcel;
        int o10 = b.o(parcel);
        String str = BuildConfig.FLAVOR;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        Boolean bool = null;
        ArrayList<String> arrayList = null;
        String str9 = null;
        long j8 = 0;
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        long j13 = 0;
        boolean z10 = true;
        boolean z11 = true;
        boolean z12 = false;
        int i10 = 0;
        boolean z13 = false;
        long j14 = -2147483648L;
        while (parcel.dataPosition() < o10) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    str2 = b.e(parcel2, readInt);
                    break;
                case 3:
                    str3 = b.e(parcel2, readInt);
                    break;
                case 4:
                    str4 = b.e(parcel2, readInt);
                    break;
                case 5:
                    str5 = b.e(parcel2, readInt);
                    break;
                case 6:
                    j8 = b.l(parcel2, readInt);
                    break;
                case 7:
                    j10 = b.l(parcel2, readInt);
                    break;
                case 8:
                    str6 = b.e(parcel2, readInt);
                    break;
                case 9:
                    z10 = b.h(parcel2, readInt);
                    break;
                case 10:
                    z12 = b.h(parcel2, readInt);
                    break;
                case 11:
                    j14 = b.l(parcel2, readInt);
                    break;
                case 12:
                    str7 = b.e(parcel2, readInt);
                    break;
                case 13:
                    j11 = b.l(parcel2, readInt);
                    break;
                case 14:
                    j12 = b.l(parcel2, readInt);
                    break;
                case 15:
                    i10 = b.k(parcel2, readInt);
                    break;
                case 16:
                    z11 = b.h(parcel2, readInt);
                    break;
                case 18:
                    z13 = b.h(parcel2, readInt);
                    break;
                case 19:
                    str8 = b.e(parcel2, readInt);
                    break;
                case 21:
                    int m10 = b.m(parcel2, readInt);
                    if (m10 != 0) {
                        b.q(parcel2, m10, 4);
                        if (parcel.readInt() != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        bool = Boolean.valueOf(z);
                        break;
                    } else {
                        bool = null;
                        break;
                    }
                case 22:
                    j13 = b.l(parcel2, readInt);
                    break;
                case 23:
                    int m11 = b.m(parcel2, readInt);
                    int dataPosition = parcel.dataPosition();
                    if (m11 != 0) {
                        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
                        parcel2.setDataPosition(dataPosition + m11);
                        arrayList = createStringArrayList;
                        break;
                    } else {
                        arrayList = null;
                        break;
                    }
                case 24:
                    str9 = b.e(parcel2, readInt);
                    break;
                case 25:
                    str = b.e(parcel2, readInt);
                    break;
                default:
                    b.n(parcel2, readInt);
                    break;
            }
        }
        b.g(parcel2, o10);
        return new i7(str2, str3, str4, str5, j8, j10, str6, z10, z12, j14, str7, j11, j12, i10, z11, z13, str8, bool, j13, (ArrayList) arrayList, str9, str);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i10) {
        return new i7[i10];
    }
}
