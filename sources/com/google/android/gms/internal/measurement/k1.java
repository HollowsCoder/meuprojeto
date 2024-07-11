package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.Bundle;
import n4.m;
import u4.b;

public final class k1 extends n1 {

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ int f2766s = 1;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ Object f2767t;
    public final /* synthetic */ Object u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Object f2768v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k1(t1 t1Var, Bundle bundle, Activity activity) {
        super(t1Var.f2933o, true);
        this.f2768v = t1Var;
        this.f2767t = bundle;
        this.u = activity;
    }

    public final void a() {
        Bundle bundle;
        switch (this.f2766s) {
            case 0:
                n0 n0Var = ((u1) this.f2768v).f2949f;
                m.h(n0Var);
                n0Var.getMaxUserProperties((String) this.f2767t, (j0) this.u);
                return;
            default:
                if (((Bundle) this.f2767t) != null) {
                    bundle = new Bundle();
                    if (((Bundle) this.f2767t).containsKey("com.google.app_measurement.screen_service")) {
                        Object obj = ((Bundle) this.f2767t).get("com.google.app_measurement.screen_service");
                        if (obj instanceof Bundle) {
                            bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                        }
                    }
                } else {
                    bundle = null;
                }
                n0 n0Var2 = ((t1) this.f2768v).f2933o.f2949f;
                m.h(n0Var2);
                n0Var2.onActivityCreated(new b((Activity) this.u), bundle, this.f2840p);
                return;
        }
    }

    public final void b() {
        switch (this.f2766s) {
            case 0:
                ((j0) this.u).h((Bundle) null);
                return;
            default:
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k1(u1 u1Var, String str, j0 j0Var) {
        super(u1Var, true);
        this.f2768v = u1Var;
        this.f2767t = str;
        this.u = j0Var;
    }
}
