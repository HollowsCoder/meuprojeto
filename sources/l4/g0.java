package l4;

import android.app.job.JobParameters;
import h5.g3;
import h5.j6;

public final class g0 implements Runnable {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ int f6912o;

    /* renamed from: p  reason: collision with root package name */
    public final Object f6913p;

    /* renamed from: q  reason: collision with root package name */
    public final Object f6914q;

    /* renamed from: r  reason: collision with root package name */
    public final Object f6915r;

    public g0(j6 j6Var, g3 g3Var, JobParameters jobParameters) {
        this.f6912o = 5;
        this.f6913p = j6Var;
        this.f6914q = g3Var;
        this.f6915r = jobParameters;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v25, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v7, types: [android.os.BaseBundle] */
    /* JADX WARNING: type inference failed for: r1v23 */
    /* JADX WARNING: type inference failed for: r1v30 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r15 = this;
            int r0 = r15.f6912o
            r1 = 0
            java.lang.Object r2 = r15.f6914q
            java.lang.Object r3 = r15.f6913p
            java.lang.Object r4 = r15.f6915r
            switch(r0) {
                case 0: goto L_0x0242;
                case 1: goto L_0x011b;
                case 2: goto L_0x00fe;
                case 3: goto L_0x003d;
                case 4: goto L_0x000e;
                default: goto L_0x000c;
            }
        L_0x000c:
            goto L_0x0283
        L_0x000e:
            h5.f6 r4 = (h5.f6) r4
            h5.x2 r0 = r4.f5383r
            h5.i4 r1 = r4.f5649o
            java.lang.String r4 = "Failed to send default event parameters to service"
            if (r0 != 0) goto L_0x0023
            h5.g3 r0 = r1.w
            h5.i4.n(r0)
            h5.e3 r0 = r0.f5397t
            r0.a(r4)
            goto L_0x003c
        L_0x0023:
            r5 = r3
            h5.i7 r5 = (h5.i7) r5     // Catch:{ RemoteException -> 0x0031 }
            n4.m.h(r5)     // Catch:{ RemoteException -> 0x0031 }
            android.os.Bundle r2 = (android.os.Bundle) r2     // Catch:{ RemoteException -> 0x0031 }
            h5.i7 r3 = (h5.i7) r3     // Catch:{ RemoteException -> 0x0031 }
            r0.d(r2, r3)     // Catch:{ RemoteException -> 0x0031 }
            goto L_0x003c
        L_0x0031:
            r0 = move-exception
            h5.g3 r1 = r1.w
            h5.i4.n(r1)
            h5.e3 r1 = r1.f5397t
            r1.b(r0, r4)
        L_0x003c:
            return
        L_0x003d:
            java.lang.String r0 = "Failed to get app instance id"
            r5 = r4
            h5.f6 r5 = (h5.f6) r5     // Catch:{ RemoteException -> 0x0085 }
            h5.i4 r5 = r5.f5649o     // Catch:{ RemoteException -> 0x0085 }
            h5.u3 r5 = r5.f5458v     // Catch:{ RemoteException -> 0x0085 }
            h5.i4.l(r5)     // Catch:{ RemoteException -> 0x0085 }
            h5.f r5 = r5.p()     // Catch:{ RemoteException -> 0x0085 }
            boolean r5 = r5.e()     // Catch:{ RemoteException -> 0x0085 }
            if (r5 != 0) goto L_0x0087
            r3 = r4
            h5.f6 r3 = (h5.f6) r3     // Catch:{ RemoteException -> 0x0085 }
            h5.i4 r3 = r3.f5649o     // Catch:{ RemoteException -> 0x0085 }
            h5.g3 r3 = r3.w     // Catch:{ RemoteException -> 0x0085 }
            h5.i4.n(r3)     // Catch:{ RemoteException -> 0x0085 }
            h5.e3 r3 = r3.f5400y     // Catch:{ RemoteException -> 0x0085 }
            java.lang.String r5 = "Analytics storage consent denied; will not get app instance id"
            r3.a(r5)     // Catch:{ RemoteException -> 0x0085 }
            r3 = r4
            h5.f6 r3 = (h5.f6) r3     // Catch:{ RemoteException -> 0x0085 }
            h5.i4 r3 = r3.f5649o     // Catch:{ RemoteException -> 0x0085 }
            h5.i5 r3 = r3.D     // Catch:{ RemoteException -> 0x0085 }
            h5.i4.m(r3)     // Catch:{ RemoteException -> 0x0085 }
            java.util.concurrent.atomic.AtomicReference<java.lang.String> r3 = r3.u     // Catch:{ RemoteException -> 0x0085 }
            r3.set(r1)     // Catch:{ RemoteException -> 0x0085 }
            r3 = r4
            h5.f6 r3 = (h5.f6) r3     // Catch:{ RemoteException -> 0x0085 }
            h5.i4 r3 = r3.f5649o     // Catch:{ RemoteException -> 0x0085 }
            h5.u3 r3 = r3.f5458v     // Catch:{ RemoteException -> 0x0085 }
            h5.i4.l(r3)     // Catch:{ RemoteException -> 0x0085 }
            h5.t3 r3 = r3.u     // Catch:{ RemoteException -> 0x0085 }
            r3.b(r1)     // Catch:{ RemoteException -> 0x0085 }
            goto L_0x00e0
        L_0x0083:
            r0 = move-exception
            goto L_0x00ef
        L_0x0085:
            r3 = move-exception
            goto L_0x00d1
        L_0x0087:
            r5 = r4
            h5.f6 r5 = (h5.f6) r5     // Catch:{ RemoteException -> 0x0085 }
            h5.x2 r5 = r5.f5383r     // Catch:{ RemoteException -> 0x0085 }
            if (r5 != 0) goto L_0x009e
            r3 = r4
            h5.f6 r3 = (h5.f6) r3     // Catch:{ RemoteException -> 0x0085 }
            h5.i4 r3 = r3.f5649o     // Catch:{ RemoteException -> 0x0085 }
            h5.g3 r3 = r3.w     // Catch:{ RemoteException -> 0x0085 }
            h5.i4.n(r3)     // Catch:{ RemoteException -> 0x0085 }
            h5.e3 r3 = r3.f5397t     // Catch:{ RemoteException -> 0x0085 }
            r3.a(r0)     // Catch:{ RemoteException -> 0x0085 }
            goto L_0x00e0
        L_0x009e:
            r6 = r3
            h5.i7 r6 = (h5.i7) r6     // Catch:{ RemoteException -> 0x0085 }
            n4.m.h(r6)     // Catch:{ RemoteException -> 0x0085 }
            h5.i7 r3 = (h5.i7) r3     // Catch:{ RemoteException -> 0x0085 }
            java.lang.String r1 = r5.q(r3)     // Catch:{ RemoteException -> 0x0085 }
            if (r1 == 0) goto L_0x00ca
            r3 = r4
            h5.f6 r3 = (h5.f6) r3     // Catch:{ RemoteException -> 0x0085 }
            h5.i4 r3 = r3.f5649o     // Catch:{ RemoteException -> 0x0085 }
            h5.i5 r3 = r3.D     // Catch:{ RemoteException -> 0x0085 }
            h5.i4.m(r3)     // Catch:{ RemoteException -> 0x0085 }
            java.util.concurrent.atomic.AtomicReference<java.lang.String> r3 = r3.u     // Catch:{ RemoteException -> 0x0085 }
            r3.set(r1)     // Catch:{ RemoteException -> 0x0085 }
            r3 = r4
            h5.f6 r3 = (h5.f6) r3     // Catch:{ RemoteException -> 0x0085 }
            h5.i4 r3 = r3.f5649o     // Catch:{ RemoteException -> 0x0085 }
            h5.u3 r3 = r3.f5458v     // Catch:{ RemoteException -> 0x0085 }
            h5.i4.l(r3)     // Catch:{ RemoteException -> 0x0085 }
            h5.t3 r3 = r3.u     // Catch:{ RemoteException -> 0x0085 }
            r3.b(r1)     // Catch:{ RemoteException -> 0x0085 }
        L_0x00ca:
            r3 = r4
            h5.f6 r3 = (h5.f6) r3     // Catch:{ RemoteException -> 0x0085 }
            r3.p()     // Catch:{ RemoteException -> 0x0085 }
            goto L_0x00e0
        L_0x00d1:
            r5 = r4
            h5.f6 r5 = (h5.f6) r5     // Catch:{ all -> 0x0083 }
            h5.i4 r5 = r5.f5649o     // Catch:{ all -> 0x0083 }
            h5.g3 r5 = r5.w     // Catch:{ all -> 0x0083 }
            h5.i4.n(r5)     // Catch:{ all -> 0x0083 }
            h5.e3 r5 = r5.f5397t     // Catch:{ all -> 0x0083 }
            r5.b(r3, r0)     // Catch:{ all -> 0x0083 }
        L_0x00e0:
            h5.f6 r4 = (h5.f6) r4
            h5.i4 r0 = r4.f5649o
            h5.g7 r0 = r0.z
            h5.i4.l(r0)
            com.google.android.gms.internal.measurement.q0 r2 = (com.google.android.gms.internal.measurement.q0) r2
            r0.I(r1, r2)
            return
        L_0x00ef:
            h5.f6 r4 = (h5.f6) r4
            h5.i4 r3 = r4.f5649o
            h5.g7 r3 = r3.z
            h5.i4.l(r3)
            com.google.android.gms.internal.measurement.q0 r2 = (com.google.android.gms.internal.measurement.q0) r2
            r3.I(r1, r2)
            throw r0
        L_0x00fe:
            h5.p4 r4 = (h5.p4) r4
            h5.z6 r0 = r4.f5631a
            r0.j()
            h5.b r3 = (h5.b) r3
            h5.c7 r0 = r3.f5277q
            java.lang.Object r0 = r0.g0()
            h5.z6 r1 = r4.f5631a
            h5.i7 r2 = (h5.i7) r2
            if (r0 != 0) goto L_0x0117
            r1.p(r3, r2)
            goto L_0x011a
        L_0x0117:
            r1.o(r3, r2)
        L_0x011a:
            return
        L_0x011b:
            h5.v3 r4 = (h5.v3) r4
            h5.w3 r0 = r4.f5779b
            com.google.android.gms.internal.measurement.f0 r3 = (com.google.android.gms.internal.measurement.f0) r3
            android.content.ServiceConnection r2 = (android.content.ServiceConnection) r2
            h5.i4 r0 = r0.f5792a
            h5.h4 r5 = r0.f5459x
            h5.g3 r6 = r0.w
            h5.i4.n(r5)
            r5.g()
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
            java.lang.String r7 = "package_name"
            java.lang.String r4 = r4.f5778a
            r5.putString(r7, r4)
            android.os.Bundle r3 = r3.y(r5)     // Catch:{ Exception -> 0x014e }
            if (r3 != 0) goto L_0x014c
            h5.i4.n(r6)     // Catch:{ Exception -> 0x014e }
            h5.e3 r3 = r6.f5397t     // Catch:{ Exception -> 0x014e }
            java.lang.String r4 = "Install Referrer Service returned a null response"
            r3.a(r4)     // Catch:{ Exception -> 0x014e }
            goto L_0x015d
        L_0x014c:
            r1 = r3
            goto L_0x015d
        L_0x014e:
            r3 = move-exception
            h5.i4.n(r6)
            java.lang.String r3 = r3.getMessage()
            h5.e3 r4 = r6.f5397t
            java.lang.String r5 = "Exception occurred while retrieving the Install Referrer"
            r4.b(r3, r5)
        L_0x015d:
            h5.h4 r3 = r0.f5459x
            h5.i4.n(r3)
            r3.g()
            if (r1 != 0) goto L_0x0169
            goto L_0x0238
        L_0x0169:
            java.lang.String r3 = "install_begin_timestamp_seconds"
            r4 = 0
            long r7 = r1.getLong(r3, r4)
            r9 = 1000(0x3e8, double:4.94E-321)
            long r7 = r7 * r9
            int r3 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r3 != 0) goto L_0x0181
            h5.i4.n(r6)
            java.lang.String r1 = "Service response is missing Install Referrer install timestamp"
            h5.e3 r3 = r6.w
            goto L_0x0235
        L_0x0181:
            java.lang.String r3 = "install_referrer"
            java.lang.String r3 = r1.getString(r3)
            if (r3 == 0) goto L_0x022e
            boolean r11 = r3.isEmpty()
            if (r11 == 0) goto L_0x0191
            goto L_0x022e
        L_0x0191:
            h5.i4.n(r6)
            java.lang.String r11 = "InstallReferrer API result"
            h5.e3 r12 = r6.B
            r12.b(r3, r11)
            h5.g7 r11 = r0.z
            h5.i4.l(r11)
            int r13 = r3.length()
            java.lang.String r14 = "?"
            if (r13 == 0) goto L_0x01ad
            java.lang.String r3 = r14.concat(r3)
            goto L_0x01b2
        L_0x01ad:
            java.lang.String r3 = new java.lang.String
            r3.<init>(r14)
        L_0x01b2:
            android.net.Uri r3 = android.net.Uri.parse(r3)
            android.os.Bundle r3 = r11.Z(r3)
            if (r3 != 0) goto L_0x01c3
            h5.i4.n(r6)
            java.lang.String r1 = "No campaign params defined in Install Referrer result"
            goto L_0x0233
        L_0x01c3:
            java.lang.String r11 = "medium"
            java.lang.String r11 = r3.getString(r11)
            if (r11 == 0) goto L_0x01f1
            java.lang.String r13 = "(not set)"
            boolean r13 = r13.equalsIgnoreCase(r11)
            if (r13 != 0) goto L_0x01f1
            java.lang.String r13 = "organic"
            boolean r11 = r13.equalsIgnoreCase(r11)
            if (r11 != 0) goto L_0x01f1
            java.lang.String r11 = "referrer_click_timestamp_seconds"
            long r13 = r1.getLong(r11, r4)
            long r13 = r13 * r9
            int r1 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r1 != 0) goto L_0x01ec
            h5.i4.n(r6)
            java.lang.String r1 = "Install Referrer is missing click timestamp for ad campaign"
            goto L_0x0233
        L_0x01ec:
            java.lang.String r1 = "click_timestamp"
            r3.putLong(r1, r13)
        L_0x01f1:
            h5.u3 r1 = r0.f5458v
            h5.i4.l(r1)
            h5.q3 r4 = r1.f5754t
            long r4 = r4.a()
            int r4 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r4 != 0) goto L_0x0207
            h5.i4.n(r6)
            java.lang.String r1 = "Install Referrer campaign has already been logged"
            r3 = r12
            goto L_0x0235
        L_0x0207:
            boolean r4 = r0.i()
            if (r4 == 0) goto L_0x0238
            h5.q3 r1 = r1.f5754t
            r1.b(r7)
            h5.i4.n(r6)
            java.lang.String r1 = "Logging Install Referrer campaign from sdk with "
            java.lang.String r4 = "referrer API"
            r12.b(r4, r1)
            java.lang.String r1 = "_cis"
            r3.putString(r1, r4)
            h5.i5 r1 = r0.D
            h5.i4.m(r1)
            java.lang.String r4 = "auto"
            java.lang.String r5 = "_cmp"
            r1.x(r4, r5, r3)
            goto L_0x0238
        L_0x022e:
            h5.i4.n(r6)
            java.lang.String r1 = "No referrer defined in Install Referrer response"
        L_0x0233:
            h5.e3 r3 = r6.f5397t
        L_0x0235:
            r3.a(r1)
        L_0x0238:
            q4.a r1 = q4.a.b()
            android.content.Context r0 = r0.f5452o
            r1.c(r0, r2)
            return
        L_0x0242:
            l4.h0 r4 = (l4.h0) r4
            int r0 = r4.f6918p
            if (r0 <= 0) goto L_0x0257
            r0 = r3
            com.google.android.gms.common.api.internal.LifecycleCallback r0 = (com.google.android.gms.common.api.internal.LifecycleCallback) r0
            android.os.Bundle r1 = r4.f6919q
            if (r1 == 0) goto L_0x0254
            java.lang.String r2 = (java.lang.String) r2
            r1.getBundle(r2)
        L_0x0254:
            r0.getClass()
        L_0x0257:
            int r0 = r4.f6918p
            r1 = 2
            if (r0 < r1) goto L_0x0262
            r0 = r3
            com.google.android.gms.common.api.internal.LifecycleCallback r0 = (com.google.android.gms.common.api.internal.LifecycleCallback) r0
            r0.getClass()
        L_0x0262:
            int r0 = r4.f6918p
            r1 = 3
            if (r0 < r1) goto L_0x026d
            r0 = r3
            com.google.android.gms.common.api.internal.LifecycleCallback r0 = (com.google.android.gms.common.api.internal.LifecycleCallback) r0
            r0.getClass()
        L_0x026d:
            int r0 = r4.f6918p
            r1 = 4
            if (r0 < r1) goto L_0x0278
            r0 = r3
            com.google.android.gms.common.api.internal.LifecycleCallback r0 = (com.google.android.gms.common.api.internal.LifecycleCallback) r0
            r0.a()
        L_0x0278:
            int r0 = r4.f6918p
            r1 = 5
            if (r0 < r1) goto L_0x0282
            com.google.android.gms.common.api.internal.LifecycleCallback r3 = (com.google.android.gms.common.api.internal.LifecycleCallback) r3
            r3.getClass()
        L_0x0282:
            return
        L_0x0283:
            h5.j6 r3 = (h5.j6) r3
            h5.g3 r2 = (h5.g3) r2
            android.app.job.JobParameters r4 = (android.app.job.JobParameters) r4
            r3.getClass()
            h5.e3 r0 = r2.B
            java.lang.String r1 = "AppMeasurementJobService processed last upload request."
            r0.a(r1)
            java.lang.Object r0 = r3.f5493o
            android.content.Context r0 = (android.content.Context) r0
            h5.i6 r0 = (h5.i6) r0
            r0.b(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l4.g0.run():void");
    }

    public /* synthetic */ g0(Object obj, Object obj2, Object obj3, int i10) {
        this.f6912o = i10;
        this.f6915r = obj;
        this.f6913p = obj2;
        this.f6914q = obj3;
    }
}
