package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import n4.m;

public final class h1 extends n1 {

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ String f2729s;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ String f2730t;
    public final /* synthetic */ boolean u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ j0 f2731v;
    public final /* synthetic */ u1 w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h1(u1 u1Var, String str, String str2, boolean z, j0 j0Var) {
        super(u1Var, true);
        this.w = u1Var;
        this.f2729s = str;
        this.f2730t = str2;
        this.u = z;
        this.f2731v = j0Var;
    }

    public final void a() {
        n0 n0Var = this.w.f2949f;
        m.h(n0Var);
        n0Var.getUserProperties(this.f2729s, this.f2730t, this.u, this.f2731v);
    }

    public final void b() {
        this.f2731v.h((Bundle) null);
    }
}
