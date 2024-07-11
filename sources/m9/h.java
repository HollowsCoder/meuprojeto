package m9;

import b0.d;
import c1.r;
import i9.a;
import i9.b0;
import i9.c0;
import i9.f0;
import i9.n;
import i9.p;
import i9.q;
import i9.w;
import i9.x;
import j9.c;
import java.io.IOException;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import n.e;
import o9.b;
import p9.b;
import p9.f;
import p9.s;
import w9.u;
import w9.v;
import z8.g;

public final class h extends f.c {

    /* renamed from: b  reason: collision with root package name */
    public Socket f7253b;

    /* renamed from: c  reason: collision with root package name */
    public Socket f7254c;
    public p d;

    /* renamed from: e  reason: collision with root package name */
    public w f7255e;

    /* renamed from: f  reason: collision with root package name */
    public f f7256f;

    /* renamed from: g  reason: collision with root package name */
    public v f7257g;

    /* renamed from: h  reason: collision with root package name */
    public u f7258h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f7259i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f7260j;

    /* renamed from: k  reason: collision with root package name */
    public int f7261k;
    public int l;

    /* renamed from: m  reason: collision with root package name */
    public int f7262m;

    /* renamed from: n  reason: collision with root package name */
    public int f7263n = 1;

    /* renamed from: o  reason: collision with root package name */
    public final ArrayList f7264o = new ArrayList();

    /* renamed from: p  reason: collision with root package name */
    public long f7265p = Long.MAX_VALUE;

    /* renamed from: q  reason: collision with root package name */
    public final f0 f7266q;

    public h(j jVar, f0 f0Var) {
        g.f(jVar, "connectionPool");
        g.f(f0Var, "route");
        this.f7266q = f0Var;
    }

    public static void d(i9.v vVar, f0 f0Var, IOException iOException) {
        g.f(vVar, "client");
        g.f(f0Var, "failedRoute");
        g.f(iOException, "failure");
        if (f0Var.f6238b.type() != Proxy.Type.DIRECT) {
            a aVar = f0Var.f6237a;
            aVar.f6161k.connectFailed(aVar.f6152a.g(), f0Var.f6238b.address(), iOException);
        }
        r rVar = vVar.N;
        synchronized (rVar) {
            ((Set) rVar.f2129o).add(f0Var);
        }
    }

    public final synchronized void a(f fVar, p9.w wVar) {
        int i10;
        g.f(fVar, "connection");
        g.f(wVar, "settings");
        if ((wVar.f8121a & 16) != 0) {
            i10 = wVar.f8122b[4];
        } else {
            i10 = Integer.MAX_VALUE;
        }
        this.f7263n = i10;
    }

    public final void b(p9.r rVar) {
        g.f(rVar, "stream");
        rVar.c(b.REFUSED_STREAM, (IOException) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x013f  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0176 A[EDGE_INSN: B:99:0x0176->B:94:0x0176 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(int r17, int r18, int r19, boolean r20, m9.e r21, i9.n r22) {
        /*
            r16 = this;
            r7 = r16
            r8 = r21
            r9 = r22
            java.lang.String r10 = "proxy"
            java.lang.String r11 = "inetSocketAddress"
            java.lang.String r0 = "call"
            z8.g.f(r8, r0)
            java.lang.String r0 = "eventListener"
            z8.g.f(r9, r0)
            i9.w r0 = r7.f7255e
            r12 = 1
            if (r0 != 0) goto L_0x001b
            r0 = r12
            goto L_0x001c
        L_0x001b:
            r0 = 0
        L_0x001c:
            if (r0 == 0) goto L_0x0184
            i9.f0 r0 = r7.f7266q
            i9.a r0 = r0.f6237a
            java.util.List<i9.i> r0 = r0.f6154c
            m9.b r13 = new m9.b
            r13.<init>(r0)
            i9.f0 r1 = r7.f7266q
            i9.a r1 = r1.f6237a
            javax.net.ssl.SSLSocketFactory r2 = r1.f6156f
            if (r2 != 0) goto L_0x006f
            i9.i r1 = i9.i.f6262f
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x0062
            i9.f0 r0 = r7.f7266q
            i9.a r0 = r0.f6237a
            i9.r r0 = r0.f6152a
            java.lang.String r0 = r0.f6306e
            r9.h$a r1 = r9.h.f8494c
            r1.getClass()
            r9.h r1 = r9.h.f8492a
            boolean r1 = r1.h(r0)
            if (r1 == 0) goto L_0x004f
            goto L_0x0079
        L_0x004f:
            m9.k r1 = new m9.k
            java.net.UnknownServiceException r2 = new java.net.UnknownServiceException
            java.lang.String r3 = "CLEARTEXT communication to "
            java.lang.String r4 = " not permitted by network security policy"
            java.lang.String r0 = b0.d.f(r3, r0, r4)
            r2.<init>(r0)
            r1.<init>(r2)
            throw r1
        L_0x0062:
            m9.k r0 = new m9.k
            java.net.UnknownServiceException r1 = new java.net.UnknownServiceException
            java.lang.String r2 = "CLEARTEXT communication not enabled for client"
            r1.<init>(r2)
            r0.<init>(r1)
            throw r0
        L_0x006f:
            java.util.List<i9.w> r0 = r1.f6153b
            i9.w r1 = i9.w.H2_PRIOR_KNOWLEDGE
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L_0x0177
        L_0x0079:
            r14 = 0
            r15 = r14
        L_0x007b:
            i9.f0 r0 = r7.f7266q     // Catch:{ IOException -> 0x00f9 }
            i9.a r1 = r0.f6237a     // Catch:{ IOException -> 0x00f9 }
            javax.net.ssl.SSLSocketFactory r1 = r1.f6156f     // Catch:{ IOException -> 0x00f9 }
            if (r1 == 0) goto L_0x008f
            java.net.Proxy r0 = r0.f6238b     // Catch:{ IOException -> 0x00f9 }
            java.net.Proxy$Type r0 = r0.type()     // Catch:{ IOException -> 0x00f9 }
            java.net.Proxy$Type r1 = java.net.Proxy.Type.HTTP     // Catch:{ IOException -> 0x00f9 }
            if (r0 != r1) goto L_0x008f
            r0 = r12
            goto L_0x0090
        L_0x008f:
            r0 = 0
        L_0x0090:
            if (r0 == 0) goto L_0x00b0
            r1 = r16
            r2 = r17
            r3 = r18
            r4 = r19
            r5 = r21
            r6 = r22
            r1.f(r2, r3, r4, r5, r6)     // Catch:{ IOException -> 0x00f9 }
            java.net.Socket r0 = r7.f7253b     // Catch:{ IOException -> 0x00f9 }
            if (r0 != 0) goto L_0x00a6
            goto L_0x00c8
        L_0x00a6:
            r1 = r17
            r2 = r18
            goto L_0x00b7
        L_0x00ab:
            r1 = r17
            r2 = r18
            goto L_0x00fb
        L_0x00b0:
            r1 = r17
            r2 = r18
            r7.e(r1, r2, r8, r9)     // Catch:{ IOException -> 0x00f7 }
        L_0x00b7:
            r7.g(r13, r8, r9)     // Catch:{ IOException -> 0x00f7 }
            i9.f0 r0 = r7.f7266q     // Catch:{ IOException -> 0x00f7 }
            java.net.InetSocketAddress r3 = r0.f6239c     // Catch:{ IOException -> 0x00f7 }
            java.net.Proxy r0 = r0.f6238b     // Catch:{ IOException -> 0x00f7 }
            i9.n$a r4 = i9.n.f6286a     // Catch:{ IOException -> 0x00f7 }
            z8.g.f(r3, r11)     // Catch:{ IOException -> 0x00f7 }
            z8.g.f(r0, r10)     // Catch:{ IOException -> 0x00f7 }
        L_0x00c8:
            i9.f0 r0 = r7.f7266q
            i9.a r1 = r0.f6237a
            javax.net.ssl.SSLSocketFactory r1 = r1.f6156f
            if (r1 == 0) goto L_0x00db
            java.net.Proxy r0 = r0.f6238b
            java.net.Proxy$Type r0 = r0.type()
            java.net.Proxy$Type r1 = java.net.Proxy.Type.HTTP
            if (r0 != r1) goto L_0x00db
            goto L_0x00dc
        L_0x00db:
            r12 = 0
        L_0x00dc:
            if (r12 == 0) goto L_0x00f0
            java.net.Socket r0 = r7.f7253b
            if (r0 == 0) goto L_0x00e3
            goto L_0x00f0
        L_0x00e3:
            m9.k r0 = new m9.k
            java.net.ProtocolException r1 = new java.net.ProtocolException
            java.lang.String r2 = "Too many tunnel connections attempted: 21"
            r1.<init>(r2)
            r0.<init>(r1)
            throw r0
        L_0x00f0:
            long r0 = java.lang.System.nanoTime()
            r7.f7265p = r0
            return
        L_0x00f7:
            r0 = move-exception
            goto L_0x00fb
        L_0x00f9:
            r0 = move-exception
            goto L_0x00ab
        L_0x00fb:
            java.net.Socket r3 = r7.f7254c
            if (r3 == 0) goto L_0x010b
            byte[] r4 = j9.c.f6602a
            r3.close()     // Catch:{ AssertionError -> 0x0108, RuntimeException -> 0x0105, Exception -> 0x010b }
            goto L_0x010b
        L_0x0105:
            r0 = move-exception
            r1 = r0
            throw r1
        L_0x0108:
            r0 = move-exception
            r1 = r0
            throw r1
        L_0x010b:
            java.net.Socket r3 = r7.f7253b
            if (r3 == 0) goto L_0x011b
            byte[] r4 = j9.c.f6602a
            r3.close()     // Catch:{ AssertionError -> 0x0118, RuntimeException -> 0x0115, Exception -> 0x011b }
            goto L_0x011b
        L_0x0115:
            r0 = move-exception
            r1 = r0
            throw r1
        L_0x0118:
            r0 = move-exception
            r1 = r0
            throw r1
        L_0x011b:
            r7.f7254c = r14
            r7.f7253b = r14
            r7.f7257g = r14
            r7.f7258h = r14
            r7.d = r14
            r7.f7255e = r14
            r7.f7256f = r14
            r7.f7263n = r12
            i9.f0 r3 = r7.f7266q
            java.net.InetSocketAddress r4 = r3.f6239c
            java.net.Proxy r3 = r3.f6238b
            z8.g.f(r4, r11)
            z8.g.f(r3, r10)
            if (r15 != 0) goto L_0x013f
            m9.k r15 = new m9.k
            r15.<init>(r0)
            goto L_0x0146
        L_0x013f:
            java.io.IOException r3 = r15.f7273p
            p9.u.b(r3, r0)
            r15.f7272o = r0
        L_0x0146:
            if (r20 == 0) goto L_0x0176
            r13.f7210c = r12
            boolean r3 = r13.f7209b
            if (r3 != 0) goto L_0x014f
            goto L_0x0171
        L_0x014f:
            boolean r3 = r0 instanceof java.net.ProtocolException
            if (r3 == 0) goto L_0x0154
            goto L_0x0171
        L_0x0154:
            boolean r3 = r0 instanceof java.io.InterruptedIOException
            if (r3 == 0) goto L_0x0159
            goto L_0x0171
        L_0x0159:
            boolean r3 = r0 instanceof javax.net.ssl.SSLHandshakeException
            if (r3 == 0) goto L_0x0166
            java.lang.Throwable r3 = r0.getCause()
            boolean r3 = r3 instanceof java.security.cert.CertificateException
            if (r3 == 0) goto L_0x0166
            goto L_0x0171
        L_0x0166:
            boolean r3 = r0 instanceof javax.net.ssl.SSLPeerUnverifiedException
            if (r3 == 0) goto L_0x016b
            goto L_0x0171
        L_0x016b:
            boolean r0 = r0 instanceof javax.net.ssl.SSLException
            if (r0 == 0) goto L_0x0171
            r0 = r12
            goto L_0x0172
        L_0x0171:
            r0 = 0
        L_0x0172:
            if (r0 == 0) goto L_0x0176
            goto L_0x007b
        L_0x0176:
            throw r15
        L_0x0177:
            m9.k r0 = new m9.k
            java.net.UnknownServiceException r1 = new java.net.UnknownServiceException
            java.lang.String r2 = "H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"
            r1.<init>(r2)
            r0.<init>(r1)
            throw r0
        L_0x0184:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "already connected"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: m9.h.c(int, int, int, boolean, m9.e, i9.n):void");
    }

    public final void e(int i10, int i11, e eVar, n nVar) {
        Socket socket;
        int i12;
        f0 f0Var = this.f7266q;
        Proxy proxy = f0Var.f6238b;
        a aVar = f0Var.f6237a;
        Proxy.Type type = proxy.type();
        if (type != null && ((i12 = f.f7249a[type.ordinal()]) == 1 || i12 == 2)) {
            socket = aVar.f6155e.createSocket();
            g.c(socket);
        } else {
            socket = new Socket(proxy);
        }
        this.f7253b = socket;
        InetSocketAddress inetSocketAddress = this.f7266q.f6239c;
        nVar.getClass();
        g.f(eVar, "call");
        g.f(inetSocketAddress, "inetSocketAddress");
        socket.setSoTimeout(i11);
        try {
            r9.h.f8494c.getClass();
            r9.h.f8492a.e(socket, this.f7266q.f6239c, i10);
            try {
                this.f7257g = e.o(e.G(socket));
                this.f7258h = e.n(e.F(socket));
            } catch (NullPointerException e10) {
                if (g.a(e10.getMessage(), "throw with null exception")) {
                    throw new IOException(e10);
                }
            }
        } catch (ConnectException e11) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f7266q.f6239c);
            connectException.initCause(e11);
            throw connectException;
        }
    }

    public final void f(int i10, int i11, int i12, e eVar, n nVar) {
        int i13 = i11;
        x.a aVar = new x.a();
        f0 f0Var = this.f7266q;
        i9.r rVar = f0Var.f6237a.f6152a;
        g.f(rVar, "url");
        aVar.f6370a = rVar;
        aVar.c("CONNECT", (b0) null);
        a aVar2 = f0Var.f6237a;
        aVar.b("Host", c.u(aVar2.f6152a, true));
        aVar.b("Proxy-Connection", "Keep-Alive");
        aVar.b("User-Agent", "okhttp/4.9.0");
        x a10 = aVar.a();
        c0.a aVar3 = new c0.a();
        aVar3.f6199a = a10;
        w wVar = w.HTTP_1_1;
        g.f(wVar, "protocol");
        aVar3.f6200b = wVar;
        aVar3.f6201c = 407;
        aVar3.d = "Preemptive Authenticate";
        aVar3.f6204g = c.f6604c;
        aVar3.f6208k = -1;
        aVar3.l = -1;
        q.a aVar4 = aVar3.f6203f;
        aVar4.getClass();
        q.f6299p.getClass();
        q.b.a("Proxy-Authenticate");
        q.b.b("OkHttp-Preemptive", "Proxy-Authenticate");
        aVar4.f("Proxy-Authenticate");
        aVar4.c("Proxy-Authenticate", "OkHttp-Preemptive");
        aVar2.f6159i.d(f0Var, aVar3.a());
        e(i10, i13, eVar, nVar);
        v vVar = this.f7257g;
        g.c(vVar);
        u uVar = this.f7258h;
        g.c(uVar);
        o9.b bVar = new o9.b((i9.v) null, this, vVar, uVar);
        w9.c0 h10 = vVar.h();
        long j8 = (long) i13;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        h10.g(j8, timeUnit);
        uVar.h().g((long) i12, timeUnit);
        bVar.k(a10.d, "CONNECT " + c.u(a10.f6366b, true) + " HTTP/1.1");
        bVar.a();
        c0.a f10 = bVar.f(false);
        g.c(f10);
        f10.f6199a = a10;
        c0 a11 = f10.a();
        long j10 = c.j(a11);
        if (j10 != -1) {
            b.d j11 = bVar.j(j10);
            c.s(j11, Integer.MAX_VALUE, timeUnit);
            j11.close();
        }
        int i14 = a11.f6194s;
        if (i14 != 200) {
            if (i14 == 407) {
                aVar2.f6159i.d(f0Var, a11);
                throw new IOException("Failed to authenticate with proxy");
            }
            throw new IOException(d.c("Unexpected response code for CONNECT: ", i14));
        } else if (!vVar.f9361o.F() || !uVar.f9358o.F()) {
            throw new IOException("TLS tunnel buffered too many bytes!");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: javax.net.ssl.SSLSocket} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v2 */
    /* JADX WARNING: type inference failed for: r2v10 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x01d1  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x01dd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g(m9.b r9, m9.e r10, i9.n r11) {
        /*
            r8 = this;
            i9.f0 r0 = r8.f7266q
            i9.a r0 = r0.f6237a
            javax.net.ssl.SSLSocketFactory r1 = r0.f6156f
            if (r1 != 0) goto L_0x0025
            java.util.List<i9.w> r9 = r0.f6153b
            i9.w r10 = i9.w.H2_PRIOR_KNOWLEDGE
            boolean r9 = r9.contains(r10)
            if (r9 == 0) goto L_0x001c
            java.net.Socket r9 = r8.f7253b
            r8.f7254c = r9
            r8.f7255e = r10
            r8.l()
            return
        L_0x001c:
            java.net.Socket r9 = r8.f7253b
            r8.f7254c = r9
            i9.w r9 = i9.w.HTTP_1_1
            r8.f7255e = r9
            return
        L_0x0025:
            r11.getClass()
            java.lang.String r11 = "call"
            z8.g.f(r10, r11)
            java.lang.String r10 = "\n              |Hostname "
            java.lang.String r11 = "Hostname "
            i9.f0 r0 = r8.f7266q
            i9.a r0 = r0.f6237a
            javax.net.ssl.SSLSocketFactory r1 = r0.f6156f
            r2 = 0
            z8.g.c(r1)     // Catch:{ all -> 0x01ce }
            java.net.Socket r3 = r8.f7253b     // Catch:{ all -> 0x01ce }
            i9.r r4 = r0.f6152a     // Catch:{ all -> 0x01ce }
            java.lang.String r5 = r4.f6306e     // Catch:{ all -> 0x01ce }
            int r4 = r4.f6307f     // Catch:{ all -> 0x01ce }
            r6 = 1
            java.net.Socket r1 = r1.createSocket(r3, r5, r4, r6)     // Catch:{ all -> 0x01ce }
            if (r1 == 0) goto L_0x01c6
            javax.net.ssl.SSLSocket r1 = (javax.net.ssl.SSLSocket) r1     // Catch:{ all -> 0x01ce }
            i9.i r9 = r9.a(r1)     // Catch:{ all -> 0x01c3 }
            boolean r3 = r9.f6264b     // Catch:{ all -> 0x01c3 }
            if (r3 == 0) goto L_0x0064
            r9.h$a r3 = r9.h.f8494c     // Catch:{ all -> 0x01c3 }
            r3.getClass()     // Catch:{ all -> 0x01c3 }
            r9.h r3 = r9.h.f8492a     // Catch:{ all -> 0x01c3 }
            i9.r r4 = r0.f6152a     // Catch:{ all -> 0x01c3 }
            java.lang.String r4 = r4.f6306e     // Catch:{ all -> 0x01c3 }
            java.util.List<i9.w> r5 = r0.f6153b     // Catch:{ all -> 0x01c3 }
            r3.d(r1, r4, r5)     // Catch:{ all -> 0x01c3 }
        L_0x0064:
            r1.startHandshake()     // Catch:{ all -> 0x01c3 }
            javax.net.ssl.SSLSession r3 = r1.getSession()     // Catch:{ all -> 0x01c3 }
            i9.p$a r4 = i9.p.f6292e     // Catch:{ all -> 0x01c3 }
            java.lang.String r5 = "sslSocketSession"
            z8.g.e(r3, r5)     // Catch:{ all -> 0x01c3 }
            r4.getClass()     // Catch:{ all -> 0x01c3 }
            i9.p r4 = i9.p.a.b(r3)     // Catch:{ all -> 0x01c3 }
            javax.net.ssl.HostnameVerifier r5 = r0.f6157g     // Catch:{ all -> 0x01c3 }
            z8.g.c(r5)     // Catch:{ all -> 0x01c3 }
            i9.r r7 = r0.f6152a     // Catch:{ all -> 0x01c3 }
            java.lang.String r7 = r7.f6306e     // Catch:{ all -> 0x01c3 }
            boolean r3 = r5.verify(r7, r3)     // Catch:{ all -> 0x01c3 }
            if (r3 != 0) goto L_0x013f
            java.util.List r9 = r4.a()     // Catch:{ all -> 0x01c3 }
            r2 = r9
            java.util.Collection r2 = (java.util.Collection) r2     // Catch:{ all -> 0x01c3 }
            boolean r2 = r2.isEmpty()     // Catch:{ all -> 0x01c3 }
            r2 = r2 ^ r6
            if (r2 == 0) goto L_0x0124
            r11 = 0
            java.lang.Object r9 = r9.get(r11)     // Catch:{ all -> 0x01c3 }
            if (r9 != 0) goto L_0x00a5
            java.lang.NullPointerException r9 = new java.lang.NullPointerException     // Catch:{ all -> 0x01c3 }
            java.lang.String r10 = "null cannot be cast to non-null type java.security.cert.X509Certificate"
            r9.<init>(r10)     // Catch:{ all -> 0x01c3 }
            throw r9     // Catch:{ all -> 0x01c3 }
        L_0x00a5:
            java.security.cert.X509Certificate r9 = (java.security.cert.X509Certificate) r9     // Catch:{ all -> 0x01c3 }
            javax.net.ssl.SSLPeerUnverifiedException r11 = new javax.net.ssl.SSLPeerUnverifiedException     // Catch:{ all -> 0x01c3 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x01c3 }
            r2.<init>(r10)     // Catch:{ all -> 0x01c3 }
            i9.r r10 = r0.f6152a     // Catch:{ all -> 0x01c3 }
            java.lang.String r10 = r10.f6306e     // Catch:{ all -> 0x01c3 }
            r2.append(r10)     // Catch:{ all -> 0x01c3 }
            java.lang.String r10 = " not verified:\n              |    certificate: "
            r2.append(r10)     // Catch:{ all -> 0x01c3 }
            i9.g$a r10 = i9.g.d     // Catch:{ all -> 0x01c3 }
            r10.getClass()     // Catch:{ all -> 0x01c3 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x01c3 }
            java.lang.String r0 = "sha256/"
            r10.<init>(r0)     // Catch:{ all -> 0x01c3 }
            w9.j r0 = w9.j.f9328r     // Catch:{ all -> 0x01c3 }
            java.security.PublicKey r0 = r9.getPublicKey()     // Catch:{ all -> 0x01c3 }
            java.lang.String r3 = "publicKey"
            z8.g.e(r0, r3)     // Catch:{ all -> 0x01c3 }
            byte[] r0 = r0.getEncoded()     // Catch:{ all -> 0x01c3 }
            java.lang.String r3 = "publicKey.encoded"
            z8.g.e(r0, r3)     // Catch:{ all -> 0x01c3 }
            w9.j r0 = w9.j.a.d(r0)     // Catch:{ all -> 0x01c3 }
            java.lang.String r3 = "SHA-256"
            w9.j r0 = r0.i(r3)     // Catch:{ all -> 0x01c3 }
            java.lang.String r0 = r0.g()     // Catch:{ all -> 0x01c3 }
            r10.append(r0)     // Catch:{ all -> 0x01c3 }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x01c3 }
            r2.append(r10)     // Catch:{ all -> 0x01c3 }
            java.lang.String r10 = "\n              |    DN: "
            r2.append(r10)     // Catch:{ all -> 0x01c3 }
            java.security.Principal r10 = r9.getSubjectDN()     // Catch:{ all -> 0x01c3 }
            java.lang.String r0 = "cert.subjectDN"
            z8.g.e(r10, r0)     // Catch:{ all -> 0x01c3 }
            java.lang.String r10 = r10.getName()     // Catch:{ all -> 0x01c3 }
            r2.append(r10)     // Catch:{ all -> 0x01c3 }
            java.lang.String r10 = "\n              |    subjectAltNames: "
            r2.append(r10)     // Catch:{ all -> 0x01c3 }
            java.util.ArrayList r9 = u9.c.a(r9)     // Catch:{ all -> 0x01c3 }
            r2.append(r9)     // Catch:{ all -> 0x01c3 }
            java.lang.String r9 = "\n              "
            r2.append(r9)     // Catch:{ all -> 0x01c3 }
            java.lang.String r9 = r2.toString()     // Catch:{ all -> 0x01c3 }
            java.lang.String r9 = f9.d.S(r9)     // Catch:{ all -> 0x01c3 }
            r11.<init>(r9)     // Catch:{ all -> 0x01c3 }
            throw r11     // Catch:{ all -> 0x01c3 }
        L_0x0124:
            javax.net.ssl.SSLPeerUnverifiedException r9 = new javax.net.ssl.SSLPeerUnverifiedException     // Catch:{ all -> 0x01c3 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x01c3 }
            r10.<init>(r11)     // Catch:{ all -> 0x01c3 }
            i9.r r11 = r0.f6152a     // Catch:{ all -> 0x01c3 }
            java.lang.String r11 = r11.f6306e     // Catch:{ all -> 0x01c3 }
            r10.append(r11)     // Catch:{ all -> 0x01c3 }
            java.lang.String r11 = " not verified (no certificates)"
            r10.append(r11)     // Catch:{ all -> 0x01c3 }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x01c3 }
            r9.<init>(r10)     // Catch:{ all -> 0x01c3 }
            throw r9     // Catch:{ all -> 0x01c3 }
        L_0x013f:
            i9.g r10 = r0.f6158h     // Catch:{ all -> 0x01c3 }
            z8.g.c(r10)     // Catch:{ all -> 0x01c3 }
            i9.p r11 = new i9.p     // Catch:{ all -> 0x01c3 }
            i9.g0 r3 = r4.f6294b     // Catch:{ all -> 0x01c3 }
            i9.h r5 = r4.f6295c     // Catch:{ all -> 0x01c3 }
            java.util.List<java.security.cert.Certificate> r6 = r4.d     // Catch:{ all -> 0x01c3 }
            m9.g r7 = new m9.g     // Catch:{ all -> 0x01c3 }
            r7.<init>(r10, r4, r0)     // Catch:{ all -> 0x01c3 }
            r11.<init>(r3, r5, r6, r7)     // Catch:{ all -> 0x01c3 }
            r8.d = r11     // Catch:{ all -> 0x01c3 }
            i9.r r11 = r0.f6152a     // Catch:{ all -> 0x01c3 }
            java.lang.String r11 = r11.f6306e     // Catch:{ all -> 0x01c3 }
            java.lang.String r0 = "hostname"
            z8.g.f(r11, r0)     // Catch:{ all -> 0x01c3 }
            java.util.Set<i9.g$b> r10 = r10.f6241a     // Catch:{ all -> 0x01c3 }
            java.util.Iterator r10 = r10.iterator()     // Catch:{ all -> 0x01c3 }
            boolean r11 = r10.hasNext()     // Catch:{ all -> 0x01c3 }
            if (r11 != 0) goto L_0x01b4
            boolean r9 = r9.f6264b     // Catch:{ all -> 0x01c3 }
            if (r9 == 0) goto L_0x017a
            r9.h$a r9 = r9.h.f8494c     // Catch:{ all -> 0x01c3 }
            r9.getClass()     // Catch:{ all -> 0x01c3 }
            r9.h r9 = r9.h.f8492a     // Catch:{ all -> 0x01c3 }
            java.lang.String r2 = r9.f(r1)     // Catch:{ all -> 0x01c3 }
        L_0x017a:
            r8.f7254c = r1     // Catch:{ all -> 0x01c3 }
            w9.d r9 = n.e.G(r1)     // Catch:{ all -> 0x01c3 }
            w9.v r9 = n.e.o(r9)     // Catch:{ all -> 0x01c3 }
            r8.f7257g = r9     // Catch:{ all -> 0x01c3 }
            w9.c r9 = n.e.F(r1)     // Catch:{ all -> 0x01c3 }
            w9.u r9 = n.e.n(r9)     // Catch:{ all -> 0x01c3 }
            r8.f7258h = r9     // Catch:{ all -> 0x01c3 }
            if (r2 == 0) goto L_0x019c
            i9.w$a r9 = i9.w.Companion     // Catch:{ all -> 0x01c3 }
            r9.getClass()     // Catch:{ all -> 0x01c3 }
            i9.w r9 = i9.w.a.a(r2)     // Catch:{ all -> 0x01c3 }
            goto L_0x019e
        L_0x019c:
            i9.w r9 = i9.w.HTTP_1_1     // Catch:{ all -> 0x01c3 }
        L_0x019e:
            r8.f7255e = r9     // Catch:{ all -> 0x01c3 }
            r9.h$a r9 = r9.h.f8494c
            r9.getClass()
            r9.h r9 = r9.h.f8492a
            r9.a(r1)
            i9.w r9 = r8.f7255e
            i9.w r10 = i9.w.HTTP_2
            if (r9 != r10) goto L_0x01b3
            r8.l()
        L_0x01b3:
            return
        L_0x01b4:
            java.lang.Object r9 = r10.next()     // Catch:{ all -> 0x01c3 }
            i9.g$b r9 = (i9.g.b) r9     // Catch:{ all -> 0x01c3 }
            r9.getClass()     // Catch:{ all -> 0x01c3 }
            java.lang.String r9 = "**."
            boolean unused = f9.h.a0(r2, r9, false)     // Catch:{ all -> 0x01c3 }
            throw r2     // Catch:{ all -> 0x01c3 }
        L_0x01c3:
            r9 = move-exception
            r2 = r1
            goto L_0x01cf
        L_0x01c6:
            java.lang.NullPointerException r9 = new java.lang.NullPointerException     // Catch:{ all -> 0x01ce }
            java.lang.String r10 = "null cannot be cast to non-null type javax.net.ssl.SSLSocket"
            r9.<init>(r10)     // Catch:{ all -> 0x01ce }
            throw r9     // Catch:{ all -> 0x01ce }
        L_0x01ce:
            r9 = move-exception
        L_0x01cf:
            if (r2 == 0) goto L_0x01db
            r9.h$a r10 = r9.h.f8494c
            r10.getClass()
            r9.h r10 = r9.h.f8492a
            r10.a(r2)
        L_0x01db:
            if (r2 == 0) goto L_0x01e7
            byte[] r10 = j9.c.f6602a
            r2.close()     // Catch:{ AssertionError -> 0x01e5, RuntimeException -> 0x01e3, Exception -> 0x01e7 }
            goto L_0x01e7
        L_0x01e3:
            r9 = move-exception
            throw r9
        L_0x01e5:
            r9 = move-exception
            throw r9
        L_0x01e7:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: m9.h.g(m9.b, m9.e, i9.n):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00d4, code lost:
        if (r11 == false) goto L_0x00d8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x008e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00db A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00dc A[SYNTHETIC, Splitter:B:59:0x00dc] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean h(i9.a r10, java.util.List<i9.f0> r11) {
        /*
            r9 = this;
            java.lang.String r0 = "hostname"
            java.lang.String r1 = "address"
            z8.g.f(r10, r1)
            byte[] r1 = j9.c.f6602a
            java.util.ArrayList r1 = r9.f7264o
            int r1 = r1.size()
            int r2 = r9.f7263n
            r3 = 0
            if (r1 >= r2) goto L_0x010f
            boolean r1 = r9.f7259i
            if (r1 == 0) goto L_0x001a
            goto L_0x010f
        L_0x001a:
            i9.f0 r1 = r9.f7266q
            i9.a r2 = r1.f6237a
            boolean r2 = r2.a(r10)
            if (r2 != 0) goto L_0x0025
            return r3
        L_0x0025:
            i9.r r2 = r10.f6152a
            java.lang.String r4 = r2.f6306e
            i9.a r5 = r1.f6237a
            i9.r r6 = r5.f6152a
            java.lang.String r6 = r6.f6306e
            boolean r4 = z8.g.a(r4, r6)
            r6 = 1
            if (r4 == 0) goto L_0x0037
            return r6
        L_0x0037:
            p9.f r4 = r9.f7256f
            if (r4 != 0) goto L_0x003c
            return r3
        L_0x003c:
            if (r11 == 0) goto L_0x010f
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            boolean r4 = r11 instanceof java.util.Collection
            if (r4 == 0) goto L_0x004e
            r4 = r11
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L_0x004e
            goto L_0x0083
        L_0x004e:
            java.util.Iterator r11 = r11.iterator()
        L_0x0052:
            boolean r4 = r11.hasNext()
            if (r4 == 0) goto L_0x0083
            java.lang.Object r4 = r11.next()
            i9.f0 r4 = (i9.f0) r4
            java.net.Proxy r7 = r4.f6238b
            java.net.Proxy$Type r7 = r7.type()
            java.net.Proxy$Type r8 = java.net.Proxy.Type.DIRECT
            if (r7 != r8) goto L_0x007e
            java.net.Proxy r7 = r1.f6238b
            java.net.Proxy$Type r7 = r7.type()
            java.net.Proxy$Type r8 = java.net.Proxy.Type.DIRECT
            if (r7 != r8) goto L_0x007e
            java.net.InetSocketAddress r7 = r1.f6239c
            java.net.InetSocketAddress r4 = r4.f6239c
            boolean r4 = z8.g.a(r7, r4)
            if (r4 == 0) goto L_0x007e
            r4 = r6
            goto L_0x007f
        L_0x007e:
            r4 = r3
        L_0x007f:
            if (r4 == 0) goto L_0x0052
            r11 = r6
            goto L_0x0084
        L_0x0083:
            r11 = r3
        L_0x0084:
            if (r11 != 0) goto L_0x0088
            goto L_0x010f
        L_0x0088:
            u9.c r11 = u9.c.f9113a
            javax.net.ssl.HostnameVerifier r1 = r10.f6157g
            if (r1 == r11) goto L_0x008f
            return r3
        L_0x008f:
            byte[] r11 = j9.c.f6602a
            i9.r r11 = r5.f6152a
            int r1 = r11.f6307f
            java.lang.String r4 = r2.f6306e
            int r2 = r2.f6307f
            if (r2 == r1) goto L_0x009c
            goto L_0x00d8
        L_0x009c:
            java.lang.String r11 = r11.f6306e
            boolean r11 = z8.g.a(r4, r11)
            if (r11 == 0) goto L_0x00a5
            goto L_0x00d6
        L_0x00a5:
            boolean r11 = r9.f7260j
            if (r11 != 0) goto L_0x00d8
            i9.p r11 = r9.d
            if (r11 == 0) goto L_0x00d8
            java.util.List r11 = r11.a()
            r1 = r11
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            r1 = r1 ^ r6
            if (r1 == 0) goto L_0x00d3
            java.lang.Object r11 = r11.get(r3)
            if (r11 == 0) goto L_0x00cb
            java.security.cert.X509Certificate r11 = (java.security.cert.X509Certificate) r11
            boolean r11 = u9.c.c(r4, r11)
            if (r11 == 0) goto L_0x00d3
            r11 = r6
            goto L_0x00d4
        L_0x00cb:
            java.lang.NullPointerException r10 = new java.lang.NullPointerException
            java.lang.String r11 = "null cannot be cast to non-null type java.security.cert.X509Certificate"
            r10.<init>(r11)
            throw r10
        L_0x00d3:
            r11 = r3
        L_0x00d4:
            if (r11 == 0) goto L_0x00d8
        L_0x00d6:
            r11 = r6
            goto L_0x00d9
        L_0x00d8:
            r11 = r3
        L_0x00d9:
            if (r11 != 0) goto L_0x00dc
            return r3
        L_0x00dc:
            i9.g r10 = r10.f6158h     // Catch:{ SSLPeerUnverifiedException -> 0x010f }
            z8.g.c(r10)     // Catch:{ SSLPeerUnverifiedException -> 0x010f }
            i9.p r11 = r9.d     // Catch:{ SSLPeerUnverifiedException -> 0x010f }
            z8.g.c(r11)     // Catch:{ SSLPeerUnverifiedException -> 0x010f }
            java.util.List r11 = r11.a()     // Catch:{ SSLPeerUnverifiedException -> 0x010f }
            z8.g.f(r4, r0)     // Catch:{ SSLPeerUnverifiedException -> 0x010f }
            java.lang.String r0 = "peerCertificates"
            z8.g.f(r11, r0)     // Catch:{ SSLPeerUnverifiedException -> 0x010f }
            java.util.Set<i9.g$b> r10 = r10.f6241a     // Catch:{ SSLPeerUnverifiedException -> 0x010f }
            java.util.Iterator r10 = r10.iterator()     // Catch:{ SSLPeerUnverifiedException -> 0x010f }
            boolean r11 = r10.hasNext()     // Catch:{ SSLPeerUnverifiedException -> 0x010f }
            if (r11 != 0) goto L_0x00ff
            return r6
        L_0x00ff:
            java.lang.Object r10 = r10.next()     // Catch:{ SSLPeerUnverifiedException -> 0x010f }
            i9.g$b r10 = (i9.g.b) r10     // Catch:{ SSLPeerUnverifiedException -> 0x010f }
            r10.getClass()     // Catch:{ SSLPeerUnverifiedException -> 0x010f }
            java.lang.String r10 = "**."
            r11 = 0
            boolean unused = f9.h.a0(r11, r10, false)     // Catch:{ SSLPeerUnverifiedException -> 0x010f }
            throw r11     // Catch:{ SSLPeerUnverifiedException -> 0x010f }
        L_0x010f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: m9.h.h(i9.a, java.util.List):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean i(boolean r10) {
        /*
            r9 = this;
            byte[] r0 = j9.c.f6602a
            long r0 = java.lang.System.nanoTime()
            java.net.Socket r2 = r9.f7253b
            z8.g.c(r2)
            java.net.Socket r3 = r9.f7254c
            z8.g.c(r3)
            w9.v r4 = r9.f7257g
            z8.g.c(r4)
            boolean r2 = r2.isClosed()
            r5 = 0
            if (r2 != 0) goto L_0x007c
            boolean r2 = r3.isClosed()
            if (r2 != 0) goto L_0x007c
            boolean r2 = r3.isInputShutdown()
            if (r2 != 0) goto L_0x007c
            boolean r2 = r3.isOutputShutdown()
            if (r2 == 0) goto L_0x002f
            goto L_0x007c
        L_0x002f:
            p9.f r2 = r9.f7256f
            r6 = 1
            if (r2 == 0) goto L_0x0050
            monitor-enter(r2)
            boolean r10 = r2.u     // Catch:{ all -> 0x004d }
            if (r10 == 0) goto L_0x003a
            goto L_0x0048
        L_0x003a:
            long r3 = r2.D     // Catch:{ all -> 0x004d }
            long r7 = r2.C     // Catch:{ all -> 0x004d }
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 >= 0) goto L_0x004a
            long r3 = r2.E     // Catch:{ all -> 0x004d }
            int r10 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r10 < 0) goto L_0x004a
        L_0x0048:
            monitor-exit(r2)
            goto L_0x004c
        L_0x004a:
            monitor-exit(r2)
            r5 = r6
        L_0x004c:
            return r5
        L_0x004d:
            r10 = move-exception
            monitor-exit(r2)
            throw r10
        L_0x0050:
            monitor-enter(r9)
            long r7 = r9.f7265p     // Catch:{ all -> 0x0079 }
            long r0 = r0 - r7
            monitor-exit(r9)
            r7 = 10000000000(0x2540be400, double:4.9406564584E-314)
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 < 0) goto L_0x0078
            if (r10 == 0) goto L_0x0078
            int r10 = r3.getSoTimeout()     // Catch:{ SocketTimeoutException -> 0x0076, IOException -> 0x0077 }
            r3.setSoTimeout(r6)     // Catch:{ all -> 0x0071 }
            boolean r0 = r4.F()     // Catch:{ all -> 0x0071 }
            r0 = r0 ^ r6
            r3.setSoTimeout(r10)     // Catch:{ SocketTimeoutException -> 0x0076, IOException -> 0x0077 }
            r5 = r0
            goto L_0x0077
        L_0x0071:
            r0 = move-exception
            r3.setSoTimeout(r10)     // Catch:{ SocketTimeoutException -> 0x0076, IOException -> 0x0077 }
            throw r0     // Catch:{ SocketTimeoutException -> 0x0076, IOException -> 0x0077 }
        L_0x0076:
            r5 = r6
        L_0x0077:
            return r5
        L_0x0078:
            return r6
        L_0x0079:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        L_0x007c:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: m9.h.i(boolean):boolean");
    }

    public final n9.d j(i9.v vVar, n9.f fVar) {
        Socket socket = this.f7254c;
        g.c(socket);
        v vVar2 = this.f7257g;
        g.c(vVar2);
        u uVar = this.f7258h;
        g.c(uVar);
        f fVar2 = this.f7256f;
        if (fVar2 != null) {
            return new p9.p(vVar, this, fVar, fVar2);
        }
        int i10 = fVar.f7513h;
        socket.setSoTimeout(i10);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        vVar2.h().g((long) i10, timeUnit);
        uVar.h().g((long) fVar.f7514i, timeUnit);
        return new o9.b(vVar, this, vVar2, uVar);
    }

    public final synchronized void k() {
        this.f7259i = true;
    }

    public final void l() {
        String str;
        int i10;
        int i11;
        Socket socket = this.f7254c;
        g.c(socket);
        v vVar = this.f7257g;
        g.c(vVar);
        u uVar = this.f7258h;
        g.c(uVar);
        socket.setSoTimeout(0);
        l9.d dVar = l9.d.f6995h;
        f.b bVar = new f.b(dVar);
        String str2 = this.f7266q.f6237a.f6152a.f6306e;
        g.f(str2, "peerName");
        bVar.f8007a = socket;
        if (bVar.f8013h) {
            str = c.f6607g + ' ' + str2;
        } else {
            str = "MockWebServer ".concat(str2);
        }
        bVar.f8008b = str;
        bVar.f8009c = vVar;
        bVar.d = uVar;
        bVar.f8010e = this;
        bVar.f8012g = 0;
        f fVar = new f(bVar);
        this.f7256f = fVar;
        p9.w wVar = f.P;
        if ((wVar.f8121a & 16) != 0) {
            i10 = wVar.f8122b[4];
        } else {
            i10 = Integer.MAX_VALUE;
        }
        this.f7263n = i10;
        s sVar = fVar.M;
        synchronized (sVar) {
            if (sVar.f8092q) {
                throw new IOException("closed");
            } else if (sVar.f8095t) {
                Logger logger = s.u;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(c.h(">> CONNECTION " + p9.e.f7992a.l(), new Object[0]));
                }
                sVar.f8094s.e0(p9.e.f7992a);
                sVar.f8094s.flush();
            }
        }
        s sVar2 = fVar.M;
        p9.w wVar2 = fVar.F;
        synchronized (sVar2) {
            g.f(wVar2, "settings");
            if (!sVar2.f8092q) {
                sVar2.c(0, Integer.bitCount(wVar2.f8121a) * 6, 4, 0);
                for (int i12 = 0; i12 < 10; i12++) {
                    boolean z = true;
                    if (((1 << i12) & wVar2.f8121a) == 0) {
                        z = false;
                    }
                    if (z) {
                        if (i12 == 4) {
                            i11 = 3;
                        } else if (i12 != 7) {
                            i11 = i12;
                        } else {
                            i11 = 4;
                        }
                        sVar2.f8094s.writeShort(i11);
                        sVar2.f8094s.writeInt(wVar2.f8122b[i12]);
                    }
                }
                sVar2.f8094s.flush();
            } else {
                throw new IOException("closed");
            }
        }
        int a10 = fVar.F.a();
        if (a10 != 65535) {
            fVar.M.j(0, (long) (a10 - 65535));
        }
        dVar.f().c(new l9.b(fVar.N, fVar.f7999r), 0);
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Connection{");
        f0 f0Var = this.f7266q;
        sb.append(f0Var.f6237a.f6152a.f6306e);
        sb.append(':');
        sb.append(f0Var.f6237a.f6152a.f6307f);
        sb.append(", proxy=");
        sb.append(f0Var.f6238b);
        sb.append(" hostAddress=");
        sb.append(f0Var.f6239c);
        sb.append(" cipherSuite=");
        p pVar = this.d;
        if (pVar == null || (obj = pVar.f6295c) == null) {
            obj = "none";
        }
        sb.append(obj);
        sb.append(" protocol=");
        sb.append(this.f7255e);
        sb.append('}');
        return sb.toString();
    }
}
