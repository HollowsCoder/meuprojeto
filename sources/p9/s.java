package p9;

import j9.c;
import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import p9.d;
import w9.f;
import w9.h;
import z8.g;

public final class s implements Closeable {
    public static final Logger u = Logger.getLogger(e.class.getName());

    /* renamed from: o  reason: collision with root package name */
    public final f f8090o;

    /* renamed from: p  reason: collision with root package name */
    public int f8091p = 16384;

    /* renamed from: q  reason: collision with root package name */
    public boolean f8092q;

    /* renamed from: r  reason: collision with root package name */
    public final d.b f8093r;

    /* renamed from: s  reason: collision with root package name */
    public final h f8094s;

    /* renamed from: t  reason: collision with root package name */
    public final boolean f8095t;

    public s(h hVar, boolean z) {
        this.f8094s = hVar;
        this.f8095t = z;
        f fVar = new f();
        this.f8090o = fVar;
        this.f8093r = new d.b(fVar);
    }

    public final synchronized void a(w wVar) {
        int i10;
        int i11;
        g.f(wVar, "peerSettings");
        if (!this.f8092q) {
            int i12 = this.f8091p;
            int i13 = wVar.f8121a;
            if ((i13 & 32) != 0) {
                i12 = wVar.f8122b[5];
            }
            this.f8091p = i12;
            if ((i13 & 2) != 0) {
                i10 = wVar.f8122b[1];
            } else {
                i10 = -1;
            }
            if (i10 != -1) {
                d.b bVar = this.f8093r;
                if ((i13 & 2) != 0) {
                    i11 = wVar.f8122b[1];
                } else {
                    i11 = -1;
                }
                bVar.getClass();
                int min = Math.min(i11, 16384);
                int i14 = bVar.f7986c;
                if (i14 != min) {
                    if (min < i14) {
                        bVar.f7984a = Math.min(bVar.f7984a, min);
                    }
                    bVar.f7985b = true;
                    bVar.f7986c = min;
                    int i15 = bVar.f7989g;
                    if (min < i15) {
                        if (min == 0) {
                            c[] cVarArr = bVar.d;
                            Arrays.fill(cVarArr, 0, cVarArr.length, (Object) null);
                            bVar.f7987e = bVar.d.length - 1;
                            bVar.f7988f = 0;
                            bVar.f7989g = 0;
                        } else {
                            bVar.a(i15 - min);
                        }
                    }
                }
            }
            c(0, 0, 4, 1);
            this.f8094s.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void b(boolean z, int i10, f fVar, int i11) {
        if (!this.f8092q) {
            c(i10, i11, 0, z ? 1 : 0);
            if (i11 > 0) {
                g.c(fVar);
                this.f8094s.H(fVar, (long) i11);
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final void c(int i10, int i11, int i12, int i13) {
        boolean z;
        Level level = Level.FINE;
        Logger logger = u;
        boolean z10 = false;
        if (logger.isLoggable(level)) {
            e.f7995e.getClass();
            logger.fine(e.a(false, i10, i11, i12, i13));
        }
        if (i11 <= this.f8091p) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if ((((int) 2147483648L) & i10) == 0) {
                z10 = true;
            }
            if (z10) {
                byte[] bArr = c.f6602a;
                h hVar = this.f8094s;
                g.f(hVar, "$this$writeMedium");
                hVar.writeByte((i11 >>> 16) & 255);
                hVar.writeByte((i11 >>> 8) & 255);
                hVar.writeByte(i11 & 255);
                hVar.writeByte(i12 & 255);
                hVar.writeByte(i13 & 255);
                hVar.writeInt(i10 & Integer.MAX_VALUE);
                return;
            }
            throw new IllegalArgumentException(b0.d.c("reserved bit set: ", i10).toString());
        }
        throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.f8091p + ": " + i11).toString());
    }

    public final synchronized void close() {
        this.f8092q = true;
        this.f8094s.close();
    }

    public final synchronized void d(int i10, b bVar, byte[] bArr) {
        g.f(bVar, "errorCode");
        g.f(bArr, "debugData");
        if (!this.f8092q) {
            boolean z = false;
            if (bVar.getHttpCode() != -1) {
                c(0, bArr.length + 8, 7, 0);
                this.f8094s.writeInt(i10);
                this.f8094s.writeInt(bVar.getHttpCode());
                if (bArr.length == 0) {
                    z = true;
                }
                if (!z) {
                    this.f8094s.write(bArr);
                }
                this.f8094s.flush();
            } else {
                throw new IllegalArgumentException("errorCode.httpCode == -1".toString());
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void f(int i10, int i11, boolean z) {
        if (!this.f8092q) {
            c(0, 8, 6, z ? 1 : 0);
            this.f8094s.writeInt(i10);
            this.f8094s.writeInt(i11);
            this.f8094s.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void g(int i10, b bVar) {
        g.f(bVar, "errorCode");
        if (!this.f8092q) {
            if (bVar.getHttpCode() != -1) {
                c(i10, 4, 3, 0);
                this.f8094s.writeInt(bVar.getHttpCode());
                this.f8094s.flush();
            } else {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void j(int i10, long j8) {
        if (!this.f8092q) {
            if (j8 != 0 && j8 <= 2147483647L) {
                c(i10, 4, 8, 0);
                this.f8094s.writeInt((int) j8);
                this.f8094s.flush();
            } else {
                throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j8).toString());
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final void l(int i10, long j8) {
        while (j8 > 0) {
            long min = Math.min((long) this.f8091p, j8);
            j8 -= min;
            c(i10, (int) min, 9, j8 == 0 ? 4 : 0);
            this.f8094s.H(this.f8090o, min);
        }
    }
}
