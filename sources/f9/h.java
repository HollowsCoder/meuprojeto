package f9;

import c9.b;
import c9.c;
import java.util.Collection;
import java.util.Iterator;
import o8.n;
import p9.u;
import z8.g;

public class h extends g {
    public static boolean U(String str, String str2) {
        g.f(str, "<this>");
        return str.endsWith(str2);
    }

    public static final boolean V(String str, String str2) {
        return str == null ? str2 == null : str.equalsIgnoreCase(str2);
    }

    public static final boolean W(String str) {
        boolean z;
        g.f(str, "<this>");
        if (str.length() == 0) {
            return true;
        }
        c cVar = new c(0, str.length() - 1);
        if (!(cVar instanceof Collection) || !((Collection) cVar).isEmpty()) {
            Iterator it = cVar.iterator();
            while (true) {
                if (((b) it).f2199q) {
                    if (!u.i(str.charAt(((n) it).nextInt()))) {
                        z = false;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        z = true;
        if (z) {
            return true;
        }
        return false;
    }

    public static final boolean X(int i10, int i11, int i12, String str, String str2, boolean z) {
        g.f(str, "<this>");
        g.f(str2, "other");
        return !z ? str.regionMatches(i10, str2, i11, i12) : str.regionMatches(z, i10, str2, i11, i12);
    }

    public static String Y(String str, String str2, String str3) {
        g.f(str, "<this>");
        g.f(str3, "newValue");
        int e02 = l.e0(0, str, str2, false);
        if (e02 < 0) {
            return str;
        }
        int length = str2.length();
        int i10 = 1;
        if (length >= 1) {
            i10 = length;
        }
        int length2 = str3.length() + (str.length() - length);
        if (length2 >= 0) {
            StringBuilder sb = new StringBuilder(length2);
            int i11 = 0;
            do {
                sb.append(str, i11, e02);
                sb.append(str3);
                i11 = e02 + length;
                if (e02 >= str.length() || (e02 = l.e0(e02 + i10, str, str2, false)) <= 0) {
                    sb.append(str, i11, str.length());
                    String sb2 = sb.toString();
                    g.e(sb2, "stringBuilder.append(this, i, length).toString()");
                }
                sb.append(str, i11, e02);
                sb.append(str3);
                i11 = e02 + length;
                break;
            } while ((e02 = l.e0(e02 + i10, str, str2, false)) <= 0);
            sb.append(str, i11, str.length());
            String sb22 = sb.toString();
            g.e(sb22, "stringBuilder.append(this, i, length).toString()");
            return sb22;
        }
        throw new OutOfMemoryError();
    }

    public static final boolean Z(int i10, String str, String str2, boolean z) {
        g.f(str, "<this>");
        if (!z) {
            return str.startsWith(str2, i10);
        }
        return X(i10, 0, str2.length(), str, str2, z);
    }

    public static final boolean a0(String str, String str2, boolean z) {
        g.f(str, "<this>");
        g.f(str2, "prefix");
        return !z ? str.startsWith(str2) : X(0, 0, str2.length(), str, str2, z);
    }
}
