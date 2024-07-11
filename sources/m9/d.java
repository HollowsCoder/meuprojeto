package m9;

import i9.a;
import i9.f0;
import i9.n;
import i9.r;
import java.io.IOException;
import m9.l;
import p9.b;
import p9.x;
import z8.g;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public l.a f7226a;

    /* renamed from: b  reason: collision with root package name */
    public l f7227b;

    /* renamed from: c  reason: collision with root package name */
    public int f7228c;
    public int d;

    /* renamed from: e  reason: collision with root package name */
    public int f7229e;

    /* renamed from: f  reason: collision with root package name */
    public f0 f7230f;

    /* renamed from: g  reason: collision with root package name */
    public final j f7231g;

    /* renamed from: h  reason: collision with root package name */
    public final a f7232h;

    /* renamed from: i  reason: collision with root package name */
    public final e f7233i;

    /* renamed from: j  reason: collision with root package name */
    public final n f7234j;

    public d(j jVar, a aVar, e eVar, n nVar) {
        g.f(jVar, "connectionPool");
        g.f(nVar, "eventListener");
        this.f7231g = jVar;
        this.f7232h = aVar;
        this.f7233i = eVar;
        this.f7234j = nVar;
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v41, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v31, resolved type: i9.f0} */
    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x0322  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x0321 A[SYNTHETIC] */
    public final m9.h a(int r15, int r16, int r17, boolean r18, boolean r19) {
        /*
            r14 = this;
            r1 = r14
        L_0x0001:
            m9.e r0 = r1.f7233i
            boolean r0 = r0.A
            if (r0 != 0) goto L_0x036d
            m9.e r0 = r1.f7233i
            m9.h r2 = r0.u
            r0 = 0
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0064
            monitor-enter(r2)
            boolean r5 = r2.f7259i     // Catch:{ all -> 0x0061 }
            if (r5 != 0) goto L_0x0024
            i9.f0 r5 = r2.f7266q     // Catch:{ all -> 0x0061 }
            i9.a r5 = r5.f6237a     // Catch:{ all -> 0x0061 }
            i9.r r5 = r5.f6152a     // Catch:{ all -> 0x0061 }
            boolean r5 = r14.b(r5)     // Catch:{ all -> 0x0061 }
            if (r5 != 0) goto L_0x0022
            goto L_0x0024
        L_0x0022:
            r5 = r4
            goto L_0x002a
        L_0x0024:
            m9.e r5 = r1.f7233i     // Catch:{ all -> 0x0061 }
            java.net.Socket r5 = r5.m()     // Catch:{ all -> 0x0061 }
        L_0x002a:
            n8.i r6 = n8.i.f7501a     // Catch:{ all -> 0x0061 }
            monitor-exit(r2)
            m9.e r6 = r1.f7233i
            m9.h r6 = r6.u
            if (r6 == 0) goto L_0x0046
            if (r5 != 0) goto L_0x0036
            r0 = r3
        L_0x0036:
            if (r0 == 0) goto L_0x003a
            goto L_0x02e7
        L_0x003a:
            java.lang.String r0 = "Check failed."
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            throw r2
        L_0x0046:
            if (r5 == 0) goto L_0x0054
            byte[] r2 = j9.c.f6602a
            r5.close()     // Catch:{ AssertionError -> 0x0051, RuntimeException -> 0x004e, Exception -> 0x0054 }
            goto L_0x0054
        L_0x004e:
            r0 = move-exception
            r2 = r0
            throw r2
        L_0x0051:
            r0 = move-exception
            r2 = r0
            throw r2
        L_0x0054:
            i9.n r2 = r1.f7234j
            m9.e r5 = r1.f7233i
            r2.getClass()
            java.lang.String r2 = "call"
            z8.g.f(r5, r2)
            goto L_0x0064
        L_0x0061:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x0064:
            r1.f7228c = r0
            r1.d = r0
            r1.f7229e = r0
            m9.j r2 = r1.f7231g
            i9.a r5 = r1.f7232h
            m9.e r6 = r1.f7233i
            boolean r2 = r2.a(r5, r6, r4, r0)
            if (r2 == 0) goto L_0x0078
            goto L_0x026d
        L_0x0078:
            i9.f0 r2 = r1.f7230f
            if (r2 == 0) goto L_0x007f
            r1.f7230f = r4
            goto L_0x00a3
        L_0x007f:
            m9.l$a r2 = r1.f7226a
            if (r2 == 0) goto L_0x00ac
            boolean r2 = r2.a()
            if (r2 == 0) goto L_0x00ac
            m9.l$a r0 = r1.f7226a
            z8.g.c(r0)
            boolean r2 = r0.a()
            if (r2 == 0) goto L_0x00a6
            int r2 = r0.f7281a
            int r5 = r2 + 1
            r0.f7281a = r5
            java.util.List<i9.f0> r0 = r0.f7282b
            java.lang.Object r0 = r0.get(r2)
            r2 = r0
            i9.f0 r2 = (i9.f0) r2
        L_0x00a3:
            r5 = r4
            goto L_0x0289
        L_0x00a6:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
        L_0x00ac:
            m9.l r2 = r1.f7227b
            if (r2 != 0) goto L_0x00c1
            m9.l r2 = new m9.l
            i9.a r5 = r1.f7232h
            m9.e r6 = r1.f7233i
            i9.v r7 = r6.D
            c1.r r7 = r7.N
            i9.n r8 = r1.f7234j
            r2.<init>(r5, r7, r6, r8)
            r1.f7227b = r2
        L_0x00c1:
            boolean r5 = r2.a()
            if (r5 == 0) goto L_0x0367
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
        L_0x00cc:
            int r6 = r2.f7275b
            java.util.List<? extends java.net.Proxy> r7 = r2.f7274a
            int r7 = r7.size()
            if (r6 >= r7) goto L_0x00d8
            r6 = r3
            goto L_0x00d9
        L_0x00d8:
            r6 = r0
        L_0x00d9:
            if (r6 == 0) goto L_0x0244
            int r6 = r2.f7275b
            java.util.List<? extends java.net.Proxy> r7 = r2.f7274a
            int r7 = r7.size()
            if (r6 >= r7) goto L_0x00e7
            r6 = r3
            goto L_0x00e8
        L_0x00e7:
            r6 = r0
        L_0x00e8:
            java.lang.String r7 = "No route to "
            i9.a r8 = r2.f7277e
            if (r6 == 0) goto L_0x0224
            java.util.List<? extends java.net.Proxy> r6 = r2.f7274a
            int r9 = r2.f7275b
            int r10 = r9 + 1
            r2.f7275b = r10
            java.lang.Object r6 = r6.get(r9)
            java.net.Proxy r6 = (java.net.Proxy) r6
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            r2.f7276c = r9
            java.net.Proxy$Type r10 = r6.type()
            java.net.Proxy$Type r11 = java.net.Proxy.Type.DIRECT
            if (r10 == r11) goto L_0x015a
            java.net.Proxy$Type r10 = r6.type()
            java.net.Proxy$Type r11 = java.net.Proxy.Type.SOCKS
            if (r10 != r11) goto L_0x0114
            goto L_0x015a
        L_0x0114:
            java.net.SocketAddress r10 = r6.address()
            boolean r11 = r10 instanceof java.net.InetSocketAddress
            if (r11 == 0) goto L_0x013e
            java.net.InetSocketAddress r10 = (java.net.InetSocketAddress) r10
            java.lang.String r11 = "$this$socketHost"
            z8.g.f(r10, r11)
            java.net.InetAddress r11 = r10.getAddress()
            if (r11 == 0) goto L_0x0130
            java.lang.String r11 = r11.getHostAddress()
            java.lang.String r12 = "address.hostAddress"
            goto L_0x0136
        L_0x0130:
            java.lang.String r11 = r10.getHostName()
            java.lang.String r12 = "hostName"
        L_0x0136:
            z8.g.e(r11, r12)
            int r10 = r10.getPort()
            goto L_0x0160
        L_0x013e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Proxy.address() is not an InetSocketAddress: "
            r0.<init>(r2)
            java.lang.Class r2 = r10.getClass()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            throw r2
        L_0x015a:
            i9.r r10 = r8.f6152a
            java.lang.String r11 = r10.f6306e
            int r10 = r10.f6307f
        L_0x0160:
            if (r3 > r10) goto L_0x0205
            r12 = 65535(0xffff, float:9.1834E-41)
            if (r12 < r10) goto L_0x0205
            java.net.Proxy$Type r7 = r6.type()
            java.net.Proxy$Type r12 = java.net.Proxy.Type.SOCKS
            if (r7 != r12) goto L_0x0177
            java.net.InetSocketAddress r7 = java.net.InetSocketAddress.createUnresolved(r11, r10)
            r9.add(r7)
            goto L_0x01ad
        L_0x0177:
            i9.n r7 = r2.f7280h
            r7.getClass()
            i9.e r7 = r2.f7279g
            java.lang.String r12 = "call"
            z8.g.f(r7, r12)
            java.lang.String r7 = "domainName"
            z8.g.f(r11, r7)
            i9.m r7 = r8.d
            java.util.List r7 = r7.d(r11)
            boolean r12 = r7.isEmpty()
            if (r12 != 0) goto L_0x01e9
            java.util.Iterator r7 = r7.iterator()
        L_0x0198:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x01ad
            java.lang.Object r8 = r7.next()
            java.net.InetAddress r8 = (java.net.InetAddress) r8
            java.net.InetSocketAddress r11 = new java.net.InetSocketAddress
            r11.<init>(r8, r10)
            r9.add(r11)
            goto L_0x0198
        L_0x01ad:
            java.util.List<? extends java.net.InetSocketAddress> r7 = r2.f7276c
            java.util.Iterator r7 = r7.iterator()
        L_0x01b3:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x01e1
            java.lang.Object r8 = r7.next()
            java.net.InetSocketAddress r8 = (java.net.InetSocketAddress) r8
            i9.f0 r9 = new i9.f0
            i9.a r10 = r2.f7277e
            r9.<init>(r10, r6, r8)
            c1.r r8 = r2.f7278f
            monitor-enter(r8)
            java.lang.Object r10 = r8.f2129o     // Catch:{ all -> 0x01de }
            java.util.Set r10 = (java.util.Set) r10     // Catch:{ all -> 0x01de }
            boolean r10 = r10.contains(r9)     // Catch:{ all -> 0x01de }
            monitor-exit(r8)
            if (r10 == 0) goto L_0x01da
            java.util.ArrayList r8 = r2.d
            r8.add(r9)
            goto L_0x01b3
        L_0x01da:
            r5.add(r9)
            goto L_0x01b3
        L_0x01de:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        L_0x01e1:
            boolean r6 = r5.isEmpty()
            r6 = r6 ^ r3
            if (r6 == 0) goto L_0x00cc
            goto L_0x0244
        L_0x01e9:
            java.net.UnknownHostException r0 = new java.net.UnknownHostException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            i9.m r3 = r8.d
            r2.append(r3)
            java.lang.String r3 = " returned no addresses for "
            r2.append(r3)
            r2.append(r11)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L_0x0205:
            java.net.SocketException r0 = new java.net.SocketException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r7)
            r2.append(r11)
            r3 = 58
            r2.append(r3)
            r2.append(r10)
            java.lang.String r3 = "; port is out of range"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L_0x0224:
            java.net.SocketException r0 = new java.net.SocketException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r7)
            i9.r r4 = r8.f6152a
            java.lang.String r4 = r4.f6306e
            r3.append(r4)
            java.lang.String r4 = "; exhausted proxy configurations: "
            r3.append(r4)
            java.util.List<? extends java.net.Proxy> r2 = r2.f7274a
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r0.<init>(r2)
            throw r0
        L_0x0244:
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto L_0x0254
            java.util.ArrayList r6 = r2.d
            o8.g.v(r6, r5)
            java.util.ArrayList r2 = r2.d
            r2.clear()
        L_0x0254:
            m9.l$a r2 = new m9.l$a
            r2.<init>(r5)
            r1.f7226a = r2
            m9.e r6 = r1.f7233i
            boolean r6 = r6.A
            if (r6 != 0) goto L_0x035f
            m9.j r6 = r1.f7231g
            i9.a r7 = r1.f7232h
            m9.e r8 = r1.f7233i
            boolean r0 = r6.a(r7, r8, r5, r0)
            if (r0 == 0) goto L_0x0276
        L_0x026d:
            m9.e r0 = r1.f7233i
            m9.h r0 = r0.u
            z8.g.c(r0)
        L_0x0274:
            r2 = r0
            goto L_0x02db
        L_0x0276:
            boolean r0 = r2.a()
            if (r0 == 0) goto L_0x0359
            int r0 = r2.f7281a
            int r6 = r0 + 1
            r2.f7281a = r6
            java.lang.Object r0 = r5.get(r0)
            r2 = r0
            i9.f0 r2 = (i9.f0) r2
        L_0x0289:
            m9.h r13 = new m9.h
            m9.j r0 = r1.f7231g
            r13.<init>(r0, r2)
            m9.e r0 = r1.f7233i
            r0.C = r13
            m9.e r11 = r1.f7233i     // Catch:{ all -> 0x0353 }
            i9.n r12 = r1.f7234j     // Catch:{ all -> 0x0353 }
            r6 = r13
            r7 = r15
            r8 = r16
            r9 = r17
            r10 = r18
            r6.c(r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x0353 }
            m9.e r0 = r1.f7233i
            r0.C = r4
            m9.e r0 = r1.f7233i
            i9.v r0 = r0.D
            c1.r r4 = r0.N
            i9.f0 r0 = r13.f7266q
            monitor-enter(r4)
            java.lang.String r6 = "route"
            z8.g.f(r0, r6)     // Catch:{ all -> 0x0350 }
            java.lang.Object r6 = r4.f2129o     // Catch:{ all -> 0x0350 }
            java.util.Set r6 = (java.util.Set) r6     // Catch:{ all -> 0x0350 }
            r6.remove(r0)     // Catch:{ all -> 0x0350 }
            monitor-exit(r4)
            m9.j r0 = r1.f7231g
            i9.a r4 = r1.f7232h
            m9.e r6 = r1.f7233i
            boolean r0 = r0.a(r4, r6, r5, r3)
            if (r0 == 0) goto L_0x02f0
            m9.e r0 = r1.f7233i
            m9.h r0 = r0.u
            z8.g.c(r0)
            r1.f7230f = r2
            java.net.Socket r2 = r13.f7254c
            z8.g.c(r2)
            r2.close()     // Catch:{ AssertionError -> 0x02ed, RuntimeException -> 0x02ea, Exception -> 0x0274 }
            goto L_0x0274
        L_0x02db:
            i9.n r0 = r1.f7234j
            m9.e r4 = r1.f7233i
            r0.getClass()
            java.lang.String r0 = "call"
            z8.g.f(r4, r0)
        L_0x02e7:
            r0 = r19
            goto L_0x031b
        L_0x02ea:
            r0 = move-exception
            r2 = r0
            throw r2
        L_0x02ed:
            r0 = move-exception
            r2 = r0
            throw r2
        L_0x02f0:
            monitor-enter(r13)
            m9.j r0 = r1.f7231g     // Catch:{ all -> 0x034d }
            r0.getClass()     // Catch:{ all -> 0x034d }
            byte[] r2 = j9.c.f6602a     // Catch:{ all -> 0x034d }
            java.util.concurrent.ConcurrentLinkedQueue<m9.h> r2 = r0.d     // Catch:{ all -> 0x034d }
            r2.add(r13)     // Catch:{ all -> 0x034d }
            l9.c r2 = r0.f7269b     // Catch:{ all -> 0x034d }
            m9.i r0 = r0.f7270c     // Catch:{ all -> 0x034d }
            r2.c(r0, 0)     // Catch:{ all -> 0x034d }
            m9.e r0 = r1.f7233i     // Catch:{ all -> 0x034d }
            r0.d(r13)     // Catch:{ all -> 0x034d }
            n8.i r0 = n8.i.f7501a     // Catch:{ all -> 0x034d }
            monitor-exit(r13)
            i9.n r0 = r1.f7234j
            m9.e r2 = r1.f7233i
            r0.getClass()
            java.lang.String r0 = "call"
            z8.g.f(r2, r0)
            r0 = r19
            r2 = r13
        L_0x031b:
            boolean r4 = r2.i(r0)
            if (r4 == 0) goto L_0x0322
            return r2
        L_0x0322:
            r2.k()
            i9.f0 r2 = r1.f7230f
            if (r2 == 0) goto L_0x032b
            goto L_0x0001
        L_0x032b:
            m9.l$a r2 = r1.f7226a
            if (r2 == 0) goto L_0x0334
            boolean r2 = r2.a()
            goto L_0x0335
        L_0x0334:
            r2 = r3
        L_0x0335:
            if (r2 == 0) goto L_0x0339
            goto L_0x0001
        L_0x0339:
            m9.l r2 = r1.f7227b
            if (r2 == 0) goto L_0x0341
            boolean r3 = r2.a()
        L_0x0341:
            if (r3 == 0) goto L_0x0345
            goto L_0x0001
        L_0x0345:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r2 = "exhausted all routes"
            r0.<init>(r2)
            throw r0
        L_0x034d:
            r0 = move-exception
            monitor-exit(r13)
            throw r0
        L_0x0350:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x0353:
            r0 = move-exception
            m9.e r2 = r1.f7233i
            r2.C = r4
            throw r0
        L_0x0359:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
        L_0x035f:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r2 = "Canceled"
            r0.<init>(r2)
            throw r0
        L_0x0367:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
        L_0x036d:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r2 = "Canceled"
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: m9.d.a(int, int, int, boolean, boolean):m9.h");
    }

    public final boolean b(r rVar) {
        g.f(rVar, "url");
        r rVar2 = this.f7232h.f6152a;
        if (rVar.f6307f != rVar2.f6307f || !g.a(rVar.f6306e, rVar2.f6306e)) {
            return false;
        }
        return true;
    }

    public final void c(IOException iOException) {
        g.f(iOException, "e");
        this.f7230f = null;
        if ((iOException instanceof x) && ((x) iOException).f8123o == b.REFUSED_STREAM) {
            this.f7228c++;
        } else if (iOException instanceof p9.a) {
            this.d++;
        } else {
            this.f7229e++;
        }
    }
}
