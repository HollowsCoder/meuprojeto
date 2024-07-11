package h5;

import android.os.Bundle;

public final class f {

    /* renamed from: c  reason: collision with root package name */
    public static final f f5366c = new f((Boolean) null, (Boolean) null);

    /* renamed from: a  reason: collision with root package name */
    public final Boolean f5367a;

    /* renamed from: b  reason: collision with root package name */
    public final Boolean f5368b;

    public f(Boolean bool, Boolean bool2) {
        this.f5367a = bool;
        this.f5368b = bool2;
    }

    public static f a(Bundle bundle) {
        return bundle == null ? f5366c : new f(h(bundle.getString("ad_storage")), h(bundle.getString("analytics_storage")));
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static h5.f b(java.lang.String r7) {
        /*
            r0 = 0
            if (r7 == 0) goto L_0x0037
            int r1 = r7.length()
            r2 = 49
            r3 = 48
            r4 = 3
            if (r1 < r4) goto L_0x001e
            r1 = 2
            char r1 = r7.charAt(r1)
            if (r1 == r3) goto L_0x001b
            if (r1 == r2) goto L_0x0018
            goto L_0x001e
        L_0x0018:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            goto L_0x001f
        L_0x001b:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            goto L_0x001f
        L_0x001e:
            r1 = r0
        L_0x001f:
            int r5 = r7.length()
            r6 = 4
            if (r5 < r6) goto L_0x0034
            char r7 = r7.charAt(r4)
            if (r7 == r3) goto L_0x0032
            if (r7 == r2) goto L_0x002f
            goto L_0x0034
        L_0x002f:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            goto L_0x0034
        L_0x0032:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
        L_0x0034:
            r7 = r0
            r0 = r1
            goto L_0x0038
        L_0x0037:
            r7 = r0
        L_0x0038:
            h5.f r1 = new h5.f
            r1.<init>(r0, r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: h5.f.b(java.lang.String):h5.f");
    }

    public static final int g(Boolean bool) {
        if (bool == null) {
            return 0;
        }
        return bool.booleanValue() ? 1 : 2;
    }

    public static Boolean h(String str) {
        if (str == null) {
            return null;
        }
        if (str.equals("granted")) {
            return Boolean.TRUE;
        }
        if (str.equals("denied")) {
            return Boolean.FALSE;
        }
        return null;
    }

    public final String c() {
        char c10;
        StringBuilder sb = new StringBuilder("G1");
        char c11 = '1';
        Boolean bool = this.f5367a;
        if (bool == null) {
            c10 = '-';
        } else if (bool.booleanValue()) {
            c10 = '1';
        } else {
            c10 = '0';
        }
        sb.append(c10);
        Boolean bool2 = this.f5368b;
        if (bool2 == null) {
            c11 = '-';
        } else if (!bool2.booleanValue()) {
            c11 = '0';
        }
        sb.append(c11);
        return sb.toString();
    }

    public final boolean d() {
        Boolean bool = this.f5367a;
        return bool == null || bool.booleanValue();
    }

    public final boolean e() {
        Boolean bool = this.f5368b;
        return bool == null || bool.booleanValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return g(this.f5367a) == g(fVar.f5367a) && g(this.f5368b) == g(fVar.f5368b);
    }

    public final f f(f fVar) {
        boolean z;
        boolean z10 = true;
        Boolean bool = fVar.f5367a;
        Boolean bool2 = this.f5367a;
        if (bool2 != null) {
            if (bool == null) {
                bool = bool2;
            } else {
                if (!bool2.booleanValue() || !bool.booleanValue()) {
                    z = false;
                } else {
                    z = true;
                }
                bool = Boolean.valueOf(z);
            }
        }
        Boolean bool3 = this.f5368b;
        Boolean bool4 = fVar.f5368b;
        if (bool3 == null) {
            bool3 = bool4;
        } else if (bool4 != null) {
            if (!bool3.booleanValue() || !bool4.booleanValue()) {
                z10 = false;
            }
            bool3 = Boolean.valueOf(z10);
        }
        return new f(bool, bool3);
    }

    public final int hashCode() {
        return g(this.f5368b) + ((g(this.f5367a) + 527) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ConsentSettings: adStorage=");
        String str = "denied";
        Boolean bool = this.f5367a;
        if (bool == null) {
            sb.append("uninitialized");
        } else {
            sb.append(true != bool.booleanValue() ? str : "granted");
        }
        sb.append(", analyticsStorage=");
        Boolean bool2 = this.f5368b;
        if (bool2 == null) {
            sb.append("uninitialized");
        } else {
            if (true == bool2.booleanValue()) {
                str = "granted";
            }
            sb.append(str);
        }
        return sb.toString();
    }
}
