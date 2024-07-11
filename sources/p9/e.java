package p9;

import b0.d;
import com.karumi.dexter.BuildConfig;
import f9.h;
import j9.c;
import w9.j;
import z8.g;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final j f7992a = j.a.c("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* renamed from: b  reason: collision with root package name */
    public static final String[] f7993b = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    /* renamed from: c  reason: collision with root package name */
    public static final String[] f7994c = new String[64];
    public static final String[] d;

    /* renamed from: e  reason: collision with root package name */
    public static final e f7995e = new e();

    static {
        j jVar = j.f9328r;
        String[] strArr = new String[256];
        for (int i10 = 0; i10 < 256; i10++) {
            String binaryString = Integer.toBinaryString(i10);
            g.e(binaryString, "Integer.toBinaryString(it)");
            String replace = c.h("%8s", binaryString).replace(' ', '0');
            g.e(replace, "this as java.lang.String…replace(oldChar, newChar)");
            strArr[i10] = replace;
        }
        d = strArr;
        String[] strArr2 = f7994c;
        strArr2[0] = BuildConfig.FLAVOR;
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        strArr2[9] = g.k("|PADDED", "END_STREAM");
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i11 = 0; i11 < 3; i11++) {
            int i12 = iArr2[i11];
            int i13 = iArr[0];
            String[] strArr3 = f7994c;
            int i14 = i13 | i12;
            strArr3[i14] = strArr3[i13] + "|" + strArr3[i12];
            StringBuilder sb = new StringBuilder();
            sb.append(strArr3[i13]);
            sb.append("|");
            strArr3[i14 | 8] = d.g(sb, strArr3[i12], "|PADDED");
        }
        int length = f7994c.length;
        for (int i15 = 0; i15 < length; i15++) {
            String[] strArr4 = f7994c;
            if (strArr4[i15] == null) {
                strArr4[i15] = d[i15];
            }
        }
    }

    public static String a(boolean z, int i10, int i11, int i12, int i13) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String[] strArr = f7993b;
        if (i12 < strArr.length) {
            str = strArr[i12];
        } else {
            str = c.h("0x%02x", Integer.valueOf(i12));
        }
        if (i13 == 0) {
            str2 = BuildConfig.FLAVOR;
        } else {
            String[] strArr2 = d;
            if (!(i12 == 2 || i12 == 3)) {
                if (i12 == 4 || i12 == 6) {
                    if (i13 == 1) {
                        str2 = "ACK";
                    } else {
                        str2 = strArr2[i13];
                    }
                } else if (!(i12 == 7 || i12 == 8)) {
                    String[] strArr3 = f7994c;
                    if (i13 < strArr3.length) {
                        str4 = strArr3[i13];
                        g.c(str4);
                    } else {
                        str4 = strArr2[i13];
                    }
                    if (i12 == 5 && (i13 & 4) != 0) {
                        str6 = "HEADERS";
                        str5 = "PUSH_PROMISE";
                    } else if (i12 != 0 || (i13 & 32) == 0) {
                        str2 = str4;
                    } else {
                        str6 = "PRIORITY";
                        str5 = "COMPRESSED";
                    }
                    str2 = h.Y(str4, str6, str5);
                }
            }
            str2 = strArr2[i13];
        }
        if (z) {
            str3 = "<<";
        } else {
            str3 = ">>";
        }
        return c.h("%s 0x%08x %5d %-13s %s", str3, Integer.valueOf(i10), Integer.valueOf(i11), str, str2);
    }
}
