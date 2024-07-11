package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

public final class e7 {
    public static final void a(Object obj, Object obj2) {
        d7 d7Var = (d7) obj;
        c7 c7Var = (c7) obj2;
        if (!d7Var.isEmpty()) {
            Iterator it = d7Var.entrySet().iterator();
            if (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                entry.getKey();
                entry.getValue();
                throw null;
            }
        }
    }

    public static final d7 b(Object obj, Object obj2) {
        d7 d7Var = (d7) obj;
        d7 d7Var2 = (d7) obj2;
        if (!d7Var2.isEmpty()) {
            if (!d7Var.f2673o) {
                d7Var = d7Var.d();
            }
            d7Var.i();
            if (!d7Var2.isEmpty()) {
                d7Var.putAll(d7Var2);
            }
        }
        return d7Var;
    }
}
