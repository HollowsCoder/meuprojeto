package w9;

import b0.d;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import z8.g;

public final class n implements b0 {

    /* renamed from: o  reason: collision with root package name */
    public byte f9335o;

    /* renamed from: p  reason: collision with root package name */
    public final v f9336p;

    /* renamed from: q  reason: collision with root package name */
    public final Inflater f9337q;

    /* renamed from: r  reason: collision with root package name */
    public final o f9338r;

    /* renamed from: s  reason: collision with root package name */
    public final CRC32 f9339s = new CRC32();

    public n(b0 b0Var) {
        g.f(b0Var, "source");
        v vVar = new v(b0Var);
        this.f9336p = vVar;
        Inflater inflater = new Inflater(true);
        this.f9337q = inflater;
        this.f9338r = new o(vVar, inflater);
    }

    public static void a(String str, int i10, int i11) {
        if (i11 != i10) {
            String format = String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i11), Integer.valueOf(i10)}, 3));
            g.e(format, "java.lang.String.format(this, *args)");
            throw new IOException(format);
        }
    }

    public final void b(f fVar, long j8, long j10) {
        w wVar = fVar.f9324o;
        while (true) {
            g.c(wVar);
            int i10 = wVar.f9367c;
            int i11 = wVar.f9366b;
            if (j8 < ((long) (i10 - i11))) {
                break;
            }
            j8 -= (long) (i10 - i11);
            wVar = wVar.f9369f;
        }
        while (j10 > 0) {
            int i12 = (int) (((long) wVar.f9366b) + j8);
            int min = (int) Math.min((long) (wVar.f9367c - i12), j10);
            this.f9339s.update(wVar.f9365a, i12, min);
            j10 -= (long) min;
            wVar = wVar.f9369f;
            g.c(wVar);
            j8 = 0;
        }
    }

    public final void close() {
        this.f9338r.close();
    }

    public final c0 h() {
        return this.f9336p.h();
    }

    public final long w(f fVar, long j8) {
        boolean z;
        v vVar;
        boolean z10;
        boolean z11;
        boolean z12;
        f fVar2;
        boolean z13;
        long j10;
        f fVar3 = fVar;
        long j11 = j8;
        g.f(fVar3, "sink");
        int i10 = (j11 > 0 ? 1 : (j11 == 0 ? 0 : -1));
        if (i10 >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException(d.d("byteCount < 0: ", j11).toString());
        } else if (i10 == 0) {
            return 0;
        } else {
            byte b10 = this.f9335o;
            CRC32 crc32 = this.f9339s;
            v vVar2 = this.f9336p;
            if (b10 == 0) {
                vVar2.X(10);
                f fVar4 = vVar2.f9361o;
                byte n10 = fVar4.n(3);
                if (((n10 >> 1) & 1) == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    b(vVar2.f9361o, 0, 10);
                }
                a("ID1ID2", 8075, vVar2.readShort());
                vVar2.skip(8);
                if (((n10 >> 2) & 1) == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    vVar2.X(2);
                    if (z10) {
                        b(vVar2.f9361o, 0, 2);
                    }
                    short readShort = fVar4.readShort() & 65535;
                    long j12 = (long) ((short) (((readShort & 255) << 8) | ((readShort & 65280) >>> 8)));
                    vVar2.X(j12);
                    if (z10) {
                        b(vVar2.f9361o, 0, j12);
                        j10 = j12;
                    } else {
                        j10 = j12;
                    }
                    vVar2.skip(j10);
                }
                if (((n10 >> 3) & 1) == 1) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    fVar2 = fVar4;
                    v vVar3 = vVar2;
                    long a10 = vVar2.a((byte) 0, 0, Long.MAX_VALUE);
                    if (a10 != -1) {
                        if (z10) {
                            vVar = vVar3;
                            b(vVar3.f9361o, 0, a10 + 1);
                        } else {
                            vVar = vVar3;
                        }
                        vVar.skip(a10 + 1);
                    } else {
                        throw new EOFException();
                    }
                } else {
                    fVar2 = fVar4;
                    vVar = vVar2;
                }
                if (((n10 >> 4) & 1) == 1) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (z13) {
                    long a11 = vVar.a((byte) 0, 0, Long.MAX_VALUE);
                    if (a11 != -1) {
                        if (z10) {
                            b(vVar.f9361o, 0, a11 + 1);
                        }
                        vVar.skip(a11 + 1);
                    } else {
                        throw new EOFException();
                    }
                }
                if (z10) {
                    vVar.X(2);
                    short readShort2 = fVar2.readShort() & 65535;
                    a("FHCRC", (short) (((readShort2 & 255) << 8) | ((readShort2 & 65280) >>> 8)), (short) ((int) crc32.getValue()));
                    crc32.reset();
                }
                this.f9335o = 1;
            } else {
                vVar = vVar2;
            }
            if (this.f9335o == 1) {
                long j13 = fVar3.f9325p;
                long w = this.f9338r.w(fVar3, j11);
                if (w != -1) {
                    b(fVar, j13, w);
                    return w;
                }
                this.f9335o = 2;
            }
            if (this.f9335o != 2) {
                return -1;
            }
            a("CRC", vVar.f(), (int) crc32.getValue());
            a("ISIZE", vVar.f(), (int) this.f9337q.getBytesWritten());
            this.f9335o = 3;
            if (vVar.F()) {
                return -1;
            }
            throw new IOException("gzip finished without exhausting source");
        }
    }
}
