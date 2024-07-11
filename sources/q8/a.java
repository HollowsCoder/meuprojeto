package q8;

import q8.f;
import y8.p;
import z8.g;

public abstract class a implements f.b {
    private final f.c<?> key;

    public a(f.c<?> cVar) {
        g.f(cVar, "key");
        this.key = cVar;
    }

    public <R> R fold(R r5, p<? super R, ? super f.b, ? extends R> pVar) {
        g.f(pVar, "operation");
        return pVar.i(r5, this);
    }

    public <E extends f.b> E get(f.c<E> cVar) {
        return f.b.a.a(this, cVar);
    }

    public f.c<?> getKey() {
        return this.key;
    }

    public f minusKey(f.c<?> cVar) {
        return f.b.a.b(this, cVar);
    }

    public f plus(f fVar) {
        g.f(fVar, "context");
        return f.a.a(this, fVar);
    }
}
