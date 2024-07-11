package com.google.android.gms.internal.measurement;

import java.util.Iterator;

public final class i8 implements Iterator<String> {

    /* renamed from: o  reason: collision with root package name */
    public final Iterator<String> f2747o;

    public i8(j8 j8Var) {
        this.f2747o = j8Var.f2757o.iterator();
    }

    public final boolean hasNext() {
        return this.f2747o.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return this.f2747o.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
