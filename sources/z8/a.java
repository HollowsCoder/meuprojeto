package z8;

import java.util.Iterator;
import java.util.NoSuchElementException;

public final class a<T> implements Iterator<T> {

    /* renamed from: o  reason: collision with root package name */
    public final T[] f9958o;

    /* renamed from: p  reason: collision with root package name */
    public int f9959p;

    public a(T[] tArr) {
        g.f(tArr, "array");
        this.f9958o = tArr;
    }

    public final boolean hasNext() {
        return this.f9959p < this.f9958o.length;
    }

    public final T next() {
        try {
            T[] tArr = this.f9958o;
            int i10 = this.f9959p;
            this.f9959p = i10 + 1;
            return tArr[i10];
        } catch (ArrayIndexOutOfBoundsException e10) {
            this.f9959p--;
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
