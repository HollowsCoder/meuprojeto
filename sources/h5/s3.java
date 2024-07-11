package h5;

public abstract class s3 extends t2 {

    /* renamed from: p  reason: collision with root package name */
    public boolean f5685p;

    public s3(i4 i4Var) {
        super(i4Var);
        this.f5649o.T++;
    }

    public final void h() {
        if (!this.f5685p) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void i() {
        if (this.f5685p) {
            throw new IllegalStateException("Can't initialize twice");
        } else if (!j()) {
            this.f5649o.U.incrementAndGet();
            this.f5685p = true;
        }
    }

    public abstract boolean j();
}
