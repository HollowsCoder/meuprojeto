package h5;

public final /* synthetic */ class w4 implements Runnable {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ int f5793o;

    /* renamed from: p  reason: collision with root package name */
    public final i5 f5794p;

    public /* synthetic */ w4(i5 i5Var, int i10) {
        this.f5793o = i10;
        this.f5794p = i5Var;
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x01b3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r18 = this;
            r1 = r18
            int r0 = r1.f5793o
            r5 = 1
            h5.i5 r7 = r1.f5794p
            switch(r0) {
                case 0: goto L_0x000d;
                default: goto L_0x000b;
            }
        L_0x000b:
            goto L_0x01d1
        L_0x000d:
            r7.g()
            h5.i4 r7 = r7.f5649o
            h5.u3 r0 = r7.f5458v
            h5.i4.l(r0)
            h5.o3 r0 = r0.F
            boolean r0 = r0.a()
            h5.g3 r8 = r7.w
            if (r0 != 0) goto L_0x01c6
            h5.u3 r9 = r7.f5458v
            h5.i4.l(r9)
            h5.q3 r0 = r9.G
            long r10 = r0.a()
            long r5 = r5 + r10
            h5.q3 r12 = r9.G
            r12.b(r5)
            r5 = 5
            int r0 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            r5 = 1
            if (r0 < 0) goto L_0x004a
            h5.i4.n(r8)
            java.lang.String r0 = "Permanently failed to retrieve Deferred Deep Link. Reached maximum retries."
            h5.e3 r2 = r8.w
            r2.a(r0)
            h5.o3 r0 = r9.F
            r0.b(r5)
            goto L_0x01d0
        L_0x004a:
            h5.h4 r0 = r7.f5459x
            h5.i4.n(r0)
            r0.g()
            h5.n5 r6 = r7.F
            h5.i4.n(r6)
            h5.i4.n(r6)
            h5.y2 r0 = r7.b()
            java.lang.String r10 = r0.l()
            r9.g()
            h5.i4 r11 = r9.f5649o
            r4.d r0 = r11.B
            r0.getClass()
            long r13 = android.os.SystemClock.elapsedRealtime()
            java.lang.String r0 = r9.f5755v
            java.lang.String r15 = ""
            if (r0 == 0) goto L_0x0089
            long r2 = r9.f5756x
            int r2 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r2 < 0) goto L_0x007d
            goto L_0x0089
        L_0x007d:
            android.util.Pair r2 = new android.util.Pair
            boolean r3 = r9.w
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r2.<init>(r0, r3)
            goto L_0x00c3
        L_0x0089:
            h5.e r0 = r11.u
            h5.s2<java.lang.Long> r2 = h5.u2.f5709b
            long r2 = r0.k(r10, r2)
            long r2 = r2 + r13
            r9.f5756x = r2
            android.content.Context r0 = r11.f5452o     // Catch:{ Exception -> 0x00a7 }
            e4.a$a r0 = e4.a.b(r0)     // Catch:{ Exception -> 0x00a7 }
            r9.f5755v = r15     // Catch:{ Exception -> 0x00a7 }
            java.lang.String r2 = r0.f4483a     // Catch:{ Exception -> 0x00a7 }
            if (r2 == 0) goto L_0x00a2
            r9.f5755v = r2     // Catch:{ Exception -> 0x00a7 }
        L_0x00a2:
            boolean r0 = r0.f4484b     // Catch:{ Exception -> 0x00a7 }
            r9.w = r0     // Catch:{ Exception -> 0x00a7 }
            goto L_0x00b6
        L_0x00a7:
            r0 = move-exception
            h5.g3 r2 = r11.w
            h5.i4.n(r2)
            java.lang.String r3 = "Unable to get advertising id"
            h5.e3 r2 = r2.A
            r2.b(r0, r3)
            r9.f5755v = r15
        L_0x00b6:
            android.util.Pair r2 = new android.util.Pair
            java.lang.String r0 = r9.f5755v
            boolean r3 = r9.w
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r2.<init>(r0, r3)
        L_0x00c3:
            java.lang.String r0 = "google_analytics_adid_collection_enabled"
            h5.e r3 = r7.u
            java.lang.Boolean r0 = r3.o(r0)
            r3 = 0
            if (r0 == 0) goto L_0x00d7
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00d5
            goto L_0x00d7
        L_0x00d5:
            r0 = r3
            goto L_0x00d8
        L_0x00d7:
            r0 = r5
        L_0x00d8:
            if (r0 == 0) goto L_0x01bb
            java.lang.Object r0 = r2.second
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x01bb
            java.lang.Object r0 = r2.first
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x00f0
            goto L_0x01bb
        L_0x00f0:
            h5.i4.n(r6)
            r6.i()
            h5.i4 r4 = r6.f5649o
            android.content.Context r0 = r4.f5452o
            java.lang.String r9 = "connectivity"
            java.lang.Object r0 = r0.getSystemService(r9)
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0
            if (r0 == 0) goto L_0x0109
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()     // Catch:{ SecurityException -> 0x0109 }
            goto L_0x010a
        L_0x0109:
            r0 = 0
        L_0x010a:
            if (r0 == 0) goto L_0x01b3
            boolean r0 = r0.isConnected()
            if (r0 == 0) goto L_0x01b3
            h5.g7 r0 = r7.z
            h5.i4.l(r0)
            h5.y2 r8 = r7.b()
            h5.i4 r8 = r8.f5649o
            h5.e r8 = r8.u
            r8.j()
            java.lang.Object r2 = r2.first
            java.lang.String r2 = (java.lang.String) r2
            long r8 = r12.a()
            r11 = -1
            long r8 = r8 + r11
            h5.i4 r11 = r0.f5649o
            n4.m.e(r2)     // Catch:{ MalformedURLException -> 0x0183, IllegalArgumentException -> 0x0181 }
            n4.m.e(r10)     // Catch:{ MalformedURLException -> 0x0183, IllegalArgumentException -> 0x0181 }
            r12 = 4
            java.lang.Object[] r12 = new java.lang.Object[r12]     // Catch:{ MalformedURLException -> 0x0183, IllegalArgumentException -> 0x0181 }
            r13 = 2
            java.lang.Object[] r14 = new java.lang.Object[r13]     // Catch:{ MalformedURLException -> 0x0183, IllegalArgumentException -> 0x0181 }
            r16 = 42004(0xa414, double:2.07527E-319)
            java.lang.Long r15 = java.lang.Long.valueOf(r16)     // Catch:{ MalformedURLException -> 0x0183, IllegalArgumentException -> 0x0181 }
            r14[r3] = r15     // Catch:{ MalformedURLException -> 0x0183, IllegalArgumentException -> 0x0181 }
            int r0 = r0.G()     // Catch:{ MalformedURLException -> 0x0183, IllegalArgumentException -> 0x0181 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ MalformedURLException -> 0x0183, IllegalArgumentException -> 0x0181 }
            r14[r5] = r0     // Catch:{ MalformedURLException -> 0x0183, IllegalArgumentException -> 0x0181 }
            java.lang.String r0 = "v%s.%s"
            java.lang.String r0 = java.lang.String.format(r0, r14)     // Catch:{ MalformedURLException -> 0x0183, IllegalArgumentException -> 0x0181 }
            r12[r3] = r0     // Catch:{ MalformedURLException -> 0x0183, IllegalArgumentException -> 0x0181 }
            r12[r5] = r2     // Catch:{ MalformedURLException -> 0x0183, IllegalArgumentException -> 0x0181 }
            r12[r13] = r10     // Catch:{ MalformedURLException -> 0x0183, IllegalArgumentException -> 0x0181 }
            java.lang.Long r0 = java.lang.Long.valueOf(r8)     // Catch:{ MalformedURLException -> 0x0183, IllegalArgumentException -> 0x0181 }
            r2 = 3
            r12[r2] = r0     // Catch:{ MalformedURLException -> 0x0183, IllegalArgumentException -> 0x0181 }
            java.lang.String r0 = "https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=%s&rdid=%s&bundleid=%s&retry=%s"
            java.lang.String r0 = java.lang.String.format(r0, r12)     // Catch:{ MalformedURLException -> 0x0183, IllegalArgumentException -> 0x0181 }
            h5.e r2 = r11.u     // Catch:{ MalformedURLException -> 0x0183, IllegalArgumentException -> 0x0181 }
            java.lang.String r3 = "debug.deferred.deeplink"
            java.lang.String r2 = r2.h(r3)     // Catch:{ MalformedURLException -> 0x0183, IllegalArgumentException -> 0x0181 }
            boolean r2 = r10.equals(r2)     // Catch:{ MalformedURLException -> 0x0183, IllegalArgumentException -> 0x0181 }
            if (r2 == 0) goto L_0x017b
            java.lang.String r2 = "&ddl_test=1"
            java.lang.String r0 = r0.concat(r2)     // Catch:{ MalformedURLException -> 0x0183, IllegalArgumentException -> 0x0181 }
        L_0x017b:
            java.net.URL r2 = new java.net.URL     // Catch:{ MalformedURLException -> 0x0183, IllegalArgumentException -> 0x0181 }
            r2.<init>(r0)     // Catch:{ MalformedURLException -> 0x0183, IllegalArgumentException -> 0x0181 }
            goto L_0x0195
        L_0x0181:
            r0 = move-exception
            goto L_0x0184
        L_0x0183:
            r0 = move-exception
        L_0x0184:
            h5.g3 r2 = r11.w
            h5.i4.n(r2)
            java.lang.String r0 = r0.getMessage()
            h5.e3 r2 = r2.f5397t
            java.lang.String r3 = "Failed to create BOW URL for Deferred Deep Link. exception"
            r2.b(r0, r3)
            r2 = 0
        L_0x0195:
            if (r2 == 0) goto L_0x01d0
            h5.i4.n(r6)
            h5.q4 r0 = new h5.q4
            r0.<init>(r7, r5)
            r6.g()
            r6.i()
            h5.h4 r3 = r4.f5459x
            h5.i4.n(r3)
            h5.l5 r4 = new h5.l5
            r4.<init>(r6, r10, r2, r0)
            r3.q(r4)
            goto L_0x01d0
        L_0x01b3:
            h5.i4.n(r8)
            java.lang.String r0 = "Network is not available for Deferred Deep Link request. Skipping"
            h5.e3 r2 = r8.w
            goto L_0x01c2
        L_0x01bb:
            h5.i4.n(r8)
            java.lang.String r0 = "ADID unavailable to retrieve Deferred Deep Link. Skipping"
            h5.e3 r2 = r8.A
        L_0x01c2:
            r2.a(r0)
            goto L_0x01d0
        L_0x01c6:
            h5.i4.n(r8)
            java.lang.String r0 = "Deferred Deep Link already retrieved. Not fetching again."
            h5.e3 r2 = r8.A
            r2.a(r0)
        L_0x01d0:
            return
        L_0x01d1:
            h5.k7 r0 = r7.B
            h5.i4 r2 = r0.f5517a
            h5.h4 r3 = r2.f5459x
            h5.i4.n(r3)
            r3.g()
            boolean r3 = r0.c()
            if (r3 != 0) goto L_0x01e5
            goto L_0x029d
        L_0x01e5:
            boolean r0 = r0.b()
            h5.i5 r3 = r2.D
            h5.u3 r4 = r2.f5458v
            java.lang.String r7 = "_cc"
            if (r0 == 0) goto L_0x0220
            h5.i4.l(r4)
            h5.t3 r0 = r4.I
            r2 = 0
            r0.b(r2)
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r2 = "source"
            java.lang.String r8 = "(not set)"
            r0.putString(r2, r8)
            java.lang.String r2 = "medium"
            r0.putString(r2, r8)
            java.lang.String r2 = "_cis"
            java.lang.String r8 = "intent"
            r0.putString(r2, r8)
            r0.putLong(r7, r5)
            h5.i4.m(r3)
            java.lang.String r2 = "auto"
            java.lang.String r5 = "_cmpx"
            r3.x(r2, r5, r0)
            goto L_0x0293
        L_0x0220:
            h5.i4.l(r4)
            h5.t3 r0 = r4.I
            java.lang.String r5 = r0.a()
            boolean r6 = android.text.TextUtils.isEmpty(r5)
            if (r6 == 0) goto L_0x023c
            h5.g3 r2 = r2.w
            h5.i4.n(r2)
            java.lang.String r3 = "Cache still valid but referrer not found"
            h5.e3 r2 = r2.u
            r2.a(r3)
            goto L_0x028f
        L_0x023c:
            h5.q3 r2 = r4.J
            long r8 = r2.a()
            r10 = 3600000(0x36ee80, double:1.7786363E-317)
            long r8 = r8 / r10
            r12 = -1
            long r8 = r8 + r12
            long r8 = r8 * r10
            android.net.Uri r2 = android.net.Uri.parse(r5)
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
            android.util.Pair r6 = new android.util.Pair
            java.lang.String r10 = r2.getPath()
            r6.<init>(r10, r5)
            java.util.Set r10 = r2.getQueryParameterNames()
            java.util.Iterator r10 = r10.iterator()
        L_0x0264:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x0278
            java.lang.Object r11 = r10.next()
            java.lang.String r11 = (java.lang.String) r11
            java.lang.String r12 = r2.getQueryParameter(r11)
            r5.putString(r11, r12)
            goto L_0x0264
        L_0x0278:
            java.lang.Object r2 = r6.second
            android.os.Bundle r2 = (android.os.Bundle) r2
            r2.putLong(r7, r8)
            h5.i4.m(r3)
            java.lang.Object r2 = r6.first
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r5 = r6.second
            android.os.Bundle r5 = (android.os.Bundle) r5
            java.lang.String r6 = "_cmp"
            r3.x(r2, r6, r5)
        L_0x028f:
            r2 = 0
            r0.b(r2)
        L_0x0293:
            h5.i4.l(r4)
            h5.q3 r0 = r4.J
            r2 = 0
            r0.b(r2)
        L_0x029d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h5.w4.run():void");
    }
}
