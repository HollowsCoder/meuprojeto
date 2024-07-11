package i4;

public final /* synthetic */ class l implements Runnable {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ int f6087o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ Object f6088p;

    public /* synthetic */ l(int i10, Object obj) {
        this.f6087o = i10;
        this.f6088p = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00b6, code lost:
        if (android.util.Log.isLoggable("MessengerIpcClient", 3) == false) goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00b8, code lost:
        r3 = java.lang.String.valueOf(r1);
        r5 = new java.lang.StringBuilder(r3.length() + 8);
        r5.append("Sending ");
        r5.append(r3);
        android.util.Log.d("MessengerIpcClient", r5.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00d8, code lost:
        r3 = r0.f6101f.f6106a;
        r4 = r0.f6098b;
        r5 = android.os.Message.obtain();
        r5.what = r1.f6104c;
        r5.arg1 = r1.f6102a;
        r5.replyTo = r4;
        r4 = new android.os.Bundle();
        r4.putBoolean("oneWay", r1.b());
        r4.putString("pkg", r3.getPackageName());
        r4.putBundle("data", r1.d);
        r5.setData(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
        r1 = r0.f6099c;
        r3 = (android.os.Messenger) r1.f7056p;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0113, code lost:
        if (r3 == null) goto L_0x011a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0115, code lost:
        r3.send(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x011a, code lost:
        r1 = (i4.h) r1.f7057q;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x011e, code lost:
        if (r1 == null) goto L_0x012a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0120, code lost:
        r1 = r1.f6077o;
        r1.getClass();
        r1.send(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0131, code lost:
        throw new java.lang.IllegalStateException("Both messengers are null");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0132, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0133, code lost:
        r0.a(r1.getMessage(), 2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r8 = this;
            int r0 = r8.f6087o
            switch(r0) {
                case 0: goto L_0x0076;
                case 1: goto L_0x005d;
                case 2: goto L_0x0050;
                case 3: goto L_0x0048;
                case 4: goto L_0x002c;
                case 5: goto L_0x0007;
                default: goto L_0x0005;
            }
        L_0x0005:
            goto L_0x013f
        L_0x0007:
            java.lang.Object r0 = r8.f6088p
            com.google.firebase.messaging.FirebaseMessaging r0 = (com.google.firebase.messaging.FirebaseMessaging) r0
            com.google.firebase.messaging.FirebaseMessaging$a r1 = r0.f3711g
            monitor-enter(r1)
            r1.a()     // Catch:{ all -> 0x0029 }
            java.lang.Boolean r2 = r1.d     // Catch:{ all -> 0x0029 }
            if (r2 == 0) goto L_0x001a
            boolean r2 = r2.booleanValue()     // Catch:{ all -> 0x0029 }
            goto L_0x0022
        L_0x001a:
            com.google.firebase.messaging.FirebaseMessaging r2 = com.google.firebase.messaging.FirebaseMessaging.this     // Catch:{ all -> 0x0029 }
            s6.c r2 = r2.f3706a     // Catch:{ all -> 0x0029 }
            boolean r2 = r2.g()     // Catch:{ all -> 0x0029 }
        L_0x0022:
            monitor-exit(r1)
            if (r2 == 0) goto L_0x0028
            r0.d()
        L_0x0028:
            return
        L_0x0029:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x002c:
            java.lang.Object r0 = r8.f6088p
            m5.o r0 = (m5.o) r0
            java.lang.Object r0 = r0.f7110p
            monitor-enter(r0)
            java.lang.Object r1 = r8.f6088p     // Catch:{ all -> 0x0045 }
            r2 = r1
            m5.o r2 = (m5.o) r2     // Catch:{ all -> 0x0045 }
            m5.c r2 = r2.f7111q     // Catch:{ all -> 0x0045 }
            if (r2 == 0) goto L_0x0043
            m5.o r1 = (m5.o) r1     // Catch:{ all -> 0x0045 }
            m5.c r1 = r1.f7111q     // Catch:{ all -> 0x0045 }
            r1.b()     // Catch:{ all -> 0x0045 }
        L_0x0043:
            monitor-exit(r0)     // Catch:{ all -> 0x0045 }
            return
        L_0x0045:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0045 }
            throw r1
        L_0x0048:
            java.lang.Object r0 = r8.f6088p
            l5.a r0 = (l5.a) r0
            r0.d()
            return
        L_0x0050:
            java.lang.Object r0 = r8.f6088p
            h5.e6 r0 = (h5.e6) r0
            h5.f6 r0 = r0.f5361c
            r1 = 0
            r0.f5383r = r1
            r0.r()
            return
        L_0x005d:
            java.lang.Object r0 = r8.f6088p
            m5.j r0 = (m5.j) r0
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "TIMEOUT"
            r1.<init>(r2)
            boolean r0 = r0.b(r1)
            if (r0 == 0) goto L_0x0075
            java.lang.String r0 = "Rpc"
            java.lang.String r1 = "No response"
            android.util.Log.w(r0, r1)
        L_0x0075:
            return
        L_0x0076:
            java.lang.Object r0 = r8.f6088p
            i4.p r0 = (i4.p) r0
        L_0x007a:
            monitor-enter(r0)
            int r1 = r0.f6097a     // Catch:{ all -> 0x013c }
            r2 = 2
            if (r1 == r2) goto L_0x0081
            goto L_0x008c
        L_0x0081:
            java.util.ArrayDeque r1 = r0.d     // Catch:{ all -> 0x013c }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x013c }
            if (r1 == 0) goto L_0x008e
            r0.c()     // Catch:{ all -> 0x013c }
        L_0x008c:
            monitor-exit(r0)     // Catch:{ all -> 0x013c }
            return
        L_0x008e:
            java.util.ArrayDeque r1 = r0.d     // Catch:{ all -> 0x013c }
            java.lang.Object r1 = r1.poll()     // Catch:{ all -> 0x013c }
            i4.r r1 = (i4.r) r1     // Catch:{ all -> 0x013c }
            android.util.SparseArray<i4.r<?>> r3 = r0.f6100e     // Catch:{ all -> 0x013c }
            int r4 = r1.f6102a     // Catch:{ all -> 0x013c }
            r3.put(r4, r1)     // Catch:{ all -> 0x013c }
            i4.u r3 = r0.f6101f     // Catch:{ all -> 0x013c }
            java.util.concurrent.ScheduledExecutorService r3 = r3.f6107b     // Catch:{ all -> 0x013c }
            i4.o r4 = new i4.o     // Catch:{ all -> 0x013c }
            r5 = 0
            r4.<init>((int) r5, (java.lang.Object) r0, (java.lang.Object) r1)     // Catch:{ all -> 0x013c }
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x013c }
            r6 = 30
            r3.schedule(r4, r6, r5)     // Catch:{ all -> 0x013c }
            monitor-exit(r0)     // Catch:{ all -> 0x013c }
            java.lang.String r3 = "MessengerIpcClient"
            r4 = 3
            boolean r3 = android.util.Log.isLoggable(r3, r4)
            if (r3 == 0) goto L_0x00d8
            java.lang.String r3 = java.lang.String.valueOf(r1)
            int r4 = r3.length()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            int r4 = r4 + 8
            r5.<init>(r4)
            java.lang.String r4 = "Sending "
            r5.append(r4)
            r5.append(r3)
            java.lang.String r3 = "MessengerIpcClient"
            java.lang.String r4 = r5.toString()
            android.util.Log.d(r3, r4)
        L_0x00d8:
            i4.u r3 = r0.f6101f
            android.content.Context r3 = r3.f6106a
            android.os.Messenger r4 = r0.f6098b
            android.os.Message r5 = android.os.Message.obtain()
            int r6 = r1.f6104c
            r5.what = r6
            int r6 = r1.f6102a
            r5.arg1 = r6
            r5.replyTo = r4
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            java.lang.String r6 = "oneWay"
            boolean r7 = r1.b()
            r4.putBoolean(r6, r7)
            java.lang.String r6 = "pkg"
            java.lang.String r3 = r3.getPackageName()
            r4.putString(r6, r3)
            java.lang.String r3 = "data"
            android.os.Bundle r1 = r1.d
            r4.putBundle(r3, r1)
            r5.setData(r4)
            m1.i r1 = r0.f6099c     // Catch:{ RemoteException -> 0x0132 }
            java.lang.Object r3 = r1.f7056p     // Catch:{ RemoteException -> 0x0132 }
            android.os.Messenger r3 = (android.os.Messenger) r3     // Catch:{ RemoteException -> 0x0132 }
            if (r3 == 0) goto L_0x011a
            r3.send(r5)     // Catch:{ RemoteException -> 0x0132 }
            goto L_0x007a
        L_0x011a:
            java.lang.Object r1 = r1.f7057q     // Catch:{ RemoteException -> 0x0132 }
            i4.h r1 = (i4.h) r1     // Catch:{ RemoteException -> 0x0132 }
            if (r1 == 0) goto L_0x012a
            android.os.Messenger r1 = r1.f6077o     // Catch:{ RemoteException -> 0x0132 }
            r1.getClass()     // Catch:{ RemoteException -> 0x0132 }
            r1.send(r5)     // Catch:{ RemoteException -> 0x0132 }
            goto L_0x007a
        L_0x012a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ RemoteException -> 0x0132 }
            java.lang.String r3 = "Both messengers are null"
            r1.<init>(r3)     // Catch:{ RemoteException -> 0x0132 }
            throw r1     // Catch:{ RemoteException -> 0x0132 }
        L_0x0132:
            r1 = move-exception
            java.lang.String r1 = r1.getMessage()
            r0.a(r1, r2)
            goto L_0x007a
        L_0x013c:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x013c }
            throw r1
        L_0x013f:
            java.lang.Object r0 = r8.f6088p
            b8.w r0 = (b8.w) r0
            java.util.ArrayDeque<java.lang.String> r1 = r0.d
            monitor-enter(r1)
            android.content.SharedPreferences r2 = r0.f2051a     // Catch:{ all -> 0x017b }
            android.content.SharedPreferences$Editor r2 = r2.edit()     // Catch:{ all -> 0x017b }
            java.lang.String r3 = r0.f2052b     // Catch:{ all -> 0x017b }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x017b }
            r4.<init>()     // Catch:{ all -> 0x017b }
            java.util.ArrayDeque<java.lang.String> r5 = r0.d     // Catch:{ all -> 0x017b }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x017b }
        L_0x0159:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x017b }
            if (r6 == 0) goto L_0x016e
            java.lang.Object r6 = r5.next()     // Catch:{ all -> 0x017b }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x017b }
            r4.append(r6)     // Catch:{ all -> 0x017b }
            java.lang.String r6 = r0.f2053c     // Catch:{ all -> 0x017b }
            r4.append(r6)     // Catch:{ all -> 0x017b }
            goto L_0x0159
        L_0x016e:
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x017b }
            android.content.SharedPreferences$Editor r0 = r2.putString(r3, r0)     // Catch:{ all -> 0x017b }
            r0.commit()     // Catch:{ all -> 0x017b }
            monitor-exit(r1)     // Catch:{ all -> 0x017b }
            return
        L_0x017b:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x017b }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i4.l.run():void");
    }
}
