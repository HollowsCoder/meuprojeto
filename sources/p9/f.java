package p9;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p9.q;
import p9.r;
import w9.h;
import w9.i;
import w9.j;
import z8.g;

public final class f implements Closeable {
    public static final w P;
    public long A;
    public long B;
    public long C;
    public long D;
    public long E;
    public final w F;
    public w G;
    public long H;
    public long I;
    public long J;
    public long K;
    public final Socket L;
    public final s M;
    public final d N;
    public final LinkedHashSet O;

    /* renamed from: o  reason: collision with root package name */
    public final boolean f7996o;

    /* renamed from: p  reason: collision with root package name */
    public final c f7997p;

    /* renamed from: q  reason: collision with root package name */
    public final LinkedHashMap f7998q = new LinkedHashMap();

    /* renamed from: r  reason: collision with root package name */
    public final String f7999r;

    /* renamed from: s  reason: collision with root package name */
    public int f8000s;

    /* renamed from: t  reason: collision with root package name */
    public int f8001t;
    public boolean u;

    /* renamed from: v  reason: collision with root package name */
    public final l9.d f8002v;
    public final l9.c w;

    /* renamed from: x  reason: collision with root package name */
    public final l9.c f8003x;

    /* renamed from: y  reason: collision with root package name */
    public final l9.c f8004y;
    public final u z;

    public static final class a extends l9.a {

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ f f8005e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ long f8006f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(String str, f fVar, long j8) {
            super(str, true);
            this.f8005e = fVar;
            this.f8006f = j8;
        }

        public final long a() {
            f fVar;
            boolean z;
            synchronized (this.f8005e) {
                fVar = this.f8005e;
                long j8 = fVar.B;
                long j10 = fVar.A;
                if (j8 < j10) {
                    z = true;
                } else {
                    fVar.A = j10 + 1;
                    z = false;
                }
            }
            if (z) {
                fVar.b((IOException) null);
                return -1;
            }
            try {
                fVar.M.f(1, 0, false);
            } catch (IOException e10) {
                fVar.b(e10);
            }
            return this.f8006f;
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public Socket f8007a;

        /* renamed from: b  reason: collision with root package name */
        public String f8008b;

        /* renamed from: c  reason: collision with root package name */
        public i f8009c;
        public h d;

        /* renamed from: e  reason: collision with root package name */
        public c f8010e;

        /* renamed from: f  reason: collision with root package name */
        public final u f8011f;

        /* renamed from: g  reason: collision with root package name */
        public int f8012g;

        /* renamed from: h  reason: collision with root package name */
        public final boolean f8013h = true;

        /* renamed from: i  reason: collision with root package name */
        public final l9.d f8014i;

        public b(l9.d dVar) {
            g.f(dVar, "taskRunner");
            this.f8014i = dVar;
            this.f8010e = c.f8015a;
            this.f8011f = v.f8120m;
        }
    }

    public static abstract class c {

        /* renamed from: a  reason: collision with root package name */
        public static final a f8015a = new a();

        public static final class a extends c {
            public final void b(r rVar) {
                g.f(rVar, "stream");
                rVar.c(b.REFUSED_STREAM, (IOException) null);
            }
        }

        public void a(f fVar, w wVar) {
            g.f(fVar, "connection");
            g.f(wVar, "settings");
        }

        public abstract void b(r rVar);
    }

    public final class d implements q.c, y8.a<n8.i> {

        /* renamed from: o  reason: collision with root package name */
        public final q f8016o;

        public d(q qVar) {
            this.f8016o = qVar;
        }

        public final void a(int i10, List list) {
            f fVar = f.this;
            fVar.getClass();
            synchronized (fVar) {
                if (fVar.O.contains(Integer.valueOf(i10))) {
                    fVar.l(i10, b.PROTOCOL_ERROR);
                    return;
                }
                fVar.O.add(Integer.valueOf(i10));
                l9.c cVar = fVar.f8003x;
                cVar.c(new m(fVar.f7999r + '[' + i10 + "] onRequest", fVar, i10, list), 0);
            }
        }

        public final void b() {
        }

        public final void d(boolean z, int i10, List list) {
            boolean z10;
            f.this.getClass();
            if (i10 == 0 || (i10 & 1) != 0) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                f fVar = f.this;
                fVar.getClass();
                fVar.f8003x.c(new l(fVar.f7999r + '[' + i10 + "] onHeaders", fVar, i10, list, z), 0);
                return;
            }
            synchronized (f.this) {
                r c10 = f.this.c(i10);
                if (c10 == null) {
                    f fVar2 = f.this;
                    if (!fVar2.u) {
                        if (i10 > fVar2.f8000s) {
                            if (i10 % 2 != fVar2.f8001t % 2) {
                                int i11 = i10;
                                r rVar = new r(i11, f.this, false, z, j9.c.t(list));
                                f fVar3 = f.this;
                                fVar3.f8000s = i10;
                                fVar3.f7998q.put(Integer.valueOf(i10), rVar);
                                l9.c f10 = f.this.f8002v.f();
                                f10.c(new h(f.this.f7999r + '[' + i10 + "] onStream", rVar, this, list), 0);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                n8.i iVar = n8.i.f7501a;
                c10.i(j9.c.t(list), z);
            }
        }

        public final void e() {
        }

        public final void f(w wVar) {
            f fVar = f.this;
            fVar.w.c(new j(b0.d.g(new StringBuilder(), fVar.f7999r, " applyAndAckSettings"), this, wVar), 0);
        }

        public final void g(int i10, b bVar, j jVar) {
            int i11;
            r[] rVarArr;
            g.f(jVar, "debugData");
            jVar.k();
            synchronized (f.this) {
                Object[] array = f.this.f7998q.values().toArray(new r[0]);
                if (array != null) {
                    rVarArr = (r[]) array;
                    f.this.u = true;
                    n8.i iVar = n8.i.f7501a;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
            }
            for (r rVar : rVarArr) {
                if (rVar.f8077m > i10 && rVar.g()) {
                    b bVar2 = b.REFUSED_STREAM;
                    synchronized (rVar) {
                        g.f(bVar2, "errorCode");
                        if (rVar.f8076k == null) {
                            rVar.f8076k = bVar2;
                            rVar.notifyAll();
                        }
                    }
                    f.this.d(rVar.f8077m);
                }
            }
        }

        public final void h(int i10, b bVar) {
            boolean z;
            f fVar = f.this;
            fVar.getClass();
            if (i10 == 0 || (i10 & 1) != 0) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                fVar.f8003x.c(new n(fVar.f7999r + '[' + i10 + "] onReset", fVar, i10, bVar), 0);
                return;
            }
            r d = fVar.d(i10);
            if (d != null) {
                synchronized (d) {
                    if (d.f8076k == null) {
                        d.f8076k = bVar;
                        d.notifyAll();
                    }
                }
            }
        }

        public final void l(int i10, long j8) {
            Object obj;
            if (i10 == 0) {
                Object obj2 = f.this;
                synchronized (obj2) {
                    f fVar = f.this;
                    fVar.K += j8;
                    fVar.notifyAll();
                    n8.i iVar = n8.i.f7501a;
                    obj = obj2;
                }
            } else {
                r c10 = f.this.c(i10);
                if (c10 != null) {
                    synchronized (c10) {
                        c10.d += j8;
                        if (j8 > 0) {
                            c10.notifyAll();
                        }
                        n8.i iVar2 = n8.i.f7501a;
                        obj = c10;
                    }
                } else {
                    return;
                }
            }
        }

        public final void m(int i10, int i11, boolean z) {
            if (z) {
                synchronized (f.this) {
                    if (i10 == 1) {
                        f.this.B++;
                    } else if (i10 != 2) {
                        if (i10 == 3) {
                            f fVar = f.this;
                            fVar.getClass();
                            fVar.notifyAll();
                        }
                        n8.i iVar = n8.i.f7501a;
                    } else {
                        f.this.D++;
                    }
                }
                return;
            }
            f.this.w.c(new i(b0.d.g(new StringBuilder(), f.this.f7999r, " ping"), this, i10, i11), 0);
        }

        public final Object n() {
            b bVar;
            f fVar = f.this;
            q qVar = this.f8016o;
            b bVar2 = b.INTERNAL_ERROR;
            e = null;
            try {
                qVar.b(this);
                while (qVar.a(false, this)) {
                }
                bVar = b.NO_ERROR;
                try {
                    fVar.a(bVar, b.CANCEL, (IOException) null);
                } catch (IOException e10) {
                    e = e10;
                    try {
                        b bVar3 = b.PROTOCOL_ERROR;
                        fVar.a(bVar3, bVar3, e);
                        j9.c.c(qVar);
                        return n8.i.f7501a;
                    } catch (Throwable th) {
                        th = th;
                        fVar.a(bVar, bVar2, e);
                        j9.c.c(qVar);
                        throw th;
                    }
                }
            } catch (IOException e11) {
                e = e11;
                bVar = bVar2;
                b bVar32 = b.PROTOCOL_ERROR;
                fVar.a(bVar32, bVar32, e);
                j9.c.c(qVar);
                return n8.i.f7501a;
            } catch (Throwable th2) {
                th = th2;
                bVar = bVar2;
                fVar.a(bVar, bVar2, e);
                j9.c.c(qVar);
                throw th;
            }
            j9.c.c(qVar);
            return n8.i.f7501a;
        }

        public final void o(int i10, int i11, i iVar, boolean z) {
            boolean z10;
            boolean z11;
            boolean z12;
            long j8;
            boolean z13;
            int i12 = i10;
            int i13 = i11;
            i iVar2 = iVar;
            g.f(iVar2, "source");
            f.this.getClass();
            if (i12 == 0 || (i12 & 1) != 0) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                f fVar = f.this;
                fVar.getClass();
                w9.f fVar2 = new w9.f();
                long j10 = (long) i13;
                iVar2.X(j10);
                iVar2.w(fVar2, j10);
                fVar.f8003x.c(new k(fVar.f7999r + '[' + i12 + "] onData", fVar, i10, fVar2, i11, z), 0);
                return;
            }
            r c10 = f.this.c(i12);
            if (c10 == null) {
                f.this.l(i12, b.PROTOCOL_ERROR);
                long j11 = (long) i13;
                f.this.g(j11);
                iVar2.skip(j11);
                return;
            }
            byte[] bArr = j9.c.f6602a;
            r.b bVar = c10.f8072g;
            long j12 = (long) i13;
            bVar.getClass();
            while (true) {
                if (j12 <= 0) {
                    break;
                }
                synchronized (r.this) {
                    z11 = bVar.f8087s;
                    if (bVar.f8084p.f9325p + j12 > bVar.f8086r) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    n8.i iVar3 = n8.i.f7501a;
                }
                if (z12) {
                    iVar2.skip(j12);
                    r.this.e(b.FLOW_CONTROL_ERROR);
                    break;
                } else if (z11) {
                    iVar2.skip(j12);
                    break;
                } else {
                    long w = iVar2.w(bVar.f8083o, j12);
                    if (w != -1) {
                        j12 -= w;
                        synchronized (r.this) {
                            if (bVar.f8085q) {
                                w9.f fVar3 = bVar.f8083o;
                                j8 = fVar3.f9325p;
                                fVar3.c();
                            } else {
                                w9.f fVar4 = bVar.f8084p;
                                if (fVar4.f9325p == 0) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                fVar4.N(bVar.f8083o);
                                if (z13) {
                                    r rVar = r.this;
                                    if (rVar != null) {
                                        rVar.notifyAll();
                                    } else {
                                        throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                                    }
                                }
                                j8 = 0;
                            }
                        }
                        if (j8 > 0) {
                            bVar.a(j8);
                        }
                    } else {
                        throw new EOFException();
                    }
                }
            }
            if (z) {
                c10.i(j9.c.f6603b, true);
            }
        }
    }

    public static final class e extends l9.a {

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ f f8018e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ int f8019f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ b f8020g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(String str, f fVar, int i10, b bVar) {
            super(str, true);
            this.f8018e = fVar;
            this.f8019f = i10;
            this.f8020g = bVar;
        }

        public final long a() {
            f fVar = this.f8018e;
            try {
                int i10 = this.f8019f;
                b bVar = this.f8020g;
                fVar.getClass();
                g.f(bVar, "statusCode");
                fVar.M.g(i10, bVar);
                return -1;
            } catch (IOException e10) {
                fVar.b(e10);
                return -1;
            }
        }
    }

    /* renamed from: p9.f$f  reason: collision with other inner class name */
    public static final class C0116f extends l9.a {

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ f f8021e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ int f8022f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ long f8023g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0116f(String str, f fVar, int i10, long j8) {
            super(str, true);
            this.f8021e = fVar;
            this.f8022f = i10;
            this.f8023g = j8;
        }

        public final long a() {
            f fVar = this.f8021e;
            try {
                fVar.M.j(this.f8022f, this.f8023g);
                return -1;
            } catch (IOException e10) {
                fVar.b(e10);
                return -1;
            }
        }
    }

    static {
        w wVar = new w();
        wVar.b(7, 65535);
        wVar.b(5, 16384);
        P = wVar;
    }

    public f(b bVar) {
        int i10;
        boolean z10 = bVar.f8013h;
        this.f7996o = z10;
        this.f7997p = bVar.f8010e;
        String str = bVar.f8008b;
        if (str != null) {
            this.f7999r = str;
            if (z10) {
                i10 = 3;
            } else {
                i10 = 2;
            }
            this.f8001t = i10;
            l9.d dVar = bVar.f8014i;
            this.f8002v = dVar;
            l9.c f10 = dVar.f();
            this.w = f10;
            this.f8003x = dVar.f();
            this.f8004y = dVar.f();
            this.z = bVar.f8011f;
            w wVar = new w();
            if (z10) {
                wVar.b(7, 16777216);
            }
            n8.i iVar = n8.i.f7501a;
            this.F = wVar;
            w wVar2 = P;
            this.G = wVar2;
            this.K = (long) wVar2.a();
            Socket socket = bVar.f8007a;
            if (socket != null) {
                this.L = socket;
                h hVar = bVar.d;
                if (hVar != null) {
                    this.M = new s(hVar, z10);
                    i iVar2 = bVar.f8009c;
                    if (iVar2 != null) {
                        this.N = new d(new q(iVar2, z10));
                        this.O = new LinkedHashSet();
                        int i11 = bVar.f8012g;
                        if (i11 != 0) {
                            long nanos = TimeUnit.MILLISECONDS.toNanos((long) i11);
                            f10.c(new a(str.concat(" ping"), this, nanos), nanos);
                            return;
                        }
                        return;
                    }
                    g.l("source");
                    throw null;
                }
                g.l("sink");
                throw null;
            }
            g.l("socket");
            throw null;
        }
        g.l("connectionName");
        throw null;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(10:0|(2:1|2)|f|(2:17|(5:19|20|21|34|22))|24|25|26|27|28|30) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x004f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(p9.b r4, p9.b r5, java.io.IOException r6) {
        /*
            r3 = this;
            java.lang.String r0 = "connectionCode"
            z8.g.f(r4, r0)
            java.lang.String r0 = "streamCode"
            z8.g.f(r5, r0)
            byte[] r0 = j9.c.f6602a
            r3.f(r4)     // Catch:{ IOException -> 0x000f }
        L_0x000f:
            monitor-enter(r3)
            java.util.LinkedHashMap r4 = r3.f7998q     // Catch:{ all -> 0x0064 }
            boolean r4 = r4.isEmpty()     // Catch:{ all -> 0x0064 }
            r4 = r4 ^ 1
            r0 = 0
            if (r4 == 0) goto L_0x0039
            java.util.LinkedHashMap r4 = r3.f7998q     // Catch:{ all -> 0x0064 }
            java.util.Collection r4 = r4.values()     // Catch:{ all -> 0x0064 }
            p9.r[] r1 = new p9.r[r0]     // Catch:{ all -> 0x0064 }
            java.lang.Object[] r4 = r4.toArray(r1)     // Catch:{ all -> 0x0064 }
            if (r4 == 0) goto L_0x0031
            p9.r[] r4 = (p9.r[]) r4     // Catch:{ all -> 0x0064 }
            java.util.LinkedHashMap r1 = r3.f7998q     // Catch:{ all -> 0x0064 }
            r1.clear()     // Catch:{ all -> 0x0064 }
            goto L_0x003a
        L_0x0031:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException     // Catch:{ all -> 0x0064 }
            java.lang.String r5 = "null cannot be cast to non-null type kotlin.Array<T>"
            r4.<init>(r5)     // Catch:{ all -> 0x0064 }
            throw r4     // Catch:{ all -> 0x0064 }
        L_0x0039:
            r4 = 0
        L_0x003a:
            n8.i r1 = n8.i.f7501a     // Catch:{ all -> 0x0064 }
            monitor-exit(r3)
            if (r4 == 0) goto L_0x004a
            int r1 = r4.length
        L_0x0040:
            if (r0 >= r1) goto L_0x004a
            r2 = r4[r0]
            r2.c(r5, r6)     // Catch:{ IOException -> 0x0047 }
        L_0x0047:
            int r0 = r0 + 1
            goto L_0x0040
        L_0x004a:
            p9.s r4 = r3.M     // Catch:{ IOException -> 0x004f }
            r4.close()     // Catch:{ IOException -> 0x004f }
        L_0x004f:
            java.net.Socket r4 = r3.L     // Catch:{ IOException -> 0x0054 }
            r4.close()     // Catch:{ IOException -> 0x0054 }
        L_0x0054:
            l9.c r4 = r3.w
            r4.f()
            l9.c r4 = r3.f8003x
            r4.f()
            l9.c r4 = r3.f8004y
            r4.f()
            return
        L_0x0064:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p9.f.a(p9.b, p9.b, java.io.IOException):void");
    }

    public final void b(IOException iOException) {
        b bVar = b.PROTOCOL_ERROR;
        a(bVar, bVar, iOException);
    }

    public final synchronized r c(int i10) {
        return (r) this.f7998q.get(Integer.valueOf(i10));
    }

    public final void close() {
        a(b.NO_ERROR, b.CANCEL, (IOException) null);
    }

    public final synchronized r d(int i10) {
        r rVar;
        rVar = (r) this.f7998q.remove(Integer.valueOf(i10));
        notifyAll();
        return rVar;
    }

    public final void f(b bVar) {
        g.f(bVar, "statusCode");
        synchronized (this.M) {
            synchronized (this) {
                if (!this.u) {
                    this.u = true;
                    int i10 = this.f8000s;
                    n8.i iVar = n8.i.f7501a;
                    this.M.d(i10, bVar, j9.c.f6602a);
                }
            }
        }
    }

    public final void flush() {
        s sVar = this.M;
        synchronized (sVar) {
            if (!sVar.f8092q) {
                sVar.f8094s.flush();
            } else {
                throw new IOException("closed");
            }
        }
    }

    public final synchronized void g(long j8) {
        long j10 = this.H + j8;
        this.H = j10;
        long j11 = j10 - this.I;
        if (j11 >= ((long) (this.F.a() / 2))) {
            n(0, j11);
            this.I += j11;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:27|28|29) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.M.f8091p);
        r6 = (long) r2;
        r8.J += r6;
        r4 = n8.i.f7501a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0067, code lost:
        throw new java.io.InterruptedIOException();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x005b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void j(int r9, boolean r10, w9.f r11, long r12) {
        /*
            r8 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r3 = 0
            if (r2 != 0) goto L_0x000d
            p9.s r12 = r8.M
            r12.b(r10, r9, r11, r3)
            return
        L_0x000d:
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x006a
            monitor-enter(r8)
        L_0x0012:
            long r4 = r8.J     // Catch:{ InterruptedException -> 0x005b }
            long r6 = r8.K     // Catch:{ InterruptedException -> 0x005b }
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 < 0) goto L_0x0032
            java.util.LinkedHashMap r2 = r8.f7998q     // Catch:{ InterruptedException -> 0x005b }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch:{ InterruptedException -> 0x005b }
            boolean r2 = r2.containsKey(r4)     // Catch:{ InterruptedException -> 0x005b }
            if (r2 == 0) goto L_0x002a
            r8.wait()     // Catch:{ InterruptedException -> 0x005b }
            goto L_0x0012
        L_0x002a:
            java.io.IOException r9 = new java.io.IOException     // Catch:{ InterruptedException -> 0x005b }
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch:{ InterruptedException -> 0x005b }
            throw r9     // Catch:{ InterruptedException -> 0x005b }
        L_0x0032:
            long r6 = r6 - r4
            long r4 = java.lang.Math.min(r12, r6)     // Catch:{ all -> 0x0059 }
            int r2 = (int) r4     // Catch:{ all -> 0x0059 }
            p9.s r4 = r8.M     // Catch:{ all -> 0x0059 }
            int r4 = r4.f8091p     // Catch:{ all -> 0x0059 }
            int r2 = java.lang.Math.min(r2, r4)     // Catch:{ all -> 0x0059 }
            long r4 = r8.J     // Catch:{ all -> 0x0059 }
            long r6 = (long) r2     // Catch:{ all -> 0x0059 }
            long r4 = r4 + r6
            r8.J = r4     // Catch:{ all -> 0x0059 }
            n8.i r4 = n8.i.f7501a     // Catch:{ all -> 0x0059 }
            monitor-exit(r8)
            long r12 = r12 - r6
            p9.s r4 = r8.M
            if (r10 == 0) goto L_0x0054
            int r5 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r5 != 0) goto L_0x0054
            r5 = 1
            goto L_0x0055
        L_0x0054:
            r5 = r3
        L_0x0055:
            r4.b(r5, r9, r11, r2)
            goto L_0x000d
        L_0x0059:
            r9 = move-exception
            goto L_0x0068
        L_0x005b:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0059 }
            r9.interrupt()     // Catch:{ all -> 0x0059 }
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch:{ all -> 0x0059 }
            r9.<init>()     // Catch:{ all -> 0x0059 }
            throw r9     // Catch:{ all -> 0x0059 }
        L_0x0068:
            monitor-exit(r8)
            throw r9
        L_0x006a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p9.f.j(int, boolean, w9.f, long):void");
    }

    public final void l(int i10, b bVar) {
        g.f(bVar, "errorCode");
        this.w.c(new e(this.f7999r + '[' + i10 + "] writeSynReset", this, i10, bVar), 0);
    }

    public final void n(int i10, long j8) {
        this.w.c(new C0116f(this.f7999r + '[' + i10 + "] windowUpdate", this, i10, j8), 0);
    }
}
