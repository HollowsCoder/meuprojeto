package m9;

import com.karumi.dexter.BuildConfig;
import i9.c0;
import i9.f;
import i9.l;
import i9.n;
import i9.v;
import i9.x;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import n8.i;
import r9.h;
import y9.t;
import z8.g;

public final class e implements i9.e {
    public volatile boolean A;
    public volatile c B;
    public volatile h C;
    public final v D;
    public final x E;
    public final boolean F;

    /* renamed from: o  reason: collision with root package name */
    public final j f7235o;

    /* renamed from: p  reason: collision with root package name */
    public final n f7236p;

    /* renamed from: q  reason: collision with root package name */
    public final c f7237q;

    /* renamed from: r  reason: collision with root package name */
    public final AtomicBoolean f7238r = new AtomicBoolean();

    /* renamed from: s  reason: collision with root package name */
    public Object f7239s;

    /* renamed from: t  reason: collision with root package name */
    public d f7240t;
    public h u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f7241v;
    public c w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f7242x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f7243y;
    public boolean z = true;

    public final class a implements Runnable {

        /* renamed from: o  reason: collision with root package name */
        public volatile AtomicInteger f7244o = new AtomicInteger(0);

        /* renamed from: p  reason: collision with root package name */
        public final f f7245p;

        public a(t.a aVar) {
            this.f7245p = aVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:20:0x0057 A[Catch:{ IOException -> 0x0073, all -> 0x004f, all -> 0x0097 }] */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0076 A[Catch:{ IOException -> 0x0073, all -> 0x004f, all -> 0x0097 }] */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0099 A[Catch:{ IOException -> 0x0073, all -> 0x004f, all -> 0x0097 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r7 = this;
                java.lang.String r0 = "canceled due to "
                java.lang.String r1 = "Callback failure for "
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r3 = "OkHttp "
                r2.<init>(r3)
                m9.e r3 = m9.e.this
                i9.x r3 = r3.E
                i9.r r3 = r3.f6366b
                java.lang.String r3 = r3.f()
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                java.lang.Thread r3 = java.lang.Thread.currentThread()
                java.lang.String r4 = "currentThread"
                z8.g.e(r3, r4)
                java.lang.String r4 = r3.getName()
                r3.setName(r2)
                m9.e r2 = m9.e.this     // Catch:{ all -> 0x00b6 }
                m9.e$c r2 = r2.f7237q     // Catch:{ all -> 0x00b6 }
                r2.h()     // Catch:{ all -> 0x00b6 }
                r2 = 0
                m9.e r5 = m9.e.this     // Catch:{ IOException -> 0x0073, all -> 0x004f }
                i9.c0 r2 = r5.j()     // Catch:{ IOException -> 0x0073, all -> 0x004f }
                r5 = 1
                i9.f r6 = r7.f7245p     // Catch:{ IOException -> 0x004c, all -> 0x0049 }
                y9.t$a r6 = (y9.t.a) r6     // Catch:{ IOException -> 0x004c, all -> 0x0049 }
                r6.b(r2)     // Catch:{ IOException -> 0x004c, all -> 0x0049 }
                m9.e r0 = m9.e.this     // Catch:{ all -> 0x00b6 }
                i9.v r0 = r0.D     // Catch:{ all -> 0x00b6 }
            L_0x0046:
                i9.l r0 = r0.f6338o     // Catch:{ all -> 0x00b6 }
                goto L_0x00a5
            L_0x0049:
                r1 = move-exception
                r2 = r5
                goto L_0x0050
            L_0x004c:
                r0 = move-exception
                r2 = r5
                goto L_0x0074
            L_0x004f:
                r1 = move-exception
            L_0x0050:
                m9.e r5 = m9.e.this     // Catch:{ all -> 0x0097 }
                r5.cancel()     // Catch:{ all -> 0x0097 }
                if (r2 != 0) goto L_0x0072
                java.io.IOException r2 = new java.io.IOException     // Catch:{ all -> 0x0097 }
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0097 }
                r5.<init>(r0)     // Catch:{ all -> 0x0097 }
                r5.append(r1)     // Catch:{ all -> 0x0097 }
                java.lang.String r0 = r5.toString()     // Catch:{ all -> 0x0097 }
                r2.<init>(r0)     // Catch:{ all -> 0x0097 }
                p9.u.b(r2, r1)     // Catch:{ all -> 0x0097 }
                i9.f r0 = r7.f7245p     // Catch:{ all -> 0x0097 }
                y9.t$a r0 = (y9.t.a) r0     // Catch:{ all -> 0x0097 }
                r0.a(r2)     // Catch:{ all -> 0x0097 }
            L_0x0072:
                throw r1     // Catch:{ all -> 0x0097 }
            L_0x0073:
                r0 = move-exception
            L_0x0074:
                if (r2 == 0) goto L_0x0099
                r9.h$a r2 = r9.h.f8494c     // Catch:{ all -> 0x0097 }
                r2.getClass()     // Catch:{ all -> 0x0097 }
                r9.h r2 = r9.h.f8492a     // Catch:{ all -> 0x0097 }
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0097 }
                r5.<init>(r1)     // Catch:{ all -> 0x0097 }
                m9.e r1 = m9.e.this     // Catch:{ all -> 0x0097 }
                java.lang.String r1 = m9.e.c(r1)     // Catch:{ all -> 0x0097 }
                r5.append(r1)     // Catch:{ all -> 0x0097 }
                java.lang.String r1 = r5.toString()     // Catch:{ all -> 0x0097 }
                r2.getClass()     // Catch:{ all -> 0x0097 }
                r2 = 4
                r9.h.i(r2, r1, r0)     // Catch:{ all -> 0x0097 }
                goto L_0x00a0
            L_0x0097:
                r0 = move-exception
                goto L_0x00ac
            L_0x0099:
                i9.f r1 = r7.f7245p     // Catch:{ all -> 0x0097 }
                y9.t$a r1 = (y9.t.a) r1     // Catch:{ all -> 0x0097 }
                r1.a(r0)     // Catch:{ all -> 0x0097 }
            L_0x00a0:
                m9.e r0 = m9.e.this     // Catch:{ all -> 0x00b6 }
                i9.v r0 = r0.D     // Catch:{ all -> 0x00b6 }
                goto L_0x0046
            L_0x00a5:
                r0.b(r7)     // Catch:{ all -> 0x00b6 }
                r3.setName(r4)
                return
            L_0x00ac:
                m9.e r1 = m9.e.this     // Catch:{ all -> 0x00b6 }
                i9.v r1 = r1.D     // Catch:{ all -> 0x00b6 }
                i9.l r1 = r1.f6338o     // Catch:{ all -> 0x00b6 }
                r1.b(r7)     // Catch:{ all -> 0x00b6 }
                throw r0     // Catch:{ all -> 0x00b6 }
            L_0x00b6:
                r0 = move-exception
                r3.setName(r4)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: m9.e.a.run():void");
        }
    }

    public static final class b extends WeakReference<e> {

        /* renamed from: a  reason: collision with root package name */
        public final Object f7247a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(e eVar, Object obj) {
            super(eVar);
            g.f(eVar, "referent");
            this.f7247a = obj;
        }
    }

    public static final class c extends w9.b {

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ e f7248k;

        public c(e eVar) {
            this.f7248k = eVar;
        }

        public final void k() {
            this.f7248k.cancel();
        }
    }

    public e(v vVar, x xVar, boolean z10) {
        g.f(vVar, "client");
        g.f(xVar, "originalRequest");
        this.D = vVar;
        this.E = xVar;
        this.F = z10;
        this.f7235o = (j) vVar.f6339p.f2129o;
        this.f7236p = vVar.f6342s.a(this);
        c cVar = new c(this);
        cVar.g((long) 0, TimeUnit.MILLISECONDS);
        i iVar = i.f7501a;
        this.f7237q = cVar;
    }

    public static final String c(e eVar) {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        if (eVar.A) {
            str = "canceled ";
        } else {
            str = BuildConfig.FLAVOR;
        }
        sb.append(str);
        if (eVar.F) {
            str2 = "web socket";
        } else {
            str2 = "call";
        }
        sb.append(str2);
        sb.append(" to ");
        sb.append(eVar.E.f6366b.f());
        return sb.toString();
    }

    public final x a() {
        return this.E;
    }

    public final boolean b() {
        return this.A;
    }

    public final void cancel() {
        Socket socket;
        if (!this.A) {
            this.A = true;
            c cVar = this.B;
            if (cVar != null) {
                cVar.f7215f.cancel();
            }
            h hVar = this.C;
            if (!(hVar == null || (socket = hVar.f7253b) == null)) {
                j9.c.d(socket);
            }
            this.f7236p.getClass();
        }
    }

    public final Object clone() {
        return new e(this.D, this.E, this.F);
    }

    public final void d(h hVar) {
        boolean z10;
        byte[] bArr = j9.c.f6602a;
        if (this.u == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.u = hVar;
            hVar.f7264o.add(new b(this, this.f7239s));
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final <E extends IOException> E e(E e10) {
        E e11;
        n nVar;
        Socket m10;
        boolean z10;
        byte[] bArr = j9.c.f6602a;
        h hVar = this.u;
        if (hVar != null) {
            synchronized (hVar) {
                m10 = m();
            }
            if (this.u == null) {
                if (m10 != null) {
                    try {
                        m10.close();
                    } catch (AssertionError e12) {
                        throw e12;
                    } catch (RuntimeException e13) {
                        throw e13;
                    } catch (Exception unused) {
                    }
                }
                this.f7236p.getClass();
            } else {
                if (m10 == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    throw new IllegalStateException("Check failed.".toString());
                }
            }
        }
        if (!this.f7241v && this.f7237q.i()) {
            e11 = new InterruptedIOException("timeout");
            if (e10 != null) {
                e11.initCause(e10);
            }
        } else {
            e11 = e10;
        }
        if (e10 != null) {
            nVar = this.f7236p;
            g.c(e11);
        } else {
            nVar = this.f7236p;
        }
        nVar.getClass();
        return e11;
    }

    public final void g(t.a aVar) {
        a aVar2;
        if (this.f7238r.compareAndSet(false, true)) {
            h.f8494c.getClass();
            this.f7239s = h.f8492a.g();
            this.f7236p.getClass();
            l lVar = this.D.f6338o;
            a aVar3 = new a(aVar);
            lVar.getClass();
            synchronized (lVar) {
                lVar.f6283b.add(aVar3);
                if (!this.F) {
                    String str = this.E.f6366b.f6306e;
                    Iterator<a> it = lVar.f6284c.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            Iterator<a> it2 = lVar.f6283b.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    aVar2 = null;
                                    break;
                                }
                                aVar2 = it2.next();
                                if (g.a(e.this.E.f6366b.f6306e, str)) {
                                    break;
                                }
                            }
                        } else {
                            aVar2 = it.next();
                            if (g.a(e.this.E.f6366b.f6306e, str)) {
                                break;
                            }
                        }
                    }
                    if (aVar2 != null) {
                        aVar3.f7244o = aVar2.f7244o;
                    }
                }
                i iVar = i.f7501a;
            }
            lVar.c();
            return;
        }
        throw new IllegalStateException("Already Executed".toString());
    }

    public final c0 h() {
        if (this.f7238r.compareAndSet(false, true)) {
            this.f7237q.h();
            h.f8494c.getClass();
            this.f7239s = h.f8492a.g();
            this.f7236p.getClass();
            try {
                l lVar = this.D.f6338o;
                synchronized (lVar) {
                    lVar.d.add(this);
                }
                c0 j8 = j();
                l lVar2 = this.D.f6338o;
                lVar2.getClass();
                lVar2.a(lVar2.d, this);
                return j8;
            } catch (Throwable th) {
                l lVar3 = this.D.f6338o;
                lVar3.getClass();
                lVar3.a(lVar3.d, this);
                throw th;
            }
        } else {
            throw new IllegalStateException("Already Executed".toString());
        }
    }

    public final void i(boolean z10) {
        c cVar;
        synchronized (this) {
            if (this.z) {
                i iVar = i.f7501a;
            } else {
                throw new IllegalStateException("released".toString());
            }
        }
        if (z10 && (cVar = this.B) != null) {
            cVar.f7215f.cancel();
            cVar.f7213c.k(cVar, true, true, (IOException) null);
        }
        this.w = null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0090  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final i9.c0 j() {
        /*
            r10 = this;
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            i9.v r0 = r10.D
            java.util.List<i9.s> r0 = r0.f6340q
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            o8.g.v(r0, r2)
            n9.h r0 = new n9.h
            i9.v r1 = r10.D
            r0.<init>(r1)
            r2.add(r0)
            n9.a r0 = new n9.a
            i9.v r1 = r10.D
            i9.k r1 = r1.f6345x
            r0.<init>(r1)
            r2.add(r0)
            k9.a r0 = new k9.a
            i9.v r1 = r10.D
            i9.c r1 = r1.f6346y
            r0.<init>(r1)
            r2.add(r0)
            m9.a r0 = m9.a.f7207a
            r2.add(r0)
            boolean r0 = r10.F
            if (r0 != 0) goto L_0x0042
            i9.v r0 = r10.D
            java.util.List<i9.s> r0 = r0.f6341r
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            o8.g.v(r0, r2)
        L_0x0042:
            n9.b r0 = new n9.b
            boolean r1 = r10.F
            r0.<init>(r1)
            r2.add(r0)
            n9.f r9 = new n9.f
            r3 = 0
            r4 = 0
            i9.x r5 = r10.E
            i9.v r0 = r10.D
            int r6 = r0.K
            int r7 = r0.L
            int r8 = r0.M
            r0 = r9
            r1 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = 0
            i9.x r1 = r10.E     // Catch:{ IOException -> 0x007c, all -> 0x0079 }
            i9.c0 r1 = r9.b(r1)     // Catch:{ IOException -> 0x007c, all -> 0x0079 }
            boolean r2 = r10.A     // Catch:{ IOException -> 0x007c, all -> 0x0079 }
            if (r2 != 0) goto L_0x006e
            r10.l(r0)
            return r1
        L_0x006e:
            j9.c.c(r1)     // Catch:{ IOException -> 0x007c, all -> 0x0079 }
            java.io.IOException r1 = new java.io.IOException     // Catch:{ IOException -> 0x007c, all -> 0x0079 }
            java.lang.String r2 = "Canceled"
            r1.<init>(r2)     // Catch:{ IOException -> 0x007c, all -> 0x0079 }
            throw r1     // Catch:{ IOException -> 0x007c, all -> 0x0079 }
        L_0x0079:
            r1 = move-exception
            r2 = 0
            goto L_0x008e
        L_0x007c:
            r1 = move-exception
            java.io.IOException r1 = r10.l(r1)     // Catch:{ all -> 0x008c }
            if (r1 != 0) goto L_0x008b
            java.lang.NullPointerException r1 = new java.lang.NullPointerException     // Catch:{ all -> 0x008c }
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.Throwable"
            r1.<init>(r2)     // Catch:{ all -> 0x008c }
            throw r1     // Catch:{ all -> 0x008c }
        L_0x008b:
            throw r1     // Catch:{ all -> 0x008c }
        L_0x008c:
            r1 = move-exception
            r2 = 1
        L_0x008e:
            if (r2 != 0) goto L_0x0093
            r10.l(r0)
        L_0x0093:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: m9.e.j():i9.c0");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0023 A[Catch:{ all -> 0x0019 }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0027 A[Catch:{ all -> 0x0019 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0031 A[Catch:{ all -> 0x0019 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0033 A[Catch:{ all -> 0x0019 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <E extends java.io.IOException> E k(m9.c r3, boolean r4, boolean r5, E r6) {
        /*
            r2 = this;
            java.lang.String r0 = "exchange"
            z8.g.f(r3, r0)
            m9.c r0 = r2.B
            boolean r3 = z8.g.a(r3, r0)
            r0 = 1
            r3 = r3 ^ r0
            if (r3 == 0) goto L_0x0010
            return r6
        L_0x0010:
            monitor-enter(r2)
            r3 = 0
            if (r4 == 0) goto L_0x001b
            boolean r1 = r2.f7242x     // Catch:{ all -> 0x0019 }
            if (r1 != 0) goto L_0x0021
            goto L_0x001b
        L_0x0019:
            r3 = move-exception
            goto L_0x0062
        L_0x001b:
            if (r5 == 0) goto L_0x0042
            boolean r1 = r2.f7243y     // Catch:{ all -> 0x0019 }
            if (r1 == 0) goto L_0x0042
        L_0x0021:
            if (r4 == 0) goto L_0x0025
            r2.f7242x = r3     // Catch:{ all -> 0x0019 }
        L_0x0025:
            if (r5 == 0) goto L_0x0029
            r2.f7243y = r3     // Catch:{ all -> 0x0019 }
        L_0x0029:
            boolean r4 = r2.f7242x     // Catch:{ all -> 0x0019 }
            if (r4 != 0) goto L_0x0033
            boolean r5 = r2.f7243y     // Catch:{ all -> 0x0019 }
            if (r5 != 0) goto L_0x0033
            r5 = r0
            goto L_0x0034
        L_0x0033:
            r5 = r3
        L_0x0034:
            if (r4 != 0) goto L_0x003f
            boolean r4 = r2.f7243y     // Catch:{ all -> 0x0019 }
            if (r4 != 0) goto L_0x003f
            boolean r4 = r2.z     // Catch:{ all -> 0x0019 }
            if (r4 != 0) goto L_0x003f
            r3 = r0
        L_0x003f:
            r4 = r3
            r3 = r5
            goto L_0x0043
        L_0x0042:
            r4 = r3
        L_0x0043:
            n8.i r5 = n8.i.f7501a     // Catch:{ all -> 0x0019 }
            monitor-exit(r2)
            if (r3 == 0) goto L_0x005a
            r3 = 0
            r2.B = r3
            m9.h r3 = r2.u
            if (r3 == 0) goto L_0x005a
            monitor-enter(r3)
            int r5 = r3.l     // Catch:{ all -> 0x0057 }
            int r5 = r5 + r0
            r3.l = r5     // Catch:{ all -> 0x0057 }
            monitor-exit(r3)
            goto L_0x005a
        L_0x0057:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        L_0x005a:
            if (r4 == 0) goto L_0x0061
            java.io.IOException r3 = r2.e(r6)
            return r3
        L_0x0061:
            return r6
        L_0x0062:
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: m9.e.k(m9.c, boolean, boolean, java.io.IOException):java.io.IOException");
    }

    public final IOException l(IOException iOException) {
        boolean z10;
        synchronized (this) {
            z10 = false;
            if (this.z) {
                this.z = false;
                if (!this.f7242x && !this.f7243y) {
                    z10 = true;
                }
            }
            i iVar = i.f7501a;
        }
        return z10 ? e(iOException) : iOException;
    }

    public final Socket m() {
        boolean z10;
        h hVar = this.u;
        g.c(hVar);
        byte[] bArr = j9.c.f6602a;
        ArrayList arrayList = hVar.f7264o;
        Iterator it = arrayList.iterator();
        boolean z11 = false;
        int i10 = 0;
        while (true) {
            if (!it.hasNext()) {
                i10 = -1;
                break;
            } else if (g.a((e) ((Reference) it.next()).get(), this)) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 != -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            arrayList.remove(i10);
            this.u = null;
            if (arrayList.isEmpty()) {
                hVar.f7265p = System.nanoTime();
                j jVar = this.f7235o;
                jVar.getClass();
                byte[] bArr2 = j9.c.f6602a;
                boolean z12 = hVar.f7259i;
                l9.c cVar = jVar.f7269b;
                if (z12 || jVar.f7271e == 0) {
                    hVar.f7259i = true;
                    ConcurrentLinkedQueue<h> concurrentLinkedQueue = jVar.d;
                    concurrentLinkedQueue.remove(hVar);
                    if (concurrentLinkedQueue.isEmpty()) {
                        cVar.a();
                    }
                    z11 = true;
                } else {
                    cVar.c(jVar.f7270c, 0);
                }
                if (z11) {
                    Socket socket = hVar.f7254c;
                    g.c(socket);
                    return socket;
                }
            }
            return null;
        }
        throw new IllegalStateException("Check failed.".toString());
    }
}
