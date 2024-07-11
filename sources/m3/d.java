package m3;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;

public final class d extends InputStream {

    /* renamed from: q  reason: collision with root package name */
    public static final ArrayDeque f7068q = new ArrayDeque(0);

    /* renamed from: o  reason: collision with root package name */
    public InputStream f7069o;

    /* renamed from: p  reason: collision with root package name */
    public IOException f7070p;

    static {
        char[] cArr = j.f7084a;
    }

    public final int available() {
        return this.f7069o.available();
    }

    public final void close() {
        this.f7069o.close();
    }

    public final void mark(int i10) {
        this.f7069o.mark(i10);
    }

    public final boolean markSupported() {
        return this.f7069o.markSupported();
    }

    public final int read() {
        try {
            return this.f7069o.read();
        } catch (IOException e10) {
            this.f7070p = e10;
            throw e10;
        }
    }

    public final int read(byte[] bArr) {
        try {
            return this.f7069o.read(bArr);
        } catch (IOException e10) {
            this.f7070p = e10;
            throw e10;
        }
    }

    public final int read(byte[] bArr, int i10, int i11) {
        try {
            return this.f7069o.read(bArr, i10, i11);
        } catch (IOException e10) {
            this.f7070p = e10;
            throw e10;
        }
    }

    public final synchronized void reset() {
        this.f7069o.reset();
    }

    public final long skip(long j8) {
        try {
            return this.f7069o.skip(j8);
        } catch (IOException e10) {
            this.f7070p = e10;
            throw e10;
        }
    }
}
