package z6;

import com.google.firebase.crashlytics.CrashlyticsRegistrar;
import y6.e;

public final /* synthetic */ class c implements e {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ CrashlyticsRegistrar f9936o;

    public /* synthetic */ c(CrashlyticsRegistrar crashlyticsRegistrar) {
        this.f9936o = crashlyticsRegistrar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:115:0x0473  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x02b1  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x02c1  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x031f A[SYNTHETIC, Splitter:B:69:0x031f] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0410 A[Catch:{ Exception -> 0x045b }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object j(y6.s r43) {
        /*
            r42 = this;
            r1 = r42
            r0 = r43
            com.google.firebase.crashlytics.CrashlyticsRegistrar r2 = r1.f9936o
            r2.getClass()
            java.lang.Class<s6.c> r2 = s6.c.class
            java.lang.Object r2 = r0.a(r2)
            s6.c r2 = (s6.c) r2
            java.lang.Class<a7.a> r3 = a7.a.class
            v7.a r3 = r0.j(r3)
            java.lang.Class<w6.a> r4 = w6.a.class
            v7.a r4 = r0.j(r4)
            java.lang.Class<w7.e> r5 = w7.e.class
            java.lang.Object r0 = r0.a(r5)
            w7.e r0 = (w7.e) r0
            r2.a()
            android.content.Context r12 = r2.f8815a
            java.lang.String r5 = r12.getPackageName()
            s6.a r13 = s6.a.f8805s
            java.lang.String r6 = "Initializing Firebase Crashlytics 18.2.5 for "
            java.lang.String r6 = androidx.appcompat.widget.x0.e(r6, r5)
            r7 = 4
            boolean r8 = r13.j(r7)
            java.lang.String r14 = "FirebaseCrashlytics"
            r15 = 0
            if (r8 == 0) goto L_0x0043
            android.util.Log.i(r14, r6, r15)
        L_0x0043:
            i7.e r11 = new i7.e
            r11.<init>(r12)
            d7.c0 r10 = new d7.c0
            r10.<init>(r2)
            d7.h0 r9 = new d7.h0
            r9.<init>(r12, r5, r0, r10)
            a7.b r6 = new a7.b
            r6.<init>(r3)
            z6.a r0 = new z6.a
            r0.<init>(r4)
            java.lang.String r3 = "Crashlytics Exception Handler"
            java.util.concurrent.ExecutorService r16 = d7.g0.a(r3)
            d7.x r8 = new d7.x
            e2.a r5 = new e2.a
            r5.<init>(r7, r0)
            d2.b r7 = new d2.b
            r3 = 8
            r7.<init>(r3, r0)
            r3 = r8
            r4 = r2
            r0 = r5
            r5 = r9
            r17 = r7
            r7 = r10
            r26 = r8
            r8 = r0
            r0 = r9
            r9 = r17
            r27 = r10
            r10 = r11
            r28 = r11
            r11 = r16
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            r2.a()
            s6.e r2 = r2.f8817c
            java.lang.String r2 = r2.f8827b
            java.lang.String r5 = d7.e.e(r12)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Mapping file ID is: "
            r3.<init>(r4)
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            r13.t(r3)
            java.lang.String r3 = "com.google.firebase.crashlytics.unity_version"
            java.lang.String r11 = "string"
            int r3 = d7.e.f(r12, r3, r11)
            r10 = 2
            if (r3 == 0) goto L_0x00cc
            android.content.res.Resources r4 = r12.getResources()
            java.lang.String r3 = r4.getString(r3)
            java.lang.String r4 = "Unity Editor version is: "
            java.lang.String r4 = androidx.appcompat.widget.x0.e(r4, r3)
            boolean r6 = android.util.Log.isLoggable(r14, r10)
            if (r6 == 0) goto L_0x00c5
            android.util.Log.v(r14, r4, r15)
        L_0x00c5:
            java.lang.String r4 = "Unity"
            r17 = r3
            r16 = r4
            goto L_0x00d0
        L_0x00cc:
            r16 = r15
            r17 = r16
        L_0x00d0:
            java.lang.String r7 = r12.getPackageName()     // Catch:{ NameNotFoundException -> 0x047f }
            java.lang.String r9 = r0.d()     // Catch:{ NameNotFoundException -> 0x047f }
            android.content.pm.PackageManager r3 = r12.getPackageManager()     // Catch:{ NameNotFoundException -> 0x047f }
            r4 = 0
            android.content.pm.PackageInfo r3 = r3.getPackageInfo(r7, r4)     // Catch:{ NameNotFoundException -> 0x047f }
            int r4 = r3.versionCode     // Catch:{ NameNotFoundException -> 0x047f }
            java.lang.String r24 = java.lang.Integer.toString(r4)     // Catch:{ NameNotFoundException -> 0x047f }
            java.lang.String r3 = r3.versionName     // Catch:{ NameNotFoundException -> 0x047f }
            if (r3 != 0) goto L_0x00ed
            java.lang.String r3 = "0.0"
        L_0x00ed:
            r23 = r3
            d7.a r15 = new d7.a     // Catch:{ NameNotFoundException -> 0x047f }
            r3 = r15
            r4 = r2
            r6 = r9
            r8 = r24
            r1 = r9
            r9 = r23
            r43 = r15
            r15 = r10
            r10 = r16
            r41 = r11
            r11 = r17
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch:{ NameNotFoundException -> 0x047c }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Installer package name is: "
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r13.L(r1)
            java.lang.String r1 = "com.google.firebase.crashlytics.startup"
            java.util.concurrent.ExecutorService r1 = d7.g0.a(r1)
            n.e r3 = new n.e
            r4 = 10
            r3.<init>(r4)
            java.lang.String r4 = r0.d()
            q0.d r8 = new q0.d
            r5 = 12
            r8.<init>((int) r5)
            q1.d r9 = new q1.d
            r5 = 6
            r9.<init>(r5, r8)
            androidx.lifecycle.r r10 = new androidx.lifecycle.r
            r5 = r28
            r10.<init>((i7.e) r5)
            java.util.Locale r5 = java.util.Locale.US
            r13 = 1
            java.lang.Object[] r6 = new java.lang.Object[r13]
            r7 = 0
            r6[r7] = r2
            java.lang.String r7 = "https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/%s/settings"
            java.lang.String r6 = java.lang.String.format(r5, r7, r6)
            androidx.fragment.app.f0 r11 = new androidx.fragment.app.f0
            r11.<init>(r6, r3)
            java.lang.Object[] r3 = new java.lang.Object[r15]
            java.lang.String r6 = android.os.Build.MANUFACTURER
            java.lang.String r7 = d7.h0.f4232h
            java.lang.String r15 = ""
            java.lang.String r6 = r6.replaceAll(r7, r15)
            r15 = 0
            r3[r15] = r6
            java.lang.String r6 = android.os.Build.MODEL
            java.lang.String r15 = ""
            java.lang.String r6 = r6.replaceAll(r7, r15)
            r3[r13] = r6
            java.lang.String r6 = "%s/%s"
            java.lang.String r18 = java.lang.String.format(r5, r6, r3)
            java.lang.String r3 = android.os.Build.VERSION.INCREMENTAL
            java.lang.String r5 = ""
            java.lang.String r19 = r3.replaceAll(r7, r5)
            java.lang.String r3 = android.os.Build.VERSION.RELEASE
            java.lang.String r5 = ""
            java.lang.String r20 = r3.replaceAll(r7, r5)
            r3 = 4
            java.lang.String[] r5 = new java.lang.String[r3]
            java.lang.String r6 = d7.e.e(r12)
            r7 = 0
            r5[r7] = r6
            r5[r13] = r2
            r6 = 2
            r5[r6] = r23
            r6 = 3
            r5[r6] = r24
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
        L_0x0194:
            java.lang.String r15 = ""
            if (r7 >= r3) goto L_0x01b0
            r3 = r5[r7]
            if (r3 == 0) goto L_0x01ab
            java.lang.String r13 = "-"
            java.lang.String r3 = r3.replace(r13, r15)
            java.util.Locale r13 = java.util.Locale.US
            java.lang.String r3 = r3.toLowerCase(r13)
            r6.add(r3)
        L_0x01ab:
            int r7 = r7 + 1
            r3 = 4
            r13 = 1
            goto L_0x0194
        L_0x01b0:
            java.util.Collections.sort(r6)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.util.Iterator r5 = r6.iterator()
        L_0x01bc:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x01cc
            java.lang.Object r6 = r5.next()
            java.lang.String r6 = (java.lang.String) r6
            r3.append(r6)
            goto L_0x01bc
        L_0x01cc:
            java.lang.String r3 = r3.toString()
            int r5 = r3.length()
            if (r5 <= 0) goto L_0x01db
            java.lang.String r3 = d7.e.k(r3)
            goto L_0x01dc
        L_0x01db:
            r3 = 0
        L_0x01dc:
            r22 = r3
            d7.d0 r3 = d7.d0.determineFrom(r4)
            int r25 = r3.getId()
            l7.f r7 = new l7.f
            r16 = r7
            r17 = r2
            r21 = r0
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25)
            k7.c r2 = new k7.c
            r5 = r2
            r6 = r12
            r12 = r27
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            k7.a r0 = k7.a.USE_CACHE
            android.content.Context r3 = r2.f6712a
            java.lang.String r4 = "com.google.firebase.crashlytics"
            r5 = 0
            android.content.SharedPreferences r3 = r3.getSharedPreferences(r4, r5)
            java.lang.String r4 = "existing_instance_identifier"
            java.lang.String r3 = r3.getString(r4, r15)
            l7.f r4 = r2.f6713b
            java.lang.String r4 = r4.f6982f
            boolean r3 = r3.equals(r4)
            r4 = 1
            r3 = r3 ^ r4
            java.util.concurrent.atomic.AtomicReference<m5.j<l7.a>> r4 = r2.f6719i
            java.util.concurrent.atomic.AtomicReference<l7.d> r5 = r2.f6718h
            if (r3 != 0) goto L_0x0235
            l7.e r0 = r2.a(r0)
            if (r0 == 0) goto L_0x0235
            r5.set(r0)
            java.lang.Object r3 = r4.get()
            m5.j r3 = (m5.j) r3
            l7.a r0 = r0.f6975a
            r3.c(r0)
            r0 = 0
            m5.r r0 = m5.l.e(r0)
            goto L_0x0276
        L_0x0235:
            k7.a r0 = k7.a.IGNORE_CACHE_EXPIRATION
            l7.e r0 = r2.a(r0)
            if (r0 == 0) goto L_0x024b
            r5.set(r0)
            java.lang.Object r3 = r4.get()
            m5.j r3 = (m5.j) r3
            l7.a r0 = r0.f6975a
            r3.c(r0)
        L_0x024b:
            d7.c0 r0 = r2.f6717g
            m5.j<java.lang.Void> r3 = r0.f4211f
            m5.r<TResult> r3 = r3.f7089a
            java.lang.Object r4 = r0.f4208b
            monitor-enter(r4)
            m5.j<java.lang.Void> r0 = r0.f4209c     // Catch:{ all -> 0x0479 }
            m5.r<TResult> r0 = r0.f7089a     // Catch:{ all -> 0x0479 }
            monitor-exit(r4)     // Catch:{ all -> 0x0479 }
            java.util.concurrent.ExecutorService r4 = d7.p0.f4263a
            m5.j r4 = new m5.j
            r4.<init>()
            v1.a r5 = new v1.a
            r5.<init>(r4)
            r3.e(r1, r5)
            r0.e(r1, r5)
            k7.b r0 = new k7.b
            r0.<init>(r2)
            m5.r<TResult> r3 = r4.f7089a
            m5.i r0 = r3.n(r1, r0)
        L_0x0276:
            h5.s r3 = new h5.s
            r3.<init>()
            r0.e(r1, r3)
            r3 = r26
            i7.e r0 = r3.f4295h
            android.content.Context r4 = r3.f4289a
            if (r4 == 0) goto L_0x02ac
            android.content.res.Resources r5 = r4.getResources()
            if (r5 == 0) goto L_0x02ac
            java.lang.String r6 = "bool"
            java.lang.String r7 = "com.crashlytics.RequireBuildId"
            int r6 = d7.e.f(r4, r7, r6)
            if (r6 <= 0) goto L_0x029b
            boolean r5 = r5.getBoolean(r6)
            goto L_0x02ad
        L_0x029b:
            r5 = r41
            int r5 = d7.e.f(r4, r7, r5)
            if (r5 <= 0) goto L_0x02ac
            java.lang.String r5 = r4.getString(r5)
            boolean r5 = java.lang.Boolean.parseBoolean(r5)
            goto L_0x02ad
        L_0x02ac:
            r5 = 1
        L_0x02ad:
            java.lang.String r6 = "The Crashlytics build ID is missing. This occurs when Crashlytics tooling is absent from your app's build configuration. Please review Crashlytics onboarding instructions and ensure you have a valid Crashlytics account."
            if (r5 != 0) goto L_0x02c1
            r5 = 2
            boolean r5 = android.util.Log.isLoggable(r14, r5)
            if (r5 == 0) goto L_0x02be
            java.lang.String r5 = "Configured not to require a build ID."
            r7 = 0
            android.util.Log.v(r14, r5, r7)
        L_0x02be:
            r5 = r43
            goto L_0x02cb
        L_0x02c1:
            r5 = r43
            java.lang.String r7 = r5.f4194b
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 != 0) goto L_0x02cd
        L_0x02cb:
            r7 = 1
            goto L_0x031d
        L_0x02cd:
            java.lang.String r7 = "."
            android.util.Log.e(r14, r7)
            java.lang.String r8 = ".     |  | "
            android.util.Log.e(r14, r8)
            java.lang.String r8 = ".     |  |"
            android.util.Log.e(r14, r8)
            android.util.Log.e(r14, r8)
            java.lang.String r9 = ".   \\ |  | /"
            android.util.Log.e(r14, r9)
            java.lang.String r9 = ".    \\    /"
            android.util.Log.e(r14, r9)
            java.lang.String r9 = ".     \\  /"
            android.util.Log.e(r14, r9)
            java.lang.String r9 = ".      \\/"
            android.util.Log.e(r14, r9)
            android.util.Log.e(r14, r7)
            android.util.Log.e(r14, r6)
            android.util.Log.e(r14, r7)
            java.lang.String r9 = ".      /\\"
            android.util.Log.e(r14, r9)
            java.lang.String r9 = ".     /  \\"
            android.util.Log.e(r14, r9)
            java.lang.String r9 = ".    /    \\"
            android.util.Log.e(r14, r9)
            java.lang.String r9 = ".   / |  | \\"
            android.util.Log.e(r14, r9)
            android.util.Log.e(r14, r8)
            android.util.Log.e(r14, r8)
            android.util.Log.e(r14, r8)
            android.util.Log.e(r14, r7)
            r7 = 0
        L_0x031d:
            if (r7 == 0) goto L_0x0473
            androidx.appcompat.widget.m r6 = new androidx.appcompat.widget.m     // Catch:{ Exception -> 0x045b }
            java.lang.String r7 = "crash_marker"
            r8 = 9
            r6.<init>(r8, r7, r0)     // Catch:{ Exception -> 0x045b }
            r3.f4292e = r6     // Catch:{ Exception -> 0x045b }
            androidx.appcompat.widget.m r6 = new androidx.appcompat.widget.m     // Catch:{ Exception -> 0x045b }
            java.lang.String r7 = "initialization_marker"
            r6.<init>(r8, r7, r0)     // Catch:{ Exception -> 0x045b }
            r3.d = r6     // Catch:{ Exception -> 0x045b }
            androidx.fragment.app.f0 r6 = new androidx.fragment.app.f0     // Catch:{ Exception -> 0x045b }
            r7 = 5
            r6.<init>((int) r7)     // Catch:{ Exception -> 0x045b }
            e7.b r7 = new e7.b     // Catch:{ Exception -> 0x045b }
            r7.<init>(r0)     // Catch:{ Exception -> 0x045b }
            m7.a r0 = new m7.a     // Catch:{ Exception -> 0x045b }
            r8 = 1
            m7.c[] r8 = new m7.c[r8]     // Catch:{ Exception -> 0x045b }
            androidx.databinding.a r9 = new androidx.databinding.a     // Catch:{ Exception -> 0x045b }
            r9.<init>()     // Catch:{ Exception -> 0x045b }
            r10 = 0
            r8[r10] = r9     // Catch:{ Exception -> 0x045b }
            r0.<init>(r8)     // Catch:{ Exception -> 0x045b }
            android.content.Context r8 = r3.f4289a     // Catch:{ Exception -> 0x045b }
            d7.h0 r9 = r3.f4294g     // Catch:{ Exception -> 0x045b }
            i7.e r10 = r3.f4295h     // Catch:{ Exception -> 0x045b }
            r29 = r8
            r30 = r9
            r31 = r10
            r32 = r5
            r33 = r7
            r34 = r6
            r35 = r0
            r36 = r2
            d7.n0 r38 = d7.n0.b(r29, r30, r31, r32, r33, r34, r35, r36)     // Catch:{ Exception -> 0x045b }
            d7.t r0 = new d7.t     // Catch:{ Exception -> 0x045b }
            android.content.Context r6 = r3.f4289a     // Catch:{ Exception -> 0x045b }
            d7.f r8 = r3.l     // Catch:{ Exception -> 0x045b }
            d7.h0 r9 = r3.f4294g     // Catch:{ Exception -> 0x045b }
            d7.c0 r10 = r3.f4290b     // Catch:{ Exception -> 0x045b }
            i7.e r11 = r3.f4295h     // Catch:{ Exception -> 0x045b }
            androidx.appcompat.widget.m r12 = r3.f4292e     // Catch:{ Exception -> 0x045b }
            a7.a r13 = r3.f4299m     // Catch:{ Exception -> 0x045b }
            b7.a r15 = r3.f4297j     // Catch:{ Exception -> 0x045b }
            r29 = r0
            r30 = r6
            r31 = r8
            r32 = r9
            r33 = r10
            r34 = r11
            r35 = r12
            r36 = r5
            r37 = r7
            r39 = r13
            r40 = r15
            r29.<init>(r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40)     // Catch:{ Exception -> 0x045b }
            r3.f4293f = r0     // Catch:{ Exception -> 0x045b }
            androidx.appcompat.widget.m r0 = r3.d     // Catch:{ Exception -> 0x045b }
            java.lang.Object r5 = r0.f653q     // Catch:{ Exception -> 0x045b }
            i7.e r5 = (i7.e) r5     // Catch:{ Exception -> 0x045b }
            java.lang.Object r0 = r0.f652p     // Catch:{ Exception -> 0x045b }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x045b }
            r5.getClass()     // Catch:{ Exception -> 0x045b }
            java.io.File r6 = new java.io.File     // Catch:{ Exception -> 0x045b }
            java.io.File r5 = r5.f6130a     // Catch:{ Exception -> 0x045b }
            r6.<init>(r5, r0)     // Catch:{ Exception -> 0x045b }
            boolean r0 = r6.exists()     // Catch:{ Exception -> 0x045b }
            d7.y r5 = new d7.y     // Catch:{ Exception -> 0x045b }
            r5.<init>(r3)     // Catch:{ Exception -> 0x045b }
            d7.f r6 = r3.l     // Catch:{ Exception -> 0x045b }
            m5.i r5 = r6.a(r5)     // Catch:{ Exception -> 0x045b }
            java.lang.Object r5 = d7.p0.a(r5)     // Catch:{ Exception -> 0x03c3 }
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch:{ Exception -> 0x03c3 }
            java.lang.Boolean r6 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x045b }
            r6.equals(r5)     // Catch:{ Exception -> 0x045b }
        L_0x03c3:
            d7.t r5 = r3.f4293f     // Catch:{ Exception -> 0x045b }
            java.lang.Thread$UncaughtExceptionHandler r6 = java.lang.Thread.getDefaultUncaughtExceptionHandler()     // Catch:{ Exception -> 0x045b }
            r5.getClass()     // Catch:{ Exception -> 0x045b }
            d7.s r7 = new d7.s     // Catch:{ Exception -> 0x045b }
            r7.<init>(r5)     // Catch:{ Exception -> 0x045b }
            d7.f r8 = r5.d     // Catch:{ Exception -> 0x045b }
            r8.a(r7)     // Catch:{ Exception -> 0x045b }
            d7.l r7 = new d7.l     // Catch:{ Exception -> 0x045b }
            r7.<init>(r5)     // Catch:{ Exception -> 0x045b }
            d7.b0 r8 = new d7.b0     // Catch:{ Exception -> 0x045b }
            a7.a r9 = r5.f4278i     // Catch:{ Exception -> 0x045b }
            r8.<init>(r7, r2, r6, r9)     // Catch:{ Exception -> 0x045b }
            r5.l = r8     // Catch:{ Exception -> 0x045b }
            java.lang.Thread.setDefaultUncaughtExceptionHandler(r8)     // Catch:{ Exception -> 0x045b }
            if (r0 == 0) goto L_0x044c
            java.lang.String r0 = "android.permission.ACCESS_NETWORK_STATE"
            int r0 = r4.checkCallingOrSelfPermission(r0)     // Catch:{ Exception -> 0x045b }
            if (r0 != 0) goto L_0x03f3
            r0 = 1
            goto L_0x03f4
        L_0x03f3:
            r0 = 0
        L_0x03f4:
            if (r0 == 0) goto L_0x040d
            java.lang.String r0 = "connectivity"
            java.lang.Object r0 = r4.getSystemService(r0)     // Catch:{ Exception -> 0x045b }
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0     // Catch:{ Exception -> 0x045b }
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()     // Catch:{ Exception -> 0x045b }
            if (r0 == 0) goto L_0x040b
            boolean r0 = r0.isConnectedOrConnecting()     // Catch:{ Exception -> 0x045b }
            if (r0 == 0) goto L_0x040b
            goto L_0x040d
        L_0x040b:
            r0 = 0
            goto L_0x040e
        L_0x040d:
            r0 = 1
        L_0x040e:
            if (r0 == 0) goto L_0x044c
            java.lang.String r0 = "Crashlytics did not finish previous background initialization. Initializing synchronously."
            r4 = 3
            boolean r4 = android.util.Log.isLoggable(r14, r4)     // Catch:{ Exception -> 0x045b }
            if (r4 == 0) goto L_0x041d
            r4 = 0
            android.util.Log.d(r14, r0, r4)     // Catch:{ Exception -> 0x045b }
        L_0x041d:
            d7.w r0 = new d7.w     // Catch:{ Exception -> 0x045b }
            r0.<init>(r3, r2)     // Catch:{ Exception -> 0x045b }
            java.util.concurrent.ExecutorService r4 = r3.f4298k     // Catch:{ Exception -> 0x045b }
            java.util.concurrent.Future r0 = r4.submit(r0)     // Catch:{ Exception -> 0x045b }
            r4 = 3
            boolean r4 = android.util.Log.isLoggable(r14, r4)     // Catch:{ Exception -> 0x045b }
            if (r4 == 0) goto L_0x0435
            java.lang.String r4 = "Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously."
            r5 = 0
            android.util.Log.d(r14, r4, r5)     // Catch:{ Exception -> 0x045b }
        L_0x0435:
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException -> 0x0445, ExecutionException -> 0x0441, TimeoutException -> 0x043d }
            r5 = 4
            r0.get(r5, r4)     // Catch:{ InterruptedException -> 0x0445, ExecutionException -> 0x0441, TimeoutException -> 0x043d }
            goto L_0x0464
        L_0x043d:
            r0 = move-exception
            java.lang.String r4 = "Crashlytics timed out during initialization."
            goto L_0x0448
        L_0x0441:
            r0 = move-exception
            java.lang.String r4 = "Crashlytics encountered a problem during initialization."
            goto L_0x0448
        L_0x0445:
            r0 = move-exception
            java.lang.String r4 = "Crashlytics was interrupted during initialization."
        L_0x0448:
            android.util.Log.e(r14, r4, r0)     // Catch:{ Exception -> 0x045b }
            goto L_0x0464
        L_0x044c:
            r0 = 3
            boolean r0 = android.util.Log.isLoggable(r14, r0)
            if (r0 == 0) goto L_0x0459
            java.lang.String r0 = "Successfully configured exception handler."
            r4 = 0
            android.util.Log.d(r14, r0, r4)
        L_0x0459:
            r0 = 1
            goto L_0x0465
        L_0x045b:
            r0 = move-exception
            java.lang.String r4 = "Crashlytics was not started due to an exception during initialization"
            android.util.Log.e(r14, r4, r0)
            r0 = 0
            r3.f4293f = r0
        L_0x0464:
            r0 = 0
        L_0x0465:
            z6.d r4 = new z6.d
            r4.<init>(r0, r3, r2)
            m5.l.c(r1, r4)
            z6.e r0 = new z6.e
            r0.<init>()
            goto L_0x0486
        L_0x0473:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r6)
            throw r0
        L_0x0479:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0479 }
            throw r0
        L_0x047c:
            r0 = move-exception
            r15 = 0
            goto L_0x0480
        L_0x047f:
            r0 = move-exception
        L_0x0480:
            java.lang.String r1 = "Error retrieving app package info."
            android.util.Log.e(r14, r1, r0)
            r0 = r15
        L_0x0486:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: z6.c.j(y6.s):java.lang.Object");
    }
}
