package com.google.android.gms.internal.vision;

import java.util.Map;

public final class f2<K> implements Map.Entry<K, Object> {

    /* renamed from: o  reason: collision with root package name */
    public final Map.Entry<K, d2> f3087o;

    public f2() {
        throw null;
    }

    public f2(Map.Entry entry) {
        this.f3087o = entry;
    }

    public final K getKey() {
        return this.f3087o.getKey();
    }

    public final Object getValue() {
        if (this.f3087o.getValue() == null) {
            return null;
        }
        int i10 = d2.f3082c;
        throw new NoSuchMethodError();
    }

    public final Object setValue(Object obj) {
        if (obj instanceof w2) {
            d2 value = this.f3087o.getValue();
            w2 w2Var = value.f3095a;
            value.f3096b = null;
            value.f3095a = (w2) obj;
            return w2Var;
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}
