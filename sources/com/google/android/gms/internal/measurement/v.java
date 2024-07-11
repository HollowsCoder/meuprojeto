package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;

public final class v extends u {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f2960b;

    public v(int i10) {
        this.f2960b = i10;
        if (i10 == 1) {
            ArrayList arrayList = this.f2943a;
            arrayList.add(z.FOR_IN);
            arrayList.add(z.FOR_IN_CONST);
            arrayList.add(z.FOR_IN_LET);
            arrayList.add(z.FOR_LET);
            arrayList.add(z.FOR_OF);
            arrayList.add(z.FOR_OF_CONST);
            arrayList.add(z.FOR_OF_LET);
            arrayList.add(z.WHILE);
        } else if (i10 != 2) {
            ArrayList arrayList2 = this.f2943a;
            arrayList2.add(z.EQUALS);
            arrayList2.add(z.GREATER_THAN);
            arrayList2.add(z.GREATER_THAN_EQUALS);
            arrayList2.add(z.IDENTITY_EQUALS);
            arrayList2.add(z.IDENTITY_NOT_EQUALS);
            arrayList2.add(z.LESS_THAN);
            arrayList2.add(z.LESS_THAN_EQUALS);
            arrayList2.add(z.NOT_EQUALS);
        } else {
            ArrayList arrayList3 = this.f2943a;
            arrayList3.add(z.ASSIGN);
            arrayList3.add(z.CONST);
            arrayList3.add(z.CREATE_ARRAY);
            arrayList3.add(z.CREATE_OBJECT);
            arrayList3.add(z.EXPRESSION_LIST);
            arrayList3.add(z.GET);
            arrayList3.add(z.GET_INDEX);
            arrayList3.add(z.GET_PROPERTY);
            arrayList3.add(z.NULL);
            arrayList3.add(z.SET_PROPERTY);
            arrayList3.add(z.TYPEOF);
            arrayList3.add(z.UNDEFINED);
            arrayList3.add(z.VAR);
        }
    }

    public static o c(y yVar, o oVar, o oVar2) {
        return g(yVar, oVar.i(), oVar2);
    }

    public static boolean d(o oVar, o oVar2) {
        if (oVar instanceof k) {
            oVar = new r(oVar.zzc());
        }
        if (oVar2 instanceof k) {
            oVar2 = new r(oVar2.zzc());
        }
        if ((oVar instanceof r) && (oVar2 instanceof r)) {
            return oVar.zzc().compareTo(oVar2.zzc()) < 0;
        }
        double doubleValue = oVar.b().doubleValue();
        double doubleValue2 = oVar2.b().doubleValue();
        return !Double.isNaN(doubleValue) && !Double.isNaN(doubleValue2) && Double.compare(doubleValue, doubleValue2) < 0;
    }

    public static o e(y yVar, o oVar, o oVar2) {
        if (oVar instanceof Iterable) {
            return g(yVar, ((Iterable) oVar).iterator(), oVar2);
        }
        throw new IllegalArgumentException("Non-iterable type in for...of loop.");
    }

    public static boolean f(o oVar, o oVar2) {
        if (oVar.getClass().equals(oVar2.getClass())) {
            if ((oVar instanceof s) || (oVar instanceof m)) {
                return true;
            }
            if (!(oVar instanceof h)) {
                return oVar instanceof r ? oVar.zzc().equals(oVar2.zzc()) : oVar instanceof f ? oVar.c().equals(oVar2.c()) : oVar == oVar2;
            }
            if (Double.isNaN(oVar.b().doubleValue()) || Double.isNaN(oVar2.b().doubleValue())) {
                return false;
            }
            return oVar.b().equals(oVar2.b());
        } else if (((oVar instanceof s) || (oVar instanceof m)) && ((oVar2 instanceof s) || (oVar2 instanceof m))) {
            return true;
        } else {
            boolean z = oVar instanceof h;
            if (z && (oVar2 instanceof r)) {
                return f(oVar, new h(oVar2.b()));
            }
            boolean z10 = oVar instanceof r;
            if (z10 && (oVar2 instanceof h)) {
                return f(new h(oVar.b()), oVar2);
            }
            if (oVar instanceof f) {
                return f(new h(oVar.b()), oVar2);
            }
            if (oVar2 instanceof f) {
                return f(oVar, new h(oVar2.b()));
            }
            if ((z10 || z) && (oVar2 instanceof k)) {
                return f(oVar, new r(oVar2.zzc()));
            }
            if (!(oVar instanceof k) || (!(oVar2 instanceof r) && !(oVar2 instanceof h))) {
                return false;
            }
            return f(new r(oVar.zzc()), oVar2);
        }
    }

    public static o g(y yVar, Iterator it, o oVar) {
        if (it != null) {
            while (it.hasNext()) {
                o b10 = yVar.g((o) it.next()).b((e) oVar);
                if (b10 instanceof g) {
                    g gVar = (g) b10;
                    if ("break".equals(gVar.f2710p)) {
                        return o.f2850a;
                    }
                    if ("return".equals(gVar.f2710p)) {
                        return gVar;
                    }
                }
            }
        }
        return o.f2850a;
    }

    public static boolean h(o oVar, o oVar2) {
        if (oVar instanceof k) {
            oVar = new r(oVar.zzc());
        }
        if (oVar2 instanceof k) {
            oVar2 = new r(oVar2.zzc());
        }
        return (((oVar instanceof r) && (oVar2 instanceof r)) || (!Double.isNaN(oVar.b().doubleValue()) && !Double.isNaN(oVar2.b().doubleValue()))) && !d(oVar2, oVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:280:?, code lost:
        return e(r1, r0, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:?, code lost:
        return c(r1, r0, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x025d, code lost:
        if ("return".equals(r1.f2710p) != false) goto L_0x025f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.measurement.o a(java.lang.String r11, com.google.android.gms.internal.measurement.i3 r12, java.util.ArrayList r13) {
        /*
            r10 = this;
            r0 = 0
            int r1 = r10.f2960b
            r2 = 3
            r3 = 0
            r4 = 2
            r5 = 1
            switch(r1) {
                case 0: goto L_0x0295;
                case 1: goto L_0x000c;
                default: goto L_0x000a;
            }
        L_0x000a:
            goto L_0x0303
        L_0x000c:
            com.google.android.gms.internal.measurement.z r1 = com.google.android.gms.internal.measurement.z.ADD
            com.google.android.gms.internal.measurement.z r1 = androidx.databinding.a.K(r11)
            int r1 = r1.ordinal()
            r6 = 65
            r7 = 4
            java.lang.String r8 = "return"
            java.lang.String r9 = "break"
            if (r1 == r6) goto L_0x0214
            r6 = 6
            switch(r1) {
                case 26: goto L_0x01d9;
                case 27: goto L_0x01a3;
                case 28: goto L_0x016d;
                case 29: goto L_0x00ce;
                case 30: goto L_0x0093;
                case 31: goto L_0x005d;
                case 32: goto L_0x0027;
                default: goto L_0x0023;
            }
        L_0x0023:
            r10.b(r11)
            throw r0
        L_0x0027:
            com.google.android.gms.internal.measurement.z r11 = com.google.android.gms.internal.measurement.z.FOR_OF_LET
            java.lang.Object r11 = androidx.appcompat.widget.x0.b(r11, r2, r13, r3)
            boolean r11 = r11 instanceof com.google.android.gms.internal.measurement.r
            if (r11 == 0) goto L_0x0055
            java.lang.Object r11 = r13.get(r3)
            com.google.android.gms.internal.measurement.o r11 = (com.google.android.gms.internal.measurement.o) r11
            java.lang.String r11 = r11.zzc()
            java.lang.Object r0 = r13.get(r5)
            com.google.android.gms.internal.measurement.o r0 = (com.google.android.gms.internal.measurement.o) r0
            com.google.android.gms.internal.measurement.o r0 = r12.a(r0)
            java.lang.Object r13 = r13.get(r4)
            com.google.android.gms.internal.measurement.o r13 = (com.google.android.gms.internal.measurement.o) r13
            com.google.android.gms.internal.measurement.o r13 = r12.a(r13)
            androidx.appcompat.widget.m r1 = new androidx.appcompat.widget.m
            r1.<init>(r6, r12, r11)
            goto L_0x00c0
        L_0x0055:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r12 = "Variable name in FOR_OF_LET must be a string"
            r11.<init>(r12)
            throw r11
        L_0x005d:
            com.google.android.gms.internal.measurement.z r11 = com.google.android.gms.internal.measurement.z.FOR_OF_CONST
            java.lang.Object r11 = androidx.appcompat.widget.x0.b(r11, r2, r13, r3)
            boolean r11 = r11 instanceof com.google.android.gms.internal.measurement.r
            if (r11 == 0) goto L_0x008b
            java.lang.Object r11 = r13.get(r3)
            com.google.android.gms.internal.measurement.o r11 = (com.google.android.gms.internal.measurement.o) r11
            java.lang.String r11 = r11.zzc()
            java.lang.Object r0 = r13.get(r5)
            com.google.android.gms.internal.measurement.o r0 = (com.google.android.gms.internal.measurement.o) r0
            com.google.android.gms.internal.measurement.o r0 = r12.a(r0)
            java.lang.Object r13 = r13.get(r4)
            com.google.android.gms.internal.measurement.o r13 = (com.google.android.gms.internal.measurement.o) r13
            com.google.android.gms.internal.measurement.o r13 = r12.a(r13)
            s2.t r1 = new s2.t
            r1.<init>((java.lang.Object) r12, (java.lang.Object) r11)
            goto L_0x00c0
        L_0x008b:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r12 = "Variable name in FOR_OF_CONST must be a string"
            r11.<init>(r12)
            throw r11
        L_0x0093:
            com.google.android.gms.internal.measurement.z r11 = com.google.android.gms.internal.measurement.z.FOR_OF
            java.lang.Object r11 = androidx.appcompat.widget.x0.b(r11, r2, r13, r3)
            boolean r11 = r11 instanceof com.google.android.gms.internal.measurement.r
            if (r11 == 0) goto L_0x00c6
            java.lang.Object r11 = r13.get(r3)
            com.google.android.gms.internal.measurement.o r11 = (com.google.android.gms.internal.measurement.o) r11
            java.lang.String r11 = r11.zzc()
            java.lang.Object r0 = r13.get(r5)
            com.google.android.gms.internal.measurement.o r0 = (com.google.android.gms.internal.measurement.o) r0
            com.google.android.gms.internal.measurement.o r0 = r12.a(r0)
            java.lang.Object r13 = r13.get(r4)
            com.google.android.gms.internal.measurement.o r13 = (com.google.android.gms.internal.measurement.o) r13
            com.google.android.gms.internal.measurement.o r13 = r12.a(r13)
            m1.i r1 = new m1.i
            r1.<init>(r2, r12, r11)
        L_0x00c0:
            com.google.android.gms.internal.measurement.o r11 = e(r1, r0, r13)
            goto L_0x0294
        L_0x00c6:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r12 = "Variable name in FOR_OF must be a string"
            r11.<init>(r12)
            throw r11
        L_0x00ce:
            com.google.android.gms.internal.measurement.z r11 = com.google.android.gms.internal.measurement.z.FOR_LET
            java.lang.Object r11 = androidx.appcompat.widget.x0.b(r11, r7, r13, r3)
            com.google.android.gms.internal.measurement.o r11 = (com.google.android.gms.internal.measurement.o) r11
            com.google.android.gms.internal.measurement.o r11 = r12.a(r11)
            boolean r0 = r11 instanceof com.google.android.gms.internal.measurement.e
            if (r0 == 0) goto L_0x0165
            com.google.android.gms.internal.measurement.e r11 = (com.google.android.gms.internal.measurement.e) r11
            java.lang.Object r0 = r13.get(r5)
            com.google.android.gms.internal.measurement.o r0 = (com.google.android.gms.internal.measurement.o) r0
            java.lang.Object r1 = r13.get(r4)
            com.google.android.gms.internal.measurement.o r1 = (com.google.android.gms.internal.measurement.o) r1
            java.lang.Object r13 = r13.get(r2)
            com.google.android.gms.internal.measurement.o r13 = (com.google.android.gms.internal.measurement.o) r13
            com.google.android.gms.internal.measurement.o r13 = r12.a(r13)
            com.google.android.gms.internal.measurement.i3 r2 = r12.c()
            r4 = r3
        L_0x00fb:
            int r5 = r11.p()
            if (r4 >= r5) goto L_0x0113
            com.google.android.gms.internal.measurement.o r5 = r11.u(r4)
            java.lang.String r5 = r5.zzc()
            com.google.android.gms.internal.measurement.o r6 = r12.g(r5)
            r2.e(r5, r6)
            int r4 = r4 + 1
            goto L_0x00fb
        L_0x0113:
            com.google.android.gms.internal.measurement.o r4 = r12.a(r0)
            java.lang.Boolean r4 = r4.c()
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x0292
            r4 = r13
            com.google.android.gms.internal.measurement.e r4 = (com.google.android.gms.internal.measurement.e) r4
            com.google.android.gms.internal.measurement.o r4 = r12.b(r4)
            boolean r5 = r4 instanceof com.google.android.gms.internal.measurement.g
            if (r5 == 0) goto L_0x0143
            com.google.android.gms.internal.measurement.g r4 = (com.google.android.gms.internal.measurement.g) r4
            java.lang.String r5 = r4.f2710p
            boolean r5 = r9.equals(r5)
            if (r5 == 0) goto L_0x0138
            goto L_0x0292
        L_0x0138:
            java.lang.String r5 = r4.f2710p
            boolean r5 = r8.equals(r5)
            if (r5 == 0) goto L_0x0143
            r11 = r4
            goto L_0x0294
        L_0x0143:
            com.google.android.gms.internal.measurement.i3 r4 = r12.c()
            r5 = r3
        L_0x0148:
            int r6 = r11.p()
            if (r5 >= r6) goto L_0x0160
            com.google.android.gms.internal.measurement.o r6 = r11.u(r5)
            java.lang.String r6 = r6.zzc()
            com.google.android.gms.internal.measurement.o r7 = r2.g(r6)
            r4.e(r6, r7)
            int r5 = r5 + 1
            goto L_0x0148
        L_0x0160:
            r4.a(r1)
            r2 = r4
            goto L_0x0113
        L_0x0165:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r12 = "Initializer variables in FOR_LET must be an ArrayList"
            r11.<init>(r12)
            throw r11
        L_0x016d:
            com.google.android.gms.internal.measurement.z r11 = com.google.android.gms.internal.measurement.z.FOR_IN_LET
            java.lang.Object r11 = androidx.appcompat.widget.x0.b(r11, r2, r13, r3)
            boolean r11 = r11 instanceof com.google.android.gms.internal.measurement.r
            if (r11 == 0) goto L_0x019b
            java.lang.Object r11 = r13.get(r3)
            com.google.android.gms.internal.measurement.o r11 = (com.google.android.gms.internal.measurement.o) r11
            java.lang.String r11 = r11.zzc()
            java.lang.Object r0 = r13.get(r5)
            com.google.android.gms.internal.measurement.o r0 = (com.google.android.gms.internal.measurement.o) r0
            com.google.android.gms.internal.measurement.o r0 = r12.a(r0)
            java.lang.Object r13 = r13.get(r4)
            com.google.android.gms.internal.measurement.o r13 = (com.google.android.gms.internal.measurement.o) r13
            com.google.android.gms.internal.measurement.o r13 = r12.a(r13)
            androidx.appcompat.widget.m r1 = new androidx.appcompat.widget.m
            r1.<init>(r6, r12, r11)
            goto L_0x0206
        L_0x019b:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r12 = "Variable name in FOR_IN_LET must be a string"
            r11.<init>(r12)
            throw r11
        L_0x01a3:
            com.google.android.gms.internal.measurement.z r11 = com.google.android.gms.internal.measurement.z.FOR_IN_CONST
            java.lang.Object r11 = androidx.appcompat.widget.x0.b(r11, r2, r13, r3)
            boolean r11 = r11 instanceof com.google.android.gms.internal.measurement.r
            if (r11 == 0) goto L_0x01d1
            java.lang.Object r11 = r13.get(r3)
            com.google.android.gms.internal.measurement.o r11 = (com.google.android.gms.internal.measurement.o) r11
            java.lang.String r11 = r11.zzc()
            java.lang.Object r0 = r13.get(r5)
            com.google.android.gms.internal.measurement.o r0 = (com.google.android.gms.internal.measurement.o) r0
            com.google.android.gms.internal.measurement.o r0 = r12.a(r0)
            java.lang.Object r13 = r13.get(r4)
            com.google.android.gms.internal.measurement.o r13 = (com.google.android.gms.internal.measurement.o) r13
            com.google.android.gms.internal.measurement.o r13 = r12.a(r13)
            s2.t r1 = new s2.t
            r1.<init>((java.lang.Object) r12, (java.lang.Object) r11)
            goto L_0x0206
        L_0x01d1:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r12 = "Variable name in FOR_IN_CONST must be a string"
            r11.<init>(r12)
            throw r11
        L_0x01d9:
            com.google.android.gms.internal.measurement.z r11 = com.google.android.gms.internal.measurement.z.FOR_IN
            java.lang.Object r11 = androidx.appcompat.widget.x0.b(r11, r2, r13, r3)
            boolean r11 = r11 instanceof com.google.android.gms.internal.measurement.r
            if (r11 == 0) goto L_0x020c
            java.lang.Object r11 = r13.get(r3)
            com.google.android.gms.internal.measurement.o r11 = (com.google.android.gms.internal.measurement.o) r11
            java.lang.String r11 = r11.zzc()
            java.lang.Object r0 = r13.get(r5)
            com.google.android.gms.internal.measurement.o r0 = (com.google.android.gms.internal.measurement.o) r0
            com.google.android.gms.internal.measurement.o r0 = r12.a(r0)
            java.lang.Object r13 = r13.get(r4)
            com.google.android.gms.internal.measurement.o r13 = (com.google.android.gms.internal.measurement.o) r13
            com.google.android.gms.internal.measurement.o r13 = r12.a(r13)
            m1.i r1 = new m1.i
            r1.<init>(r2, r12, r11)
        L_0x0206:
            com.google.android.gms.internal.measurement.o r11 = c(r1, r0, r13)
            goto L_0x0294
        L_0x020c:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r12 = "Variable name in FOR_IN must be a string"
            r11.<init>(r12)
            throw r11
        L_0x0214:
            com.google.android.gms.internal.measurement.z r11 = com.google.android.gms.internal.measurement.z.WHILE
            java.lang.Object r11 = androidx.appcompat.widget.x0.b(r11, r7, r13, r3)
            com.google.android.gms.internal.measurement.o r11 = (com.google.android.gms.internal.measurement.o) r11
            java.lang.Object r0 = r13.get(r5)
            com.google.android.gms.internal.measurement.o r0 = (com.google.android.gms.internal.measurement.o) r0
            java.lang.Object r1 = r13.get(r4)
            com.google.android.gms.internal.measurement.o r1 = (com.google.android.gms.internal.measurement.o) r1
            java.lang.Object r13 = r13.get(r2)
            com.google.android.gms.internal.measurement.o r13 = (com.google.android.gms.internal.measurement.o) r13
            com.google.android.gms.internal.measurement.o r13 = r12.a(r13)
            com.google.android.gms.internal.measurement.o r1 = r12.a(r1)
            java.lang.Boolean r1 = r1.c()
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L_0x0241
            goto L_0x0261
        L_0x0241:
            r1 = r13
            com.google.android.gms.internal.measurement.e r1 = (com.google.android.gms.internal.measurement.e) r1
            com.google.android.gms.internal.measurement.o r1 = r12.b(r1)
            boolean r2 = r1 instanceof com.google.android.gms.internal.measurement.g
            if (r2 == 0) goto L_0x0261
            com.google.android.gms.internal.measurement.g r1 = (com.google.android.gms.internal.measurement.g) r1
            java.lang.String r2 = r1.f2710p
            boolean r2 = r9.equals(r2)
            if (r2 == 0) goto L_0x0257
            goto L_0x0292
        L_0x0257:
            java.lang.String r2 = r1.f2710p
            boolean r2 = r8.equals(r2)
            if (r2 == 0) goto L_0x0261
        L_0x025f:
            r11 = r1
            goto L_0x0294
        L_0x0261:
            com.google.android.gms.internal.measurement.o r1 = r12.a(r11)
            java.lang.Boolean r1 = r1.c()
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x0292
            r1 = r13
            com.google.android.gms.internal.measurement.e r1 = (com.google.android.gms.internal.measurement.e) r1
            com.google.android.gms.internal.measurement.o r1 = r12.b(r1)
            boolean r2 = r1 instanceof com.google.android.gms.internal.measurement.g
            if (r2 == 0) goto L_0x028e
            com.google.android.gms.internal.measurement.g r1 = (com.google.android.gms.internal.measurement.g) r1
            java.lang.String r2 = r1.f2710p
            boolean r2 = r9.equals(r2)
            if (r2 == 0) goto L_0x0285
            goto L_0x0292
        L_0x0285:
            java.lang.String r2 = r1.f2710p
            boolean r2 = r8.equals(r2)
            if (r2 == 0) goto L_0x028e
            goto L_0x025f
        L_0x028e:
            r12.a(r0)
            goto L_0x0261
        L_0x0292:
            com.google.android.gms.internal.measurement.s r11 = com.google.android.gms.internal.measurement.o.f2850a
        L_0x0294:
            return r11
        L_0x0295:
            com.google.android.gms.internal.measurement.z r1 = androidx.databinding.a.K(r11)
            java.lang.String r1 = r1.name()
            androidx.databinding.a.A(r1, r4, r13)
            java.lang.Object r1 = r13.get(r3)
            com.google.android.gms.internal.measurement.o r1 = (com.google.android.gms.internal.measurement.o) r1
            com.google.android.gms.internal.measurement.o r1 = r12.a(r1)
            java.lang.Object r13 = r13.get(r5)
            com.google.android.gms.internal.measurement.o r13 = (com.google.android.gms.internal.measurement.o) r13
            com.google.android.gms.internal.measurement.o r12 = r12.a(r13)
            com.google.android.gms.internal.measurement.z r13 = androidx.databinding.a.K(r11)
            int r13 = r13.ordinal()
            r2 = 23
            if (r13 == r2) goto L_0x02f7
            r2 = 48
            if (r13 == r2) goto L_0x02f1
            r2 = 42
            if (r13 == r2) goto L_0x02ec
            r2 = 43
            if (r13 == r2) goto L_0x02e7
            switch(r13) {
                case 37: goto L_0x02e2;
                case 38: goto L_0x02dd;
                case 39: goto L_0x02d8;
                case 40: goto L_0x02d3;
                default: goto L_0x02cf;
            }
        L_0x02cf:
            r10.b(r11)
            throw r0
        L_0x02d3:
            boolean r11 = androidx.databinding.a.M(r1, r12)
            goto L_0x02f5
        L_0x02d8:
            boolean r11 = androidx.databinding.a.M(r1, r12)
            goto L_0x02fb
        L_0x02dd:
            boolean r11 = h(r12, r1)
            goto L_0x02fb
        L_0x02e2:
            boolean r11 = d(r12, r1)
            goto L_0x02fb
        L_0x02e7:
            boolean r11 = h(r1, r12)
            goto L_0x02fb
        L_0x02ec:
            boolean r11 = d(r1, r12)
            goto L_0x02fb
        L_0x02f1:
            boolean r11 = f(r1, r12)
        L_0x02f5:
            r11 = r11 ^ r5
            goto L_0x02fb
        L_0x02f7:
            boolean r11 = f(r1, r12)
        L_0x02fb:
            if (r11 == 0) goto L_0x0300
            com.google.android.gms.internal.measurement.f r11 = com.google.android.gms.internal.measurement.o.f2854f
            goto L_0x0302
        L_0x0300:
            com.google.android.gms.internal.measurement.f r11 = com.google.android.gms.internal.measurement.o.f2855g
        L_0x0302:
            return r11
        L_0x0303:
            com.google.android.gms.internal.measurement.z r1 = com.google.android.gms.internal.measurement.z.ADD
            com.google.android.gms.internal.measurement.z r1 = androidx.databinding.a.K(r11)
            int r1 = r1.ordinal()
            if (r1 == r2) goto L_0x065c
            r6 = 14
            if (r1 == r6) goto L_0x05e5
            r6 = 24
            if (r1 == r6) goto L_0x05bb
            r6 = 33
            if (r1 == r6) goto L_0x0589
            r6 = 49
            if (r1 == r6) goto L_0x057c
            r6 = 58
            if (r1 == r6) goto L_0x0514
            r2 = 17
            if (r1 == r2) goto L_0x04db
            r2 = 18
            if (r1 == r2) goto L_0x0472
            r2 = 35
            if (r1 == r2) goto L_0x03d8
            r2 = 36
            if (r1 == r2) goto L_0x03d8
            switch(r1) {
                case 62: goto L_0x0388;
                case 63: goto L_0x037d;
                case 64: goto L_0x033a;
                default: goto L_0x0336;
            }
        L_0x0336:
            r10.b(r11)
            throw r0
        L_0x033a:
            com.google.android.gms.internal.measurement.z r11 = com.google.android.gms.internal.measurement.z.VAR
            java.lang.String r11 = r11.name()
            androidx.databinding.a.G(r11, r5, r13)
            java.util.Iterator r11 = r13.iterator()
        L_0x0347:
            boolean r13 = r11.hasNext()
            if (r13 == 0) goto L_0x0641
            java.lang.Object r13 = r11.next()
            com.google.android.gms.internal.measurement.o r13 = (com.google.android.gms.internal.measurement.o) r13
            com.google.android.gms.internal.measurement.o r13 = r12.a(r13)
            boolean r0 = r13 instanceof com.google.android.gms.internal.measurement.r
            if (r0 == 0) goto L_0x0365
            java.lang.String r13 = r13.zzc()
            com.google.android.gms.internal.measurement.s r0 = com.google.android.gms.internal.measurement.o.f2850a
            r12.f(r13, r0)
            goto L_0x0347
        L_0x0365:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.Object[] r12 = new java.lang.Object[r5]
            java.lang.Class r13 = r13.getClass()
            java.lang.String r13 = r13.getCanonicalName()
            r12[r3] = r13
            java.lang.String r13 = "Expected string for var name. got %s"
            java.lang.String r12 = java.lang.String.format(r13, r12)
            r11.<init>(r12)
            throw r11
        L_0x037d:
            com.google.android.gms.internal.measurement.z r11 = com.google.android.gms.internal.measurement.z.UNDEFINED
            java.lang.String r11 = r11.name()
            androidx.databinding.a.A(r11, r3, r13)
            goto L_0x0641
        L_0x0388:
            com.google.android.gms.internal.measurement.z r11 = com.google.android.gms.internal.measurement.z.TYPEOF
            java.lang.Object r11 = androidx.appcompat.widget.x0.b(r11, r5, r13, r3)
            com.google.android.gms.internal.measurement.o r11 = (com.google.android.gms.internal.measurement.o) r11
            com.google.android.gms.internal.measurement.o r11 = r12.a(r11)
            boolean r12 = r11 instanceof com.google.android.gms.internal.measurement.s
            if (r12 == 0) goto L_0x039b
            java.lang.String r11 = "undefined"
            goto L_0x03c1
        L_0x039b:
            boolean r12 = r11 instanceof com.google.android.gms.internal.measurement.f
            if (r12 == 0) goto L_0x03a2
            java.lang.String r11 = "boolean"
            goto L_0x03c1
        L_0x03a2:
            boolean r12 = r11 instanceof com.google.android.gms.internal.measurement.h
            if (r12 == 0) goto L_0x03a9
            java.lang.String r11 = "number"
            goto L_0x03c1
        L_0x03a9:
            boolean r12 = r11 instanceof com.google.android.gms.internal.measurement.r
            if (r12 == 0) goto L_0x03b0
            java.lang.String r11 = "string"
            goto L_0x03c1
        L_0x03b0:
            boolean r12 = r11 instanceof com.google.android.gms.internal.measurement.n
            if (r12 == 0) goto L_0x03b7
            java.lang.String r11 = "function"
            goto L_0x03c1
        L_0x03b7:
            boolean r12 = r11 instanceof com.google.android.gms.internal.measurement.p
            if (r12 != 0) goto L_0x03c8
            boolean r12 = r11 instanceof com.google.android.gms.internal.measurement.g
            if (r12 != 0) goto L_0x03c8
            java.lang.String r11 = "object"
        L_0x03c1:
            com.google.android.gms.internal.measurement.r r12 = new com.google.android.gms.internal.measurement.r
            r12.<init>(r11)
            goto L_0x055f
        L_0x03c8:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.Object[] r13 = new java.lang.Object[r5]
            r13[r3] = r11
            java.lang.String r11 = "Unsupported value type %s in typeof"
            java.lang.String r11 = java.lang.String.format(r11, r13)
            r12.<init>(r11)
            throw r12
        L_0x03d8:
            com.google.android.gms.internal.measurement.z r11 = com.google.android.gms.internal.measurement.z.GET_PROPERTY
            java.lang.Object r11 = androidx.appcompat.widget.x0.b(r11, r4, r13, r3)
            com.google.android.gms.internal.measurement.o r11 = (com.google.android.gms.internal.measurement.o) r11
            com.google.android.gms.internal.measurement.o r11 = r12.a(r11)
            java.lang.Object r13 = r13.get(r5)
            com.google.android.gms.internal.measurement.o r13 = (com.google.android.gms.internal.measurement.o) r13
            com.google.android.gms.internal.measurement.o r12 = r12.a(r13)
            boolean r13 = r11 instanceof com.google.android.gms.internal.measurement.e
            if (r13 == 0) goto L_0x0408
            boolean r13 = androidx.databinding.a.J(r12)
            if (r13 == 0) goto L_0x0408
            com.google.android.gms.internal.measurement.e r11 = (com.google.android.gms.internal.measurement.e) r11
            java.lang.Double r12 = r12.b()
            int r12 = r12.intValue()
            com.google.android.gms.internal.measurement.o r11 = r11.u(r12)
            goto L_0x0688
        L_0x0408:
            boolean r13 = r11 instanceof com.google.android.gms.internal.measurement.k
            if (r13 == 0) goto L_0x0418
            com.google.android.gms.internal.measurement.k r11 = (com.google.android.gms.internal.measurement.k) r11
            java.lang.String r12 = r12.zzc()
            com.google.android.gms.internal.measurement.o r11 = r11.e(r12)
            goto L_0x0688
        L_0x0418:
            boolean r13 = r11 instanceof com.google.android.gms.internal.measurement.r
            if (r13 == 0) goto L_0x0641
            java.lang.String r13 = r12.zzc()
            java.lang.String r0 = "length"
            boolean r13 = r0.equals(r13)
            if (r13 == 0) goto L_0x043c
            com.google.android.gms.internal.measurement.h r12 = new com.google.android.gms.internal.measurement.h
            java.lang.String r11 = r11.zzc()
            int r11 = r11.length()
            double r0 = (double) r11
            java.lang.Double r11 = java.lang.Double.valueOf(r0)
            r12.<init>(r11)
            goto L_0x055f
        L_0x043c:
            boolean r13 = androidx.databinding.a.J(r12)
            if (r13 == 0) goto L_0x0641
            java.lang.Double r13 = r12.b()
            double r0 = r13.doubleValue()
            java.lang.String r13 = r11.zzc()
            int r13 = r13.length()
            double r2 = (double) r13
            int r13 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r13 >= 0) goto L_0x0641
            com.google.android.gms.internal.measurement.r r13 = new com.google.android.gms.internal.measurement.r
            java.lang.String r11 = r11.zzc()
            java.lang.Double r12 = r12.b()
            int r12 = r12.intValue()
            char r11 = r11.charAt(r12)
            java.lang.String r11 = java.lang.String.valueOf(r11)
            r13.<init>(r11)
            goto L_0x0687
        L_0x0472:
            boolean r11 = r13.isEmpty()
            if (r11 == 0) goto L_0x047f
            com.google.android.gms.internal.measurement.l r11 = new com.google.android.gms.internal.measurement.l
            r11.<init>()
            goto L_0x0688
        L_0x047f:
            int r11 = r13.size()
            int r11 = r11 % r4
            if (r11 != 0) goto L_0x04c3
            com.google.android.gms.internal.measurement.l r11 = new com.google.android.gms.internal.measurement.l
            r11.<init>()
        L_0x048b:
            int r0 = r13.size()
            int r0 = r0 + -1
            if (r3 >= r0) goto L_0x0688
            java.lang.Object r0 = r13.get(r3)
            com.google.android.gms.internal.measurement.o r0 = (com.google.android.gms.internal.measurement.o) r0
            com.google.android.gms.internal.measurement.o r0 = r12.a(r0)
            int r1 = r3 + 1
            java.lang.Object r1 = r13.get(r1)
            com.google.android.gms.internal.measurement.o r1 = (com.google.android.gms.internal.measurement.o) r1
            com.google.android.gms.internal.measurement.o r1 = r12.a(r1)
            boolean r2 = r0 instanceof com.google.android.gms.internal.measurement.g
            if (r2 != 0) goto L_0x04bb
            boolean r2 = r1 instanceof com.google.android.gms.internal.measurement.g
            if (r2 != 0) goto L_0x04bb
            java.lang.String r0 = r0.zzc()
            r11.h(r0, r1)
            int r3 = r3 + 2
            goto L_0x048b
        L_0x04bb:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "Failed to evaluate map entry"
            r11.<init>(r12)
            throw r11
        L_0x04c3:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.Object[] r12 = new java.lang.Object[r5]
            int r13 = r13.size()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r12[r3] = r13
            java.lang.String r13 = "CREATE_OBJECT requires an even number of arguments, found %s"
            java.lang.String r12 = java.lang.String.format(r13, r12)
            r11.<init>(r12)
            throw r11
        L_0x04db:
            boolean r11 = r13.isEmpty()
            if (r11 == 0) goto L_0x04e8
            com.google.android.gms.internal.measurement.e r11 = new com.google.android.gms.internal.measurement.e
            r11.<init>()
            goto L_0x0688
        L_0x04e8:
            com.google.android.gms.internal.measurement.e r11 = new com.google.android.gms.internal.measurement.e
            r11.<init>()
            java.util.Iterator r13 = r13.iterator()
        L_0x04f1:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x0688
            java.lang.Object r0 = r13.next()
            com.google.android.gms.internal.measurement.o r0 = (com.google.android.gms.internal.measurement.o) r0
            com.google.android.gms.internal.measurement.o r0 = r12.a(r0)
            boolean r1 = r0 instanceof com.google.android.gms.internal.measurement.g
            if (r1 != 0) goto L_0x050c
            int r1 = r3 + 1
            r11.v(r3, r0)
            r3 = r1
            goto L_0x04f1
        L_0x050c:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "Failed to evaluate array element"
            r11.<init>(r12)
            throw r11
        L_0x0514:
            com.google.android.gms.internal.measurement.z r11 = com.google.android.gms.internal.measurement.z.SET_PROPERTY
            java.lang.Object r11 = androidx.appcompat.widget.x0.b(r11, r2, r13, r3)
            com.google.android.gms.internal.measurement.o r11 = (com.google.android.gms.internal.measurement.o) r11
            com.google.android.gms.internal.measurement.o r11 = r12.a(r11)
            java.lang.Object r0 = r13.get(r5)
            com.google.android.gms.internal.measurement.o r0 = (com.google.android.gms.internal.measurement.o) r0
            com.google.android.gms.internal.measurement.o r0 = r12.a(r0)
            java.lang.Object r13 = r13.get(r4)
            com.google.android.gms.internal.measurement.o r13 = (com.google.android.gms.internal.measurement.o) r13
            com.google.android.gms.internal.measurement.o r12 = r12.a(r13)
            com.google.android.gms.internal.measurement.s r13 = com.google.android.gms.internal.measurement.o.f2850a
            if (r11 == r13) goto L_0x0562
            com.google.android.gms.internal.measurement.m r13 = com.google.android.gms.internal.measurement.o.f2851b
            if (r11 == r13) goto L_0x0562
            boolean r13 = r11 instanceof com.google.android.gms.internal.measurement.e
            if (r13 == 0) goto L_0x0552
            boolean r13 = r0 instanceof com.google.android.gms.internal.measurement.h
            if (r13 == 0) goto L_0x0552
            com.google.android.gms.internal.measurement.e r11 = (com.google.android.gms.internal.measurement.e) r11
            java.lang.Double r13 = r0.b()
            int r13 = r13.intValue()
            r11.v(r13, r12)
            goto L_0x055f
        L_0x0552:
            boolean r13 = r11 instanceof com.google.android.gms.internal.measurement.k
            if (r13 == 0) goto L_0x055f
            com.google.android.gms.internal.measurement.k r11 = (com.google.android.gms.internal.measurement.k) r11
            java.lang.String r13 = r0.zzc()
            r11.h(r13, r12)
        L_0x055f:
            r11 = r12
            goto L_0x0688
        L_0x0562:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.Object[] r13 = new java.lang.Object[r4]
            java.lang.String r0 = r0.zzc()
            r13[r3] = r0
            java.lang.String r11 = r11.zzc()
            r13[r5] = r11
            java.lang.String r11 = "Can't set property %s of %s"
            java.lang.String r11 = java.lang.String.format(r11, r13)
            r12.<init>(r11)
            throw r12
        L_0x057c:
            com.google.android.gms.internal.measurement.z r11 = com.google.android.gms.internal.measurement.z.NULL
            java.lang.String r11 = r11.name()
            androidx.databinding.a.A(r11, r3, r13)
            com.google.android.gms.internal.measurement.m r11 = com.google.android.gms.internal.measurement.o.f2851b
            goto L_0x0688
        L_0x0589:
            com.google.android.gms.internal.measurement.z r11 = com.google.android.gms.internal.measurement.z.GET
            java.lang.Object r11 = androidx.appcompat.widget.x0.b(r11, r5, r13, r3)
            com.google.android.gms.internal.measurement.o r11 = (com.google.android.gms.internal.measurement.o) r11
            com.google.android.gms.internal.measurement.o r11 = r12.a(r11)
            boolean r13 = r11 instanceof com.google.android.gms.internal.measurement.r
            if (r13 == 0) goto L_0x05a3
            java.lang.String r11 = r11.zzc()
            com.google.android.gms.internal.measurement.o r11 = r12.g(r11)
            goto L_0x0688
        L_0x05a3:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.Object[] r13 = new java.lang.Object[r5]
            java.lang.Class r11 = r11.getClass()
            java.lang.String r11 = r11.getCanonicalName()
            r13[r3] = r11
            java.lang.String r11 = "Expected string for get var. got %s"
            java.lang.String r11 = java.lang.String.format(r11, r13)
            r12.<init>(r11)
            throw r12
        L_0x05bb:
            com.google.android.gms.internal.measurement.z r11 = com.google.android.gms.internal.measurement.z.EXPRESSION_LIST
            java.lang.String r11 = r11.name()
            androidx.databinding.a.G(r11, r5, r13)
            com.google.android.gms.internal.measurement.s r11 = com.google.android.gms.internal.measurement.o.f2850a
        L_0x05c6:
            int r0 = r13.size()
            if (r3 >= r0) goto L_0x0688
            java.lang.Object r11 = r13.get(r3)
            com.google.android.gms.internal.measurement.o r11 = (com.google.android.gms.internal.measurement.o) r11
            com.google.android.gms.internal.measurement.o r11 = r12.a(r11)
            boolean r0 = r11 instanceof com.google.android.gms.internal.measurement.g
            if (r0 != 0) goto L_0x05dd
            int r3 = r3 + 1
            goto L_0x05c6
        L_0x05dd:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "ControlValue cannot be in an expression list"
            r11.<init>(r12)
            throw r11
        L_0x05e5:
            com.google.android.gms.internal.measurement.z r11 = com.google.android.gms.internal.measurement.z.CONST
            java.lang.String r11 = r11.name()
            androidx.databinding.a.G(r11, r4, r13)
            int r11 = r13.size()
            int r11 = r11 % r4
            if (r11 != 0) goto L_0x0644
            r11 = r3
        L_0x05f6:
            int r0 = r13.size()
            int r0 = r0 + -1
            if (r11 >= r0) goto L_0x0641
            java.lang.Object r0 = r13.get(r11)
            com.google.android.gms.internal.measurement.o r0 = (com.google.android.gms.internal.measurement.o) r0
            com.google.android.gms.internal.measurement.o r0 = r12.a(r0)
            boolean r1 = r0 instanceof com.google.android.gms.internal.measurement.r
            if (r1 == 0) goto L_0x0629
            java.lang.String r0 = r0.zzc()
            int r1 = r11 + 1
            java.lang.Object r1 = r13.get(r1)
            com.google.android.gms.internal.measurement.o r1 = (com.google.android.gms.internal.measurement.o) r1
            com.google.android.gms.internal.measurement.o r1 = r12.a(r1)
            r12.f(r0, r1)
            java.util.HashMap r1 = r12.d
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r1.put(r0, r2)
            int r11 = r11 + 2
            goto L_0x05f6
        L_0x0629:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.Object[] r12 = new java.lang.Object[r5]
            java.lang.Class r13 = r0.getClass()
            java.lang.String r13 = r13.getCanonicalName()
            r12[r3] = r13
            java.lang.String r13 = "Expected string for const name. got %s"
            java.lang.String r12 = java.lang.String.format(r13, r12)
            r11.<init>(r12)
            throw r11
        L_0x0641:
            com.google.android.gms.internal.measurement.s r11 = com.google.android.gms.internal.measurement.o.f2850a
            goto L_0x0688
        L_0x0644:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.Object[] r12 = new java.lang.Object[r5]
            int r13 = r13.size()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r12[r3] = r13
            java.lang.String r13 = "CONST requires an even number of arguments, found %s"
            java.lang.String r12 = java.lang.String.format(r13, r12)
            r11.<init>(r12)
            throw r11
        L_0x065c:
            com.google.android.gms.internal.measurement.z r11 = com.google.android.gms.internal.measurement.z.ASSIGN
            java.lang.Object r11 = androidx.appcompat.widget.x0.b(r11, r4, r13, r3)
            com.google.android.gms.internal.measurement.o r11 = (com.google.android.gms.internal.measurement.o) r11
            com.google.android.gms.internal.measurement.o r11 = r12.a(r11)
            boolean r0 = r11 instanceof com.google.android.gms.internal.measurement.r
            if (r0 == 0) goto L_0x069d
            java.lang.String r0 = r11.zzc()
            boolean r0 = r12.d(r0)
            if (r0 == 0) goto L_0x0689
            java.lang.Object r13 = r13.get(r5)
            com.google.android.gms.internal.measurement.o r13 = (com.google.android.gms.internal.measurement.o) r13
            com.google.android.gms.internal.measurement.o r13 = r12.a(r13)
            java.lang.String r11 = r11.zzc()
            r12.e(r11, r13)
        L_0x0687:
            r11 = r13
        L_0x0688:
            return r11
        L_0x0689:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.Object[] r13 = new java.lang.Object[r5]
            java.lang.String r11 = r11.zzc()
            r13[r3] = r11
            java.lang.String r11 = "Attempting to assign undefined value %s"
            java.lang.String r11 = java.lang.String.format(r11, r13)
            r12.<init>(r11)
            throw r12
        L_0x069d:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.Object[] r13 = new java.lang.Object[r5]
            java.lang.Class r11 = r11.getClass()
            java.lang.String r11 = r11.getCanonicalName()
            r13[r3] = r11
            java.lang.String r11 = "Expected string for assign var. got %s"
            java.lang.String r11 = java.lang.String.format(r11, r13)
            r12.<init>(r11)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.v.a(java.lang.String, com.google.android.gms.internal.measurement.i3, java.util.ArrayList):com.google.android.gms.internal.measurement.o");
    }
}
