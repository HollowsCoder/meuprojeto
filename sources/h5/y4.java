package h5;

import java.util.concurrent.atomic.AtomicReference;

public final class y4 implements Runnable {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ int f5821o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ long f5822p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ t2 f5823q;

    public /* synthetic */ y4(t2 t2Var, long j8, int i10) {
        this.f5821o = i10;
        this.f5823q = t2Var;
        this.f5822p = j8;
    }

    public final void run() {
        int i10 = this.f5821o;
        long j8 = this.f5822p;
        t2 t2Var = this.f5823q;
        switch (i10) {
            case 0:
                i5 i5Var = (i5) t2Var;
                u3 u3Var = i5Var.f5649o.f5458v;
                i4.l(u3Var);
                u3Var.f5757y.b(j8);
                g3 g3Var = i5Var.f5649o.w;
                i4.n(g3Var);
                g3Var.A.b(Long.valueOf(j8), "Session timeout duration set");
                return;
            case 1:
                i5 i5Var2 = (i5) t2Var;
                i5Var2.l(true, j8);
                i5Var2.f5649o.r().w(new AtomicReference());
                return;
            default:
                ((u1) t2Var).m(j8);
                return;
        }
    }
}
