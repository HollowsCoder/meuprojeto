package h5;

import android.app.Activity;
import android.os.Bundle;
import android.os.SystemClock;
import com.karumi.dexter.BuildConfig;
import java.util.concurrent.ConcurrentHashMap;
import n4.m;

public final class u5 extends s3 {
    public String A;

    /* renamed from: q  reason: collision with root package name */
    public volatile p5 f5767q;

    /* renamed from: r  reason: collision with root package name */
    public p5 f5768r;

    /* renamed from: s  reason: collision with root package name */
    public p5 f5769s;

    /* renamed from: t  reason: collision with root package name */
    public final ConcurrentHashMap f5770t = new ConcurrentHashMap();
    public Activity u;

    /* renamed from: v  reason: collision with root package name */
    public volatile boolean f5771v;
    public volatile p5 w;

    /* renamed from: x  reason: collision with root package name */
    public p5 f5772x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f5773y;
    public final Object z = new Object();

    public u5(i4 i4Var) {
        super(i4Var);
    }

    public static void q(p5 p5Var, Bundle bundle, boolean z10) {
        if (p5Var != null) {
            if (!bundle.containsKey("_sc") || z10) {
                String str = p5Var.f5634a;
                if (str != null) {
                    bundle.putString("_sn", str);
                } else {
                    bundle.remove("_sn");
                }
                String str2 = p5Var.f5635b;
                if (str2 != null) {
                    bundle.putString("_sc", str2);
                } else {
                    bundle.remove("_sc");
                }
                bundle.putLong("_si", p5Var.f5636c);
                return;
            }
            z10 = false;
        }
        if (p5Var == null && z10) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    public final boolean j() {
        return false;
    }

    public final void k(Activity activity, p5 p5Var, boolean z10) {
        p5 p5Var2;
        p5 p5Var3;
        String str;
        p5 p5Var4 = p5Var;
        if (this.f5767q == null) {
            p5Var2 = this.f5768r;
        } else {
            p5Var2 = this.f5767q;
        }
        p5 p5Var5 = p5Var2;
        if (p5Var4.f5635b == null) {
            if (activity != null) {
                str = p(activity.getClass());
            } else {
                str = null;
            }
            p5Var3 = new p5(p5Var4.f5634a, str, p5Var4.f5636c, p5Var4.f5637e, p5Var4.f5638f);
        } else {
            p5Var3 = p5Var4;
        }
        this.f5768r = this.f5767q;
        this.f5767q = p5Var3;
        this.f5649o.B.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        h4 h4Var = this.f5649o.f5459x;
        i4.n(h4Var);
        h4Var.n(new q5(this, p5Var3, p5Var5, elapsedRealtime, z10));
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00dd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void l(h5.p5 r17, h5.p5 r18, long r19, boolean r21, android.os.Bundle r22) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            r5 = r22
            java.lang.String r7 = "_vs"
            r16.g()
            r6 = 1
            if (r21 == 0) goto L_0x0018
            h5.p5 r8 = r0.f5769s
            if (r8 == 0) goto L_0x0018
            r8 = r6
            goto L_0x0019
        L_0x0018:
            r8 = 0
        L_0x0019:
            if (r8 == 0) goto L_0x0020
            h5.p5 r9 = r0.f5769s
            r0.m(r9, r6, r3)
        L_0x0020:
            r9 = 0
            h5.i4 r10 = r0.f5649o
            if (r2 == 0) goto L_0x0045
            long r11 = r1.f5636c
            long r13 = r2.f5636c
            int r11 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r11 != 0) goto L_0x0045
            java.lang.String r11 = r2.f5635b
            java.lang.String r12 = r1.f5635b
            boolean r11 = h5.g7.B(r11, r12)
            if (r11 == 0) goto L_0x0045
            java.lang.String r11 = r2.f5634a
            java.lang.String r12 = r1.f5634a
            boolean r11 = h5.g7.B(r11, r12)
            if (r11 != 0) goto L_0x0042
            goto L_0x0045
        L_0x0042:
            r8 = r10
            goto L_0x00f4
        L_0x0045:
            android.os.Bundle r11 = new android.os.Bundle
            r11.<init>()
            h5.e r12 = r10.u
            h5.s2<java.lang.Boolean> r13 = h5.u2.f5738q0
            boolean r12 = r12.m(r9, r13)
            if (r12 == 0) goto L_0x005f
            android.os.Bundle r11 = new android.os.Bundle
            if (r5 == 0) goto L_0x005c
            r11.<init>(r5)
            goto L_0x005f
        L_0x005c:
            r11.<init>()
        L_0x005f:
            r5 = r11
            q(r1, r5, r6)
            if (r2 == 0) goto L_0x007e
            java.lang.String r11 = r2.f5634a
            if (r11 == 0) goto L_0x006e
            java.lang.String r12 = "_pn"
            r5.putString(r12, r11)
        L_0x006e:
            java.lang.String r11 = r2.f5635b
            if (r11 == 0) goto L_0x0077
            java.lang.String r12 = "_pc"
            r5.putString(r12, r11)
        L_0x0077:
            java.lang.String r11 = "_pi"
            long r14 = r2.f5636c
            r5.putLong(r11, r14)
        L_0x007e:
            r11 = 0
            if (r8 == 0) goto L_0x009b
            h5.q6 r2 = r10.f5460y
            h5.i4.m(r2)
            h5.o6 r2 = r2.f5657s
            long r14 = r2.f5614b
            long r14 = r3 - r14
            r2.f5614b = r3
            int r2 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1))
            if (r2 <= 0) goto L_0x009b
            h5.g7 r2 = r10.z
            h5.i4.l(r2)
            r2.H(r5, r14)
        L_0x009b:
            h5.e r2 = r10.u
            boolean r3 = r2.m(r9, r13)
            if (r3 == 0) goto L_0x00b8
            boolean r3 = r2.q()
            if (r3 != 0) goto L_0x00b0
            java.lang.String r3 = "_mst"
            r14 = 1
            r5.putLong(r3, r14)
        L_0x00b0:
            boolean r3 = r1.f5637e
            if (r6 == r3) goto L_0x00b5
            goto L_0x00b8
        L_0x00b5:
            java.lang.String r3 = "app"
            goto L_0x00ba
        L_0x00b8:
            java.lang.String r3 = "auto"
        L_0x00ba:
            r6 = r3
            boolean r2 = r2.m(r9, r13)
            h5.i5 r3 = r10.D
            if (r2 == 0) goto L_0x00dd
            r4.d r2 = r10.B
            r2.getClass()
            long r13 = java.lang.System.currentTimeMillis()
            boolean r2 = r1.f5637e
            r8 = r10
            if (r2 == 0) goto L_0x00d8
            long r9 = r1.f5638f
            int r2 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r2 == 0) goto L_0x00d8
            r13 = r9
        L_0x00d8:
            h5.i4.m(r3)
            r9 = r13
            goto L_0x00ef
        L_0x00dd:
            r8 = r10
            h5.i4.m(r3)
            r3.g()
            h5.i4 r2 = r3.f5649o
            r4.d r2 = r2.B
            r2.getClass()
            long r9 = java.lang.System.currentTimeMillis()
        L_0x00ef:
            r2 = r3
            r3 = r9
            r2.y(r3, r5, r6, r7)
        L_0x00f4:
            r0.f5769s = r1
            h5.e r2 = r8.u
            h5.s2<java.lang.Boolean> r3 = h5.u2.f5738q0
            r4 = 0
            boolean r2 = r2.m(r4, r3)
            if (r2 == 0) goto L_0x0107
            boolean r2 = r1.f5637e
            if (r2 == 0) goto L_0x0107
            r0.f5772x = r1
        L_0x0107:
            h5.f6 r2 = r8.r()
            r2.g()
            r2.h()
            l4.w r3 = new l4.w
            r4 = 2
            r3.<init>(r4, r2, r1)
            r2.q(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h5.u5.l(h5.p5, h5.p5, long, boolean, android.os.Bundle):void");
    }

    public final void m(p5 p5Var, boolean z10, long j8) {
        boolean z11;
        i4 i4Var = this.f5649o;
        u1 g10 = i4Var.g();
        i4Var.B.getClass();
        g10.j(SystemClock.elapsedRealtime());
        if (p5Var == null || !p5Var.d) {
            z11 = false;
        } else {
            z11 = true;
        }
        q6 q6Var = i4Var.f5460y;
        i4.m(q6Var);
        if (q6Var.f5657s.a(z11, z10, j8) && p5Var != null) {
            p5Var.d = false;
        }
    }

    public final p5 n(Activity activity) {
        m.h(activity);
        p5 p5Var = (p5) this.f5770t.get(activity);
        if (p5Var == null) {
            String p10 = p(activity.getClass());
            g7 g7Var = this.f5649o.z;
            i4.l(g7Var);
            p5 p5Var2 = new p5(g7Var.W(), (String) null, p10);
            this.f5770t.put(activity, p5Var2);
            p5Var = p5Var2;
        }
        if (this.f5649o.u.m((String) null, u2.f5738q0) && this.w != null) {
            return this.w;
        }
        return p5Var;
    }

    public final p5 o(boolean z10) {
        h();
        g();
        if (!this.f5649o.u.m((String) null, u2.f5738q0) || !z10) {
            return this.f5769s;
        }
        p5 p5Var = this.f5769s;
        if (p5Var != null) {
            return p5Var;
        }
        return this.f5772x;
    }

    public final String p(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            return "Activity";
        }
        String[] split = canonicalName.split("\\.");
        int length = split.length;
        String str = length > 0 ? split[length - 1] : BuildConfig.FLAVOR;
        int length2 = str.length();
        this.f5649o.getClass();
        return length2 > 100 ? str.substring(0, 100) : str;
    }

    public final void r(Activity activity, Bundle bundle) {
        Bundle bundle2;
        if (this.f5649o.u.q() && bundle != null && (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) != null) {
            this.f5770t.put(activity, new p5(bundle2.getLong("id"), bundle2.getString("name"), bundle2.getString("referrer_name")));
        }
    }
}
