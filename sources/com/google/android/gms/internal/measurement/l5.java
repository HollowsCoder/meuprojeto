package com.google.android.gms.internal.measurement;

import java.util.logging.Level;

public final class l5 extends n5 {
    public final byte[] V;
    public final int W;
    public int X;

    public l5(byte[] bArr, int i10) {
        super(0);
        int length = bArr.length;
        if (((length - i10) | i10) >= 0) {
            this.V = bArr;
            this.X = 0;
            this.W = i10;
            return;
        }
        throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(length), 0, Integer.valueOf(i10)}));
    }

    public final void I0(int i10, int i11) {
        T0((i10 << 3) | i11);
    }

    public final void J0(int i10, int i11) {
        T0(i10 << 3);
        S0(i11);
    }

    public final void K0(int i10, int i11) {
        T0(i10 << 3);
        T0(i11);
    }

    public final void L0(int i10, int i11) {
        T0((i10 << 3) | 5);
        U0(i11);
    }

    public final void M0(int i10, long j8) {
        T0(i10 << 3);
        V0(j8);
    }

    public final void N0(int i10, long j8) {
        T0((i10 << 3) | 1);
        W0(j8);
    }

    public final void O0(int i10, boolean z) {
        T0(i10 << 3);
        R0(z ? (byte) 1 : 0);
    }

    public final void P0(String str, int i10) {
        int i11;
        T0((i10 << 3) | 2);
        int i12 = this.X;
        try {
            int Z0 = n5.Z0(str.length() * 3);
            int Z02 = n5.Z0(str.length());
            int i13 = this.W;
            byte[] bArr = this.V;
            if (Z02 == Z0) {
                int i14 = i12 + Z02;
                this.X = i14;
                i11 = q8.c(str, bArr, i14, i13 - i14);
                this.X = i12;
                T0((i11 - i12) - Z02);
            } else {
                T0(q8.b(str));
                int i15 = this.X;
                i11 = q8.c(str, bArr, i15, i13 - i15);
            }
            this.X = i11;
        } catch (p8 e10) {
            this.X = i12;
            n5.T.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", e10);
            byte[] bytes = str.getBytes(n6.f2844a);
            try {
                int length = bytes.length;
                T0(length);
                c1(bytes, length);
            } catch (IndexOutOfBoundsException e11) {
                throw new m5(e11);
            } catch (m5 e12) {
                throw e12;
            }
        } catch (IndexOutOfBoundsException e13) {
            throw new m5(e13);
        }
    }

    public final void Q0(int i10, k5 k5Var) {
        T0((i10 << 3) | 2);
        T0(k5Var.i());
        k5Var.m(this);
    }

    public final void R0(byte b10) {
        try {
            byte[] bArr = this.V;
            int i10 = this.X;
            this.X = i10 + 1;
            bArr[i10] = b10;
        } catch (IndexOutOfBoundsException e10) {
            throw new m5(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.X), Integer.valueOf(this.W), 1}), e10);
        }
    }

    public final void S0(int i10) {
        if (i10 >= 0) {
            T0(i10);
        } else {
            V0((long) i10);
        }
    }

    public final void T0(int i10) {
        if (n5.U) {
            int i11 = d5.f2671a;
        }
        while (true) {
            int i12 = i10 & -128;
            byte[] bArr = this.V;
            if (i12 == 0) {
                try {
                    int i13 = this.X;
                    this.X = i13 + 1;
                    bArr[i13] = (byte) i10;
                    return;
                } catch (IndexOutOfBoundsException e10) {
                    throw new m5(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.X), Integer.valueOf(this.W), 1}), e10);
                }
            } else {
                int i14 = this.X;
                this.X = i14 + 1;
                bArr[i14] = (byte) ((i10 & 127) | 128);
                i10 >>>= 7;
            }
        }
    }

    public final void U0(int i10) {
        try {
            byte[] bArr = this.V;
            int i11 = this.X;
            int i12 = i11 + 1;
            bArr[i11] = (byte) (i10 & 255);
            int i13 = i12 + 1;
            bArr[i12] = (byte) ((i10 >> 8) & 255);
            int i14 = i13 + 1;
            bArr[i13] = (byte) ((i10 >> 16) & 255);
            this.X = i14 + 1;
            bArr[i14] = (byte) ((i10 >> 24) & 255);
        } catch (IndexOutOfBoundsException e10) {
            throw new m5(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.X), Integer.valueOf(this.W), 1}), e10);
        }
    }

    public final void V0(long j8) {
        boolean z = n5.U;
        int i10 = this.W;
        byte[] bArr = this.V;
        if (!z || i10 - this.X < 10) {
            while ((j8 & -128) != 0) {
                int i11 = this.X;
                this.X = i11 + 1;
                bArr[i11] = (byte) ((((int) j8) & 127) | 128);
                j8 >>>= 7;
            }
            try {
                int i12 = this.X;
                this.X = i12 + 1;
                bArr[i12] = (byte) ((int) j8);
            } catch (IndexOutOfBoundsException e10) {
                throw new m5(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.X), Integer.valueOf(i10), 1}), e10);
            }
        } else {
            while ((j8 & -128) != 0) {
                int i13 = this.X;
                this.X = i13 + 1;
                long j10 = o8.f2865f + ((long) i13);
                o8.f2863c.a(bArr, j10, (byte) ((((int) j8) & 127) | 128));
                j8 >>>= 7;
            }
            int i14 = this.X;
            this.X = i14 + 1;
            n8 n8Var = o8.f2863c;
            n8Var.a(bArr, o8.f2865f + ((long) i14), (byte) ((int) j8));
        }
    }

    public final void W0(long j8) {
        try {
            byte[] bArr = this.V;
            int i10 = this.X;
            int i11 = i10 + 1;
            bArr[i10] = (byte) (((int) j8) & 255);
            int i12 = i11 + 1;
            bArr[i11] = (byte) (((int) (j8 >> 8)) & 255);
            int i13 = i12 + 1;
            bArr[i12] = (byte) (((int) (j8 >> 16)) & 255);
            int i14 = i13 + 1;
            bArr[i13] = (byte) (((int) (j8 >> 24)) & 255);
            int i15 = i14 + 1;
            bArr[i14] = (byte) (((int) (j8 >> 32)) & 255);
            int i16 = i15 + 1;
            bArr[i15] = (byte) (((int) (j8 >> 40)) & 255);
            int i17 = i16 + 1;
            bArr[i16] = (byte) (((int) (j8 >> 48)) & 255);
            this.X = i17 + 1;
            bArr[i17] = (byte) (((int) (j8 >> 56)) & 255);
        } catch (IndexOutOfBoundsException e10) {
            throw new m5(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.X), Integer.valueOf(this.W), 1}), e10);
        }
    }

    public final void c1(byte[] bArr, int i10) {
        try {
            System.arraycopy(bArr, 0, this.V, this.X, i10);
            this.X += i10;
        } catch (IndexOutOfBoundsException e10) {
            throw new m5(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.X), Integer.valueOf(this.W), Integer.valueOf(i10)}), e10);
        }
    }
}
