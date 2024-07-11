package r1;

import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import java.lang.ref.WeakReference;
import n.j;
import s1.a;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    public static final LinearInterpolator f8380a = new LinearInterpolator();

    /* renamed from: b  reason: collision with root package name */
    public static j<WeakReference<Interpolator>> f8381b;

    /* renamed from: c  reason: collision with root package name */
    public static final a.C0126a f8382c = a.C0126a.a("t", "s", "e", "o", "i", "h", "to", "ti");
    public static final a.C0126a d = a.C0126a.a("x", "y");

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: android.view.animation.LinearInterpolator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: android.view.animation.PathInterpolator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: android.view.animation.PathInterpolator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: android.view.animation.Interpolator} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.view.animation.Interpolator a(android.graphics.PointF r8, android.graphics.PointF r9) {
        /*
            float r0 = r8.x
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2 = 1065353216(0x3f800000, float:1.0)
            float r0 = t1.f.b(r0, r1, r2)
            r8.x = r0
            float r0 = r8.y
            r3 = -1027080192(0xffffffffc2c80000, float:-100.0)
            r4 = 1120403456(0x42c80000, float:100.0)
            float r0 = t1.f.b(r0, r3, r4)
            r8.y = r0
            float r0 = r9.x
            float r0 = t1.f.b(r0, r1, r2)
            r9.x = r0
            float r0 = r9.y
            float r0 = t1.f.b(r0, r3, r4)
            r9.y = r0
            float r1 = r8.x
            float r3 = r8.y
            float r4 = r9.x
            t1.g$a r5 = t1.g.f8886a
            r5 = 0
            int r6 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r6 == 0) goto L_0x003b
            r6 = 527(0x20f, float:7.38E-43)
            float r6 = (float) r6
            float r6 = r6 * r1
            int r1 = (int) r6
            goto L_0x003d
        L_0x003b:
            r1 = 17
        L_0x003d:
            int r6 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r6 == 0) goto L_0x0046
            int r1 = r1 * 31
            float r1 = (float) r1
            float r1 = r1 * r3
            int r1 = (int) r1
        L_0x0046:
            int r3 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r3 == 0) goto L_0x004f
            int r1 = r1 * 31
            float r1 = (float) r1
            float r1 = r1 * r4
            int r1 = (int) r1
        L_0x004f:
            int r3 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r3 == 0) goto L_0x0058
            int r1 = r1 * 31
            float r1 = (float) r1
            float r1 = r1 * r0
            int r1 = (int) r1
        L_0x0058:
            java.lang.Class<r1.n> r0 = r1.n.class
            monitor-enter(r0)
            n.j<java.lang.ref.WeakReference<android.view.animation.Interpolator>> r3 = f8381b     // Catch:{ all -> 0x00c9 }
            if (r3 != 0) goto L_0x0066
            n.j r3 = new n.j     // Catch:{ all -> 0x00c9 }
            r3.<init>()     // Catch:{ all -> 0x00c9 }
            f8381b = r3     // Catch:{ all -> 0x00c9 }
        L_0x0066:
            n.j<java.lang.ref.WeakReference<android.view.animation.Interpolator>> r3 = f8381b     // Catch:{ all -> 0x00c9 }
            r4 = 0
            java.lang.Object r3 = r3.h(r1, r4)     // Catch:{ all -> 0x00c9 }
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3     // Catch:{ all -> 0x00c9 }
            monitor-exit(r0)     // Catch:{ all -> 0x00c9 }
            if (r3 == 0) goto L_0x0079
            java.lang.Object r0 = r3.get()
            r4 = r0
            android.view.animation.Interpolator r4 = (android.view.animation.Interpolator) r4
        L_0x0079:
            if (r3 == 0) goto L_0x007d
            if (r4 != 0) goto L_0x00c8
        L_0x007d:
            float r0 = r8.x     // Catch:{ IllegalArgumentException -> 0x008c }
            float r3 = r8.y     // Catch:{ IllegalArgumentException -> 0x008c }
            float r4 = r9.x     // Catch:{ IllegalArgumentException -> 0x008c }
            float r6 = r9.y     // Catch:{ IllegalArgumentException -> 0x008c }
            android.view.animation.PathInterpolator r7 = new android.view.animation.PathInterpolator     // Catch:{ IllegalArgumentException -> 0x008c }
            r7.<init>(r0, r3, r4, r6)     // Catch:{ IllegalArgumentException -> 0x008c }
            r4 = r7
            goto L_0x00b6
        L_0x008c:
            r0 = move-exception
            java.lang.String r3 = "The Path cannot loop back on itself."
            java.lang.String r0 = r0.getMessage()
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x00b0
            float r0 = r8.x
            float r0 = java.lang.Math.min(r0, r2)
            float r8 = r8.y
            float r2 = r9.x
            float r2 = java.lang.Math.max(r2, r5)
            float r9 = r9.y
            android.view.animation.PathInterpolator r3 = new android.view.animation.PathInterpolator
            r3.<init>(r0, r8, r2, r9)
            r4 = r3
            goto L_0x00b6
        L_0x00b0:
            android.view.animation.LinearInterpolator r8 = new android.view.animation.LinearInterpolator
            r8.<init>()
            r4 = r8
        L_0x00b6:
            java.lang.ref.WeakReference r8 = new java.lang.ref.WeakReference     // Catch:{ ArrayIndexOutOfBoundsException -> 0x00c8 }
            r8.<init>(r4)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x00c8 }
            java.lang.Class<r1.n> r9 = r1.n.class
            monitor-enter(r9)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x00c8 }
            n.j<java.lang.ref.WeakReference<android.view.animation.Interpolator>> r0 = f8381b     // Catch:{ all -> 0x00c5 }
            r0.i(r1, r8)     // Catch:{ all -> 0x00c5 }
            monitor-exit(r9)     // Catch:{ all -> 0x00c5 }
            goto L_0x00c8
        L_0x00c5:
            r8 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x00c5 }
            throw r8     // Catch:{ ArrayIndexOutOfBoundsException -> 0x00c8 }
        L_0x00c8:
            return r4
        L_0x00c9:
            r8 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00c9 }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: r1.n.a(android.graphics.PointF, android.graphics.PointF):android.view.animation.Interpolator");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0050, code lost:
        r23 = r3;
        r24 = r8;
        r30 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01b4, code lost:
        r9 = r29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01b6, code lost:
        r11 = r30;
        r3 = r23;
        r8 = r24;
        r5 = 1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01f8 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T> u1.a<T> b(s1.a r25, h1.f r26, float r27, r1.d0<T> r28, boolean r29, boolean r30) {
        /*
            r0 = r25
            r1 = r27
            r2 = r28
            android.view.animation.LinearInterpolator r3 = f8380a
            r5 = 1
            s1.a$a r8 = f8382c
            if (r29 == 0) goto L_0x021b
            if (r30 == 0) goto L_0x021b
            r25.b()
            r4 = 0
            r6 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r21 = 0
        L_0x0021:
            boolean r20 = r25.g()
            if (r20 == 0) goto L_0x01bf
            int r20 = r0.t(r8)
            s1.a$a r7 = d
            switch(r20) {
                case 0: goto L_0x01a5;
                case 1: goto L_0x0198;
                case 2: goto L_0x018b;
                case 3: goto L_0x00f4;
                case 4: goto L_0x0058;
                case 5: goto L_0x0047;
                case 6: goto L_0x0042;
                case 7: goto L_0x003d;
                default: goto L_0x0030;
            }
        L_0x0030:
            r23 = r3
            r24 = r8
            r29 = r9
            r30 = r11
            r25.x()
            goto L_0x01b4
        L_0x003d:
            android.graphics.PointF r9 = r1.m.b(r0, r1)
            goto L_0x0050
        L_0x0042:
            android.graphics.PointF r11 = r1.m.b(r0, r1)
            goto L_0x0021
        L_0x0047:
            int r7 = r25.n()
            if (r7 != r5) goto L_0x004f
            r13 = r5
            goto L_0x0050
        L_0x004f:
            r13 = 0
        L_0x0050:
            r23 = r3
            r24 = r8
            r30 = r11
            goto L_0x01b6
        L_0x0058:
            s1.a$b r5 = r25.r()
            r23 = r3
            s1.a$b r3 = s1.a.b.BEGIN_OBJECT
            if (r5 != r3) goto L_0x00e8
            r25.b()
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
        L_0x0069:
            boolean r24 = r25.g()
            if (r24 == 0) goto L_0x00d1
            r24 = r8
            int r8 = r0.t(r7)
            r29 = r9
            if (r8 == 0) goto L_0x00a5
            r9 = 1
            if (r8 == r9) goto L_0x0080
            r25.x()
            goto L_0x00cc
        L_0x0080:
            s1.a$b r4 = r25.r()
            s1.a$b r6 = s1.a.b.NUMBER
            if (r4 != r6) goto L_0x008f
            double r8 = r25.l()
            float r4 = (float) r8
            r6 = r4
            goto L_0x00cc
        L_0x008f:
            r25.a()
            double r8 = r25.l()
            float r4 = (float) r8
            s1.a$b r8 = r25.r()
            if (r8 != r6) goto L_0x00a3
            double r8 = r25.l()
            float r6 = (float) r8
            goto L_0x00c9
        L_0x00a3:
            r6 = r4
            goto L_0x00c9
        L_0x00a5:
            s1.a$b r3 = r25.r()
            s1.a$b r5 = s1.a.b.NUMBER
            if (r3 != r5) goto L_0x00b4
            double r8 = r25.l()
            float r3 = (float) r8
            r5 = r3
            goto L_0x00cc
        L_0x00b4:
            r25.a()
            double r8 = r25.l()
            float r3 = (float) r8
            s1.a$b r8 = r25.r()
            if (r8 != r5) goto L_0x00c8
            double r8 = r25.l()
            float r5 = (float) r8
            goto L_0x00c9
        L_0x00c8:
            r5 = r3
        L_0x00c9:
            r25.c()
        L_0x00cc:
            r9 = r29
            r8 = r24
            goto L_0x0069
        L_0x00d1:
            r24 = r8
            r29 = r9
            android.graphics.PointF r7 = new android.graphics.PointF
            r7.<init>(r3, r4)
            android.graphics.PointF r3 = new android.graphics.PointF
            r3.<init>(r5, r6)
            r25.d()
            r6 = r3
            r4 = r7
            r30 = r11
            goto L_0x01b4
        L_0x00e8:
            r24 = r8
            r29 = r9
            android.graphics.PointF r15 = r1.m.b(r0, r1)
            r30 = r11
            goto L_0x01b4
        L_0x00f4:
            r23 = r3
            r24 = r8
            r29 = r9
            s1.a$b r3 = r25.r()
            s1.a$b r5 = s1.a.b.BEGIN_OBJECT
            if (r3 != r5) goto L_0x0183
            r25.b()
            r3 = 0
            r5 = 0
            r8 = 0
            r9 = 0
        L_0x0109:
            boolean r10 = r25.g()
            if (r10 == 0) goto L_0x0171
            int r10 = r0.t(r7)
            if (r10 == 0) goto L_0x0143
            r12 = 1
            if (r10 == r12) goto L_0x011c
            r25.x()
            goto L_0x0109
        L_0x011c:
            s1.a$b r5 = r25.r()
            s1.a$b r9 = s1.a.b.NUMBER
            if (r5 != r9) goto L_0x012b
            double r9 = r25.l()
            float r9 = (float) r9
            r5 = r9
            goto L_0x0109
        L_0x012b:
            r25.a()
            r30 = r11
            double r10 = r25.l()
            float r5 = (float) r10
            s1.a$b r10 = r25.r()
            if (r10 != r9) goto L_0x0141
            double r9 = r25.l()
            float r9 = (float) r9
            goto L_0x016b
        L_0x0141:
            r9 = r5
            goto L_0x016b
        L_0x0143:
            r30 = r11
            s1.a$b r3 = r25.r()
            s1.a$b r8 = s1.a.b.NUMBER
            if (r3 != r8) goto L_0x0156
            double r10 = r25.l()
            float r8 = (float) r10
            r11 = r30
            r3 = r8
            goto L_0x0109
        L_0x0156:
            r25.a()
            double r10 = r25.l()
            float r3 = (float) r10
            s1.a$b r10 = r25.r()
            if (r10 != r8) goto L_0x016a
            double r10 = r25.l()
            float r8 = (float) r10
            goto L_0x016b
        L_0x016a:
            r8 = r3
        L_0x016b:
            r25.c()
            r11 = r30
            goto L_0x0109
        L_0x0171:
            r30 = r11
            android.graphics.PointF r7 = new android.graphics.PointF
            r7.<init>(r3, r5)
            android.graphics.PointF r3 = new android.graphics.PointF
            r3.<init>(r8, r9)
            r25.d()
            r12 = r3
            r10 = r7
            goto L_0x01b4
        L_0x0183:
            r30 = r11
            android.graphics.PointF r3 = r1.m.b(r0, r1)
            r14 = r3
            goto L_0x01b4
        L_0x018b:
            r23 = r3
            r24 = r8
            r29 = r9
            r30 = r11
            java.lang.Object r16 = r2.f(r0, r1)
            goto L_0x01b4
        L_0x0198:
            r23 = r3
            r24 = r8
            r29 = r9
            r30 = r11
            java.lang.Object r17 = r2.f(r0, r1)
            goto L_0x01b4
        L_0x01a5:
            r23 = r3
            r24 = r8
            r29 = r9
            r30 = r11
            double r7 = r25.l()
            float r3 = (float) r7
            r21 = r3
        L_0x01b4:
            r9 = r29
        L_0x01b6:
            r11 = r30
            r3 = r23
            r8 = r24
            r5 = 1
            goto L_0x0021
        L_0x01bf:
            r23 = r3
            r29 = r9
            r30 = r11
            r25.d()
            if (r13 == 0) goto L_0x01cd
            r16 = r17
            goto L_0x01ee
        L_0x01cd:
            if (r14 == 0) goto L_0x01d6
            if (r15 == 0) goto L_0x01d6
            android.view.animation.Interpolator r3 = a(r14, r15)
            goto L_0x01f0
        L_0x01d6:
            if (r10 == 0) goto L_0x01ee
            if (r12 == 0) goto L_0x01ee
            if (r4 == 0) goto L_0x01ee
            if (r6 == 0) goto L_0x01ee
            android.view.animation.Interpolator r0 = a(r10, r4)
            android.view.animation.Interpolator r1 = a(r12, r6)
            r19 = r0
            r20 = r1
            r18 = r16
            r3 = 0
            goto L_0x01f6
        L_0x01ee:
            r3 = r23
        L_0x01f0:
            r18 = r16
            r19 = 0
            r20 = 0
        L_0x01f6:
            if (r19 == 0) goto L_0x0203
            if (r20 == 0) goto L_0x0203
            u1.a r0 = new u1.a
            r15 = r0
            r16 = r26
            r15.<init>((h1.f) r16, (java.lang.Object) r17, (java.lang.Object) r18, (android.view.animation.Interpolator) r19, (android.view.animation.Interpolator) r20, (float) r21)
            goto L_0x0212
        L_0x0203:
            u1.a r0 = new u1.a
            r1 = 0
            r15 = r0
            r16 = r26
            r19 = r3
            r20 = r21
            r21 = r1
            r15.<init>((h1.f) r16, r17, r18, (android.view.animation.Interpolator) r19, (float) r20, (java.lang.Float) r21)
        L_0x0212:
            r11 = r30
            r0.f9052o = r11
            r9 = r29
            r0.f9053p = r9
            return r0
        L_0x021b:
            r23 = r3
            r24 = r8
            if (r29 == 0) goto L_0x02a3
            r25.b()
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r22 = 0
        L_0x022d:
            boolean r10 = r25.g()
            if (r10 == 0) goto L_0x027e
            r10 = r24
            int r11 = r0.t(r10)
            r12 = 1065353216(0x3f800000, float:1.0)
            switch(r11) {
                case 0: goto L_0x0275;
                case 1: goto L_0x026f;
                case 2: goto L_0x0267;
                case 3: goto L_0x0261;
                case 4: goto L_0x025b;
                case 5: goto L_0x024e;
                case 6: goto L_0x0248;
                case 7: goto L_0x0243;
                default: goto L_0x023e;
            }
        L_0x023e:
            r11 = 1
            r25.x()
            goto L_0x027b
        L_0x0243:
            android.graphics.PointF r9 = r1.m.b(r0, r1)
            goto L_0x024c
        L_0x0248:
            android.graphics.PointF r8 = r1.m.b(r0, r1)
        L_0x024c:
            r11 = 1
            goto L_0x027b
        L_0x024e:
            int r5 = r25.n()
            r11 = 1
            r24 = r10
            if (r5 != r11) goto L_0x0259
            r5 = r11
            goto L_0x022d
        L_0x0259:
            r5 = 0
            goto L_0x022d
        L_0x025b:
            r11 = 1
            android.graphics.PointF r4 = r1.m.b(r0, r12)
            goto L_0x027b
        L_0x0261:
            r11 = 1
            android.graphics.PointF r7 = r1.m.b(r0, r12)
            goto L_0x027b
        L_0x0267:
            r11 = 1
            java.lang.Object r12 = r2.f(r0, r1)
            r22 = r12
            goto L_0x027b
        L_0x026f:
            r11 = 1
            java.lang.Object r3 = r2.f(r0, r1)
            goto L_0x027b
        L_0x0275:
            r11 = 1
            double r12 = r25.l()
            float r6 = (float) r12
        L_0x027b:
            r24 = r10
            goto L_0x022d
        L_0x027e:
            r25.d()
            if (r5 == 0) goto L_0x0287
            r4 = r3
            r5 = r23
            goto L_0x0295
        L_0x0287:
            if (r7 == 0) goto L_0x0290
            if (r4 == 0) goto L_0x0290
            android.view.animation.Interpolator r0 = a(r7, r4)
            goto L_0x0292
        L_0x0290:
            r0 = r23
        L_0x0292:
            r5 = r0
            r4 = r22
        L_0x0295:
            u1.a r0 = new u1.a
            r7 = 0
            r1 = r0
            r2 = r26
            r1.<init>((h1.f) r2, r3, r4, (android.view.animation.Interpolator) r5, (float) r6, (java.lang.Float) r7)
            r0.f9052o = r8
            r0.f9053p = r9
            return r0
        L_0x02a3:
            java.lang.Object r0 = r2.f(r0, r1)
            u1.a r1 = new u1.a
            r1.<init>(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: r1.n.b(s1.a, h1.f, float, r1.d0, boolean, boolean):u1.a");
    }
}
