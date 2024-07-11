package c5;

import java.io.OutputStream;

public final class j extends OutputStream {

    /* renamed from: o  reason: collision with root package name */
    public long f2165o = 0;

    public final void write(int i10) {
        this.f2165o++;
    }

    public final void write(byte[] bArr) {
        this.f2165o += (long) bArr.length;
    }

    public final void write(byte[] bArr, int i10, int i11) {
        int length;
        int i12;
        if (i10 < 0 || i10 > (length = bArr.length) || i11 < 0 || (i12 = i10 + i11) > length || i12 < 0) {
            throw new IndexOutOfBoundsException();
        }
        this.f2165o += (long) i11;
    }
}
