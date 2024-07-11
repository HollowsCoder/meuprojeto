package f7;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public final class b0<E> implements List<E>, RandomAccess {

    /* renamed from: o  reason: collision with root package name */
    public final List<E> f4752o;

    public b0(List<E> list) {
        this.f4752o = Collections.unmodifiableList(list);
    }

    public final void add(int i10, E e10) {
        this.f4752o.add(i10, e10);
    }

    public final boolean add(E e10) {
        return this.f4752o.add(e10);
    }

    public final boolean addAll(int i10, Collection<? extends E> collection) {
        return this.f4752o.addAll(i10, collection);
    }

    public final boolean addAll(Collection<? extends E> collection) {
        return this.f4752o.addAll(collection);
    }

    public final void clear() {
        this.f4752o.clear();
    }

    public final boolean contains(Object obj) {
        return this.f4752o.contains(obj);
    }

    public final boolean containsAll(Collection<?> collection) {
        return this.f4752o.containsAll(collection);
    }

    public final boolean equals(Object obj) {
        return this.f4752o.equals(obj);
    }

    public final E get(int i10) {
        return this.f4752o.get(i10);
    }

    public final int hashCode() {
        return this.f4752o.hashCode();
    }

    public final int indexOf(Object obj) {
        return this.f4752o.indexOf(obj);
    }

    public final boolean isEmpty() {
        return this.f4752o.isEmpty();
    }

    public final Iterator<E> iterator() {
        return this.f4752o.iterator();
    }

    public final int lastIndexOf(Object obj) {
        return this.f4752o.lastIndexOf(obj);
    }

    public final ListIterator<E> listIterator() {
        return this.f4752o.listIterator();
    }

    public final ListIterator<E> listIterator(int i10) {
        return this.f4752o.listIterator(i10);
    }

    public final E remove(int i10) {
        return this.f4752o.remove(i10);
    }

    public final boolean remove(Object obj) {
        return this.f4752o.remove(obj);
    }

    public final boolean removeAll(Collection<?> collection) {
        return this.f4752o.removeAll(collection);
    }

    public final boolean retainAll(Collection<?> collection) {
        return this.f4752o.retainAll(collection);
    }

    public final E set(int i10, E e10) {
        return this.f4752o.set(i10, e10);
    }

    public final int size() {
        return this.f4752o.size();
    }

    public final List<E> subList(int i10, int i11) {
        return this.f4752o.subList(i10, i11);
    }

    public final Object[] toArray() {
        return this.f4752o.toArray();
    }

    public final <T> T[] toArray(T[] tArr) {
        return this.f4752o.toArray(tArr);
    }
}
