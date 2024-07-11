package i9;

import java.util.ArrayDeque;
import java.util.concurrent.ThreadPoolExecutor;
import m9.e;
import n8.i;
import z8.g;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public ThreadPoolExecutor f6282a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayDeque<e.a> f6283b = new ArrayDeque<>();

    /* renamed from: c  reason: collision with root package name */
    public final ArrayDeque<e.a> f6284c = new ArrayDeque<>();
    public final ArrayDeque<e> d = new ArrayDeque<>();

    public final void a(ArrayDeque arrayDeque, Object obj) {
        synchronized (this) {
            if (arrayDeque.remove(obj)) {
                i iVar = i.f7501a;
            } else {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        c();
    }

    public final void b(e.a aVar) {
        g.f(aVar, "call");
        aVar.f7244o.decrementAndGet();
        a(this.f6284c, aVar);
    }

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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final void c() {
        /*
            r14 = this;
            byte[] r0 = j9.c.f6602a
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            monitor-enter(r14)
            java.util.ArrayDeque<m9.e$a> r1 = r14.f6283b     // Catch:{ all -> 0x00e1 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x00e1 }
            java.lang.String r2 = "readyAsyncCalls.iterator()"
            z8.g.e(r1, r2)     // Catch:{ all -> 0x00e1 }
        L_0x0013:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x00e1 }
            if (r2 == 0) goto L_0x0045
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x00e1 }
            m9.e$a r2 = (m9.e.a) r2     // Catch:{ all -> 0x00e1 }
            java.util.ArrayDeque<m9.e$a> r3 = r14.f6284c     // Catch:{ all -> 0x00e1 }
            int r3 = r3.size()     // Catch:{ all -> 0x00e1 }
            r4 = 64
            if (r3 < r4) goto L_0x002a
            goto L_0x0045
        L_0x002a:
            java.util.concurrent.atomic.AtomicInteger r3 = r2.f7244o     // Catch:{ all -> 0x00e1 }
            int r3 = r3.get()     // Catch:{ all -> 0x00e1 }
            r4 = 5
            if (r3 < r4) goto L_0x0034
            goto L_0x0013
        L_0x0034:
            r1.remove()     // Catch:{ all -> 0x00e1 }
            java.util.concurrent.atomic.AtomicInteger r3 = r2.f7244o     // Catch:{ all -> 0x00e1 }
            r3.incrementAndGet()     // Catch:{ all -> 0x00e1 }
            r0.add(r2)     // Catch:{ all -> 0x00e1 }
            java.util.ArrayDeque<m9.e$a> r3 = r14.f6284c     // Catch:{ all -> 0x00e1 }
            r3.add(r2)     // Catch:{ all -> 0x00e1 }
            goto L_0x0013
        L_0x0045:
            monitor-enter(r14)     // Catch:{ all -> 0x00e1 }
            java.util.ArrayDeque<m9.e$a> r1 = r14.f6284c     // Catch:{ all -> 0x00de }
            int r1 = r1.size()     // Catch:{ all -> 0x00de }
            java.util.ArrayDeque<m9.e> r2 = r14.d     // Catch:{ all -> 0x00de }
            int r2 = r2.size()     // Catch:{ all -> 0x00de }
            int r1 = r1 + r2
            monitor-exit(r14)     // Catch:{ all -> 0x00e1 }
            n8.i r1 = n8.i.f7501a     // Catch:{ all -> 0x00e1 }
            monitor-exit(r14)
            int r1 = r0.size()
            r2 = 0
            r3 = r2
        L_0x005d:
            if (r3 >= r1) goto L_0x00dd
            java.lang.Object r4 = r0.get(r3)
            m9.e$a r4 = (m9.e.a) r4
            monitor-enter(r14)
            java.util.concurrent.ThreadPoolExecutor r5 = r14.f6282a     // Catch:{ all -> 0x00da }
            if (r5 != 0) goto L_0x009c
            java.util.concurrent.ThreadPoolExecutor r5 = new java.util.concurrent.ThreadPoolExecutor     // Catch:{ all -> 0x00da }
            r7 = 0
            r8 = 2147483647(0x7fffffff, float:NaN)
            r9 = 60
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x00da }
            java.util.concurrent.SynchronousQueue r12 = new java.util.concurrent.SynchronousQueue     // Catch:{ all -> 0x00da }
            r12.<init>()     // Catch:{ all -> 0x00da }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x00da }
            r6.<init>()     // Catch:{ all -> 0x00da }
            java.lang.String r13 = j9.c.f6607g     // Catch:{ all -> 0x00da }
            r6.append(r13)     // Catch:{ all -> 0x00da }
            java.lang.String r13 = " Dispatcher"
            r6.append(r13)     // Catch:{ all -> 0x00da }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x00da }
            java.lang.String r13 = "name"
            z8.g.f(r6, r13)     // Catch:{ all -> 0x00da }
            j9.b r13 = new j9.b     // Catch:{ all -> 0x00da }
            r13.<init>(r6, r2)     // Catch:{ all -> 0x00da }
            r6 = r5
            r6.<init>(r7, r8, r9, r11, r12, r13)     // Catch:{ all -> 0x00da }
            r14.f6282a = r5     // Catch:{ all -> 0x00da }
        L_0x009c:
            java.util.concurrent.ThreadPoolExecutor r5 = r14.f6282a     // Catch:{ all -> 0x00da }
            z8.g.c(r5)     // Catch:{ all -> 0x00da }
            monitor-exit(r14)
            r4.getClass()
            m9.e r6 = m9.e.this
            i9.v r7 = r6.D
            i9.l r7 = r7.f6338o
            byte[] r7 = j9.c.f6602a
            r5.execute(r4)     // Catch:{ RejectedExecutionException -> 0x00b3 }
            goto L_0x00cf
        L_0x00b1:
            r0 = move-exception
            goto L_0x00d2
        L_0x00b3:
            r5 = move-exception
            java.io.InterruptedIOException r7 = new java.io.InterruptedIOException     // Catch:{ all -> 0x00b1 }
            java.lang.String r8 = "executor rejected"
            r7.<init>(r8)     // Catch:{ all -> 0x00b1 }
            r7.initCause(r5)     // Catch:{ all -> 0x00b1 }
            r6.l(r7)     // Catch:{ all -> 0x00b1 }
            i9.f r5 = r4.f7245p     // Catch:{ all -> 0x00b1 }
            y9.t$a r5 = (y9.t.a) r5     // Catch:{ all -> 0x00b1 }
            r5.a(r7)     // Catch:{ all -> 0x00b1 }
            i9.v r5 = r6.D
            i9.l r5 = r5.f6338o
            r5.b(r4)
        L_0x00cf:
            int r3 = r3 + 1
            goto L_0x005d
        L_0x00d2:
            i9.v r1 = r6.D
            i9.l r1 = r1.f6338o
            r1.b(r4)
            throw r0
        L_0x00da:
            r0 = move-exception
            monitor-exit(r14)
            throw r0
        L_0x00dd:
            return
        L_0x00de:
            r0 = move-exception
            monitor-exit(r14)     // Catch:{ all -> 0x00e1 }
            throw r0     // Catch:{ all -> 0x00e1 }
        L_0x00e1:
            r0 = move-exception
            monitor-exit(r14)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i9.l.c():void");
    }
}
