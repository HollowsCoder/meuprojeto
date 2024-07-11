package com.google.android.gms.internal.vision;

import java.util.Iterator;
import java.util.Map;

public final class s2 implements t2 {
    public final r2 a(Object obj) {
        return (r2) obj;
    }

    public final r2 b(Object obj, Object obj2) {
        r2 r2Var = (r2) obj;
        r2 r2Var2 = (r2) obj2;
        if (!r2Var2.isEmpty()) {
            if (!r2Var.f3157o) {
                r2Var = r2Var.isEmpty() ? new r2() : new r2(r2Var);
            }
            r2Var.d();
            if (!r2Var2.isEmpty()) {
                r2Var.putAll(r2Var2);
            }
        }
        return r2Var;
    }

    /* renamed from: b  reason: collision with other method in class */
    public final void m12b(Object obj, Object obj2) {
        r2 r2Var = (r2) obj;
        p2 p2Var = (p2) obj2;
        if (!r2Var.isEmpty()) {
            Iterator it = r2Var.entrySet().iterator();
            if (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                entry.getKey();
                entry.getValue();
                throw new NoSuchMethodError();
            }
        }
    }

    public final r2 d(Object obj) {
        return (r2) obj;
    }

    public final void e(Object obj) {
        p2 p2Var = (p2) obj;
        throw new NoSuchMethodError();
    }

    public final boolean f(Object obj) {
        if (!((r2) obj).f3157o) {
            return true;
        }
        return false;
    }

    public final Object g(Object obj) {
        ((r2) obj).f3157o = false;
        return obj;
    }

    public final r2 i() {
        r2 r2Var = r2.f3156p;
        if (r2Var.isEmpty()) {
            return new r2();
        }
        return new r2(r2Var);
    }
}
