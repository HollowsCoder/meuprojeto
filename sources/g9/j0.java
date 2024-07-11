package g9;

import n.e;
import n8.i;
import y8.l;

public final class j0 extends d {

    /* renamed from: o  reason: collision with root package name */
    public final l<Throwable, i> f5022o;

    public j0(l<? super Throwable, i> lVar) {
        this.f5022o = lVar;
    }

    public final void a(Throwable th) {
        this.f5022o.k(th);
    }

    public final /* bridge */ /* synthetic */ Object k(Object obj) {
        a((Throwable) obj);
        return i.f7501a;
    }

    public final String toString() {
        return "InvokeOnCancel[" + this.f5022o.getClass().getSimpleName() + '@' + e.x(this) + ']';
    }
}
