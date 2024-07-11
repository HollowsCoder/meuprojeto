package w9;

import java.nio.ByteBuffer;
import z8.g;

public final class u implements h {

    /* renamed from: o  reason: collision with root package name */
    public final f f9358o = new f();

    /* renamed from: p  reason: collision with root package name */
    public boolean f9359p;

    /* renamed from: q  reason: collision with root package name */
    public final z f9360q;

    public u(z zVar) {
        g.f(zVar, "sink");
        this.f9360q = zVar;
    }

    public final void H(f fVar, long j8) {
        g.f(fVar, "source");
        if (!this.f9359p) {
            this.f9358o.H(fVar, j8);
            P();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final long N(b0 b0Var) {
        long j8 = 0;
        while (true) {
            p pVar = (p) b0Var;
            long w = pVar.w(this.f9358o, (long) 8192);
            if (w == -1) {
                return j8;
            }
            j8 += w;
            P();
        }
    }

    public final h P() {
        if (!this.f9359p) {
            f fVar = this.f9358o;
            long j8 = fVar.j();
            if (j8 > 0) {
                this.f9360q.H(fVar, j8);
            }
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final h Y(String str) {
        g.f(str, "string");
        if (!this.f9359p) {
            this.f9358o.g0(str);
            P();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final h Z(long j8) {
        if (!this.f9359p) {
            this.f9358o.S(j8);
            P();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final void close() {
        z zVar = this.f9360q;
        if (!this.f9359p) {
            try {
                f fVar = this.f9358o;
                long j8 = fVar.f9325p;
                if (j8 > 0) {
                    zVar.H(fVar, j8);
                }
                th = null;
            } catch (Throwable th) {
                th = th;
            }
            try {
                zVar.close();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                }
            }
            this.f9359p = true;
            if (th != null) {
                throw th;
            }
        }
    }

    public final f e() {
        return this.f9358o;
    }

    public final h e0(j jVar) {
        g.f(jVar, "byteString");
        if (!this.f9359p) {
            this.f9358o.J(jVar);
            P();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final void flush() {
        if (!this.f9359p) {
            f fVar = this.f9358o;
            long j8 = fVar.f9325p;
            int i10 = (j8 > 0 ? 1 : (j8 == 0 ? 0 : -1));
            z zVar = this.f9360q;
            if (i10 > 0) {
                zVar.H(fVar, j8);
            }
            zVar.flush();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final c0 h() {
        return this.f9360q.h();
    }

    public final boolean isOpen() {
        return !this.f9359p;
    }

    public final h p(long j8) {
        if (!this.f9359p) {
            this.f9358o.T(j8);
            P();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final String toString() {
        return "buffer(" + this.f9360q + ')';
    }

    public final int write(ByteBuffer byteBuffer) {
        g.f(byteBuffer, "source");
        if (!this.f9359p) {
            int write = this.f9358o.write(byteBuffer);
            P();
            return write;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final h write(byte[] bArr) {
        g.f(bArr, "source");
        if (!this.f9359p) {
            f fVar = this.f9358o;
            fVar.getClass();
            fVar.write(bArr, 0, bArr.length);
            P();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final h write(byte[] bArr, int i10, int i11) {
        g.f(bArr, "source");
        if (!this.f9359p) {
            this.f9358o.write(bArr, i10, i11);
            P();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final h writeByte(int i10) {
        if (!this.f9359p) {
            this.f9358o.M(i10);
            P();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final h writeInt(int i10) {
        if (!this.f9359p) {
            this.f9358o.U(i10);
            P();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final h writeShort(int i10) {
        if (!this.f9359p) {
            this.f9358o.V(i10);
            P();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }
}
