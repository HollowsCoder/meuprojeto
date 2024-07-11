package y9;

import g9.e;
import g9.f;
import z8.g;

public final class p implements d<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e f9708a;

    public p(f fVar) {
        this.f9708a = fVar;
    }

    public final void a(b<Object> bVar, Throwable th) {
        g.g(bVar, "call");
        g.g(th, "t");
        this.f9708a.h(n.e.s(th));
    }

    public final void b(b<Object> bVar, b0<Object> b0Var) {
        T t10;
        g.g(bVar, "call");
        g.g(b0Var, "response");
        if (b0Var.f9660a.c()) {
            t10 = b0Var.f9661b;
        } else {
            t10 = n.e.s(new j(b0Var));
        }
        this.f9708a.h(t10);
    }
}
