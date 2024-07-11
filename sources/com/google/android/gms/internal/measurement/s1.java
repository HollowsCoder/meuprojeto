package com.google.android.gms.internal.measurement;

import android.app.Activity;
import n4.m;
import u4.b;

public final class s1 extends n1 {

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ Activity f2917s;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ j0 f2918t;
    public final /* synthetic */ t1 u;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public s1(t1 t1Var, Activity activity, j0 j0Var) {
        super(t1Var.f2933o, true);
        this.u = t1Var;
        this.f2917s = activity;
        this.f2918t = j0Var;
    }

    public final void a() {
        n0 n0Var = this.u.f2933o.f2949f;
        m.h(n0Var);
        n0Var.onActivitySaveInstanceState(new b(this.f2917s), this.f2918t, this.f2840p);
    }
}
