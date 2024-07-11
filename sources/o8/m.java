package o8;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import n.e;
import z8.g;

public final class m implements Set, Serializable {

    /* renamed from: o  reason: collision with root package name */
    public static final m f7766o = new m();

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean contains(Object obj) {
        if (!(obj instanceof Void)) {
            return false;
        }
        g.f((Void) obj, "element");
        return false;
    }

    public final boolean containsAll(Collection collection) {
        g.f(collection, "elements");
        return collection.isEmpty();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof Set) && ((Set) obj).isEmpty();
    }

    public final int hashCode() {
        return 0;
    }

    public final boolean isEmpty() {
        return true;
    }

    public final Iterator iterator() {
        return j.f7763o;
    }

    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return 0;
    }

    public final Object[] toArray() {
        return e.J(this);
    }

    public final <T> T[] toArray(T[] tArr) {
        g.f(tArr, "array");
        return e.K(this, tArr);
    }

    public final String toString() {
        return "[]";
    }
}
