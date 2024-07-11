package com.google.android.gms.internal.clearcut;

import java.util.Iterator;
import java.util.Map;

public final class a1<K> implements Iterator<Map.Entry<K, Object>> {

    /* renamed from: o  reason: collision with root package name */
    public final Iterator<Map.Entry<K, Object>> f2361o;

    public a1(Iterator<Map.Entry<K, Object>> it) {
        this.f2361o = it;
    }

    public final boolean hasNext() {
        return this.f2361o.hasNext();
    }

    public final /* synthetic */ Object next() {
        Map.Entry next = this.f2361o.next();
        return next.getValue() instanceof y0 ? new z0(next) : next;
    }

    public final void remove() {
        this.f2361o.remove();
    }
}
