package i4;

public final /* synthetic */ class m implements Runnable {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ int f6089o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ Object f6090p;

    public /* synthetic */ m(int i10, Object obj) {
        this.f6089o = i10;
        this.f6090p = obj;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r8 = this;
            int r0 = r8.f6089o
            r1 = 0
            r2 = 1
            switch(r0) {
                case 0: goto L_0x006d;
                case 1: goto L_0x0009;
                default: goto L_0x0007;
            }
        L_0x0007:
            goto L_0x0080
        L_0x0009:
            java.lang.Object r0 = r8.f6090p
            com.google.firebase.messaging.FirebaseMessaging r0 = (com.google.firebase.messaging.FirebaseMessaging) r0
            android.content.Context r0 = r0.d
            android.content.Context r3 = r0.getApplicationContext()
            if (r3 == 0) goto L_0x0016
            goto L_0x0017
        L_0x0016:
            r3 = r0
        L_0x0017:
            java.lang.String r4 = "com.google.firebase.messaging"
            r5 = 0
            android.content.SharedPreferences r3 = r3.getSharedPreferences(r4, r5)
            java.lang.String r4 = "proxy_notification_initialized"
            boolean r3 = r3.getBoolean(r4, r5)
            if (r3 == 0) goto L_0x0027
            goto L_0x006c
        L_0x0027:
            java.lang.String r3 = "firebase_messaging_notification_delegation_enabled"
            android.content.Context r4 = r0.getApplicationContext()     // Catch:{ NameNotFoundException -> 0x0050 }
            android.content.pm.PackageManager r6 = r4.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0050 }
            if (r6 == 0) goto L_0x0050
            java.lang.String r4 = r4.getPackageName()     // Catch:{ NameNotFoundException -> 0x0050 }
            r7 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r4 = r6.getApplicationInfo(r4, r7)     // Catch:{ NameNotFoundException -> 0x0050 }
            if (r4 == 0) goto L_0x0050
            android.os.Bundle r6 = r4.metaData     // Catch:{ NameNotFoundException -> 0x0050 }
            if (r6 == 0) goto L_0x0050
            boolean r6 = r6.containsKey(r3)     // Catch:{ NameNotFoundException -> 0x0050 }
            if (r6 == 0) goto L_0x0050
            android.os.Bundle r4 = r4.metaData     // Catch:{ NameNotFoundException -> 0x0050 }
            boolean r3 = r4.getBoolean(r3)     // Catch:{ NameNotFoundException -> 0x0050 }
            goto L_0x0051
        L_0x0050:
            r3 = r2
        L_0x0051:
            int r4 = android.os.Build.VERSION.SDK_INT
            r6 = 29
            if (r4 < r6) goto L_0x0058
            goto L_0x0059
        L_0x0058:
            r2 = r5
        L_0x0059:
            if (r2 != 0) goto L_0x005f
            m5.l.e(r1)
            goto L_0x006c
        L_0x005f:
            m5.j r1 = new m5.j
            r1.<init>()
            b8.q r2 = new b8.q
            r2.<init>(r0, r3, r1)
            r2.run()
        L_0x006c:
            return
        L_0x006d:
            java.lang.Object r0 = r8.f6090p
            i4.p r0 = (i4.p) r0
            monitor-enter(r0)
            int r1 = r0.f6097a     // Catch:{ all -> 0x007d }
            if (r1 != r2) goto L_0x007b
            java.lang.String r1 = "Timed out while binding"
            r0.a(r1, r2)     // Catch:{ all -> 0x007d }
        L_0x007b:
            monitor-exit(r0)
            return
        L_0x007d:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x0080:
            java.lang.Object r0 = r8.f6090p
            b8.g0$a r0 = (b8.g0.a) r0
            android.content.Intent r2 = r0.f2020a
            java.lang.String r2 = r2.getAction()
            java.lang.String r3 = java.lang.String.valueOf(r2)
            int r3 = r3.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r3 = r3 + 61
            r4.<init>(r3)
            java.lang.String r3 = "Service took too long to process intent: "
            r4.append(r3)
            r4.append(r2)
            java.lang.String r2 = " App may get closed."
            r4.append(r2)
            java.lang.String r2 = "FirebaseMessaging"
            java.lang.String r3 = r4.toString()
            android.util.Log.w(r2, r3)
            m5.j<java.lang.Void> r0 = r0.f2021b
            r0.c(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i4.m.run():void");
    }
}
