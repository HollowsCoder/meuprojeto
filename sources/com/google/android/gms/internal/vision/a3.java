package com.google.android.gms.internal.vision;

import androidx.appcompat.widget.x0;
import b0.d;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

public final class a3<T> implements m3<T> {

    /* renamed from: p  reason: collision with root package name */
    public static final int[] f3040p = new int[0];

    /* renamed from: q  reason: collision with root package name */
    public static final Unsafe f3041q = b4.m();

    /* renamed from: a  reason: collision with root package name */
    public final int[] f3042a;

    /* renamed from: b  reason: collision with root package name */
    public final Object[] f3043b;

    /* renamed from: c  reason: collision with root package name */
    public final int f3044c;
    public final int d;

    /* renamed from: e  reason: collision with root package name */
    public final w2 f3045e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f3046f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f3047g;

    /* renamed from: h  reason: collision with root package name */
    public final int[] f3048h;

    /* renamed from: i  reason: collision with root package name */
    public final int f3049i;

    /* renamed from: j  reason: collision with root package name */
    public final int f3050j;

    /* renamed from: k  reason: collision with root package name */
    public final d3 f3051k;
    public final i2 l;

    /* renamed from: m  reason: collision with root package name */
    public final w3<?, ?> f3052m;

    /* renamed from: n  reason: collision with root package name */
    public final f1<?> f3053n;

    /* renamed from: o  reason: collision with root package name */
    public final t2 f3054o;

    public a3(int[] iArr, Object[] objArr, int i10, int i11, w2 w2Var, boolean z, int[] iArr2, int i12, int i13, d3 d3Var, i2 i2Var, w3 w3Var, f1 f1Var, t2 t2Var) {
        this.f3042a = iArr;
        this.f3043b = objArr;
        this.f3044c = i10;
        this.d = i11;
        boolean z10 = w2Var instanceof q1;
        this.f3047g = z;
        this.f3046f = f1Var != null && f1Var.d(w2Var);
        this.f3048h = iArr2;
        this.f3049i = i12;
        this.f3050j = i13;
        this.f3051k = d3Var;
        this.l = i2Var;
        this.f3052m = w3Var;
        this.f3053n = f1Var;
        this.f3045e = w2Var;
        this.f3054o = t2Var;
    }

    public static int F(long j8, Object obj) {
        return ((Integer) b4.u(j8, obj)).intValue();
    }

    public static long G(long j8, Object obj) {
        return ((Long) b4.u(j8, obj)).longValue();
    }

    public static y3 H(Object obj) {
        q1 q1Var = (q1) obj;
        y3 y3Var = q1Var.zzb;
        if (y3Var != y3.f3189f) {
            return y3Var;
        }
        y3 y3Var2 = new y3();
        q1Var.zzb = y3Var2;
        return y3Var2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:160:0x0347  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x0395  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.vision.a3 m(com.google.android.gms.internal.vision.u2 r33, com.google.android.gms.internal.vision.d3 r34, com.google.android.gms.internal.vision.i2 r35, com.google.android.gms.internal.vision.w3 r36, com.google.android.gms.internal.vision.f1 r37, com.google.android.gms.internal.vision.t2 r38) {
        /*
            r0 = r33
            boolean r1 = r0 instanceof com.google.android.gms.internal.vision.k3
            if (r1 == 0) goto L_0x0414
            com.google.android.gms.internal.vision.k3 r0 = (com.google.android.gms.internal.vision.k3) r0
            int r1 = r0.zza()
            r2 = 2
            r3 = 0
            r4 = 1
            if (r1 != r2) goto L_0x0013
            r11 = r4
            goto L_0x0014
        L_0x0013:
            r11 = r3
        L_0x0014:
            java.lang.String r1 = r0.b()
            int r2 = r1.length()
            char r5 = r1.charAt(r3)
            r6 = 55296(0xd800, float:7.7486E-41)
            if (r5 < r6) goto L_0x0030
            r5 = r4
        L_0x0026:
            int r7 = r5 + 1
            char r5 = r1.charAt(r5)
            if (r5 < r6) goto L_0x0031
            r5 = r7
            goto L_0x0026
        L_0x0030:
            r7 = r4
        L_0x0031:
            int r5 = r7 + 1
            char r7 = r1.charAt(r7)
            if (r7 < r6) goto L_0x0050
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L_0x003d:
            int r10 = r5 + 1
            char r5 = r1.charAt(r5)
            if (r5 < r6) goto L_0x004d
            r5 = r5 & 8191(0x1fff, float:1.1478E-41)
            int r5 = r5 << r9
            r7 = r7 | r5
            int r9 = r9 + 13
            r5 = r10
            goto L_0x003d
        L_0x004d:
            int r5 = r5 << r9
            r7 = r7 | r5
            r5 = r10
        L_0x0050:
            if (r7 != 0) goto L_0x005f
            int[] r7 = f3040p
            r9 = r3
            r12 = r9
            r14 = r12
            r15 = r14
            r16 = r5
            r13 = r7
            r5 = r15
            r7 = r5
            goto L_0x016f
        L_0x005f:
            int r7 = r5 + 1
            char r5 = r1.charAt(r5)
            if (r5 < r6) goto L_0x007e
            r5 = r5 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L_0x006b:
            int r10 = r7 + 1
            char r7 = r1.charAt(r7)
            if (r7 < r6) goto L_0x007b
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            int r7 = r7 << r9
            r5 = r5 | r7
            int r9 = r9 + 13
            r7 = r10
            goto L_0x006b
        L_0x007b:
            int r7 = r7 << r9
            r5 = r5 | r7
            r7 = r10
        L_0x007e:
            int r9 = r7 + 1
            char r7 = r1.charAt(r7)
            if (r7 < r6) goto L_0x009d
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r10 = 13
        L_0x008a:
            int r12 = r9 + 1
            char r9 = r1.charAt(r9)
            if (r9 < r6) goto L_0x009a
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r10
            r7 = r7 | r9
            int r10 = r10 + 13
            r9 = r12
            goto L_0x008a
        L_0x009a:
            int r9 = r9 << r10
            r7 = r7 | r9
            r9 = r12
        L_0x009d:
            int r10 = r9 + 1
            char r9 = r1.charAt(r9)
            if (r9 < r6) goto L_0x00bc
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r12 = 13
        L_0x00a9:
            int r13 = r10 + 1
            char r10 = r1.charAt(r10)
            if (r10 < r6) goto L_0x00b9
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            int r10 = r10 << r12
            r9 = r9 | r10
            int r12 = r12 + 13
            r10 = r13
            goto L_0x00a9
        L_0x00b9:
            int r10 = r10 << r12
            r9 = r9 | r10
            r10 = r13
        L_0x00bc:
            int r12 = r10 + 1
            char r10 = r1.charAt(r10)
            if (r10 < r6) goto L_0x00db
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            r13 = 13
        L_0x00c8:
            int r14 = r12 + 1
            char r12 = r1.charAt(r12)
            if (r12 < r6) goto L_0x00d8
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r13
            r10 = r10 | r12
            int r13 = r13 + 13
            r12 = r14
            goto L_0x00c8
        L_0x00d8:
            int r12 = r12 << r13
            r10 = r10 | r12
            r12 = r14
        L_0x00db:
            int r13 = r12 + 1
            char r12 = r1.charAt(r12)
            if (r12 < r6) goto L_0x00fa
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            r14 = 13
        L_0x00e7:
            int r15 = r13 + 1
            char r13 = r1.charAt(r13)
            if (r13 < r6) goto L_0x00f7
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            int r13 = r13 << r14
            r12 = r12 | r13
            int r14 = r14 + 13
            r13 = r15
            goto L_0x00e7
        L_0x00f7:
            int r13 = r13 << r14
            r12 = r12 | r13
            r13 = r15
        L_0x00fa:
            int r14 = r13 + 1
            char r13 = r1.charAt(r13)
            if (r13 < r6) goto L_0x011b
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            r15 = 13
        L_0x0106:
            int r16 = r14 + 1
            char r14 = r1.charAt(r14)
            if (r14 < r6) goto L_0x0117
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r14 = r14 << r15
            r13 = r13 | r14
            int r15 = r15 + 13
            r14 = r16
            goto L_0x0106
        L_0x0117:
            int r14 = r14 << r15
            r13 = r13 | r14
            r14 = r16
        L_0x011b:
            int r15 = r14 + 1
            char r14 = r1.charAt(r14)
            if (r14 < r6) goto L_0x013e
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            r16 = 13
        L_0x0127:
            int r17 = r15 + 1
            char r15 = r1.charAt(r15)
            if (r15 < r6) goto L_0x0139
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r15 = r15 << r16
            r14 = r14 | r15
            int r16 = r16 + 13
            r15 = r17
            goto L_0x0127
        L_0x0139:
            int r15 = r15 << r16
            r14 = r14 | r15
            r15 = r17
        L_0x013e:
            int r16 = r15 + 1
            char r15 = r1.charAt(r15)
            if (r15 < r6) goto L_0x0163
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            r3 = r16
            r16 = 13
        L_0x014c:
            int r17 = r3 + 1
            char r3 = r1.charAt(r3)
            if (r3 < r6) goto L_0x015e
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            int r3 = r3 << r16
            r15 = r15 | r3
            int r16 = r16 + 13
            r3 = r17
            goto L_0x014c
        L_0x015e:
            int r3 = r3 << r16
            r15 = r15 | r3
            r16 = r17
        L_0x0163:
            int r3 = r15 + r13
            int r3 = r3 + r14
            int[] r3 = new int[r3]
            int r14 = r5 << 1
            int r14 = r14 + r7
            r7 = r13
            r13 = r3
            r3 = r9
            r9 = r10
        L_0x016f:
            java.lang.Object[] r10 = r0.c()
            com.google.android.gms.internal.vision.w2 r17 = r0.zzc()
            java.lang.Class r8 = r17.getClass()
            int r6 = r12 * 3
            int[] r6 = new int[r6]
            int r12 = r12 << r4
            java.lang.Object[] r12 = new java.lang.Object[r12]
            int r19 = r15 + r7
            r21 = r15
            r7 = r16
            r22 = r19
            r16 = 0
            r20 = 0
        L_0x018e:
            if (r7 >= r2) goto L_0x03ec
            int r23 = r7 + 1
            char r7 = r1.charAt(r7)
            r4 = 55296(0xd800, float:7.7486E-41)
            if (r7 < r4) goto L_0x01c0
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r4 = r23
            r23 = 13
        L_0x01a1:
            int r25 = r4 + 1
            char r4 = r1.charAt(r4)
            r26 = r2
            r2 = 55296(0xd800, float:7.7486E-41)
            if (r4 < r2) goto L_0x01ba
            r2 = r4 & 8191(0x1fff, float:1.1478E-41)
            int r2 = r2 << r23
            r7 = r7 | r2
            int r23 = r23 + 13
            r4 = r25
            r2 = r26
            goto L_0x01a1
        L_0x01ba:
            int r2 = r4 << r23
            r7 = r7 | r2
            r2 = r25
            goto L_0x01c4
        L_0x01c0:
            r26 = r2
            r2 = r23
        L_0x01c4:
            int r4 = r2 + 1
            char r2 = r1.charAt(r2)
            r23 = r4
            r4 = 55296(0xd800, float:7.7486E-41)
            if (r2 < r4) goto L_0x01f6
            r2 = r2 & 8191(0x1fff, float:1.1478E-41)
            r4 = r23
            r23 = 13
        L_0x01d7:
            int r25 = r4 + 1
            char r4 = r1.charAt(r4)
            r27 = r15
            r15 = 55296(0xd800, float:7.7486E-41)
            if (r4 < r15) goto L_0x01f0
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            int r4 = r4 << r23
            r2 = r2 | r4
            int r23 = r23 + 13
            r4 = r25
            r15 = r27
            goto L_0x01d7
        L_0x01f0:
            int r4 = r4 << r23
            r2 = r2 | r4
            r4 = r25
            goto L_0x01fa
        L_0x01f6:
            r27 = r15
            r4 = r23
        L_0x01fa:
            r15 = r2 & 255(0xff, float:3.57E-43)
            r23 = r9
            r9 = r2 & 1024(0x400, float:1.435E-42)
            if (r9 == 0) goto L_0x0208
            int r9 = r20 + 1
            r13[r20] = r16
            r20 = r9
        L_0x0208:
            r9 = 51
            r29 = r3
            sun.misc.Unsafe r3 = f3041q
            if (r15 < r9) goto L_0x02af
            int r9 = r4 + 1
            char r4 = r1.charAt(r4)
            r30 = r9
            r9 = 55296(0xd800, float:7.7486E-41)
            if (r4 < r9) goto L_0x0242
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r9 = r30
            r30 = 13
        L_0x0223:
            int r31 = r9 + 1
            char r9 = r1.charAt(r9)
            r32 = r0
            r0 = 55296(0xd800, float:7.7486E-41)
            if (r9 < r0) goto L_0x023c
            r0 = r9 & 8191(0x1fff, float:1.1478E-41)
            int r0 = r0 << r30
            r4 = r4 | r0
            int r30 = r30 + 13
            r9 = r31
            r0 = r32
            goto L_0x0223
        L_0x023c:
            int r0 = r9 << r30
            r4 = r4 | r0
            r9 = r31
            goto L_0x0246
        L_0x0242:
            r32 = r0
            r9 = r30
        L_0x0246:
            int r0 = r15 + -51
            r30 = r9
            r9 = 9
            if (r0 == r9) goto L_0x0267
            r9 = 17
            if (r0 != r9) goto L_0x0253
            goto L_0x0267
        L_0x0253:
            r9 = 12
            if (r0 != r9) goto L_0x0265
            if (r11 != 0) goto L_0x0265
            int r0 = r16 / 3
            r9 = 1
            int r0 = r0 << r9
            int r0 = r0 + r9
            int r9 = r14 + 1
            r14 = r10[r14]
            r12[r0] = r14
            r14 = r9
        L_0x0265:
            r9 = 1
            goto L_0x0274
        L_0x0267:
            int r0 = r16 / 3
            r9 = 1
            int r0 = r0 << r9
            int r0 = r0 + r9
            int r24 = r14 + 1
            r14 = r10[r14]
            r12[r0] = r14
            r14 = r24
        L_0x0274:
            int r0 = r4 << 1
            r4 = r10[r0]
            boolean r9 = r4 instanceof java.lang.reflect.Field
            if (r9 == 0) goto L_0x027f
            java.lang.reflect.Field r4 = (java.lang.reflect.Field) r4
            goto L_0x0287
        L_0x027f:
            java.lang.String r4 = (java.lang.String) r4
            java.lang.reflect.Field r4 = o(r4, r8)
            r10[r0] = r4
        L_0x0287:
            r9 = r6
            r31 = r7
            long r6 = r3.objectFieldOffset(r4)
            int r4 = (int) r6
            int r0 = r0 + 1
            r6 = r10[r0]
            boolean r7 = r6 instanceof java.lang.reflect.Field
            if (r7 == 0) goto L_0x029a
            java.lang.reflect.Field r6 = (java.lang.reflect.Field) r6
            goto L_0x02a2
        L_0x029a:
            java.lang.String r6 = (java.lang.String) r6
            java.lang.reflect.Field r6 = o(r6, r8)
            r10[r0] = r6
        L_0x02a2:
            long r6 = r3.objectFieldOffset(r6)
            int r0 = (int) r6
            r24 = r14
            r7 = r30
            r14 = r1
            r1 = 0
            goto L_0x03b1
        L_0x02af:
            r32 = r0
            r9 = r6
            r31 = r7
            int r0 = r14 + 1
            r6 = r10[r14]
            java.lang.String r6 = (java.lang.String) r6
            java.lang.reflect.Field r6 = o(r6, r8)
            r7 = 49
            r14 = 9
            if (r15 == r14) goto L_0x0329
            r14 = 17
            if (r15 != r14) goto L_0x02c9
            goto L_0x0329
        L_0x02c9:
            r14 = 27
            if (r15 == r14) goto L_0x0317
            if (r15 != r7) goto L_0x02d0
            goto L_0x0317
        L_0x02d0:
            r14 = 12
            if (r15 == r14) goto L_0x0303
            r14 = 30
            if (r15 == r14) goto L_0x0303
            r14 = 44
            if (r15 != r14) goto L_0x02dd
            goto L_0x0303
        L_0x02dd:
            r14 = 50
            if (r15 != r14) goto L_0x0337
            int r14 = r21 + 1
            r13[r21] = r16
            int r21 = r16 / 3
            r24 = 1
            int r21 = r21 << 1
            int r25 = r0 + 1
            r0 = r10[r0]
            r12[r21] = r0
            r0 = r2 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x02fe
            int r21 = r21 + 1
            int r0 = r25 + 1
            r25 = r10[r25]
            r12[r21] = r25
            goto L_0x0300
        L_0x02fe:
            r0 = r25
        L_0x0300:
            r21 = r14
            goto L_0x0337
        L_0x0303:
            if (r11 != 0) goto L_0x0314
            int r14 = r16 / 3
            r24 = 1
            int r14 = r14 << 1
            int r14 = r14 + 1
            int r25 = r0 + 1
            r0 = r10[r0]
            r12[r14] = r0
            goto L_0x0325
        L_0x0314:
            r24 = 1
            goto L_0x0337
        L_0x0317:
            r24 = 1
            int r14 = r16 / 3
            int r14 = r14 << 1
            int r14 = r14 + 1
            int r25 = r0 + 1
            r0 = r10[r0]
            r12[r14] = r0
        L_0x0325:
            r14 = r8
            r0 = r25
            goto L_0x0338
        L_0x0329:
            r24 = 1
            int r14 = r16 / 3
            int r14 = r14 << 1
            int r14 = r14 + 1
            java.lang.Class r25 = r6.getType()
            r12[r14] = r25
        L_0x0337:
            r14 = r8
        L_0x0338:
            long r7 = r3.objectFieldOffset(r6)
            int r6 = (int) r7
            r7 = r2 & 4096(0x1000, float:5.74E-42)
            r8 = 4096(0x1000, float:5.74E-42)
            if (r7 != r8) goto L_0x0395
            r7 = 17
            if (r15 > r7) goto L_0x0395
            int r7 = r4 + 1
            char r4 = r1.charAt(r4)
            r8 = 55296(0xd800, float:7.7486E-41)
            if (r4 < r8) goto L_0x036c
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r17 = 13
        L_0x0356:
            int r28 = r7 + 1
            char r7 = r1.charAt(r7)
            if (r7 < r8) goto L_0x0368
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            int r7 = r7 << r17
            r4 = r4 | r7
            int r17 = r17 + 13
            r7 = r28
            goto L_0x0356
        L_0x0368:
            int r7 = r7 << r17
            r4 = r4 | r7
            goto L_0x036e
        L_0x036c:
            r28 = r7
        L_0x036e:
            r7 = 1
            int r17 = r5 << 1
            int r24 = r4 / 32
            int r24 = r24 + r17
            r7 = r10[r24]
            boolean r8 = r7 instanceof java.lang.reflect.Field
            if (r8 == 0) goto L_0x0381
            java.lang.reflect.Field r7 = (java.lang.reflect.Field) r7
            r24 = r0
            r8 = r14
            goto L_0x038c
        L_0x0381:
            java.lang.String r7 = (java.lang.String) r7
            r8 = r14
            java.lang.reflect.Field r7 = o(r7, r8)
            r10[r24] = r7
            r24 = r0
        L_0x038c:
            r14 = r1
            long r0 = r3.objectFieldOffset(r7)
            int r0 = (int) r0
            int r4 = r4 % 32
            goto L_0x039f
        L_0x0395:
            r24 = r0
            r8 = r14
            r14 = r1
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r28 = r4
            r4 = 0
        L_0x039f:
            r1 = 18
            if (r15 < r1) goto L_0x03ad
            r1 = 49
            if (r15 > r1) goto L_0x03ad
            int r1 = r22 + 1
            r13[r22] = r6
            r22 = r1
        L_0x03ad:
            r1 = r4
            r4 = r6
            r7 = r28
        L_0x03b1:
            int r3 = r16 + 1
            r9[r16] = r31
            int r6 = r3 + 1
            r16 = r5
            r5 = r2 & 512(0x200, float:7.175E-43)
            if (r5 == 0) goto L_0x03c0
            r5 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x03c1
        L_0x03c0:
            r5 = 0
        L_0x03c1:
            r2 = r2 & 256(0x100, float:3.59E-43)
            if (r2 == 0) goto L_0x03c8
            r2 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x03c9
        L_0x03c8:
            r2 = 0
        L_0x03c9:
            r2 = r2 | r5
            int r5 = r15 << 20
            r2 = r2 | r5
            r2 = r2 | r4
            r9[r3] = r2
            int r2 = r6 + 1
            int r1 = r1 << 20
            r0 = r0 | r1
            r9[r6] = r0
            r6 = r9
            r1 = r14
            r5 = r16
            r9 = r23
            r14 = r24
            r15 = r27
            r3 = r29
            r0 = r32
            r4 = 1
            r16 = r2
            r2 = r26
            goto L_0x018e
        L_0x03ec:
            r32 = r0
            r29 = r3
            r23 = r9
            r27 = r15
            r9 = r6
            com.google.android.gms.internal.vision.a3 r0 = new com.google.android.gms.internal.vision.a3
            com.google.android.gms.internal.vision.w2 r10 = r32.zzc()
            r5 = r0
            r7 = r12
            r8 = r29
            r9 = r23
            r12 = r13
            r13 = r27
            r14 = r19
            r15 = r34
            r16 = r35
            r17 = r36
            r18 = r37
            r19 = r38
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return r0
        L_0x0414:
            com.google.android.gms.internal.vision.v3 r0 = (com.google.android.gms.internal.vision.v3) r0
            r0.zza()
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.a3.m(com.google.android.gms.internal.vision.u2, com.google.android.gms.internal.vision.d3, com.google.android.gms.internal.vision.i2, com.google.android.gms.internal.vision.w3, com.google.android.gms.internal.vision.f1, com.google.android.gms.internal.vision.t2):com.google.android.gms.internal.vision.a3");
    }

    public static Field o(String str, Class cls) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(x0.a(arrays, name.length() + x0.a(str, 40)));
            sb.append("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(name);
            throw new RuntimeException(d.g(sb, " not found. Known fields are ", arrays));
        }
    }

    public static List p(long j8, Object obj) {
        return (List) b4.u(j8, obj);
    }

    public static void q(int i10, Object obj, b1 b1Var) {
        if (obj instanceof String) {
            b1Var.f3058a.O((String) obj, i10);
            return;
        }
        b1Var.e(i10, (w0) obj);
    }

    public final void A(int i10, Object obj, Object obj2) {
        int E = E(i10);
        int i11 = this.f3042a[i10];
        long j8 = (long) (E & 1048575);
        if (u(i11, i10, obj2)) {
            Object u = u(i11, i10, obj) ? b4.u(j8, obj) : null;
            Object u10 = b4.u(j8, obj2);
            if (u != null && u10 != null) {
                b4.j(j8, obj, u1.c(u, u10));
                y(i11, i10, obj);
            } else if (u10 != null) {
                b4.j(j8, obj, u10);
                y(i11, i10, obj);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x02d6, code lost:
        r14 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0471, code lost:
        r11 = r11 + 3;
        r5 = r19;
        r4 = r20;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x02ca  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x02d9  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x02e6  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x02f7  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0304  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0312  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0320  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x032e  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x033c  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x034a  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0358  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0366  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0374  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0386  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0394  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x03a2  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x03b0  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x03be  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x03cc  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x03da  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x03ea  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x03fc  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x040a  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x0417  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0424  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0431  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x043e  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x044b  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x0458  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x0465  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x0481  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0154  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0163  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0172  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0181  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0196  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01ab  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01b4  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01c5  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01d3  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01e1  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01ef  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01fd  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x020b  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0219  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0227  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0235  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0243  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0251  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x025f  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x026d  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x027b  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0289  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0296  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x02a3  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x02b0  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x02bd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void B(java.lang.Object r22, com.google.android.gms.internal.vision.b1 r23) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = r23
            boolean r4 = r0.f3046f
            com.google.android.gms.internal.vision.f1<?> r5 = r0.f3053n
            if (r4 == 0) goto L_0x0023
            com.google.android.gms.internal.vision.j1 r4 = r5.a(r1)
            com.google.android.gms.internal.vision.p3<T, java.lang.Object> r6 = r4.f3101a
            boolean r6 = r6.isEmpty()
            if (r6 != 0) goto L_0x0023
            java.util.Iterator r4 = r4.i()
            java.lang.Object r6 = r4.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            goto L_0x0025
        L_0x0023:
            r4 = 0
            r6 = 0
        L_0x0025:
            int[] r7 = r0.f3042a
            int r8 = r7.length
            r11 = 0
            r12 = 1048575(0xfffff, float:1.469367E-39)
            r13 = 0
        L_0x002d:
            if (r11 >= r8) goto L_0x0479
            int r14 = r0.E(r11)
            r15 = r7[r11]
            r16 = 267386880(0xff00000, float:2.3665827E-29)
            r16 = r14 & r16
            int r3 = r16 >>> 20
            r10 = 17
            sun.misc.Unsafe r9 = f3041q
            if (r3 > r10) goto L_0x005d
            int r10 = r11 + 2
            r10 = r7[r10]
            r18 = r6
            r17 = 1048575(0xfffff, float:1.469367E-39)
            r6 = r10 & r17
            if (r6 == r12) goto L_0x0054
            long r12 = (long) r6
            int r13 = r9.getInt(r1, r12)
            r12 = r6
        L_0x0054:
            int r6 = r10 >>> 20
            r10 = 1
            int r6 = r10 << r6
            r10 = r6
            r6 = r18
            goto L_0x0060
        L_0x005d:
            r18 = r6
            r10 = 0
        L_0x0060:
            if (r6 == 0) goto L_0x0079
            r5.c(r6)
            if (r15 < 0) goto L_0x0079
            r5.e(r6)
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x0077
            java.lang.Object r6 = r4.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            goto L_0x0060
        L_0x0077:
            r6 = 0
            goto L_0x0060
        L_0x0079:
            r17 = 1048575(0xfffff, float:1.469367E-39)
            r14 = r14 & r17
            r20 = r4
            r19 = r5
            long r4 = (long) r14
            switch(r3) {
                case 0: goto L_0x0465;
                case 1: goto L_0x0458;
                case 2: goto L_0x044b;
                case 3: goto L_0x043e;
                case 4: goto L_0x0431;
                case 5: goto L_0x0424;
                case 6: goto L_0x0417;
                case 7: goto L_0x040a;
                case 8: goto L_0x03fc;
                case 9: goto L_0x03ea;
                case 10: goto L_0x03da;
                case 11: goto L_0x03cc;
                case 12: goto L_0x03be;
                case 13: goto L_0x03b0;
                case 14: goto L_0x03a2;
                case 15: goto L_0x0394;
                case 16: goto L_0x0386;
                case 17: goto L_0x0374;
                case 18: goto L_0x0366;
                case 19: goto L_0x0358;
                case 20: goto L_0x034a;
                case 21: goto L_0x033c;
                case 22: goto L_0x032e;
                case 23: goto L_0x0320;
                case 24: goto L_0x0312;
                case 25: goto L_0x0304;
                case 26: goto L_0x02f7;
                case 27: goto L_0x02e6;
                case 28: goto L_0x02d9;
                case 29: goto L_0x02ca;
                case 30: goto L_0x02bd;
                case 31: goto L_0x02b0;
                case 32: goto L_0x02a3;
                case 33: goto L_0x0296;
                case 34: goto L_0x0289;
                case 35: goto L_0x027b;
                case 36: goto L_0x026d;
                case 37: goto L_0x025f;
                case 38: goto L_0x0251;
                case 39: goto L_0x0243;
                case 40: goto L_0x0235;
                case 41: goto L_0x0227;
                case 42: goto L_0x0219;
                case 43: goto L_0x020b;
                case 44: goto L_0x01fd;
                case 45: goto L_0x01ef;
                case 46: goto L_0x01e1;
                case 47: goto L_0x01d3;
                case 48: goto L_0x01c5;
                case 49: goto L_0x01b4;
                case 50: goto L_0x01ab;
                case 51: goto L_0x0196;
                case 52: goto L_0x0181;
                case 53: goto L_0x0172;
                case 54: goto L_0x0163;
                case 55: goto L_0x0154;
                case 56: goto L_0x0145;
                case 57: goto L_0x0136;
                case 58: goto L_0x0121;
                case 59: goto L_0x0112;
                case 60: goto L_0x00ff;
                case 61: goto L_0x00ef;
                case 62: goto L_0x00e1;
                case 63: goto L_0x00d3;
                case 64: goto L_0x00c5;
                case 65: goto L_0x00b7;
                case 66: goto L_0x00a9;
                case 67: goto L_0x009b;
                case 68: goto L_0x0089;
                default: goto L_0x0086;
            }
        L_0x0086:
            r14 = 0
            goto L_0x0471
        L_0x0089:
            boolean r3 = r0.u(r15, r11, r1)
            if (r3 == 0) goto L_0x0086
            java.lang.Object r3 = r9.getObject(r1, r4)
            com.google.android.gms.internal.vision.m3 r4 = r0.n(r11)
            r2.k(r15, r4, r3)
            goto L_0x0086
        L_0x009b:
            boolean r3 = r0.u(r15, r11, r1)
            if (r3 == 0) goto L_0x0086
            long r3 = G(r4, r1)
            r2.q(r15, r3)
            goto L_0x0086
        L_0x00a9:
            boolean r3 = r0.u(r15, r11, r1)
            if (r3 == 0) goto L_0x0086
            int r3 = F(r4, r1)
            r2.r(r15, r3)
            goto L_0x0086
        L_0x00b7:
            boolean r3 = r0.u(r15, r11, r1)
            if (r3 == 0) goto L_0x0086
            long r3 = G(r4, r1)
            r2.j(r15, r3)
            goto L_0x0086
        L_0x00c5:
            boolean r3 = r0.u(r15, r11, r1)
            if (r3 == 0) goto L_0x0086
            int r3 = F(r4, r1)
            r2.c(r15, r3)
            goto L_0x0086
        L_0x00d3:
            boolean r3 = r0.u(r15, r11, r1)
            if (r3 == 0) goto L_0x0086
            int r3 = F(r4, r1)
            r2.i(r15, r3)
            goto L_0x0086
        L_0x00e1:
            boolean r3 = r0.u(r15, r11, r1)
            if (r3 == 0) goto L_0x0086
            int r3 = F(r4, r1)
            r2.p(r15, r3)
            goto L_0x0086
        L_0x00ef:
            boolean r3 = r0.u(r15, r11, r1)
            if (r3 == 0) goto L_0x0086
            java.lang.Object r3 = r9.getObject(r1, r4)
            com.google.android.gms.internal.vision.w0 r3 = (com.google.android.gms.internal.vision.w0) r3
            r2.e(r15, r3)
            goto L_0x0086
        L_0x00ff:
            boolean r3 = r0.u(r15, r11, r1)
            if (r3 == 0) goto L_0x0086
            java.lang.Object r3 = r9.getObject(r1, r4)
            com.google.android.gms.internal.vision.m3 r4 = r0.n(r11)
            r2.f(r15, r4, r3)
            goto L_0x0086
        L_0x0112:
            boolean r3 = r0.u(r15, r11, r1)
            if (r3 == 0) goto L_0x0086
            java.lang.Object r3 = r9.getObject(r1, r4)
            q(r15, r3, r2)
            goto L_0x0086
        L_0x0121:
            boolean r3 = r0.u(r15, r11, r1)
            if (r3 == 0) goto L_0x0086
            java.lang.Object r3 = com.google.android.gms.internal.vision.b4.u(r4, r1)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            r2.h(r15, r3)
            goto L_0x0086
        L_0x0136:
            boolean r3 = r0.u(r15, r11, r1)
            if (r3 == 0) goto L_0x0086
            int r3 = F(r4, r1)
            r2.n(r15, r3)
            goto L_0x0086
        L_0x0145:
            boolean r3 = r0.u(r15, r11, r1)
            if (r3 == 0) goto L_0x0086
            long r3 = G(r4, r1)
            r2.o(r15, r3)
            goto L_0x0086
        L_0x0154:
            boolean r3 = r0.u(r15, r11, r1)
            if (r3 == 0) goto L_0x0086
            int r3 = F(r4, r1)
            r2.l(r15, r3)
            goto L_0x0086
        L_0x0163:
            boolean r3 = r0.u(r15, r11, r1)
            if (r3 == 0) goto L_0x0086
            long r3 = G(r4, r1)
            r2.m(r15, r3)
            goto L_0x0086
        L_0x0172:
            boolean r3 = r0.u(r15, r11, r1)
            if (r3 == 0) goto L_0x0086
            long r3 = G(r4, r1)
            r2.d(r15, r3)
            goto L_0x0086
        L_0x0181:
            boolean r3 = r0.u(r15, r11, r1)
            if (r3 == 0) goto L_0x0086
            java.lang.Object r3 = com.google.android.gms.internal.vision.b4.u(r4, r1)
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
            r2.b(r15, r3)
            goto L_0x0086
        L_0x0196:
            boolean r3 = r0.u(r15, r11, r1)
            if (r3 == 0) goto L_0x0086
            java.lang.Object r3 = com.google.android.gms.internal.vision.b4.u(r4, r1)
            java.lang.Double r3 = (java.lang.Double) r3
            double r3 = r3.doubleValue()
            r2.a(r3, r15)
            goto L_0x0086
        L_0x01ab:
            java.lang.Object r3 = r9.getObject(r1, r4)
            r0.s(r2, r15, r3, r11)
            goto L_0x0086
        L_0x01b4:
            r3 = r7[r11]
            java.lang.Object r4 = r9.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.vision.m3 r5 = r0.n(r11)
            com.google.android.gms.internal.vision.n3.q(r3, r4, r2, r5)
            goto L_0x0086
        L_0x01c5:
            r3 = r7[r11]
            java.lang.Object r4 = r9.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            r10 = 1
            com.google.android.gms.internal.vision.n3.B(r3, r4, r2, r10)
            goto L_0x0086
        L_0x01d3:
            r10 = 1
            r3 = r7[r11]
            java.lang.Object r4 = r9.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.vision.n3.Q(r3, r4, r2, r10)
            goto L_0x0086
        L_0x01e1:
            r10 = 1
            r3 = r7[r11]
            java.lang.Object r4 = r9.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.vision.n3.H(r3, r4, r2, r10)
            goto L_0x0086
        L_0x01ef:
            r10 = 1
            r3 = r7[r11]
            java.lang.Object r4 = r9.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.vision.n3.S(r3, r4, r2, r10)
            goto L_0x0086
        L_0x01fd:
            r10 = 1
            r3 = r7[r11]
            java.lang.Object r4 = r9.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.vision.n3.T(r3, r4, r2, r10)
            goto L_0x0086
        L_0x020b:
            r10 = 1
            r3 = r7[r11]
            java.lang.Object r4 = r9.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.vision.n3.N(r3, r4, r2, r10)
            goto L_0x0086
        L_0x0219:
            r10 = 1
            r3 = r7[r11]
            java.lang.Object r4 = r9.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.vision.n3.U(r3, r4, r2, r10)
            goto L_0x0086
        L_0x0227:
            r10 = 1
            r3 = r7[r11]
            java.lang.Object r4 = r9.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.vision.n3.R(r3, r4, r2, r10)
            goto L_0x0086
        L_0x0235:
            r10 = 1
            r3 = r7[r11]
            java.lang.Object r4 = r9.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.vision.n3.E(r3, r4, r2, r10)
            goto L_0x0086
        L_0x0243:
            r10 = 1
            r3 = r7[r11]
            java.lang.Object r4 = r9.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.vision.n3.K(r3, r4, r2, r10)
            goto L_0x0086
        L_0x0251:
            r10 = 1
            r3 = r7[r11]
            java.lang.Object r4 = r9.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.vision.n3.y(r3, r4, r2, r10)
            goto L_0x0086
        L_0x025f:
            r10 = 1
            r3 = r7[r11]
            java.lang.Object r4 = r9.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.vision.n3.v(r3, r4, r2, r10)
            goto L_0x0086
        L_0x026d:
            r10 = 1
            r3 = r7[r11]
            java.lang.Object r4 = r9.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.vision.n3.r(r3, r4, r2, r10)
            goto L_0x0086
        L_0x027b:
            r10 = 1
            r3 = r7[r11]
            java.lang.Object r4 = r9.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.vision.n3.i(r3, r4, r2, r10)
            goto L_0x0086
        L_0x0289:
            r3 = r7[r11]
            java.lang.Object r4 = r9.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            r10 = 0
            com.google.android.gms.internal.vision.n3.B(r3, r4, r2, r10)
            goto L_0x02d6
        L_0x0296:
            r10 = 0
            r3 = r7[r11]
            java.lang.Object r4 = r9.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.vision.n3.Q(r3, r4, r2, r10)
            goto L_0x02d6
        L_0x02a3:
            r10 = 0
            r3 = r7[r11]
            java.lang.Object r4 = r9.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.vision.n3.H(r3, r4, r2, r10)
            goto L_0x02d6
        L_0x02b0:
            r10 = 0
            r3 = r7[r11]
            java.lang.Object r4 = r9.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.vision.n3.S(r3, r4, r2, r10)
            goto L_0x02d6
        L_0x02bd:
            r10 = 0
            r3 = r7[r11]
            java.lang.Object r4 = r9.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.vision.n3.T(r3, r4, r2, r10)
            goto L_0x02d6
        L_0x02ca:
            r10 = 0
            r3 = r7[r11]
            java.lang.Object r4 = r9.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.vision.n3.N(r3, r4, r2, r10)
        L_0x02d6:
            r14 = r10
            goto L_0x0471
        L_0x02d9:
            r3 = r7[r11]
            java.lang.Object r4 = r9.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.vision.n3.p(r3, r4, r2)
            goto L_0x0086
        L_0x02e6:
            r3 = r7[r11]
            java.lang.Object r4 = r9.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.vision.m3 r5 = r0.n(r11)
            com.google.android.gms.internal.vision.n3.h(r3, r4, r2, r5)
            goto L_0x0086
        L_0x02f7:
            r3 = r7[r11]
            java.lang.Object r4 = r9.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.vision.n3.g(r3, r4, r2)
            goto L_0x0086
        L_0x0304:
            r3 = r7[r11]
            java.lang.Object r4 = r9.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            r14 = 0
            com.google.android.gms.internal.vision.n3.U(r3, r4, r2, r14)
            goto L_0x0471
        L_0x0312:
            r14 = 0
            r3 = r7[r11]
            java.lang.Object r4 = r9.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.vision.n3.R(r3, r4, r2, r14)
            goto L_0x0471
        L_0x0320:
            r14 = 0
            r3 = r7[r11]
            java.lang.Object r4 = r9.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.vision.n3.E(r3, r4, r2, r14)
            goto L_0x0471
        L_0x032e:
            r14 = 0
            r3 = r7[r11]
            java.lang.Object r4 = r9.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.vision.n3.K(r3, r4, r2, r14)
            goto L_0x0471
        L_0x033c:
            r14 = 0
            r3 = r7[r11]
            java.lang.Object r4 = r9.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.vision.n3.y(r3, r4, r2, r14)
            goto L_0x0471
        L_0x034a:
            r14 = 0
            r3 = r7[r11]
            java.lang.Object r4 = r9.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.vision.n3.v(r3, r4, r2, r14)
            goto L_0x0471
        L_0x0358:
            r14 = 0
            r3 = r7[r11]
            java.lang.Object r4 = r9.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.vision.n3.r(r3, r4, r2, r14)
            goto L_0x0471
        L_0x0366:
            r14 = 0
            r3 = r7[r11]
            java.lang.Object r4 = r9.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.vision.n3.i(r3, r4, r2, r14)
            goto L_0x0471
        L_0x0374:
            r14 = 0
            r3 = r10 & r13
            if (r3 == 0) goto L_0x0471
            java.lang.Object r3 = r9.getObject(r1, r4)
            com.google.android.gms.internal.vision.m3 r4 = r0.n(r11)
            r2.k(r15, r4, r3)
            goto L_0x0471
        L_0x0386:
            r14 = 0
            r3 = r10 & r13
            if (r3 == 0) goto L_0x0471
            long r3 = r9.getLong(r1, r4)
            r2.q(r15, r3)
            goto L_0x0471
        L_0x0394:
            r14 = 0
            r3 = r10 & r13
            if (r3 == 0) goto L_0x0471
            int r3 = r9.getInt(r1, r4)
            r2.r(r15, r3)
            goto L_0x0471
        L_0x03a2:
            r14 = 0
            r3 = r10 & r13
            if (r3 == 0) goto L_0x0471
            long r3 = r9.getLong(r1, r4)
            r2.j(r15, r3)
            goto L_0x0471
        L_0x03b0:
            r14 = 0
            r3 = r10 & r13
            if (r3 == 0) goto L_0x0471
            int r3 = r9.getInt(r1, r4)
            r2.c(r15, r3)
            goto L_0x0471
        L_0x03be:
            r14 = 0
            r3 = r10 & r13
            if (r3 == 0) goto L_0x0471
            int r3 = r9.getInt(r1, r4)
            r2.i(r15, r3)
            goto L_0x0471
        L_0x03cc:
            r14 = 0
            r3 = r10 & r13
            if (r3 == 0) goto L_0x0471
            int r3 = r9.getInt(r1, r4)
            r2.p(r15, r3)
            goto L_0x0471
        L_0x03da:
            r14 = 0
            r3 = r10 & r13
            if (r3 == 0) goto L_0x0471
            java.lang.Object r3 = r9.getObject(r1, r4)
            com.google.android.gms.internal.vision.w0 r3 = (com.google.android.gms.internal.vision.w0) r3
            r2.e(r15, r3)
            goto L_0x0471
        L_0x03ea:
            r14 = 0
            r3 = r10 & r13
            if (r3 == 0) goto L_0x0471
            java.lang.Object r3 = r9.getObject(r1, r4)
            com.google.android.gms.internal.vision.m3 r4 = r0.n(r11)
            r2.f(r15, r4, r3)
            goto L_0x0471
        L_0x03fc:
            r14 = 0
            r3 = r10 & r13
            if (r3 == 0) goto L_0x0471
            java.lang.Object r3 = r9.getObject(r1, r4)
            q(r15, r3, r2)
            goto L_0x0471
        L_0x040a:
            r14 = 0
            r3 = r13 & r10
            if (r3 == 0) goto L_0x0471
            boolean r3 = com.google.android.gms.internal.vision.b4.p(r4, r1)
            r2.h(r15, r3)
            goto L_0x0471
        L_0x0417:
            r14 = 0
            r3 = r10 & r13
            if (r3 == 0) goto L_0x0471
            int r3 = r9.getInt(r1, r4)
            r2.n(r15, r3)
            goto L_0x0471
        L_0x0424:
            r14 = 0
            r3 = r10 & r13
            if (r3 == 0) goto L_0x0471
            long r3 = r9.getLong(r1, r4)
            r2.o(r15, r3)
            goto L_0x0471
        L_0x0431:
            r14 = 0
            r3 = r10 & r13
            if (r3 == 0) goto L_0x0471
            int r3 = r9.getInt(r1, r4)
            r2.l(r15, r3)
            goto L_0x0471
        L_0x043e:
            r14 = 0
            r3 = r10 & r13
            if (r3 == 0) goto L_0x0471
            long r3 = r9.getLong(r1, r4)
            r2.m(r15, r3)
            goto L_0x0471
        L_0x044b:
            r14 = 0
            r3 = r10 & r13
            if (r3 == 0) goto L_0x0471
            long r3 = r9.getLong(r1, r4)
            r2.d(r15, r3)
            goto L_0x0471
        L_0x0458:
            r14 = 0
            r3 = r13 & r10
            if (r3 == 0) goto L_0x0471
            float r3 = com.google.android.gms.internal.vision.b4.q(r4, r1)
            r2.b(r15, r3)
            goto L_0x0471
        L_0x0465:
            r14 = 0
            r3 = r13 & r10
            if (r3 == 0) goto L_0x0471
            double r3 = com.google.android.gms.internal.vision.b4.t(r4, r1)
            r2.a(r3, r15)
        L_0x0471:
            int r11 = r11 + 3
            r5 = r19
            r4 = r20
            goto L_0x002d
        L_0x0479:
            r20 = r4
            r19 = r5
            r18 = r6
        L_0x047f:
            if (r6 == 0) goto L_0x049a
            r3 = r19
            r3.e(r6)
            boolean r4 = r20.hasNext()
            if (r4 == 0) goto L_0x0496
            java.lang.Object r4 = r20.next()
            r6 = r4
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            r19 = r3
            goto L_0x047f
        L_0x0496:
            r19 = r3
            r6 = 0
            goto L_0x047f
        L_0x049a:
            com.google.android.gms.internal.vision.w3<?, ?> r3 = r0.f3052m
            com.google.android.gms.internal.vision.y3 r1 = r3.e(r1)
            r3.c(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.a3.B(java.lang.Object, com.google.android.gms.internal.vision.b1):void");
    }

    public final v1 C(int i10) {
        return (v1) this.f3043b[((i10 / 3) << 1) + 1];
    }

    public final boolean D(int i10, Object obj, Object obj2) {
        return v(i10, obj) == v(i10, obj2);
    }

    public final int E(int i10) {
        return this.f3042a[i10 + 1];
    }

    public final void a(T t10) {
        int[] iArr;
        int i10;
        int i11 = this.f3049i;
        while (true) {
            iArr = this.f3048h;
            i10 = this.f3050j;
            if (i11 >= i10) {
                break;
            }
            long E = (long) (E(iArr[i11]) & 1048575);
            Object u = b4.u(E, t10);
            if (u != null) {
                b4.j(E, t10, this.f3054o.g(u));
            }
            i11++;
        }
        int length = iArr.length;
        while (i10 < length) {
            this.l.b((long) iArr[i10], t10);
            i10++;
        }
        this.f3052m.h(t10);
        if (this.f3046f) {
            this.f3053n.g(t10);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005c, code lost:
        if (com.google.android.gms.internal.vision.n3.k(com.google.android.gms.internal.vision.b4.u(r7, r11), com.google.android.gms.internal.vision.b4.u(r7, r12)) != false) goto L_0x01b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0070, code lost:
        if (com.google.android.gms.internal.vision.b4.l(r7, r11) == com.google.android.gms.internal.vision.b4.l(r7, r12)) goto L_0x01b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0082, code lost:
        if (com.google.android.gms.internal.vision.b4.b(r7, r11) == com.google.android.gms.internal.vision.b4.b(r7, r12)) goto L_0x01b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0096, code lost:
        if (com.google.android.gms.internal.vision.b4.l(r7, r11) == com.google.android.gms.internal.vision.b4.l(r7, r12)) goto L_0x01b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a8, code lost:
        if (com.google.android.gms.internal.vision.b4.b(r7, r11) == com.google.android.gms.internal.vision.b4.b(r7, r12)) goto L_0x01b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ba, code lost:
        if (com.google.android.gms.internal.vision.b4.b(r7, r11) == com.google.android.gms.internal.vision.b4.b(r7, r12)) goto L_0x01b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00cc, code lost:
        if (com.google.android.gms.internal.vision.b4.b(r7, r11) == com.google.android.gms.internal.vision.b4.b(r7, r12)) goto L_0x01b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00e2, code lost:
        if (com.google.android.gms.internal.vision.n3.k(com.google.android.gms.internal.vision.b4.u(r7, r11), com.google.android.gms.internal.vision.b4.u(r7, r12)) != false) goto L_0x01b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00f8, code lost:
        if (com.google.android.gms.internal.vision.n3.k(com.google.android.gms.internal.vision.b4.u(r7, r11), com.google.android.gms.internal.vision.b4.u(r7, r12)) != false) goto L_0x01b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x010e, code lost:
        if (com.google.android.gms.internal.vision.n3.k(com.google.android.gms.internal.vision.b4.u(r7, r11), com.google.android.gms.internal.vision.b4.u(r7, r12)) != false) goto L_0x01b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0120, code lost:
        if (com.google.android.gms.internal.vision.b4.p(r7, r11) == com.google.android.gms.internal.vision.b4.p(r7, r12)) goto L_0x01b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0132, code lost:
        if (com.google.android.gms.internal.vision.b4.b(r7, r11) == com.google.android.gms.internal.vision.b4.b(r7, r12)) goto L_0x01b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0146, code lost:
        if (com.google.android.gms.internal.vision.b4.l(r7, r11) == com.google.android.gms.internal.vision.b4.l(r7, r12)) goto L_0x01b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0157, code lost:
        if (com.google.android.gms.internal.vision.b4.b(r7, r11) == com.google.android.gms.internal.vision.b4.b(r7, r12)) goto L_0x01b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x016a, code lost:
        if (com.google.android.gms.internal.vision.b4.l(r7, r11) == com.google.android.gms.internal.vision.b4.l(r7, r12)) goto L_0x01b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x017d, code lost:
        if (com.google.android.gms.internal.vision.b4.l(r7, r11) == com.google.android.gms.internal.vision.b4.l(r7, r12)) goto L_0x01b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0196, code lost:
        if (java.lang.Float.floatToIntBits(com.google.android.gms.internal.vision.b4.q(r7, r11)) == java.lang.Float.floatToIntBits(com.google.android.gms.internal.vision.b4.q(r7, r12))) goto L_0x01b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01b1, code lost:
        if (java.lang.Double.doubleToLongBits(com.google.android.gms.internal.vision.b4.t(r7, r11)) == java.lang.Double.doubleToLongBits(com.google.android.gms.internal.vision.b4.t(r7, r12))) goto L_0x01b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01b3, code lost:
        r4 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0038, code lost:
        if (com.google.android.gms.internal.vision.n3.k(com.google.android.gms.internal.vision.b4.u(r7, r11), com.google.android.gms.internal.vision.b4.u(r7, r12)) != false) goto L_0x01b4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b(T r11, T r12) {
        /*
            r10 = this;
            int[] r0 = r10.f3042a
            int r1 = r0.length
            r2 = 0
            r3 = r2
        L_0x0005:
            r4 = 1
            if (r3 >= r1) goto L_0x01bb
            int r5 = r10.E(r3)
            r6 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r5 & r6
            long r7 = (long) r7
            r9 = 267386880(0xff00000, float:2.3665827E-29)
            r5 = r5 & r9
            int r5 = r5 >>> 20
            switch(r5) {
                case 0: goto L_0x0199;
                case 1: goto L_0x0180;
                case 2: goto L_0x016d;
                case 3: goto L_0x015a;
                case 4: goto L_0x0149;
                case 5: goto L_0x0136;
                case 6: goto L_0x0124;
                case 7: goto L_0x0112;
                case 8: goto L_0x00fc;
                case 9: goto L_0x00e6;
                case 10: goto L_0x00d0;
                case 11: goto L_0x00be;
                case 12: goto L_0x00ac;
                case 13: goto L_0x009a;
                case 14: goto L_0x0086;
                case 15: goto L_0x0074;
                case 16: goto L_0x0060;
                case 17: goto L_0x004a;
                case 18: goto L_0x003c;
                case 19: goto L_0x003c;
                case 20: goto L_0x003c;
                case 21: goto L_0x003c;
                case 22: goto L_0x003c;
                case 23: goto L_0x003c;
                case 24: goto L_0x003c;
                case 25: goto L_0x003c;
                case 26: goto L_0x003c;
                case 27: goto L_0x003c;
                case 28: goto L_0x003c;
                case 29: goto L_0x003c;
                case 30: goto L_0x003c;
                case 31: goto L_0x003c;
                case 32: goto L_0x003c;
                case 33: goto L_0x003c;
                case 34: goto L_0x003c;
                case 35: goto L_0x003c;
                case 36: goto L_0x003c;
                case 37: goto L_0x003c;
                case 38: goto L_0x003c;
                case 39: goto L_0x003c;
                case 40: goto L_0x003c;
                case 41: goto L_0x003c;
                case 42: goto L_0x003c;
                case 43: goto L_0x003c;
                case 44: goto L_0x003c;
                case 45: goto L_0x003c;
                case 46: goto L_0x003c;
                case 47: goto L_0x003c;
                case 48: goto L_0x003c;
                case 49: goto L_0x003c;
                case 50: goto L_0x003c;
                case 51: goto L_0x001c;
                case 52: goto L_0x001c;
                case 53: goto L_0x001c;
                case 54: goto L_0x001c;
                case 55: goto L_0x001c;
                case 56: goto L_0x001c;
                case 57: goto L_0x001c;
                case 58: goto L_0x001c;
                case 59: goto L_0x001c;
                case 60: goto L_0x001c;
                case 61: goto L_0x001c;
                case 62: goto L_0x001c;
                case 63: goto L_0x001c;
                case 64: goto L_0x001c;
                case 65: goto L_0x001c;
                case 66: goto L_0x001c;
                case 67: goto L_0x001c;
                case 68: goto L_0x001c;
                default: goto L_0x001a;
            }
        L_0x001a:
            goto L_0x01b4
        L_0x001c:
            int r5 = r3 + 2
            r5 = r0[r5]
            r5 = r5 & r6
            long r5 = (long) r5
            int r9 = com.google.android.gms.internal.vision.b4.b(r5, r11)
            int r5 = com.google.android.gms.internal.vision.b4.b(r5, r12)
            if (r9 != r5) goto L_0x01b3
            java.lang.Object r5 = com.google.android.gms.internal.vision.b4.u(r7, r11)
            java.lang.Object r6 = com.google.android.gms.internal.vision.b4.u(r7, r12)
            boolean r5 = com.google.android.gms.internal.vision.n3.k(r5, r6)
            if (r5 != 0) goto L_0x01b4
            goto L_0x01b3
        L_0x003c:
            java.lang.Object r4 = com.google.android.gms.internal.vision.b4.u(r7, r11)
            java.lang.Object r5 = com.google.android.gms.internal.vision.b4.u(r7, r12)
            boolean r4 = com.google.android.gms.internal.vision.n3.k(r4, r5)
            goto L_0x01b4
        L_0x004a:
            boolean r5 = r10.D(r3, r11, r12)
            if (r5 == 0) goto L_0x01b3
            java.lang.Object r5 = com.google.android.gms.internal.vision.b4.u(r7, r11)
            java.lang.Object r6 = com.google.android.gms.internal.vision.b4.u(r7, r12)
            boolean r5 = com.google.android.gms.internal.vision.n3.k(r5, r6)
            if (r5 != 0) goto L_0x01b4
            goto L_0x01b3
        L_0x0060:
            boolean r5 = r10.D(r3, r11, r12)
            if (r5 == 0) goto L_0x01b3
            long r5 = com.google.android.gms.internal.vision.b4.l(r7, r11)
            long r7 = com.google.android.gms.internal.vision.b4.l(r7, r12)
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 == 0) goto L_0x01b4
            goto L_0x01b3
        L_0x0074:
            boolean r5 = r10.D(r3, r11, r12)
            if (r5 == 0) goto L_0x01b3
            int r5 = com.google.android.gms.internal.vision.b4.b(r7, r11)
            int r6 = com.google.android.gms.internal.vision.b4.b(r7, r12)
            if (r5 == r6) goto L_0x01b4
            goto L_0x01b3
        L_0x0086:
            boolean r5 = r10.D(r3, r11, r12)
            if (r5 == 0) goto L_0x01b3
            long r5 = com.google.android.gms.internal.vision.b4.l(r7, r11)
            long r7 = com.google.android.gms.internal.vision.b4.l(r7, r12)
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 == 0) goto L_0x01b4
            goto L_0x01b3
        L_0x009a:
            boolean r5 = r10.D(r3, r11, r12)
            if (r5 == 0) goto L_0x01b3
            int r5 = com.google.android.gms.internal.vision.b4.b(r7, r11)
            int r6 = com.google.android.gms.internal.vision.b4.b(r7, r12)
            if (r5 == r6) goto L_0x01b4
            goto L_0x01b3
        L_0x00ac:
            boolean r5 = r10.D(r3, r11, r12)
            if (r5 == 0) goto L_0x01b3
            int r5 = com.google.android.gms.internal.vision.b4.b(r7, r11)
            int r6 = com.google.android.gms.internal.vision.b4.b(r7, r12)
            if (r5 == r6) goto L_0x01b4
            goto L_0x01b3
        L_0x00be:
            boolean r5 = r10.D(r3, r11, r12)
            if (r5 == 0) goto L_0x01b3
            int r5 = com.google.android.gms.internal.vision.b4.b(r7, r11)
            int r6 = com.google.android.gms.internal.vision.b4.b(r7, r12)
            if (r5 == r6) goto L_0x01b4
            goto L_0x01b3
        L_0x00d0:
            boolean r5 = r10.D(r3, r11, r12)
            if (r5 == 0) goto L_0x01b3
            java.lang.Object r5 = com.google.android.gms.internal.vision.b4.u(r7, r11)
            java.lang.Object r6 = com.google.android.gms.internal.vision.b4.u(r7, r12)
            boolean r5 = com.google.android.gms.internal.vision.n3.k(r5, r6)
            if (r5 != 0) goto L_0x01b4
            goto L_0x01b3
        L_0x00e6:
            boolean r5 = r10.D(r3, r11, r12)
            if (r5 == 0) goto L_0x01b3
            java.lang.Object r5 = com.google.android.gms.internal.vision.b4.u(r7, r11)
            java.lang.Object r6 = com.google.android.gms.internal.vision.b4.u(r7, r12)
            boolean r5 = com.google.android.gms.internal.vision.n3.k(r5, r6)
            if (r5 != 0) goto L_0x01b4
            goto L_0x01b3
        L_0x00fc:
            boolean r5 = r10.D(r3, r11, r12)
            if (r5 == 0) goto L_0x01b3
            java.lang.Object r5 = com.google.android.gms.internal.vision.b4.u(r7, r11)
            java.lang.Object r6 = com.google.android.gms.internal.vision.b4.u(r7, r12)
            boolean r5 = com.google.android.gms.internal.vision.n3.k(r5, r6)
            if (r5 != 0) goto L_0x01b4
            goto L_0x01b3
        L_0x0112:
            boolean r5 = r10.D(r3, r11, r12)
            if (r5 == 0) goto L_0x01b3
            boolean r5 = com.google.android.gms.internal.vision.b4.p(r7, r11)
            boolean r6 = com.google.android.gms.internal.vision.b4.p(r7, r12)
            if (r5 == r6) goto L_0x01b4
            goto L_0x01b3
        L_0x0124:
            boolean r5 = r10.D(r3, r11, r12)
            if (r5 == 0) goto L_0x01b3
            int r5 = com.google.android.gms.internal.vision.b4.b(r7, r11)
            int r6 = com.google.android.gms.internal.vision.b4.b(r7, r12)
            if (r5 == r6) goto L_0x01b4
            goto L_0x01b3
        L_0x0136:
            boolean r5 = r10.D(r3, r11, r12)
            if (r5 == 0) goto L_0x01b3
            long r5 = com.google.android.gms.internal.vision.b4.l(r7, r11)
            long r7 = com.google.android.gms.internal.vision.b4.l(r7, r12)
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 == 0) goto L_0x01b4
            goto L_0x01b3
        L_0x0149:
            boolean r5 = r10.D(r3, r11, r12)
            if (r5 == 0) goto L_0x01b3
            int r5 = com.google.android.gms.internal.vision.b4.b(r7, r11)
            int r6 = com.google.android.gms.internal.vision.b4.b(r7, r12)
            if (r5 == r6) goto L_0x01b4
            goto L_0x01b3
        L_0x015a:
            boolean r5 = r10.D(r3, r11, r12)
            if (r5 == 0) goto L_0x01b3
            long r5 = com.google.android.gms.internal.vision.b4.l(r7, r11)
            long r7 = com.google.android.gms.internal.vision.b4.l(r7, r12)
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 == 0) goto L_0x01b4
            goto L_0x01b3
        L_0x016d:
            boolean r5 = r10.D(r3, r11, r12)
            if (r5 == 0) goto L_0x01b3
            long r5 = com.google.android.gms.internal.vision.b4.l(r7, r11)
            long r7 = com.google.android.gms.internal.vision.b4.l(r7, r12)
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 == 0) goto L_0x01b4
            goto L_0x01b3
        L_0x0180:
            boolean r5 = r10.D(r3, r11, r12)
            if (r5 == 0) goto L_0x01b3
            float r5 = com.google.android.gms.internal.vision.b4.q(r7, r11)
            int r5 = java.lang.Float.floatToIntBits(r5)
            float r6 = com.google.android.gms.internal.vision.b4.q(r7, r12)
            int r6 = java.lang.Float.floatToIntBits(r6)
            if (r5 == r6) goto L_0x01b4
            goto L_0x01b3
        L_0x0199:
            boolean r5 = r10.D(r3, r11, r12)
            if (r5 == 0) goto L_0x01b3
            double r5 = com.google.android.gms.internal.vision.b4.t(r7, r11)
            long r5 = java.lang.Double.doubleToLongBits(r5)
            double r7 = com.google.android.gms.internal.vision.b4.t(r7, r12)
            long r7 = java.lang.Double.doubleToLongBits(r7)
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 == 0) goto L_0x01b4
        L_0x01b3:
            r4 = r2
        L_0x01b4:
            if (r4 != 0) goto L_0x01b7
            return r2
        L_0x01b7:
            int r3 = r3 + 3
            goto L_0x0005
        L_0x01bb:
            com.google.android.gms.internal.vision.w3<?, ?> r0 = r10.f3052m
            com.google.android.gms.internal.vision.y3 r1 = r0.e(r11)
            com.google.android.gms.internal.vision.y3 r0 = r0.e(r12)
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x01cc
            return r2
        L_0x01cc:
            boolean r0 = r10.f3046f
            if (r0 == 0) goto L_0x01df
            com.google.android.gms.internal.vision.f1<?> r0 = r10.f3053n
            com.google.android.gms.internal.vision.j1 r11 = r0.a(r11)
            com.google.android.gms.internal.vision.j1 r12 = r0.a(r12)
            boolean r11 = r11.equals(r12)
            return r11
        L_0x01df:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.a3.b(java.lang.Object, java.lang.Object):boolean");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0030, code lost:
        com.google.android.gms.internal.vision.b4.j(r3, r7, com.google.android.gms.internal.vision.b4.u(r3, r8));
        y(r1, r0, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0096, code lost:
        com.google.android.gms.internal.vision.b4.j(r3, r7, com.google.android.gms.internal.vision.b4.u(r3, r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00c0, code lost:
        com.google.android.gms.internal.vision.b4.i(com.google.android.gms.internal.vision.b4.b(r3, r8), r3, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00d5, code lost:
        com.google.android.gms.internal.vision.b4.f(r7, r3, com.google.android.gms.internal.vision.b4.l(r3, r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00f8, code lost:
        z(r0, r7);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(T r7, T r8) {
        /*
            r6 = this;
            r8.getClass()
            r0 = 0
        L_0x0004:
            int[] r1 = r6.f3042a
            int r2 = r1.length
            if (r0 >= r2) goto L_0x00ff
            int r2 = r6.E(r0)
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r3 = r3 & r2
            long r3 = (long) r3
            r1 = r1[r0]
            r5 = 267386880(0xff00000, float:2.3665827E-29)
            r2 = r2 & r5
            int r2 = r2 >>> 20
            switch(r2) {
                case 0: goto L_0x00eb;
                case 1: goto L_0x00dd;
                case 2: goto L_0x00cf;
                case 3: goto L_0x00c8;
                case 4: goto L_0x00ba;
                case 5: goto L_0x00b3;
                case 6: goto L_0x00ac;
                case 7: goto L_0x009e;
                case 8: goto L_0x0090;
                case 9: goto L_0x008b;
                case 10: goto L_0x0084;
                case 11: goto L_0x007d;
                case 12: goto L_0x0076;
                case 13: goto L_0x006f;
                case 14: goto L_0x0067;
                case 15: goto L_0x0060;
                case 16: goto L_0x0058;
                case 17: goto L_0x008b;
                case 18: goto L_0x0051;
                case 19: goto L_0x0051;
                case 20: goto L_0x0051;
                case 21: goto L_0x0051;
                case 22: goto L_0x0051;
                case 23: goto L_0x0051;
                case 24: goto L_0x0051;
                case 25: goto L_0x0051;
                case 26: goto L_0x0051;
                case 27: goto L_0x0051;
                case 28: goto L_0x0051;
                case 29: goto L_0x0051;
                case 30: goto L_0x0051;
                case 31: goto L_0x0051;
                case 32: goto L_0x0051;
                case 33: goto L_0x0051;
                case 34: goto L_0x0051;
                case 35: goto L_0x0051;
                case 36: goto L_0x0051;
                case 37: goto L_0x0051;
                case 38: goto L_0x0051;
                case 39: goto L_0x0051;
                case 40: goto L_0x0051;
                case 41: goto L_0x0051;
                case 42: goto L_0x0051;
                case 43: goto L_0x0051;
                case 44: goto L_0x0051;
                case 45: goto L_0x0051;
                case 46: goto L_0x0051;
                case 47: goto L_0x0051;
                case 48: goto L_0x0051;
                case 49: goto L_0x0051;
                case 50: goto L_0x003c;
                case 51: goto L_0x002a;
                case 52: goto L_0x002a;
                case 53: goto L_0x002a;
                case 54: goto L_0x002a;
                case 55: goto L_0x002a;
                case 56: goto L_0x002a;
                case 57: goto L_0x002a;
                case 58: goto L_0x002a;
                case 59: goto L_0x002a;
                case 60: goto L_0x0025;
                case 61: goto L_0x001e;
                case 62: goto L_0x001e;
                case 63: goto L_0x001e;
                case 64: goto L_0x001e;
                case 65: goto L_0x001e;
                case 66: goto L_0x001e;
                case 67: goto L_0x001e;
                case 68: goto L_0x0025;
                default: goto L_0x001c;
            }
        L_0x001c:
            goto L_0x00fb
        L_0x001e:
            boolean r2 = r6.u(r1, r0, r8)
            if (r2 == 0) goto L_0x00fb
            goto L_0x0030
        L_0x0025:
            r6.A(r0, r7, r8)
            goto L_0x00fb
        L_0x002a:
            boolean r2 = r6.u(r1, r0, r8)
            if (r2 == 0) goto L_0x00fb
        L_0x0030:
            java.lang.Object r2 = com.google.android.gms.internal.vision.b4.u(r3, r8)
            com.google.android.gms.internal.vision.b4.j(r3, r7, r2)
            r6.y(r1, r0, r7)
            goto L_0x00fb
        L_0x003c:
            java.lang.Class<?> r1 = com.google.android.gms.internal.vision.n3.f3120a
            java.lang.Object r1 = com.google.android.gms.internal.vision.b4.u(r3, r7)
            java.lang.Object r2 = com.google.android.gms.internal.vision.b4.u(r3, r8)
            com.google.android.gms.internal.vision.t2 r5 = r6.f3054o
            com.google.android.gms.internal.vision.r2 r1 = r5.b((java.lang.Object) r1, (java.lang.Object) r2)
            com.google.android.gms.internal.vision.b4.j(r3, r7, r1)
            goto L_0x00fb
        L_0x0051:
            com.google.android.gms.internal.vision.i2 r1 = r6.l
            r1.a(r3, r7, r8)
            goto L_0x00fb
        L_0x0058:
            boolean r1 = r6.v(r0, r8)
            if (r1 == 0) goto L_0x00fb
            goto L_0x00d5
        L_0x0060:
            boolean r1 = r6.v(r0, r8)
            if (r1 == 0) goto L_0x00fb
            goto L_0x00c0
        L_0x0067:
            boolean r1 = r6.v(r0, r8)
            if (r1 == 0) goto L_0x00fb
            goto L_0x00d5
        L_0x006f:
            boolean r1 = r6.v(r0, r8)
            if (r1 == 0) goto L_0x00fb
            goto L_0x00c0
        L_0x0076:
            boolean r1 = r6.v(r0, r8)
            if (r1 == 0) goto L_0x00fb
            goto L_0x00c0
        L_0x007d:
            boolean r1 = r6.v(r0, r8)
            if (r1 == 0) goto L_0x00fb
            goto L_0x00c0
        L_0x0084:
            boolean r1 = r6.v(r0, r8)
            if (r1 == 0) goto L_0x00fb
            goto L_0x0096
        L_0x008b:
            r6.r(r0, r7, r8)
            goto L_0x00fb
        L_0x0090:
            boolean r1 = r6.v(r0, r8)
            if (r1 == 0) goto L_0x00fb
        L_0x0096:
            java.lang.Object r1 = com.google.android.gms.internal.vision.b4.u(r3, r8)
            com.google.android.gms.internal.vision.b4.j(r3, r7, r1)
            goto L_0x00f8
        L_0x009e:
            boolean r1 = r6.v(r0, r8)
            if (r1 == 0) goto L_0x00fb
            boolean r1 = com.google.android.gms.internal.vision.b4.p(r3, r8)
            com.google.android.gms.internal.vision.b4.g(r7, r3, r1)
            goto L_0x00f8
        L_0x00ac:
            boolean r1 = r6.v(r0, r8)
            if (r1 == 0) goto L_0x00fb
            goto L_0x00c0
        L_0x00b3:
            boolean r1 = r6.v(r0, r8)
            if (r1 == 0) goto L_0x00fb
            goto L_0x00d5
        L_0x00ba:
            boolean r1 = r6.v(r0, r8)
            if (r1 == 0) goto L_0x00fb
        L_0x00c0:
            int r1 = com.google.android.gms.internal.vision.b4.b(r3, r8)
            com.google.android.gms.internal.vision.b4.i(r1, r3, r7)
            goto L_0x00f8
        L_0x00c8:
            boolean r1 = r6.v(r0, r8)
            if (r1 == 0) goto L_0x00fb
            goto L_0x00d5
        L_0x00cf:
            boolean r1 = r6.v(r0, r8)
            if (r1 == 0) goto L_0x00fb
        L_0x00d5:
            long r1 = com.google.android.gms.internal.vision.b4.l(r3, r8)
            com.google.android.gms.internal.vision.b4.f(r7, r3, r1)
            goto L_0x00f8
        L_0x00dd:
            boolean r1 = r6.v(r0, r8)
            if (r1 == 0) goto L_0x00fb
            float r1 = com.google.android.gms.internal.vision.b4.q(r3, r8)
            com.google.android.gms.internal.vision.b4.e(r7, r3, r1)
            goto L_0x00f8
        L_0x00eb:
            boolean r1 = r6.v(r0, r8)
            if (r1 == 0) goto L_0x00fb
            double r1 = com.google.android.gms.internal.vision.b4.t(r3, r8)
            com.google.android.gms.internal.vision.b4.d(r7, r3, r1)
        L_0x00f8:
            r6.z(r0, r7)
        L_0x00fb:
            int r0 = r0 + 3
            goto L_0x0004
        L_0x00ff:
            java.lang.Class<?> r0 = com.google.android.gms.internal.vision.n3.f3120a
            com.google.android.gms.internal.vision.w3<?, ?> r0 = r6.f3052m
            com.google.android.gms.internal.vision.y3 r1 = r0.e(r7)
            com.google.android.gms.internal.vision.y3 r2 = r0.e(r8)
            com.google.android.gms.internal.vision.y3 r1 = r0.g(r1, r2)
            r0.d(r7, r1)
            boolean r0 = r6.f3046f
            if (r0 == 0) goto L_0x011b
            com.google.android.gms.internal.vision.f1<?> r0 = r6.f3053n
            com.google.android.gms.internal.vision.n3.j(r0, r7, r8)
        L_0x011b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.a3.c(java.lang.Object, java.lang.Object):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005e, code lost:
        r4 = com.google.android.gms.internal.vision.b4.u(r6, r10);
        r3 = r3 * 53;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0096, code lost:
        r3 = r3 * 53;
        r4 = F(r6, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ab, code lost:
        r3 = r3 * 53;
        r4 = G(r6, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00dd, code lost:
        if (r4 != null) goto L_0x00f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00e0, code lost:
        r3 = r3 * 53;
        r4 = com.google.android.gms.internal.vision.b4.u(r6, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00e6, code lost:
        r4 = r4.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00ef, code lost:
        if (r4 != null) goto L_0x00f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00f1, code lost:
        r4 = r4.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00f6, code lost:
        r4 = 37;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00f8, code lost:
        r3 = (r3 * 53) + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00fc, code lost:
        r3 = r3 * 53;
        r4 = ((java.lang.String) com.google.android.gms.internal.vision.b4.u(r6, r10)).hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x010f, code lost:
        r4 = com.google.android.gms.internal.vision.u1.b(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0128, code lost:
        r4 = java.lang.Float.floatToIntBits(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0133, code lost:
        r4 = java.lang.Double.doubleToLongBits(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0137, code lost:
        r4 = com.google.android.gms.internal.vision.u1.a(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x013b, code lost:
        r3 = r4 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x013d, code lost:
        r2 = r2 + 3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int d(T r10) {
        /*
            r9 = this;
            int[] r0 = r9.f3042a
            int r1 = r0.length
            r2 = 0
            r3 = r2
        L_0x0005:
            if (r2 >= r1) goto L_0x0141
            int r4 = r9.E(r2)
            r5 = r0[r2]
            r6 = 1048575(0xfffff, float:1.469367E-39)
            r6 = r6 & r4
            long r6 = (long) r6
            r8 = 267386880(0xff00000, float:2.3665827E-29)
            r4 = r4 & r8
            int r4 = r4 >>> 20
            switch(r4) {
                case 0: goto L_0x012d;
                case 1: goto L_0x0122;
                case 2: goto L_0x011b;
                case 3: goto L_0x011b;
                case 4: goto L_0x0114;
                case 5: goto L_0x011b;
                case 6: goto L_0x0114;
                case 7: goto L_0x0109;
                case 8: goto L_0x00fc;
                case 9: goto L_0x00eb;
                case 10: goto L_0x00e0;
                case 11: goto L_0x0114;
                case 12: goto L_0x0114;
                case 13: goto L_0x0114;
                case 14: goto L_0x011b;
                case 15: goto L_0x0114;
                case 16: goto L_0x011b;
                case 17: goto L_0x00d9;
                case 18: goto L_0x00e0;
                case 19: goto L_0x00e0;
                case 20: goto L_0x00e0;
                case 21: goto L_0x00e0;
                case 22: goto L_0x00e0;
                case 23: goto L_0x00e0;
                case 24: goto L_0x00e0;
                case 25: goto L_0x00e0;
                case 26: goto L_0x00e0;
                case 27: goto L_0x00e0;
                case 28: goto L_0x00e0;
                case 29: goto L_0x00e0;
                case 30: goto L_0x00e0;
                case 31: goto L_0x00e0;
                case 32: goto L_0x00e0;
                case 33: goto L_0x00e0;
                case 34: goto L_0x00e0;
                case 35: goto L_0x00e0;
                case 36: goto L_0x00e0;
                case 37: goto L_0x00e0;
                case 38: goto L_0x00e0;
                case 39: goto L_0x00e0;
                case 40: goto L_0x00e0;
                case 41: goto L_0x00e0;
                case 42: goto L_0x00e0;
                case 43: goto L_0x00e0;
                case 44: goto L_0x00e0;
                case 45: goto L_0x00e0;
                case 46: goto L_0x00e0;
                case 47: goto L_0x00e0;
                case 48: goto L_0x00e0;
                case 49: goto L_0x00e0;
                case 50: goto L_0x00e0;
                case 51: goto L_0x00c6;
                case 52: goto L_0x00b3;
                case 53: goto L_0x00a5;
                case 54: goto L_0x009e;
                case 55: goto L_0x0090;
                case 56: goto L_0x0089;
                case 57: goto L_0x0082;
                case 58: goto L_0x006e;
                case 59: goto L_0x0066;
                case 60: goto L_0x0058;
                case 61: goto L_0x0050;
                case 62: goto L_0x0049;
                case 63: goto L_0x0042;
                case 64: goto L_0x003b;
                case 65: goto L_0x0033;
                case 66: goto L_0x002b;
                case 67: goto L_0x0023;
                case 68: goto L_0x001c;
                default: goto L_0x001a;
            }
        L_0x001a:
            goto L_0x013d
        L_0x001c:
            boolean r4 = r9.u(r5, r2, r10)
            if (r4 == 0) goto L_0x013d
            goto L_0x005e
        L_0x0023:
            boolean r4 = r9.u(r5, r2, r10)
            if (r4 == 0) goto L_0x013d
            goto L_0x00ab
        L_0x002b:
            boolean r4 = r9.u(r5, r2, r10)
            if (r4 == 0) goto L_0x013d
            goto L_0x0096
        L_0x0033:
            boolean r4 = r9.u(r5, r2, r10)
            if (r4 == 0) goto L_0x013d
            goto L_0x00ab
        L_0x003b:
            boolean r4 = r9.u(r5, r2, r10)
            if (r4 == 0) goto L_0x013d
            goto L_0x0096
        L_0x0042:
            boolean r4 = r9.u(r5, r2, r10)
            if (r4 == 0) goto L_0x013d
            goto L_0x0096
        L_0x0049:
            boolean r4 = r9.u(r5, r2, r10)
            if (r4 == 0) goto L_0x013d
            goto L_0x0096
        L_0x0050:
            boolean r4 = r9.u(r5, r2, r10)
            if (r4 == 0) goto L_0x013d
            goto L_0x00e0
        L_0x0058:
            boolean r4 = r9.u(r5, r2, r10)
            if (r4 == 0) goto L_0x013d
        L_0x005e:
            java.lang.Object r4 = com.google.android.gms.internal.vision.b4.u(r6, r10)
            int r3 = r3 * 53
            goto L_0x00e6
        L_0x0066:
            boolean r4 = r9.u(r5, r2, r10)
            if (r4 == 0) goto L_0x013d
            goto L_0x00fc
        L_0x006e:
            boolean r4 = r9.u(r5, r2, r10)
            if (r4 == 0) goto L_0x013d
            int r3 = r3 * 53
            java.lang.Object r4 = com.google.android.gms.internal.vision.b4.u(r6, r10)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            goto L_0x010f
        L_0x0082:
            boolean r4 = r9.u(r5, r2, r10)
            if (r4 == 0) goto L_0x013d
            goto L_0x0096
        L_0x0089:
            boolean r4 = r9.u(r5, r2, r10)
            if (r4 == 0) goto L_0x013d
            goto L_0x00ab
        L_0x0090:
            boolean r4 = r9.u(r5, r2, r10)
            if (r4 == 0) goto L_0x013d
        L_0x0096:
            int r3 = r3 * 53
            int r4 = F(r6, r10)
            goto L_0x013b
        L_0x009e:
            boolean r4 = r9.u(r5, r2, r10)
            if (r4 == 0) goto L_0x013d
            goto L_0x00ab
        L_0x00a5:
            boolean r4 = r9.u(r5, r2, r10)
            if (r4 == 0) goto L_0x013d
        L_0x00ab:
            int r3 = r3 * 53
            long r4 = G(r6, r10)
            goto L_0x0137
        L_0x00b3:
            boolean r4 = r9.u(r5, r2, r10)
            if (r4 == 0) goto L_0x013d
            int r3 = r3 * 53
            java.lang.Object r4 = com.google.android.gms.internal.vision.b4.u(r6, r10)
            java.lang.Float r4 = (java.lang.Float) r4
            float r4 = r4.floatValue()
            goto L_0x0128
        L_0x00c6:
            boolean r4 = r9.u(r5, r2, r10)
            if (r4 == 0) goto L_0x013d
            int r3 = r3 * 53
            java.lang.Object r4 = com.google.android.gms.internal.vision.b4.u(r6, r10)
            java.lang.Double r4 = (java.lang.Double) r4
            double r4 = r4.doubleValue()
            goto L_0x0133
        L_0x00d9:
            java.lang.Object r4 = com.google.android.gms.internal.vision.b4.u(r6, r10)
            if (r4 == 0) goto L_0x00f6
            goto L_0x00f1
        L_0x00e0:
            int r3 = r3 * 53
            java.lang.Object r4 = com.google.android.gms.internal.vision.b4.u(r6, r10)
        L_0x00e6:
            int r4 = r4.hashCode()
            goto L_0x013b
        L_0x00eb:
            java.lang.Object r4 = com.google.android.gms.internal.vision.b4.u(r6, r10)
            if (r4 == 0) goto L_0x00f6
        L_0x00f1:
            int r4 = r4.hashCode()
            goto L_0x00f8
        L_0x00f6:
            r4 = 37
        L_0x00f8:
            int r3 = r3 * 53
            int r3 = r3 + r4
            goto L_0x013d
        L_0x00fc:
            int r3 = r3 * 53
            java.lang.Object r4 = com.google.android.gms.internal.vision.b4.u(r6, r10)
            java.lang.String r4 = (java.lang.String) r4
            int r4 = r4.hashCode()
            goto L_0x013b
        L_0x0109:
            int r3 = r3 * 53
            boolean r4 = com.google.android.gms.internal.vision.b4.p(r6, r10)
        L_0x010f:
            int r4 = com.google.android.gms.internal.vision.u1.b(r4)
            goto L_0x013b
        L_0x0114:
            int r3 = r3 * 53
            int r4 = com.google.android.gms.internal.vision.b4.b(r6, r10)
            goto L_0x013b
        L_0x011b:
            int r3 = r3 * 53
            long r4 = com.google.android.gms.internal.vision.b4.l(r6, r10)
            goto L_0x0137
        L_0x0122:
            int r3 = r3 * 53
            float r4 = com.google.android.gms.internal.vision.b4.q(r6, r10)
        L_0x0128:
            int r4 = java.lang.Float.floatToIntBits(r4)
            goto L_0x013b
        L_0x012d:
            int r3 = r3 * 53
            double r4 = com.google.android.gms.internal.vision.b4.t(r6, r10)
        L_0x0133:
            long r4 = java.lang.Double.doubleToLongBits(r4)
        L_0x0137:
            int r4 = com.google.android.gms.internal.vision.u1.a(r4)
        L_0x013b:
            int r4 = r4 + r3
            r3 = r4
        L_0x013d:
            int r2 = r2 + 3
            goto L_0x0005
        L_0x0141:
            int r3 = r3 * 53
            com.google.android.gms.internal.vision.w3<?, ?> r0 = r9.f3052m
            com.google.android.gms.internal.vision.y3 r0 = r0.e(r10)
            int r0 = r0.hashCode()
            int r0 = r0 + r3
            boolean r1 = r9.f3046f
            if (r1 == 0) goto L_0x015f
            int r0 = r0 * 53
            com.google.android.gms.internal.vision.f1<?> r1 = r9.f3053n
            com.google.android.gms.internal.vision.j1 r10 = r1.a(r10)
            int r10 = r10.hashCode()
            int r0 = r0 + r10
        L_0x015f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.a3.d(java.lang.Object):int");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0263, code lost:
        r11 = com.google.android.gms.internal.vision.a1.Y(r13, (com.google.android.gms.internal.vision.w2) com.google.android.gms.internal.vision.b4.u(r14, r1), n(r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x027d, code lost:
        r11 = com.google.android.gms.internal.vision.a1.k0(r13, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x028d, code lost:
        r11 = com.google.android.gms.internal.vision.a1.p0(r13, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0299, code lost:
        r11 = com.google.android.gms.internal.vision.a1.o0(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x02a5, code lost:
        r11 = com.google.android.gms.internal.vision.a1.r0(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x02b5, code lost:
        r11 = com.google.android.gms.internal.vision.a1.s0(r13, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x02c5, code lost:
        r11 = com.google.android.gms.internal.vision.a1.m0(r13, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x02d1, code lost:
        r11 = com.google.android.gms.internal.vision.b4.u(r14, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x02dc, code lost:
        r11 = com.google.android.gms.internal.vision.n3.a(r13, n(r4), com.google.android.gms.internal.vision.b4.u(r14, r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x02f6, code lost:
        if ((r11 instanceof com.google.android.gms.internal.vision.w0) != false) goto L_0x02f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x02f8, code lost:
        r11 = com.google.android.gms.internal.vision.a1.X(r13, (com.google.android.gms.internal.vision.w0) r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0300, code lost:
        r11 = com.google.android.gms.internal.vision.a1.R((java.lang.String) r11, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x030d, code lost:
        r11 = com.google.android.gms.internal.vision.a1.V(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0318, code lost:
        r11 = com.google.android.gms.internal.vision.a1.q0(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0323, code lost:
        r11 = com.google.android.gms.internal.vision.a1.l0(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0332, code lost:
        r11 = com.google.android.gms.internal.vision.a1.j0(r13, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0341, code lost:
        r11 = com.google.android.gms.internal.vision.a1.f0(r13, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0350, code lost:
        r11 = com.google.android.gms.internal.vision.a1.c0(r13, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x035b, code lost:
        r11 = com.google.android.gms.internal.vision.a1.P(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0366, code lost:
        r11 = com.google.android.gms.internal.vision.a1.W(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x036a, code lost:
        r10 = r10 + r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x036b, code lost:
        r4 = r4 + 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x03b1, code lost:
        if (u(r14, r4, r1) != false) goto L_0x0612;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x03d1, code lost:
        if (u(r14, r4, r1) != false) goto L_0x063e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x03d9, code lost:
        if (u(r14, r4, r1) != false) goto L_0x0646;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x03f9, code lost:
        if (u(r14, r4, r1) != false) goto L_0x0666;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x0401, code lost:
        if (u(r14, r4, r1) != false) goto L_0x066e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x0411, code lost:
        if ((r2 instanceof com.google.android.gms.internal.vision.w0) != false) goto L_0x0686;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x04a9, code lost:
        if (r2 > 0) goto L_0x055a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x04b7, code lost:
        if (r2 > 0) goto L_0x055a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x04c5, code lost:
        if (r2 > 0) goto L_0x055a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x04d3, code lost:
        if (r2 > 0) goto L_0x055a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x04e1, code lost:
        if (r2 > 0) goto L_0x055a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x04ef, code lost:
        if (r2 > 0) goto L_0x055a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x04fd, code lost:
        if (r2 > 0) goto L_0x055a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x050a, code lost:
        if (r2 > 0) goto L_0x055a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x0517, code lost:
        if (r2 > 0) goto L_0x055a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x0524, code lost:
        if (r2 > 0) goto L_0x055a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x0531, code lost:
        if (r2 > 0) goto L_0x055a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x053e, code lost:
        if (r2 > 0) goto L_0x055a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x054b, code lost:
        if (r2 > 0) goto L_0x055a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x0558, code lost:
        if (r2 > 0) goto L_0x055a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x055a, code lost:
        r10 = r10 + ((com.google.android.gms.internal.vision.a1.n0(r2) + com.google.android.gms.internal.vision.a1.e0(r14)) + r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x0610, code lost:
        if ((r2 & r11) != 0) goto L_0x0612;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x0612, code lost:
        r2 = com.google.android.gms.internal.vision.a1.Y(r14, (com.google.android.gms.internal.vision.w2) r7.getObject(r1, r8), n(r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x0629, code lost:
        r2 = com.google.android.gms.internal.vision.a1.k0(r14, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x0636, code lost:
        r2 = com.google.android.gms.internal.vision.a1.p0(r14, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x063c, code lost:
        if ((r2 & r11) != 0) goto L_0x063e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x063e, code lost:
        r2 = com.google.android.gms.internal.vision.a1.o0(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x0644, code lost:
        if ((r2 & r11) != 0) goto L_0x0646;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x0646, code lost:
        r2 = com.google.android.gms.internal.vision.a1.r0(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x0652, code lost:
        r2 = com.google.android.gms.internal.vision.a1.s0(r14, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x065e, code lost:
        r2 = com.google.android.gms.internal.vision.a1.m0(r14, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x0664, code lost:
        if ((r2 & r11) != 0) goto L_0x0666;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x0666, code lost:
        r2 = r7.getObject(r1, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x066c, code lost:
        if ((r2 & r11) != 0) goto L_0x066e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:305:0x066e, code lost:
        r2 = com.google.android.gms.internal.vision.n3.a(r14, n(r4), r7.getObject(r1, r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:309:0x0684, code lost:
        if ((r2 instanceof com.google.android.gms.internal.vision.w0) != false) goto L_0x0686;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x0686, code lost:
        r2 = com.google.android.gms.internal.vision.a1.X(r14, (com.google.android.gms.internal.vision.w0) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:311:0x068d, code lost:
        r2 = com.google.android.gms.internal.vision.a1.R((java.lang.String) r2, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:0x0693, code lost:
        r10 = r10 + r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:319:0x06a4, code lost:
        r10 = r10 + r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:338:0x06e4, code lost:
        r2 = r2 + r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:339:0x06e5, code lost:
        r10 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:340:0x06e7, code lost:
        r2 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:341:0x06e9, code lost:
        r4 = r4 + 3;
        r8 = r13;
        r2 = 267386880;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a3, code lost:
        if ((r11 instanceof com.google.android.gms.internal.vision.w0) != false) goto L_0x02f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01ca, code lost:
        r10 = r10 + ((com.google.android.gms.internal.vision.a1.n0(r11) + com.google.android.gms.internal.vision.a1.e0(r13)) + r11);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int e(T r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = 267386880(0xff00000, float:2.3665827E-29)
            r3 = 1048575(0xfffff, float:1.469367E-39)
            boolean r4 = r0.f3047g
            com.google.android.gms.internal.vision.t2 r5 = r0.f3054o
            com.google.android.gms.internal.vision.w3<?, ?> r6 = r0.f3052m
            sun.misc.Unsafe r7 = f3041q
            int[] r8 = r0.f3042a
            if (r4 == 0) goto L_0x0379
            r4 = 0
            r10 = 0
        L_0x0017:
            int r11 = r8.length
            if (r4 >= r11) goto L_0x036f
            int r11 = r0.E(r4)
            r12 = r11 & r2
            int r12 = r12 >>> 20
            r13 = r8[r4]
            r11 = r11 & r3
            long r14 = (long) r11
            com.google.android.gms.internal.vision.k1 r11 = com.google.android.gms.internal.vision.k1.DOUBLE_LIST_PACKED
            int r11 = r11.zza()
            if (r12 < r11) goto L_0x003a
            com.google.android.gms.internal.vision.k1 r11 = com.google.android.gms.internal.vision.k1.SINT64_LIST_PACKED
            int r11 = r11.zza()
            if (r12 > r11) goto L_0x003a
            int r11 = r4 + 2
            r11 = r8[r11]
        L_0x003a:
            switch(r12) {
                case 0: goto L_0x0360;
                case 1: goto L_0x0355;
                case 2: goto L_0x0346;
                case 3: goto L_0x0337;
                case 4: goto L_0x0328;
                case 5: goto L_0x031d;
                case 6: goto L_0x0312;
                case 7: goto L_0x0307;
                case 8: goto L_0x02ea;
                case 9: goto L_0x02d6;
                case 10: goto L_0x02cb;
                case 11: goto L_0x02bb;
                case 12: goto L_0x02ab;
                case 13: goto L_0x029f;
                case 14: goto L_0x0293;
                case 15: goto L_0x0283;
                case 16: goto L_0x0273;
                case 17: goto L_0x025d;
                case 18: goto L_0x0253;
                case 19: goto L_0x0249;
                case 20: goto L_0x023f;
                case 21: goto L_0x0235;
                case 22: goto L_0x022b;
                case 23: goto L_0x0253;
                case 24: goto L_0x0249;
                case 25: goto L_0x0221;
                case 26: goto L_0x0217;
                case 27: goto L_0x0209;
                case 28: goto L_0x01ff;
                case 29: goto L_0x01f5;
                case 30: goto L_0x01eb;
                case 31: goto L_0x0249;
                case 32: goto L_0x0253;
                case 33: goto L_0x01e1;
                case 34: goto L_0x01d7;
                case 35: goto L_0x01be;
                case 36: goto L_0x01b1;
                case 37: goto L_0x01a4;
                case 38: goto L_0x0197;
                case 39: goto L_0x018a;
                case 40: goto L_0x017d;
                case 41: goto L_0x0170;
                case 42: goto L_0x0163;
                case 43: goto L_0x0155;
                case 44: goto L_0x0147;
                case 45: goto L_0x0139;
                case 46: goto L_0x012b;
                case 47: goto L_0x011d;
                case 48: goto L_0x010f;
                case 49: goto L_0x0101;
                case 50: goto L_0x00f3;
                case 51: goto L_0x00eb;
                case 52: goto L_0x00e3;
                case 53: goto L_0x00d7;
                case 54: goto L_0x00cb;
                case 55: goto L_0x00bf;
                case 56: goto L_0x00b7;
                case 57: goto L_0x00af;
                case 58: goto L_0x00a7;
                case 59: goto L_0x0097;
                case 60: goto L_0x008f;
                case 61: goto L_0x0087;
                case 62: goto L_0x007b;
                case 63: goto L_0x006f;
                case 64: goto L_0x0067;
                case 65: goto L_0x005f;
                case 66: goto L_0x0053;
                case 67: goto L_0x0047;
                case 68: goto L_0x003f;
                default: goto L_0x003d;
            }
        L_0x003d:
            goto L_0x036b
        L_0x003f:
            boolean r11 = r0.u(r13, r4, r1)
            if (r11 == 0) goto L_0x036b
            goto L_0x0263
        L_0x0047:
            boolean r11 = r0.u(r13, r4, r1)
            if (r11 == 0) goto L_0x036b
            long r11 = G(r14, r1)
            goto L_0x027d
        L_0x0053:
            boolean r11 = r0.u(r13, r4, r1)
            if (r11 == 0) goto L_0x036b
            int r11 = F(r14, r1)
            goto L_0x028d
        L_0x005f:
            boolean r11 = r0.u(r13, r4, r1)
            if (r11 == 0) goto L_0x036b
            goto L_0x0299
        L_0x0067:
            boolean r11 = r0.u(r13, r4, r1)
            if (r11 == 0) goto L_0x036b
            goto L_0x02a5
        L_0x006f:
            boolean r11 = r0.u(r13, r4, r1)
            if (r11 == 0) goto L_0x036b
            int r11 = F(r14, r1)
            goto L_0x02b5
        L_0x007b:
            boolean r11 = r0.u(r13, r4, r1)
            if (r11 == 0) goto L_0x036b
            int r11 = F(r14, r1)
            goto L_0x02c5
        L_0x0087:
            boolean r11 = r0.u(r13, r4, r1)
            if (r11 == 0) goto L_0x036b
            goto L_0x02d1
        L_0x008f:
            boolean r11 = r0.u(r13, r4, r1)
            if (r11 == 0) goto L_0x036b
            goto L_0x02dc
        L_0x0097:
            boolean r11 = r0.u(r13, r4, r1)
            if (r11 == 0) goto L_0x036b
            java.lang.Object r11 = com.google.android.gms.internal.vision.b4.u(r14, r1)
            boolean r12 = r11 instanceof com.google.android.gms.internal.vision.w0
            if (r12 == 0) goto L_0x0300
            goto L_0x02f8
        L_0x00a7:
            boolean r11 = r0.u(r13, r4, r1)
            if (r11 == 0) goto L_0x036b
            goto L_0x030d
        L_0x00af:
            boolean r11 = r0.u(r13, r4, r1)
            if (r11 == 0) goto L_0x036b
            goto L_0x0318
        L_0x00b7:
            boolean r11 = r0.u(r13, r4, r1)
            if (r11 == 0) goto L_0x036b
            goto L_0x0323
        L_0x00bf:
            boolean r11 = r0.u(r13, r4, r1)
            if (r11 == 0) goto L_0x036b
            int r11 = F(r14, r1)
            goto L_0x0332
        L_0x00cb:
            boolean r11 = r0.u(r13, r4, r1)
            if (r11 == 0) goto L_0x036b
            long r11 = G(r14, r1)
            goto L_0x0341
        L_0x00d7:
            boolean r11 = r0.u(r13, r4, r1)
            if (r11 == 0) goto L_0x036b
            long r11 = G(r14, r1)
            goto L_0x0350
        L_0x00e3:
            boolean r11 = r0.u(r13, r4, r1)
            if (r11 == 0) goto L_0x036b
            goto L_0x035b
        L_0x00eb:
            boolean r11 = r0.u(r13, r4, r1)
            if (r11 == 0) goto L_0x036b
            goto L_0x0366
        L_0x00f3:
            java.lang.Object r11 = com.google.android.gms.internal.vision.b4.u(r14, r1)
            java.lang.Object r12 = r0.x(r4)
            r5.b((java.lang.Object) r11, (java.lang.Object) r12)
            r11 = 0
            goto L_0x036a
        L_0x0101:
            java.util.List r11 = p(r14, r1)
            com.google.android.gms.internal.vision.m3 r12 = r0.n(r4)
            int r11 = com.google.android.gms.internal.vision.n3.n(r13, r11, r12)
            goto L_0x036a
        L_0x010f:
            java.lang.Object r11 = r7.getObject(r1, r14)
            java.util.List r11 = (java.util.List) r11
            int r11 = com.google.android.gms.internal.vision.n3.u(r11)
            if (r11 <= 0) goto L_0x036b
            goto L_0x01ca
        L_0x011d:
            java.lang.Object r11 = r7.getObject(r1, r14)
            java.util.List r11 = (java.util.List) r11
            int r11 = com.google.android.gms.internal.vision.n3.G(r11)
            if (r11 <= 0) goto L_0x036b
            goto L_0x01ca
        L_0x012b:
            java.lang.Object r11 = r7.getObject(r1, r14)
            java.util.List r11 = (java.util.List) r11
            int r11 = com.google.android.gms.internal.vision.n3.M(r11)
            if (r11 <= 0) goto L_0x036b
            goto L_0x01ca
        L_0x0139:
            java.lang.Object r11 = r7.getObject(r1, r14)
            java.util.List r11 = (java.util.List) r11
            int r11 = com.google.android.gms.internal.vision.n3.J(r11)
            if (r11 <= 0) goto L_0x036b
            goto L_0x01ca
        L_0x0147:
            java.lang.Object r11 = r7.getObject(r1, r14)
            java.util.List r11 = (java.util.List) r11
            int r11 = com.google.android.gms.internal.vision.n3.x(r11)
            if (r11 <= 0) goto L_0x036b
            goto L_0x01ca
        L_0x0155:
            java.lang.Object r11 = r7.getObject(r1, r14)
            java.util.List r11 = (java.util.List) r11
            int r11 = com.google.android.gms.internal.vision.n3.D(r11)
            if (r11 <= 0) goto L_0x036b
            goto L_0x01ca
        L_0x0163:
            java.lang.Object r11 = r7.getObject(r1, r14)
            java.util.List r11 = (java.util.List) r11
            int r11 = com.google.android.gms.internal.vision.n3.P(r11)
            if (r11 <= 0) goto L_0x036b
            goto L_0x01ca
        L_0x0170:
            java.lang.Object r11 = r7.getObject(r1, r14)
            java.util.List r11 = (java.util.List) r11
            int r11 = com.google.android.gms.internal.vision.n3.J(r11)
            if (r11 <= 0) goto L_0x036b
            goto L_0x01ca
        L_0x017d:
            java.lang.Object r11 = r7.getObject(r1, r14)
            java.util.List r11 = (java.util.List) r11
            int r11 = com.google.android.gms.internal.vision.n3.M(r11)
            if (r11 <= 0) goto L_0x036b
            goto L_0x01ca
        L_0x018a:
            java.lang.Object r11 = r7.getObject(r1, r14)
            java.util.List r11 = (java.util.List) r11
            int r11 = com.google.android.gms.internal.vision.n3.A(r11)
            if (r11 <= 0) goto L_0x036b
            goto L_0x01ca
        L_0x0197:
            java.lang.Object r11 = r7.getObject(r1, r14)
            java.util.List r11 = (java.util.List) r11
            int r11 = com.google.android.gms.internal.vision.n3.o(r11)
            if (r11 <= 0) goto L_0x036b
            goto L_0x01ca
        L_0x01a4:
            java.lang.Object r11 = r7.getObject(r1, r14)
            java.util.List r11 = (java.util.List) r11
            int r11 = com.google.android.gms.internal.vision.n3.d(r11)
            if (r11 <= 0) goto L_0x036b
            goto L_0x01ca
        L_0x01b1:
            java.lang.Object r11 = r7.getObject(r1, r14)
            java.util.List r11 = (java.util.List) r11
            int r11 = com.google.android.gms.internal.vision.n3.J(r11)
            if (r11 <= 0) goto L_0x036b
            goto L_0x01ca
        L_0x01be:
            java.lang.Object r11 = r7.getObject(r1, r14)
            java.util.List r11 = (java.util.List) r11
            int r11 = com.google.android.gms.internal.vision.n3.M(r11)
            if (r11 <= 0) goto L_0x036b
        L_0x01ca:
            int r12 = com.google.android.gms.internal.vision.a1.e0(r13)
            int r13 = com.google.android.gms.internal.vision.a1.n0(r11)
            int r13 = r13 + r12
            int r13 = r13 + r11
            int r10 = r10 + r13
            goto L_0x036b
        L_0x01d7:
            java.util.List r11 = p(r14, r1)
            int r11 = com.google.android.gms.internal.vision.n3.t(r13, r11)
            goto L_0x036a
        L_0x01e1:
            java.util.List r11 = p(r14, r1)
            int r11 = com.google.android.gms.internal.vision.n3.F(r13, r11)
            goto L_0x036a
        L_0x01eb:
            java.util.List r11 = p(r14, r1)
            int r11 = com.google.android.gms.internal.vision.n3.w(r13, r11)
            goto L_0x036a
        L_0x01f5:
            java.util.List r11 = p(r14, r1)
            int r11 = com.google.android.gms.internal.vision.n3.C(r13, r11)
            goto L_0x036a
        L_0x01ff:
            java.util.List r11 = p(r14, r1)
            int r11 = com.google.android.gms.internal.vision.n3.s(r13, r11)
            goto L_0x036a
        L_0x0209:
            java.util.List r11 = p(r14, r1)
            com.google.android.gms.internal.vision.m3 r12 = r0.n(r4)
            int r11 = com.google.android.gms.internal.vision.n3.c(r13, r11, r12)
            goto L_0x036a
        L_0x0217:
            java.util.List r11 = p(r14, r1)
            int r11 = com.google.android.gms.internal.vision.n3.l(r13, r11)
            goto L_0x036a
        L_0x0221:
            java.util.List r11 = p(r14, r1)
            int r11 = com.google.android.gms.internal.vision.n3.O(r13, r11)
            goto L_0x036a
        L_0x022b:
            java.util.List r11 = p(r14, r1)
            int r11 = com.google.android.gms.internal.vision.n3.z(r13, r11)
            goto L_0x036a
        L_0x0235:
            java.util.List r11 = p(r14, r1)
            int r11 = com.google.android.gms.internal.vision.n3.m(r13, r11)
            goto L_0x036a
        L_0x023f:
            java.util.List r11 = p(r14, r1)
            int r11 = com.google.android.gms.internal.vision.n3.b(r13, r11)
            goto L_0x036a
        L_0x0249:
            java.util.List r11 = p(r14, r1)
            int r11 = com.google.android.gms.internal.vision.n3.I(r13, r11)
            goto L_0x036a
        L_0x0253:
            java.util.List r11 = p(r14, r1)
            int r11 = com.google.android.gms.internal.vision.n3.L(r13, r11)
            goto L_0x036a
        L_0x025d:
            boolean r11 = r0.v(r4, r1)
            if (r11 == 0) goto L_0x036b
        L_0x0263:
            java.lang.Object r11 = com.google.android.gms.internal.vision.b4.u(r14, r1)
            com.google.android.gms.internal.vision.w2 r11 = (com.google.android.gms.internal.vision.w2) r11
            com.google.android.gms.internal.vision.m3 r12 = r0.n(r4)
            int r11 = com.google.android.gms.internal.vision.a1.Y(r13, r11, r12)
            goto L_0x036a
        L_0x0273:
            boolean r11 = r0.v(r4, r1)
            if (r11 == 0) goto L_0x036b
            long r11 = com.google.android.gms.internal.vision.b4.l(r14, r1)
        L_0x027d:
            int r11 = com.google.android.gms.internal.vision.a1.k0(r13, r11)
            goto L_0x036a
        L_0x0283:
            boolean r11 = r0.v(r4, r1)
            if (r11 == 0) goto L_0x036b
            int r11 = com.google.android.gms.internal.vision.b4.b(r14, r1)
        L_0x028d:
            int r11 = com.google.android.gms.internal.vision.a1.p0(r13, r11)
            goto L_0x036a
        L_0x0293:
            boolean r11 = r0.v(r4, r1)
            if (r11 == 0) goto L_0x036b
        L_0x0299:
            int r11 = com.google.android.gms.internal.vision.a1.o0(r13)
            goto L_0x036a
        L_0x029f:
            boolean r11 = r0.v(r4, r1)
            if (r11 == 0) goto L_0x036b
        L_0x02a5:
            int r11 = com.google.android.gms.internal.vision.a1.r0(r13)
            goto L_0x036a
        L_0x02ab:
            boolean r11 = r0.v(r4, r1)
            if (r11 == 0) goto L_0x036b
            int r11 = com.google.android.gms.internal.vision.b4.b(r14, r1)
        L_0x02b5:
            int r11 = com.google.android.gms.internal.vision.a1.s0(r13, r11)
            goto L_0x036a
        L_0x02bb:
            boolean r11 = r0.v(r4, r1)
            if (r11 == 0) goto L_0x036b
            int r11 = com.google.android.gms.internal.vision.b4.b(r14, r1)
        L_0x02c5:
            int r11 = com.google.android.gms.internal.vision.a1.m0(r13, r11)
            goto L_0x036a
        L_0x02cb:
            boolean r11 = r0.v(r4, r1)
            if (r11 == 0) goto L_0x036b
        L_0x02d1:
            java.lang.Object r11 = com.google.android.gms.internal.vision.b4.u(r14, r1)
            goto L_0x02f8
        L_0x02d6:
            boolean r11 = r0.v(r4, r1)
            if (r11 == 0) goto L_0x036b
        L_0x02dc:
            java.lang.Object r11 = com.google.android.gms.internal.vision.b4.u(r14, r1)
            com.google.android.gms.internal.vision.m3 r12 = r0.n(r4)
            int r11 = com.google.android.gms.internal.vision.n3.a(r13, r12, r11)
            goto L_0x036a
        L_0x02ea:
            boolean r11 = r0.v(r4, r1)
            if (r11 == 0) goto L_0x036b
            java.lang.Object r11 = com.google.android.gms.internal.vision.b4.u(r14, r1)
            boolean r12 = r11 instanceof com.google.android.gms.internal.vision.w0
            if (r12 == 0) goto L_0x0300
        L_0x02f8:
            com.google.android.gms.internal.vision.w0 r11 = (com.google.android.gms.internal.vision.w0) r11
            int r11 = com.google.android.gms.internal.vision.a1.X(r13, r11)
            goto L_0x036a
        L_0x0300:
            java.lang.String r11 = (java.lang.String) r11
            int r11 = com.google.android.gms.internal.vision.a1.R(r11, r13)
            goto L_0x036a
        L_0x0307:
            boolean r11 = r0.v(r4, r1)
            if (r11 == 0) goto L_0x036b
        L_0x030d:
            int r11 = com.google.android.gms.internal.vision.a1.V(r13)
            goto L_0x036a
        L_0x0312:
            boolean r11 = r0.v(r4, r1)
            if (r11 == 0) goto L_0x036b
        L_0x0318:
            int r11 = com.google.android.gms.internal.vision.a1.q0(r13)
            goto L_0x036a
        L_0x031d:
            boolean r11 = r0.v(r4, r1)
            if (r11 == 0) goto L_0x036b
        L_0x0323:
            int r11 = com.google.android.gms.internal.vision.a1.l0(r13)
            goto L_0x036a
        L_0x0328:
            boolean r11 = r0.v(r4, r1)
            if (r11 == 0) goto L_0x036b
            int r11 = com.google.android.gms.internal.vision.b4.b(r14, r1)
        L_0x0332:
            int r11 = com.google.android.gms.internal.vision.a1.j0(r13, r11)
            goto L_0x036a
        L_0x0337:
            boolean r11 = r0.v(r4, r1)
            if (r11 == 0) goto L_0x036b
            long r11 = com.google.android.gms.internal.vision.b4.l(r14, r1)
        L_0x0341:
            int r11 = com.google.android.gms.internal.vision.a1.f0(r13, r11)
            goto L_0x036a
        L_0x0346:
            boolean r11 = r0.v(r4, r1)
            if (r11 == 0) goto L_0x036b
            long r11 = com.google.android.gms.internal.vision.b4.l(r14, r1)
        L_0x0350:
            int r11 = com.google.android.gms.internal.vision.a1.c0(r13, r11)
            goto L_0x036a
        L_0x0355:
            boolean r11 = r0.v(r4, r1)
            if (r11 == 0) goto L_0x036b
        L_0x035b:
            int r11 = com.google.android.gms.internal.vision.a1.P(r13)
            goto L_0x036a
        L_0x0360:
            boolean r11 = r0.v(r4, r1)
            if (r11 == 0) goto L_0x036b
        L_0x0366:
            int r11 = com.google.android.gms.internal.vision.a1.W(r13)
        L_0x036a:
            int r10 = r10 + r11
        L_0x036b:
            int r4 = r4 + 3
            goto L_0x0017
        L_0x036f:
            com.google.android.gms.internal.vision.y3 r1 = r6.e(r1)
            int r1 = r6.j(r1)
            int r1 = r1 + r10
            return r1
        L_0x0379:
            r12 = r3
            r4 = 0
            r10 = 0
            r11 = 0
        L_0x037d:
            int r13 = r8.length
            if (r4 >= r13) goto L_0x06f0
            int r13 = r0.E(r4)
            r14 = r8[r4]
            r15 = r13 & r2
            int r15 = r15 >>> 20
            r2 = 17
            if (r15 > r2) goto L_0x03a3
            int r2 = r4 + 2
            r2 = r8[r2]
            r9 = r2 & r3
            int r2 = r2 >>> 20
            r17 = 1
            int r2 = r17 << r2
            if (r9 == r12) goto L_0x03a4
            long r11 = (long) r9
            int r11 = r7.getInt(r1, r11)
            r12 = r9
            goto L_0x03a4
        L_0x03a3:
            r2 = 0
        L_0x03a4:
            r9 = r13 & r3
            r13 = r8
            long r8 = (long) r9
            switch(r15) {
                case 0: goto L_0x06dd;
                case 1: goto L_0x06d5;
                case 2: goto L_0x06c8;
                case 3: goto L_0x06bb;
                case 4: goto L_0x06ae;
                case 5: goto L_0x06a6;
                case 6: goto L_0x069d;
                case 7: goto L_0x0695;
                case 8: goto L_0x067b;
                case 9: goto L_0x066b;
                case 10: goto L_0x0663;
                case 11: goto L_0x0657;
                case 12: goto L_0x064b;
                case 13: goto L_0x0643;
                case 14: goto L_0x063b;
                case 15: goto L_0x062f;
                case 16: goto L_0x0622;
                case 17: goto L_0x060f;
                case 18: goto L_0x0603;
                case 19: goto L_0x05f6;
                case 20: goto L_0x05eb;
                case 21: goto L_0x05e0;
                case 22: goto L_0x05d5;
                case 23: goto L_0x05ca;
                case 24: goto L_0x05f6;
                case 25: goto L_0x05bf;
                case 26: goto L_0x05b3;
                case 27: goto L_0x05a3;
                case 28: goto L_0x0597;
                case 29: goto L_0x058b;
                case 30: goto L_0x057f;
                case 31: goto L_0x05f6;
                case 32: goto L_0x05ca;
                case 33: goto L_0x0573;
                case 34: goto L_0x0567;
                case 35: goto L_0x054e;
                case 36: goto L_0x0541;
                case 37: goto L_0x0534;
                case 38: goto L_0x0527;
                case 39: goto L_0x051a;
                case 40: goto L_0x050d;
                case 41: goto L_0x0500;
                case 42: goto L_0x04f3;
                case 43: goto L_0x04e5;
                case 44: goto L_0x04d7;
                case 45: goto L_0x04c9;
                case 46: goto L_0x04bb;
                case 47: goto L_0x04ad;
                case 48: goto L_0x049f;
                case 49: goto L_0x048f;
                case 50: goto L_0x0481;
                case 51: goto L_0x0475;
                case 52: goto L_0x0469;
                case 53: goto L_0x0459;
                case 54: goto L_0x0449;
                case 55: goto L_0x0439;
                case 56: goto L_0x042d;
                case 57: goto L_0x0421;
                case 58: goto L_0x0415;
                case 59: goto L_0x0405;
                case 60: goto L_0x03fd;
                case 61: goto L_0x03f5;
                case 62: goto L_0x03e9;
                case 63: goto L_0x03dd;
                case 64: goto L_0x03d5;
                case 65: goto L_0x03cd;
                case 66: goto L_0x03c1;
                case 67: goto L_0x03b5;
                case 68: goto L_0x03ad;
                default: goto L_0x03ab;
            }
        L_0x03ab:
            goto L_0x06e7
        L_0x03ad:
            boolean r2 = r0.u(r14, r4, r1)
            if (r2 == 0) goto L_0x06e7
            goto L_0x0612
        L_0x03b5:
            boolean r2 = r0.u(r14, r4, r1)
            if (r2 == 0) goto L_0x06e7
            long r8 = G(r8, r1)
            goto L_0x0629
        L_0x03c1:
            boolean r2 = r0.u(r14, r4, r1)
            if (r2 == 0) goto L_0x06e7
            int r2 = F(r8, r1)
            goto L_0x0636
        L_0x03cd:
            boolean r2 = r0.u(r14, r4, r1)
            if (r2 == 0) goto L_0x06e7
            goto L_0x063e
        L_0x03d5:
            boolean r2 = r0.u(r14, r4, r1)
            if (r2 == 0) goto L_0x06e7
            goto L_0x0646
        L_0x03dd:
            boolean r2 = r0.u(r14, r4, r1)
            if (r2 == 0) goto L_0x06e7
            int r2 = F(r8, r1)
            goto L_0x0652
        L_0x03e9:
            boolean r2 = r0.u(r14, r4, r1)
            if (r2 == 0) goto L_0x06e7
            int r2 = F(r8, r1)
            goto L_0x065e
        L_0x03f5:
            boolean r2 = r0.u(r14, r4, r1)
            if (r2 == 0) goto L_0x06e7
            goto L_0x0666
        L_0x03fd:
            boolean r2 = r0.u(r14, r4, r1)
            if (r2 == 0) goto L_0x06e7
            goto L_0x066e
        L_0x0405:
            boolean r2 = r0.u(r14, r4, r1)
            if (r2 == 0) goto L_0x06e7
            java.lang.Object r2 = r7.getObject(r1, r8)
            boolean r8 = r2 instanceof com.google.android.gms.internal.vision.w0
            if (r8 == 0) goto L_0x068d
            goto L_0x0686
        L_0x0415:
            boolean r2 = r0.u(r14, r4, r1)
            if (r2 == 0) goto L_0x06e7
            int r2 = com.google.android.gms.internal.vision.a1.V(r14)
            goto L_0x0693
        L_0x0421:
            boolean r2 = r0.u(r14, r4, r1)
            if (r2 == 0) goto L_0x06e7
            int r2 = com.google.android.gms.internal.vision.a1.q0(r14)
            goto L_0x0693
        L_0x042d:
            boolean r2 = r0.u(r14, r4, r1)
            if (r2 == 0) goto L_0x06e7
            int r2 = com.google.android.gms.internal.vision.a1.l0(r14)
            goto L_0x0693
        L_0x0439:
            boolean r2 = r0.u(r14, r4, r1)
            if (r2 == 0) goto L_0x06e7
            int r2 = F(r8, r1)
            int r2 = com.google.android.gms.internal.vision.a1.j0(r14, r2)
            goto L_0x0693
        L_0x0449:
            boolean r2 = r0.u(r14, r4, r1)
            if (r2 == 0) goto L_0x06e7
            long r8 = G(r8, r1)
            int r2 = com.google.android.gms.internal.vision.a1.f0(r14, r8)
            goto L_0x0693
        L_0x0459:
            boolean r2 = r0.u(r14, r4, r1)
            if (r2 == 0) goto L_0x06e7
            long r8 = G(r8, r1)
            int r2 = com.google.android.gms.internal.vision.a1.c0(r14, r8)
            goto L_0x0693
        L_0x0469:
            boolean r2 = r0.u(r14, r4, r1)
            if (r2 == 0) goto L_0x06e7
            int r2 = com.google.android.gms.internal.vision.a1.P(r14)
            goto L_0x0693
        L_0x0475:
            boolean r2 = r0.u(r14, r4, r1)
            if (r2 == 0) goto L_0x06e7
            int r2 = com.google.android.gms.internal.vision.a1.W(r14)
            goto L_0x0693
        L_0x0481:
            java.lang.Object r2 = r7.getObject(r1, r8)
            java.lang.Object r8 = r0.x(r4)
            r5.b((java.lang.Object) r2, (java.lang.Object) r8)
            r2 = 0
            goto L_0x0693
        L_0x048f:
            java.lang.Object r2 = r7.getObject(r1, r8)
            java.util.List r2 = (java.util.List) r2
            com.google.android.gms.internal.vision.m3 r8 = r0.n(r4)
            int r2 = com.google.android.gms.internal.vision.n3.n(r14, r2, r8)
            goto L_0x0693
        L_0x049f:
            java.lang.Object r2 = r7.getObject(r1, r8)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.vision.n3.u(r2)
            if (r2 <= 0) goto L_0x06e7
            goto L_0x055a
        L_0x04ad:
            java.lang.Object r2 = r7.getObject(r1, r8)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.vision.n3.G(r2)
            if (r2 <= 0) goto L_0x06e7
            goto L_0x055a
        L_0x04bb:
            java.lang.Object r2 = r7.getObject(r1, r8)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.vision.n3.M(r2)
            if (r2 <= 0) goto L_0x06e7
            goto L_0x055a
        L_0x04c9:
            java.lang.Object r2 = r7.getObject(r1, r8)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.vision.n3.J(r2)
            if (r2 <= 0) goto L_0x06e7
            goto L_0x055a
        L_0x04d7:
            java.lang.Object r2 = r7.getObject(r1, r8)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.vision.n3.x(r2)
            if (r2 <= 0) goto L_0x06e7
            goto L_0x055a
        L_0x04e5:
            java.lang.Object r2 = r7.getObject(r1, r8)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.vision.n3.D(r2)
            if (r2 <= 0) goto L_0x06e7
            goto L_0x055a
        L_0x04f3:
            java.lang.Object r2 = r7.getObject(r1, r8)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.vision.n3.P(r2)
            if (r2 <= 0) goto L_0x06e7
            goto L_0x055a
        L_0x0500:
            java.lang.Object r2 = r7.getObject(r1, r8)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.vision.n3.J(r2)
            if (r2 <= 0) goto L_0x06e7
            goto L_0x055a
        L_0x050d:
            java.lang.Object r2 = r7.getObject(r1, r8)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.vision.n3.M(r2)
            if (r2 <= 0) goto L_0x06e7
            goto L_0x055a
        L_0x051a:
            java.lang.Object r2 = r7.getObject(r1, r8)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.vision.n3.A(r2)
            if (r2 <= 0) goto L_0x06e7
            goto L_0x055a
        L_0x0527:
            java.lang.Object r2 = r7.getObject(r1, r8)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.vision.n3.o(r2)
            if (r2 <= 0) goto L_0x06e7
            goto L_0x055a
        L_0x0534:
            java.lang.Object r2 = r7.getObject(r1, r8)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.vision.n3.d(r2)
            if (r2 <= 0) goto L_0x06e7
            goto L_0x055a
        L_0x0541:
            java.lang.Object r2 = r7.getObject(r1, r8)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.vision.n3.J(r2)
            if (r2 <= 0) goto L_0x06e7
            goto L_0x055a
        L_0x054e:
            java.lang.Object r2 = r7.getObject(r1, r8)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.vision.n3.M(r2)
            if (r2 <= 0) goto L_0x06e7
        L_0x055a:
            int r8 = com.google.android.gms.internal.vision.a1.e0(r14)
            int r9 = com.google.android.gms.internal.vision.a1.n0(r2)
            int r9 = r9 + r8
            int r9 = r9 + r2
            int r10 = r10 + r9
            goto L_0x06e7
        L_0x0567:
            java.lang.Object r2 = r7.getObject(r1, r8)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.vision.n3.t(r14, r2)
            goto L_0x0600
        L_0x0573:
            java.lang.Object r2 = r7.getObject(r1, r8)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.vision.n3.F(r14, r2)
            goto L_0x0600
        L_0x057f:
            java.lang.Object r2 = r7.getObject(r1, r8)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.vision.n3.w(r14, r2)
            goto L_0x0600
        L_0x058b:
            java.lang.Object r2 = r7.getObject(r1, r8)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.vision.n3.C(r14, r2)
            goto L_0x0693
        L_0x0597:
            java.lang.Object r2 = r7.getObject(r1, r8)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.vision.n3.s(r14, r2)
            goto L_0x0693
        L_0x05a3:
            java.lang.Object r2 = r7.getObject(r1, r8)
            java.util.List r2 = (java.util.List) r2
            com.google.android.gms.internal.vision.m3 r8 = r0.n(r4)
            int r2 = com.google.android.gms.internal.vision.n3.c(r14, r2, r8)
            goto L_0x0693
        L_0x05b3:
            java.lang.Object r2 = r7.getObject(r1, r8)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.vision.n3.l(r14, r2)
            goto L_0x0693
        L_0x05bf:
            java.lang.Object r2 = r7.getObject(r1, r8)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.vision.n3.O(r14, r2)
            goto L_0x0600
        L_0x05ca:
            java.lang.Object r2 = r7.getObject(r1, r8)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.vision.n3.L(r14, r2)
            goto L_0x0600
        L_0x05d5:
            java.lang.Object r2 = r7.getObject(r1, r8)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.vision.n3.z(r14, r2)
            goto L_0x0600
        L_0x05e0:
            java.lang.Object r2 = r7.getObject(r1, r8)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.vision.n3.m(r14, r2)
            goto L_0x0600
        L_0x05eb:
            java.lang.Object r2 = r7.getObject(r1, r8)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.vision.n3.b(r14, r2)
            goto L_0x0600
        L_0x05f6:
            java.lang.Object r2 = r7.getObject(r1, r8)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.vision.n3.I(r14, r2)
        L_0x0600:
            int r10 = r10 + r2
            goto L_0x06e9
        L_0x0603:
            java.lang.Object r2 = r7.getObject(r1, r8)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.vision.n3.L(r14, r2)
            goto L_0x0693
        L_0x060f:
            r2 = r2 & r11
            if (r2 == 0) goto L_0x06e7
        L_0x0612:
            java.lang.Object r2 = r7.getObject(r1, r8)
            com.google.android.gms.internal.vision.w2 r2 = (com.google.android.gms.internal.vision.w2) r2
            com.google.android.gms.internal.vision.m3 r8 = r0.n(r4)
            int r2 = com.google.android.gms.internal.vision.a1.Y(r14, r2, r8)
            goto L_0x0693
        L_0x0622:
            r2 = r2 & r11
            if (r2 == 0) goto L_0x06e7
            long r8 = r7.getLong(r1, r8)
        L_0x0629:
            int r2 = com.google.android.gms.internal.vision.a1.k0(r14, r8)
            goto L_0x0693
        L_0x062f:
            r2 = r2 & r11
            if (r2 == 0) goto L_0x06e7
            int r2 = r7.getInt(r1, r8)
        L_0x0636:
            int r2 = com.google.android.gms.internal.vision.a1.p0(r14, r2)
            goto L_0x0693
        L_0x063b:
            r2 = r2 & r11
            if (r2 == 0) goto L_0x06e7
        L_0x063e:
            int r2 = com.google.android.gms.internal.vision.a1.o0(r14)
            goto L_0x0693
        L_0x0643:
            r2 = r2 & r11
            if (r2 == 0) goto L_0x06e7
        L_0x0646:
            int r2 = com.google.android.gms.internal.vision.a1.r0(r14)
            goto L_0x0693
        L_0x064b:
            r2 = r2 & r11
            if (r2 == 0) goto L_0x06e7
            int r2 = r7.getInt(r1, r8)
        L_0x0652:
            int r2 = com.google.android.gms.internal.vision.a1.s0(r14, r2)
            goto L_0x0693
        L_0x0657:
            r2 = r2 & r11
            if (r2 == 0) goto L_0x06e7
            int r2 = r7.getInt(r1, r8)
        L_0x065e:
            int r2 = com.google.android.gms.internal.vision.a1.m0(r14, r2)
            goto L_0x0693
        L_0x0663:
            r2 = r2 & r11
            if (r2 == 0) goto L_0x06e7
        L_0x0666:
            java.lang.Object r2 = r7.getObject(r1, r8)
            goto L_0x0686
        L_0x066b:
            r2 = r2 & r11
            if (r2 == 0) goto L_0x06e7
        L_0x066e:
            java.lang.Object r2 = r7.getObject(r1, r8)
            com.google.android.gms.internal.vision.m3 r8 = r0.n(r4)
            int r2 = com.google.android.gms.internal.vision.n3.a(r14, r8, r2)
            goto L_0x0693
        L_0x067b:
            r2 = r2 & r11
            if (r2 == 0) goto L_0x06e7
            java.lang.Object r2 = r7.getObject(r1, r8)
            boolean r8 = r2 instanceof com.google.android.gms.internal.vision.w0
            if (r8 == 0) goto L_0x068d
        L_0x0686:
            com.google.android.gms.internal.vision.w0 r2 = (com.google.android.gms.internal.vision.w0) r2
            int r2 = com.google.android.gms.internal.vision.a1.X(r14, r2)
            goto L_0x0693
        L_0x068d:
            java.lang.String r2 = (java.lang.String) r2
            int r2 = com.google.android.gms.internal.vision.a1.R(r2, r14)
        L_0x0693:
            int r10 = r10 + r2
            goto L_0x06e7
        L_0x0695:
            r2 = r2 & r11
            if (r2 == 0) goto L_0x06e7
            int r2 = com.google.android.gms.internal.vision.a1.V(r14)
            goto L_0x06e4
        L_0x069d:
            r2 = r2 & r11
            if (r2 == 0) goto L_0x06e9
            int r2 = com.google.android.gms.internal.vision.a1.q0(r14)
        L_0x06a4:
            int r10 = r10 + r2
            goto L_0x06e9
        L_0x06a6:
            r2 = r2 & r11
            if (r2 == 0) goto L_0x06e9
            int r2 = com.google.android.gms.internal.vision.a1.l0(r14)
            goto L_0x06a4
        L_0x06ae:
            r2 = r2 & r11
            if (r2 == 0) goto L_0x06e9
            int r2 = r7.getInt(r1, r8)
            int r2 = com.google.android.gms.internal.vision.a1.j0(r14, r2)
            goto L_0x0600
        L_0x06bb:
            r2 = r2 & r11
            if (r2 == 0) goto L_0x06e9
            long r8 = r7.getLong(r1, r8)
            int r2 = com.google.android.gms.internal.vision.a1.f0(r14, r8)
            goto L_0x0600
        L_0x06c8:
            r2 = r2 & r11
            if (r2 == 0) goto L_0x06e9
            long r8 = r7.getLong(r1, r8)
            int r2 = com.google.android.gms.internal.vision.a1.c0(r14, r8)
            goto L_0x0600
        L_0x06d5:
            r2 = r2 & r11
            if (r2 == 0) goto L_0x06e9
            int r2 = com.google.android.gms.internal.vision.a1.P(r14)
            goto L_0x06a4
        L_0x06dd:
            r2 = r2 & r11
            if (r2 == 0) goto L_0x06e9
            int r2 = com.google.android.gms.internal.vision.a1.W(r14)
        L_0x06e4:
            int r2 = r2 + r10
        L_0x06e5:
            r10 = r2
            goto L_0x06e9
        L_0x06e7:
            r2 = r10
            goto L_0x06e5
        L_0x06e9:
            int r4 = r4 + 3
            r8 = r13
            r2 = 267386880(0xff00000, float:2.3665827E-29)
            goto L_0x037d
        L_0x06f0:
            com.google.android.gms.internal.vision.y3 r2 = r6.e(r1)
            int r2 = r6.j(r2)
            int r2 = r2 + r10
            boolean r3 = r0.f3046f
            if (r3 == 0) goto L_0x074e
            com.google.android.gms.internal.vision.f1<?> r3 = r0.f3053n
            com.google.android.gms.internal.vision.j1 r1 = r3.a(r1)
            r9 = 0
            r16 = 0
        L_0x0706:
            com.google.android.gms.internal.vision.p3<T, java.lang.Object> r3 = r1.f3101a
            int r3 = r3.e()
            com.google.android.gms.internal.vision.p3<T, java.lang.Object> r4 = r1.f3101a
            if (r9 >= r3) goto L_0x0727
            java.util.Map$Entry r3 = r4.d(r9)
            java.lang.Object r4 = r3.getKey()
            com.google.android.gms.internal.vision.l1 r4 = (com.google.android.gms.internal.vision.l1) r4
            java.lang.Object r3 = r3.getValue()
            int r3 = com.google.android.gms.internal.vision.j1.g(r4, r3)
            int r16 = r3 + r16
            int r9 = r9 + 1
            goto L_0x0706
        L_0x0727:
            java.lang.Iterable r1 = r4.g()
            java.util.Iterator r1 = r1.iterator()
        L_0x072f:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x074c
            java.lang.Object r3 = r1.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            com.google.android.gms.internal.vision.l1 r4 = (com.google.android.gms.internal.vision.l1) r4
            java.lang.Object r3 = r3.getValue()
            int r3 = com.google.android.gms.internal.vision.j1.g(r4, r3)
            int r16 = r3 + r16
            goto L_0x072f
        L_0x074c:
            int r2 = r2 + r16
        L_0x074e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.a3.e(java.lang.Object):int");
    }

    public final boolean f(T t10) {
        boolean z;
        boolean z10;
        int i10 = 1048575;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            boolean z11 = true;
            if (i11 < this.f3049i) {
                int i13 = this.f3048h[i11];
                int[] iArr = this.f3042a;
                int i14 = iArr[i13];
                int E = E(i13);
                int i15 = iArr[i13 + 2];
                int i16 = i15 & 1048575;
                int i17 = 1 << (i15 >>> 20);
                if (i16 != i10) {
                    if (i16 != 1048575) {
                        i12 = f3041q.getInt(t10, (long) i16);
                    }
                    i10 = i16;
                }
                if ((268435456 & E) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    if (i10 == 1048575) {
                        z10 = v(i13, t10);
                    } else if ((i12 & i17) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        return false;
                    }
                }
                int i18 = (267386880 & E) >>> 20;
                if (i18 == 9 || i18 == 17) {
                    if (i10 == 1048575) {
                        z11 = v(i13, t10);
                    } else if ((i17 & i12) == 0) {
                        z11 = false;
                    }
                    if (z11 && !n(i13).f(b4.u((long) (E & 1048575), t10))) {
                        return false;
                    }
                } else {
                    if (i18 != 27) {
                        if (i18 == 60 || i18 == 68) {
                            if (u(i14, i13, t10) && !n(i13).f(b4.u((long) (E & 1048575), t10))) {
                                return false;
                            }
                        } else if (i18 != 49) {
                            if (i18 != 50) {
                                continue;
                            } else {
                                Object u = b4.u((long) (E & 1048575), t10);
                                t2 t2Var = this.f3054o;
                                if (!t2Var.a(u).isEmpty()) {
                                    t2Var.e(x(i13));
                                    throw null;
                                }
                            }
                        }
                    }
                    List list = (List) b4.u((long) (E & 1048575), t10);
                    if (!list.isEmpty()) {
                        m3 n10 = n(i13);
                        int i19 = 0;
                        while (true) {
                            if (i19 >= list.size()) {
                                break;
                            } else if (!n10.f(list.get(i19))) {
                                z11 = false;
                                break;
                            } else {
                                i19++;
                            }
                        }
                    }
                    if (!z11) {
                        return false;
                    }
                }
                i11++;
            } else if (!this.f3046f || this.f3053n.a(t10).k()) {
                return true;
            } else {
                return false;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v5, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0290, code lost:
        if (r0 == r15) goto L_0x02e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x02e1, code lost:
        if (r0 == r15) goto L_0x02e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x02fe, code lost:
        r6 = r17;
        r5 = r23;
        r2 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a8, code lost:
        r10 = r33;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00e7, code lost:
        r9.putInt(r14, r3, r1);
        r13 = r34;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00fe, code lost:
        r10 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00ff, code lost:
        r13 = r34;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x011c, code lost:
        r1 = r11.f3166c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0145, code lost:
        r9.putObject(r14, r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0192, code lost:
        r10 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01e7, code lost:
        r0 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01e9, code lost:
        r10 = r0;
        r0 = r23 | r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01eb, code lost:
        r5 = r6;
        r6 = r0;
        r0 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01ef, code lost:
        r27 = r9;
        r2 = r10;
        r17 = r23;
        r28 = 0;
        r10 = r8;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g(T r31, byte[] r32, int r33, int r34, com.google.android.gms.internal.vision.t0 r35) {
        /*
            r30 = this;
            r15 = r30
            r14 = r31
            r12 = r32
            r13 = r34
            r11 = r35
            boolean r0 = r15.f3047g
            if (r0 == 0) goto L_0x0333
            sun.misc.Unsafe r9 = f3041q
            r10 = 0
            r0 = r33
            r2 = r10
            r6 = r2
            r1 = -1
            r5 = 1048575(0xfffff, float:1.469367E-39)
        L_0x0019:
            if (r0 >= r13) goto L_0x0316
            int r3 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x002b
            int r0 = com.google.android.gms.internal.vision.s0.e(r0, r12, r3, r11)
            int r3 = r11.f3164a
            r4 = r0
            r16 = r3
            goto L_0x002e
        L_0x002b:
            r16 = r0
            r4 = r3
        L_0x002e:
            int r3 = r16 >>> 3
            r0 = r16 & 7
            int r8 = r15.d
            int r7 = r15.f3044c
            if (r3 <= r1) goto L_0x0043
            int r2 = r2 / 3
            if (r3 < r7) goto L_0x004c
            if (r3 > r8) goto L_0x004c
            int r1 = r15.w(r3, r2)
            goto L_0x004d
        L_0x0043:
            if (r3 < r7) goto L_0x004c
            if (r3 > r8) goto L_0x004c
            int r1 = r15.w(r3, r10)
            goto L_0x004d
        L_0x004c:
            r1 = -1
        L_0x004d:
            r8 = r1
            r7 = -1
            if (r8 != r7) goto L_0x005f
            r20 = r3
            r2 = r4
            r17 = r6
            r18 = r7
            r27 = r9
            r28 = r10
            r6 = r5
            goto L_0x02e9
        L_0x005f:
            int r1 = r8 + 1
            int[] r2 = r15.f3042a
            r1 = r2[r1]
            r18 = 267386880(0xff00000, float:2.3665827E-29)
            r18 = r1 & r18
            int r10 = r18 >>> 20
            r17 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r1 & r17
            r20 = r3
            r33 = r4
            long r3 = (long) r7
            r7 = 17
            r21 = r1
            if (r10 > r7) goto L_0x01fb
            int r7 = r8 + 2
            r2 = r2[r7]
            int r7 = r2 >>> 20
            r1 = 1
            int r7 = r1 << r7
            r13 = 1048575(0xfffff, float:1.469367E-39)
            r2 = r2 & r13
            if (r2 == r5) goto L_0x00a1
            if (r5 == r13) goto L_0x0095
            r23 = r2
            long r1 = (long) r5
            r9.putInt(r14, r1, r6)
            r1 = r23
            goto L_0x0096
        L_0x0095:
            r1 = r2
        L_0x0096:
            if (r1 == r13) goto L_0x009d
            long r5 = (long) r1
            int r6 = r9.getInt(r14, r5)
        L_0x009d:
            r23 = r6
            r6 = r1
            goto L_0x00a4
        L_0x00a1:
            r23 = r6
            r6 = r5
        L_0x00a4:
            r1 = 5
            switch(r10) {
                case 0: goto L_0x01d5;
                case 1: goto L_0x01c3;
                case 2: goto L_0x01a7;
                case 3: goto L_0x01a7;
                case 4: goto L_0x0195;
                case 5: goto L_0x0176;
                case 6: goto L_0x0164;
                case 7: goto L_0x0149;
                case 8: goto L_0x012c;
                case 9: goto L_0x0105;
                case 10: goto L_0x00f0;
                case 11: goto L_0x0195;
                case 12: goto L_0x00dd;
                case 13: goto L_0x0164;
                case 14: goto L_0x0176;
                case 15: goto L_0x00ce;
                case 16: goto L_0x00ab;
                default: goto L_0x00a8;
            }
        L_0x00a8:
            r10 = r33
            goto L_0x00ff
        L_0x00ab:
            if (r0 != 0) goto L_0x00a8
            r5 = r33
            int r10 = com.google.android.gms.internal.vision.s0.k(r12, r5, r11)
            long r0 = r11.f3165b
            long r16 = s6.a.c0(r0)
            r0 = r9
            r1 = r31
            r2 = r3
            r4 = r16
            r0.putLong(r1, r2, r4)
            r0 = r23 | r7
            r13 = r34
            r5 = r6
            r2 = r8
            r1 = r20
            r6 = r0
            r0 = r10
            goto L_0x023f
        L_0x00ce:
            r5 = r33
            if (r0 != 0) goto L_0x00fe
            int r0 = com.google.android.gms.internal.vision.s0.i(r12, r5, r11)
            int r1 = r11.f3164a
            int r1 = s6.a.s0(r1)
            goto L_0x00e7
        L_0x00dd:
            r5 = r33
            if (r0 != 0) goto L_0x00fe
            int r0 = com.google.android.gms.internal.vision.s0.i(r12, r5, r11)
            int r1 = r11.f3164a
        L_0x00e7:
            r9.putInt(r14, r3, r1)
            r24 = r13
            r13 = r34
            goto L_0x018f
        L_0x00f0:
            r5 = r33
            r1 = 2
            if (r0 != r1) goto L_0x00fe
            int r0 = com.google.android.gms.internal.vision.s0.q(r12, r5, r11)
            r24 = r13
            r13 = r34
            goto L_0x011c
        L_0x00fe:
            r10 = r5
        L_0x00ff:
            r24 = r13
            r13 = r34
            goto L_0x01ef
        L_0x0105:
            r5 = r33
            r1 = 2
            if (r0 != r1) goto L_0x0126
            com.google.android.gms.internal.vision.m3 r0 = r15.n(r8)
            r24 = r13
            r13 = r34
            int r0 = com.google.android.gms.internal.vision.s0.h(r0, r12, r5, r13, r11)
            java.lang.Object r1 = r9.getObject(r14, r3)
            if (r1 != 0) goto L_0x011f
        L_0x011c:
            java.lang.Object r1 = r11.f3166c
            goto L_0x0145
        L_0x011f:
            java.lang.Object r2 = r11.f3166c
            com.google.android.gms.internal.vision.q1 r1 = com.google.android.gms.internal.vision.u1.c(r1, r2)
            goto L_0x0145
        L_0x0126:
            r24 = r13
            r13 = r34
            goto L_0x0192
        L_0x012c:
            r5 = r33
            r24 = r13
            r1 = 2
            r13 = r34
            if (r0 != r1) goto L_0x0192
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r21 & r0
            if (r0 != 0) goto L_0x0140
            int r0 = com.google.android.gms.internal.vision.s0.n(r12, r5, r11)
            goto L_0x011c
        L_0x0140:
            int r0 = com.google.android.gms.internal.vision.s0.p(r12, r5, r11)
            goto L_0x011c
        L_0x0145:
            r9.putObject(r14, r3, r1)
            goto L_0x018f
        L_0x0149:
            r5 = r33
            r24 = r13
            r13 = r34
            if (r0 != 0) goto L_0x0192
            int r0 = com.google.android.gms.internal.vision.s0.k(r12, r5, r11)
            long r1 = r11.f3165b
            r21 = 0
            int r1 = (r1 > r21 ? 1 : (r1 == r21 ? 0 : -1))
            if (r1 == 0) goto L_0x015f
            r1 = 1
            goto L_0x0160
        L_0x015f:
            r1 = 0
        L_0x0160:
            com.google.android.gms.internal.vision.b4.g(r14, r3, r1)
            goto L_0x018f
        L_0x0164:
            r5 = r33
            r24 = r13
            r13 = r34
            if (r0 != r1) goto L_0x0192
            int r0 = com.google.android.gms.internal.vision.s0.a(r5, r12)
            r9.putInt(r14, r3, r0)
            int r0 = r5 + 4
            goto L_0x018f
        L_0x0176:
            r5 = r33
            r24 = r13
            r1 = 1
            r13 = r34
            if (r0 != r1) goto L_0x0192
            long r16 = com.google.android.gms.internal.vision.s0.l(r5, r12)
            r0 = r9
            r1 = r31
            r2 = r3
            r10 = r5
            r4 = r16
            r0.putLong(r1, r2, r4)
            int r0 = r10 + 8
        L_0x018f:
            r1 = r23 | r7
            goto L_0x01e9
        L_0x0192:
            r10 = r5
            goto L_0x01ef
        L_0x0195:
            r10 = r33
            r24 = r13
            r13 = r34
            if (r0 != 0) goto L_0x01ef
            int r0 = com.google.android.gms.internal.vision.s0.i(r12, r10, r11)
            int r1 = r11.f3164a
            r9.putInt(r14, r3, r1)
            goto L_0x018f
        L_0x01a7:
            r10 = r33
            r24 = r13
            r13 = r34
            if (r0 != 0) goto L_0x01ef
            int r10 = com.google.android.gms.internal.vision.s0.k(r12, r10, r11)
            long r1 = r11.f3165b
            r0 = r9
            r16 = r1
            r1 = r31
            r2 = r3
            r4 = r16
            r0.putLong(r1, r2, r4)
            r0 = r23 | r7
            goto L_0x01eb
        L_0x01c3:
            r10 = r33
            r24 = r13
            r13 = r34
            if (r0 != r1) goto L_0x01ef
            float r0 = com.google.android.gms.internal.vision.s0.o(r10, r12)
            com.google.android.gms.internal.vision.b4.e(r14, r3, r0)
            int r4 = r10 + 4
            goto L_0x01e7
        L_0x01d5:
            r10 = r33
            r24 = r13
            r1 = 1
            r13 = r34
            if (r0 != r1) goto L_0x01ef
            double r0 = com.google.android.gms.internal.vision.s0.m(r10, r12)
            com.google.android.gms.internal.vision.b4.d(r14, r3, r0)
            int r4 = r10 + 8
        L_0x01e7:
            r0 = r4
            goto L_0x018f
        L_0x01e9:
            r10 = r0
            r0 = r1
        L_0x01eb:
            r5 = r6
            r6 = r0
            r0 = r10
            goto L_0x023c
        L_0x01ef:
            r27 = r9
            r2 = r10
            r17 = r23
            r18 = -1
            r28 = 0
            r10 = r8
            goto L_0x02e9
        L_0x01fb:
            r7 = r33
            r24 = 1048575(0xfffff, float:1.469367E-39)
            r1 = 27
            if (r10 != r1) goto L_0x0252
            r1 = 2
            if (r0 != r1) goto L_0x0242
            java.lang.Object r0 = r9.getObject(r14, r3)
            com.google.android.gms.internal.vision.a2 r0 = (com.google.android.gms.internal.vision.a2) r0
            boolean r1 = r0.zza()
            if (r1 != 0) goto L_0x0225
            int r1 = r0.size()
            if (r1 != 0) goto L_0x021c
            r1 = 10
            goto L_0x021e
        L_0x021c:
            int r1 = r1 << 1
        L_0x021e:
            com.google.android.gms.internal.vision.a2 r0 = r0.d(r1)
            r9.putObject(r14, r3, r0)
        L_0x0225:
            r10 = r0
            com.google.android.gms.internal.vision.m3 r0 = r15.n(r8)
            r1 = r16
            r2 = r32
            r3 = r7
            r4 = r34
            r7 = r5
            r5 = r10
            r10 = r6
            r6 = r35
            int r0 = com.google.android.gms.internal.vision.s0.f(r0, r1, r2, r3, r4, r5, r6)
            r5 = r7
            r6 = r10
        L_0x023c:
            r2 = r8
            r1 = r20
        L_0x023f:
            r10 = 0
            goto L_0x0019
        L_0x0242:
            r10 = r6
            r23 = r5
            r15 = r7
            r24 = r8
            r27 = r9
            r17 = r10
            r18 = -1
            r28 = 0
            goto L_0x02b3
        L_0x0252:
            r29 = r6
            r6 = r5
            r5 = r29
            r1 = 49
            if (r10 > r1) goto L_0x0293
            r1 = r21
            long r1 = (long) r1
            r33 = r0
            r0 = r30
            r21 = r1
            r1 = r31
            r2 = r32
            r25 = r3
            r3 = r7
            r4 = r34
            r15 = r5
            r5 = r16
            r17 = r15
            r15 = r6
            r6 = r20
            r23 = r15
            r18 = -1
            r15 = r7
            r7 = r33
            r24 = r8
            r27 = r9
            r19 = r10
            r28 = 0
            r9 = r21
            r11 = r19
            r12 = r25
            r14 = r35
            int r0 = r0.k(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 != r15) goto L_0x02fe
            goto L_0x02e3
        L_0x0293:
            r33 = r0
            r25 = r3
            r17 = r5
            r23 = r6
            r15 = r7
            r24 = r8
            r27 = r9
            r19 = r10
            r1 = r21
            r18 = -1
            r28 = 0
            r0 = 50
            r9 = r19
            r7 = r33
            if (r9 != r0) goto L_0x02c9
            r0 = 2
            if (r7 == r0) goto L_0x02b5
        L_0x02b3:
            r4 = r15
            goto L_0x02e4
        L_0x02b5:
            r0 = r30
            r1 = r31
            r2 = r32
            r3 = r15
            r4 = r34
            r5 = r24
            r6 = r25
            r8 = r35
            r0.t(r1, r2, r3, r4, r5, r6, r8)
            r0 = 0
            throw r0
        L_0x02c9:
            r0 = r30
            r8 = r1
            r1 = r31
            r2 = r32
            r3 = r15
            r4 = r34
            r5 = r16
            r6 = r20
            r10 = r25
            r12 = r24
            r13 = r35
            int r0 = r0.j(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 != r15) goto L_0x02fe
        L_0x02e3:
            r4 = r0
        L_0x02e4:
            r2 = r4
            r6 = r23
            r10 = r24
        L_0x02e9:
            com.google.android.gms.internal.vision.y3 r4 = H(r31)
            r0 = r16
            r1 = r32
            r3 = r34
            r5 = r35
            int r0 = com.google.android.gms.internal.vision.s0.d(r0, r1, r2, r3, r4, r5)
            r5 = r6
            r2 = r10
            r6 = r17
            goto L_0x0304
        L_0x02fe:
            r6 = r17
            r5 = r23
            r2 = r24
        L_0x0304:
            r15 = r30
            r14 = r31
            r12 = r32
            r13 = r34
            r11 = r35
            r1 = r20
            r9 = r27
            r10 = r28
            goto L_0x0019
        L_0x0316:
            r17 = r6
            r27 = r9
            r1 = 1048575(0xfffff, float:1.469367E-39)
            if (r5 == r1) goto L_0x0329
            long r1 = (long) r5
            r3 = r31
            r6 = r17
            r4 = r27
            r4.putInt(r3, r1, r6)
        L_0x0329:
            r4 = r34
            if (r0 != r4) goto L_0x032e
            return
        L_0x032e:
            com.google.android.gms.internal.vision.z1 r0 = com.google.android.gms.internal.vision.z1.c()
            throw r0
        L_0x0333:
            r4 = r13
            r3 = r14
            r5 = 0
            r0 = r30
            r1 = r31
            r2 = r32
            r3 = r33
            r4 = r34
            r6 = r35
            r0.l(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.a3.g(java.lang.Object, byte[], int, int, com.google.android.gms.internal.vision.t0):void");
    }

    public final T h() {
        return this.f3051k.a(this.f3045e);
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x0368  */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x037a  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x038c  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x039e  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x03b0  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x03c2  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x03d4  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x03e6  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x03f8  */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0410  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0424  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0438  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x044c  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0460  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0474  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0488  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x049e  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x04b6  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x04ca  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x04de  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x04f2  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x0505  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0518  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x052b  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x053e  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x0551  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x056d  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0159  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x016a  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x017b  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0192  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01a9  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01b4  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01c7  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01d8  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01ea  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01fc  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x020e  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0220  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0232  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0244  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0256  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0268  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x027a  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x028c  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x029e  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x02b0  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x02c2  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x02d4  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x02e6  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x02f8  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x030a  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x031c  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x032e  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0340  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0356  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void i(java.lang.Object r18, com.google.android.gms.internal.vision.b1 r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r19.getClass()
            boolean r3 = r0.f3047g
            if (r3 == 0) goto L_0x058a
            boolean r4 = r0.f3046f
            com.google.android.gms.internal.vision.f1<?> r5 = r0.f3053n
            if (r4 == 0) goto L_0x002a
            com.google.android.gms.internal.vision.j1 r4 = r5.a(r1)
            com.google.android.gms.internal.vision.p3<T, java.lang.Object> r6 = r4.f3101a
            boolean r6 = r6.isEmpty()
            if (r6 != 0) goto L_0x002a
            java.util.Iterator r4 = r4.i()
            java.lang.Object r6 = r4.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            goto L_0x002c
        L_0x002a:
            r4 = 0
            r6 = 0
        L_0x002c:
            int[] r7 = r0.f3042a
            int r8 = r7.length
            r9 = 0
            r10 = r9
        L_0x0031:
            if (r10 >= r8) goto L_0x0569
            int r11 = r0.E(r10)
            r12 = r7[r10]
        L_0x0039:
            if (r6 == 0) goto L_0x0052
            r5.c(r6)
            if (r12 < 0) goto L_0x0052
            r5.e(r6)
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x0050
            java.lang.Object r6 = r4.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            goto L_0x0039
        L_0x0050:
            r6 = 0
            goto L_0x0039
        L_0x0052:
            r13 = 267386880(0xff00000, float:2.3665827E-29)
            r13 = r13 & r11
            int r13 = r13 >>> 20
            r14 = 1
            r15 = 1048575(0xfffff, float:1.469367E-39)
            switch(r13) {
                case 0: goto L_0x0551;
                case 1: goto L_0x053e;
                case 2: goto L_0x052b;
                case 3: goto L_0x0518;
                case 4: goto L_0x0505;
                case 5: goto L_0x04f2;
                case 6: goto L_0x04de;
                case 7: goto L_0x04ca;
                case 8: goto L_0x04b6;
                case 9: goto L_0x049e;
                case 10: goto L_0x0488;
                case 11: goto L_0x0474;
                case 12: goto L_0x0460;
                case 13: goto L_0x044c;
                case 14: goto L_0x0438;
                case 15: goto L_0x0424;
                case 16: goto L_0x0410;
                case 17: goto L_0x03f8;
                case 18: goto L_0x03e6;
                case 19: goto L_0x03d4;
                case 20: goto L_0x03c2;
                case 21: goto L_0x03b0;
                case 22: goto L_0x039e;
                case 23: goto L_0x038c;
                case 24: goto L_0x037a;
                case 25: goto L_0x0368;
                case 26: goto L_0x0356;
                case 27: goto L_0x0340;
                case 28: goto L_0x032e;
                case 29: goto L_0x031c;
                case 30: goto L_0x030a;
                case 31: goto L_0x02f8;
                case 32: goto L_0x02e6;
                case 33: goto L_0x02d4;
                case 34: goto L_0x02c2;
                case 35: goto L_0x02b0;
                case 36: goto L_0x029e;
                case 37: goto L_0x028c;
                case 38: goto L_0x027a;
                case 39: goto L_0x0268;
                case 40: goto L_0x0256;
                case 41: goto L_0x0244;
                case 42: goto L_0x0232;
                case 43: goto L_0x0220;
                case 44: goto L_0x020e;
                case 45: goto L_0x01fc;
                case 46: goto L_0x01ea;
                case 47: goto L_0x01d8;
                case 48: goto L_0x01c7;
                case 49: goto L_0x01b4;
                case 50: goto L_0x01a9;
                case 51: goto L_0x0192;
                case 52: goto L_0x017b;
                case 53: goto L_0x016a;
                case 54: goto L_0x0159;
                case 55: goto L_0x0148;
                case 56: goto L_0x0137;
                case 57: goto L_0x0126;
                case 58: goto L_0x010f;
                case 59: goto L_0x00fe;
                case 60: goto L_0x00e9;
                case 61: goto L_0x00d6;
                case 62: goto L_0x00c6;
                case 63: goto L_0x00b6;
                case 64: goto L_0x00a6;
                case 65: goto L_0x0096;
                case 66: goto L_0x0086;
                case 67: goto L_0x0076;
                case 68: goto L_0x0062;
                default: goto L_0x005e;
            }
        L_0x005e:
            r16 = r4
            goto L_0x0563
        L_0x0062:
            boolean r13 = r0.u(r12, r10, r1)
            if (r13 == 0) goto L_0x005e
            r11 = r11 & r15
            long r13 = (long) r11
            java.lang.Object r11 = com.google.android.gms.internal.vision.b4.u(r13, r1)
            com.google.android.gms.internal.vision.m3 r13 = r0.n(r10)
            r2.k(r12, r13, r11)
            goto L_0x005e
        L_0x0076:
            boolean r13 = r0.u(r12, r10, r1)
            if (r13 == 0) goto L_0x005e
            r11 = r11 & r15
            long r13 = (long) r11
            long r13 = G(r13, r1)
            r2.q(r12, r13)
            goto L_0x005e
        L_0x0086:
            boolean r13 = r0.u(r12, r10, r1)
            if (r13 == 0) goto L_0x005e
            r11 = r11 & r15
            long r13 = (long) r11
            int r11 = F(r13, r1)
            r2.r(r12, r11)
            goto L_0x005e
        L_0x0096:
            boolean r13 = r0.u(r12, r10, r1)
            if (r13 == 0) goto L_0x005e
            r11 = r11 & r15
            long r13 = (long) r11
            long r13 = G(r13, r1)
            r2.j(r12, r13)
            goto L_0x005e
        L_0x00a6:
            boolean r13 = r0.u(r12, r10, r1)
            if (r13 == 0) goto L_0x005e
            r11 = r11 & r15
            long r13 = (long) r11
            int r11 = F(r13, r1)
            r2.c(r12, r11)
            goto L_0x005e
        L_0x00b6:
            boolean r13 = r0.u(r12, r10, r1)
            if (r13 == 0) goto L_0x005e
            r11 = r11 & r15
            long r13 = (long) r11
            int r11 = F(r13, r1)
            r2.i(r12, r11)
            goto L_0x005e
        L_0x00c6:
            boolean r13 = r0.u(r12, r10, r1)
            if (r13 == 0) goto L_0x005e
            r11 = r11 & r15
            long r13 = (long) r11
            int r11 = F(r13, r1)
            r2.p(r12, r11)
            goto L_0x005e
        L_0x00d6:
            boolean r13 = r0.u(r12, r10, r1)
            if (r13 == 0) goto L_0x005e
            r11 = r11 & r15
            long r13 = (long) r11
            java.lang.Object r11 = com.google.android.gms.internal.vision.b4.u(r13, r1)
            com.google.android.gms.internal.vision.w0 r11 = (com.google.android.gms.internal.vision.w0) r11
            r2.e(r12, r11)
            goto L_0x005e
        L_0x00e9:
            boolean r13 = r0.u(r12, r10, r1)
            if (r13 == 0) goto L_0x005e
            r11 = r11 & r15
            long r13 = (long) r11
            java.lang.Object r11 = com.google.android.gms.internal.vision.b4.u(r13, r1)
            com.google.android.gms.internal.vision.m3 r13 = r0.n(r10)
            r2.f(r12, r13, r11)
            goto L_0x005e
        L_0x00fe:
            boolean r13 = r0.u(r12, r10, r1)
            if (r13 == 0) goto L_0x005e
            r11 = r11 & r15
            long r13 = (long) r11
            java.lang.Object r11 = com.google.android.gms.internal.vision.b4.u(r13, r1)
            q(r12, r11, r2)
            goto L_0x005e
        L_0x010f:
            boolean r13 = r0.u(r12, r10, r1)
            if (r13 == 0) goto L_0x005e
            r11 = r11 & r15
            long r13 = (long) r11
            java.lang.Object r11 = com.google.android.gms.internal.vision.b4.u(r13, r1)
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            r2.h(r12, r11)
            goto L_0x005e
        L_0x0126:
            boolean r13 = r0.u(r12, r10, r1)
            if (r13 == 0) goto L_0x005e
            r11 = r11 & r15
            long r13 = (long) r11
            int r11 = F(r13, r1)
            r2.n(r12, r11)
            goto L_0x005e
        L_0x0137:
            boolean r13 = r0.u(r12, r10, r1)
            if (r13 == 0) goto L_0x005e
            r11 = r11 & r15
            long r13 = (long) r11
            long r13 = G(r13, r1)
            r2.o(r12, r13)
            goto L_0x005e
        L_0x0148:
            boolean r13 = r0.u(r12, r10, r1)
            if (r13 == 0) goto L_0x005e
            r11 = r11 & r15
            long r13 = (long) r11
            int r11 = F(r13, r1)
            r2.l(r12, r11)
            goto L_0x005e
        L_0x0159:
            boolean r13 = r0.u(r12, r10, r1)
            if (r13 == 0) goto L_0x005e
            r11 = r11 & r15
            long r13 = (long) r11
            long r13 = G(r13, r1)
            r2.m(r12, r13)
            goto L_0x005e
        L_0x016a:
            boolean r13 = r0.u(r12, r10, r1)
            if (r13 == 0) goto L_0x005e
            r11 = r11 & r15
            long r13 = (long) r11
            long r13 = G(r13, r1)
            r2.d(r12, r13)
            goto L_0x005e
        L_0x017b:
            boolean r13 = r0.u(r12, r10, r1)
            if (r13 == 0) goto L_0x005e
            r11 = r11 & r15
            long r13 = (long) r11
            java.lang.Object r11 = com.google.android.gms.internal.vision.b4.u(r13, r1)
            java.lang.Float r11 = (java.lang.Float) r11
            float r11 = r11.floatValue()
            r2.b(r12, r11)
            goto L_0x005e
        L_0x0192:
            boolean r13 = r0.u(r12, r10, r1)
            if (r13 == 0) goto L_0x005e
            r11 = r11 & r15
            long r13 = (long) r11
            java.lang.Object r11 = com.google.android.gms.internal.vision.b4.u(r13, r1)
            java.lang.Double r11 = (java.lang.Double) r11
            double r13 = r11.doubleValue()
            r2.a(r13, r12)
            goto L_0x005e
        L_0x01a9:
            r11 = r11 & r15
            long r13 = (long) r11
            java.lang.Object r11 = com.google.android.gms.internal.vision.b4.u(r13, r1)
            r0.s(r2, r12, r11, r10)
            goto L_0x005e
        L_0x01b4:
            r12 = r7[r10]
            r11 = r11 & r15
            long r13 = (long) r11
            java.lang.Object r11 = com.google.android.gms.internal.vision.b4.u(r13, r1)
            java.util.List r11 = (java.util.List) r11
            com.google.android.gms.internal.vision.m3 r13 = r0.n(r10)
            com.google.android.gms.internal.vision.n3.q(r12, r11, r2, r13)
            goto L_0x005e
        L_0x01c7:
            r12 = r7[r10]
            r11 = r11 & r15
            r16 = r4
            long r3 = (long) r11
            java.lang.Object r3 = com.google.android.gms.internal.vision.b4.u(r3, r1)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.vision.n3.B(r12, r3, r2, r14)
            goto L_0x0563
        L_0x01d8:
            r16 = r4
            r3 = r7[r10]
            r4 = r11 & r15
            long r11 = (long) r4
            java.lang.Object r4 = com.google.android.gms.internal.vision.b4.u(r11, r1)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.vision.n3.Q(r3, r4, r2, r14)
            goto L_0x0563
        L_0x01ea:
            r16 = r4
            r3 = r7[r10]
            r4 = r11 & r15
            long r11 = (long) r4
            java.lang.Object r4 = com.google.android.gms.internal.vision.b4.u(r11, r1)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.vision.n3.H(r3, r4, r2, r14)
            goto L_0x0563
        L_0x01fc:
            r16 = r4
            r3 = r7[r10]
            r4 = r11 & r15
            long r11 = (long) r4
            java.lang.Object r4 = com.google.android.gms.internal.vision.b4.u(r11, r1)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.vision.n3.S(r3, r4, r2, r14)
            goto L_0x0563
        L_0x020e:
            r16 = r4
            r3 = r7[r10]
            r4 = r11 & r15
            long r11 = (long) r4
            java.lang.Object r4 = com.google.android.gms.internal.vision.b4.u(r11, r1)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.vision.n3.T(r3, r4, r2, r14)
            goto L_0x0563
        L_0x0220:
            r16 = r4
            r3 = r7[r10]
            r4 = r11 & r15
            long r11 = (long) r4
            java.lang.Object r4 = com.google.android.gms.internal.vision.b4.u(r11, r1)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.vision.n3.N(r3, r4, r2, r14)
            goto L_0x0563
        L_0x0232:
            r16 = r4
            r3 = r7[r10]
            r4 = r11 & r15
            long r11 = (long) r4
            java.lang.Object r4 = com.google.android.gms.internal.vision.b4.u(r11, r1)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.vision.n3.U(r3, r4, r2, r14)
            goto L_0x0563
        L_0x0244:
            r16 = r4
            r3 = r7[r10]
            r4 = r11 & r15
            long r11 = (long) r4
            java.lang.Object r4 = com.google.android.gms.internal.vision.b4.u(r11, r1)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.vision.n3.R(r3, r4, r2, r14)
            goto L_0x0563
        L_0x0256:
            r16 = r4
            r3 = r7[r10]
            r4 = r11 & r15
            long r11 = (long) r4
            java.lang.Object r4 = com.google.android.gms.internal.vision.b4.u(r11, r1)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.vision.n3.E(r3, r4, r2, r14)
            goto L_0x0563
        L_0x0268:
            r16 = r4
            r3 = r7[r10]
            r4 = r11 & r15
            long r11 = (long) r4
            java.lang.Object r4 = com.google.android.gms.internal.vision.b4.u(r11, r1)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.vision.n3.K(r3, r4, r2, r14)
            goto L_0x0563
        L_0x027a:
            r16 = r4
            r3 = r7[r10]
            r4 = r11 & r15
            long r11 = (long) r4
            java.lang.Object r4 = com.google.android.gms.internal.vision.b4.u(r11, r1)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.vision.n3.y(r3, r4, r2, r14)
            goto L_0x0563
        L_0x028c:
            r16 = r4
            r3 = r7[r10]
            r4 = r11 & r15
            long r11 = (long) r4
            java.lang.Object r4 = com.google.android.gms.internal.vision.b4.u(r11, r1)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.vision.n3.v(r3, r4, r2, r14)
            goto L_0x0563
        L_0x029e:
            r16 = r4
            r3 = r7[r10]
            r4 = r11 & r15
            long r11 = (long) r4
            java.lang.Object r4 = com.google.android.gms.internal.vision.b4.u(r11, r1)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.vision.n3.r(r3, r4, r2, r14)
            goto L_0x0563
        L_0x02b0:
            r16 = r4
            r3 = r7[r10]
            r4 = r11 & r15
            long r11 = (long) r4
            java.lang.Object r4 = com.google.android.gms.internal.vision.b4.u(r11, r1)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.vision.n3.i(r3, r4, r2, r14)
            goto L_0x0563
        L_0x02c2:
            r16 = r4
            r3 = r7[r10]
            r4 = r11 & r15
            long r11 = (long) r4
            java.lang.Object r4 = com.google.android.gms.internal.vision.b4.u(r11, r1)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.vision.n3.B(r3, r4, r2, r9)
            goto L_0x0563
        L_0x02d4:
            r16 = r4
            r3 = r7[r10]
            r4 = r11 & r15
            long r11 = (long) r4
            java.lang.Object r4 = com.google.android.gms.internal.vision.b4.u(r11, r1)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.vision.n3.Q(r3, r4, r2, r9)
            goto L_0x0563
        L_0x02e6:
            r16 = r4
            r3 = r7[r10]
            r4 = r11 & r15
            long r11 = (long) r4
            java.lang.Object r4 = com.google.android.gms.internal.vision.b4.u(r11, r1)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.vision.n3.H(r3, r4, r2, r9)
            goto L_0x0563
        L_0x02f8:
            r16 = r4
            r3 = r7[r10]
            r4 = r11 & r15
            long r11 = (long) r4
            java.lang.Object r4 = com.google.android.gms.internal.vision.b4.u(r11, r1)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.vision.n3.S(r3, r4, r2, r9)
            goto L_0x0563
        L_0x030a:
            r16 = r4
            r3 = r7[r10]
            r4 = r11 & r15
            long r11 = (long) r4
            java.lang.Object r4 = com.google.android.gms.internal.vision.b4.u(r11, r1)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.vision.n3.T(r3, r4, r2, r9)
            goto L_0x0563
        L_0x031c:
            r16 = r4
            r3 = r7[r10]
            r4 = r11 & r15
            long r11 = (long) r4
            java.lang.Object r4 = com.google.android.gms.internal.vision.b4.u(r11, r1)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.vision.n3.N(r3, r4, r2, r9)
            goto L_0x0563
        L_0x032e:
            r16 = r4
            r3 = r7[r10]
            r4 = r11 & r15
            long r11 = (long) r4
            java.lang.Object r4 = com.google.android.gms.internal.vision.b4.u(r11, r1)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.vision.n3.p(r3, r4, r2)
            goto L_0x0563
        L_0x0340:
            r16 = r4
            r3 = r7[r10]
            r4 = r11 & r15
            long r11 = (long) r4
            java.lang.Object r4 = com.google.android.gms.internal.vision.b4.u(r11, r1)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.vision.m3 r11 = r0.n(r10)
            com.google.android.gms.internal.vision.n3.h(r3, r4, r2, r11)
            goto L_0x0563
        L_0x0356:
            r16 = r4
            r3 = r7[r10]
            r4 = r11 & r15
            long r11 = (long) r4
            java.lang.Object r4 = com.google.android.gms.internal.vision.b4.u(r11, r1)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.vision.n3.g(r3, r4, r2)
            goto L_0x0563
        L_0x0368:
            r16 = r4
            r3 = r7[r10]
            r4 = r11 & r15
            long r11 = (long) r4
            java.lang.Object r4 = com.google.android.gms.internal.vision.b4.u(r11, r1)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.vision.n3.U(r3, r4, r2, r9)
            goto L_0x0563
        L_0x037a:
            r16 = r4
            r3 = r7[r10]
            r4 = r11 & r15
            long r11 = (long) r4
            java.lang.Object r4 = com.google.android.gms.internal.vision.b4.u(r11, r1)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.vision.n3.R(r3, r4, r2, r9)
            goto L_0x0563
        L_0x038c:
            r16 = r4
            r3 = r7[r10]
            r4 = r11 & r15
            long r11 = (long) r4
            java.lang.Object r4 = com.google.android.gms.internal.vision.b4.u(r11, r1)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.vision.n3.E(r3, r4, r2, r9)
            goto L_0x0563
        L_0x039e:
            r16 = r4
            r3 = r7[r10]
            r4 = r11 & r15
            long r11 = (long) r4
            java.lang.Object r4 = com.google.android.gms.internal.vision.b4.u(r11, r1)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.vision.n3.K(r3, r4, r2, r9)
            goto L_0x0563
        L_0x03b0:
            r16 = r4
            r3 = r7[r10]
            r4 = r11 & r15
            long r11 = (long) r4
            java.lang.Object r4 = com.google.android.gms.internal.vision.b4.u(r11, r1)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.vision.n3.y(r3, r4, r2, r9)
            goto L_0x0563
        L_0x03c2:
            r16 = r4
            r3 = r7[r10]
            r4 = r11 & r15
            long r11 = (long) r4
            java.lang.Object r4 = com.google.android.gms.internal.vision.b4.u(r11, r1)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.vision.n3.v(r3, r4, r2, r9)
            goto L_0x0563
        L_0x03d4:
            r16 = r4
            r3 = r7[r10]
            r4 = r11 & r15
            long r11 = (long) r4
            java.lang.Object r4 = com.google.android.gms.internal.vision.b4.u(r11, r1)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.vision.n3.r(r3, r4, r2, r9)
            goto L_0x0563
        L_0x03e6:
            r16 = r4
            r3 = r7[r10]
            r4 = r11 & r15
            long r11 = (long) r4
            java.lang.Object r4 = com.google.android.gms.internal.vision.b4.u(r11, r1)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.vision.n3.i(r3, r4, r2, r9)
            goto L_0x0563
        L_0x03f8:
            r16 = r4
            boolean r3 = r0.v(r10, r1)
            if (r3 == 0) goto L_0x0563
            r3 = r11 & r15
            long r3 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.vision.b4.u(r3, r1)
            com.google.android.gms.internal.vision.m3 r4 = r0.n(r10)
            r2.k(r12, r4, r3)
            goto L_0x0563
        L_0x0410:
            r16 = r4
            boolean r3 = r0.v(r10, r1)
            if (r3 == 0) goto L_0x0563
            r3 = r11 & r15
            long r3 = (long) r3
            long r3 = com.google.android.gms.internal.vision.b4.l(r3, r1)
            r2.q(r12, r3)
            goto L_0x0563
        L_0x0424:
            r16 = r4
            boolean r3 = r0.v(r10, r1)
            if (r3 == 0) goto L_0x0563
            r3 = r11 & r15
            long r3 = (long) r3
            int r3 = com.google.android.gms.internal.vision.b4.b(r3, r1)
            r2.r(r12, r3)
            goto L_0x0563
        L_0x0438:
            r16 = r4
            boolean r3 = r0.v(r10, r1)
            if (r3 == 0) goto L_0x0563
            r3 = r11 & r15
            long r3 = (long) r3
            long r3 = com.google.android.gms.internal.vision.b4.l(r3, r1)
            r2.j(r12, r3)
            goto L_0x0563
        L_0x044c:
            r16 = r4
            boolean r3 = r0.v(r10, r1)
            if (r3 == 0) goto L_0x0563
            r3 = r11 & r15
            long r3 = (long) r3
            int r3 = com.google.android.gms.internal.vision.b4.b(r3, r1)
            r2.c(r12, r3)
            goto L_0x0563
        L_0x0460:
            r16 = r4
            boolean r3 = r0.v(r10, r1)
            if (r3 == 0) goto L_0x0563
            r3 = r11 & r15
            long r3 = (long) r3
            int r3 = com.google.android.gms.internal.vision.b4.b(r3, r1)
            r2.i(r12, r3)
            goto L_0x0563
        L_0x0474:
            r16 = r4
            boolean r3 = r0.v(r10, r1)
            if (r3 == 0) goto L_0x0563
            r3 = r11 & r15
            long r3 = (long) r3
            int r3 = com.google.android.gms.internal.vision.b4.b(r3, r1)
            r2.p(r12, r3)
            goto L_0x0563
        L_0x0488:
            r16 = r4
            boolean r3 = r0.v(r10, r1)
            if (r3 == 0) goto L_0x0563
            r3 = r11 & r15
            long r3 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.vision.b4.u(r3, r1)
            com.google.android.gms.internal.vision.w0 r3 = (com.google.android.gms.internal.vision.w0) r3
            r2.e(r12, r3)
            goto L_0x0563
        L_0x049e:
            r16 = r4
            boolean r3 = r0.v(r10, r1)
            if (r3 == 0) goto L_0x0563
            r3 = r11 & r15
            long r3 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.vision.b4.u(r3, r1)
            com.google.android.gms.internal.vision.m3 r4 = r0.n(r10)
            r2.f(r12, r4, r3)
            goto L_0x0563
        L_0x04b6:
            r16 = r4
            boolean r3 = r0.v(r10, r1)
            if (r3 == 0) goto L_0x0563
            r3 = r11 & r15
            long r3 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.vision.b4.u(r3, r1)
            q(r12, r3, r2)
            goto L_0x0563
        L_0x04ca:
            r16 = r4
            boolean r3 = r0.v(r10, r1)
            if (r3 == 0) goto L_0x0563
            r3 = r11 & r15
            long r3 = (long) r3
            boolean r3 = com.google.android.gms.internal.vision.b4.p(r3, r1)
            r2.h(r12, r3)
            goto L_0x0563
        L_0x04de:
            r16 = r4
            boolean r3 = r0.v(r10, r1)
            if (r3 == 0) goto L_0x0563
            r3 = r11 & r15
            long r3 = (long) r3
            int r3 = com.google.android.gms.internal.vision.b4.b(r3, r1)
            r2.n(r12, r3)
            goto L_0x0563
        L_0x04f2:
            r16 = r4
            boolean r3 = r0.v(r10, r1)
            if (r3 == 0) goto L_0x0563
            r3 = r11 & r15
            long r3 = (long) r3
            long r3 = com.google.android.gms.internal.vision.b4.l(r3, r1)
            r2.o(r12, r3)
            goto L_0x0563
        L_0x0505:
            r16 = r4
            boolean r3 = r0.v(r10, r1)
            if (r3 == 0) goto L_0x0563
            r3 = r11 & r15
            long r3 = (long) r3
            int r3 = com.google.android.gms.internal.vision.b4.b(r3, r1)
            r2.l(r12, r3)
            goto L_0x0563
        L_0x0518:
            r16 = r4
            boolean r3 = r0.v(r10, r1)
            if (r3 == 0) goto L_0x0563
            r3 = r11 & r15
            long r3 = (long) r3
            long r3 = com.google.android.gms.internal.vision.b4.l(r3, r1)
            r2.m(r12, r3)
            goto L_0x0563
        L_0x052b:
            r16 = r4
            boolean r3 = r0.v(r10, r1)
            if (r3 == 0) goto L_0x0563
            r3 = r11 & r15
            long r3 = (long) r3
            long r3 = com.google.android.gms.internal.vision.b4.l(r3, r1)
            r2.d(r12, r3)
            goto L_0x0563
        L_0x053e:
            r16 = r4
            boolean r3 = r0.v(r10, r1)
            if (r3 == 0) goto L_0x0563
            r3 = r11 & r15
            long r3 = (long) r3
            float r3 = com.google.android.gms.internal.vision.b4.q(r3, r1)
            r2.b(r12, r3)
            goto L_0x0563
        L_0x0551:
            r16 = r4
            boolean r3 = r0.v(r10, r1)
            if (r3 == 0) goto L_0x0563
            r3 = r11 & r15
            long r3 = (long) r3
            double r3 = com.google.android.gms.internal.vision.b4.t(r3, r1)
            r2.a(r3, r12)
        L_0x0563:
            int r10 = r10 + 3
            r4 = r16
            goto L_0x0031
        L_0x0569:
            r16 = r4
        L_0x056b:
            if (r6 == 0) goto L_0x0580
            r5.e(r6)
            boolean r3 = r16.hasNext()
            if (r3 == 0) goto L_0x057e
            java.lang.Object r3 = r16.next()
            r6 = r3
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            goto L_0x056b
        L_0x057e:
            r6 = 0
            goto L_0x056b
        L_0x0580:
            com.google.android.gms.internal.vision.w3<?, ?> r3 = r0.f3052m
            com.google.android.gms.internal.vision.y3 r1 = r3.e(r1)
            r3.c(r1, r2)
            return
        L_0x058a:
            r17.B(r18, r19)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.a3.i(java.lang.Object, com.google.android.gms.internal.vision.b1):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x009f, code lost:
        r3 = r11.f3166c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00bb, code lost:
        if (r3 == null) goto L_0x009f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00be, code lost:
        r3 = com.google.android.gms.internal.vision.u1.c(r3, r11.f3166c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0128, code lost:
        r3 = java.lang.Integer.valueOf(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0135, code lost:
        r3 = java.lang.Long.valueOf(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0139, code lost:
        r14.putObject(r1, r9, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0148, code lost:
        r14.putObject(r1, r9, r2);
        r2 = r4 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0158, code lost:
        r14.putObject(r1, r9, r2);
        r2 = r4 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x015d, code lost:
        r14.putInt(r1, r12, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:?, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:?, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x004c, code lost:
        if (r3 == null) goto L_0x009f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int j(T r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, int r25, long r26, int r28, com.google.android.gms.internal.vision.t0 r29) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = r18
            r4 = r19
            r2 = r21
            r8 = r22
            r5 = r23
            r9 = r26
            r6 = r28
            r11 = r29
            int r7 = r6 + 2
            int[] r12 = r0.f3042a
            r7 = r12[r7]
            r12 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r7 & r12
            long r12 = (long) r7
            r7 = 1
            r15 = 2
            sun.misc.Unsafe r14 = f3041q
            switch(r25) {
                case 51: goto L_0x014e;
                case 52: goto L_0x013d;
                case 53: goto L_0x012d;
                case 54: goto L_0x012d;
                case 55: goto L_0x0120;
                case 56: goto L_0x0115;
                case 57: goto L_0x0109;
                case 58: goto L_0x00f4;
                case 59: goto L_0x00c6;
                case 60: goto L_0x00a3;
                case 61: goto L_0x0099;
                case 62: goto L_0x0120;
                case 63: goto L_0x006b;
                case 64: goto L_0x0109;
                case 65: goto L_0x0115;
                case 66: goto L_0x005d;
                case 67: goto L_0x004f;
                case 68: goto L_0x0028;
                default: goto L_0x0026;
            }
        L_0x0026:
            goto L_0x0161
        L_0x0028:
            r7 = 3
            if (r5 != r7) goto L_0x0161
            r2 = r2 & -8
            r7 = r2 | 4
            com.google.android.gms.internal.vision.m3 r2 = r0.n(r6)
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r7
            r7 = r29
            int r2 = com.google.android.gms.internal.vision.s0.g(r2, r3, r4, r5, r6, r7)
            int r3 = r14.getInt(r1, r12)
            if (r3 != r8) goto L_0x004b
            java.lang.Object r3 = r14.getObject(r1, r9)
            goto L_0x004c
        L_0x004b:
            r3 = 0
        L_0x004c:
            if (r3 != 0) goto L_0x00be
            goto L_0x009f
        L_0x004f:
            if (r5 != 0) goto L_0x0161
            int r2 = com.google.android.gms.internal.vision.s0.k(r3, r4, r11)
            long r3 = r11.f3165b
            long r3 = s6.a.c0(r3)
            goto L_0x0135
        L_0x005d:
            if (r5 != 0) goto L_0x0161
            int r2 = com.google.android.gms.internal.vision.s0.i(r3, r4, r11)
            int r3 = r11.f3164a
            int r3 = s6.a.s0(r3)
            goto L_0x0128
        L_0x006b:
            if (r5 != 0) goto L_0x0161
            int r3 = com.google.android.gms.internal.vision.s0.i(r3, r4, r11)
            int r4 = r11.f3164a
            com.google.android.gms.internal.vision.v1 r5 = r0.C(r6)
            if (r5 == 0) goto L_0x008f
            boolean r5 = r5.d(r4)
            if (r5 == 0) goto L_0x0080
            goto L_0x008f
        L_0x0080:
            com.google.android.gms.internal.vision.y3 r1 = H(r17)
            long r4 = (long) r4
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r1.a(r2, r4)
            r2 = r3
            goto L_0x0162
        L_0x008f:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r14.putObject(r1, r9, r2)
            r2 = r3
            goto L_0x015d
        L_0x0099:
            if (r5 != r15) goto L_0x0161
            int r2 = com.google.android.gms.internal.vision.s0.q(r3, r4, r11)
        L_0x009f:
            java.lang.Object r3 = r11.f3166c
            goto L_0x0139
        L_0x00a3:
            if (r5 != r15) goto L_0x0161
            com.google.android.gms.internal.vision.m3 r2 = r0.n(r6)
            r5 = r20
            int r2 = com.google.android.gms.internal.vision.s0.h(r2, r3, r4, r5, r11)
            int r3 = r14.getInt(r1, r12)
            if (r3 != r8) goto L_0x00ba
            java.lang.Object r3 = r14.getObject(r1, r9)
            goto L_0x00bb
        L_0x00ba:
            r3 = 0
        L_0x00bb:
            if (r3 != 0) goto L_0x00be
            goto L_0x009f
        L_0x00be:
            java.lang.Object r4 = r11.f3166c
            com.google.android.gms.internal.vision.q1 r3 = com.google.android.gms.internal.vision.u1.c(r3, r4)
            goto L_0x0139
        L_0x00c6:
            if (r5 != r15) goto L_0x0161
            int r2 = com.google.android.gms.internal.vision.s0.i(r3, r4, r11)
            int r4 = r11.f3164a
            if (r4 != 0) goto L_0x00d3
            java.lang.String r3 = ""
            goto L_0x0139
        L_0x00d3:
            r5 = 536870912(0x20000000, float:1.0842022E-19)
            r5 = r24 & r5
            if (r5 == 0) goto L_0x00e7
            int r5 = r2 + r4
            boolean r5 = com.google.android.gms.internal.vision.e4.b(r3, r2, r5)
            if (r5 == 0) goto L_0x00e2
            goto L_0x00e7
        L_0x00e2:
            com.google.android.gms.internal.vision.z1 r1 = com.google.android.gms.internal.vision.z1.d()
            throw r1
        L_0x00e7:
            java.lang.String r5 = new java.lang.String
            java.nio.charset.Charset r6 = com.google.android.gms.internal.vision.u1.f3170a
            r5.<init>(r3, r2, r4, r6)
            r14.putObject(r1, r9, r5)
            int r2 = r2 + r4
            goto L_0x015d
        L_0x00f4:
            if (r5 != 0) goto L_0x0161
            int r2 = com.google.android.gms.internal.vision.s0.k(r3, r4, r11)
            long r3 = r11.f3165b
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L_0x0103
            goto L_0x0104
        L_0x0103:
            r7 = 0
        L_0x0104:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r7)
            goto L_0x0139
        L_0x0109:
            r2 = 5
            if (r5 != r2) goto L_0x0161
            int r2 = com.google.android.gms.internal.vision.s0.a(r4, r3)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x0148
        L_0x0115:
            if (r5 != r7) goto L_0x0161
            long r2 = com.google.android.gms.internal.vision.s0.l(r4, r3)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            goto L_0x0158
        L_0x0120:
            if (r5 != 0) goto L_0x0161
            int r2 = com.google.android.gms.internal.vision.s0.i(r3, r4, r11)
            int r3 = r11.f3164a
        L_0x0128:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x0139
        L_0x012d:
            if (r5 != 0) goto L_0x0161
            int r2 = com.google.android.gms.internal.vision.s0.k(r3, r4, r11)
            long r3 = r11.f3165b
        L_0x0135:
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
        L_0x0139:
            r14.putObject(r1, r9, r3)
            goto L_0x015d
        L_0x013d:
            r2 = 5
            if (r5 != r2) goto L_0x0161
            float r2 = com.google.android.gms.internal.vision.s0.o(r4, r3)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
        L_0x0148:
            r14.putObject(r1, r9, r2)
            int r2 = r4 + 4
            goto L_0x015d
        L_0x014e:
            if (r5 != r7) goto L_0x0161
            double r2 = com.google.android.gms.internal.vision.s0.m(r4, r3)
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
        L_0x0158:
            r14.putObject(r1, r9, r2)
            int r2 = r4 + 8
        L_0x015d:
            r14.putInt(r1, r12, r8)
            goto L_0x0162
        L_0x0161:
            r2 = r4
        L_0x0162:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.a3.j(java.lang.Object, byte[], int, int, int, int, int, int, int, long, int, com.google.android.gms.internal.vision.t0):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0270, code lost:
        if (r7.f3165b != 0) goto L_0x028b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0273, code lost:
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0274, code lost:
        r12.h(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0277, code lost:
        if (r4 >= r5) goto L_0x03bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0279, code lost:
        r6 = com.google.android.gms.internal.vision.s0.i(r3, r4, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x027f, code lost:
        if (r2 != r7.f3164a) goto L_0x03bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0281, code lost:
        r4 = com.google.android.gms.internal.vision.s0.k(r3, r6, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0289, code lost:
        if (r7.f3165b == 0) goto L_0x0273;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x028b, code lost:
        r6 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:?, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:?, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:?, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:?, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x013e, code lost:
        if (r4 == 0) goto L_0x0161;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0141, code lost:
        r12.add(com.google.android.gms.internal.vision.w0.k(r3, r1, r4));
        r1 = r1 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0149, code lost:
        if (r1 >= r5) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x014b, code lost:
        r4 = com.google.android.gms.internal.vision.s0.i(r3, r1, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0151, code lost:
        if (r2 != r7.f3164a) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0153, code lost:
        r1 = com.google.android.gms.internal.vision.s0.i(r3, r4, r7);
        r4 = r7.f3164a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0159, code lost:
        if (r4 < 0) goto L_0x016c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x015d, code lost:
        if (r4 > (r3.length - r1)) goto L_0x0167;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x015f, code lost:
        if (r4 != 0) goto L_0x0141;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0161, code lost:
        r12.add(com.google.android.gms.internal.vision.w0.f3182p);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x016b, code lost:
        throw com.google.android.gms.internal.vision.z1.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0170, code lost:
        throw com.google.android.gms.internal.vision.z1.b();
     */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0202  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01ba  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int k(T r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, long r25, int r27, long r28, com.google.android.gms.internal.vision.t0 r30) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = r18
            r4 = r19
            r5 = r20
            r2 = r21
            r6 = r23
            r8 = r24
            r9 = r28
            r7 = r30
            sun.misc.Unsafe r11 = f3041q
            java.lang.Object r12 = r11.getObject(r1, r9)
            com.google.android.gms.internal.vision.a2 r12 = (com.google.android.gms.internal.vision.a2) r12
            boolean r13 = r12.zza()
            r14 = 1
            if (r13 != 0) goto L_0x0034
            int r13 = r12.size()
            if (r13 != 0) goto L_0x002c
            r13 = 10
            goto L_0x002d
        L_0x002c:
            int r13 = r13 << r14
        L_0x002d:
            com.google.android.gms.internal.vision.a2 r12 = r12.d(r13)
            r11.putObject(r1, r9, r12)
        L_0x0034:
            r9 = 0
            r11 = 5
            r13 = 2
            switch(r27) {
                case 18: goto L_0x0387;
                case 19: goto L_0x0350;
                case 20: goto L_0x0318;
                case 21: goto L_0x0318;
                case 22: goto L_0x02fe;
                case 23: goto L_0x02c5;
                case 24: goto L_0x028d;
                case 25: goto L_0x023c;
                case 26: goto L_0x0195;
                case 27: goto L_0x017b;
                case 28: goto L_0x0130;
                case 29: goto L_0x02fe;
                case 30: goto L_0x00f8;
                case 31: goto L_0x028d;
                case 32: goto L_0x02c5;
                case 33: goto L_0x00b8;
                case 34: goto L_0x0078;
                case 35: goto L_0x0387;
                case 36: goto L_0x0350;
                case 37: goto L_0x0318;
                case 38: goto L_0x0318;
                case 39: goto L_0x02fe;
                case 40: goto L_0x02c5;
                case 41: goto L_0x028d;
                case 42: goto L_0x023c;
                case 43: goto L_0x02fe;
                case 44: goto L_0x00f8;
                case 45: goto L_0x028d;
                case 46: goto L_0x02c5;
                case 47: goto L_0x00b8;
                case 48: goto L_0x0078;
                case 49: goto L_0x003d;
                default: goto L_0x003b;
            }
        L_0x003b:
            goto L_0x03bf
        L_0x003d:
            r1 = 3
            if (r6 != r1) goto L_0x03bf
            com.google.android.gms.internal.vision.m3 r1 = r0.n(r8)
            r6 = r2 & -8
            r6 = r6 | 4
            r22 = r1
            r23 = r18
            r24 = r19
            r25 = r20
            r26 = r6
            r27 = r30
            int r4 = com.google.android.gms.internal.vision.s0.g(r22, r23, r24, r25, r26, r27)
        L_0x0058:
            java.lang.Object r8 = r7.f3166c
            r12.add(r8)
            if (r4 >= r5) goto L_0x03bf
            int r8 = com.google.android.gms.internal.vision.s0.i(r3, r4, r7)
            int r9 = r7.f3164a
            if (r2 != r9) goto L_0x03bf
            r22 = r1
            r23 = r18
            r24 = r8
            r25 = r20
            r26 = r6
            r27 = r30
            int r4 = com.google.android.gms.internal.vision.s0.g(r22, r23, r24, r25, r26, r27)
            goto L_0x0058
        L_0x0078:
            if (r6 != r13) goto L_0x009c
            com.google.android.gms.internal.vision.l2 r12 = (com.google.android.gms.internal.vision.l2) r12
            int r1 = com.google.android.gms.internal.vision.s0.i(r3, r4, r7)
            int r2 = r7.f3164a
            int r2 = r2 + r1
        L_0x0083:
            if (r1 >= r2) goto L_0x0093
            int r1 = com.google.android.gms.internal.vision.s0.k(r3, r1, r7)
            long r4 = r7.f3165b
            long r4 = s6.a.c0(r4)
            r12.h(r4)
            goto L_0x0083
        L_0x0093:
            if (r1 != r2) goto L_0x0097
            goto L_0x03c0
        L_0x0097:
            com.google.android.gms.internal.vision.z1 r1 = com.google.android.gms.internal.vision.z1.a()
            throw r1
        L_0x009c:
            if (r6 != 0) goto L_0x03bf
            com.google.android.gms.internal.vision.l2 r12 = (com.google.android.gms.internal.vision.l2) r12
        L_0x00a0:
            int r1 = com.google.android.gms.internal.vision.s0.k(r3, r4, r7)
            long r8 = r7.f3165b
            long r8 = s6.a.c0(r8)
            r12.h(r8)
            if (r1 >= r5) goto L_0x03c0
            int r4 = com.google.android.gms.internal.vision.s0.i(r3, r1, r7)
            int r6 = r7.f3164a
            if (r2 != r6) goto L_0x03c0
            goto L_0x00a0
        L_0x00b8:
            if (r6 != r13) goto L_0x00dc
            com.google.android.gms.internal.vision.s1 r12 = (com.google.android.gms.internal.vision.s1) r12
            int r1 = com.google.android.gms.internal.vision.s0.i(r3, r4, r7)
            int r2 = r7.f3164a
            int r2 = r2 + r1
        L_0x00c3:
            if (r1 >= r2) goto L_0x00d3
            int r1 = com.google.android.gms.internal.vision.s0.i(r3, r1, r7)
            int r4 = r7.f3164a
            int r4 = s6.a.s0(r4)
            r12.h(r4)
            goto L_0x00c3
        L_0x00d3:
            if (r1 != r2) goto L_0x00d7
            goto L_0x03c0
        L_0x00d7:
            com.google.android.gms.internal.vision.z1 r1 = com.google.android.gms.internal.vision.z1.a()
            throw r1
        L_0x00dc:
            if (r6 != 0) goto L_0x03bf
            com.google.android.gms.internal.vision.s1 r12 = (com.google.android.gms.internal.vision.s1) r12
        L_0x00e0:
            int r1 = com.google.android.gms.internal.vision.s0.i(r3, r4, r7)
            int r4 = r7.f3164a
            int r4 = s6.a.s0(r4)
            r12.h(r4)
            if (r1 >= r5) goto L_0x03c0
            int r4 = com.google.android.gms.internal.vision.s0.i(r3, r1, r7)
            int r6 = r7.f3164a
            if (r2 != r6) goto L_0x03c0
            goto L_0x00e0
        L_0x00f8:
            if (r6 != r13) goto L_0x00ff
            int r2 = com.google.android.gms.internal.vision.s0.j(r3, r4, r12, r7)
            goto L_0x0110
        L_0x00ff:
            if (r6 != 0) goto L_0x03bf
            r2 = r21
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r12
            r7 = r30
            int r2 = com.google.android.gms.internal.vision.s0.c(r2, r3, r4, r5, r6, r7)
        L_0x0110:
            com.google.android.gms.internal.vision.q1 r1 = (com.google.android.gms.internal.vision.q1) r1
            com.google.android.gms.internal.vision.y3 r3 = r1.zzb
            com.google.android.gms.internal.vision.y3 r4 = com.google.android.gms.internal.vision.y3.f3189f
            if (r3 != r4) goto L_0x0119
            r3 = 0
        L_0x0119:
            com.google.android.gms.internal.vision.v1 r4 = r0.C(r8)
            com.google.android.gms.internal.vision.w3<?, ?> r5 = r0.f3052m
            com.google.android.gms.internal.vision.a2 r12 = (com.google.android.gms.internal.vision.a2) r12
            r6 = r22
            java.lang.Object r3 = com.google.android.gms.internal.vision.n3.f(r6, r12, r4, r3, r5)
            com.google.android.gms.internal.vision.y3 r3 = (com.google.android.gms.internal.vision.y3) r3
            if (r3 == 0) goto L_0x012d
            r1.zzb = r3
        L_0x012d:
            r1 = r2
            goto L_0x03c0
        L_0x0130:
            if (r6 != r13) goto L_0x03bf
            int r1 = com.google.android.gms.internal.vision.s0.i(r3, r4, r7)
            int r4 = r7.f3164a
            if (r4 < 0) goto L_0x0176
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x0171
            if (r4 != 0) goto L_0x0141
            goto L_0x0161
        L_0x0141:
            com.google.android.gms.internal.vision.z0 r6 = com.google.android.gms.internal.vision.w0.k(r3, r1, r4)
            r12.add(r6)
            int r1 = r1 + r4
        L_0x0149:
            if (r1 >= r5) goto L_0x03c0
            int r4 = com.google.android.gms.internal.vision.s0.i(r3, r1, r7)
            int r6 = r7.f3164a
            if (r2 != r6) goto L_0x03c0
            int r1 = com.google.android.gms.internal.vision.s0.i(r3, r4, r7)
            int r4 = r7.f3164a
            if (r4 < 0) goto L_0x016c
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x0167
            if (r4 != 0) goto L_0x0141
        L_0x0161:
            com.google.android.gms.internal.vision.z0 r4 = com.google.android.gms.internal.vision.w0.f3182p
            r12.add(r4)
            goto L_0x0149
        L_0x0167:
            com.google.android.gms.internal.vision.z1 r1 = com.google.android.gms.internal.vision.z1.a()
            throw r1
        L_0x016c:
            com.google.android.gms.internal.vision.z1 r1 = com.google.android.gms.internal.vision.z1.b()
            throw r1
        L_0x0171:
            com.google.android.gms.internal.vision.z1 r1 = com.google.android.gms.internal.vision.z1.a()
            throw r1
        L_0x0176:
            com.google.android.gms.internal.vision.z1 r1 = com.google.android.gms.internal.vision.z1.b()
            throw r1
        L_0x017b:
            if (r6 != r13) goto L_0x03bf
            com.google.android.gms.internal.vision.m3 r1 = r0.n(r8)
            r22 = r1
            r23 = r21
            r24 = r18
            r25 = r19
            r26 = r20
            r27 = r12
            r28 = r30
            int r1 = com.google.android.gms.internal.vision.s0.f(r22, r23, r24, r25, r26, r27, r28)
            goto L_0x03c0
        L_0x0195:
            if (r6 != r13) goto L_0x03bf
            r13 = 536870912(0x20000000, double:2.652494739E-315)
            long r13 = r25 & r13
            int r1 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            java.lang.String r6 = ""
            if (r1 != 0) goto L_0x01e2
            int r1 = com.google.android.gms.internal.vision.s0.i(r3, r4, r7)
            int r4 = r7.f3164a
            if (r4 < 0) goto L_0x01dd
            if (r4 != 0) goto L_0x01ad
            goto L_0x01cc
        L_0x01ad:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = com.google.android.gms.internal.vision.u1.f3170a
            r8.<init>(r3, r1, r4, r9)
        L_0x01b4:
            r12.add(r8)
            int r1 = r1 + r4
        L_0x01b8:
            if (r1 >= r5) goto L_0x03c0
            int r4 = com.google.android.gms.internal.vision.s0.i(r3, r1, r7)
            int r8 = r7.f3164a
            if (r2 != r8) goto L_0x03c0
            int r1 = com.google.android.gms.internal.vision.s0.i(r3, r4, r7)
            int r4 = r7.f3164a
            if (r4 < 0) goto L_0x01d8
            if (r4 != 0) goto L_0x01d0
        L_0x01cc:
            r12.add(r6)
            goto L_0x01b8
        L_0x01d0:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = com.google.android.gms.internal.vision.u1.f3170a
            r8.<init>(r3, r1, r4, r9)
            goto L_0x01b4
        L_0x01d8:
            com.google.android.gms.internal.vision.z1 r1 = com.google.android.gms.internal.vision.z1.b()
            throw r1
        L_0x01dd:
            com.google.android.gms.internal.vision.z1 r1 = com.google.android.gms.internal.vision.z1.b()
            throw r1
        L_0x01e2:
            int r1 = com.google.android.gms.internal.vision.s0.i(r3, r4, r7)
            int r4 = r7.f3164a
            if (r4 < 0) goto L_0x0237
            if (r4 != 0) goto L_0x01ed
            goto L_0x0214
        L_0x01ed:
            int r8 = r1 + r4
            boolean r9 = com.google.android.gms.internal.vision.e4.b(r3, r1, r8)
            if (r9 == 0) goto L_0x0232
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = com.google.android.gms.internal.vision.u1.f3170a
            r9.<init>(r3, r1, r4, r10)
        L_0x01fc:
            r12.add(r9)
            r1 = r8
        L_0x0200:
            if (r1 >= r5) goto L_0x03c0
            int r4 = com.google.android.gms.internal.vision.s0.i(r3, r1, r7)
            int r8 = r7.f3164a
            if (r2 != r8) goto L_0x03c0
            int r1 = com.google.android.gms.internal.vision.s0.i(r3, r4, r7)
            int r4 = r7.f3164a
            if (r4 < 0) goto L_0x022d
            if (r4 != 0) goto L_0x0218
        L_0x0214:
            r12.add(r6)
            goto L_0x0200
        L_0x0218:
            int r8 = r1 + r4
            boolean r9 = com.google.android.gms.internal.vision.e4.b(r3, r1, r8)
            if (r9 == 0) goto L_0x0228
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = com.google.android.gms.internal.vision.u1.f3170a
            r9.<init>(r3, r1, r4, r10)
            goto L_0x01fc
        L_0x0228:
            com.google.android.gms.internal.vision.z1 r1 = com.google.android.gms.internal.vision.z1.d()
            throw r1
        L_0x022d:
            com.google.android.gms.internal.vision.z1 r1 = com.google.android.gms.internal.vision.z1.b()
            throw r1
        L_0x0232:
            com.google.android.gms.internal.vision.z1 r1 = com.google.android.gms.internal.vision.z1.d()
            throw r1
        L_0x0237:
            com.google.android.gms.internal.vision.z1 r1 = com.google.android.gms.internal.vision.z1.b()
            throw r1
        L_0x023c:
            r1 = 0
            if (r6 != r13) goto L_0x0264
            com.google.android.gms.internal.vision.u0 r12 = (com.google.android.gms.internal.vision.u0) r12
            int r2 = com.google.android.gms.internal.vision.s0.i(r3, r4, r7)
            int r4 = r7.f3164a
            int r4 = r4 + r2
        L_0x0248:
            if (r2 >= r4) goto L_0x025b
            int r2 = com.google.android.gms.internal.vision.s0.k(r3, r2, r7)
            long r5 = r7.f3165b
            int r5 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r5 == 0) goto L_0x0256
            r5 = r14
            goto L_0x0257
        L_0x0256:
            r5 = r1
        L_0x0257:
            r12.h(r5)
            goto L_0x0248
        L_0x025b:
            if (r2 != r4) goto L_0x025f
            goto L_0x012d
        L_0x025f:
            com.google.android.gms.internal.vision.z1 r1 = com.google.android.gms.internal.vision.z1.a()
            throw r1
        L_0x0264:
            if (r6 != 0) goto L_0x03bf
            com.google.android.gms.internal.vision.u0 r12 = (com.google.android.gms.internal.vision.u0) r12
            int r4 = com.google.android.gms.internal.vision.s0.k(r3, r4, r7)
            long r14 = r7.f3165b
            int r6 = (r14 > r9 ? 1 : (r14 == r9 ? 0 : -1))
            if (r6 == 0) goto L_0x0273
            goto L_0x028b
        L_0x0273:
            r6 = r1
        L_0x0274:
            r12.h(r6)
            if (r4 >= r5) goto L_0x03bf
            int r6 = com.google.android.gms.internal.vision.s0.i(r3, r4, r7)
            int r11 = r7.f3164a
            if (r2 != r11) goto L_0x03bf
            int r4 = com.google.android.gms.internal.vision.s0.k(r3, r6, r7)
            long r13 = r7.f3165b
            int r6 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r6 == 0) goto L_0x0273
        L_0x028b:
            r6 = 1
            goto L_0x0274
        L_0x028d:
            if (r6 != r13) goto L_0x02ad
            com.google.android.gms.internal.vision.s1 r12 = (com.google.android.gms.internal.vision.s1) r12
            int r1 = com.google.android.gms.internal.vision.s0.i(r3, r4, r7)
            int r2 = r7.f3164a
            int r2 = r2 + r1
        L_0x0298:
            if (r1 >= r2) goto L_0x02a4
            int r4 = com.google.android.gms.internal.vision.s0.a(r1, r3)
            r12.h(r4)
            int r1 = r1 + 4
            goto L_0x0298
        L_0x02a4:
            if (r1 != r2) goto L_0x02a8
            goto L_0x03c0
        L_0x02a8:
            com.google.android.gms.internal.vision.z1 r1 = com.google.android.gms.internal.vision.z1.a()
            throw r1
        L_0x02ad:
            if (r6 != r11) goto L_0x03bf
            com.google.android.gms.internal.vision.s1 r12 = (com.google.android.gms.internal.vision.s1) r12
        L_0x02b1:
            int r1 = com.google.android.gms.internal.vision.s0.a(r4, r3)
            r12.h(r1)
            int r1 = r4 + 4
            if (r1 >= r5) goto L_0x03c0
            int r4 = com.google.android.gms.internal.vision.s0.i(r3, r1, r7)
            int r6 = r7.f3164a
            if (r2 != r6) goto L_0x03c0
            goto L_0x02b1
        L_0x02c5:
            if (r6 != r13) goto L_0x02e5
            com.google.android.gms.internal.vision.l2 r12 = (com.google.android.gms.internal.vision.l2) r12
            int r1 = com.google.android.gms.internal.vision.s0.i(r3, r4, r7)
            int r2 = r7.f3164a
            int r2 = r2 + r1
        L_0x02d0:
            if (r1 >= r2) goto L_0x02dc
            long r4 = com.google.android.gms.internal.vision.s0.l(r1, r3)
            r12.h(r4)
            int r1 = r1 + 8
            goto L_0x02d0
        L_0x02dc:
            if (r1 != r2) goto L_0x02e0
            goto L_0x03c0
        L_0x02e0:
            com.google.android.gms.internal.vision.z1 r1 = com.google.android.gms.internal.vision.z1.a()
            throw r1
        L_0x02e5:
            r1 = 1
            if (r6 != r1) goto L_0x03bf
            com.google.android.gms.internal.vision.l2 r12 = (com.google.android.gms.internal.vision.l2) r12
        L_0x02ea:
            long r8 = com.google.android.gms.internal.vision.s0.l(r4, r3)
            r12.h(r8)
            int r1 = r4 + 8
            if (r1 >= r5) goto L_0x03c0
            int r4 = com.google.android.gms.internal.vision.s0.i(r3, r1, r7)
            int r6 = r7.f3164a
            if (r2 != r6) goto L_0x03c0
            goto L_0x02ea
        L_0x02fe:
            if (r6 != r13) goto L_0x0306
            int r1 = com.google.android.gms.internal.vision.s0.j(r3, r4, r12, r7)
            goto L_0x03c0
        L_0x0306:
            if (r6 != 0) goto L_0x03bf
            r22 = r18
            r23 = r19
            r24 = r20
            r25 = r12
            r26 = r30
            int r1 = com.google.android.gms.internal.vision.s0.c(r21, r22, r23, r24, r25, r26)
            goto L_0x03c0
        L_0x0318:
            if (r6 != r13) goto L_0x0338
            com.google.android.gms.internal.vision.l2 r12 = (com.google.android.gms.internal.vision.l2) r12
            int r1 = com.google.android.gms.internal.vision.s0.i(r3, r4, r7)
            int r2 = r7.f3164a
            int r2 = r2 + r1
        L_0x0323:
            if (r1 >= r2) goto L_0x032f
            int r1 = com.google.android.gms.internal.vision.s0.k(r3, r1, r7)
            long r4 = r7.f3165b
            r12.h(r4)
            goto L_0x0323
        L_0x032f:
            if (r1 != r2) goto L_0x0333
            goto L_0x03c0
        L_0x0333:
            com.google.android.gms.internal.vision.z1 r1 = com.google.android.gms.internal.vision.z1.a()
            throw r1
        L_0x0338:
            if (r6 != 0) goto L_0x03bf
            com.google.android.gms.internal.vision.l2 r12 = (com.google.android.gms.internal.vision.l2) r12
        L_0x033c:
            int r1 = com.google.android.gms.internal.vision.s0.k(r3, r4, r7)
            long r8 = r7.f3165b
            r12.h(r8)
            if (r1 >= r5) goto L_0x03c0
            int r4 = com.google.android.gms.internal.vision.s0.i(r3, r1, r7)
            int r6 = r7.f3164a
            if (r2 != r6) goto L_0x03c0
            goto L_0x033c
        L_0x0350:
            if (r6 != r13) goto L_0x036f
            com.google.android.gms.internal.vision.p1 r12 = (com.google.android.gms.internal.vision.p1) r12
            int r1 = com.google.android.gms.internal.vision.s0.i(r3, r4, r7)
            int r2 = r7.f3164a
            int r2 = r2 + r1
        L_0x035b:
            if (r1 >= r2) goto L_0x0367
            float r4 = com.google.android.gms.internal.vision.s0.o(r1, r3)
            r12.h(r4)
            int r1 = r1 + 4
            goto L_0x035b
        L_0x0367:
            if (r1 != r2) goto L_0x036a
            goto L_0x03c0
        L_0x036a:
            com.google.android.gms.internal.vision.z1 r1 = com.google.android.gms.internal.vision.z1.a()
            throw r1
        L_0x036f:
            if (r6 != r11) goto L_0x03bf
            com.google.android.gms.internal.vision.p1 r12 = (com.google.android.gms.internal.vision.p1) r12
        L_0x0373:
            float r1 = com.google.android.gms.internal.vision.s0.o(r4, r3)
            r12.h(r1)
            int r1 = r4 + 4
            if (r1 >= r5) goto L_0x03c0
            int r4 = com.google.android.gms.internal.vision.s0.i(r3, r1, r7)
            int r6 = r7.f3164a
            if (r2 != r6) goto L_0x03c0
            goto L_0x0373
        L_0x0387:
            if (r6 != r13) goto L_0x03a6
            com.google.android.gms.internal.vision.c1 r12 = (com.google.android.gms.internal.vision.c1) r12
            int r1 = com.google.android.gms.internal.vision.s0.i(r3, r4, r7)
            int r2 = r7.f3164a
            int r2 = r2 + r1
        L_0x0392:
            if (r1 >= r2) goto L_0x039e
            double r4 = com.google.android.gms.internal.vision.s0.m(r1, r3)
            r12.h(r4)
            int r1 = r1 + 8
            goto L_0x0392
        L_0x039e:
            if (r1 != r2) goto L_0x03a1
            goto L_0x03c0
        L_0x03a1:
            com.google.android.gms.internal.vision.z1 r1 = com.google.android.gms.internal.vision.z1.a()
            throw r1
        L_0x03a6:
            r1 = 1
            if (r6 != r1) goto L_0x03bf
            com.google.android.gms.internal.vision.c1 r12 = (com.google.android.gms.internal.vision.c1) r12
        L_0x03ab:
            double r8 = com.google.android.gms.internal.vision.s0.m(r4, r3)
            r12.h(r8)
            int r1 = r4 + 8
            if (r1 >= r5) goto L_0x03c0
            int r4 = com.google.android.gms.internal.vision.s0.i(r3, r1, r7)
            int r6 = r7.f3164a
            if (r2 != r6) goto L_0x03c0
            goto L_0x03ab
        L_0x03bf:
            r1 = r4
        L_0x03c0:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.a3.k(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.google.android.gms.internal.vision.t0):int");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r36v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r36v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r36v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r36v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r36v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v22, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r36v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v24, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v25, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v26, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v34, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v27, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v35, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v28, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v29, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v30, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v29, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v32, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v32, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v35, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v37, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v37, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v38, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v24, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v42, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v43, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v25, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v41, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v22, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v43, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v44, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v24, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v46, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v47, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v48, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v49, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v50, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v51, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v58, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v34, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v52, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v52, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v33, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v28, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v54, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v30, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v57, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v50, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v31, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v95, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x03b5, code lost:
        r8 = r8 | r26;
        r0 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x03b9, code lost:
        r15 = r33;
        r2 = r36;
        r1 = r38;
        r3 = r4;
        r16 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x03c2, code lost:
        r4 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x03c5, code lost:
        r6 = r38;
        r11 = r4;
        r2 = r9;
        r29 = r13;
        r22 = r20;
        r9 = r5;
        r20 = r16;
        r16 = r36;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x010b, code lost:
        r20 = r16;
        r6 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x024c, code lost:
        r13.putObject(r12, r10, r6.f3166c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0287, code lost:
        r10 = r33;
        r8 = r1;
        r9 = r4;
        r18 = r5;
        r4 = r6;
        r1 = r7;
        r5 = r12;
        r29 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x02ea, code lost:
        r8 = r8 | r26;
        r0 = r9;
        r15 = r33;
        r2 = r36;
        r1 = r38;
        r4 = r6;
        r16 = r10;
        r3 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x02f8, code lost:
        r5 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x031a, code lost:
        r13.putInt(r12, r10, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x031d, code lost:
        r8 = r8 | r26;
        r30 = r5;
        r5 = r4;
        r4 = r30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0365, code lost:
        r7 = r36;
        r13 = r39;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x036b, code lost:
        r11 = r5;
        r5 = r4;
        r4 = r11;
     */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=int, for r0v6, types: [int, byte] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int l(T r34, byte[] r35, int r36, int r37, int r38, com.google.android.gms.internal.vision.t0 r39) {
        /*
            r33 = this;
            r15 = r33
            r14 = r35
            r12 = r37
            sun.misc.Unsafe r13 = f3041q
            r5 = r34
            r0 = r36
            r1 = r38
            r4 = r39
            r7 = r15
            r2 = -1
            r3 = 0
            r6 = 1048575(0xfffff, float:1.469367E-39)
            r8 = 0
            r16 = 0
        L_0x0019:
            r17 = 0
            int[] r10 = r7.f3042a
            if (r0 >= r12) goto L_0x0583
            int r9 = r0 + 1
            byte r0 = r14[r0]
            if (r0 >= 0) goto L_0x0030
            int r0 = com.google.android.gms.internal.vision.s0.e(r0, r14, r9, r4)
            int r9 = r4.f3164a
            r30 = r9
            r9 = r0
            r0 = r30
        L_0x0030:
            int r11 = r0 >>> 3
            r15 = r0 & 7
            r36 = r0
            int r0 = r7.d
            r21 = r1
            int r1 = r7.f3044c
            if (r11 <= r2) goto L_0x004e
            r2 = 3
            int r3 = r3 / r2
            if (r11 < r1) goto L_0x0049
            if (r11 > r0) goto L_0x0049
            int r0 = r7.w(r11, r3)
            goto L_0x004a
        L_0x0049:
            r0 = -1
        L_0x004a:
            r2 = r0
            r1 = -1
            r3 = 0
            goto L_0x005c
        L_0x004e:
            if (r11 < r1) goto L_0x0058
            if (r11 > r0) goto L_0x0058
            r3 = 0
            int r0 = r7.w(r11, r3)
            goto L_0x005a
        L_0x0058:
            r3 = 0
            r0 = -1
        L_0x005a:
            r2 = r0
            r1 = -1
        L_0x005c:
            if (r2 != r1) goto L_0x0073
            r20 = r1
            r19 = r3
            r23 = r6
            r2 = r9
            r22 = r10
            r16 = r11
            r29 = r13
            r6 = r21
            r9 = r36
            r11 = r19
            goto L_0x04f9
        L_0x0073:
            int r0 = r2 + 1
            r0 = r10[r0]
            r19 = 267386880(0xff00000, float:2.3665827E-29)
            r19 = r0 & r19
            r20 = r4
            int r4 = r19 >>> 20
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r0 & r18
            r21 = r0
            long r0 = (long) r1
            r3 = 17
            r23 = r0
            if (r4 > r3) goto L_0x03d4
            int r1 = r2 + 2
            r1 = r10[r1]
            int r3 = r1 >>> 20
            r0 = 1
            int r26 = r0 << r3
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r3
            r18 = r4
            if (r1 == r6) goto L_0x00aa
            if (r6 == r3) goto L_0x00a4
            long r3 = (long) r6
            r13.putInt(r5, r3, r8)
        L_0x00a4:
            long r3 = (long) r1
            int r8 = r13.getInt(r5, r3)
            r6 = r1
        L_0x00aa:
            r1 = 5
            switch(r18) {
                case 0: goto L_0x0393;
                case 1: goto L_0x0370;
                case 2: goto L_0x0327;
                case 3: goto L_0x0327;
                case 4: goto L_0x02fb;
                case 5: goto L_0x02bc;
                case 6: goto L_0x0294;
                case 7: goto L_0x0253;
                case 8: goto L_0x021f;
                case 9: goto L_0x01df;
                case 10: goto L_0x01bd;
                case 11: goto L_0x02fb;
                case 12: goto L_0x0179;
                case 13: goto L_0x0294;
                case 14: goto L_0x02bc;
                case 15: goto L_0x0154;
                case 16: goto L_0x0124;
                case 17: goto L_0x00c0;
                default: goto L_0x00ae;
            }
        L_0x00ae:
            r5 = r36
            r4 = r2
            r23 = r6
            r20 = r10
            r36 = r11
            r16 = -1
            r19 = 0
            r22 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x03c5
        L_0x00c0:
            r3 = 3
            if (r15 != r3) goto L_0x0111
            int r0 = r11 << 3
            r4 = r0 | 4
            com.google.android.gms.internal.vision.m3 r0 = r7.n(r2)
            r15 = r36
            r36 = r11
            r10 = r23
            r16 = -1
            r1 = r35
            r3 = r2
            r2 = r9
            r9 = r3
            r19 = 0
            r22 = 1048575(0xfffff, float:1.469367E-39)
            r3 = r37
            r23 = r6
            r6 = r20
            r12 = r5
            r5 = r39
            int r0 = com.google.android.gms.internal.vision.s0.g(r0, r1, r2, r3, r4, r5)
            r1 = r8 & r26
            if (r1 != 0) goto L_0x00f1
            java.lang.Object r1 = r6.f3166c
            goto L_0x00fb
        L_0x00f1:
            java.lang.Object r1 = r13.getObject(r12, r10)
            java.lang.Object r2 = r6.f3166c
            com.google.android.gms.internal.vision.q1 r1 = com.google.android.gms.internal.vision.u1.c(r1, r2)
        L_0x00fb:
            r13.putObject(r12, r10, r1)
            r1 = r8 | r26
            r10 = r33
            r8 = r1
            r4 = r6
            r1 = r7
            r18 = r9
            r5 = r12
            r29 = r13
            r9 = r15
        L_0x010b:
            r20 = r16
            r6 = r23
            goto L_0x0365
        L_0x0111:
            r15 = r36
            r23 = r6
            r20 = r10
            r36 = r11
            r16 = -1
            r19 = 0
            r22 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r2
            r5 = r15
            goto L_0x03c5
        L_0x0124:
            r4 = r2
            r12 = r5
            r16 = -1
            r19 = 0
            r22 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r36
            r36 = r11
            r30 = r23
            r23 = r6
            r6 = r20
            r20 = r10
            r10 = r30
            if (r15 != 0) goto L_0x03c5
            int r9 = com.google.android.gms.internal.vision.s0.k(r14, r9, r6)
            long r0 = r6.f3165b
            long r17 = s6.a.c0(r0)
            r0 = r13
            r1 = r34
            r2 = r10
            r11 = r4
            r10 = r5
            r4 = r17
            r0.putLong(r1, r2, r4)
            goto L_0x02ea
        L_0x0154:
            r4 = r36
            r12 = r5
            r36 = r11
            r16 = -1
            r19 = 0
            r22 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r2
            r30 = r23
            r23 = r6
            r6 = r20
            r20 = r10
            r10 = r30
            if (r15 != 0) goto L_0x036b
            int r0 = com.google.android.gms.internal.vision.s0.i(r14, r9, r6)
            int r1 = r6.f3164a
            int r1 = s6.a.s0(r1)
            goto L_0x031a
        L_0x0179:
            r4 = r36
            r12 = r5
            r36 = r11
            r16 = -1
            r19 = 0
            r22 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r2
            r30 = r23
            r23 = r6
            r6 = r20
            r20 = r10
            r10 = r30
            if (r15 != 0) goto L_0x036b
            int r0 = com.google.android.gms.internal.vision.s0.i(r14, r9, r6)
            int r1 = r6.f3164a
            com.google.android.gms.internal.vision.v1 r2 = r7.C(r5)
            if (r2 == 0) goto L_0x031a
            boolean r2 = r2.d(r1)
            if (r2 == 0) goto L_0x01a6
            goto L_0x031a
        L_0x01a6:
            com.google.android.gms.internal.vision.y3 r2 = H(r34)
            long r9 = (long) r1
            java.lang.Long r1 = java.lang.Long.valueOf(r9)
            r2.a(r4, r1)
            r15 = r33
            r2 = r36
            r1 = r38
            r16 = r4
            r3 = r5
            goto L_0x03c2
        L_0x01bd:
            r4 = r36
            r12 = r5
            r36 = r11
            r0 = 2
            r16 = -1
            r19 = 0
            r22 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r2
            r30 = r23
            r23 = r6
            r6 = r20
            r20 = r10
            r10 = r30
            if (r15 != r0) goto L_0x036b
            int r0 = com.google.android.gms.internal.vision.s0.q(r14, r9, r6)
            r2 = r37
            goto L_0x024c
        L_0x01df:
            r4 = r36
            r12 = r5
            r36 = r11
            r0 = 2
            r16 = -1
            r19 = 0
            r22 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r2
            r30 = r23
            r23 = r6
            r6 = r20
            r20 = r10
            r10 = r30
            if (r15 != r0) goto L_0x021b
            com.google.android.gms.internal.vision.m3 r0 = r7.n(r5)
            r2 = r37
            int r0 = com.google.android.gms.internal.vision.s0.h(r0, r14, r9, r2, r6)
            r1 = r8 & r26
            if (r1 != 0) goto L_0x020a
            java.lang.Object r1 = r6.f3166c
            goto L_0x0214
        L_0x020a:
            java.lang.Object r1 = r13.getObject(r12, r10)
            java.lang.Object r3 = r6.f3166c
            com.google.android.gms.internal.vision.q1 r1 = com.google.android.gms.internal.vision.u1.c(r1, r3)
        L_0x0214:
            r13.putObject(r12, r10, r1)
            r1 = r8 | r26
            goto L_0x0287
        L_0x021b:
            r2 = r37
            goto L_0x036b
        L_0x021f:
            r4 = r36
            r36 = r11
            r0 = 2
            r16 = -1
            r19 = 0
            r22 = 1048575(0xfffff, float:1.469367E-39)
            r30 = r5
            r5 = r2
            r2 = r12
            r12 = r30
            r31 = r23
            r23 = r6
            r6 = r20
            r20 = r10
            r10 = r31
            if (r15 != r0) goto L_0x036b
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r21 & r0
            if (r0 != 0) goto L_0x0248
            int r0 = com.google.android.gms.internal.vision.s0.n(r14, r9, r6)
            goto L_0x024c
        L_0x0248:
            int r0 = com.google.android.gms.internal.vision.s0.p(r14, r9, r6)
        L_0x024c:
            java.lang.Object r1 = r6.f3166c
            r13.putObject(r12, r10, r1)
            goto L_0x031d
        L_0x0253:
            r4 = r36
            r36 = r11
            r16 = -1
            r19 = 0
            r22 = 1048575(0xfffff, float:1.469367E-39)
            r30 = r5
            r5 = r2
            r2 = r12
            r12 = r30
            r31 = r23
            r23 = r6
            r6 = r20
            r20 = r10
            r10 = r31
            if (r15 != 0) goto L_0x036b
            int r1 = com.google.android.gms.internal.vision.s0.k(r14, r9, r6)
            r9 = r1
            long r0 = r6.f3165b
            r17 = 0
            int r0 = (r0 > r17 ? 1 : (r0 == r17 ? 0 : -1))
            if (r0 == 0) goto L_0x027f
            r3 = 1
            goto L_0x0281
        L_0x027f:
            r3 = r19
        L_0x0281:
            com.google.android.gms.internal.vision.b4.g(r12, r10, r3)
            r1 = r8 | r26
            r0 = r9
        L_0x0287:
            r10 = r33
            r8 = r1
            r9 = r4
            r18 = r5
            r4 = r6
            r1 = r7
            r5 = r12
            r29 = r13
            goto L_0x010b
        L_0x0294:
            r4 = r36
            r36 = r11
            r16 = -1
            r19 = 0
            r22 = 1048575(0xfffff, float:1.469367E-39)
            r30 = r5
            r5 = r2
            r2 = r12
            r12 = r30
            r31 = r23
            r23 = r6
            r6 = r20
            r20 = r10
            r10 = r31
            if (r15 != r1) goto L_0x036b
            int r0 = com.google.android.gms.internal.vision.s0.a(r9, r14)
            r13.putInt(r12, r10, r0)
            int r0 = r9 + 4
            goto L_0x031d
        L_0x02bc:
            r4 = r36
            r36 = r11
            r16 = -1
            r19 = 0
            r22 = 1048575(0xfffff, float:1.469367E-39)
            r30 = r5
            r5 = r2
            r2 = r12
            r12 = r30
            r31 = r23
            r23 = r6
            r6 = r20
            r20 = r10
            r10 = r31
            if (r15 != r0) goto L_0x036b
            long r17 = com.google.android.gms.internal.vision.s0.l(r9, r14)
            r0 = r13
            r1 = r34
            r2 = r10
            r10 = r4
            r11 = r5
            r4 = r17
            r0.putLong(r1, r2, r4)
            int r9 = r9 + 8
        L_0x02ea:
            r0 = r8 | r26
            r8 = r0
            r0 = r9
            r15 = r33
            r2 = r36
            r1 = r38
            r4 = r6
            r16 = r10
            r3 = r11
        L_0x02f8:
            r5 = r12
            goto L_0x0436
        L_0x02fb:
            r4 = r36
            r12 = r5
            r36 = r11
            r16 = -1
            r19 = 0
            r22 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r2
            r30 = r23
            r23 = r6
            r6 = r20
            r20 = r10
            r10 = r30
            if (r15 != 0) goto L_0x036b
            int r0 = com.google.android.gms.internal.vision.s0.i(r14, r9, r6)
            int r1 = r6.f3164a
        L_0x031a:
            r13.putInt(r12, r10, r1)
        L_0x031d:
            r1 = r8 | r26
            r8 = r1
            r30 = r5
            r5 = r4
            r4 = r30
            goto L_0x03b9
        L_0x0327:
            r4 = r36
            r12 = r5
            r36 = r11
            r16 = -1
            r19 = 0
            r22 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r2
            r30 = r23
            r23 = r6
            r6 = r20
            r20 = r10
            r10 = r30
            if (r15 != 0) goto L_0x036b
            int r9 = com.google.android.gms.internal.vision.s0.k(r14, r9, r6)
            long r2 = r6.f3165b
            r0 = r13
            r1 = r34
            r17 = r2
            r2 = r10
            r10 = r4
            r11 = r5
            r4 = r17
            r0.putLong(r1, r2, r4)
            r0 = r8 | r26
            r8 = r0
            r4 = r6
            r1 = r7
            r0 = r9
            r9 = r10
            r18 = r11
            r5 = r12
            r29 = r13
            r20 = r16
            r6 = r23
            r10 = r33
        L_0x0365:
            r7 = r36
            r13 = r39
            goto L_0x0572
        L_0x036b:
            r10 = r4
            r11 = r5
            r5 = r10
            r4 = r11
            goto L_0x03c5
        L_0x0370:
            r4 = r2
            r12 = r5
            r16 = -1
            r19 = 0
            r22 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r36
            r36 = r11
            r30 = r23
            r23 = r6
            r6 = r20
            r20 = r10
            r10 = r30
            if (r15 != r1) goto L_0x03c5
            float r0 = com.google.android.gms.internal.vision.s0.o(r9, r14)
            com.google.android.gms.internal.vision.b4.e(r12, r10, r0)
            int r9 = r9 + 4
            goto L_0x03b5
        L_0x0393:
            r4 = r2
            r12 = r5
            r16 = -1
            r19 = 0
            r22 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r36
            r36 = r11
            r30 = r23
            r23 = r6
            r6 = r20
            r20 = r10
            r10 = r30
            if (r15 != r0) goto L_0x03c5
            double r0 = com.google.android.gms.internal.vision.s0.m(r9, r14)
            com.google.android.gms.internal.vision.b4.d(r12, r10, r0)
            int r9 = r9 + 8
        L_0x03b5:
            r0 = r8 | r26
            r8 = r0
            r0 = r9
        L_0x03b9:
            r15 = r33
            r2 = r36
            r1 = r38
            r3 = r4
            r16 = r5
        L_0x03c2:
            r4 = r6
            goto L_0x02f8
        L_0x03c5:
            r6 = r38
            r11 = r4
            r2 = r9
            r29 = r13
            r22 = r20
            r9 = r5
            r20 = r16
            r16 = r36
            goto L_0x04f9
        L_0x03d4:
            r18 = r4
            r12 = r5
            r16 = -1
            r19 = 0
            r22 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r36
            r4 = r2
            r36 = r11
            r30 = r23
            r23 = r6
            r6 = r20
            r20 = r10
            r10 = r30
            r0 = 27
            r3 = r18
            if (r3 != r0) goto L_0x044d
            r0 = 2
            if (r15 != r0) goto L_0x043c
            java.lang.Object r0 = r13.getObject(r12, r10)
            com.google.android.gms.internal.vision.a2 r0 = (com.google.android.gms.internal.vision.a2) r0
            boolean r1 = r0.zza()
            if (r1 != 0) goto L_0x0414
            int r1 = r0.size()
            if (r1 != 0) goto L_0x040b
            r1 = 10
            goto L_0x040d
        L_0x040b:
            int r1 = r1 << 1
        L_0x040d:
            com.google.android.gms.internal.vision.a2 r0 = r0.d(r1)
            r13.putObject(r12, r10, r0)
        L_0x0414:
            r10 = r0
            com.google.android.gms.internal.vision.m3 r0 = r7.n(r4)
            r1 = r5
            r2 = r35
            r3 = r9
            r18 = r4
            r4 = r37
            r11 = r5
            r5 = r10
            r9 = r6
            r6 = r39
            int r0 = com.google.android.gms.internal.vision.s0.f(r0, r1, r2, r3, r4, r5, r6)
            r15 = r33
            r2 = r36
            r1 = r38
            r4 = r9
            r16 = r11
            r5 = r12
            r3 = r18
        L_0x0436:
            r6 = r23
            r12 = r37
            goto L_0x0019
        L_0x043c:
            r18 = r4
            r26 = r8
            r14 = r9
            r29 = r13
            r22 = r20
            r20 = r16
            r16 = r36
            r36 = r5
            goto L_0x04bb
        L_0x044d:
            r18 = r4
            r12 = r5
            r0 = 49
            if (r3 > r0) goto L_0x049f
            r0 = r21
            long r6 = (long) r0
            r0 = r33
            r1 = r34
            r2 = r35
            r4 = r3
            r3 = r9
            r5 = r4
            r4 = r37
            r21 = r5
            r5 = r12
            r24 = r6
            r6 = r36
            r7 = r15
            r26 = r8
            r8 = r18
            r15 = r9
            r27 = r10
            r11 = r22
            r22 = r20
            r20 = r16
            r9 = r24
            r16 = r36
            r11 = r21
            r36 = r12
            r29 = r13
            r12 = r27
            r14 = r39
            int r0 = r0.k(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 != r15) goto L_0x048d
            goto L_0x04f3
        L_0x048d:
            r10 = r33
            r9 = r36
            r1 = r38
            r13 = r39
            r7 = r16
            r3 = r18
            r6 = r23
            r8 = r26
            goto L_0x0552
        L_0x049f:
            r26 = r8
            r14 = r9
            r27 = r10
            r29 = r13
            r22 = r20
            r0 = r21
            r21 = r3
            r20 = r16
            r16 = r36
            r36 = r12
            r1 = 50
            r9 = r21
            if (r9 != r1) goto L_0x04d8
            r1 = 2
            if (r15 == r1) goto L_0x04c5
        L_0x04bb:
            r9 = r36
            r6 = r38
            r2 = r14
        L_0x04c0:
            r11 = r18
            r8 = r26
            goto L_0x04f9
        L_0x04c5:
            r0 = r33
            r1 = r34
            r2 = r35
            r3 = r14
            r4 = r37
            r5 = r18
            r6 = r27
            r8 = r39
            r0.t(r1, r2, r3, r4, r5, r6, r8)
            throw r17
        L_0x04d8:
            r8 = r0
            r0 = r33
            r1 = r34
            r2 = r35
            r3 = r14
            r4 = r37
            r5 = r36
            r6 = r16
            r7 = r15
            r10 = r27
            r12 = r18
            r13 = r39
            int r0 = r0.j(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 != r14) goto L_0x0562
        L_0x04f3:
            r9 = r36
            r6 = r38
            r2 = r0
            goto L_0x04c0
        L_0x04f9:
            if (r9 != r6) goto L_0x0509
            if (r6 != 0) goto L_0x04fe
            goto L_0x0509
        L_0x04fe:
            r7 = r33
            r10 = r7
            r12 = r34
            r0 = r2
            r1 = r6
            r6 = r23
            goto L_0x0591
        L_0x0509:
            r10 = r33
            boolean r0 = r10.f3046f
            if (r0 == 0) goto L_0x053b
            com.google.android.gms.internal.vision.d1 r0 = com.google.android.gms.internal.vision.d1.b()
            r13 = r39
            com.google.android.gms.internal.vision.d1 r1 = r13.d
            if (r1 == r0) goto L_0x053d
            com.google.android.gms.internal.vision.w2 r0 = r10.f3045e
            r7 = r16
            com.google.android.gms.internal.vision.q1$d r0 = r1.a(r7, r0)
            if (r0 != 0) goto L_0x0533
            com.google.android.gms.internal.vision.y3 r4 = H(r34)
            r0 = r9
            r1 = r35
            r3 = r37
            r5 = r39
            int r0 = com.google.android.gms.internal.vision.s0.d(r0, r1, r2, r3, r4, r5)
            goto L_0x054e
        L_0x0533:
            r0 = r34
            com.google.android.gms.internal.vision.q1$c r0 = (com.google.android.gms.internal.vision.q1.c) r0
            r0.o()
            throw r17
        L_0x053b:
            r13 = r39
        L_0x053d:
            r7 = r16
            com.google.android.gms.internal.vision.y3 r4 = H(r34)
            r0 = r9
            r1 = r35
            r3 = r37
            r5 = r39
            int r0 = com.google.android.gms.internal.vision.s0.d(r0, r1, r2, r3, r4, r5)
        L_0x054e:
            r1 = r6
            r3 = r11
            r6 = r23
        L_0x0552:
            r5 = r34
            r14 = r35
            r12 = r37
            r2 = r7
            r16 = r9
            r7 = r10
            r15 = r7
            r4 = r13
            r13 = r29
            goto L_0x0019
        L_0x0562:
            r10 = r33
            r9 = r36
            r13 = r39
            r7 = r16
            r5 = r34
            r1 = r10
            r4 = r13
            r6 = r23
            r8 = r26
        L_0x0572:
            r14 = r35
            r12 = r37
            r2 = r7
            r16 = r9
            r15 = r10
            r3 = r18
            r13 = r29
            r7 = r1
            r1 = r38
            goto L_0x0019
        L_0x0583:
            r21 = r1
            r12 = r5
            r23 = r6
            r26 = r8
            r22 = r10
            r29 = r13
            r10 = r15
            r9 = r16
        L_0x0591:
            r2 = 1048575(0xfffff, float:1.469367E-39)
            if (r6 == r2) goto L_0x059c
            long r3 = (long) r6
            r5 = r29
            r5.putInt(r12, r3, r8)
        L_0x059c:
            int r3 = r7.f3049i
        L_0x059e:
            int r4 = r7.f3050j
            if (r3 >= r4) goto L_0x05fd
            int[] r4 = r7.f3048h
            r4 = r4[r3]
            r5 = r22[r4]
            int r5 = r7.E(r4)
            r5 = r5 & r2
            long r5 = (long) r5
            java.lang.Object r5 = com.google.android.gms.internal.vision.b4.u(r5, r12)
            if (r5 != 0) goto L_0x05b5
            goto L_0x05fa
        L_0x05b5:
            com.google.android.gms.internal.vision.v1 r6 = r7.C(r4)
            if (r6 != 0) goto L_0x05bc
            goto L_0x05fa
        L_0x05bc:
            com.google.android.gms.internal.vision.t2 r8 = r7.f3054o
            com.google.android.gms.internal.vision.r2 r5 = r8.d(r5)
            java.lang.Object r4 = r7.x(r4)
            r8.e(r4)
            java.util.Set r4 = r5.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L_0x05d1:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x05fa
            java.lang.Object r5 = r4.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r8 = r5.getValue()
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            boolean r8 = r6.d(r8)
            if (r8 == 0) goto L_0x05ee
            goto L_0x05d1
        L_0x05ee:
            com.google.android.gms.internal.vision.w3<?, ?> r0 = r7.f3052m
            r0.a()
            r5.getKey()
            r5.getValue()
            throw r17
        L_0x05fa:
            int r3 = r3 + 1
            goto L_0x059e
        L_0x05fd:
            if (r1 != 0) goto L_0x0609
            r2 = r37
            if (r0 != r2) goto L_0x0604
            goto L_0x060f
        L_0x0604:
            com.google.android.gms.internal.vision.z1 r0 = com.google.android.gms.internal.vision.z1.c()
            throw r0
        L_0x0609:
            r2 = r37
            if (r0 > r2) goto L_0x0610
            if (r9 != r1) goto L_0x0610
        L_0x060f:
            return r0
        L_0x0610:
            com.google.android.gms.internal.vision.z1 r0 = com.google.android.gms.internal.vision.z1.c()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.a3.l(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.vision.t0):int");
    }

    public final m3 n(int i10) {
        int i11 = (i10 / 3) << 1;
        Object[] objArr = this.f3043b;
        m3 m3Var = (m3) objArr[i11];
        if (m3Var != null) {
            return m3Var;
        }
        m3 a10 = j3.f3104c.a((Class) objArr[i11 + 1]);
        objArr[i11] = a10;
        return a10;
    }

    public final void r(int i10, Object obj, Object obj2) {
        long E = (long) (E(i10) & 1048575);
        if (v(i10, obj2)) {
            Object u = b4.u(E, obj);
            Object u10 = b4.u(E, obj2);
            if (u != null && u10 != null) {
                b4.j(E, obj, u1.c(u, u10));
                z(i10, obj);
            } else if (u10 != null) {
                b4.j(E, obj, u10);
                z(i10, obj);
            }
        }
    }

    public final void s(b1 b1Var, int i10, Object obj, int i11) {
        if (obj != null) {
            Object x10 = x(i11);
            t2 t2Var = this.f3054o;
            t2Var.e(x10);
            r2 a10 = t2Var.a(obj);
            b1Var.getClass();
            Iterator it = a10.entrySet().iterator();
            if (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                b1Var.f3058a.H(i10, 2);
                entry.getKey();
                entry.getValue();
                throw null;
            }
        }
    }

    public final void t(Object obj, byte[] bArr, int i10, int i11, int i12, long j8, t0 t0Var) {
        Object x10 = x(i12);
        Unsafe unsafe = f3041q;
        Object object = unsafe.getObject(obj, j8);
        t2 t2Var = this.f3054o;
        if (t2Var.f(object)) {
            r2 i13 = t2Var.i();
            t2Var.b((Object) i13, object);
            unsafe.putObject(obj, j8, i13);
            object = i13;
        }
        t2Var.e(x10);
        t2Var.d(object);
        int i14 = s0.i(bArr, i10, t0Var);
        int i15 = t0Var.f3164a;
        if (i15 < 0 || i15 > i11 - i14) {
            throw z1.a();
        }
        throw null;
    }

    public final boolean u(int i10, int i11, Object obj) {
        if (b4.b((long) (this.f3042a[i11 + 2] & 1048575), obj) == i10) {
            return true;
        }
        return false;
    }

    public final boolean v(int i10, Object obj) {
        int i11 = this.f3042a[i10 + 2];
        long j8 = (long) (i11 & 1048575);
        if (j8 == 1048575) {
            int E = E(i10);
            long j10 = (long) (E & 1048575);
            switch ((E & 267386880) >>> 20) {
                case 0:
                    if (b4.t(j10, obj) != 0.0d) {
                        return true;
                    }
                    return false;
                case 1:
                    if (b4.q(j10, obj) != 0.0f) {
                        return true;
                    }
                    return false;
                case 2:
                    if (b4.l(j10, obj) != 0) {
                        return true;
                    }
                    return false;
                case 3:
                    if (b4.l(j10, obj) != 0) {
                        return true;
                    }
                    return false;
                case 4:
                    if (b4.b(j10, obj) != 0) {
                        return true;
                    }
                    return false;
                case 5:
                    if (b4.l(j10, obj) != 0) {
                        return true;
                    }
                    return false;
                case 6:
                    if (b4.b(j10, obj) != 0) {
                        return true;
                    }
                    return false;
                case 7:
                    return b4.p(j10, obj);
                case 8:
                    Object u = b4.u(j10, obj);
                    if (u instanceof String) {
                        if (!((String) u).isEmpty()) {
                            return true;
                        }
                        return false;
                    } else if (!(u instanceof w0)) {
                        throw new IllegalArgumentException();
                    } else if (!w0.f3182p.equals(u)) {
                        return true;
                    } else {
                        return false;
                    }
                case 9:
                    if (b4.u(j10, obj) != null) {
                        return true;
                    }
                    return false;
                case 10:
                    if (!w0.f3182p.equals(b4.u(j10, obj))) {
                        return true;
                    }
                    return false;
                case 11:
                    if (b4.b(j10, obj) != 0) {
                        return true;
                    }
                    return false;
                case 12:
                    if (b4.b(j10, obj) != 0) {
                        return true;
                    }
                    return false;
                case 13:
                    if (b4.b(j10, obj) != 0) {
                        return true;
                    }
                    return false;
                case 14:
                    if (b4.l(j10, obj) != 0) {
                        return true;
                    }
                    return false;
                case 15:
                    if (b4.b(j10, obj) != 0) {
                        return true;
                    }
                    return false;
                case 16:
                    if (b4.l(j10, obj) != 0) {
                        return true;
                    }
                    return false;
                case 17:
                    if (b4.u(j10, obj) != null) {
                        return true;
                    }
                    return false;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i11 >>> 20)) & b4.b(j8, obj)) != 0) {
            return true;
        } else {
            return false;
        }
    }

    public final int w(int i10, int i11) {
        int[] iArr = this.f3042a;
        int length = (iArr.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int i14 = iArr[i13];
            if (i10 == i14) {
                return i13;
            }
            if (i10 < i14) {
                length = i12 - 1;
            } else {
                i11 = i12 + 1;
            }
        }
        return -1;
    }

    public final Object x(int i10) {
        return this.f3043b[(i10 / 3) << 1];
    }

    public final void y(int i10, int i11, Object obj) {
        b4.i(i10, (long) (this.f3042a[i11 + 2] & 1048575), obj);
    }

    public final void z(int i10, Object obj) {
        int i11 = this.f3042a[i10 + 2];
        long j8 = (long) (1048575 & i11);
        if (j8 != 1048575) {
            b4.i((1 << (i11 >>> 20)) | b4.b(j8, obj), j8, obj);
        }
    }
}
