package com.google.android.gms.internal.measurement;

public final class v6 extends w6 {
    public final void a(long j8, Object obj) {
        ((m6) o8.p(j8, obj)).a();
    }

    public final void b(long j8, Object obj, Object obj2) {
        m6 m6Var = (m6) o8.p(j8, obj);
        m6 m6Var2 = (m6) o8.p(j8, obj2);
        int size = m6Var.size();
        int size2 = m6Var2.size();
        if (size > 0 && size2 > 0) {
            if (!m6Var.zza()) {
                m6Var = m6Var.x(size2 + size);
            }
            m6Var.addAll(m6Var2);
        }
        if (size > 0) {
            m6Var2 = m6Var;
        }
        o8.q(j8, obj, m6Var2);
    }
}
