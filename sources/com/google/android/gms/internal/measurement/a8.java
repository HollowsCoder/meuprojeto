package com.google.android.gms.internal.measurement;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

public final class a8 extends AbstractSet<Map.Entry> {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ b8 f2615o;

    public /* synthetic */ a8(b8 b8Var) {
        this.f2615o = b8Var;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (contains(entry)) {
            return false;
        }
        Object value = entry.getValue();
        this.f2615o.put((Comparable) entry.getKey(), value);
        return true;
    }

    public final void clear() {
        this.f2615o.clear();
    }

    public final boolean contains(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.f2615o.get(entry.getKey());
        Object value = entry.getValue();
        if (obj2 == value) {
            return true;
        }
        if (obj2 != null) {
            return obj2.equals(value);
        }
        return false;
    }

    public final Iterator<Map.Entry> iterator() {
        return new z7(this.f2615o);
    }

    public final boolean remove(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (!contains(entry)) {
            return false;
        }
        this.f2615o.remove(entry.getKey());
        return true;
    }

    public final int size() {
        return this.f2615o.size();
    }
}
