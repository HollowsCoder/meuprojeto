package o4;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import androidx.appcompat.widget.x0;

public final class b {

    public static class a extends RuntimeException {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public a(@androidx.annotation.RecentlyNonNull java.lang.String r4, @androidx.annotation.RecentlyNonNull android.os.Parcel r5) {
            /*
                r3 = this;
                int r0 = r5.dataPosition()
                int r5 = r5.dataSize()
                r1 = 41
                int r1 = androidx.appcompat.widget.x0.a(r4, r1)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>(r1)
                r2.append(r4)
                java.lang.String r4 = " Parcel: pos="
                r2.append(r4)
                r2.append(r0)
                java.lang.String r4 = " size="
                r2.append(r4)
                r2.append(r5)
                java.lang.String r4 = r2.toString()
                r3.<init>(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o4.b.a.<init>(java.lang.String, android.os.Parcel):void");
        }
    }

    @RecentlyNonNull
    public static Bundle a(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int i10) {
        int m10 = m(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (m10 == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + m10);
        return readBundle;
    }

    @RecentlyNonNull
    public static byte[][] b(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int i10) {
        int m10 = m(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (m10 == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        byte[][] bArr = new byte[readInt][];
        for (int i11 = 0; i11 < readInt; i11++) {
            bArr[i11] = parcel.createByteArray();
        }
        parcel.setDataPosition(dataPosition + m10);
        return bArr;
    }

    @RecentlyNonNull
    public static int[] c(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int i10) {
        int m10 = m(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (m10 == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + m10);
        return createIntArray;
    }

    @RecentlyNonNull
    public static <T extends Parcelable> T d(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int i10, @RecentlyNonNull Parcelable.Creator<T> creator) {
        int m10 = m(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (m10 == 0) {
            return null;
        }
        T t10 = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + m10);
        return t10;
    }

    @RecentlyNonNull
    public static String e(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int i10) {
        int m10 = m(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (m10 == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + m10);
        return readString;
    }

    @RecentlyNonNull
    public static <T> T[] f(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int i10, @RecentlyNonNull Parcelable.Creator<T> creator) {
        int m10 = m(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (m10 == 0) {
            return null;
        }
        T[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + m10);
        return createTypedArray;
    }

    public static void g(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int i10) {
        if (parcel.dataPosition() != i10) {
            StringBuilder sb = new StringBuilder(37);
            sb.append("Overread allowed size end=");
            sb.append(i10);
            throw new a(sb.toString(), parcel);
        }
    }

    @RecentlyNonNull
    public static boolean h(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int i10) {
        p(parcel, i10, 4);
        return parcel.readInt() != 0;
    }

    @RecentlyNonNull
    public static float i(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int i10) {
        p(parcel, i10, 4);
        return parcel.readFloat();
    }

    @RecentlyNonNull
    public static IBinder j(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int i10) {
        int m10 = m(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (m10 == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + m10);
        return readStrongBinder;
    }

    @RecentlyNonNull
    public static int k(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int i10) {
        p(parcel, i10, 4);
        return parcel.readInt();
    }

    @RecentlyNonNull
    public static long l(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int i10) {
        p(parcel, i10, 8);
        return parcel.readLong();
    }

    @RecentlyNonNull
    public static int m(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int i10) {
        return (i10 & -65536) != -65536 ? (i10 >> 16) & 65535 : parcel.readInt();
    }

    public static void n(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int i10) {
        parcel.setDataPosition(parcel.dataPosition() + m(parcel, i10));
    }

    @RecentlyNonNull
    public static int o(@RecentlyNonNull Parcel parcel) {
        String str;
        int readInt = parcel.readInt();
        int m10 = m(parcel, readInt);
        int dataPosition = parcel.dataPosition();
        if ((65535 & readInt) != 20293) {
            String valueOf = String.valueOf(Integer.toHexString(readInt));
            if (valueOf.length() != 0) {
                str = "Expected object header. Got 0x".concat(valueOf);
            } else {
                str = new String("Expected object header. Got 0x");
            }
            throw new a(str, parcel);
        }
        int i10 = m10 + dataPosition;
        if (i10 >= dataPosition && i10 <= parcel.dataSize()) {
            return i10;
        }
        throw new a(x0.c(54, "Size read is invalid start=", dataPosition, " end=", i10), parcel);
    }

    public static void p(Parcel parcel, int i10, int i11) {
        int m10 = m(parcel, i10);
        if (m10 != i11) {
            String hexString = Integer.toHexString(m10);
            StringBuilder sb = new StringBuilder(x0.a(hexString, 46));
            sb.append("Expected size ");
            sb.append(i11);
            sb.append(" got ");
            sb.append(m10);
            throw new a(x0.f(sb, " (0x", hexString, ")"), parcel);
        }
    }

    public static void q(Parcel parcel, int i10, int i11) {
        if (i10 != i11) {
            String hexString = Integer.toHexString(i10);
            StringBuilder sb = new StringBuilder(x0.a(hexString, 46));
            sb.append("Expected size ");
            sb.append(i11);
            sb.append(" got ");
            sb.append(i10);
            throw new a(x0.f(sb, " (0x", hexString, ")"), parcel);
        }
    }
}
