package androidx.appcompat.widget;

public final /* synthetic */ class f1 implements Runnable {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ int f567o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ Object f568p;

    public /* synthetic */ f1(int i10, Object obj) {
        this.f567o = i10;
        this.f568p = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r2 = r0.d();
        r3 = r2.f4581e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001f, code lost:
        if (r3 != 2) goto L_0x0029;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0021, code lost:
        r4 = r0.d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0023, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0029, code lost:
        if (r3 != 0) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r3 = e0.d.f4446a;
        android.os.Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
        r1 = r0.f1079c;
        r3 = r0.f1077a;
        r1.getClass();
        r1 = b0.e.f1935a.b(r3, new f0.l[]{r2}, 0);
        r2 = b0.m.e(r0.f1077a, r2.f4578a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004d, code lost:
        if (r2 == null) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004f, code lost:
        if (r1 == null) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        android.os.Trace.beginSection("EmojiCompat.MetadataRepo.create");
        r3 = new androidx.emoji2.text.m(r1, androidx.emoji2.text.l.a(r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        android.os.Trace.endSection();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        android.os.Trace.endSection();
        r1 = r0.d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0067, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        r2 = r0.f1083h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x006a, code lost:
        if (r2 == null) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x006c, code lost:
        r2.b(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x006f, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        r0.b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0077, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        r2 = e0.d.f4446a;
        android.os.Trace.endSection();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x007d, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0085, code lost:
        throw new java.lang.RuntimeException("Unable to open file.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0086, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:?, code lost:
        r2 = e0.d.f4446a;
        android.os.Trace.endSection();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x008c, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00a3, code lost:
        throw new java.lang.RuntimeException("fetchFonts result is not OK. (" + r3 + ")");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00a4, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00a7, code lost:
        monitor-enter(r0.d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:?, code lost:
        r2 = r0.f1083h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00aa, code lost:
        if (r2 != null) goto L_0x00ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00ac, code lost:
        r2.a(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00b0, code lost:
        r0.b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r6 = this;
            int r0 = r6.f567o
            switch(r0) {
                case 0: goto L_0x00ba;
                case 1: goto L_0x0007;
                default: goto L_0x0005;
            }
        L_0x0005:
            goto L_0x00c2
        L_0x0007:
            java.lang.Object r0 = r6.f568p
            androidx.emoji2.text.k$b r0 = (androidx.emoji2.text.k.b) r0
            java.lang.String r1 = "fetchFonts result is not OK. ("
            java.lang.Object r2 = r0.d
            monitor-enter(r2)
            androidx.emoji2.text.e$h r3 = r0.f1083h     // Catch:{ all -> 0x00b7 }
            if (r3 != 0) goto L_0x0017
            monitor-exit(r2)     // Catch:{ all -> 0x00b7 }
            goto L_0x00b3
        L_0x0017:
            monitor-exit(r2)     // Catch:{ all -> 0x00b7 }
            f0.l r2 = r0.d()     // Catch:{ all -> 0x00a4 }
            int r3 = r2.f4581e     // Catch:{ all -> 0x00a4 }
            r4 = 2
            if (r3 != r4) goto L_0x0029
            java.lang.Object r4 = r0.d     // Catch:{ all -> 0x00a4 }
            monitor-enter(r4)     // Catch:{ all -> 0x00a4 }
            monitor-exit(r4)     // Catch:{ all -> 0x0026 }
            goto L_0x0029
        L_0x0026:
            r1 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0026 }
            throw r1     // Catch:{ all -> 0x00a4 }
        L_0x0029:
            if (r3 != 0) goto L_0x008d
            java.lang.String r1 = "EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface"
            int r3 = e0.d.f4446a     // Catch:{ all -> 0x0086 }
            android.os.Trace.beginSection(r1)     // Catch:{ all -> 0x0086 }
            androidx.emoji2.text.k$a r1 = r0.f1079c     // Catch:{ all -> 0x0086 }
            android.content.Context r3 = r0.f1077a     // Catch:{ all -> 0x0086 }
            r1.getClass()     // Catch:{ all -> 0x0086 }
            r1 = 1
            f0.l[] r1 = new f0.l[r1]     // Catch:{ all -> 0x0086 }
            r4 = 0
            r1[r4] = r2     // Catch:{ all -> 0x0086 }
            b0.l r5 = b0.e.f1935a     // Catch:{ all -> 0x0086 }
            android.graphics.Typeface r1 = r5.b(r3, r1, r4)     // Catch:{ all -> 0x0086 }
            android.content.Context r3 = r0.f1077a     // Catch:{ all -> 0x0086 }
            android.net.Uri r2 = r2.f4578a     // Catch:{ all -> 0x0086 }
            java.nio.MappedByteBuffer r2 = b0.m.e(r3, r2)     // Catch:{ all -> 0x0086 }
            if (r2 == 0) goto L_0x007e
            if (r1 == 0) goto L_0x007e
            java.lang.String r3 = "EmojiCompat.MetadataRepo.create"
            android.os.Trace.beginSection(r3)     // Catch:{ all -> 0x0077 }
            androidx.emoji2.text.m r3 = new androidx.emoji2.text.m     // Catch:{ all -> 0x0077 }
            q0.b r2 = androidx.emoji2.text.l.a(r2)     // Catch:{ all -> 0x0077 }
            r3.<init>(r1, r2)     // Catch:{ all -> 0x0077 }
            android.os.Trace.endSection()     // Catch:{ all -> 0x0086 }
            android.os.Trace.endSection()     // Catch:{ all -> 0x00a4 }
            java.lang.Object r1 = r0.d     // Catch:{ all -> 0x00a4 }
            monitor-enter(r1)     // Catch:{ all -> 0x00a4 }
            androidx.emoji2.text.e$h r2 = r0.f1083h     // Catch:{ all -> 0x0074 }
            if (r2 == 0) goto L_0x006f
            r2.b(r3)     // Catch:{ all -> 0x0074 }
        L_0x006f:
            monitor-exit(r1)     // Catch:{ all -> 0x0074 }
            r0.b()     // Catch:{ all -> 0x00a4 }
            goto L_0x00b3
        L_0x0074:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0074 }
            throw r2     // Catch:{ all -> 0x00a4 }
        L_0x0077:
            r1 = move-exception
            int r2 = e0.d.f4446a     // Catch:{ all -> 0x0086 }
            android.os.Trace.endSection()     // Catch:{ all -> 0x0086 }
            throw r1     // Catch:{ all -> 0x0086 }
        L_0x007e:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ all -> 0x0086 }
            java.lang.String r2 = "Unable to open file."
            r1.<init>(r2)     // Catch:{ all -> 0x0086 }
            throw r1     // Catch:{ all -> 0x0086 }
        L_0x0086:
            r1 = move-exception
            int r2 = e0.d.f4446a     // Catch:{ all -> 0x00a4 }
            android.os.Trace.endSection()     // Catch:{ all -> 0x00a4 }
            throw r1     // Catch:{ all -> 0x00a4 }
        L_0x008d:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch:{ all -> 0x00a4 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a4 }
            r4.<init>(r1)     // Catch:{ all -> 0x00a4 }
            r4.append(r3)     // Catch:{ all -> 0x00a4 }
            java.lang.String r1 = ")"
            r4.append(r1)     // Catch:{ all -> 0x00a4 }
            java.lang.String r1 = r4.toString()     // Catch:{ all -> 0x00a4 }
            r2.<init>(r1)     // Catch:{ all -> 0x00a4 }
            throw r2     // Catch:{ all -> 0x00a4 }
        L_0x00a4:
            r1 = move-exception
            java.lang.Object r3 = r0.d
            monitor-enter(r3)
            androidx.emoji2.text.e$h r2 = r0.f1083h     // Catch:{ all -> 0x00b4 }
            if (r2 == 0) goto L_0x00af
            r2.a(r1)     // Catch:{ all -> 0x00b4 }
        L_0x00af:
            monitor-exit(r3)     // Catch:{ all -> 0x00b4 }
            r0.b()
        L_0x00b3:
            return
        L_0x00b4:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00b4 }
            throw r0
        L_0x00b7:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00b7 }
            throw r0
        L_0x00ba:
            java.lang.Object r0 = r6.f568p
            androidx.appcompat.widget.Toolbar r0 = (androidx.appcompat.widget.Toolbar) r0
            r0.l()
            return
        L_0x00c2:
            java.lang.Object r0 = r6.f568p
            e2.d r0 = (e2.d) r0
            java.lang.String r1 = "this$0"
            z8.g.f(r0, r1)
            java.lang.Object r0 = r0.c()
            e2.e r0 = (e2.e) r0
            if (r0 == 0) goto L_0x00d6
            r0.j()
        L_0x00d6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.f1.run():void");
    }
}
