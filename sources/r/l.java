package r;

import q.e;
import r.f;

public final class l extends p {

    /* renamed from: k  reason: collision with root package name */
    public static final int[] f8309k = new int[2];

    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f8310a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                r.p$b[] r0 = r.p.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f8310a = r0
                r.p$b r1 = r.p.b.START     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f8310a     // Catch:{ NoSuchFieldError -> 0x001d }
                r.p$b r1 = r.p.b.END     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f8310a     // Catch:{ NoSuchFieldError -> 0x0028 }
                r.p$b r1 = r.p.b.CENTER     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: r.l.a.<clinit>():void");
        }
    }

    public l(e eVar) {
        super(eVar);
        this.f8326h.f8300e = f.a.LEFT;
        this.f8327i.f8300e = f.a.RIGHT;
        this.f8324f = 0;
    }

    public static void m(int[] iArr, int i10, int i11, int i12, int i13, float f10, int i14) {
        int i15 = i11 - i10;
        int i16 = i13 - i12;
        if (i14 == -1) {
            int i17 = (int) ((((float) i16) * f10) + 0.5f);
            int i18 = (int) ((((float) i15) / f10) + 0.5f);
            if (i17 <= i15) {
                iArr[0] = i17;
                iArr[1] = i16;
            } else if (i18 <= i16) {
                iArr[0] = i15;
                iArr[1] = i18;
            }
        } else if (i14 == 0) {
            iArr[0] = (int) ((((float) i16) * f10) + 0.5f);
            iArr[1] = i16;
        } else if (i14 == 1) {
            iArr[0] = i15;
            iArr[1] = (int) ((((float) i15) * f10) + 0.5f);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:94:0x022c, code lost:
        if (r15 != 1) goto L_0x0279;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(r.d r23) {
        /*
            r22 = this;
            r0 = r22
            int[] r1 = r.l.a.f8310a
            r.p$b r2 = r0.f8328j
            int r2 = r2.ordinal()
            r1 = r1[r2]
            r2 = 0
            r3 = 3
            if (r1 == r3) goto L_0x0351
            r.g r1 = r0.f8323e
            boolean r4 = r1.f8305j
            r.f r5 = r0.f8326h
            r.f r6 = r0.f8327i
            r7 = 1056964608(0x3f000000, float:0.5)
            r8 = 1
            if (r4 != 0) goto L_0x0279
            q.e$b r4 = r0.d
            q.e$b r9 = q.e.b.MATCH_CONSTRAINT
            if (r4 != r9) goto L_0x0279
            q.e r4 = r0.f8321b
            int r9 = r4.f8183r
            r10 = 2
            if (r9 == r10) goto L_0x0262
            if (r9 == r3) goto L_0x002e
            goto L_0x0279
        L_0x002e:
            int r9 = r4.f8184s
            r10 = -1
            if (r9 == 0) goto L_0x0059
            if (r9 != r3) goto L_0x0036
            goto L_0x0059
        L_0x0036:
            int r3 = r4.Z
            if (r3 == r10) goto L_0x004d
            if (r3 == 0) goto L_0x0041
            if (r3 == r8) goto L_0x004d
            r3 = r2
            goto L_0x0276
        L_0x0041:
            r.n r3 = r4.f8158e
            r.g r3 = r3.f8323e
            int r3 = r3.f8302g
            float r3 = (float) r3
            float r4 = r4.Y
            float r3 = r3 / r4
            goto L_0x0274
        L_0x004d:
            r.n r3 = r4.f8158e
            r.g r3 = r3.f8323e
            int r3 = r3.f8302g
            float r3 = (float) r3
            float r4 = r4.Y
            float r3 = r3 * r4
            goto L_0x0274
        L_0x0059:
            r.n r3 = r4.f8158e
            r.f r9 = r3.f8326h
            r.f r3 = r3.f8327i
            q.d r11 = r4.J
            q.d r11 = r11.f8146f
            if (r11 == 0) goto L_0x0067
            r11 = r8
            goto L_0x0068
        L_0x0067:
            r11 = r2
        L_0x0068:
            q.d r12 = r4.K
            q.d r12 = r12.f8146f
            if (r12 == 0) goto L_0x0070
            r12 = r8
            goto L_0x0071
        L_0x0070:
            r12 = r2
        L_0x0071:
            q.d r13 = r4.L
            q.d r13 = r13.f8146f
            if (r13 == 0) goto L_0x0079
            r13 = r8
            goto L_0x007a
        L_0x0079:
            r13 = r2
        L_0x007a:
            q.d r14 = r4.M
            q.d r14 = r14.f8146f
            if (r14 == 0) goto L_0x0082
            r14 = r8
            goto L_0x0083
        L_0x0082:
            r14 = r2
        L_0x0083:
            int r15 = r4.Z
            if (r11 == 0) goto L_0x019a
            if (r12 == 0) goto L_0x019a
            if (r13 == 0) goto L_0x019a
            if (r14 == 0) goto L_0x019a
            float r4 = r4.Y
            boolean r10 = r9.f8305j
            int[] r11 = f8309k
            if (r10 == 0) goto L_0x00e4
            boolean r10 = r3.f8305j
            if (r10 == 0) goto L_0x00e4
            boolean r7 = r5.f8299c
            if (r7 == 0) goto L_0x00e3
            boolean r7 = r6.f8299c
            if (r7 != 0) goto L_0x00a2
            goto L_0x00e3
        L_0x00a2:
            java.util.ArrayList r7 = r5.l
            java.lang.Object r7 = r7.get(r2)
            r.f r7 = (r.f) r7
            int r7 = r7.f8302g
            int r5 = r5.f8301f
            int r16 = r7 + r5
            java.util.ArrayList r5 = r6.l
            java.lang.Object r5 = r5.get(r2)
            r.f r5 = (r.f) r5
            int r5 = r5.f8302g
            int r6 = r6.f8301f
            int r17 = r5 - r6
            int r5 = r9.f8302g
            int r6 = r9.f8301f
            int r18 = r5 + r6
            int r5 = r3.f8302g
            int r3 = r3.f8301f
            int r19 = r5 - r3
            r10 = r15
            r15 = r11
            r20 = r4
            r21 = r10
            m(r15, r16, r17, r18, r19, r20, r21)
            r2 = r11[r2]
            r1.d(r2)
            q.e r1 = r0.f8321b
            r.n r1 = r1.f8158e
            r.g r1 = r1.f8323e
            r2 = r11[r8]
            r1.d(r2)
        L_0x00e3:
            return
        L_0x00e4:
            r10 = r15
            boolean r12 = r5.f8305j
            java.util.ArrayList r13 = r9.l
            if (r12 == 0) goto L_0x0138
            boolean r12 = r6.f8305j
            if (r12 == 0) goto L_0x0138
            boolean r12 = r9.f8299c
            if (r12 == 0) goto L_0x0137
            boolean r12 = r3.f8299c
            if (r12 != 0) goto L_0x00f8
            goto L_0x0137
        L_0x00f8:
            int r12 = r5.f8302g
            int r14 = r5.f8301f
            int r16 = r12 + r14
            int r12 = r6.f8302g
            int r14 = r6.f8301f
            int r17 = r12 - r14
            java.lang.Object r12 = r13.get(r2)
            r.f r12 = (r.f) r12
            int r12 = r12.f8302g
            int r14 = r9.f8301f
            int r18 = r12 + r14
            java.util.ArrayList r12 = r3.l
            java.lang.Object r12 = r12.get(r2)
            r.f r12 = (r.f) r12
            int r12 = r12.f8302g
            int r14 = r3.f8301f
            int r19 = r12 - r14
            r15 = r11
            r20 = r4
            r21 = r10
            m(r15, r16, r17, r18, r19, r20, r21)
            r12 = r11[r2]
            r1.d(r12)
            q.e r12 = r0.f8321b
            r.n r12 = r12.f8158e
            r.g r12 = r12.f8323e
            r14 = r11[r8]
            r12.d(r14)
            goto L_0x0138
        L_0x0137:
            return
        L_0x0138:
            boolean r12 = r5.f8299c
            if (r12 == 0) goto L_0x0199
            boolean r12 = r6.f8299c
            if (r12 == 0) goto L_0x0199
            boolean r12 = r9.f8299c
            if (r12 == 0) goto L_0x0199
            boolean r12 = r3.f8299c
            if (r12 != 0) goto L_0x0149
            goto L_0x0199
        L_0x0149:
            java.util.ArrayList r12 = r5.l
            java.lang.Object r12 = r12.get(r2)
            r.f r12 = (r.f) r12
            int r12 = r12.f8302g
            int r14 = r5.f8301f
            int r16 = r12 + r14
            java.util.ArrayList r12 = r6.l
            java.lang.Object r12 = r12.get(r2)
            r.f r12 = (r.f) r12
            int r12 = r12.f8302g
            int r14 = r6.f8301f
            int r17 = r12 - r14
            java.lang.Object r12 = r13.get(r2)
            r.f r12 = (r.f) r12
            int r12 = r12.f8302g
            int r9 = r9.f8301f
            int r18 = r12 + r9
            java.util.ArrayList r9 = r3.l
            java.lang.Object r9 = r9.get(r2)
            r.f r9 = (r.f) r9
            int r9 = r9.f8302g
            int r3 = r3.f8301f
            int r19 = r9 - r3
            r15 = r11
            r20 = r4
            r21 = r10
            m(r15, r16, r17, r18, r19, r20, r21)
            r3 = r11[r2]
            r1.d(r3)
            q.e r3 = r0.f8321b
            r.n r3 = r3.f8158e
            r.g r3 = r3.f8323e
            r4 = r11[r8]
            r3.d(r4)
            goto L_0x0279
        L_0x0199:
            return
        L_0x019a:
            if (r11 == 0) goto L_0x01ff
            if (r13 == 0) goto L_0x01ff
            boolean r3 = r5.f8299c
            if (r3 == 0) goto L_0x01fe
            boolean r3 = r6.f8299c
            if (r3 != 0) goto L_0x01a7
            goto L_0x01fe
        L_0x01a7:
            float r3 = r4.Y
            java.util.ArrayList r4 = r5.l
            java.lang.Object r4 = r4.get(r2)
            r.f r4 = (r.f) r4
            int r4 = r4.f8302g
            int r9 = r5.f8301f
            int r4 = r4 + r9
            java.util.ArrayList r9 = r6.l
            java.lang.Object r9 = r9.get(r2)
            r.f r9 = (r.f) r9
            int r9 = r9.f8302g
            int r11 = r6.f8301f
            int r9 = r9 - r11
            if (r15 == r10) goto L_0x01dd
            if (r15 == 0) goto L_0x01dd
            if (r15 == r8) goto L_0x01cb
            goto L_0x0279
        L_0x01cb:
            int r9 = r9 - r4
            int r4 = r0.g(r9, r2)
            float r9 = (float) r4
            float r9 = r9 / r3
            float r9 = r9 + r7
            int r9 = (int) r9
            int r10 = r0.g(r9, r8)
            if (r9 == r10) goto L_0x01f0
            float r4 = (float) r10
            float r4 = r4 * r3
            goto L_0x01ee
        L_0x01dd:
            int r9 = r9 - r4
            int r4 = r0.g(r9, r2)
            float r9 = (float) r4
            float r9 = r9 * r3
            float r9 = r9 + r7
            int r9 = (int) r9
            int r10 = r0.g(r9, r8)
            if (r9 == r10) goto L_0x01f0
            float r4 = (float) r10
            float r4 = r4 / r3
        L_0x01ee:
            float r4 = r4 + r7
            int r4 = (int) r4
        L_0x01f0:
            r1.d(r4)
            q.e r3 = r0.f8321b
            r.n r3 = r3.f8158e
            r.g r3 = r3.f8323e
            r3.d(r10)
            goto L_0x0279
        L_0x01fe:
            return
        L_0x01ff:
            if (r12 == 0) goto L_0x0279
            if (r14 == 0) goto L_0x0279
            boolean r11 = r9.f8299c
            if (r11 == 0) goto L_0x0261
            boolean r11 = r3.f8299c
            if (r11 != 0) goto L_0x020c
            goto L_0x0261
        L_0x020c:
            float r4 = r4.Y
            java.util.ArrayList r11 = r9.l
            java.lang.Object r11 = r11.get(r2)
            r.f r11 = (r.f) r11
            int r11 = r11.f8302g
            int r9 = r9.f8301f
            int r11 = r11 + r9
            java.util.ArrayList r9 = r3.l
            java.lang.Object r9 = r9.get(r2)
            r.f r9 = (r.f) r9
            int r9 = r9.f8302g
            int r3 = r3.f8301f
            int r9 = r9 - r3
            if (r15 == r10) goto L_0x0241
            if (r15 == 0) goto L_0x022f
            if (r15 == r8) goto L_0x0241
            goto L_0x0279
        L_0x022f:
            int r9 = r9 - r11
            int r3 = r0.g(r9, r8)
            float r9 = (float) r3
            float r9 = r9 * r4
            float r9 = r9 + r7
            int r9 = (int) r9
            int r10 = r0.g(r9, r2)
            if (r9 == r10) goto L_0x0254
            float r3 = (float) r10
            float r3 = r3 / r4
            goto L_0x0252
        L_0x0241:
            int r9 = r9 - r11
            int r3 = r0.g(r9, r8)
            float r9 = (float) r3
            float r9 = r9 / r4
            float r9 = r9 + r7
            int r9 = (int) r9
            int r10 = r0.g(r9, r2)
            if (r9 == r10) goto L_0x0254
            float r3 = (float) r10
            float r3 = r3 * r4
        L_0x0252:
            float r3 = r3 + r7
            int r3 = (int) r3
        L_0x0254:
            r1.d(r10)
            q.e r4 = r0.f8321b
            r.n r4 = r4.f8158e
            r.g r4 = r4.f8323e
            r4.d(r3)
            goto L_0x0279
        L_0x0261:
            return
        L_0x0262:
            q.e r3 = r4.V
            if (r3 == 0) goto L_0x0279
            r.l r3 = r3.d
            r.g r3 = r3.f8323e
            boolean r9 = r3.f8305j
            if (r9 == 0) goto L_0x0279
            float r4 = r4.w
            int r3 = r3.f8302g
            float r3 = (float) r3
            float r3 = r3 * r4
        L_0x0274:
            float r3 = r3 + r7
            int r3 = (int) r3
        L_0x0276:
            r1.d(r3)
        L_0x0279:
            boolean r3 = r5.f8299c
            if (r3 == 0) goto L_0x0350
            boolean r3 = r6.f8299c
            if (r3 != 0) goto L_0x0283
            goto L_0x0350
        L_0x0283:
            boolean r3 = r5.f8305j
            if (r3 == 0) goto L_0x0290
            boolean r3 = r6.f8305j
            if (r3 == 0) goto L_0x0290
            boolean r3 = r1.f8305j
            if (r3 == 0) goto L_0x0290
            return
        L_0x0290:
            boolean r3 = r1.f8305j
            java.util.ArrayList r4 = r5.l
            java.util.ArrayList r9 = r6.l
            if (r3 != 0) goto L_0x02cc
            q.e$b r3 = r0.d
            q.e$b r10 = q.e.b.MATCH_CONSTRAINT
            if (r3 != r10) goto L_0x02cc
            q.e r3 = r0.f8321b
            int r10 = r3.f8183r
            if (r10 != 0) goto L_0x02cc
            boolean r3 = r3.r()
            if (r3 != 0) goto L_0x02cc
            java.lang.Object r3 = r4.get(r2)
            r.f r3 = (r.f) r3
            java.lang.Object r2 = r9.get(r2)
            r.f r2 = (r.f) r2
            int r3 = r3.f8302g
            int r4 = r5.f8301f
            int r3 = r3 + r4
            int r2 = r2.f8302g
            int r4 = r6.f8301f
            int r2 = r2 + r4
            int r4 = r2 - r3
            r5.d(r3)
            r6.d(r2)
            r1.d(r4)
            return
        L_0x02cc:
            boolean r3 = r1.f8305j
            if (r3 != 0) goto L_0x0316
            q.e$b r3 = r0.d
            q.e$b r10 = q.e.b.MATCH_CONSTRAINT
            if (r3 != r10) goto L_0x0316
            int r3 = r0.f8320a
            if (r3 != r8) goto L_0x0316
            int r3 = r4.size()
            if (r3 <= 0) goto L_0x0316
            int r3 = r9.size()
            if (r3 <= 0) goto L_0x0316
            java.lang.Object r3 = r4.get(r2)
            r.f r3 = (r.f) r3
            java.lang.Object r8 = r9.get(r2)
            r.f r8 = (r.f) r8
            int r3 = r3.f8302g
            int r10 = r5.f8301f
            int r3 = r3 + r10
            int r8 = r8.f8302g
            int r10 = r6.f8301f
            int r8 = r8 + r10
            int r8 = r8 - r3
            int r3 = r1.f8307m
            int r3 = java.lang.Math.min(r8, r3)
            q.e r8 = r0.f8321b
            int r10 = r8.f8186v
            int r8 = r8.u
            int r3 = java.lang.Math.max(r8, r3)
            if (r10 <= 0) goto L_0x0313
            int r3 = java.lang.Math.min(r10, r3)
        L_0x0313:
            r1.d(r3)
        L_0x0316:
            boolean r3 = r1.f8305j
            if (r3 != 0) goto L_0x031b
            return
        L_0x031b:
            java.lang.Object r3 = r4.get(r2)
            r.f r3 = (r.f) r3
            java.lang.Object r2 = r9.get(r2)
            r.f r2 = (r.f) r2
            int r4 = r3.f8302g
            int r8 = r5.f8301f
            int r8 = r8 + r4
            int r9 = r2.f8302g
            int r10 = r6.f8301f
            int r10 = r10 + r9
            q.e r11 = r0.f8321b
            float r11 = r11.f8161f0
            if (r3 != r2) goto L_0x0339
            r11 = r7
            goto L_0x033b
        L_0x0339:
            r4 = r8
            r9 = r10
        L_0x033b:
            int r9 = r9 - r4
            int r2 = r1.f8302g
            int r9 = r9 - r2
            float r2 = (float) r4
            float r2 = r2 + r7
            float r3 = (float) r9
            float r3 = r3 * r11
            float r3 = r3 + r2
            int r2 = (int) r3
            r5.d(r2)
            int r2 = r5.f8302g
            int r1 = r1.f8302g
            int r2 = r2 + r1
            r6.d(r2)
        L_0x0350:
            return
        L_0x0351:
            q.e r1 = r0.f8321b
            q.d r3 = r1.J
            q.d r1 = r1.L
            r0.l(r3, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: r.l.a(r.d):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0081, code lost:
        r0 = r10.f8321b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d() {
        /*
            r10 = this;
            q.e r0 = r10.f8321b
            boolean r1 = r0.f8151a
            r.g r2 = r10.f8323e
            if (r1 == 0) goto L_0x000f
            int r0 = r0.k()
            r2.d(r0)
        L_0x000f:
            boolean r0 = r2.f8305j
            r.f r1 = r10.f8327i
            r.f r3 = r10.f8326h
            r4 = 0
            if (r0 != 0) goto L_0x007b
            q.e r0 = r10.f8321b
            q.e$b[] r5 = r0.U
            r5 = r5[r4]
            r10.d = r5
            q.e$b r6 = q.e.b.MATCH_CONSTRAINT
            if (r5 == r6) goto L_0x00af
            q.e$b r6 = q.e.b.MATCH_PARENT
            if (r5 != r6) goto L_0x006f
            q.e r7 = r0.V
            if (r7 == 0) goto L_0x006f
            q.e$b[] r8 = r7.U
            r8 = r8[r4]
            q.e$b r9 = q.e.b.FIXED
            if (r8 == r9) goto L_0x0036
            if (r8 != r6) goto L_0x006f
        L_0x0036:
            int r0 = r7.k()
            q.e r4 = r10.f8321b
            q.d r4 = r4.J
            int r4 = r4.d()
            int r0 = r0 - r4
            q.e r4 = r10.f8321b
            q.d r4 = r4.L
            int r4 = r4.d()
            int r0 = r0 - r4
            r.l r4 = r7.d
            r.f r4 = r4.f8326h
            q.e r5 = r10.f8321b
            q.d r5 = r5.J
            int r5 = r5.d()
            r.p.b(r3, r4, r5)
            r.l r3 = r7.d
            r.f r3 = r3.f8327i
            q.e r4 = r10.f8321b
            q.d r4 = r4.L
            int r4 = r4.d()
            int r4 = -r4
            r.p.b(r1, r3, r4)
            r2.d(r0)
            return
        L_0x006f:
            q.e$b r6 = q.e.b.FIXED
            if (r5 != r6) goto L_0x00af
            int r0 = r0.k()
            r2.d(r0)
            goto L_0x00af
        L_0x007b:
            q.e$b r0 = r10.d
            q.e$b r5 = q.e.b.MATCH_PARENT
            if (r0 != r5) goto L_0x00af
            q.e r0 = r10.f8321b
            q.e r6 = r0.V
            if (r6 == 0) goto L_0x00af
            q.e$b[] r7 = r6.U
            r7 = r7[r4]
            q.e$b r8 = q.e.b.FIXED
            if (r7 == r8) goto L_0x0091
            if (r7 != r5) goto L_0x00af
        L_0x0091:
            r.l r2 = r6.d
            r.f r2 = r2.f8326h
            q.d r0 = r0.J
            int r0 = r0.d()
            r.p.b(r3, r2, r0)
            r.l r0 = r6.d
            r.f r0 = r0.f8327i
            q.e r2 = r10.f8321b
            q.d r2 = r2.L
            int r2 = r2.d()
            int r2 = -r2
            r.p.b(r1, r0, r2)
            return
        L_0x00af:
            boolean r0 = r2.f8305j
            r5 = 1
            if (r0 == 0) goto L_0x017b
            q.e r0 = r10.f8321b
            boolean r6 = r0.f8151a
            if (r6 == 0) goto L_0x017b
            q.d[] r6 = r0.R
            r7 = r6[r4]
            q.d r8 = r7.f8146f
            if (r8 == 0) goto L_0x011b
            r9 = r6[r5]
            q.d r9 = r9.f8146f
            if (r9 == 0) goto L_0x011b
            boolean r0 = r0.r()
            if (r0 == 0) goto L_0x00e2
            q.e r0 = r10.f8321b
            q.d[] r0 = r0.R
            r0 = r0[r4]
            int r0 = r0.d()
            r3.f8301f = r0
            q.e r0 = r10.f8321b
            q.d[] r0 = r0.R
            r0 = r0[r5]
            goto L_0x0285
        L_0x00e2:
            q.e r0 = r10.f8321b
            q.d[] r0 = r0.R
            r0 = r0[r4]
            r.f r0 = r.p.h(r0)
            if (r0 == 0) goto L_0x00fb
            q.e r2 = r10.f8321b
            q.d[] r2 = r2.R
            r2 = r2[r4]
            int r2 = r2.d()
            r.p.b(r3, r0, r2)
        L_0x00fb:
            q.e r0 = r10.f8321b
            q.d[] r0 = r0.R
            r0 = r0[r5]
            r.f r0 = r.p.h(r0)
            if (r0 == 0) goto L_0x0115
            q.e r2 = r10.f8321b
            q.d[] r2 = r2.R
            r2 = r2[r5]
            int r2 = r2.d()
            int r2 = -r2
            r.p.b(r1, r0, r2)
        L_0x0115:
            r3.f8298b = r5
            r1.f8298b = r5
            goto L_0x02fb
        L_0x011b:
            if (r8 == 0) goto L_0x0131
            r.f r0 = r.p.h(r7)
            if (r0 == 0) goto L_0x02fb
            q.e r5 = r10.f8321b
            q.d[] r5 = r5.R
            r4 = r5[r4]
            int r4 = r4.d()
            r.p.b(r3, r0, r4)
            goto L_0x0174
        L_0x0131:
            r4 = r6[r5]
            q.d r6 = r4.f8146f
            if (r6 == 0) goto L_0x0153
            r.f r0 = r.p.h(r4)
            if (r0 == 0) goto L_0x02fb
            q.e r4 = r10.f8321b
            q.d[] r4 = r4.R
            r4 = r4[r5]
            int r4 = r4.d()
            int r4 = -r4
            r.p.b(r1, r0, r4)
            int r0 = r2.f8302g
            int r0 = -r0
            r.p.b(r3, r1, r0)
            goto L_0x02fb
        L_0x0153:
            boolean r4 = r0 instanceof q.h
            if (r4 != 0) goto L_0x02fb
            q.e r4 = r0.V
            if (r4 == 0) goto L_0x02fb
            q.d$b r4 = q.d.b.CENTER
            q.d r0 = r0.g(r4)
            q.d r0 = r0.f8146f
            if (r0 != 0) goto L_0x02fb
            q.e r0 = r10.f8321b
            q.e r4 = r0.V
            r.l r4 = r4.d
            r.f r4 = r4.f8326h
            int r0 = r0.l()
            r.p.b(r3, r4, r0)
        L_0x0174:
            int r0 = r2.f8302g
            r.p.b(r1, r3, r0)
            goto L_0x02fb
        L_0x017b:
            q.e$b r0 = r10.d
            q.e$b r6 = q.e.b.MATCH_CONSTRAINT
            if (r0 != r6) goto L_0x025d
            q.e r0 = r10.f8321b
            int r6 = r0.f8183r
            r7 = 2
            java.util.ArrayList r8 = r2.f8306k
            java.util.ArrayList r9 = r2.l
            if (r6 == r7) goto L_0x0244
            r7 = 3
            if (r6 == r7) goto L_0x0191
            goto L_0x025d
        L_0x0191:
            int r6 = r0.f8184s
            if (r6 != r7) goto L_0x020f
            r3.f8297a = r10
            r1.f8297a = r10
            r.n r6 = r0.f8158e
            r.f r7 = r6.f8326h
            r7.f8297a = r10
            r.f r6 = r6.f8327i
            r6.f8297a = r10
            r2.f8297a = r10
            boolean r0 = r0.s()
            if (r0 == 0) goto L_0x01e9
            q.e r0 = r10.f8321b
            r.n r0 = r0.f8158e
            r.g r0 = r0.f8323e
            r9.add(r0)
            q.e r0 = r10.f8321b
            r.n r0 = r0.f8158e
            r.g r0 = r0.f8323e
            java.util.ArrayList r0 = r0.f8306k
            r0.add(r2)
            q.e r0 = r10.f8321b
            r.n r0 = r0.f8158e
            r.g r6 = r0.f8323e
            r6.f8297a = r10
            r.f r0 = r0.f8326h
            r9.add(r0)
            q.e r0 = r10.f8321b
            r.n r0 = r0.f8158e
            r.f r0 = r0.f8327i
            r9.add(r0)
            q.e r0 = r10.f8321b
            r.n r0 = r0.f8158e
            r.f r0 = r0.f8326h
            java.util.ArrayList r0 = r0.f8306k
            r0.add(r2)
            q.e r0 = r10.f8321b
            r.n r0 = r0.f8158e
            r.f r0 = r0.f8327i
            java.util.ArrayList r0 = r0.f8306k
            goto L_0x0240
        L_0x01e9:
            q.e r0 = r10.f8321b
            boolean r0 = r0.r()
            if (r0 == 0) goto L_0x0206
            q.e r0 = r10.f8321b
            r.n r0 = r0.f8158e
            r.g r0 = r0.f8323e
            java.util.ArrayList r0 = r0.l
            r0.add(r2)
            q.e r0 = r10.f8321b
            r.n r0 = r0.f8158e
            r.g r0 = r0.f8323e
            r8.add(r0)
            goto L_0x025d
        L_0x0206:
            q.e r0 = r10.f8321b
            r.n r0 = r0.f8158e
            r.g r0 = r0.f8323e
            java.util.ArrayList r0 = r0.l
            goto L_0x0240
        L_0x020f:
            r.n r0 = r0.f8158e
            r.g r0 = r0.f8323e
            r9.add(r0)
            java.util.ArrayList r0 = r0.f8306k
            r0.add(r2)
            q.e r0 = r10.f8321b
            r.n r0 = r0.f8158e
            r.f r0 = r0.f8326h
            java.util.ArrayList r0 = r0.f8306k
            r0.add(r2)
            q.e r0 = r10.f8321b
            r.n r0 = r0.f8158e
            r.f r0 = r0.f8327i
            java.util.ArrayList r0 = r0.f8306k
            r0.add(r2)
            r2.f8298b = r5
            r8.add(r3)
            r8.add(r1)
            java.util.ArrayList r0 = r3.l
            r0.add(r2)
            java.util.ArrayList r0 = r1.l
        L_0x0240:
            r0.add(r2)
            goto L_0x025d
        L_0x0244:
            q.e r0 = r0.V
            if (r0 != 0) goto L_0x0249
            goto L_0x025d
        L_0x0249:
            r.n r0 = r0.f8158e
            r.g r0 = r0.f8323e
            r9.add(r0)
            java.util.ArrayList r0 = r0.f8306k
            r0.add(r2)
            r2.f8298b = r5
            r8.add(r3)
            r8.add(r1)
        L_0x025d:
            q.e r0 = r10.f8321b
            q.d[] r6 = r0.R
            r7 = r6[r4]
            q.d r8 = r7.f8146f
            if (r8 == 0) goto L_0x02b0
            r9 = r6[r5]
            q.d r9 = r9.f8146f
            if (r9 == 0) goto L_0x02b0
            boolean r0 = r0.r()
            if (r0 == 0) goto L_0x028d
            q.e r0 = r10.f8321b
            q.d[] r0 = r0.R
            r0 = r0[r4]
            int r0 = r0.d()
            r3.f8301f = r0
            q.e r0 = r10.f8321b
            q.d[] r0 = r0.R
            r0 = r0[r5]
        L_0x0285:
            int r0 = r0.d()
            int r0 = -r0
            r1.f8301f = r0
            goto L_0x02fb
        L_0x028d:
            q.e r0 = r10.f8321b
            q.d[] r0 = r0.R
            r0 = r0[r4]
            r.f r0 = r.p.h(r0)
            q.e r1 = r10.f8321b
            q.d[] r1 = r1.R
            r1 = r1[r5]
            r.f r1 = r.p.h(r1)
            if (r0 == 0) goto L_0x02a6
            r0.b(r10)
        L_0x02a6:
            if (r1 == 0) goto L_0x02ab
            r1.b(r10)
        L_0x02ab:
            r.p$b r0 = r.p.b.CENTER
            r10.f8328j = r0
            goto L_0x02fb
        L_0x02b0:
            if (r8 == 0) goto L_0x02c6
            r.f r0 = r.p.h(r7)
            if (r0 == 0) goto L_0x02fb
            q.e r6 = r10.f8321b
            q.d[] r6 = r6.R
            r4 = r6[r4]
            int r4 = r4.d()
            r.p.b(r3, r0, r4)
            goto L_0x02f8
        L_0x02c6:
            r4 = r6[r5]
            q.d r6 = r4.f8146f
            if (r6 == 0) goto L_0x02e5
            r.f r0 = r.p.h(r4)
            if (r0 == 0) goto L_0x02fb
            q.e r4 = r10.f8321b
            q.d[] r4 = r4.R
            r4 = r4[r5]
            int r4 = r4.d()
            int r4 = -r4
            r.p.b(r1, r0, r4)
            r0 = -1
            r10.c(r3, r1, r0, r2)
            goto L_0x02fb
        L_0x02e5:
            boolean r4 = r0 instanceof q.h
            if (r4 != 0) goto L_0x02fb
            q.e r4 = r0.V
            if (r4 == 0) goto L_0x02fb
            r.l r4 = r4.d
            r.f r4 = r4.f8326h
            int r0 = r0.l()
            r.p.b(r3, r4, r0)
        L_0x02f8:
            r10.c(r1, r3, r5, r2)
        L_0x02fb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: r.l.d():void");
    }

    public final void e() {
        f fVar = this.f8326h;
        if (fVar.f8305j) {
            this.f8321b.f8152a0 = fVar.f8302g;
        }
    }

    public final void f() {
        this.f8322c = null;
        this.f8326h.c();
        this.f8327i.c();
        this.f8323e.c();
        this.f8325g = false;
    }

    public final boolean k() {
        return this.d != e.b.MATCH_CONSTRAINT || this.f8321b.f8183r == 0;
    }

    public final void n() {
        this.f8325g = false;
        f fVar = this.f8326h;
        fVar.c();
        fVar.f8305j = false;
        f fVar2 = this.f8327i;
        fVar2.c();
        fVar2.f8305j = false;
        this.f8323e.f8305j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.f8321b.f8169j0;
    }
}
