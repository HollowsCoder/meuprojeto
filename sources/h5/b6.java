package h5;

import n4.m;

public final class b6 implements Runnable {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ i7 f5296o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ boolean f5297p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ p f5298q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ f6 f5299r;

    public b6(f6 f6Var, i7 i7Var, boolean z, p pVar) {
        this.f5299r = f6Var;
        this.f5296o = i7Var;
        this.f5297p = z;
        this.f5298q = pVar;
    }

    public final void run() {
        p pVar;
        f6 f6Var = this.f5299r;
        x2 x2Var = f6Var.f5383r;
        if (x2Var == null) {
            g3 g3Var = f6Var.f5649o.w;
            i4.n(g3Var);
            g3Var.f5397t.a("Discarding data. Failed to send event to service");
            return;
        }
        i7 i7Var = this.f5296o;
        m.h(i7Var);
        if (this.f5297p) {
            pVar = null;
        } else {
            pVar = this.f5298q;
        }
        f6Var.u(x2Var, pVar, i7Var);
        f6Var.p();
    }
}
