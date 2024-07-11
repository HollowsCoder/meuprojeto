package com.google.android.gms.internal.clearcut;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public final class x2 extends AbstractList<String> implements d1, RandomAccess {

    /* renamed from: o  reason: collision with root package name */
    public final d1 f2589o;

    public x2(d1 d1Var) {
        this.f2589o = d1Var;
    }

    public final List<?> E() {
        return this.f2589o.E();
    }

    public final d1 S() {
        return this;
    }

    public final Object V(int i10) {
        return this.f2589o.V(i10);
    }

    public final /* synthetic */ Object get(int i10) {
        return (String) this.f2589o.get(i10);
    }

    public final Iterator<String> iterator() {
        return new z2(this);
    }

    public final ListIterator<String> listIterator(int i10) {
        return new y2(this, i10);
    }

    public final int size() {
        return this.f2589o.size();
    }
}
