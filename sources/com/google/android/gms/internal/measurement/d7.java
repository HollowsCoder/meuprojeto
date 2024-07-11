package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public final class d7<K, V> extends LinkedHashMap<K, V> {

    /* renamed from: p  reason: collision with root package name */
    public static final d7 f2672p;

    /* renamed from: o  reason: collision with root package name */
    public boolean f2673o = true;

    static {
        d7 d7Var = new d7();
        f2672p = d7Var;
        d7Var.f2673o = false;
    }

    public d7() {
    }

    public d7(Map<K, V> map) {
        super(map);
    }

    public static <K, V> d7<K, V> c() {
        return f2672p;
    }

    public static int h(Object obj) {
        if (obj instanceof byte[]) {
            Charset charset = n6.f2844a;
            int i10 = r0;
            for (byte b10 : (byte[]) obj) {
                i10 = (i10 * 31) + b10;
            }
            if (i10 == 0) {
                return 1;
            }
            return i10;
        } else if (!(obj instanceof h6)) {
            return obj.hashCode();
        } else {
            throw new UnsupportedOperationException();
        }
    }

    public final void clear() {
        i();
        super.clear();
    }

    public final d7<K, V> d() {
        return isEmpty() ? new d7<>() : new d7<>(this);
    }

    public final boolean e() {
        return this.f2673o;
    }

    public final Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this == map) {
            return true;
        }
        if (size() != map.size()) {
            return false;
        }
        for (Map.Entry entry : entrySet()) {
            if (!map.containsKey(entry.getKey())) {
                return false;
            }
            Object value = entry.getValue();
            Object obj2 = map.get(entry.getKey());
            if (!(value instanceof byte[]) || !(obj2 instanceof byte[])) {
                z = value.equals(obj2);
                continue;
            } else {
                z = Arrays.equals((byte[]) value, (byte[]) obj2);
                continue;
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i10 = 0;
        for (Map.Entry entry : entrySet()) {
            i10 += h(entry.getValue()) ^ h(entry.getKey());
        }
        return i10;
    }

    public final void i() {
        if (!this.f2673o) {
            throw new UnsupportedOperationException();
        }
    }

    public final V put(K k10, V v10) {
        i();
        Charset charset = n6.f2844a;
        k10.getClass();
        v10.getClass();
        return super.put(k10, v10);
    }

    public final void putAll(Map<? extends K, ? extends V> map) {
        i();
        for (Object next : map.keySet()) {
            Charset charset = n6.f2844a;
            next.getClass();
            map.get(next).getClass();
        }
        super.putAll(map);
    }

    public final V remove(Object obj) {
        i();
        return super.remove(obj);
    }
}
