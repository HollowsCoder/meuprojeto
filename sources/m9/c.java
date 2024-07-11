package m9;

import i9.c0;
import i9.n;
import java.io.IOException;
import java.net.ProtocolException;
import n9.d;
import w9.b0;
import w9.f;
import w9.k;
import w9.l;
import w9.z;
import z8.g;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public boolean f7211a;

    /* renamed from: b  reason: collision with root package name */
    public final h f7212b;

    /* renamed from: c  reason: collision with root package name */
    public final e f7213c;
    public final n d;

    /* renamed from: e  reason: collision with root package name */
    public final d f7214e;

    /* renamed from: f  reason: collision with root package name */
    public final d f7215f;

    public final class a extends k {

        /* renamed from: p  reason: collision with root package name */
        public boolean f7216p;

        /* renamed from: q  reason: collision with root package name */
        public long f7217q;

        /* renamed from: r  reason: collision with root package name */
        public boolean f7218r;

        /* renamed from: s  reason: collision with root package name */
        public final long f7219s;

        /* renamed from: t  reason: collision with root package name */
        public final /* synthetic */ c f7220t;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(c cVar, z zVar, long j8) {
            super(zVar);
            g.f(zVar, "delegate");
            this.f7220t = cVar;
            this.f7219s = j8;
        }

        public final void H(f fVar, long j8) {
            g.f(fVar, "source");
            if (!this.f7218r) {
                long j10 = this.f7219s;
                if (j10 == -1 || this.f7217q + j8 <= j10) {
                    try {
                        super.H(fVar, j8);
                        this.f7217q += j8;
                    } catch (IOException e10) {
                        throw a(e10);
                    }
                } else {
                    throw new ProtocolException("expected " + j10 + " bytes but received " + (this.f7217q + j8));
                }
            } else {
                throw new IllegalStateException("closed".toString());
            }
        }

        public final <E extends IOException> E a(E e10) {
            if (this.f7216p) {
                return e10;
            }
            this.f7216p = true;
            return this.f7220t.a(false, true, e10);
        }

        public final void close() {
            if (!this.f7218r) {
                this.f7218r = true;
                long j8 = this.f7219s;
                if (j8 == -1 || this.f7217q == j8) {
                    try {
                        super.close();
                        a((IOException) null);
                    } catch (IOException e10) {
                        throw a(e10);
                    }
                } else {
                    throw new ProtocolException("unexpected end of stream");
                }
            }
        }

        public final void flush() {
            try {
                super.flush();
            } catch (IOException e10) {
                throw a(e10);
            }
        }
    }

    public final class b extends l {

        /* renamed from: p  reason: collision with root package name */
        public long f7221p;

        /* renamed from: q  reason: collision with root package name */
        public boolean f7222q = true;

        /* renamed from: r  reason: collision with root package name */
        public boolean f7223r;

        /* renamed from: s  reason: collision with root package name */
        public boolean f7224s;

        /* renamed from: t  reason: collision with root package name */
        public final long f7225t;
        public final /* synthetic */ c u;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(c cVar, b0 b0Var, long j8) {
            super(b0Var);
            g.f(b0Var, "delegate");
            this.u = cVar;
            this.f7225t = j8;
            if (j8 == 0) {
                a((IOException) null);
            }
        }

        public final <E extends IOException> E a(E e10) {
            if (this.f7223r) {
                return e10;
            }
            this.f7223r = true;
            c cVar = this.u;
            if (e10 == null && this.f7222q) {
                this.f7222q = false;
                cVar.d.getClass();
                g.f(cVar.f7213c, "call");
            }
            return cVar.a(true, false, e10);
        }

        public final void close() {
            if (!this.f7224s) {
                this.f7224s = true;
                try {
                    super.close();
                    a((IOException) null);
                } catch (IOException e10) {
                    throw a(e10);
                }
            }
        }

        public final long w(f fVar, long j8) {
            g.f(fVar, "sink");
            if (!this.f7224s) {
                try {
                    long w = this.f9333o.w(fVar, j8);
                    if (this.f7222q) {
                        this.f7222q = false;
                        c cVar = this.u;
                        n nVar = cVar.d;
                        e eVar = cVar.f7213c;
                        nVar.getClass();
                        g.f(eVar, "call");
                    }
                    if (w == -1) {
                        a((IOException) null);
                        return -1;
                    }
                    long j10 = this.f7221p + w;
                    long j11 = this.f7225t;
                    if (j11 == -1 || j10 <= j11) {
                        this.f7221p = j10;
                        if (j10 == j11) {
                            a((IOException) null);
                        }
                        return w;
                    }
                    throw new ProtocolException("expected " + j11 + " bytes but received " + j10);
                } catch (IOException e10) {
                    throw a(e10);
                }
            } else {
                throw new IllegalStateException("closed".toString());
            }
        }
    }

    public c(e eVar, n nVar, d dVar, d dVar2) {
        g.f(nVar, "eventListener");
        this.f7213c = eVar;
        this.d = nVar;
        this.f7214e = dVar;
        this.f7215f = dVar2;
        this.f7212b = dVar2.h();
    }

    public final IOException a(boolean z, boolean z10, IOException iOException) {
        if (iOException != null) {
            c(iOException);
        }
        n nVar = this.d;
        e eVar = this.f7213c;
        if (z10) {
            nVar.getClass();
            if (iOException != null) {
                g.f(eVar, "call");
            } else {
                g.f(eVar, "call");
            }
        }
        if (z) {
            if (iOException != null) {
                nVar.getClass();
                g.f(eVar, "call");
            } else {
                nVar.getClass();
                g.f(eVar, "call");
            }
        }
        return eVar.k(this, z10, z, iOException);
    }

    public final c0.a b(boolean z) {
        try {
            c0.a f10 = this.f7215f.f(z);
            if (f10 != null) {
                f10.f6209m = this;
            }
            return f10;
        } catch (IOException e10) {
            this.d.getClass();
            g.f(this.f7213c, "call");
            c(e10);
            throw e10;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0026, code lost:
        if (r6 > 1) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(java.io.IOException r6) {
        /*
            r5 = this;
            m9.d r0 = r5.f7214e
            r0.c(r6)
            n9.d r0 = r5.f7215f
            m9.h r0 = r0.h()
            m9.e r1 = r5.f7213c
            monitor-enter(r0)
            java.lang.String r2 = "call"
            z8.g.f(r1, r2)     // Catch:{ all -> 0x0059 }
            boolean r2 = r6 instanceof p9.x     // Catch:{ all -> 0x0059 }
            r3 = 1
            if (r2 == 0) goto L_0x0038
            r2 = r6
            p9.x r2 = (p9.x) r2     // Catch:{ all -> 0x0059 }
            p9.b r2 = r2.f8123o     // Catch:{ all -> 0x0059 }
            p9.b r4 = p9.b.REFUSED_STREAM     // Catch:{ all -> 0x0059 }
            if (r2 != r4) goto L_0x002b
            int r6 = r0.f7262m     // Catch:{ all -> 0x0059 }
            int r6 = r6 + r3
            r0.f7262m = r6     // Catch:{ all -> 0x0059 }
            if (r6 <= r3) goto L_0x0057
        L_0x0028:
            r0.f7259i = r3     // Catch:{ all -> 0x0059 }
            goto L_0x0052
        L_0x002b:
            p9.x r6 = (p9.x) r6     // Catch:{ all -> 0x0059 }
            p9.b r6 = r6.f8123o     // Catch:{ all -> 0x0059 }
            p9.b r2 = p9.b.CANCEL     // Catch:{ all -> 0x0059 }
            if (r6 != r2) goto L_0x0028
            boolean r6 = r1.A     // Catch:{ all -> 0x0059 }
            if (r6 == 0) goto L_0x0028
            goto L_0x0057
        L_0x0038:
            p9.f r2 = r0.f7256f     // Catch:{ all -> 0x0059 }
            if (r2 == 0) goto L_0x003e
            r2 = r3
            goto L_0x003f
        L_0x003e:
            r2 = 0
        L_0x003f:
            if (r2 == 0) goto L_0x0045
            boolean r2 = r6 instanceof p9.a     // Catch:{ all -> 0x0059 }
            if (r2 == 0) goto L_0x0057
        L_0x0045:
            r0.f7259i = r3     // Catch:{ all -> 0x0059 }
            int r2 = r0.l     // Catch:{ all -> 0x0059 }
            if (r2 != 0) goto L_0x0057
            i9.v r1 = r1.D     // Catch:{ all -> 0x0059 }
            i9.f0 r2 = r0.f7266q     // Catch:{ all -> 0x0059 }
            m9.h.d(r1, r2, r6)     // Catch:{ all -> 0x0059 }
        L_0x0052:
            int r6 = r0.f7261k     // Catch:{ all -> 0x0059 }
            int r6 = r6 + r3
            r0.f7261k = r6     // Catch:{ all -> 0x0059 }
        L_0x0057:
            monitor-exit(r0)
            return
        L_0x0059:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: m9.c.c(java.io.IOException):void");
    }
}
