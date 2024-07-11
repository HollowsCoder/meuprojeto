package h5;

import com.google.android.gms.internal.measurement.g2;

public final class p7 extends o7 {

    /* renamed from: g  reason: collision with root package name */
    public final g2 f5640g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ q7 f5641h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p7(q7 q7Var, String str, int i10, g2 g2Var) {
        super(str, i10);
        this.f5641h = q7Var;
        this.f5640g = g2Var;
    }

    public final int a() {
        return this.f5640g.s();
    }

    public final boolean b() {
        return true;
    }

    public final boolean c() {
        return false;
    }

    /* JADX WARNING: type inference failed for: r5v11, types: [java.lang.Integer] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0171  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0174  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x017e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x017f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean g(java.lang.Long r17, java.lang.Long r18, com.google.android.gms.internal.measurement.q3 r19, boolean r20) {
        /*
            r16 = this;
            r0 = r16
            com.google.android.gms.internal.measurement.ba.a()
            h5.q7 r1 = r0.f5641h
            h5.i4 r2 = r1.f5649o
            h5.e r2 = r2.u
            java.lang.String r3 = r0.f5616a
            h5.s2<java.lang.Boolean> r4 = h5.u2.W
            boolean r2 = r2.m(r3, r4)
            com.google.android.gms.internal.measurement.g2 r3 = r0.f5640g
            boolean r4 = r3.v()
            boolean r5 = r3.w()
            boolean r6 = r3.y()
            r7 = 0
            r8 = 1
            if (r4 != 0) goto L_0x002c
            if (r5 != 0) goto L_0x002c
            if (r6 == 0) goto L_0x002a
            goto L_0x002c
        L_0x002a:
            r4 = r7
            goto L_0x002d
        L_0x002c:
            r4 = r8
        L_0x002d:
            r5 = 0
            h5.i4 r1 = r1.f5649o
            if (r20 == 0) goto L_0x0055
            if (r4 != 0) goto L_0x0055
            h5.g3 r1 = r1.w
            h5.i4.n(r1)
            int r2 = r0.f5617b
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            boolean r4 = r3.r()
            if (r4 == 0) goto L_0x004d
            int r3 = r3.s()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
        L_0x004d:
            java.lang.String r3 = "Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID"
            h5.e3 r1 = r1.B
            r1.c(r2, r5, r3)
            return r8
        L_0x0055:
            com.google.android.gms.internal.measurement.a2 r9 = r3.u()
            boolean r10 = r9.w()
            boolean r11 = r19.w()
            r12 = 0
            if (r11 == 0) goto L_0x0096
            boolean r11 = r9.t()
            if (r11 != 0) goto L_0x0083
            h5.g3 r9 = r1.w
            h5.i4.n(r9)
            h5.b3 r10 = r1.A
            h5.i4.l(r10)
            java.lang.String r11 = r19.t()
            java.lang.String r10 = r10.n(r11)
            h5.e3 r9 = r9.w
            java.lang.String r11 = "No number filter for long property. property"
            goto L_0x0167
        L_0x0083:
            long r14 = r19.x()
            com.google.android.gms.internal.measurement.e2 r9 = r9.u()
            java.math.BigDecimal r11 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x014c }
            r11.<init>(r14)     // Catch:{ NumberFormatException -> 0x014c }
            java.lang.Boolean r5 = h5.o7.f(r11, r9, r12)     // Catch:{ NumberFormatException -> 0x014c }
            goto L_0x014c
        L_0x0096:
            boolean r11 = r19.y()
            if (r11 == 0) goto L_0x00d1
            boolean r11 = r9.t()
            if (r11 != 0) goto L_0x00ba
            h5.g3 r9 = r1.w
            h5.i4.n(r9)
            h5.b3 r10 = r1.A
            h5.i4.l(r10)
            java.lang.String r11 = r19.t()
            java.lang.String r10 = r10.n(r11)
            h5.e3 r9 = r9.w
            java.lang.String r11 = "No number filter for double property. property"
            goto L_0x0167
        L_0x00ba:
            double r11 = r19.z()
            com.google.android.gms.internal.measurement.e2 r9 = r9.u()
            java.math.BigDecimal r13 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x014c }
            r13.<init>(r11)     // Catch:{ NumberFormatException -> 0x014c }
            double r11 = java.lang.Math.ulp(r11)     // Catch:{ NumberFormatException -> 0x014c }
            java.lang.Boolean r5 = h5.o7.f(r13, r9, r11)     // Catch:{ NumberFormatException -> 0x014c }
            goto L_0x014c
        L_0x00d1:
            boolean r11 = r19.u()
            if (r11 == 0) goto L_0x0151
            boolean r11 = r9.r()
            if (r11 != 0) goto L_0x013b
            boolean r11 = r9.t()
            if (r11 != 0) goto L_0x00fa
            h5.g3 r9 = r1.w
            h5.i4.n(r9)
            h5.b3 r10 = r1.A
            h5.i4.l(r10)
            java.lang.String r11 = r19.t()
            java.lang.String r10 = r10.n(r11)
            h5.e3 r9 = r9.w
            java.lang.String r11 = "No string or number filter defined. property"
            goto L_0x0167
        L_0x00fa:
            java.lang.String r11 = r19.v()
            boolean r11 = h5.b7.x(r11)
            if (r11 == 0) goto L_0x011d
            java.lang.String r11 = r19.v()
            com.google.android.gms.internal.measurement.e2 r9 = r9.u()
            boolean r14 = h5.b7.x(r11)
            if (r14 != 0) goto L_0x0113
            goto L_0x014c
        L_0x0113:
            java.math.BigDecimal r14 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x014c }
            r14.<init>(r11)     // Catch:{ NumberFormatException -> 0x014c }
            java.lang.Boolean r5 = h5.o7.f(r14, r9, r12)     // Catch:{ NumberFormatException -> 0x014c }
            goto L_0x014c
        L_0x011d:
            h5.g3 r9 = r1.w
            h5.i4.n(r9)
            h5.b3 r10 = r1.A
            h5.i4.l(r10)
            java.lang.String r11 = r19.t()
            java.lang.String r10 = r10.n(r11)
            java.lang.String r11 = r19.v()
            h5.e3 r9 = r9.w
            java.lang.String r12 = "Invalid user property value for Numeric number filter. property, value"
            r9.c(r10, r11, r12)
            goto L_0x016a
        L_0x013b:
            java.lang.String r5 = r19.v()
            com.google.android.gms.internal.measurement.k2 r9 = r9.s()
            h5.g3 r11 = r1.w
            h5.i4.n(r11)
            java.lang.Boolean r5 = h5.o7.e(r5, r9, r11)
        L_0x014c:
            java.lang.Boolean r5 = h5.o7.d(r5, r10)
            goto L_0x016a
        L_0x0151:
            h5.g3 r9 = r1.w
            h5.i4.n(r9)
            h5.b3 r10 = r1.A
            h5.i4.l(r10)
            java.lang.String r11 = r19.t()
            java.lang.String r10 = r10.n(r11)
            h5.e3 r9 = r9.w
            java.lang.String r11 = "User property has no value, property"
        L_0x0167:
            r9.b(r10, r11)
        L_0x016a:
            h5.g3 r1 = r1.w
            h5.i4.n(r1)
            if (r5 != 0) goto L_0x0174
            java.lang.String r9 = "null"
            goto L_0x0175
        L_0x0174:
            r9 = r5
        L_0x0175:
            java.lang.String r10 = "Property filter result"
            h5.e3 r1 = r1.B
            r1.b(r9, r10)
            if (r5 != 0) goto L_0x017f
            return r7
        L_0x017f:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r0.f5618c = r1
            if (r6 == 0) goto L_0x018d
            boolean r1 = r5.booleanValue()
            if (r1 == 0) goto L_0x018c
            goto L_0x018d
        L_0x018c:
            return r8
        L_0x018d:
            if (r20 == 0) goto L_0x0195
            boolean r1 = r3.v()
            if (r1 == 0) goto L_0x0197
        L_0x0195:
            r0.d = r5
        L_0x0197:
            boolean r1 = r5.booleanValue()
            if (r1 == 0) goto L_0x01d6
            if (r4 == 0) goto L_0x01d6
            boolean r1 = r19.r()
            if (r1 == 0) goto L_0x01d6
            long r4 = r19.s()
            if (r17 == 0) goto L_0x01af
            long r4 = r17.longValue()
        L_0x01af:
            if (r2 == 0) goto L_0x01c3
            boolean r1 = r3.v()
            if (r1 == 0) goto L_0x01c3
            boolean r1 = r3.w()
            if (r1 != 0) goto L_0x01c3
            if (r18 == 0) goto L_0x01c3
            long r4 = r18.longValue()
        L_0x01c3:
            boolean r1 = r3.w()
            if (r1 == 0) goto L_0x01d0
            java.lang.Long r1 = java.lang.Long.valueOf(r4)
            r0.f5620f = r1
            goto L_0x01d6
        L_0x01d0:
            java.lang.Long r1 = java.lang.Long.valueOf(r4)
            r0.f5619e = r1
        L_0x01d6:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: h5.p7.g(java.lang.Long, java.lang.Long, com.google.android.gms.internal.measurement.q3, boolean):boolean");
    }
}
