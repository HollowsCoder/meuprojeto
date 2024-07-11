package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import n4.m;

public final class z0 extends n1 {

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ String f3016s;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ String f3017t;
    public final /* synthetic */ Bundle u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ u1 f3018v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public z0(u1 u1Var, String str, String str2, Bundle bundle) {
        super(u1Var, true);
        this.f3018v = u1Var;
        this.f3016s = str;
        this.f3017t = str2;
        this.u = bundle;
    }

    public final void a() {
        n0 n0Var = this.f3018v.f2949f;
        m.h(n0Var);
        n0Var.clearConditionalUserProperty(this.f3016s, this.f3017t, this.u);
    }
}
