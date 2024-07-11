package com.google.android.gms.internal.clearcut;

import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class x extends androidx.activity.result.c {

    /* renamed from: p  reason: collision with root package name */
    public static final Logger f2576p = Logger.getLogger(x.class.getName());

    /* renamed from: q  reason: collision with root package name */
    public static final boolean f2577q = a3.f2368f;

    /* renamed from: o  reason: collision with root package name */
    public y f2578o;

    public static class a extends x {

        /* renamed from: r  reason: collision with root package name */
        public final byte[] f2579r;

        /* renamed from: s  reason: collision with root package name */
        public final int f2580s;

        /* renamed from: t  reason: collision with root package name */
        public final int f2581t;
        public int u;

        public a(byte[] bArr, int i10, int i11) {
            if (bArr != null) {
                int i12 = i10 + i11;
                if ((i10 | i11 | (bArr.length - i12)) >= 0) {
                    this.f2579r = bArr;
                    this.f2580s = i10;
                    this.u = i10;
                    this.f2581t = i12;
                    return;
                }
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)}));
            }
            throw new NullPointerException("buffer");
        }

        public final void A0(String str) {
            int i10 = this.u;
            try {
                int x0 = x.x0(str.length() * 3);
                int x02 = x.x0(str.length());
                int i11 = this.f2581t;
                byte[] bArr = this.f2579r;
                if (x02 == x0) {
                    int i12 = i10 + x02;
                    this.u = i12;
                    int z = c3.f2396a.z(str, bArr, i12, i11 - i12);
                    this.u = i10;
                    t0((z - i10) - x02);
                    this.u = z;
                    return;
                }
                t0(c3.a(str));
                int i13 = this.u;
                this.u = c3.f2396a.z(str, bArr, i13, i11 - i13);
            } catch (e3 e10) {
                this.u = i10;
                N(str, e10);
            } catch (IndexOutOfBoundsException e11) {
                throw new c((RuntimeException) e11);
            }
        }

        public void E() {
        }

        public final void F(byte[] bArr, int i10, int i11) {
            try {
                System.arraycopy(bArr, i10, this.f2579r, this.u, i11);
                this.u += i11;
            } catch (IndexOutOfBoundsException e10) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.u), Integer.valueOf(this.f2581t), Integer.valueOf(i11)}), e10);
            }
        }

        public final void H(byte b10) {
            try {
                byte[] bArr = this.f2579r;
                int i10 = this.u;
                this.u = i10 + 1;
                bArr[i10] = b10;
            } catch (IndexOutOfBoundsException e10) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.u), Integer.valueOf(this.f2581t), 1}), e10);
            }
        }

        public final void I(int i10, long j8) {
            R(i10, 0);
            V(j8);
        }

        public final void J(int i10, u uVar) {
            R(i10, 2);
            y0(uVar);
        }

        public final void K(int i10, r1 r1Var) {
            R(i10, 2);
            z0(r1Var);
        }

        public final void L(int i10, r1 r1Var, i2 i2Var) {
            R(i10, 2);
            m mVar = (m) r1Var;
            int b10 = mVar.b();
            if (b10 == -1) {
                b10 = i2Var.d(mVar);
                mVar.a(b10);
            }
            t0(b10);
            i2Var.e(r1Var, this.f2578o);
        }

        public final void M(String str, int i10) {
            R(i10, 2);
            A0(str);
        }

        public final int O() {
            return this.f2581t - this.u;
        }

        public final void R(int i10, int i11) {
            t0((i10 << 3) | i11);
        }

        public final void S(int i10, u uVar) {
            R(1, 3);
            d0(2, i10);
            J(3, uVar);
            R(1, 4);
        }

        public final void T(int i10, r1 r1Var) {
            R(1, 3);
            d0(2, i10);
            K(3, r1Var);
            R(1, 4);
        }

        public final void U(int i10, boolean z) {
            R(i10, 0);
            H(z ? (byte) 1 : 0);
        }

        public final void V(long j8) {
            boolean z = x.f2577q;
            int i10 = this.f2581t;
            byte[] bArr = this.f2579r;
            if (!z || i10 - this.u < 10) {
                while ((j8 & -128) != 0) {
                    int i11 = this.u;
                    this.u = i11 + 1;
                    bArr[i11] = (byte) ((((int) j8) & 127) | 128);
                    j8 >>>= 7;
                }
                try {
                    int i12 = this.u;
                    this.u = i12 + 1;
                    bArr[i12] = (byte) ((int) j8);
                } catch (IndexOutOfBoundsException e10) {
                    throw new c(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.u), Integer.valueOf(i10), 1}), e10);
                }
            } else {
                while ((j8 & -128) != 0) {
                    int i13 = this.u;
                    this.u = i13 + 1;
                    a3.h(bArr, (long) i13, (byte) ((((int) j8) & 127) | 128));
                    j8 >>>= 7;
                }
                int i14 = this.u;
                this.u = i14 + 1;
                a3.h(bArr, (long) i14, (byte) ((int) j8));
            }
        }

        public final void a0(int i10, int i11) {
            R(i10, 0);
            s0(i11);
        }

        public final void b0(int i10, long j8) {
            R(i10, 1);
            e0(j8);
        }

        public final void d0(int i10, int i11) {
            R(i10, 0);
            t0(i11);
        }

        public final void e0(long j8) {
            try {
                byte[] bArr = this.f2579r;
                int i10 = this.u;
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
                this.u = i17 + 1;
                bArr[i17] = (byte) ((int) (j8 >> 56));
            } catch (IndexOutOfBoundsException e10) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.u), Integer.valueOf(this.f2581t), 1}), e10);
            }
        }

        public final void i0(int i10, int i11) {
            R(i10, 5);
            u0(i11);
        }

        public final void s0(int i10) {
            if (i10 >= 0) {
                t0(i10);
            } else {
                V((long) i10);
            }
        }

        public final void t0(int i10) {
            boolean z = x.f2577q;
            int i11 = this.f2581t;
            byte[] bArr = this.f2579r;
            if (!z || i11 - this.u < 10) {
                while ((i10 & -128) != 0) {
                    int i12 = this.u;
                    this.u = i12 + 1;
                    bArr[i12] = (byte) ((i10 & 127) | 128);
                    i10 >>>= 7;
                }
                try {
                    int i13 = this.u;
                    this.u = i13 + 1;
                    bArr[i13] = (byte) i10;
                } catch (IndexOutOfBoundsException e10) {
                    throw new c(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.u), Integer.valueOf(i11), 1}), e10);
                }
            } else {
                while ((i10 & -128) != 0) {
                    int i14 = this.u;
                    this.u = i14 + 1;
                    a3.h(bArr, (long) i14, (byte) ((i10 & 127) | 128));
                    i10 >>>= 7;
                }
                int i15 = this.u;
                this.u = i15 + 1;
                a3.h(bArr, (long) i15, (byte) i10);
            }
        }

        public final void u0(int i10) {
            try {
                byte[] bArr = this.f2579r;
                int i11 = this.u;
                int i12 = i11 + 1;
                bArr[i11] = (byte) i10;
                int i13 = i12 + 1;
                bArr[i12] = (byte) (i10 >> 8);
                int i14 = i13 + 1;
                bArr[i13] = (byte) (i10 >> 16);
                this.u = i14 + 1;
                bArr[i14] = i10 >> 24;
            } catch (IndexOutOfBoundsException e10) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.u), Integer.valueOf(this.f2581t), 1}), e10);
            }
        }

        public final void y(byte[] bArr, int i10, int i11) {
            F(bArr, i10, i11);
        }

        public final void y0(u uVar) {
            t0(uVar.size());
            uVar.i(this);
        }

        public final void z0(r1 r1Var) {
            t0(r1Var.l());
            r1Var.i(this);
        }
    }

    public static final class b extends a {

        /* renamed from: v  reason: collision with root package name */
        public final ByteBuffer f2582v;
        public final int w;

        public b(ByteBuffer byteBuffer) {
            super(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining());
            this.f2582v = byteBuffer;
            this.w = byteBuffer.position();
        }

        public final void E() {
            this.f2582v.position((this.u - this.f2580s) + this.w);
        }
    }

    public static class c extends IOException {
        public c(RuntimeException runtimeException) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", runtimeException);
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public c(java.lang.String r3) {
            /*
                r2 = this;
                java.lang.String r0 = "CodedOutputStream was writing to a flat byte array and ran out of space.: "
                java.lang.String r3 = java.lang.String.valueOf(r3)
                int r1 = r3.length()
                if (r1 == 0) goto L_0x0011
                java.lang.String r3 = r0.concat(r3)
                goto L_0x0016
            L_0x0011:
                java.lang.String r3 = new java.lang.String
                r3.<init>(r0)
            L_0x0016:
                r2.<init>(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.x.c.<init>(java.lang.String):void");
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public c(java.lang.String r3, java.lang.IndexOutOfBoundsException r4) {
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
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.x.c.<init>(java.lang.String, java.lang.IndexOutOfBoundsException):void");
        }
    }

    public static final class d extends x {

        /* renamed from: r  reason: collision with root package name */
        public final ByteBuffer f2583r;

        /* renamed from: s  reason: collision with root package name */
        public final ByteBuffer f2584s;

        public d(ByteBuffer byteBuffer) {
            this.f2583r = byteBuffer;
            this.f2584s = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            byteBuffer.position();
        }

        public final void A0(String str) {
            ByteBuffer byteBuffer = this.f2584s;
            int position = byteBuffer.position();
            try {
                int x0 = x.x0(str.length() * 3);
                int x02 = x.x0(str.length());
                if (x02 == x0) {
                    int position2 = byteBuffer.position() + x02;
                    byteBuffer.position(position2);
                    c3.b(str, byteBuffer);
                    int position3 = byteBuffer.position();
                    byteBuffer.position(position);
                    t0(position3 - position2);
                    byteBuffer.position(position3);
                    return;
                }
                t0(c3.a(str));
                c3.b(str, byteBuffer);
            } catch (IndexOutOfBoundsException e10) {
                throw new c((RuntimeException) e10);
            } catch (IndexOutOfBoundsException e11) {
                throw new c((RuntimeException) e11);
            } catch (e3 e12) {
                byteBuffer.position(position);
                N(str, e12);
            } catch (IllegalArgumentException e13) {
                throw new c((RuntimeException) e13);
            }
        }

        public final void E() {
            this.f2583r.position(this.f2584s.position());
        }

        public final void F(byte[] bArr, int i10, int i11) {
            try {
                this.f2584s.put(bArr, i10, i11);
            } catch (IndexOutOfBoundsException e10) {
                throw new c((RuntimeException) e10);
            } catch (BufferOverflowException e11) {
                throw new c((RuntimeException) e11);
            }
        }

        public final void H(byte b10) {
            try {
                this.f2584s.put(b10);
            } catch (BufferOverflowException e10) {
                throw new c((RuntimeException) e10);
            }
        }

        public final void I(int i10, long j8) {
            R(i10, 0);
            V(j8);
        }

        public final void J(int i10, u uVar) {
            R(i10, 2);
            y0(uVar);
        }

        public final void K(int i10, r1 r1Var) {
            R(i10, 2);
            z0(r1Var);
        }

        public final void L(int i10, r1 r1Var, i2 i2Var) {
            R(i10, 2);
            m mVar = (m) r1Var;
            int b10 = mVar.b();
            if (b10 == -1) {
                b10 = i2Var.d(mVar);
                mVar.a(b10);
            }
            t0(b10);
            i2Var.e(r1Var, this.f2578o);
        }

        public final void M(String str, int i10) {
            R(i10, 2);
            A0(str);
        }

        public final int O() {
            return this.f2584s.remaining();
        }

        public final void R(int i10, int i11) {
            t0((i10 << 3) | i11);
        }

        public final void S(int i10, u uVar) {
            R(1, 3);
            d0(2, i10);
            J(3, uVar);
            R(1, 4);
        }

        public final void T(int i10, r1 r1Var) {
            R(1, 3);
            d0(2, i10);
            K(3, r1Var);
            R(1, 4);
        }

        public final void U(int i10, boolean z) {
            R(i10, 0);
            H(z ? (byte) 1 : 0);
        }

        public final void V(long j8) {
            while (true) {
                int i10 = ((-128 & j8) > 0 ? 1 : ((-128 & j8) == 0 ? 0 : -1));
                ByteBuffer byteBuffer = this.f2584s;
                if (i10 == 0) {
                    try {
                        byteBuffer.put((byte) ((int) j8));
                        return;
                    } catch (BufferOverflowException e10) {
                        throw new c((RuntimeException) e10);
                    }
                } else {
                    byteBuffer.put((byte) ((((int) j8) & 127) | 128));
                    j8 >>>= 7;
                }
            }
        }

        public final void a0(int i10, int i11) {
            R(i10, 0);
            s0(i11);
        }

        public final void b0(int i10, long j8) {
            R(i10, 1);
            e0(j8);
        }

        public final void d0(int i10, int i11) {
            R(i10, 0);
            t0(i11);
        }

        public final void e0(long j8) {
            try {
                this.f2584s.putLong(j8);
            } catch (BufferOverflowException e10) {
                throw new c((RuntimeException) e10);
            }
        }

        public final void i0(int i10, int i11) {
            R(i10, 5);
            u0(i11);
        }

        public final void s0(int i10) {
            if (i10 >= 0) {
                t0(i10);
            } else {
                V((long) i10);
            }
        }

        public final void t0(int i10) {
            while (true) {
                int i11 = i10 & -128;
                ByteBuffer byteBuffer = this.f2584s;
                if (i11 == 0) {
                    try {
                        byteBuffer.put((byte) i10);
                        return;
                    } catch (BufferOverflowException e10) {
                        throw new c((RuntimeException) e10);
                    }
                } else {
                    byteBuffer.put((byte) ((i10 & 127) | 128));
                    i10 >>>= 7;
                }
            }
        }

        public final void u0(int i10) {
            try {
                this.f2584s.putInt(i10);
            } catch (BufferOverflowException e10) {
                throw new c((RuntimeException) e10);
            }
        }

        public final void y(byte[] bArr, int i10, int i11) {
            F(bArr, i10, i11);
        }

        public final void y0(u uVar) {
            t0(uVar.size());
            uVar.i(this);
        }

        public final void z0(r1 r1Var) {
            t0(r1Var.l());
            r1Var.i(this);
        }
    }

    public static final class e extends x {

        /* renamed from: r  reason: collision with root package name */
        public final ByteBuffer f2585r;

        /* renamed from: s  reason: collision with root package name */
        public final ByteBuffer f2586s;

        /* renamed from: t  reason: collision with root package name */
        public final long f2587t;
        public final long u;

        /* renamed from: v  reason: collision with root package name */
        public final long f2588v;
        public long w;

        public e(ByteBuffer byteBuffer) {
            this.f2585r = byteBuffer;
            this.f2586s = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            long k10 = a3.d.k(a3.f2370h, byteBuffer);
            this.f2587t = k10;
            long position = ((long) byteBuffer.position()) + k10;
            long limit = k10 + ((long) byteBuffer.limit());
            this.u = limit;
            this.f2588v = limit - 10;
            this.w = position;
        }

        public final void A0(String str) {
            ByteBuffer byteBuffer = this.f2586s;
            long j8 = this.f2587t;
            long j10 = this.w;
            try {
                int x0 = x.x0(str.length() * 3);
                int x02 = x.x0(str.length());
                if (x02 == x0) {
                    int i10 = ((int) (this.w - j8)) + x02;
                    byteBuffer.position(i10);
                    c3.b(str, byteBuffer);
                    int position = byteBuffer.position() - i10;
                    t0(position);
                    this.w += (long) position;
                    return;
                }
                int a10 = c3.a(str);
                t0(a10);
                byteBuffer.position((int) (this.w - j8));
                c3.b(str, byteBuffer);
                this.w += (long) a10;
            } catch (e3 e10) {
                this.w = j10;
                byteBuffer.position((int) (j10 - j8));
                N(str, e10);
            } catch (IllegalArgumentException e11) {
                throw new c((RuntimeException) e11);
            } catch (IndexOutOfBoundsException e12) {
                throw new c((RuntimeException) e12);
            }
        }

        public final void E() {
            this.f2585r.position((int) (this.w - this.f2587t));
        }

        public final void F(byte[] bArr, int i10, int i11) {
            byte[] bArr2 = bArr;
            int i12 = i10;
            int i13 = i11;
            long j8 = this.u;
            if (bArr2 != null && i12 >= 0 && i13 >= 0 && bArr2.length - i13 >= i12) {
                long j10 = (long) i13;
                long j11 = this.w;
                if (j8 - j10 >= j11) {
                    a3.d.g(bArr, (long) i12, j11, j10);
                    this.w += j10;
                    return;
                }
            }
            if (bArr2 == null) {
                throw new NullPointerException("value");
            }
            throw new c(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(this.w), Long.valueOf(j8), Integer.valueOf(i11)}));
        }

        public final void H(byte b10) {
            long j8 = this.w;
            long j10 = this.u;
            if (j8 < j10) {
                this.w = 1 + j8;
                a3.b(j8, b10);
                return;
            }
            throw new c(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(this.w), Long.valueOf(j10), 1}));
        }

        public final void I(int i10, long j8) {
            R(i10, 0);
            V(j8);
        }

        public final void J(int i10, u uVar) {
            R(i10, 2);
            y0(uVar);
        }

        public final void K(int i10, r1 r1Var) {
            R(i10, 2);
            z0(r1Var);
        }

        public final void L(int i10, r1 r1Var, i2 i2Var) {
            R(i10, 2);
            m mVar = (m) r1Var;
            int b10 = mVar.b();
            if (b10 == -1) {
                b10 = i2Var.d(mVar);
                mVar.a(b10);
            }
            t0(b10);
            i2Var.e(r1Var, this.f2578o);
        }

        public final void M(String str, int i10) {
            R(i10, 2);
            A0(str);
        }

        public final int O() {
            return (int) (this.u - this.w);
        }

        public final void R(int i10, int i11) {
            t0((i10 << 3) | i11);
        }

        public final void S(int i10, u uVar) {
            R(1, 3);
            d0(2, i10);
            J(3, uVar);
            R(1, 4);
        }

        public final void T(int i10, r1 r1Var) {
            R(1, 3);
            d0(2, i10);
            K(3, r1Var);
            R(1, 4);
        }

        public final void U(int i10, boolean z) {
            R(i10, 0);
            H(z ? (byte) 1 : 0);
        }

        public final void V(long j8) {
            if (this.w <= this.f2588v) {
                while ((j8 & -128) != 0) {
                    long j10 = this.w;
                    this.w = j10 + 1;
                    a3.b(j10, (byte) ((((int) j8) & 127) | 128));
                    j8 >>>= 7;
                }
                long j11 = this.w;
                this.w = 1 + j11;
                a3.b(j11, (byte) ((int) j8));
                return;
            }
            while (true) {
                long j12 = this.w;
                long j13 = this.u;
                if (j12 >= j13) {
                    throw new c(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(this.w), Long.valueOf(j13), 1}));
                } else if ((j8 & -128) == 0) {
                    this.w = 1 + j12;
                    a3.b(j12, (byte) ((int) j8));
                    return;
                } else {
                    this.w = j12 + 1;
                    a3.b(j12, (byte) ((((int) j8) & 127) | 128));
                    j8 >>>= 7;
                }
            }
        }

        public final void a0(int i10, int i11) {
            R(i10, 0);
            s0(i11);
        }

        public final void b0(int i10, long j8) {
            R(i10, 1);
            e0(j8);
        }

        public final void d0(int i10, int i11) {
            R(i10, 0);
            t0(i11);
        }

        public final void e0(long j8) {
            this.f2586s.putLong((int) (this.w - this.f2587t), j8);
            this.w += 8;
        }

        public final void i0(int i10, int i11) {
            R(i10, 5);
            u0(i11);
        }

        public final void s0(int i10) {
            if (i10 >= 0) {
                t0(i10);
            } else {
                V((long) i10);
            }
        }

        public final void t0(int i10) {
            long j8;
            if (this.w <= this.f2588v) {
                while (true) {
                    int i11 = i10 & -128;
                    j8 = this.w;
                    if (i11 == 0) {
                        break;
                    }
                    this.w = j8 + 1;
                    a3.b(j8, (byte) ((i10 & 127) | 128));
                    i10 >>>= 7;
                }
            } else {
                while (true) {
                    j8 = this.w;
                    long j10 = this.u;
                    if (j8 >= j10) {
                        throw new c(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(this.w), Long.valueOf(j10), 1}));
                    } else if ((i10 & -128) == 0) {
                        break;
                    } else {
                        this.w = j8 + 1;
                        a3.b(j8, (byte) ((i10 & 127) | 128));
                        i10 >>>= 7;
                    }
                }
            }
            this.w = 1 + j8;
            a3.b(j8, (byte) i10);
        }

        public final void u0(int i10) {
            this.f2586s.putInt((int) (this.w - this.f2587t), i10);
            this.w += 4;
        }

        public final void y(byte[] bArr, int i10, int i11) {
            F(bArr, i10, i11);
        }

        public final void y0(u uVar) {
            t0(uVar.size());
            uVar.i(this);
        }

        public final void z0(r1 r1Var) {
            t0(r1Var.l());
            r1Var.i(this);
        }
    }

    public static int G(b1 b1Var) {
        int a10 = b1Var.a();
        return x0(a10) + a10;
    }

    public static int P(int i10) {
        return v0(i10) + 4;
    }

    public static int Q(String str, int i10) {
        return n0(str) + v0(i10);
    }

    public static int W(int i10) {
        return v0(i10) + 8;
    }

    public static int X(int i10) {
        return v0(i10) + 1;
    }

    public static int Y(int i10, u uVar) {
        int v02 = v0(i10);
        int size = uVar.size();
        return x0(size) + size + v02;
    }

    @Deprecated
    public static int Z(int i10, r1 r1Var, i2 i2Var) {
        int v02 = v0(i10) << 1;
        m mVar = (m) r1Var;
        int b10 = mVar.b();
        if (b10 == -1) {
            b10 = i2Var.d(mVar);
            mVar.a(b10);
        }
        return v02 + b10;
    }

    public static int c0(int i10, long j8) {
        return h0(j8) + v0(i10);
    }

    public static int f0(int i10, long j8) {
        return h0(j8) + v0(i10);
    }

    public static int g0(int i10, long j8) {
        return h0((j8 >> 63) ^ (j8 << 1)) + v0(i10);
    }

    public static int h0(long j8) {
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

    public static int j0(int i10) {
        return v0(i10) + 8;
    }

    public static int k0(int i10, int i11) {
        return w0(i11) + v0(i10);
    }

    public static int l0(int i10) {
        return v0(i10) + 8;
    }

    public static int m0(int i10, int i11) {
        return x0(i11) + v0(i10);
    }

    public static int n0(String str) {
        int i10;
        try {
            i10 = c3.a(str);
        } catch (e3 unused) {
            i10 = str.getBytes(r0.f2537a).length;
        }
        return x0(i10) + i10;
    }

    public static int o0(int i10, int i11) {
        return x0((i11 >> 31) ^ (i11 << 1)) + v0(i10);
    }

    public static int p0(int i10) {
        return v0(i10) + 4;
    }

    public static int q0(int i10) {
        return v0(i10) + 4;
    }

    public static int r0(int i10, int i11) {
        return w0(i11) + v0(i10);
    }

    public static int v0(int i10) {
        return x0(i10 << 3);
    }

    public static int w0(int i10) {
        if (i10 >= 0) {
            return x0(i10);
        }
        return 10;
    }

    public static int x0(int i10) {
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

    public abstract void E();

    public abstract void F(byte[] bArr, int i10, int i11);

    public abstract void H(byte b10);

    public abstract void I(int i10, long j8);

    public abstract void J(int i10, u uVar);

    public abstract void K(int i10, r1 r1Var);

    public abstract void L(int i10, r1 r1Var, i2 i2Var);

    public abstract void M(String str, int i10);

    public final void N(String str, e3 e3Var) {
        f2576p.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", e3Var);
        byte[] bytes = str.getBytes(r0.f2537a);
        try {
            t0(bytes.length);
            y(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e10) {
            throw new c((RuntimeException) e10);
        } catch (c e11) {
            throw e11;
        }
    }

    public abstract int O();

    public abstract void R(int i10, int i11);

    public abstract void S(int i10, u uVar);

    public abstract void T(int i10, r1 r1Var);

    public abstract void U(int i10, boolean z);

    public abstract void V(long j8);

    public abstract void a0(int i10, int i11);

    public abstract void b0(int i10, long j8);

    public abstract void d0(int i10, int i11);

    public abstract void e0(long j8);

    public abstract void i0(int i10, int i11);

    public abstract void s0(int i10);

    public abstract void t0(int i10);

    public abstract void u0(int i10);
}
