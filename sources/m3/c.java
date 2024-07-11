package m3;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class c extends FilterInputStream {

    /* renamed from: o  reason: collision with root package name */
    public final long f7066o;

    /* renamed from: p  reason: collision with root package name */
    public int f7067p;

    public c(InputStream inputStream, long j8) {
        super(inputStream);
        this.f7066o = j8;
    }

    public final void a(int i10) {
        int i11 = this.f7067p;
        if (i10 >= 0) {
            this.f7067p = i11 + i10;
            return;
        }
        long j8 = this.f7066o;
        if (j8 - ((long) i11) > 0) {
            throw new IOException("Failed to read all expected data, expected: " + j8 + ", but read: " + this.f7067p);
        }
    }

    public final synchronized int available() {
        return (int) Math.max(this.f7066o - ((long) this.f7067p), (long) this.in.available());
    }

    public final synchronized int read() {
        int read;
        read = super.read();
        a(read >= 0 ? 1 : -1);
        return read;
    }

    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public final synchronized int read(byte[] bArr, int i10, int i11) {
        int read;
        read = super.read(bArr, i10, i11);
        a(read);
        return read;
    }
}
