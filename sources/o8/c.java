package o8;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import z8.g;

public abstract class c<E> extends a<E> implements List<E> {

    public class a implements Iterator<E> {

        /* renamed from: o  reason: collision with root package name */
        public int f7754o;

        public a() {
        }

        public final boolean hasNext() {
            if (this.f7754o < c.this.e()) {
                return true;
            }
            return false;
        }

        public final E next() {
            if (hasNext()) {
                int i10 = this.f7754o;
                this.f7754o = i10 + 1;
                return c.this.get(i10);
            }
            throw new NoSuchElementException();
        }

        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public class b extends c<E>.a implements ListIterator<E> {
        public b(int i10) {
            super();
            int e10 = c.this.e();
            if (i10 < 0 || i10 > e10) {
                throw new IndexOutOfBoundsException("index: " + i10 + ", size: " + e10);
            }
            this.f7754o = i10;
        }

        public final void add(E e10) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final boolean hasPrevious() {
            return this.f7754o > 0;
        }

        public final int nextIndex() {
            return this.f7754o;
        }

        public final E previous() {
            if (hasPrevious()) {
                int i10 = this.f7754o - 1;
                this.f7754o = i10;
                return c.this.get(i10);
            }
            throw new NoSuchElementException();
        }

        public final int previousIndex() {
            return this.f7754o - 1;
        }

        public final void set(E e10) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* renamed from: o8.c$c  reason: collision with other inner class name */
    public static final class C0112c<E> extends c<E> implements RandomAccess {

        /* renamed from: o  reason: collision with root package name */
        public final c<E> f7757o;

        /* renamed from: p  reason: collision with root package name */
        public final int f7758p;

        /* renamed from: q  reason: collision with root package name */
        public final int f7759q;

        public C0112c(c<? extends E> cVar, int i10, int i11) {
            g.f(cVar, "list");
            this.f7757o = cVar;
            this.f7758p = i10;
            int e10 = cVar.e();
            if (i10 < 0 || i11 > e10) {
                throw new IndexOutOfBoundsException("fromIndex: " + i10 + ", toIndex: " + i11 + ", size: " + e10);
            } else if (i10 <= i11) {
                this.f7759q = i11 - i10;
            } else {
                throw new IllegalArgumentException("fromIndex: " + i10 + " > toIndex: " + i11);
            }
        }

        public final int e() {
            return this.f7759q;
        }

        public final E get(int i10) {
            int i11 = this.f7759q;
            if (i10 < 0 || i10 >= i11) {
                throw new IndexOutOfBoundsException("index: " + i10 + ", size: " + i11);
            }
            return this.f7757o.get(this.f7758p + i10);
        }
    }

    public final void add(int i10, E e10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean addAll(int i10, Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        Collection collection = (Collection) obj;
        g.f(collection, "other");
        if (size() == collection.size()) {
            Iterator it = collection.iterator();
            for (Object a10 : this) {
                if (!g.a(a10, it.next())) {
                }
            }
            return true;
        }
        return false;
    }

    public abstract E get(int i10);

    public final int hashCode() {
        Iterator it = iterator();
        int i10 = 1;
        while (it.hasNext()) {
            Object next = it.next();
            i10 = (i10 * 31) + (next != null ? next.hashCode() : 0);
        }
        return i10;
    }

    public int indexOf(E e10) {
        int i10 = 0;
        for (Object a10 : this) {
            if (g.a(a10, e10)) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public final Iterator<E> iterator() {
        return new a();
    }

    public int lastIndexOf(E e10) {
        ListIterator listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (g.a(listIterator.previous(), e10)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    public final ListIterator<E> listIterator() {
        return new b(0);
    }

    public final ListIterator<E> listIterator(int i10) {
        return new b(i10);
    }

    public final E remove(int i10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final E set(int i10, E e10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final List<E> subList(int i10, int i11) {
        return new C0112c(this, i10, i11);
    }
}
