package com.google.android.gms.internal.vision;

import androidx.activity.result.c;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class a1 extends c {

    /* renamed from: p  reason: collision with root package name */
    public static final Logger f3034p = Logger.getLogger(a1.class.getName());

    /* renamed from: q  reason: collision with root package name */
    public static final boolean f3035q = b4.f3062e;

    /* renamed from: o  reason: collision with root package name */
    public b1 f3036o;

    public static class a extends a1 {

        /* renamed from: r  reason: collision with root package name */
        public final byte[] f3037r;

        /* renamed from: s  reason: collision with root package name */
        public final int f3038s;

        /* renamed from: t  reason: collision with root package name */
        public int f3039t;

        public a(byte[] bArr, int i10) {
            if ((i10 | 0 | (bArr.length - i10)) >= 0) {
                this.f3037r = bArr;
                this.f3039t = 0;
                this.f3038s = i10;
                return;
            }
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), 0, Integer.valueOf(i10)}));
        }

        public final int E() {
            return this.f3038s - this.f3039t;
        }

        public final void F(byte b10) {
            try {
                byte[] bArr = this.f3037r;
                int i10 = this.f3039t;
                this.f3039t = i10 + 1;
                bArr[i10] = b10;
            } catch (IndexOutOfBoundsException e10) {
                throw new b(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f3039t), Integer.valueOf(this.f3038s), 1}), e10);
            }
        }

        public final void G(int i10) {
            if (i10 >= 0) {
                S(i10);
            } else {
                N((long) i10);
            }
        }

        public final void H(int i10, int i11) {
            S((i10 << 3) | i11);
        }

        public final void I(int i10, long j8) {
            H(i10, 0);
            N(j8);
        }

        public final void J(int i10, w0 w0Var) {
            H(i10, 2);
            t0(w0Var);
        }

        public final void K(int i10, w2 w2Var) {
            H(1, 3);
            Z(2, i10);
            H(3, 2);
            u0(w2Var);
            H(1, 4);
        }

        public final void L(int i10, w2 w2Var, m3 m3Var) {
            H(i10, 2);
            n0 n0Var = (n0) w2Var;
            int f10 = n0Var.f();
            if (f10 == -1) {
                f10 = m3Var.e(n0Var);
                n0Var.b(f10);
            }
            S(f10);
            m3Var.i(w2Var, this.f3036o);
        }

        public final void M(int i10, boolean z) {
            H(i10, 0);
            F(z ? (byte) 1 : 0);
        }

        public final void N(long j8) {
            boolean z = a1.f3035q;
            int i10 = this.f3038s;
            byte[] bArr = this.f3037r;
            if (!z || i10 - this.f3039t < 10) {
                while ((j8 & -128) != 0) {
                    int i11 = this.f3039t;
                    this.f3039t = i11 + 1;
                    bArr[i11] = (byte) ((((int) j8) & 127) | 128);
                    j8 >>>= 7;
                }
                try {
                    int i12 = this.f3039t;
                    this.f3039t = i12 + 1;
                    bArr[i12] = (byte) ((int) j8);
                } catch (IndexOutOfBoundsException e10) {
                    throw new b(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f3039t), Integer.valueOf(i10), 1}), e10);
                }
            } else {
                while ((j8 & -128) != 0) {
                    int i13 = this.f3039t;
                    this.f3039t = i13 + 1;
                    b4.h(bArr, (long) i13, (byte) ((((int) j8) & 127) | 128));
                    j8 >>>= 7;
                }
                int i14 = this.f3039t;
                this.f3039t = i14 + 1;
                b4.h(bArr, (long) i14, (byte) ((int) j8));
            }
        }

        public final void O(String str, int i10) {
            H(i10, 2);
            v0(str);
        }

        public final void S(int i10) {
            boolean z = a1.f3035q;
            int i11 = this.f3038s;
            byte[] bArr = this.f3037r;
            if (z && !q0.a()) {
                int i12 = this.f3039t;
                if (i11 - i12 >= 5) {
                    if ((i10 & -128) != 0) {
                        this.f3039t = i12 + 1;
                        b4.h(bArr, (long) i12, (byte) (i10 | 128));
                        i10 >>>= 7;
                        if ((i10 & -128) != 0) {
                            int i13 = this.f3039t;
                            this.f3039t = i13 + 1;
                            b4.h(bArr, (long) i13, (byte) (i10 | 128));
                            i10 >>>= 7;
                            if ((i10 & -128) != 0) {
                                int i14 = this.f3039t;
                                this.f3039t = i14 + 1;
                                b4.h(bArr, (long) i14, (byte) (i10 | 128));
                                i10 >>>= 7;
                                if ((i10 & -128) != 0) {
                                    int i15 = this.f3039t;
                                    this.f3039t = i15 + 1;
                                    b4.h(bArr, (long) i15, (byte) (i10 | 128));
                                    i10 >>>= 7;
                                }
                            }
                        }
                        i12 = this.f3039t;
                    }
                    this.f3039t = i12 + 1;
                    b4.h(bArr, (long) i12, (byte) i10);
                    return;
                }
            }
            while ((i10 & -128) != 0) {
                int i16 = this.f3039t;
                this.f3039t = i16 + 1;
                bArr[i16] = (byte) ((i10 & 127) | 128);
                i10 >>>= 7;
            }
            try {
                int i17 = this.f3039t;
                this.f3039t = i17 + 1;
                bArr[i17] = (byte) i10;
            } catch (IndexOutOfBoundsException e10) {
                throw new b(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f3039t), Integer.valueOf(i11), 1}), e10);
            }
        }

        public final void T(int i10, int i11) {
            H(i10, 0);
            G(i11);
        }

        public final void U(int i10, w0 w0Var) {
            H(1, 3);
            Z(2, i10);
            J(3, w0Var);
            H(1, 4);
        }

        public final void Z(int i10, int i11) {
            H(i10, 0);
            S(i11);
        }

        public final void a0(int i10, long j8) {
            H(i10, 1);
            b0(j8);
        }

        public final void b0(long j8) {
            try {
                byte[] bArr = this.f3037r;
                int i10 = this.f3039t;
                int i11 = i10 + 1;
                bArr[i10] = (byte) ((int) j8);
                int i12 = i11 + 1;
                bArr[i11] = (byte) ((int) (j8 >> 8));
                int i13 = i12 + 1;
                bArr[i12] = (byte) ((int) (j8 >> 16));
                int i14 = i13 + 1;
                bArr[i13] = (byte) ((int) (j8 >> 24));
                int i15 = i14 + 1;
                bArr[i14] = (byte) ((int) (j8 >> 32));
                int i16 = i15 + 1;
                bArr[i15] = (byte) ((int) (j8 >> 40));
                int i17 = i16 + 1;
                bArr[i16] = (byte) ((int) (j8 >> 48));
                this.f3039t = i17 + 1;
                bArr[i17] = (byte) ((int) (j8 >> 56));
            } catch (IndexOutOfBoundsException e10) {
                throw new b(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f3039t), Integer.valueOf(this.f3038s), 1}), e10);
            }
        }

        public final void d0(int i10) {
            try {
                byte[] bArr = this.f3037r;
                int i11 = this.f3039t;
                int i12 = i11 + 1;
                bArr[i11] = (byte) i10;
                int i13 = i12 + 1;
                bArr[i12] = (byte) (i10 >> 8);
                int i14 = i13 + 1;
                bArr[i13] = (byte) (i10 >> 16);
                this.f3039t = i14 + 1;
                bArr[i14] = (byte) (i10 >>> 24);
            } catch (IndexOutOfBoundsException e10) {
                throw new b(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f3039t), Integer.valueOf(this.f3038s), 1}), e10);
            }
        }

        public final void h0(int i10, int i11) {
            H(i10, 5);
            d0(i11);
        }

        public final void t0(w0 w0Var) {
            S(w0Var.p());
            w0Var.n(this);
        }

        public final void u0(w2 w2Var) {
            S(w2Var.n());
            w2Var.c(this);
        }

        public final void v0(String str) {
            int i10 = this.f3039t;
            try {
                int n02 = a1.n0(str.length() * 3);
                int n03 = a1.n0(str.length());
                int i11 = this.f3038s;
                byte[] bArr = this.f3037r;
                if (n03 == n02) {
                    int i12 = i10 + n03;
                    this.f3039t = i12;
                    int u = e4.f3085a.u(str, bArr, i12, i11 - i12);
                    this.f3039t = i10;
                    S((u - i10) - n03);
                    this.f3039t = u;
                    return;
                }
                S(e4.a(str));
                int i13 = this.f3039t;
                this.f3039t = e4.f3085a.u(str, bArr, i13, i11 - i13);
            } catch (f4 e10) {
                this.f3039t = i10;
                a1.f3034p.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", e10);
                byte[] bytes = str.getBytes(u1.f3170a);
                try {
                    S(bytes.length);
                    w0(bytes, 0, bytes.length);
                } catch (IndexOutOfBoundsException e11) {
                    throw new b(e11);
                } catch (b e12) {
                    throw e12;
                }
            } catch (IndexOutOfBoundsException e13) {
                throw new b(e13);
            }
        }

        public final void w0(byte[] bArr, int i10, int i11) {
            try {
                System.arraycopy(bArr, i10, this.f3037r, this.f3039t, i11);
                this.f3039t += i11;
            } catch (IndexOutOfBoundsException e10) {
                throw new b(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f3039t), Integer.valueOf(this.f3038s), Integer.valueOf(i11)}), e10);
            }
        }

        public final void y(byte[] bArr, int i10, int i11) {
            w0(bArr, i10, i11);
        }
    }

    public static class b extends IOException {
        public b(IndexOutOfBoundsException indexOutOfBoundsException) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public b(java.lang.String r3, java.lang.IndexOutOfBoundsException r4) {
            /*
                r2 = this;
                java.lang.String r3 = java.lang.String.valueOf(r3)
                int r0 = r3.length()
                java.lang.String r1 = "CodedOutputStream was writing to a flat byte array and ran out of space.: "
                if (r0 == 0) goto L_0x0011
                java.lang.String r3 = r1.concat(r3)
                goto L_0x0016
            L_0x0011:
                java.lang.String r3 = new java.lang.String
                r3.<init>(r1)
            L_0x0016:
                r2.<init>(r3, r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.a1.b.<init>(java.lang.String, java.lang.IndexOutOfBoundsException):void");
        }
    }

    public static int P(int i10) {
        return n0(i10 << 3) + 4;
    }

    public static int Q(String str) {
        int i10;
        try {
            i10 = e4.a(str);
        } catch (f4 unused) {
            i10 = str.getBytes(u1.f3170a).length;
        }
        return n0(i10) + i10;
    }

    public static int R(String str, int i10) {
        return Q(str) + n0(i10 << 3);
    }

    public static int V(int i10) {
        return n0(i10 << 3) + 1;
    }

    public static int W(int i10) {
        return n0(i10 << 3) + 8;
    }

    public static int X(int i10, w0 w0Var) {
        int n02 = n0(i10 << 3);
        int p10 = w0Var.p();
        return n0(p10) + p10 + n02;
    }

    @Deprecated
    public static int Y(int i10, w2 w2Var, m3 m3Var) {
        int n02 = n0(i10 << 3) << 1;
        n0 n0Var = (n0) w2Var;
        int f10 = n0Var.f();
        if (f10 == -1) {
            f10 = m3Var.e(n0Var);
            n0Var.b(f10);
        }
        return n02 + f10;
    }

    public static int c0(int i10, long j8) {
        return g0(j8) + n0(i10 << 3);
    }

    public static int e0(int i10) {
        return n0(i10 << 3);
    }

    public static int f0(int i10, long j8) {
        return g0(j8) + n0(i10 << 3);
    }

    public static int g0(long j8) {
        int i10;
        if ((-128 & j8) == 0) {
            return 1;
        }
        if (j8 < 0) {
            return 10;
        }
        if ((-34359738368L & j8) != 0) {
            j8 >>>= 28;
            i10 = 6;
        } else {
            i10 = 2;
        }
        if ((-2097152 & j8) != 0) {
            i10 += 2;
            j8 >>>= 14;
        }
        return (j8 & -16384) != 0 ? i10 + 1 : i10;
    }

    public static int i0(int i10) {
        if (i10 >= 0) {
            return n0(i10);
        }
        return 10;
    }

    public static int j0(int i10, int i11) {
        return i0(i11) + n0(i10 << 3);
    }

    public static int k0(int i10, long j8) {
        return g0((j8 >> 63) ^ (j8 << 1)) + n0(i10 << 3);
    }

    public static int l0(int i10) {
        return n0(i10 << 3) + 8;
    }

    public static int m0(int i10, int i11) {
        return n0(i11) + n0(i10 << 3);
    }

    public static int n0(int i10) {
        if ((i10 & -128) == 0) {
            return 1;
        }
        if ((i10 & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i10) == 0) {
            return 3;
        }
        return (i10 & -268435456) == 0 ? 4 : 5;
    }

    public static int o0(int i10) {
        return n0(i10 << 3) + 8;
    }

    public static int p0(int i10, int i11) {
        return n0((i11 >> 31) ^ (i11 << 1)) + n0(i10 << 3);
    }

    public static int q0(int i10) {
        return n0(i10 << 3) + 4;
    }

    public static int r0(int i10) {
        return n0(i10 << 3) + 4;
    }

    public static int s0(int i10, int i11) {
        return i0(i11) + n0(i10 << 3);
    }

    public abstract int E();

    public abstract void F(byte b10);

    public abstract void G(int i10);

    public abstract void H(int i10, int i11);

    public abstract void I(int i10, long j8);

    public abstract void J(int i10, w0 w0Var);

    public abstract void K(int i10, w2 w2Var);

    public abstract void L(int i10, w2 w2Var, m3 m3Var);

    public abstract void M(int i10, boolean z);

    public abstract void N(long j8);

    public abstract void O(String str, int i10);

    public abstract void S(int i10);

    public abstract void T(int i10, int i11);

    public abstract void U(int i10, w0 w0Var);

    public abstract void Z(int i10, int i11);

    public abstract void a0(int i10, long j8);

    public abstract void b0(long j8);

    public abstract void d0(int i10);

    public abstract void h0(int i10, int i11);
}
