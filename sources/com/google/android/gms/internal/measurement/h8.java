package com.google.android.gms.internal.measurement;

import java.util.ListIterator;

public final class h8 implements ListIterator<String> {

    /* renamed from: o  reason: collision with root package name */
    public final ListIterator<String> f2734o;

    public h8(j8 j8Var, int i10) {
        this.f2734o = j8Var.f2757o.listIterator(i10);
    }

    public final /* bridge */ /* synthetic */ void add(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }

    public final boolean hasNext() {
        return this.f2734o.hasNext();
    }

    public final boolean hasPrevious() {
        return this.f2734o.hasPrevious();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return this.f2734o.next();
    }

    public final int nextIndex() {
        return this.f2734o.nextIndex();
    }

    public final /* bridge */ /* synthetic */ Object previous() {
        return this.f2734o.previous();
    }

    public final int previousIndex() {
        return this.f2734o.previousIndex();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final /* bridge */ /* synthetic */ void set(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }
}
