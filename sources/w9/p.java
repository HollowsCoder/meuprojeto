package w9;

import b0.d;
import java.io.IOException;
import java.io.InputStream;
import n.e;
import z8.g;

public final class p implements b0 {

    /* renamed from: o  reason: collision with root package name */
    public final InputStream f9344o;

    /* renamed from: p  reason: collision with root package name */
    public final c0 f9345p;

    public p(InputStream inputStream, c0 c0Var) {
        g.f(inputStream, "input");
        this.f9344o = inputStream;
        this.f9345p = c0Var;
    }

    public final void close() {
        this.f9344o.close();
    }

    public final c0 h() {
        return this.f9345p;
    }

    public final String toString() {
        return "source(" + this.f9344o + ')';
    }

    public final long w(f fVar, long j8) {
        boolean z;
        g.f(fVar, "sink");
        int i10 = (j8 > 0 ? 1 : (j8 == 0 ? 0 : -1));
        if (i10 == 0) {
            return 0;
        }
        if (i10 >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            try {
                this.f9345p.f();
                w I = fVar.I(1);
                int read = this.f9344o.read(I.f9365a, I.f9367c, (int) Math.min(j8, (long) (8192 - I.f9367c)));
                if (read != -1) {
                    I.f9367c += read;
                    long j10 = (long) read;
                    fVar.f9325p += j10;
                    return j10;
                } else if (I.f9366b != I.f9367c) {
                    return -1;
                } else {
                    fVar.f9324o = I.a();
                    x.a(I);
                    return -1;
                }
            } catch (AssertionError e10) {
                if (e.B(e10)) {
                    throw new IOException(e10);
                }
                throw e10;
            }
        } else {
            throw new IllegalArgumentException(d.d("byteCount < 0: ", j8).toString());
        }
    }
}
