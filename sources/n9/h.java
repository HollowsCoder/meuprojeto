package n9;

import i9.b;
import i9.b0;
import i9.c0;
import i9.f0;
import i9.r;
import i9.s;
import i9.v;
import i9.x;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.regex.Pattern;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import m9.c;
import m9.d;
import m9.l;
import n.e;
import z8.g;

public final class h implements s {

    /* renamed from: a  reason: collision with root package name */
    public final v f7518a;

    public h(v vVar) {
        g.f(vVar, "client");
        this.f7518a = vVar;
    }

    public static int d(c0 c0Var, int i10) {
        String b10 = c0.b(c0Var, "Retry-After");
        if (b10 == null) {
            return i10;
        }
        Pattern compile = Pattern.compile("\\d+");
        g.e(compile, "compile(pattern)");
        if (!compile.matcher(b10).matches()) {
            return Integer.MAX_VALUE;
        }
        Integer valueOf = Integer.valueOf(b10);
        g.e(valueOf, "Integer.valueOf(header)");
        return valueOf.intValue();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: o8.k} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: o8.k} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: o8.k} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: o8.k} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v26, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: o8.k} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v8, resolved type: o8.k} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final i9.c0 a(n9.f r31) {
        /*
            r30 = this;
            r1 = r30
            r2 = r31
            i9.x r0 = r2.f7511f
            m9.e r3 = r2.f7508b
            o8.k r4 = o8.k.f7764o
            r5 = 1
            r8 = r4
            r9 = 0
            r10 = 0
            r4 = r0
            r0 = r5
        L_0x0010:
            r3.getClass()
            java.lang.String r11 = "request"
            z8.g.f(r4, r11)
            m9.c r11 = r3.w
            if (r11 != 0) goto L_0x001e
            r11 = r5
            goto L_0x001f
        L_0x001e:
            r11 = 0
        L_0x001f:
            if (r11 == 0) goto L_0x01c2
            monitor-enter(r3)
            boolean r11 = r3.f7243y     // Catch:{ all -> 0x01bf }
            r11 = r11 ^ r5
            if (r11 == 0) goto L_0x01b3
            boolean r11 = r3.f7242x     // Catch:{ all -> 0x01bf }
            r11 = r11 ^ r5
            if (r11 == 0) goto L_0x01a7
            n8.i r11 = n8.i.f7501a     // Catch:{ all -> 0x01bf }
            monitor-exit(r3)
            if (r0 == 0) goto L_0x008d
            m9.d r0 = new m9.d
            m9.j r11 = r3.f7235o
            i9.r r12 = r4.f6366b
            boolean r13 = r12.f6303a
            i9.v r14 = r3.D
            if (r13 == 0) goto L_0x0054
            javax.net.ssl.SSLSocketFactory r13 = r14.D
            if (r13 == 0) goto L_0x004c
            javax.net.ssl.HostnameVerifier r15 = r14.H
            i9.g r7 = r14.I
            r23 = r7
            r21 = r13
            r22 = r15
            goto L_0x005a
        L_0x004c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "CLEARTEXT-only client"
            r0.<init>(r2)
            throw r0
        L_0x0054:
            r21 = 0
            r22 = 0
            r23 = 0
        L_0x005a:
            i9.a r7 = new i9.a
            java.lang.String r13 = r12.f6306e
            int r12 = r12.f6307f
            i9.m r15 = r14.z
            javax.net.SocketFactory r5 = r14.C
            i9.b r6 = r14.B
            r28 = r8
            java.util.List<i9.w> r8 = r14.G
            r29 = r9
            java.util.List<i9.i> r9 = r14.F
            java.net.ProxySelector r14 = r14.A
            r16 = r7
            r17 = r13
            r18 = r12
            r19 = r15
            r20 = r5
            r24 = r6
            r25 = r8
            r26 = r9
            r27 = r14
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            i9.n r5 = r3.f7236p
            r0.<init>(r11, r7, r3, r5)
            r3.f7240t = r0
            goto L_0x0091
        L_0x008d:
            r28 = r8
            r29 = r9
        L_0x0091:
            boolean r0 = r3.A     // Catch:{ all -> 0x01a1 }
            if (r0 != 0) goto L_0x0199
            i9.c0 r0 = r2.b(r4)     // Catch:{ k -> 0x0160, IOException -> 0x0125 }
            if (r10 == 0) goto L_0x00c8
            i9.c0$a r4 = new i9.c0$a     // Catch:{ all -> 0x01a1 }
            r4.<init>(r0)     // Catch:{ all -> 0x01a1 }
            i9.c0$a r0 = new i9.c0$a     // Catch:{ all -> 0x01a1 }
            r0.<init>(r10)     // Catch:{ all -> 0x01a1 }
            r5 = 0
            r0.f6204g = r5     // Catch:{ all -> 0x01a1 }
            i9.c0 r0 = r0.a()     // Catch:{ all -> 0x01a1 }
            i9.d0 r6 = r0.f6196v     // Catch:{ all -> 0x01a1 }
            if (r6 != 0) goto L_0x00b2
            r6 = 1
            goto L_0x00b3
        L_0x00b2:
            r6 = 0
        L_0x00b3:
            if (r6 == 0) goto L_0x00bc
            r4.f6207j = r0     // Catch:{ all -> 0x01a1 }
            i9.c0 r0 = r4.a()     // Catch:{ all -> 0x01a1 }
            goto L_0x00c9
        L_0x00bc:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x01a1 }
            java.lang.String r2 = "priorResponse.body != null"
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x01a1 }
            r0.<init>(r2)     // Catch:{ all -> 0x01a1 }
            throw r0     // Catch:{ all -> 0x01a1 }
        L_0x00c8:
            r5 = 0
        L_0x00c9:
            r10 = r0
            m9.c r0 = r3.w     // Catch:{ all -> 0x01a1 }
            i9.x r4 = r1.b(r10, r0)     // Catch:{ all -> 0x01a1 }
            if (r4 != 0) goto L_0x00f7
            if (r0 == 0) goto L_0x00f2
            boolean r0 = r0.f7211a     // Catch:{ all -> 0x01a1 }
            if (r0 == 0) goto L_0x00f2
            boolean r0 = r3.f7241v     // Catch:{ all -> 0x01a1 }
            r2 = 1
            r0 = r0 ^ r2
            if (r0 == 0) goto L_0x00e6
            r3.f7241v = r2     // Catch:{ all -> 0x01a1 }
            m9.e$c r0 = r3.f7237q     // Catch:{ all -> 0x01a1 }
            r0.i()     // Catch:{ all -> 0x01a1 }
            goto L_0x00f2
        L_0x00e6:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x01a1 }
            java.lang.String r2 = "Check failed."
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x01a1 }
            r0.<init>(r2)     // Catch:{ all -> 0x01a1 }
            throw r0     // Catch:{ all -> 0x01a1 }
        L_0x00f2:
            r2 = 0
            r3.i(r2)
            return r10
        L_0x00f7:
            i9.d0 r0 = r10.f6196v     // Catch:{ all -> 0x01a1 }
            if (r0 == 0) goto L_0x00fe
            j9.c.c(r0)     // Catch:{ all -> 0x01a1 }
        L_0x00fe:
            int r9 = r29 + 1
            r0 = 20
            if (r9 > r0) goto L_0x010e
            r6 = 1
            r3.i(r6)
            r8 = r28
            r0 = 1
            r5 = 1
            goto L_0x0010
        L_0x010e:
            java.net.ProtocolException r0 = new java.net.ProtocolException     // Catch:{ all -> 0x01a1 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x01a1 }
            r2.<init>()     // Catch:{ all -> 0x01a1 }
            java.lang.String r4 = "Too many follow-up requests: "
            r2.append(r4)     // Catch:{ all -> 0x01a1 }
            r2.append(r9)     // Catch:{ all -> 0x01a1 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x01a1 }
            r0.<init>(r2)     // Catch:{ all -> 0x01a1 }
            throw r0     // Catch:{ all -> 0x01a1 }
        L_0x0125:
            r0 = move-exception
            r5 = 0
            r6 = r0
            boolean r0 = r6 instanceof p9.a     // Catch:{ all -> 0x01a1 }
            if (r0 != 0) goto L_0x012f
            r0 = 1
            goto L_0x0130
        L_0x012f:
            r0 = 0
        L_0x0130:
            boolean r0 = r1.c(r6, r3, r4, r0)     // Catch:{ all -> 0x01a1 }
            if (r0 == 0) goto L_0x015a
            r8 = r28
            java.util.Collection r8 = (java.util.Collection) r8     // Catch:{ all -> 0x01a1 }
            java.lang.String r0 = "<this>"
            z8.g.f(r8, r0)     // Catch:{ all -> 0x01a1 }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x01a1 }
            int r7 = r8.size()     // Catch:{ all -> 0x01a1 }
            r9 = 1
            int r7 = r7 + r9
            r0.<init>(r7)     // Catch:{ all -> 0x01a1 }
            r0.addAll(r8)     // Catch:{ all -> 0x01a1 }
            r0.add(r6)     // Catch:{ all -> 0x01a1 }
            r3.i(r9)
            r8 = r0
            r5 = r9
            r9 = r29
            r0 = 0
            goto L_0x0010
        L_0x015a:
            r7 = r28
            j9.c.y(r6, r7)     // Catch:{ all -> 0x01a1 }
            throw r6     // Catch:{ all -> 0x01a1 }
        L_0x0160:
            r0 = move-exception
            r7 = r28
            r5 = 0
            r6 = r0
            java.io.IOException r0 = r6.f7272o     // Catch:{ all -> 0x01a1 }
            r8 = 0
            boolean r0 = r1.c(r0, r3, r4, r8)     // Catch:{ all -> 0x01a1 }
            if (r0 == 0) goto L_0x0193
            r0 = r7
            java.util.Collection r0 = (java.util.Collection) r0     // Catch:{ all -> 0x01a1 }
            java.io.IOException r6 = r6.f7273p     // Catch:{ all -> 0x01a1 }
            java.lang.String r7 = "<this>"
            z8.g.f(r0, r7)     // Catch:{ all -> 0x01a1 }
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ all -> 0x01a1 }
            int r9 = r0.size()     // Catch:{ all -> 0x01a1 }
            r11 = 1
            int r9 = r9 + r11
            r7.<init>(r9)     // Catch:{ all -> 0x01a1 }
            r7.addAll(r0)     // Catch:{ all -> 0x01a1 }
            r7.add(r6)     // Catch:{ all -> 0x01a1 }
            r3.i(r11)
            r0 = r8
            r5 = r11
            r9 = r29
            r8 = r7
            goto L_0x0010
        L_0x0193:
            java.io.IOException r0 = r6.f7273p     // Catch:{ all -> 0x01a1 }
            j9.c.y(r0, r7)     // Catch:{ all -> 0x01a1 }
            throw r0     // Catch:{ all -> 0x01a1 }
        L_0x0199:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x01a1 }
            java.lang.String r2 = "Canceled"
            r0.<init>(r2)     // Catch:{ all -> 0x01a1 }
            throw r0     // Catch:{ all -> 0x01a1 }
        L_0x01a1:
            r0 = move-exception
            r2 = 1
            r3.i(r2)
            throw r0
        L_0x01a7:
            java.lang.String r0 = "Check failed."
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch:{ all -> 0x01bf }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x01bf }
            r2.<init>(r0)     // Catch:{ all -> 0x01bf }
            throw r2     // Catch:{ all -> 0x01bf }
        L_0x01b3:
            java.lang.String r0 = "cannot make a new request because the previous response is still open: please call response.close()"
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch:{ all -> 0x01bf }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x01bf }
            r2.<init>(r0)     // Catch:{ all -> 0x01bf }
            throw r2     // Catch:{ all -> 0x01bf }
        L_0x01bf:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x01c2:
            java.lang.String r0 = "Check failed."
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: n9.h.a(n9.f):i9.c0");
    }

    public final x b(c0 c0Var, c cVar) {
        f0 f0Var;
        String b10;
        r.a aVar;
        r rVar;
        b bVar;
        m9.h hVar;
        b0 b0Var = null;
        if (cVar == null || (hVar = cVar.f7212b) == null) {
            f0Var = null;
        } else {
            f0Var = hVar.f7266q;
        }
        int i10 = c0Var.f6194s;
        String str = c0Var.f6191p.f6367c;
        boolean z = false;
        if (!(i10 == 307 || i10 == 308)) {
            if (i10 == 401) {
                bVar = this.f7518a.u;
            } else if (i10 != 421) {
                if (i10 == 503) {
                    c0 c0Var2 = c0Var.f6198y;
                    if ((c0Var2 == null || c0Var2.f6194s != 503) && d(c0Var, Integer.MAX_VALUE) == 0) {
                        return c0Var.f6191p;
                    }
                    return null;
                } else if (i10 == 407) {
                    g.c(f0Var);
                    if (f0Var.f6238b.type() == Proxy.Type.HTTP) {
                        bVar = this.f7518a.B;
                    } else {
                        throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                    }
                } else if (i10 != 408) {
                    switch (i10) {
                        case 300:
                        case 301:
                        case 302:
                        case 303:
                            break;
                        default:
                            return null;
                    }
                } else if (!this.f7518a.f6343t) {
                    return null;
                } else {
                    c0 c0Var3 = c0Var.f6198y;
                    if ((c0Var3 == null || c0Var3.f6194s != 408) && d(c0Var, 0) <= 0) {
                        return c0Var.f6191p;
                    }
                    return null;
                }
            } else if (cVar == null || !(!g.a(cVar.f7214e.f7232h.f6152a.f6306e, cVar.f7212b.f7266q.f6237a.f6152a.f6306e))) {
                return null;
            } else {
                m9.h hVar2 = cVar.f7212b;
                synchronized (hVar2) {
                    hVar2.f7260j = true;
                }
                return c0Var.f6191p;
            }
            bVar.d(f0Var, c0Var);
            return null;
        }
        v vVar = this.f7518a;
        if (!vVar.f6344v || (b10 = c0.b(c0Var, "Location")) == null) {
            return null;
        }
        x xVar = c0Var.f6191p;
        r rVar2 = xVar.f6366b;
        rVar2.getClass();
        try {
            aVar = new r.a();
            aVar.c(rVar2, b10);
        } catch (IllegalArgumentException unused) {
            aVar = null;
        }
        if (aVar != null) {
            rVar = aVar.a();
        } else {
            rVar = null;
        }
        if (rVar == null) {
            return null;
        }
        if (!g.a(rVar.f6304b, xVar.f6366b.f6304b) && !vVar.w) {
            return null;
        }
        x.a aVar2 = new x.a(xVar);
        if (e.D(str)) {
            boolean a10 = g.a(str, "PROPFIND");
            int i11 = c0Var.f6194s;
            if (a10 || i11 == 308 || i11 == 307) {
                z = true;
            }
            if ((true ^ g.a(str, "PROPFIND")) && i11 != 308 && i11 != 307) {
                str = "GET";
            } else if (z) {
                b0Var = xVar.f6368e;
            }
            aVar2.c(str, b0Var);
            if (!z) {
                aVar2.f6372c.f("Transfer-Encoding");
                aVar2.f6372c.f("Content-Length");
                aVar2.f6372c.f("Content-Type");
            }
        }
        if (!j9.c.a(xVar.f6366b, rVar)) {
            aVar2.f6372c.f("Authorization");
        }
        aVar2.f6370a = rVar;
        return aVar2.a();
    }

    public final boolean c(IOException iOException, m9.e eVar, x xVar, boolean z) {
        boolean z10;
        boolean z11;
        l lVar;
        m9.h hVar;
        if (!this.f7518a.f6343t) {
            return false;
        }
        if (z && (iOException instanceof FileNotFoundException)) {
            return false;
        }
        if (!(iOException instanceof ProtocolException) && (!(iOException instanceof InterruptedIOException) ? (!(iOException instanceof SSLHandshakeException) || !(iOException.getCause() instanceof CertificateException)) && !(iOException instanceof SSLPeerUnverifiedException) : (iOException instanceof SocketTimeoutException) && !z)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return false;
        }
        d dVar = eVar.f7240t;
        g.c(dVar);
        int i10 = dVar.f7228c;
        if (i10 == 0 && dVar.d == 0 && dVar.f7229e == 0) {
            z11 = false;
        } else {
            if (dVar.f7230f == null) {
                f0 f0Var = null;
                if (i10 <= 1 && dVar.d <= 1 && dVar.f7229e <= 0 && (hVar = dVar.f7233i.u) != null) {
                    synchronized (hVar) {
                        if (hVar.f7261k == 0) {
                            if (j9.c.a(hVar.f7266q.f6237a.f6152a, dVar.f7232h.f6152a)) {
                                f0Var = hVar.f7266q;
                            }
                        }
                    }
                }
                if (f0Var != null) {
                    dVar.f7230f = f0Var;
                } else {
                    l.a aVar = dVar.f7226a;
                    if ((aVar == null || !aVar.a()) && (lVar = dVar.f7227b) != null) {
                        z11 = lVar.a();
                    }
                }
            }
            z11 = true;
        }
        if (!z11) {
            return false;
        }
        return true;
    }
}
