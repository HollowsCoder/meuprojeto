package com.google.android.gms.internal.vision;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public final class a4 extends AbstractList<String> implements j2, RandomAccess {

    /* renamed from: o  reason: collision with root package name */
    public final j2 f3055o;

    public a4(j2 j2Var) {
        this.f3055o = j2Var;
    }

    public final void G(w0 w0Var) {
        throw new UnsupportedOperationException();
    }

    public final List<?> b() {
        return this.f3055o.b();
    }

    public final j2 c() {
        return this;
    }

    public final /* synthetic */ Object get(int i10) {
        return (String) this.f3055o.get(i10);
    }

    public final Iterator<String> iterator() {
        return new c4(this);
    }

    public final Object j(int i10) {
        return this.f3055o.j(i10);
    }

    public final ListIterator<String> listIterator(int i10) {
        return new z3(this, i10);
    }

    public final int size() {
        return this.f3055o.size();
    }
}
