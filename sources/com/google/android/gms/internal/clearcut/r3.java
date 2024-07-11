package com.google.android.gms.internal.clearcut;

import java.nio.charset.Charset;

public final class r3 {

    /* renamed from: a  reason: collision with root package name */
    public static final Object f2540a = new Object();

    static {
        Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
    }

    public static boolean a(Object[] objArr, Object[] objArr2) {
        int length = objArr == null ? 0 : objArr.length;
        int length2 = objArr2 == null ? 0 : objArr2.length;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i10 >= length || objArr[i10] != null) {
                while (i11 < length2 && objArr2[i11] == null) {
                    i11++;
                }
                boolean z = i10 >= length;
                boolean z10 = i11 >= length2;
                if (z && z10) {
                    return true;
                }
                if (z != z10 || !objArr[i10].equals(objArr2[i11])) {
                    return false;
                }
                i10++;
                i11++;
            } else {
                i10++;
            }
        }
    }

    public static int b(Object[] objArr) {
        int length = objArr == null ? 0 : objArr.length;
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            Object obj = objArr[i11];
            if (obj != null) {
                i10 = obj.hashCode() + (i10 * 31);
            }
        }
        return i10;
    }
}
