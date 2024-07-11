package r4;

import androidx.annotation.RecentlyNonNull;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final char[] f8432a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: b  reason: collision with root package name */
    public static final char[] f8433b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    @RecentlyNonNull
    public static String a(@RecentlyNonNull byte[] bArr) {
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(length << 1);
        for (int i10 = 0; i10 < length; i10++) {
            char[] cArr = f8432a;
            sb.append(cArr[(bArr[i10] & 240) >>> 4]);
            sb.append(cArr[bArr[i10] & 15]);
        }
        return sb.toString();
    }
}
