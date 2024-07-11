package x6;

import android.os.Bundle;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final HashSet f9512a = new HashSet(Arrays.asList(new String[]{"_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire"}));

    /* renamed from: b  reason: collision with root package name */
    public static final List<String> f9513b = Arrays.asList(new String[]{"_e", "_f", "_iap", "_s", "_au", "_ui", "_cd"});

    /* renamed from: c  reason: collision with root package name */
    public static final List<String> f9514c = Arrays.asList(new String[]{"auto", "app", "am"});
    public static final List<String> d = Arrays.asList(new String[]{"_r", "_dbg"});

    /* renamed from: e  reason: collision with root package name */
    public static final List<String> f9515e;

    /* renamed from: f  reason: collision with root package name */
    public static final List<String> f9516f = Arrays.asList(new String[]{"^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$"});

    static {
        String[][] strArr = {s6.a.N, s6.a.O};
        int i10 = 0;
        for (int i11 = 0; i11 < 2; i11++) {
            i10 += strArr[i11].length;
        }
        Object[] copyOf = Arrays.copyOf(strArr[0], i10);
        int length = strArr[0].length;
        String[] strArr2 = strArr[1];
        System.arraycopy(strArr2, 0, copyOf, length, strArr2.length);
        f9515e = Arrays.asList((String[]) copyOf);
    }

    public static boolean a(String str) {
        return !f9514c.contains(str);
    }

    public static boolean b(String str, Bundle bundle) {
        if (f9513b.contains(str)) {
            return false;
        }
        if (bundle == null) {
            return true;
        }
        for (String containsKey : d) {
            if (bundle.containsKey(containsKey)) {
                return false;
            }
        }
        return true;
    }

    public static boolean c(String str, String str2) {
        if ("_ce1".equals(str2) || "_ce2".equals(str2)) {
            return str.equals("fcm") || str.equals("frc");
        }
        if ("_ln".equals(str2)) {
            return str.equals("fcm") || str.equals("fiam");
        }
        if (f9515e.contains(str2)) {
            return false;
        }
        for (String matches : f9516f) {
            if (str2.matches(matches)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean d(java.lang.String r4, java.lang.String r5, android.os.Bundle r6) {
        /*
            java.lang.String r0 = "_cmp"
            boolean r5 = r0.equals(r5)
            r0 = 1
            if (r5 != 0) goto L_0x000a
            return r0
        L_0x000a:
            boolean r5 = a(r4)
            r1 = 0
            if (r5 != 0) goto L_0x0012
            return r1
        L_0x0012:
            if (r6 != 0) goto L_0x0015
            return r1
        L_0x0015:
            java.util.List<java.lang.String> r5 = d
            java.util.Iterator r5 = r5.iterator()
        L_0x001b:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L_0x002e
            java.lang.Object r2 = r5.next()
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = r6.containsKey(r2)
            if (r2 == 0) goto L_0x001b
            return r1
        L_0x002e:
            int r5 = r4.hashCode()
            r2 = 101200(0x18b50, float:1.41811E-40)
            r3 = 2
            if (r5 == r2) goto L_0x0057
            r2 = 101230(0x18b6e, float:1.41853E-40)
            if (r5 == r2) goto L_0x004d
            r2 = 3142703(0x2ff42f, float:4.403865E-39)
            if (r5 == r2) goto L_0x0043
            goto L_0x0061
        L_0x0043:
            java.lang.String r5 = "fiam"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0061
            r4 = r3
            goto L_0x0062
        L_0x004d:
            java.lang.String r5 = "fdl"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0061
            r4 = r0
            goto L_0x0062
        L_0x0057:
            java.lang.String r5 = "fcm"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0061
            r4 = r1
            goto L_0x0062
        L_0x0061:
            r4 = -1
        L_0x0062:
            if (r4 == 0) goto L_0x006f
            if (r4 == r0) goto L_0x006c
            if (r4 == r3) goto L_0x0069
            return r1
        L_0x0069:
            java.lang.String r4 = "fiam_integration"
            goto L_0x0071
        L_0x006c:
            java.lang.String r4 = "fdl_integration"
            goto L_0x0071
        L_0x006f:
            java.lang.String r4 = "fcm_integration"
        L_0x0071:
            java.lang.String r5 = "_cis"
            r6.putString(r5, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: x6.a.d(java.lang.String, java.lang.String, android.os.Bundle):boolean");
    }
}
