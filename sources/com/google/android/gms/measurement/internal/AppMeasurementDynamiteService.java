package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.internal.measurement.m0;
import com.google.android.gms.internal.measurement.q0;
import com.google.android.gms.internal.measurement.t0;
import com.google.android.gms.internal.measurement.v0;
import com.google.android.gms.internal.measurement.w0;
import com.google.android.gms.internal.measurement.y9;
import h5.a5;
import h5.b5;
import h5.c5;
import h5.g3;
import h5.g7;
import h5.h4;
import h5.h5;
import h5.h7;
import h5.i4;
import h5.i5;
import h5.m5;
import h5.p;
import h5.p5;
import h5.t4;
import h5.u2;
import h5.u5;
import h5.v4;
import h5.x4;
import h5.y4;
import i4.i;
import i4.n;
import i4.o;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import l4.w;
import n.b;
import n4.m;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import u4.a;

@DynamiteApi
public class AppMeasurementDynamiteService extends m0 {

    /* renamed from: a  reason: collision with root package name */
    public i4 f3203a = null;

    /* renamed from: b  reason: collision with root package name */
    public final b f3204b = new b();

    @EnsuresNonNull({"scion"})
    public final void J() {
        if (this.f3203a == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    public final void K(String str, q0 q0Var) {
        J();
        g7 g7Var = this.f3203a.z;
        i4.l(g7Var);
        g7Var.I(str, q0Var);
    }

    public void beginAdUnitExposure(String str, long j8) {
        J();
        this.f3203a.g().h(str, j8);
    }

    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        J();
        i5 i5Var = this.f3203a.D;
        i4.m(i5Var);
        i5Var.o(str, str2, bundle);
    }

    public void clearMeasurementEnabled(long j8) {
        J();
        i5 i5Var = this.f3203a.D;
        i4.m(i5Var);
        i5Var.h();
        h4 h4Var = i5Var.f5649o.f5459x;
        i4.n(h4Var);
        h4Var.n(new o((Object) i5Var, (Object) null, 7));
    }

    public void endAdUnitExposure(String str, long j8) {
        J();
        this.f3203a.g().i(str, j8);
    }

    public void generateEventId(q0 q0Var) {
        J();
        g7 g7Var = this.f3203a.z;
        i4.l(g7Var);
        long W = g7Var.W();
        J();
        g7 g7Var2 = this.f3203a.z;
        i4.l(g7Var2);
        g7Var2.J(q0Var, W);
    }

    public void getAppInstanceId(q0 q0Var) {
        J();
        h4 h4Var = this.f3203a.f5459x;
        i4.n(h4Var);
        h4Var.n(new n(1, this, q0Var));
    }

    public void getCachedAppInstanceId(q0 q0Var) {
        J();
        i5 i5Var = this.f3203a.D;
        i4.m(i5Var);
        K(i5Var.u.get(), q0Var);
    }

    public void getConditionalUserProperties(String str, String str2, q0 q0Var) {
        J();
        h4 h4Var = this.f3203a.f5459x;
        i4.n(h4Var);
        h4Var.n(new b5(this, q0Var, str, str2));
    }

    public void getCurrentScreenClass(q0 q0Var) {
        String str;
        J();
        i5 i5Var = this.f3203a.D;
        i4.m(i5Var);
        u5 u5Var = i5Var.f5649o.C;
        i4.m(u5Var);
        p5 p5Var = u5Var.f5767q;
        if (p5Var != null) {
            str = p5Var.f5635b;
        } else {
            str = null;
        }
        K(str, q0Var);
    }

    public void getCurrentScreenName(q0 q0Var) {
        String str;
        J();
        i5 i5Var = this.f3203a.D;
        i4.m(i5Var);
        u5 u5Var = i5Var.f5649o.C;
        i4.m(u5Var);
        p5 p5Var = u5Var.f5767q;
        if (p5Var != null) {
            str = p5Var.f5634a;
        } else {
            str = null;
        }
        K(str, q0Var);
    }

    public void getGmpAppId(q0 q0Var) {
        J();
        i5 i5Var = this.f3203a.D;
        i4.m(i5Var);
        K(i5Var.p(), q0Var);
    }

    public void getMaxUserProperties(String str, q0 q0Var) {
        J();
        i5 i5Var = this.f3203a.D;
        i4.m(i5Var);
        m.e(str);
        i5Var.f5649o.getClass();
        J();
        g7 g7Var = this.f3203a.z;
        i4.l(g7Var);
        g7Var.K(q0Var, 25);
    }

    public void getTestFlag(q0 q0Var, int i10) {
        J();
        if (i10 == 0) {
            g7 g7Var = this.f3203a.z;
            i4.l(g7Var);
            i5 i5Var = this.f3203a.D;
            i4.m(i5Var);
            AtomicReference atomicReference = new AtomicReference();
            h4 h4Var = i5Var.f5649o.f5459x;
            i4.n(h4Var);
            g7Var.I((String) h4Var.o(atomicReference, 15000, "String test flag value", new c5(i5Var, atomicReference, 0)), q0Var);
        } else if (i10 == 1) {
            g7 g7Var2 = this.f3203a.z;
            i4.l(g7Var2);
            i5 i5Var2 = this.f3203a.D;
            i4.m(i5Var2);
            AtomicReference atomicReference2 = new AtomicReference();
            h4 h4Var2 = i5Var2.f5649o.f5459x;
            i4.n(h4Var2);
            g7Var2.J(q0Var, ((Long) h4Var2.o(atomicReference2, 15000, "long test flag value", new o((Object) i5Var2, (Object) atomicReference2, 6))).longValue());
        } else if (i10 == 2) {
            g7 g7Var3 = this.f3203a.z;
            i4.l(g7Var3);
            i5 i5Var3 = this.f3203a.D;
            i4.m(i5Var3);
            AtomicReference atomicReference3 = new AtomicReference();
            h4 h4Var3 = i5Var3.f5649o.f5459x;
            i4.n(h4Var3);
            double doubleValue = ((Double) h4Var3.o(atomicReference3, 15000, "double test flag value", new c5(i5Var3, atomicReference3, 1))).doubleValue();
            Bundle bundle = new Bundle();
            bundle.putDouble("r", doubleValue);
            try {
                q0Var.h(bundle);
            } catch (RemoteException e10) {
                g3 g3Var = g7Var3.f5649o.w;
                i4.n(g3Var);
                g3Var.w.b(e10, "Error returning double value to wrapper");
            }
        } else if (i10 == 3) {
            g7 g7Var4 = this.f3203a.z;
            i4.l(g7Var4);
            i5 i5Var4 = this.f3203a.D;
            i4.m(i5Var4);
            AtomicReference atomicReference4 = new AtomicReference();
            h4 h4Var4 = i5Var4.f5649o.f5459x;
            i4.n(h4Var4);
            g7Var4.K(q0Var, ((Integer) h4Var4.o(atomicReference4, 15000, "int test flag value", new a5(i5Var4, atomicReference4, 1))).intValue());
        } else if (i10 == 4) {
            g7 g7Var5 = this.f3203a.z;
            i4.l(g7Var5);
            i5 i5Var5 = this.f3203a.D;
            i4.m(i5Var5);
            AtomicReference atomicReference5 = new AtomicReference();
            h4 h4Var5 = i5Var5.f5649o.f5459x;
            i4.n(h4Var5);
            g7Var5.M(q0Var, ((Boolean) h4Var5.o(atomicReference5, 15000, "boolean test flag value", new a5(i5Var5, atomicReference5, 0))).booleanValue());
        }
    }

    public void getUserProperties(String str, String str2, boolean z, q0 q0Var) {
        J();
        h4 h4Var = this.f3203a.f5459x;
        i4.n(h4Var);
        h4Var.n(new i(this, q0Var, str, str2, z));
    }

    public void initForTests(Map map) {
        J();
    }

    public void initialize(a aVar, w0 w0Var, long j8) {
        i4 i4Var = this.f3203a;
        if (i4Var == null) {
            Context context = (Context) u4.b.K(aVar);
            m.h(context);
            this.f3203a = i4.h(context, w0Var, Long.valueOf(j8));
            return;
        }
        g3 g3Var = i4Var.w;
        i4.n(g3Var);
        g3Var.w.a("Attempting to initialize multiple times");
    }

    public void isDataCollectionEnabled(q0 q0Var) {
        J();
        h4 h4Var = this.f3203a.f5459x;
        i4.n(h4Var);
        h4Var.n(new o((Object) this, (Object) q0Var, 10));
    }

    public void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z10, long j8) {
        J();
        i5 i5Var = this.f3203a.D;
        i4.m(i5Var);
        i5Var.A(str, str2, bundle, z, z10, j8);
    }

    public void logEventAndBundle(String str, String str2, Bundle bundle, q0 q0Var, long j8) {
        Bundle bundle2;
        J();
        m.e(str2);
        if (bundle == null) {
            bundle2 = new Bundle();
        }
        bundle2.putString("_o", "app");
        p pVar = new p(str2, new h5.n(bundle), "app", j8);
        h4 h4Var = this.f3203a.f5459x;
        i4.n(h4Var);
        h4Var.n(new m5(this, q0Var, pVar, str));
    }

    public void logHealthData(int i10, String str, a aVar, a aVar2, a aVar3) {
        Object obj;
        Object obj2;
        J();
        Object obj3 = null;
        if (aVar == null) {
            obj = null;
        } else {
            obj = u4.b.K(aVar);
        }
        if (aVar2 == null) {
            obj2 = null;
        } else {
            obj2 = u4.b.K(aVar2);
        }
        if (aVar3 != null) {
            obj3 = u4.b.K(aVar3);
        }
        g3 g3Var = this.f3203a.w;
        i4.n(g3Var);
        g3Var.q(i10, true, false, str, obj, obj2, obj3);
    }

    public void onActivityCreated(a aVar, Bundle bundle, long j8) {
        J();
        i5 i5Var = this.f3203a.D;
        i4.m(i5Var);
        h5 h5Var = i5Var.f5461q;
        if (h5Var != null) {
            i5 i5Var2 = this.f3203a.D;
            i4.m(i5Var2);
            i5Var2.t();
            h5Var.onActivityCreated((Activity) u4.b.K(aVar), bundle);
        }
    }

    public void onActivityDestroyed(a aVar, long j8) {
        J();
        i5 i5Var = this.f3203a.D;
        i4.m(i5Var);
        h5 h5Var = i5Var.f5461q;
        if (h5Var != null) {
            i5 i5Var2 = this.f3203a.D;
            i4.m(i5Var2);
            i5Var2.t();
            h5Var.onActivityDestroyed((Activity) u4.b.K(aVar));
        }
    }

    public void onActivityPaused(a aVar, long j8) {
        J();
        i5 i5Var = this.f3203a.D;
        i4.m(i5Var);
        h5 h5Var = i5Var.f5461q;
        if (h5Var != null) {
            i5 i5Var2 = this.f3203a.D;
            i4.m(i5Var2);
            i5Var2.t();
            h5Var.onActivityPaused((Activity) u4.b.K(aVar));
        }
    }

    public void onActivityResumed(a aVar, long j8) {
        J();
        i5 i5Var = this.f3203a.D;
        i4.m(i5Var);
        h5 h5Var = i5Var.f5461q;
        if (h5Var != null) {
            i5 i5Var2 = this.f3203a.D;
            i4.m(i5Var2);
            i5Var2.t();
            h5Var.onActivityResumed((Activity) u4.b.K(aVar));
        }
    }

    public void onActivitySaveInstanceState(a aVar, q0 q0Var, long j8) {
        J();
        i5 i5Var = this.f3203a.D;
        i4.m(i5Var);
        h5 h5Var = i5Var.f5461q;
        Bundle bundle = new Bundle();
        if (h5Var != null) {
            i5 i5Var2 = this.f3203a.D;
            i4.m(i5Var2);
            i5Var2.t();
            h5Var.onActivitySaveInstanceState((Activity) u4.b.K(aVar), bundle);
        }
        try {
            q0Var.h(bundle);
        } catch (RemoteException e10) {
            g3 g3Var = this.f3203a.w;
            i4.n(g3Var);
            g3Var.w.b(e10, "Error returning bundle value to wrapper");
        }
    }

    public void onActivityStarted(a aVar, long j8) {
        J();
        i5 i5Var = this.f3203a.D;
        i4.m(i5Var);
        if (i5Var.f5461q != null) {
            i5 i5Var2 = this.f3203a.D;
            i4.m(i5Var2);
            i5Var2.t();
            Activity activity = (Activity) u4.b.K(aVar);
        }
    }

    public void onActivityStopped(a aVar, long j8) {
        J();
        i5 i5Var = this.f3203a.D;
        i4.m(i5Var);
        if (i5Var.f5461q != null) {
            i5 i5Var2 = this.f3203a.D;
            i4.m(i5Var2);
            i5Var2.t();
            Activity activity = (Activity) u4.b.K(aVar);
        }
    }

    public void performAction(Bundle bundle, q0 q0Var, long j8) {
        J();
        q0Var.h((Bundle) null);
    }

    public void registerOnMeasurementEventListener(t0 t0Var) {
        Object obj;
        J();
        synchronized (this.f3204b) {
            obj = (t4) this.f3204b.getOrDefault(Integer.valueOf(t0Var.c()), null);
            if (obj == null) {
                obj = new h7(this, t0Var);
                this.f3204b.put(Integer.valueOf(t0Var.c()), obj);
            }
        }
        i5 i5Var = this.f3203a.D;
        i4.m(i5Var);
        i5Var.h();
        if (!i5Var.f5463s.add(obj)) {
            g3 g3Var = i5Var.f5649o.w;
            i4.n(g3Var);
            g3Var.w.a("OnEventListener already registered");
        }
    }

    public void resetAnalyticsData(long j8) {
        J();
        i5 i5Var = this.f3203a.D;
        i4.m(i5Var);
        i5Var.u.set((Object) null);
        h4 h4Var = i5Var.f5649o.f5459x;
        i4.n(h4Var);
        h4Var.n(new y4(i5Var, j8, 1));
    }

    public void setConditionalUserProperty(Bundle bundle, long j8) {
        J();
        if (bundle == null) {
            g3 g3Var = this.f3203a.w;
            i4.n(g3Var);
            g3Var.f5397t.a("Conditional user property must not be null");
            return;
        }
        i5 i5Var = this.f3203a.D;
        i4.m(i5Var);
        i5Var.n(bundle, j8);
    }

    public void setConsent(Bundle bundle, long j8) {
        J();
        i5 i5Var = this.f3203a.D;
        i4.m(i5Var);
        y9.f3013p.f3014o.zza().zza();
        i4 i4Var = i5Var.f5649o;
        if (!i4Var.u.m((String) null, u2.y0) || TextUtils.isEmpty(i4Var.b().m())) {
            i5Var.u(bundle, 0, j8);
            return;
        }
        g3 g3Var = i4Var.w;
        i4.n(g3Var);
        g3Var.f5400y.a("Using developer consent only; google app id found");
    }

    public void setConsentThirdParty(Bundle bundle, long j8) {
        J();
        i5 i5Var = this.f3203a.D;
        i4.m(i5Var);
        i5Var.u(bundle, -20, j8);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0088, code lost:
        if (r0 <= 100) goto L_0x009f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00b0, code lost:
        if (r0 <= 100) goto L_0x00ca;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setCurrentScreen(u4.a r3, java.lang.String r4, java.lang.String r5, long r6) {
        /*
            r2 = this;
            r2.J()
            h5.i4 r6 = r2.f3203a
            h5.u5 r6 = r6.C
            h5.i4.m(r6)
            java.lang.Object r3 = u4.b.K(r3)
            android.app.Activity r3 = (android.app.Activity) r3
            h5.i4 r7 = r6.f5649o
            h5.e r7 = r7.u
            boolean r7 = r7.q()
            if (r7 != 0) goto L_0x0026
            h5.i4 r3 = r6.f5649o
            h5.g3 r3 = r3.w
            h5.i4.n(r3)
            h5.e3 r3 = r3.f5400y
            java.lang.String r4 = "setCurrentScreen cannot be called while screen reporting is disabled."
            goto L_0x0070
        L_0x0026:
            h5.p5 r7 = r6.f5767q
            if (r7 != 0) goto L_0x0036
            h5.i4 r3 = r6.f5649o
            h5.g3 r3 = r3.w
            h5.i4.n(r3)
            h5.e3 r3 = r3.f5400y
            java.lang.String r4 = "setCurrentScreen cannot be called while no activity active"
            goto L_0x0070
        L_0x0036:
            java.util.concurrent.ConcurrentHashMap r0 = r6.f5770t
            java.lang.Object r0 = r0.get(r3)
            if (r0 != 0) goto L_0x004a
            h5.i4 r3 = r6.f5649o
            h5.g3 r3 = r3.w
            h5.i4.n(r3)
            h5.e3 r3 = r3.f5400y
            java.lang.String r4 = "setCurrentScreen must be called with an activity in the activity lifecycle"
            goto L_0x0070
        L_0x004a:
            if (r5 != 0) goto L_0x0054
            java.lang.Class r5 = r3.getClass()
            java.lang.String r5 = r6.p(r5)
        L_0x0054:
            java.lang.String r0 = r7.f5635b
            boolean r0 = h5.g7.B(r0, r5)
            java.lang.String r7 = r7.f5634a
            boolean r7 = h5.g7.B(r7, r4)
            if (r0 == 0) goto L_0x0075
            if (r7 != 0) goto L_0x0065
            goto L_0x0075
        L_0x0065:
            h5.i4 r3 = r6.f5649o
            h5.g3 r3 = r3.w
            h5.i4.n(r3)
            h5.e3 r3 = r3.f5400y
            java.lang.String r4 = "setCurrentScreen cannot be called with the same class and name"
        L_0x0070:
            r3.a(r4)
            goto L_0x00f7
        L_0x0075:
            r7 = 100
            if (r4 == 0) goto L_0x009f
            int r0 = r4.length()
            if (r0 <= 0) goto L_0x008b
            int r0 = r4.length()
            h5.i4 r1 = r6.f5649o
            r1.getClass()
            if (r0 > r7) goto L_0x008b
            goto L_0x009f
        L_0x008b:
            h5.i4 r3 = r6.f5649o
            h5.g3 r3 = r3.w
            h5.i4.n(r3)
            h5.e3 r3 = r3.f5400y
            int r4 = r4.length()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.String r5 = "Invalid screen name length in setCurrentScreen. Length"
            goto L_0x00c6
        L_0x009f:
            if (r5 == 0) goto L_0x00ca
            int r0 = r5.length()
            if (r0 <= 0) goto L_0x00b3
            int r0 = r5.length()
            h5.i4 r1 = r6.f5649o
            r1.getClass()
            if (r0 > r7) goto L_0x00b3
            goto L_0x00ca
        L_0x00b3:
            h5.i4 r3 = r6.f5649o
            h5.g3 r3 = r3.w
            h5.i4.n(r3)
            h5.e3 r3 = r3.f5400y
            int r4 = r5.length()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.String r5 = "Invalid class name length in setCurrentScreen. Length"
        L_0x00c6:
            r3.b(r4, r5)
            goto L_0x00f7
        L_0x00ca:
            h5.i4 r7 = r6.f5649o
            h5.g3 r7 = r7.w
            h5.i4.n(r7)
            h5.e3 r7 = r7.B
            if (r4 != 0) goto L_0x00d8
            java.lang.String r0 = "null"
            goto L_0x00d9
        L_0x00d8:
            r0 = r4
        L_0x00d9:
            java.lang.String r1 = "Setting current screen to name, class"
            r7.c(r0, r5, r1)
            h5.p5 r7 = new h5.p5
            h5.i4 r0 = r6.f5649o
            h5.g7 r0 = r0.z
            h5.i4.l(r0)
            long r0 = r0.W()
            r7.<init>(r0, r4, r5)
            java.util.concurrent.ConcurrentHashMap r4 = r6.f5770t
            r4.put(r3, r7)
            r4 = 1
            r6.k(r3, r7, r4)
        L_0x00f7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.AppMeasurementDynamiteService.setCurrentScreen(u4.a, java.lang.String, java.lang.String, long):void");
    }

    public void setDataCollectionEnabled(boolean z) {
        J();
        i5 i5Var = this.f3203a.D;
        i4.m(i5Var);
        i5Var.h();
        h4 h4Var = i5Var.f5649o.f5459x;
        i4.n(h4Var);
        h4Var.n(new x4(i5Var, z));
    }

    public void setDefaultEventParameters(Bundle bundle) {
        Bundle bundle2;
        J();
        i5 i5Var = this.f3203a.D;
        i4.m(i5Var);
        if (bundle == null) {
            bundle2 = null;
        } else {
            bundle2 = new Bundle(bundle);
        }
        h4 h4Var = i5Var.f5649o.f5459x;
        i4.n(h4Var);
        h4Var.n(new v4(i5Var, bundle2, 0));
    }

    public void setEventInterceptor(t0 t0Var) {
        boolean z;
        J();
        androidx.appcompat.widget.m mVar = new androidx.appcompat.widget.m(this, t0Var);
        h4 h4Var = this.f3203a.f5459x;
        i4.n(h4Var);
        if (h4Var.l()) {
            i5 i5Var = this.f3203a.D;
            i4.m(i5Var);
            i5Var.g();
            i5Var.h();
            androidx.appcompat.widget.m mVar2 = i5Var.f5462r;
            if (mVar != mVar2) {
                if (mVar2 == null) {
                    z = true;
                } else {
                    z = false;
                }
                m.j("EventInterceptor already set.", z);
            }
            i5Var.f5462r = mVar;
            return;
        }
        h4 h4Var2 = this.f3203a.f5459x;
        i4.n(h4Var2);
        h4Var2.n(new w(5, this, mVar));
    }

    public void setInstanceIdProvider(v0 v0Var) {
        J();
    }

    public void setMeasurementEnabled(boolean z, long j8) {
        J();
        i5 i5Var = this.f3203a.D;
        i4.m(i5Var);
        Boolean valueOf = Boolean.valueOf(z);
        i5Var.h();
        h4 h4Var = i5Var.f5649o.f5459x;
        i4.n(h4Var);
        h4Var.n(new o((Object) i5Var, (Object) valueOf, 7));
    }

    public void setMinimumSessionDuration(long j8) {
        J();
    }

    public void setSessionTimeoutDuration(long j8) {
        J();
        i5 i5Var = this.f3203a.D;
        i4.m(i5Var);
        h4 h4Var = i5Var.f5649o.f5459x;
        i4.n(h4Var);
        h4Var.n(new y4(i5Var, j8, 0));
    }

    public void setUserId(String str, long j8) {
        J();
        if (!this.f3203a.u.m((String) null, u2.f5747w0) || str == null || str.length() != 0) {
            i5 i5Var = this.f3203a.D;
            i4.m(i5Var);
            i5Var.C((String) null, "_id", str, true, j8);
            return;
        }
        g3 g3Var = this.f3203a.w;
        i4.n(g3Var);
        g3Var.w.a("User ID must be non-empty");
    }

    public void setUserProperty(String str, String str2, a aVar, boolean z, long j8) {
        J();
        Object K = u4.b.K(aVar);
        i5 i5Var = this.f3203a.D;
        i4.m(i5Var);
        i5Var.C(str, str2, K, z, j8);
    }

    public void unregisterOnMeasurementEventListener(t0 t0Var) {
        Object obj;
        J();
        synchronized (this.f3204b) {
            obj = (t4) this.f3204b.remove(Integer.valueOf(t0Var.c()));
        }
        if (obj == null) {
            obj = new h7(this, t0Var);
        }
        i5 i5Var = this.f3203a.D;
        i4.m(i5Var);
        i5Var.h();
        if (!i5Var.f5463s.remove(obj)) {
            g3 g3Var = i5Var.f5649o.w;
            i4.n(g3Var);
            g3Var.w.a("OnEventListener had not been registered");
        }
    }
}
