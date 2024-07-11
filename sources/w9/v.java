package w9;

import b0.d;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import n.e;
import p9.u;
import z8.g;

public final class v implements i {

    /* renamed from: o  reason: collision with root package name */
    public final f f9361o = new f();

    /* renamed from: p  reason: collision with root package name */
    public boolean f9362p;

    /* renamed from: q  reason: collision with root package name */
    public final b0 f9363q;

    public v(b0 b0Var) {
        g.f(b0Var, "source");
        this.f9363q = b0Var;
    }

    public final int A(r rVar) {
        g.f(rVar, "options");
        if (!this.f9362p) {
            while (true) {
                f fVar = this.f9361o;
                int b10 = x9.a.b(fVar, rVar, true);
                if (b10 == -2) {
                    if (this.f9363q.w(fVar, (long) 8192) == -1) {
                        break;
                    }
                } else if (b10 != -1) {
                    fVar.skip((long) rVar.f9348o[b10].k());
                    return b10;
                }
            }
            return -1;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final long B(f fVar) {
        f fVar2;
        long j8 = 0;
        while (true) {
            b0 b0Var = this.f9363q;
            fVar2 = this.f9361o;
            if (b0Var.w(fVar2, (long) 8192) == -1) {
                break;
            }
            long j10 = fVar2.j();
            if (j10 > 0) {
                j8 += j10;
                fVar.H(fVar2, j10);
            }
        }
        long j11 = fVar2.f9325p;
        if (j11 <= 0) {
            return j8;
        }
        long j12 = j8 + j11;
        fVar.H(fVar2, j11);
        return j12;
    }

    public final String D() {
        return R(Long.MAX_VALUE);
    }

    public final boolean F() {
        if (!this.f9362p) {
            f fVar = this.f9361o;
            if (fVar.F()) {
                if (this.f9363q.w(fVar, (long) 8192) == -1) {
                    return true;
                }
            }
            return false;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final long O(j jVar) {
        g.f(jVar, "targetBytes");
        if (!this.f9362p) {
            long j8 = 0;
            while (true) {
                f fVar = this.f9361o;
                long s10 = fVar.s(j8, jVar);
                if (s10 != -1) {
                    return s10;
                }
                long j10 = fVar.f9325p;
                if (this.f9363q.w(fVar, (long) 8192) == -1) {
                    return -1;
                }
                j8 = Math.max(j8, j10);
            }
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    public final String R(long j8) {
        boolean z;
        long j10;
        long j11 = j8;
        if (j11 >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (j11 == Long.MAX_VALUE) {
                j10 = Long.MAX_VALUE;
            } else {
                j10 = j11 + 1;
            }
            byte b10 = (byte) 10;
            long a10 = a(b10, 0, j10);
            int i10 = (a10 > -1 ? 1 : (a10 == -1 ? 0 : -1));
            f fVar = this.f9361o;
            if (i10 != 0) {
                return x9.a.a(fVar, a10);
            }
            if (j10 < Long.MAX_VALUE && v(j10) && fVar.n(j10 - 1) == ((byte) 13) && v(1 + j10) && fVar.n(j10) == b10) {
                return x9.a.a(fVar, j10);
            }
            f fVar2 = new f();
            fVar.l(fVar2, 0, Math.min((long) 32, fVar.f9325p));
            throw new EOFException("\\n not found: limit=" + Math.min(fVar.f9325p, j11) + " content=" + fVar2.u().l() + "…");
        }
        throw new IllegalArgumentException(d.d("limit < 0: ", j11).toString());
    }

    public final void X(long j8) {
        if (!v(j8)) {
            throw new EOFException();
        }
    }

    public final long a(byte b10, long j8, long j10) {
        boolean z = true;
        if (!this.f9362p) {
            long j11 = 0;
            if (j10 < 0) {
                z = false;
            }
            if (z) {
                while (j11 < j10) {
                    long r5 = this.f9361o.r(b10, j11, j10);
                    if (r5 != -1) {
                        return r5;
                    }
                    f fVar = this.f9361o;
                    long j12 = fVar.f9325p;
                    if (j12 >= j10) {
                        return -1;
                    }
                    if (this.f9363q.w(fVar, (long) 8192) == -1) {
                        return -1;
                    }
                    j11 = Math.max(j11, j12);
                }
                return -1;
            }
            throw new IllegalArgumentException(d.d("fromIndex=0 toIndex=", j10).toString());
        }
        throw new IllegalStateException("closed".toString());
    }

    public final v b() {
        return e.o(new t(this));
    }

    public final boolean c(long j8, j jVar) {
        g.f(jVar, "bytes");
        byte[] bArr = jVar.f9331q;
        int length = bArr.length;
        if (!this.f9362p) {
            if (j8 >= 0 && length >= 0 && bArr.length - 0 >= length) {
                int i10 = 0;
                while (i10 < length) {
                    long j10 = ((long) i10) + j8;
                    if (v(1 + j10) && this.f9361o.n(j10) == bArr[0 + i10]) {
                        i10++;
                    }
                }
                return true;
            }
            return false;
        }
        throw new IllegalStateException("closed".toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long c0() {
        /*
            r6 = this;
            r0 = 1
            r6.X(r0)
            r0 = 0
        L_0x0006:
            int r1 = r0 + 1
            long r2 = (long) r1
            boolean r2 = r6.v(r2)
            w9.f r3 = r6.f9361o
            if (r2 == 0) goto L_0x0057
            long r4 = (long) r0
            byte r2 = r3.n(r4)
            r4 = 48
            byte r4 = (byte) r4
            if (r2 < r4) goto L_0x0020
            r4 = 57
            byte r4 = (byte) r4
            if (r2 <= r4) goto L_0x0035
        L_0x0020:
            r4 = 97
            byte r4 = (byte) r4
            if (r2 < r4) goto L_0x002a
            r4 = 102(0x66, float:1.43E-43)
            byte r4 = (byte) r4
            if (r2 <= r4) goto L_0x0035
        L_0x002a:
            r4 = 65
            byte r4 = (byte) r4
            if (r2 < r4) goto L_0x0037
            r4 = 70
            byte r4 = (byte) r4
            if (r2 <= r4) goto L_0x0035
            goto L_0x0037
        L_0x0035:
            r0 = r1
            goto L_0x0006
        L_0x0037:
            if (r0 == 0) goto L_0x003a
            goto L_0x0057
        L_0x003a:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            r1 = 16
            p9.u.e(r1)
            p9.u.e(r1)
            java.lang.String r1 = java.lang.Integer.toString(r2, r1)
            java.lang.String r2 = "java.lang.Integer.toStri…(this, checkRadix(radix))"
            z8.g.e(r1, r2)
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            java.lang.String r1 = r2.concat(r1)
            r0.<init>(r1)
            throw r0
        L_0x0057:
            long r0 = r3.c0()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: w9.v.c0():long");
    }

    public final void close() {
        if (!this.f9362p) {
            this.f9362p = true;
            this.f9363q.close();
            this.f9361o.c();
        }
    }

    public final long d() {
        f fVar;
        int i10;
        X(1);
        long j8 = 0;
        while (true) {
            long j10 = j8 + 1;
            boolean v10 = v(j10);
            fVar = this.f9361o;
            if (!v10) {
                break;
            }
            byte n10 = fVar.n(j8);
            if ((n10 >= ((byte) 48) && n10 <= ((byte) 57)) || (j8 == 0 && n10 == ((byte) 45))) {
                j8 = j10;
            } else if (i10 == 0) {
                u.e(16);
                u.e(16);
                String num = Integer.toString(n10, 16);
                g.e(num, "java.lang.Integer.toStri…(this, checkRadix(radix))");
                throw new NumberFormatException("Expected leading [0-9] or '-' character but was 0x".concat(num));
            }
        }
        return fVar.x();
    }

    public final String d0(Charset charset) {
        f fVar = this.f9361o;
        fVar.N(this.f9363q);
        return fVar.y(fVar.f9325p, charset);
    }

    public final f e() {
        return this.f9361o;
    }

    public final int f() {
        X(4);
        int readInt = this.f9361o.readInt();
        return ((readInt & 255) << 24) | ((-16777216 & readInt) >>> 24) | ((16711680 & readInt) >>> 8) | ((65280 & readInt) << 8);
    }

    public final InputStream f0() {
        return new a(this);
    }

    public final c0 h() {
        return this.f9363q.h();
    }

    public final boolean isOpen() {
        return !this.f9362p;
    }

    public final j q(long j8) {
        X(j8);
        return this.f9361o.q(j8);
    }

    public final int read(ByteBuffer byteBuffer) {
        g.f(byteBuffer, "sink");
        f fVar = this.f9361o;
        if (fVar.f9325p == 0) {
            if (this.f9363q.w(fVar, (long) 8192) == -1) {
                return -1;
            }
        }
        return fVar.read(byteBuffer);
    }

    public final byte readByte() {
        X(1);
        return this.f9361o.readByte();
    }

    public final int readInt() {
        X(4);
        return this.f9361o.readInt();
    }

    public final short readShort() {
        X(2);
        return this.f9361o.readShort();
    }

    public final void skip(long j8) {
        if (!this.f9362p) {
            while (j8 > 0) {
                f fVar = this.f9361o;
                if (fVar.f9325p == 0) {
                    if (this.f9363q.w(fVar, (long) 8192) == -1) {
                        throw new EOFException();
                    }
                }
                long min = Math.min(j8, fVar.f9325p);
                fVar.skip(min);
                j8 -= min;
            }
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final String toString() {
        return "buffer(" + this.f9363q + ')';
    }

    public final boolean v(long j8) {
        boolean z;
        f fVar;
        if (j8 >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException(d.d("byteCount < 0: ", j8).toString());
        } else if (!this.f9362p) {
            do {
                fVar = this.f9361o;
                if (fVar.f9325p >= j8) {
                    return true;
                }
            } while (this.f9363q.w(fVar, (long) 8192) != -1);
            return false;
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    public final long w(f fVar, long j8) {
        boolean z;
        g.f(fVar, "sink");
        if (j8 >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException(d.d("byteCount < 0: ", j8).toString());
        } else if (!this.f9362p) {
            f fVar2 = this.f9361o;
            if (fVar2.f9325p == 0) {
                if (this.f9363q.w(fVar2, (long) 8192) == -1) {
                    return -1;
                }
            }
            return fVar2.w(fVar, Math.min(j8, fVar2.f9325p));
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    public static final class a extends InputStream {

        /* renamed from: o  reason: collision with root package name */
        public final /* synthetic */ v f9364o;

        public a(v vVar) {
            this.f9364o = vVar;
        }

        public final int available() {
            v vVar = this.f9364o;
            if (!vVar.f9362p) {
                return (int) Math.min(vVar.f9361o.f9325p, (long) Integer.MAX_VALUE);
            }
            throw new IOException("closed");
        }

        public final void close() {
            this.f9364o.close();
        }

        public final int read() {
            v vVar = this.f9364o;
            if (!vVar.f9362p) {
                f fVar = vVar.f9361o;
                if (fVar.f9325p == 0 && vVar.f9363q.w(fVar, (long) 8192) == -1) {
                    return -1;
                }
                return vVar.f9361o.readByte() & 255;
            }
            throw new IOException("closed");
        }

        public final String toString() {
            return this.f9364o + ".inputStream()";
        }

        public final int read(byte[] bArr, int i10, int i11) {
            g.f(bArr, "data");
            v vVar = this.f9364o;
            if (!vVar.f9362p) {
                u.d((long) bArr.length, (long) i10, (long) i11);
                f fVar = vVar.f9361o;
                if (fVar.f9325p == 0 && vVar.f9363q.w(fVar, (long) 8192) == -1) {
                    return -1;
                }
                return vVar.f9361o.read(bArr, i10, i11);
            }
            throw new IOException("closed");
        }
    }
}
