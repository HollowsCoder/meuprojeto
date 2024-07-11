package h5;

public final class e5 implements Runnable {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ f f5354o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ int f5355p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ long f5356q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ boolean f5357r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ i5 f5358s;

    public e5(i5 i5Var, f fVar, int i10, long j8, boolean z) {
        this.f5358s = i5Var;
        this.f5354o = fVar;
        this.f5355p = i10;
        this.f5356q = j8;
        this.f5357r = z;
    }

    public final void run() {
        this.f5358s.w(this.f5354o);
        i5.q(this.f5358s, this.f5354o, this.f5355p, this.f5356q, false, this.f5357r);
    }
}
