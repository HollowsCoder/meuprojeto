package o8;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import n.e;
import z8.a;
import z8.g;

public final class d<T> implements Collection<T> {

    /* renamed from: o  reason: collision with root package name */
    public final T[] f7760o;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f7761p;

    public d(T[] tArr, boolean z) {
        this.f7760o = tArr;
        this.f7761p = z;
    }

    public final boolean add(T t10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean contains(Object obj) {
        int i10;
        T[] tArr = this.f7760o;
        g.f(tArr, "<this>");
        if (obj != null) {
            int length = tArr.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    break;
                } else if (g.a(obj, tArr[i11])) {
                    i10 = i11;
                    break;
                } else {
                    i11++;
                }
            }
        } else {
            int length2 = tArr.length;
            i10 = 0;
            while (true) {
                if (i10 >= length2) {
                    break;
                } else if (tArr[i10] == null) {
                    break;
                } else {
                    i10++;
                }
            }
        }
        i10 = -1;
        if (i10 >= 0) {
            return true;
        }
        return false;
    }

    public final boolean containsAll(Collection<? extends Object> collection) {
        g.f(collection, "elements");
        Iterable<Object> iterable = collection;
        if (((Collection) iterable).isEmpty()) {
            return true;
        }
        for (Object contains : iterable) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public final boolean isEmpty() {
        return this.f7760o.length == 0;
    }

    public final Iterator<T> iterator() {
        T[] tArr = this.f7760o;
        g.f(tArr, "array");
        return new a(tArr);
    }

    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final int size() {
        return this.f7760o.length;
    }

    public final Object[] toArray() {
        T[] tArr = this.f7760o;
        g.f(tArr, "<this>");
        Class<Object[]> cls = Object[].class;
        if (this.f7761p && g.a(tArr.getClass(), cls)) {
            return tArr;
        }
        Object[] copyOf = Arrays.copyOf(tArr, tArr.length, cls);
        g.e(copyOf, "copyOf(this, this.size, Array<Any?>::class.java)");
        return copyOf;
    }

    public final <T> T[] toArray(T[] tArr) {
        g.f(tArr, "array");
        return e.K(this, tArr);
    }
}
