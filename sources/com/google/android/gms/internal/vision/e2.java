package com.google.android.gms.internal.vision;

import java.util.Iterator;
import java.util.Map;

public final class e2<K> implements Iterator<Map.Entry<K, Object>> {

    /* renamed from: o  reason: collision with root package name */
    public final Iterator<Map.Entry<K, Object>> f3084o;

    public e2(Iterator<Map.Entry<K, Object>> it) {
        this.f3084o = it;
    }

    public final boolean hasNext() {
        return this.f3084o.hasNext();
    }

    public final /* synthetic */ Object next() {
        Map.Entry next = this.f3084o.next();
        return next.getValue() instanceof d2 ? new f2(next) : next;
    }

    public final void remove() {
        this.f3084o.remove();
    }
}
