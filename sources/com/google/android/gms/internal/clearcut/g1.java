package com.google.android.gms.internal.clearcut;

public final class g1 extends e1 {
    public final void a(long j8, Object obj) {
        ((u0) a3.w(j8, obj)).o();
    }

    public final void b(long j8, Object obj, Object obj2) {
        u0 u0Var = (u0) a3.w(j8, obj);
        u0 u0Var2 = (u0) a3.w(j8, obj2);
        int size = u0Var.size();
        int size2 = u0Var2.size();
        if (size > 0 && size2 > 0) {
            if (!u0Var.l()) {
                u0Var = u0Var.r(size2 + size);
            }
            u0Var.addAll(u0Var2);
        }
        if (size > 0) {
            u0Var2 = u0Var;
        }
        a3.j(j8, obj, u0Var2);
    }
}
