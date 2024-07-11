package r8;

import q8.d;
import q8.f;
import s8.c;
import y8.p;
import z8.g;

public final class e extends c {

    /* renamed from: r  reason: collision with root package name */
    public int f8467r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ p f8468s;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ Object f8469t;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(d dVar, f fVar, p pVar, Object obj) {
        super(dVar, fVar);
        this.f8468s = pVar;
        this.f8469t = obj;
        g.d(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
    }

    public final Object f(Object obj) {
        int i10 = this.f8467r;
        if (i10 == 0) {
            this.f8467r = 1;
            n.e.I(obj);
            p pVar = this.f8468s;
            g.d(pVar, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda-1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda-1>, kotlin.Any?>");
            z8.p.a(2, pVar);
            return pVar.i(this.f8469t, this);
        } else if (i10 == 1) {
            this.f8467r = 2;
            n.e.I(obj);
            return obj;
        } else {
            throw new IllegalStateException("This coroutine had already completed".toString());
        }
    }
}
