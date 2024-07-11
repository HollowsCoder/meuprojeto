package r8;

import n.e;
import q8.d;
import s8.g;
import y8.l;
import z8.p;

public final class b extends g {

    /* renamed from: p  reason: collision with root package name */
    public int f8460p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ l f8461q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(l lVar, d dVar) {
        super(dVar);
        this.f8461q = lVar;
        z8.g.d(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
    }

    public final Object f(Object obj) {
        int i10 = this.f8460p;
        if (i10 == 0) {
            this.f8460p = 1;
            e.I(obj);
            l lVar = this.f8461q;
            z8.g.d(lVar, "null cannot be cast to non-null type kotlin.Function1<kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda-0>, kotlin.Any?>");
            p.a(1, lVar);
            return lVar.k(this);
        } else if (i10 == 1) {
            this.f8460p = 2;
            e.I(obj);
            return obj;
        } else {
            throw new IllegalStateException("This coroutine had already completed".toString());
        }
    }
}
