package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.p0;
import java.util.Map;

public final class d0 extends c0<p0.d> {
    public final g0<p0.d> a(Object obj) {
        return ((p0.c) obj).zzjv;
    }

    public final void b(Map.Entry entry) {
        ((p0.d) entry.getKey()).getClass();
    }

    public final void c(Map.Entry entry) {
        int[] iArr = e0.f2410a;
        ((p0.d) entry.getKey()).getClass();
        throw null;
    }

    public final g0<p0.d> d(Object obj) {
        p0.c cVar = (p0.c) obj;
        g0<p0.d> g0Var = cVar.zzjv;
        if (!g0Var.f2422b) {
            return g0Var;
        }
        g0<p0.d> g0Var2 = (g0) g0Var.clone();
        cVar.zzjv = g0Var2;
        return g0Var2;
    }

    public final void e(Object obj) {
        g0<p0.d> g0Var = ((p0.c) obj).zzjv;
        if (!g0Var.f2422b) {
            g0Var.f2421a.i();
            g0Var.f2422b = true;
        }
    }

    public final boolean f(r1 r1Var) {
        return r1Var instanceof p0.c;
    }
}
