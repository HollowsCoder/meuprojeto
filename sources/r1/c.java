package r1;

import s1.a;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final a.C0126a f8361a = a.C0126a.a("a", "p", "s", "rz", "r", "o", "so", "eo", "sk", "sa");

    /* renamed from: b  reason: collision with root package name */
    public static final a.C0126a f8362b = a.C0126a.a("k");

    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01b9, code lost:
        if (r0 != false) goto L_0x01be;
     */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x020e  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0210  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0213  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0216  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01c1  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01c4  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01e5  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01e7  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01ea  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01ed  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static n1.g a(s1.b r28, h1.f r29) {
        /*
            r0 = r28
            r8 = r29
            s1.a$b r1 = r28.r()
            s1.a$b r2 = s1.a.b.BEGIN_OBJECT
            r10 = 0
            if (r1 != r2) goto L_0x000f
            r11 = 1
            goto L_0x0010
        L_0x000f:
            r11 = r10
        L_0x0010:
            if (r11 == 0) goto L_0x0015
            r28.b()
        L_0x0015:
            r1 = 0
            r6 = 0
            r7 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r21 = 0
            r22 = 0
            r23 = 0
        L_0x0021:
            boolean r2 = r28.g()
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            if (r2 == 0) goto L_0x010f
            s1.a$a r2 = f8361a
            int r2 = r0.t(r2)
            switch(r2) {
                case 0: goto L_0x00e4;
                case 1: goto L_0x00db;
                case 2: goto L_0x00cc;
                case 3: goto L_0x0058;
                case 4: goto L_0x005d;
                case 5: goto L_0x0053;
                case 6: goto L_0x004e;
                case 7: goto L_0x0049;
                case 8: goto L_0x0044;
                case 9: goto L_0x003f;
                default: goto L_0x0033;
            }
        L_0x0033:
            r26 = r6
            r27 = r7
            r5 = 1
            r28.u()
            r28.x()
            goto L_0x0021
        L_0x003f:
            n1.b r13 = s6.a.D(r0, r8, r10)
            goto L_0x0021
        L_0x0044:
            n1.b r14 = s6.a.D(r0, r8, r10)
            goto L_0x0021
        L_0x0049:
            n1.b r23 = s6.a.D(r0, r8, r10)
            goto L_0x0021
        L_0x004e:
            n1.b r22 = s6.a.D(r0, r8, r10)
            goto L_0x0021
        L_0x0053:
            n1.d r21 = s6.a.E(r28, r29)
            goto L_0x0021
        L_0x0058:
            java.lang.String r1 = "Lottie doesn't support 3D layers."
            r8.a(r1)
        L_0x005d:
            n1.b r5 = s6.a.D(r0, r8, r10)
            java.util.Collection r1 = r5.f7358b
            r3 = r1
            java.util.List r3 = (java.util.List) r3
            boolean r1 = r3.isEmpty()
            if (r1 == 0) goto L_0x009a
            u1.a r2 = new u1.a
            java.lang.Float r16 = java.lang.Float.valueOf(r4)
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            r17 = 0
            r18 = 0
            float r1 = r8.l
            java.lang.Float r19 = java.lang.Float.valueOf(r1)
            r1 = r2
            r12 = r2
            r2 = r29
            r9 = r3
            r3 = r16
            r16 = r5
            r5 = r17
            r26 = r6
            r6 = r18
            r27 = r7
            r7 = r19
            r1.<init>((h1.f) r2, r3, r4, (android.view.animation.Interpolator) r5, (float) r6, (java.lang.Float) r7)
            r9.add(r12)
            goto L_0x00c6
        L_0x009a:
            r9 = r3
            r16 = r5
            r26 = r6
            r27 = r7
            java.lang.Object r1 = r9.get(r10)
            u1.a r1 = (u1.a) r1
            T r1 = r1.f9041b
            if (r1 != 0) goto L_0x00c6
            u1.a r12 = new u1.a
            java.lang.Float r3 = java.lang.Float.valueOf(r4)
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            r5 = 0
            r6 = 0
            float r1 = r8.l
            java.lang.Float r7 = java.lang.Float.valueOf(r1)
            r1 = r12
            r2 = r29
            r1.<init>((h1.f) r2, r3, r4, (android.view.animation.Interpolator) r5, (float) r6, (java.lang.Float) r7)
            r9.set(r10, r12)
        L_0x00c6:
            r1 = r16
            r6 = r26
            r5 = 1
            goto L_0x010b
        L_0x00cc:
            r27 = r7
            n1.d r6 = new n1.d
            r1.w r2 = r1.w.f8396o
            java.util.ArrayList r2 = r1.o.a(r0, r8, r3, r2, r10)
            r5 = 1
            r6.<init>(r5, r2)
            goto L_0x010b
        L_0x00db:
            r26 = r6
            r5 = 1
            n1.h r7 = r1.a.b(r28, r29)
            goto L_0x0021
        L_0x00e4:
            r26 = r6
            r27 = r7
            r5 = 1
            r28.b()
        L_0x00ec:
            boolean r2 = r28.g()
            if (r2 == 0) goto L_0x0106
            s1.a$a r2 = f8362b
            int r2 = r0.t(r2)
            if (r2 == 0) goto L_0x0101
            r28.u()
            r28.x()
            goto L_0x00ec
        L_0x0101:
            j1.b r15 = r1.a.a(r28, r29)
            goto L_0x00ec
        L_0x0106:
            r28.d()
            r6 = r26
        L_0x010b:
            r7 = r27
            goto L_0x0021
        L_0x010f:
            r26 = r6
            r27 = r7
            r5 = 1
            if (r11 == 0) goto L_0x0119
            r28.d()
        L_0x0119:
            if (r15 == 0) goto L_0x0136
            boolean r0 = r15.c()
            if (r0 == 0) goto L_0x0134
            java.util.List r0 = r15.f6416a
            java.lang.Object r0 = r0.get(r10)
            u1.a r0 = (u1.a) r0
            T r0 = r0.f9041b
            android.graphics.PointF r0 = (android.graphics.PointF) r0
            boolean r0 = r0.equals(r4, r4)
            if (r0 == 0) goto L_0x0134
            goto L_0x0136
        L_0x0134:
            r0 = r10
            goto L_0x0137
        L_0x0136:
            r0 = r5
        L_0x0137:
            if (r0 == 0) goto L_0x013e
            r7 = r27
            r17 = 0
            goto L_0x0142
        L_0x013e:
            r17 = r15
            r7 = r27
        L_0x0142:
            if (r7 == 0) goto L_0x0165
            boolean r0 = r7 instanceof n1.e
            if (r0 != 0) goto L_0x0163
            boolean r0 = r7.c()
            if (r0 == 0) goto L_0x0163
            java.util.List r0 = r7.b()
            java.lang.Object r0 = r0.get(r10)
            u1.a r0 = (u1.a) r0
            T r0 = r0.f9041b
            android.graphics.PointF r0 = (android.graphics.PointF) r0
            boolean r0 = r0.equals(r4, r4)
            if (r0 == 0) goto L_0x0163
            goto L_0x0165
        L_0x0163:
            r0 = r10
            goto L_0x0166
        L_0x0165:
            r0 = r5
        L_0x0166:
            if (r0 == 0) goto L_0x016b
            r18 = 0
            goto L_0x016d
        L_0x016b:
            r18 = r7
        L_0x016d:
            if (r1 == 0) goto L_0x018e
            boolean r0 = r1.c()
            if (r0 == 0) goto L_0x018c
            java.util.Collection r0 = r1.f7358b
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r0 = r0.get(r10)
            u1.a r0 = (u1.a) r0
            T r0 = r0.f9041b
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x018c
            goto L_0x018e
        L_0x018c:
            r0 = r10
            goto L_0x018f
        L_0x018e:
            r0 = r5
        L_0x018f:
            r6 = r26
            if (r0 == 0) goto L_0x0194
            r1 = 0
        L_0x0194:
            if (r6 == 0) goto L_0x01be
            boolean r0 = r6.c()
            if (r0 == 0) goto L_0x01bc
            java.util.Collection r0 = r6.f7358b
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r0 = r0.get(r10)
            u1.a r0 = (u1.a) r0
            T r0 = r0.f9041b
            u1.d r0 = (u1.d) r0
            float r2 = r0.f9058a
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x01b8
            float r0 = r0.f9059b
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x01b8
            r0 = r5
            goto L_0x01b9
        L_0x01b8:
            r0 = r10
        L_0x01b9:
            if (r0 == 0) goto L_0x01bc
            goto L_0x01be
        L_0x01bc:
            r0 = r10
            goto L_0x01bf
        L_0x01be:
            r0 = r5
        L_0x01bf:
            if (r0 == 0) goto L_0x01c4
            r19 = 0
            goto L_0x01c6
        L_0x01c4:
            r19 = r6
        L_0x01c6:
            if (r14 == 0) goto L_0x01e7
            boolean r0 = r14.c()
            if (r0 == 0) goto L_0x01e5
            java.util.Collection r0 = r14.f7358b
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r0 = r0.get(r10)
            u1.a r0 = (u1.a) r0
            T r0 = r0.f9041b
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x01e5
            goto L_0x01e7
        L_0x01e5:
            r0 = r10
            goto L_0x01e8
        L_0x01e7:
            r0 = r5
        L_0x01e8:
            if (r0 == 0) goto L_0x01ed
            r24 = 0
            goto L_0x01ef
        L_0x01ed:
            r24 = r14
        L_0x01ef:
            if (r13 == 0) goto L_0x0210
            boolean r0 = r13.c()
            if (r0 == 0) goto L_0x020e
            java.util.Collection r0 = r13.f7358b
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r0 = r0.get(r10)
            u1.a r0 = (u1.a) r0
            T r0 = r0.f9041b
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x020e
            goto L_0x0210
        L_0x020e:
            r9 = r10
            goto L_0x0211
        L_0x0210:
            r9 = r5
        L_0x0211:
            if (r9 == 0) goto L_0x0216
            r25 = 0
            goto L_0x0218
        L_0x0216:
            r25 = r13
        L_0x0218:
            n1.g r0 = new n1.g
            r16 = r0
            r20 = r1
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: r1.c.a(s1.b, h1.f):n1.g");
    }
}
