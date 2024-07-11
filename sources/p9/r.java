package p9;

import b0.d;
import i9.q;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import n8.i;
import w9.b0;
import w9.c0;
import w9.f;
import w9.z;
import z8.g;

public final class r {

    /* renamed from: a  reason: collision with root package name */
    public long f8067a;

    /* renamed from: b  reason: collision with root package name */
    public long f8068b;

    /* renamed from: c  reason: collision with root package name */
    public long f8069c;
    public long d;

    /* renamed from: e  reason: collision with root package name */
    public final ArrayDeque<q> f8070e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f8071f;

    /* renamed from: g  reason: collision with root package name */
    public final b f8072g;

    /* renamed from: h  reason: collision with root package name */
    public final a f8073h;

    /* renamed from: i  reason: collision with root package name */
    public final c f8074i = new c();

    /* renamed from: j  reason: collision with root package name */
    public final c f8075j = new c();

    /* renamed from: k  reason: collision with root package name */
    public b f8076k;
    public IOException l;

    /* renamed from: m  reason: collision with root package name */
    public final int f8077m;

    /* renamed from: n  reason: collision with root package name */
    public final f f8078n;

    public final class a implements z {

        /* renamed from: o  reason: collision with root package name */
        public final f f8079o = new f();

        /* renamed from: p  reason: collision with root package name */
        public boolean f8080p;

        /* renamed from: q  reason: collision with root package name */
        public final boolean f8081q;

        public a(boolean z) {
            this.f8081q = z;
        }

        public final void H(f fVar, long j8) {
            g.f(fVar, "source");
            byte[] bArr = j9.c.f6602a;
            f fVar2 = this.f8079o;
            fVar2.H(fVar, j8);
            while (fVar2.f9325p >= 16384) {
                a(false);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:21:0x002b, code lost:
            r13 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
            r12.f8082r.f8075j.l();
            r12.f8082r.b();
            r1 = r12.f8082r;
            r10 = java.lang.Math.min(r1.d - r1.f8069c, r12.f8079o.f9325p);
            r1 = r12.f8082r;
            r1.f8069c += r10;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x004f, code lost:
            if (r13 == false) goto L_0x0064;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0057, code lost:
            if (r10 != r12.f8079o.f9325p) goto L_0x0064;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0059, code lost:
            monitor-enter(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
            r13 = r1.f8076k;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
            monitor-exit(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x005d, code lost:
            if (r13 != null) goto L_0x0064;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x005f, code lost:
            r13 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x0064, code lost:
            r13 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:0x0065, code lost:
            r8 = r13;
            r13 = n8.i.f7501a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
            r12.f8082r.f8075j.l();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:0x0093, code lost:
            throw r13;
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(boolean r13) {
            /*
                r12 = this;
                p9.r r0 = p9.r.this
                monitor-enter(r0)
                p9.r r1 = p9.r.this     // Catch:{ all -> 0x0094 }
                p9.r$c r1 = r1.f8075j     // Catch:{ all -> 0x0094 }
                r1.h()     // Catch:{ all -> 0x0094 }
            L_0x000a:
                p9.r r1 = p9.r.this     // Catch:{ all -> 0x002b }
                long r2 = r1.f8069c     // Catch:{ all -> 0x002b }
                long r4 = r1.d     // Catch:{ all -> 0x002b }
                int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r2 < 0) goto L_0x002d
                boolean r2 = r12.f8081q     // Catch:{ all -> 0x002b }
                if (r2 != 0) goto L_0x002d
                boolean r2 = r12.f8080p     // Catch:{ all -> 0x002b }
                if (r2 != 0) goto L_0x002d
                monitor-enter(r1)     // Catch:{ all -> 0x002b }
                p9.b r2 = r1.f8076k     // Catch:{ all -> 0x0028 }
                monitor-exit(r1)     // Catch:{ all -> 0x002b }
                if (r2 != 0) goto L_0x002d
                p9.r r1 = p9.r.this     // Catch:{ all -> 0x002b }
                r1.j()     // Catch:{ all -> 0x002b }
                goto L_0x000a
            L_0x0028:
                r13 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x002b }
                throw r13     // Catch:{ all -> 0x002b }
            L_0x002b:
                r13 = move-exception
                goto L_0x008c
            L_0x002d:
                p9.r r1 = p9.r.this     // Catch:{ all -> 0x0094 }
                p9.r$c r1 = r1.f8075j     // Catch:{ all -> 0x0094 }
                r1.l()     // Catch:{ all -> 0x0094 }
                p9.r r1 = p9.r.this     // Catch:{ all -> 0x0094 }
                r1.b()     // Catch:{ all -> 0x0094 }
                p9.r r1 = p9.r.this     // Catch:{ all -> 0x0094 }
                long r2 = r1.d     // Catch:{ all -> 0x0094 }
                long r4 = r1.f8069c     // Catch:{ all -> 0x0094 }
                long r2 = r2 - r4
                w9.f r1 = r12.f8079o     // Catch:{ all -> 0x0094 }
                long r4 = r1.f9325p     // Catch:{ all -> 0x0094 }
                long r10 = java.lang.Math.min(r2, r4)     // Catch:{ all -> 0x0094 }
                p9.r r1 = p9.r.this     // Catch:{ all -> 0x0094 }
                long r2 = r1.f8069c     // Catch:{ all -> 0x0094 }
                long r2 = r2 + r10
                r1.f8069c = r2     // Catch:{ all -> 0x0094 }
                if (r13 == 0) goto L_0x0064
                w9.f r13 = r12.f8079o     // Catch:{ all -> 0x0094 }
                long r2 = r13.f9325p     // Catch:{ all -> 0x0094 }
                int r13 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
                if (r13 != 0) goto L_0x0064
                monitor-enter(r1)     // Catch:{ all -> 0x0094 }
                p9.b r13 = r1.f8076k     // Catch:{ all -> 0x0061 }
                monitor-exit(r1)     // Catch:{ all -> 0x0094 }
                if (r13 != 0) goto L_0x0064
                r13 = 1
                goto L_0x0065
            L_0x0061:
                r13 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x0094 }
                throw r13     // Catch:{ all -> 0x0094 }
            L_0x0064:
                r13 = 0
            L_0x0065:
                r8 = r13
                n8.i r13 = n8.i.f7501a     // Catch:{ all -> 0x0094 }
                monitor-exit(r0)
                p9.r r13 = p9.r.this
                p9.r$c r13 = r13.f8075j
                r13.h()
                p9.r r13 = p9.r.this     // Catch:{ all -> 0x0083 }
                p9.f r6 = r13.f8078n     // Catch:{ all -> 0x0083 }
                int r7 = r13.f8077m     // Catch:{ all -> 0x0083 }
                w9.f r9 = r12.f8079o     // Catch:{ all -> 0x0083 }
                r6.j(r7, r8, r9, r10)     // Catch:{ all -> 0x0083 }
                p9.r r13 = p9.r.this
                p9.r$c r13 = r13.f8075j
                r13.l()
                return
            L_0x0083:
                r13 = move-exception
                p9.r r0 = p9.r.this
                p9.r$c r0 = r0.f8075j
                r0.l()
                throw r13
            L_0x008c:
                p9.r r1 = p9.r.this     // Catch:{ all -> 0x0094 }
                p9.r$c r1 = r1.f8075j     // Catch:{ all -> 0x0094 }
                r1.l()     // Catch:{ all -> 0x0094 }
                throw r13     // Catch:{ all -> 0x0094 }
            L_0x0094:
                r13 = move-exception
                monitor-exit(r0)
                throw r13
            */
            throw new UnsupportedOperationException("Method not decompiled: p9.r.a.a(boolean):void");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:20:0x001b, code lost:
            r0 = r14.f8082r;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0021, code lost:
            if (r0.f8073h.f8081q != false) goto L_0x0049;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x002b, code lost:
            if (r14.f8079o.f9325p <= 0) goto L_0x002e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x002d, code lost:
            r1 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x002e, code lost:
            if (r1 == false) goto L_0x003c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0036, code lost:
            if (r14.f8079o.f9325p <= 0) goto L_0x0049;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x0038, code lost:
            a(true);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x003c, code lost:
            if (r2 == false) goto L_0x0049;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x003e, code lost:
            r0.f8078n.j(r0.f8077m, true, (w9.f) null, 0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x0049, code lost:
            r0 = r14.f8082r;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x004b, code lost:
            monitor-enter(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
            r14.f8080p = true;
            r1 = n8.i.f7501a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x0050, code lost:
            monitor-exit(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x0051, code lost:
            r14.f8082r.f8078n.flush();
            r14.f8082r.a();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x005d, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void close() {
            /*
                r14 = this;
                p9.r r0 = p9.r.this
                byte[] r1 = j9.c.f6602a
                monitor-enter(r0)
                boolean r1 = r14.f8080p     // Catch:{ all -> 0x0064 }
                if (r1 == 0) goto L_0x000b
                monitor-exit(r0)
                return
            L_0x000b:
                p9.r r1 = p9.r.this     // Catch:{ all -> 0x0064 }
                monitor-enter(r1)     // Catch:{ all -> 0x0064 }
                p9.b r2 = r1.f8076k     // Catch:{ all -> 0x0061 }
                monitor-exit(r1)     // Catch:{ all -> 0x0064 }
                r1 = 0
                r3 = 1
                if (r2 != 0) goto L_0x0017
                r2 = r3
                goto L_0x0018
            L_0x0017:
                r2 = r1
            L_0x0018:
                n8.i r4 = n8.i.f7501a     // Catch:{ all -> 0x0064 }
                monitor-exit(r0)
                p9.r r0 = p9.r.this
                p9.r$a r4 = r0.f8073h
                boolean r4 = r4.f8081q
                if (r4 != 0) goto L_0x0049
                w9.f r4 = r14.f8079o
                long r4 = r4.f9325p
                r6 = 0
                int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r4 <= 0) goto L_0x002e
                r1 = r3
            L_0x002e:
                if (r1 == 0) goto L_0x003c
            L_0x0030:
                w9.f r0 = r14.f8079o
                long r0 = r0.f9325p
                int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
                if (r0 <= 0) goto L_0x0049
                r14.a(r3)
                goto L_0x0030
            L_0x003c:
                if (r2 == 0) goto L_0x0049
                p9.f r8 = r0.f8078n
                int r9 = r0.f8077m
                r10 = 1
                r11 = 0
                r12 = 0
                r8.j(r9, r10, r11, r12)
            L_0x0049:
                p9.r r0 = p9.r.this
                monitor-enter(r0)
                r14.f8080p = r3     // Catch:{ all -> 0x005e }
                n8.i r1 = n8.i.f7501a     // Catch:{ all -> 0x005e }
                monitor-exit(r0)
                p9.r r0 = p9.r.this
                p9.f r0 = r0.f8078n
                r0.flush()
                p9.r r0 = p9.r.this
                r0.a()
                return
            L_0x005e:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            L_0x0061:
                r2 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x0064 }
                throw r2     // Catch:{ all -> 0x0064 }
            L_0x0064:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p9.r.a.close():void");
        }

        public final void flush() {
            r rVar = r.this;
            byte[] bArr = j9.c.f6602a;
            synchronized (rVar) {
                r.this.b();
                i iVar = i.f7501a;
            }
            while (this.f8079o.f9325p > 0) {
                a(false);
                r.this.f8078n.flush();
            }
        }

        public final c0 h() {
            return r.this.f8075j;
        }
    }

    public final class b implements b0 {

        /* renamed from: o  reason: collision with root package name */
        public final f f8083o = new f();

        /* renamed from: p  reason: collision with root package name */
        public final f f8084p = new f();

        /* renamed from: q  reason: collision with root package name */
        public boolean f8085q;

        /* renamed from: r  reason: collision with root package name */
        public final long f8086r;

        /* renamed from: s  reason: collision with root package name */
        public boolean f8087s;

        public b(long j8, boolean z) {
            this.f8086r = j8;
            this.f8087s = z;
        }

        public final void a(long j8) {
            byte[] bArr = j9.c.f6602a;
            r.this.f8078n.g(j8);
        }

        public final void close() {
            long j8;
            synchronized (r.this) {
                this.f8085q = true;
                f fVar = this.f8084p;
                j8 = fVar.f9325p;
                fVar.c();
                r rVar = r.this;
                if (rVar != null) {
                    rVar.notifyAll();
                    i iVar = i.f7501a;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                }
            }
            if (j8 > 0) {
                a(j8);
            }
            r.this.a();
        }

        public final c0 h() {
            return r.this.f8074i;
        }

        public final long w(f fVar, long j8) {
            boolean z;
            b bVar;
            Throwable th;
            long j10;
            boolean z10;
            long j11;
            b bVar2;
            f fVar2 = fVar;
            long j12 = j8;
            g.f(fVar2, "sink");
            long j13 = 0;
            if (j12 >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                while (true) {
                    synchronized (r.this) {
                        r.this.f8074i.h();
                        try {
                            r rVar = r.this;
                            synchronized (rVar) {
                                bVar = rVar.f8076k;
                            }
                            if (bVar != null) {
                                th = r.this.l;
                                if (th == null) {
                                    r rVar2 = r.this;
                                    synchronized (rVar2) {
                                        bVar2 = rVar2.f8076k;
                                    }
                                    g.c(bVar2);
                                    th = new x(bVar2);
                                }
                            } else {
                                th = null;
                            }
                            if (!this.f8085q) {
                                f fVar3 = this.f8084p;
                                long j14 = fVar3.f9325p;
                                if (j14 > j13) {
                                    j11 = fVar3.w(fVar2, Math.min(j12, j14));
                                    r rVar3 = r.this;
                                    long j15 = rVar3.f8067a + j11;
                                    rVar3.f8067a = j15;
                                    long j16 = j15 - rVar3.f8068b;
                                    if (th == null && j16 >= ((long) (rVar3.f8078n.F.a() / 2))) {
                                        r rVar4 = r.this;
                                        rVar4.f8078n.n(rVar4.f8077m, j16);
                                        r rVar5 = r.this;
                                        rVar5.f8068b = rVar5.f8067a;
                                    }
                                } else if (this.f8087s || th != null) {
                                    j11 = -1;
                                } else {
                                    r.this.j();
                                    z10 = true;
                                    j10 = -1;
                                    r.this.f8074i.l();
                                    i iVar = i.f7501a;
                                }
                                long j17 = j11;
                                z10 = false;
                                j10 = j17;
                                r.this.f8074i.l();
                                i iVar2 = i.f7501a;
                            } else {
                                throw new IOException("stream closed");
                            }
                        } catch (Throwable th2) {
                            r.this.f8074i.l();
                            throw th2;
                        }
                    }
                    if (z10) {
                        j13 = 0;
                    } else if (j10 != -1) {
                        a(j10);
                        return j10;
                    } else if (th == null) {
                        return -1;
                    } else {
                        throw th;
                    }
                }
            } else {
                throw new IllegalArgumentException(d.d("byteCount < 0: ", j12).toString());
            }
        }
    }

    public final class c extends w9.b {
        public c() {
        }

        public final IOException j(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        public final void k() {
            r.this.e(b.CANCEL);
            f fVar = r.this.f8078n;
            synchronized (fVar) {
                long j8 = fVar.D;
                long j10 = fVar.C;
                if (j8 >= j10) {
                    fVar.C = j10 + 1;
                    fVar.E = System.nanoTime() + ((long) 1000000000);
                    i iVar = i.f7501a;
                    fVar.w.c(new o(d.g(new StringBuilder(), fVar.f7999r, " ping"), fVar), 0);
                }
            }
        }

        public final void l() {
            if (i()) {
                throw j((IOException) null);
            }
        }
    }

    public r(int i10, f fVar, boolean z, boolean z10, q qVar) {
        g.f(fVar, "connection");
        this.f8077m = i10;
        this.f8078n = fVar;
        this.d = (long) fVar.G.a();
        ArrayDeque<q> arrayDeque = new ArrayDeque<>();
        this.f8070e = arrayDeque;
        this.f8072g = new b((long) fVar.F.a(), z10);
        this.f8073h = new a(z);
        if (qVar != null) {
            if (!g()) {
                arrayDeque.add(qVar);
                return;
            }
            throw new IllegalStateException("locally-initiated streams shouldn't have headers yet".toString());
        } else if (!g()) {
            throw new IllegalStateException("remotely-initiated streams should have headers".toString());
        }
    }

    public final void a() {
        boolean z;
        boolean h10;
        byte[] bArr = j9.c.f6602a;
        synchronized (this) {
            b bVar = this.f8072g;
            if (!bVar.f8087s && bVar.f8085q) {
                a aVar = this.f8073h;
                if (aVar.f8081q || aVar.f8080p) {
                    z = true;
                    h10 = h();
                    i iVar = i.f7501a;
                }
            }
            z = false;
            h10 = h();
            i iVar2 = i.f7501a;
        }
        if (z) {
            c(b.CANCEL, (IOException) null);
        } else if (!h10) {
            this.f8078n.d(this.f8077m);
        }
    }

    public final void b() {
        a aVar = this.f8073h;
        if (aVar.f8080p) {
            throw new IOException("stream closed");
        } else if (aVar.f8081q) {
            throw new IOException("stream finished");
        } else if (this.f8076k != null) {
            Throwable th = this.l;
            if (th == null) {
                b bVar = this.f8076k;
                g.c(bVar);
                th = new x(bVar);
            }
            throw th;
        }
    }

    public final void c(b bVar, IOException iOException) {
        g.f(bVar, "rstStatusCode");
        if (d(bVar, iOException)) {
            f fVar = this.f8078n;
            fVar.getClass();
            fVar.M.g(this.f8077m, bVar);
        }
    }

    public final boolean d(b bVar, IOException iOException) {
        byte[] bArr = j9.c.f6602a;
        synchronized (this) {
            if (this.f8076k != null) {
                return false;
            }
            if (this.f8072g.f8087s && this.f8073h.f8081q) {
                return false;
            }
            this.f8076k = bVar;
            this.l = iOException;
            notifyAll();
            i iVar = i.f7501a;
            this.f8078n.d(this.f8077m);
            return true;
        }
    }

    public final void e(b bVar) {
        g.f(bVar, "errorCode");
        if (d(bVar, (IOException) null)) {
            this.f8078n.l(this.f8077m, bVar);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0011  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0017  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p9.r.a f() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f8071f     // Catch:{ all -> 0x0023 }
            if (r0 != 0) goto L_0x000e
            boolean r0 = r2.g()     // Catch:{ all -> 0x0023 }
            if (r0 == 0) goto L_0x000c
            goto L_0x000e
        L_0x000c:
            r0 = 0
            goto L_0x000f
        L_0x000e:
            r0 = 1
        L_0x000f:
            if (r0 == 0) goto L_0x0017
            n8.i r0 = n8.i.f7501a     // Catch:{ all -> 0x0023 }
            monitor-exit(r2)
            p9.r$a r0 = r2.f8073h
            return r0
        L_0x0017:
            java.lang.String r0 = "reply before requesting the sink"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0023 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0023 }
            r1.<init>(r0)     // Catch:{ all -> 0x0023 }
            throw r1     // Catch:{ all -> 0x0023 }
        L_0x0023:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p9.r.f():p9.r$a");
    }

    public final boolean g() {
        boolean z;
        if ((this.f8077m & 1) == 1) {
            z = true;
        } else {
            z = false;
        }
        if (this.f8078n.f7996o == z) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0023, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean h() {
        /*
            r3 = this;
            monitor-enter(r3)
            p9.b r0 = r3.f8076k     // Catch:{ all -> 0x0025 }
            r1 = 0
            if (r0 == 0) goto L_0x0008
            monitor-exit(r3)
            return r1
        L_0x0008:
            p9.r$b r0 = r3.f8072g     // Catch:{ all -> 0x0025 }
            boolean r2 = r0.f8087s     // Catch:{ all -> 0x0025 }
            if (r2 != 0) goto L_0x0012
            boolean r0 = r0.f8085q     // Catch:{ all -> 0x0025 }
            if (r0 == 0) goto L_0x0022
        L_0x0012:
            p9.r$a r0 = r3.f8073h     // Catch:{ all -> 0x0025 }
            boolean r2 = r0.f8081q     // Catch:{ all -> 0x0025 }
            if (r2 != 0) goto L_0x001c
            boolean r0 = r0.f8080p     // Catch:{ all -> 0x0025 }
            if (r0 == 0) goto L_0x0022
        L_0x001c:
            boolean r0 = r3.f8071f     // Catch:{ all -> 0x0025 }
            if (r0 == 0) goto L_0x0022
            monitor-exit(r3)
            return r1
        L_0x0022:
            monitor-exit(r3)
            r0 = 1
            return r0
        L_0x0025:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p9.r.h():boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void i(i9.q r3, boolean r4) {
        /*
            r2 = this;
            java.lang.String r0 = "headers"
            z8.g.f(r3, r0)
            byte[] r0 = j9.c.f6602a
            monitor-enter(r2)
            boolean r0 = r2.f8071f     // Catch:{ all -> 0x0037 }
            r1 = 1
            if (r0 == 0) goto L_0x0016
            if (r4 != 0) goto L_0x0010
            goto L_0x0016
        L_0x0010:
            p9.r$b r3 = r2.f8072g     // Catch:{ all -> 0x0037 }
            r3.getClass()     // Catch:{ all -> 0x0037 }
            goto L_0x001d
        L_0x0016:
            r2.f8071f = r1     // Catch:{ all -> 0x0037 }
            java.util.ArrayDeque<i9.q> r0 = r2.f8070e     // Catch:{ all -> 0x0037 }
            r0.add(r3)     // Catch:{ all -> 0x0037 }
        L_0x001d:
            if (r4 == 0) goto L_0x0023
            p9.r$b r3 = r2.f8072g     // Catch:{ all -> 0x0037 }
            r3.f8087s = r1     // Catch:{ all -> 0x0037 }
        L_0x0023:
            boolean r3 = r2.h()     // Catch:{ all -> 0x0037 }
            r2.notifyAll()     // Catch:{ all -> 0x0037 }
            n8.i r4 = n8.i.f7501a     // Catch:{ all -> 0x0037 }
            monitor-exit(r2)
            if (r3 != 0) goto L_0x0036
            p9.f r3 = r2.f8078n
            int r4 = r2.f8077m
            r3.d(r4)
        L_0x0036:
            return
        L_0x0037:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p9.r.i(i9.q, boolean):void");
    }

    public final void j() {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }
}
