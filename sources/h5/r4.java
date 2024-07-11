package h5;

public abstract class r4 extends q4 {

    /* renamed from: p  reason: collision with root package name */
    public boolean f5671p;

    public r4(i4 i4Var) {
        super(i4Var, 0);
        this.f5649o.T++;
    }

    public abstract boolean h();

    public final void i() {
        if (!this.f5671p) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void j() {
        if (this.f5671p) {
            throw new IllegalStateException("Can't initialize twice");
        } else if (!h()) {
            this.f5649o.U.incrementAndGet();
            this.f5671p = true;
        }
    }
}
