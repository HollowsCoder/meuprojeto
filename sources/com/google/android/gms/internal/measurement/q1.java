package com.google.android.gms.internal.measurement;

import android.app.Activity;
import n4.m;
import u4.b;

public final class q1 extends n1 {

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ int f2888s;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ Activity f2889t;
    public final /* synthetic */ t1 u;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q1(t1 t1Var, Activity activity, int i10) {
        super(t1Var.f2933o, true);
        this.f2888s = i10;
        if (i10 != 1) {
            this.u = t1Var;
            this.f2889t = activity;
            return;
        }
        this.u = t1Var;
        this.f2889t = activity;
        super(t1Var.f2933o, true);
    }

    public final void a() {
        switch (this.f2888s) {
            case 0:
                n0 n0Var = this.u.f2933o.f2949f;
                m.h(n0Var);
                n0Var.onActivityPaused(new b(this.f2889t), this.f2840p);
                return;
            default:
                n0 n0Var2 = this.u.f2933o.f2949f;
                m.h(n0Var2);
                n0Var2.onActivityDestroyed(new b(this.f2889t), this.f2840p);
                return;
        }
    }
}
