package p9;

import i9.c0;
import i9.v;
import i9.w;
import i9.x;
import j9.c;
import java.util.List;
import m9.h;
import n9.d;
import n9.e;
import n9.f;
import w9.b0;
import w9.z;
import z8.g;

public final class p implements d {

    /* renamed from: g  reason: collision with root package name */
    public static final List<String> f8049g = c.k("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");

    /* renamed from: h  reason: collision with root package name */
    public static final List<String> f8050h = c.k("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* renamed from: a  reason: collision with root package name */
    public volatile r f8051a;

    /* renamed from: b  reason: collision with root package name */
    public final w f8052b;

    /* renamed from: c  reason: collision with root package name */
    public volatile boolean f8053c;
    public final h d;

    /* renamed from: e  reason: collision with root package name */
    public final f f8054e;

    /* renamed from: f  reason: collision with root package name */
    public final f f8055f;

    public p(v vVar, h hVar, f fVar, f fVar2) {
        g.f(hVar, "connection");
        this.d = hVar;
        this.f8054e = fVar;
        this.f8055f = fVar2;
        w wVar = w.H2_PRIOR_KNOWLEDGE;
        this.f8052b = !vVar.G.contains(wVar) ? w.HTTP_2 : wVar;
    }

    public final void a() {
        r rVar = this.f8051a;
        g.c(rVar);
        rVar.f().close();
    }

    public final void b() {
        this.f8055f.flush();
    }

    public final long c(c0 c0Var) {
        if (!e.a(c0Var)) {
            return 0;
        }
        return c.j(c0Var);
    }

    public final void cancel() {
        this.f8053c = true;
        r rVar = this.f8051a;
        if (rVar != null) {
            rVar.e(b.CANCEL);
        }
    }

    public final z d(x xVar, long j8) {
        r rVar = this.f8051a;
        g.c(rVar);
        return rVar.f();
    }

    public final b0 e(c0 c0Var) {
        r rVar = this.f8051a;
        g.c(rVar);
        return rVar.f8072g;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00bf, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00c0, code lost:
        r0.f8074i.l();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00c5, code lost:
        throw r11;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final i9.c0.a f(boolean r11) {
        /*
            r10 = this;
            p9.r r0 = r10.f8051a
            z8.g.c(r0)
            monitor-enter(r0)
            p9.r$c r1 = r0.f8074i     // Catch:{ all -> 0x00c6 }
            r1.h()     // Catch:{ all -> 0x00c6 }
        L_0x000b:
            java.util.ArrayDeque<i9.q> r1 = r0.f8070e     // Catch:{ all -> 0x00bf }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x00bf }
            if (r1 == 0) goto L_0x001b
            p9.b r1 = r0.f8076k     // Catch:{ all -> 0x00bf }
            if (r1 != 0) goto L_0x001b
            r0.j()     // Catch:{ all -> 0x00bf }
            goto L_0x000b
        L_0x001b:
            p9.r$c r1 = r0.f8074i     // Catch:{ all -> 0x00c6 }
            r1.l()     // Catch:{ all -> 0x00c6 }
            java.util.ArrayDeque<i9.q> r1 = r0.f8070e     // Catch:{ all -> 0x00c6 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x00c6 }
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x00af
            java.util.ArrayDeque<i9.q> r1 = r0.f8070e     // Catch:{ all -> 0x00c6 }
            java.lang.Object r1 = r1.removeFirst()     // Catch:{ all -> 0x00c6 }
            java.lang.String r2 = "headersQueue.removeFirst()"
            z8.g.e(r1, r2)     // Catch:{ all -> 0x00c6 }
            i9.q r1 = (i9.q) r1     // Catch:{ all -> 0x00c6 }
            monitor-exit(r0)
            i9.w r0 = r10.f8052b
            java.lang.String r2 = "protocol"
            z8.g.f(r0, r2)
            i9.q$a r2 = new i9.q$a
            r2.<init>()
            java.lang.String[] r3 = r1.f6300o
            int r3 = r3.length
            int r3 = r3 / 2
            r4 = 0
            r5 = 0
            r6 = r4
        L_0x004c:
            if (r5 >= r3) goto L_0x007f
            java.lang.String r7 = r1.h(r5)
            java.lang.String r8 = r1.k(r5)
            java.lang.String r9 = ":status"
            boolean r9 = z8.g.a(r7, r9)
            if (r9 == 0) goto L_0x0071
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "HTTP/1.1 "
            r6.<init>(r7)
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            n9.i r6 = n9.i.a.a(r6)
            goto L_0x007c
        L_0x0071:
            java.util.List<java.lang.String> r9 = f8050h
            boolean r9 = r9.contains(r7)
            if (r9 != 0) goto L_0x007c
            r2.c(r7, r8)
        L_0x007c:
            int r5 = r5 + 1
            goto L_0x004c
        L_0x007f:
            if (r6 == 0) goto L_0x00a7
            i9.c0$a r1 = new i9.c0$a
            r1.<init>()
            r1.f6200b = r0
            int r0 = r6.f7520b
            r1.f6201c = r0
            java.lang.String r0 = r6.f7521c
            java.lang.String r3 = "message"
            z8.g.f(r0, r3)
            r1.d = r0
            i9.q r0 = r2.d()
            r1.c(r0)
            if (r11 == 0) goto L_0x00a5
            int r11 = r1.f6201c
            r0 = 100
            if (r11 != r0) goto L_0x00a5
            goto L_0x00a6
        L_0x00a5:
            r4 = r1
        L_0x00a6:
            return r4
        L_0x00a7:
            java.net.ProtocolException r11 = new java.net.ProtocolException
            java.lang.String r0 = "Expected ':status' header not present"
            r11.<init>(r0)
            throw r11
        L_0x00af:
            java.io.IOException r11 = r0.l     // Catch:{ all -> 0x00c6 }
            if (r11 == 0) goto L_0x00b4
            goto L_0x00be
        L_0x00b4:
            p9.x r11 = new p9.x     // Catch:{ all -> 0x00c6 }
            p9.b r1 = r0.f8076k     // Catch:{ all -> 0x00c6 }
            z8.g.c(r1)     // Catch:{ all -> 0x00c6 }
            r11.<init>(r1)     // Catch:{ all -> 0x00c6 }
        L_0x00be:
            throw r11     // Catch:{ all -> 0x00c6 }
        L_0x00bf:
            r11 = move-exception
            p9.r$c r1 = r0.f8074i     // Catch:{ all -> 0x00c6 }
            r1.l()     // Catch:{ all -> 0x00c6 }
            throw r11     // Catch:{ all -> 0x00c6 }
        L_0x00c6:
            r11 = move-exception
            monitor-exit(r0)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p9.p.f(boolean):i9.c0$a");
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x0117  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g(i9.x r19) {
        /*
            r18 = this;
            r1 = r18
            r0 = r19
            p9.r r2 = r1.f8051a
            if (r2 == 0) goto L_0x0009
            return
        L_0x0009:
            i9.b0 r2 = r0.f6368e
            r4 = 1
            if (r2 == 0) goto L_0x0010
            r2 = r4
            goto L_0x0011
        L_0x0010:
            r2 = 0
        L_0x0011:
            java.util.ArrayList r5 = new java.util.ArrayList
            i9.q r6 = r0.d
            java.lang.String[] r7 = r6.f6300o
            int r7 = r7.length
            int r7 = r7 / 2
            r8 = 4
            int r7 = r7 + r8
            r5.<init>(r7)
            p9.c r7 = new p9.c
            w9.j r9 = p9.c.f7968f
            java.lang.String r10 = r0.f6367c
            r7.<init>((w9.j) r9, (java.lang.String) r10)
            r5.add(r7)
            p9.c r7 = new p9.c
            w9.j r9 = p9.c.f7969g
            java.lang.String r10 = "url"
            i9.r r11 = r0.f6366b
            z8.g.f(r11, r10)
            java.lang.String r10 = r11.b()
            java.lang.String r12 = r11.d()
            if (r12 == 0) goto L_0x0054
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r10)
            r10 = 63
            r13.append(r10)
            r13.append(r12)
            java.lang.String r10 = r13.toString()
        L_0x0054:
            r7.<init>((w9.j) r9, (java.lang.String) r10)
            r5.add(r7)
            java.lang.String r7 = "Host"
            i9.q r0 = r0.d
            java.lang.String r0 = r0.e(r7)
            if (r0 == 0) goto L_0x006e
            p9.c r7 = new p9.c
            w9.j r9 = p9.c.f7971i
            r7.<init>((w9.j) r9, (java.lang.String) r0)
            r5.add(r7)
        L_0x006e:
            p9.c r0 = new p9.c
            w9.j r7 = p9.c.f7970h
            java.lang.String r9 = r11.f6304b
            r0.<init>((w9.j) r7, (java.lang.String) r9)
            r5.add(r0)
            java.lang.String[] r0 = r6.f6300o
            int r0 = r0.length
            int r0 = r0 / 2
            r7 = 0
        L_0x0080:
            if (r7 >= r0) goto L_0x00cb
            java.lang.String r9 = r6.h(r7)
            java.util.Locale r10 = java.util.Locale.US
            java.lang.String r11 = "Locale.US"
            z8.g.e(r10, r11)
            if (r9 == 0) goto L_0x00c3
            java.lang.String r9 = r9.toLowerCase(r10)
            java.lang.String r10 = "(this as java.lang.String).toLowerCase(locale)"
            z8.g.e(r9, r10)
            java.util.List<java.lang.String> r10 = f8049g
            boolean r10 = r10.contains(r9)
            if (r10 == 0) goto L_0x00b4
            java.lang.String r10 = "te"
            boolean r10 = z8.g.a(r9, r10)
            if (r10 == 0) goto L_0x00c0
            java.lang.String r10 = r6.k(r7)
            java.lang.String r11 = "trailers"
            boolean r10 = z8.g.a(r10, r11)
            if (r10 == 0) goto L_0x00c0
        L_0x00b4:
            p9.c r10 = new p9.c
            java.lang.String r11 = r6.k(r7)
            r10.<init>((java.lang.String) r9, (java.lang.String) r11)
            r5.add(r10)
        L_0x00c0:
            int r7 = r7 + 1
            goto L_0x0080
        L_0x00c3:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r2 = "null cannot be cast to non-null type java.lang.String"
            r0.<init>(r2)
            throw r0
        L_0x00cb:
            p9.f r6 = r1.f8055f
            r6.getClass()
            r0 = r2 ^ 1
            r13 = 0
            p9.s r7 = r6.M
            monitor-enter(r7)
            monitor-enter(r6)     // Catch:{ all -> 0x01c4 }
            int r9 = r6.f8001t     // Catch:{ all -> 0x01c1 }
            r10 = 1073741823(0x3fffffff, float:1.9999999)
            if (r9 <= r10) goto L_0x00e3
            p9.b r9 = p9.b.REFUSED_STREAM     // Catch:{ all -> 0x01c1 }
            r6.f(r9)     // Catch:{ all -> 0x01c1 }
        L_0x00e3:
            boolean r9 = r6.u     // Catch:{ all -> 0x01c1 }
            if (r9 != 0) goto L_0x01bb
            int r15 = r6.f8001t     // Catch:{ all -> 0x01c1 }
            int r9 = r15 + 2
            r6.f8001t = r9     // Catch:{ all -> 0x01c1 }
            p9.r r14 = new p9.r     // Catch:{ all -> 0x01c1 }
            r16 = 0
            r9 = r14
            r10 = r15
            r11 = r6
            r12 = r0
            r3 = r14
            r14 = r16
            r9.<init>(r10, r11, r12, r13, r14)     // Catch:{ all -> 0x01c1 }
            if (r2 == 0) goto L_0x0110
            long r9 = r6.J     // Catch:{ all -> 0x01c1 }
            long r11 = r6.K     // Catch:{ all -> 0x01c1 }
            int r2 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r2 >= 0) goto L_0x0110
            long r9 = r3.f8069c     // Catch:{ all -> 0x01c1 }
            long r11 = r3.d     // Catch:{ all -> 0x01c1 }
            int r2 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r2 < 0) goto L_0x010e
            goto L_0x0110
        L_0x010e:
            r2 = 0
            goto L_0x0111
        L_0x0110:
            r2 = r4
        L_0x0111:
            boolean r9 = r3.h()     // Catch:{ all -> 0x01c1 }
            if (r9 == 0) goto L_0x0120
            java.util.LinkedHashMap r9 = r6.f7998q     // Catch:{ all -> 0x01c1 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r15)     // Catch:{ all -> 0x01c1 }
            r9.put(r10, r3)     // Catch:{ all -> 0x01c1 }
        L_0x0120:
            n8.i r9 = n8.i.f7501a     // Catch:{ all -> 0x01c1 }
            monitor-exit(r6)     // Catch:{ all -> 0x01c4 }
            p9.s r9 = r6.M     // Catch:{ all -> 0x01c4 }
            monitor-enter(r9)     // Catch:{ all -> 0x01c4 }
            boolean r10 = r9.f8092q     // Catch:{ all -> 0x01b8 }
            if (r10 != 0) goto L_0x01b0
            p9.d$b r10 = r9.f8093r     // Catch:{ all -> 0x01b8 }
            r10.d(r5)     // Catch:{ all -> 0x01b8 }
            w9.f r5 = r9.f8090o     // Catch:{ all -> 0x01b8 }
            long r10 = r5.f9325p     // Catch:{ all -> 0x01b8 }
            int r5 = r9.f8091p     // Catch:{ all -> 0x01b8 }
            long r12 = (long) r5     // Catch:{ all -> 0x01b8 }
            long r12 = java.lang.Math.min(r12, r10)     // Catch:{ all -> 0x01b8 }
            int r5 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r5 != 0) goto L_0x0141
            r17 = r8
            goto L_0x0143
        L_0x0141:
            r17 = 0
        L_0x0143:
            if (r0 == 0) goto L_0x0147
            r17 = r17 | 1
        L_0x0147:
            r0 = r17
            int r8 = (int) r12     // Catch:{ all -> 0x01b8 }
            r9.c(r15, r8, r4, r0)     // Catch:{ all -> 0x01b8 }
            w9.h r0 = r9.f8094s     // Catch:{ all -> 0x01b8 }
            w9.f r4 = r9.f8090o     // Catch:{ all -> 0x01b8 }
            r0.H(r4, r12)     // Catch:{ all -> 0x01b8 }
            if (r5 <= 0) goto L_0x015a
            long r10 = r10 - r12
            r9.l(r15, r10)     // Catch:{ all -> 0x01b8 }
        L_0x015a:
            monitor-exit(r9)     // Catch:{ all -> 0x01c4 }
            monitor-exit(r7)
            if (r2 == 0) goto L_0x0177
            p9.s r2 = r6.M
            monitor-enter(r2)
            boolean r0 = r2.f8092q     // Catch:{ all -> 0x0174 }
            if (r0 != 0) goto L_0x016c
            w9.h r0 = r2.f8094s     // Catch:{ all -> 0x0174 }
            r0.flush()     // Catch:{ all -> 0x0174 }
            monitor-exit(r2)
            goto L_0x0177
        L_0x016c:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0174 }
            java.lang.String r3 = "closed"
            r0.<init>(r3)     // Catch:{ all -> 0x0174 }
            throw r0     // Catch:{ all -> 0x0174 }
        L_0x0174:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x0177:
            r1.f8051a = r3
            boolean r0 = r1.f8053c
            if (r0 != 0) goto L_0x019e
            p9.r r0 = r1.f8051a
            z8.g.c(r0)
            p9.r$c r0 = r0.f8074i
            n9.f r2 = r1.f8054e
            int r2 = r2.f7513h
            long r2 = (long) r2
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS
            r0.g(r2, r4)
            p9.r r0 = r1.f8051a
            z8.g.c(r0)
            p9.r$c r0 = r0.f8075j
            n9.f r2 = r1.f8054e
            int r2 = r2.f7514i
            long r2 = (long) r2
            r0.g(r2, r4)
            return
        L_0x019e:
            p9.r r0 = r1.f8051a
            z8.g.c(r0)
            p9.b r2 = p9.b.CANCEL
            r0.e(r2)
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r2 = "Canceled"
            r0.<init>(r2)
            throw r0
        L_0x01b0:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x01b8 }
            java.lang.String r2 = "closed"
            r0.<init>(r2)     // Catch:{ all -> 0x01b8 }
            throw r0     // Catch:{ all -> 0x01b8 }
        L_0x01b8:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x01c4 }
            throw r0     // Catch:{ all -> 0x01c4 }
        L_0x01bb:
            p9.a r0 = new p9.a     // Catch:{ all -> 0x01c1 }
            r0.<init>()     // Catch:{ all -> 0x01c1 }
            throw r0     // Catch:{ all -> 0x01c1 }
        L_0x01c1:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x01c4 }
            throw r0     // Catch:{ all -> 0x01c4 }
        L_0x01c4:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p9.p.g(i9.x):void");
    }

    public final h h() {
        return this.d;
    }
}
