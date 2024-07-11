package h5;

public final class f5 implements Runnable {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ f f5377o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ int f5378p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ long f5379q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ boolean f5380r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ i5 f5381s;

    public f5(i5 i5Var, f fVar, int i10, long j8, boolean z) {
        this.f5381s = i5Var;
        this.f5377o = fVar;
        this.f5378p = i10;
        this.f5379q = j8;
        this.f5380r = z;
    }

    public final void run() {
        this.f5381s.w(this.f5377o);
        i5.q(this.f5381s, this.f5377o, this.f5378p, this.f5379q, false, this.f5380r);
    }
}
