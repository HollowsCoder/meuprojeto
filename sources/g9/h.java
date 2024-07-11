package g9;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.internal.c;
import n8.i;

public final class h extends n0 {

    /* renamed from: s  reason: collision with root package name */
    public final f<?> f5019s;

    public h(f<?> fVar) {
        this.f5019s = fVar;
    }

    public final /* bridge */ /* synthetic */ Object k(Object obj) {
        q((Throwable) obj);
        return i.f7501a;
    }

    public final void q(Throwable th) {
        boolean z;
        a0 a0Var;
        q0 r5 = r();
        f<?> fVar = this.f5019s;
        fVar.getClass();
        CancellationException o10 = r5.o();
        if (!fVar.o()) {
            z = false;
        } else {
            z = ((c) fVar.f5014r).k(o10);
        }
        if (!z) {
            fVar.k(o10);
            if (!fVar.o() && (a0Var = fVar.f5016t) != null) {
                a0Var.g();
                fVar.f5016t = u0.f5050o;
            }
        }
    }
}
