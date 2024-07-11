package r8;

import n.e;
import s8.g;
import y8.p;

public final class d extends g {

    /* renamed from: p  reason: collision with root package name */
    public int f8464p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ p f8465q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ Object f8466r;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(p pVar, Object obj, q8.d dVar) {
        super(dVar);
        this.f8465q = pVar;
        this.f8466r = obj;
        z8.g.d(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
    }

    public final Object f(Object obj) {
        int i10 = this.f8464p;
        if (i10 == 0) {
            this.f8464p = 1;
            e.I(obj);
            p pVar = this.f8465q;
            z8.g.d(pVar, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda-1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda-1>, kotlin.Any?>");
            z8.p.a(2, pVar);
            return pVar.i(this.f8466r, this);
        } else if (i10 == 1) {
            this.f8464p = 2;
            e.I(obj);
            return obj;
        } else {
            throw new IllegalStateException("This coroutine had already completed".toString());
        }
    }
}
