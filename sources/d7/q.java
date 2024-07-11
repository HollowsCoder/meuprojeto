package d7;

import m5.h;
import m5.i;
import m5.r;

public final class q implements h<Boolean, Void> {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ i f4264o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ t f4265p;

    public q(t tVar, r rVar) {
        this.f4265p = tVar;
        this.f4264o = rVar;
    }

    public final i i(Object obj) {
        i<TContinuationResult> g10;
        f fVar = this.f4265p.d;
        p pVar = new p(this, (Boolean) obj);
        synchronized (fVar.f4221c) {
            g10 = fVar.f4220b.g(fVar.f4219a, new g(pVar));
            fVar.f4220b = g10.e(fVar.f4219a, new h());
        }
        return g10;
    }
}
