package w9;

import com.karumi.dexter.BuildConfig;
import f9.d;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import p9.u;
import z8.g;

public final class f implements i, h, Cloneable, ByteChannel {

    /* renamed from: o  reason: collision with root package name */
    public w f9324o;

    /* renamed from: p  reason: collision with root package name */
    public long f9325p;

    public static final class a extends InputStream {

        /* renamed from: o  reason: collision with root package name */
        public final /* synthetic */ f f9326o;

        public a(f fVar) {
            this.f9326o = fVar;
        }

        public final int available() {
            return (int) Math.min(this.f9326o.f9325p, (long) Integer.MAX_VALUE);
        }

        public final void close() {
        }

        public final int read() {
            f fVar = this.f9326o;
            if (fVar.f9325p > 0) {
                return fVar.readByte() & 255;
            }
            return -1;
        }

        public final int read(byte[] bArr, int i10, int i11) {
            g.f(bArr, "sink");
            return this.f9326o.read(bArr, i10, i11);
        }

        public final String toString() {
            return this.f9326o + ".inputStream()";
        }
    }

    public final int A(r rVar) {
        g.f(rVar, "options");
        int b10 = x9.a.b(this, rVar, false);
        if (b10 == -1) {
            return -1;
        }
        skip((long) rVar.f9348o[b10].k());
        return b10;
    }

    public final long B(f fVar) {
        long j8 = this.f9325p;
        if (j8 > 0) {
            fVar.H(this, j8);
        }
        return j8;
    }

    public final String C(long j8) {
        return y(j8, f9.a.f4927b);
    }

    public final String D() {
        return R(Long.MAX_VALUE);
    }

    public final int E() {
        byte b10;
        int i10;
        byte b11;
        if (this.f9325p != 0) {
            byte n10 = n(0);
            int i11 = 1;
            if ((n10 & 128) == 0) {
                b11 = n10 & Byte.MAX_VALUE;
                b10 = 0;
                i10 = 1;
            } else if ((n10 & 224) == 192) {
                b11 = n10 & 31;
                i10 = 2;
                b10 = 128;
            } else if ((n10 & 240) == 224) {
                b11 = n10 & 15;
                i10 = 3;
                b10 = 2048;
            } else if ((n10 & 248) == 240) {
                b11 = n10 & 7;
                i10 = 4;
                b10 = 65536;
            } else {
                skip(1);
                return 65533;
            }
            long j8 = (long) i10;
            if (this.f9325p >= j8) {
                while (i11 < i10) {
                    long j10 = (long) i11;
                    byte n11 = n(j10);
                    if ((n11 & 192) == 128) {
                        b11 = (b11 << 6) | (n11 & 63);
                        i11++;
                    } else {
                        skip(j10);
                        return 65533;
                    }
                }
                skip(j8);
                if (b11 > 1114111) {
                    return 65533;
                }
                if ((55296 <= b11 && 57343 >= b11) || b11 < b10) {
                    return 65533;
                }
                return b11;
            }
            throw new EOFException("size < " + i10 + ": " + this.f9325p + " (to read code point prefixed 0x" + u.s(n10) + ')');
        }
        throw new EOFException();
    }

    public final boolean F() {
        return this.f9325p == 0;
    }

    public final j G(int i10) {
        if (i10 == 0) {
            return j.f9328r;
        }
        u.d(this.f9325p, 0, (long) i10);
        w wVar = this.f9324o;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i10) {
            g.c(wVar);
            int i14 = wVar.f9367c;
            int i15 = wVar.f9366b;
            if (i14 != i15) {
                i12 += i14 - i15;
                i13++;
                wVar = wVar.f9369f;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        byte[][] bArr = new byte[i13][];
        int[] iArr = new int[(i13 * 2)];
        w wVar2 = this.f9324o;
        int i16 = 0;
        while (i11 < i10) {
            g.c(wVar2);
            bArr[i16] = wVar2.f9365a;
            i11 += wVar2.f9367c - wVar2.f9366b;
            iArr[i16] = Math.min(i11, i10);
            iArr[i16 + i13] = wVar2.f9366b;
            wVar2.d = true;
            i16++;
            wVar2 = wVar2.f9369f;
        }
        return new y(bArr, iArr);
    }

    public final void H(f fVar, long j8) {
        boolean z;
        boolean z10;
        int i10;
        w wVar;
        boolean z11;
        w wVar2;
        int i11;
        g.f(fVar, "source");
        if (fVar != this) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            u.d(fVar.f9325p, 0, j8);
            while (j8 > 0) {
                w wVar3 = fVar.f9324o;
                g.c(wVar3);
                int i12 = wVar3.f9367c;
                w wVar4 = fVar.f9324o;
                g.c(wVar4);
                if (j8 < ((long) (i12 - wVar4.f9366b))) {
                    w wVar5 = this.f9324o;
                    if (wVar5 != null) {
                        wVar = wVar5.f9370g;
                    } else {
                        wVar = null;
                    }
                    if (wVar != null && wVar.f9368e) {
                        long j10 = ((long) wVar.f9367c) + j8;
                        if (wVar.d) {
                            i11 = 0;
                        } else {
                            i11 = wVar.f9366b;
                        }
                        if (j10 - ((long) i11) <= ((long) 8192)) {
                            w wVar6 = fVar.f9324o;
                            g.c(wVar6);
                            wVar6.d(wVar, (int) j8);
                            fVar.f9325p -= j8;
                            this.f9325p += j8;
                            return;
                        }
                    }
                    w wVar7 = fVar.f9324o;
                    g.c(wVar7);
                    int i13 = (int) j8;
                    if (i13 <= 0 || i13 > wVar7.f9367c - wVar7.f9366b) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    if (z11) {
                        if (i13 >= 1024) {
                            wVar2 = wVar7.c();
                        } else {
                            wVar2 = x.b();
                            int i14 = wVar7.f9366b;
                            d.N(0, i14, i14 + i13, wVar7.f9365a, wVar2.f9365a);
                        }
                        wVar2.f9367c = wVar2.f9366b + i13;
                        wVar7.f9366b += i13;
                        w wVar8 = wVar7.f9370g;
                        g.c(wVar8);
                        wVar8.b(wVar2);
                        fVar.f9324o = wVar2;
                    } else {
                        throw new IllegalArgumentException("byteCount out of range".toString());
                    }
                }
                w wVar9 = fVar.f9324o;
                g.c(wVar9);
                long j11 = (long) (wVar9.f9367c - wVar9.f9366b);
                fVar.f9324o = wVar9.a();
                w wVar10 = this.f9324o;
                if (wVar10 == null) {
                    this.f9324o = wVar9;
                    wVar9.f9370g = wVar9;
                    wVar9.f9369f = wVar9;
                } else {
                    w wVar11 = wVar10.f9370g;
                    g.c(wVar11);
                    wVar11.b(wVar9);
                    w wVar12 = wVar9.f9370g;
                    if (wVar12 != wVar9) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        g.c(wVar12);
                        if (wVar12.f9368e) {
                            int i15 = wVar9.f9367c - wVar9.f9366b;
                            w wVar13 = wVar9.f9370g;
                            g.c(wVar13);
                            int i16 = 8192 - wVar13.f9367c;
                            w wVar14 = wVar9.f9370g;
                            g.c(wVar14);
                            if (wVar14.d) {
                                i10 = 0;
                            } else {
                                w wVar15 = wVar9.f9370g;
                                g.c(wVar15);
                                i10 = wVar15.f9366b;
                            }
                            if (i15 <= i16 + i10) {
                                w wVar16 = wVar9.f9370g;
                                g.c(wVar16);
                                wVar9.d(wVar16, i15);
                                wVar9.a();
                                x.a(wVar9);
                            }
                        }
                    } else {
                        throw new IllegalStateException("cannot compact".toString());
                    }
                }
                fVar.f9325p -= j11;
                this.f9325p += j11;
                j8 -= j11;
            }
            return;
        }
        throw new IllegalArgumentException("source == this".toString());
    }

    public final w I(int i10) {
        boolean z = true;
        if (i10 < 1 || i10 > 8192) {
            z = false;
        }
        if (z) {
            w wVar = this.f9324o;
            if (wVar == null) {
                w b10 = x.b();
                this.f9324o = b10;
                b10.f9370g = b10;
                b10.f9369f = b10;
                return b10;
            }
            w wVar2 = wVar.f9370g;
            g.c(wVar2);
            if (wVar2.f9367c + i10 <= 8192 && wVar2.f9368e) {
                return wVar2;
            }
            w b11 = x.b();
            wVar2.b(b11);
            return b11;
        }
        throw new IllegalArgumentException("unexpected capacity".toString());
    }

    public final void J(j jVar) {
        g.f(jVar, "byteString");
        jVar.t(this, jVar.k());
    }

    public final void M(int i10) {
        w I = I(1);
        int i11 = I.f9367c;
        I.f9367c = i11 + 1;
        I.f9365a[i11] = (byte) i10;
        this.f9325p++;
    }

    public final long N(b0 b0Var) {
        g.f(b0Var, "source");
        long j8 = 0;
        while (true) {
            long w = b0Var.w(this, (long) 8192);
            if (w == -1) {
                return j8;
            }
            j8 += w;
        }
    }

    public final long O(j jVar) {
        g.f(jVar, "targetBytes");
        return s(0, jVar);
    }

    public final h P() {
        return this;
    }

    public final String R(long j8) {
        boolean z;
        if (j8 >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            long j10 = Long.MAX_VALUE;
            if (j8 != Long.MAX_VALUE) {
                j10 = j8 + 1;
            }
            byte b10 = (byte) 10;
            long r5 = r(b10, 0, j10);
            if (r5 != -1) {
                return x9.a.a(this, r5);
            }
            if (j10 < this.f9325p && n(j10 - 1) == ((byte) 13) && n(j10) == b10) {
                return x9.a.a(this, j10);
            }
            f fVar = new f();
            l(fVar, 0, Math.min((long) 32, this.f9325p));
            throw new EOFException("\\n not found: limit=" + Math.min(this.f9325p, j8) + " content=" + fVar.u().l() + 8230);
        }
        throw new IllegalArgumentException(b0.d.d("limit < 0: ", j8).toString());
    }

    public final f S(long j8) {
        boolean z;
        byte[] bArr;
        int i10 = (j8 > 0 ? 1 : (j8 == 0 ? 0 : -1));
        if (i10 == 0) {
            M(48);
        } else {
            int i11 = 1;
            if (i10 < 0) {
                j8 = -j8;
                if (j8 < 0) {
                    g0("-9223372036854775808");
                } else {
                    z = true;
                }
            } else {
                z = false;
            }
            if (j8 < 100000000) {
                if (j8 < 10000) {
                    if (j8 < 100) {
                        if (j8 >= 10) {
                            i11 = 2;
                        }
                    } else if (j8 < 1000) {
                        i11 = 3;
                    } else {
                        i11 = 4;
                    }
                } else if (j8 < 1000000) {
                    if (j8 < 100000) {
                        i11 = 5;
                    } else {
                        i11 = 6;
                    }
                } else if (j8 < 10000000) {
                    i11 = 7;
                } else {
                    i11 = 8;
                }
            } else if (j8 < 1000000000000L) {
                if (j8 < 10000000000L) {
                    if (j8 < 1000000000) {
                        i11 = 9;
                    } else {
                        i11 = 10;
                    }
                } else if (j8 < 100000000000L) {
                    i11 = 11;
                } else {
                    i11 = 12;
                }
            } else if (j8 < 1000000000000000L) {
                if (j8 < 10000000000000L) {
                    i11 = 13;
                } else if (j8 < 100000000000000L) {
                    i11 = 14;
                } else {
                    i11 = 15;
                }
            } else if (j8 < 100000000000000000L) {
                if (j8 < 10000000000000000L) {
                    i11 = 16;
                } else {
                    i11 = 17;
                }
            } else if (j8 < 1000000000000000000L) {
                i11 = 18;
            } else {
                i11 = 19;
            }
            if (z) {
                i11++;
            }
            w I = I(i11);
            int i12 = I.f9367c + i11;
            while (true) {
                int i13 = (j8 > 0 ? 1 : (j8 == 0 ? 0 : -1));
                bArr = I.f9365a;
                if (i13 == 0) {
                    break;
                }
                long j10 = (long) 10;
                i12--;
                bArr[i12] = x9.a.f9522a[(int) (j8 % j10)];
                j8 /= j10;
            }
            if (z) {
                bArr[i12 - 1] = (byte) 45;
            }
            I.f9367c += i11;
            this.f9325p += (long) i11;
        }
        return this;
    }

    public final f T(long j8) {
        if (j8 == 0) {
            M(48);
        } else {
            long j10 = (j8 >>> 1) | j8;
            long j11 = j10 | (j10 >>> 2);
            long j12 = j11 | (j11 >>> 4);
            long j13 = j12 | (j12 >>> 8);
            long j14 = j13 | (j13 >>> 16);
            long j15 = j14 | (j14 >>> 32);
            long j16 = j15 - ((j15 >>> 1) & 6148914691236517205L);
            long j17 = ((j16 >>> 2) & 3689348814741910323L) + (j16 & 3689348814741910323L);
            long j18 = ((j17 >>> 4) + j17) & 1085102592571150095L;
            long j19 = j18 + (j18 >>> 8);
            long j20 = j19 + (j19 >>> 16);
            int i10 = (int) ((((j20 & 63) + ((j20 >>> 32) & 63)) + ((long) 3)) / ((long) 4));
            w I = I(i10);
            int i11 = I.f9367c;
            for (int i12 = (i11 + i10) - 1; i12 >= i11; i12--) {
                I.f9365a[i12] = x9.a.f9522a[(int) (15 & j8)];
                j8 >>>= 4;
            }
            I.f9367c += i10;
            this.f9325p += (long) i10;
        }
        return this;
    }

    public final void U(int i10) {
        w I = I(4);
        int i11 = I.f9367c;
        int i12 = i11 + 1;
        byte[] bArr = I.f9365a;
        bArr[i11] = (byte) ((i10 >>> 24) & 255);
        int i13 = i12 + 1;
        bArr[i12] = (byte) ((i10 >>> 16) & 255);
        int i14 = i13 + 1;
        bArr[i13] = (byte) ((i10 >>> 8) & 255);
        bArr[i14] = (byte) (i10 & 255);
        I.f9367c = i14 + 1;
        this.f9325p += 4;
    }

    public final void V(int i10) {
        w I = I(2);
        int i11 = I.f9367c;
        int i12 = i11 + 1;
        byte[] bArr = I.f9365a;
        bArr[i11] = (byte) ((i10 >>> 8) & 255);
        bArr[i12] = (byte) (i10 & 255);
        I.f9367c = i12 + 1;
        this.f9325p += 2;
    }

    public final void X(long j8) {
        if (this.f9325p < j8) {
            throw new EOFException();
        }
    }

    public final /* bridge */ /* synthetic */ h Y(String str) {
        g0(str);
        return this;
    }

    public final /* bridge */ /* synthetic */ h Z(long j8) {
        S(j8);
        return this;
    }

    public final void c() {
        skip(this.f9325p);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007f, code lost:
        if (r7 != r8) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0081, code lost:
        r13.f9324o = r6.a();
        w9.x.a(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x008b, code lost:
        r6.f9366b = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x008d, code lost:
        if (r1 != false) goto L_0x0093;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x006f A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long c0() {
        /*
            r13 = this;
            long r0 = r13.f9325p
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x009a
            r0 = 0
            r1 = r0
            r4 = r2
        L_0x000b:
            w9.w r6 = r13.f9324o
            z8.g.c(r6)
            int r7 = r6.f9366b
            int r8 = r6.f9367c
        L_0x0014:
            if (r7 >= r8) goto L_0x007f
            byte[] r9 = r6.f9365a
            byte r9 = r9[r7]
            r10 = 48
            byte r10 = (byte) r10
            if (r9 < r10) goto L_0x0027
            r11 = 57
            byte r11 = (byte) r11
            if (r9 > r11) goto L_0x0027
            int r10 = r9 - r10
            goto L_0x0040
        L_0x0027:
            r10 = 97
            byte r10 = (byte) r10
            if (r9 < r10) goto L_0x0032
            r11 = 102(0x66, float:1.43E-43)
            byte r11 = (byte) r11
            if (r9 > r11) goto L_0x0032
            goto L_0x003c
        L_0x0032:
            r10 = 65
            byte r10 = (byte) r10
            if (r9 < r10) goto L_0x006b
            r11 = 70
            byte r11 = (byte) r11
            if (r9 > r11) goto L_0x006b
        L_0x003c:
            int r10 = r9 - r10
            int r10 = r10 + 10
        L_0x0040:
            r11 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r11 = r11 & r4
            int r11 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r11 != 0) goto L_0x0050
            r9 = 4
            long r4 = r4 << r9
            long r9 = (long) r10
            long r4 = r4 | r9
            int r7 = r7 + 1
            int r0 = r0 + 1
            goto L_0x0014
        L_0x0050:
            w9.f r0 = new w9.f
            r0.<init>()
            r0.T(r4)
            r0.M(r9)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.String r0 = r0.z()
            java.lang.String r2 = "Number too large: "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        L_0x006b:
            if (r0 == 0) goto L_0x006f
            r1 = 1
            goto L_0x007f
        L_0x006f:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.String r1 = p9.u.s(r9)
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            java.lang.String r1 = r2.concat(r1)
            r0.<init>(r1)
            throw r0
        L_0x007f:
            if (r7 != r8) goto L_0x008b
            w9.w r7 = r6.a()
            r13.f9324o = r7
            w9.x.a(r6)
            goto L_0x008d
        L_0x008b:
            r6.f9366b = r7
        L_0x008d:
            if (r1 != 0) goto L_0x0093
            w9.w r6 = r13.f9324o
            if (r6 != 0) goto L_0x000b
        L_0x0093:
            long r1 = r13.f9325p
            long r6 = (long) r0
            long r1 = r1 - r6
            r13.f9325p = r1
            return r4
        L_0x009a:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: w9.f.c0():long");
    }

    public final void close() {
    }

    /* renamed from: d */
    public final f clone() {
        f fVar = new f();
        if (this.f9325p != 0) {
            w wVar = this.f9324o;
            g.c(wVar);
            w c10 = wVar.c();
            fVar.f9324o = c10;
            c10.f9370g = c10;
            c10.f9369f = c10;
            for (w wVar2 = wVar.f9369f; wVar2 != wVar; wVar2 = wVar2.f9369f) {
                w wVar3 = c10.f9370g;
                g.c(wVar3);
                g.c(wVar2);
                wVar3.b(wVar2.c());
            }
            fVar.f9325p = this.f9325p;
        }
        return fVar;
    }

    public final String d0(Charset charset) {
        return y(this.f9325p, charset);
    }

    public final f e() {
        return this;
    }

    public final /* bridge */ /* synthetic */ h e0(j jVar) {
        J(jVar);
        return this;
    }

    /* JADX WARNING: type inference failed for: r19v0, types: [java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            if (r0 != r1) goto L_0x0009
        L_0x0006:
            r2 = 1
            goto L_0x0078
        L_0x0009:
            boolean r3 = r1 instanceof w9.f
            if (r3 != 0) goto L_0x0010
        L_0x000d:
            r2 = 0
            goto L_0x0078
        L_0x0010:
            long r5 = r0.f9325p
            w9.f r1 = (w9.f) r1
            long r7 = r1.f9325p
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 == 0) goto L_0x001b
            goto L_0x000d
        L_0x001b:
            r7 = 0
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 != 0) goto L_0x0022
            goto L_0x0006
        L_0x0022:
            w9.w r3 = r0.f9324o
            z8.g.c(r3)
            w9.w r1 = r1.f9324o
            z8.g.c(r1)
            int r5 = r3.f9366b
            int r6 = r1.f9366b
            r9 = r7
        L_0x0031:
            long r11 = r0.f9325p
            int r11 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r11 >= 0) goto L_0x0006
            int r11 = r3.f9367c
            int r11 = r11 - r5
            int r12 = r1.f9367c
            int r12 = r12 - r6
            int r11 = java.lang.Math.min(r11, r12)
            long r11 = (long) r11
            r13 = r7
        L_0x0043:
            int r15 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r15 >= 0) goto L_0x005d
            int r15 = r5 + 1
            byte[] r2 = r3.f9365a
            byte r2 = r2[r5]
            int r5 = r6 + 1
            byte[] r4 = r1.f9365a
            byte r4 = r4[r6]
            if (r2 == r4) goto L_0x0056
            goto L_0x000d
        L_0x0056:
            r16 = 1
            long r13 = r13 + r16
            r6 = r5
            r5 = r15
            goto L_0x0043
        L_0x005d:
            int r2 = r3.f9367c
            if (r5 != r2) goto L_0x006a
            w9.w r2 = r3.f9369f
            z8.g.c(r2)
            int r3 = r2.f9366b
            r5 = r3
            r3 = r2
        L_0x006a:
            int r2 = r1.f9367c
            if (r6 != r2) goto L_0x0076
            w9.w r1 = r1.f9369f
            z8.g.c(r1)
            int r2 = r1.f9366b
            r6 = r2
        L_0x0076:
            long r9 = r9 + r11
            goto L_0x0031
        L_0x0078:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: w9.f.equals(java.lang.Object):boolean");
    }

    public final InputStream f0() {
        return new a(this);
    }

    public final void flush() {
    }

    public final void g0(String str) {
        g.f(str, "string");
        h0(str, 0, str.length());
    }

    public final c0 h() {
        return c0.d;
    }

    public final void h0(String str, int i10, int i11) {
        boolean z;
        boolean z10;
        boolean z11;
        long j8;
        long j10;
        char c10;
        char charAt;
        g.f(str, "string");
        if (i10 >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i11 >= i10) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                if (i11 <= str.length()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    while (i10 < i11) {
                        char charAt2 = str.charAt(i10);
                        if (charAt2 < 128) {
                            w I = I(1);
                            int i12 = I.f9367c - i10;
                            int min = Math.min(i11, 8192 - i12);
                            int i13 = i10 + 1;
                            byte[] bArr = I.f9365a;
                            bArr[i10 + i12] = (byte) charAt2;
                            while (true) {
                                i10 = i13;
                                if (i10 >= min || (charAt = str.charAt(i10)) >= 128) {
                                    int i14 = I.f9367c;
                                    int i15 = (i12 + i10) - i14;
                                    I.f9367c = i14 + i15;
                                    this.f9325p += (long) i15;
                                } else {
                                    i13 = i10 + 1;
                                    bArr[i10 + i12] = (byte) charAt;
                                }
                            }
                            int i142 = I.f9367c;
                            int i152 = (i12 + i10) - i142;
                            I.f9367c = i142 + i152;
                            this.f9325p += (long) i152;
                        } else {
                            if (charAt2 < 2048) {
                                w I2 = I(2);
                                int i16 = I2.f9367c;
                                byte[] bArr2 = I2.f9365a;
                                bArr2[i16] = (byte) ((charAt2 >> 6) | 192);
                                bArr2[i16 + 1] = (byte) ((charAt2 & '?') | 128);
                                I2.f9367c = i16 + 2;
                                j10 = this.f9325p;
                                j8 = 2;
                            } else if (charAt2 < 55296 || charAt2 > 57343) {
                                w I3 = I(3);
                                int i17 = I3.f9367c;
                                byte[] bArr3 = I3.f9365a;
                                bArr3[i17] = (byte) ((charAt2 >> 12) | 224);
                                bArr3[i17 + 1] = (byte) ((63 & (charAt2 >> 6)) | 128);
                                bArr3[i17 + 2] = (byte) ((charAt2 & '?') | 128);
                                I3.f9367c = i17 + 3;
                                j10 = this.f9325p;
                                j8 = 3;
                            } else {
                                int i18 = i10 + 1;
                                if (i18 < i11) {
                                    c10 = str.charAt(i18);
                                } else {
                                    c10 = 0;
                                }
                                if (charAt2 > 56319 || 56320 > c10 || 57343 < c10) {
                                    M(63);
                                    i10 = i18;
                                } else {
                                    int i19 = (((charAt2 & 1023) << 10) | (c10 & 1023)) + 0;
                                    w I4 = I(4);
                                    int i20 = I4.f9367c;
                                    byte[] bArr4 = I4.f9365a;
                                    bArr4[i20] = (byte) ((i19 >> 18) | 240);
                                    bArr4[i20 + 1] = (byte) (((i19 >> 12) & 63) | 128);
                                    bArr4[i20 + 2] = (byte) (((i19 >> 6) & 63) | 128);
                                    bArr4[i20 + 3] = (byte) ((i19 & 63) | 128);
                                    I4.f9367c = i20 + 4;
                                    this.f9325p += 4;
                                    i10 += 2;
                                }
                            }
                            this.f9325p = j10 + j8;
                            i10++;
                        }
                    }
                    return;
                }
                throw new IllegalArgumentException(("endIndex > string.length: " + i11 + " > " + str.length()).toString());
            }
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i11 + " < " + i10).toString());
        }
        throw new IllegalArgumentException(b0.d.c("beginIndex < 0: ", i10).toString());
    }

    public final int hashCode() {
        w wVar = this.f9324o;
        if (wVar == null) {
            return 0;
        }
        int i10 = 1;
        do {
            int i11 = wVar.f9367c;
            for (int i12 = wVar.f9366b; i12 < i11; i12++) {
                i10 = (i10 * 31) + wVar.f9365a[i12];
            }
            wVar = wVar.f9369f;
            g.c(wVar);
        } while (wVar != this.f9324o);
        return i10;
    }

    public final void i0(int i10) {
        long j8;
        long j10;
        String str;
        if (i10 < 128) {
            M(i10);
            return;
        }
        if (i10 < 2048) {
            w I = I(2);
            int i11 = I.f9367c;
            byte[] bArr = I.f9365a;
            bArr[i11] = (byte) ((i10 >> 6) | 192);
            bArr[i11 + 1] = (byte) ((i10 & 63) | 128);
            I.f9367c = i11 + 2;
            j10 = this.f9325p;
            j8 = 2;
        } else if (55296 <= i10 && 57343 >= i10) {
            M(63);
            return;
        } else if (i10 < 65536) {
            w I2 = I(3);
            int i12 = I2.f9367c;
            byte[] bArr2 = I2.f9365a;
            bArr2[i12] = (byte) ((i10 >> 12) | 224);
            bArr2[i12 + 1] = (byte) (((i10 >> 6) & 63) | 128);
            bArr2[i12 + 2] = (byte) ((i10 & 63) | 128);
            I2.f9367c = i12 + 3;
            j10 = this.f9325p;
            j8 = 3;
        } else if (i10 <= 1114111) {
            w I3 = I(4);
            int i13 = I3.f9367c;
            byte[] bArr3 = I3.f9365a;
            bArr3[i13] = (byte) ((i10 >> 18) | 240);
            bArr3[i13 + 1] = (byte) (((i10 >> 12) & 63) | 128);
            bArr3[i13 + 2] = (byte) (((i10 >> 6) & 63) | 128);
            bArr3[i13 + 3] = (byte) ((i10 & 63) | 128);
            I3.f9367c = i13 + 4;
            j10 = this.f9325p;
            j8 = 4;
        } else {
            StringBuilder sb = new StringBuilder("Unexpected code point: 0x");
            if (i10 != 0) {
                char[] cArr = u.f8110i0;
                int i14 = 0;
                char[] cArr2 = {cArr[(i10 >> 28) & 15], cArr[(i10 >> 24) & 15], cArr[(i10 >> 20) & 15], cArr[(i10 >> 16) & 15], cArr[(i10 >> 12) & 15], cArr[(i10 >> 8) & 15], cArr[(i10 >> 4) & 15], cArr[i10 & 15]};
                while (i14 < 8 && cArr2[i14] == '0') {
                    i14++;
                }
                str = new String(cArr2, i14, 8 - i14);
            } else {
                str = "0";
            }
            sb.append(str);
            throw new IllegalArgumentException(sb.toString());
        }
        this.f9325p = j10 + j8;
    }

    public final boolean isOpen() {
        return true;
    }

    public final long j() {
        long j8 = this.f9325p;
        if (j8 == 0) {
            return 0;
        }
        w wVar = this.f9324o;
        g.c(wVar);
        w wVar2 = wVar.f9370g;
        g.c(wVar2);
        int i10 = wVar2.f9367c;
        if (i10 < 8192 && wVar2.f9368e) {
            j8 -= (long) (i10 - wVar2.f9366b);
        }
        return j8;
    }

    public final void l(f fVar, long j8, long j10) {
        g.f(fVar, "out");
        u.d(this.f9325p, j8, j10);
        if (j10 != 0) {
            fVar.f9325p += j10;
            w wVar = this.f9324o;
            while (true) {
                g.c(wVar);
                long j11 = (long) (wVar.f9367c - wVar.f9366b);
                if (j8 < j11) {
                    break;
                }
                j8 -= j11;
                wVar = wVar.f9369f;
            }
            while (j10 > 0) {
                g.c(wVar);
                w c10 = wVar.c();
                int i10 = c10.f9366b + ((int) j8);
                c10.f9366b = i10;
                c10.f9367c = Math.min(i10 + ((int) j10), c10.f9367c);
                w wVar2 = fVar.f9324o;
                if (wVar2 == null) {
                    c10.f9370g = c10;
                    c10.f9369f = c10;
                    fVar.f9324o = c10;
                } else {
                    w wVar3 = wVar2.f9370g;
                    g.c(wVar3);
                    wVar3.b(c10);
                }
                j10 -= (long) (c10.f9367c - c10.f9366b);
                wVar = wVar.f9369f;
                j8 = 0;
            }
        }
    }

    public final byte n(long j8) {
        u.d(this.f9325p, j8, 1);
        w wVar = this.f9324o;
        if (wVar != null) {
            long j10 = this.f9325p;
            if (j10 - j8 < j8) {
                while (j10 > j8) {
                    wVar = wVar.f9370g;
                    g.c(wVar);
                    j10 -= (long) (wVar.f9367c - wVar.f9366b);
                }
                return wVar.f9365a[(int) ((((long) wVar.f9366b) + j8) - j10)];
            }
            long j11 = 0;
            while (true) {
                int i10 = wVar.f9367c;
                int i11 = wVar.f9366b;
                long j12 = ((long) (i10 - i11)) + j11;
                if (j12 > j8) {
                    return wVar.f9365a[(int) ((((long) i11) + j8) - j11)];
                }
                wVar = wVar.f9369f;
                g.c(wVar);
                j11 = j12;
            }
        } else {
            g.c((Object) null);
            throw null;
        }
    }

    public final /* bridge */ /* synthetic */ h p(long j8) {
        T(j8);
        return this;
    }

    public final j q(long j8) {
        boolean z;
        if (j8 < 0 || j8 > ((long) Integer.MAX_VALUE)) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            throw new IllegalArgumentException(b0.d.d("byteCount: ", j8).toString());
        } else if (this.f9325p < j8) {
            throw new EOFException();
        } else if (j8 < ((long) 4096)) {
            return new j(t(j8));
        } else {
            j G = G((int) j8);
            skip(j8);
            return G;
        }
    }

    public final long r(byte b10, long j8, long j10) {
        boolean z;
        w wVar;
        long j11 = 0;
        if (0 <= j8 && j10 >= j8) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            long j12 = this.f9325p;
            if (j10 > j12) {
                j10 = j12;
            }
            if (j8 == j10 || (wVar = this.f9324o) == null) {
                return -1;
            }
            if (j12 - j8 < j8) {
                while (j12 > j8) {
                    wVar = wVar.f9370g;
                    g.c(wVar);
                    j12 -= (long) (wVar.f9367c - wVar.f9366b);
                }
                while (j12 < j10) {
                    int min = (int) Math.min((long) wVar.f9367c, (((long) wVar.f9366b) + j10) - j12);
                    for (int i10 = (int) ((((long) wVar.f9366b) + j8) - j12); i10 < min; i10++) {
                        if (wVar.f9365a[i10] == b10) {
                            return ((long) (i10 - wVar.f9366b)) + j12;
                        }
                    }
                    j12 += (long) (wVar.f9367c - wVar.f9366b);
                    wVar = wVar.f9369f;
                    g.c(wVar);
                    j8 = j12;
                }
                return -1;
            }
            while (true) {
                long j13 = ((long) (wVar.f9367c - wVar.f9366b)) + j11;
                if (j13 > j8) {
                    break;
                }
                wVar = wVar.f9369f;
                g.c(wVar);
                j11 = j13;
            }
            while (j11 < j10) {
                int min2 = (int) Math.min((long) wVar.f9367c, (((long) wVar.f9366b) + j10) - j11);
                for (int i11 = (int) ((((long) wVar.f9366b) + j8) - j11); i11 < min2; i11++) {
                    if (wVar.f9365a[i11] == b10) {
                        return ((long) (i11 - wVar.f9366b)) + j11;
                    }
                }
                j11 += (long) (wVar.f9367c - wVar.f9366b);
                wVar = wVar.f9369f;
                g.c(wVar);
                j8 = j11;
            }
            return -1;
        }
        throw new IllegalArgumentException(("size=" + this.f9325p + " fromIndex=" + j8 + " toIndex=" + j10).toString());
    }

    public final int read(ByteBuffer byteBuffer) {
        g.f(byteBuffer, "sink");
        w wVar = this.f9324o;
        if (wVar == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), wVar.f9367c - wVar.f9366b);
        byteBuffer.put(wVar.f9365a, wVar.f9366b, min);
        int i10 = wVar.f9366b + min;
        wVar.f9366b = i10;
        this.f9325p -= (long) min;
        if (i10 == wVar.f9367c) {
            this.f9324o = wVar.a();
            x.a(wVar);
        }
        return min;
    }

    public final int read(byte[] bArr, int i10, int i11) {
        g.f(bArr, "sink");
        u.d((long) bArr.length, (long) i10, (long) i11);
        w wVar = this.f9324o;
        if (wVar == null) {
            return -1;
        }
        int min = Math.min(i11, wVar.f9367c - wVar.f9366b);
        int i12 = wVar.f9366b;
        d.N(i10, i12, i12 + min, wVar.f9365a, bArr);
        int i13 = wVar.f9366b + min;
        wVar.f9366b = i13;
        this.f9325p -= (long) min;
        if (i13 != wVar.f9367c) {
            return min;
        }
        this.f9324o = wVar.a();
        x.a(wVar);
        return min;
    }

    public final byte readByte() {
        if (this.f9325p != 0) {
            w wVar = this.f9324o;
            g.c(wVar);
            int i10 = wVar.f9366b;
            int i11 = wVar.f9367c;
            int i12 = i10 + 1;
            byte b10 = wVar.f9365a[i10];
            this.f9325p--;
            if (i12 == i11) {
                this.f9324o = wVar.a();
                x.a(wVar);
            } else {
                wVar.f9366b = i12;
            }
            return b10;
        }
        throw new EOFException();
    }

    public final int readInt() {
        if (this.f9325p >= 4) {
            w wVar = this.f9324o;
            g.c(wVar);
            int i10 = wVar.f9366b;
            int i11 = wVar.f9367c;
            if (((long) (i11 - i10)) < 4) {
                return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
            }
            int i12 = i10 + 1;
            byte[] bArr = wVar.f9365a;
            int i13 = i12 + 1;
            byte b10 = ((bArr[i10] & 255) << 24) | ((bArr[i12] & 255) << 16);
            int i14 = i13 + 1;
            byte b11 = b10 | ((bArr[i13] & 255) << 8);
            int i15 = i14 + 1;
            byte b12 = b11 | (bArr[i14] & 255);
            this.f9325p -= 4;
            if (i15 == i11) {
                this.f9324o = wVar.a();
                x.a(wVar);
            } else {
                wVar.f9366b = i15;
            }
            return b12;
        }
        throw new EOFException();
    }

    public final short readShort() {
        if (this.f9325p >= 2) {
            w wVar = this.f9324o;
            g.c(wVar);
            int i10 = wVar.f9366b;
            int i11 = wVar.f9367c;
            if (i11 - i10 < 2) {
                return (short) (((readByte() & 255) << 8) | (readByte() & 255));
            }
            int i12 = i10 + 1;
            byte[] bArr = wVar.f9365a;
            int i13 = i12 + 1;
            byte b10 = ((bArr[i10] & 255) << 8) | (bArr[i12] & 255);
            this.f9325p -= 2;
            if (i13 == i11) {
                this.f9324o = wVar.a();
                x.a(wVar);
            } else {
                wVar.f9366b = i13;
            }
            return (short) b10;
        }
        throw new EOFException();
    }

    public final long s(long j8, j jVar) {
        boolean z;
        int i10;
        int i11;
        g.f(jVar, "targetBytes");
        long j10 = 0;
        if (j8 >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            w wVar = this.f9324o;
            if (wVar != null) {
                long j11 = this.f9325p;
                int i12 = ((j11 - j8) > j8 ? 1 : ((j11 - j8) == j8 ? 0 : -1));
                byte[] bArr = jVar.f9331q;
                if (i12 < 0) {
                    while (j11 > j8) {
                        wVar = wVar.f9370g;
                        g.c(wVar);
                        j11 -= (long) (wVar.f9367c - wVar.f9366b);
                    }
                    if (bArr.length == 2) {
                        byte b10 = bArr[0];
                        byte b11 = bArr[1];
                        while (j11 < this.f9325p) {
                            i11 = (int) ((((long) wVar.f9366b) + j8) - j11);
                            int i13 = wVar.f9367c;
                            while (i11 < i13) {
                                byte b12 = wVar.f9365a[i11];
                                if (!(b12 == b10 || b12 == b11)) {
                                    i11++;
                                }
                            }
                            j11 += (long) (wVar.f9367c - wVar.f9366b);
                            wVar = wVar.f9369f;
                            g.c(wVar);
                            j8 = j11;
                        }
                    } else {
                        while (j11 < this.f9325p) {
                            int i14 = (int) ((((long) wVar.f9366b) + j8) - j11);
                            int i15 = wVar.f9367c;
                            while (i11 < i15) {
                                byte b13 = wVar.f9365a[i11];
                                int length = bArr.length;
                                int i16 = 0;
                                while (i16 < length) {
                                    if (b13 != bArr[i16]) {
                                        i16++;
                                    }
                                }
                                i14 = i11 + 1;
                            }
                            j11 += (long) (wVar.f9367c - wVar.f9366b);
                            wVar = wVar.f9369f;
                            g.c(wVar);
                            j8 = j11;
                        }
                    }
                    return ((long) (i11 - wVar.f9366b)) + j11;
                }
                while (true) {
                    long j12 = ((long) (wVar.f9367c - wVar.f9366b)) + j10;
                    if (j12 > j8) {
                        break;
                    }
                    wVar = wVar.f9369f;
                    g.c(wVar);
                    j10 = j12;
                }
                if (bArr.length == 2) {
                    byte b14 = bArr[0];
                    byte b15 = bArr[1];
                    while (j10 < this.f9325p) {
                        i10 = (int) ((((long) wVar.f9366b) + j8) - j10);
                        int i17 = wVar.f9367c;
                        while (i10 < i17) {
                            byte b16 = wVar.f9365a[i10];
                            if (!(b16 == b14 || b16 == b15)) {
                                i10++;
                            }
                        }
                        j10 += (long) (wVar.f9367c - wVar.f9366b);
                        wVar = wVar.f9369f;
                        g.c(wVar);
                        j8 = j10;
                    }
                } else {
                    while (j10 < this.f9325p) {
                        int i18 = (int) ((((long) wVar.f9366b) + j8) - j10);
                        int i19 = wVar.f9367c;
                        while (i10 < i19) {
                            byte b17 = wVar.f9365a[i10];
                            int length2 = bArr.length;
                            int i20 = 0;
                            while (i20 < length2) {
                                if (b17 != bArr[i20]) {
                                    i20++;
                                }
                            }
                            i18 = i10 + 1;
                        }
                        j10 += (long) (wVar.f9367c - wVar.f9366b);
                        wVar = wVar.f9369f;
                        g.c(wVar);
                        j8 = j10;
                    }
                }
                return ((long) (i10 - wVar.f9366b)) + j10;
            }
            return -1;
        }
        throw new IllegalArgumentException(b0.d.d("fromIndex < 0: ", j8).toString());
    }

    public final void skip(long j8) {
        while (j8 > 0) {
            w wVar = this.f9324o;
            if (wVar != null) {
                int min = (int) Math.min(j8, (long) (wVar.f9367c - wVar.f9366b));
                long j10 = (long) min;
                this.f9325p -= j10;
                j8 -= j10;
                int i10 = wVar.f9366b + min;
                wVar.f9366b = i10;
                if (i10 == wVar.f9367c) {
                    this.f9324o = wVar.a();
                    x.a(wVar);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    public final byte[] t(long j8) {
        boolean z;
        int i10 = 0;
        if (j8 < 0 || j8 > ((long) Integer.MAX_VALUE)) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            throw new IllegalArgumentException(b0.d.d("byteCount: ", j8).toString());
        } else if (this.f9325p >= j8) {
            int i11 = (int) j8;
            byte[] bArr = new byte[i11];
            while (i10 < i11) {
                int read = read(bArr, i10, i11 - i10);
                if (read != -1) {
                    i10 += read;
                } else {
                    throw new EOFException();
                }
            }
            return bArr;
        } else {
            throw new EOFException();
        }
    }

    public final String toString() {
        boolean z;
        long j8 = this.f9325p;
        if (j8 <= ((long) Integer.MAX_VALUE)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return G((int) j8).toString();
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.f9325p).toString());
    }

    public final j u() {
        return q(this.f9325p);
    }

    public final boolean v(long j8) {
        return this.f9325p >= j8;
    }

    public final long w(f fVar, long j8) {
        boolean z;
        g.f(fVar, "sink");
        if (j8 >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            long j10 = this.f9325p;
            if (j10 == 0) {
                return -1;
            }
            if (j8 > j10) {
                j8 = j10;
            }
            fVar.H(this, j8);
            return j8;
        }
        throw new IllegalArgumentException(b0.d.d("byteCount < 0: ", j8).toString());
    }

    public final int write(ByteBuffer byteBuffer) {
        g.f(byteBuffer, "source");
        int remaining = byteBuffer.remaining();
        int i10 = remaining;
        while (i10 > 0) {
            w I = I(1);
            int min = Math.min(i10, 8192 - I.f9367c);
            byteBuffer.get(I.f9365a, I.f9367c, min);
            i10 -= min;
            I.f9367c += min;
        }
        this.f9325p += (long) remaining;
        return remaining;
    }

    public final h write(byte[] bArr) {
        g.f(bArr, "source");
        write(bArr, 0, bArr.length);
        return this;
    }

    public final /* bridge */ /* synthetic */ h writeByte(int i10) {
        M(i10);
        return this;
    }

    public final /* bridge */ /* synthetic */ h writeInt(int i10) {
        U(i10);
        return this;
    }

    public final /* bridge */ /* synthetic */ h writeShort(int i10) {
        V(i10);
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004b, code lost:
        if (r1 != false) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004d, code lost:
        r0.readByte();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005f, code lost:
        throw new java.lang.NumberFormatException("Number too large: ".concat(r0.z()));
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0085 A[EDGE_INSN: B:47:0x0085->B:29:0x0085 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x001a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long x() {
        /*
            r14 = this;
            long r0 = r14.f9325p
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x00a4
            r0 = 0
            r4 = -7
            r1 = r0
            r5 = r4
            r3 = r2
            r2 = r1
        L_0x000f:
            w9.w r7 = r14.f9324o
            z8.g.c(r7)
            int r8 = r7.f9366b
            int r9 = r7.f9367c
        L_0x0018:
            if (r8 >= r9) goto L_0x0085
            byte[] r10 = r7.f9365a
            byte r10 = r10[r8]
            r11 = 48
            byte r11 = (byte) r11
            if (r10 < r11) goto L_0x0060
            r12 = 57
            byte r12 = (byte) r12
            if (r10 > r12) goto L_0x0060
            int r11 = r11 - r10
            r12 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r12 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r12 < 0) goto L_0x0040
            if (r12 != 0) goto L_0x003a
            long r12 = (long) r11
            int r12 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r12 >= 0) goto L_0x003a
            goto L_0x0040
        L_0x003a:
            r12 = 10
            long r3 = r3 * r12
            long r10 = (long) r11
            long r3 = r3 + r10
            goto L_0x006c
        L_0x0040:
            w9.f r0 = new w9.f
            r0.<init>()
            r0.S(r3)
            r0.M(r10)
            if (r1 != 0) goto L_0x0050
            r0.readByte()
        L_0x0050:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.String r0 = r0.z()
            java.lang.String r2 = "Number too large: "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        L_0x0060:
            r11 = 45
            byte r11 = (byte) r11
            r12 = 1
            if (r10 != r11) goto L_0x0071
            if (r0 != 0) goto L_0x0071
            r10 = 1
            long r5 = r5 - r10
            r1 = r12
        L_0x006c:
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L_0x0018
        L_0x0071:
            if (r0 == 0) goto L_0x0075
            r2 = r12
            goto L_0x0085
        L_0x0075:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.String r1 = p9.u.s(r10)
            java.lang.String r2 = "Expected leading [0-9] or '-' character but was 0x"
            java.lang.String r1 = r2.concat(r1)
            r0.<init>(r1)
            throw r0
        L_0x0085:
            if (r8 != r9) goto L_0x0091
            w9.w r8 = r7.a()
            r14.f9324o = r8
            w9.x.a(r7)
            goto L_0x0093
        L_0x0091:
            r7.f9366b = r8
        L_0x0093:
            if (r2 != 0) goto L_0x0099
            w9.w r7 = r14.f9324o
            if (r7 != 0) goto L_0x000f
        L_0x0099:
            long r5 = r14.f9325p
            long r7 = (long) r0
            long r5 = r5 - r7
            r14.f9325p = r5
            if (r1 == 0) goto L_0x00a2
            goto L_0x00a3
        L_0x00a2:
            long r3 = -r3
        L_0x00a3:
            return r3
        L_0x00a4:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: w9.f.x():long");
    }

    public final String y(long j8, Charset charset) {
        boolean z;
        g.f(charset, "charset");
        int i10 = (j8 > 0 ? 1 : (j8 == 0 ? 0 : -1));
        if (i10 < 0 || j8 > ((long) Integer.MAX_VALUE)) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            throw new IllegalArgumentException(b0.d.d("byteCount: ", j8).toString());
        } else if (this.f9325p < j8) {
            throw new EOFException();
        } else if (i10 == 0) {
            return BuildConfig.FLAVOR;
        } else {
            w wVar = this.f9324o;
            g.c(wVar);
            int i11 = wVar.f9366b;
            if (((long) i11) + j8 > ((long) wVar.f9367c)) {
                return new String(t(j8), charset);
            }
            int i12 = (int) j8;
            String str = new String(wVar.f9365a, i11, i12, charset);
            int i13 = wVar.f9366b + i12;
            wVar.f9366b = i13;
            this.f9325p -= j8;
            if (i13 == wVar.f9367c) {
                this.f9324o = wVar.a();
                x.a(wVar);
            }
            return str;
        }
    }

    public final String z() {
        return y(this.f9325p, f9.a.f4927b);
    }

    public final void write(byte[] bArr, int i10, int i11) {
        g.f(bArr, "source");
        long j8 = (long) i11;
        u.d((long) bArr.length, (long) i10, j8);
        int i12 = i11 + i10;
        while (i10 < i12) {
            w I = I(1);
            int min = Math.min(i12 - i10, 8192 - I.f9367c);
            int i13 = i10 + min;
            d.N(I.f9367c, i10, i13, bArr, I.f9365a);
            I.f9367c += min;
            i10 = i13;
        }
        this.f9325p += j8;
    }
}
