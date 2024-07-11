package r1;

import s1.a;

public final class p {

    /* renamed from: a  reason: collision with root package name */
    public static final a.C0126a f8384a = a.C0126a.a("nm", "ind", "refId", "ty", "parent", "sw", "sh", "sc", "ks", "tt", "masksProperties", "shapes", "t", "ef", "sr", "st", "w", "h", "ip", "op", "tm", "cl", "hd");

    /* renamed from: b  reason: collision with root package name */
    public static final a.C0126a f8385b = a.C0126a.a("d", "a");

    /* renamed from: c  reason: collision with root package name */
    public static final a.C0126a f8386c = a.C0126a.a("nm");

    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f8387a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                p1.e$b[] r0 = p1.e.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f8387a = r0
                p1.e$b r1 = p1.e.b.LUMA     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f8387a     // Catch:{ NoSuchFieldError -> 0x001d }
                p1.e$b r1 = p1.e.b.LUMA_INVERTED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: r1.p.a.<clinit>():void");
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x02c7, code lost:
        r5 = r38;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x02e5, code lost:
        r5 = r38;
        r14 = r39;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x03eb, code lost:
        r5 = r38;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x03f7, code lost:
        r14 = r39;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x03fe, code lost:
        r6 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00bc, code lost:
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01eb, code lost:
        r38 = r5;
        r39 = r14;
        r14 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p1.e a(s1.b r41, h1.f r42) {
        /*
            r0 = r41
            r7 = r42
            p1.e$b r1 = p1.e.b.NONE
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r41.b()
            r2 = 1065353216(0x3f800000, float:1.0)
            java.lang.Float r9 = java.lang.Float.valueOf(r2)
            r11 = 0
            java.lang.Float r12 = java.lang.Float.valueOf(r11)
            java.lang.String r3 = "UNSET"
            r4 = 0
            r6 = 0
            r13 = -1
            r31 = r1
            r25 = r2
            r16 = r4
            r22 = r6
            r23 = r22
            r24 = r23
            r27 = r24
            r28 = r27
            r33 = r28
            r1 = r11
            r26 = r1
            r18 = r13
            r5 = 0
            r14 = 0
            r20 = 0
            r21 = 0
            r29 = 0
            r30 = 0
            r32 = 0
            r13 = r3
            r3 = r26
        L_0x004b:
            boolean r4 = r41.g()
            if (r4 == 0) goto L_0x0400
            s1.a$a r4 = f8384a
            int r4 = r0.t(r4)
            r2 = 2
            r15 = 1
            switch(r4) {
                case 0: goto L_0x03ee;
                case 1: goto L_0x03df;
                case 2: goto L_0x03d5;
                case 3: goto L_0x03ae;
                case 4: goto L_0x03a1;
                case 5: goto L_0x038d;
                case 6: goto L_0x0379;
                case 7: goto L_0x036a;
                case 8: goto L_0x035f;
                case 9: goto L_0x0318;
                case 10: goto L_0x01f2;
                case 11: goto L_0x01d3;
                case 12: goto L_0x0109;
                case 13: goto L_0x00bf;
                case 14: goto L_0x00b1;
                case 15: goto L_0x00a7;
                case 16: goto L_0x0098;
                case 17: goto L_0x0089;
                case 18: goto L_0x0082;
                case 19: goto L_0x007b;
                case 20: goto L_0x0075;
                case 21: goto L_0x006f;
                case 22: goto L_0x0069;
                default: goto L_0x005c;
            }
        L_0x005c:
            r38 = r5
            r39 = r14
            r14 = r6
            r41.u()
            r41.x()
            goto L_0x03fe
        L_0x0069:
            boolean r33 = r41.j()
            goto L_0x03f9
        L_0x006f:
            java.lang.String r5 = r41.o()
            goto L_0x03f9
        L_0x0075:
            n1.b r32 = s6.a.D(r0, r7, r6)
            goto L_0x03f9
        L_0x007b:
            double r2 = r41.l()
            float r3 = (float) r2
            goto L_0x03f9
        L_0x0082:
            double r1 = r41.l()
            float r1 = (float) r1
            goto L_0x03f9
        L_0x0089:
            int r2 = r41.n()
            float r2 = (float) r2
            float r4 = t1.g.c()
            float r4 = r4 * r2
            int r2 = (int) r4
            r28 = r2
            goto L_0x03f9
        L_0x0098:
            int r2 = r41.n()
            float r2 = (float) r2
            float r4 = t1.g.c()
            float r4 = r4 * r2
            int r2 = (int) r4
            r27 = r2
            goto L_0x03f9
        L_0x00a7:
            double r6 = r41.l()
            float r2 = (float) r6
            r7 = r42
            r26 = r2
            goto L_0x00ba
        L_0x00b1:
            double r6 = r41.l()
            float r2 = (float) r6
            r7 = r42
            r25 = r2
        L_0x00ba:
            r2 = 1065353216(0x3f800000, float:1.0)
        L_0x00bc:
            r6 = 0
            goto L_0x03fb
        L_0x00bf:
            r41.a()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L_0x00c7:
            boolean r6 = r41.g()
            if (r6 == 0) goto L_0x00f1
            r41.b()
        L_0x00d0:
            boolean r6 = r41.g()
            if (r6 == 0) goto L_0x00ed
            s1.a$a r6 = f8386c
            int r6 = r0.t(r6)
            if (r6 == 0) goto L_0x00e5
            r41.u()
            r41.x()
            goto L_0x00d0
        L_0x00e5:
            java.lang.String r6 = r41.o()
            r2.add(r6)
            goto L_0x00d0
        L_0x00ed:
            r41.d()
            goto L_0x00c7
        L_0x00f1:
            r41.c()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: "
            r6.<init>(r7)
            r6.append(r2)
            java.lang.String r2 = r6.toString()
            r7 = r42
            r7.a(r2)
            goto L_0x01eb
        L_0x0109:
            r41.b()
        L_0x010c:
            boolean r6 = r41.g()
            if (r6 == 0) goto L_0x01cb
            s1.a$a r6 = f8385b
            int r6 = r0.t(r6)
            if (r6 == 0) goto L_0x01b5
            if (r6 == r15) goto L_0x0123
            r41.u()
            r41.x()
            goto L_0x010c
        L_0x0123:
            r41.a()
            boolean r6 = r41.g()
            if (r6 == 0) goto L_0x01a5
            s1.a$a r6 = r1.b.f8357a
            r41.b()
            r6 = 0
        L_0x0132:
            boolean r30 = r41.g()
            if (r30 == 0) goto L_0x0195
            s1.a$a r4 = r1.b.f8357a
            int r4 = r0.t(r4)
            if (r4 == 0) goto L_0x0147
            r41.u()
            r41.x()
            goto L_0x0132
        L_0x0147:
            r41.b()
            r4 = 0
            r6 = 0
            r37 = 0
            r38 = 0
        L_0x0150:
            boolean r30 = r41.g()
            if (r30 == 0) goto L_0x0184
            s1.a$a r11 = r1.b.f8358b
            int r11 = r0.t(r11)
            if (r11 == 0) goto L_0x017d
            if (r11 == r15) goto L_0x0177
            if (r11 == r2) goto L_0x0171
            r2 = 3
            if (r11 == r2) goto L_0x016c
            r41.u()
            r41.x()
            goto L_0x0182
        L_0x016c:
            n1.b r6 = s6.a.D(r0, r7, r15)
            goto L_0x0182
        L_0x0171:
            r2 = 3
            n1.b r4 = s6.a.D(r0, r7, r15)
            goto L_0x0182
        L_0x0177:
            r2 = 3
            n1.a r38 = s6.a.C(r41, r42)
            goto L_0x0182
        L_0x017d:
            r2 = 3
            n1.a r37 = s6.a.C(r41, r42)
        L_0x0182:
            r2 = 2
            goto L_0x0150
        L_0x0184:
            r2 = 3
            r41.d()
            n1.f r11 = new n1.f
            r2 = r37
            r15 = r38
            r11.<init>(r2, r15, r4, r6)
            r6 = r11
            r2 = 2
            r15 = 1
            goto L_0x0132
        L_0x0195:
            r41.d()
            if (r6 != 0) goto L_0x01a1
            n1.f r6 = new n1.f
            r2 = 0
            r6.<init>(r2, r2, r2, r2)
            goto L_0x01a2
        L_0x01a1:
            r2 = 0
        L_0x01a2:
            r30 = r6
            goto L_0x01a6
        L_0x01a5:
            r2 = 0
        L_0x01a6:
            boolean r4 = r41.g()
            if (r4 == 0) goto L_0x01b0
            r41.x()
            goto L_0x01a6
        L_0x01b0:
            r41.c()
            r2 = 2
            goto L_0x01c8
        L_0x01b5:
            r2 = 0
            n1.c r6 = new n1.c
            r1.g r4 = r1.g.f8367o
            r11 = 0
            r15 = 1065353216(0x3f800000, float:1.0)
            java.util.ArrayList r4 = r1.o.a(r0, r7, r15, r4, r11)
            r11 = r4
            r2 = 2
            r6.<init>(r2, r11)
            r29 = r6
        L_0x01c8:
            r15 = 1
            goto L_0x010c
        L_0x01cb:
            r15 = 1065353216(0x3f800000, float:1.0)
            r41.d()
            r2 = r15
            goto L_0x00bc
        L_0x01d3:
            r15 = 1065353216(0x3f800000, float:1.0)
            r41.a()
        L_0x01d8:
            boolean r2 = r41.g()
            if (r2 == 0) goto L_0x01e8
            o1.b r2 = r1.f.a(r41, r42)
            if (r2 == 0) goto L_0x01d8
            r8.add(r2)
            goto L_0x01d8
        L_0x01e8:
            r41.c()
        L_0x01eb:
            r38 = r5
            r39 = r14
            r14 = 0
            goto L_0x03fe
        L_0x01f2:
            r15 = 1065353216(0x3f800000, float:1.0)
            r41.a()
        L_0x01f7:
            boolean r2 = r41.g()
            if (r2 == 0) goto L_0x0305
            r41.b()
            r2 = 0
            r4 = 0
            r6 = 0
            r11 = 0
        L_0x0204:
            boolean r35 = r41.g()
            if (r35 == 0) goto L_0x02ed
            java.lang.String r15 = r41.I()
            r15.getClass()
            int r38 = r15.hashCode()
            r39 = -1
            switch(r38) {
                case 111: goto L_0x0246;
                case 3588: goto L_0x0239;
                case 104433: goto L_0x022c;
                case 3357091: goto L_0x021f;
                default: goto L_0x021a;
            }
        L_0x021a:
            r38 = r5
        L_0x021c:
            r5 = r39
            goto L_0x0252
        L_0x021f:
            r38 = r5
            java.lang.String r5 = "mode"
            boolean r5 = r15.equals(r5)
            if (r5 != 0) goto L_0x022a
            goto L_0x0250
        L_0x022a:
            r5 = 3
            goto L_0x0252
        L_0x022c:
            r38 = r5
            java.lang.String r5 = "inv"
            boolean r5 = r15.equals(r5)
            if (r5 != 0) goto L_0x0237
            goto L_0x0250
        L_0x0237:
            r5 = 2
            goto L_0x0252
        L_0x0239:
            r38 = r5
            java.lang.String r5 = "pt"
            boolean r5 = r15.equals(r5)
            if (r5 != 0) goto L_0x0244
            goto L_0x0250
        L_0x0244:
            r5 = 1
            goto L_0x0252
        L_0x0246:
            r38 = r5
            java.lang.String r5 = "o"
            boolean r5 = r15.equals(r5)
            if (r5 != 0) goto L_0x0251
        L_0x0250:
            goto L_0x021c
        L_0x0251:
            r5 = 0
        L_0x0252:
            switch(r5) {
                case 0: goto L_0x02de;
                case 1: goto L_0x02ca;
                case 2: goto L_0x02c3;
                case 3: goto L_0x025a;
                default: goto L_0x0255;
            }
        L_0x0255:
            r41.x()
            goto L_0x02c7
        L_0x025a:
            java.lang.String r5 = r41.o()
            r5.getClass()
            int r6 = r5.hashCode()
            switch(r6) {
                case 97: goto L_0x028d;
                case 105: goto L_0x0281;
                case 110: goto L_0x0275;
                case 115: goto L_0x0269;
                default: goto L_0x0268;
            }
        L_0x0268:
            goto L_0x0298
        L_0x0269:
            java.lang.String r6 = "s"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L_0x0272
            goto L_0x0298
        L_0x0272:
            r39 = 3
            goto L_0x0298
        L_0x0275:
            java.lang.String r6 = "n"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L_0x027e
            goto L_0x0298
        L_0x027e:
            r39 = 2
            goto L_0x0298
        L_0x0281:
            java.lang.String r6 = "i"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L_0x028a
            goto L_0x0298
        L_0x028a:
            r39 = 1
            goto L_0x0298
        L_0x028d:
            java.lang.String r6 = "a"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L_0x0296
            goto L_0x0298
        L_0x0296:
            r39 = 0
        L_0x0298:
            switch(r39) {
                case 0: goto L_0x02c0;
                case 1: goto L_0x02b8;
                case 2: goto L_0x02b5;
                case 3: goto L_0x02b2;
                default: goto L_0x029b;
            }
        L_0x029b:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Unknown mask mode "
            r5.<init>(r6)
            r5.append(r15)
            java.lang.String r6 = ". Defaulting to Add."
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            t1.c.b(r5)
            goto L_0x02c0
        L_0x02b2:
            o1.g$a r6 = o1.g.a.MASK_MODE_SUBTRACT
            goto L_0x02c7
        L_0x02b5:
            o1.g$a r6 = o1.g.a.MASK_MODE_NONE
            goto L_0x02c7
        L_0x02b8:
            java.lang.String r5 = "Animation contains intersect masks. They are not supported but will be treated like add masks."
            r7.a(r5)
            o1.g$a r6 = o1.g.a.MASK_MODE_INTERSECT
            goto L_0x02c7
        L_0x02c0:
            o1.g$a r6 = o1.g.a.MASK_MODE_ADD
            goto L_0x02c7
        L_0x02c3:
            boolean r2 = r41.j()
        L_0x02c7:
            r5 = r38
            goto L_0x02e9
        L_0x02ca:
            n1.a r11 = new n1.a
            float r5 = t1.g.c()
            r1.x r15 = r1.x.f8397o
            r39 = r14
            r14 = 0
            java.util.ArrayList r5 = r1.o.a(r0, r7, r5, r15, r14)
            r15 = 1
            r11.<init>(r15, r5)
            goto L_0x02e5
        L_0x02de:
            r39 = r14
            r14 = 0
            n1.d r4 = s6.a.E(r41, r42)
        L_0x02e5:
            r5 = r38
            r14 = r39
        L_0x02e9:
            r15 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0204
        L_0x02ed:
            r38 = r5
            r39 = r14
            r14 = 0
            r41.d()
            o1.g r5 = new o1.g
            r5.<init>(r6, r11, r4, r2)
            r10.add(r5)
            r5 = r38
            r14 = r39
            r15 = 1065353216(0x3f800000, float:1.0)
            goto L_0x01f7
        L_0x0305:
            r38 = r5
            r39 = r14
            r14 = 0
            int r2 = r10.size()
            int r4 = r7.f5129o
            int r4 = r4 + r2
            r7.f5129o = r4
            r41.c()
            goto L_0x03fe
        L_0x0318:
            r38 = r5
            r39 = r14
            r14 = r6
            int r2 = r41.n()
            p1.e$b[] r4 = p1.e.b.values()
            int r4 = r4.length
            if (r2 < r4) goto L_0x033b
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Unsupported matte type: "
            r4.<init>(r5)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r7.a(r2)
            goto L_0x03fe
        L_0x033b:
            p1.e$b[] r4 = p1.e.b.values()
            r31 = r4[r2]
            int[] r2 = r1.p.a.f8387a
            int r4 = r31.ordinal()
            r2 = r2[r4]
            r4 = 1
            if (r2 == r4) goto L_0x0353
            r5 = 2
            if (r2 == r5) goto L_0x0350
            goto L_0x0358
        L_0x0350:
            java.lang.String r2 = "Unsupported matte type: Luma Inverted"
            goto L_0x0355
        L_0x0353:
            java.lang.String r2 = "Unsupported matte type: Luma"
        L_0x0355:
            r7.a(r2)
        L_0x0358:
            int r2 = r7.f5129o
            int r2 = r2 + r4
            r7.f5129o = r2
            goto L_0x03fe
        L_0x035f:
            r38 = r5
            r39 = r14
            r14 = r6
            n1.g r21 = r1.c.a(r41, r42)
            goto L_0x03f7
        L_0x036a:
            r38 = r5
            r39 = r14
            r14 = r6
            java.lang.String r2 = r41.o()
            int r24 = android.graphics.Color.parseColor(r2)
            goto L_0x03f7
        L_0x0379:
            r38 = r5
            r39 = r14
            r14 = r6
            int r2 = r41.n()
            float r2 = (float) r2
            float r4 = t1.g.c()
            float r4 = r4 * r2
            int r2 = (int) r4
            r23 = r2
            goto L_0x03f7
        L_0x038d:
            r38 = r5
            r39 = r14
            r14 = r6
            int r2 = r41.n()
            float r2 = (float) r2
            float r4 = t1.g.c()
            float r4 = r4 * r2
            int r2 = (int) r4
            r22 = r2
            goto L_0x03f7
        L_0x03a1:
            r38 = r5
            r39 = r14
            r14 = r6
            int r2 = r41.n()
            long r4 = (long) r2
            r18 = r4
            goto L_0x03eb
        L_0x03ae:
            r38 = r5
            r14 = r6
            int r2 = r41.n()
            p1.e$a r4 = p1.e.a.UNKNOWN
            int r5 = r4.ordinal()
            if (r2 >= r5) goto L_0x03cc
            p1.e$a[] r4 = p1.e.a.values()
            r2 = r4[r2]
            r6 = r14
            r5 = r38
            r11 = 0
            r14 = r2
            r2 = 1065353216(0x3f800000, float:1.0)
            goto L_0x004b
        L_0x03cc:
            r6 = r14
            r5 = r38
            r2 = 1065353216(0x3f800000, float:1.0)
            r11 = 0
            r14 = r4
            goto L_0x004b
        L_0x03d5:
            r38 = r5
            r39 = r14
            r14 = r6
            java.lang.String r20 = r41.o()
            goto L_0x03f7
        L_0x03df:
            r38 = r5
            r39 = r14
            r14 = r6
            int r2 = r41.n()
            long r4 = (long) r2
            r16 = r4
        L_0x03eb:
            r5 = r38
            goto L_0x03f7
        L_0x03ee:
            r38 = r5
            r39 = r14
            r14 = r6
            java.lang.String r13 = r41.o()
        L_0x03f7:
            r14 = r39
        L_0x03f9:
            r2 = 1065353216(0x3f800000, float:1.0)
        L_0x03fb:
            r11 = 0
            goto L_0x004b
        L_0x03fe:
            r6 = r14
            goto L_0x03eb
        L_0x0400:
            r38 = r5
            r39 = r14
            r41.d()
            float r11 = r1 / r25
            float r14 = r3 / r25
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            r0 = 0
            int r1 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r1 <= 0) goto L_0x0430
            u1.a r6 = new u1.a
            r4 = 0
            r5 = 0
            java.lang.Float r35 = java.lang.Float.valueOf(r11)
            r0 = r6
            r1 = r42
            r2 = r12
            r3 = r12
            r40 = r38
            r36 = r10
            r10 = r6
            r6 = r35
            r0.<init>((h1.f) r1, r2, r3, (android.view.animation.Interpolator) r4, (float) r5, (java.lang.Float) r6)
            r15.add(r10)
            goto L_0x0434
        L_0x0430:
            r36 = r10
            r40 = r38
        L_0x0434:
            r0 = 0
            int r0 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x043a
            goto L_0x043d
        L_0x043a:
            float r0 = r7.l
            r14 = r0
        L_0x043d:
            u1.a r10 = new u1.a
            r4 = 0
            java.lang.Float r6 = java.lang.Float.valueOf(r14)
            r0 = r10
            r1 = r42
            r2 = r9
            r3 = r9
            r5 = r11
            r0.<init>((h1.f) r1, r2, r3, (android.view.animation.Interpolator) r4, (float) r5, (java.lang.Float) r6)
            r15.add(r10)
            u1.a r9 = new u1.a
            r0 = 2139095039(0x7f7fffff, float:3.4028235E38)
            java.lang.Float r6 = java.lang.Float.valueOf(r0)
            r0 = r9
            r2 = r12
            r3 = r12
            r5 = r14
            r0.<init>((h1.f) r1, r2, r3, (android.view.animation.Interpolator) r4, (float) r5, (java.lang.Float) r6)
            r15.add(r9)
            java.lang.String r0 = ".ai"
            boolean r0 = r13.endsWith(r0)
            if (r0 != 0) goto L_0x0475
            java.lang.String r0 = "ai"
            r5 = r40
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x047a
        L_0x0475:
            java.lang.String r0 = "Convert your Illustrator layers to shape layers."
            r7.a(r0)
        L_0x047a:
            p1.e r34 = new p1.e
            r0 = r34
            r1 = r8
            r2 = r42
            r3 = r13
            r4 = r16
            r6 = r39
            r7 = r18
            r9 = r20
            r10 = r36
            r11 = r21
            r12 = r22
            r13 = r23
            r14 = r24
            r21 = r15
            r15 = r25
            r16 = r26
            r17 = r27
            r18 = r28
            r19 = r29
            r20 = r30
            r22 = r31
            r23 = r32
            r24 = r33
            r0.<init>(r1, r2, r3, r4, r6, r7, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            return r34
        */
        throw new UnsupportedOperationException("Method not decompiled: r1.p.a(s1.b, h1.f):p1.e");
    }
}
