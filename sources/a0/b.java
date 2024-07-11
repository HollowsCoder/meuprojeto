package a0;

import android.util.TypedValue;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal<TypedValue> f12a = new ThreadLocal<>();

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0011  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0016  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.res.ColorStateList a(android.content.res.Resources r4, android.content.res.XmlResourceParser r5, android.content.res.Resources.Theme r6) {
        /*
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r5)
        L_0x0004:
            int r1 = r5.next()
            r2 = 2
            if (r1 == r2) goto L_0x000f
            r3 = 1
            if (r1 == r3) goto L_0x000f
            goto L_0x0004
        L_0x000f:
            if (r1 != r2) goto L_0x0016
            android.content.res.ColorStateList r4 = b(r4, r5, r0, r6)
            return r4
        L_0x0016:
            org.xmlpull.v1.XmlPullParserException r4 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r5 = "No start tag found"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.b.a(android.content.res.Resources, android.content.res.XmlResourceParser, android.content.res.Resources$Theme):android.content.res.ColorStateList");
    }

    /* JADX WARNING: type inference failed for: r1v13, types: [java.lang.Object[], java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0321  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x0337  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x034a  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x0364  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x012e  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.res.ColorStateList b(android.content.res.Resources r36, android.content.res.XmlResourceParser r37, android.util.AttributeSet r38, android.content.res.Resources.Theme r39) {
        /*
            r0 = r36
            r1 = r38
            r2 = r39
            java.lang.String r3 = r37.getName()
            java.lang.String r4 = "selector"
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L_0x0396
            int r3 = r37.getDepth()
            r4 = 1
            int r3 = r3 + r4
            r5 = 20
            int[][] r6 = new int[r5][]
            int[] r5 = new int[r5]
            r7 = 0
            r8 = r7
        L_0x0020:
            int r9 = r37.next()
            if (r9 == r4) goto L_0x0384
            int r10 = r37.getDepth()
            r11 = 3
            if (r10 >= r3) goto L_0x002f
            if (r9 == r11) goto L_0x0384
        L_0x002f:
            r12 = 2
            if (r9 != r12) goto L_0x0375
            if (r10 > r3) goto L_0x0375
            java.lang.String r9 = r37.getName()
            java.lang.String r10 = "item"
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L_0x0042
            goto L_0x0375
        L_0x0042:
            int[] r9 = n.e.f7302x
            if (r2 != 0) goto L_0x004b
            android.content.res.TypedArray r9 = r0.obtainAttributes(r1, r9)
            goto L_0x004f
        L_0x004b:
            android.content.res.TypedArray r9 = r2.obtainStyledAttributes(r1, r9, r7, r7)
        L_0x004f:
            r10 = -1
            int r13 = r9.getResourceId(r7, r10)
            if (r13 == r10) goto L_0x0087
            java.lang.ThreadLocal<android.util.TypedValue> r14 = f12a
            java.lang.Object r15 = r14.get()
            android.util.TypedValue r15 = (android.util.TypedValue) r15
            if (r15 != 0) goto L_0x0068
            android.util.TypedValue r15 = new android.util.TypedValue
            r15.<init>()
            r14.set(r15)
        L_0x0068:
            r0.getValue(r13, r15, r4)
            int r14 = r15.type
            r15 = 28
            if (r14 < r15) goto L_0x0077
            r15 = 31
            if (r14 > r15) goto L_0x0077
            r14 = r4
            goto L_0x0078
        L_0x0077:
            r14 = r7
        L_0x0078:
            if (r14 != 0) goto L_0x0087
            android.content.res.XmlResourceParser r13 = r0.getXml(r13)     // Catch:{ Exception -> 0x0087 }
            android.content.res.ColorStateList r13 = a(r0, r13, r2)     // Catch:{ Exception -> 0x0087 }
            int r13 = r13.getDefaultColor()     // Catch:{ Exception -> 0x0087 }
            goto L_0x008e
        L_0x0087:
            r13 = -65281(0xffffffffffff00ff, float:NaN)
            int r13 = r9.getColor(r7, r13)
        L_0x008e:
            boolean r14 = r9.hasValue(r4)
            r15 = 1065353216(0x3f800000, float:1.0)
            if (r14 == 0) goto L_0x009b
            float r11 = r9.getFloat(r4, r15)
            goto L_0x00a7
        L_0x009b:
            boolean r14 = r9.hasValue(r11)
            if (r14 == 0) goto L_0x00a6
            float r11 = r9.getFloat(r11, r15)
            goto L_0x00a7
        L_0x00a6:
            r11 = r15
        L_0x00a7:
            boolean r14 = e0.a.a()
            r10 = 4
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r14 == 0) goto L_0x00bb
            boolean r14 = r9.hasValue(r12)
            if (r14 == 0) goto L_0x00bb
            float r4 = r9.getFloat(r12, r4)
            goto L_0x00bf
        L_0x00bb:
            float r4 = r9.getFloat(r10, r4)
        L_0x00bf:
            r9.recycle()
            int r9 = r38.getAttributeCount()
            int[] r14 = new int[r9]
            r10 = r7
            r12 = r10
        L_0x00ca:
            if (r10 >= r9) goto L_0x00fa
            int r15 = r1.getAttributeNameResource(r10)
            r7 = 16843173(0x10101a5, float:2.3694738E-38)
            if (r15 == r7) goto L_0x00f2
            r7 = 16843551(0x101031f, float:2.3695797E-38)
            if (r15 == r7) goto L_0x00f2
            r7 = 2130968626(0x7f040032, float:1.754591E38)
            if (r15 == r7) goto L_0x00f2
            r7 = 2130969114(0x7f04021a, float:1.75469E38)
            if (r15 == r7) goto L_0x00f2
            int r7 = r12 + 1
            r0 = 0
            boolean r18 = r1.getAttributeBooleanValue(r10, r0)
            if (r18 == 0) goto L_0x00ee
            goto L_0x00ef
        L_0x00ee:
            int r15 = -r15
        L_0x00ef:
            r14[r12] = r15
            r12 = r7
        L_0x00f2:
            int r10 = r10 + 1
            r0 = r36
            r7 = 0
            r15 = 1065353216(0x3f800000, float:1.0)
            goto L_0x00ca
        L_0x00fa:
            int[] r0 = android.util.StateSet.trimStateSet(r14, r12)
            r7 = 0
            int r9 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            r10 = 1120403456(0x42c80000, float:100.0)
            if (r9 < 0) goto L_0x010b
            int r9 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r9 > 0) goto L_0x010b
            r9 = 1
            goto L_0x010c
        L_0x010b:
            r9 = 0
        L_0x010c:
            r12 = 1065353216(0x3f800000, float:1.0)
            int r14 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            if (r14 != 0) goto L_0x011b
            if (r9 != 0) goto L_0x011b
            r21 = r3
            r9 = r6
            r4 = 1
            r3 = r0
            goto L_0x0330
        L_0x011b:
            int r12 = android.graphics.Color.alpha(r13)
            float r12 = (float) r12
            float r12 = r12 * r11
            r11 = 1056964608(0x3f000000, float:0.5)
            float r12 = r12 + r11
            int r11 = (int) r12
            r12 = 255(0xff, float:3.57E-43)
            r14 = 0
            int r11 = androidx.databinding.a.l(r11, r14, r12)
            if (r9 == 0) goto L_0x0321
            a0.a r9 = a0.a.a(r13)
            a0.i r12 = a0.i.f36k
            float r13 = r9.f8b
            double r14 = (double) r13
            r18 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r14 = (r14 > r18 ? 1 : (r14 == r18 ? 0 : -1))
            r18 = 1147261687(0x4461d2f7, float:903.2963)
            r19 = 1122500608(0x42e80000, float:116.0)
            r20 = 1098907648(0x41800000, float:16.0)
            if (r14 < 0) goto L_0x02bc
            int r14 = java.lang.Math.round(r4)
            r22 = r11
            double r10 = (double) r14
            r23 = 0
            int r10 = (r10 > r23 ? 1 : (r10 == r23 ? 0 : -1))
            if (r10 <= 0) goto L_0x02b8
            int r10 = java.lang.Math.round(r4)
            double r10 = (double) r10
            r23 = 4636737291354636288(0x4059000000000000, double:100.0)
            int r10 = (r10 > r23 ? 1 : (r10 == r23 ? 0 : -1))
            if (r10 < 0) goto L_0x015e
            goto L_0x02b8
        L_0x015e:
            float r9 = r9.f7a
            int r10 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r10 >= 0) goto L_0x0166
            r9 = r7
            goto L_0x016c
        L_0x0166:
            r10 = 1135869952(0x43b40000, float:360.0)
            float r9 = java.lang.Math.min(r10, r9)
        L_0x016c:
            r23 = r7
            r11 = r13
            r10 = 0
            r14 = 1
        L_0x0171:
            float r25 = r23 - r13
            float r25 = java.lang.Math.abs(r25)
            r26 = 1053609165(0x3ecccccd, float:0.4)
            int r25 = (r25 > r26 ? 1 : (r25 == r26 ? 0 : -1))
            if (r25 < 0) goto L_0x02aa
            r25 = 1148846080(0x447a0000, float:1000.0)
            r27 = r7
            r26 = r25
            r28 = 1120403456(0x42c80000, float:100.0)
            r29 = 0
        L_0x0188:
            float r30 = r27 - r28
            float r30 = java.lang.Math.abs(r30)
            r31 = 1008981770(0x3c23d70a, float:0.01)
            int r30 = (r30 > r31 ? 1 : (r30 == r31 ? 0 : -1))
            r31 = 1073741824(0x40000000, float:2.0)
            if (r30 <= 0) goto L_0x0273
            float r30 = r28 - r27
            float r30 = r30 / r31
            float r7 = r30 + r27
            a0.a r15 = a0.a.b(r7, r11, r9)
            a0.i r1 = a0.i.f36k
            int r1 = r15.c(r1)
            int r15 = android.graphics.Color.red(r1)
            float r15 = s6.a.z(r15)
            int r32 = android.graphics.Color.green(r1)
            float r32 = s6.a.z(r32)
            int r33 = android.graphics.Color.blue(r1)
            float r33 = s6.a.z(r33)
            float[][] r34 = s6.a.f8804r
            r16 = 1
            r34 = r34[r16]
            r17 = 0
            r35 = r34[r17]
            float r15 = r15 * r35
            r35 = r34[r16]
            float r32 = r32 * r35
            float r32 = r32 + r15
            r15 = 2
            r34 = r34[r15]
            float r33 = r33 * r34
            float r33 = r33 + r32
            r15 = 1120403456(0x42c80000, float:100.0)
            float r2 = r33 / r15
            r21 = 1007753895(0x3c111aa7, float:0.008856452)
            int r32 = (r2 > r21 ? 1 : (r2 == r21 ? 0 : -1))
            if (r32 > 0) goto L_0x01e8
            float r2 = r2 * r18
            r21 = r3
            goto L_0x01f4
        L_0x01e8:
            r21 = r3
            double r2 = (double) r2
            double r2 = java.lang.Math.cbrt(r2)
            float r2 = (float) r2
            float r2 = r2 * r19
            float r2 = r2 - r20
        L_0x01f4:
            float r3 = r4 - r2
            float r3 = java.lang.Math.abs(r3)
            r32 = 1045220557(0x3e4ccccd, float:0.2)
            int r32 = (r3 > r32 ? 1 : (r3 == r32 ? 0 : -1))
            if (r32 >= 0) goto L_0x024d
            a0.a r1 = a0.a.a(r1)
            float r15 = r1.f9c
            r33 = r3
            float r3 = r1.f8b
            a0.a r3 = a0.a.b(r15, r3, r9)
            float r15 = r3.d
            r34 = r7
            float r7 = r1.d
            float r7 = r7 - r15
            float r15 = r1.f10e
            r35 = r9
            float r9 = r3.f10e
            float r15 = r15 - r9
            float r9 = r1.f11f
            float r3 = r3.f11f
            float r9 = r9 - r3
            float r7 = r7 * r7
            float r15 = r15 * r15
            float r15 = r15 + r7
            float r9 = r9 * r9
            float r9 = r9 + r15
            r3 = r0
            r7 = r1
            double r0 = (double) r9
            double r0 = java.lang.Math.sqrt(r0)
            r9 = r6
            r15 = r7
            r6 = 4603849755075763241(0x3fe428f5c28f5c29, double:0.63)
            double r0 = java.lang.Math.pow(r0, r6)
            r6 = 4609028894647239311(0x3ff68f5c28f5c28f, double:1.41)
            double r0 = r0 * r6
            float r0 = (float) r0
            r1 = 1065353216(0x3f800000, float:1.0)
            int r6 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r6 > 0) goto L_0x0253
            r26 = r0
            r29 = r15
            r25 = r33
            goto L_0x0253
        L_0x024d:
            r3 = r0
            r34 = r7
            r35 = r9
            r9 = r6
        L_0x0253:
            r0 = 0
            int r1 = (r25 > r0 ? 1 : (r25 == r0 ? 0 : -1))
            if (r1 != 0) goto L_0x025d
            int r1 = (r26 > r0 ? 1 : (r26 == r0 ? 0 : -1))
            if (r1 != 0) goto L_0x025d
            goto L_0x027a
        L_0x025d:
            int r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r1 >= 0) goto L_0x0264
            r27 = r34
            goto L_0x0266
        L_0x0264:
            r28 = r34
        L_0x0266:
            r1 = r38
            r2 = r39
            r7 = r0
            r0 = r3
            r6 = r9
            r3 = r21
            r9 = r35
            goto L_0x0188
        L_0x0273:
            r21 = r3
            r35 = r9
            r3 = r0
            r9 = r6
            r0 = r7
        L_0x027a:
            r1 = r29
            if (r14 == 0) goto L_0x028e
            if (r1 == 0) goto L_0x0285
            int r13 = r1.c(r12)
            goto L_0x02b5
        L_0x0285:
            float r1 = r13 - r23
            float r1 = r1 / r31
            float r1 = r1 + r23
            r11 = r1
            r14 = 0
            goto L_0x029d
        L_0x028e:
            if (r1 != 0) goto L_0x0294
            r13 = r11
            r11 = r23
            goto L_0x0295
        L_0x0294:
            r10 = r1
        L_0x0295:
            float r1 = r13 - r11
            float r1 = r1 / r31
            float r1 = r1 + r11
            r23 = r11
            r11 = r1
        L_0x029d:
            r1 = r38
            r2 = r39
            r7 = r0
            r0 = r3
            r6 = r9
            r3 = r21
            r9 = r35
            goto L_0x0171
        L_0x02aa:
            r21 = r3
            r9 = r6
            r3 = r0
            if (r10 != 0) goto L_0x02b1
            goto L_0x02c2
        L_0x02b1:
            int r13 = r10.c(r12)
        L_0x02b5:
            r4 = 1
            goto L_0x0328
        L_0x02b8:
            r21 = r3
            r9 = r6
            goto L_0x02c1
        L_0x02bc:
            r21 = r3
            r9 = r6
            r22 = r11
        L_0x02c1:
            r3 = r0
        L_0x02c2:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x02cc
            r10 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r4 = 1
            goto L_0x031f
        L_0x02cc:
            r0 = 1120272384(0x42c60000, float:99.0)
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x02d5
            r4 = 1
            r10 = -1
            goto L_0x031f
        L_0x02d5:
            float r0 = r4 + r20
            float r0 = r0 / r19
            r1 = 1090519040(0x41000000, float:8.0)
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x02e1
            r1 = 1
            goto L_0x02e2
        L_0x02e1:
            r1 = 0
        L_0x02e2:
            if (r1 == 0) goto L_0x02e8
            float r1 = r0 * r0
            float r1 = r1 * r0
            goto L_0x02ea
        L_0x02e8:
            float r1 = r4 / r18
        L_0x02ea:
            float r2 = r0 * r0
            float r2 = r2 * r0
            r4 = 1007753895(0x3c111aa7, float:0.008856452)
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 <= 0) goto L_0x02f6
            r4 = 1
            goto L_0x02f7
        L_0x02f6:
            r4 = 0
        L_0x02f7:
            if (r4 == 0) goto L_0x02fb
            r6 = r2
            goto L_0x0301
        L_0x02fb:
            float r6 = r0 * r19
            float r6 = r6 - r20
            float r6 = r6 / r18
        L_0x0301:
            if (r4 == 0) goto L_0x0304
            goto L_0x030a
        L_0x0304:
            float r0 = r0 * r19
            float r0 = r0 - r20
            float r2 = r0 / r18
        L_0x030a:
            float[] r0 = s6.a.f8803q
            r4 = 0
            r7 = r0[r4]
            float r6 = r6 * r7
            double r10 = (double) r6
            r4 = 1
            r6 = r0[r4]
            float r1 = r1 * r6
            double r12 = (double) r1
            r1 = 2
            r0 = r0[r1]
            float r2 = r2 * r0
            double r14 = (double) r2
            int r10 = b0.a.a(r10, r12, r14)
        L_0x031f:
            r13 = r10
            goto L_0x0328
        L_0x0321:
            r21 = r3
            r9 = r6
            r22 = r11
            r4 = 1
            r3 = r0
        L_0x0328:
            r0 = 16777215(0xffffff, float:2.3509886E-38)
            r0 = r0 & r13
            int r1 = r22 << 24
            r13 = r0 | r1
        L_0x0330:
            int r0 = r8 + 1
            int r1 = r5.length
            r2 = 8
            if (r0 <= r1) goto L_0x0345
            r1 = 4
            if (r8 > r1) goto L_0x033c
            r1 = r2
            goto L_0x033e
        L_0x033c:
            int r1 = r8 * 2
        L_0x033e:
            int[] r1 = new int[r1]
            r6 = 0
            java.lang.System.arraycopy(r5, r6, r1, r6, r8)
            r5 = r1
        L_0x0345:
            r5[r8] = r13
            int r1 = r9.length
            if (r0 <= r1) goto L_0x0364
            java.lang.Class r1 = r9.getClass()
            java.lang.Class r1 = r1.getComponentType()
            r6 = 4
            if (r8 > r6) goto L_0x0356
            goto L_0x0358
        L_0x0356:
            int r2 = r8 * 2
        L_0x0358:
            java.lang.Object r1 = java.lang.reflect.Array.newInstance(r1, r2)
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            r2 = 0
            java.lang.System.arraycopy(r9, r2, r1, r2, r8)
            r6 = r1
            goto L_0x0365
        L_0x0364:
            r6 = r9
        L_0x0365:
            r6[r8] = r3
            int[][] r6 = (int[][]) r6
            r1 = r38
            r2 = r39
            r8 = r0
            r3 = r21
            r7 = 0
            r0 = r36
            goto L_0x0020
        L_0x0375:
            r21 = r3
            r9 = r6
            r0 = r36
            r1 = r38
            r2 = r39
            r6 = r9
            r3 = r21
            r7 = 0
            goto L_0x0020
        L_0x0384:
            r9 = r6
            int[] r0 = new int[r8]
            int[][] r1 = new int[r8][]
            r2 = 0
            java.lang.System.arraycopy(r5, r2, r0, r2, r8)
            java.lang.System.arraycopy(r9, r2, r1, r2, r8)
            android.content.res.ColorStateList r2 = new android.content.res.ColorStateList
            r2.<init>(r1, r0)
            return r2
        L_0x0396:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r37.getPositionDescription()
            r1.append(r2)
            java.lang.String r2 = ": invalid color state list tag "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.b.b(android.content.res.Resources, android.content.res.XmlResourceParser, android.util.AttributeSet, android.content.res.Resources$Theme):android.content.res.ColorStateList");
    }
}
