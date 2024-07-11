package h5;

import l4.w;

public final class t5 implements Runnable {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ p5 f5698o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ long f5699p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ u5 f5700q;

    public t5(u5 u5Var, p5 p5Var, long j8) {
        this.f5700q = u5Var;
        this.f5698o = p5Var;
        this.f5699p = j8;
    }

    public final void run() {
        p5 p5Var = this.f5698o;
        long j8 = this.f5699p;
        u5 u5Var = this.f5700q;
        u5Var.m(p5Var, false, j8);
        u5Var.f5769s = null;
        f6 r5 = u5Var.f5649o.r();
        r5.g();
        r5.h();
        r5.q(new w(2, r5, (Object) null));
    }
}
