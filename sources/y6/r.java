package y6;

import d2.c;
import v7.a;
import v7.b;
import z3.i;

public final class r<T> implements b<T>, a<T> {

    /* renamed from: c  reason: collision with root package name */
    public static final c f9594c = new c(5);
    public static final h d = new h(1);

    /* renamed from: a  reason: collision with root package name */
    public a.C0141a<T> f9595a;

    /* renamed from: b  reason: collision with root package name */
    public volatile b<T> f9596b;

    public r(c cVar, b bVar) {
        this.f9595a = cVar;
        this.f9596b = bVar;
    }

    public final void a(a.C0141a<T> aVar) {
        b<T> bVar;
        b<T> bVar2;
        b<T> bVar3 = this.f9596b;
        h hVar = d;
        if (bVar3 != hVar) {
            aVar.d(bVar3);
            return;
        }
        synchronized (this) {
            bVar = this.f9596b;
            if (bVar != hVar) {
                bVar2 = bVar;
            } else {
                this.f9595a = new i(this.f9595a, aVar);
                bVar2 = null;
            }
        }
        if (bVar2 != null) {
            aVar.d(bVar);
        }
    }

    public final T get() {
        return this.f9596b.get();
    }
}
