package e9;

import java.util.Iterator;
import z8.g;

public final class b<T> implements d<T>, c<T> {

    /* renamed from: a  reason: collision with root package name */
    public final d<T> f4542a;

    /* renamed from: b  reason: collision with root package name */
    public final int f4543b;

    public static final class a implements Iterator<T> {

        /* renamed from: o  reason: collision with root package name */
        public final Iterator<T> f4544o;

        /* renamed from: p  reason: collision with root package name */
        public int f4545p;

        public a(b<T> bVar) {
            this.f4544o = bVar.f4542a.iterator();
            this.f4545p = bVar.f4543b;
        }

        public final boolean hasNext() {
            Iterator<T> it;
            while (true) {
                int i10 = this.f4545p;
                it = this.f4544o;
                if (i10 > 0 && it.hasNext()) {
                    it.next();
                    this.f4545p--;
                }
            }
            return it.hasNext();
        }

        public final T next() {
            Iterator<T> it;
            while (true) {
                int i10 = this.f4545p;
                it = this.f4544o;
                if (i10 > 0 && it.hasNext()) {
                    it.next();
                    this.f4545p--;
                }
            }
            return it.next();
        }

        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public b(d<? extends T> dVar, int i10) {
        g.f(dVar, "sequence");
        this.f4542a = dVar;
        this.f4543b = i10;
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("count must be non-negative, but was " + i10 + '.').toString());
        }
    }

    public final b a(int i10) {
        int i11 = this.f4543b + i10;
        return i11 < 0 ? new b(this, i10) : new b(this.f4542a, i11);
    }

    public final Iterator<T> iterator() {
        return new a(this);
    }
}
