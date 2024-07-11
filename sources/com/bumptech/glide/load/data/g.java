package com.bumptech.glide.load.data;

import b0.d;
import java.io.FilterInputStream;
import java.io.InputStream;

public final class g extends FilterInputStream {

    /* renamed from: q  reason: collision with root package name */
    public static final byte[] f2275q = {-1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};

    /* renamed from: r  reason: collision with root package name */
    public static final int f2276r = 31;

    /* renamed from: o  reason: collision with root package name */
    public final byte f2277o;

    /* renamed from: p  reason: collision with root package name */
    public int f2278p;

    public g(InputStream inputStream, int i10) {
        super(inputStream);
        if (i10 < -1 || i10 > 8) {
            throw new IllegalArgumentException(d.c("Cannot add invalid orientation: ", i10));
        }
        this.f2277o = (byte) i10;
    }

    public final void mark(int i10) {
        throw new UnsupportedOperationException();
    }

    public final boolean markSupported() {
        return false;
    }

    public final int read() {
        int i10;
        int i11 = this.f2278p;
        int read = (i11 < 2 || i11 > (i10 = f2276r)) ? super.read() : i11 == i10 ? this.f2277o : f2275q[i11 - 2] & 255;
        if (read != -1) {
            this.f2278p++;
        }
        return read;
    }

    public final int read(byte[] bArr, int i10, int i11) {
        int i12;
        int i13 = this.f2278p;
        int i14 = f2276r;
        if (i13 > i14) {
            i12 = super.read(bArr, i10, i11);
        } else if (i13 == i14) {
            bArr[i10] = this.f2277o;
            i12 = 1;
        } else if (i13 < 2) {
            i12 = super.read(bArr, i10, 2 - i13);
        } else {
            int min = Math.min(i14 - i13, i11);
            System.arraycopy(f2275q, this.f2278p - 2, bArr, i10, min);
            i12 = min;
        }
        if (i12 > 0) {
            this.f2278p += i12;
        }
        return i12;
    }

    public final void reset() {
        throw new UnsupportedOperationException();
    }

    public final long skip(long j8) {
        long skip = super.skip(j8);
        if (skip > 0) {
            this.f2278p = (int) (((long) this.f2278p) + skip);
        }
        return skip;
    }
}
