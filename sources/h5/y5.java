package h5;

public final class y5 extends j {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f5824e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ q4 f5825f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y5(q4 q4Var, s4 s4Var, int i10) {
        super(s4Var);
        this.f5824e = i10;
        this.f5825f = q4Var;
    }

    public final void a() {
        int i10 = this.f5824e;
        q4 q4Var = this.f5825f;
        switch (i10) {
            case 0:
                f6 f6Var = (f6) q4Var;
                f6Var.g();
                if (f6Var.t()) {
                    g3 g3Var = f6Var.f5649o.w;
                    i4.n(g3Var);
                    g3Var.B.a("Inactivity, disconnecting from the service");
                    f6Var.m();
                    return;
                }
                return;
            default:
                s6 s6Var = (s6) q4Var;
                s6Var.k();
                g3 g3Var2 = s6Var.f5649o.w;
                i4.n(g3Var2);
                g3Var2.B.a("Starting upload from DelayedRunnable");
                s6Var.f5701p.g();
                return;
        }
    }
}
