package g9;

import q8.f;
import y8.p;
import z8.g;

public final class d1 implements f.b, f.c<d1> {

    /* renamed from: o  reason: collision with root package name */
    public static final d1 f5011o = new d1();

    public final <R> R fold(R r5, p<? super R, ? super f.b, ? extends R> pVar) {
        return pVar.i(r5, this);
    }

    public final <E extends f.b> E get(f.c<E> cVar) {
        return f.b.a.a(this, cVar);
    }

    public final f.c<?> getKey() {
        return this;
    }

    public final f minusKey(f.c<?> cVar) {
        return f.b.a.b(this, cVar);
    }

    public final f plus(f fVar) {
        g.f(fVar, "context");
        return f.a.a(this, fVar);
    }
}
