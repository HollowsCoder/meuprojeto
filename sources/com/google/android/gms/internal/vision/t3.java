package com.google.android.gms.internal.vision;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

public class t3 extends AbstractSet {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ p3 f3167o;

    public t3(p3 p3Var) {
        this.f3167o = p3Var;
    }

    public final /* synthetic */ boolean add(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (contains(entry)) {
            return false;
        }
        Object value = entry.getValue();
        this.f3167o.put((Comparable) entry.getKey(), value);
        return true;
    }

    public final void clear() {
        this.f3167o.clear();
    }

    public final boolean contains(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.f3167o.get(entry.getKey());
        Object value = entry.getValue();
        if (obj2 != value) {
            return obj2 != null && obj2.equals(value);
        }
        return true;
    }

    public Iterator iterator() {
        return new u3(this.f3167o);
    }

    public final boolean remove(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (!contains(entry)) {
            return false;
        }
        this.f3167o.remove(entry.getKey());
        return true;
    }

    public final int size() {
        return this.f3167o.size();
    }
}
