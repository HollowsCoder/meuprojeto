package w7;

public final /* synthetic */ class c implements Runnable {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ d f9269o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ boolean f9270p;

    public /* synthetic */ c(d dVar, boolean z) {
        this.f9269o = dVar;
        this.f9270p = z;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final void run() {
        /*
            r8 = this;
            w7.d r0 = r8.f9269o
            boolean r1 = r8.f9270p
            r0.getClass()
            java.lang.Object r2 = w7.d.f9271m
            monitor-enter(r2)
            s6.c r3 = r0.f9273a     // Catch:{ all -> 0x0114 }
            r3.a()     // Catch:{ all -> 0x0114 }
            android.content.Context r3 = r3.f8815a     // Catch:{ all -> 0x0114 }
            androidx.appcompat.widget.m r3 = androidx.appcompat.widget.m.a(r3)     // Catch:{ all -> 0x0114 }
            y7.c r4 = r0.f9275c     // Catch:{ all -> 0x010d }
            y7.a r4 = r4.b()     // Catch:{ all -> 0x010d }
            if (r3 == 0) goto L_0x0020
            r3.l()     // Catch:{ all -> 0x0114 }
        L_0x0020:
            monitor-exit(r2)     // Catch:{ all -> 0x0114 }
            y7.c$a r3 = r4.f()     // Catch:{ f -> 0x0049 }
            y7.c$a r5 = y7.c.a.REGISTER_ERROR     // Catch:{ f -> 0x0049 }
            r6 = 1
            r7 = 0
            if (r3 != r5) goto L_0x002d
            r3 = r6
            goto L_0x002e
        L_0x002d:
            r3 = r7
        L_0x002e:
            if (r3 != 0) goto L_0x0051
            y7.c$a r3 = r4.f()     // Catch:{ f -> 0x0049 }
            y7.c$a r5 = y7.c.a.UNREGISTERED     // Catch:{ f -> 0x0049 }
            if (r3 != r5) goto L_0x003a
            r3 = r6
            goto L_0x003b
        L_0x003a:
            r3 = r7
        L_0x003b:
            if (r3 == 0) goto L_0x003e
            goto L_0x0051
        L_0x003e:
            if (r1 != 0) goto L_0x004c
            w7.l r1 = r0.d     // Catch:{ f -> 0x0049 }
            boolean r1 = r1.b(r4)     // Catch:{ f -> 0x0049 }
            if (r1 == 0) goto L_0x0109
            goto L_0x004c
        L_0x0049:
            r1 = move-exception
            goto L_0x00e9
        L_0x004c:
            y7.a r1 = r0.c(r4)     // Catch:{ f -> 0x0049 }
            goto L_0x0055
        L_0x0051:
            y7.a r1 = r0.f(r4)     // Catch:{ f -> 0x0049 }
        L_0x0055:
            monitor-enter(r2)
            s6.c r3 = r0.f9273a     // Catch:{ all -> 0x00e6 }
            r3.a()     // Catch:{ all -> 0x00e6 }
            android.content.Context r3 = r3.f8815a     // Catch:{ all -> 0x00e6 }
            androidx.appcompat.widget.m r3 = androidx.appcompat.widget.m.a(r3)     // Catch:{ all -> 0x00e6 }
            y7.c r5 = r0.f9275c     // Catch:{ all -> 0x00df }
            r5.a(r1)     // Catch:{ all -> 0x00df }
            if (r3 == 0) goto L_0x006b
            r3.l()     // Catch:{ all -> 0x00e6 }
        L_0x006b:
            monitor-exit(r2)     // Catch:{ all -> 0x00e6 }
            monitor-enter(r0)
            java.util.HashSet r2 = r0.f9282k     // Catch:{ all -> 0x00dc }
            int r2 = r2.size()     // Catch:{ all -> 0x00dc }
            if (r2 == 0) goto L_0x0095
            java.lang.String r2 = r4.f9604b     // Catch:{ all -> 0x00dc }
            java.lang.String r3 = r1.f9604b     // Catch:{ all -> 0x00dc }
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x00dc }
            if (r2 != 0) goto L_0x0095
            java.util.HashSet r2 = r0.f9282k     // Catch:{ all -> 0x00dc }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x00dc }
        L_0x0085:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x00dc }
            if (r3 == 0) goto L_0x0095
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x00dc }
            x7.a r3 = (x7.a) r3     // Catch:{ all -> 0x00dc }
            r3.a()     // Catch:{ all -> 0x00dc }
            goto L_0x0085
        L_0x0095:
            monitor-exit(r0)
            y7.c$a r2 = r1.f()
            y7.c$a r3 = y7.c.a.REGISTERED
            if (r2 != r3) goto L_0x00a0
            r2 = r6
            goto L_0x00a1
        L_0x00a0:
            r2 = r7
        L_0x00a1:
            if (r2 == 0) goto L_0x00ad
            java.lang.String r2 = r1.f9604b
            monitor-enter(r0)
            r0.f9281j = r2     // Catch:{ all -> 0x00aa }
            monitor-exit(r0)
            goto L_0x00ad
        L_0x00aa:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x00ad:
            y7.c$a r2 = r1.f()
            y7.c$a r3 = y7.c.a.REGISTER_ERROR
            if (r2 != r3) goto L_0x00b7
            r2 = r6
            goto L_0x00b8
        L_0x00b7:
            r2 = r7
        L_0x00b8:
            if (r2 == 0) goto L_0x00c2
            w7.f r1 = new w7.f
            w7.f$a r2 = w7.f.a.BAD_CONFIG
            r1.<init>()
            goto L_0x00e9
        L_0x00c2:
            y7.c$a r2 = y7.c.a.NOT_GENERATED
            y7.c$a r3 = r1.f9605c
            if (r3 == r2) goto L_0x00ce
            y7.c$a r2 = y7.c.a.ATTEMPT_MIGRATION
            if (r3 != r2) goto L_0x00cd
            goto L_0x00ce
        L_0x00cd:
            r6 = r7
        L_0x00ce:
            if (r6 == 0) goto L_0x00d8
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."
            r1.<init>(r2)
            goto L_0x00e9
        L_0x00d8:
            r0.g(r1)
            goto L_0x0109
        L_0x00dc:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x00df:
            r0 = move-exception
            if (r3 == 0) goto L_0x00e5
            r3.l()     // Catch:{ all -> 0x00e6 }
        L_0x00e5:
            throw r0     // Catch:{ all -> 0x00e6 }
        L_0x00e6:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00e6 }
            throw r0
        L_0x00e9:
            java.lang.Object r3 = r0.f9278g
            monitor-enter(r3)
            java.util.ArrayList r0 = r0.l     // Catch:{ all -> 0x010a }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x010a }
        L_0x00f2:
            boolean r2 = r0.hasNext()     // Catch:{ all -> 0x010a }
            if (r2 == 0) goto L_0x0108
            java.lang.Object r2 = r0.next()     // Catch:{ all -> 0x010a }
            w7.k r2 = (w7.k) r2     // Catch:{ all -> 0x010a }
            boolean r2 = r2.b(r1)     // Catch:{ all -> 0x010a }
            if (r2 == 0) goto L_0x00f2
            r0.remove()     // Catch:{ all -> 0x010a }
            goto L_0x00f2
        L_0x0108:
            monitor-exit(r3)     // Catch:{ all -> 0x010a }
        L_0x0109:
            return
        L_0x010a:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x010a }
            throw r0
        L_0x010d:
            r0 = move-exception
            if (r3 == 0) goto L_0x0113
            r3.l()     // Catch:{ all -> 0x0114 }
        L_0x0113:
            throw r0     // Catch:{ all -> 0x0114 }
        L_0x0114:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0114 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: w7.c.run():void");
    }
}
