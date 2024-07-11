package com.google.android.gms.internal.vision;

import java.util.ListIterator;

public final class z3 implements ListIterator<String> {

    /* renamed from: o  reason: collision with root package name */
    public final ListIterator<String> f3196o;

    public z3(a4 a4Var, int i10) {
        this.f3196o = a4Var.f3055o.listIterator(i10);
    }

    public final /* synthetic */ void add(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }

    public final boolean hasNext() {
        return this.f3196o.hasNext();
    }

    public final boolean hasPrevious() {
        return this.f3196o.hasPrevious();
    }

    public final /* synthetic */ Object next() {
        return this.f3196o.next();
    }

    public final int nextIndex() {
        return this.f3196o.nextIndex();
    }

    public final /* synthetic */ Object previous() {
        return this.f3196o.previous();
    }

    public final int previousIndex() {
        return this.f3196o.previousIndex();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ void set(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }
}
