package f9;

import p9.u;

public class g extends f {
    public static final Integer T(String str) {
        int i10;
        boolean z;
        int i11;
        u.e(10);
        int length = str.length();
        if (length != 0) {
            int i12 = 0;
            char charAt = str.charAt(0);
            int i13 = -2147483647;
            if (z8.g.h(charAt, 48) < 0) {
                i10 = 1;
                if (length != 1) {
                    if (charAt == '-') {
                        i13 = Integer.MIN_VALUE;
                        z = true;
                    } else if (charAt == '+') {
                        z = false;
                    }
                }
            } else {
                z = false;
                i10 = 0;
            }
            int i14 = -59652323;
            while (i10 < length) {
                int digit = Character.digit(str.charAt(i10), 10);
                if (digit >= 0 && ((i12 >= i14 || (i14 == -59652323 && i12 >= (i14 = i13 / 10))) && (i11 = i12 * 10) >= i13 + digit)) {
                    i12 = i11 - digit;
                    i10++;
                }
            }
            if (z) {
                return Integer.valueOf(i12);
            }
            return Integer.valueOf(-i12);
        }
        return null;
    }
}
