package s8;

import q8.d;
import q8.e;
import q8.f;
import z8.g;

public abstract class c extends a {

    /* renamed from: p  reason: collision with root package name */
    public final f f8834p;

    /* renamed from: q  reason: collision with root package name */
    public transient d<Object> f8835q;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public c(d<Object> dVar) {
        this(dVar, dVar != null ? dVar.b() : null);
    }

    public c(d<Object> dVar, f fVar) {
        super(dVar);
        this.f8834p = fVar;
    }

    public final f b() {
        f fVar = this.f8834p;
        g.c(fVar);
        return fVar;
    }

    public final void g() {
        d<Object> dVar = this.f8835q;
        if (!(dVar == null || dVar == this)) {
            f fVar = this.f8834p;
            g.c(fVar);
            int i10 = e.f8272n;
            f.b bVar = fVar.get(e.a.f8273o);
            g.c(bVar);
            ((e) bVar).d(dVar);
        }
        this.f8835q = b.f8833o;
    }
}
