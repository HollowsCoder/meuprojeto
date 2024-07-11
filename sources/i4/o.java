package i4;

import h5.z6;

public final /* synthetic */ class o implements Runnable {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ int f6094o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ Object f6095p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ Object f6096q;

    public /* synthetic */ o(int i10, Object obj, Object obj2) {
        this.f6094o = i10;
        this.f6095p = obj;
        this.f6096q = obj2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:186:0x05b0, code lost:
        if (android.text.TextUtils.isEmpty(r1.z) == false) goto L_0x05b2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x0545  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x056b  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x05a3  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x05ba  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x05bc  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x05d1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r35 = this;
            r1 = r35
            int r0 = r1.f6094o
            r4 = 0
            r5 = 0
            r6 = 1
            switch(r0) {
                case 0: goto L_0x0665;
                case 1: goto L_0x062a;
                case 2: goto L_0x01de;
                case 3: goto L_0x01a1;
                case 4: goto L_0x018e;
                case 5: goto L_0x00d4;
                case 6: goto L_0x0093;
                case 7: goto L_0x0087;
                case 8: goto L_0x0079;
                case 9: goto L_0x0053;
                case 10: goto L_0x0031;
                case 11: goto L_0x000d;
                default: goto L_0x000a;
            }
        L_0x000a:
            r3 = r1
            goto L_0x06ab
        L_0x000d:
            java.lang.Object r0 = r1.f6096q
            m5.m r0 = (m5.m) r0
            java.lang.Object r2 = r0.f7103q
            monitor-enter(r2)
            java.lang.Object r0 = r1.f6096q     // Catch:{ all -> 0x002e }
            r3 = r0
            m5.m r3 = (m5.m) r3     // Catch:{ all -> 0x002e }
            java.lang.Object r3 = r3.f7104r     // Catch:{ all -> 0x002e }
            m5.d r3 = (m5.d) r3     // Catch:{ all -> 0x002e }
            if (r3 == 0) goto L_0x002c
            m5.m r0 = (m5.m) r0     // Catch:{ all -> 0x002e }
            java.lang.Object r0 = r0.f7104r     // Catch:{ all -> 0x002e }
            m5.d r0 = (m5.d) r0     // Catch:{ all -> 0x002e }
            java.lang.Object r3 = r1.f6095p     // Catch:{ all -> 0x002e }
            m5.i r3 = (m5.i) r3     // Catch:{ all -> 0x002e }
            r0.f(r3)     // Catch:{ all -> 0x002e }
        L_0x002c:
            monitor-exit(r2)     // Catch:{ all -> 0x002e }
            return
        L_0x002e:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x002e }
            throw r0
        L_0x0031:
            java.lang.Object r0 = r1.f6096q
            com.google.android.gms.measurement.internal.AppMeasurementDynamiteService r0 = (com.google.android.gms.measurement.internal.AppMeasurementDynamiteService) r0
            h5.i4 r2 = r0.f3203a
            h5.g7 r2 = r2.z
            h5.i4.l(r2)
            java.lang.Object r3 = r1.f6095p
            com.google.android.gms.internal.measurement.q0 r3 = (com.google.android.gms.internal.measurement.q0) r3
            h5.i4 r0 = r0.f3203a
            java.lang.Boolean r5 = r0.P
            if (r5 == 0) goto L_0x004f
            java.lang.Boolean r0 = r0.P
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x004f
            r4 = r6
        L_0x004f:
            r2.M(r3, r4)
            return
        L_0x0053:
            java.lang.Object r0 = r1.f6095p
            h5.z6 r0 = (h5.z6) r0
            r0.j()
            java.lang.Object r2 = r1.f6096q
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            h5.h4 r3 = r0.f()
            r3.g()
            java.util.ArrayList r3 = r0.C
            if (r3 != 0) goto L_0x0070
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r0.C = r3
        L_0x0070:
            java.util.ArrayList r3 = r0.C
            r3.add(r2)
            r0.g()
            return
        L_0x0079:
            java.lang.Object r0 = r1.f6096q
            h5.e6 r0 = (h5.e6) r0
            h5.f6 r0 = r0.f5361c
            java.lang.Object r2 = r1.f6095p
            android.content.ComponentName r2 = (android.content.ComponentName) r2
            h5.f6.o(r0, r2)
            return
        L_0x0087:
            java.lang.Object r0 = r1.f6096q
            h5.i5 r0 = (h5.i5) r0
            java.lang.Object r2 = r1.f6095p
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            r0.r(r2, r6)
            return
        L_0x0093:
            java.lang.Object r0 = r1.f6095p
            r2 = r0
            java.util.concurrent.atomic.AtomicReference r2 = (java.util.concurrent.atomic.AtomicReference) r2
            monitor-enter(r2)
            java.lang.Object r0 = r1.f6095p     // Catch:{ all -> 0x00c8 }
            java.util.concurrent.atomic.AtomicReference r0 = (java.util.concurrent.atomic.AtomicReference) r0     // Catch:{ all -> 0x00c8 }
            java.lang.Object r3 = r1.f6096q     // Catch:{ all -> 0x00c8 }
            r4 = r3
            h5.i5 r4 = (h5.i5) r4     // Catch:{ all -> 0x00c8 }
            h5.i4 r4 = r4.f5649o     // Catch:{ all -> 0x00c8 }
            h5.e r4 = r4.u     // Catch:{ all -> 0x00c8 }
            h5.i5 r3 = (h5.i5) r3     // Catch:{ all -> 0x00c8 }
            h5.i4 r3 = r3.f5649o     // Catch:{ all -> 0x00c8 }
            h5.y2 r3 = r3.b()     // Catch:{ all -> 0x00c8 }
            java.lang.String r3 = r3.l()     // Catch:{ all -> 0x00c8 }
            h5.s2<java.lang.Long> r5 = h5.u2.L     // Catch:{ all -> 0x00c8 }
            long r3 = r4.k(r3, r5)     // Catch:{ all -> 0x00c8 }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x00c8 }
            r0.set(r3)     // Catch:{ all -> 0x00c8 }
            java.lang.Object r0 = r1.f6095p     // Catch:{ all -> 0x00d1 }
            java.util.concurrent.atomic.AtomicReference r0 = (java.util.concurrent.atomic.AtomicReference) r0     // Catch:{ all -> 0x00d1 }
            r0.notify()     // Catch:{ all -> 0x00d1 }
            monitor-exit(r2)     // Catch:{ all -> 0x00d1 }
            return
        L_0x00c8:
            r0 = move-exception
            java.lang.Object r3 = r1.f6095p     // Catch:{ all -> 0x00d1 }
            java.util.concurrent.atomic.AtomicReference r3 = (java.util.concurrent.atomic.AtomicReference) r3     // Catch:{ all -> 0x00d1 }
            r3.notify()     // Catch:{ all -> 0x00d1 }
            throw r0     // Catch:{ all -> 0x00d1 }
        L_0x00d1:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00d1 }
            throw r0
        L_0x00d4:
            java.lang.String r0 = "creation_timestamp"
            java.lang.String r2 = "origin"
            java.lang.String r3 = "app_id"
            java.lang.Object r4 = r1.f6096q
            h5.i5 r4 = (h5.i5) r4
            java.lang.Object r6 = r1.f6095p
            android.os.Bundle r6 = (android.os.Bundle) r6
            r4.g()
            r4.h()
            n4.m.h(r6)
            java.lang.String r7 = "name"
            java.lang.String r8 = r6.getString(r7)
            n4.m.e(r8)
            h5.i4 r4 = r4.f5649o
            boolean r8 = r4.i()
            if (r8 == 0) goto L_0x0181
            h5.e r8 = r4.u
            h5.s2<java.lang.Boolean> r9 = h5.u2.f5746v0
            boolean r5 = r8.m(r5, r9)
            if (r5 == 0) goto L_0x0116
            h5.c7 r5 = new h5.c7
            java.lang.String r12 = r6.getString(r7)
            r9 = 0
            r11 = 0
            java.lang.String r13 = ""
            r8 = r5
            r8.<init>(r9, r11, r12, r13)
            goto L_0x0126
        L_0x0116:
            h5.c7 r5 = new h5.c7
            java.lang.String r18 = r6.getString(r7)
            r15 = 0
            r17 = 0
            r19 = 0
            r14 = r5
            r14.<init>(r15, r17, r18, r19)
        L_0x0126:
            r23 = r5
            h5.g7 r7 = r4.z     // Catch:{ IllegalArgumentException -> 0x018d }
            h5.i4.l(r7)     // Catch:{ IllegalArgumentException -> 0x018d }
            java.lang.String r8 = r6.getString(r3)     // Catch:{ IllegalArgumentException -> 0x018d }
            java.lang.String r5 = "expired_event_name"
            java.lang.String r9 = r6.getString(r5)     // Catch:{ IllegalArgumentException -> 0x018d }
            java.lang.String r5 = "expired_event_params"
            android.os.Bundle r10 = r6.getBundle(r5)     // Catch:{ IllegalArgumentException -> 0x018d }
            java.lang.String r11 = r6.getString(r2)     // Catch:{ IllegalArgumentException -> 0x018d }
            long r12 = r6.getLong(r0)     // Catch:{ IllegalArgumentException -> 0x018d }
            r14 = 1
            h5.p r34 = r7.D(r8, r9, r10, r11, r12, r14)     // Catch:{ IllegalArgumentException -> 0x018d }
            h5.b r5 = new h5.b
            java.lang.String r21 = r6.getString(r3)
            java.lang.String r22 = r6.getString(r2)
            long r24 = r6.getLong(r0)
            java.lang.String r0 = "active"
            boolean r26 = r6.getBoolean(r0)
            java.lang.String r0 = "trigger_event_name"
            java.lang.String r27 = r6.getString(r0)
            r28 = 0
            java.lang.String r0 = "trigger_timeout"
            long r29 = r6.getLong(r0)
            r31 = 0
            java.lang.String r0 = "time_to_live"
            long r32 = r6.getLong(r0)
            r20 = r5
            r20.<init>(r21, r22, r23, r24, r26, r27, r28, r29, r31, r32, r34)
            h5.f6 r0 = r4.r()
            r0.v(r5)
            goto L_0x018d
        L_0x0181:
            h5.g3 r0 = r4.w
            h5.i4.n(r0)
            java.lang.String r2 = "Conditional property not cleared since app measurement is disabled"
            h5.e3 r0 = r0.B
            r0.a(r2)
        L_0x018d:
            return
        L_0x018e:
            java.lang.Object r0 = r1.f6096q
            h5.p4 r0 = (h5.p4) r0
            h5.z6 r2 = r0.f5631a
            r2.j()
            h5.z6 r0 = r0.f5631a
            java.lang.Object r2 = r1.f6095p
            h5.i7 r2 = (h5.i7) r2
            r0.k(r2)
            return
        L_0x01a1:
            java.lang.Object r0 = r1.f6096q
            h5.p4 r0 = (h5.p4) r0
            h5.z6 r2 = r0.f5631a
            r2.j()
            java.lang.Object r2 = r1.f6095p
            h5.b r2 = (h5.b) r2
            h5.c7 r3 = r2.f5277q
            java.lang.Object r3 = r3.g0()
            if (r3 != 0) goto L_0x01ca
            h5.z6 r0 = r0.f5631a
            r0.getClass()
            java.lang.String r3 = r2.f5275o
            n4.m.h(r3)
            h5.i7 r3 = r0.C(r3)
            if (r3 == 0) goto L_0x01dd
            r0.p(r2, r3)
            goto L_0x01dd
        L_0x01ca:
            h5.z6 r0 = r0.f5631a
            r0.getClass()
            java.lang.String r3 = r2.f5275o
            n4.m.h(r3)
            h5.i7 r3 = r0.C(r3)
            if (r3 == 0) goto L_0x01dd
            r0.o(r2, r3)
        L_0x01dd:
            return
        L_0x01de:
            java.lang.Object r0 = r1.f6096q
            h5.i4 r0 = (h5.i4) r0
            java.lang.Object r7 = r1.f6095p
            h5.u4 r7 = (h5.u4) r7
            h5.h4 r8 = r0.f5459x
            h5.i4.n(r8)
            r8.g()
            h5.e r8 = r0.u
            h5.i4 r9 = r8.f5649o
            r9.getClass()
            h5.k r9 = new h5.k
            r9.<init>(r0)
            r9.j()
            r0.J = r9
            h5.y2 r9 = new h5.y2
            long r10 = r7.f5762f
            r9.<init>(r0, r10)
            r9.i()
            r0.K = r9
            h5.a3 r10 = new h5.a3
            r10.<init>(r0)
            r10.i()
            r0.H = r10
            h5.f6 r10 = new h5.f6
            r10.<init>(r0)
            r10.i()
            r0.I = r10
            h5.g7 r10 = r0.z
            boolean r11 = r10.f5671p
            if (r11 != 0) goto L_0x0622
            r10.V()
            h5.i4 r11 = r10.f5649o
            java.util.concurrent.atomic.AtomicInteger r11 = r11.U
            r11.incrementAndGet()
            r10.f5671p = r6
            h5.u3 r11 = r0.f5458v
            boolean r12 = r11.f5671p
            if (r12 != 0) goto L_0x061a
            r11.k()
            h5.i4 r12 = r11.f5649o
            java.util.concurrent.atomic.AtomicInteger r12 = r12.U
            r12.incrementAndGet()
            r11.f5671p = r6
            h5.w3 r11 = new h5.w3
            r11.<init>(r0)
            r0.L = r11
            h5.y2 r11 = r0.K
            boolean r12 = r11.f5685p
            if (r12 != 0) goto L_0x0612
            r11.k()
            h5.i4 r12 = r11.f5649o
            java.util.concurrent.atomic.AtomicInteger r12 = r12.U
            r12.incrementAndGet()
            r11.f5685p = r6
            h5.g3 r11 = r0.w
            h5.i4.n(r11)
            r8.j()
            r12 = 42004(0xa414, double:2.07527E-319)
            java.lang.Long r8 = java.lang.Long.valueOf(r12)
            java.lang.String r12 = "App measurement initialized, version"
            h5.e3 r13 = r11.z
            r13.b(r8, r12)
            h5.i4.n(r11)
            java.lang.String r8 = "To enable debug logging run: adb shell setprop log.tag.FA VERBOSE"
            r13.a(r8)
            java.lang.String r8 = r9.l()
            java.lang.String r9 = r0.f5453p
            boolean r9 = android.text.TextUtils.isEmpty(r9)
            if (r9 == 0) goto L_0x02c0
            boolean r9 = android.text.TextUtils.isEmpty(r8)
            if (r9 == 0) goto L_0x028e
            r9 = r4
            goto L_0x029c
        L_0x028e:
            h5.i4 r9 = r10.f5649o
            h5.e r9 = r9.u
            java.lang.String r10 = "debug.firebase.analytics.app"
            java.lang.String r9 = r9.h(r10)
            boolean r9 = r9.equals(r8)
        L_0x029c:
            if (r9 == 0) goto L_0x02a4
            h5.i4.n(r11)
            java.lang.String r8 = "Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none."
            goto L_0x02bd
        L_0x02a4:
            h5.i4.n(r11)
            java.lang.String r8 = java.lang.String.valueOf(r8)
            int r9 = r8.length()
            java.lang.String r10 = "To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app "
            if (r9 == 0) goto L_0x02b8
            java.lang.String r8 = r10.concat(r8)
            goto L_0x02bd
        L_0x02b8:
            java.lang.String r8 = new java.lang.String
            r8.<init>(r10)
        L_0x02bd:
            r13.a(r8)
        L_0x02c0:
            h5.i4.n(r11)
            java.lang.String r8 = "Debug-level message logging enabled"
            h5.e3 r9 = r11.A
            r9.a(r8)
            int r8 = r0.T
            java.util.concurrent.atomic.AtomicInteger r9 = r0.U
            int r10 = r9.get()
            if (r8 == r10) goto L_0x02ec
            h5.i4.n(r11)
            int r8 = r0.T
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            int r9 = r9.get()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            h5.e3 r10 = r11.f5397t
            java.lang.String r11 = "Not all components initialized"
            r10.c(r8, r9, r11)
        L_0x02ec:
            r0.M = r6
            com.google.android.gms.internal.measurement.w0 r7 = r7.f5763g
            h5.h4 r8 = r0.f5459x
            h5.i4.n(r8)
            r8.g()
            h5.u3 r8 = r0.f5458v
            h5.i4.l(r8)
            h5.f r9 = r8.p()
            r8.g()
            android.content.SharedPreferences r10 = r8.l()
            java.lang.String r11 = "consent_source"
            r12 = 100
            int r10 = r10.getInt(r11, r12)
            h5.e r11 = r0.u
            h5.i4 r13 = r11.f5649o
            java.lang.String r13 = "google_analytics_default_allow_ad_storage"
            java.lang.Boolean r13 = r11.o(r13)
            java.lang.String r14 = "google_analytics_default_allow_analytics_storage"
            java.lang.Boolean r14 = r11.o(r14)
            long r2 = r0.V
            h5.i5 r12 = r0.D
            r15 = -10
            if (r13 != 0) goto L_0x032a
            if (r14 == 0) goto L_0x0336
        L_0x032a:
            boolean r16 = r8.o(r15)
            if (r16 == 0) goto L_0x0336
            h5.f r7 = new h5.f
            r7.<init>(r13, r14)
            goto L_0x039d
        L_0x0336:
            h5.y2 r13 = r0.b()
            java.lang.String r13 = r13.m()
            boolean r13 = android.text.TextUtils.isEmpty(r13)
            h5.f r14 = h5.f.f5366c
            r6 = 30
            if (r13 != 0) goto L_0x035f
            if (r10 == 0) goto L_0x0358
            if (r10 == r6) goto L_0x0358
            r13 = 10
            if (r10 == r13) goto L_0x0358
            if (r10 == r6) goto L_0x0358
            if (r10 == r6) goto L_0x0358
            r13 = 40
            if (r10 != r13) goto L_0x035f
        L_0x0358:
            h5.i4.m(r12)
            r12.v(r14, r15, r2)
            goto L_0x039a
        L_0x035f:
            com.google.android.gms.internal.measurement.y9 r10 = com.google.android.gms.internal.measurement.y9.f3013p
            com.google.android.gms.internal.measurement.r4<com.google.android.gms.internal.measurement.z9> r10 = r10.f3014o
            java.lang.Object r10 = r10.zza()
            com.google.android.gms.internal.measurement.z9 r10 = (com.google.android.gms.internal.measurement.z9) r10
            r10.zza()
            h5.s2<java.lang.Boolean> r10 = h5.u2.y0
            boolean r10 = r11.m(r5, r10)
            if (r10 == 0) goto L_0x0382
            h5.y2 r10 = r0.b()
            java.lang.String r10 = r10.m()
            boolean r10 = android.text.TextUtils.isEmpty(r10)
            if (r10 == 0) goto L_0x039a
        L_0x0382:
            if (r7 == 0) goto L_0x039a
            android.os.Bundle r7 = r7.u
            if (r7 == 0) goto L_0x039a
            boolean r10 = r8.o(r6)
            if (r10 == 0) goto L_0x039a
            h5.f r7 = h5.f.a(r7)
            boolean r10 = r7.equals(r14)
            if (r10 != 0) goto L_0x039a
            r15 = r6
            goto L_0x039d
        L_0x039a:
            r7 = r5
            r15 = 100
        L_0x039d:
            if (r7 == 0) goto L_0x03a6
            h5.i4.m(r12)
            r12.v(r7, r15, r2)
            r9 = r7
        L_0x03a6:
            h5.i4.m(r12)
            r12.w(r9)
            h5.q3 r6 = r8.f5753s
            long r9 = r6.a()
            r13 = 0
            int r7 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            h5.g3 r9 = r0.w
            if (r7 != 0) goto L_0x03cb
            h5.i4.n(r9)
            java.lang.Long r7 = java.lang.Long.valueOf(r2)
            h5.e3 r10 = r9.B
            java.lang.String r13 = "Persisting first open"
            r10.b(r7, r13)
            r6.b(r2)
        L_0x03cb:
            h5.i4.m(r12)
            h5.k7 r7 = r12.B
            boolean r10 = r7.c()
            if (r10 == 0) goto L_0x03e8
            boolean r10 = r7.b()
            if (r10 == 0) goto L_0x03e8
            h5.i4 r7 = r7.f5517a
            h5.u3 r7 = r7.f5458v
            h5.i4.l(r7)
            h5.t3 r7 = r7.I
            r7.b(r5)
        L_0x03e8:
            boolean r7 = r0.k()
            h5.g7 r10 = r0.z
            if (r7 != 0) goto L_0x0470
            boolean r2 = r0.i()
            if (r2 == 0) goto L_0x060b
            h5.i4.l(r10)
            java.lang.String r2 = "android.permission.INTERNET"
            boolean r2 = r10.z(r2)
            if (r2 != 0) goto L_0x040b
            h5.i4.n(r9)
            java.lang.String r2 = "App is missing INTERNET permission"
            h5.e3 r3 = r9.f5397t
            r3.a(r2)
        L_0x040b:
            java.lang.String r2 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r2 = r10.z(r2)
            if (r2 != 0) goto L_0x041d
            h5.i4.n(r9)
            java.lang.String r2 = "App is missing ACCESS_NETWORK_STATE permission"
            h5.e3 r3 = r9.f5397t
            r3.a(r2)
        L_0x041d:
            android.content.Context r0 = r0.f5452o
            t4.b r2 = t4.c.a(r0)
            boolean r2 = r2.c()
            if (r2 != 0) goto L_0x0464
            boolean r2 = r11.s()
            if (r2 != 0) goto L_0x0464
            boolean r2 = h5.g7.Q(r0)
            if (r2 != 0) goto L_0x043f
            h5.i4.n(r9)
            java.lang.String r2 = "AppMeasurementReceiver not registered/enabled"
            h5.e3 r3 = r9.f5397t
            r3.a(r2)
        L_0x043f:
            java.lang.String r2 = "com.google.android.gms.measurement.AppMeasurementJobService"
            android.content.pm.PackageManager r3 = r0.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0458 }
            if (r3 != 0) goto L_0x0448
            goto L_0x0458
        L_0x0448:
            android.content.ComponentName r5 = new android.content.ComponentName     // Catch:{ NameNotFoundException -> 0x0458 }
            r5.<init>(r0, r2)     // Catch:{ NameNotFoundException -> 0x0458 }
            android.content.pm.ServiceInfo r0 = r3.getServiceInfo(r5, r4)     // Catch:{ NameNotFoundException -> 0x0458 }
            if (r0 == 0) goto L_0x0458
            boolean r0 = r0.enabled     // Catch:{ NameNotFoundException -> 0x0458 }
            if (r0 == 0) goto L_0x0458
            r4 = 1
        L_0x0458:
            if (r4 != 0) goto L_0x0464
            h5.i4.n(r9)
            java.lang.String r0 = "AppMeasurementService not registered/enabled"
            h5.e3 r2 = r9.f5397t
            r2.a(r0)
        L_0x0464:
            h5.i4.n(r9)
            java.lang.String r0 = "Uploading is not possible. App measurement disabled"
            h5.e3 r2 = r9.f5397t
            r2.a(r0)
            goto L_0x060b
        L_0x0470:
            h5.y2 r7 = r0.b()
            java.lang.String r7 = r7.m()
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            h5.t3 r13 = r8.u
            if (r7 == 0) goto L_0x0494
            h5.y2 r7 = r0.b()
            r7.h()
            java.lang.String r7 = r7.z
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 != 0) goto L_0x0490
            goto L_0x0494
        L_0x0490:
            r16 = r11
            goto L_0x053b
        L_0x0494:
            h5.i4.l(r10)
            h5.y2 r7 = r0.b()
            java.lang.String r7 = r7.m()
            r8.g()
            android.content.SharedPreferences r14 = r8.l()
            java.lang.String r15 = "gmp_app_id"
            java.lang.String r14 = r14.getString(r15, r5)
            h5.y2 r4 = r0.b()
            r4.h()
            java.lang.String r4 = r4.z
            r8.g()
            android.content.SharedPreferences r1 = r8.l()
            r16 = r11
            java.lang.String r11 = "admob_app_id"
            java.lang.String r1 = r1.getString(r11, r5)
            r10.getClass()
            boolean r1 = h5.g7.l(r7, r14, r4, r1)
            if (r1 == 0) goto L_0x0508
            h5.i4.n(r9)
            java.lang.String r1 = "Rechecking which service to use due to a GMP App Id change"
            h5.e3 r4 = r9.z
            r4.a(r1)
            r8.g()
            java.lang.Boolean r1 = r8.n()
            android.content.SharedPreferences r4 = r8.l()
            android.content.SharedPreferences$Editor r4 = r4.edit()
            r4.clear()
            r4.apply()
            if (r1 == 0) goto L_0x04f1
            r8.m(r1)
        L_0x04f1:
            h5.a3 r1 = r0.q()
            r1.k()
            h5.f6 r1 = r0.I
            r1.m()
            h5.f6 r1 = r0.I
            r1.k()
            r6.b(r2)
            r13.b(r5)
        L_0x0508:
            h5.y2 r1 = r0.b()
            java.lang.String r1 = r1.m()
            r8.g()
            android.content.SharedPreferences r2 = r8.l()
            android.content.SharedPreferences$Editor r2 = r2.edit()
            r2.putString(r15, r1)
            r2.apply()
            h5.y2 r1 = r0.b()
            r1.h()
            java.lang.String r1 = r1.z
            r8.g()
            android.content.SharedPreferences r2 = r8.l()
            android.content.SharedPreferences$Editor r2 = r2.edit()
            r2.putString(r11, r1)
            r2.apply()
        L_0x053b:
            h5.f r1 = r8.p()
            boolean r1 = r1.e()
            if (r1 != 0) goto L_0x0548
            r13.b(r5)
        L_0x0548:
            h5.i4.m(r12)
            java.lang.String r1 = r13.a()
            java.util.concurrent.atomic.AtomicReference<java.lang.String> r2 = r12.u
            r2.set(r1)
            com.google.android.gms.internal.measurement.v9 r1 = com.google.android.gms.internal.measurement.v9.f2962p
            com.google.android.gms.internal.measurement.r4<com.google.android.gms.internal.measurement.w9> r1 = r1.f2963o
            java.lang.Object r1 = r1.zza()
            com.google.android.gms.internal.measurement.w9 r1 = (com.google.android.gms.internal.measurement.w9) r1
            r1.zza()
            h5.s2<java.lang.Boolean> r1 = h5.u2.f5728l0
            r2 = r16
            boolean r1 = r2.m(r5, r1)
            if (r1 == 0) goto L_0x0595
            h5.i4.l(r10)
            h5.i4 r1 = r10.f5649o     // Catch:{ ClassNotFoundException -> 0x057c }
            android.content.Context r1 = r1.f5452o     // Catch:{ ClassNotFoundException -> 0x057c }
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x057c }
            java.lang.String r3 = "com.google.firebase.remoteconfig.FirebaseRemoteConfig"
            r1.loadClass(r3)     // Catch:{ ClassNotFoundException -> 0x057c }
            goto L_0x0595
        L_0x057c:
            h5.t3 r1 = r8.H
            java.lang.String r3 = r1.a()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x0595
            h5.i4.n(r9)
            java.lang.String r3 = "Remote config removed with active feature rollouts"
            h5.e3 r4 = r9.w
            r4.a(r3)
            r1.b(r5)
        L_0x0595:
            h5.y2 r1 = r0.b()
            java.lang.String r1 = r1.m()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x05b2
            h5.y2 r1 = r0.b()
            r1.h()
            java.lang.String r1 = r1.z
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x060b
        L_0x05b2:
            boolean r1 = r0.i()
            android.content.SharedPreferences r3 = r8.f5751q
            if (r3 != 0) goto L_0x05bc
            r3 = 0
            goto L_0x05c2
        L_0x05bc:
            java.lang.String r4 = "deferred_analytics_collection"
            boolean r3 = r3.contains(r4)
        L_0x05c2:
            if (r3 != 0) goto L_0x05cf
            boolean r2 = r2.p()
            if (r2 != 0) goto L_0x05cf
            r2 = r1 ^ 1
            r8.q(r2)
        L_0x05cf:
            if (r1 == 0) goto L_0x05d7
            h5.i4.m(r12)
            r12.m()
        L_0x05d7:
            h5.q6 r1 = r0.f5460y
            h5.i4.m(r1)
            h5.p6 r1 = r1.f5656r
            r1.a()
            h5.f6 r1 = r0.r()
            java.util.concurrent.atomic.AtomicReference r2 = new java.util.concurrent.atomic.AtomicReference
            r2.<init>()
            r1.w(r2)
            h5.f6 r0 = r0.r()
            h5.p3 r1 = r8.K
            android.os.Bundle r1 = r1.a()
            r0.g()
            r0.h()
            r2 = 0
            h5.i7 r2 = r0.s(r2)
            l4.g0 r3 = new l4.g0
            r4 = 4
            r3.<init>(r0, r2, r1, r4)
            r0.q(r3)
        L_0x060b:
            h5.o3 r0 = r8.B
            r1 = 1
            r0.b(r1)
            return
        L_0x0612:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Can't initialize twice"
            r0.<init>(r1)
            throw r0
        L_0x061a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Can't initialize twice"
            r0.<init>(r1)
            throw r0
        L_0x0622:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Can't initialize twice"
            r0.<init>(r1)
            throw r0
        L_0x062a:
            r3 = r1
            r2 = r4
            r1 = r6
            java.lang.Object r0 = r3.f6095p
            h5.s4 r0 = (h5.s4) r0
            r0.a()
            boolean r0 = q0.d.b()
            if (r0 == 0) goto L_0x0646
            java.lang.Object r0 = r3.f6095p
            h5.s4 r0 = (h5.s4) r0
            h5.h4 r0 = r0.f()
            r0.n(r3)
            goto L_0x0664
        L_0x0646:
            java.lang.Object r0 = r3.f6096q
            h5.j r0 = (h5.j) r0
            long r4 = r0.f5479c
            r6 = 0
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x0654
            r4 = r1
            goto L_0x0655
        L_0x0654:
            r4 = r2
        L_0x0655:
            java.lang.Object r0 = r3.f6096q
            h5.j r0 = (h5.j) r0
            r0.f5479c = r6
            if (r4 == 0) goto L_0x0664
            java.lang.Object r0 = r3.f6096q
            h5.j r0 = (h5.j) r0
            r0.a()
        L_0x0664:
            return
        L_0x0665:
            r3 = r1
            java.lang.Object r0 = r3.f6095p
            r1 = r0
            i4.p r1 = (i4.p) r1
            java.lang.Object r0 = r3.f6096q
            i4.r r0 = (i4.r) r0
            int r0 = r0.f6102a
            monitor-enter(r1)
            android.util.SparseArray<i4.r<?>> r2 = r1.f6100e     // Catch:{ all -> 0x06a8 }
            java.lang.Object r2 = r2.get(r0)     // Catch:{ all -> 0x06a8 }
            i4.r r2 = (i4.r) r2     // Catch:{ all -> 0x06a8 }
            if (r2 == 0) goto L_0x06a6
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x06a8 }
            r6 = 31
            r4.<init>(r6)     // Catch:{ all -> 0x06a8 }
            java.lang.String r6 = "Timing out request: "
            r4.append(r6)     // Catch:{ all -> 0x06a8 }
            r4.append(r0)     // Catch:{ all -> 0x06a8 }
            java.lang.String r6 = "MessengerIpcClient"
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x06a8 }
            android.util.Log.w(r6, r4)     // Catch:{ all -> 0x06a8 }
            android.util.SparseArray<i4.r<?>> r4 = r1.f6100e     // Catch:{ all -> 0x06a8 }
            r4.remove(r0)     // Catch:{ all -> 0x06a8 }
            i4.s r0 = new i4.s     // Catch:{ all -> 0x06a8 }
            java.lang.String r4 = "Timed out waiting for response"
            r0.<init>(r4, r5)     // Catch:{ all -> 0x06a8 }
            r2.c(r0)     // Catch:{ all -> 0x06a8 }
            r1.c()     // Catch:{ all -> 0x06a8 }
        L_0x06a6:
            monitor-exit(r1)
            return
        L_0x06a8:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x06ab:
            java.lang.Object r1 = r3.f6095p
            r0 = r1
            m5.r r0 = (m5.r) r0     // Catch:{ Exception -> 0x06c8, all -> 0x06bc }
            java.lang.Object r2 = r3.f6096q     // Catch:{ Exception -> 0x06c8, all -> 0x06bc }
            java.util.concurrent.Callable r2 = (java.util.concurrent.Callable) r2     // Catch:{ Exception -> 0x06c8, all -> 0x06bc }
            java.lang.Object r2 = r2.call()     // Catch:{ Exception -> 0x06c8, all -> 0x06bc }
            r0.s(r2)     // Catch:{ Exception -> 0x06c8, all -> 0x06bc }
            goto L_0x06ce
        L_0x06bc:
            r0 = move-exception
            m5.r r1 = (m5.r) r1
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            r2.<init>(r0)
            r1.r(r2)
            goto L_0x06ce
        L_0x06c8:
            r0 = move-exception
            m5.r r1 = (m5.r) r1
            r1.r(r0)
        L_0x06ce:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i4.o.run():void");
    }

    public o(z6 z6Var, Runnable runnable) {
        this.f6094o = 9;
        this.f6095p = z6Var;
        this.f6096q = runnable;
    }

    public /* synthetic */ o(Object obj, Object obj2, int i10) {
        this.f6094o = i10;
        this.f6096q = obj;
        this.f6095p = obj2;
    }
}
