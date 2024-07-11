package o4;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;

public final class c {
    public static void a(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int i10, @RecentlyNonNull Bundle bundle) {
        if (bundle != null) {
            int h10 = h(parcel, i10);
            parcel.writeBundle(bundle);
            k(parcel, h10);
        }
    }

    public static void b(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int i10, @RecentlyNonNull byte[][] bArr) {
        if (bArr != null) {
            int h10 = h(parcel, i10);
            parcel.writeInt(r0);
            for (byte[] writeByteArray : bArr) {
                parcel.writeByteArray(writeByteArray);
            }
            k(parcel, h10);
        }
    }

    public static void c(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int i10, @RecentlyNonNull IBinder iBinder) {
        if (iBinder != null) {
            int h10 = h(parcel, i10);
            parcel.writeStrongBinder(iBinder);
            k(parcel, h10);
        }
    }

    public static void d(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int i10, @RecentlyNonNull int[] iArr) {
        if (iArr != null) {
            int h10 = h(parcel, i10);
            parcel.writeIntArray(iArr);
            k(parcel, h10);
        }
    }

    public static void e(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int i10, @RecentlyNonNull Parcelable parcelable, @RecentlyNonNull int i11) {
        if (parcelable != null) {
            int h10 = h(parcel, i10);
            parcelable.writeToParcel(parcel, i11);
            k(parcel, h10);
        }
    }

    public static void f(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int i10, @RecentlyNonNull String str) {
        if (str != null) {
            int h10 = h(parcel, i10);
            parcel.writeString(str);
            k(parcel, h10);
        }
    }

    public static void g(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int i10, @RecentlyNonNull Parcelable[] parcelableArr, @RecentlyNonNull int i11) {
        if (parcelableArr != null) {
            int h10 = h(parcel, i10);
            parcel.writeInt(r0);
            for (Parcelable parcelable : parcelableArr) {
                if (parcelable == null) {
                    parcel.writeInt(0);
                } else {
                    j(parcel, parcelable, i11);
                }
            }
            k(parcel, h10);
        }
    }

    public static int h(Parcel parcel, int i10) {
        parcel.writeInt(i10 | -65536);
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static void i(Parcel parcel, int i10, int i11) {
        if (i11 >= 65535) {
            parcel.writeInt(i10 | -65536);
            parcel.writeInt(i11);
            return;
        }
        parcel.writeInt(i10 | (i11 << 16));
    }

    public static <T extends Parcelable> void j(Parcel parcel, T t10, int i10) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int dataPosition2 = parcel.dataPosition();
        t10.writeToParcel(parcel, i10);
        int dataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition3 - dataPosition2);
        parcel.setDataPosition(dataPosition3);
    }

    public static void k(Parcel parcel, int i10) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i10 - 4);
        parcel.writeInt(dataPosition - i10);
        parcel.setDataPosition(dataPosition);
    }
}
