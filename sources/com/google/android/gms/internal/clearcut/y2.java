package com.google.android.gms.internal.clearcut;

import java.util.ListIterator;

public final class y2 implements ListIterator<String> {

    /* renamed from: o  reason: collision with root package name */
    public final ListIterator<String> f2596o;

    public y2(x2 x2Var, int i10) {
        this.f2596o = x2Var.f2589o.listIterator(i10);
    }

    public final /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean hasNext() {
        return this.f2596o.hasNext();
    }

    public final boolean hasPrevious() {
        return this.f2596o.hasPrevious();
    }

    public final /* synthetic */ Object next() {
        return this.f2596o.next();
    }

    public final int nextIndex() {
        return this.f2596o.nextIndex();
    }

    public final /* synthetic */ Object previous() {
        return this.f2596o.previous();
    }

    public final int previousIndex() {
        return this.f2596o.previousIndex();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
