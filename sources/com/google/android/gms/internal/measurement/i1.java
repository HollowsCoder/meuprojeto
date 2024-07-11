package com.google.android.gms.internal.measurement;

import n4.m;
import u4.b;

public final class i1 extends n1 {

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ String f2740s = "Error with data collection. Data lost.";

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ Object f2741t;
    public final /* synthetic */ u1 u;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i1(u1 u1Var, Object obj) {
        super(u1Var, false);
        this.u = u1Var;
        this.f2741t = obj;
    }

    public final void a() {
        n0 n0Var = this.u.f2949f;
        m.h(n0Var);
        n0Var.logHealthData(5, this.f2740s, new b(this.f2741t), new b(null), new b(null));
    }
}
