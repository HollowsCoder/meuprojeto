package com.google.android.gms.internal.clearcut;

public final /* synthetic */ class f implements j {

    /* renamed from: o  reason: collision with root package name */
    public final String f2415o;

    public f(String str) {
        this.f2415o = str;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final java.lang.Object e() {
        /*
            r8 = this;
            android.content.Context r0 = com.google.android.gms.internal.clearcut.e.f2402h
            android.content.ContentResolver r0 = r0.getContentResolver()
            android.net.Uri r1 = com.google.android.gms.internal.clearcut.k4.f2477a
            java.lang.Class<com.google.android.gms.internal.clearcut.k4> r1 = com.google.android.gms.internal.clearcut.k4.class
            monitor-enter(r1)
            com.google.android.gms.internal.clearcut.k4.b(r0)     // Catch:{ all -> 0x00a2 }
            java.lang.Object r2 = com.google.android.gms.internal.clearcut.k4.f2486k     // Catch:{ all -> 0x00a2 }
            monitor-exit(r1)     // Catch:{ all -> 0x00a2 }
            java.util.HashMap<java.lang.String, java.lang.Boolean> r1 = com.google.android.gms.internal.clearcut.k4.f2482g
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            java.lang.String r4 = r8.f2415o
            java.lang.Class<com.google.android.gms.internal.clearcut.k4> r5 = com.google.android.gms.internal.clearcut.k4.class
            monitor-enter(r5)
            boolean r6 = r1.containsKey(r4)     // Catch:{ all -> 0x009f }
            if (r6 == 0) goto L_0x002a
            java.lang.Object r6 = r1.get(r4)     // Catch:{ all -> 0x009f }
            if (r6 == 0) goto L_0x0027
            goto L_0x0028
        L_0x0027:
            r6 = r3
        L_0x0028:
            monitor-exit(r5)     // Catch:{ all -> 0x009f }
            goto L_0x002c
        L_0x002a:
            monitor-exit(r5)     // Catch:{ all -> 0x009f }
            r6 = 0
        L_0x002c:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            if (r6 == 0) goto L_0x0035
            boolean r0 = r6.booleanValue()
            goto L_0x0097
        L_0x0035:
            java.lang.String r0 = com.google.android.gms.internal.clearcut.k4.a(r0, r4)
            if (r0 == 0) goto L_0x0081
            java.lang.String r5 = ""
            boolean r5 = r0.equals(r5)
            if (r5 == 0) goto L_0x0044
            goto L_0x0081
        L_0x0044:
            java.util.regex.Pattern r5 = com.google.android.gms.internal.clearcut.k4.f2479c
            java.util.regex.Matcher r5 = r5.matcher(r0)
            boolean r5 = r5.matches()
            if (r5 == 0) goto L_0x0054
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r3 = 1
            goto L_0x0086
        L_0x0054:
            java.util.regex.Pattern r5 = com.google.android.gms.internal.clearcut.k4.d
            java.util.regex.Matcher r5 = r5.matcher(r0)
            boolean r5 = r5.matches()
            if (r5 == 0) goto L_0x0061
            goto L_0x0082
        L_0x0061:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "attempt to read gservices key "
            r3.<init>(r5)
            r3.append(r4)
            java.lang.String r5 = " (value \""
            r3.append(r5)
            r3.append(r0)
            java.lang.String r0 = "\") as boolean"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            java.lang.String r3 = "Gservices"
            android.util.Log.w(r3, r0)
        L_0x0081:
            r3 = r6
        L_0x0082:
            r0 = 0
            r7 = r3
            r3 = r0
            r0 = r7
        L_0x0086:
            java.lang.Class<com.google.android.gms.internal.clearcut.k4> r6 = com.google.android.gms.internal.clearcut.k4.class
            monitor-enter(r6)
            java.lang.Object r5 = com.google.android.gms.internal.clearcut.k4.f2486k     // Catch:{ all -> 0x009c }
            if (r2 != r5) goto L_0x0095
            r1.put(r4, r0)     // Catch:{ all -> 0x009c }
            java.util.HashMap<java.lang.String, java.lang.String> r0 = com.google.android.gms.internal.clearcut.k4.f2481f     // Catch:{ all -> 0x009c }
            r0.remove(r4)     // Catch:{ all -> 0x009c }
        L_0x0095:
            monitor-exit(r6)     // Catch:{ all -> 0x009c }
            r0 = r3
        L_0x0097:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L_0x009c:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x009c }
            throw r0
        L_0x009f:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x009f }
            throw r0
        L_0x00a2:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00a2 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.f.e():java.lang.Object");
    }
}
