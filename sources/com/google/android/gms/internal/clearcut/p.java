package com.google.android.gms.internal.clearcut;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

public abstract class p<E> extends AbstractList<E> implements u0<E> {

    /* renamed from: o  reason: collision with root package name */
    public boolean f2513o = true;

    public final boolean add(E e10) {
        e();
        return super.add(e10);
    }

    public boolean addAll(int i10, Collection<? extends E> collection) {
        e();
        return super.addAll(i10, collection);
    }

    public boolean addAll(Collection<? extends E> collection) {
        e();
        return super.addAll(collection);
    }

    public void clear() {
        e();
        super.clear();
    }

    public final void e() {
        if (!this.f2513o) {
            throw new UnsupportedOperationException();
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        for (int i10 = 0; i10 < size; i10++) {
            if (!get(i10).equals(list.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int size = size();
        int i10 = 1;
        for (int i11 = 0; i11 < size; i11++) {
            i10 = (i10 * 31) + get(i11).hashCode();
        }
        return i10;
    }

    public final boolean l() {
        return this.f2513o;
    }

    public final void o() {
        this.f2513o = false;
    }

    public boolean remove(Object obj) {
        e();
        return super.remove(obj);
    }

    public final boolean removeAll(Collection<?> collection) {
        e();
        return super.removeAll(collection);
    }

    public final boolean retainAll(Collection<?> collection) {
        e();
        return super.retainAll(collection);
    }
}
