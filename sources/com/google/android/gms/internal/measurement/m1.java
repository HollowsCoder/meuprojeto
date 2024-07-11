package com.google.android.gms.internal.measurement;

import n4.m;
import u4.b;

public final class m1 extends n1 {

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ String f2818s = "fcm";

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ String f2819t = "_ln";
    public final /* synthetic */ Object u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ boolean f2820v;
    public final /* synthetic */ u1 w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m1(u1 u1Var, String str) {
        super(u1Var, true);
        this.w = u1Var;
        this.u = str;
        this.f2820v = true;
    }

    public final void a() {
        n0 n0Var = this.w.f2949f;
        m.h(n0Var);
        n0Var.setUserProperty(this.f2818s, this.f2819t, new b(this.u), this.f2820v, this.f2839o);
    }
}
