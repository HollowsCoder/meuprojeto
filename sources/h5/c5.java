package h5;

import java.util.concurrent.atomic.AtomicReference;

public final class c5 implements Runnable {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ int f5309o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ AtomicReference f5310p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ i5 f5311q;

    public /* synthetic */ c5(i5 i5Var, AtomicReference atomicReference, int i10) {
        this.f5309o = i10;
        this.f5311q = i5Var;
        this.f5310p = atomicReference;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:22|23|(1:25)(2:26|(6:28|29|32|33|34|35))|30|31|32|33|34|35) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x0081 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r7 = this;
            int r0 = r7.f5309o
            r1 = 0
            switch(r0) {
                case 0: goto L_0x0007;
                default: goto L_0x0006;
            }
        L_0x0006:
            goto L_0x0044
        L_0x0007:
            java.util.concurrent.atomic.AtomicReference r0 = r7.f5310p
            monitor-enter(r0)
            java.util.concurrent.atomic.AtomicReference r2 = r7.f5310p     // Catch:{ all -> 0x003a }
            h5.i5 r3 = r7.f5311q     // Catch:{ all -> 0x003a }
            h5.i4 r3 = r3.f5649o     // Catch:{ all -> 0x003a }
            h5.e r4 = r3.u     // Catch:{ all -> 0x003a }
            h5.y2 r3 = r3.b()     // Catch:{ all -> 0x003a }
            java.lang.String r3 = r3.l()     // Catch:{ all -> 0x003a }
            h5.s2<java.lang.String> r5 = h5.u2.K     // Catch:{ all -> 0x003a }
            if (r3 != 0) goto L_0x0022
            r4.getClass()     // Catch:{ all -> 0x003a }
            goto L_0x002a
        L_0x0022:
            h5.d r1 = r4.f5344q     // Catch:{ all -> 0x003a }
            java.lang.String r4 = r5.f5680a     // Catch:{ all -> 0x003a }
            java.lang.String r1 = r1.b(r3, r4)     // Catch:{ all -> 0x003a }
        L_0x002a:
            java.lang.Object r1 = r5.a(r1)     // Catch:{ all -> 0x003a }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x003a }
            r2.set(r1)     // Catch:{ all -> 0x003a }
            java.util.concurrent.atomic.AtomicReference r1 = r7.f5310p     // Catch:{ all -> 0x0041 }
            r1.notify()     // Catch:{ all -> 0x0041 }
            monitor-exit(r0)     // Catch:{ all -> 0x0041 }
            return
        L_0x003a:
            r1 = move-exception
            java.util.concurrent.atomic.AtomicReference r2 = r7.f5310p     // Catch:{ all -> 0x0041 }
            r2.notify()     // Catch:{ all -> 0x0041 }
            throw r1     // Catch:{ all -> 0x0041 }
        L_0x0041:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0041 }
            throw r1
        L_0x0044:
            java.util.concurrent.atomic.AtomicReference r0 = r7.f5310p
            monitor-enter(r0)
            java.util.concurrent.atomic.AtomicReference r2 = r7.f5310p     // Catch:{ all -> 0x0099 }
            h5.i5 r3 = r7.f5311q     // Catch:{ all -> 0x0099 }
            h5.i4 r3 = r3.f5649o     // Catch:{ all -> 0x0099 }
            h5.e r4 = r3.u     // Catch:{ all -> 0x0099 }
            h5.y2 r3 = r3.b()     // Catch:{ all -> 0x0099 }
            java.lang.String r3 = r3.l()     // Catch:{ all -> 0x0099 }
            h5.s2<java.lang.Double> r5 = h5.u2.N     // Catch:{ all -> 0x0099 }
            if (r3 != 0) goto L_0x005f
            r4.getClass()     // Catch:{ all -> 0x0099 }
            goto L_0x0081
        L_0x005f:
            h5.d r4 = r4.f5344q     // Catch:{ all -> 0x0099 }
            java.lang.String r6 = r5.f5680a     // Catch:{ all -> 0x0099 }
            java.lang.String r3 = r4.b(r3, r6)     // Catch:{ all -> 0x0099 }
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x0099 }
            if (r4 == 0) goto L_0x006e
            goto L_0x0081
        L_0x006e:
            double r3 = java.lang.Double.parseDouble(r3)     // Catch:{ NumberFormatException -> 0x0081 }
            java.lang.Double r3 = java.lang.Double.valueOf(r3)     // Catch:{ NumberFormatException -> 0x0081 }
            java.lang.Object r3 = r5.a(r3)     // Catch:{ NumberFormatException -> 0x0081 }
            java.lang.Double r3 = (java.lang.Double) r3     // Catch:{ NumberFormatException -> 0x0081 }
            double r3 = r3.doubleValue()     // Catch:{ NumberFormatException -> 0x0081 }
            goto L_0x008b
        L_0x0081:
            java.lang.Object r1 = r5.a(r1)     // Catch:{ all -> 0x0099 }
            java.lang.Double r1 = (java.lang.Double) r1     // Catch:{ all -> 0x0099 }
            double r3 = r1.doubleValue()     // Catch:{ all -> 0x0099 }
        L_0x008b:
            java.lang.Double r1 = java.lang.Double.valueOf(r3)     // Catch:{ all -> 0x0099 }
            r2.set(r1)     // Catch:{ all -> 0x0099 }
            java.util.concurrent.atomic.AtomicReference r1 = r7.f5310p     // Catch:{ all -> 0x00a0 }
            r1.notify()     // Catch:{ all -> 0x00a0 }
            monitor-exit(r0)     // Catch:{ all -> 0x00a0 }
            return
        L_0x0099:
            r1 = move-exception
            java.util.concurrent.atomic.AtomicReference r2 = r7.f5310p     // Catch:{ all -> 0x00a0 }
            r2.notify()     // Catch:{ all -> 0x00a0 }
            throw r1     // Catch:{ all -> 0x00a0 }
        L_0x00a0:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00a0 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: h5.c5.run():void");
    }
}
