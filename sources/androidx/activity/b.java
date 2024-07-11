package androidx.activity;

public final /* synthetic */ class b implements Runnable {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ int f176o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ Object f177p;

    public /* synthetic */ b(int i10, Object obj) {
        this.f176o = i10;
        this.f177p = obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: java.lang.Integer} */
    /* JADX WARNING: type inference failed for: r5v0 */
    /* JADX WARNING: type inference failed for: r5v3, types: [androidx.lifecycle.s] */
    /* JADX WARNING: type inference failed for: r5v7 */
    /* JADX WARNING: type inference failed for: r5v8 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r10 = this;
            int r0 = r10.f176o
            java.lang.String r1 = "this$0"
            java.lang.Object r2 = r10.f177p
            switch(r0) {
                case 0: goto L_0x0026;
                case 1: goto L_0x0020;
                case 2: goto L_0x000a;
                default: goto L_0x0009;
            }
        L_0x0009:
            goto L_0x002c
        L_0x000a:
            com.appfab.facematchlive.ui.flow.main.MainActivity r2 = (com.appfab.facematchlive.ui.flow.main.MainActivity) r2
            int r0 = com.appfab.facematchlive.ui.flow.main.MainActivity.P
            z8.g.f(r2, r1)
            T r0 = r2.E
            z8.g.c(r0)
            x1.e r0 = (x1.e) r0
            android.widget.TextView r0 = r0.L0
            r1 = 8
            r0.setVisibility(r1)
            return
        L_0x0020:
            androidx.emoji2.text.k$b r2 = (androidx.emoji2.text.k.b) r2
            r2.c()
            return
        L_0x0026:
            androidx.activity.ComponentActivity r2 = (androidx.activity.ComponentActivity) r2
            r2.invalidateOptionsMenu()
            return
        L_0x002c:
            com.appfab.facematchlive.ui.splash.SplashActivity r2 = (com.appfab.facematchlive.ui.splash.SplashActivity) r2
            int r0 = com.appfab.facematchlive.ui.splash.SplashActivity.I
            z8.g.f(r2, r1)
            java.lang.String r0 = "INITDATE"
            android.content.Context r1 = r2.getApplicationContext()     // Catch:{ Exception -> 0x0169 }
            java.lang.String r3 = "connectivity"
            java.lang.Object r1 = r1.getSystemService(r3)     // Catch:{ Exception -> 0x0169 }
            android.net.ConnectivityManager r1 = (android.net.ConnectivityManager) r1     // Catch:{ Exception -> 0x0169 }
            android.net.Network r3 = r1.getActiveNetwork()     // Catch:{ Exception -> 0x0169 }
            android.net.NetworkCapabilities r1 = r1.getNetworkCapabilities(r3)     // Catch:{ Exception -> 0x0169 }
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L_0x005f
            r5 = 16
            boolean r5 = r1.hasCapability(r5)     // Catch:{ Exception -> 0x0169 }
            if (r5 == 0) goto L_0x005f
            r5 = 12
            boolean r1 = r1.hasCapability(r5)     // Catch:{ Exception -> 0x0169 }
            if (r1 == 0) goto L_0x005f
            r1 = r3
            goto L_0x0060
        L_0x005f:
            r1 = r4
        L_0x0060:
            if (r1 == 0) goto L_0x0074
            g1.c r0 = new g1.c     // Catch:{ Exception -> 0x0169 }
            r0.<init>((com.appfab.facematchlive.ui.splash.SplashActivity) r2)     // Catch:{ Exception -> 0x0169 }
            g1.c.b(r0)     // Catch:{ Exception -> 0x0169 }
            g2.a r1 = new g2.a     // Catch:{ Exception -> 0x0169 }
            r1.<init>(r0, r2)     // Catch:{ Exception -> 0x0169 }
            r0.a(r1)     // Catch:{ Exception -> 0x0169 }
            goto L_0x0170
        L_0x0074:
            m2.a r1 = m2.a.C0100a.a()     // Catch:{ Exception -> 0x0169 }
            r5 = 0
            if (r1 == 0) goto L_0x0080
            com.appfab.facematchlive.data.model.CurrentConfigModel r1 = r1.a()     // Catch:{ Exception -> 0x0169 }
            goto L_0x0081
        L_0x0080:
            r1 = r5
        L_0x0081:
            java.util.GregorianCalendar r6 = new java.util.GregorianCalendar     // Catch:{ Exception -> 0x0169 }
            r6.<init>()     // Catch:{ Exception -> 0x0169 }
            java.text.SimpleDateFormat r7 = new java.text.SimpleDateFormat     // Catch:{ Exception -> 0x0169 }
            java.lang.String r8 = "yyyyMMdd"
            java.util.Locale r9 = java.util.Locale.getDefault()     // Catch:{ Exception -> 0x0169 }
            r7.<init>(r8, r9)     // Catch:{ Exception -> 0x0169 }
            java.util.Date r6 = r6.getTime()     // Catch:{ Exception -> 0x0169 }
            java.lang.String r6 = r7.format(r6)     // Catch:{ Exception -> 0x0169 }
            java.lang.String r7 = "getDateTimeString()"
            z8.g.e(r6, r7)     // Catch:{ Exception -> 0x0169 }
            int r6 = java.lang.Integer.parseInt(r6)     // Catch:{ Exception -> 0x0169 }
            com.appfab.facematchlive.data.model.CurrentConfigModel r7 = r2.H
            if (r1 == 0) goto L_0x00b6
            com.appfab.facematchlive.FaceMatchApp$a r8 = com.appfab.facematchlive.FaceMatchApp.u     // Catch:{ Exception -> 0x0169 }
            com.appfab.facematchlive.FaceMatchApp r8 = r8.a()     // Catch:{ Exception -> 0x0169 }
            if (r8 == 0) goto L_0x00c5
            androidx.lifecycle.s<com.appfab.facematchlive.data.model.CurrentConfigModel> r8 = r8.f2220p     // Catch:{ Exception -> 0x0169 }
            if (r8 == 0) goto L_0x00c5
            r8.j(r1)     // Catch:{ Exception -> 0x0169 }
            goto L_0x00c5
        L_0x00b6:
            com.appfab.facematchlive.FaceMatchApp$a r1 = com.appfab.facematchlive.FaceMatchApp.u     // Catch:{ Exception -> 0x0169 }
            com.appfab.facematchlive.FaceMatchApp r1 = r1.a()     // Catch:{ Exception -> 0x0169 }
            if (r1 == 0) goto L_0x00c5
            androidx.lifecycle.s<com.appfab.facematchlive.data.model.CurrentConfigModel> r1 = r1.f2220p     // Catch:{ Exception -> 0x0169 }
            if (r1 == 0) goto L_0x00c5
            r1.j(r7)     // Catch:{ Exception -> 0x0169 }
        L_0x00c5:
            m2.a r1 = m2.a.C0100a.a()     // Catch:{ Exception -> 0x0169 }
            if (r1 == 0) goto L_0x00d4
            int r1 = r1.b(r4)     // Catch:{ Exception -> 0x0169 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ Exception -> 0x0169 }
            goto L_0x00d5
        L_0x00d4:
            r1 = r5
        L_0x00d5:
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x0169 }
            android.util.Log.e(r0, r1)     // Catch:{ Exception -> 0x0169 }
            java.lang.String r1 = java.lang.String.valueOf(r6)     // Catch:{ Exception -> 0x0169 }
            android.util.Log.e(r0, r1)     // Catch:{ Exception -> 0x0169 }
            m2.a r1 = m2.a.C0100a.a()     // Catch:{ Exception -> 0x0169 }
            if (r1 == 0) goto L_0x00f0
            int r1 = r1.b(r4)     // Catch:{ Exception -> 0x0169 }
            if (r1 != 0) goto L_0x00f0
            goto L_0x00f1
        L_0x00f0:
            r3 = r4
        L_0x00f1:
            if (r3 == 0) goto L_0x0120
            m2.a r1 = m2.a.C0100a.a()     // Catch:{ Exception -> 0x0169 }
            if (r1 == 0) goto L_0x0100
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x0169 }
            r1.d(r3)     // Catch:{ Exception -> 0x0169 }
        L_0x0100:
            com.appfab.facematchlive.FaceMatchApp$a r1 = com.appfab.facematchlive.FaceMatchApp.u     // Catch:{ Exception -> 0x0169 }
            com.appfab.facematchlive.FaceMatchApp r1 = r1.a()     // Catch:{ Exception -> 0x0169 }
            if (r1 == 0) goto L_0x010a
            androidx.lifecycle.s<com.appfab.facematchlive.data.model.CurrentConfigModel> r5 = r1.f2220p     // Catch:{ Exception -> 0x0169 }
        L_0x010a:
            if (r5 != 0) goto L_0x010d
            goto L_0x0110
        L_0x010d:
            r5.i(r7)     // Catch:{ Exception -> 0x0169 }
        L_0x0110:
            m2.a r1 = m2.a.C0100a.a()     // Catch:{ Exception -> 0x0169 }
            if (r1 == 0) goto L_0x011d
            java.lang.String r3 = h2.b.b(r7)     // Catch:{ Exception -> 0x0169 }
            r1.c(r3)     // Catch:{ Exception -> 0x0169 }
        L_0x011d:
            java.lang.String r1 = "UPDATE DATE"
            goto L_0x0162
        L_0x0120:
            m2.a r1 = m2.a.C0100a.a()     // Catch:{ Exception -> 0x0169 }
            if (r1 == 0) goto L_0x012e
            int r1 = r1.b(r6)     // Catch:{ Exception -> 0x0169 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)     // Catch:{ Exception -> 0x0169 }
        L_0x012e:
            z8.g.c(r5)     // Catch:{ Exception -> 0x0169 }
            int r1 = r5.intValue()     // Catch:{ Exception -> 0x0169 }
            if (r1 >= r6) goto L_0x0165
            m2.a r1 = m2.a.C0100a.a()     // Catch:{ Exception -> 0x0169 }
            if (r1 == 0) goto L_0x0144
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x0169 }
            r1.d(r3)     // Catch:{ Exception -> 0x0169 }
        L_0x0144:
            com.appfab.facematchlive.FaceMatchApp$a r1 = com.appfab.facematchlive.FaceMatchApp.u     // Catch:{ Exception -> 0x0169 }
            com.appfab.facematchlive.FaceMatchApp r1 = r1.a()     // Catch:{ Exception -> 0x0169 }
            if (r1 == 0) goto L_0x0153
            androidx.lifecycle.s<com.appfab.facematchlive.data.model.CurrentConfigModel> r1 = r1.f2220p     // Catch:{ Exception -> 0x0169 }
            if (r1 == 0) goto L_0x0153
            r1.j(r7)     // Catch:{ Exception -> 0x0169 }
        L_0x0153:
            m2.a r1 = m2.a.C0100a.a()     // Catch:{ Exception -> 0x0169 }
            if (r1 == 0) goto L_0x0160
            java.lang.String r3 = h2.b.b(r7)     // Catch:{ Exception -> 0x0169 }
            r1.c(r3)     // Catch:{ Exception -> 0x0169 }
        L_0x0160:
            java.lang.String r1 = "CLEAR DATE"
        L_0x0162:
            android.util.Log.e(r0, r1)     // Catch:{ Exception -> 0x0169 }
        L_0x0165:
            r2.G()     // Catch:{ Exception -> 0x0169 }
            goto L_0x0170
        L_0x0169:
            r0 = move-exception
            r0.printStackTrace()
            r2.G()
        L_0x0170:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.activity.b.run():void");
    }
}
