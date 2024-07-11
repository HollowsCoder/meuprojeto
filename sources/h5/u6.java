package h5;

public abstract class u6 extends t6 {

    /* renamed from: q  reason: collision with root package name */
    public boolean f5774q;

    public u6(z6 z6Var) {
        super(z6Var);
        this.f5701p.D++;
    }

    public final void h() {
        if (!this.f5774q) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public abstract void i();

    public final void j() {
        if (!this.f5774q) {
            i();
            this.f5701p.E++;
            this.f5774q = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }
}
