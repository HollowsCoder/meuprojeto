package w9;

import z8.g;

public abstract class l implements b0 {

    /* renamed from: o  reason: collision with root package name */
    public final b0 f9333o;

    public l(b0 b0Var) {
        g.f(b0Var, "delegate");
        this.f9333o = b0Var;
    }

    public void close() {
        this.f9333o.close();
    }

    public final c0 h() {
        return this.f9333o.h();
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.f9333o + ')';
    }

    public long w(f fVar, long j8) {
        g.f(fVar, "sink");
        return this.f9333o.w(fVar, j8);
    }
}
