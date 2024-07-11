package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import n4.m;

public final class g1 extends n1 {

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ int f2712s;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ j0 f2713t;
    public final /* synthetic */ u1 u;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g1(u1 u1Var, j0 j0Var, int i10) {
        super(u1Var, true);
        this.f2712s = i10;
        this.u = u1Var;
        this.f2713t = j0Var;
    }

    public final void a() {
        switch (this.f2712s) {
            case 0:
                n0 n0Var = this.u.f2949f;
                m.h(n0Var);
                n0Var.getCachedAppInstanceId(this.f2713t);
                return;
            default:
                n0 n0Var2 = this.u.f2949f;
                m.h(n0Var2);
                n0Var2.getCurrentScreenClass(this.f2713t);
                return;
        }
    }

    public final void b() {
        int i10 = this.f2712s;
        j0 j0Var = this.f2713t;
        switch (i10) {
            case 0:
                j0Var.h((Bundle) null);
                return;
            default:
                j0Var.h((Bundle) null);
                return;
        }
    }
}
