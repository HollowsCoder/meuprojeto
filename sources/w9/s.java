package w9;

import java.io.OutputStream;
import p9.u;
import z8.g;

public final class s implements z {

    /* renamed from: o  reason: collision with root package name */
    public final OutputStream f9350o;

    /* renamed from: p  reason: collision with root package name */
    public final c0 f9351p;

    public s(OutputStream outputStream, c0 c0Var) {
        this.f9350o = outputStream;
        this.f9351p = c0Var;
    }

    public final void H(f fVar, long j8) {
        g.f(fVar, "source");
        u.d(fVar.f9325p, 0, j8);
        while (j8 > 0) {
            this.f9351p.f();
            w wVar = fVar.f9324o;
            g.c(wVar);
            int min = (int) Math.min(j8, (long) (wVar.f9367c - wVar.f9366b));
            this.f9350o.write(wVar.f9365a, wVar.f9366b, min);
            int i10 = wVar.f9366b + min;
            wVar.f9366b = i10;
            long j10 = (long) min;
            j8 -= j10;
            fVar.f9325p -= j10;
            if (i10 == wVar.f9367c) {
                fVar.f9324o = wVar.a();
                x.a(wVar);
            }
        }
    }

    public final void close() {
        this.f9350o.close();
    }

    public final void flush() {
        this.f9350o.flush();
    }

    public final c0 h() {
        return this.f9351p;
    }

    public final String toString() {
        return "sink(" + this.f9350o + ')';
    }
}
