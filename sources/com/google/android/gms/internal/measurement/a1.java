package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import n4.m;

public final class a1 extends n1 {

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ String f2609s;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ String f2610t;
    public final /* synthetic */ j0 u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ u1 f2611v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a1(u1 u1Var, String str, String str2, j0 j0Var) {
        super(u1Var, true);
        this.f2611v = u1Var;
        this.f2609s = str;
        this.f2610t = str2;
        this.u = j0Var;
    }

    public final void a() {
        n0 n0Var = this.f2611v.f2949f;
        m.h(n0Var);
        n0Var.getConditionalUserProperties(this.f2609s, this.f2610t, this.u);
    }

    public final void b() {
        this.u.h((Bundle) null);
    }
}
