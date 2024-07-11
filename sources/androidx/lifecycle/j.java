package androidx.lifecycle;

import androidx.lifecycle.h;
import g9.l0;
import g9.u;
import java.util.concurrent.CancellationException;
import n8.i;
import q8.d;
import r8.a;
import s8.e;
import s8.h;
import y8.p;

@e(c = "androidx.lifecycle.LifecycleCoroutineScopeImpl$register$1", f = "Lifecycle.kt", l = {}, m = "invokeSuspend")
public final class j extends h implements p<u, d<? super i>, Object> {

    /* renamed from: s  reason: collision with root package name */
    public /* synthetic */ Object f1390s;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ LifecycleCoroutineScopeImpl f1391t;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl, d<? super j> dVar) {
        super(dVar);
        this.f1391t = lifecycleCoroutineScopeImpl;
    }

    public final d<i> a(Object obj, d<?> dVar) {
        j jVar = new j(this.f1391t, dVar);
        jVar.f1390s = obj;
        return jVar;
    }

    public final Object f(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        n.e.I(obj);
        u uVar = (u) this.f1390s;
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl = this.f1391t;
        if (((o) lifecycleCoroutineScopeImpl.f1345o).f1394c.compareTo(h.c.INITIALIZED) >= 0) {
            lifecycleCoroutineScopeImpl.f1345o.a(lifecycleCoroutineScopeImpl);
        } else {
            l0 l0Var = (l0) uVar.g().get(l0.b.f5025o);
            if (l0Var != null) {
                l0Var.s((CancellationException) null);
            }
        }
        return i.f7501a;
    }

    public final Object i(Object obj, Object obj2) {
        return ((j) a((u) obj, (d) obj2)).f(i.f7501a);
    }
}
