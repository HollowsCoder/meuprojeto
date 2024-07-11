package com.google.android.gms.internal.measurement;

import android.app.Activity;
import n4.m;
import u4.b;

public final class b1 extends n1 {

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ Activity f2624s;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ String f2625t;
    public final /* synthetic */ String u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ u1 f2626v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b1(u1 u1Var, Activity activity, String str, String str2) {
        super(u1Var, true);
        this.f2626v = u1Var;
        this.f2624s = activity;
        this.f2625t = str;
        this.u = str2;
    }

    public final void a() {
        n0 n0Var = this.f2626v.f2949f;
        m.h(n0Var);
        n0Var.setCurrentScreen(new b(this.f2624s), this.f2625t, this.u, this.f2839o);
    }
}
