package l4;

import l4.d;
import m5.j;

public final class a0 extends z<Boolean> {

    /* renamed from: c  reason: collision with root package name */
    public final g<?> f6875c;

    public a0(g<?> gVar, j<Boolean> jVar) {
        super(jVar);
        this.f6875c = gVar;
    }

    public final /* bridge */ /* synthetic */ void d(e0 e0Var, boolean z) {
    }

    public final void f(d.a aVar) {
        if (((t) aVar.f6897f.get(this.f6875c)) != null) {
            throw null;
        }
    }

    public final void g(d.a<?> aVar) {
        if (((t) aVar.f6897f.remove(this.f6875c)) == null) {
            this.f6952b.c(Boolean.FALSE);
            return;
        }
        throw null;
    }
}
