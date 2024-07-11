package m3;

import java.io.FilterInputStream;

public final class h extends FilterInputStream {

    /* renamed from: o  reason: collision with root package name */
    public int f7080o = Integer.MIN_VALUE;

    public h(d dVar) {
        super(dVar);
    }

    public final long a(long j8) {
        int i10 = this.f7080o;
        if (i10 == 0) {
            return -1;
        }
        return (i10 == Integer.MIN_VALUE || j8 <= ((long) i10)) ? j8 : (long) i10;
    }

    public final int available() {
        int i10 = this.f7080o;
        return i10 == Integer.MIN_VALUE ? super.available() : Math.min(i10, super.available());
    }

    public final void b(long j8) {
        int i10 = this.f7080o;
        if (i10 != Integer.MIN_VALUE && j8 != -1) {
            this.f7080o = (int) (((long) i10) - j8);
        }
    }

    public final synchronized void mark(int i10) {
        super.mark(i10);
        this.f7080o = i10;
    }

    public final int read() {
        if (a(1) == -1) {
            return -1;
        }
        int read = super.read();
        b(1);
        return read;
    }

    public final int read(byte[] bArr, int i10, int i11) {
        int a10 = (int) a((long) i11);
        if (a10 == -1) {
            return -1;
        }
        int read = super.read(bArr, i10, a10);
        b((long) read);
        return read;
    }

    public final synchronized void reset() {
        super.reset();
        this.f7080o = Integer.MIN_VALUE;
    }

    public final long skip(long j8) {
        long a10 = a(j8);
        if (a10 == -1) {
            return 0;
        }
        long skip = super.skip(a10);
        b(skip);
        return skip;
    }
}
