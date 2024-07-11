package h5;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Looper;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import n4.m;
import q4.a;
import r4.d;

public final class f6 extends s3 {

    /* renamed from: q  reason: collision with root package name */
    public final e6 f5382q;

    /* renamed from: r  reason: collision with root package name */
    public x2 f5383r;

    /* renamed from: s  reason: collision with root package name */
    public volatile Boolean f5384s;

    /* renamed from: t  reason: collision with root package name */
    public final y5 f5385t;
    public final r6 u;

    /* renamed from: v  reason: collision with root package name */
    public final ArrayList f5386v = new ArrayList();
    public final a6 w;

    public f6(i4 i4Var) {
        super(i4Var);
        this.u = new r6(i4Var.B);
        this.f5382q = new e6(this);
        this.f5385t = new y5(this, i4Var, 0);
        this.w = new a6(this, i4Var);
    }

    public static void o(f6 f6Var, ComponentName componentName) {
        f6Var.g();
        if (f6Var.f5383r != null) {
            f6Var.f5383r = null;
            g3 g3Var = f6Var.f5649o.w;
            i4.n(g3Var);
            g3Var.B.b(componentName, "Disconnected from device MeasurementService");
            f6Var.g();
            f6Var.k();
        }
    }

    public final boolean j() {
        return false;
    }

    public final void k() {
        e3 e3Var;
        String str;
        g();
        h();
        if (!t()) {
            if (l()) {
                e6 e6Var = this.f5382q;
                e6Var.f5361c.g();
                Context context = e6Var.f5361c.f5649o.f5452o;
                synchronized (e6Var) {
                    if (e6Var.f5359a) {
                        g3 g3Var = e6Var.f5361c.f5649o.w;
                        i4.n(g3Var);
                        e3Var = g3Var.B;
                        str = "Connection attempt already in progress";
                    } else if (e6Var.f5360b == null || (!e6Var.f5360b.g() && !e6Var.f5360b.a())) {
                        e6Var.f5360b = new c3(context, Looper.getMainLooper(), e6Var, e6Var);
                        g3 g3Var2 = e6Var.f5361c.f5649o.w;
                        i4.n(g3Var2);
                        g3Var2.B.a("Connecting to remote service");
                        e6Var.f5359a = true;
                        m.h(e6Var.f5360b);
                        e6Var.f5360b.p();
                    } else {
                        g3 g3Var3 = e6Var.f5361c.f5649o.w;
                        i4.n(g3Var3);
                        e3Var = g3Var3.B;
                        str = "Already awaiting connection attempt";
                    }
                    e3Var.a(str);
                }
            } else if (!this.f5649o.u.s()) {
                this.f5649o.getClass();
                List<ResolveInfo> queryIntentServices = this.f5649o.f5452o.getPackageManager().queryIntentServices(new Intent().setClassName(this.f5649o.f5452o, "com.google.android.gms.measurement.AppMeasurementService"), 65536);
                if (queryIntentServices == null || queryIntentServices.size() <= 0) {
                    g3 g3Var4 = this.f5649o.w;
                    i4.n(g3Var4);
                    g3Var4.f5397t.a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
                    return;
                }
                Intent intent = new Intent("com.google.android.gms.measurement.START");
                intent.setComponent(new ComponentName(this.f5649o.f5452o, "com.google.android.gms.measurement.AppMeasurementService"));
                e6 e6Var2 = this.f5382q;
                e6Var2.f5361c.g();
                Context context2 = e6Var2.f5361c.f5649o.f5452o;
                a b10 = a.b();
                synchronized (e6Var2) {
                    if (e6Var2.f5359a) {
                        g3 g3Var5 = e6Var2.f5361c.f5649o.w;
                        i4.n(g3Var5);
                        g3Var5.B.a("Connection attempt already in progress");
                    } else {
                        g3 g3Var6 = e6Var2.f5361c.f5649o.w;
                        i4.n(g3Var6);
                        g3Var6.B.a("Using local app measurement service");
                        e6Var2.f5359a = true;
                        b10.a(context2, intent, e6Var2.f5361c.f5382q, 129);
                    }
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0125  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean l() {
        /*
            r8 = this;
            r8.g()
            r8.h()
            java.lang.Boolean r0 = r8.f5384s
            if (r0 != 0) goto L_0x0146
            r8.g()
            r8.h()
            h5.i4 r0 = r8.f5649o
            h5.u3 r0 = r0.f5458v
            h5.i4.l(r0)
            r0.g()
            android.content.SharedPreferences r1 = r0.l()
            java.lang.String r2 = "use_service"
            boolean r1 = r1.contains(r2)
            r3 = 0
            if (r1 != 0) goto L_0x0029
            r0 = 0
            goto L_0x0035
        L_0x0029:
            android.content.SharedPreferences r0 = r0.l()
            boolean r0 = r0.getBoolean(r2, r3)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L_0x0035:
            r1 = 1
            if (r0 == 0) goto L_0x0040
            boolean r4 = r0.booleanValue()
            if (r4 == 0) goto L_0x0040
            goto L_0x0140
        L_0x0040:
            h5.i4 r4 = r8.f5649o
            r4.getClass()
            h5.i4 r4 = r8.f5649o
            h5.y2 r4 = r4.b()
            r4.h()
            int r4 = r4.f5818x
            if (r4 != r1) goto L_0x0054
            goto L_0x0109
        L_0x0054:
            h5.i4 r4 = r8.f5649o
            h5.g3 r4 = r4.w
            h5.i4.n(r4)
            h5.e3 r4 = r4.B
            java.lang.String r5 = "Checking service availability"
            r4.a(r5)
            h5.i4 r4 = r8.f5649o
            h5.g7 r4 = r4.z
            h5.i4.l(r4)
            r4.getClass()
            j4.f r5 = j4.f.f6547b
            h5.i4 r4 = r4.f5649o
            android.content.Context r4 = r4.f5452o
            r6 = 12451000(0xbdfcb8, float:1.7447567E-38)
            int r4 = r5.b(r4, r6)
            if (r4 == 0) goto L_0x00fb
            if (r4 == r1) goto L_0x00ec
            r5 = 2
            if (r4 == r5) goto L_0x00c6
            r0 = 3
            if (r4 == r0) goto L_0x00b6
            r0 = 9
            if (r4 == r0) goto L_0x00aa
            r0 = 18
            if (r4 == r0) goto L_0x009e
            h5.i4 r0 = r8.f5649o
            h5.g3 r0 = r0.w
            h5.i4.n(r0)
            h5.e3 r0 = r0.w
            java.lang.String r1 = "Unexpected service status"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0.b(r4, r1)
            goto L_0x00c4
        L_0x009e:
            h5.i4 r0 = r8.f5649o
            h5.g3 r0 = r0.w
            h5.i4.n(r0)
            h5.e3 r0 = r0.w
            java.lang.String r3 = "Service updating"
            goto L_0x0106
        L_0x00aa:
            h5.i4 r0 = r8.f5649o
            h5.g3 r0 = r0.w
            h5.i4.n(r0)
            h5.e3 r0 = r0.w
            java.lang.String r1 = "Service invalid"
            goto L_0x00c1
        L_0x00b6:
            h5.i4 r0 = r8.f5649o
            h5.g3 r0 = r0.w
            h5.i4.n(r0)
            h5.e3 r0 = r0.w
            java.lang.String r1 = "Service disabled"
        L_0x00c1:
            r0.a(r1)
        L_0x00c4:
            r1 = r3
            goto L_0x010a
        L_0x00c6:
            h5.i4 r4 = r8.f5649o
            h5.g3 r4 = r4.w
            h5.i4.n(r4)
            h5.e3 r4 = r4.A
            java.lang.String r5 = "Service container out of date"
            r4.a(r5)
            h5.i4 r4 = r8.f5649o
            h5.g7 r4 = r4.z
            h5.i4.l(r4)
            int r4 = r4.G()
            r5 = 17443(0x4423, float:2.4443E-41)
            if (r4 >= r5) goto L_0x00e4
            goto L_0x010a
        L_0x00e4:
            if (r0 != 0) goto L_0x00e7
            goto L_0x00e8
        L_0x00e7:
            r1 = r3
        L_0x00e8:
            r7 = r3
            r3 = r1
            r1 = r7
            goto L_0x010a
        L_0x00ec:
            h5.i4 r0 = r8.f5649o
            h5.g3 r0 = r0.w
            h5.i4.n(r0)
            h5.e3 r0 = r0.B
            java.lang.String r4 = "Service missing"
            r0.a(r4)
            goto L_0x010a
        L_0x00fb:
            h5.i4 r0 = r8.f5649o
            h5.g3 r0 = r0.w
            h5.i4.n(r0)
            h5.e3 r0 = r0.B
            java.lang.String r3 = "Service available"
        L_0x0106:
            r0.a(r3)
        L_0x0109:
            r3 = r1
        L_0x010a:
            if (r3 != 0) goto L_0x0125
            h5.i4 r0 = r8.f5649o
            h5.e r0 = r0.u
            boolean r0 = r0.s()
            if (r0 == 0) goto L_0x0125
            h5.i4 r0 = r8.f5649o
            h5.g3 r0 = r0.w
            h5.i4.n(r0)
            h5.e3 r0 = r0.f5397t
            java.lang.String r1 = "No way to upload. Consider using the full version of Analytics"
            r0.a(r1)
            goto L_0x013f
        L_0x0125:
            if (r1 == 0) goto L_0x013f
            h5.i4 r0 = r8.f5649o
            h5.u3 r0 = r0.f5458v
            h5.i4.l(r0)
            r0.g()
            android.content.SharedPreferences r0 = r0.l()
            android.content.SharedPreferences$Editor r0 = r0.edit()
            r0.putBoolean(r2, r3)
            r0.apply()
        L_0x013f:
            r1 = r3
        L_0x0140:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r8.f5384s = r0
        L_0x0146:
            java.lang.Boolean r0 = r8.f5384s
            boolean r0 = r0.booleanValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h5.f6.l():boolean");
    }

    public final void m() {
        g();
        h();
        e6 e6Var = this.f5382q;
        if (e6Var.f5360b != null && (e6Var.f5360b.a() || e6Var.f5360b.g())) {
            e6Var.f5360b.k();
        }
        e6Var.f5360b = null;
        try {
            a.b().c(this.f5649o.f5452o, this.f5382q);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.f5383r = null;
    }

    public final boolean n() {
        g();
        h();
        if (!l()) {
            return true;
        }
        g7 g7Var = this.f5649o.z;
        i4.l(g7Var);
        if (g7Var.G() >= u2.f5742s0.a(null).intValue()) {
            return true;
        }
        return false;
    }

    public final void p() {
        g();
        r6 r6Var = this.u;
        ((d) r6Var.f5674a).getClass();
        r6Var.f5675b = SystemClock.elapsedRealtime();
        this.f5649o.getClass();
        this.f5385t.b(u2.I.a(null).longValue());
    }

    public final void q(Runnable runnable) {
        g();
        if (t()) {
            runnable.run();
            return;
        }
        ArrayList arrayList = this.f5386v;
        int size = arrayList.size();
        i4 i4Var = this.f5649o;
        i4Var.getClass();
        if (((long) size) >= 1000) {
            g3 g3Var = i4Var.w;
            i4.n(g3Var);
            g3Var.f5397t.a("Discarding data. Max runnable queue size reached");
            return;
        }
        arrayList.add(runnable);
        this.w.b(60000);
        k();
    }

    public final void r() {
        g();
        i4 i4Var = this.f5649o;
        g3 g3Var = i4Var.w;
        i4.n(g3Var);
        ArrayList arrayList = this.f5386v;
        g3Var.B.b(Integer.valueOf(arrayList.size()), "Processing queued up service tasks");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                ((Runnable) it.next()).run();
            } catch (RuntimeException e10) {
                g3 g3Var2 = i4Var.w;
                i4.n(g3Var2);
                g3Var2.f5397t.b(e10, "Task exception while flushing queue");
            }
        }
        arrayList.clear();
        this.w.c();
    }

    /* JADX WARNING: Removed duplicated region for block: B:79:0x0215  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0217  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x022f  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0231  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x024f  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0251  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0271  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x027e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final h5.i7 s(boolean r36) {
        /*
            r35 = this;
            r1 = r35
            h5.i4 r0 = r1.f5649o
            r0.getClass()
            h5.y2 r2 = r0.b()
            r3 = 0
            r5 = 0
            if (r36 == 0) goto L_0x00bc
            h5.g3 r0 = r0.w
            h5.i4.n(r0)
            h5.i4 r0 = r0.f5649o
            h5.u3 r6 = r0.f5458v
            h5.i4.l(r6)
            h5.r3 r6 = r6.f5752r
            if (r6 != 0) goto L_0x0022
            goto L_0x00bc
        L_0x0022:
            h5.u3 r0 = r0.f5458v
            h5.i4.l(r0)
            h5.r3 r0 = r0.f5752r
            h5.u3 r6 = r0.f5670e
            r6.g()
            r6.g()
            h5.u3 r7 = r0.f5670e
            android.content.SharedPreferences r7 = r7.l()
            java.lang.String r8 = r0.f5667a
            long r7 = r7.getLong(r8, r3)
            int r9 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r9 != 0) goto L_0x0046
            r0.a()
            r7 = r3
            goto L_0x0056
        L_0x0046:
            h5.i4 r9 = r6.f5649o
            r4.d r9 = r9.B
            r9.getClass()
            long r9 = java.lang.System.currentTimeMillis()
            long r7 = r7 - r9
            long r7 = java.lang.Math.abs(r7)
        L_0x0056:
            long r9 = r0.d
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 >= 0) goto L_0x005d
            goto L_0x0065
        L_0x005d:
            long r9 = r9 + r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 <= 0) goto L_0x0067
            r0.a()
        L_0x0065:
            r0 = r5
            goto L_0x0091
        L_0x0067:
            android.content.SharedPreferences r7 = r6.l()
            java.lang.String r8 = r0.f5669c
            java.lang.String r7 = r7.getString(r8, r5)
            android.content.SharedPreferences r6 = r6.l()
            java.lang.String r8 = r0.f5668b
            long r8 = r6.getLong(r8, r3)
            r0.a()
            if (r7 == 0) goto L_0x008f
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x0085
            goto L_0x008f
        L_0x0085:
            android.util.Pair r0 = new android.util.Pair
            java.lang.Long r6 = java.lang.Long.valueOf(r8)
            r0.<init>(r7, r6)
            goto L_0x0091
        L_0x008f:
            android.util.Pair<java.lang.String, java.lang.Long> r0 = h5.u3.L
        L_0x0091:
            if (r0 == 0) goto L_0x00bc
            android.util.Pair<java.lang.String, java.lang.Long> r6 = h5.u3.L
            if (r0 != r6) goto L_0x0098
            goto L_0x00bc
        L_0x0098:
            java.lang.Object r5 = r0.second
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.Object r0 = r0.first
            java.lang.String r0 = (java.lang.String) r0
            int r6 = r5.length()
            java.lang.String r7 = java.lang.String.valueOf(r0)
            int r7 = r7.length()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            int r6 = r6 + 1
            int r6 = r6 + r7
            r8.<init>(r6)
            java.lang.String r6 = ":"
            java.lang.String r5 = androidx.appcompat.widget.x0.f(r8, r5, r6, r0)
        L_0x00bc:
            r17 = r5
            r2.g()
            h5.i7 r5 = new h5.i7
            java.lang.String r7 = r2.l()
            java.lang.String r8 = r2.m()
            r2.h()
            java.lang.String r9 = r2.f5814r
            r2.h()
            int r0 = r2.f5815s
            long r10 = (long) r0
            r2.h()
            java.lang.String r0 = r2.f5816t
            n4.m.h(r0)
            java.lang.String r12 = r2.f5816t
            h5.i4 r6 = r2.f5649o
            h5.e r0 = r6.u
            r0.j()
            r2.h()
            r2.g()
            long r13 = r2.u
            int r0 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            android.content.Context r4 = r6.f5452o
            if (r0 != 0) goto L_0x016c
            h5.g7 r0 = r6.z
            h5.i4.l(r0)
            java.lang.String r13 = r4.getPackageName()
            r0.g()
            n4.m.e(r13)
            android.content.pm.PackageManager r14 = r4.getPackageManager()
            java.security.MessageDigest r15 = h5.g7.x()
            h5.i4 r3 = r0.f5649o
            if (r15 != 0) goto L_0x011d
            h5.g3 r0 = r3.w
            h5.i4.n(r0)
            java.lang.String r3 = "Could not get MD5 instance"
            h5.e3 r0 = r0.f5397t
            r0.a(r3)
            goto L_0x0158
        L_0x011d:
            if (r14 == 0) goto L_0x0168
            boolean r0 = r0.E(r4, r13)     // Catch:{ NameNotFoundException -> 0x015b }
            if (r0 != 0) goto L_0x0168
            t4.b r0 = t4.c.a(r4)     // Catch:{ NameNotFoundException -> 0x015b }
            android.content.Context r13 = r3.f5452o     // Catch:{ NameNotFoundException -> 0x015b }
            java.lang.String r13 = r13.getPackageName()     // Catch:{ NameNotFoundException -> 0x015b }
            r14 = 64
            android.content.pm.PackageInfo r0 = r0.b(r13, r14)     // Catch:{ NameNotFoundException -> 0x015b }
            android.content.pm.Signature[] r0 = r0.signatures     // Catch:{ NameNotFoundException -> 0x015b }
            if (r0 == 0) goto L_0x014c
            int r13 = r0.length     // Catch:{ NameNotFoundException -> 0x015b }
            if (r13 <= 0) goto L_0x014c
            r13 = 0
            r0 = r0[r13]     // Catch:{ NameNotFoundException -> 0x015b }
            byte[] r0 = r0.toByteArray()     // Catch:{ NameNotFoundException -> 0x015b }
            byte[] r0 = r15.digest(r0)     // Catch:{ NameNotFoundException -> 0x015b }
            long r13 = h5.g7.y(r0)     // Catch:{ NameNotFoundException -> 0x015b }
            goto L_0x016a
        L_0x014c:
            h5.g3 r0 = r3.w     // Catch:{ NameNotFoundException -> 0x015b }
            h5.i4.n(r0)     // Catch:{ NameNotFoundException -> 0x015b }
            h5.e3 r0 = r0.w     // Catch:{ NameNotFoundException -> 0x015b }
            java.lang.String r13 = "Could not get signatures"
            r0.a(r13)     // Catch:{ NameNotFoundException -> 0x015b }
        L_0x0158:
            r13 = -1
            goto L_0x016a
        L_0x015b:
            r0 = move-exception
            h5.g3 r3 = r3.w
            h5.i4.n(r3)
            java.lang.String r13 = "Package name not found"
            h5.e3 r3 = r3.f5397t
            r3.b(r0, r13)
        L_0x0168:
            r13 = 0
        L_0x016a:
            r2.u = r13
        L_0x016c:
            r15 = r13
            boolean r18 = r6.i()
            h5.u3 r0 = r6.f5458v
            h5.i4.l(r0)
            boolean r3 = r0.D
            r19 = r3 ^ 1
            r2.g()
            boolean r3 = r6.i()
            h5.e r13 = r6.u
            if (r3 != 0) goto L_0x018b
        L_0x0185:
            r23 = r15
            r16 = r12
            goto L_0x0204
        L_0x018b:
            com.google.android.gms.internal.measurement.fc r3 = com.google.android.gms.internal.measurement.fc.f2707p
            com.google.android.gms.internal.measurement.r4<com.google.android.gms.internal.measurement.gc> r3 = r3.f2708o
            java.lang.Object r3 = r3.zza()
            com.google.android.gms.internal.measurement.gc r3 = (com.google.android.gms.internal.measurement.gc) r3
            r3.zza()
            h5.s2<java.lang.Boolean> r3 = h5.u2.f5721h0
            r14 = 0
            boolean r3 = r13.m(r14, r3)
            h5.g3 r14 = r6.w
            if (r3 == 0) goto L_0x01ae
            h5.i4.n(r14)
            java.lang.String r3 = "Disabled IID for tests."
            h5.e3 r4 = r14.B
            r4.a(r3)
            goto L_0x0185
        L_0x01ae:
            java.lang.ClassLoader r3 = r4.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x0185 }
            java.lang.String r1 = "com.google.firebase.analytics.FirebaseAnalytics"
            java.lang.Class r1 = r3.loadClass(r1)     // Catch:{ ClassNotFoundException -> 0x0185 }
            if (r1 != 0) goto L_0x01bb
            goto L_0x0185
        L_0x01bb:
            r3 = 1
            java.lang.Class[] r3 = new java.lang.Class[r3]     // Catch:{ Exception -> 0x01f7 }
            java.lang.Class<android.content.Context> r20 = android.content.Context.class
            r23 = r15
            r15 = 0
            r3[r15] = r20     // Catch:{ Exception -> 0x01f4 }
            java.lang.String r15 = "getInstance"
            java.lang.reflect.Method r3 = r1.getDeclaredMethod(r15, r3)     // Catch:{ Exception -> 0x01f4 }
            r15 = 1
            java.lang.Object[] r15 = new java.lang.Object[r15]     // Catch:{ Exception -> 0x01f4 }
            r16 = r12
            r12 = 0
            r15[r12] = r4     // Catch:{ Exception -> 0x01fa }
            r4 = 0
            java.lang.Object r3 = r3.invoke(r4, r15)     // Catch:{ Exception -> 0x01fa }
            if (r3 != 0) goto L_0x01db
            goto L_0x0204
        L_0x01db:
            java.lang.String r4 = "getFirebaseInstanceId"
            java.lang.Class[] r15 = new java.lang.Class[r12]     // Catch:{ Exception -> 0x01ec }
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r4, r15)     // Catch:{ Exception -> 0x01ec }
            java.lang.Object[] r4 = new java.lang.Object[r12]     // Catch:{ Exception -> 0x01ec }
            java.lang.Object r1 = r1.invoke(r3, r4)     // Catch:{ Exception -> 0x01ec }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x01ec }
            goto L_0x0205
        L_0x01ec:
            h5.i4.n(r14)
            java.lang.String r1 = "Failed to retrieve Firebase Instance Id"
            h5.e3 r3 = r14.f5400y
            goto L_0x0201
        L_0x01f4:
            r16 = r12
            goto L_0x01fa
        L_0x01f7:
            r23 = r15
            goto L_0x01f4
        L_0x01fa:
            h5.i4.n(r14)
            java.lang.String r1 = "Failed to obtain Firebase Analytics instance"
            h5.e3 r3 = r14.f5399x
        L_0x0201:
            r3.a(r1)
        L_0x0204:
            r1 = 0
        L_0x0205:
            r20 = r1
            h5.q3 r1 = r0.f5753s
            long r3 = r1.a()
            r14 = 0
            int r1 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            long r14 = r6.V
            if (r1 != 0) goto L_0x0217
            r3 = r14
            goto L_0x021b
        L_0x0217:
            long r3 = java.lang.Math.min(r14, r3)
        L_0x021b:
            r2.h()
            int r1 = r2.f5818x
            java.lang.String r6 = "google_analytics_adid_collection_enabled"
            java.lang.Boolean r6 = r13.o(r6)
            if (r6 == 0) goto L_0x0231
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L_0x022f
            goto L_0x0231
        L_0x022f:
            r6 = 0
            goto L_0x0232
        L_0x0231:
            r6 = 1
        L_0x0232:
            r26 = r6
            r0.g()
            android.content.SharedPreferences r6 = r0.l()
            java.lang.String r12 = "deferred_analytics_collection"
            r14 = 0
            boolean r27 = r6.getBoolean(r12, r14)
            r2.h()
            java.lang.String r15 = r2.z
            java.lang.String r6 = "google_analytics_default_allow_ad_personalization_signals"
            java.lang.Boolean r6 = r13.o(r6)
            if (r6 != 0) goto L_0x0251
            r6 = 0
            goto L_0x025b
        L_0x0251:
            boolean r6 = r6.booleanValue()
            r6 = r6 ^ 1
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
        L_0x025b:
            r29 = r6
            r25 = r15
            long r14 = r2.f5817v
            java.util.List<java.lang.String> r12 = r2.w
            com.google.android.gms.internal.measurement.qa.a()
            h5.s2<java.lang.Boolean> r6 = h5.u2.f5717f0
            r28 = r12
            r12 = 0
            boolean r6 = r13.m(r12, r6)
            if (r6 == 0) goto L_0x027e
            r2.h()
            java.lang.String r6 = r2.A
            n4.m.h(r6)
            java.lang.String r2 = r2.A
            r33 = r2
            goto L_0x0280
        L_0x027e:
            r33 = r12
        L_0x0280:
            r12 = 42004(0xa414, double:2.07527E-319)
            r30 = r14
            r13 = r12
            r21 = 0
            h5.f r0 = r0.p()
            java.lang.String r34 = r0.c()
            r6 = r5
            r0 = r28
            r12 = r16
            r2 = r25
            r15 = r23
            r23 = r3
            r25 = r1
            r28 = r2
            r32 = r0
            r6.<init>((java.lang.String) r7, (java.lang.String) r8, (java.lang.String) r9, (long) r10, (java.lang.String) r12, (long) r13, (long) r15, (java.lang.String) r17, (boolean) r18, (boolean) r19, (java.lang.String) r20, (long) r21, (long) r23, (int) r25, (boolean) r26, (boolean) r27, (java.lang.String) r28, (java.lang.Boolean) r29, (long) r30, (java.util.List<java.lang.String>) r32, (java.lang.String) r33, (java.lang.String) r34)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: h5.f6.s(boolean):h5.i7");
    }

    public final boolean t() {
        g();
        h();
        return this.f5383r != null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v25, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v26, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v49, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v57, resolved type: int} */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:74|75|76|77) */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:89|90|91|92) */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x023e, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0240, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0242, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0269, code lost:
        if (r7.inTransaction() != false) goto L_0x026b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x026b, code lost:
        r7.endTransaction();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x027d, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0284, code lost:
        r13 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x0299, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x02b8, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x02bd, code lost:
        r16 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x02d1, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x02d2, code lost:
        r13 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x02d5, code lost:
        r13.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x02da, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x01bc, code lost:
        r18 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x011a, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:?, code lost:
        r0 = r15.w;
        h5.i4.n(r0);
        r0.f5397t.a("Failed to load event from local database");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x012e, code lost:
        r18 = r18;
        r18 = r18;
        r18 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:?, code lost:
        r13.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:?, code lost:
        r0 = r15.w;
        h5.i4.n(r0);
        r0.f5397t.a("Failed to load user property from local database");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:?, code lost:
        r8.recycle();
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:?, code lost:
        r0 = r15.w;
        h5.i4.n(r0);
        r0.f5397t.a("Failed to load conditional user property from local database");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:?, code lost:
        r8.recycle();
        r0 = null;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:60:0x0122 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:74:0x0156 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:89:0x0189 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x023a A[SYNTHETIC, Splitter:B:138:0x023a] */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x0242 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:14:0x0057] */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x0265 A[SYNTHETIC, Splitter:B:156:0x0265] */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x027d  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x0284  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x0299  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x02b8  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x02bd  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x02d5  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x02da  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x02f3  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x02fc  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x030d  */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x023d A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x02c5 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void u(h5.x2 r29, o4.a r30, h5.i7 r31) {
        /*
            r28 = this;
            r1 = r29
            r2 = r30
            r3 = r31
            r28.g()
            r28.h()
            r4 = r28
            h5.i4 r5 = r4.f5649o
            r5.getClass()
            r5.getClass()
            r6 = 100
            r0 = r6
            r8 = 0
        L_0x001a:
            r9 = 1001(0x3e9, float:1.403E-42)
            if (r8 >= r9) goto L_0x0361
            if (r0 != r6) goto L_0x0361
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            h5.a3 r10 = r5.q()
            java.lang.String r11 = "rowid"
            java.lang.String r12 = "Error reading entries from local database"
            r10.g()
            boolean r0 = r10.f5268r
            if (r0 == 0) goto L_0x0035
            goto L_0x0059
        L_0x0035:
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            h5.i4 r15 = r10.f5649o
            android.content.Context r0 = r15.f5452o
            java.lang.String r13 = "google_app_measurement_local.db"
            java.io.File r0 = r0.getDatabasePath(r13)
            boolean r0 = r0.exists()
            if (r0 == 0) goto L_0x02ee
            r13 = 5
            r16 = r13
            r6 = 0
        L_0x004e:
            if (r6 >= r13) goto L_0x02de
            r13 = 1
            android.database.sqlite.SQLiteDatabase r7 = r10.m()     // Catch:{ SQLiteFullException -> 0x029f, SQLiteDatabaseLockedException -> 0x0287, SQLiteException -> 0x025b, all -> 0x0256 }
            if (r7 != 0) goto L_0x005d
            r10.f5268r = r13     // Catch:{ SQLiteFullException -> 0x024e, SQLiteDatabaseLockedException -> 0x00b6, SQLiteException -> 0x0244, all -> 0x0242 }
        L_0x0059:
            r18 = r8
            goto L_0x02ec
        L_0x005d:
            r7.beginTransaction()     // Catch:{ SQLiteFullException -> 0x024e, SQLiteDatabaseLockedException -> 0x00b6, SQLiteException -> 0x0244, all -> 0x0242 }
            java.lang.String r0 = "3"
            java.lang.String r18 = "messages"
            java.lang.String[] r19 = new java.lang.String[]{r11}     // Catch:{ all -> 0x0231 }
            java.lang.String r20 = "type=?"
            java.lang.String[] r21 = new java.lang.String[]{r0}     // Catch:{ all -> 0x0231 }
            r22 = 0
            r23 = 0
            java.lang.String r24 = "rowid desc"
            java.lang.String r25 = "1"
            r17 = r7
            android.database.Cursor r13 = r17.query(r18, r19, r20, r21, r22, r23, r24, r25)     // Catch:{ all -> 0x0231 }
            boolean r0 = r13.moveToFirst()     // Catch:{ all -> 0x022e }
            r26 = -1
            if (r0 == 0) goto L_0x0094
            r4 = 0
            long r17 = r13.getLong(r4)     // Catch:{ all -> 0x022e }
            r13.close()     // Catch:{ SQLiteFullException -> 0x024e, SQLiteDatabaseLockedException -> 0x00b6, SQLiteException -> 0x0244, all -> 0x0242 }
            goto L_0x0099
        L_0x008d:
            r18 = r8
            r17 = r11
            r11 = 0
            goto L_0x0238
        L_0x0094:
            r13.close()     // Catch:{ SQLiteFullException -> 0x024e, SQLiteDatabaseLockedException -> 0x00b6, SQLiteException -> 0x0244, all -> 0x0242 }
            r17 = r26
        L_0x0099:
            int r0 = (r17 > r26 ? 1 : (r17 == r26 ? 0 : -1))
            if (r0 == 0) goto L_0x00c4
            java.lang.String r0 = "rowid<?"
            r4 = 1
            java.lang.String[] r13 = new java.lang.String[r4]     // Catch:{ SQLiteFullException -> 0x024e, SQLiteDatabaseLockedException -> 0x00b6, SQLiteException -> 0x0244, all -> 0x0242 }
            java.lang.String r4 = java.lang.String.valueOf(r17)     // Catch:{ SQLiteFullException -> 0x024e, SQLiteDatabaseLockedException -> 0x00b6, SQLiteException -> 0x0244, all -> 0x0242 }
            r17 = 0
            r13[r17] = r4     // Catch:{ SQLiteFullException -> 0x024e, SQLiteDatabaseLockedException -> 0x00b6, SQLiteException -> 0x0244, all -> 0x0242 }
            r20 = r0
            r21 = r13
            goto L_0x00c8
        L_0x00af:
            r18 = r8
            r17 = r11
            r11 = 0
            goto L_0x0247
        L_0x00b6:
            r18 = r8
            r17 = r11
            r11 = 0
            goto L_0x0249
        L_0x00bd:
            r18 = r8
            r17 = r11
            r11 = 0
            goto L_0x0251
        L_0x00c4:
            r20 = 0
            r21 = 0
        L_0x00c8:
            java.lang.String r0 = "type"
            java.lang.String r4 = "entry"
            java.lang.String[] r19 = new java.lang.String[]{r11, r0, r4}     // Catch:{ SQLiteFullException -> 0x024e, SQLiteDatabaseLockedException -> 0x00b6, SQLiteException -> 0x0244, all -> 0x0242 }
            java.lang.String r18 = "messages"
            r22 = 0
            r23 = 0
            java.lang.String r24 = "rowid asc"
            r4 = 100
            java.lang.String r25 = java.lang.Integer.toString(r4)     // Catch:{ SQLiteFullException -> 0x024e, SQLiteDatabaseLockedException -> 0x00b6, SQLiteException -> 0x0244, all -> 0x0242 }
            r17 = r7
            android.database.Cursor r4 = r17.query(r18, r19, r20, r21, r22, r23, r24, r25)     // Catch:{ SQLiteFullException -> 0x024e, SQLiteDatabaseLockedException -> 0x00b6, SQLiteException -> 0x0244, all -> 0x0242 }
        L_0x00e4:
            boolean r0 = r4.moveToNext()     // Catch:{ SQLiteFullException -> 0x0223, SQLiteDatabaseLockedException -> 0x0219, SQLiteException -> 0x0213 }
            if (r0 == 0) goto L_0x01d4
            r13 = 0
            long r26 = r4.getLong(r13)     // Catch:{ SQLiteFullException -> 0x0223, SQLiteDatabaseLockedException -> 0x0219, SQLiteException -> 0x0213 }
            r13 = 1
            int r0 = r4.getInt(r13)     // Catch:{ SQLiteFullException -> 0x0223, SQLiteDatabaseLockedException -> 0x0219, SQLiteException -> 0x0213 }
            r13 = 2
            r17 = r11
            byte[] r11 = r4.getBlob(r13)     // Catch:{ SQLiteFullException -> 0x01c9, SQLiteDatabaseLockedException -> 0x01c6, SQLiteException -> 0x01c2 }
            if (r0 != 0) goto L_0x0137
            android.os.Parcel r13 = android.os.Parcel.obtain()     // Catch:{ SQLiteFullException -> 0x01c9, SQLiteDatabaseLockedException -> 0x01c6, SQLiteException -> 0x01c2 }
            int r0 = r11.length     // Catch:{ a -> 0x0120, all -> 0x011c }
            r18 = r8
            r8 = 0
            r13.unmarshall(r11, r8, r0)     // Catch:{ a -> 0x0122 }
            r13.setDataPosition(r8)     // Catch:{ a -> 0x0122 }
            android.os.Parcelable$Creator<h5.p> r0 = h5.p.CREATOR     // Catch:{ a -> 0x0122 }
            java.lang.Object r0 = r0.createFromParcel(r13)     // Catch:{ a -> 0x0122 }
            h5.p r0 = (h5.p) r0     // Catch:{ a -> 0x0122 }
            r13.recycle()     // Catch:{ SQLiteFullException -> 0x0211, SQLiteDatabaseLockedException -> 0x01d0, SQLiteException -> 0x020f }
            if (r0 == 0) goto L_0x01bc
            goto L_0x019b
        L_0x011a:
            r0 = move-exception
            goto L_0x0133
        L_0x011c:
            r0 = move-exception
            r18 = r8
            goto L_0x0133
        L_0x0120:
            r18 = r8
        L_0x0122:
            h5.g3 r0 = r15.w     // Catch:{ all -> 0x011a }
            h5.i4.n(r0)     // Catch:{ all -> 0x011a }
            h5.e3 r0 = r0.f5397t     // Catch:{ all -> 0x011a }
            java.lang.String r8 = "Failed to load event from local database"
            r0.a(r8)     // Catch:{ all -> 0x011a }
            r13.recycle()     // Catch:{ SQLiteFullException -> 0x0211, SQLiteDatabaseLockedException -> 0x01d0, SQLiteException -> 0x020f }
            goto L_0x01bc
        L_0x0133:
            r13.recycle()     // Catch:{ SQLiteFullException -> 0x0211, SQLiteDatabaseLockedException -> 0x01d0, SQLiteException -> 0x020f }
            throw r0     // Catch:{ SQLiteFullException -> 0x0211, SQLiteDatabaseLockedException -> 0x01d0, SQLiteException -> 0x020f }
        L_0x0137:
            r18 = r8
            r8 = 1
            if (r0 != r8) goto L_0x016d
            android.os.Parcel r8 = android.os.Parcel.obtain()     // Catch:{ SQLiteFullException -> 0x0211, SQLiteDatabaseLockedException -> 0x01d0, SQLiteException -> 0x020f }
            int r0 = r11.length     // Catch:{ a -> 0x0156 }
            r13 = 0
            r8.unmarshall(r11, r13, r0)     // Catch:{ a -> 0x0156 }
            r8.setDataPosition(r13)     // Catch:{ a -> 0x0156 }
            android.os.Parcelable$Creator<h5.c7> r0 = h5.c7.CREATOR     // Catch:{ a -> 0x0156 }
            java.lang.Object r0 = r0.createFromParcel(r8)     // Catch:{ a -> 0x0156 }
            h5.c7 r0 = (h5.c7) r0     // Catch:{ a -> 0x0156 }
            r8.recycle()     // Catch:{ SQLiteFullException -> 0x0211, SQLiteDatabaseLockedException -> 0x01d0, SQLiteException -> 0x020f }
            goto L_0x0166
        L_0x0154:
            r0 = move-exception
            goto L_0x0169
        L_0x0156:
            h5.g3 r0 = r15.w     // Catch:{ all -> 0x0154 }
            h5.i4.n(r0)     // Catch:{ all -> 0x0154 }
            h5.e3 r0 = r0.f5397t     // Catch:{ all -> 0x0154 }
            java.lang.String r11 = "Failed to load user property from local database"
            r0.a(r11)     // Catch:{ all -> 0x0154 }
            r8.recycle()     // Catch:{ SQLiteFullException -> 0x0211, SQLiteDatabaseLockedException -> 0x01d0, SQLiteException -> 0x020f }
            r0 = 0
        L_0x0166:
            if (r0 == 0) goto L_0x01bc
            goto L_0x019b
        L_0x0169:
            r8.recycle()     // Catch:{ SQLiteFullException -> 0x0211, SQLiteDatabaseLockedException -> 0x01d0, SQLiteException -> 0x020f }
            throw r0     // Catch:{ SQLiteFullException -> 0x0211, SQLiteDatabaseLockedException -> 0x01d0, SQLiteException -> 0x020f }
        L_0x016d:
            if (r0 != r13) goto L_0x01a3
            android.os.Parcel r8 = android.os.Parcel.obtain()     // Catch:{ SQLiteFullException -> 0x0211, SQLiteDatabaseLockedException -> 0x01d0, SQLiteException -> 0x020f }
            int r0 = r11.length     // Catch:{ a -> 0x0189 }
            r13 = 0
            r8.unmarshall(r11, r13, r0)     // Catch:{ a -> 0x0189 }
            r8.setDataPosition(r13)     // Catch:{ a -> 0x0189 }
            android.os.Parcelable$Creator<h5.b> r0 = h5.b.CREATOR     // Catch:{ a -> 0x0189 }
            java.lang.Object r0 = r0.createFromParcel(r8)     // Catch:{ a -> 0x0189 }
            h5.b r0 = (h5.b) r0     // Catch:{ a -> 0x0189 }
            r8.recycle()     // Catch:{ SQLiteFullException -> 0x0211, SQLiteDatabaseLockedException -> 0x01d0, SQLiteException -> 0x020f }
            goto L_0x0199
        L_0x0187:
            r0 = move-exception
            goto L_0x019f
        L_0x0189:
            h5.g3 r0 = r15.w     // Catch:{ all -> 0x0187 }
            h5.i4.n(r0)     // Catch:{ all -> 0x0187 }
            h5.e3 r0 = r0.f5397t     // Catch:{ all -> 0x0187 }
            java.lang.String r11 = "Failed to load conditional user property from local database"
            r0.a(r11)     // Catch:{ all -> 0x0187 }
            r8.recycle()     // Catch:{ SQLiteFullException -> 0x0211, SQLiteDatabaseLockedException -> 0x01d0, SQLiteException -> 0x020f }
            r0 = 0
        L_0x0199:
            if (r0 == 0) goto L_0x01bc
        L_0x019b:
            r14.add(r0)     // Catch:{ SQLiteFullException -> 0x0211, SQLiteDatabaseLockedException -> 0x01d0, SQLiteException -> 0x020f }
            goto L_0x01bc
        L_0x019f:
            r8.recycle()     // Catch:{ SQLiteFullException -> 0x0211, SQLiteDatabaseLockedException -> 0x01d0, SQLiteException -> 0x020f }
            throw r0     // Catch:{ SQLiteFullException -> 0x0211, SQLiteDatabaseLockedException -> 0x01d0, SQLiteException -> 0x020f }
        L_0x01a3:
            r8 = 3
            if (r0 != r8) goto L_0x01b0
            h5.g3 r0 = r15.w     // Catch:{ SQLiteFullException -> 0x0211, SQLiteDatabaseLockedException -> 0x01d0, SQLiteException -> 0x020f }
            h5.i4.n(r0)     // Catch:{ SQLiteFullException -> 0x0211, SQLiteDatabaseLockedException -> 0x01d0, SQLiteException -> 0x020f }
            h5.e3 r0 = r0.w     // Catch:{ SQLiteFullException -> 0x0211, SQLiteDatabaseLockedException -> 0x01d0, SQLiteException -> 0x020f }
            java.lang.String r8 = "Skipping app launch break"
            goto L_0x01b9
        L_0x01b0:
            h5.g3 r0 = r15.w     // Catch:{ SQLiteFullException -> 0x0211, SQLiteDatabaseLockedException -> 0x01d0, SQLiteException -> 0x020f }
            h5.i4.n(r0)     // Catch:{ SQLiteFullException -> 0x0211, SQLiteDatabaseLockedException -> 0x01d0, SQLiteException -> 0x020f }
            h5.e3 r0 = r0.f5397t     // Catch:{ SQLiteFullException -> 0x0211, SQLiteDatabaseLockedException -> 0x01d0, SQLiteException -> 0x020f }
            java.lang.String r8 = "Unknown record type in local database"
        L_0x01b9:
            r0.a(r8)     // Catch:{ SQLiteFullException -> 0x0211, SQLiteDatabaseLockedException -> 0x01d0, SQLiteException -> 0x020f }
        L_0x01bc:
            r11 = r17
            r8 = r18
            goto L_0x00e4
        L_0x01c2:
            r0 = move-exception
            r18 = r8
            goto L_0x01cd
        L_0x01c6:
            r18 = r8
            goto L_0x01d0
        L_0x01c9:
            r0 = move-exception
            r18 = r8
            goto L_0x01d2
        L_0x01cd:
            r11 = 0
            goto L_0x0263
        L_0x01d0:
            r11 = 0
            goto L_0x021e
        L_0x01d2:
            r11 = 0
            goto L_0x0229
        L_0x01d4:
            r18 = r8
            r17 = r11
            r8 = 1
            java.lang.String[] r0 = new java.lang.String[r8]     // Catch:{ SQLiteFullException -> 0x0211, SQLiteDatabaseLockedException -> 0x01d0, SQLiteException -> 0x020f }
            java.lang.String r8 = java.lang.Long.toString(r26)     // Catch:{ SQLiteFullException -> 0x0211, SQLiteDatabaseLockedException -> 0x01d0, SQLiteException -> 0x020f }
            r11 = 0
            r0[r11] = r8     // Catch:{ SQLiteFullException -> 0x020d, SQLiteDatabaseLockedException -> 0x021e, SQLiteException -> 0x020a }
            java.lang.String r8 = "messages"
            java.lang.String r13 = "rowid <= ?"
            int r0 = r7.delete(r8, r13, r0)     // Catch:{ SQLiteFullException -> 0x020d, SQLiteDatabaseLockedException -> 0x021e, SQLiteException -> 0x020a }
            int r8 = r14.size()     // Catch:{ SQLiteFullException -> 0x020d, SQLiteDatabaseLockedException -> 0x021e, SQLiteException -> 0x020a }
            if (r0 >= r8) goto L_0x01fc
            h5.g3 r0 = r15.w     // Catch:{ SQLiteFullException -> 0x020d, SQLiteDatabaseLockedException -> 0x021e, SQLiteException -> 0x020a }
            h5.i4.n(r0)     // Catch:{ SQLiteFullException -> 0x020d, SQLiteDatabaseLockedException -> 0x021e, SQLiteException -> 0x020a }
            h5.e3 r0 = r0.f5397t     // Catch:{ SQLiteFullException -> 0x020d, SQLiteDatabaseLockedException -> 0x021e, SQLiteException -> 0x020a }
            java.lang.String r8 = "Fewer entries removed from local database than expected"
            r0.a(r8)     // Catch:{ SQLiteFullException -> 0x020d, SQLiteDatabaseLockedException -> 0x021e, SQLiteException -> 0x020a }
        L_0x01fc:
            r7.setTransactionSuccessful()     // Catch:{ SQLiteFullException -> 0x020d, SQLiteDatabaseLockedException -> 0x021e, SQLiteException -> 0x020a }
            r7.endTransaction()     // Catch:{ SQLiteFullException -> 0x020d, SQLiteDatabaseLockedException -> 0x021e, SQLiteException -> 0x020a }
            r4.close()
            r7.close()
            goto L_0x02f0
        L_0x020a:
            r0 = move-exception
            goto L_0x0263
        L_0x020d:
            r0 = move-exception
            goto L_0x0229
        L_0x020f:
            r0 = move-exception
            goto L_0x01cd
        L_0x0211:
            r0 = move-exception
            goto L_0x01d2
        L_0x0213:
            r0 = move-exception
            r18 = r8
            r17 = r11
            goto L_0x01cd
        L_0x0219:
            r18 = r8
            r17 = r11
            goto L_0x01d0
        L_0x021e:
            r8 = r12
            r13 = r16
            goto L_0x0291
        L_0x0223:
            r0 = move-exception
            r18 = r8
            r17 = r11
            goto L_0x01d2
        L_0x0229:
            r8 = r12
            r13 = r16
            goto L_0x02a9
        L_0x022e:
            r0 = move-exception
            goto L_0x008d
        L_0x0231:
            r0 = move-exception
            r18 = r8
            r17 = r11
            r11 = 0
            r13 = 0
        L_0x0238:
            if (r13 == 0) goto L_0x023d
            r13.close()     // Catch:{ SQLiteFullException -> 0x0240, SQLiteDatabaseLockedException -> 0x0249, SQLiteException -> 0x023e, all -> 0x0242 }
        L_0x023d:
            throw r0     // Catch:{ SQLiteFullException -> 0x0240, SQLiteDatabaseLockedException -> 0x0249, SQLiteException -> 0x023e, all -> 0x0242 }
        L_0x023e:
            r0 = move-exception
            goto L_0x0247
        L_0x0240:
            r0 = move-exception
            goto L_0x0251
        L_0x0242:
            r0 = move-exception
            goto L_0x0258
        L_0x0244:
            r0 = move-exception
            goto L_0x00af
        L_0x0247:
            r4 = 0
            goto L_0x0263
        L_0x0249:
            r8 = r12
            r13 = r16
            r4 = 0
            goto L_0x0291
        L_0x024e:
            r0 = move-exception
            goto L_0x00bd
        L_0x0251:
            r8 = r12
            r13 = r16
            r4 = 0
            goto L_0x02a9
        L_0x0256:
            r0 = move-exception
            r7 = 0
        L_0x0258:
            r13 = 0
            goto L_0x02d3
        L_0x025b:
            r0 = move-exception
            r18 = r8
            r17 = r11
            r11 = 0
            r4 = 0
            r7 = 0
        L_0x0263:
            if (r7 == 0) goto L_0x026e
            boolean r8 = r7.inTransaction()     // Catch:{ all -> 0x02d1 }
            if (r8 == 0) goto L_0x026e
            r7.endTransaction()     // Catch:{ all -> 0x02d1 }
        L_0x026e:
            h5.g3 r8 = r15.w     // Catch:{ all -> 0x02d1 }
            h5.i4.n(r8)     // Catch:{ all -> 0x02d1 }
            h5.e3 r8 = r8.f5397t     // Catch:{ all -> 0x02d1 }
            r8.b(r0, r12)     // Catch:{ all -> 0x02d1 }
            r8 = 1
            r10.f5268r = r8     // Catch:{ all -> 0x02d1 }
            if (r4 == 0) goto L_0x0280
            r4.close()
        L_0x0280:
            r8 = r12
            if (r7 == 0) goto L_0x0284
            goto L_0x02bf
        L_0x0284:
            r13 = r16
            goto L_0x02c3
        L_0x0287:
            r18 = r8
            r17 = r11
            r11 = 0
            r8 = r12
            r13 = r16
            r4 = 0
            r7 = 0
        L_0x0291:
            long r11 = (long) r13
            android.os.SystemClock.sleep(r11)     // Catch:{ all -> 0x02d1 }
            int r16 = r13 + 20
            if (r4 == 0) goto L_0x029c
            r4.close()
        L_0x029c:
            if (r7 == 0) goto L_0x02c5
            goto L_0x02bf
        L_0x029f:
            r0 = move-exception
            r18 = r8
            r17 = r11
            r8 = r12
            r13 = r16
            r4 = 0
            r7 = 0
        L_0x02a9:
            h5.g3 r11 = r15.w     // Catch:{ all -> 0x02d1 }
            h5.i4.n(r11)     // Catch:{ all -> 0x02d1 }
            h5.e3 r11 = r11.f5397t     // Catch:{ all -> 0x02d1 }
            r11.b(r0, r8)     // Catch:{ all -> 0x02d1 }
            r11 = 1
            r10.f5268r = r11     // Catch:{ all -> 0x02d1 }
            if (r4 == 0) goto L_0x02bb
            r4.close()
        L_0x02bb:
            if (r7 == 0) goto L_0x02c3
            r16 = r13
        L_0x02bf:
            r7.close()
            goto L_0x02c5
        L_0x02c3:
            r16 = r13
        L_0x02c5:
            int r6 = r6 + 1
            r4 = r28
            r12 = r8
            r11 = r17
            r8 = r18
            r13 = 5
            goto L_0x004e
        L_0x02d1:
            r0 = move-exception
            r13 = r4
        L_0x02d3:
            if (r13 == 0) goto L_0x02d8
            r13.close()
        L_0x02d8:
            if (r7 == 0) goto L_0x02dd
            r7.close()
        L_0x02dd:
            throw r0
        L_0x02de:
            r18 = r8
            h5.g3 r0 = r15.w
            h5.i4.n(r0)
            java.lang.String r4 = "Failed to read events from database in reasonable time"
            h5.e3 r0 = r0.w
            r0.a(r4)
        L_0x02ec:
            r13 = 0
            goto L_0x02f1
        L_0x02ee:
            r18 = r8
        L_0x02f0:
            r13 = r14
        L_0x02f1:
            if (r13 == 0) goto L_0x02fc
            r9.addAll(r13)
            int r0 = r13.size()
            r4 = r0
            goto L_0x02fd
        L_0x02fc:
            r4 = 0
        L_0x02fd:
            r6 = 100
            if (r2 == 0) goto L_0x0306
            if (r4 >= r6) goto L_0x0306
            r9.add(r2)
        L_0x0306:
            int r7 = r9.size()
            r8 = 0
        L_0x030b:
            if (r8 >= r7) goto L_0x035a
            java.lang.Object r0 = r9.get(r8)
            o4.a r0 = (o4.a) r0
            boolean r10 = r0 instanceof h5.p
            h5.g3 r11 = r5.w
            if (r10 == 0) goto L_0x0326
            h5.p r0 = (h5.p) r0     // Catch:{ RemoteException -> 0x031f }
            r1.l(r0, r3)     // Catch:{ RemoteException -> 0x031f }
            goto L_0x0357
        L_0x031f:
            r0 = move-exception
            h5.i4.n(r11)
            java.lang.String r10 = "Failed to send event to the service"
            goto L_0x0347
        L_0x0326:
            boolean r10 = r0 instanceof h5.c7
            if (r10 == 0) goto L_0x0337
            h5.c7 r0 = (h5.c7) r0     // Catch:{ RemoteException -> 0x0330 }
            r1.t(r0, r3)     // Catch:{ RemoteException -> 0x0330 }
            goto L_0x0357
        L_0x0330:
            r0 = move-exception
            h5.i4.n(r11)
            java.lang.String r10 = "Failed to send user property to the service"
            goto L_0x0347
        L_0x0337:
            boolean r10 = r0 instanceof h5.b
            if (r10 == 0) goto L_0x034d
            h5.b r0 = (h5.b) r0     // Catch:{ RemoteException -> 0x0341 }
            r1.r(r0, r3)     // Catch:{ RemoteException -> 0x0341 }
            goto L_0x0357
        L_0x0341:
            r0 = move-exception
            h5.i4.n(r11)
            java.lang.String r10 = "Failed to send conditional user property to the service"
        L_0x0347:
            h5.e3 r11 = r11.f5397t
            r11.b(r0, r10)
            goto L_0x0357
        L_0x034d:
            h5.i4.n(r11)
            java.lang.String r0 = "Discarding data. Unrecognized parcel type."
            h5.e3 r10 = r11.f5397t
            r10.a(r0)
        L_0x0357:
            int r8 = r8 + 1
            goto L_0x030b
        L_0x035a:
            int r8 = r18 + 1
            r0 = r4
            r4 = r28
            goto L_0x001a
        L_0x0361:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h5.f6.u(h5.x2, o4.a, h5.i7):void");
    }

    public final void v(b bVar) {
        boolean z;
        g();
        h();
        i4 i4Var = this.f5649o;
        i4Var.getClass();
        a3 q10 = i4Var.q();
        i4 i4Var2 = q10.f5649o;
        g7 g7Var = i4Var2.z;
        i4.l(g7Var);
        g7Var.getClass();
        byte[] F = g7.F(bVar);
        if (F.length > 131072) {
            g3 g3Var = i4Var2.w;
            i4.n(g3Var);
            g3Var.u.a("Conditional user property too long for local database. Sending directly to service");
            z = false;
        } else {
            z = q10.n(2, F);
        }
        b bVar2 = new b(bVar);
        q(new g5(this, s(true), z, bVar2, bVar));
    }

    public final void w(AtomicReference<String> atomicReference) {
        g();
        h();
        q(new j4(this, (AtomicReference) atomicReference, s(false)));
    }
}
