package com.google.android.gms.internal.clearcut;

import java.util.Iterator;

public final class z2 implements Iterator<String> {

    /* renamed from: o  reason: collision with root package name */
    public final Iterator<String> f2603o;

    public z2(x2 x2Var) {
        this.f2603o = x2Var.f2589o.iterator();
    }

    public final boolean hasNext() {
        return this.f2603o.hasNext();
    }

    public final /* synthetic */ Object next() {
        return this.f2603o.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
