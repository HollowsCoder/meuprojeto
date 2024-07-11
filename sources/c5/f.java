package c5;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class f extends FilterInputStream {

    /* renamed from: o  reason: collision with root package name */
    public long f2159o;

    /* renamed from: p  reason: collision with root package name */
    public long f2160p = -1;

    public f(InputStream inputStream) {
        super(inputStream);
        inputStream.getClass();
        this.f2159o = 1048577;
    }

    public final int available() {
        return (int) Math.min((long) this.in.available(), this.f2159o);
    }

    public final synchronized void mark(int i10) {
        this.in.mark(i10);
        this.f2160p = this.f2159o;
    }

    public final int read() {
        if (this.f2159o == 0) {
            return -1;
        }
        int read = this.in.read();
        if (read != -1) {
            this.f2159o--;
        }
        return read;
    }

    public final int read(byte[] bArr, int i10, int i11) {
        long j8 = this.f2159o;
        if (j8 == 0) {
            return -1;
        }
        int read = this.in.read(bArr, i10, (int) Math.min((long) i11, j8));
        if (read != -1) {
            this.f2159o -= (long) read;
        }
        return read;
    }

    public final synchronized void reset() {
        if (!this.in.markSupported()) {
            throw new IOException("Mark not supported");
        } else if (this.f2160p != -1) {
            this.in.reset();
            this.f2159o = this.f2160p;
        } else {
            throw new IOException("Mark not set");
        }
    }

    public final long skip(long j8) {
        long skip = this.in.skip(Math.min(j8, this.f2159o));
        this.f2159o -= skip;
        return skip;
    }
}
