package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import n4.m;

public final class l1 extends n1 {

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ Long f2776s = null;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ String f2777t;
    public final /* synthetic */ String u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Bundle f2778v;
    public final /* synthetic */ boolean w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ boolean f2779x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ u1 f2780y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l1(u1 u1Var, String str, String str2, Bundle bundle) {
        super(u1Var, true);
        this.f2780y = u1Var;
        this.f2777t = str;
        this.u = str2;
        this.f2778v = bundle;
        this.w = true;
        this.f2779x = true;
    }

    public final void a() {
        long j8;
        Long l = this.f2776s;
        if (l == null) {
            j8 = this.f2839o;
        } else {
            j8 = l.longValue();
        }
        n0 n0Var = this.f2780y.f2949f;
        m.h(n0Var);
        n0Var.logEvent(this.f2777t, this.u, this.f2778v, this.w, this.f2779x, j8);
    }
}
