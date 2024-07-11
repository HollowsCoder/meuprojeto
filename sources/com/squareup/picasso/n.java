package com.squareup.picasso;

import java.io.IOException;
import java.io.InputStream;

public final class n extends InputStream {

    /* renamed from: o  reason: collision with root package name */
    public final InputStream f3960o;

    /* renamed from: p  reason: collision with root package name */
    public long f3961p;

    /* renamed from: q  reason: collision with root package name */
    public long f3962q;

    /* renamed from: r  reason: collision with root package name */
    public long f3963r;

    /* renamed from: s  reason: collision with root package name */
    public long f3964s = -1;

    /* renamed from: t  reason: collision with root package name */
    public boolean f3965t = true;
    public final int u = -1;

    /* JADX WARNING: Incorrect type for immutable var: ssa=w9.v$a, code=java.io.InputStream, for r3v0, types: [w9.v$a, java.io.InputStream] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public n(java.io.InputStream r3) {
        /*
            r2 = this;
            r2.<init>()
            r0 = -1
            r2.f3964s = r0
            r0 = 1
            r2.f3965t = r0
            r0 = -1
            r2.u = r0
            boolean r0 = r3.markSupported()
            if (r0 != 0) goto L_0x001b
            java.io.BufferedInputStream r0 = new java.io.BufferedInputStream
            r1 = 4096(0x1000, float:5.74E-42)
            r0.<init>(r3, r1)
            r3 = r0
        L_0x001b:
            r2.f3960o = r3
            r3 = 1024(0x400, float:1.435E-42)
            r2.u = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.picasso.n.<init>(w9.v$a):void");
    }

    public final void a(long j8) {
        if (this.f3961p > this.f3963r || j8 < this.f3962q) {
            throw new IOException("Cannot reset");
        }
        this.f3960o.reset();
        c(this.f3962q, j8);
        this.f3961p = j8;
    }

    public final int available() {
        return this.f3960o.available();
    }

    public final void b(long j8) {
        try {
            long j10 = this.f3962q;
            long j11 = this.f3961p;
            int i10 = (j10 > j11 ? 1 : (j10 == j11 ? 0 : -1));
            InputStream inputStream = this.f3960o;
            if (i10 < 0) {
                if (j11 <= this.f3963r) {
                    inputStream.reset();
                    inputStream.mark((int) (j8 - this.f3962q));
                    c(this.f3962q, this.f3961p);
                    this.f3963r = j8;
                }
            }
            this.f3962q = j11;
            inputStream.mark((int) (j8 - j11));
            this.f3963r = j8;
        } catch (IOException e10) {
            throw new IllegalStateException("Unable to mark: " + e10);
        }
    }

    public final void c(long j8, long j10) {
        while (j8 < j10) {
            long skip = this.f3960o.skip(j10 - j8);
            if (skip == 0) {
                if (read() != -1) {
                    skip = 1;
                } else {
                    return;
                }
            }
            j8 += skip;
        }
    }

    public final void close() {
        this.f3960o.close();
    }

    public final void mark(int i10) {
        long j8 = this.f3961p + ((long) i10);
        if (this.f3963r < j8) {
            b(j8);
        }
        this.f3964s = this.f3961p;
    }

    public final boolean markSupported() {
        return this.f3960o.markSupported();
    }

    public final int read() {
        if (!this.f3965t) {
            long j8 = this.f3963r;
            if (this.f3961p + 1 > j8) {
                b(j8 + ((long) this.u));
            }
        }
        int read = this.f3960o.read();
        if (read != -1) {
            this.f3961p++;
        }
        return read;
    }

    public final int read(byte[] bArr) {
        if (!this.f3965t) {
            long j8 = this.f3961p;
            if (((long) bArr.length) + j8 > this.f3963r) {
                b(j8 + ((long) bArr.length) + ((long) this.u));
            }
        }
        int read = this.f3960o.read(bArr);
        if (read != -1) {
            this.f3961p += (long) read;
        }
        return read;
    }

    public final int read(byte[] bArr, int i10, int i11) {
        if (!this.f3965t) {
            long j8 = this.f3961p;
            long j10 = (long) i11;
            if (j8 + j10 > this.f3963r) {
                b(j8 + j10 + ((long) this.u));
            }
        }
        int read = this.f3960o.read(bArr, i10, i11);
        if (read != -1) {
            this.f3961p += (long) read;
        }
        return read;
    }

    public final void reset() {
        a(this.f3964s);
    }

    public final long skip(long j8) {
        if (!this.f3965t) {
            long j10 = this.f3961p;
            if (j10 + j8 > this.f3963r) {
                b(j10 + j8 + ((long) this.u));
            }
        }
        long skip = this.f3960o.skip(j8);
        this.f3961p += skip;
        return skip;
    }
}
