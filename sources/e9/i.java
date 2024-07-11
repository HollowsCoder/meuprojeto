package e9;

import f9.b;
import f9.k;
import java.util.Iterator;
import y8.l;

public final class i<T, R> implements d<R> {

    /* renamed from: a  reason: collision with root package name */
    public final d<T> f4548a;

    /* renamed from: b  reason: collision with root package name */
    public final l<T, R> f4549b;

    public static final class a implements Iterator<R> {

        /* renamed from: o  reason: collision with root package name */
        public final Iterator<T> f4550o;

        /* renamed from: p  reason: collision with root package name */
        public final /* synthetic */ i<T, R> f4551p;

        public a(i<T, R> iVar) {
            this.f4551p = iVar;
            this.f4550o = iVar.f4548a.iterator();
        }

        public final boolean hasNext() {
            return this.f4550o.hasNext();
        }

        public final R next() {
            return this.f4551p.f4549b.k(this.f4550o.next());
        }

        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public i(b bVar, k kVar) {
        this.f4548a = bVar;
        this.f4549b = kVar;
    }

    public final Iterator<R> iterator() {
        return new a(this);
    }
}
