package com.google.android.gms.internal.measurement;

import android.app.Activity;
import n4.m;
import u4.b;

public final class d1 extends n1 {

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ int f2666s;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ Object f2667t;
    public final /* synthetic */ Object u;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d1(t1 t1Var, Activity activity) {
        super(t1Var.f2933o, true);
        this.f2666s = 2;
        this.f2667t = t1Var;
        this.u = activity;
    }

    public final void a() {
        switch (this.f2666s) {
            case 0:
                n0 n0Var = ((u1) this.f2667t).f2949f;
                m.h(n0Var);
                n0Var.beginAdUnitExposure((String) this.u, this.f2840p);
                return;
            case 1:
                n0 n0Var2 = ((u1) this.f2667t).f2949f;
                m.h(n0Var2);
                n0Var2.registerOnMeasurementEventListener((o1) this.u);
                return;
            default:
                n0 n0Var3 = ((t1) this.f2667t).f2933o.f2949f;
                m.h(n0Var3);
                n0Var3.onActivityResumed(new b((Activity) this.u), this.f2840p);
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d1(u1 u1Var, Object obj, int i10) {
        super(u1Var, true);
        this.f2666s = i10;
        this.f2667t = u1Var;
        this.u = obj;
    }
}
