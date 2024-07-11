package com.google.android.gms.internal.measurement;

import b0.d;
import com.karumi.dexter.R;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;

public final class l7<T> implements t7<T> {

    /* renamed from: n  reason: collision with root package name */
    public static final int[] f2781n = new int[0];

    /* renamed from: o  reason: collision with root package name */
    public static final Unsafe f2782o = o8.r();

    /* renamed from: a  reason: collision with root package name */
    public final int[] f2783a;

    /* renamed from: b  reason: collision with root package name */
    public final Object[] f2784b;

    /* renamed from: c  reason: collision with root package name */
    public final int f2785c;
    public final int d;

    /* renamed from: e  reason: collision with root package name */
    public final i7 f2786e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f2787f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f2788g;

    /* renamed from: h  reason: collision with root package name */
    public final int[] f2789h;

    /* renamed from: i  reason: collision with root package name */
    public final int f2790i;

    /* renamed from: j  reason: collision with root package name */
    public final int f2791j;

    /* renamed from: k  reason: collision with root package name */
    public final w6 f2792k;
    public final e8<?, ?> l;

    /* renamed from: m  reason: collision with root package name */
    public final s5<?> f2793m;

    public l7(int[] iArr, Object[] objArr, int i10, int i11, i7 i7Var, boolean z, int[] iArr2, int i12, int i13, w6 w6Var, e8 e8Var, s5 s5Var, e7 e7Var) {
        this.f2783a = iArr;
        this.f2784b = objArr;
        this.f2785c = i10;
        this.d = i11;
        this.f2788g = z;
        this.f2787f = s5Var != null && s5Var.a(i7Var);
        this.f2789h = iArr2;
        this.f2790i = i12;
        this.f2791j = i13;
        this.f2792k = w6Var;
        this.l = e8Var;
        this.f2793m = s5Var;
        this.f2786e = i7Var;
    }

    public static int d(long j8, Object obj) {
        return ((Integer) o8.p(j8, obj)).intValue();
    }

    public static long e(long j8, Object obj) {
        return ((Long) o8.p(j8, obj)).longValue();
    }

    public static final void s(int i10, Object obj, o5 o5Var) {
        if (obj instanceof String) {
            o5Var.f2859a.P0((String) obj, i10);
            return;
        }
        o5Var.l(i10, (k5) obj);
    }

    public static f8 t(Object obj) {
        f6 f6Var = (f6) obj;
        f8 f8Var = f6Var.zzc;
        if (f8Var != f8.f2700f) {
            return f8Var;
        }
        f8 a10 = f8.a();
        f6Var.zzc = a10;
        return a10;
    }

    /* JADX WARNING: Removed duplicated region for block: B:120:0x0260  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0263  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x027b  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x027e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.measurement.l7 v(com.google.android.gms.internal.measurement.s7 r33, com.google.android.gms.internal.measurement.w6 r34, com.google.android.gms.internal.measurement.e8 r35, com.google.android.gms.internal.measurement.s5 r36, com.google.android.gms.internal.measurement.e7 r37) {
        /*
            int r0 = r33.zzc()
            r2 = 2
            r3 = 0
            if (r0 != r2) goto L_0x000a
            r10 = 1
            goto L_0x000b
        L_0x000a:
            r10 = r3
        L_0x000b:
            java.lang.String r0 = r33.b()
            int r2 = r0.length()
            char r4 = r0.charAt(r3)
            r5 = 55296(0xd800, float:7.7486E-41)
            if (r4 < r5) goto L_0x0027
            r4 = 1
        L_0x001d:
            int r6 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x0028
            r4 = r6
            goto L_0x001d
        L_0x0027:
            r6 = 1
        L_0x0028:
            int r4 = r6 + 1
            char r6 = r0.charAt(r6)
            if (r6 < r5) goto L_0x0047
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r8 = 13
        L_0x0034:
            int r9 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x0044
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            int r4 = r4 << r8
            r6 = r6 | r4
            int r8 = r8 + 13
            r4 = r9
            goto L_0x0034
        L_0x0044:
            int r4 = r4 << r8
            r6 = r6 | r4
            r4 = r9
        L_0x0047:
            if (r6 != 0) goto L_0x0057
            int[] r6 = f2781n
            r8 = r3
            r9 = r8
            r11 = r9
            r12 = r11
            r14 = r12
            r16 = r14
            r13 = r6
            r6 = r16
            goto L_0x0166
        L_0x0057:
            int r6 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x0076
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r8 = 13
        L_0x0063:
            int r9 = r6 + 1
            char r6 = r0.charAt(r6)
            if (r6 < r5) goto L_0x0073
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            int r6 = r6 << r8
            r4 = r4 | r6
            int r8 = r8 + 13
            r6 = r9
            goto L_0x0063
        L_0x0073:
            int r6 = r6 << r8
            r4 = r4 | r6
            r6 = r9
        L_0x0076:
            int r8 = r6 + 1
            char r6 = r0.charAt(r6)
            if (r6 < r5) goto L_0x0095
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L_0x0082:
            int r11 = r8 + 1
            char r8 = r0.charAt(r8)
            if (r8 < r5) goto L_0x0092
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r9
            r6 = r6 | r8
            int r9 = r9 + 13
            r8 = r11
            goto L_0x0082
        L_0x0092:
            int r8 = r8 << r9
            r6 = r6 | r8
            r8 = r11
        L_0x0095:
            int r9 = r8 + 1
            char r8 = r0.charAt(r8)
            if (r8 < r5) goto L_0x00b4
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            r11 = 13
        L_0x00a1:
            int r12 = r9 + 1
            char r9 = r0.charAt(r9)
            if (r9 < r5) goto L_0x00b1
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r11
            r8 = r8 | r9
            int r11 = r11 + 13
            r9 = r12
            goto L_0x00a1
        L_0x00b1:
            int r9 = r9 << r11
            r8 = r8 | r9
            r9 = r12
        L_0x00b4:
            int r11 = r9 + 1
            char r9 = r0.charAt(r9)
            if (r9 < r5) goto L_0x00d3
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r12 = 13
        L_0x00c0:
            int r13 = r11 + 1
            char r11 = r0.charAt(r11)
            if (r11 < r5) goto L_0x00d0
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            int r11 = r11 << r12
            r9 = r9 | r11
            int r12 = r12 + 13
            r11 = r13
            goto L_0x00c0
        L_0x00d0:
            int r11 = r11 << r12
            r9 = r9 | r11
            r11 = r13
        L_0x00d3:
            int r12 = r11 + 1
            char r11 = r0.charAt(r11)
            if (r11 < r5) goto L_0x00f2
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            r13 = 13
        L_0x00df:
            int r14 = r12 + 1
            char r12 = r0.charAt(r12)
            if (r12 < r5) goto L_0x00ef
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r13
            r11 = r11 | r12
            int r13 = r13 + 13
            r12 = r14
            goto L_0x00df
        L_0x00ef:
            int r12 = r12 << r13
            r11 = r11 | r12
            r12 = r14
        L_0x00f2:
            int r13 = r12 + 1
            char r12 = r0.charAt(r12)
            if (r12 < r5) goto L_0x0111
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            r14 = 13
        L_0x00fe:
            int r15 = r13 + 1
            char r13 = r0.charAt(r13)
            if (r13 < r5) goto L_0x010e
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            int r13 = r13 << r14
            r12 = r12 | r13
            int r14 = r14 + 13
            r13 = r15
            goto L_0x00fe
        L_0x010e:
            int r13 = r13 << r14
            r12 = r12 | r13
            r13 = r15
        L_0x0111:
            int r14 = r13 + 1
            char r13 = r0.charAt(r13)
            if (r13 < r5) goto L_0x0132
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            r15 = 13
        L_0x011d:
            int r16 = r14 + 1
            char r14 = r0.charAt(r14)
            if (r14 < r5) goto L_0x012e
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r14 = r14 << r15
            r13 = r13 | r14
            int r15 = r15 + 13
            r14 = r16
            goto L_0x011d
        L_0x012e:
            int r14 = r14 << r15
            r13 = r13 | r14
            r14 = r16
        L_0x0132:
            int r15 = r14 + 1
            char r14 = r0.charAt(r14)
            if (r14 < r5) goto L_0x0155
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            r16 = 13
        L_0x013e:
            int r17 = r15 + 1
            char r15 = r0.charAt(r15)
            if (r15 < r5) goto L_0x0150
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r15 = r15 << r16
            r14 = r14 | r15
            int r16 = r16 + 13
            r15 = r17
            goto L_0x013e
        L_0x0150:
            int r15 = r15 << r16
            r14 = r14 | r15
            r15 = r17
        L_0x0155:
            int r16 = r14 + r12
            int r13 = r16 + r13
            int[] r13 = new int[r13]
            int r16 = r4 + r4
            int r16 = r16 + r6
            r6 = r4
            r4 = r15
            r32 = r14
            r14 = r12
            r12 = r32
        L_0x0166:
            java.lang.Object[] r15 = r33.c()
            com.google.android.gms.internal.measurement.i7 r17 = r33.a()
            java.lang.Class r3 = r17.getClass()
            int r7 = r11 * 3
            int[] r7 = new int[r7]
            int r11 = r11 + r11
            java.lang.Object[] r11 = new java.lang.Object[r11]
            int r14 = r14 + r12
            r20 = r12
            r21 = r14
            r18 = 0
            r19 = 0
        L_0x0182:
            if (r4 >= r2) goto L_0x03c3
            int r22 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x01aa
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r1 = r22
            r22 = 13
        L_0x0192:
            int r24 = r1 + 1
            char r1 = r0.charAt(r1)
            if (r1 < r5) goto L_0x01a4
            r1 = r1 & 8191(0x1fff, float:1.1478E-41)
            int r1 = r1 << r22
            r4 = r4 | r1
            int r22 = r22 + 13
            r1 = r24
            goto L_0x0192
        L_0x01a4:
            int r1 = r1 << r22
            r4 = r4 | r1
            r1 = r24
            goto L_0x01ac
        L_0x01aa:
            r1 = r22
        L_0x01ac:
            int r22 = r1 + 1
            char r1 = r0.charAt(r1)
            if (r1 < r5) goto L_0x01d9
            r1 = r1 & 8191(0x1fff, float:1.1478E-41)
            r5 = r22
            r22 = 13
        L_0x01ba:
            int r25 = r5 + 1
            char r5 = r0.charAt(r5)
            r26 = r2
            r2 = 55296(0xd800, float:7.7486E-41)
            if (r5 < r2) goto L_0x01d3
            r2 = r5 & 8191(0x1fff, float:1.1478E-41)
            int r2 = r2 << r22
            r1 = r1 | r2
            int r22 = r22 + 13
            r5 = r25
            r2 = r26
            goto L_0x01ba
        L_0x01d3:
            int r2 = r5 << r22
            r1 = r1 | r2
            r2 = r25
            goto L_0x01dd
        L_0x01d9:
            r26 = r2
            r2 = r22
        L_0x01dd:
            r5 = r1 & 255(0xff, float:3.57E-43)
            r22 = r14
            r14 = r1 & 1024(0x400, float:1.435E-42)
            if (r14 == 0) goto L_0x01eb
            int r14 = r18 + 1
            r13[r18] = r19
            r18 = r14
        L_0x01eb:
            sun.misc.Unsafe r14 = f2782o
            r29 = r12
            r12 = 51
            if (r5 < r12) goto L_0x029a
            int r12 = r2 + 1
            char r2 = r0.charAt(r2)
            r25 = r12
            r12 = 55296(0xd800, float:7.7486E-41)
            if (r2 < r12) goto L_0x0225
            r2 = r2 & 8191(0x1fff, float:1.1478E-41)
            r12 = r25
            r25 = 13
        L_0x0206:
            int r30 = r12 + 1
            char r12 = r0.charAt(r12)
            r31 = r9
            r9 = 55296(0xd800, float:7.7486E-41)
            if (r12 < r9) goto L_0x021f
            r9 = r12 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r25
            r2 = r2 | r9
            int r25 = r25 + 13
            r12 = r30
            r9 = r31
            goto L_0x0206
        L_0x021f:
            int r9 = r12 << r25
            r2 = r2 | r9
            r12 = r30
            goto L_0x0229
        L_0x0225:
            r31 = r9
            r12 = r25
        L_0x0229:
            int r9 = r5 + -51
            r25 = r12
            r12 = 9
            if (r9 == r12) goto L_0x024a
            r12 = 17
            if (r9 != r12) goto L_0x0236
            goto L_0x024a
        L_0x0236:
            r12 = 12
            if (r9 != r12) goto L_0x0259
            if (r10 != 0) goto L_0x0259
            int r9 = r19 / 3
            int r12 = r16 + 1
            int r9 = r9 + r9
            r23 = 1
            int r9 = r9 + 1
            r16 = r15[r16]
            r11[r9] = r16
            goto L_0x0257
        L_0x024a:
            int r9 = r19 / 3
            int r12 = r16 + 1
            int r9 = r9 + r9
            r23 = 1
            int r9 = r9 + 1
            r16 = r15[r16]
            r11[r9] = r16
        L_0x0257:
            r16 = r12
        L_0x0259:
            int r2 = r2 + r2
            r9 = r15[r2]
            boolean r12 = r9 instanceof java.lang.reflect.Field
            if (r12 == 0) goto L_0x0263
            java.lang.reflect.Field r9 = (java.lang.reflect.Field) r9
            goto L_0x026b
        L_0x0263:
            java.lang.String r9 = (java.lang.String) r9
            java.lang.reflect.Field r9 = w(r9, r3)
            r15[r2] = r9
        L_0x026b:
            r12 = r8
            long r8 = r14.objectFieldOffset(r9)
            int r8 = (int) r8
            int r2 = r2 + 1
            r9 = r15[r2]
            r27 = r8
            boolean r8 = r9 instanceof java.lang.reflect.Field
            if (r8 == 0) goto L_0x027e
            java.lang.reflect.Field r9 = (java.lang.reflect.Field) r9
            goto L_0x0286
        L_0x027e:
            java.lang.String r9 = (java.lang.String) r9
            java.lang.reflect.Field r9 = w(r9, r3)
            r15[r2] = r9
        L_0x0286:
            long r8 = r14.objectFieldOffset(r9)
            int r2 = (int) r8
            r9 = r2
            r28 = r25
            r8 = r27
            r2 = 0
            r23 = 1
            r27 = r16
            r16 = r12
            r12 = r15
            goto L_0x038b
        L_0x029a:
            r12 = r8
            r31 = r9
            int r8 = r16 + 1
            r9 = r15[r16]
            java.lang.String r9 = (java.lang.String) r9
            java.lang.reflect.Field r9 = w(r9, r3)
            r16 = r12
            r12 = 9
            if (r5 == r12) goto L_0x0310
            r12 = 17
            if (r5 != r12) goto L_0x02b2
            goto L_0x0310
        L_0x02b2:
            r12 = 27
            if (r5 == r12) goto L_0x0300
            r12 = 49
            if (r5 != r12) goto L_0x02bb
            goto L_0x0300
        L_0x02bb:
            r12 = 12
            if (r5 == r12) goto L_0x02ee
            r12 = 30
            if (r5 == r12) goto L_0x02ee
            r12 = 44
            if (r5 != r12) goto L_0x02c8
            goto L_0x02ee
        L_0x02c8:
            r12 = 50
            if (r5 != r12) goto L_0x02eb
            int r12 = r20 + 1
            r13[r20] = r19
            int r20 = r19 / 3
            int r20 = r20 + r20
            int r27 = r8 + 1
            r8 = r15[r8]
            r11[r20] = r8
            r8 = r1 & 2048(0x800, float:2.87E-42)
            if (r8 == 0) goto L_0x02e7
            int r8 = r27 + 1
            int r20 = r20 + 1
            r27 = r15[r27]
            r11[r20] = r27
            goto L_0x02e9
        L_0x02e7:
            r8 = r27
        L_0x02e9:
            r20 = r12
        L_0x02eb:
            r23 = 1
            goto L_0x031d
        L_0x02ee:
            if (r10 != 0) goto L_0x02eb
            int r12 = r19 / 3
            int r27 = r8 + 1
            int r12 = r12 + r12
            r23 = 1
            int r12 = r12 + 1
            r8 = r15[r8]
            r11[r12] = r8
            r8 = r27
            goto L_0x02eb
        L_0x0300:
            int r12 = r19 / 3
            int r27 = r8 + 1
            int r12 = r12 + r12
            r23 = 1
            int r12 = r12 + 1
            r8 = r15[r8]
            r11[r12] = r8
            r8 = r27
            goto L_0x031d
        L_0x0310:
            r23 = 1
            int r12 = r19 / 3
            int r12 = r12 + r12
            int r12 = r12 + 1
            java.lang.Class r27 = r9.getType()
            r11[r12] = r27
        L_0x031d:
            r12 = r8
            long r8 = r14.objectFieldOffset(r9)
            int r8 = (int) r8
            r9 = r1 & 4096(0x1000, float:5.74E-42)
            r27 = r12
            r12 = 4096(0x1000, float:5.74E-42)
            if (r9 != r12) goto L_0x0376
            r9 = 17
            if (r5 > r9) goto L_0x0376
            int r9 = r2 + 1
            char r2 = r0.charAt(r2)
            r12 = 55296(0xd800, float:7.7486E-41)
            if (r2 < r12) goto L_0x0354
            r2 = r2 & 8191(0x1fff, float:1.1478E-41)
            r24 = 13
        L_0x033e:
            int r28 = r9 + 1
            char r9 = r0.charAt(r9)
            if (r9 < r12) goto L_0x0350
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r24
            r2 = r2 | r9
            int r24 = r24 + 13
            r9 = r28
            goto L_0x033e
        L_0x0350:
            int r9 = r9 << r24
            r2 = r2 | r9
            goto L_0x0356
        L_0x0354:
            r28 = r9
        L_0x0356:
            int r9 = r6 + r6
            int r24 = r2 / 32
            int r24 = r24 + r9
            r9 = r15[r24]
            boolean r12 = r9 instanceof java.lang.reflect.Field
            if (r12 == 0) goto L_0x0365
            java.lang.reflect.Field r9 = (java.lang.reflect.Field) r9
            goto L_0x036d
        L_0x0365:
            java.lang.String r9 = (java.lang.String) r9
            java.lang.reflect.Field r9 = w(r9, r3)
            r15[r24] = r9
        L_0x036d:
            r12 = r15
            long r14 = r14.objectFieldOffset(r9)
            int r9 = (int) r14
            int r2 = r2 % 32
            goto L_0x037d
        L_0x0376:
            r12 = r15
            r9 = 1048575(0xfffff, float:1.469367E-39)
            r28 = r2
            r2 = 0
        L_0x037d:
            r14 = 18
            if (r5 < r14) goto L_0x038b
            r14 = 49
            if (r5 > r14) goto L_0x038b
            int r14 = r21 + 1
            r13[r21] = r8
            r21 = r14
        L_0x038b:
            int r14 = r19 + 1
            r7[r19] = r4
            int r4 = r14 + 1
            r15 = r1 & 512(0x200, float:7.175E-43)
            if (r15 == 0) goto L_0x0398
            r15 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0399
        L_0x0398:
            r15 = 0
        L_0x0399:
            r1 = r1 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x03a0
            r1 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x03a1
        L_0x03a0:
            r1 = 0
        L_0x03a1:
            r1 = r1 | r15
            int r5 = r5 << 20
            r1 = r1 | r5
            r1 = r1 | r8
            r7[r14] = r1
            int r19 = r4 + 1
            int r1 = r2 << 20
            r1 = r1 | r9
            r7[r4] = r1
            r15 = r12
            r8 = r16
            r14 = r22
            r2 = r26
            r16 = r27
            r4 = r28
            r12 = r29
            r9 = r31
            r5 = 55296(0xd800, float:7.7486E-41)
            goto L_0x0182
        L_0x03c3:
            r16 = r8
            r31 = r9
            r29 = r12
            r22 = r14
            com.google.android.gms.internal.measurement.l7 r0 = new com.google.android.gms.internal.measurement.l7
            com.google.android.gms.internal.measurement.i7 r9 = r33.a()
            r4 = r0
            r5 = r7
            r6 = r11
            r7 = r16
            r8 = r31
            r11 = r13
            r13 = r22
            r14 = r34
            r15 = r35
            r16 = r36
            r17 = r37
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.l7.v(com.google.android.gms.internal.measurement.s7, com.google.android.gms.internal.measurement.w6, com.google.android.gms.internal.measurement.e8, com.google.android.gms.internal.measurement.s5, com.google.android.gms.internal.measurement.e7):com.google.android.gms.internal.measurement.l7");
    }

    public static Field w(String str, Class cls) {
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
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40 + name.length() + String.valueOf(arrays).length());
            sb.append("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(name);
            throw new RuntimeException(d.g(sb, " not found. Known fields are ", arrays));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:103:0x027f, code lost:
        r4 = com.google.android.gms.internal.measurement.n5.Z0(r5 << 3);
        r2 = (r2 >> 63) ^ (r2 + r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0297, code lost:
        r3 = com.google.android.gms.internal.measurement.n5.Z0(r5 << 3);
        r2 = (r2 >> 31) ^ (r2 + r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x02c5, code lost:
        r3 = com.google.android.gms.internal.measurement.n5.Z0(r5 << 3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x02cb, code lost:
        r2 = com.google.android.gms.internal.measurement.n5.Z0(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x02d7, code lost:
        r2 = com.google.android.gms.internal.measurement.o8.p(r6, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x02e2, code lost:
        r2 = com.google.android.gms.internal.measurement.u7.Q(r5, E(r0), com.google.android.gms.internal.measurement.o8.p(r6, r9));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x02fc, code lost:
        if ((r2 instanceof com.google.android.gms.internal.measurement.k5) != false) goto L_0x02fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x02fe, code lost:
        r3 = com.google.android.gms.internal.measurement.n5.Z0(r5 << 3);
        r2 = ((com.google.android.gms.internal.measurement.k5) r2).i();
        r4 = (com.google.android.gms.internal.measurement.n5.Z0(r2) + r2) + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0310, code lost:
        r1 = r1 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0313, code lost:
        r3 = com.google.android.gms.internal.measurement.n5.Z0(r5 << 3);
        r2 = com.google.android.gms.internal.measurement.n5.b1((java.lang.String) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0326, code lost:
        r2 = com.google.android.gms.internal.measurement.n5.Z0(r5 << 3) + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0343, code lost:
        r2 = com.google.android.gms.internal.measurement.o8.f(r6, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0347, code lost:
        r3 = com.google.android.gms.internal.measurement.n5.Z0(r5 << 3);
        r2 = com.google.android.gms.internal.measurement.n5.Y0(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0351, code lost:
        r2 = r2 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0360, code lost:
        r2 = com.google.android.gms.internal.measurement.o8.h(r6, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0364, code lost:
        r4 = com.google.android.gms.internal.measurement.n5.Z0(r5 << 3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x036a, code lost:
        r2 = com.google.android.gms.internal.measurement.n5.a1(r2) + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0376, code lost:
        r2 = com.google.android.gms.internal.measurement.n5.Z0(r5 << 3) + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0385, code lost:
        r2 = com.google.android.gms.internal.measurement.n5.Z0(r5 << 3) + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x038d, code lost:
        r1 = r1 + r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0090, code lost:
        if ((r2 instanceof com.google.android.gms.internal.measurement.k5) != false) goto L_0x02fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00b2, code lost:
        r2 = d(r6, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00c5, code lost:
        r2 = e(r6, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01b3, code lost:
        r4 = (com.google.android.gms.internal.measurement.n5.Z0(r2) + com.google.android.gms.internal.measurement.n5.X0(r5)) + r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0265, code lost:
        r2 = com.google.android.gms.internal.measurement.n5.H0(r5, (com.google.android.gms.internal.measurement.i7) com.google.android.gms.internal.measurement.o8.p(r6, r9), E(r0));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A(T r9) {
        /*
            r8 = this;
            r0 = 0
            r1 = r0
        L_0x0002:
            int[] r2 = r8.f2783a
            int r3 = r2.length
            if (r0 >= r3) goto L_0x0392
            int r3 = r8.b(r0)
            int r4 = r3 >>> 20
            r4 = r4 & 255(0xff, float:3.57E-43)
            r5 = r2[r0]
            r6 = 1048575(0xfffff, float:1.469367E-39)
            r3 = r3 & r6
            long r6 = (long) r3
            com.google.android.gms.internal.measurement.x5 r3 = com.google.android.gms.internal.measurement.x5.DOUBLE_LIST_PACKED
            int r3 = r3.zza()
            if (r4 < r3) goto L_0x002a
            com.google.android.gms.internal.measurement.x5 r3 = com.google.android.gms.internal.measurement.x5.SINT64_LIST_PACKED
            int r3 = r3.zza()
            if (r4 > r3) goto L_0x002a
            int r3 = r0 + 2
            r2 = r2[r3]
        L_0x002a:
            sun.misc.Unsafe r2 = f2782o
            switch(r4) {
                case 0: goto L_0x037f;
                case 1: goto L_0x0370;
                case 2: goto L_0x035a;
                case 3: goto L_0x0353;
                case 4: goto L_0x033d;
                case 5: goto L_0x0336;
                case 6: goto L_0x032f;
                case 7: goto L_0x0320;
                case 8: goto L_0x02f0;
                case 9: goto L_0x02dc;
                case 10: goto L_0x02d1;
                case 11: goto L_0x02bb;
                case 12: goto L_0x02b3;
                case 13: goto L_0x02ab;
                case 14: goto L_0x02a3;
                case 15: goto L_0x028d;
                case 16: goto L_0x0275;
                case 17: goto L_0x025f;
                case 18: goto L_0x0253;
                case 19: goto L_0x0247;
                case 20: goto L_0x023b;
                case 21: goto L_0x022f;
                case 22: goto L_0x0223;
                case 23: goto L_0x0253;
                case 24: goto L_0x0247;
                case 25: goto L_0x0217;
                case 26: goto L_0x020b;
                case 27: goto L_0x01fb;
                case 28: goto L_0x01ef;
                case 29: goto L_0x01e3;
                case 30: goto L_0x01d7;
                case 31: goto L_0x0247;
                case 32: goto L_0x0253;
                case 33: goto L_0x01cb;
                case 34: goto L_0x01bf;
                case 35: goto L_0x01a7;
                case 36: goto L_0x019a;
                case 37: goto L_0x018d;
                case 38: goto L_0x0180;
                case 39: goto L_0x0173;
                case 40: goto L_0x0166;
                case 41: goto L_0x0159;
                case 42: goto L_0x014c;
                case 43: goto L_0x013e;
                case 44: goto L_0x0130;
                case 45: goto L_0x0122;
                case 46: goto L_0x0114;
                case 47: goto L_0x0106;
                case 48: goto L_0x00f8;
                case 49: goto L_0x00e8;
                case 50: goto L_0x00db;
                case 51: goto L_0x00d3;
                case 52: goto L_0x00cb;
                case 53: goto L_0x00bf;
                case 54: goto L_0x00b8;
                case 55: goto L_0x00ac;
                case 56: goto L_0x00a4;
                case 57: goto L_0x009c;
                case 58: goto L_0x0094;
                case 59: goto L_0x0084;
                case 60: goto L_0x007c;
                case 61: goto L_0x0074;
                case 62: goto L_0x0068;
                case 63: goto L_0x0061;
                case 64: goto L_0x0059;
                case 65: goto L_0x0051;
                case 66: goto L_0x0045;
                case 67: goto L_0x0039;
                case 68: goto L_0x0031;
                default: goto L_0x002f;
            }
        L_0x002f:
            goto L_0x038e
        L_0x0031:
            boolean r2 = r8.o(r5, r0, r9)
            if (r2 == 0) goto L_0x038e
            goto L_0x0265
        L_0x0039:
            boolean r2 = r8.o(r5, r0, r9)
            if (r2 == 0) goto L_0x038e
            long r2 = e(r6, r9)
            goto L_0x027f
        L_0x0045:
            boolean r2 = r8.o(r5, r0, r9)
            if (r2 == 0) goto L_0x038e
            int r2 = d(r6, r9)
            goto L_0x0297
        L_0x0051:
            boolean r2 = r8.o(r5, r0, r9)
            if (r2 == 0) goto L_0x038e
            goto L_0x0385
        L_0x0059:
            boolean r2 = r8.o(r5, r0, r9)
            if (r2 == 0) goto L_0x038e
            goto L_0x0376
        L_0x0061:
            boolean r2 = r8.o(r5, r0, r9)
            if (r2 == 0) goto L_0x038e
            goto L_0x00b2
        L_0x0068:
            boolean r2 = r8.o(r5, r0, r9)
            if (r2 == 0) goto L_0x038e
            int r2 = d(r6, r9)
            goto L_0x02c5
        L_0x0074:
            boolean r2 = r8.o(r5, r0, r9)
            if (r2 == 0) goto L_0x038e
            goto L_0x02d7
        L_0x007c:
            boolean r2 = r8.o(r5, r0, r9)
            if (r2 == 0) goto L_0x038e
            goto L_0x02e2
        L_0x0084:
            boolean r2 = r8.o(r5, r0, r9)
            if (r2 == 0) goto L_0x038e
            java.lang.Object r2 = com.google.android.gms.internal.measurement.o8.p(r6, r9)
            boolean r3 = r2 instanceof com.google.android.gms.internal.measurement.k5
            if (r3 == 0) goto L_0x0313
            goto L_0x02fe
        L_0x0094:
            boolean r2 = r8.o(r5, r0, r9)
            if (r2 == 0) goto L_0x038e
            goto L_0x0326
        L_0x009c:
            boolean r2 = r8.o(r5, r0, r9)
            if (r2 == 0) goto L_0x038e
            goto L_0x0376
        L_0x00a4:
            boolean r2 = r8.o(r5, r0, r9)
            if (r2 == 0) goto L_0x038e
            goto L_0x0385
        L_0x00ac:
            boolean r2 = r8.o(r5, r0, r9)
            if (r2 == 0) goto L_0x038e
        L_0x00b2:
            int r2 = d(r6, r9)
            goto L_0x0347
        L_0x00b8:
            boolean r2 = r8.o(r5, r0, r9)
            if (r2 == 0) goto L_0x038e
            goto L_0x00c5
        L_0x00bf:
            boolean r2 = r8.o(r5, r0, r9)
            if (r2 == 0) goto L_0x038e
        L_0x00c5:
            long r2 = e(r6, r9)
            goto L_0x0364
        L_0x00cb:
            boolean r2 = r8.o(r5, r0, r9)
            if (r2 == 0) goto L_0x038e
            goto L_0x0376
        L_0x00d3:
            boolean r2 = r8.o(r5, r0, r9)
            if (r2 == 0) goto L_0x038e
            goto L_0x0385
        L_0x00db:
            java.lang.Object r2 = com.google.android.gms.internal.measurement.o8.p(r6, r9)
            java.lang.Object r3 = r8.F(r0)
            com.google.android.gms.internal.measurement.e7.a(r2, r3)
            goto L_0x038e
        L_0x00e8:
            java.lang.Object r2 = com.google.android.gms.internal.measurement.o8.p(r6, r9)
            java.util.List r2 = (java.util.List) r2
            com.google.android.gms.internal.measurement.t7 r3 = r8.E(r0)
            int r2 = com.google.android.gms.internal.measurement.u7.T(r5, r2, r3)
            goto L_0x038d
        L_0x00f8:
            java.lang.Object r2 = r2.getObject(r9, r6)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.measurement.u7.z(r2)
            if (r2 <= 0) goto L_0x038e
            goto L_0x01b3
        L_0x0106:
            java.lang.Object r2 = r2.getObject(r9, r6)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.measurement.u7.H(r2)
            if (r2 <= 0) goto L_0x038e
            goto L_0x01b3
        L_0x0114:
            java.lang.Object r2 = r2.getObject(r9, r6)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.measurement.u7.L(r2)
            if (r2 <= 0) goto L_0x038e
            goto L_0x01b3
        L_0x0122:
            java.lang.Object r2 = r2.getObject(r9, r6)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.measurement.u7.J(r2)
            if (r2 <= 0) goto L_0x038e
            goto L_0x01b3
        L_0x0130:
            java.lang.Object r2 = r2.getObject(r9, r6)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.measurement.u7.B(r2)
            if (r2 <= 0) goto L_0x038e
            goto L_0x01b3
        L_0x013e:
            java.lang.Object r2 = r2.getObject(r9, r6)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.measurement.u7.F(r2)
            if (r2 <= 0) goto L_0x038e
            goto L_0x01b3
        L_0x014c:
            java.lang.Object r2 = r2.getObject(r9, r6)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.measurement.u7.N(r2)
            if (r2 <= 0) goto L_0x038e
            goto L_0x01b3
        L_0x0159:
            java.lang.Object r2 = r2.getObject(r9, r6)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.measurement.u7.J(r2)
            if (r2 <= 0) goto L_0x038e
            goto L_0x01b3
        L_0x0166:
            java.lang.Object r2 = r2.getObject(r9, r6)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.measurement.u7.L(r2)
            if (r2 <= 0) goto L_0x038e
            goto L_0x01b3
        L_0x0173:
            java.lang.Object r2 = r2.getObject(r9, r6)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.measurement.u7.D(r2)
            if (r2 <= 0) goto L_0x038e
            goto L_0x01b3
        L_0x0180:
            java.lang.Object r2 = r2.getObject(r9, r6)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.measurement.u7.x(r2)
            if (r2 <= 0) goto L_0x038e
            goto L_0x01b3
        L_0x018d:
            java.lang.Object r2 = r2.getObject(r9, r6)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.measurement.u7.v(r2)
            if (r2 <= 0) goto L_0x038e
            goto L_0x01b3
        L_0x019a:
            java.lang.Object r2 = r2.getObject(r9, r6)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.measurement.u7.J(r2)
            if (r2 <= 0) goto L_0x038e
            goto L_0x01b3
        L_0x01a7:
            java.lang.Object r2 = r2.getObject(r9, r6)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.measurement.u7.L(r2)
            if (r2 <= 0) goto L_0x038e
        L_0x01b3:
            int r3 = com.google.android.gms.internal.measurement.n5.X0(r5)
            int r4 = com.google.android.gms.internal.measurement.n5.Z0(r2)
            int r4 = r4 + r3
            int r4 = r4 + r2
            goto L_0x0310
        L_0x01bf:
            java.lang.Object r2 = com.google.android.gms.internal.measurement.o8.p(r6, r9)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.measurement.u7.A(r5, r2)
            goto L_0x038d
        L_0x01cb:
            java.lang.Object r2 = com.google.android.gms.internal.measurement.o8.p(r6, r9)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.measurement.u7.I(r5, r2)
            goto L_0x038d
        L_0x01d7:
            java.lang.Object r2 = com.google.android.gms.internal.measurement.o8.p(r6, r9)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.measurement.u7.C(r5, r2)
            goto L_0x038d
        L_0x01e3:
            java.lang.Object r2 = com.google.android.gms.internal.measurement.o8.p(r6, r9)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.measurement.u7.G(r5, r2)
            goto L_0x038d
        L_0x01ef:
            java.lang.Object r2 = com.google.android.gms.internal.measurement.o8.p(r6, r9)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.measurement.u7.S(r5, r2)
            goto L_0x038d
        L_0x01fb:
            java.lang.Object r2 = com.google.android.gms.internal.measurement.o8.p(r6, r9)
            java.util.List r2 = (java.util.List) r2
            com.google.android.gms.internal.measurement.t7 r3 = r8.E(r0)
            int r2 = com.google.android.gms.internal.measurement.u7.R(r5, r2, r3)
            goto L_0x038d
        L_0x020b:
            java.lang.Object r2 = com.google.android.gms.internal.measurement.o8.p(r6, r9)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.measurement.u7.P(r5, r2)
            goto L_0x038d
        L_0x0217:
            java.lang.Object r2 = com.google.android.gms.internal.measurement.o8.p(r6, r9)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.measurement.u7.O(r5, r2)
            goto L_0x038d
        L_0x0223:
            java.lang.Object r2 = com.google.android.gms.internal.measurement.o8.p(r6, r9)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.measurement.u7.E(r5, r2)
            goto L_0x038d
        L_0x022f:
            java.lang.Object r2 = com.google.android.gms.internal.measurement.o8.p(r6, r9)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.measurement.u7.y(r5, r2)
            goto L_0x038d
        L_0x023b:
            java.lang.Object r2 = com.google.android.gms.internal.measurement.o8.p(r6, r9)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.measurement.u7.w(r5, r2)
            goto L_0x038d
        L_0x0247:
            java.lang.Object r2 = com.google.android.gms.internal.measurement.o8.p(r6, r9)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.measurement.u7.K(r5, r2)
            goto L_0x038d
        L_0x0253:
            java.lang.Object r2 = com.google.android.gms.internal.measurement.o8.p(r6, r9)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.measurement.u7.M(r5, r2)
            goto L_0x038d
        L_0x025f:
            boolean r2 = r8.m(r0, r9)
            if (r2 == 0) goto L_0x038e
        L_0x0265:
            java.lang.Object r2 = com.google.android.gms.internal.measurement.o8.p(r6, r9)
            com.google.android.gms.internal.measurement.i7 r2 = (com.google.android.gms.internal.measurement.i7) r2
            com.google.android.gms.internal.measurement.t7 r3 = r8.E(r0)
            int r2 = com.google.android.gms.internal.measurement.n5.H0(r5, r2, r3)
            goto L_0x038d
        L_0x0275:
            boolean r2 = r8.m(r0, r9)
            if (r2 == 0) goto L_0x038e
            long r2 = com.google.android.gms.internal.measurement.o8.h(r6, r9)
        L_0x027f:
            int r4 = r5 << 3
            int r4 = com.google.android.gms.internal.measurement.n5.Z0(r4)
            long r5 = r2 + r2
            r7 = 63
            long r2 = r2 >> r7
            long r2 = r2 ^ r5
            goto L_0x036a
        L_0x028d:
            boolean r2 = r8.m(r0, r9)
            if (r2 == 0) goto L_0x038e
            int r2 = com.google.android.gms.internal.measurement.o8.f(r6, r9)
        L_0x0297:
            int r3 = r5 << 3
            int r3 = com.google.android.gms.internal.measurement.n5.Z0(r3)
            int r4 = r2 + r2
            int r2 = r2 >> 31
            r2 = r2 ^ r4
            goto L_0x02cb
        L_0x02a3:
            boolean r2 = r8.m(r0, r9)
            if (r2 == 0) goto L_0x038e
            goto L_0x0385
        L_0x02ab:
            boolean r2 = r8.m(r0, r9)
            if (r2 == 0) goto L_0x038e
            goto L_0x0376
        L_0x02b3:
            boolean r2 = r8.m(r0, r9)
            if (r2 == 0) goto L_0x038e
            goto L_0x0343
        L_0x02bb:
            boolean r2 = r8.m(r0, r9)
            if (r2 == 0) goto L_0x038e
            int r2 = com.google.android.gms.internal.measurement.o8.f(r6, r9)
        L_0x02c5:
            int r3 = r5 << 3
            int r3 = com.google.android.gms.internal.measurement.n5.Z0(r3)
        L_0x02cb:
            int r2 = com.google.android.gms.internal.measurement.n5.Z0(r2)
            goto L_0x0351
        L_0x02d1:
            boolean r2 = r8.m(r0, r9)
            if (r2 == 0) goto L_0x038e
        L_0x02d7:
            java.lang.Object r2 = com.google.android.gms.internal.measurement.o8.p(r6, r9)
            goto L_0x02fe
        L_0x02dc:
            boolean r2 = r8.m(r0, r9)
            if (r2 == 0) goto L_0x038e
        L_0x02e2:
            java.lang.Object r2 = com.google.android.gms.internal.measurement.o8.p(r6, r9)
            com.google.android.gms.internal.measurement.t7 r3 = r8.E(r0)
            int r2 = com.google.android.gms.internal.measurement.u7.Q(r5, r3, r2)
            goto L_0x038d
        L_0x02f0:
            boolean r2 = r8.m(r0, r9)
            if (r2 == 0) goto L_0x038e
            java.lang.Object r2 = com.google.android.gms.internal.measurement.o8.p(r6, r9)
            boolean r3 = r2 instanceof com.google.android.gms.internal.measurement.k5
            if (r3 == 0) goto L_0x0313
        L_0x02fe:
            com.google.android.gms.internal.measurement.k5 r2 = (com.google.android.gms.internal.measurement.k5) r2
            int r3 = r5 << 3
            int r3 = com.google.android.gms.internal.measurement.n5.Z0(r3)
            int r2 = r2.i()
            int r4 = com.google.android.gms.internal.measurement.n5.Z0(r2)
            int r4 = r4 + r2
            int r4 = r4 + r3
        L_0x0310:
            int r1 = r1 + r4
            goto L_0x038e
        L_0x0313:
            java.lang.String r2 = (java.lang.String) r2
            int r3 = r5 << 3
            int r3 = com.google.android.gms.internal.measurement.n5.Z0(r3)
            int r2 = com.google.android.gms.internal.measurement.n5.b1(r2)
            goto L_0x0351
        L_0x0320:
            boolean r2 = r8.m(r0, r9)
            if (r2 == 0) goto L_0x038e
        L_0x0326:
            int r2 = r5 << 3
            int r2 = com.google.android.gms.internal.measurement.n5.Z0(r2)
            int r2 = r2 + 1
            goto L_0x038d
        L_0x032f:
            boolean r2 = r8.m(r0, r9)
            if (r2 == 0) goto L_0x038e
            goto L_0x0376
        L_0x0336:
            boolean r2 = r8.m(r0, r9)
            if (r2 == 0) goto L_0x038e
            goto L_0x0385
        L_0x033d:
            boolean r2 = r8.m(r0, r9)
            if (r2 == 0) goto L_0x038e
        L_0x0343:
            int r2 = com.google.android.gms.internal.measurement.o8.f(r6, r9)
        L_0x0347:
            int r3 = r5 << 3
            int r3 = com.google.android.gms.internal.measurement.n5.Z0(r3)
            int r2 = com.google.android.gms.internal.measurement.n5.Y0(r2)
        L_0x0351:
            int r2 = r2 + r3
            goto L_0x038d
        L_0x0353:
            boolean r2 = r8.m(r0, r9)
            if (r2 == 0) goto L_0x038e
            goto L_0x0360
        L_0x035a:
            boolean r2 = r8.m(r0, r9)
            if (r2 == 0) goto L_0x038e
        L_0x0360:
            long r2 = com.google.android.gms.internal.measurement.o8.h(r6, r9)
        L_0x0364:
            int r4 = r5 << 3
            int r4 = com.google.android.gms.internal.measurement.n5.Z0(r4)
        L_0x036a:
            int r2 = com.google.android.gms.internal.measurement.n5.a1(r2)
            int r2 = r2 + r4
            goto L_0x038d
        L_0x0370:
            boolean r2 = r8.m(r0, r9)
            if (r2 == 0) goto L_0x038e
        L_0x0376:
            int r2 = r5 << 3
            int r2 = com.google.android.gms.internal.measurement.n5.Z0(r2)
            int r2 = r2 + 4
            goto L_0x038d
        L_0x037f:
            boolean r2 = r8.m(r0, r9)
            if (r2 == 0) goto L_0x038e
        L_0x0385:
            int r2 = r5 << 3
            int r2 = com.google.android.gms.internal.measurement.n5.Z0(r2)
            int r2 = r2 + 8
        L_0x038d:
            int r1 = r1 + r2
        L_0x038e:
            int r0 = r0 + 3
            goto L_0x0002
        L_0x0392:
            com.google.android.gms.internal.measurement.e8<?, ?> r0 = r8.l
            com.google.android.gms.internal.measurement.f8 r9 = r0.d(r9)
            int r9 = r0.h(r9)
            int r9 = r9 + r1
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.l7.A(java.lang.Object):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:140:0x025c, code lost:
        if (r7.f2686b != 0) goto L_0x0278;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x025f, code lost:
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0260, code lost:
        r12.h(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0263, code lost:
        if (r4 >= r5) goto L_0x027a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0265, code lost:
        r6 = s6.a.U(r3, r4, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x026b, code lost:
        if (r2 == r7.f2685a) goto L_0x026e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x026e, code lost:
        r4 = s6.a.k0(r3, r6, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0276, code lost:
        if (r7.f2686b == 0) goto L_0x025f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0278, code lost:
        r6 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x027a, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:?, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:?, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0122, code lost:
        if (r4 == 0) goto L_0x0146;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0125, code lost:
        r12.add(com.google.android.gms.internal.measurement.k5.t(r3, r1, r4));
        r1 = r1 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x012d, code lost:
        if (r1 >= r5) goto L_0x0156;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x012f, code lost:
        r4 = s6.a.U(r3, r1, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0135, code lost:
        if (r2 == r7.f2685a) goto L_0x0138;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0138, code lost:
        r1 = s6.a.U(r3, r4, r7);
        r4 = r7.f2685a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x013e, code lost:
        if (r4 < 0) goto L_0x0151;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0142, code lost:
        if (r4 > (r3.length - r1)) goto L_0x014c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0144, code lost:
        if (r4 != 0) goto L_0x0125;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0146, code lost:
        r12.add(com.google.android.gms.internal.measurement.k5.f2770p);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0150, code lost:
        throw com.google.android.gms.internal.measurement.p6.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0155, code lost:
        throw com.google.android.gms.internal.measurement.p6.b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0156, code lost:
        return r1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x01e9  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01a1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int B(T r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, long r25, int r27, long r28, com.google.android.gms.internal.measurement.e5 r30) {
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
            sun.misc.Unsafe r11 = f2782o
            java.lang.Object r12 = r11.getObject(r1, r9)
            com.google.android.gms.internal.measurement.m6 r12 = (com.google.android.gms.internal.measurement.m6) r12
            boolean r13 = r12.zza()
            if (r13 != 0) goto L_0x0033
            int r13 = r12.size()
            if (r13 != 0) goto L_0x002b
            r13 = 10
            goto L_0x002c
        L_0x002b:
            int r13 = r13 + r13
        L_0x002c:
            com.google.android.gms.internal.measurement.m6 r12 = r12.x(r13)
            r11.putObject(r1, r9, r12)
        L_0x0033:
            r9 = 3
            r10 = 0
            r13 = 1
            r14 = 5
            r15 = 2
            switch(r27) {
                case 18: goto L_0x0387;
                case 19: goto L_0x0344;
                case 20: goto L_0x030c;
                case 21: goto L_0x030c;
                case 22: goto L_0x02f1;
                case 23: goto L_0x02b6;
                case 24: goto L_0x027b;
                case 25: goto L_0x0227;
                case 26: goto L_0x017c;
                case 27: goto L_0x0161;
                case 28: goto L_0x0114;
                case 29: goto L_0x02f1;
                case 30: goto L_0x00d8;
                case 31: goto L_0x027b;
                case 32: goto L_0x02b6;
                case 33: goto L_0x0098;
                case 34: goto L_0x0058;
                case 35: goto L_0x0387;
                case 36: goto L_0x0344;
                case 37: goto L_0x030c;
                case 38: goto L_0x030c;
                case 39: goto L_0x02f1;
                case 40: goto L_0x02b6;
                case 41: goto L_0x027b;
                case 42: goto L_0x0227;
                case 43: goto L_0x02f1;
                case 44: goto L_0x00d8;
                case 45: goto L_0x027b;
                case 46: goto L_0x02b6;
                case 47: goto L_0x0098;
                case 48: goto L_0x0058;
                default: goto L_0x003c;
            }
        L_0x003c:
            if (r6 != r9) goto L_0x03eb
            com.google.android.gms.internal.measurement.t7 r1 = r0.E(r8)
            r6 = r2 & -8
            r6 = r6 | 4
            r22 = r1
            r23 = r18
            r24 = r19
            r25 = r20
            r26 = r6
            r27 = r30
            int r4 = s6.a.B0(r22, r23, r24, r25, r26, r27)
            goto L_0x03c9
        L_0x0058:
            if (r6 != r15) goto L_0x007c
            com.google.android.gms.internal.measurement.x6 r12 = (com.google.android.gms.internal.measurement.x6) r12
            int r1 = s6.a.U(r3, r4, r7)
            int r2 = r7.f2685a
            int r2 = r2 + r1
        L_0x0063:
            if (r1 >= r2) goto L_0x0073
            int r1 = s6.a.k0(r3, r1, r7)
            long r4 = r7.f2686b
            long r4 = androidx.databinding.a.H(r4)
            r12.h(r4)
            goto L_0x0063
        L_0x0073:
            if (r1 != r2) goto L_0x0077
            goto L_0x03ec
        L_0x0077:
            com.google.android.gms.internal.measurement.p6 r1 = com.google.android.gms.internal.measurement.p6.a()
            throw r1
        L_0x007c:
            if (r6 != 0) goto L_0x03eb
            com.google.android.gms.internal.measurement.x6 r12 = (com.google.android.gms.internal.measurement.x6) r12
        L_0x0080:
            int r1 = s6.a.k0(r3, r4, r7)
            long r8 = r7.f2686b
            long r8 = androidx.databinding.a.H(r8)
            r12.h(r8)
            if (r1 >= r5) goto L_0x0097
            int r4 = s6.a.U(r3, r1, r7)
            int r6 = r7.f2685a
            if (r2 == r6) goto L_0x0080
        L_0x0097:
            return r1
        L_0x0098:
            if (r6 != r15) goto L_0x00bc
            com.google.android.gms.internal.measurement.g6 r12 = (com.google.android.gms.internal.measurement.g6) r12
            int r1 = s6.a.U(r3, r4, r7)
            int r2 = r7.f2685a
            int r2 = r2 + r1
        L_0x00a3:
            if (r1 >= r2) goto L_0x00b3
            int r1 = s6.a.U(r3, r1, r7)
            int r4 = r7.f2685a
            int r4 = androidx.databinding.a.D(r4)
            r12.h(r4)
            goto L_0x00a3
        L_0x00b3:
            if (r1 != r2) goto L_0x00b7
            goto L_0x03ec
        L_0x00b7:
            com.google.android.gms.internal.measurement.p6 r1 = com.google.android.gms.internal.measurement.p6.a()
            throw r1
        L_0x00bc:
            if (r6 != 0) goto L_0x03eb
            com.google.android.gms.internal.measurement.g6 r12 = (com.google.android.gms.internal.measurement.g6) r12
        L_0x00c0:
            int r1 = s6.a.U(r3, r4, r7)
            int r4 = r7.f2685a
            int r4 = androidx.databinding.a.D(r4)
            r12.h(r4)
            if (r1 >= r5) goto L_0x00d7
            int r4 = s6.a.U(r3, r1, r7)
            int r6 = r7.f2685a
            if (r2 == r6) goto L_0x00c0
        L_0x00d7:
            return r1
        L_0x00d8:
            if (r6 != r15) goto L_0x00df
            int r2 = s6.a.D0(r3, r4, r12, r7)
            goto L_0x00f0
        L_0x00df:
            if (r6 != 0) goto L_0x03eb
            r2 = r21
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r12
            r7 = r30
            int r2 = s6.a.C0(r2, r3, r4, r5, r6, r7)
        L_0x00f0:
            com.google.android.gms.internal.measurement.f6 r1 = (com.google.android.gms.internal.measurement.f6) r1
            com.google.android.gms.internal.measurement.f8 r3 = r1.zzc
            com.google.android.gms.internal.measurement.f8 r4 = com.google.android.gms.internal.measurement.f8.f2700f
            if (r3 != r4) goto L_0x00f9
            r3 = 0
        L_0x00f9:
            int r4 = r8 / 3
            int r4 = r4 + r4
            int r4 = r4 + r13
            java.lang.Object[] r5 = r0.f2784b
            r4 = r5[r4]
            com.google.android.gms.internal.measurement.j6 r4 = (com.google.android.gms.internal.measurement.j6) r4
            com.google.android.gms.internal.measurement.e8<?, ?> r5 = r0.l
            r6 = r22
            java.lang.Object r3 = com.google.android.gms.internal.measurement.u7.b(r6, r12, r4, r3, r5)
            if (r3 != 0) goto L_0x010f
            goto L_0x0248
        L_0x010f:
            com.google.android.gms.internal.measurement.f8 r3 = (com.google.android.gms.internal.measurement.f8) r3
            r1.zzc = r3
            return r2
        L_0x0114:
            if (r6 != r15) goto L_0x03eb
            int r1 = s6.a.U(r3, r4, r7)
            int r4 = r7.f2685a
            if (r4 < 0) goto L_0x015c
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x0157
            if (r4 != 0) goto L_0x0125
            goto L_0x0146
        L_0x0125:
            com.google.android.gms.internal.measurement.j5 r6 = com.google.android.gms.internal.measurement.k5.t(r3, r1, r4)
            r12.add(r6)
            int r1 = r1 + r4
        L_0x012d:
            if (r1 >= r5) goto L_0x0156
            int r4 = s6.a.U(r3, r1, r7)
            int r6 = r7.f2685a
            if (r2 == r6) goto L_0x0138
            goto L_0x0156
        L_0x0138:
            int r1 = s6.a.U(r3, r4, r7)
            int r4 = r7.f2685a
            if (r4 < 0) goto L_0x0151
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x014c
            if (r4 != 0) goto L_0x0125
        L_0x0146:
            com.google.android.gms.internal.measurement.j5 r4 = com.google.android.gms.internal.measurement.k5.f2770p
            r12.add(r4)
            goto L_0x012d
        L_0x014c:
            com.google.android.gms.internal.measurement.p6 r1 = com.google.android.gms.internal.measurement.p6.a()
            throw r1
        L_0x0151:
            com.google.android.gms.internal.measurement.p6 r1 = com.google.android.gms.internal.measurement.p6.b()
            throw r1
        L_0x0156:
            return r1
        L_0x0157:
            com.google.android.gms.internal.measurement.p6 r1 = com.google.android.gms.internal.measurement.p6.a()
            throw r1
        L_0x015c:
            com.google.android.gms.internal.measurement.p6 r1 = com.google.android.gms.internal.measurement.p6.b()
            throw r1
        L_0x0161:
            if (r6 == r15) goto L_0x0165
            goto L_0x03eb
        L_0x0165:
            com.google.android.gms.internal.measurement.t7 r1 = r0.E(r8)
            r22 = r1
            r23 = r21
            r24 = r18
            r25 = r19
            r26 = r20
            r27 = r12
            r28 = r30
            int r1 = s6.a.F0(r22, r23, r24, r25, r26, r27, r28)
            return r1
        L_0x017c:
            if (r6 != r15) goto L_0x03eb
            r8 = 536870912(0x20000000, double:2.652494739E-315)
            long r8 = r25 & r8
            int r1 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            java.lang.String r6 = ""
            if (r1 != 0) goto L_0x01c9
            int r1 = s6.a.U(r3, r4, r7)
            int r4 = r7.f2685a
            if (r4 < 0) goto L_0x01c4
            if (r4 != 0) goto L_0x0194
            goto L_0x01b3
        L_0x0194:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = com.google.android.gms.internal.measurement.n6.f2844a
            r8.<init>(r3, r1, r4, r9)
        L_0x019b:
            r12.add(r8)
            int r1 = r1 + r4
        L_0x019f:
            if (r1 >= r5) goto L_0x03ec
            int r4 = s6.a.U(r3, r1, r7)
            int r8 = r7.f2685a
            if (r2 != r8) goto L_0x03ec
            int r1 = s6.a.U(r3, r4, r7)
            int r4 = r7.f2685a
            if (r4 < 0) goto L_0x01bf
            if (r4 != 0) goto L_0x01b7
        L_0x01b3:
            r12.add(r6)
            goto L_0x019f
        L_0x01b7:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = com.google.android.gms.internal.measurement.n6.f2844a
            r8.<init>(r3, r1, r4, r9)
            goto L_0x019b
        L_0x01bf:
            com.google.android.gms.internal.measurement.p6 r1 = com.google.android.gms.internal.measurement.p6.b()
            throw r1
        L_0x01c4:
            com.google.android.gms.internal.measurement.p6 r1 = com.google.android.gms.internal.measurement.p6.b()
            throw r1
        L_0x01c9:
            int r1 = s6.a.U(r3, r4, r7)
            int r4 = r7.f2685a
            if (r4 < 0) goto L_0x0222
            if (r4 != 0) goto L_0x01d5
        L_0x01d3:
            r8 = r1
            goto L_0x01fc
        L_0x01d5:
            int r8 = r1 + r4
            boolean r9 = com.google.android.gms.internal.measurement.q8.a(r3, r1, r8)
            if (r9 == 0) goto L_0x021d
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = com.google.android.gms.internal.measurement.n6.f2844a
            r9.<init>(r3, r1, r4, r10)
        L_0x01e4:
            r12.add(r9)
        L_0x01e7:
            if (r8 >= r5) goto L_0x021a
            int r1 = s6.a.U(r3, r8, r7)
            int r4 = r7.f2685a
            if (r2 != r4) goto L_0x021a
            int r1 = s6.a.U(r3, r1, r7)
            int r4 = r7.f2685a
            if (r4 < 0) goto L_0x0215
            if (r4 != 0) goto L_0x0200
            goto L_0x01d3
        L_0x01fc:
            r12.add(r6)
            goto L_0x01e7
        L_0x0200:
            int r8 = r1 + r4
            boolean r9 = com.google.android.gms.internal.measurement.q8.a(r3, r1, r8)
            if (r9 == 0) goto L_0x0210
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = com.google.android.gms.internal.measurement.n6.f2844a
            r9.<init>(r3, r1, r4, r10)
            goto L_0x01e4
        L_0x0210:
            com.google.android.gms.internal.measurement.p6 r1 = com.google.android.gms.internal.measurement.p6.d()
            throw r1
        L_0x0215:
            com.google.android.gms.internal.measurement.p6 r1 = com.google.android.gms.internal.measurement.p6.b()
            throw r1
        L_0x021a:
            r1 = r8
            goto L_0x03ec
        L_0x021d:
            com.google.android.gms.internal.measurement.p6 r1 = com.google.android.gms.internal.measurement.p6.d()
            throw r1
        L_0x0222:
            com.google.android.gms.internal.measurement.p6 r1 = com.google.android.gms.internal.measurement.p6.b()
            throw r1
        L_0x0227:
            r1 = 0
            if (r6 != r15) goto L_0x0250
            com.google.android.gms.internal.measurement.f5 r12 = (com.google.android.gms.internal.measurement.f5) r12
            int r2 = s6.a.U(r3, r4, r7)
            int r4 = r7.f2685a
            int r4 = r4 + r2
        L_0x0233:
            if (r2 >= r4) goto L_0x0246
            int r2 = s6.a.k0(r3, r2, r7)
            long r5 = r7.f2686b
            int r5 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r5 == 0) goto L_0x0241
            r5 = r13
            goto L_0x0242
        L_0x0241:
            r5 = r1
        L_0x0242:
            r12.h(r5)
            goto L_0x0233
        L_0x0246:
            if (r2 != r4) goto L_0x024b
        L_0x0248:
            r1 = r2
            goto L_0x03ec
        L_0x024b:
            com.google.android.gms.internal.measurement.p6 r1 = com.google.android.gms.internal.measurement.p6.a()
            throw r1
        L_0x0250:
            if (r6 != 0) goto L_0x03eb
            com.google.android.gms.internal.measurement.f5 r12 = (com.google.android.gms.internal.measurement.f5) r12
            int r4 = s6.a.k0(r3, r4, r7)
            long r8 = r7.f2686b
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 == 0) goto L_0x025f
            goto L_0x0278
        L_0x025f:
            r6 = r1
        L_0x0260:
            r12.h(r6)
            if (r4 >= r5) goto L_0x027a
            int r6 = s6.a.U(r3, r4, r7)
            int r8 = r7.f2685a
            if (r2 == r8) goto L_0x026e
            goto L_0x027a
        L_0x026e:
            int r4 = s6.a.k0(r3, r6, r7)
            long r8 = r7.f2686b
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 == 0) goto L_0x025f
        L_0x0278:
            r6 = r13
            goto L_0x0260
        L_0x027a:
            return r4
        L_0x027b:
            if (r6 != r15) goto L_0x029b
            com.google.android.gms.internal.measurement.g6 r12 = (com.google.android.gms.internal.measurement.g6) r12
            int r1 = s6.a.U(r3, r4, r7)
            int r2 = r7.f2685a
            int r2 = r2 + r1
        L_0x0286:
            if (r1 >= r2) goto L_0x0292
            int r4 = s6.a.o0(r1, r3)
            r12.h(r4)
            int r1 = r1 + 4
            goto L_0x0286
        L_0x0292:
            if (r1 != r2) goto L_0x0296
            goto L_0x03ec
        L_0x0296:
            com.google.android.gms.internal.measurement.p6 r1 = com.google.android.gms.internal.measurement.p6.a()
            throw r1
        L_0x029b:
            if (r6 != r14) goto L_0x03eb
            com.google.android.gms.internal.measurement.g6 r12 = (com.google.android.gms.internal.measurement.g6) r12
        L_0x029f:
            int r1 = s6.a.o0(r4, r3)
            r12.h(r1)
            int r4 = r4 + 4
            if (r4 >= r5) goto L_0x02b5
            int r1 = s6.a.U(r3, r4, r7)
            int r6 = r7.f2685a
            if (r2 == r6) goto L_0x02b3
            goto L_0x02b5
        L_0x02b3:
            r4 = r1
            goto L_0x029f
        L_0x02b5:
            return r4
        L_0x02b6:
            if (r6 != r15) goto L_0x02d6
            com.google.android.gms.internal.measurement.x6 r12 = (com.google.android.gms.internal.measurement.x6) r12
            int r1 = s6.a.U(r3, r4, r7)
            int r2 = r7.f2685a
            int r2 = r2 + r1
        L_0x02c1:
            if (r1 >= r2) goto L_0x02cd
            long r4 = s6.a.u0(r1, r3)
            r12.h(r4)
            int r1 = r1 + 8
            goto L_0x02c1
        L_0x02cd:
            if (r1 != r2) goto L_0x02d1
            goto L_0x03ec
        L_0x02d1:
            com.google.android.gms.internal.measurement.p6 r1 = com.google.android.gms.internal.measurement.p6.a()
            throw r1
        L_0x02d6:
            if (r6 != r13) goto L_0x03eb
            com.google.android.gms.internal.measurement.x6 r12 = (com.google.android.gms.internal.measurement.x6) r12
        L_0x02da:
            long r8 = s6.a.u0(r4, r3)
            r12.h(r8)
            int r4 = r4 + 8
            if (r4 >= r5) goto L_0x02f0
            int r1 = s6.a.U(r3, r4, r7)
            int r6 = r7.f2685a
            if (r2 == r6) goto L_0x02ee
            goto L_0x02f0
        L_0x02ee:
            r4 = r1
            goto L_0x02da
        L_0x02f0:
            return r4
        L_0x02f1:
            if (r6 != r15) goto L_0x02f9
            int r1 = s6.a.D0(r3, r4, r12, r7)
            goto L_0x03ec
        L_0x02f9:
            if (r6 == 0) goto L_0x02fd
            goto L_0x03eb
        L_0x02fd:
            r22 = r18
            r23 = r19
            r24 = r20
            r25 = r12
            r26 = r30
            int r1 = s6.a.C0(r21, r22, r23, r24, r25, r26)
            return r1
        L_0x030c:
            if (r6 != r15) goto L_0x032c
            com.google.android.gms.internal.measurement.x6 r12 = (com.google.android.gms.internal.measurement.x6) r12
            int r1 = s6.a.U(r3, r4, r7)
            int r2 = r7.f2685a
            int r2 = r2 + r1
        L_0x0317:
            if (r1 >= r2) goto L_0x0323
            int r1 = s6.a.k0(r3, r1, r7)
            long r4 = r7.f2686b
            r12.h(r4)
            goto L_0x0317
        L_0x0323:
            if (r1 != r2) goto L_0x0327
            goto L_0x03ec
        L_0x0327:
            com.google.android.gms.internal.measurement.p6 r1 = com.google.android.gms.internal.measurement.p6.a()
            throw r1
        L_0x032c:
            if (r6 != 0) goto L_0x03eb
            com.google.android.gms.internal.measurement.x6 r12 = (com.google.android.gms.internal.measurement.x6) r12
        L_0x0330:
            int r1 = s6.a.k0(r3, r4, r7)
            long r8 = r7.f2686b
            r12.h(r8)
            if (r1 >= r5) goto L_0x0343
            int r4 = s6.a.U(r3, r1, r7)
            int r6 = r7.f2685a
            if (r2 == r6) goto L_0x0330
        L_0x0343:
            return r1
        L_0x0344:
            if (r6 != r15) goto L_0x0368
            com.google.android.gms.internal.measurement.y5 r12 = (com.google.android.gms.internal.measurement.y5) r12
            int r1 = s6.a.U(r3, r4, r7)
            int r2 = r7.f2685a
            int r2 = r2 + r1
        L_0x034f:
            if (r1 >= r2) goto L_0x035f
            int r4 = s6.a.o0(r1, r3)
            float r4 = java.lang.Float.intBitsToFloat(r4)
            r12.h(r4)
            int r1 = r1 + 4
            goto L_0x034f
        L_0x035f:
            if (r1 != r2) goto L_0x0363
            goto L_0x03ec
        L_0x0363:
            com.google.android.gms.internal.measurement.p6 r1 = com.google.android.gms.internal.measurement.p6.a()
            throw r1
        L_0x0368:
            if (r6 != r14) goto L_0x03eb
            com.google.android.gms.internal.measurement.y5 r12 = (com.google.android.gms.internal.measurement.y5) r12
        L_0x036c:
            int r1 = s6.a.o0(r4, r3)
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r12.h(r1)
            int r4 = r4 + 4
            if (r4 >= r5) goto L_0x0386
            int r1 = s6.a.U(r3, r4, r7)
            int r6 = r7.f2685a
            if (r2 == r6) goto L_0x0384
            goto L_0x0386
        L_0x0384:
            r4 = r1
            goto L_0x036c
        L_0x0386:
            return r4
        L_0x0387:
            if (r6 != r15) goto L_0x03aa
            com.google.android.gms.internal.measurement.p5 r12 = (com.google.android.gms.internal.measurement.p5) r12
            int r1 = s6.a.U(r3, r4, r7)
            int r2 = r7.f2685a
            int r2 = r2 + r1
        L_0x0392:
            if (r1 >= r2) goto L_0x03a2
            long r4 = s6.a.u0(r1, r3)
            double r4 = java.lang.Double.longBitsToDouble(r4)
            r12.h(r4)
            int r1 = r1 + 8
            goto L_0x0392
        L_0x03a2:
            if (r1 != r2) goto L_0x03a5
            goto L_0x03ec
        L_0x03a5:
            com.google.android.gms.internal.measurement.p6 r1 = com.google.android.gms.internal.measurement.p6.a()
            throw r1
        L_0x03aa:
            if (r6 != r13) goto L_0x03eb
            com.google.android.gms.internal.measurement.p5 r12 = (com.google.android.gms.internal.measurement.p5) r12
        L_0x03ae:
            long r8 = s6.a.u0(r4, r3)
            double r8 = java.lang.Double.longBitsToDouble(r8)
            r12.h(r8)
            int r4 = r4 + 8
            if (r4 >= r5) goto L_0x03c8
            int r1 = s6.a.U(r3, r4, r7)
            int r6 = r7.f2685a
            if (r2 == r6) goto L_0x03c6
            goto L_0x03c8
        L_0x03c6:
            r4 = r1
            goto L_0x03ae
        L_0x03c8:
            return r4
        L_0x03c9:
            java.lang.Object r8 = r7.f2687c
            r12.add(r8)
            if (r4 >= r5) goto L_0x03ea
            int r8 = s6.a.U(r3, r4, r7)
            int r9 = r7.f2685a
            if (r2 == r9) goto L_0x03d9
            goto L_0x03ea
        L_0x03d9:
            r22 = r1
            r23 = r18
            r24 = r8
            r25 = r20
            r26 = r6
            r27 = r30
            int r4 = s6.a.B0(r22, r23, r24, r25, r26, r27)
            goto L_0x03c9
        L_0x03ea:
            return r4
        L_0x03eb:
            r1 = r4
        L_0x03ec:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.l7.B(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.google.android.gms.internal.measurement.e5):int");
    }

    public final void C(Object obj, int i10, long j8) {
        Object F = F(i10);
        Unsafe unsafe = f2782o;
        Object object = unsafe.getObject(obj, j8);
        if (!((d7) object).e()) {
            d7 d10 = d7.c().d();
            e7.b(d10, object);
            unsafe.putObject(obj, j8, d10);
        }
        c7 c7Var = (c7) F;
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ca, code lost:
        if (r3 == null) goto L_0x00cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00cc, code lost:
        r3 = r11.f2687c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00cf, code lost:
        r3 = com.google.android.gms.internal.measurement.n6.c(r3, r11.f2687c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00e3, code lost:
        r14.putObject(r1, r9, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0106, code lost:
        r14.putInt(r1, r12, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0153, code lost:
        r3 = java.lang.Integer.valueOf(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0161, code lost:
        r3 = java.lang.Long.valueOf(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0165, code lost:
        r14.putObject(r1, r9, r3);
        r14.putInt(r1, r12, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x016b, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:?, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:?, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x004b, code lost:
        if (r3 == null) goto L_0x00cc;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int D(T r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, int r25, long r26, int r28, com.google.android.gms.internal.measurement.e5 r29) {
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
            int[] r12 = r0.f2783a
            r7 = r12[r7]
            r12 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r7 & r12
            long r12 = (long) r7
            r7 = 3
            r15 = 1
            sun.misc.Unsafe r14 = f2782o
            switch(r25) {
                case 51: goto L_0x0185;
                case 52: goto L_0x016c;
                case 53: goto L_0x0158;
                case 54: goto L_0x0158;
                case 55: goto L_0x014a;
                case 56: goto L_0x0136;
                case 57: goto L_0x0120;
                case 58: goto L_0x010b;
                case 59: goto L_0x00d6;
                case 60: goto L_0x00b1;
                case 61: goto L_0x00a4;
                case 62: goto L_0x014a;
                case 63: goto L_0x006f;
                case 64: goto L_0x0120;
                case 65: goto L_0x0136;
                case 66: goto L_0x005f;
                case 67: goto L_0x004f;
                case 68: goto L_0x0028;
                default: goto L_0x0026;
            }
        L_0x0026:
            goto L_0x019d
        L_0x0028:
            if (r5 != r7) goto L_0x019d
            com.google.android.gms.internal.measurement.t7 r5 = r0.E(r6)
            r2 = r2 & -8
            r6 = r2 | 4
            r2 = r5
            r3 = r18
            r4 = r19
            r5 = r20
            r7 = r29
            int r2 = s6.a.B0(r2, r3, r4, r5, r6, r7)
            int r3 = r14.getInt(r1, r12)
            if (r3 != r8) goto L_0x004a
            java.lang.Object r3 = r14.getObject(r1, r9)
            goto L_0x004b
        L_0x004a:
            r3 = 0
        L_0x004b:
            if (r3 != 0) goto L_0x00cf
            goto L_0x00cc
        L_0x004f:
            if (r5 == 0) goto L_0x0053
            goto L_0x019d
        L_0x0053:
            int r2 = s6.a.k0(r3, r4, r11)
            long r3 = r11.f2686b
            long r3 = androidx.databinding.a.H(r3)
            goto L_0x0161
        L_0x005f:
            if (r5 == 0) goto L_0x0063
            goto L_0x019d
        L_0x0063:
            int r2 = s6.a.U(r3, r4, r11)
            int r3 = r11.f2685a
            int r3 = androidx.databinding.a.D(r3)
            goto L_0x0153
        L_0x006f:
            if (r5 != 0) goto L_0x019d
            int r3 = s6.a.U(r3, r4, r11)
            int r4 = r11.f2685a
            int r5 = r6 / 3
            int r5 = r5 + r5
            int r5 = r5 + r15
            java.lang.Object[] r6 = r0.f2784b
            r5 = r6[r5]
            com.google.android.gms.internal.measurement.j6 r5 = (com.google.android.gms.internal.measurement.j6) r5
            if (r5 == 0) goto L_0x0097
            boolean r5 = r5.d(r4)
            if (r5 == 0) goto L_0x008a
            goto L_0x0097
        L_0x008a:
            com.google.android.gms.internal.measurement.f8 r1 = t(r17)
            long r4 = (long) r4
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r1.c(r2, r4)
            goto L_0x00a1
        L_0x0097:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r14.putObject(r1, r9, r2)
            r14.putInt(r1, r12, r8)
        L_0x00a1:
            r2 = r3
            goto L_0x019e
        L_0x00a4:
            r2 = 2
            if (r5 == r2) goto L_0x00a9
            goto L_0x019d
        L_0x00a9:
            int r2 = s6.a.z0(r3, r4, r11)
            java.lang.Object r3 = r11.f2687c
            goto L_0x0165
        L_0x00b1:
            r2 = 2
            if (r5 != r2) goto L_0x019d
            com.google.android.gms.internal.measurement.t7 r2 = r0.E(r6)
            r5 = r20
            int r2 = s6.a.A0(r2, r3, r4, r5, r11)
            int r3 = r14.getInt(r1, r12)
            if (r3 != r8) goto L_0x00c9
            java.lang.Object r3 = r14.getObject(r1, r9)
            goto L_0x00ca
        L_0x00c9:
            r3 = 0
        L_0x00ca:
            if (r3 != 0) goto L_0x00cf
        L_0x00cc:
            java.lang.Object r3 = r11.f2687c
            goto L_0x00e3
        L_0x00cf:
            java.lang.Object r4 = r11.f2687c
            com.google.android.gms.internal.measurement.f6 r3 = com.google.android.gms.internal.measurement.n6.c(r3, r4)
            goto L_0x00e3
        L_0x00d6:
            r2 = 2
            if (r5 != r2) goto L_0x019d
            int r2 = s6.a.U(r3, r4, r11)
            int r4 = r11.f2685a
            if (r4 != 0) goto L_0x00e7
            java.lang.String r3 = ""
        L_0x00e3:
            r14.putObject(r1, r9, r3)
            goto L_0x0106
        L_0x00e7:
            r5 = 536870912(0x20000000, float:1.0842022E-19)
            r5 = r24 & r5
            if (r5 == 0) goto L_0x00fb
            int r5 = r2 + r4
            boolean r5 = com.google.android.gms.internal.measurement.q8.a(r3, r2, r5)
            if (r5 == 0) goto L_0x00f6
            goto L_0x00fb
        L_0x00f6:
            com.google.android.gms.internal.measurement.p6 r1 = com.google.android.gms.internal.measurement.p6.d()
            throw r1
        L_0x00fb:
            java.lang.String r5 = new java.lang.String
            java.nio.charset.Charset r6 = com.google.android.gms.internal.measurement.n6.f2844a
            r5.<init>(r3, r2, r4, r6)
            r14.putObject(r1, r9, r5)
            int r2 = r2 + r4
        L_0x0106:
            r14.putInt(r1, r12, r8)
            goto L_0x019e
        L_0x010b:
            if (r5 != 0) goto L_0x019d
            int r2 = s6.a.k0(r3, r4, r11)
            long r3 = r11.f2686b
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L_0x011a
            goto L_0x011b
        L_0x011a:
            r15 = 0
        L_0x011b:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r15)
            goto L_0x0165
        L_0x0120:
            r2 = 5
            if (r5 == r2) goto L_0x0125
            goto L_0x019d
        L_0x0125:
            int r2 = s6.a.o0(r4, r3)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r14.putObject(r1, r9, r2)
            r14.putInt(r1, r12, r8)
            int r1 = r4 + 4
            return r1
        L_0x0136:
            if (r5 == r15) goto L_0x0139
            goto L_0x019d
        L_0x0139:
            long r2 = s6.a.u0(r4, r3)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r14.putObject(r1, r9, r2)
            r14.putInt(r1, r12, r8)
            int r1 = r4 + 8
            return r1
        L_0x014a:
            if (r5 == 0) goto L_0x014d
            goto L_0x019d
        L_0x014d:
            int r2 = s6.a.U(r3, r4, r11)
            int r3 = r11.f2685a
        L_0x0153:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x0165
        L_0x0158:
            if (r5 == 0) goto L_0x015b
            goto L_0x019d
        L_0x015b:
            int r2 = s6.a.k0(r3, r4, r11)
            long r3 = r11.f2686b
        L_0x0161:
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
        L_0x0165:
            r14.putObject(r1, r9, r3)
            r14.putInt(r1, r12, r8)
            return r2
        L_0x016c:
            r2 = 5
            if (r5 == r2) goto L_0x0170
            goto L_0x019d
        L_0x0170:
            int r2 = s6.a.o0(r4, r3)
            float r2 = java.lang.Float.intBitsToFloat(r2)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r14.putObject(r1, r9, r2)
            r14.putInt(r1, r12, r8)
            int r1 = r4 + 4
            return r1
        L_0x0185:
            if (r5 == r15) goto L_0x0188
            goto L_0x019d
        L_0x0188:
            long r2 = s6.a.u0(r4, r3)
            double r2 = java.lang.Double.longBitsToDouble(r2)
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            r14.putObject(r1, r9, r2)
            r14.putInt(r1, r12, r8)
            int r1 = r4 + 8
            return r1
        L_0x019d:
            r2 = r4
        L_0x019e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.l7.D(java.lang.Object, byte[], int, int, int, int, int, int, int, long, int, com.google.android.gms.internal.measurement.e5):int");
    }

    public final t7 E(int i10) {
        int i11 = i10 / 3;
        int i12 = i11 + i11;
        Object[] objArr = this.f2784b;
        t7 t7Var = (t7) objArr[i12];
        if (t7Var != null) {
            return t7Var;
        }
        t7 a10 = q7.f2894c.a((Class) objArr[i12 + 1]);
        objArr[i12] = a10;
        return a10;
    }

    public final Object F(int i10) {
        int i11 = i10 / 3;
        return this.f2784b[i11 + i11];
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v5, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00e3, code lost:
        r9.putInt(r14, r3, r1);
        r7 = r0;
        r13 = r36;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0112, code lost:
        r1 = r11.f2687c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x011c, code lost:
        r13 = r36;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x013a, code lost:
        r9.putObject(r14, r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x015a, code lost:
        r7 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x019a, code lost:
        r7 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01b5, code lost:
        r0 = r23 | r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01b7, code lost:
        r5 = r6;
        r6 = r0;
        r0 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01e6, code lost:
        r4 = r7 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01e8, code lost:
        r7 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01ea, code lost:
        r28 = r6;
        r2 = r7;
        r29 = r9;
        r8 = r10;
        r15 = r14;
        r6 = r23;
        r19 = 0;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void G(java.lang.Object r33, byte[] r34, int r35, int r36, com.google.android.gms.internal.measurement.e5 r37) {
        /*
            r32 = this;
            r15 = r32
            r14 = r33
            r12 = r34
            r13 = r36
            r11 = r37
            sun.misc.Unsafe r9 = f2782o
            r8 = 0
            r0 = r35
            r2 = r8
            r6 = r2
            r1 = -1
            r5 = 1048575(0xfffff, float:1.469367E-39)
        L_0x0015:
            if (r0 >= r13) goto L_0x0322
            int r3 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x0027
            int r0 = s6.a.d0(r0, r12, r3, r11)
            int r3 = r11.f2685a
            r4 = r0
            r16 = r3
            goto L_0x002a
        L_0x0027:
            r16 = r0
            r4 = r3
        L_0x002a:
            int r3 = r16 >>> 3
            r0 = r16 & 7
            int r10 = r15.d
            int r7 = r15.f2785c
            if (r3 <= r1) goto L_0x003f
            int r2 = r2 / 3
            if (r3 < r7) goto L_0x0048
            if (r3 > r10) goto L_0x0048
            int r1 = r15.q(r3, r2)
            goto L_0x0049
        L_0x003f:
            if (r3 < r7) goto L_0x0048
            if (r3 > r10) goto L_0x0048
            int r1 = r15.q(r3, r8)
            goto L_0x0049
        L_0x0048:
            r1 = -1
        L_0x0049:
            r10 = r1
            r7 = -1
            if (r10 != r7) goto L_0x005b
            r20 = r3
            r2 = r4
            r28 = r5
            r18 = r7
            r19 = r8
            r29 = r9
            r15 = r14
            goto L_0x02fe
        L_0x005b:
            int r1 = r10 + 1
            int[] r2 = r15.f2783a
            r1 = r2[r1]
            int r7 = r1 >>> 20
            r7 = r7 & 255(0xff, float:3.57E-43)
            r17 = 1048575(0xfffff, float:1.469367E-39)
            r8 = r1 & r17
            r20 = r3
            r35 = r4
            long r3 = (long) r8
            r8 = 17
            r21 = r1
            if (r7 > r8) goto L_0x01f9
            int r8 = r10 + 2
            r2 = r2[r8]
            int r8 = r2 >>> 20
            r1 = 1
            int r8 = r1 << r8
            r13 = 1048575(0xfffff, float:1.469367E-39)
            r2 = r2 & r13
            if (r2 == r5) goto L_0x009c
            if (r5 == r13) goto L_0x008f
            r23 = r2
            long r1 = (long) r5
            r9.putInt(r14, r1, r6)
            r1 = r23
            goto L_0x0090
        L_0x008f:
            r1 = r2
        L_0x0090:
            if (r1 == r13) goto L_0x0098
            long r5 = (long) r1
            int r2 = r9.getInt(r14, r5)
            r6 = r2
        L_0x0098:
            r23 = r6
            r6 = r1
            goto L_0x009f
        L_0x009c:
            r23 = r6
            r6 = r5
        L_0x009f:
            r1 = 5
            switch(r7) {
                case 0: goto L_0x01d2;
                case 1: goto L_0x01bc;
                case 2: goto L_0x019c;
                case 3: goto L_0x019c;
                case 4: goto L_0x0189;
                case 5: goto L_0x0170;
                case 6: goto L_0x015d;
                case 7: goto L_0x013f;
                case 8: goto L_0x0121;
                case 9: goto L_0x00fb;
                case 10: goto L_0x00ed;
                case 11: goto L_0x0189;
                case 12: goto L_0x00d9;
                case 13: goto L_0x015d;
                case 14: goto L_0x0170;
                case 15: goto L_0x00ca;
                case 16: goto L_0x00ab;
                default: goto L_0x00a3;
            }
        L_0x00a3:
            r7 = r35
            r24 = r13
            r13 = r36
            goto L_0x01ea
        L_0x00ab:
            r5 = r35
            if (r0 != 0) goto L_0x011c
            int r7 = s6.a.k0(r12, r5, r11)
            long r0 = r11.f2686b
            long r16 = androidx.databinding.a.H(r0)
            r0 = r9
            r1 = r33
            r2 = r3
            r4 = r16
            r0.putLong(r1, r2, r4)
            r0 = r23 | r8
            r24 = r13
            r13 = r36
            goto L_0x01b7
        L_0x00ca:
            r5 = r35
            if (r0 != 0) goto L_0x011c
            int r0 = s6.a.U(r12, r5, r11)
            int r1 = r11.f2685a
            int r1 = androidx.databinding.a.D(r1)
            goto L_0x00e3
        L_0x00d9:
            r5 = r35
            if (r0 != 0) goto L_0x011c
            int r0 = s6.a.U(r12, r5, r11)
            int r1 = r11.f2685a
        L_0x00e3:
            r9.putInt(r14, r3, r1)
            r7 = r0
            r24 = r13
            r13 = r36
            goto L_0x01b5
        L_0x00ed:
            r5 = r35
            r1 = 2
            if (r0 != r1) goto L_0x011c
            int r0 = s6.a.z0(r12, r5, r11)
            r24 = r13
            r13 = r36
            goto L_0x0112
        L_0x00fb:
            r5 = r35
            r1 = 2
            if (r0 != r1) goto L_0x011c
            com.google.android.gms.internal.measurement.t7 r0 = r15.E(r10)
            r24 = r13
            r13 = r36
            int r0 = s6.a.A0(r0, r12, r5, r13, r11)
            java.lang.Object r1 = r9.getObject(r14, r3)
            if (r1 != 0) goto L_0x0115
        L_0x0112:
            java.lang.Object r1 = r11.f2687c
            goto L_0x013a
        L_0x0115:
            java.lang.Object r2 = r11.f2687c
            com.google.android.gms.internal.measurement.f6 r1 = com.google.android.gms.internal.measurement.n6.c(r1, r2)
            goto L_0x013a
        L_0x011c:
            r24 = r13
            r13 = r36
            goto L_0x015a
        L_0x0121:
            r5 = r35
            r24 = r13
            r1 = 2
            r13 = r36
            if (r0 != r1) goto L_0x015a
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r21 & r0
            if (r0 != 0) goto L_0x0135
            int r0 = s6.a.w0(r12, r5, r11)
            goto L_0x0112
        L_0x0135:
            int r0 = s6.a.x0(r12, r5, r11)
            goto L_0x0112
        L_0x013a:
            r9.putObject(r14, r3, r1)
            goto L_0x019a
        L_0x013f:
            r5 = r35
            r24 = r13
            r13 = r36
            if (r0 != 0) goto L_0x015a
            int r0 = s6.a.k0(r12, r5, r11)
            long r1 = r11.f2686b
            r21 = 0
            int r1 = (r1 > r21 ? 1 : (r1 == r21 ? 0 : -1))
            if (r1 == 0) goto L_0x0155
            r1 = 1
            goto L_0x0156
        L_0x0155:
            r1 = 0
        L_0x0156:
            com.google.android.gms.internal.measurement.o8.k(r14, r3, r1)
            goto L_0x019a
        L_0x015a:
            r7 = r5
            goto L_0x01ea
        L_0x015d:
            r5 = r35
            r24 = r13
            r13 = r36
            if (r0 != r1) goto L_0x015a
            int r0 = s6.a.o0(r5, r12)
            r9.putInt(r14, r3, r0)
            int r4 = r5 + 4
            goto L_0x01e8
        L_0x0170:
            r5 = r35
            r24 = r13
            r1 = 1
            r13 = r36
            if (r0 != r1) goto L_0x015a
            long r16 = s6.a.u0(r5, r12)
            r0 = r9
            r1 = r33
            r2 = r3
            r7 = r5
            r4 = r16
            r0.putLong(r1, r2, r4)
            goto L_0x01e6
        L_0x0189:
            r7 = r35
            r24 = r13
            r13 = r36
            if (r0 != 0) goto L_0x01ea
            int r0 = s6.a.U(r12, r7, r11)
            int r1 = r11.f2685a
            r9.putInt(r14, r3, r1)
        L_0x019a:
            r7 = r0
            goto L_0x01b5
        L_0x019c:
            r7 = r35
            r24 = r13
            r13 = r36
            if (r0 != 0) goto L_0x01ea
            int r7 = s6.a.k0(r12, r7, r11)
            long r1 = r11.f2686b
            r0 = r9
            r16 = r1
            r1 = r33
            r2 = r3
            r4 = r16
            r0.putLong(r1, r2, r4)
        L_0x01b5:
            r0 = r23 | r8
        L_0x01b7:
            r5 = r6
            r6 = r0
            r0 = r7
            goto L_0x0239
        L_0x01bc:
            r7 = r35
            r24 = r13
            r13 = r36
            if (r0 != r1) goto L_0x01ea
            int r0 = s6.a.o0(r7, r12)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            com.google.android.gms.internal.measurement.o8.m(r14, r3, r0)
            int r4 = r7 + 4
            goto L_0x01e8
        L_0x01d2:
            r7 = r35
            r24 = r13
            r1 = 1
            r13 = r36
            if (r0 != r1) goto L_0x01ea
            long r0 = s6.a.u0(r7, r12)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            com.google.android.gms.internal.measurement.o8.o(r14, r3, r0)
        L_0x01e6:
            int r4 = r7 + 8
        L_0x01e8:
            r7 = r4
            goto L_0x01b5
        L_0x01ea:
            r28 = r6
            r2 = r7
            r29 = r9
            r8 = r10
            r15 = r14
            r6 = r23
            r18 = -1
            r19 = 0
            goto L_0x02fe
        L_0x01f9:
            r8 = r35
            r24 = 1048575(0xfffff, float:1.469367E-39)
            r1 = 27
            if (r7 != r1) goto L_0x024f
            r1 = 2
            if (r0 != r1) goto L_0x023f
            java.lang.Object r0 = r9.getObject(r14, r3)
            com.google.android.gms.internal.measurement.m6 r0 = (com.google.android.gms.internal.measurement.m6) r0
            boolean r1 = r0.zza()
            if (r1 != 0) goto L_0x0222
            int r1 = r0.size()
            if (r1 != 0) goto L_0x021a
            r1 = 10
            goto L_0x021b
        L_0x021a:
            int r1 = r1 + r1
        L_0x021b:
            com.google.android.gms.internal.measurement.m6 r0 = r0.x(r1)
            r9.putObject(r14, r3, r0)
        L_0x0222:
            r7 = r0
            com.google.android.gms.internal.measurement.t7 r0 = r15.E(r10)
            r1 = r16
            r2 = r34
            r3 = r8
            r4 = r36
            r8 = r5
            r5 = r7
            r7 = r6
            r6 = r37
            int r0 = s6.a.F0(r0, r1, r2, r3, r4, r5, r6)
            r6 = r7
            r5 = r8
        L_0x0239:
            r2 = r10
            r1 = r20
            r8 = 0
            goto L_0x0015
        L_0x023f:
            r7 = r6
            r28 = r5
            r27 = r7
            r15 = r8
            r29 = r9
            r30 = r10
            r18 = -1
            r19 = 0
            goto L_0x02bb
        L_0x024f:
            r31 = r6
            r6 = r5
            r5 = r31
            r1 = 49
            if (r7 > r1) goto L_0x029b
            r1 = r21
            long r1 = (long) r1
            r35 = r0
            r0 = r32
            r21 = r1
            r1 = r33
            r2 = r34
            r25 = r3
            r3 = r8
            r4 = r36
            r27 = r5
            r5 = r16
            r28 = r6
            r6 = r20
            r17 = r7
            r18 = -1
            r7 = r35
            r15 = r8
            r19 = 0
            r8 = r10
            r29 = r9
            r30 = r10
            r9 = r21
            r11 = r17
            r12 = r25
            r14 = r37
            int r0 = r0.B(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 == r15) goto L_0x0294
            r15 = r33
            r17 = r30
            goto L_0x02f3
        L_0x0294:
            r15 = r33
            r4 = r0
            r17 = r30
            goto L_0x02f9
        L_0x029b:
            r35 = r0
            r25 = r3
            r27 = r5
            r28 = r6
            r17 = r7
            r15 = r8
            r29 = r9
            r30 = r10
            r1 = r21
            r18 = -1
            r19 = 0
            r0 = 50
            r9 = r17
            if (r9 != r0) goto L_0x02ce
            r7 = r35
            r0 = 2
            if (r7 == r0) goto L_0x02c1
        L_0x02bb:
            r4 = r15
            r17 = r30
            r15 = r33
            goto L_0x02f9
        L_0x02c1:
            r14 = r32
            r15 = r33
            r10 = r25
            r13 = r30
            r14.C(r15, r13, r10)
            r0 = 0
            throw r0
        L_0x02ce:
            r14 = r32
            r7 = r35
            r12 = r15
            r10 = r25
            r13 = r30
            r15 = r33
            r0 = r32
            r8 = r1
            r1 = r33
            r2 = r34
            r3 = r12
            r4 = r36
            r5 = r16
            r6 = r20
            r14 = r12
            r12 = r13
            r17 = r13
            r13 = r37
            int r0 = r0.D(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 == r14) goto L_0x02f8
        L_0x02f3:
            r2 = r17
            r6 = r27
            goto L_0x030f
        L_0x02f8:
            r4 = r0
        L_0x02f9:
            r2 = r4
            r8 = r17
            r6 = r27
        L_0x02fe:
            com.google.android.gms.internal.measurement.f8 r4 = t(r33)
            r0 = r16
            r1 = r34
            r3 = r36
            r5 = r37
            int r0 = s6.a.G0(r0, r1, r2, r3, r4, r5)
            r2 = r8
        L_0x030f:
            r5 = r28
            r12 = r34
            r13 = r36
            r11 = r37
            r14 = r15
            r8 = r19
            r1 = r20
            r9 = r29
            r15 = r32
            goto L_0x0015
        L_0x0322:
            r27 = r6
            r29 = r9
            r15 = r14
            r1 = 1048575(0xfffff, float:1.469367E-39)
            if (r5 == r1) goto L_0x0334
            long r1 = (long) r5
            r6 = r27
            r3 = r29
            r3.putInt(r15, r1, r6)
        L_0x0334:
            r1 = r36
            if (r0 != r1) goto L_0x0339
            return
        L_0x0339:
            com.google.android.gms.internal.measurement.p6 r0 = com.google.android.gms.internal.measurement.p6.c()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.l7.G(java.lang.Object, byte[], int, int, com.google.android.gms.internal.measurement.e5):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x008f, code lost:
        r3 = r3 * 53;
        r4 = d(r6, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a4, code lost:
        r3 = r3 * 53;
        r4 = e(r6, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00d6, code lost:
        if (r4 != null) goto L_0x00ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00d9, code lost:
        r3 = r3 * 53;
        r4 = com.google.android.gms.internal.measurement.o8.p(r6, r9).hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00e8, code lost:
        if (r4 != null) goto L_0x00ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00ea, code lost:
        r4 = r4.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00ef, code lost:
        r4 = 37;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00f1, code lost:
        r3 = (r3 * 53) + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00f5, code lost:
        r3 = r3 * 53;
        r4 = ((java.lang.String) com.google.android.gms.internal.measurement.o8.p(r6, r9)).hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0108, code lost:
        r4 = com.google.android.gms.internal.measurement.n6.b(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0121, code lost:
        r4 = java.lang.Float.floatToIntBits(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x012c, code lost:
        r4 = java.lang.Double.doubleToLongBits(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0130, code lost:
        r4 = com.google.android.gms.internal.measurement.n6.a(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0134, code lost:
        r3 = r4 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0136, code lost:
        r2 = r2 + 3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(T r9) {
        /*
            r8 = this;
            int[] r0 = r8.f2783a
            int r1 = r0.length
            r2 = 0
            r3 = r2
        L_0x0005:
            if (r2 >= r1) goto L_0x013a
            int r4 = r8.b(r2)
            r5 = r0[r2]
            r6 = 1048575(0xfffff, float:1.469367E-39)
            r6 = r6 & r4
            long r6 = (long) r6
            int r4 = r4 >>> 20
            r4 = r4 & 255(0xff, float:3.57E-43)
            switch(r4) {
                case 0: goto L_0x0126;
                case 1: goto L_0x011b;
                case 2: goto L_0x0114;
                case 3: goto L_0x0114;
                case 4: goto L_0x010d;
                case 5: goto L_0x0114;
                case 6: goto L_0x010d;
                case 7: goto L_0x0102;
                case 8: goto L_0x00f5;
                case 9: goto L_0x00e4;
                case 10: goto L_0x00d9;
                case 11: goto L_0x010d;
                case 12: goto L_0x010d;
                case 13: goto L_0x010d;
                case 14: goto L_0x0114;
                case 15: goto L_0x010d;
                case 16: goto L_0x0114;
                case 17: goto L_0x00d2;
                case 18: goto L_0x00d9;
                case 19: goto L_0x00d9;
                case 20: goto L_0x00d9;
                case 21: goto L_0x00d9;
                case 22: goto L_0x00d9;
                case 23: goto L_0x00d9;
                case 24: goto L_0x00d9;
                case 25: goto L_0x00d9;
                case 26: goto L_0x00d9;
                case 27: goto L_0x00d9;
                case 28: goto L_0x00d9;
                case 29: goto L_0x00d9;
                case 30: goto L_0x00d9;
                case 31: goto L_0x00d9;
                case 32: goto L_0x00d9;
                case 33: goto L_0x00d9;
                case 34: goto L_0x00d9;
                case 35: goto L_0x00d9;
                case 36: goto L_0x00d9;
                case 37: goto L_0x00d9;
                case 38: goto L_0x00d9;
                case 39: goto L_0x00d9;
                case 40: goto L_0x00d9;
                case 41: goto L_0x00d9;
                case 42: goto L_0x00d9;
                case 43: goto L_0x00d9;
                case 44: goto L_0x00d9;
                case 45: goto L_0x00d9;
                case 46: goto L_0x00d9;
                case 47: goto L_0x00d9;
                case 48: goto L_0x00d9;
                case 49: goto L_0x00d9;
                case 50: goto L_0x00d9;
                case 51: goto L_0x00bf;
                case 52: goto L_0x00ac;
                case 53: goto L_0x009e;
                case 54: goto L_0x0097;
                case 55: goto L_0x0089;
                case 56: goto L_0x0082;
                case 57: goto L_0x007b;
                case 58: goto L_0x0067;
                case 59: goto L_0x005f;
                case 60: goto L_0x0057;
                case 61: goto L_0x004f;
                case 62: goto L_0x0048;
                case 63: goto L_0x0041;
                case 64: goto L_0x003a;
                case 65: goto L_0x0032;
                case 66: goto L_0x002b;
                case 67: goto L_0x0023;
                case 68: goto L_0x001b;
                default: goto L_0x0019;
            }
        L_0x0019:
            goto L_0x0136
        L_0x001b:
            boolean r4 = r8.o(r5, r2, r9)
            if (r4 == 0) goto L_0x0136
            goto L_0x00d9
        L_0x0023:
            boolean r4 = r8.o(r5, r2, r9)
            if (r4 == 0) goto L_0x0136
            goto L_0x00a4
        L_0x002b:
            boolean r4 = r8.o(r5, r2, r9)
            if (r4 == 0) goto L_0x0136
            goto L_0x008f
        L_0x0032:
            boolean r4 = r8.o(r5, r2, r9)
            if (r4 == 0) goto L_0x0136
            goto L_0x00a4
        L_0x003a:
            boolean r4 = r8.o(r5, r2, r9)
            if (r4 == 0) goto L_0x0136
            goto L_0x008f
        L_0x0041:
            boolean r4 = r8.o(r5, r2, r9)
            if (r4 == 0) goto L_0x0136
            goto L_0x008f
        L_0x0048:
            boolean r4 = r8.o(r5, r2, r9)
            if (r4 == 0) goto L_0x0136
            goto L_0x008f
        L_0x004f:
            boolean r4 = r8.o(r5, r2, r9)
            if (r4 == 0) goto L_0x0136
            goto L_0x00d9
        L_0x0057:
            boolean r4 = r8.o(r5, r2, r9)
            if (r4 == 0) goto L_0x0136
            goto L_0x00d9
        L_0x005f:
            boolean r4 = r8.o(r5, r2, r9)
            if (r4 == 0) goto L_0x0136
            goto L_0x00f5
        L_0x0067:
            boolean r4 = r8.o(r5, r2, r9)
            if (r4 == 0) goto L_0x0136
            int r3 = r3 * 53
            java.lang.Object r4 = com.google.android.gms.internal.measurement.o8.p(r6, r9)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            goto L_0x0108
        L_0x007b:
            boolean r4 = r8.o(r5, r2, r9)
            if (r4 == 0) goto L_0x0136
            goto L_0x008f
        L_0x0082:
            boolean r4 = r8.o(r5, r2, r9)
            if (r4 == 0) goto L_0x0136
            goto L_0x00a4
        L_0x0089:
            boolean r4 = r8.o(r5, r2, r9)
            if (r4 == 0) goto L_0x0136
        L_0x008f:
            int r3 = r3 * 53
            int r4 = d(r6, r9)
            goto L_0x0134
        L_0x0097:
            boolean r4 = r8.o(r5, r2, r9)
            if (r4 == 0) goto L_0x0136
            goto L_0x00a4
        L_0x009e:
            boolean r4 = r8.o(r5, r2, r9)
            if (r4 == 0) goto L_0x0136
        L_0x00a4:
            int r3 = r3 * 53
            long r4 = e(r6, r9)
            goto L_0x0130
        L_0x00ac:
            boolean r4 = r8.o(r5, r2, r9)
            if (r4 == 0) goto L_0x0136
            int r3 = r3 * 53
            java.lang.Object r4 = com.google.android.gms.internal.measurement.o8.p(r6, r9)
            java.lang.Float r4 = (java.lang.Float) r4
            float r4 = r4.floatValue()
            goto L_0x0121
        L_0x00bf:
            boolean r4 = r8.o(r5, r2, r9)
            if (r4 == 0) goto L_0x0136
            int r3 = r3 * 53
            java.lang.Object r4 = com.google.android.gms.internal.measurement.o8.p(r6, r9)
            java.lang.Double r4 = (java.lang.Double) r4
            double r4 = r4.doubleValue()
            goto L_0x012c
        L_0x00d2:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.o8.p(r6, r9)
            if (r4 == 0) goto L_0x00ef
            goto L_0x00ea
        L_0x00d9:
            int r3 = r3 * 53
            java.lang.Object r4 = com.google.android.gms.internal.measurement.o8.p(r6, r9)
            int r4 = r4.hashCode()
            goto L_0x0134
        L_0x00e4:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.o8.p(r6, r9)
            if (r4 == 0) goto L_0x00ef
        L_0x00ea:
            int r4 = r4.hashCode()
            goto L_0x00f1
        L_0x00ef:
            r4 = 37
        L_0x00f1:
            int r3 = r3 * 53
            int r3 = r3 + r4
            goto L_0x0136
        L_0x00f5:
            int r3 = r3 * 53
            java.lang.Object r4 = com.google.android.gms.internal.measurement.o8.p(r6, r9)
            java.lang.String r4 = (java.lang.String) r4
            int r4 = r4.hashCode()
            goto L_0x0134
        L_0x0102:
            int r3 = r3 * 53
            boolean r4 = com.google.android.gms.internal.measurement.o8.j(r6, r9)
        L_0x0108:
            int r4 = com.google.android.gms.internal.measurement.n6.b(r4)
            goto L_0x0134
        L_0x010d:
            int r3 = r3 * 53
            int r4 = com.google.android.gms.internal.measurement.o8.f(r6, r9)
            goto L_0x0134
        L_0x0114:
            int r3 = r3 * 53
            long r4 = com.google.android.gms.internal.measurement.o8.h(r6, r9)
            goto L_0x0130
        L_0x011b:
            int r3 = r3 * 53
            float r4 = com.google.android.gms.internal.measurement.o8.l(r6, r9)
        L_0x0121:
            int r4 = java.lang.Float.floatToIntBits(r4)
            goto L_0x0134
        L_0x0126:
            int r3 = r3 * 53
            double r4 = com.google.android.gms.internal.measurement.o8.n(r6, r9)
        L_0x012c:
            long r4 = java.lang.Double.doubleToLongBits(r4)
        L_0x0130:
            int r4 = com.google.android.gms.internal.measurement.n6.a(r4)
        L_0x0134:
            int r4 = r4 + r3
            r3 = r4
        L_0x0136:
            int r2 = r2 + 3
            goto L_0x0005
        L_0x013a:
            int r3 = r3 * 53
            com.google.android.gms.internal.measurement.e8<?, ?> r0 = r8.l
            com.google.android.gms.internal.measurement.f8 r0 = r0.d(r9)
            int r0 = r0.hashCode()
            int r0 = r0 + r3
            boolean r1 = r8.f2787f
            if (r1 != 0) goto L_0x014c
            return r0
        L_0x014c:
            com.google.android.gms.internal.measurement.s5<?> r0 = r8.f2793m
            r0.b(r9)
            r9 = 0
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.l7.a(java.lang.Object):int");
    }

    public final int b(int i10) {
        return this.f2783a[i10 + 1];
    }

    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01b6, code lost:
        r3 = r3 + 3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean c(T r10, T r11) {
        /*
            r9 = this;
            int[] r0 = r9.f2783a
            int r1 = r0.length
            r2 = 0
            r3 = r2
        L_0x0005:
            if (r3 >= r1) goto L_0x01ba
            int r4 = r9.b(r3)
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r6 = r4 & r5
            long r6 = (long) r6
            int r4 = r4 >>> 20
            r4 = r4 & 255(0xff, float:3.57E-43)
            switch(r4) {
                case 0: goto L_0x019a;
                case 1: goto L_0x0181;
                case 2: goto L_0x016e;
                case 3: goto L_0x015b;
                case 4: goto L_0x014a;
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
                case 18: goto L_0x003a;
                case 19: goto L_0x003a;
                case 20: goto L_0x003a;
                case 21: goto L_0x003a;
                case 22: goto L_0x003a;
                case 23: goto L_0x003a;
                case 24: goto L_0x003a;
                case 25: goto L_0x003a;
                case 26: goto L_0x003a;
                case 27: goto L_0x003a;
                case 28: goto L_0x003a;
                case 29: goto L_0x003a;
                case 30: goto L_0x003a;
                case 31: goto L_0x003a;
                case 32: goto L_0x003a;
                case 33: goto L_0x003a;
                case 34: goto L_0x003a;
                case 35: goto L_0x003a;
                case 36: goto L_0x003a;
                case 37: goto L_0x003a;
                case 38: goto L_0x003a;
                case 39: goto L_0x003a;
                case 40: goto L_0x003a;
                case 41: goto L_0x003a;
                case 42: goto L_0x003a;
                case 43: goto L_0x003a;
                case 44: goto L_0x003a;
                case 45: goto L_0x003a;
                case 46: goto L_0x003a;
                case 47: goto L_0x003a;
                case 48: goto L_0x003a;
                case 49: goto L_0x003a;
                case 50: goto L_0x003a;
                case 51: goto L_0x001a;
                case 52: goto L_0x001a;
                case 53: goto L_0x001a;
                case 54: goto L_0x001a;
                case 55: goto L_0x001a;
                case 56: goto L_0x001a;
                case 57: goto L_0x001a;
                case 58: goto L_0x001a;
                case 59: goto L_0x001a;
                case 60: goto L_0x001a;
                case 61: goto L_0x001a;
                case 62: goto L_0x001a;
                case 63: goto L_0x001a;
                case 64: goto L_0x001a;
                case 65: goto L_0x001a;
                case 66: goto L_0x001a;
                case 67: goto L_0x001a;
                case 68: goto L_0x001a;
                default: goto L_0x0018;
            }
        L_0x0018:
            goto L_0x01b6
        L_0x001a:
            int r4 = r3 + 2
            r4 = r0[r4]
            r4 = r4 & r5
            long r4 = (long) r4
            int r8 = com.google.android.gms.internal.measurement.o8.f(r4, r10)
            int r4 = com.google.android.gms.internal.measurement.o8.f(r4, r11)
            if (r8 != r4) goto L_0x01b5
            java.lang.Object r4 = com.google.android.gms.internal.measurement.o8.p(r6, r10)
            java.lang.Object r5 = com.google.android.gms.internal.measurement.o8.p(r6, r11)
            boolean r4 = com.google.android.gms.internal.measurement.u7.a(r4, r5)
            if (r4 != 0) goto L_0x01b6
            goto L_0x01b5
        L_0x003a:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.o8.p(r6, r10)
            java.lang.Object r5 = com.google.android.gms.internal.measurement.o8.p(r6, r11)
            boolean r4 = com.google.android.gms.internal.measurement.u7.a(r4, r5)
            if (r4 != 0) goto L_0x01b6
            goto L_0x01b5
        L_0x004a:
            boolean r4 = r9.k(r3, r10, r11)
            if (r4 == 0) goto L_0x01b5
            java.lang.Object r4 = com.google.android.gms.internal.measurement.o8.p(r6, r10)
            java.lang.Object r5 = com.google.android.gms.internal.measurement.o8.p(r6, r11)
            boolean r4 = com.google.android.gms.internal.measurement.u7.a(r4, r5)
            if (r4 == 0) goto L_0x01b5
            goto L_0x01b6
        L_0x0060:
            boolean r4 = r9.k(r3, r10, r11)
            if (r4 == 0) goto L_0x01b5
            long r4 = com.google.android.gms.internal.measurement.o8.h(r6, r10)
            long r6 = com.google.android.gms.internal.measurement.o8.h(r6, r11)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L_0x01b5
            goto L_0x01b6
        L_0x0074:
            boolean r4 = r9.k(r3, r10, r11)
            if (r4 == 0) goto L_0x01b5
            int r4 = com.google.android.gms.internal.measurement.o8.f(r6, r10)
            int r5 = com.google.android.gms.internal.measurement.o8.f(r6, r11)
            if (r4 != r5) goto L_0x01b5
            goto L_0x01b6
        L_0x0086:
            boolean r4 = r9.k(r3, r10, r11)
            if (r4 == 0) goto L_0x01b5
            long r4 = com.google.android.gms.internal.measurement.o8.h(r6, r10)
            long r6 = com.google.android.gms.internal.measurement.o8.h(r6, r11)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L_0x01b5
            goto L_0x01b6
        L_0x009a:
            boolean r4 = r9.k(r3, r10, r11)
            if (r4 == 0) goto L_0x01b5
            int r4 = com.google.android.gms.internal.measurement.o8.f(r6, r10)
            int r5 = com.google.android.gms.internal.measurement.o8.f(r6, r11)
            if (r4 != r5) goto L_0x01b5
            goto L_0x01b6
        L_0x00ac:
            boolean r4 = r9.k(r3, r10, r11)
            if (r4 == 0) goto L_0x01b5
            int r4 = com.google.android.gms.internal.measurement.o8.f(r6, r10)
            int r5 = com.google.android.gms.internal.measurement.o8.f(r6, r11)
            if (r4 != r5) goto L_0x01b5
            goto L_0x01b6
        L_0x00be:
            boolean r4 = r9.k(r3, r10, r11)
            if (r4 == 0) goto L_0x01b5
            int r4 = com.google.android.gms.internal.measurement.o8.f(r6, r10)
            int r5 = com.google.android.gms.internal.measurement.o8.f(r6, r11)
            if (r4 != r5) goto L_0x01b5
            goto L_0x01b6
        L_0x00d0:
            boolean r4 = r9.k(r3, r10, r11)
            if (r4 == 0) goto L_0x01b5
            java.lang.Object r4 = com.google.android.gms.internal.measurement.o8.p(r6, r10)
            java.lang.Object r5 = com.google.android.gms.internal.measurement.o8.p(r6, r11)
            boolean r4 = com.google.android.gms.internal.measurement.u7.a(r4, r5)
            if (r4 == 0) goto L_0x01b5
            goto L_0x01b6
        L_0x00e6:
            boolean r4 = r9.k(r3, r10, r11)
            if (r4 == 0) goto L_0x01b5
            java.lang.Object r4 = com.google.android.gms.internal.measurement.o8.p(r6, r10)
            java.lang.Object r5 = com.google.android.gms.internal.measurement.o8.p(r6, r11)
            boolean r4 = com.google.android.gms.internal.measurement.u7.a(r4, r5)
            if (r4 == 0) goto L_0x01b5
            goto L_0x01b6
        L_0x00fc:
            boolean r4 = r9.k(r3, r10, r11)
            if (r4 == 0) goto L_0x01b5
            java.lang.Object r4 = com.google.android.gms.internal.measurement.o8.p(r6, r10)
            java.lang.Object r5 = com.google.android.gms.internal.measurement.o8.p(r6, r11)
            boolean r4 = com.google.android.gms.internal.measurement.u7.a(r4, r5)
            if (r4 == 0) goto L_0x01b5
            goto L_0x01b6
        L_0x0112:
            boolean r4 = r9.k(r3, r10, r11)
            if (r4 == 0) goto L_0x01b5
            boolean r4 = com.google.android.gms.internal.measurement.o8.j(r6, r10)
            boolean r5 = com.google.android.gms.internal.measurement.o8.j(r6, r11)
            if (r4 != r5) goto L_0x01b5
            goto L_0x01b6
        L_0x0124:
            boolean r4 = r9.k(r3, r10, r11)
            if (r4 == 0) goto L_0x01b5
            int r4 = com.google.android.gms.internal.measurement.o8.f(r6, r10)
            int r5 = com.google.android.gms.internal.measurement.o8.f(r6, r11)
            if (r4 != r5) goto L_0x01b5
            goto L_0x01b6
        L_0x0136:
            boolean r4 = r9.k(r3, r10, r11)
            if (r4 == 0) goto L_0x01b5
            long r4 = com.google.android.gms.internal.measurement.o8.h(r6, r10)
            long r6 = com.google.android.gms.internal.measurement.o8.h(r6, r11)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L_0x01b5
            goto L_0x01b6
        L_0x014a:
            boolean r4 = r9.k(r3, r10, r11)
            if (r4 == 0) goto L_0x01b5
            int r4 = com.google.android.gms.internal.measurement.o8.f(r6, r10)
            int r5 = com.google.android.gms.internal.measurement.o8.f(r6, r11)
            if (r4 != r5) goto L_0x01b5
            goto L_0x01b6
        L_0x015b:
            boolean r4 = r9.k(r3, r10, r11)
            if (r4 == 0) goto L_0x01b5
            long r4 = com.google.android.gms.internal.measurement.o8.h(r6, r10)
            long r6 = com.google.android.gms.internal.measurement.o8.h(r6, r11)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L_0x01b5
            goto L_0x01b6
        L_0x016e:
            boolean r4 = r9.k(r3, r10, r11)
            if (r4 == 0) goto L_0x01b5
            long r4 = com.google.android.gms.internal.measurement.o8.h(r6, r10)
            long r6 = com.google.android.gms.internal.measurement.o8.h(r6, r11)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L_0x01b5
            goto L_0x01b6
        L_0x0181:
            boolean r4 = r9.k(r3, r10, r11)
            if (r4 == 0) goto L_0x01b5
            float r4 = com.google.android.gms.internal.measurement.o8.l(r6, r10)
            int r4 = java.lang.Float.floatToIntBits(r4)
            float r5 = com.google.android.gms.internal.measurement.o8.l(r6, r11)
            int r5 = java.lang.Float.floatToIntBits(r5)
            if (r4 != r5) goto L_0x01b5
            goto L_0x01b6
        L_0x019a:
            boolean r4 = r9.k(r3, r10, r11)
            if (r4 == 0) goto L_0x01b5
            double r4 = com.google.android.gms.internal.measurement.o8.n(r6, r10)
            long r4 = java.lang.Double.doubleToLongBits(r4)
            double r6 = com.google.android.gms.internal.measurement.o8.n(r6, r11)
            long r6 = java.lang.Double.doubleToLongBits(r6)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L_0x01b5
            goto L_0x01b6
        L_0x01b5:
            return r2
        L_0x01b6:
            int r3 = r3 + 3
            goto L_0x0005
        L_0x01ba:
            com.google.android.gms.internal.measurement.e8<?, ?> r0 = r9.l
            com.google.android.gms.internal.measurement.f8 r1 = r0.d(r10)
            com.google.android.gms.internal.measurement.f8 r0 = r0.d(r11)
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x01cb
            return r2
        L_0x01cb:
            boolean r0 = r9.f2787f
            if (r0 != 0) goto L_0x01d1
            r10 = 1
            return r10
        L_0x01d1:
            com.google.android.gms.internal.measurement.s5<?> r0 = r9.f2793m
            r0.b(r10)
            r0.b(r11)
            r10 = 0
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.l7.c(java.lang.Object, java.lang.Object):boolean");
    }

    public final boolean f(T t10) {
        boolean z;
        int i10 = 1048575;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            boolean z10 = true;
            if (i11 < this.f2790i) {
                int i13 = this.f2789h[i11];
                int[] iArr = this.f2783a;
                int i14 = iArr[i13];
                int b10 = b(i13);
                int i15 = iArr[i13 + 2];
                int i16 = i15 & 1048575;
                int i17 = 1 << (i15 >>> 20);
                if (i16 != i10) {
                    if (i16 != 1048575) {
                        i12 = f2782o.getInt(t10, (long) i16);
                    }
                    i10 = i16;
                }
                if ((268435456 & b10) != 0) {
                    if (i10 == 1048575) {
                        z = m(i13, t10);
                    } else if ((i12 & i17) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        return false;
                    }
                }
                int i18 = (b10 >>> 20) & 255;
                if (i18 == 9 || i18 == 17) {
                    if (i10 == 1048575) {
                        z10 = m(i13, t10);
                    } else if ((i12 & i17) == 0) {
                        z10 = false;
                    }
                    if (z10 && !E(i13).f(o8.p((long) (b10 & 1048575), t10))) {
                        return false;
                    }
                } else {
                    if (i18 != 27) {
                        if (i18 == 60 || i18 == 68) {
                            if (o(i14, i13, t10) && !E(i13).f(o8.p((long) (b10 & 1048575), t10))) {
                                return false;
                            }
                        } else if (i18 != 49) {
                            if (i18 == 50 && !((d7) o8.p((long) (b10 & 1048575), t10)).isEmpty()) {
                                c7 c7Var = (c7) F(i13);
                                throw null;
                            }
                        }
                    }
                    List list = (List) o8.p((long) (b10 & 1048575), t10);
                    if (!list.isEmpty()) {
                        t7 E = E(i13);
                        for (int i19 = 0; i19 < list.size(); i19++) {
                            if (!E.f(list.get(i19))) {
                                return false;
                            }
                        }
                        continue;
                    } else {
                        continue;
                    }
                }
                i11++;
            } else if (!this.f2787f) {
                return true;
            } else {
                this.f2793m.b(t10);
                throw null;
            }
        }
    }

    public final int g(T t10) {
        return this.f2788g ? A(t10) : z(t10);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x02f3, code lost:
        r13.o(r6, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0304, code lost:
        r13.n(r6, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0315, code lost:
        r13.c(r6, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0326, code lost:
        r13.a(r6, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0337, code lost:
        r13.f(r6, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0348, code lost:
        r13.m(r6, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0353, code lost:
        r13.l(r6, (com.google.android.gms.internal.measurement.k5) com.google.android.gms.internal.measurement.o8.p((long) (r5 & 1048575), r12));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0366, code lost:
        r13.p(r6, E(r4), com.google.android.gms.internal.measurement.o8.p((long) (r5 & 1048575), r12));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x037b, code lost:
        s(r6, com.google.android.gms.internal.measurement.o8.p((long) (r5 & 1048575), r12), r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0392, code lost:
        r13.k(r6, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x03a3, code lost:
        r13.j(r6, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x03b3, code lost:
        r13.i(r6, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x03c3, code lost:
        r13.h(r6, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x03d3, code lost:
        r13.g(r6, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x03e3, code lost:
        r13.b(r6, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x03f3, code lost:
        r13.d(r6, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0403, code lost:
        r13.e(r7, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x02d8, code lost:
        r13.q(r6, E(r4), com.google.android.gms.internal.measurement.o8.p((long) (r5 & 1048575), r12));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h(T r12, com.google.android.gms.internal.measurement.o5 r13) {
        /*
            r11 = this;
            boolean r0 = r11.f2788g
            if (r0 == 0) goto L_0x041a
            boolean r0 = r11.f2787f
            r1 = 0
            if (r0 != 0) goto L_0x0414
            int[] r0 = r11.f2783a
            int r2 = r0.length
            r3 = 0
            r4 = r3
        L_0x000e:
            if (r4 >= r2) goto L_0x040a
            int r5 = r11.b(r4)
            r6 = r0[r4]
            int r7 = r5 >>> 20
            r7 = r7 & 255(0xff, float:3.57E-43)
            r8 = 1
            r9 = 1048575(0xfffff, float:1.469367E-39)
            switch(r7) {
                case 0: goto L_0x03f7;
                case 1: goto L_0x03e7;
                case 2: goto L_0x03d7;
                case 3: goto L_0x03c7;
                case 4: goto L_0x03b7;
                case 5: goto L_0x03a7;
                case 6: goto L_0x0397;
                case 7: goto L_0x0386;
                case 8: goto L_0x0375;
                case 9: goto L_0x0360;
                case 10: goto L_0x034d;
                case 11: goto L_0x033c;
                case 12: goto L_0x032b;
                case 13: goto L_0x031a;
                case 14: goto L_0x0309;
                case 15: goto L_0x02f8;
                case 16: goto L_0x02e7;
                case 17: goto L_0x02d2;
                case 18: goto L_0x02c5;
                case 19: goto L_0x02b8;
                case 20: goto L_0x02ab;
                case 21: goto L_0x029e;
                case 22: goto L_0x0291;
                case 23: goto L_0x0284;
                case 24: goto L_0x0277;
                case 25: goto L_0x026a;
                case 26: goto L_0x025d;
                case 27: goto L_0x024c;
                case 28: goto L_0x023f;
                case 29: goto L_0x0232;
                case 30: goto L_0x0225;
                case 31: goto L_0x0218;
                case 32: goto L_0x020b;
                case 33: goto L_0x01fe;
                case 34: goto L_0x01f1;
                case 35: goto L_0x01e4;
                case 36: goto L_0x01d7;
                case 37: goto L_0x01ca;
                case 38: goto L_0x01bd;
                case 39: goto L_0x01b0;
                case 40: goto L_0x01a3;
                case 41: goto L_0x0196;
                case 42: goto L_0x0189;
                case 43: goto L_0x017c;
                case 44: goto L_0x016f;
                case 45: goto L_0x0162;
                case 46: goto L_0x0155;
                case 47: goto L_0x0148;
                case 48: goto L_0x013b;
                case 49: goto L_0x012a;
                case 50: goto L_0x0119;
                case 51: goto L_0x0105;
                case 52: goto L_0x00f1;
                case 53: goto L_0x00e3;
                case 54: goto L_0x00d5;
                case 55: goto L_0x00c7;
                case 56: goto L_0x00b9;
                case 57: goto L_0x00ab;
                case 58: goto L_0x0097;
                case 59: goto L_0x008f;
                case 60: goto L_0x0087;
                case 61: goto L_0x007f;
                case 62: goto L_0x0071;
                case 63: goto L_0x0063;
                case 64: goto L_0x0055;
                case 65: goto L_0x0047;
                case 66: goto L_0x0039;
                case 67: goto L_0x002b;
                case 68: goto L_0x0023;
                default: goto L_0x0021;
            }
        L_0x0021:
            goto L_0x0406
        L_0x0023:
            boolean r7 = r11.o(r6, r4, r12)
            if (r7 == 0) goto L_0x0406
            goto L_0x02d8
        L_0x002b:
            boolean r7 = r11.o(r6, r4, r12)
            if (r7 == 0) goto L_0x0406
            r5 = r5 & r9
            long r7 = (long) r5
            long r7 = e(r7, r12)
            goto L_0x02f3
        L_0x0039:
            boolean r7 = r11.o(r6, r4, r12)
            if (r7 == 0) goto L_0x0406
            r5 = r5 & r9
            long r7 = (long) r5
            int r5 = d(r7, r12)
            goto L_0x0304
        L_0x0047:
            boolean r7 = r11.o(r6, r4, r12)
            if (r7 == 0) goto L_0x0406
            r5 = r5 & r9
            long r7 = (long) r5
            long r7 = e(r7, r12)
            goto L_0x0315
        L_0x0055:
            boolean r7 = r11.o(r6, r4, r12)
            if (r7 == 0) goto L_0x0406
            r5 = r5 & r9
            long r7 = (long) r5
            int r5 = d(r7, r12)
            goto L_0x0326
        L_0x0063:
            boolean r7 = r11.o(r6, r4, r12)
            if (r7 == 0) goto L_0x0406
            r5 = r5 & r9
            long r7 = (long) r5
            int r5 = d(r7, r12)
            goto L_0x0337
        L_0x0071:
            boolean r7 = r11.o(r6, r4, r12)
            if (r7 == 0) goto L_0x0406
            r5 = r5 & r9
            long r7 = (long) r5
            int r5 = d(r7, r12)
            goto L_0x0348
        L_0x007f:
            boolean r7 = r11.o(r6, r4, r12)
            if (r7 == 0) goto L_0x0406
            goto L_0x0353
        L_0x0087:
            boolean r7 = r11.o(r6, r4, r12)
            if (r7 == 0) goto L_0x0406
            goto L_0x0366
        L_0x008f:
            boolean r7 = r11.o(r6, r4, r12)
            if (r7 == 0) goto L_0x0406
            goto L_0x037b
        L_0x0097:
            boolean r7 = r11.o(r6, r4, r12)
            if (r7 == 0) goto L_0x0406
            r5 = r5 & r9
            long r7 = (long) r5
            java.lang.Object r5 = com.google.android.gms.internal.measurement.o8.p(r7, r12)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            goto L_0x0392
        L_0x00ab:
            boolean r7 = r11.o(r6, r4, r12)
            if (r7 == 0) goto L_0x0406
            r5 = r5 & r9
            long r7 = (long) r5
            int r5 = d(r7, r12)
            goto L_0x03a3
        L_0x00b9:
            boolean r7 = r11.o(r6, r4, r12)
            if (r7 == 0) goto L_0x0406
            r5 = r5 & r9
            long r7 = (long) r5
            long r7 = e(r7, r12)
            goto L_0x03b3
        L_0x00c7:
            boolean r7 = r11.o(r6, r4, r12)
            if (r7 == 0) goto L_0x0406
            r5 = r5 & r9
            long r7 = (long) r5
            int r5 = d(r7, r12)
            goto L_0x03c3
        L_0x00d5:
            boolean r7 = r11.o(r6, r4, r12)
            if (r7 == 0) goto L_0x0406
            r5 = r5 & r9
            long r7 = (long) r5
            long r7 = e(r7, r12)
            goto L_0x03d3
        L_0x00e3:
            boolean r7 = r11.o(r6, r4, r12)
            if (r7 == 0) goto L_0x0406
            r5 = r5 & r9
            long r7 = (long) r5
            long r7 = e(r7, r12)
            goto L_0x03e3
        L_0x00f1:
            boolean r7 = r11.o(r6, r4, r12)
            if (r7 == 0) goto L_0x0406
            r5 = r5 & r9
            long r7 = (long) r5
            java.lang.Object r5 = com.google.android.gms.internal.measurement.o8.p(r7, r12)
            java.lang.Float r5 = (java.lang.Float) r5
            float r5 = r5.floatValue()
            goto L_0x03f3
        L_0x0105:
            boolean r7 = r11.o(r6, r4, r12)
            if (r7 == 0) goto L_0x0406
            r5 = r5 & r9
            long r7 = (long) r5
            java.lang.Object r5 = com.google.android.gms.internal.measurement.o8.p(r7, r12)
            java.lang.Double r5 = (java.lang.Double) r5
            double r7 = r5.doubleValue()
            goto L_0x0403
        L_0x0119:
            r5 = r5 & r9
            long r5 = (long) r5
            java.lang.Object r5 = com.google.android.gms.internal.measurement.o8.p(r5, r12)
            if (r5 != 0) goto L_0x0123
            goto L_0x0406
        L_0x0123:
            java.lang.Object r12 = r11.F(r4)
            com.google.android.gms.internal.measurement.c7 r12 = (com.google.android.gms.internal.measurement.c7) r12
            throw r1
        L_0x012a:
            r5 = r5 & r9
            long r7 = (long) r5
            java.lang.Object r5 = com.google.android.gms.internal.measurement.o8.p(r7, r12)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.measurement.t7 r7 = r11.E(r4)
            com.google.android.gms.internal.measurement.u7.t(r6, r5, r13, r7)
            goto L_0x0406
        L_0x013b:
            r5 = r5 & r9
            long r9 = (long) r5
            java.lang.Object r5 = com.google.android.gms.internal.measurement.o8.p(r9, r12)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.measurement.u7.g(r6, r5, r13, r8)
            goto L_0x0406
        L_0x0148:
            r5 = r5 & r9
            long r9 = (long) r5
            java.lang.Object r5 = com.google.android.gms.internal.measurement.o8.p(r9, r12)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.measurement.u7.l(r6, r5, r13, r8)
            goto L_0x0406
        L_0x0155:
            r5 = r5 & r9
            long r9 = (long) r5
            java.lang.Object r5 = com.google.android.gms.internal.measurement.o8.p(r9, r12)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.measurement.u7.i(r6, r5, r13, r8)
            goto L_0x0406
        L_0x0162:
            r5 = r5 & r9
            long r9 = (long) r5
            java.lang.Object r5 = com.google.android.gms.internal.measurement.o8.p(r9, r12)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.measurement.u7.n(r6, r5, r13, r8)
            goto L_0x0406
        L_0x016f:
            r5 = r5 & r9
            long r9 = (long) r5
            java.lang.Object r5 = com.google.android.gms.internal.measurement.o8.p(r9, r12)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.measurement.u7.o(r6, r5, r13, r8)
            goto L_0x0406
        L_0x017c:
            r5 = r5 & r9
            long r9 = (long) r5
            java.lang.Object r5 = com.google.android.gms.internal.measurement.o8.p(r9, r12)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.measurement.u7.k(r6, r5, r13, r8)
            goto L_0x0406
        L_0x0189:
            r5 = r5 & r9
            long r9 = (long) r5
            java.lang.Object r5 = com.google.android.gms.internal.measurement.o8.p(r9, r12)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.measurement.u7.p(r6, r5, r13, r8)
            goto L_0x0406
        L_0x0196:
            r5 = r5 & r9
            long r9 = (long) r5
            java.lang.Object r5 = com.google.android.gms.internal.measurement.o8.p(r9, r12)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.measurement.u7.m(r6, r5, r13, r8)
            goto L_0x0406
        L_0x01a3:
            r5 = r5 & r9
            long r9 = (long) r5
            java.lang.Object r5 = com.google.android.gms.internal.measurement.o8.p(r9, r12)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.measurement.u7.h(r6, r5, r13, r8)
            goto L_0x0406
        L_0x01b0:
            r5 = r5 & r9
            long r9 = (long) r5
            java.lang.Object r5 = com.google.android.gms.internal.measurement.o8.p(r9, r12)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.measurement.u7.j(r6, r5, r13, r8)
            goto L_0x0406
        L_0x01bd:
            r5 = r5 & r9
            long r9 = (long) r5
            java.lang.Object r5 = com.google.android.gms.internal.measurement.o8.p(r9, r12)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.measurement.u7.f(r6, r5, r13, r8)
            goto L_0x0406
        L_0x01ca:
            r5 = r5 & r9
            long r9 = (long) r5
            java.lang.Object r5 = com.google.android.gms.internal.measurement.o8.p(r9, r12)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.measurement.u7.e(r6, r5, r13, r8)
            goto L_0x0406
        L_0x01d7:
            r5 = r5 & r9
            long r9 = (long) r5
            java.lang.Object r5 = com.google.android.gms.internal.measurement.o8.p(r9, r12)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.measurement.u7.d(r6, r5, r13, r8)
            goto L_0x0406
        L_0x01e4:
            r5 = r5 & r9
            long r9 = (long) r5
            java.lang.Object r5 = com.google.android.gms.internal.measurement.o8.p(r9, r12)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.measurement.u7.c(r6, r5, r13, r8)
            goto L_0x0406
        L_0x01f1:
            r5 = r5 & r9
            long r7 = (long) r5
            java.lang.Object r5 = com.google.android.gms.internal.measurement.o8.p(r7, r12)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.measurement.u7.g(r6, r5, r13, r3)
            goto L_0x0406
        L_0x01fe:
            r5 = r5 & r9
            long r7 = (long) r5
            java.lang.Object r5 = com.google.android.gms.internal.measurement.o8.p(r7, r12)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.measurement.u7.l(r6, r5, r13, r3)
            goto L_0x0406
        L_0x020b:
            r5 = r5 & r9
            long r7 = (long) r5
            java.lang.Object r5 = com.google.android.gms.internal.measurement.o8.p(r7, r12)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.measurement.u7.i(r6, r5, r13, r3)
            goto L_0x0406
        L_0x0218:
            r5 = r5 & r9
            long r7 = (long) r5
            java.lang.Object r5 = com.google.android.gms.internal.measurement.o8.p(r7, r12)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.measurement.u7.n(r6, r5, r13, r3)
            goto L_0x0406
        L_0x0225:
            r5 = r5 & r9
            long r7 = (long) r5
            java.lang.Object r5 = com.google.android.gms.internal.measurement.o8.p(r7, r12)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.measurement.u7.o(r6, r5, r13, r3)
            goto L_0x0406
        L_0x0232:
            r5 = r5 & r9
            long r7 = (long) r5
            java.lang.Object r5 = com.google.android.gms.internal.measurement.o8.p(r7, r12)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.measurement.u7.k(r6, r5, r13, r3)
            goto L_0x0406
        L_0x023f:
            r5 = r5 & r9
            long r7 = (long) r5
            java.lang.Object r5 = com.google.android.gms.internal.measurement.o8.p(r7, r12)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.measurement.u7.r(r6, r5, r13)
            goto L_0x0406
        L_0x024c:
            r5 = r5 & r9
            long r7 = (long) r5
            java.lang.Object r5 = com.google.android.gms.internal.measurement.o8.p(r7, r12)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.measurement.t7 r7 = r11.E(r4)
            com.google.android.gms.internal.measurement.u7.s(r6, r5, r13, r7)
            goto L_0x0406
        L_0x025d:
            r5 = r5 & r9
            long r7 = (long) r5
            java.lang.Object r5 = com.google.android.gms.internal.measurement.o8.p(r7, r12)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.measurement.u7.q(r6, r5, r13)
            goto L_0x0406
        L_0x026a:
            r5 = r5 & r9
            long r7 = (long) r5
            java.lang.Object r5 = com.google.android.gms.internal.measurement.o8.p(r7, r12)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.measurement.u7.p(r6, r5, r13, r3)
            goto L_0x0406
        L_0x0277:
            r5 = r5 & r9
            long r7 = (long) r5
            java.lang.Object r5 = com.google.android.gms.internal.measurement.o8.p(r7, r12)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.measurement.u7.m(r6, r5, r13, r3)
            goto L_0x0406
        L_0x0284:
            r5 = r5 & r9
            long r7 = (long) r5
            java.lang.Object r5 = com.google.android.gms.internal.measurement.o8.p(r7, r12)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.measurement.u7.h(r6, r5, r13, r3)
            goto L_0x0406
        L_0x0291:
            r5 = r5 & r9
            long r7 = (long) r5
            java.lang.Object r5 = com.google.android.gms.internal.measurement.o8.p(r7, r12)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.measurement.u7.j(r6, r5, r13, r3)
            goto L_0x0406
        L_0x029e:
            r5 = r5 & r9
            long r7 = (long) r5
            java.lang.Object r5 = com.google.android.gms.internal.measurement.o8.p(r7, r12)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.measurement.u7.f(r6, r5, r13, r3)
            goto L_0x0406
        L_0x02ab:
            r5 = r5 & r9
            long r7 = (long) r5
            java.lang.Object r5 = com.google.android.gms.internal.measurement.o8.p(r7, r12)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.measurement.u7.e(r6, r5, r13, r3)
            goto L_0x0406
        L_0x02b8:
            r5 = r5 & r9
            long r7 = (long) r5
            java.lang.Object r5 = com.google.android.gms.internal.measurement.o8.p(r7, r12)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.measurement.u7.d(r6, r5, r13, r3)
            goto L_0x0406
        L_0x02c5:
            r5 = r5 & r9
            long r7 = (long) r5
            java.lang.Object r5 = com.google.android.gms.internal.measurement.o8.p(r7, r12)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.measurement.u7.c(r6, r5, r13, r3)
            goto L_0x0406
        L_0x02d2:
            boolean r7 = r11.m(r4, r12)
            if (r7 == 0) goto L_0x0406
        L_0x02d8:
            r5 = r5 & r9
            long r7 = (long) r5
            java.lang.Object r5 = com.google.android.gms.internal.measurement.o8.p(r7, r12)
            com.google.android.gms.internal.measurement.t7 r7 = r11.E(r4)
            r13.q(r6, r7, r5)
            goto L_0x0406
        L_0x02e7:
            boolean r7 = r11.m(r4, r12)
            if (r7 == 0) goto L_0x0406
            r5 = r5 & r9
            long r7 = (long) r5
            long r7 = com.google.android.gms.internal.measurement.o8.h(r7, r12)
        L_0x02f3:
            r13.o(r6, r7)
            goto L_0x0406
        L_0x02f8:
            boolean r7 = r11.m(r4, r12)
            if (r7 == 0) goto L_0x0406
            r5 = r5 & r9
            long r7 = (long) r5
            int r5 = com.google.android.gms.internal.measurement.o8.f(r7, r12)
        L_0x0304:
            r13.n(r6, r5)
            goto L_0x0406
        L_0x0309:
            boolean r7 = r11.m(r4, r12)
            if (r7 == 0) goto L_0x0406
            r5 = r5 & r9
            long r7 = (long) r5
            long r7 = com.google.android.gms.internal.measurement.o8.h(r7, r12)
        L_0x0315:
            r13.c(r6, r7)
            goto L_0x0406
        L_0x031a:
            boolean r7 = r11.m(r4, r12)
            if (r7 == 0) goto L_0x0406
            r5 = r5 & r9
            long r7 = (long) r5
            int r5 = com.google.android.gms.internal.measurement.o8.f(r7, r12)
        L_0x0326:
            r13.a(r6, r5)
            goto L_0x0406
        L_0x032b:
            boolean r7 = r11.m(r4, r12)
            if (r7 == 0) goto L_0x0406
            r5 = r5 & r9
            long r7 = (long) r5
            int r5 = com.google.android.gms.internal.measurement.o8.f(r7, r12)
        L_0x0337:
            r13.f(r6, r5)
            goto L_0x0406
        L_0x033c:
            boolean r7 = r11.m(r4, r12)
            if (r7 == 0) goto L_0x0406
            r5 = r5 & r9
            long r7 = (long) r5
            int r5 = com.google.android.gms.internal.measurement.o8.f(r7, r12)
        L_0x0348:
            r13.m(r6, r5)
            goto L_0x0406
        L_0x034d:
            boolean r7 = r11.m(r4, r12)
            if (r7 == 0) goto L_0x0406
        L_0x0353:
            r5 = r5 & r9
            long r7 = (long) r5
            java.lang.Object r5 = com.google.android.gms.internal.measurement.o8.p(r7, r12)
            com.google.android.gms.internal.measurement.k5 r5 = (com.google.android.gms.internal.measurement.k5) r5
            r13.l(r6, r5)
            goto L_0x0406
        L_0x0360:
            boolean r7 = r11.m(r4, r12)
            if (r7 == 0) goto L_0x0406
        L_0x0366:
            r5 = r5 & r9
            long r7 = (long) r5
            java.lang.Object r5 = com.google.android.gms.internal.measurement.o8.p(r7, r12)
            com.google.android.gms.internal.measurement.t7 r7 = r11.E(r4)
            r13.p(r6, r7, r5)
            goto L_0x0406
        L_0x0375:
            boolean r7 = r11.m(r4, r12)
            if (r7 == 0) goto L_0x0406
        L_0x037b:
            r5 = r5 & r9
            long r7 = (long) r5
            java.lang.Object r5 = com.google.android.gms.internal.measurement.o8.p(r7, r12)
            s(r6, r5, r13)
            goto L_0x0406
        L_0x0386:
            boolean r7 = r11.m(r4, r12)
            if (r7 == 0) goto L_0x0406
            r5 = r5 & r9
            long r7 = (long) r5
            boolean r5 = com.google.android.gms.internal.measurement.o8.j(r7, r12)
        L_0x0392:
            r13.k(r6, r5)
            goto L_0x0406
        L_0x0397:
            boolean r7 = r11.m(r4, r12)
            if (r7 == 0) goto L_0x0406
            r5 = r5 & r9
            long r7 = (long) r5
            int r5 = com.google.android.gms.internal.measurement.o8.f(r7, r12)
        L_0x03a3:
            r13.j(r6, r5)
            goto L_0x0406
        L_0x03a7:
            boolean r7 = r11.m(r4, r12)
            if (r7 == 0) goto L_0x0406
            r5 = r5 & r9
            long r7 = (long) r5
            long r7 = com.google.android.gms.internal.measurement.o8.h(r7, r12)
        L_0x03b3:
            r13.i(r6, r7)
            goto L_0x0406
        L_0x03b7:
            boolean r7 = r11.m(r4, r12)
            if (r7 == 0) goto L_0x0406
            r5 = r5 & r9
            long r7 = (long) r5
            int r5 = com.google.android.gms.internal.measurement.o8.f(r7, r12)
        L_0x03c3:
            r13.h(r6, r5)
            goto L_0x0406
        L_0x03c7:
            boolean r7 = r11.m(r4, r12)
            if (r7 == 0) goto L_0x0406
            r5 = r5 & r9
            long r7 = (long) r5
            long r7 = com.google.android.gms.internal.measurement.o8.h(r7, r12)
        L_0x03d3:
            r13.g(r6, r7)
            goto L_0x0406
        L_0x03d7:
            boolean r7 = r11.m(r4, r12)
            if (r7 == 0) goto L_0x0406
            r5 = r5 & r9
            long r7 = (long) r5
            long r7 = com.google.android.gms.internal.measurement.o8.h(r7, r12)
        L_0x03e3:
            r13.b(r6, r7)
            goto L_0x0406
        L_0x03e7:
            boolean r7 = r11.m(r4, r12)
            if (r7 == 0) goto L_0x0406
            r5 = r5 & r9
            long r7 = (long) r5
            float r5 = com.google.android.gms.internal.measurement.o8.l(r7, r12)
        L_0x03f3:
            r13.d(r6, r5)
            goto L_0x0406
        L_0x03f7:
            boolean r7 = r11.m(r4, r12)
            if (r7 == 0) goto L_0x0406
            r5 = r5 & r9
            long r7 = (long) r5
            double r7 = com.google.android.gms.internal.measurement.o8.n(r7, r12)
        L_0x0403:
            r13.e(r7, r6)
        L_0x0406:
            int r4 = r4 + 3
            goto L_0x000e
        L_0x040a:
            com.google.android.gms.internal.measurement.e8<?, ?> r0 = r11.l
            com.google.android.gms.internal.measurement.f8 r12 = r0.d(r12)
            r0.i(r12, r13)
            return
        L_0x0414:
            com.google.android.gms.internal.measurement.s5<?> r13 = r11.f2793m
            r13.b(r12)
            throw r1
        L_0x041a:
            r11.r(r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.l7.h(java.lang.Object, com.google.android.gms.internal.measurement.o5):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002f, code lost:
        com.google.android.gms.internal.measurement.o8.q(r3, r6, com.google.android.gms.internal.measurement.o8.p(r3, r7));
        p(r1, r0, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0093, code lost:
        com.google.android.gms.internal.measurement.o8.q(r3, r6, com.google.android.gms.internal.measurement.o8.p(r3, r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00bd, code lost:
        com.google.android.gms.internal.measurement.o8.g(com.google.android.gms.internal.measurement.o8.f(r3, r7), r3, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00d2, code lost:
        com.google.android.gms.internal.measurement.o8.i(r6, r3, com.google.android.gms.internal.measurement.o8.h(r3, r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00f5, code lost:
        n(r0, r6);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void i(T r6, T r7) {
        /*
            r5 = this;
            r7.getClass()
            r0 = 0
        L_0x0004:
            int[] r1 = r5.f2783a
            int r2 = r1.length
            if (r0 >= r2) goto L_0x00fc
            int r2 = r5.b(r0)
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r3 = r3 & r2
            long r3 = (long) r3
            r1 = r1[r0]
            int r2 = r2 >>> 20
            r2 = r2 & 255(0xff, float:3.57E-43)
            switch(r2) {
                case 0: goto L_0x00e8;
                case 1: goto L_0x00da;
                case 2: goto L_0x00cc;
                case 3: goto L_0x00c5;
                case 4: goto L_0x00b7;
                case 5: goto L_0x00b0;
                case 6: goto L_0x00a9;
                case 7: goto L_0x009b;
                case 8: goto L_0x008d;
                case 9: goto L_0x0088;
                case 10: goto L_0x0081;
                case 11: goto L_0x007a;
                case 12: goto L_0x0073;
                case 13: goto L_0x006c;
                case 14: goto L_0x0064;
                case 15: goto L_0x005d;
                case 16: goto L_0x0055;
                case 17: goto L_0x0088;
                case 18: goto L_0x004e;
                case 19: goto L_0x004e;
                case 20: goto L_0x004e;
                case 21: goto L_0x004e;
                case 22: goto L_0x004e;
                case 23: goto L_0x004e;
                case 24: goto L_0x004e;
                case 25: goto L_0x004e;
                case 26: goto L_0x004e;
                case 27: goto L_0x004e;
                case 28: goto L_0x004e;
                case 29: goto L_0x004e;
                case 30: goto L_0x004e;
                case 31: goto L_0x004e;
                case 32: goto L_0x004e;
                case 33: goto L_0x004e;
                case 34: goto L_0x004e;
                case 35: goto L_0x004e;
                case 36: goto L_0x004e;
                case 37: goto L_0x004e;
                case 38: goto L_0x004e;
                case 39: goto L_0x004e;
                case 40: goto L_0x004e;
                case 41: goto L_0x004e;
                case 42: goto L_0x004e;
                case 43: goto L_0x004e;
                case 44: goto L_0x004e;
                case 45: goto L_0x004e;
                case 46: goto L_0x004e;
                case 47: goto L_0x004e;
                case 48: goto L_0x004e;
                case 49: goto L_0x004e;
                case 50: goto L_0x003b;
                case 51: goto L_0x0029;
                case 52: goto L_0x0029;
                case 53: goto L_0x0029;
                case 54: goto L_0x0029;
                case 55: goto L_0x0029;
                case 56: goto L_0x0029;
                case 57: goto L_0x0029;
                case 58: goto L_0x0029;
                case 59: goto L_0x0029;
                case 60: goto L_0x0024;
                case 61: goto L_0x001d;
                case 62: goto L_0x001d;
                case 63: goto L_0x001d;
                case 64: goto L_0x001d;
                case 65: goto L_0x001d;
                case 66: goto L_0x001d;
                case 67: goto L_0x001d;
                case 68: goto L_0x0024;
                default: goto L_0x001b;
            }
        L_0x001b:
            goto L_0x00f8
        L_0x001d:
            boolean r2 = r5.o(r1, r0, r7)
            if (r2 == 0) goto L_0x00f8
            goto L_0x002f
        L_0x0024:
            r5.y(r0, r6, r7)
            goto L_0x00f8
        L_0x0029:
            boolean r2 = r5.o(r1, r0, r7)
            if (r2 == 0) goto L_0x00f8
        L_0x002f:
            java.lang.Object r2 = com.google.android.gms.internal.measurement.o8.p(r3, r7)
            com.google.android.gms.internal.measurement.o8.q(r3, r6, r2)
            r5.p(r1, r0, r6)
            goto L_0x00f8
        L_0x003b:
            java.lang.Class<?> r1 = com.google.android.gms.internal.measurement.u7.f2955a
            java.lang.Object r1 = com.google.android.gms.internal.measurement.o8.p(r3, r6)
            java.lang.Object r2 = com.google.android.gms.internal.measurement.o8.p(r3, r7)
            com.google.android.gms.internal.measurement.d7 r1 = com.google.android.gms.internal.measurement.e7.b(r1, r2)
            com.google.android.gms.internal.measurement.o8.q(r3, r6, r1)
            goto L_0x00f8
        L_0x004e:
            com.google.android.gms.internal.measurement.w6 r1 = r5.f2792k
            r1.b(r3, r6, r7)
            goto L_0x00f8
        L_0x0055:
            boolean r1 = r5.m(r0, r7)
            if (r1 == 0) goto L_0x00f8
            goto L_0x00d2
        L_0x005d:
            boolean r1 = r5.m(r0, r7)
            if (r1 == 0) goto L_0x00f8
            goto L_0x00bd
        L_0x0064:
            boolean r1 = r5.m(r0, r7)
            if (r1 == 0) goto L_0x00f8
            goto L_0x00d2
        L_0x006c:
            boolean r1 = r5.m(r0, r7)
            if (r1 == 0) goto L_0x00f8
            goto L_0x00bd
        L_0x0073:
            boolean r1 = r5.m(r0, r7)
            if (r1 == 0) goto L_0x00f8
            goto L_0x00bd
        L_0x007a:
            boolean r1 = r5.m(r0, r7)
            if (r1 == 0) goto L_0x00f8
            goto L_0x00bd
        L_0x0081:
            boolean r1 = r5.m(r0, r7)
            if (r1 == 0) goto L_0x00f8
            goto L_0x0093
        L_0x0088:
            r5.x(r0, r6, r7)
            goto L_0x00f8
        L_0x008d:
            boolean r1 = r5.m(r0, r7)
            if (r1 == 0) goto L_0x00f8
        L_0x0093:
            java.lang.Object r1 = com.google.android.gms.internal.measurement.o8.p(r3, r7)
            com.google.android.gms.internal.measurement.o8.q(r3, r6, r1)
            goto L_0x00f5
        L_0x009b:
            boolean r1 = r5.m(r0, r7)
            if (r1 == 0) goto L_0x00f8
            boolean r1 = com.google.android.gms.internal.measurement.o8.j(r3, r7)
            com.google.android.gms.internal.measurement.o8.k(r6, r3, r1)
            goto L_0x00f5
        L_0x00a9:
            boolean r1 = r5.m(r0, r7)
            if (r1 == 0) goto L_0x00f8
            goto L_0x00bd
        L_0x00b0:
            boolean r1 = r5.m(r0, r7)
            if (r1 == 0) goto L_0x00f8
            goto L_0x00d2
        L_0x00b7:
            boolean r1 = r5.m(r0, r7)
            if (r1 == 0) goto L_0x00f8
        L_0x00bd:
            int r1 = com.google.android.gms.internal.measurement.o8.f(r3, r7)
            com.google.android.gms.internal.measurement.o8.g(r1, r3, r6)
            goto L_0x00f5
        L_0x00c5:
            boolean r1 = r5.m(r0, r7)
            if (r1 == 0) goto L_0x00f8
            goto L_0x00d2
        L_0x00cc:
            boolean r1 = r5.m(r0, r7)
            if (r1 == 0) goto L_0x00f8
        L_0x00d2:
            long r1 = com.google.android.gms.internal.measurement.o8.h(r3, r7)
            com.google.android.gms.internal.measurement.o8.i(r6, r3, r1)
            goto L_0x00f5
        L_0x00da:
            boolean r1 = r5.m(r0, r7)
            if (r1 == 0) goto L_0x00f8
            float r1 = com.google.android.gms.internal.measurement.o8.l(r3, r7)
            com.google.android.gms.internal.measurement.o8.m(r6, r3, r1)
            goto L_0x00f5
        L_0x00e8:
            boolean r1 = r5.m(r0, r7)
            if (r1 == 0) goto L_0x00f8
            double r1 = com.google.android.gms.internal.measurement.o8.n(r3, r7)
            com.google.android.gms.internal.measurement.o8.o(r6, r3, r1)
        L_0x00f5:
            r5.n(r0, r6)
        L_0x00f8:
            int r0 = r0 + 3
            goto L_0x0004
        L_0x00fc:
            java.lang.Class<?> r0 = com.google.android.gms.internal.measurement.u7.f2955a
            com.google.android.gms.internal.measurement.e8<?, ?> r0 = r5.l
            com.google.android.gms.internal.measurement.f8 r1 = r0.d(r6)
            com.google.android.gms.internal.measurement.f8 r2 = r0.d(r7)
            java.lang.Object r1 = r0.f(r1, r2)
            r0.c(r6, r1)
            boolean r6 = r5.f2787f
            if (r6 != 0) goto L_0x0114
            return
        L_0x0114:
            com.google.android.gms.internal.measurement.s5<?> r6 = r5.f2793m
            r6.b(r7)
            r6 = 0
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.l7.i(java.lang.Object, java.lang.Object):void");
    }

    public final void j(T t10, byte[] bArr, int i10, int i11, e5 e5Var) {
        if (this.f2788g) {
            G(t10, bArr, i10, i11, e5Var);
        } else {
            u(t10, bArr, i10, i11, 0, e5Var);
        }
    }

    public final boolean k(int i10, Object obj, Object obj2) {
        return m(i10, obj) == m(i10, obj2);
    }

    public final void l(T t10) {
        int[] iArr;
        int i10;
        int i11 = this.f2790i;
        while (true) {
            iArr = this.f2789h;
            i10 = this.f2791j;
            if (i11 >= i10) {
                break;
            }
            long b10 = (long) (b(iArr[i11]) & 1048575);
            Object p10 = o8.p(b10, t10);
            if (p10 != null) {
                ((d7) p10).f2673o = false;
                o8.q(b10, t10, p10);
            }
            i11++;
        }
        int length = iArr.length;
        while (i10 < length) {
            this.f2792k.a((long) iArr[i10], t10);
            i10++;
        }
        this.l.e(t10);
        if (this.f2787f) {
            this.f2793m.c(t10);
        }
    }

    public final boolean m(int i10, Object obj) {
        int i11 = this.f2783a[i10 + 2];
        long j8 = (long) (i11 & 1048575);
        if (j8 == 1048575) {
            int b10 = b(i10);
            long j10 = (long) (b10 & 1048575);
            switch ((b10 >>> 20) & 255) {
                case 0:
                    if (o8.n(j10, obj) != 0.0d) {
                        return true;
                    }
                    return false;
                case 1:
                    if (o8.l(j10, obj) != 0.0f) {
                        return true;
                    }
                    return false;
                case 2:
                    if (o8.h(j10, obj) != 0) {
                        return true;
                    }
                    return false;
                case 3:
                    if (o8.h(j10, obj) != 0) {
                        return true;
                    }
                    return false;
                case 4:
                    if (o8.f(j10, obj) != 0) {
                        return true;
                    }
                    return false;
                case 5:
                    if (o8.h(j10, obj) != 0) {
                        return true;
                    }
                    return false;
                case 6:
                    if (o8.f(j10, obj) != 0) {
                        return true;
                    }
                    return false;
                case 7:
                    return o8.j(j10, obj);
                case 8:
                    Object p10 = o8.p(j10, obj);
                    if (p10 instanceof String) {
                        if (!((String) p10).isEmpty()) {
                            return true;
                        }
                        return false;
                    } else if (!(p10 instanceof k5)) {
                        throw new IllegalArgumentException();
                    } else if (!k5.f2770p.equals(p10)) {
                        return true;
                    } else {
                        return false;
                    }
                case 9:
                    if (o8.p(j10, obj) != null) {
                        return true;
                    }
                    return false;
                case 10:
                    if (!k5.f2770p.equals(o8.p(j10, obj))) {
                        return true;
                    }
                    return false;
                case 11:
                    if (o8.f(j10, obj) != 0) {
                        return true;
                    }
                    return false;
                case 12:
                    if (o8.f(j10, obj) != 0) {
                        return true;
                    }
                    return false;
                case 13:
                    if (o8.f(j10, obj) != 0) {
                        return true;
                    }
                    return false;
                case 14:
                    if (o8.h(j10, obj) != 0) {
                        return true;
                    }
                    return false;
                case 15:
                    if (o8.f(j10, obj) != 0) {
                        return true;
                    }
                    return false;
                case 16:
                    if (o8.h(j10, obj) != 0) {
                        return true;
                    }
                    return false;
                case 17:
                    if (o8.p(j10, obj) != null) {
                        return true;
                    }
                    return false;
                default:
                    throw new IllegalArgumentException();
            }
        } else if ((o8.f(j8, obj) & (1 << (i11 >>> 20))) != 0) {
            return true;
        } else {
            return false;
        }
    }

    public final void n(int i10, Object obj) {
        int i11 = this.f2783a[i10 + 2];
        long j8 = (long) (1048575 & i11);
        if (j8 != 1048575) {
            o8.g((1 << (i11 >>> 20)) | o8.f(j8, obj), j8, obj);
        }
    }

    public final boolean o(int i10, int i11, Object obj) {
        if (o8.f((long) (this.f2783a[i11 + 2] & 1048575), obj) == i10) {
            return true;
        }
        return false;
    }

    public final void p(int i10, int i11, Object obj) {
        o8.g(i10, (long) (this.f2783a[i11 + 2] & 1048575), obj);
    }

    public final int q(int i10, int i11) {
        int[] iArr = this.f2783a;
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

    public final void r(T t10, o5 o5Var) {
        int i10;
        T t11 = t10;
        o5 o5Var2 = o5Var;
        if (!this.f2787f) {
            int[] iArr = this.f2783a;
            int length = iArr.length;
            int i11 = 1048575;
            int i12 = 1048575;
            int i13 = 0;
            int i14 = 0;
            while (i13 < length) {
                int b10 = b(i13);
                int i15 = iArr[i13];
                int i16 = (b10 >>> 20) & 255;
                Unsafe unsafe = f2782o;
                if (i16 <= 17) {
                    int i17 = iArr[i13 + 2];
                    int i18 = i17 & i11;
                    if (i18 != i12) {
                        i14 = unsafe.getInt(t11, (long) i18);
                        i12 = i18;
                    }
                    i10 = 1 << (i17 >>> 20);
                } else {
                    i10 = 0;
                }
                Unsafe unsafe2 = unsafe;
                long j8 = (long) (b10 & i11);
                switch (i16) {
                    case 0:
                        if ((i10 & i14) == 0) {
                            break;
                        } else {
                            o5Var2.e(o8.n(j8, t11), i15);
                            continue;
                        }
                    case 1:
                        if ((i10 & i14) != 0) {
                            o5Var2.d(i15, o8.l(j8, t11));
                            break;
                        } else {
                            continue;
                        }
                    case 2:
                        Unsafe unsafe3 = unsafe2;
                        if ((i10 & i14) != 0) {
                            o5Var2.b(i15, unsafe3.getLong(t11, j8));
                            break;
                        } else {
                            continue;
                        }
                    case 3:
                        Unsafe unsafe4 = unsafe2;
                        if ((i10 & i14) != 0) {
                            o5Var2.g(i15, unsafe4.getLong(t11, j8));
                            break;
                        } else {
                            continue;
                        }
                    case 4:
                        Unsafe unsafe5 = unsafe2;
                        if ((i10 & i14) != 0) {
                            o5Var2.h(i15, unsafe5.getInt(t11, j8));
                            break;
                        } else {
                            continue;
                        }
                    case 5:
                        Unsafe unsafe6 = unsafe2;
                        if ((i10 & i14) != 0) {
                            o5Var2.i(i15, unsafe6.getLong(t11, j8));
                            break;
                        } else {
                            continue;
                        }
                    case 6:
                        Unsafe unsafe7 = unsafe2;
                        if ((i10 & i14) != 0) {
                            o5Var2.j(i15, unsafe7.getInt(t11, j8));
                            break;
                        } else {
                            continue;
                        }
                    case 7:
                        if ((i10 & i14) != 0) {
                            o5Var2.k(i15, o8.j(j8, t11));
                            break;
                        } else {
                            continue;
                        }
                    case 8:
                        Unsafe unsafe8 = unsafe2;
                        if ((i10 & i14) != 0) {
                            s(i15, unsafe8.getObject(t11, j8), o5Var2);
                            break;
                        } else {
                            continue;
                        }
                    case 9:
                        Unsafe unsafe9 = unsafe2;
                        if ((i10 & i14) != 0) {
                            o5Var2.p(i15, E(i13), unsafe9.getObject(t11, j8));
                            break;
                        } else {
                            continue;
                        }
                    case 10:
                        Unsafe unsafe10 = unsafe2;
                        if ((i10 & i14) != 0) {
                            o5Var2.l(i15, (k5) unsafe10.getObject(t11, j8));
                            break;
                        } else {
                            continue;
                        }
                    case 11:
                        Unsafe unsafe11 = unsafe2;
                        if ((i10 & i14) != 0) {
                            o5Var2.m(i15, unsafe11.getInt(t11, j8));
                            break;
                        } else {
                            continue;
                        }
                    case 12:
                        Unsafe unsafe12 = unsafe2;
                        if ((i10 & i14) != 0) {
                            o5Var2.f(i15, unsafe12.getInt(t11, j8));
                            break;
                        } else {
                            continue;
                        }
                    case 13:
                        Unsafe unsafe13 = unsafe2;
                        if ((i10 & i14) != 0) {
                            o5Var2.a(i15, unsafe13.getInt(t11, j8));
                            break;
                        } else {
                            continue;
                        }
                    case 14:
                        Unsafe unsafe14 = unsafe2;
                        if ((i10 & i14) != 0) {
                            o5Var2.c(i15, unsafe14.getLong(t11, j8));
                            break;
                        } else {
                            continue;
                        }
                    case 15:
                        Unsafe unsafe15 = unsafe2;
                        if ((i10 & i14) != 0) {
                            o5Var2.n(i15, unsafe15.getInt(t11, j8));
                            break;
                        } else {
                            continue;
                        }
                    case 16:
                        Unsafe unsafe16 = unsafe2;
                        if ((i10 & i14) != 0) {
                            o5Var2.o(i15, unsafe16.getLong(t11, j8));
                            break;
                        } else {
                            continue;
                        }
                    case 17:
                        Unsafe unsafe17 = unsafe2;
                        if ((i10 & i14) != 0) {
                            o5Var2.q(i15, E(i13), unsafe17.getObject(t11, j8));
                            break;
                        } else {
                            continue;
                        }
                    case 18:
                        u7.c(iArr[i13], (List) unsafe2.getObject(t11, j8), o5Var2, false);
                        continue;
                    case 19:
                        u7.d(iArr[i13], (List) unsafe2.getObject(t11, j8), o5Var2, false);
                        continue;
                    case 20:
                        u7.e(iArr[i13], (List) unsafe2.getObject(t11, j8), o5Var2, false);
                        continue;
                    case 21:
                        u7.f(iArr[i13], (List) unsafe2.getObject(t11, j8), o5Var2, false);
                        continue;
                    case 22:
                        u7.j(iArr[i13], (List) unsafe2.getObject(t11, j8), o5Var2, false);
                        continue;
                    case 23:
                        u7.h(iArr[i13], (List) unsafe2.getObject(t11, j8), o5Var2, false);
                        continue;
                    case 24:
                        u7.m(iArr[i13], (List) unsafe2.getObject(t11, j8), o5Var2, false);
                        continue;
                    case 25:
                        u7.p(iArr[i13], (List) unsafe2.getObject(t11, j8), o5Var2, false);
                        continue;
                    case 26:
                        u7.q(iArr[i13], (List) unsafe2.getObject(t11, j8), o5Var2);
                        break;
                    case 27:
                        u7.s(iArr[i13], (List) unsafe2.getObject(t11, j8), o5Var2, E(i13));
                        break;
                    case 28:
                        u7.r(iArr[i13], (List) unsafe2.getObject(t11, j8), o5Var2);
                        break;
                    case 29:
                        u7.k(iArr[i13], (List) unsafe2.getObject(t11, j8), o5Var2, false);
                        break;
                    case 30:
                        u7.o(iArr[i13], (List) unsafe2.getObject(t11, j8), o5Var2, false);
                        break;
                    case 31:
                        u7.n(iArr[i13], (List) unsafe2.getObject(t11, j8), o5Var2, false);
                        break;
                    case 32:
                        u7.i(iArr[i13], (List) unsafe2.getObject(t11, j8), o5Var2, false);
                        break;
                    case 33:
                        u7.l(iArr[i13], (List) unsafe2.getObject(t11, j8), o5Var2, false);
                        break;
                    case 34:
                        u7.g(iArr[i13], (List) unsafe2.getObject(t11, j8), o5Var2, false);
                        break;
                    case 35:
                        u7.c(iArr[i13], (List) unsafe2.getObject(t11, j8), o5Var2, true);
                        break;
                    case 36:
                        u7.d(iArr[i13], (List) unsafe2.getObject(t11, j8), o5Var2, true);
                        break;
                    case 37:
                        u7.e(iArr[i13], (List) unsafe2.getObject(t11, j8), o5Var2, true);
                        break;
                    case 38:
                        u7.f(iArr[i13], (List) unsafe2.getObject(t11, j8), o5Var2, true);
                        break;
                    case 39:
                        u7.j(iArr[i13], (List) unsafe2.getObject(t11, j8), o5Var2, true);
                        break;
                    case 40:
                        u7.h(iArr[i13], (List) unsafe2.getObject(t11, j8), o5Var2, true);
                        break;
                    case 41:
                        u7.m(iArr[i13], (List) unsafe2.getObject(t11, j8), o5Var2, true);
                        break;
                    case 42:
                        u7.p(iArr[i13], (List) unsafe2.getObject(t11, j8), o5Var2, true);
                        break;
                    case 43:
                        u7.k(iArr[i13], (List) unsafe2.getObject(t11, j8), o5Var2, true);
                        break;
                    case 44:
                        u7.o(iArr[i13], (List) unsafe2.getObject(t11, j8), o5Var2, true);
                        break;
                    case 45:
                        u7.n(iArr[i13], (List) unsafe2.getObject(t11, j8), o5Var2, true);
                        break;
                    case 46:
                        u7.i(iArr[i13], (List) unsafe2.getObject(t11, j8), o5Var2, true);
                        break;
                    case 47:
                        u7.l(iArr[i13], (List) unsafe2.getObject(t11, j8), o5Var2, true);
                        break;
                    case 48:
                        u7.g(iArr[i13], (List) unsafe2.getObject(t11, j8), o5Var2, true);
                        break;
                    case 49:
                        u7.t(iArr[i13], (List) unsafe2.getObject(t11, j8), o5Var2, E(i13));
                        break;
                    case 50:
                        if (unsafe2.getObject(t11, j8) != null) {
                            c7 c7Var = (c7) F(i13);
                            throw null;
                        }
                        break;
                    case 51:
                        if (o(i15, i13, t11)) {
                            o5Var2.e(((Double) o8.p(j8, t11)).doubleValue(), i15);
                            break;
                        }
                        break;
                    case 52:
                        if (o(i15, i13, t11)) {
                            o5Var2.d(i15, ((Float) o8.p(j8, t11)).floatValue());
                            break;
                        }
                        break;
                    case 53:
                        if (o(i15, i13, t11)) {
                            o5Var2.b(i15, e(j8, t11));
                            break;
                        }
                        break;
                    case 54:
                        if (o(i15, i13, t11)) {
                            o5Var2.g(i15, e(j8, t11));
                            break;
                        }
                        break;
                    case 55:
                        if (o(i15, i13, t11)) {
                            o5Var2.h(i15, d(j8, t11));
                            break;
                        }
                        break;
                    case 56:
                        if (o(i15, i13, t11)) {
                            o5Var2.i(i15, e(j8, t11));
                            break;
                        }
                        break;
                    case 57:
                        if (o(i15, i13, t11)) {
                            o5Var2.j(i15, d(j8, t11));
                            break;
                        }
                        break;
                    case 58:
                        if (o(i15, i13, t11)) {
                            o5Var2.k(i15, ((Boolean) o8.p(j8, t11)).booleanValue());
                            break;
                        }
                        break;
                    case 59:
                        Unsafe unsafe18 = unsafe2;
                        if (o(i15, i13, t11)) {
                            s(i15, unsafe18.getObject(t11, j8), o5Var2);
                            break;
                        }
                        break;
                    case 60:
                        Unsafe unsafe19 = unsafe2;
                        if (o(i15, i13, t11)) {
                            o5Var2.p(i15, E(i13), unsafe19.getObject(t11, j8));
                            break;
                        }
                        break;
                    case 61:
                        Unsafe unsafe20 = unsafe2;
                        if (o(i15, i13, t11)) {
                            o5Var2.l(i15, (k5) unsafe20.getObject(t11, j8));
                            break;
                        }
                        break;
                    case 62:
                        if (o(i15, i13, t11)) {
                            o5Var2.m(i15, d(j8, t11));
                            break;
                        }
                        break;
                    case 63:
                        if (o(i15, i13, t11)) {
                            o5Var2.f(i15, d(j8, t11));
                            break;
                        }
                        break;
                    case 64:
                        if (o(i15, i13, t11)) {
                            o5Var2.a(i15, d(j8, t11));
                            break;
                        }
                        break;
                    case R.styleable.AppCompatTheme_dividerVertical /*65*/:
                        if (o(i15, i13, t11)) {
                            o5Var2.c(i15, e(j8, t11));
                            break;
                        }
                        break;
                    case R.styleable.AppCompatTheme_dropDownListViewStyle /*66*/:
                        if (o(i15, i13, t11)) {
                            o5Var2.n(i15, d(j8, t11));
                            break;
                        }
                        break;
                    case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /*67*/:
                        if (o(i15, i13, t11)) {
                            o5Var2.o(i15, e(j8, t11));
                            break;
                        }
                        break;
                    case R.styleable.AppCompatTheme_editTextBackground /*68*/:
                        if (o(i15, i13, t11)) {
                            o5Var2.q(i15, E(i13), unsafe2.getObject(t11, j8));
                            break;
                        }
                        break;
                }
                i13 += 3;
                i11 = 1048575;
            }
            e8<?, ?> e8Var = this.l;
            e8Var.i(e8Var.d(t11), o5Var2);
            return;
        }
        this.f2793m.b(t11);
        throw null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v24, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v24, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v25, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v26, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v27, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v28, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v29, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v30, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v31, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v32, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v33, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v34, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v35, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v36, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v37, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v37, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v32, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v39, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v40, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v41, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v42, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v43, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v44, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v41, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v39, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v45, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v46, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v47, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v48, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v49, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v50, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v51, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v52, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v52, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v53, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v37, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v36, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v94, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0316, code lost:
        r8 = r5;
        r2 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0339, code lost:
        r0 = r13 | r23;
        r1 = r9;
        r6 = r22;
        r9 = r4;
        r4 = r8;
        r8 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0342, code lost:
        r8 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x035c, code lost:
        r7 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x035d, code lost:
        r0 = r1;
        r3 = r8;
        r5 = r17;
        r10 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0368, code lost:
        r6 = r39;
        r31 = r10;
        r32 = r11;
        r8 = r12;
        r7 = r13;
        r14 = r15;
        r23 = r16;
        r22 = r17;
        r27 = r21;
        r16 = r2;
        r2 = r9;
        r9 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0440, code lost:
        if (r0 != r15) goto L_0x04a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x04a1, code lost:
        if (r0 != r15) goto L_0x04a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x04b5, code lost:
        r6 = r39;
        r2 = r0;
        r8 = r17;
        r9 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0148, code lost:
        r11.putInt(r14, r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x019a, code lost:
        r8 = r0;
        r0 = r13 | r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x019d, code lost:
        r7 = r0;
        r0 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x019f, code lost:
        r6 = r38;
        r1 = r39;
        r3 = r5;
        r13 = r3;
        r16 = r15;
        r5 = r17;
        r2 = r21;
        r15 = r34;
        r17 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x01b1, code lost:
        r20 = r8;
        r4 = r15;
        r2 = true;
        r15 = r34;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0213, code lost:
        r11.putObject(r14, r6, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x023a, code lost:
        r7 = r13 | r23;
        r16 = r1;
        r3 = r5;
        r13 = r3;
        r5 = r17;
        r6 = r22;
        r1 = r39;
        r17 = r12;
        r12 = r2;
        r2 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0275, code lost:
        r4 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x02bf, code lost:
        r20 = r8;
        r2 = true;
     */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=int, for r0v7, types: [int, byte] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int u(T r35, byte[] r36, int r37, int r38, int r39, com.google.android.gms.internal.measurement.e5 r40) {
        /*
            r34 = this;
            r15 = r34
            r14 = r35
            r12 = r38
            r13 = r40
            sun.misc.Unsafe r11 = f2782o
            r4 = r36
            r0 = r37
            r1 = r39
            r6 = r12
            r3 = r13
            r2 = -1
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r7 = 0
            r16 = 0
            r17 = 0
        L_0x001b:
            java.lang.Object[] r8 = r15.f2784b
            r19 = 0
            int[] r10 = r15.f2783a
            if (r0 >= r6) goto L_0x0527
            int r9 = r0 + 1
            byte r0 = r4[r0]
            if (r0 >= 0) goto L_0x0034
            int r0 = s6.a.d0(r0, r4, r9, r3)
            int r9 = r3.f2685a
            r33 = r9
            r9 = r0
            r0 = r33
        L_0x0034:
            r22 = r6
            int r6 = r0 >>> 3
            r23 = r3
            r3 = r0 & 7
            r17 = r0
            int r0 = r15.d
            r24 = r1
            int r1 = r15.f2785c
            r12 = 3
            if (r6 <= r2) goto L_0x0057
            int r2 = r16 / 3
            if (r6 < r1) goto L_0x0052
            if (r6 > r0) goto L_0x0052
            int r0 = r15.q(r6, r2)
            goto L_0x0053
        L_0x0052:
            r0 = -1
        L_0x0053:
            r1 = r0
            r0 = -1
            r2 = 0
            goto L_0x0065
        L_0x0057:
            if (r6 < r1) goto L_0x0061
            if (r6 > r0) goto L_0x0061
            r2 = 0
            int r0 = r15.q(r6, r2)
            goto L_0x0063
        L_0x0061:
            r2 = 0
            r0 = -1
        L_0x0063:
            r1 = r0
            r0 = -1
        L_0x0065:
            if (r1 != r0) goto L_0x0081
            r23 = r0
            r18 = r2
            r22 = r5
            r27 = r6
            r20 = r8
            r31 = r10
            r32 = r11
            r14 = r15
            r8 = r17
            r6 = r24
            r16 = 1
            r2 = r9
            r9 = r18
            goto L_0x04be
        L_0x0081:
            int r16 = r1 + 1
            r12 = r10[r16]
            int r0 = r12 >>> 20
            r0 = r0 & 255(0xff, float:3.57E-43)
            r21 = r6
            r6 = 1048575(0xfffff, float:1.469367E-39)
            r2 = r12 & r6
            r25 = r7
            long r6 = (long) r2
            r2 = 17
            r26 = r12
            if (r0 > r2) goto L_0x037d
            int r2 = r1 + 2
            r2 = r10[r2]
            int r23 = r2 >>> 20
            r27 = 1
            int r23 = r27 << r23
            r12 = 1048575(0xfffff, float:1.469367E-39)
            r2 = r2 & r12
            if (r2 == r5) goto L_0x00b9
            if (r5 == r12) goto L_0x00b1
            long r12 = (long) r5
            r5 = r25
            r11.putInt(r14, r12, r5)
        L_0x00b1:
            long r12 = (long) r2
            int r5 = r11.getInt(r14, r12)
            r12 = r2
            r13 = r5
            goto L_0x00bd
        L_0x00b9:
            r12 = r25
            r13 = r12
            r12 = r5
        L_0x00bd:
            r2 = 5
            switch(r0) {
                case 0: goto L_0x0319;
                case 1: goto L_0x02f6;
                case 2: goto L_0x02c4;
                case 3: goto L_0x02c4;
                case 4: goto L_0x02a3;
                case 5: goto L_0x0277;
                case 6: goto L_0x024d;
                case 7: goto L_0x0217;
                case 8: goto L_0x01f1;
                case 9: goto L_0x01b9;
                case 10: goto L_0x0181;
                case 11: goto L_0x02a3;
                case 12: goto L_0x014c;
                case 13: goto L_0x024d;
                case 14: goto L_0x0277;
                case 15: goto L_0x012f;
                case 16: goto L_0x00f2;
                default: goto L_0x00c1;
            }
        L_0x00c1:
            r5 = r40
            r4 = r1
            r20 = r8
            r0 = 3
            r2 = 1
            r16 = -1
            r18 = 0
            r33 = r17
            r17 = r12
            r12 = r33
            if (r3 != r0) goto L_0x0342
            com.google.android.gms.internal.measurement.t7 r0 = r15.E(r4)
            int r1 = r21 << 3
            r8 = r1 | 4
            r1 = r36
            r2 = r9
            r3 = r38
            r9 = r4
            r4 = r8
            r8 = r5
            r5 = r40
            int r0 = s6.a.B0(r0, r1, r2, r3, r4, r5)
            r1 = r13 & r23
            if (r1 != 0) goto L_0x0344
            java.lang.Object r1 = r8.f2687c
            goto L_0x034e
        L_0x00f2:
            if (r3 != 0) goto L_0x011b
            r5 = r40
            int r8 = s6.a.k0(r4, r9, r5)
            long r2 = r5.f2686b
            long r9 = androidx.databinding.a.H(r2)
            r2 = r17
            r16 = -1
            r0 = r11
            r3 = r1
            r1 = r35
            r15 = r3
            r17 = r12
            r18 = 0
            r12 = r2
            r2 = r6
            r6 = r4
            r7 = r5
            r4 = r9
            r0.putLong(r1, r2, r4)
            r0 = r13 | r23
            r4 = r6
            r5 = r7
            goto L_0x019d
        L_0x011b:
            r16 = -1
            r18 = 0
            r33 = r17
            r17 = r12
            r12 = r33
            r15 = r34
            r4 = r1
            r20 = r8
            r2 = 1
            r8 = r40
            goto L_0x0368
        L_0x012f:
            r5 = r40
            r15 = r1
            r16 = -1
            r18 = 0
            r33 = r17
            r17 = r12
            r12 = r33
            if (r3 != 0) goto L_0x01b1
            int r0 = s6.a.U(r4, r9, r5)
            int r1 = r5.f2685a
            int r1 = androidx.databinding.a.D(r1)
        L_0x0148:
            r11.putInt(r14, r6, r1)
            goto L_0x019a
        L_0x014c:
            r5 = r40
            r15 = r1
            r16 = -1
            r18 = 0
            r33 = r17
            r17 = r12
            r12 = r33
            if (r3 != 0) goto L_0x01b1
            int r0 = s6.a.U(r4, r9, r5)
            int r1 = r5.f2685a
            int r2 = r15 / 3
            int r2 = r2 + r2
            r3 = 1
            int r2 = r2 + r3
            r2 = r8[r2]
            com.google.android.gms.internal.measurement.j6 r2 = (com.google.android.gms.internal.measurement.j6) r2
            if (r2 == 0) goto L_0x0148
            boolean r2 = r2.d(r1)
            if (r2 == 0) goto L_0x0173
            goto L_0x0148
        L_0x0173:
            com.google.android.gms.internal.measurement.f8 r2 = t(r35)
            long r6 = (long) r1
            java.lang.Long r1 = java.lang.Long.valueOf(r6)
            r2.c(r12, r1)
            r7 = r13
            goto L_0x019f
        L_0x0181:
            r5 = r40
            r15 = r1
            r0 = 2
            r16 = -1
            r18 = 0
            r33 = r17
            r17 = r12
            r12 = r33
            if (r3 != r0) goto L_0x01b1
            int r0 = s6.a.z0(r4, r9, r5)
            java.lang.Object r1 = r5.f2687c
            r11.putObject(r14, r6, r1)
        L_0x019a:
            r8 = r0
            r0 = r13 | r23
        L_0x019d:
            r7 = r0
            r0 = r8
        L_0x019f:
            r6 = r38
            r1 = r39
            r3 = r5
            r13 = r3
            r16 = r15
            r5 = r17
            r2 = r21
            r15 = r34
            r17 = r12
            goto L_0x0524
        L_0x01b1:
            r20 = r8
            r4 = r15
            r2 = 1
            r15 = r34
            goto L_0x0342
        L_0x01b9:
            r5 = r40
            r15 = r1
            r0 = 2
            r16 = -1
            r18 = 0
            r33 = r17
            r17 = r12
            r12 = r33
            if (r3 != r0) goto L_0x01ea
            r1 = r15
            r15 = r34
            com.google.android.gms.internal.measurement.t7 r0 = r15.E(r1)
            r2 = r38
            int r0 = s6.a.A0(r0, r4, r9, r2, r5)
            r3 = r13 & r23
            if (r3 != 0) goto L_0x01dd
            java.lang.Object r3 = r5.f2687c
            goto L_0x01e7
        L_0x01dd:
            java.lang.Object r3 = r11.getObject(r14, r6)
            java.lang.Object r8 = r5.f2687c
            com.google.android.gms.internal.measurement.f6 r3 = com.google.android.gms.internal.measurement.n6.c(r3, r8)
        L_0x01e7:
            r22 = r2
            goto L_0x0213
        L_0x01ea:
            r2 = r38
            r1 = r15
            r15 = r34
            goto L_0x0275
        L_0x01f1:
            r2 = r38
            r5 = r40
            r0 = 2
            r16 = -1
            r18 = 0
            r33 = r17
            r17 = r12
            r12 = r33
            if (r3 != r0) goto L_0x0275
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r26 & r0
            if (r0 != 0) goto L_0x020d
            int r0 = s6.a.w0(r4, r9, r5)
            goto L_0x0211
        L_0x020d:
            int r0 = s6.a.x0(r4, r9, r5)
        L_0x0211:
            java.lang.Object r3 = r5.f2687c
        L_0x0213:
            r11.putObject(r14, r6, r3)
            goto L_0x023a
        L_0x0217:
            r2 = r38
            r5 = r40
            r16 = -1
            r18 = 0
            r33 = r17
            r17 = r12
            r12 = r33
            if (r3 != 0) goto L_0x0275
            int r0 = s6.a.k0(r4, r9, r5)
            long r8 = r5.f2686b
            r19 = 0
            int r3 = (r8 > r19 ? 1 : (r8 == r19 ? 0 : -1))
            if (r3 == 0) goto L_0x0235
            r10 = 1
            goto L_0x0237
        L_0x0235:
            r10 = r18
        L_0x0237:
            com.google.android.gms.internal.measurement.o8.k(r14, r6, r10)
        L_0x023a:
            r7 = r13 | r23
            r16 = r1
            r3 = r5
            r13 = r3
            r5 = r17
            r6 = r22
            r1 = r39
            r17 = r12
            r12 = r2
            r2 = r21
            goto L_0x001b
        L_0x024d:
            r5 = r40
            r16 = -1
            r18 = 0
            r33 = r17
            r17 = r12
            r12 = r33
            if (r3 != r2) goto L_0x0275
            int r0 = s6.a.o0(r9, r4)
            r11.putInt(r14, r6, r0)
            int r9 = r9 + 4
            r7 = r13 | r23
            r3 = r5
            r8 = r3
            r0 = r9
            r5 = r17
            r10 = r21
            r6 = r22
            r17 = 1048575(0xfffff, float:1.469367E-39)
            r9 = r1
            goto L_0x03d2
        L_0x0275:
            r4 = r1
            goto L_0x02bf
        L_0x0277:
            r5 = r40
            r0 = 1
            r16 = -1
            r18 = 0
            r33 = r17
            r17 = r12
            r12 = r33
            if (r3 != r0) goto L_0x029d
            long r19 = s6.a.u0(r9, r4)
            r0 = r11
            r8 = r1
            r1 = r35
            r2 = r6
            r7 = r4
            r6 = r5
            r4 = r19
            r0.putLong(r1, r2, r4)
            int r9 = r9 + 8
            r5 = r6
            r4 = r8
            r8 = r7
            goto L_0x0339
        L_0x029d:
            r2 = r0
            r4 = r1
            r20 = r8
            goto L_0x0342
        L_0x02a3:
            r5 = r40
            r2 = r4
            r16 = -1
            r18 = 0
            r4 = r1
            r33 = r17
            r17 = r12
            r12 = r33
            if (r3 != 0) goto L_0x02bf
            int r9 = s6.a.U(r2, r9, r5)
            int r0 = r5.f2685a
            r11.putInt(r14, r6, r0)
            r8 = r2
            goto L_0x0339
        L_0x02bf:
            r20 = r8
            r2 = 1
            goto L_0x0342
        L_0x02c4:
            r5 = r40
            r2 = r4
            r16 = -1
            r18 = 0
            r4 = r1
            r33 = r17
            r17 = r12
            r12 = r33
            if (r3 != 0) goto L_0x02f3
            int r8 = s6.a.k0(r2, r9, r5)
            long r9 = r5.f2686b
            r0 = r11
            r1 = r35
            r37 = r8
            r8 = r2
            r2 = r6
            r7 = r4
            r6 = r5
            r4 = r9
            r0.putLong(r1, r2, r4)
            r0 = r13 | r23
            r1 = r37
            r9 = r7
            r4 = r8
            r7 = r0
            r8 = r6
            r6 = r22
            goto L_0x035d
        L_0x02f3:
            r20 = r8
            goto L_0x0316
        L_0x02f6:
            r5 = r40
            r20 = r8
            r16 = -1
            r18 = 0
            r8 = r4
            r4 = r1
            r33 = r17
            r17 = r12
            r12 = r33
            if (r3 != r2) goto L_0x0316
            int r0 = s6.a.o0(r9, r8)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            com.google.android.gms.internal.measurement.o8.m(r14, r6, r0)
            int r9 = r9 + 4
            goto L_0x0339
        L_0x0316:
            r8 = r5
            r2 = 1
            goto L_0x0368
        L_0x0319:
            r5 = r40
            r20 = r8
            r2 = 1
            r16 = -1
            r18 = 0
            r8 = r4
            r4 = r1
            r33 = r17
            r17 = r12
            r12 = r33
            if (r3 != r2) goto L_0x0342
            long r0 = s6.a.u0(r9, r8)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            com.google.android.gms.internal.measurement.o8.o(r14, r6, r0)
            int r9 = r9 + 8
        L_0x0339:
            r0 = r13 | r23
            r1 = r9
            r6 = r22
            r9 = r4
            r4 = r8
            r8 = r5
            goto L_0x035c
        L_0x0342:
            r8 = r5
            goto L_0x0368
        L_0x0344:
            java.lang.Object r1 = r11.getObject(r14, r6)
            java.lang.Object r2 = r8.f2687c
            com.google.android.gms.internal.measurement.f6 r1 = com.google.android.gms.internal.measurement.n6.c(r1, r2)
        L_0x034e:
            r11.putObject(r14, r6, r1)
            r1 = r13 | r23
            r4 = r36
            r6 = r38
            r33 = r1
            r1 = r0
            r0 = r33
        L_0x035c:
            r7 = r0
        L_0x035d:
            r0 = r1
            r3 = r8
            r5 = r17
            r10 = r21
            r17 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x03d2
        L_0x0368:
            r6 = r39
            r31 = r10
            r32 = r11
            r8 = r12
            r7 = r13
            r14 = r15
            r23 = r16
            r22 = r17
            r27 = r21
            r16 = r2
            r2 = r9
            r9 = r4
            goto L_0x04be
        L_0x037d:
            r4 = r1
            r20 = r8
            r8 = r13
            r12 = r17
            r13 = r25
            r2 = 1
            r16 = -1
            r18 = 0
            r1 = 27
            if (r0 != r1) goto L_0x03f3
            r1 = 2
            if (r3 != r1) goto L_0x03de
            java.lang.Object r0 = r11.getObject(r14, r6)
            com.google.android.gms.internal.measurement.m6 r0 = (com.google.android.gms.internal.measurement.m6) r0
            boolean r1 = r0.zza()
            if (r1 != 0) goto L_0x03ae
            int r1 = r0.size()
            if (r1 != 0) goto L_0x03a6
            r1 = 10
            goto L_0x03a7
        L_0x03a6:
            int r1 = r1 + r1
        L_0x03a7:
            com.google.android.gms.internal.measurement.m6 r0 = r0.x(r1)
            r11.putObject(r14, r6, r0)
        L_0x03ae:
            r6 = r0
            com.google.android.gms.internal.measurement.t7 r0 = r15.E(r4)
            r1 = r12
            r2 = r36
            r7 = r23
            r3 = r9
            r9 = r4
            r4 = r38
            r22 = r5
            r5 = r6
            r10 = r21
            r17 = 1048575(0xfffff, float:1.469367E-39)
            r6 = r40
            int r0 = s6.a.F0(r0, r1, r2, r3, r4, r5, r6)
            r4 = r36
            r6 = r38
            r3 = r7
            r7 = r13
            r5 = r22
        L_0x03d2:
            r1 = r39
            r13 = r8
            r16 = r9
            r2 = r10
            r17 = r12
            r12 = r38
            goto L_0x001b
        L_0x03de:
            r22 = r5
            r26 = r4
            r15 = r9
            r31 = r10
            r32 = r11
            r17 = r12
            r30 = r13
            r23 = r16
            r27 = r21
            r16 = r2
            goto L_0x0468
        L_0x03f3:
            r22 = r5
            r5 = r21
            r17 = 1048575(0xfffff, float:1.469367E-39)
            r1 = 49
            if (r0 > r1) goto L_0x0444
            r23 = r10
            r21 = r11
            r1 = r26
            long r10 = (long) r1
            r1 = r0
            r0 = r34
            r37 = r1
            r1 = r35
            r24 = r2
            r2 = r36
            r25 = r3
            r3 = r9
            r26 = r4
            r4 = r38
            r27 = r5
            r5 = r12
            r28 = r6
            r6 = r27
            r30 = r13
            r7 = r25
            r13 = r17
            r8 = r26
            r15 = r9
            r31 = r23
            r23 = r16
            r16 = r24
            r9 = r10
            r32 = r21
            r11 = r37
            r17 = r12
            r12 = r28
            r14 = r40
            int r0 = r0.B(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            r14 = r34
            r21 = r26
            if (r0 == r15) goto L_0x04b5
            goto L_0x04a3
        L_0x0444:
            r37 = r0
            r25 = r3
            r27 = r5
            r28 = r6
            r15 = r9
            r31 = r10
            r32 = r11
            r17 = r12
            r30 = r13
            r23 = r16
            r1 = r26
            r16 = r2
            r26 = r4
            r0 = 50
            r9 = r37
            if (r9 != r0) goto L_0x047e
            r7 = r25
            r0 = 2
            if (r7 == r0) goto L_0x0472
        L_0x0468:
            r14 = r34
            r6 = r39
            r2 = r15
            r8 = r17
            r9 = r26
            goto L_0x04bc
        L_0x0472:
            r14 = r34
            r15 = r35
            r13 = r26
            r10 = r28
            r14.C(r15, r13, r10)
            throw r19
        L_0x047e:
            r14 = r34
            r12 = r15
            r7 = r25
            r13 = r26
            r10 = r28
            r15 = r35
            r0 = r34
            r8 = r1
            r1 = r35
            r2 = r36
            r3 = r12
            r4 = r38
            r5 = r17
            r6 = r27
            r15 = r12
            r12 = r13
            r21 = r13
            r13 = r40
            int r0 = r0.D(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 == r15) goto L_0x04b5
        L_0x04a3:
            r12 = r35
            r1 = r39
            r10 = r40
            r8 = r17
            r16 = r21
            r5 = r22
            r11 = r27
            r7 = r30
            goto L_0x0517
        L_0x04b5:
            r6 = r39
            r2 = r0
            r8 = r17
            r9 = r21
        L_0x04bc:
            r7 = r30
        L_0x04be:
            if (r8 != r6) goto L_0x04ca
            if (r6 == 0) goto L_0x04ca
            r12 = r35
            r0 = r2
            r1 = r6
            r5 = r22
            goto L_0x0539
        L_0x04ca:
            boolean r0 = r14.f2787f
            if (r0 == 0) goto L_0x04fd
            com.google.android.gms.internal.measurement.r5 r0 = com.google.android.gms.internal.measurement.r5.a()
            r10 = r40
            com.google.android.gms.internal.measurement.r5 r1 = r10.d
            if (r1 == r0) goto L_0x04fa
            com.google.android.gms.internal.measurement.i7 r0 = r14.f2786e
            r11 = r27
            com.google.android.gms.internal.measurement.e6 r0 = r1.b(r0, r11)
            if (r0 != 0) goto L_0x04f4
            com.google.android.gms.internal.measurement.f8 r4 = t(r35)
            r0 = r8
            r1 = r36
            r3 = r38
            r5 = r40
            int r0 = s6.a.G0(r0, r1, r2, r3, r4, r5)
            r12 = r35
            goto L_0x0512
        L_0x04f4:
            r12 = r35
            r0 = r12
            com.google.android.gms.internal.measurement.d6 r0 = (com.google.android.gms.internal.measurement.d6) r0
            throw r19
        L_0x04fa:
            r12 = r35
            goto L_0x0501
        L_0x04fd:
            r12 = r35
            r10 = r40
        L_0x0501:
            r11 = r27
            com.google.android.gms.internal.measurement.f8 r4 = t(r35)
            r0 = r8
            r1 = r36
            r3 = r38
            r5 = r40
            int r0 = s6.a.G0(r0, r1, r2, r3, r4, r5)
        L_0x0512:
            r1 = r6
            r16 = r9
            r5 = r22
        L_0x0517:
            r4 = r36
            r6 = r38
            r17 = r8
            r3 = r10
            r13 = r3
            r2 = r11
            r15 = r14
            r11 = r32
            r14 = r12
        L_0x0524:
            r12 = r6
            goto L_0x001b
        L_0x0527:
            r24 = r1
            r22 = r5
            r30 = r7
            r20 = r8
            r31 = r10
            r32 = r11
            r12 = r14
            r14 = r15
            r16 = 1
            r8 = r17
        L_0x0539:
            r2 = 1048575(0xfffff, float:1.469367E-39)
            if (r5 == r2) goto L_0x0544
            long r3 = (long) r5
            r5 = r32
            r5.putInt(r12, r3, r7)
        L_0x0544:
            int r3 = r14.f2790i
        L_0x0546:
            int r4 = r14.f2791j
            if (r3 >= r4) goto L_0x0574
            int[] r4 = r14.f2789h
            r4 = r4[r3]
            r5 = r31[r4]
            int r5 = r14.b(r4)
            r5 = r5 & r2
            long r5 = (long) r5
            java.lang.Object r5 = com.google.android.gms.internal.measurement.o8.p(r5, r12)
            if (r5 != 0) goto L_0x055d
            goto L_0x0568
        L_0x055d:
            int r6 = r4 / 3
            int r6 = r6 + r6
            int r6 = r6 + 1
            r6 = r20[r6]
            com.google.android.gms.internal.measurement.j6 r6 = (com.google.android.gms.internal.measurement.j6) r6
            if (r6 != 0) goto L_0x056b
        L_0x0568:
            int r3 = r3 + 1
            goto L_0x0546
        L_0x056b:
            com.google.android.gms.internal.measurement.d7 r5 = (com.google.android.gms.internal.measurement.d7) r5
            java.lang.Object r0 = r14.F(r4)
            com.google.android.gms.internal.measurement.c7 r0 = (com.google.android.gms.internal.measurement.c7) r0
            throw r19
        L_0x0574:
            r2 = r38
            if (r1 != 0) goto L_0x0580
            if (r0 != r2) goto L_0x057b
            goto L_0x0584
        L_0x057b:
            com.google.android.gms.internal.measurement.p6 r0 = com.google.android.gms.internal.measurement.p6.c()
            throw r0
        L_0x0580:
            if (r0 > r2) goto L_0x0585
            if (r8 != r1) goto L_0x0585
        L_0x0584:
            return r0
        L_0x0585:
            com.google.android.gms.internal.measurement.p6 r0 = com.google.android.gms.internal.measurement.p6.c()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.l7.u(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.measurement.e5):int");
    }

    public final void x(int i10, Object obj, Object obj2) {
        long b10 = (long) (b(i10) & 1048575);
        if (m(i10, obj2)) {
            Object p10 = o8.p(b10, obj);
            Object p11 = o8.p(b10, obj2);
            if (p10 != null && p11 != null) {
                p11 = n6.c(p10, p11);
            } else if (p11 == null) {
                return;
            }
            o8.q(b10, obj, p11);
            n(i10, obj);
        }
    }

    public final void y(int i10, Object obj, Object obj2) {
        int b10 = b(i10);
        int i11 = this.f2783a[i10];
        long j8 = (long) (b10 & 1048575);
        if (o(i11, i10, obj2)) {
            Object p10 = o(i11, i10, obj) ? o8.p(j8, obj) : null;
            Object p11 = o8.p(j8, obj2);
            if (p10 != null && p11 != null) {
                p11 = n6.c(p10, p11);
            } else if (p11 == null) {
                return;
            }
            o8.q(j8, obj, p11);
            p(i11, i10, obj);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x02bf, code lost:
        r2 = com.google.android.gms.internal.measurement.n5.H0(r10, (com.google.android.gms.internal.measurement.i7) r14.getObject(r1, r2), E(r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0313, code lost:
        r2 = com.google.android.gms.internal.measurement.n5.Z0(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0324, code lost:
        r2 = com.google.android.gms.internal.measurement.u7.Q(r10, E(r4), r14.getObject(r1, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x033d, code lost:
        r3 = com.google.android.gms.internal.measurement.n5.Z0(r10 << 3);
        r2 = ((com.google.android.gms.internal.measurement.k5) r2).i();
        r5 = r5 + ((com.google.android.gms.internal.measurement.n5.Z0(r2) + r2) + r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0363, code lost:
        r2 = com.google.android.gms.internal.measurement.n5.Z0(r10 << 3) + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0378, code lost:
        r2 = r14.getInt(r1, r2);
        r3 = com.google.android.gms.internal.measurement.n5.Z0(r10 << 3);
        r2 = com.google.android.gms.internal.measurement.n5.Y0(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0386, code lost:
        r2 = r2 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x038f, code lost:
        r2 = r14.getLong(r1, r2);
        r8 = com.google.android.gms.internal.measurement.n5.Z0(r10 << 3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0399, code lost:
        r2 = com.google.android.gms.internal.measurement.n5.a1(r2) + r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x03a3, code lost:
        r2 = com.google.android.gms.internal.measurement.n5.Z0(r10 << 3) + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x03b0, code lost:
        r2 = com.google.android.gms.internal.measurement.n5.Z0(r10 << 3) + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x03b8, code lost:
        r5 = r5 + r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0099, code lost:
        r2 = com.google.android.gms.internal.measurement.n5.Z0(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00c0, code lost:
        r3 = com.google.android.gms.internal.measurement.n5.Z0(r10 << 3);
        r2 = ((com.google.android.gms.internal.measurement.k5) r2).i();
        r8 = (com.google.android.gms.internal.measurement.n5.Z0(r2) + r2) + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00fe, code lost:
        r2 = d(r2, r1);
        r3 = com.google.android.gms.internal.measurement.n5.Z0(r10 << 3);
        r2 = com.google.android.gms.internal.measurement.n5.Y0(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x011b, code lost:
        r2 = e(r2, r1);
        r8 = com.google.android.gms.internal.measurement.n5.Z0(r10 << 3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x020f, code lost:
        r8 = (com.google.android.gms.internal.measurement.n5.Z0(r2) + com.google.android.gms.internal.measurement.n5.X0(r10)) + r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0219, code lost:
        r5 = r5 + r8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int z(T r16) {
        /*
            r15 = this;
            r0 = r15
            r1 = r16
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r6 = r2
            r4 = 0
            r5 = 0
            r7 = 0
        L_0x000a:
            int[] r8 = r0.f2783a
            int r9 = r8.length
            if (r4 >= r9) goto L_0x03c0
            int r9 = r15.b(r4)
            r10 = r8[r4]
            int r11 = r9 >>> 20
            r11 = r11 & 255(0xff, float:3.57E-43)
            r12 = 17
            r13 = 1
            sun.misc.Unsafe r14 = f2782o
            if (r11 > r12) goto L_0x0033
            int r12 = r4 + 2
            r8 = r8[r12]
            r12 = r8 & r2
            int r8 = r8 >>> 20
            int r8 = r13 << r8
            if (r12 == r6) goto L_0x0034
            long r6 = (long) r12
            int r7 = r14.getInt(r1, r6)
            r6 = r12
            goto L_0x0034
        L_0x0033:
            r8 = 0
        L_0x0034:
            r9 = r9 & r2
            long r2 = (long) r9
            r9 = 63
            switch(r11) {
                case 0: goto L_0x03ac;
                case 1: goto L_0x039f;
                case 2: goto L_0x038c;
                case 3: goto L_0x0388;
                case 4: goto L_0x0375;
                case 5: goto L_0x0370;
                case 6: goto L_0x036b;
                case 7: goto L_0x035f;
                case 8: goto L_0x0332;
                case 9: goto L_0x0321;
                case 10: goto L_0x0319;
                case 11: goto L_0x0306;
                case 12: goto L_0x0301;
                case 13: goto L_0x02fb;
                case 14: goto L_0x02f5;
                case 15: goto L_0x02e2;
                case 16: goto L_0x02cf;
                case 17: goto L_0x02bc;
                case 18: goto L_0x02b0;
                case 19: goto L_0x02a4;
                case 20: goto L_0x0298;
                case 21: goto L_0x028c;
                case 22: goto L_0x0280;
                case 23: goto L_0x02b0;
                case 24: goto L_0x02a4;
                case 25: goto L_0x0274;
                case 26: goto L_0x0268;
                case 27: goto L_0x0258;
                case 28: goto L_0x024c;
                case 29: goto L_0x0240;
                case 30: goto L_0x0234;
                case 31: goto L_0x02a4;
                case 32: goto L_0x02b0;
                case 33: goto L_0x0228;
                case 34: goto L_0x021c;
                case 35: goto L_0x0203;
                case 36: goto L_0x01f6;
                case 37: goto L_0x01e9;
                case 38: goto L_0x01dc;
                case 39: goto L_0x01cf;
                case 40: goto L_0x01c2;
                case 41: goto L_0x01b5;
                case 42: goto L_0x01a8;
                case 43: goto L_0x019a;
                case 44: goto L_0x018c;
                case 45: goto L_0x017e;
                case 46: goto L_0x0170;
                case 47: goto L_0x0162;
                case 48: goto L_0x0154;
                case 49: goto L_0x0144;
                case 50: goto L_0x0137;
                case 51: goto L_0x012f;
                case 52: goto L_0x0127;
                case 53: goto L_0x0115;
                case 54: goto L_0x010e;
                case 55: goto L_0x00f8;
                case 56: goto L_0x00f1;
                case 57: goto L_0x00ea;
                case 58: goto L_0x00e2;
                case 59: goto L_0x00b2;
                case 60: goto L_0x00aa;
                case 61: goto L_0x009f;
                case 62: goto L_0x0089;
                case 63: goto L_0x0081;
                case 64: goto L_0x0079;
                case 65: goto L_0x0071;
                case 66: goto L_0x005b;
                case 67: goto L_0x0045;
                case 68: goto L_0x003d;
                default: goto L_0x003b;
            }
        L_0x003b:
            goto L_0x03b9
        L_0x003d:
            boolean r8 = r15.o(r10, r4, r1)
            if (r8 == 0) goto L_0x03b9
            goto L_0x02bf
        L_0x0045:
            boolean r8 = r15.o(r10, r4, r1)
            if (r8 == 0) goto L_0x03b9
            long r2 = e(r2, r1)
            int r8 = r10 << 3
            int r8 = com.google.android.gms.internal.measurement.n5.Z0(r8)
            long r10 = r2 + r2
            long r2 = r2 >> r9
            long r2 = r2 ^ r10
            goto L_0x0399
        L_0x005b:
            boolean r8 = r15.o(r10, r4, r1)
            if (r8 == 0) goto L_0x03b9
            int r2 = d(r2, r1)
            int r3 = r10 << 3
            int r3 = com.google.android.gms.internal.measurement.n5.Z0(r3)
            int r8 = r2 + r2
            int r2 = r2 >> 31
            r2 = r2 ^ r8
            goto L_0x0099
        L_0x0071:
            boolean r2 = r15.o(r10, r4, r1)
            if (r2 == 0) goto L_0x03b9
            goto L_0x0135
        L_0x0079:
            boolean r2 = r15.o(r10, r4, r1)
            if (r2 == 0) goto L_0x03b9
            goto L_0x012d
        L_0x0081:
            boolean r8 = r15.o(r10, r4, r1)
            if (r8 == 0) goto L_0x03b9
            goto L_0x00fe
        L_0x0089:
            boolean r8 = r15.o(r10, r4, r1)
            if (r8 == 0) goto L_0x03b9
            int r2 = d(r2, r1)
            int r3 = r10 << 3
            int r3 = com.google.android.gms.internal.measurement.n5.Z0(r3)
        L_0x0099:
            int r2 = com.google.android.gms.internal.measurement.n5.Z0(r2)
            goto L_0x0386
        L_0x009f:
            boolean r8 = r15.o(r10, r4, r1)
            if (r8 == 0) goto L_0x03b9
            java.lang.Object r2 = r14.getObject(r1, r2)
            goto L_0x00c0
        L_0x00aa:
            boolean r8 = r15.o(r10, r4, r1)
            if (r8 == 0) goto L_0x03b9
            goto L_0x0324
        L_0x00b2:
            boolean r8 = r15.o(r10, r4, r1)
            if (r8 == 0) goto L_0x03b9
            java.lang.Object r2 = r14.getObject(r1, r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.measurement.k5
            if (r3 == 0) goto L_0x00d4
        L_0x00c0:
            com.google.android.gms.internal.measurement.k5 r2 = (com.google.android.gms.internal.measurement.k5) r2
            int r3 = r10 << 3
            int r3 = com.google.android.gms.internal.measurement.n5.Z0(r3)
            int r2 = r2.i()
            int r8 = com.google.android.gms.internal.measurement.n5.Z0(r2)
            int r8 = r8 + r2
            int r8 = r8 + r3
            goto L_0x0219
        L_0x00d4:
            java.lang.String r2 = (java.lang.String) r2
            int r3 = r10 << 3
            int r3 = com.google.android.gms.internal.measurement.n5.Z0(r3)
            int r2 = com.google.android.gms.internal.measurement.n5.b1(r2)
            goto L_0x0386
        L_0x00e2:
            boolean r2 = r15.o(r10, r4, r1)
            if (r2 == 0) goto L_0x03b9
            goto L_0x0363
        L_0x00ea:
            boolean r2 = r15.o(r10, r4, r1)
            if (r2 == 0) goto L_0x03b9
            goto L_0x012d
        L_0x00f1:
            boolean r2 = r15.o(r10, r4, r1)
            if (r2 == 0) goto L_0x03b9
            goto L_0x0135
        L_0x00f8:
            boolean r8 = r15.o(r10, r4, r1)
            if (r8 == 0) goto L_0x03b9
        L_0x00fe:
            int r2 = d(r2, r1)
            int r3 = r10 << 3
            int r3 = com.google.android.gms.internal.measurement.n5.Z0(r3)
            int r2 = com.google.android.gms.internal.measurement.n5.Y0(r2)
            goto L_0x0386
        L_0x010e:
            boolean r8 = r15.o(r10, r4, r1)
            if (r8 == 0) goto L_0x03b9
            goto L_0x011b
        L_0x0115:
            boolean r8 = r15.o(r10, r4, r1)
            if (r8 == 0) goto L_0x03b9
        L_0x011b:
            long r2 = e(r2, r1)
            int r8 = r10 << 3
            int r8 = com.google.android.gms.internal.measurement.n5.Z0(r8)
            goto L_0x0399
        L_0x0127:
            boolean r2 = r15.o(r10, r4, r1)
            if (r2 == 0) goto L_0x03b9
        L_0x012d:
            goto L_0x03a3
        L_0x012f:
            boolean r2 = r15.o(r10, r4, r1)
            if (r2 == 0) goto L_0x03b9
        L_0x0135:
            goto L_0x03b0
        L_0x0137:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.lang.Object r3 = r15.F(r4)
            com.google.android.gms.internal.measurement.e7.a(r2, r3)
            goto L_0x03b9
        L_0x0144:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            com.google.android.gms.internal.measurement.t7 r3 = r15.E(r4)
            int r2 = com.google.android.gms.internal.measurement.u7.T(r10, r2, r3)
            goto L_0x03b8
        L_0x0154:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.measurement.u7.z(r2)
            if (r2 <= 0) goto L_0x03b9
            goto L_0x020f
        L_0x0162:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.measurement.u7.H(r2)
            if (r2 <= 0) goto L_0x03b9
            goto L_0x020f
        L_0x0170:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.measurement.u7.L(r2)
            if (r2 <= 0) goto L_0x03b9
            goto L_0x020f
        L_0x017e:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.measurement.u7.J(r2)
            if (r2 <= 0) goto L_0x03b9
            goto L_0x020f
        L_0x018c:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.measurement.u7.B(r2)
            if (r2 <= 0) goto L_0x03b9
            goto L_0x020f
        L_0x019a:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.measurement.u7.F(r2)
            if (r2 <= 0) goto L_0x03b9
            goto L_0x020f
        L_0x01a8:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.measurement.u7.N(r2)
            if (r2 <= 0) goto L_0x03b9
            goto L_0x020f
        L_0x01b5:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.measurement.u7.J(r2)
            if (r2 <= 0) goto L_0x03b9
            goto L_0x020f
        L_0x01c2:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.measurement.u7.L(r2)
            if (r2 <= 0) goto L_0x03b9
            goto L_0x020f
        L_0x01cf:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.measurement.u7.D(r2)
            if (r2 <= 0) goto L_0x03b9
            goto L_0x020f
        L_0x01dc:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.measurement.u7.x(r2)
            if (r2 <= 0) goto L_0x03b9
            goto L_0x020f
        L_0x01e9:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.measurement.u7.v(r2)
            if (r2 <= 0) goto L_0x03b9
            goto L_0x020f
        L_0x01f6:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.measurement.u7.J(r2)
            if (r2 <= 0) goto L_0x03b9
            goto L_0x020f
        L_0x0203:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.measurement.u7.L(r2)
            if (r2 <= 0) goto L_0x03b9
        L_0x020f:
            int r3 = com.google.android.gms.internal.measurement.n5.X0(r10)
            int r8 = com.google.android.gms.internal.measurement.n5.Z0(r2)
            int r8 = r8 + r3
            int r8 = r8 + r2
        L_0x0219:
            int r5 = r5 + r8
            goto L_0x03b9
        L_0x021c:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.measurement.u7.A(r10, r2)
            goto L_0x03b8
        L_0x0228:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.measurement.u7.I(r10, r2)
            goto L_0x03b8
        L_0x0234:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.measurement.u7.C(r10, r2)
            goto L_0x03b8
        L_0x0240:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.measurement.u7.G(r10, r2)
            goto L_0x03b8
        L_0x024c:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.measurement.u7.S(r10, r2)
            goto L_0x03b8
        L_0x0258:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            com.google.android.gms.internal.measurement.t7 r3 = r15.E(r4)
            int r2 = com.google.android.gms.internal.measurement.u7.R(r10, r2, r3)
            goto L_0x03b8
        L_0x0268:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.measurement.u7.P(r10, r2)
            goto L_0x03b8
        L_0x0274:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.measurement.u7.O(r10, r2)
            goto L_0x03b8
        L_0x0280:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.measurement.u7.E(r10, r2)
            goto L_0x03b8
        L_0x028c:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.measurement.u7.y(r10, r2)
            goto L_0x03b8
        L_0x0298:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.measurement.u7.w(r10, r2)
            goto L_0x03b8
        L_0x02a4:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.measurement.u7.K(r10, r2)
            goto L_0x03b8
        L_0x02b0:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.measurement.u7.M(r10, r2)
            goto L_0x03b8
        L_0x02bc:
            r8 = r8 & r7
            if (r8 == 0) goto L_0x03b9
        L_0x02bf:
            java.lang.Object r2 = r14.getObject(r1, r2)
            com.google.android.gms.internal.measurement.i7 r2 = (com.google.android.gms.internal.measurement.i7) r2
            com.google.android.gms.internal.measurement.t7 r3 = r15.E(r4)
            int r2 = com.google.android.gms.internal.measurement.n5.H0(r10, r2, r3)
            goto L_0x03b8
        L_0x02cf:
            r8 = r8 & r7
            if (r8 == 0) goto L_0x03b9
            long r2 = r14.getLong(r1, r2)
            int r8 = r10 << 3
            int r8 = com.google.android.gms.internal.measurement.n5.Z0(r8)
            long r10 = r2 + r2
            long r2 = r2 >> r9
            long r2 = r2 ^ r10
            goto L_0x0399
        L_0x02e2:
            r8 = r8 & r7
            if (r8 == 0) goto L_0x03b9
            int r2 = r14.getInt(r1, r2)
            int r3 = r10 << 3
            int r3 = com.google.android.gms.internal.measurement.n5.Z0(r3)
            int r8 = r2 + r2
            int r2 = r2 >> 31
            r2 = r2 ^ r8
            goto L_0x0313
        L_0x02f5:
            r2 = r7 & r8
            if (r2 == 0) goto L_0x03b9
            goto L_0x03b0
        L_0x02fb:
            r2 = r7 & r8
            if (r2 == 0) goto L_0x03b9
            goto L_0x03a3
        L_0x0301:
            r8 = r8 & r7
            if (r8 == 0) goto L_0x03b9
            goto L_0x0378
        L_0x0306:
            r8 = r8 & r7
            if (r8 == 0) goto L_0x03b9
            int r2 = r14.getInt(r1, r2)
            int r3 = r10 << 3
            int r3 = com.google.android.gms.internal.measurement.n5.Z0(r3)
        L_0x0313:
            int r2 = com.google.android.gms.internal.measurement.n5.Z0(r2)
            goto L_0x0386
        L_0x0319:
            r8 = r8 & r7
            if (r8 == 0) goto L_0x03b9
            java.lang.Object r2 = r14.getObject(r1, r2)
            goto L_0x033d
        L_0x0321:
            r8 = r8 & r7
            if (r8 == 0) goto L_0x03b9
        L_0x0324:
            java.lang.Object r2 = r14.getObject(r1, r2)
            com.google.android.gms.internal.measurement.t7 r3 = r15.E(r4)
            int r2 = com.google.android.gms.internal.measurement.u7.Q(r10, r3, r2)
            goto L_0x03b8
        L_0x0332:
            r8 = r8 & r7
            if (r8 == 0) goto L_0x03b9
            java.lang.Object r2 = r14.getObject(r1, r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.measurement.k5
            if (r3 == 0) goto L_0x0352
        L_0x033d:
            com.google.android.gms.internal.measurement.k5 r2 = (com.google.android.gms.internal.measurement.k5) r2
            int r3 = r10 << 3
            int r3 = com.google.android.gms.internal.measurement.n5.Z0(r3)
            int r2 = r2.i()
            int r8 = com.google.android.gms.internal.measurement.n5.Z0(r2)
            int r8 = r8 + r2
            int r8 = r8 + r3
            int r5 = r5 + r8
            goto L_0x03b9
        L_0x0352:
            java.lang.String r2 = (java.lang.String) r2
            int r3 = r10 << 3
            int r3 = com.google.android.gms.internal.measurement.n5.Z0(r3)
            int r2 = com.google.android.gms.internal.measurement.n5.b1(r2)
            goto L_0x0386
        L_0x035f:
            r2 = r7 & r8
            if (r2 == 0) goto L_0x03b9
        L_0x0363:
            int r2 = r10 << 3
            int r2 = com.google.android.gms.internal.measurement.n5.Z0(r2)
            int r2 = r2 + r13
            goto L_0x03b8
        L_0x036b:
            r2 = r7 & r8
            if (r2 == 0) goto L_0x03b9
            goto L_0x03a3
        L_0x0370:
            r2 = r7 & r8
            if (r2 == 0) goto L_0x03b9
            goto L_0x03b0
        L_0x0375:
            r8 = r8 & r7
            if (r8 == 0) goto L_0x03b9
        L_0x0378:
            int r2 = r14.getInt(r1, r2)
            int r3 = r10 << 3
            int r3 = com.google.android.gms.internal.measurement.n5.Z0(r3)
            int r2 = com.google.android.gms.internal.measurement.n5.Y0(r2)
        L_0x0386:
            int r2 = r2 + r3
            goto L_0x03b8
        L_0x0388:
            r8 = r8 & r7
            if (r8 == 0) goto L_0x03b9
            goto L_0x038f
        L_0x038c:
            r8 = r8 & r7
            if (r8 == 0) goto L_0x03b9
        L_0x038f:
            long r2 = r14.getLong(r1, r2)
            int r8 = r10 << 3
            int r8 = com.google.android.gms.internal.measurement.n5.Z0(r8)
        L_0x0399:
            int r2 = com.google.android.gms.internal.measurement.n5.a1(r2)
            int r2 = r2 + r8
            goto L_0x03b8
        L_0x039f:
            r2 = r7 & r8
            if (r2 == 0) goto L_0x03b9
        L_0x03a3:
            int r2 = r10 << 3
            int r2 = com.google.android.gms.internal.measurement.n5.Z0(r2)
            int r2 = r2 + 4
            goto L_0x03b8
        L_0x03ac:
            r2 = r7 & r8
            if (r2 == 0) goto L_0x03b9
        L_0x03b0:
            int r2 = r10 << 3
            int r2 = com.google.android.gms.internal.measurement.n5.Z0(r2)
            int r2 = r2 + 8
        L_0x03b8:
            int r5 = r5 + r2
        L_0x03b9:
            int r4 = r4 + 3
            r2 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x000a
        L_0x03c0:
            com.google.android.gms.internal.measurement.e8<?, ?> r2 = r0.l
            com.google.android.gms.internal.measurement.f8 r3 = r2.d(r1)
            int r2 = r2.h(r3)
            int r2 = r2 + r5
            boolean r3 = r0.f2787f
            if (r3 != 0) goto L_0x03d0
            return r2
        L_0x03d0:
            com.google.android.gms.internal.measurement.s5<?> r2 = r0.f2793m
            r2.b(r1)
            r1 = 0
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.l7.z(java.lang.Object):int");
    }

    public final T zza() {
        return ((f6) this.f2786e).q(4);
    }
}
