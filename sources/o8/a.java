package o8;

import java.util.Collection;
import n.e;
import y8.l;
import z8.g;
import z8.h;

public abstract class a<E> implements Collection<E> {

    /* renamed from: o8.a$a  reason: collision with other inner class name */
    public static final class C0111a extends h implements l<E, CharSequence> {

        /* renamed from: p  reason: collision with root package name */
        public final /* synthetic */ a<E> f7750p;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0111a(a<? extends E> aVar) {
            super(1);
            this.f7750p = aVar;
        }

        public final Object k(Object obj) {
            return obj == this.f7750p ? "(this Collection)" : String.valueOf(obj);
        }
    }

    public final boolean add(E e10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean contains(E e10) {
        if (isEmpty()) {
            return false;
        }
        for (Object a10 : this) {
            if (g.a(a10, e10)) {
                return true;
            }
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

    public abstract int e();

    public final boolean isEmpty() {
        return e() == 0;
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

    public final /* bridge */ int size() {
        return e();
    }

    public final Object[] toArray() {
        return e.J(this);
    }

    public final <T> T[] toArray(T[] tArr) {
        g.f(tArr, "array");
        return e.K(this, tArr);
    }

    public final String toString() {
        C0111a aVar = new C0111a(this);
        StringBuilder sb = new StringBuilder();
        i.w(this, sb, ", ", "[", "]", -1, "...", aVar);
        String sb2 = sb.toString();
        g.e(sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb2;
    }
}
