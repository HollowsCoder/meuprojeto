package h5;

import com.google.android.gms.internal.measurement.y1;

public final class n7 extends o7 {

    /* renamed from: g  reason: collision with root package name */
    public final y1 f5598g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ q7 f5599h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n7(q7 q7Var, String str, int i10, y1 y1Var) {
        super(str, i10);
        this.f5599h = q7Var;
        this.f5598g = y1Var;
    }

    public final int a() {
        return this.f5598g.s();
    }

    public final boolean b() {
        return false;
    }

    public final boolean c() {
        return this.f5598g.x();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:146:0x03c1, code lost:
        r11 = java.lang.Boolean.FALSE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0171, code lost:
        if (r5.booleanValue() == false) goto L_0x03c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x027f, code lost:
        r5.b(r4, r6);
     */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x03ea  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x03ed  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x03f7 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x03f8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean g(java.lang.Long r18, java.lang.Long r19, com.google.android.gms.internal.measurement.x2 r20, long r21, h5.m r23, boolean r24) {
        /*
            r17 = this;
            r0 = r17
            com.google.android.gms.internal.measurement.ba.a()
            h5.q7 r1 = r0.f5599h
            h5.i4 r2 = r1.f5649o
            h5.e r2 = r2.u
            h5.s2<java.lang.Boolean> r3 = h5.u2.Y
            java.lang.String r4 = r0.f5616a
            boolean r2 = r2.m(r4, r3)
            com.google.android.gms.internal.measurement.y1 r3 = r0.f5598g
            boolean r5 = r3.C()
            if (r5 == 0) goto L_0x0020
            r5 = r23
            long r5 = r5.f5544e
            goto L_0x0022
        L_0x0020:
            r5 = r21
        L_0x0022:
            h5.i4 r7 = r1.f5649o
            h5.g3 r8 = r7.w
            h5.i4.n(r8)
            java.lang.String r8 = r8.r()
            r9 = 2
            boolean r8 = android.util.Log.isLoggable(r8, r9)
            r10 = 1
            int r12 = r0.f5617b
            r13 = 0
            if (r8 == 0) goto L_0x0103
            h5.g3 r8 = r7.w
            h5.i4.n(r8)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r12)
            boolean r15 = r3.r()
            if (r15 == 0) goto L_0x0050
            int r15 = r3.s()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            goto L_0x0051
        L_0x0050:
            r15 = 0
        L_0x0051:
            h5.b3 r11 = r7.A
            h5.i4.l(r11)
            java.lang.String r9 = r3.t()
            java.lang.String r9 = r11.l(r9)
            h5.e3 r8 = r8.B
            java.lang.String r11 = "Evaluating filter. audience, filter, event"
            r8.d(r11, r14, r15, r9)
            h5.g3 r8 = r7.w
            h5.i4.n(r8)
            h5.z6 r1 = r1.f5701p
            h5.b7 r1 = r1.u
            h5.z6.E(r1)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r11 = "\nevent_filter {\n"
            r9.append(r11)
            boolean r11 = r3.r()
            if (r11 == 0) goto L_0x008e
            int r11 = r3.s()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.String r14 = "filter_id"
            h5.b7.r(r9, r13, r14, r11)
        L_0x008e:
            h5.i4 r11 = r1.f5649o
            h5.b3 r11 = r11.A
            h5.i4.l(r11)
            java.lang.String r14 = r3.t()
            java.lang.String r11 = r11.l(r14)
            java.lang.String r14 = "event_name"
            h5.b7.r(r9, r13, r14, r11)
            boolean r11 = r3.z()
            boolean r14 = r3.A()
            boolean r15 = r3.C()
            java.lang.String r11 = h5.b7.p(r11, r14, r15)
            boolean r14 = r11.isEmpty()
            if (r14 != 0) goto L_0x00bd
            java.lang.String r14 = "filter_type"
            h5.b7.r(r9, r13, r14, r11)
        L_0x00bd:
            boolean r11 = r3.x()
            if (r11 == 0) goto L_0x00cc
            java.lang.String r11 = "event_count_filter"
            com.google.android.gms.internal.measurement.e2 r14 = r3.y()
            h5.b7.s(r9, r10, r11, r14)
        L_0x00cc:
            int r11 = r3.v()
            if (r11 <= 0) goto L_0x00f0
            java.lang.String r11 = "  filters {\n"
            r9.append(r11)
            java.util.List r11 = r3.u()
            java.util.Iterator r11 = r11.iterator()
        L_0x00df:
            boolean r14 = r11.hasNext()
            if (r14 == 0) goto L_0x00f0
            java.lang.Object r14 = r11.next()
            com.google.android.gms.internal.measurement.a2 r14 = (com.google.android.gms.internal.measurement.a2) r14
            r15 = 2
            r1.n(r9, r15, r14)
            goto L_0x00df
        L_0x00f0:
            h5.b7.o(r9, r10)
            java.lang.String r1 = "}\n}\n"
            r9.append(r1)
            java.lang.String r1 = r9.toString()
            h5.e3 r8 = r8.B
            java.lang.String r9 = "Filter definition"
            r8.b(r1, r9)
        L_0x0103:
            boolean r1 = r3.r()
            if (r1 == 0) goto L_0x0438
            int r1 = r3.s()
            r8 = 256(0x100, float:3.59E-43)
            if (r1 <= r8) goto L_0x0113
            goto L_0x0438
        L_0x0113:
            boolean r1 = r3.z()
            boolean r4 = r3.A()
            boolean r8 = r3.C()
            if (r1 != 0) goto L_0x0128
            if (r4 != 0) goto L_0x0128
            if (r8 == 0) goto L_0x0126
            goto L_0x0128
        L_0x0126:
            r1 = r13
            goto L_0x0129
        L_0x0128:
            r1 = r10
        L_0x0129:
            if (r24 == 0) goto L_0x014e
            if (r1 != 0) goto L_0x014e
            h5.g3 r1 = r7.w
            h5.i4.n(r1)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r12)
            boolean r4 = r3.r()
            if (r4 == 0) goto L_0x0145
            int r3 = r3.s()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r3)
            goto L_0x0146
        L_0x0145:
            r11 = 0
        L_0x0146:
            java.lang.String r3 = "Event filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID"
            h5.e3 r1 = r1.B
            r1.c(r2, r11, r3)
            return r10
        L_0x014e:
            java.lang.String r4 = r20.u()
            boolean r8 = r3.x()
            r11 = 0
            if (r8 == 0) goto L_0x0175
            com.google.android.gms.internal.measurement.e2 r8 = r3.y()
            java.math.BigDecimal r9 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x0168 }
            r9.<init>(r5)     // Catch:{ NumberFormatException -> 0x0168 }
            java.lang.Boolean r5 = h5.o7.f(r9, r8, r11)     // Catch:{ NumberFormatException -> 0x0168 }
            goto L_0x0169
        L_0x0168:
            r5 = 0
        L_0x0169:
            if (r5 != 0) goto L_0x016d
            goto L_0x0282
        L_0x016d:
            boolean r5 = r5.booleanValue()
            if (r5 != 0) goto L_0x0175
            goto L_0x03c1
        L_0x0175:
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>()
            java.util.List r6 = r3.u()
            java.util.Iterator r6 = r6.iterator()
        L_0x0182:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L_0x01b4
            java.lang.Object r8 = r6.next()
            com.google.android.gms.internal.measurement.a2 r8 = (com.google.android.gms.internal.measurement.a2) r8
            java.lang.String r9 = r8.y()
            boolean r9 = r9.isEmpty()
            if (r9 == 0) goto L_0x01ac
            h5.g3 r5 = r7.w
            h5.i4.n(r5)
            h5.b3 r6 = r7.A
            h5.i4.l(r6)
            java.lang.String r4 = r6.l(r4)
            h5.e3 r5 = r5.w
            java.lang.String r6 = "null or empty param name in filter. event"
            goto L_0x027f
        L_0x01ac:
            java.lang.String r8 = r8.y()
            r5.add(r8)
            goto L_0x0182
        L_0x01b4:
            n.b r6 = new n.b
            r6.<init>()
            java.util.List r8 = r20.r()
            java.util.Iterator r8 = r8.iterator()
        L_0x01c1:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x0240
            java.lang.Object r9 = r8.next()
            com.google.android.gms.internal.measurement.b3 r9 = (com.google.android.gms.internal.measurement.b3) r9
            java.lang.String r14 = r9.s()
            boolean r14 = r5.contains(r14)
            if (r14 == 0) goto L_0x01c1
            boolean r14 = r9.v()
            if (r14 == 0) goto L_0x01f0
            java.lang.String r14 = r9.s()
            boolean r15 = r9.v()
            if (r15 == 0) goto L_0x0209
            long r15 = r9.w()
            java.lang.Long r9 = java.lang.Long.valueOf(r15)
            goto L_0x0219
        L_0x01f0:
            boolean r14 = r9.z()
            if (r14 == 0) goto L_0x020b
            java.lang.String r14 = r9.s()
            boolean r15 = r9.z()
            if (r15 == 0) goto L_0x0209
            double r15 = r9.A()
            java.lang.Double r9 = java.lang.Double.valueOf(r15)
            goto L_0x0219
        L_0x0209:
            r9 = 0
            goto L_0x0219
        L_0x020b:
            boolean r14 = r9.t()
            if (r14 == 0) goto L_0x021d
            java.lang.String r14 = r9.s()
            java.lang.String r9 = r9.u()
        L_0x0219:
            r6.put(r14, r9)
            goto L_0x01c1
        L_0x021d:
            h5.g3 r5 = r7.w
            h5.i4.n(r5)
            h5.b3 r6 = r7.A
            h5.i4.l(r6)
            java.lang.String r4 = r6.l(r4)
            h5.b3 r6 = r7.A
            h5.i4.l(r6)
            java.lang.String r8 = r9.s()
            java.lang.String r6 = r6.m(r8)
            h5.e3 r5 = r5.w
            java.lang.String r8 = "Unknown value for param. event, param"
        L_0x023c:
            r5.c(r4, r6, r8)
            goto L_0x0282
        L_0x0240:
            java.util.List r5 = r3.u()
            java.util.Iterator r5 = r5.iterator()
        L_0x0248:
            boolean r8 = r5.hasNext()
            if (r8 == 0) goto L_0x03e1
            java.lang.Object r8 = r5.next()
            com.google.android.gms.internal.measurement.a2 r8 = (com.google.android.gms.internal.measurement.a2) r8
            boolean r9 = r8.v()
            if (r9 == 0) goto L_0x0262
            boolean r9 = r8.w()
            if (r9 == 0) goto L_0x0262
            r9 = r10
            goto L_0x0263
        L_0x0262:
            r9 = r13
        L_0x0263:
            java.lang.String r14 = r8.y()
            boolean r15 = r14.isEmpty()
            if (r15 == 0) goto L_0x0285
            h5.g3 r5 = r7.w
            h5.i4.n(r5)
            h5.b3 r6 = r7.A
            h5.i4.l(r6)
            java.lang.String r4 = r6.l(r4)
            h5.e3 r5 = r5.w
            java.lang.String r6 = "Event has empty param name. event"
        L_0x027f:
            r5.b(r4, r6)
        L_0x0282:
            r11 = 0
            goto L_0x03e3
        L_0x0285:
            r15 = 0
            java.lang.Object r10 = r6.getOrDefault(r14, r15)
            boolean r15 = r10 instanceof java.lang.Long
            if (r15 == 0) goto L_0x02d3
            boolean r15 = r8.t()
            if (r15 != 0) goto L_0x02b0
            h5.g3 r5 = r7.w
            h5.i4.n(r5)
            h5.b3 r6 = r7.A
            h5.i4.l(r6)
            java.lang.String r4 = r6.l(r4)
            h5.b3 r6 = r7.A
            h5.i4.l(r6)
            java.lang.String r6 = r6.m(r14)
            h5.e3 r5 = r5.w
            java.lang.String r8 = "No number filter for long param. event, param"
            goto L_0x023c
        L_0x02b0:
            java.lang.Long r10 = (java.lang.Long) r10
            long r14 = r10.longValue()
            com.google.android.gms.internal.measurement.e2 r8 = r8.u()
            java.math.BigDecimal r10 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x02c4 }
            r10.<init>(r14)     // Catch:{ NumberFormatException -> 0x02c4 }
            java.lang.Boolean r8 = h5.o7.f(r10, r8, r11)     // Catch:{ NumberFormatException -> 0x02c4 }
            goto L_0x02c5
        L_0x02c4:
            r8 = 0
        L_0x02c5:
            if (r8 != 0) goto L_0x02c8
            goto L_0x0282
        L_0x02c8:
            boolean r8 = r8.booleanValue()
            if (r8 != r9) goto L_0x02d0
            goto L_0x03c1
        L_0x02d0:
            r10 = 1
            goto L_0x0248
        L_0x02d3:
            boolean r15 = r10 instanceof java.lang.Double
            if (r15 == 0) goto L_0x031f
            boolean r15 = r8.t()
            if (r15 != 0) goto L_0x02fa
            h5.g3 r5 = r7.w
            h5.i4.n(r5)
            h5.b3 r6 = r7.A
            h5.i4.l(r6)
            java.lang.String r4 = r6.l(r4)
            h5.b3 r6 = r7.A
            h5.i4.l(r6)
            java.lang.String r6 = r6.m(r14)
            h5.e3 r5 = r5.w
            java.lang.String r8 = "No number filter for double param. event, param"
            goto L_0x023c
        L_0x02fa:
            java.lang.Double r10 = (java.lang.Double) r10
            double r14 = r10.doubleValue()
            com.google.android.gms.internal.measurement.e2 r8 = r8.u()
            java.math.BigDecimal r10 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x0312 }
            r10.<init>(r14)     // Catch:{ NumberFormatException -> 0x0312 }
            double r14 = java.lang.Math.ulp(r14)     // Catch:{ NumberFormatException -> 0x0312 }
            java.lang.Boolean r8 = h5.o7.f(r10, r8, r14)     // Catch:{ NumberFormatException -> 0x0312 }
            goto L_0x0313
        L_0x0312:
            r8 = 0
        L_0x0313:
            if (r8 != 0) goto L_0x0317
            goto L_0x0282
        L_0x0317:
            boolean r8 = r8.booleanValue()
            if (r8 != r9) goto L_0x02d0
            goto L_0x03c1
        L_0x031f:
            boolean r15 = r10 instanceof java.lang.String
            if (r15 == 0) goto L_0x03a1
            boolean r15 = r8.r()
            if (r15 == 0) goto L_0x0339
            java.lang.String r10 = (java.lang.String) r10
            com.google.android.gms.internal.measurement.k2 r8 = r8.s()
            h5.g3 r14 = r7.w
            h5.i4.n(r14)
            java.lang.Boolean r8 = h5.o7.e(r10, r8, r14)
            goto L_0x035c
        L_0x0339:
            boolean r15 = r8.t()
            if (r15 == 0) goto L_0x0384
            java.lang.String r10 = (java.lang.String) r10
            boolean r15 = h5.b7.x(r10)
            if (r15 == 0) goto L_0x0367
            com.google.android.gms.internal.measurement.e2 r8 = r8.u()
            boolean r14 = h5.b7.x(r10)
            if (r14 != 0) goto L_0x0353
        L_0x0351:
            r8 = 0
            goto L_0x035c
        L_0x0353:
            java.math.BigDecimal r14 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x0351 }
            r14.<init>(r10)     // Catch:{ NumberFormatException -> 0x0351 }
            java.lang.Boolean r8 = h5.o7.f(r14, r8, r11)     // Catch:{ NumberFormatException -> 0x0351 }
        L_0x035c:
            if (r8 != 0) goto L_0x0360
            goto L_0x0282
        L_0x0360:
            boolean r8 = r8.booleanValue()
            if (r8 != r9) goto L_0x02d0
            goto L_0x03c1
        L_0x0367:
            h5.g3 r5 = r7.w
            h5.i4.n(r5)
            h5.b3 r6 = r7.A
            h5.i4.l(r6)
            java.lang.String r4 = r6.l(r4)
            h5.b3 r6 = r7.A
            h5.i4.l(r6)
            java.lang.String r6 = r6.m(r14)
            h5.e3 r5 = r5.w
            java.lang.String r8 = "Invalid param value for number filter. event, param"
            goto L_0x023c
        L_0x0384:
            h5.g3 r5 = r7.w
            h5.i4.n(r5)
            h5.b3 r6 = r7.A
            h5.i4.l(r6)
            java.lang.String r4 = r6.l(r4)
            h5.b3 r6 = r7.A
            h5.i4.l(r6)
            java.lang.String r6 = r6.m(r14)
            h5.e3 r5 = r5.w
            java.lang.String r8 = "No filter for String param. event, param"
            goto L_0x023c
        L_0x03a1:
            if (r10 != 0) goto L_0x03c4
            h5.g3 r5 = r7.w
            h5.i4.n(r5)
            h5.b3 r6 = r7.A
            h5.i4.l(r6)
            java.lang.String r4 = r6.l(r4)
            h5.b3 r6 = r7.A
            h5.i4.l(r6)
            java.lang.String r6 = r6.m(r14)
            h5.e3 r5 = r5.B
            java.lang.String r8 = "Missing param for filter. event, param"
            r5.c(r4, r6, r8)
        L_0x03c1:
            java.lang.Boolean r11 = java.lang.Boolean.FALSE
            goto L_0x03e3
        L_0x03c4:
            h5.g3 r5 = r7.w
            h5.i4.n(r5)
            h5.b3 r6 = r7.A
            h5.i4.l(r6)
            java.lang.String r4 = r6.l(r4)
            h5.b3 r6 = r7.A
            h5.i4.l(r6)
            java.lang.String r6 = r6.m(r14)
            h5.e3 r5 = r5.w
            java.lang.String r8 = "Unknown param type. event, param"
            goto L_0x023c
        L_0x03e1:
            java.lang.Boolean r11 = java.lang.Boolean.TRUE
        L_0x03e3:
            h5.g3 r4 = r7.w
            h5.i4.n(r4)
            if (r11 != 0) goto L_0x03ed
            java.lang.String r5 = "null"
            goto L_0x03ee
        L_0x03ed:
            r5 = r11
        L_0x03ee:
            java.lang.String r6 = "Event filter result"
            h5.e3 r4 = r4.B
            r4.b(r5, r6)
            if (r11 != 0) goto L_0x03f8
            return r13
        L_0x03f8:
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            r0.f5618c = r4
            boolean r5 = r11.booleanValue()
            if (r5 != 0) goto L_0x0404
            r5 = 1
            return r5
        L_0x0404:
            r0.d = r4
            if (r1 == 0) goto L_0x0436
            boolean r1 = r20.v()
            if (r1 == 0) goto L_0x0436
            long r4 = r20.w()
            java.lang.Long r1 = java.lang.Long.valueOf(r4)
            boolean r4 = r3.A()
            if (r4 == 0) goto L_0x042a
            if (r2 == 0) goto L_0x0427
            boolean r2 = r3.x()
            if (r2 != 0) goto L_0x0425
            goto L_0x0427
        L_0x0425:
            r1 = r18
        L_0x0427:
            r0.f5620f = r1
            goto L_0x0436
        L_0x042a:
            if (r2 == 0) goto L_0x0434
            boolean r2 = r3.x()
            if (r2 == 0) goto L_0x0434
            r1 = r19
        L_0x0434:
            r0.f5619e = r1
        L_0x0436:
            r1 = 1
            return r1
        L_0x0438:
            h5.g3 r1 = r7.w
            h5.i4.n(r1)
            h5.f3 r2 = h5.g3.p(r4)
            boolean r4 = r3.r()
            if (r4 == 0) goto L_0x0450
            int r3 = r3.s()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r3)
            goto L_0x0451
        L_0x0450:
            r11 = 0
        L_0x0451:
            java.lang.String r3 = java.lang.String.valueOf(r11)
            h5.e3 r1 = r1.w
            java.lang.String r4 = "Invalid event filter ID. appId, id"
            r1.c(r2, r3, r4)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: h5.n7.g(java.lang.Long, java.lang.Long, com.google.android.gms.internal.measurement.x2, long, h5.m, boolean):boolean");
    }
}
