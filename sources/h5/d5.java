package h5;

public final class d5 implements Runnable {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ f f5332o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ long f5333p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f5334q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ long f5335r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ boolean f5336s;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ i5 f5337t;

    public d5(i5 i5Var, f fVar, long j8, int i10, long j10, boolean z) {
        this.f5337t = i5Var;
        this.f5332o = fVar;
        this.f5333p = j8;
        this.f5334q = i10;
        this.f5335r = j10;
        this.f5336s = z;
    }

    public final void run() {
        f fVar = this.f5332o;
        i5 i5Var = this.f5337t;
        i5Var.w(fVar);
        i5Var.l(false, this.f5333p);
        i5.q(this.f5337t, this.f5332o, this.f5334q, this.f5335r, true, this.f5336s);
    }
}
