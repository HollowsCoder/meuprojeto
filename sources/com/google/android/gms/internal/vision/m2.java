package com.google.android.gms.internal.vision;

public final class m2 extends i2 {
    public final void a(long j8, Object obj, Object obj2) {
        a2 a2Var = (a2) b4.u(j8, obj);
        a2 a2Var2 = (a2) b4.u(j8, obj2);
        int size = a2Var.size();
        int size2 = a2Var2.size();
        if (size > 0 && size2 > 0) {
            if (!a2Var.zza()) {
                a2Var = a2Var.d(size2 + size);
            }
            a2Var.addAll(a2Var2);
        }
        if (size > 0) {
            a2Var2 = a2Var;
        }
        b4.j(j8, obj, a2Var2);
    }

    public final void b(long j8, Object obj) {
        ((a2) b4.u(j8, obj)).a();
    }
}
