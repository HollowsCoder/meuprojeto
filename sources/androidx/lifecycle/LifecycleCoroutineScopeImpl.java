package androidx.lifecycle;

import androidx.lifecycle.h;
import g9.l0;
import java.util.concurrent.CancellationException;
import q8.f;
import z8.g;

public final class LifecycleCoroutineScopeImpl extends i implements l {

    /* renamed from: o  reason: collision with root package name */
    public final h f1345o;

    /* renamed from: p  reason: collision with root package name */
    public final f f1346p;

    public LifecycleCoroutineScopeImpl(h hVar, f fVar) {
        l0 l0Var;
        g.f(fVar, "coroutineContext");
        this.f1345o = hVar;
        this.f1346p = fVar;
        if (((o) hVar).f1394c == h.c.DESTROYED && (l0Var = (l0) fVar.get(l0.b.f5025o)) != null) {
            l0Var.s((CancellationException) null);
        }
    }

    public final void f(n nVar, h.b bVar) {
        h hVar = this.f1345o;
        if (((o) hVar).f1394c.compareTo(h.c.DESTROYED) <= 0) {
            hVar.b(this);
            l0 l0Var = (l0) this.f1346p.get(l0.b.f5025o);
            if (l0Var != null) {
                l0Var.s((CancellationException) null);
            }
        }
    }

    public final f g() {
        return this.f1346p;
    }
}
