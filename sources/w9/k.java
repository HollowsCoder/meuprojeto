package w9;

import z8.g;

public abstract class k implements z {

    /* renamed from: o  reason: collision with root package name */
    public final z f9332o;

    public k(z zVar) {
        g.f(zVar, "delegate");
        this.f9332o = zVar;
    }

    public void H(f fVar, long j8) {
        g.f(fVar, "source");
        this.f9332o.H(fVar, j8);
    }

    public void close() {
        this.f9332o.close();
    }

    public void flush() {
        this.f9332o.flush();
    }

    public final c0 h() {
        return this.f9332o.h();
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.f9332o + ')';
    }
}
