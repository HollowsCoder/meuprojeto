package l4;

public final class j0 implements Runnable {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ int f6924o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ Object f6925p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ Object f6926q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ Object f6927r;

    public /* synthetic */ j0(Object obj, Object obj2, Object obj3, int i10) {
        this.f6924o = i10;
        this.f6927r = obj;
        this.f6925p = obj2;
        this.f6926q = obj3;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v18, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: com.google.android.gms.internal.measurement.k0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r12 = this;
            int r0 = r12.f6924o
            java.lang.Object r1 = r12.f6926q
            java.lang.Object r2 = r12.f6925p
            java.lang.Object r3 = r12.f6927r
            switch(r0) {
                case 0: goto L_0x018c;
                case 1: goto L_0x000d;
                default: goto L_0x000b;
            }
        L_0x000b:
            goto L_0x01cd
        L_0x000d:
            h5.p4 r3 = (h5.p4) r3
            h5.p r2 = (h5.p) r2
            r3.getClass()
            java.lang.String r0 = r2.f5621o
            java.lang.String r4 = "_cmp"
            boolean r0 = r4.equals(r0)
            h5.z6 r3 = r3.f5631a
            if (r0 == 0) goto L_0x0061
            h5.n r0 = r2.f5622p
            if (r0 == 0) goto L_0x0061
            android.os.Bundle r0 = r0.f5587o
            int r4 = r0.size()
            if (r4 != 0) goto L_0x002d
            goto L_0x0061
        L_0x002d:
            java.lang.String r4 = "_cis"
            java.lang.String r0 = r0.getString(r4)
            java.lang.String r4 = "referrer broadcast"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L_0x0043
            java.lang.String r4 = "referrer API"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0061
        L_0x0043:
            h5.g3 r0 = r3.e()
            java.lang.String r4 = r2.toString()
            h5.e3 r0 = r0.z
            java.lang.String r5 = "Event has been filtered "
            r0.b(r4, r5)
            h5.p r0 = new h5.p
            java.lang.String r7 = "_cmpx"
            h5.n r8 = r2.f5622p
            java.lang.String r9 = r2.f5623q
            long r10 = r2.f5624r
            r6 = r0
            r6.<init>(r7, r8, r9, r10)
            r2 = r0
        L_0x0061:
            java.lang.String r0 = r2.f5621o
            com.google.android.gms.internal.measurement.pb.a()
            h5.e r4 = r3.F()
            h5.s2<java.lang.Boolean> r5 = h5.u2.f5750z0
            r6 = 0
            boolean r4 = r4.m(r6, r5)
            h5.i7 r1 = (h5.i7) r1
            if (r4 == 0) goto L_0x0185
            h5.c4 r4 = r3.f5848o
            h5.z6.E(r4)
            java.lang.String r7 = r1.f5468o
            boolean r4 = r4.l(r7)
            if (r4 != 0) goto L_0x0084
            goto L_0x017e
        L_0x0084:
            h5.g3 r4 = r3.e()
            h5.e3 r4 = r4.B
            java.lang.String r7 = r1.f5468o
            java.lang.String r8 = "EES config found for"
            r4.b(r7, r8)
            h5.c4 r4 = r3.f5848o
            h5.z6.E(r4)
            com.google.android.gms.internal.measurement.pb.a()
            h5.i4 r8 = r4.f5649o
            h5.e r8 = r8.u
            boolean r5 = r8.m(r6, r5)
            if (r5 == 0) goto L_0x00b3
            boolean r5 = android.text.TextUtils.isEmpty(r7)
            if (r5 == 0) goto L_0x00aa
            goto L_0x00b3
        L_0x00aa:
            h5.b4 r4 = r4.w
            java.lang.Object r4 = r4.b(r7)
            r6 = r4
            com.google.android.gms.internal.measurement.k0 r6 = (com.google.android.gms.internal.measurement.k0) r6
        L_0x00b3:
            if (r6 == 0) goto L_0x0173
            androidx.fragment.app.f0 r4 = r6.f2765c     // Catch:{ e1 -> 0x015a }
            h5.n r5 = r2.f5622p     // Catch:{ e1 -> 0x015a }
            android.os.Bundle r5 = r5.h0()     // Catch:{ e1 -> 0x015a }
            java.util.HashMap r7 = new java.util.HashMap     // Catch:{ e1 -> 0x015a }
            r7.<init>()     // Catch:{ e1 -> 0x015a }
            java.util.Set r8 = r5.keySet()     // Catch:{ e1 -> 0x015a }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ e1 -> 0x015a }
        L_0x00ca:
            boolean r9 = r8.hasNext()     // Catch:{ e1 -> 0x015a }
            if (r9 == 0) goto L_0x00e0
            java.lang.Object r9 = r8.next()     // Catch:{ e1 -> 0x015a }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ e1 -> 0x015a }
            java.lang.Object r10 = r5.get(r9)     // Catch:{ e1 -> 0x015a }
            if (r10 == 0) goto L_0x00ca
            r7.put(r9, r10)     // Catch:{ e1 -> 0x015a }
            goto L_0x00ca
        L_0x00e0:
            java.lang.String[] r5 = s6.a.L     // Catch:{ e1 -> 0x015a }
            java.lang.String[] r8 = s6.a.J     // Catch:{ e1 -> 0x015a }
            java.lang.String r5 = s6.a.n0(r0, r5, r8)     // Catch:{ e1 -> 0x015a }
            if (r5 != 0) goto L_0x00eb
            r5 = r0
        L_0x00eb:
            com.google.android.gms.internal.measurement.b r8 = new com.google.android.gms.internal.measurement.b     // Catch:{ e1 -> 0x015a }
            long r9 = r2.f5624r     // Catch:{ e1 -> 0x015a }
            r8.<init>(r5, r9, r7)     // Catch:{ e1 -> 0x015a }
            boolean r5 = r6.a(r8)     // Catch:{ e1 -> 0x015a }
            if (r5 != 0) goto L_0x00f9
            goto L_0x0167
        L_0x00f9:
            java.lang.Object r5 = r4.f1152q
            com.google.android.gms.internal.measurement.b r5 = (com.google.android.gms.internal.measurement.b) r5
            java.lang.Object r6 = r4.f1151p
            com.google.android.gms.internal.measurement.b r6 = (com.google.android.gms.internal.measurement.b) r6
            boolean r5 = r5.equals(r6)
            r5 = r5 ^ 1
            if (r5 == 0) goto L_0x011c
            h5.g3 r2 = r3.e()
            java.lang.String r5 = "EES edited event"
            h5.e3 r2 = r2.B
            r2.b(r0, r5)
            java.lang.Object r0 = r4.f1152q
            com.google.android.gms.internal.measurement.b r0 = (com.google.android.gms.internal.measurement.b) r0
            h5.p r2 = h5.b7.H(r0)
        L_0x011c:
            r3.j()
            r3.Q(r2, r1)
            java.lang.Object r0 = r4.f1153r
            java.util.List r0 = (java.util.List) r0
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x018b
            java.lang.Object r0 = r4.f1153r
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x0136:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x018b
            java.lang.Object r2 = r0.next()
            com.google.android.gms.internal.measurement.b r2 = (com.google.android.gms.internal.measurement.b) r2
            h5.g3 r4 = r3.e()
            java.lang.String r5 = r2.f2621a
            h5.e3 r4 = r4.B
            java.lang.String r6 = "EES logging created event"
            r4.b(r5, r6)
            h5.p r2 = h5.b7.H(r2)
            r3.j()
            r3.Q(r2, r1)
            goto L_0x0136
        L_0x015a:
            h5.g3 r4 = r3.e()
            java.lang.String r5 = r1.f5469p
            h5.e3 r4 = r4.f5397t
            java.lang.String r6 = "EES error. appId, eventName"
            r4.c(r5, r0, r6)
        L_0x0167:
            h5.g3 r4 = r3.e()
            h5.e3 r4 = r4.B
            java.lang.String r5 = "EES was not applied to event"
            r4.b(r0, r5)
            goto L_0x017e
        L_0x0173:
            h5.g3 r0 = r3.e()
            java.lang.String r4 = "EES not loaded for"
            h5.e3 r0 = r0.B
            r0.b(r7, r4)
        L_0x017e:
            r3.j()
            r3.Q(r2, r1)
            goto L_0x018b
        L_0x0185:
            r3.j()
            r3.Q(r2, r1)
        L_0x018b:
            return
        L_0x018c:
            l4.i0 r3 = (l4.i0) r3
            int r0 = r3.f6922i0
            if (r0 <= 0) goto L_0x01a1
            r0 = r2
            com.google.android.gms.common.api.internal.LifecycleCallback r0 = (com.google.android.gms.common.api.internal.LifecycleCallback) r0
            android.os.Bundle r4 = r3.f6923j0
            if (r4 == 0) goto L_0x019e
            java.lang.String r1 = (java.lang.String) r1
            r4.getBundle(r1)
        L_0x019e:
            r0.getClass()
        L_0x01a1:
            int r0 = r3.f6922i0
            r1 = 2
            if (r0 < r1) goto L_0x01ac
            r0 = r2
            com.google.android.gms.common.api.internal.LifecycleCallback r0 = (com.google.android.gms.common.api.internal.LifecycleCallback) r0
            r0.getClass()
        L_0x01ac:
            int r0 = r3.f6922i0
            r1 = 3
            if (r0 < r1) goto L_0x01b7
            r0 = r2
            com.google.android.gms.common.api.internal.LifecycleCallback r0 = (com.google.android.gms.common.api.internal.LifecycleCallback) r0
            r0.getClass()
        L_0x01b7:
            int r0 = r3.f6922i0
            r1 = 4
            if (r0 < r1) goto L_0x01c2
            r0 = r2
            com.google.android.gms.common.api.internal.LifecycleCallback r0 = (com.google.android.gms.common.api.internal.LifecycleCallback) r0
            r0.a()
        L_0x01c2:
            int r0 = r3.f6922i0
            r1 = 5
            if (r0 < r1) goto L_0x01cc
            com.google.android.gms.common.api.internal.LifecycleCallback r2 = (com.google.android.gms.common.api.internal.LifecycleCallback) r2
            r2.getClass()
        L_0x01cc:
            return
        L_0x01cd:
            h5.p4 r3 = (h5.p4) r3
            h5.z6 r0 = r3.f5631a
            r0.j()
            h5.c7 r2 = (h5.c7) r2
            java.lang.Object r0 = r2.g0()
            h5.z6 r3 = r3.f5631a
            h5.i7 r1 = (h5.i7) r1
            if (r0 != 0) goto L_0x01e4
            r3.m(r2, r1)
            goto L_0x01e7
        L_0x01e4:
            r3.l(r2, r1)
        L_0x01e7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l4.j0.run():void");
    }
}
