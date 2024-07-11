package com.google.android.gms.internal.clearcut;

import java.util.Iterator;
import java.util.Map;

public final class n1 implements m1 {
    public final l1 c(Object obj, Object obj2) {
        l1 l1Var = (l1) obj;
        l1 l1Var2 = (l1) obj2;
        if (!l1Var2.isEmpty()) {
            if (!l1Var.f2496o) {
                if (l1Var.isEmpty()) {
                    l1Var = new l1();
                } else {
                    l1Var = new l1(l1Var);
                }
            }
            l1Var.c();
            if (!l1Var2.isEmpty()) {
                l1Var.putAll(l1Var2);
            }
        }
        return l1Var;
    }

    public final l1 d() {
        l1 l1Var = l1.f2495p;
        if (l1Var.isEmpty()) {
            return new l1();
        }
        return new l1(l1Var);
    }

    public final void e(Object obj) {
        l1 l1Var = (l1) obj;
        if (!l1Var.isEmpty()) {
            Iterator it = l1Var.entrySet().iterator();
            if (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                entry.getKey();
                entry.getValue();
                throw new NoSuchMethodError();
            }
        }
    }

    public final Object f(Object obj) {
        ((l1) obj).f2496o = false;
        return obj;
    }

    public final void k() {
        throw new NoSuchMethodError();
    }

    public final boolean l(Object obj) {
        if (!((l1) obj).f2496o) {
            return true;
        }
        return false;
    }

    public final l1 m(Object obj) {
        return (l1) obj;
    }

    public final l1 n(Object obj) {
        return (l1) obj;
    }
}
