package r7;

import java.io.OutputStream;

public final class b extends OutputStream {

    /* renamed from: o  reason: collision with root package name */
    public long f8443o = 0;

    public final void write(int i10) {
        this.f8443o++;
    }

    public final void write(byte[] bArr) {
        this.f8443o += (long) bArr.length;
    }

    public final void write(byte[] bArr, int i10, int i11) {
        int i12;
        if (i10 < 0 || i10 > bArr.length || i11 < 0 || (i12 = i10 + i11) > bArr.length || i12 < 0) {
            throw new IndexOutOfBoundsException();
        }
        this.f8443o += (long) i11;
    }
}
