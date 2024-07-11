package h5;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.b4;
import com.google.android.gms.internal.measurement.d4;
import com.google.android.gms.internal.measurement.m4;
import com.google.android.gms.internal.measurement.n4;
import com.google.android.gms.internal.measurement.w0;
import com.google.android.gms.internal.measurement.z3;
import i4.o;
import java.util.concurrent.atomic.AtomicInteger;
import n4.m;
import org.checkerframework.dataflow.qual.Pure;
import r4.c;
import r4.d;
import s6.a;

public final class i4 implements s4 {
    public static volatile i4 W;
    public final b3 A;
    public final d B;
    public final u5 C;
    public final i5 D;
    public final u1 E;
    public final n5 F;
    public final String G;
    public a3 H;
    public f6 I;
    public k J;
    public y2 K;
    public w3 L;
    public boolean M = false;
    public Boolean N;
    public long O;
    public volatile Boolean P;
    public final Boolean Q;
    public final Boolean R;
    public volatile boolean S;
    public int T;
    public final AtomicInteger U = new AtomicInteger(0);
    public final long V;

    /* renamed from: o  reason: collision with root package name */
    public final Context f5452o;

    /* renamed from: p  reason: collision with root package name */
    public final String f5453p;

    /* renamed from: q  reason: collision with root package name */
    public final String f5454q;

    /* renamed from: r  reason: collision with root package name */
    public final String f5455r;

    /* renamed from: s  reason: collision with root package name */
    public final boolean f5456s;

    /* renamed from: t  reason: collision with root package name */
    public final q0.d f5457t;
    public final e u;

    /* renamed from: v  reason: collision with root package name */
    public final u3 f5458v;
    public final g3 w;

    /* renamed from: x  reason: collision with root package name */
    public final h4 f5459x;

    /* renamed from: y  reason: collision with root package name */
    public final q6 f5460y;
    public final g7 z;

    public i4(u4 u4Var) {
        long j8;
        String str;
        e3 e3Var;
        Context context;
        Bundle bundle;
        boolean z10 = false;
        Context context2 = u4Var.f5758a;
        q0.d dVar = new q0.d((b0.d) null);
        this.f5457t = dVar;
        a.G = dVar;
        this.f5452o = context2;
        this.f5453p = u4Var.f5759b;
        this.f5454q = u4Var.f5760c;
        this.f5455r = u4Var.d;
        this.f5456s = u4Var.f5764h;
        this.P = u4Var.f5761e;
        this.G = u4Var.f5766j;
        this.S = true;
        w0 w0Var = u4Var.f5763g;
        if (!(w0Var == null || (bundle = w0Var.u) == null)) {
            Object obj = bundle.get("measurementEnabled");
            if (obj instanceof Boolean) {
                this.Q = (Boolean) obj;
            }
            Object obj2 = w0Var.u.get("measurementDeactivated");
            if (obj2 instanceof Boolean) {
                this.R = (Boolean) obj2;
            }
        }
        synchronized (m4.f2821f) {
            z3 z3Var = m4.f2822g;
            Context applicationContext = context2.getApplicationContext();
            if (applicationContext == null) {
                applicationContext = context2;
            }
            if (z3Var == null || z3Var.f3019a != applicationContext) {
                b4.c();
                n4.a();
                synchronized (d4.class) {
                    d4 d4Var = d4.f2668c;
                    if (!(d4Var == null || (context = d4Var.f2669a) == null || d4Var.f2670b == null)) {
                        context.getContentResolver().unregisterContentObserver(d4.f2668c.f2670b);
                    }
                    d4.f2668c = null;
                }
                m4.f2822g = new z3(applicationContext, androidx.databinding.a.x(new q1.d(3, applicationContext)));
                m4.f2823h.incrementAndGet();
            }
        }
        this.B = d.f8428a;
        Long l = u4Var.f5765i;
        if (l != null) {
            j8 = l.longValue();
        } else {
            j8 = System.currentTimeMillis();
        }
        this.V = j8;
        this.u = new e(this);
        u3 u3Var = new u3(this);
        u3Var.j();
        this.f5458v = u3Var;
        g3 g3Var = new g3(this);
        g3Var.j();
        this.w = g3Var;
        g7 g7Var = new g7(this);
        g7Var.j();
        this.z = g7Var;
        b3 b3Var = new b3(this);
        b3Var.j();
        this.A = b3Var;
        this.E = new u1(this);
        u5 u5Var = new u5(this);
        u5Var.i();
        this.C = u5Var;
        i5 i5Var = new i5(this);
        i5Var.i();
        this.D = i5Var;
        q6 q6Var = new q6(this);
        q6Var.i();
        this.f5460y = q6Var;
        n5 n5Var = new n5(this);
        n5Var.j();
        this.F = n5Var;
        h4 h4Var = new h4(this);
        h4Var.j();
        this.f5459x = h4Var;
        w0 w0Var2 = u4Var.f5763g;
        z10 = (w0Var2 == null || w0Var2.f2970p == 0) ? true : z10;
        if (context2.getApplicationContext() instanceof Application) {
            m(i5Var);
            if (i5Var.f5649o.f5452o.getApplicationContext() instanceof Application) {
                Application application = (Application) i5Var.f5649o.f5452o.getApplicationContext();
                if (i5Var.f5461q == null) {
                    i5Var.f5461q = new h5(i5Var);
                }
                if (z10) {
                    application.unregisterActivityLifecycleCallbacks(i5Var.f5461q);
                    application.registerActivityLifecycleCallbacks(i5Var.f5461q);
                    g3 g3Var2 = i5Var.f5649o.w;
                    n(g3Var2);
                    e3Var = g3Var2.B;
                    str = "Registered activity lifecycle callback";
                }
            }
            h4Var.n(new o((Object) this, (Object) u4Var, 2));
        }
        n(g3Var);
        e3Var = g3Var.w;
        str = "Application context is not an Application";
        e3Var.a(str);
        h4Var.n(new o((Object) this, (Object) u4Var, 2));
    }

    public static i4 h(Context context, w0 w0Var, Long l) {
        Bundle bundle;
        if (w0Var != null && (w0Var.f2973s == null || w0Var.f2974t == null)) {
            w0Var = new w0(w0Var.f2969o, w0Var.f2970p, w0Var.f2971q, w0Var.f2972r, (String) null, (String) null, w0Var.u, (String) null);
        }
        m.h(context);
        m.h(context.getApplicationContext());
        if (W == null) {
            synchronized (i4.class) {
                if (W == null) {
                    W = new i4(new u4(context, w0Var, l));
                }
            }
        } else if (!(w0Var == null || (bundle = w0Var.u) == null || !bundle.containsKey("dataCollectionDefaultEnabled"))) {
            m.h(W);
            W.P = Boolean.valueOf(w0Var.u.getBoolean("dataCollectionDefaultEnabled"));
        }
        m.h(W);
        return W;
    }

    public static final void l(r4 r4Var) {
        if (r4Var == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    public static final void m(s3 s3Var) {
        if (s3Var == null) {
            throw new IllegalStateException("Component not created");
        } else if (!s3Var.f5685p) {
            String valueOf = String.valueOf(s3Var.getClass());
            throw new IllegalStateException(b0.d.g(new StringBuilder(valueOf.length() + 27), "Component not initialized: ", valueOf));
        }
    }

    public static final void n(r4 r4Var) {
        if (r4Var == null) {
            throw new IllegalStateException("Component not created");
        } else if (!r4Var.f5671p) {
            String valueOf = String.valueOf(r4Var.getClass());
            throw new IllegalStateException(b0.d.g(new StringBuilder(valueOf.length() + 27), "Component not initialized: ", valueOf));
        }
    }

    @Pure
    public final q0.d a() {
        return this.f5457t;
    }

    @Pure
    public final y2 b() {
        m(this.K);
        return this.K;
    }

    @Pure
    public final c c() {
        return this.B;
    }

    @Pure
    public final Context d() {
        return this.f5452o;
    }

    @Pure
    public final g3 e() {
        g3 g3Var = this.w;
        n(g3Var);
        return g3Var;
    }

    @Pure
    public final h4 f() {
        h4 h4Var = this.f5459x;
        n(h4Var);
        return h4Var;
    }

    @Pure
    public final u1 g() {
        u1 u1Var = this.E;
        if (u1Var != null) {
            return u1Var;
        }
        throw new IllegalStateException("Component not created");
    }

    public final boolean i() {
        return j() == 0;
    }

    public final int j() {
        h4 h4Var = this.f5459x;
        n(h4Var);
        h4Var.g();
        if (this.u.p()) {
            return 1;
        }
        Boolean bool = this.R;
        if (bool != null && bool.booleanValue()) {
            return 2;
        }
        h4 h4Var2 = this.f5459x;
        n(h4Var2);
        h4Var2.g();
        if (!this.S) {
            return 8;
        }
        u3 u3Var = this.f5458v;
        l(u3Var);
        Boolean n10 = u3Var.n();
        if (n10 == null) {
            e eVar = this.u;
            q0.d dVar = eVar.f5649o.f5457t;
            Boolean o10 = eVar.o("firebase_analytics_collection_enabled");
            if (o10 == null) {
                Boolean bool2 = this.Q;
                if (bool2 != null) {
                    if (bool2.booleanValue()) {
                        return 0;
                    }
                    return 5;
                } else if (!this.u.m((String) null, u2.S) || this.P == null || this.P.booleanValue()) {
                    return 0;
                } else {
                    return 7;
                }
            } else if (o10.booleanValue()) {
                return 0;
            } else {
                return 4;
            }
        } else if (n10.booleanValue()) {
            return 0;
        } else {
            return 3;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0089, code lost:
        if (r1 == false) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00cc, code lost:
        if (android.text.TextUtils.isEmpty(r0.z) == false) goto L_0x00ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0032, code lost:
        if (java.lang.Math.abs(android.os.SystemClock.elapsedRealtime() - r7.O) > 1000) goto L_0x0034;
     */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x009a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean k() {
        /*
            r7 = this;
            boolean r0 = r7.M
            if (r0 == 0) goto L_0x00dc
            h5.h4 r0 = r7.f5459x
            n(r0)
            r0.g()
            java.lang.Boolean r0 = r7.N
            r4.d r1 = r7.B
            if (r0 == 0) goto L_0x0034
            long r2 = r7.O
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x0034
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x00d5
            r1.getClass()
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r4 = r7.O
            long r2 = r2 - r4
            long r2 = java.lang.Math.abs(r2)
            r4 = 1000(0x3e8, double:4.94E-321)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x00d5
        L_0x0034:
            r1.getClass()
            long r0 = android.os.SystemClock.elapsedRealtime()
            r7.O = r0
            h5.g7 r0 = r7.z
            l(r0)
            java.lang.String r1 = "android.permission.INTERNET"
            boolean r1 = r0.z(r1)
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x008d
            java.lang.String r1 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r1 = r0.z(r1)
            if (r1 == 0) goto L_0x008d
            android.content.Context r1 = r7.f5452o
            t4.b r4 = t4.c.a(r1)
            boolean r4 = r4.c()
            if (r4 != 0) goto L_0x008b
            h5.e r4 = r7.u
            boolean r4 = r4.s()
            if (r4 != 0) goto L_0x008b
            boolean r4 = h5.g7.Q(r1)
            if (r4 == 0) goto L_0x008d
            java.lang.String r4 = "com.google.android.gms.measurement.AppMeasurementJobService"
            android.content.pm.PackageManager r5 = r1.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0088 }
            if (r5 != 0) goto L_0x0077
            goto L_0x0088
        L_0x0077:
            android.content.ComponentName r6 = new android.content.ComponentName     // Catch:{ NameNotFoundException -> 0x0088 }
            r6.<init>(r1, r4)     // Catch:{ NameNotFoundException -> 0x0088 }
            android.content.pm.ServiceInfo r1 = r5.getServiceInfo(r6, r2)     // Catch:{ NameNotFoundException -> 0x0088 }
            if (r1 == 0) goto L_0x0088
            boolean r1 = r1.enabled     // Catch:{ NameNotFoundException -> 0x0088 }
            if (r1 == 0) goto L_0x0088
            r1 = r3
            goto L_0x0089
        L_0x0088:
            r1 = r2
        L_0x0089:
            if (r1 == 0) goto L_0x008d
        L_0x008b:
            r1 = r3
            goto L_0x008e
        L_0x008d:
            r1 = r2
        L_0x008e:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r7.N = r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x00d5
            h5.y2 r1 = r7.b()
            java.lang.String r1 = r1.m()
            h5.y2 r4 = r7.b()
            r4.h()
            java.lang.String r4 = r4.z
            h5.y2 r5 = r7.b()
            r5.h()
            java.lang.String r6 = r5.A
            n4.m.h(r6)
            java.lang.String r5 = r5.A
            boolean r0 = r0.k(r1, r4, r5)
            if (r0 != 0) goto L_0x00ce
            h5.y2 r0 = r7.b()
            r0.h()
            java.lang.String r0 = r0.z
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00cf
        L_0x00ce:
            r2 = r3
        L_0x00cf:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r7.N = r0
        L_0x00d5:
            java.lang.Boolean r0 = r7.N
            boolean r0 = r0.booleanValue()
            return r0
        L_0x00dc:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "AppMeasurement is not initialized"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h5.i4.k():boolean");
    }

    @Pure
    public final e o() {
        return this.u;
    }

    @Pure
    public final b3 p() {
        b3 b3Var = this.A;
        l(b3Var);
        return b3Var;
    }

    @Pure
    public final a3 q() {
        m(this.H);
        return this.H;
    }

    @Pure
    public final f6 r() {
        m(this.I);
        return this.I;
    }

    @Pure
    public final k s() {
        n(this.J);
        return this.J;
    }
}
