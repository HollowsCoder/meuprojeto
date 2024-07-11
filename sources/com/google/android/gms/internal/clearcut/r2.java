package com.google.android.gms.internal.clearcut;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

public class r2 extends AbstractSet {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ l2 f2539o;

    public r2(l2 l2Var) {
        this.f2539o = l2Var;
    }

    public final /* synthetic */ boolean add(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (contains(entry)) {
            return false;
        }
        Object value = entry.getValue();
        this.f2539o.put((Comparable) entry.getKey(), value);
        return true;
    }

    public final void clear() {
        this.f2539o.clear();
    }

    public final boolean contains(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.f2539o.get(entry.getKey());
        Object value = entry.getValue();
        if (obj2 != value) {
            return obj2 != null && obj2.equals(value);
        }
        return true;
    }

    public Iterator iterator() {
        return new q2(this.f2539o);
    }

    public final boolean remove(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (!contains(entry)) {
            return false;
        }
        this.f2539o.remove(entry.getKey());
        return true;
    }

    public final int size() {
        return this.f2539o.size();
    }
}
