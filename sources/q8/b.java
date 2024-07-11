package q8;

import q8.f;
import q8.f.b;
import y8.l;
import z8.g;

public abstract class b<B extends f.b, E extends B> implements f.c<E> {

    /* renamed from: o  reason: collision with root package name */
    public final l<f.b, E> f8267o;

    /* renamed from: p  reason: collision with root package name */
    public final f.c<?> f8268p;

    public b(f.c<B> cVar, l<? super f.b, ? extends E> lVar) {
        g.f(cVar, "baseKey");
        this.f8267o = lVar;
        this.f8268p = cVar instanceof b ? ((b) cVar).f8268p : cVar;
    }

    public final E a(f.b bVar) {
        g.f(bVar, "element");
        return (f.b) this.f8267o.k(bVar);
    }
}
