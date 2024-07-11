package h5;

import com.google.android.gms.internal.measurement.d2;
import com.google.android.gms.internal.measurement.j2;
import com.google.android.gms.internal.measurement.k2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import n4.m;

public abstract class o7 {

    /* renamed from: a  reason: collision with root package name */
    public final String f5616a;

    /* renamed from: b  reason: collision with root package name */
    public final int f5617b;

    /* renamed from: c  reason: collision with root package name */
    public Boolean f5618c;
    public Boolean d;

    /* renamed from: e  reason: collision with root package name */
    public Long f5619e;

    /* renamed from: f  reason: collision with root package name */
    public Long f5620f;

    public o7(String str, int i10) {
        this.f5616a = str;
        this.f5617b = i10;
    }

    public static Boolean d(Boolean bool, boolean z) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z);
    }

    public static Boolean e(String str, k2 k2Var, g3 g3Var) {
        String str2;
        List<String> list;
        String str3;
        int i10;
        boolean z;
        m.h(k2Var);
        if (str == null || !k2Var.r() || k2Var.s() == j2.UNKNOWN_MATCH_TYPE) {
            return null;
        }
        j2 s10 = k2Var.s();
        j2 j2Var = j2.IN_LIST;
        if (s10 == j2Var) {
            if (k2Var.y() == 0) {
                return null;
            }
        } else if (!k2Var.t()) {
            return null;
        }
        j2 s11 = k2Var.s();
        boolean w = k2Var.w();
        if (w || s11 == j2.REGEXP || s11 == j2Var) {
            str2 = k2Var.u();
        } else {
            str2 = k2Var.u().toUpperCase(Locale.ENGLISH);
        }
        if (k2Var.y() == 0) {
            list = null;
        } else {
            list = k2Var.x();
            if (!w) {
                ArrayList arrayList = new ArrayList(list.size());
                for (String upperCase : list) {
                    arrayList.add(upperCase.toUpperCase(Locale.ENGLISH));
                }
                list = Collections.unmodifiableList(arrayList);
            }
        }
        j2 j2Var2 = j2.REGEXP;
        if (s11 == j2Var2) {
            str3 = str2;
        } else {
            str3 = null;
        }
        if (s11 == j2.IN_LIST) {
            if (list == null || list.size() == 0) {
                return null;
            }
        } else if (str2 == null) {
            return null;
        }
        if (!w && s11 != j2Var2) {
            str = str.toUpperCase(Locale.ENGLISH);
        }
        d2 d2Var = d2.UNKNOWN_COMPARISON_TYPE;
        switch (s11.ordinal()) {
            case 1:
                if (str3 == null) {
                    return null;
                }
                if (true != w) {
                    i10 = 66;
                } else {
                    i10 = 0;
                }
                try {
                    return Boolean.valueOf(Pattern.compile(str3, i10).matcher(str).matches());
                } catch (PatternSyntaxException unused) {
                    g3Var.w.b(str3, "Invalid regular expression in REGEXP audience filter. expression");
                    return null;
                }
            case 2:
                z = str.startsWith(str2);
                break;
            case 3:
                z = str.endsWith(str2);
                break;
            case 4:
                z = str.contains(str2);
                break;
            case 5:
                z = str.equals(str2);
                break;
            case 6:
                if (list != null) {
                    z = list.contains(str);
                    break;
                } else {
                    return null;
                }
            default:
                return null;
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00a6, code lost:
        if (r8.compareTo(r4) <= 0) goto L_0x00eb;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Boolean f(java.math.BigDecimal r8, com.google.android.gms.internal.measurement.e2 r9, double r10) {
        /*
            n4.m.h(r9)
            boolean r0 = r9.r()
            r1 = 0
            if (r0 == 0) goto L_0x0110
            com.google.android.gms.internal.measurement.d2 r0 = r9.s()
            com.google.android.gms.internal.measurement.d2 r2 = com.google.android.gms.internal.measurement.d2.UNKNOWN_COMPARISON_TYPE
            if (r0 != r2) goto L_0x0014
            goto L_0x0110
        L_0x0014:
            com.google.android.gms.internal.measurement.d2 r0 = r9.s()
            com.google.android.gms.internal.measurement.d2 r2 = com.google.android.gms.internal.measurement.d2.BETWEEN
            if (r0 != r2) goto L_0x002a
            boolean r0 = r9.x()
            if (r0 == 0) goto L_0x0029
            boolean r0 = r9.z()
            if (r0 == 0) goto L_0x0029
            goto L_0x0031
        L_0x0029:
            return r1
        L_0x002a:
            boolean r0 = r9.v()
            if (r0 != 0) goto L_0x0031
            return r1
        L_0x0031:
            com.google.android.gms.internal.measurement.d2 r0 = r9.s()
            com.google.android.gms.internal.measurement.d2 r3 = r9.s()
            if (r3 != r2) goto L_0x0066
            java.lang.String r3 = r9.y()
            boolean r3 = h5.b7.x(r3)
            if (r3 == 0) goto L_0x0065
            java.lang.String r3 = r9.A()
            boolean r3 = h5.b7.x(r3)
            if (r3 != 0) goto L_0x0050
            goto L_0x0065
        L_0x0050:
            java.math.BigDecimal r3 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x0065 }
            java.lang.String r4 = r9.y()     // Catch:{ NumberFormatException -> 0x0065 }
            r3.<init>(r4)     // Catch:{ NumberFormatException -> 0x0065 }
            java.math.BigDecimal r4 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x0065 }
            java.lang.String r9 = r9.A()     // Catch:{ NumberFormatException -> 0x0065 }
            r4.<init>(r9)     // Catch:{ NumberFormatException -> 0x0065 }
            r9 = r3
            r3 = r1
            goto L_0x007c
        L_0x0065:
            return r1
        L_0x0066:
            java.lang.String r3 = r9.w()
            boolean r3 = h5.b7.x(r3)
            if (r3 != 0) goto L_0x0071
            return r1
        L_0x0071:
            java.math.BigDecimal r3 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x0110 }
            java.lang.String r9 = r9.w()     // Catch:{ NumberFormatException -> 0x0110 }
            r3.<init>(r9)     // Catch:{ NumberFormatException -> 0x0110 }
            r9 = r1
            r4 = r9
        L_0x007c:
            if (r0 != r2) goto L_0x0081
            if (r9 == 0) goto L_0x0102
            goto L_0x0085
        L_0x0081:
            if (r3 != 0) goto L_0x0085
            goto L_0x0102
        L_0x0085:
            com.google.android.gms.internal.measurement.j2 r2 = com.google.android.gms.internal.measurement.j2.UNKNOWN_MATCH_TYPE
            int r0 = r0.ordinal()
            r2 = 1
            r5 = 0
            if (r0 == r2) goto L_0x0100
            r6 = 2
            if (r0 == r6) goto L_0x00f0
            r7 = 3
            if (r0 == r7) goto L_0x00a9
            r10 = 4
            if (r0 == r10) goto L_0x009a
            goto L_0x0102
        L_0x009a:
            if (r9 == 0) goto L_0x0102
            int r9 = r8.compareTo(r9)
            if (r9 < 0) goto L_0x00ea
            int r8 = r8.compareTo(r4)
            if (r8 > 0) goto L_0x00ea
            goto L_0x00eb
        L_0x00a9:
            if (r3 != 0) goto L_0x00ac
            goto L_0x0102
        L_0x00ac:
            r0 = 0
            int r9 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r9 == 0) goto L_0x00e3
            java.math.BigDecimal r9 = new java.math.BigDecimal
            r9.<init>(r10)
            java.math.BigDecimal r0 = new java.math.BigDecimal
            r0.<init>(r6)
            java.math.BigDecimal r9 = r9.multiply(r0)
            java.math.BigDecimal r9 = r3.subtract(r9)
            int r9 = r8.compareTo(r9)
            if (r9 <= 0) goto L_0x00ea
            java.math.BigDecimal r9 = new java.math.BigDecimal
            r9.<init>(r10)
            java.math.BigDecimal r10 = new java.math.BigDecimal
            r10.<init>(r6)
            java.math.BigDecimal r9 = r9.multiply(r10)
            java.math.BigDecimal r9 = r3.add(r9)
            int r8 = r8.compareTo(r9)
            if (r8 >= 0) goto L_0x00ea
            goto L_0x00eb
        L_0x00e3:
            int r8 = r8.compareTo(r3)
            if (r8 != 0) goto L_0x00ea
            goto L_0x00eb
        L_0x00ea:
            r2 = r5
        L_0x00eb:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            goto L_0x0102
        L_0x00f0:
            if (r3 != 0) goto L_0x00f3
            goto L_0x0102
        L_0x00f3:
            int r8 = r8.compareTo(r3)
            if (r8 <= 0) goto L_0x00fa
            goto L_0x00fb
        L_0x00fa:
            r2 = r5
        L_0x00fb:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r2)
            return r8
        L_0x0100:
            if (r3 != 0) goto L_0x0103
        L_0x0102:
            return r1
        L_0x0103:
            int r8 = r8.compareTo(r3)
            if (r8 >= 0) goto L_0x010a
            goto L_0x010b
        L_0x010a:
            r2 = r5
        L_0x010b:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r2)
            return r8
        L_0x0110:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: h5.o7.f(java.math.BigDecimal, com.google.android.gms.internal.measurement.e2, double):java.lang.Boolean");
    }

    public abstract int a();

    public abstract boolean b();

    public abstract boolean c();
}
