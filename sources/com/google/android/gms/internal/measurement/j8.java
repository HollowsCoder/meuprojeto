package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public final class j8 extends AbstractList<String> implements RandomAccess, t6 {

    /* renamed from: o  reason: collision with root package name */
    public final t6 f2757o;

    public j8(t6 t6Var) {
        this.f2757o = t6Var;
    }

    public final Object T(int i10) {
        return this.f2757o.T(i10);
    }

    public final List<?> f() {
        return this.f2757o.f();
    }

    public final t6 g() {
        return this;
    }

    public final /* bridge */ /* synthetic */ Object get(int i10) {
        return ((s6) this.f2757o).get(i10);
    }

    public final Iterator<String> iterator() {
        return new i8(this);
    }

    public final ListIterator<String> listIterator(int i10) {
        return new h8(this, i10);
    }

    public final void s(k5 k5Var) {
        throw new UnsupportedOperationException();
    }

    public final int size() {
        return this.f2757o.size();
    }
}
