package h5;

import n4.m;

public final class w5 implements Runnable {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ i7 f5795o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ boolean f5796p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ c7 f5797q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ f6 f5798r;

    public w5(f6 f6Var, i7 i7Var, boolean z, c7 c7Var) {
        this.f5798r = f6Var;
        this.f5795o = i7Var;
        this.f5796p = z;
        this.f5797q = c7Var;
    }

    public final void run() {
        c7 c7Var;
        f6 f6Var = this.f5798r;
        x2 x2Var = f6Var.f5383r;
        if (x2Var == null) {
            g3 g3Var = f6Var.f5649o.w;
            i4.n(g3Var);
            g3Var.f5397t.a("Discarding data. Failed to set user property");
            return;
        }
        i7 i7Var = this.f5795o;
        m.h(i7Var);
        if (this.f5796p) {
            c7Var = null;
        } else {
            c7Var = this.f5797q;
        }
        f6Var.u(x2Var, c7Var, i7Var);
        f6Var.p();
    }
}
