package r8;

import n.e;
import q8.d;
import q8.f;
import y8.l;
import z8.g;
import z8.p;

public final class c extends s8.c {

    /* renamed from: r  reason: collision with root package name */
    public int f8462r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ l f8463s;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(d dVar, f fVar, l lVar) {
        super(dVar, fVar);
        this.f8463s = lVar;
        g.d(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
    }

    public final Object f(Object obj) {
        int i10 = this.f8462r;
        if (i10 == 0) {
            this.f8462r = 1;
            e.I(obj);
            l lVar = this.f8463s;
            g.d(lVar, "null cannot be cast to non-null type kotlin.Function1<kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda-0>, kotlin.Any?>");
            p.a(1, lVar);
            return lVar.k(this);
        } else if (i10 == 1) {
            this.f8462r = 2;
            e.I(obj);
            return obj;
        } else {
            throw new IllegalStateException("This coroutine had already completed".toString());
        }
    }
}
