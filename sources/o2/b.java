package o2;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public final class b implements Closeable {

    /* renamed from: o  reason: collision with root package name */
    public final InputStream f7700o;

    /* renamed from: p  reason: collision with root package name */
    public final Charset f7701p;

    /* renamed from: q  reason: collision with root package name */
    public byte[] f7702q;

    /* renamed from: r  reason: collision with root package name */
    public int f7703r;

    /* renamed from: s  reason: collision with root package name */
    public int f7704s;

    public class a extends ByteArrayOutputStream {
        public a(int i10) {
            super(i10);
        }

        public final String toString() {
            int i10 = this.count;
            if (i10 > 0 && this.buf[i10 - 1] == 13) {
                i10--;
            }
            try {
                return new String(this.buf, 0, i10, b.this.f7701p.name());
            } catch (UnsupportedEncodingException e10) {
                throw new AssertionError(e10);
            }
        }
    }

    public b(FileInputStream fileInputStream, Charset charset) {
        if (charset == null) {
            throw null;
        } else if (charset.equals(c.f7706a)) {
            this.f7700o = fileInputStream;
            this.f7701p = charset;
            this.f7702q = new byte[8192];
        } else {
            throw new IllegalArgumentException("Unsupported encoding");
        }
    }

    public final String a() {
        int i10;
        synchronized (this.f7700o) {
            byte[] bArr = this.f7702q;
            if (bArr != null) {
                if (this.f7703r >= this.f7704s) {
                    int read = this.f7700o.read(bArr, 0, bArr.length);
                    if (read != -1) {
                        this.f7703r = 0;
                        this.f7704s = read;
                    } else {
                        throw new EOFException();
                    }
                }
                for (int i11 = this.f7703r; i11 != this.f7704s; i11++) {
                    byte[] bArr2 = this.f7702q;
                    if (bArr2[i11] == 10) {
                        int i12 = this.f7703r;
                        if (i11 != i12) {
                            i10 = i11 - 1;
                            if (bArr2[i10] == 13) {
                                String str = new String(bArr2, i12, i10 - i12, this.f7701p.name());
                                this.f7703r = i11 + 1;
                                return str;
                            }
                        }
                        i10 = i11;
                        String str2 = new String(bArr2, i12, i10 - i12, this.f7701p.name());
                        this.f7703r = i11 + 1;
                        return str2;
                    }
                }
                a aVar = new a((this.f7704s - this.f7703r) + 80);
                while (true) {
                    byte[] bArr3 = this.f7702q;
                    int i13 = this.f7703r;
                    aVar.write(bArr3, i13, this.f7704s - i13);
                    this.f7704s = -1;
                    byte[] bArr4 = this.f7702q;
                    int read2 = this.f7700o.read(bArr4, 0, bArr4.length);
                    if (read2 != -1) {
                        this.f7703r = 0;
                        this.f7704s = read2;
                        int i14 = 0;
                        while (true) {
                            if (i14 != this.f7704s) {
                                byte[] bArr5 = this.f7702q;
                                if (bArr5[i14] == 10) {
                                    int i15 = this.f7703r;
                                    if (i14 != i15) {
                                        aVar.write(bArr5, i15, i14 - i15);
                                    }
                                    this.f7703r = i14 + 1;
                                    String aVar2 = aVar.toString();
                                    return aVar2;
                                }
                                i14++;
                            }
                        }
                    } else {
                        throw new EOFException();
                    }
                }
            } else {
                throw new IOException("LineReader is closed");
            }
        }
    }

    public final void close() {
        synchronized (this.f7700o) {
            if (this.f7702q != null) {
                this.f7702q = null;
                this.f7700o.close();
            }
        }
    }
}
