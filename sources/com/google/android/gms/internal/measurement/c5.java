package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

public abstract class c5<E> extends AbstractList<E> implements m6<E> {

    /* renamed from: o  reason: collision with root package name */
    public boolean f2654o = true;

    public final void a() {
        this.f2654o = false;
    }

    public boolean add(E e10) {
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
        if (!this.f2654o) {
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

    public abstract E remove(int i10);

    public final boolean remove(Object obj) {
        e();
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    public final boolean removeAll(Collection<?> collection) {
        e();
        return super.removeAll(collection);
    }

    public final boolean retainAll(Collection<?> collection) {
        e();
        return super.retainAll(collection);
    }

    public final boolean zza() {
        return this.f2654o;
    }
}
