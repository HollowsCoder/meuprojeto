package w9;

import java.io.OutputStream;

public final class g extends OutputStream {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ f f9327o;

    public g(f fVar) {
        this.f9327o = fVar;
    }

    public final void close() {
    }

    public final void flush() {
    }

    public final String toString() {
        return this.f9327o + ".outputStream()";
    }

    public final void write(int i10) {
        this.f9327o.M(i10);
    }

    public final void write(byte[] bArr, int i10, int i11) {
        z8.g.f(bArr, "data");
        this.f9327o.write(bArr, i10, i11);
    }
}
