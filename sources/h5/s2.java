package h5;

public final class s2<V> {

    /* renamed from: g  reason: collision with root package name */
    public static final Object f5679g = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final String f5680a;

    /* renamed from: b  reason: collision with root package name */
    public final r2<V> f5681b;

    /* renamed from: c  reason: collision with root package name */
    public final V f5682c;
    public final V d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f5683e = new Object();

    /* renamed from: f  reason: collision with root package name */
    public volatile V f5684f = null;

    public /* synthetic */ s2(String str, Object obj, Object obj2, r2 r2Var) {
        this.f5680a = str;
        this.f5682c = obj;
        this.d = obj2;
        this.f5681b = r2Var;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processHandlersOutBlocks(RegionMaker.java:1008)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:978)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0041 */
    public final V a(V r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f5683e
            monitor-enter(r0)
            monitor-exit(r0)     // Catch:{ all -> 0x006b }
            if (r4 == 0) goto L_0x0007
            return r4
        L_0x0007:
            q0.d r4 = s6.a.G
            if (r4 == 0) goto L_0x0068
            java.lang.Object r4 = f5679g
            monitor-enter(r4)
            boolean r0 = q0.d.b()     // Catch:{ all -> 0x0065 }
            if (r0 == 0) goto L_0x001f
            V r0 = r3.f5684f     // Catch:{ all -> 0x0065 }
            if (r0 != 0) goto L_0x001b
            V r0 = r3.f5682c     // Catch:{ all -> 0x0065 }
            goto L_0x001d
        L_0x001b:
            V r0 = r3.f5684f     // Catch:{ all -> 0x0065 }
        L_0x001d:
            monitor-exit(r4)     // Catch:{ all -> 0x0065 }
            return r0
        L_0x001f:
            monitor-exit(r4)     // Catch:{ all -> 0x0065 }
            java.util.List<h5.s2<?>> r4 = h5.u2.f5707a     // Catch:{ SecurityException -> 0x0053 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ SecurityException -> 0x0053 }
        L_0x0026:
            boolean r0 = r4.hasNext()     // Catch:{ SecurityException -> 0x0053 }
            if (r0 == 0) goto L_0x0053
            java.lang.Object r0 = r4.next()     // Catch:{ SecurityException -> 0x0053 }
            h5.s2 r0 = (h5.s2) r0     // Catch:{ SecurityException -> 0x0053 }
            boolean r1 = q0.d.b()     // Catch:{ SecurityException -> 0x0053 }
            if (r1 != 0) goto L_0x004b
            r1 = 0
            h5.r2<V> r2 = r0.f5681b     // Catch:{ IllegalStateException -> 0x0041 }
            if (r2 == 0) goto L_0x0041
            java.lang.Object r1 = r2.zza()     // Catch:{ IllegalStateException -> 0x0041 }
        L_0x0041:
            java.lang.Object r2 = f5679g     // Catch:{ SecurityException -> 0x0053 }
            monitor-enter(r2)     // Catch:{ SecurityException -> 0x0053 }
            r0.f5684f = r1     // Catch:{ all -> 0x0048 }
            monitor-exit(r2)     // Catch:{ all -> 0x0048 }
            goto L_0x0026
        L_0x0048:
            r4 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0048 }
            throw r4     // Catch:{ SecurityException -> 0x0053 }
        L_0x004b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch:{ SecurityException -> 0x0053 }
            java.lang.String r0 = "Refreshing flag cache must be done on a worker thread."
            r4.<init>(r0)     // Catch:{ SecurityException -> 0x0053 }
            throw r4     // Catch:{ SecurityException -> 0x0053 }
        L_0x0053:
            h5.r2<V> r4 = r3.f5681b
            if (r4 != 0) goto L_0x005a
            V r4 = r3.f5682c
            return r4
        L_0x005a:
            java.lang.Object r4 = r4.zza()     // Catch:{ SecurityException -> 0x0062, IllegalStateException -> 0x005f }
            return r4
        L_0x005f:
            V r4 = r3.f5682c
            return r4
        L_0x0062:
            V r4 = r3.f5682c
            return r4
        L_0x0065:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0065 }
            throw r0
        L_0x0068:
            V r4 = r3.f5682c
            return r4
        L_0x006b:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x006b }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: h5.s2.a(java.lang.Object):java.lang.Object");
    }
}
