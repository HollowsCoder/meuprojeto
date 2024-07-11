package com.google.android.gms.internal.clearcut;

import java.util.Map;

public final class z0<K> implements Map.Entry<K, Object> {

    /* renamed from: o  reason: collision with root package name */
    public final Map.Entry<K, y0> f2602o;

    public z0() {
        throw null;
    }

    public z0(Map.Entry entry) {
        this.f2602o = entry;
    }

    public final K getKey() {
        return this.f2602o.getKey();
    }

    public final Object getValue() {
        if (this.f2602o.getValue() == null) {
            return null;
        }
        int i10 = y0.f2595c;
        throw new NoSuchMethodError();
    }

    public final Object setValue(Object obj) {
        if (obj instanceof r1) {
            y0 value = this.f2602o.getValue();
            r1 r1Var = value.f2389a;
            value.f2390b = null;
            value.f2389a = (r1) obj;
            return r1Var;
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}
