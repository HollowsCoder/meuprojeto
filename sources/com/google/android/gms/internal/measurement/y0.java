package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import n4.m;

public final class y0 extends n1 {

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ int f2996s;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ u1 f2997t;
    public final /* synthetic */ Object u;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y0(u1 u1Var, Object obj, int i10) {
        super(u1Var, true);
        this.f2996s = i10;
        this.f2997t = u1Var;
        this.u = obj;
    }

    public final void a() {
        switch (this.f2996s) {
            case 0:
                n0 n0Var = this.f2997t.f2949f;
                m.h(n0Var);
                n0Var.setConditionalUserProperty((Bundle) this.u, this.f2839o);
                return;
            case 1:
                n0 n0Var2 = this.f2997t.f2949f;
                m.h(n0Var2);
                n0Var2.endAdUnitExposure((String) this.u, this.f2840p);
                return;
            default:
                n0 n0Var3 = this.f2997t.f2949f;
                m.h(n0Var3);
                n0Var3.generateEventId((j0) this.u);
                return;
        }
    }

    public final void b() {
        switch (this.f2996s) {
            case 2:
                ((j0) this.u).h((Bundle) null);
                return;
            default:
                return;
        }
    }
}
