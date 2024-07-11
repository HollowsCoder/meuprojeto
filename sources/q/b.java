package q;

public final class b {
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0277, code lost:
        if (r1.d == r8) goto L_0x027b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0100, code lost:
        if (r4.d == r13) goto L_0x0104;
     */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x01bb  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x029e  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x030a  */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x033f  */
    /* JADX WARNING: Removed duplicated region for block: B:246:0x0441 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:269:0x04a3 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:301:0x050d  */
    /* JADX WARNING: Removed duplicated region for block: B:302:0x0514  */
    /* JADX WARNING: Removed duplicated region for block: B:308:0x0529  */
    /* JADX WARNING: Removed duplicated region for block: B:311:0x053a A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:325:0x058a  */
    /* JADX WARNING: Removed duplicated region for block: B:334:0x05a6  */
    /* JADX WARNING: Removed duplicated region for block: B:335:0x05a9  */
    /* JADX WARNING: Removed duplicated region for block: B:338:0x05af  */
    /* JADX WARNING: Removed duplicated region for block: B:382:0x067a  */
    /* JADX WARNING: Removed duplicated region for block: B:397:0x06cd  */
    /* JADX WARNING: Removed duplicated region for block: B:400:0x06d8  */
    /* JADX WARNING: Removed duplicated region for block: B:401:0x06db  */
    /* JADX WARNING: Removed duplicated region for block: B:404:0x06e1  */
    /* JADX WARNING: Removed duplicated region for block: B:405:0x06e4  */
    /* JADX WARNING: Removed duplicated region for block: B:407:0x06e8  */
    /* JADX WARNING: Removed duplicated region for block: B:411:0x06f7  */
    /* JADX WARNING: Removed duplicated region for block: B:413:0x06fa  */
    /* JADX WARNING: Removed duplicated region for block: B:430:0x0292 A[EDGE_INSN: B:430:0x0292->B:177:0x0292 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:438:0x058c A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0109  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(q.f r40, o.d r41, java.util.ArrayList<q.e> r42, int r43) {
        /*
            r0 = r40
            r10 = r41
            r11 = r42
            if (r43 != 0) goto L_0x0011
            int r1 = r0.A0
            q.c[] r2 = r0.D0
            r14 = r1
            r15 = r2
            r16 = 0
            goto L_0x0019
        L_0x0011:
            int r1 = r0.B0
            q.c[] r2 = r0.C0
            r14 = r1
            r15 = r2
            r16 = 2
        L_0x0019:
            r9 = 0
        L_0x001a:
            if (r9 >= r14) goto L_0x0726
            r1 = r15[r9]
            boolean r2 = r1.f8141q
            r8 = 8
            r4 = 1
            q.e r7 = r1.f8127a
            r17 = 0
            if (r2 != 0) goto L_0x014f
            int r2 = r1.l
            int r5 = r2 * 2
            r13 = r7
            r19 = r13
            r6 = 0
        L_0x0031:
            if (r6 != 0) goto L_0x0117
            int r3 = r1.f8134i
            int r3 = r3 + r4
            r1.f8134i = r3
            q.e[] r3 = r13.f8178o0
            r3[r2] = r17
            q.e[] r3 = r13.f8176n0
            r3[r2] = r17
            int r3 = r13.f8167i0
            q.d[] r4 = r13.R
            if (r3 == r8) goto L_0x00e1
            q.e$b r3 = r13.h(r2)
            q.e$b r8 = q.e.b.MATCH_CONSTRAINT
            r3 = r4[r5]
            r3.d()
            int r3 = r5 + 1
            r23 = r4[r3]
            r23.d()
            r23 = r4[r5]
            r23.d()
            r3 = r4[r3]
            r3.d()
            q.e r3 = r1.f8128b
            if (r3 != 0) goto L_0x0068
            r1.f8128b = r13
        L_0x0068:
            r1.d = r13
            q.e$b[] r3 = r13.U
            r3 = r3[r2]
            if (r3 != r8) goto L_0x00e1
            int[] r12 = r13.f8185t
            r12 = r12[r2]
            r24 = r6
            r6 = 3
            if (r12 == 0) goto L_0x0084
            if (r12 == r6) goto L_0x0084
            r6 = 2
            if (r12 != r6) goto L_0x007f
            goto L_0x0084
        L_0x007f:
            r26 = r9
            r27 = r14
            goto L_0x00e4
        L_0x0084:
            int r6 = r1.f8135j
            r21 = 1
            int r6 = r6 + 1
            r1.f8135j = r6
            float[] r6 = r13.f8174m0
            r6 = r6[r2]
            r20 = 0
            int r26 = (r6 > r20 ? 1 : (r6 == r20 ? 0 : -1))
            if (r26 <= 0) goto L_0x009e
            r26 = r9
            float r9 = r1.f8136k
            float r9 = r9 + r6
            r1.f8136k = r9
            goto L_0x00a0
        L_0x009e:
            r26 = r9
        L_0x00a0:
            int r9 = r13.f8167i0
            r27 = r14
            r14 = 8
            if (r9 == r14) goto L_0x00b1
            if (r3 != r8) goto L_0x00b1
            if (r12 == 0) goto L_0x00af
            r3 = 3
            if (r12 != r3) goto L_0x00b1
        L_0x00af:
            r3 = 1
            goto L_0x00b2
        L_0x00b1:
            r3 = 0
        L_0x00b2:
            if (r3 == 0) goto L_0x00d0
            r3 = 0
            int r6 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r6 >= 0) goto L_0x00bd
            r3 = 1
            r1.f8138n = r3
            goto L_0x00c0
        L_0x00bd:
            r3 = 1
            r1.f8139o = r3
        L_0x00c0:
            java.util.ArrayList<q.e> r3 = r1.f8133h
            if (r3 != 0) goto L_0x00cb
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r1.f8133h = r3
        L_0x00cb:
            java.util.ArrayList<q.e> r3 = r1.f8133h
            r3.add(r13)
        L_0x00d0:
            q.e r3 = r1.f8131f
            if (r3 != 0) goto L_0x00d6
            r1.f8131f = r13
        L_0x00d6:
            q.e r3 = r1.f8132g
            if (r3 == 0) goto L_0x00de
            q.e[] r3 = r3.f8176n0
            r3[r2] = r13
        L_0x00de:
            r1.f8132g = r13
            goto L_0x00e4
        L_0x00e1:
            r24 = r6
            goto L_0x007f
        L_0x00e4:
            r3 = r19
            if (r3 == r13) goto L_0x00ec
            q.e[] r3 = r3.f8178o0
            r3[r2] = r13
        L_0x00ec:
            int r3 = r5 + 1
            r3 = r4[r3]
            q.d r3 = r3.f8146f
            if (r3 == 0) goto L_0x0102
            q.e r3 = r3.d
            q.d[] r4 = r3.R
            r4 = r4[r5]
            q.d r4 = r4.f8146f
            if (r4 == 0) goto L_0x0102
            q.e r4 = r4.d
            if (r4 == r13) goto L_0x0104
        L_0x0102:
            r3 = r17
        L_0x0104:
            if (r3 == 0) goto L_0x0109
            r6 = r24
            goto L_0x010b
        L_0x0109:
            r3 = r13
            r6 = 1
        L_0x010b:
            r19 = r13
            r9 = r26
            r14 = r27
            r4 = 1
            r8 = 8
            r13 = r3
            goto L_0x0031
        L_0x0117:
            r26 = r9
            r27 = r14
            q.e r3 = r1.f8128b
            if (r3 == 0) goto L_0x0126
            q.d[] r3 = r3.R
            r3 = r3[r5]
            r3.d()
        L_0x0126:
            q.e r3 = r1.d
            if (r3 == 0) goto L_0x0133
            int r5 = r5 + 1
            q.d[] r3 = r3.R
            r3 = r3[r5]
            r3.d()
        L_0x0133:
            r1.f8129c = r13
            if (r2 != 0) goto L_0x013e
            boolean r2 = r1.f8137m
            if (r2 == 0) goto L_0x013e
            r1.f8130e = r13
            goto L_0x0140
        L_0x013e:
            r1.f8130e = r7
        L_0x0140:
            boolean r2 = r1.f8139o
            if (r2 == 0) goto L_0x014a
            boolean r2 = r1.f8138n
            if (r2 == 0) goto L_0x014a
            r2 = 1
            goto L_0x014b
        L_0x014a:
            r2 = 0
        L_0x014b:
            r1.f8140p = r2
            r2 = 1
            goto L_0x0154
        L_0x014f:
            r26 = r9
            r27 = r14
            r2 = r4
        L_0x0154:
            r1.f8141q = r2
            if (r11 == 0) goto L_0x0167
            boolean r2 = r11.contains(r7)
            if (r2 == 0) goto L_0x015f
            goto L_0x0167
        L_0x015f:
            r32 = r15
            r18 = 0
            r20 = 2
            goto L_0x071a
        L_0x0167:
            q.e r12 = r1.f8129c
            q.e r13 = r1.f8128b
            q.e r14 = r1.d
            q.e r2 = r1.f8130e
            float r3 = r1.f8136k
            q.e$b[] r4 = r0.U
            r4 = r4[r43]
            q.e$b r5 = q.e.b.WRAP_CONTENT
            if (r4 != r5) goto L_0x017b
            r4 = 1
            goto L_0x017c
        L_0x017b:
            r4 = 0
        L_0x017c:
            if (r43 != 0) goto L_0x0196
            int r5 = r2.f8171k0
            r6 = 1
            if (r5 != 0) goto L_0x0186
            r21 = 1
            goto L_0x0188
        L_0x0186:
            r21 = 0
        L_0x0188:
            if (r5 != r6) goto L_0x018c
            r8 = r6
            goto L_0x018d
        L_0x018c:
            r8 = 0
        L_0x018d:
            r9 = 2
            if (r5 != r9) goto L_0x0193
            r5 = r21
            goto L_0x01a8
        L_0x0193:
            r5 = r21
            goto L_0x01b0
        L_0x0196:
            r6 = 1
            r9 = 2
            int r5 = r2.f8172l0
            if (r5 != 0) goto L_0x019e
            r8 = r6
            goto L_0x019f
        L_0x019e:
            r8 = 0
        L_0x019f:
            if (r5 != r6) goto L_0x01a3
            r6 = 1
            goto L_0x01a4
        L_0x01a3:
            r6 = 0
        L_0x01a4:
            if (r5 != r9) goto L_0x01ae
            r5 = r8
            r8 = r6
        L_0x01a8:
            r19 = r5
            r23 = r8
            r5 = 1
            goto L_0x01b5
        L_0x01ae:
            r5 = r8
            r8 = r6
        L_0x01b0:
            r19 = r5
            r23 = r8
            r5 = 0
        L_0x01b5:
            r8 = r7
            r6 = 0
        L_0x01b7:
            q.d[] r9 = r0.R
            if (r6 != 0) goto L_0x0292
            r29 = r3
            q.d[] r3 = r8.R
            r3 = r3[r16]
            if (r5 == 0) goto L_0x01c6
            r28 = 1
            goto L_0x01c8
        L_0x01c6:
            r28 = 4
        L_0x01c8:
            int r30 = r3.d()
            r31 = r6
            q.e$b[] r6 = r8.U
            r11 = r6[r43]
            r32 = r15
            q.e$b r15 = q.e.b.MATCH_CONSTRAINT
            if (r11 != r15) goto L_0x01e2
            int[] r11 = r8.f8185t
            r11 = r11[r43]
            if (r11 != 0) goto L_0x01e2
            r33 = r2
            r11 = 1
            goto L_0x01e5
        L_0x01e2:
            r33 = r2
            r11 = 0
        L_0x01e5:
            q.d r2 = r3.f8146f
            if (r2 == 0) goto L_0x01f1
            if (r8 == r7) goto L_0x01f1
            int r2 = r2.d()
            int r30 = r2 + r30
        L_0x01f1:
            r2 = r30
            if (r5 == 0) goto L_0x01fe
            if (r8 == r7) goto L_0x01fe
            if (r8 == r13) goto L_0x01fe
            r30 = r7
            r28 = 8
            goto L_0x0200
        L_0x01fe:
            r30 = r7
        L_0x0200:
            q.d r7 = r3.f8146f
            r34 = r1
            if (r7 == 0) goto L_0x0237
            if (r8 != r13) goto L_0x0211
            o.g r1 = r3.f8149i
            o.g r7 = r7.f8149i
            r0 = 6
            r10.f(r1, r7, r2, r0)
            goto L_0x021a
        L_0x0211:
            o.g r0 = r3.f8149i
            o.g r1 = r7.f8149i
            r7 = 8
            r10.f(r0, r1, r2, r7)
        L_0x021a:
            if (r11 == 0) goto L_0x0220
            if (r5 != 0) goto L_0x0220
            r28 = 5
        L_0x0220:
            if (r8 != r13) goto L_0x022c
            if (r5 == 0) goto L_0x022c
            boolean[] r0 = r8.T
            boolean r0 = r0[r43]
            if (r0 == 0) goto L_0x022c
            r0 = 5
            goto L_0x022e
        L_0x022c:
            r0 = r28
        L_0x022e:
            o.g r1 = r3.f8149i
            q.d r3 = r3.f8146f
            o.g r3 = r3.f8149i
            r10.e(r1, r3, r2, r0)
        L_0x0237:
            q.d[] r0 = r8.R
            if (r4 == 0) goto L_0x0263
            int r1 = r8.f8167i0
            r2 = 8
            if (r1 == r2) goto L_0x0255
            r1 = r6[r43]
            if (r1 != r15) goto L_0x0255
            int r1 = r16 + 1
            r1 = r0[r1]
            o.g r1 = r1.f8149i
            r2 = r0[r16]
            o.g r2 = r2.f8149i
            r3 = 5
            r6 = 0
            r10.f(r1, r2, r6, r3)
            goto L_0x0256
        L_0x0255:
            r6 = 0
        L_0x0256:
            r1 = r0[r16]
            o.g r1 = r1.f8149i
            r2 = r9[r16]
            o.g r2 = r2.f8149i
            r3 = 8
            r10.f(r1, r2, r6, r3)
        L_0x0263:
            int r1 = r16 + 1
            r0 = r0[r1]
            q.d r0 = r0.f8146f
            if (r0 == 0) goto L_0x0279
            q.e r0 = r0.d
            q.d[] r1 = r0.R
            r1 = r1[r16]
            q.d r1 = r1.f8146f
            if (r1 == 0) goto L_0x0279
            q.e r1 = r1.d
            if (r1 == r8) goto L_0x027b
        L_0x0279:
            r0 = r17
        L_0x027b:
            if (r0 == 0) goto L_0x0281
            r8 = r0
            r6 = r31
            goto L_0x0282
        L_0x0281:
            r6 = 1
        L_0x0282:
            r0 = r40
            r11 = r42
            r3 = r29
            r7 = r30
            r15 = r32
            r2 = r33
            r1 = r34
            goto L_0x01b7
        L_0x0292:
            r34 = r1
            r33 = r2
            r29 = r3
            r30 = r7
            r32 = r15
            if (r14 == 0) goto L_0x0305
            q.d[] r0 = r12.R
            int r1 = r16 + 1
            r0 = r0[r1]
            q.d r0 = r0.f8146f
            if (r0 == 0) goto L_0x0305
            q.d[] r0 = r14.R
            r0 = r0[r1]
            q.e$b[] r2 = r14.U
            r2 = r2[r43]
            q.e$b r3 = q.e.b.MATCH_CONSTRAINT
            if (r2 != r3) goto L_0x02bc
            int[] r2 = r14.f8185t
            r2 = r2[r43]
            if (r2 != 0) goto L_0x02bc
            r2 = 1
            goto L_0x02bd
        L_0x02bc:
            r2 = 0
        L_0x02bd:
            if (r2 == 0) goto L_0x02d9
            if (r5 != 0) goto L_0x02d9
            q.d r2 = r0.f8146f
            q.e r3 = r2.d
            r11 = r40
            if (r3 != r11) goto L_0x02d7
            o.g r3 = r0.f8149i
            o.g r2 = r2.f8149i
            int r6 = r0.d()
            int r6 = -r6
            r15 = 5
            r10.e(r3, r2, r6, r15)
            goto L_0x02f1
        L_0x02d7:
            r15 = 5
            goto L_0x02dc
        L_0x02d9:
            r15 = 5
            r11 = r40
        L_0x02dc:
            if (r5 == 0) goto L_0x02f1
            q.d r2 = r0.f8146f
            q.e r3 = r2.d
            if (r3 != r11) goto L_0x02f1
            o.g r3 = r0.f8149i
            o.g r2 = r2.f8149i
            int r6 = r0.d()
            int r6 = -r6
            r7 = 4
            r10.e(r3, r2, r6, r7)
        L_0x02f1:
            o.g r2 = r0.f8149i
            q.d[] r3 = r12.R
            r1 = r3[r1]
            q.d r1 = r1.f8146f
            o.g r1 = r1.f8149i
            int r0 = r0.d()
            int r0 = -r0
            r3 = 6
            r10.g(r2, r1, r0, r3)
            goto L_0x0308
        L_0x0305:
            r15 = 5
            r11 = r40
        L_0x0308:
            if (r4 == 0) goto L_0x031f
            int r0 = r16 + 1
            r1 = r9[r0]
            o.g r1 = r1.f8149i
            q.d[] r2 = r12.R
            r0 = r2[r0]
            o.g r2 = r0.f8149i
            int r0 = r0.d()
            r3 = 8
            r10.f(r1, r2, r0, r3)
        L_0x031f:
            r0 = r34
            java.util.ArrayList<q.e> r1 = r0.f8133h
            if (r1 == 0) goto L_0x043b
            int r2 = r1.size()
            r3 = 1
            if (r2 <= r3) goto L_0x043b
            boolean r4 = r0.f8138n
            if (r4 == 0) goto L_0x0339
            boolean r4 = r0.f8140p
            if (r4 != 0) goto L_0x0339
            int r4 = r0.f8135j
            float r4 = (float) r4
            r29 = r4
        L_0x0339:
            r7 = r17
            r4 = 0
            r6 = 0
        L_0x033d:
            if (r6 >= r2) goto L_0x043b
            java.lang.Object r8 = r1.get(r6)
            q.e r8 = (q.e) r8
            float[] r9 = r8.f8174m0
            r9 = r9[r43]
            r20 = 0
            int r21 = (r9 > r20 ? 1 : (r9 == r20 ? 0 : -1))
            q.d[] r15 = r8.R
            if (r21 >= 0) goto L_0x036e
            boolean r9 = r0.f8140p
            if (r9 == 0) goto L_0x0367
            int r3 = r16 + 1
            r3 = r15[r3]
            o.g r3 = r3.f8149i
            r8 = r15[r16]
            o.g r8 = r8.f8149i
            r9 = 4
            r15 = 0
            r10.e(r3, r8, r15, r9)
            r21 = r9
            goto L_0x0386
        L_0x0367:
            r9 = 1065353216(0x3f800000, float:1.0)
            r20 = 0
            r21 = 4
            goto L_0x0372
        L_0x036e:
            r21 = 4
            r20 = 0
        L_0x0372:
            int r28 = (r9 > r20 ? 1 : (r9 == r20 ? 0 : -1))
            if (r28 != 0) goto L_0x0390
            int r3 = r16 + 1
            r3 = r15[r3]
            o.g r3 = r3.f8149i
            r8 = r15[r16]
            o.g r8 = r8.f8149i
            r9 = 8
            r15 = 0
            r10.e(r3, r8, r15, r9)
        L_0x0386:
            r35 = r1
            r34 = r2
            r18 = r15
            r20 = 0
            goto L_0x0431
        L_0x0390:
            r18 = 0
            if (r7 == 0) goto L_0x0423
            q.d[] r7 = r7.R
            r3 = r7[r16]
            o.g r3 = r3.f8149i
            int r34 = r16 + 1
            r7 = r7[r34]
            o.g r7 = r7.f8149i
            r35 = r1
            r1 = r15[r16]
            o.g r1 = r1.f8149i
            r15 = r15[r34]
            o.g r15 = r15.f8149i
            r34 = r2
            o.b r2 = r41.m()
            r36 = r8
            r8 = 0
            r2.f7532b = r8
            int r20 = (r29 > r8 ? 1 : (r29 == r8 ? 0 : -1))
            r8 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r20 == 0) goto L_0x0403
            int r20 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r20 != 0) goto L_0x03c0
            goto L_0x0403
        L_0x03c0:
            r20 = 0
            int r37 = (r4 > r20 ? 1 : (r4 == r20 ? 0 : -1))
            if (r37 != 0) goto L_0x03d5
            o.b$a r1 = r2.d
            r4 = 1065353216(0x3f800000, float:1.0)
            r1.c(r3, r4)
            o.b$a r1 = r2.d
            r1.c(r7, r8)
        L_0x03d2:
            r28 = r9
            goto L_0x041f
        L_0x03d5:
            r8 = 1065353216(0x3f800000, float:1.0)
            if (r28 != 0) goto L_0x03e6
            o.b$a r3 = r2.d
            r3.c(r1, r8)
            o.b$a r1 = r2.d
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1.c(r15, r3)
            goto L_0x03d2
        L_0x03e6:
            float r4 = r4 / r29
            float r28 = r9 / r29
            float r4 = r4 / r28
            r28 = r9
            o.b$a r9 = r2.d
            r9.c(r3, r8)
            o.b$a r3 = r2.d
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            r3.c(r7, r9)
            o.b$a r3 = r2.d
            r3.c(r15, r4)
            o.b$a r3 = r2.d
            float r8 = -r4
            goto L_0x041c
        L_0x0403:
            r28 = r9
            r20 = 0
            r9 = r8
            r8 = 1065353216(0x3f800000, float:1.0)
            o.b$a r4 = r2.d
            r4.c(r3, r8)
            o.b$a r3 = r2.d
            r3.c(r7, r9)
            o.b$a r3 = r2.d
            r3.c(r15, r8)
            o.b$a r3 = r2.d
            r8 = r9
        L_0x041c:
            r3.c(r1, r8)
        L_0x041f:
            r10.c(r2)
            goto L_0x042d
        L_0x0423:
            r35 = r1
            r34 = r2
            r36 = r8
            r28 = r9
            r20 = 0
        L_0x042d:
            r4 = r28
            r7 = r36
        L_0x0431:
            int r6 = r6 + 1
            r2 = r34
            r1 = r35
            r3 = 1
            r15 = 5
            goto L_0x033d
        L_0x043b:
            r18 = 0
            r21 = 4
            if (r13 == 0) goto L_0x049b
            if (r13 == r14) goto L_0x0445
            if (r5 == 0) goto L_0x049b
        L_0x0445:
            r7 = r30
            q.d[] r0 = r7.R
            r0 = r0[r16]
            q.d[] r1 = r12.R
            int r2 = r16 + 1
            r1 = r1[r2]
            q.d r0 = r0.f8146f
            if (r0 == 0) goto L_0x0459
            o.g r0 = r0.f8149i
            r3 = r0
            goto L_0x045b
        L_0x0459:
            r3 = r17
        L_0x045b:
            q.d r0 = r1.f8146f
            if (r0 == 0) goto L_0x0463
            o.g r0 = r0.f8149i
            r6 = r0
            goto L_0x0465
        L_0x0463:
            r6 = r17
        L_0x0465:
            q.d[] r0 = r13.R
            r0 = r0[r16]
            if (r14 == 0) goto L_0x046f
            q.d[] r1 = r14.R
            r1 = r1[r2]
        L_0x046f:
            if (r3 == 0) goto L_0x0495
            if (r6 == 0) goto L_0x0495
            r2 = r33
            if (r43 != 0) goto L_0x047a
            float r2 = r2.f8161f0
            goto L_0x047c
        L_0x047a:
            float r2 = r2.f8163g0
        L_0x047c:
            r5 = r2
            int r4 = r0.d()
            int r8 = r1.d()
            o.g r2 = r0.f8149i
            o.g r7 = r1.f8149i
            r9 = 7
            r1 = r41
            r15 = r26
            r20 = 2
            r1.b(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x06bf
        L_0x0495:
            r15 = r26
            r20 = 2
            goto L_0x06bd
        L_0x049b:
            r15 = r26
            r7 = r30
            r20 = 2
            if (r19 == 0) goto L_0x0595
            if (r13 == 0) goto L_0x0595
            int r1 = r0.f8135j
            if (r1 <= 0) goto L_0x04b0
            int r0 = r0.f8134i
            if (r0 != r1) goto L_0x04b0
            r25 = 1
            goto L_0x04b2
        L_0x04b0:
            r25 = r18
        L_0x04b2:
            r0 = r13
            r9 = r0
        L_0x04b4:
            if (r0 == 0) goto L_0x06bd
            q.e[] r1 = r0.f8178o0
            r1 = r1[r43]
            r8 = r1
        L_0x04bb:
            if (r8 == 0) goto L_0x04c8
            int r1 = r8.f8167i0
            r6 = 8
            if (r1 != r6) goto L_0x04ca
            q.e[] r1 = r8.f8178o0
            r8 = r1[r43]
            goto L_0x04bb
        L_0x04c8:
            r6 = 8
        L_0x04ca:
            if (r8 != 0) goto L_0x04d8
            if (r0 != r14) goto L_0x04cf
            goto L_0x04d8
        L_0x04cf:
            r38 = r7
            r22 = r8
            r21 = r9
        L_0x04d5:
            r11 = 5
            goto L_0x0583
        L_0x04d8:
            q.d[] r1 = r0.R
            r2 = r1[r16]
            o.g r3 = r2.f8149i
            q.d r4 = r2.f8146f
            if (r4 == 0) goto L_0x04e5
            o.g r4 = r4.f8149i
            goto L_0x04e7
        L_0x04e5:
            r4 = r17
        L_0x04e7:
            if (r9 == r0) goto L_0x04f0
            q.d[] r4 = r9.R
            int r5 = r16 + 1
            r4 = r4[r5]
            goto L_0x04fa
        L_0x04f0:
            if (r0 != r13) goto L_0x04ff
            q.d[] r4 = r7.R
            r4 = r4[r16]
            q.d r4 = r4.f8146f
            if (r4 == 0) goto L_0x04fd
        L_0x04fa:
            o.g r4 = r4.f8149i
            goto L_0x04ff
        L_0x04fd:
            r4 = r17
        L_0x04ff:
            int r2 = r2.d()
            int r5 = r16 + 1
            r21 = r1[r5]
            int r21 = r21.d()
            if (r8 == 0) goto L_0x0514
            q.d[] r6 = r8.R
            r6 = r6[r16]
            r30 = r7
            goto L_0x051e
        L_0x0514:
            q.d[] r6 = r12.R
            r6 = r6[r5]
            q.d r6 = r6.f8146f
            r30 = r7
            if (r6 == 0) goto L_0x0521
        L_0x051e:
            o.g r7 = r6.f8149i
            goto L_0x0523
        L_0x0521:
            r7 = r17
        L_0x0523:
            r1 = r1[r5]
            o.g r1 = r1.f8149i
            if (r6 == 0) goto L_0x052f
            int r6 = r6.d()
            int r21 = r6 + r21
        L_0x052f:
            q.d[] r6 = r9.R
            r6 = r6[r5]
            int r6 = r6.d()
            int r6 = r6 + r2
            if (r3 == 0) goto L_0x057b
            if (r4 == 0) goto L_0x057b
            if (r7 == 0) goto L_0x057b
            if (r1 == 0) goto L_0x057b
            if (r0 != r13) goto L_0x054b
            q.d[] r2 = r13.R
            r2 = r2[r16]
            int r2 = r2.d()
            r6 = r2
        L_0x054b:
            if (r0 != r14) goto L_0x0557
            q.d[] r2 = r14.R
            r2 = r2[r5]
            int r2 = r2.d()
            r21 = r2
        L_0x0557:
            if (r25 == 0) goto L_0x055c
            r24 = 8
            goto L_0x055e
        L_0x055c:
            r24 = 5
        L_0x055e:
            r5 = 1056964608(0x3f000000, float:0.5)
            r26 = r1
            r1 = r41
            r2 = r3
            r3 = r4
            r4 = r6
            r22 = 8
            r6 = r7
            r38 = r30
            r7 = r26
            r22 = r8
            r8 = r21
            r21 = r9
            r11 = 5
            r9 = r24
            r1.b(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x0583
        L_0x057b:
            r22 = r8
            r21 = r9
            r38 = r30
            goto L_0x04d5
        L_0x0583:
            int r1 = r0.f8167i0
            r9 = 8
            if (r1 == r9) goto L_0x058a
            goto L_0x058c
        L_0x058a:
            r0 = r21
        L_0x058c:
            r11 = r40
            r9 = r0
            r0 = r22
            r7 = r38
            goto L_0x04b4
        L_0x0595:
            r38 = r7
            r9 = 8
            r11 = 5
            if (r23 == 0) goto L_0x06bd
            if (r13 == 0) goto L_0x06bd
            int r1 = r0.f8135j
            if (r1 <= 0) goto L_0x05a9
            int r0 = r0.f8134i
            if (r0 != r1) goto L_0x05a9
            r25 = 1
            goto L_0x05ab
        L_0x05a9:
            r25 = r18
        L_0x05ab:
            r0 = r13
            r8 = r0
        L_0x05ad:
            if (r0 == 0) goto L_0x0660
            q.e[] r1 = r0.f8178o0
            r1 = r1[r43]
        L_0x05b3:
            if (r1 == 0) goto L_0x05be
            int r2 = r1.f8167i0
            if (r2 != r9) goto L_0x05be
            q.e[] r1 = r1.f8178o0
            r1 = r1[r43]
            goto L_0x05b3
        L_0x05be:
            if (r0 == r13) goto L_0x0650
            if (r0 == r14) goto L_0x0650
            if (r1 == 0) goto L_0x0650
            if (r1 != r14) goto L_0x05c9
            r7 = r17
            goto L_0x05ca
        L_0x05c9:
            r7 = r1
        L_0x05ca:
            q.d[] r1 = r0.R
            r2 = r1[r16]
            o.g r3 = r2.f8149i
            q.d[] r4 = r8.R
            int r5 = r16 + 1
            r4 = r4[r5]
            o.g r4 = r4.f8149i
            int r2 = r2.d()
            r6 = r1[r5]
            int r6 = r6.d()
            if (r7 == 0) goto L_0x05f4
            q.d[] r1 = r7.R
            r1 = r1[r16]
            o.g r9 = r1.f8149i
            q.d r11 = r1.f8146f
            if (r11 == 0) goto L_0x05f1
            o.g r11 = r11.f8149i
            goto L_0x0609
        L_0x05f1:
            r11 = r17
            goto L_0x0609
        L_0x05f4:
            q.d[] r9 = r14.R
            r9 = r9[r16]
            if (r9 == 0) goto L_0x05fd
            o.g r11 = r9.f8149i
            goto L_0x05ff
        L_0x05fd:
            r11 = r17
        L_0x05ff:
            r1 = r1[r5]
            o.g r1 = r1.f8149i
            r39 = r11
            r11 = r1
            r1 = r9
            r9 = r39
        L_0x0609:
            if (r1 == 0) goto L_0x0613
            int r1 = r1.d()
            int r1 = r1 + r6
            r22 = r1
            goto L_0x0615
        L_0x0613:
            r22 = r6
        L_0x0615:
            q.d[] r1 = r8.R
            r1 = r1[r5]
            int r1 = r1.d()
            int r5 = r1 + r2
            if (r25 == 0) goto L_0x0624
            r24 = 8
            goto L_0x0626
        L_0x0624:
            r24 = r21
        L_0x0626:
            if (r3 == 0) goto L_0x0647
            if (r4 == 0) goto L_0x0647
            if (r9 == 0) goto L_0x0647
            if (r11 == 0) goto L_0x0647
            r6 = 1056964608(0x3f000000, float:0.5)
            r1 = r41
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r9
            r26 = r7
            r7 = r11
            r11 = r8
            r8 = r22
            r22 = r11
            r11 = 8
            r9 = r24
            r1.b(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x064d
        L_0x0647:
            r26 = r7
            r22 = r8
            r11 = 8
        L_0x064d:
            r1 = r26
            goto L_0x0653
        L_0x0650:
            r22 = r8
            r11 = r9
        L_0x0653:
            int r2 = r0.f8167i0
            if (r2 == r11) goto L_0x0659
            r8 = r0
            goto L_0x065b
        L_0x0659:
            r8 = r22
        L_0x065b:
            r0 = r1
            r9 = r11
            r11 = 5
            goto L_0x05ad
        L_0x0660:
            q.d[] r0 = r13.R
            r0 = r0[r16]
            r1 = r38
            q.d[] r1 = r1.R
            r1 = r1[r16]
            q.d r1 = r1.f8146f
            q.d[] r2 = r14.R
            int r3 = r16 + 1
            r11 = r2[r3]
            q.d[] r2 = r12.R
            r2 = r2[r3]
            q.d r9 = r2.f8146f
            if (r1 == 0) goto L_0x06a8
            if (r13 == r14) goto L_0x0689
            o.g r2 = r0.f8149i
            o.g r1 = r1.f8149i
            int r0 = r0.d()
            r3 = 5
            r10.e(r2, r1, r0, r3)
            goto L_0x06a8
        L_0x0689:
            if (r9 == 0) goto L_0x06a8
            o.g r2 = r0.f8149i
            o.g r3 = r1.f8149i
            int r4 = r0.d()
            r5 = 1056964608(0x3f000000, float:0.5)
            o.g r6 = r11.f8149i
            o.g r7 = r9.f8149i
            int r8 = r11.d()
            r0 = 5
            r1 = r41
            r26 = r15
            r15 = r9
            r9 = r0
            r1.b(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x06ab
        L_0x06a8:
            r26 = r15
            r15 = r9
        L_0x06ab:
            if (r15 == 0) goto L_0x06bf
            if (r13 == r14) goto L_0x06bf
            o.g r0 = r11.f8149i
            o.g r1 = r15.f8149i
            int r2 = r11.d()
            int r2 = -r2
            r3 = 5
            r10.e(r0, r1, r2, r3)
            goto L_0x06bf
        L_0x06bd:
            r26 = r15
        L_0x06bf:
            if (r19 != 0) goto L_0x06c3
            if (r23 == 0) goto L_0x071a
        L_0x06c3:
            if (r13 == 0) goto L_0x071a
            if (r13 == r14) goto L_0x071a
            q.d[] r0 = r13.R
            r1 = r0[r16]
            if (r14 != 0) goto L_0x06ce
            r14 = r13
        L_0x06ce:
            int r2 = r16 + 1
            q.d[] r3 = r14.R
            r3 = r3[r2]
            q.d r4 = r1.f8146f
            if (r4 == 0) goto L_0x06db
            o.g r4 = r4.f8149i
            goto L_0x06dd
        L_0x06db:
            r4 = r17
        L_0x06dd:
            q.d r5 = r3.f8146f
            if (r5 == 0) goto L_0x06e4
            o.g r5 = r5.f8149i
            goto L_0x06e6
        L_0x06e4:
            r5 = r17
        L_0x06e6:
            if (r12 == r14) goto L_0x06f7
            q.d[] r5 = r12.R
            r5 = r5[r2]
            q.d r5 = r5.f8146f
            if (r5 == 0) goto L_0x06f4
            o.g r5 = r5.f8149i
            r17 = r5
        L_0x06f4:
            r6 = r17
            goto L_0x06f8
        L_0x06f7:
            r6 = r5
        L_0x06f8:
            if (r13 != r14) goto L_0x06fc
            r3 = r0[r2]
        L_0x06fc:
            if (r4 == 0) goto L_0x071a
            if (r6 == 0) goto L_0x071a
            r5 = 1056964608(0x3f000000, float:0.5)
            int r0 = r1.d()
            q.d[] r7 = r14.R
            r2 = r7[r2]
            int r8 = r2.d()
            o.g r2 = r1.f8149i
            o.g r7 = r3.f8149i
            r9 = 5
            r1 = r41
            r3 = r4
            r4 = r0
            r1.b(r2, r3, r4, r5, r6, r7, r8, r9)
        L_0x071a:
            int r9 = r26 + 1
            r0 = r40
            r11 = r42
            r14 = r27
            r15 = r32
            goto L_0x001a
        L_0x0726:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q.b.a(q.f, o.d, java.util.ArrayList, int):void");
    }
}
