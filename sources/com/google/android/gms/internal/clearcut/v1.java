package com.google.android.gms.internal.clearcut;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import s6.a;
import sun.misc.Unsafe;

public final class v1<T> implements i2<T> {

    /* renamed from: q  reason: collision with root package name */
    public static final Unsafe f2551q = a3.l();

    /* renamed from: a  reason: collision with root package name */
    public final int[] f2552a;

    /* renamed from: b  reason: collision with root package name */
    public final Object[] f2553b;

    /* renamed from: c  reason: collision with root package name */
    public final int f2554c;
    public final int d;

    /* renamed from: e  reason: collision with root package name */
    public final int f2555e;

    /* renamed from: f  reason: collision with root package name */
    public final r1 f2556f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f2557g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f2558h;

    /* renamed from: i  reason: collision with root package name */
    public final int[] f2559i;

    /* renamed from: j  reason: collision with root package name */
    public final int[] f2560j;

    /* renamed from: k  reason: collision with root package name */
    public final int[] f2561k;
    public final y1 l;

    /* renamed from: m  reason: collision with root package name */
    public final e1 f2562m;

    /* renamed from: n  reason: collision with root package name */
    public final u2<?, ?> f2563n;

    /* renamed from: o  reason: collision with root package name */
    public final c0<?> f2564o;

    /* renamed from: p  reason: collision with root package name */
    public final m1 f2565p;

    public v1(int[] iArr, Object[] objArr, int i10, int i11, int i12, r1 r1Var, boolean z, int[] iArr2, int[] iArr3, int[] iArr4, y1 y1Var, e1 e1Var, u2 u2Var, c0 c0Var, m1 m1Var) {
        this.f2552a = iArr;
        this.f2553b = objArr;
        this.f2554c = i10;
        this.d = i11;
        this.f2555e = i12;
        boolean z10 = r1Var instanceof p0;
        this.f2558h = z;
        this.f2557g = c0Var != null && c0Var.f(r1Var);
        this.f2559i = iArr2;
        this.f2560j = iArr3;
        this.f2561k = iArr4;
        this.l = y1Var;
        this.f2562m = e1Var;
        this.f2563n = u2Var;
        this.f2564o = c0Var;
        this.f2556f = r1Var;
        this.f2565p = m1Var;
    }

    public static List G(long j8, Object obj) {
        return (List) a3.w(j8, obj);
    }

    public static int H(long j8, Object obj) {
        return ((Integer) a3.w(j8, obj)).intValue();
    }

    public static long I(long j8, Object obj) {
        return ((Long) a3.w(j8, obj)).longValue();
    }

    public static int j(i2<?> i2Var, int i10, byte[] bArr, int i11, int i12, u0<?> u0Var, r rVar) {
        int l8 = l(i2Var, bArr, i11, i12, rVar);
        while (true) {
            u0Var.add(rVar.f2536c);
            if (l8 >= i12) {
                break;
            }
            int S = a.S(bArr, l8, rVar);
            if (i10 != rVar.f2534a) {
                break;
            }
            l8 = l(i2Var, bArr, S, i12, rVar);
        }
        return l8;
    }

    public static int k(i2 i2Var, byte[] bArr, int i10, int i11, int i12, r rVar) {
        v1 v1Var = (v1) i2Var;
        Object g10 = v1Var.g();
        int o10 = v1Var.o(g10, bArr, i10, i11, i12, rVar);
        v1Var.a(g10);
        rVar.f2536c = g10;
        return o10;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int l(com.google.android.gms.internal.clearcut.i2 r6, byte[] r7, int r8, int r9, com.google.android.gms.internal.clearcut.r r10) {
        /*
            int r0 = r8 + 1
            byte r8 = r7[r8]
            if (r8 >= 0) goto L_0x000c
            int r0 = s6.a.R(r8, r7, r0, r10)
            int r8 = r10.f2534a
        L_0x000c:
            r3 = r0
            if (r8 < 0) goto L_0x0025
            int r9 = r9 - r3
            if (r8 > r9) goto L_0x0025
            java.lang.Object r9 = r6.g()
            int r8 = r8 + r3
            r0 = r6
            r1 = r9
            r2 = r7
            r4 = r8
            r5 = r10
            r0.c(r1, r2, r3, r4, r5)
            r6.a(r9)
            r10.f2536c = r9
            return r8
        L_0x0025:
            com.google.android.gms.internal.clearcut.v0 r6 = com.google.android.gms.internal.clearcut.v0.a()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.v1.l(com.google.android.gms.internal.clearcut.i2, byte[], int, int, com.google.android.gms.internal.clearcut.r):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x01a0  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x01b1 A[EDGE_INSN: B:107:0x01b1->B:103:0x01b1 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0181  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0187  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.clearcut.v1 p(com.google.android.gms.internal.clearcut.p1 r22, com.google.android.gms.internal.clearcut.y1 r23, com.google.android.gms.internal.clearcut.e1 r24, com.google.android.gms.internal.clearcut.u2 r25, com.google.android.gms.internal.clearcut.c0 r26, com.google.android.gms.internal.clearcut.m1 r27) {
        /*
            r0 = r22
            boolean r1 = r0 instanceof com.google.android.gms.internal.clearcut.f2
            r2 = 0
            if (r1 == 0) goto L_0x01cd
            com.google.android.gms.internal.clearcut.f2 r0 = (com.google.android.gms.internal.clearcut.f2) r0
            int r1 = r0.a()
            r3 = 2
            r5 = 1
            if (r1 != r3) goto L_0x0013
            r13 = r5
            goto L_0x0014
        L_0x0013:
            r13 = 0
        L_0x0014:
            com.google.android.gms.internal.clearcut.g2 r1 = r0.f2420b
            int r6 = r1.f2427e
            if (r6 != 0) goto L_0x001e
            r8 = 0
            r9 = 0
            r10 = 0
            goto L_0x0026
        L_0x001e:
            int r6 = r1.f2429g
            int r7 = r1.f2430h
            int r8 = r1.f2433k
            r9 = r6
            r10 = r7
        L_0x0026:
            int r6 = r8 << 2
            int[] r7 = new int[r6]
            int r6 = r8 << 1
            java.lang.Object[] r8 = new java.lang.Object[r6]
            int r6 = r1.f2431i
            if (r6 <= 0) goto L_0x0036
            int[] r6 = new int[r6]
            r15 = r6
            goto L_0x0037
        L_0x0036:
            r15 = r2
        L_0x0037:
            int r6 = r1.l
            if (r6 <= 0) goto L_0x003d
            int[] r2 = new int[r6]
        L_0x003d:
            r16 = r2
            boolean r2 = r1.a()
            if (r2 == 0) goto L_0x01ac
            int r2 = r1.f2440s
            r6 = 0
            r11 = 0
            r12 = 0
        L_0x004a:
            int r14 = r1.f2432j
            if (r2 >= r14) goto L_0x0067
            int r14 = r2 - r9
            int r14 = r14 << r3
            if (r6 >= r14) goto L_0x0067
            r14 = 0
        L_0x0054:
            r3 = 4
            if (r14 >= r3) goto L_0x0060
            int r3 = r6 + r14
            r17 = -1
            r7[r3] = r17
            int r14 = r14 + 1
            goto L_0x0054
        L_0x0060:
            r20 = r10
            r19 = r13
            r13 = r9
            goto L_0x01a2
        L_0x0067:
            int r2 = r1.u
            com.google.android.gms.internal.clearcut.k0 r3 = com.google.android.gms.internal.clearcut.k0.MAP
            int r14 = r3.id()
            if (r2 <= r14) goto L_0x0073
            r2 = r5
            goto L_0x0074
        L_0x0073:
            r2 = 0
        L_0x0074:
            java.lang.Class<?> r14 = r1.f2426c
            java.lang.Object[] r4 = r1.f2425b
            if (r2 == 0) goto L_0x00ba
            int r2 = r1.f2442v
            int r2 = r2 << r5
            r5 = r4[r2]
            r19 = r13
            boolean r13 = r5 instanceof java.lang.reflect.Field
            if (r13 == 0) goto L_0x0088
            java.lang.reflect.Field r5 = (java.lang.reflect.Field) r5
            goto L_0x0090
        L_0x0088:
            java.lang.String r5 = (java.lang.String) r5
            java.lang.reflect.Field r5 = com.google.android.gms.internal.clearcut.g2.b(r5, r14)
            r4[r2] = r5
        L_0x0090:
            com.google.android.gms.internal.clearcut.a3$d r2 = com.google.android.gms.internal.clearcut.a3.d
            r13 = r9
            r20 = r10
            long r9 = r2.a(r5)
            int r5 = (int) r9
            int r9 = r1.f2442v
            r10 = 1
            int r9 = r9 << r10
            int r9 = r9 + r10
            r10 = r4[r9]
            r21 = r5
            boolean r5 = r10 instanceof java.lang.reflect.Field
            if (r5 == 0) goto L_0x00aa
            java.lang.reflect.Field r10 = (java.lang.reflect.Field) r10
            goto L_0x00b2
        L_0x00aa:
            java.lang.String r10 = (java.lang.String) r10
            java.lang.reflect.Field r10 = com.google.android.gms.internal.clearcut.g2.b(r10, r14)
            r4[r9] = r10
        L_0x00b2:
            long r4 = r2.a(r10)
            int r2 = (int) r4
            r5 = r21
            goto L_0x0111
        L_0x00ba:
            r20 = r10
            r19 = r13
            r13 = r9
            java.lang.reflect.Field r2 = r1.f2443x
            com.google.android.gms.internal.clearcut.a3$d r5 = com.google.android.gms.internal.clearcut.a3.d
            long r9 = r5.a(r2)
            int r2 = (int) r9
            int r9 = r1.d
            r10 = 1
            r9 = r9 & r10
            if (r9 != r10) goto L_0x00d0
            r9 = 1
            goto L_0x00d1
        L_0x00d0:
            r9 = 0
        L_0x00d1:
            if (r9 == 0) goto L_0x00df
            int r9 = r1.u
            com.google.android.gms.internal.clearcut.k0 r10 = com.google.android.gms.internal.clearcut.k0.GROUP
            int r10 = r10.id()
            if (r9 > r10) goto L_0x00df
            r9 = 1
            goto L_0x00e0
        L_0x00df:
            r9 = 0
        L_0x00e0:
            if (r9 == 0) goto L_0x010c
            int r9 = r1.f2428f
            r10 = 1
            int r9 = r9 << r10
            int r10 = r1.w
            int r10 = r10 / 32
            int r10 = r10 + r9
            r9 = r4[r10]
            r21 = r2
            boolean r2 = r9 instanceof java.lang.reflect.Field
            if (r2 == 0) goto L_0x00f6
            java.lang.reflect.Field r9 = (java.lang.reflect.Field) r9
            goto L_0x00fe
        L_0x00f6:
            java.lang.String r9 = (java.lang.String) r9
            java.lang.reflect.Field r9 = com.google.android.gms.internal.clearcut.g2.b(r9, r14)
            r4[r10] = r9
        L_0x00fe:
            long r4 = r5.a(r9)
            int r2 = (int) r4
            int r4 = r1.w
            int r4 = r4 % 32
            r5 = r4
            r4 = r2
            r2 = r21
            goto L_0x0114
        L_0x010c:
            r21 = r2
            r5 = r21
            r2 = 0
        L_0x0111:
            r4 = r2
            r2 = r5
            r5 = 0
        L_0x0114:
            int r9 = r1.f2440s
            r7[r6] = r9
            int r9 = r6 + 1
            int r10 = r1.f2441t
            r14 = r10 & 512(0x200, float:7.175E-43)
            if (r14 == 0) goto L_0x0122
            r14 = 1
            goto L_0x0123
        L_0x0122:
            r14 = 0
        L_0x0123:
            if (r14 == 0) goto L_0x0128
            r14 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0129
        L_0x0128:
            r14 = 0
        L_0x0129:
            r10 = r10 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x012f
            r10 = 1
            goto L_0x0130
        L_0x012f:
            r10 = 0
        L_0x0130:
            if (r10 == 0) goto L_0x0135
            r10 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x0136
        L_0x0135:
            r10 = 0
        L_0x0136:
            r10 = r10 | r14
            int r14 = r1.u
            int r21 = r14 << 20
            r10 = r10 | r21
            r2 = r2 | r10
            r7[r9] = r2
            int r2 = r6 + 2
            int r5 = r5 << 20
            r4 = r4 | r5
            r7[r2] = r4
            java.lang.Object r2 = r1.A
            if (r2 == 0) goto L_0x0164
            int r4 = r6 / 4
            r5 = 1
            int r4 = r4 << r5
            r8[r4] = r2
            java.lang.Object r2 = r1.f2444y
            if (r2 == 0) goto L_0x015a
            int r4 = r4 + 1
            r8[r4] = r2
            goto L_0x0162
        L_0x015a:
            java.lang.Object r2 = r1.z
            if (r2 == 0) goto L_0x0162
            int r4 = r4 + 1
            r8[r4] = r2
        L_0x0162:
            r5 = 1
            goto L_0x017b
        L_0x0164:
            java.lang.Object r2 = r1.f2444y
            if (r2 == 0) goto L_0x0170
            int r4 = r6 / 4
            r5 = 1
            int r4 = r4 << r5
            int r4 = r4 + r5
            r8[r4] = r2
            goto L_0x017b
        L_0x0170:
            r5 = 1
            java.lang.Object r2 = r1.z
            if (r2 == 0) goto L_0x017b
            int r4 = r6 / 4
            int r4 = r4 << r5
            int r4 = r4 + r5
            r8[r4] = r2
        L_0x017b:
            int r2 = r3.ordinal()
            if (r14 != r2) goto L_0x0187
            int r2 = r11 + 1
            r15[r11] = r6
            r11 = r2
            goto L_0x019a
        L_0x0187:
            r2 = 18
            if (r14 < r2) goto L_0x019a
            r2 = 49
            if (r14 > r2) goto L_0x019a
            int r2 = r12 + 1
            r3 = r7[r9]
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r3 = r3 & r4
            r16[r12] = r3
            r12 = r2
        L_0x019a:
            boolean r2 = r1.a()
            if (r2 == 0) goto L_0x01b1
            int r2 = r1.f2440s
        L_0x01a2:
            int r6 = r6 + 4
            r9 = r13
            r13 = r19
            r10 = r20
            r3 = 2
            goto L_0x004a
        L_0x01ac:
            r20 = r10
            r19 = r13
            r13 = r9
        L_0x01b1:
            com.google.android.gms.internal.clearcut.v1 r2 = new com.google.android.gms.internal.clearcut.v1
            int r11 = r1.f2432j
            com.google.android.gms.internal.clearcut.r1 r12 = r0.f2419a
            int[] r14 = r1.f2434m
            r6 = r2
            r9 = r13
            r10 = r20
            r13 = r19
            r17 = r23
            r18 = r24
            r19 = r25
            r20 = r26
            r21 = r27
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return r2
        L_0x01cd:
            com.google.android.gms.internal.clearcut.s2 r0 = (com.google.android.gms.internal.clearcut.s2) r0
            r0.a()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.v1.p(com.google.android.gms.internal.clearcut.p1, com.google.android.gms.internal.clearcut.y1, com.google.android.gms.internal.clearcut.e1, com.google.android.gms.internal.clearcut.u2, com.google.android.gms.internal.clearcut.c0, com.google.android.gms.internal.clearcut.m1):com.google.android.gms.internal.clearcut.v1");
    }

    public static void q(int i10, Object obj, y yVar) {
        if (obj instanceof String) {
            yVar.f2594a.M((String) obj, i10);
            return;
        }
        yVar.d(i10, (u) obj);
    }

    public final int A(int i10) {
        int i11 = this.f2554c;
        if (i10 >= i11) {
            int[] iArr = this.f2552a;
            int i12 = this.f2555e;
            if (i10 < i12) {
                int i13 = (i10 - i11) << 2;
                if (iArr[i13] == i10) {
                    return i13;
                }
                return -1;
            } else if (i10 <= this.d) {
                int i14 = i12 - i11;
                int length = (iArr.length / 4) - 1;
                while (i14 <= length) {
                    int i15 = (length + i14) >>> 1;
                    int i16 = i15 << 2;
                    int i17 = iArr[i16];
                    if (i10 == i17) {
                        return i16;
                    }
                    if (i10 < i17) {
                        length = i15 - 1;
                    } else {
                        i14 = i15 + 1;
                    }
                }
            }
        }
        return -1;
    }

    public final void B(int i10, int i11, Object obj) {
        a3.i(i10, (long) (this.f2552a[i11 + 2] & 1048575), obj);
    }

    public final void C(int i10, Object obj) {
        if (!this.f2558h) {
            int i11 = this.f2552a[i10 + 2];
            long j8 = (long) (i11 & 1048575);
            a3.i(a3.r(j8, obj) | (1 << (i11 >>> 20)), j8, obj);
        }
    }

    public final void D(int i10, Object obj, Object obj2) {
        int z = z(i10);
        int i11 = this.f2552a[i10];
        long j8 = (long) (z & 1048575);
        if (u(i11, i10, obj2)) {
            Object w = a3.w(j8, obj);
            Object w10 = a3.w(j8, obj2);
            if (w != null && w10 != null) {
                a3.j(j8, obj, r0.a(w, w10));
                B(i11, i10, obj);
            } else if (w10 != null) {
                a3.j(j8, obj, w10);
                B(i11, i10, obj);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x02b5  */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x02c3  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x02d1  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x02df  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x02ec  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x02fd  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x030a  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0318  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0326  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0334  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0342  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0350  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x035e  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x036c  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x037a  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x038b  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0398  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x03a5  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x03b2  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x03bf  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x03cc  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x03d9  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x03e8  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x03f9  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x0405  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x0412  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x041e  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x042a  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x0436  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x0442  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x044e  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x045b  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0473  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0165  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0174  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0183  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0198  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01ad  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01b6  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01c7  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01d5  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01e3  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01f1  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01ff  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x020d  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x021b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0229  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0237  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0245  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0253  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0261  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x026f  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x027d  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x028b  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0299  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x02a7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void E(java.lang.Object r21, com.google.android.gms.internal.clearcut.y r22) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            boolean r4 = r0.f2557g
            com.google.android.gms.internal.clearcut.c0<?> r5 = r0.f2564o
            if (r4 == 0) goto L_0x0021
            com.google.android.gms.internal.clearcut.g0 r4 = r5.a(r1)
            boolean r6 = r4.a()
            if (r6 != 0) goto L_0x0021
            java.util.Iterator r4 = r4.c()
            java.lang.Object r6 = r4.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            goto L_0x0023
        L_0x0021:
            r4 = 0
            r6 = 0
        L_0x0023:
            int[] r7 = r0.f2552a
            int r8 = r7.length
            r10 = -1
            r11 = 0
            r12 = 0
        L_0x0029:
            if (r11 >= r8) goto L_0x046f
            int r13 = r0.z(r11)
            r14 = r7[r11]
            r15 = 267386880(0xff00000, float:2.3665827E-29)
            r15 = r15 & r13
            int r15 = r15 >>> 20
            boolean r9 = r0.f2558h
            r16 = 1048575(0xfffff, float:1.469367E-39)
            sun.misc.Unsafe r3 = f2551q
            if (r9 != 0) goto L_0x0060
            r9 = 17
            if (r15 > r9) goto L_0x0060
            int r9 = r11 + 2
            r9 = r7[r9]
            r17 = r6
            r6 = r9 & r16
            r18 = r7
            r19 = r8
            if (r6 == r10) goto L_0x0057
            long r7 = (long) r6
            int r12 = r3.getInt(r1, r7)
            r10 = r6
        L_0x0057:
            int r6 = r9 >>> 20
            r7 = 1
            int r6 = r7 << r6
            r7 = r6
            r6 = r17
            goto L_0x0069
        L_0x0060:
            r17 = r6
            r18 = r7
            r19 = r8
            r6 = r17
            r7 = 0
        L_0x0069:
            if (r6 == 0) goto L_0x0082
            r5.b(r6)
            if (r14 < 0) goto L_0x0082
            r5.c(r6)
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x0080
            java.lang.Object r6 = r4.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            goto L_0x0069
        L_0x0080:
            r6 = 0
            goto L_0x0069
        L_0x0082:
            r8 = r13 & r16
            long r8 = (long) r8
            switch(r15) {
                case 0: goto L_0x045b;
                case 1: goto L_0x044e;
                case 2: goto L_0x0442;
                case 3: goto L_0x0436;
                case 4: goto L_0x042a;
                case 5: goto L_0x041e;
                case 6: goto L_0x0412;
                case 7: goto L_0x0405;
                case 8: goto L_0x03f9;
                case 9: goto L_0x03e8;
                case 10: goto L_0x03d9;
                case 11: goto L_0x03cc;
                case 12: goto L_0x03bf;
                case 13: goto L_0x03b2;
                case 14: goto L_0x03a5;
                case 15: goto L_0x0398;
                case 16: goto L_0x038b;
                case 17: goto L_0x037a;
                case 18: goto L_0x036c;
                case 19: goto L_0x035e;
                case 20: goto L_0x0350;
                case 21: goto L_0x0342;
                case 22: goto L_0x0334;
                case 23: goto L_0x0326;
                case 24: goto L_0x0318;
                case 25: goto L_0x030a;
                case 26: goto L_0x02fd;
                case 27: goto L_0x02ec;
                case 28: goto L_0x02df;
                case 29: goto L_0x02d1;
                case 30: goto L_0x02c3;
                case 31: goto L_0x02b5;
                case 32: goto L_0x02a7;
                case 33: goto L_0x0299;
                case 34: goto L_0x028b;
                case 35: goto L_0x027d;
                case 36: goto L_0x026f;
                case 37: goto L_0x0261;
                case 38: goto L_0x0253;
                case 39: goto L_0x0245;
                case 40: goto L_0x0237;
                case 41: goto L_0x0229;
                case 42: goto L_0x021b;
                case 43: goto L_0x020d;
                case 44: goto L_0x01ff;
                case 45: goto L_0x01f1;
                case 46: goto L_0x01e3;
                case 47: goto L_0x01d5;
                case 48: goto L_0x01c7;
                case 49: goto L_0x01b6;
                case 50: goto L_0x01ad;
                case 51: goto L_0x0198;
                case 52: goto L_0x0183;
                case 53: goto L_0x0174;
                case 54: goto L_0x0165;
                case 55: goto L_0x0156;
                case 56: goto L_0x0147;
                case 57: goto L_0x0138;
                case 58: goto L_0x0123;
                case 59: goto L_0x0114;
                case 60: goto L_0x0101;
                case 61: goto L_0x00f1;
                case 62: goto L_0x00e3;
                case 63: goto L_0x00d5;
                case 64: goto L_0x00c7;
                case 65: goto L_0x00b9;
                case 66: goto L_0x00ab;
                case 67: goto L_0x009d;
                case 68: goto L_0x008b;
                default: goto L_0x0088;
            }
        L_0x0088:
            r13 = 0
            goto L_0x0467
        L_0x008b:
            boolean r7 = r0.u(r14, r11, r1)
            if (r7 == 0) goto L_0x0088
            java.lang.Object r3 = r3.getObject(r1, r8)
            com.google.android.gms.internal.clearcut.i2 r7 = r0.w(r11)
            r2.h(r14, r7, r3)
            goto L_0x0088
        L_0x009d:
            boolean r3 = r0.u(r14, r11, r1)
            if (r3 == 0) goto L_0x0088
            long r7 = I(r8, r1)
            r2.g(r14, r7)
            goto L_0x0088
        L_0x00ab:
            boolean r3 = r0.u(r14, r11, r1)
            if (r3 == 0) goto L_0x0088
            int r3 = H(r8, r1)
            r2.m(r14, r3)
            goto L_0x0088
        L_0x00b9:
            boolean r3 = r0.u(r14, r11, r1)
            if (r3 == 0) goto L_0x0088
            long r7 = I(r8, r1)
            r2.p(r14, r7)
            goto L_0x0088
        L_0x00c7:
            boolean r3 = r0.u(r14, r11, r1)
            if (r3 == 0) goto L_0x0088
            int r3 = H(r8, r1)
            r2.q(r14, r3)
            goto L_0x0088
        L_0x00d5:
            boolean r3 = r0.u(r14, r11, r1)
            if (r3 == 0) goto L_0x0088
            int r3 = H(r8, r1)
            r2.r(r14, r3)
            goto L_0x0088
        L_0x00e3:
            boolean r3 = r0.u(r14, r11, r1)
            if (r3 == 0) goto L_0x0088
            int r3 = H(r8, r1)
            r2.l(r14, r3)
            goto L_0x0088
        L_0x00f1:
            boolean r7 = r0.u(r14, r11, r1)
            if (r7 == 0) goto L_0x0088
            java.lang.Object r3 = r3.getObject(r1, r8)
            com.google.android.gms.internal.clearcut.u r3 = (com.google.android.gms.internal.clearcut.u) r3
            r2.d(r14, r3)
            goto L_0x0088
        L_0x0101:
            boolean r7 = r0.u(r14, r11, r1)
            if (r7 == 0) goto L_0x0088
            java.lang.Object r3 = r3.getObject(r1, r8)
            com.google.android.gms.internal.clearcut.i2 r7 = r0.w(r11)
            r2.e(r14, r7, r3)
            goto L_0x0088
        L_0x0114:
            boolean r7 = r0.u(r14, r11, r1)
            if (r7 == 0) goto L_0x0088
            java.lang.Object r3 = r3.getObject(r1, r8)
            q(r14, r3, r2)
            goto L_0x0088
        L_0x0123:
            boolean r3 = r0.u(r14, r11, r1)
            if (r3 == 0) goto L_0x0088
            java.lang.Object r3 = com.google.android.gms.internal.clearcut.a3.w(r8, r1)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            r2.i(r14, r3)
            goto L_0x0088
        L_0x0138:
            boolean r3 = r0.u(r14, r11, r1)
            if (r3 == 0) goto L_0x0088
            int r3 = H(r8, r1)
            r2.n(r14, r3)
            goto L_0x0088
        L_0x0147:
            boolean r3 = r0.u(r14, r11, r1)
            if (r3 == 0) goto L_0x0088
            long r7 = I(r8, r1)
            r2.k(r14, r7)
            goto L_0x0088
        L_0x0156:
            boolean r3 = r0.u(r14, r11, r1)
            if (r3 == 0) goto L_0x0088
            int r3 = H(r8, r1)
            r2.j(r14, r3)
            goto L_0x0088
        L_0x0165:
            boolean r3 = r0.u(r14, r11, r1)
            if (r3 == 0) goto L_0x0088
            long r7 = I(r8, r1)
            r2.c(r14, r7)
            goto L_0x0088
        L_0x0174:
            boolean r3 = r0.u(r14, r11, r1)
            if (r3 == 0) goto L_0x0088
            long r7 = I(r8, r1)
            r2.o(r14, r7)
            goto L_0x0088
        L_0x0183:
            boolean r3 = r0.u(r14, r11, r1)
            if (r3 == 0) goto L_0x0088
            java.lang.Object r3 = com.google.android.gms.internal.clearcut.a3.w(r8, r1)
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
            r2.b(r14, r3)
            goto L_0x0088
        L_0x0198:
            boolean r3 = r0.u(r14, r11, r1)
            if (r3 == 0) goto L_0x0088
            java.lang.Object r3 = com.google.android.gms.internal.clearcut.a3.w(r8, r1)
            java.lang.Double r3 = (java.lang.Double) r3
            double r7 = r3.doubleValue()
            r2.a(r7, r14)
            goto L_0x0088
        L_0x01ad:
            java.lang.Object r3 = r3.getObject(r1, r8)
            r0.s(r2, r14, r3, r11)
            goto L_0x0088
        L_0x01b6:
            r7 = r18[r11]
            java.lang.Object r3 = r3.getObject(r1, r8)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.clearcut.i2 r8 = r0.w(r11)
            com.google.android.gms.internal.clearcut.k2.i(r7, r3, r2, r8)
            goto L_0x0088
        L_0x01c7:
            r7 = r18[r11]
            java.lang.Object r3 = r3.getObject(r1, r8)
            java.util.List r3 = (java.util.List) r3
            r13 = 1
            com.google.android.gms.internal.clearcut.k2.w(r7, r3, r2, r13)
            goto L_0x0088
        L_0x01d5:
            r13 = 1
            r7 = r18[r11]
            java.lang.Object r3 = r3.getObject(r1, r8)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.clearcut.k2.G(r7, r3, r2, r13)
            goto L_0x0088
        L_0x01e3:
            r13 = 1
            r7 = r18[r11]
            java.lang.Object r3 = r3.getObject(r1, r8)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.clearcut.k2.A(r7, r3, r2, r13)
            goto L_0x0088
        L_0x01f1:
            r13 = 1
            r7 = r18[r11]
            java.lang.Object r3 = r3.getObject(r1, r8)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.clearcut.k2.I(r7, r3, r2, r13)
            goto L_0x0088
        L_0x01ff:
            r13 = 1
            r7 = r18[r11]
            java.lang.Object r3 = r3.getObject(r1, r8)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.clearcut.k2.J(r7, r3, r2, r13)
            goto L_0x0088
        L_0x020d:
            r13 = 1
            r7 = r18[r11]
            java.lang.Object r3 = r3.getObject(r1, r8)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.clearcut.k2.E(r7, r3, r2, r13)
            goto L_0x0088
        L_0x021b:
            r13 = 1
            r7 = r18[r11]
            java.lang.Object r3 = r3.getObject(r1, r8)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.clearcut.k2.K(r7, r3, r2, r13)
            goto L_0x0088
        L_0x0229:
            r13 = 1
            r7 = r18[r11]
            java.lang.Object r3 = r3.getObject(r1, r8)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.clearcut.k2.H(r7, r3, r2, r13)
            goto L_0x0088
        L_0x0237:
            r13 = 1
            r7 = r18[r11]
            java.lang.Object r3 = r3.getObject(r1, r8)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.clearcut.k2.y(r7, r3, r2, r13)
            goto L_0x0088
        L_0x0245:
            r13 = 1
            r7 = r18[r11]
            java.lang.Object r3 = r3.getObject(r1, r8)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.clearcut.k2.C(r7, r3, r2, r13)
            goto L_0x0088
        L_0x0253:
            r13 = 1
            r7 = r18[r11]
            java.lang.Object r3 = r3.getObject(r1, r8)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.clearcut.k2.t(r7, r3, r2, r13)
            goto L_0x0088
        L_0x0261:
            r13 = 1
            r7 = r18[r11]
            java.lang.Object r3 = r3.getObject(r1, r8)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.clearcut.k2.o(r7, r3, r2, r13)
            goto L_0x0088
        L_0x026f:
            r13 = 1
            r7 = r18[r11]
            java.lang.Object r3 = r3.getObject(r1, r8)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.clearcut.k2.j(r7, r3, r2, r13)
            goto L_0x0088
        L_0x027d:
            r13 = 1
            r7 = r18[r11]
            java.lang.Object r3 = r3.getObject(r1, r8)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.clearcut.k2.e(r7, r3, r2, r13)
            goto L_0x0088
        L_0x028b:
            r7 = r18[r11]
            java.lang.Object r3 = r3.getObject(r1, r8)
            java.util.List r3 = (java.util.List) r3
            r13 = 0
            com.google.android.gms.internal.clearcut.k2.w(r7, r3, r2, r13)
            goto L_0x0467
        L_0x0299:
            r13 = 0
            r7 = r18[r11]
            java.lang.Object r3 = r3.getObject(r1, r8)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.clearcut.k2.G(r7, r3, r2, r13)
            goto L_0x0467
        L_0x02a7:
            r13 = 0
            r7 = r18[r11]
            java.lang.Object r3 = r3.getObject(r1, r8)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.clearcut.k2.A(r7, r3, r2, r13)
            goto L_0x0467
        L_0x02b5:
            r13 = 0
            r7 = r18[r11]
            java.lang.Object r3 = r3.getObject(r1, r8)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.clearcut.k2.I(r7, r3, r2, r13)
            goto L_0x0467
        L_0x02c3:
            r13 = 0
            r7 = r18[r11]
            java.lang.Object r3 = r3.getObject(r1, r8)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.clearcut.k2.J(r7, r3, r2, r13)
            goto L_0x0467
        L_0x02d1:
            r13 = 0
            r7 = r18[r11]
            java.lang.Object r3 = r3.getObject(r1, r8)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.clearcut.k2.E(r7, r3, r2, r13)
            goto L_0x0467
        L_0x02df:
            r7 = r18[r11]
            java.lang.Object r3 = r3.getObject(r1, r8)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.clearcut.k2.h(r7, r3, r2)
            goto L_0x0088
        L_0x02ec:
            r7 = r18[r11]
            java.lang.Object r3 = r3.getObject(r1, r8)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.clearcut.i2 r8 = r0.w(r11)
            com.google.android.gms.internal.clearcut.k2.d(r7, r3, r2, r8)
            goto L_0x0088
        L_0x02fd:
            r7 = r18[r11]
            java.lang.Object r3 = r3.getObject(r1, r8)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.clearcut.k2.c(r7, r3, r2)
            goto L_0x0088
        L_0x030a:
            r7 = r18[r11]
            java.lang.Object r3 = r3.getObject(r1, r8)
            java.util.List r3 = (java.util.List) r3
            r13 = 0
            com.google.android.gms.internal.clearcut.k2.K(r7, r3, r2, r13)
            goto L_0x0467
        L_0x0318:
            r13 = 0
            r7 = r18[r11]
            java.lang.Object r3 = r3.getObject(r1, r8)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.clearcut.k2.H(r7, r3, r2, r13)
            goto L_0x0467
        L_0x0326:
            r13 = 0
            r7 = r18[r11]
            java.lang.Object r3 = r3.getObject(r1, r8)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.clearcut.k2.y(r7, r3, r2, r13)
            goto L_0x0467
        L_0x0334:
            r13 = 0
            r7 = r18[r11]
            java.lang.Object r3 = r3.getObject(r1, r8)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.clearcut.k2.C(r7, r3, r2, r13)
            goto L_0x0467
        L_0x0342:
            r13 = 0
            r7 = r18[r11]
            java.lang.Object r3 = r3.getObject(r1, r8)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.clearcut.k2.t(r7, r3, r2, r13)
            goto L_0x0467
        L_0x0350:
            r13 = 0
            r7 = r18[r11]
            java.lang.Object r3 = r3.getObject(r1, r8)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.clearcut.k2.o(r7, r3, r2, r13)
            goto L_0x0467
        L_0x035e:
            r13 = 0
            r7 = r18[r11]
            java.lang.Object r3 = r3.getObject(r1, r8)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.clearcut.k2.j(r7, r3, r2, r13)
            goto L_0x0467
        L_0x036c:
            r13 = 0
            r7 = r18[r11]
            java.lang.Object r3 = r3.getObject(r1, r8)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.clearcut.k2.e(r7, r3, r2, r13)
            goto L_0x0467
        L_0x037a:
            r13 = 0
            r7 = r7 & r12
            if (r7 == 0) goto L_0x0467
            java.lang.Object r3 = r3.getObject(r1, r8)
            com.google.android.gms.internal.clearcut.i2 r7 = r0.w(r11)
            r2.h(r14, r7, r3)
            goto L_0x0467
        L_0x038b:
            r13 = 0
            r7 = r7 & r12
            if (r7 == 0) goto L_0x0467
            long r7 = r3.getLong(r1, r8)
            r2.g(r14, r7)
            goto L_0x0467
        L_0x0398:
            r13 = 0
            r7 = r7 & r12
            if (r7 == 0) goto L_0x0467
            int r3 = r3.getInt(r1, r8)
            r2.m(r14, r3)
            goto L_0x0467
        L_0x03a5:
            r13 = 0
            r7 = r7 & r12
            if (r7 == 0) goto L_0x0467
            long r7 = r3.getLong(r1, r8)
            r2.p(r14, r7)
            goto L_0x0467
        L_0x03b2:
            r13 = 0
            r7 = r7 & r12
            if (r7 == 0) goto L_0x0467
            int r3 = r3.getInt(r1, r8)
            r2.q(r14, r3)
            goto L_0x0467
        L_0x03bf:
            r13 = 0
            r7 = r7 & r12
            if (r7 == 0) goto L_0x0467
            int r3 = r3.getInt(r1, r8)
            r2.r(r14, r3)
            goto L_0x0467
        L_0x03cc:
            r13 = 0
            r7 = r7 & r12
            if (r7 == 0) goto L_0x0467
            int r3 = r3.getInt(r1, r8)
            r2.l(r14, r3)
            goto L_0x0467
        L_0x03d9:
            r13 = 0
            r7 = r7 & r12
            if (r7 == 0) goto L_0x0467
            java.lang.Object r3 = r3.getObject(r1, r8)
            com.google.android.gms.internal.clearcut.u r3 = (com.google.android.gms.internal.clearcut.u) r3
            r2.d(r14, r3)
            goto L_0x0467
        L_0x03e8:
            r13 = 0
            r7 = r7 & r12
            if (r7 == 0) goto L_0x0467
            java.lang.Object r3 = r3.getObject(r1, r8)
            com.google.android.gms.internal.clearcut.i2 r7 = r0.w(r11)
            r2.e(r14, r7, r3)
            goto L_0x0467
        L_0x03f9:
            r13 = 0
            r7 = r7 & r12
            if (r7 == 0) goto L_0x0467
            java.lang.Object r3 = r3.getObject(r1, r8)
            q(r14, r3, r2)
            goto L_0x0467
        L_0x0405:
            r13 = 0
            r3 = r7 & r12
            if (r3 == 0) goto L_0x0467
            boolean r3 = com.google.android.gms.internal.clearcut.a3.t(r8, r1)
            r2.i(r14, r3)
            goto L_0x0467
        L_0x0412:
            r13 = 0
            r7 = r7 & r12
            if (r7 == 0) goto L_0x0467
            int r3 = r3.getInt(r1, r8)
            r2.n(r14, r3)
            goto L_0x0467
        L_0x041e:
            r13 = 0
            r7 = r7 & r12
            if (r7 == 0) goto L_0x0467
            long r7 = r3.getLong(r1, r8)
            r2.k(r14, r7)
            goto L_0x0467
        L_0x042a:
            r13 = 0
            r7 = r7 & r12
            if (r7 == 0) goto L_0x0467
            int r3 = r3.getInt(r1, r8)
            r2.j(r14, r3)
            goto L_0x0467
        L_0x0436:
            r13 = 0
            r7 = r7 & r12
            if (r7 == 0) goto L_0x0467
            long r7 = r3.getLong(r1, r8)
            r2.c(r14, r7)
            goto L_0x0467
        L_0x0442:
            r13 = 0
            r7 = r7 & r12
            if (r7 == 0) goto L_0x0467
            long r7 = r3.getLong(r1, r8)
            r2.o(r14, r7)
            goto L_0x0467
        L_0x044e:
            r13 = 0
            r3 = r7 & r12
            if (r3 == 0) goto L_0x0467
            float r3 = com.google.android.gms.internal.clearcut.a3.u(r8, r1)
            r2.b(r14, r3)
            goto L_0x0467
        L_0x045b:
            r13 = 0
            r3 = r7 & r12
            if (r3 == 0) goto L_0x0467
            double r7 = com.google.android.gms.internal.clearcut.a3.v(r8, r1)
            r2.a(r7, r14)
        L_0x0467:
            int r11 = r11 + 4
            r7 = r18
            r8 = r19
            goto L_0x0029
        L_0x046f:
            r17 = r6
        L_0x0471:
            if (r6 == 0) goto L_0x0486
            r5.c(r6)
            boolean r3 = r4.hasNext()
            if (r3 == 0) goto L_0x0484
            java.lang.Object r3 = r4.next()
            r6 = r3
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            goto L_0x0471
        L_0x0484:
            r6 = 0
            goto L_0x0471
        L_0x0486:
            com.google.android.gms.internal.clearcut.u2<?, ?> r3 = r0.f2563n
            com.google.android.gms.internal.clearcut.v2 r1 = r3.i(r1)
            r3.b(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.v1.E(java.lang.Object, com.google.android.gms.internal.clearcut.y):void");
    }

    public final boolean F(int i10, Object obj, Object obj2) {
        return v(i10, obj) == v(i10, obj2);
    }

    public final void a(T t10) {
        int[] iArr = this.f2560j;
        if (iArr != null) {
            for (int z : iArr) {
                long z10 = (long) (z(z) & 1048575);
                Object w = a3.w(z10, t10);
                if (w != null) {
                    a3.j(z10, t10, this.f2565p.f(w));
                }
            }
        }
        int[] iArr2 = this.f2561k;
        if (iArr2 != null) {
            for (int i10 : iArr2) {
                this.f2562m.a((long) i10, t10);
            }
        }
        this.f2563n.c(t10);
        if (this.f2557g) {
            this.f2564o.e(t10);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0030, code lost:
        com.google.android.gms.internal.clearcut.a3.j(r3, r7, com.google.android.gms.internal.clearcut.a3.w(r3, r8));
        B(r1, r0, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0096, code lost:
        com.google.android.gms.internal.clearcut.a3.j(r3, r7, com.google.android.gms.internal.clearcut.a3.w(r3, r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00c0, code lost:
        com.google.android.gms.internal.clearcut.a3.i(com.google.android.gms.internal.clearcut.a3.r(r3, r8), r3, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00d5, code lost:
        com.google.android.gms.internal.clearcut.a3.f(r7, r3, com.google.android.gms.internal.clearcut.a3.s(r3, r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00f8, code lost:
        C(r0, r7);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(T r7, T r8) {
        /*
            r6 = this;
            r8.getClass()
            r0 = 0
        L_0x0004:
            int[] r1 = r6.f2552a
            int r2 = r1.length
            if (r0 >= r2) goto L_0x00ff
            int r2 = r6.z(r0)
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
            r6.D(r0, r7, r8)
            goto L_0x00fb
        L_0x002a:
            boolean r2 = r6.u(r1, r0, r8)
            if (r2 == 0) goto L_0x00fb
        L_0x0030:
            java.lang.Object r2 = com.google.android.gms.internal.clearcut.a3.w(r3, r8)
            com.google.android.gms.internal.clearcut.a3.j(r3, r7, r2)
            r6.B(r1, r0, r7)
            goto L_0x00fb
        L_0x003c:
            java.lang.Class<?> r1 = com.google.android.gms.internal.clearcut.k2.f2474a
            java.lang.Object r1 = com.google.android.gms.internal.clearcut.a3.w(r3, r7)
            java.lang.Object r2 = com.google.android.gms.internal.clearcut.a3.w(r3, r8)
            com.google.android.gms.internal.clearcut.m1 r5 = r6.f2565p
            com.google.android.gms.internal.clearcut.l1 r1 = r5.c(r1, r2)
            com.google.android.gms.internal.clearcut.a3.j(r3, r7, r1)
            goto L_0x00fb
        L_0x0051:
            com.google.android.gms.internal.clearcut.e1 r1 = r6.f2562m
            r1.b(r3, r7, r8)
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
            java.lang.Object r1 = com.google.android.gms.internal.clearcut.a3.w(r3, r8)
            com.google.android.gms.internal.clearcut.a3.j(r3, r7, r1)
            goto L_0x00f8
        L_0x009e:
            boolean r1 = r6.v(r0, r8)
            if (r1 == 0) goto L_0x00fb
            boolean r1 = com.google.android.gms.internal.clearcut.a3.t(r3, r8)
            com.google.android.gms.internal.clearcut.a3.g(r7, r3, r1)
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
            int r1 = com.google.android.gms.internal.clearcut.a3.r(r3, r8)
            com.google.android.gms.internal.clearcut.a3.i(r1, r3, r7)
            goto L_0x00f8
        L_0x00c8:
            boolean r1 = r6.v(r0, r8)
            if (r1 == 0) goto L_0x00fb
            goto L_0x00d5
        L_0x00cf:
            boolean r1 = r6.v(r0, r8)
            if (r1 == 0) goto L_0x00fb
        L_0x00d5:
            long r1 = com.google.android.gms.internal.clearcut.a3.s(r3, r8)
            com.google.android.gms.internal.clearcut.a3.f(r7, r3, r1)
            goto L_0x00f8
        L_0x00dd:
            boolean r1 = r6.v(r0, r8)
            if (r1 == 0) goto L_0x00fb
            float r1 = com.google.android.gms.internal.clearcut.a3.u(r3, r8)
            com.google.android.gms.internal.clearcut.a3.e(r7, r3, r1)
            goto L_0x00f8
        L_0x00eb:
            boolean r1 = r6.v(r0, r8)
            if (r1 == 0) goto L_0x00fb
            double r1 = com.google.android.gms.internal.clearcut.a3.v(r3, r8)
            com.google.android.gms.internal.clearcut.a3.d(r7, r3, r1)
        L_0x00f8:
            r6.C(r0, r7)
        L_0x00fb:
            int r0 = r0 + 4
            goto L_0x0004
        L_0x00ff:
            boolean r0 = r6.f2558h
            if (r0 != 0) goto L_0x011f
            java.lang.Class<?> r0 = com.google.android.gms.internal.clearcut.k2.f2474a
            com.google.android.gms.internal.clearcut.u2<?, ?> r0 = r6.f2563n
            com.google.android.gms.internal.clearcut.v2 r1 = r0.i(r7)
            com.google.android.gms.internal.clearcut.v2 r2 = r0.i(r8)
            com.google.android.gms.internal.clearcut.v2 r1 = r0.g(r1, r2)
            r0.f(r7, r1)
            boolean r0 = r6.f2557g
            if (r0 == 0) goto L_0x011f
            com.google.android.gms.internal.clearcut.c0<?> r0 = r6.f2564o
            com.google.android.gms.internal.clearcut.k2.f(r0, r7, r8)
        L_0x011f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.v1.b(java.lang.Object, java.lang.Object):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v2, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0069, code lost:
        if (r7 == 0) goto L_0x00d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x009c, code lost:
        r1 = r11.f2536c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x009e, code lost:
        r9.putObject(r14, r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00d0, code lost:
        if (r7 == 0) goto L_0x00d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00d2, code lost:
        r0 = s6.a.S(r12, r10, r11);
        r1 = r11.f2534a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00d8, code lost:
        r9.putInt(r14, r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00e5, code lost:
        r9.putLong(r23, r2, r4);
        r0 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00f8, code lost:
        r0 = r10 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0105, code lost:
        r0 = r10 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0167, code lost:
        if (r0 == r15) goto L_0x01a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01a3, code lost:
        if (r0 == r15) goto L_0x01a5;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01b5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(T r23, byte[] r24, int r25, int r26, com.google.android.gms.internal.clearcut.r r27) {
        /*
            r22 = this;
            r15 = r22
            r14 = r23
            r12 = r24
            r13 = r26
            r11 = r27
            boolean r0 = r15.f2558h
            if (r0 == 0) goto L_0x01e0
            sun.misc.Unsafe r9 = f2551q
            r0 = r25
        L_0x0012:
            if (r0 >= r13) goto L_0x01d7
            int r1 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x0024
            int r0 = s6.a.R(r0, r12, r1, r11)
            int r1 = r11.f2534a
            r10 = r0
            r16 = r1
            goto L_0x0027
        L_0x0024:
            r16 = r0
            r10 = r1
        L_0x0027:
            int r6 = r16 >>> 3
            r7 = r16 & 7
            int r8 = r15.A(r6)
            if (r8 < 0) goto L_0x01a7
            int r0 = r8 + 1
            int[] r1 = r15.f2552a
            r5 = r1[r0]
            r0 = 267386880(0xff00000, float:2.3665827E-29)
            r0 = r0 & r5
            int r4 = r0 >>> 20
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r2 = (long) r0
            r0 = 17
            r1 = 2
            if (r4 > r0) goto L_0x0109
            r0 = 1
            r6 = 5
            switch(r4) {
                case 0: goto L_0x00fc;
                case 1: goto L_0x00ef;
                case 2: goto L_0x00dd;
                case 3: goto L_0x00dd;
                case 4: goto L_0x00d0;
                case 5: goto L_0x00c3;
                case 6: goto L_0x00b9;
                case 7: goto L_0x00a3;
                case 8: goto L_0x008c;
                case 9: goto L_0x0074;
                case 10: goto L_0x006d;
                case 11: goto L_0x00d0;
                case 12: goto L_0x0069;
                case 13: goto L_0x00b9;
                case 14: goto L_0x00c3;
                case 15: goto L_0x005b;
                case 16: goto L_0x004d;
                default: goto L_0x004b;
            }
        L_0x004b:
            goto L_0x01a7
        L_0x004d:
            if (r7 != 0) goto L_0x01a7
            int r0 = s6.a.e0(r12, r10, r11)
            long r4 = r11.f2535b
            long r4 = s6.a.V(r4)
            goto L_0x00e5
        L_0x005b:
            if (r7 != 0) goto L_0x01a7
            int r0 = s6.a.S(r12, r10, r11)
            int r1 = r11.f2534a
            int r1 = s6.a.E0(r1)
            goto L_0x00d8
        L_0x0069:
            if (r7 != 0) goto L_0x01a7
            goto L_0x00d2
        L_0x006d:
            if (r7 != r1) goto L_0x01a7
            int r0 = s6.a.t0(r12, r10, r11)
            goto L_0x009c
        L_0x0074:
            if (r7 != r1) goto L_0x01a7
            com.google.android.gms.internal.clearcut.i2 r0 = r15.w(r8)
            int r0 = l(r0, r12, r10, r13, r11)
            java.lang.Object r1 = r9.getObject(r14, r2)
            if (r1 != 0) goto L_0x0085
            goto L_0x009c
        L_0x0085:
            java.lang.Object r4 = r11.f2536c
            com.google.android.gms.internal.clearcut.p0 r1 = com.google.android.gms.internal.clearcut.r0.a(r1, r4)
            goto L_0x009e
        L_0x008c:
            if (r7 != r1) goto L_0x01a7
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r0 & r5
            if (r0 != 0) goto L_0x0098
            int r0 = s6.a.j0(r12, r10, r11)
            goto L_0x009c
        L_0x0098:
            int r0 = s6.a.p0(r12, r10, r11)
        L_0x009c:
            java.lang.Object r1 = r11.f2536c
        L_0x009e:
            r9.putObject(r14, r2, r1)
            goto L_0x0012
        L_0x00a3:
            if (r7 != 0) goto L_0x01a7
            int r1 = s6.a.e0(r12, r10, r11)
            long r4 = r11.f2535b
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x00b2
            goto L_0x00b3
        L_0x00b2:
            r0 = 0
        L_0x00b3:
            com.google.android.gms.internal.clearcut.a3.g(r14, r2, r0)
            r0 = r1
            goto L_0x0012
        L_0x00b9:
            if (r7 != r6) goto L_0x01a7
            int r0 = s6.a.i0(r10, r12)
            r9.putInt(r14, r2, r0)
            goto L_0x00f8
        L_0x00c3:
            if (r7 != r0) goto L_0x01a7
            long r4 = s6.a.q0(r10, r12)
            r0 = r9
            r1 = r23
            r0.putLong(r1, r2, r4)
            goto L_0x0105
        L_0x00d0:
            if (r7 != 0) goto L_0x01a7
        L_0x00d2:
            int r0 = s6.a.S(r12, r10, r11)
            int r1 = r11.f2534a
        L_0x00d8:
            r9.putInt(r14, r2, r1)
            goto L_0x0012
        L_0x00dd:
            if (r7 != 0) goto L_0x01a7
            int r0 = s6.a.e0(r12, r10, r11)
            long r4 = r11.f2535b
        L_0x00e5:
            r6 = r0
            r0 = r9
            r1 = r23
            r0.putLong(r1, r2, r4)
            r0 = r6
            goto L_0x0012
        L_0x00ef:
            if (r7 != r6) goto L_0x01a7
            float r0 = s6.a.v0(r10, r12)
            com.google.android.gms.internal.clearcut.a3.e(r14, r2, r0)
        L_0x00f8:
            int r0 = r10 + 4
            goto L_0x0012
        L_0x00fc:
            if (r7 != r0) goto L_0x01a7
            double r0 = s6.a.r0(r10, r12)
            com.google.android.gms.internal.clearcut.a3.d(r14, r2, r0)
        L_0x0105:
            int r0 = r10 + 8
            goto L_0x0012
        L_0x0109:
            r0 = 27
            if (r4 != r0) goto L_0x0141
            if (r7 != r1) goto L_0x01a7
            java.lang.Object r0 = r9.getObject(r14, r2)
            com.google.android.gms.internal.clearcut.u0 r0 = (com.google.android.gms.internal.clearcut.u0) r0
            boolean r1 = r0.l()
            if (r1 != 0) goto L_0x012d
            int r1 = r0.size()
            if (r1 != 0) goto L_0x0124
            r1 = 10
            goto L_0x0126
        L_0x0124:
            int r1 = r1 << 1
        L_0x0126:
            com.google.android.gms.internal.clearcut.u0 r0 = r0.r(r1)
            r9.putObject(r14, r2, r0)
        L_0x012d:
            r5 = r0
            com.google.android.gms.internal.clearcut.i2 r0 = r15.w(r8)
            r1 = r16
            r2 = r24
            r3 = r10
            r4 = r26
            r6 = r27
            int r0 = j(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0012
        L_0x0141:
            r0 = 49
            if (r4 > r0) goto L_0x016a
            long r0 = (long) r5
            r17 = r0
            r0 = r22
            r1 = r23
            r19 = r2
            r2 = r24
            r3 = r10
            r5 = r4
            r4 = r26
            r25 = r5
            r5 = r16
            r21 = r9
            r15 = r10
            r9 = r17
            r11 = r25
            r12 = r19
            r14 = r27
            int r0 = r0.n(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 != r15) goto L_0x01c9
            goto L_0x01a5
        L_0x016a:
            r19 = r2
            r25 = r4
            r21 = r9
            r15 = r10
            r0 = 50
            r9 = r25
            if (r9 != r0) goto L_0x018d
            if (r7 == r1) goto L_0x017a
            goto L_0x01aa
        L_0x017a:
            r0 = r22
            r1 = r23
            r2 = r24
            r3 = r15
            r4 = r26
            r5 = r8
            r6 = r19
            r8 = r27
            r0.t(r1, r2, r3, r4, r5, r6, r8)
            r0 = 0
            throw r0
        L_0x018d:
            r0 = r22
            r1 = r23
            r2 = r24
            r3 = r15
            r4 = r26
            r10 = r5
            r5 = r16
            r12 = r8
            r8 = r10
            r10 = r19
            r13 = r27
            int r0 = r0.m(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 != r15) goto L_0x01c9
        L_0x01a5:
            r2 = r0
            goto L_0x01ab
        L_0x01a7:
            r21 = r9
            r15 = r10
        L_0x01aa:
            r2 = r15
        L_0x01ab:
            r0 = r23
            com.google.android.gms.internal.clearcut.p0 r0 = (com.google.android.gms.internal.clearcut.p0) r0
            com.google.android.gms.internal.clearcut.v2 r1 = r0.zzjp
            com.google.android.gms.internal.clearcut.v2 r3 = com.google.android.gms.internal.clearcut.v2.f2566f
            if (r1 != r3) goto L_0x01bc
            com.google.android.gms.internal.clearcut.v2 r1 = new com.google.android.gms.internal.clearcut.v2
            r1.<init>()
            r0.zzjp = r1
        L_0x01bc:
            r4 = r1
            r0 = r16
            r1 = r24
            r3 = r26
            r5 = r27
            int r0 = s6.a.Q(r0, r1, r2, r3, r4, r5)
        L_0x01c9:
            r15 = r22
            r14 = r23
            r12 = r24
            r13 = r26
            r11 = r27
            r9 = r21
            goto L_0x0012
        L_0x01d7:
            r4 = r13
            if (r0 != r4) goto L_0x01db
            return
        L_0x01db:
            com.google.android.gms.internal.clearcut.v0 r0 = com.google.android.gms.internal.clearcut.v0.b()
            throw r0
        L_0x01e0:
            r4 = r13
            r5 = 0
            r0 = r22
            r1 = r23
            r2 = r24
            r3 = r25
            r4 = r26
            r6 = r27
            r0.o(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.v1.c(java.lang.Object, byte[], int, int, com.google.android.gms.internal.clearcut.r):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0262, code lost:
        r11 = com.google.android.gms.internal.clearcut.x.Z(r13, (com.google.android.gms.internal.clearcut.r1) com.google.android.gms.internal.clearcut.a3.w(r14, r1), w(r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x027c, code lost:
        r11 = com.google.android.gms.internal.clearcut.x.g0(r13, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x028c, code lost:
        r11 = com.google.android.gms.internal.clearcut.x.o0(r13, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0298, code lost:
        r11 = com.google.android.gms.internal.clearcut.x.l0(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x02a4, code lost:
        r11 = com.google.android.gms.internal.clearcut.x.q0(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x02b4, code lost:
        r11 = com.google.android.gms.internal.clearcut.x.r0(r13, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x02c4, code lost:
        r11 = com.google.android.gms.internal.clearcut.x.m0(r13, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x02d0, code lost:
        r11 = com.google.android.gms.internal.clearcut.a3.w(r14, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x02db, code lost:
        r11 = com.google.android.gms.internal.clearcut.k2.k(r13, w(r4), com.google.android.gms.internal.clearcut.a3.w(r14, r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x02f5, code lost:
        if ((r11 instanceof com.google.android.gms.internal.clearcut.u) != false) goto L_0x02f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x02f7, code lost:
        r11 = com.google.android.gms.internal.clearcut.x.Y(r13, (com.google.android.gms.internal.clearcut.u) r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x02ff, code lost:
        r11 = com.google.android.gms.internal.clearcut.x.Q((java.lang.String) r11, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x030c, code lost:
        r11 = com.google.android.gms.internal.clearcut.x.X(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0317, code lost:
        r11 = com.google.android.gms.internal.clearcut.x.p0(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0322, code lost:
        r11 = com.google.android.gms.internal.clearcut.x.j0(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0331, code lost:
        r11 = com.google.android.gms.internal.clearcut.x.k0(r13, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0340, code lost:
        r11 = com.google.android.gms.internal.clearcut.x.f0(r13, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x034f, code lost:
        r11 = com.google.android.gms.internal.clearcut.x.c0(r13, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x035a, code lost:
        r11 = com.google.android.gms.internal.clearcut.x.P(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0365, code lost:
        r11 = com.google.android.gms.internal.clearcut.x.W(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0369, code lost:
        r10 = r10 + r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x036a, code lost:
        r4 = r4 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x03b3, code lost:
        if (u(r14, r10, r1) != false) goto L_0x0613;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x03d3, code lost:
        if (u(r14, r10, r1) != false) goto L_0x063f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x03db, code lost:
        if (u(r14, r10, r1) != false) goto L_0x0647;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x03fb, code lost:
        if (u(r14, r10, r1) != false) goto L_0x0667;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x0403, code lost:
        if (u(r14, r10, r1) != false) goto L_0x066f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x0413, code lost:
        if ((r2 instanceof com.google.android.gms.internal.clearcut.u) != false) goto L_0x0687;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x04aa, code lost:
        if (r2 > 0) goto L_0x055b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x04b8, code lost:
        if (r2 > 0) goto L_0x055b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x04c6, code lost:
        if (r2 > 0) goto L_0x055b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x04d4, code lost:
        if (r2 > 0) goto L_0x055b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x04e2, code lost:
        if (r2 > 0) goto L_0x055b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x04f0, code lost:
        if (r2 > 0) goto L_0x055b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x04fe, code lost:
        if (r2 > 0) goto L_0x055b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x050b, code lost:
        if (r2 > 0) goto L_0x055b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x0518, code lost:
        if (r2 > 0) goto L_0x055b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x0525, code lost:
        if (r2 > 0) goto L_0x055b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x0532, code lost:
        if (r2 > 0) goto L_0x055b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x053f, code lost:
        if (r2 > 0) goto L_0x055b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x054c, code lost:
        if (r2 > 0) goto L_0x055b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x0559, code lost:
        if (r2 > 0) goto L_0x055b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x055b, code lost:
        r11 = r11 + ((com.google.android.gms.internal.clearcut.x.x0(r2) + com.google.android.gms.internal.clearcut.x.v0(r14)) + r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x0611, code lost:
        if ((r2 & r12) != 0) goto L_0x0613;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x0613, code lost:
        r2 = com.google.android.gms.internal.clearcut.x.Z(r14, (com.google.android.gms.internal.clearcut.r1) r7.getObject(r1, r3), w(r10));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x062a, code lost:
        r2 = com.google.android.gms.internal.clearcut.x.g0(r14, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x0637, code lost:
        r2 = com.google.android.gms.internal.clearcut.x.o0(r14, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x063d, code lost:
        if ((r2 & r12) != 0) goto L_0x063f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x063f, code lost:
        r2 = com.google.android.gms.internal.clearcut.x.l0(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x0645, code lost:
        if ((r2 & r12) != 0) goto L_0x0647;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x0647, code lost:
        r2 = com.google.android.gms.internal.clearcut.x.q0(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x0653, code lost:
        r2 = com.google.android.gms.internal.clearcut.x.r0(r14, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x065f, code lost:
        r2 = com.google.android.gms.internal.clearcut.x.m0(r14, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x0665, code lost:
        if ((r2 & r12) != 0) goto L_0x0667;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x0667, code lost:
        r2 = r7.getObject(r1, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:305:0x066d, code lost:
        if ((r2 & r12) != 0) goto L_0x066f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:306:0x066f, code lost:
        r2 = com.google.android.gms.internal.clearcut.k2.k(r14, w(r10), r7.getObject(r1, r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x0685, code lost:
        if ((r2 instanceof com.google.android.gms.internal.clearcut.u) != false) goto L_0x0687;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:311:0x0687, code lost:
        r2 = com.google.android.gms.internal.clearcut.x.Y(r14, (com.google.android.gms.internal.clearcut.u) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:0x068e, code lost:
        r2 = com.google.android.gms.internal.clearcut.x.Q((java.lang.String) r2, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:313:0x0694, code lost:
        r11 = r11 + r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x06a5, code lost:
        r11 = r11 + r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:339:0x06e5, code lost:
        r2 = r2 + r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:340:0x06e6, code lost:
        r11 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:341:0x06e8, code lost:
        r2 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:342:0x06ea, code lost:
        r10 = r10 + 4;
        r4 = r13;
        r2 = 267386880;
        r3 = 1048575;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a3, code lost:
        if ((r11 instanceof com.google.android.gms.internal.clearcut.u) != false) goto L_0x02f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01c9, code lost:
        r10 = r10 + ((com.google.android.gms.internal.clearcut.x.x0(r11) + com.google.android.gms.internal.clearcut.x.v0(r13)) + r11);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int d(T r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 267386880(0xff00000, float:2.3665827E-29)
            r3 = 1048575(0xfffff, float:1.469367E-39)
            boolean r4 = r0.f2558h
            com.google.android.gms.internal.clearcut.m1 r5 = r0.f2565p
            com.google.android.gms.internal.clearcut.u2<?, ?> r6 = r0.f2563n
            sun.misc.Unsafe r7 = f2551q
            int[] r8 = r0.f2552a
            if (r4 == 0) goto L_0x0378
            r4 = 0
            r10 = 0
        L_0x0017:
            int r11 = r8.length
            if (r4 >= r11) goto L_0x036e
            int r11 = r0.z(r4)
            r12 = r11 & r2
            int r12 = r12 >>> 20
            r13 = r8[r4]
            r11 = r11 & r3
            long r14 = (long) r11
            com.google.android.gms.internal.clearcut.k0 r11 = com.google.android.gms.internal.clearcut.k0.DOUBLE_LIST_PACKED
            int r11 = r11.id()
            if (r12 < r11) goto L_0x003a
            com.google.android.gms.internal.clearcut.k0 r11 = com.google.android.gms.internal.clearcut.k0.SINT64_LIST_PACKED
            int r11 = r11.id()
            if (r12 > r11) goto L_0x003a
            int r11 = r4 + 2
            r11 = r8[r11]
        L_0x003a:
            switch(r12) {
                case 0: goto L_0x035f;
                case 1: goto L_0x0354;
                case 2: goto L_0x0345;
                case 3: goto L_0x0336;
                case 4: goto L_0x0327;
                case 5: goto L_0x031c;
                case 6: goto L_0x0311;
                case 7: goto L_0x0306;
                case 8: goto L_0x02e9;
                case 9: goto L_0x02d5;
                case 10: goto L_0x02ca;
                case 11: goto L_0x02ba;
                case 12: goto L_0x02aa;
                case 13: goto L_0x029e;
                case 14: goto L_0x0292;
                case 15: goto L_0x0282;
                case 16: goto L_0x0272;
                case 17: goto L_0x025c;
                case 18: goto L_0x0252;
                case 19: goto L_0x0248;
                case 20: goto L_0x023e;
                case 21: goto L_0x0234;
                case 22: goto L_0x022a;
                case 23: goto L_0x0252;
                case 24: goto L_0x0248;
                case 25: goto L_0x0220;
                case 26: goto L_0x0216;
                case 27: goto L_0x0208;
                case 28: goto L_0x01fe;
                case 29: goto L_0x01f4;
                case 30: goto L_0x01ea;
                case 31: goto L_0x0248;
                case 32: goto L_0x0252;
                case 33: goto L_0x01e0;
                case 34: goto L_0x01d6;
                case 35: goto L_0x01bd;
                case 36: goto L_0x01b0;
                case 37: goto L_0x01a3;
                case 38: goto L_0x0196;
                case 39: goto L_0x0189;
                case 40: goto L_0x017c;
                case 41: goto L_0x016f;
                case 42: goto L_0x0162;
                case 43: goto L_0x0154;
                case 44: goto L_0x0146;
                case 45: goto L_0x0138;
                case 46: goto L_0x012a;
                case 47: goto L_0x011c;
                case 48: goto L_0x010e;
                case 49: goto L_0x0100;
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
            goto L_0x036a
        L_0x003f:
            boolean r11 = r0.u(r13, r4, r1)
            if (r11 == 0) goto L_0x036a
            goto L_0x0262
        L_0x0047:
            boolean r11 = r0.u(r13, r4, r1)
            if (r11 == 0) goto L_0x036a
            long r11 = I(r14, r1)
            goto L_0x027c
        L_0x0053:
            boolean r11 = r0.u(r13, r4, r1)
            if (r11 == 0) goto L_0x036a
            int r11 = H(r14, r1)
            goto L_0x028c
        L_0x005f:
            boolean r11 = r0.u(r13, r4, r1)
            if (r11 == 0) goto L_0x036a
            goto L_0x0298
        L_0x0067:
            boolean r11 = r0.u(r13, r4, r1)
            if (r11 == 0) goto L_0x036a
            goto L_0x02a4
        L_0x006f:
            boolean r11 = r0.u(r13, r4, r1)
            if (r11 == 0) goto L_0x036a
            int r11 = H(r14, r1)
            goto L_0x02b4
        L_0x007b:
            boolean r11 = r0.u(r13, r4, r1)
            if (r11 == 0) goto L_0x036a
            int r11 = H(r14, r1)
            goto L_0x02c4
        L_0x0087:
            boolean r11 = r0.u(r13, r4, r1)
            if (r11 == 0) goto L_0x036a
            goto L_0x02d0
        L_0x008f:
            boolean r11 = r0.u(r13, r4, r1)
            if (r11 == 0) goto L_0x036a
            goto L_0x02db
        L_0x0097:
            boolean r11 = r0.u(r13, r4, r1)
            if (r11 == 0) goto L_0x036a
            java.lang.Object r11 = com.google.android.gms.internal.clearcut.a3.w(r14, r1)
            boolean r12 = r11 instanceof com.google.android.gms.internal.clearcut.u
            if (r12 == 0) goto L_0x02ff
            goto L_0x02f7
        L_0x00a7:
            boolean r11 = r0.u(r13, r4, r1)
            if (r11 == 0) goto L_0x036a
            goto L_0x030c
        L_0x00af:
            boolean r11 = r0.u(r13, r4, r1)
            if (r11 == 0) goto L_0x036a
            goto L_0x0317
        L_0x00b7:
            boolean r11 = r0.u(r13, r4, r1)
            if (r11 == 0) goto L_0x036a
            goto L_0x0322
        L_0x00bf:
            boolean r11 = r0.u(r13, r4, r1)
            if (r11 == 0) goto L_0x036a
            int r11 = H(r14, r1)
            goto L_0x0331
        L_0x00cb:
            boolean r11 = r0.u(r13, r4, r1)
            if (r11 == 0) goto L_0x036a
            long r11 = I(r14, r1)
            goto L_0x0340
        L_0x00d7:
            boolean r11 = r0.u(r13, r4, r1)
            if (r11 == 0) goto L_0x036a
            long r11 = I(r14, r1)
            goto L_0x034f
        L_0x00e3:
            boolean r11 = r0.u(r13, r4, r1)
            if (r11 == 0) goto L_0x036a
            goto L_0x035a
        L_0x00eb:
            boolean r11 = r0.u(r13, r4, r1)
            if (r11 == 0) goto L_0x036a
            goto L_0x0365
        L_0x00f3:
            java.lang.Object r11 = com.google.android.gms.internal.clearcut.a3.w(r14, r1)
            r0.x(r4)
            r5.e(r11)
            r11 = 0
            goto L_0x0369
        L_0x0100:
            java.util.List r11 = G(r14, r1)
            com.google.android.gms.internal.clearcut.i2 r12 = r0.w(r4)
            int r11 = com.google.android.gms.internal.clearcut.k2.q(r13, r11, r12)
            goto L_0x0369
        L_0x010e:
            java.lang.Object r11 = r7.getObject(r1, r14)
            java.util.List r11 = (java.util.List) r11
            int r11 = com.google.android.gms.internal.clearcut.k2.n(r11)
            if (r11 <= 0) goto L_0x036a
            goto L_0x01c9
        L_0x011c:
            java.lang.Object r11 = r7.getObject(r1, r14)
            java.util.List r11 = (java.util.List) r11
            int r11 = com.google.android.gms.internal.clearcut.k2.z(r11)
            if (r11 <= 0) goto L_0x036a
            goto L_0x01c9
        L_0x012a:
            java.lang.Object r11 = r7.getObject(r1, r14)
            java.util.List r11 = (java.util.List) r11
            int r11 = com.google.android.gms.internal.clearcut.k2.D(r11)
            if (r11 <= 0) goto L_0x036a
            goto L_0x01c9
        L_0x0138:
            java.lang.Object r11 = r7.getObject(r1, r14)
            java.util.List r11 = (java.util.List) r11
            int r11 = com.google.android.gms.internal.clearcut.k2.B(r11)
            if (r11 <= 0) goto L_0x036a
            goto L_0x01c9
        L_0x0146:
            java.lang.Object r11 = r7.getObject(r1, r14)
            java.util.List r11 = (java.util.List) r11
            int r11 = com.google.android.gms.internal.clearcut.k2.r(r11)
            if (r11 <= 0) goto L_0x036a
            goto L_0x01c9
        L_0x0154:
            java.lang.Object r11 = r7.getObject(r1, r14)
            java.util.List r11 = (java.util.List) r11
            int r11 = com.google.android.gms.internal.clearcut.k2.x(r11)
            if (r11 <= 0) goto L_0x036a
            goto L_0x01c9
        L_0x0162:
            java.lang.Object r11 = r7.getObject(r1, r14)
            java.util.List r11 = (java.util.List) r11
            int r11 = com.google.android.gms.internal.clearcut.k2.F(r11)
            if (r11 <= 0) goto L_0x036a
            goto L_0x01c9
        L_0x016f:
            java.lang.Object r11 = r7.getObject(r1, r14)
            java.util.List r11 = (java.util.List) r11
            int r11 = com.google.android.gms.internal.clearcut.k2.B(r11)
            if (r11 <= 0) goto L_0x036a
            goto L_0x01c9
        L_0x017c:
            java.lang.Object r11 = r7.getObject(r1, r14)
            java.util.List r11 = (java.util.List) r11
            int r11 = com.google.android.gms.internal.clearcut.k2.D(r11)
            if (r11 <= 0) goto L_0x036a
            goto L_0x01c9
        L_0x0189:
            java.lang.Object r11 = r7.getObject(r1, r14)
            java.util.List r11 = (java.util.List) r11
            int r11 = com.google.android.gms.internal.clearcut.k2.v(r11)
            if (r11 <= 0) goto L_0x036a
            goto L_0x01c9
        L_0x0196:
            java.lang.Object r11 = r7.getObject(r1, r14)
            java.util.List r11 = (java.util.List) r11
            int r11 = com.google.android.gms.internal.clearcut.k2.g(r11)
            if (r11 <= 0) goto L_0x036a
            goto L_0x01c9
        L_0x01a3:
            java.lang.Object r11 = r7.getObject(r1, r14)
            java.util.List r11 = (java.util.List) r11
            int r11 = com.google.android.gms.internal.clearcut.k2.a(r11)
            if (r11 <= 0) goto L_0x036a
            goto L_0x01c9
        L_0x01b0:
            java.lang.Object r11 = r7.getObject(r1, r14)
            java.util.List r11 = (java.util.List) r11
            int r11 = com.google.android.gms.internal.clearcut.k2.B(r11)
            if (r11 <= 0) goto L_0x036a
            goto L_0x01c9
        L_0x01bd:
            java.lang.Object r11 = r7.getObject(r1, r14)
            java.util.List r11 = (java.util.List) r11
            int r11 = com.google.android.gms.internal.clearcut.k2.D(r11)
            if (r11 <= 0) goto L_0x036a
        L_0x01c9:
            int r12 = com.google.android.gms.internal.clearcut.x.v0(r13)
            int r13 = com.google.android.gms.internal.clearcut.x.x0(r11)
            int r13 = r13 + r12
            int r13 = r13 + r11
            int r10 = r10 + r13
            goto L_0x036a
        L_0x01d6:
            java.util.List r11 = G(r14, r1)
            int r11 = com.google.android.gms.internal.clearcut.k2.N(r13, r11)
            goto L_0x0369
        L_0x01e0:
            java.util.List r11 = G(r14, r1)
            int r11 = com.google.android.gms.internal.clearcut.k2.R(r13, r11)
            goto L_0x0369
        L_0x01ea:
            java.util.List r11 = G(r14, r1)
            int r11 = com.google.android.gms.internal.clearcut.k2.O(r13, r11)
            goto L_0x0369
        L_0x01f4:
            java.util.List r11 = G(r14, r1)
            int r11 = com.google.android.gms.internal.clearcut.k2.Q(r13, r11)
            goto L_0x0369
        L_0x01fe:
            java.util.List r11 = G(r14, r1)
            int r11 = com.google.android.gms.internal.clearcut.k2.p(r13, r11)
            goto L_0x0369
        L_0x0208:
            java.util.List r11 = G(r14, r1)
            com.google.android.gms.internal.clearcut.i2 r12 = r0.w(r4)
            int r11 = com.google.android.gms.internal.clearcut.k2.m(r13, r11, r12)
            goto L_0x0369
        L_0x0216:
            java.util.List r11 = G(r14, r1)
            int r11 = com.google.android.gms.internal.clearcut.k2.l(r13, r11)
            goto L_0x0369
        L_0x0220:
            java.util.List r11 = G(r14, r1)
            int r11 = com.google.android.gms.internal.clearcut.k2.U(r13, r11)
            goto L_0x0369
        L_0x022a:
            java.util.List r11 = G(r14, r1)
            int r11 = com.google.android.gms.internal.clearcut.k2.P(r13, r11)
            goto L_0x0369
        L_0x0234:
            java.util.List r11 = G(r14, r1)
            int r11 = com.google.android.gms.internal.clearcut.k2.M(r13, r11)
            goto L_0x0369
        L_0x023e:
            java.util.List r11 = G(r14, r1)
            int r11 = com.google.android.gms.internal.clearcut.k2.L(r13, r11)
            goto L_0x0369
        L_0x0248:
            java.util.List r11 = G(r14, r1)
            int r11 = com.google.android.gms.internal.clearcut.k2.S(r13, r11)
            goto L_0x0369
        L_0x0252:
            java.util.List r11 = G(r14, r1)
            int r11 = com.google.android.gms.internal.clearcut.k2.T(r13, r11)
            goto L_0x0369
        L_0x025c:
            boolean r11 = r0.v(r4, r1)
            if (r11 == 0) goto L_0x036a
        L_0x0262:
            java.lang.Object r11 = com.google.android.gms.internal.clearcut.a3.w(r14, r1)
            com.google.android.gms.internal.clearcut.r1 r11 = (com.google.android.gms.internal.clearcut.r1) r11
            com.google.android.gms.internal.clearcut.i2 r12 = r0.w(r4)
            int r11 = com.google.android.gms.internal.clearcut.x.Z(r13, r11, r12)
            goto L_0x0369
        L_0x0272:
            boolean r11 = r0.v(r4, r1)
            if (r11 == 0) goto L_0x036a
            long r11 = com.google.android.gms.internal.clearcut.a3.s(r14, r1)
        L_0x027c:
            int r11 = com.google.android.gms.internal.clearcut.x.g0(r13, r11)
            goto L_0x0369
        L_0x0282:
            boolean r11 = r0.v(r4, r1)
            if (r11 == 0) goto L_0x036a
            int r11 = com.google.android.gms.internal.clearcut.a3.r(r14, r1)
        L_0x028c:
            int r11 = com.google.android.gms.internal.clearcut.x.o0(r13, r11)
            goto L_0x0369
        L_0x0292:
            boolean r11 = r0.v(r4, r1)
            if (r11 == 0) goto L_0x036a
        L_0x0298:
            int r11 = com.google.android.gms.internal.clearcut.x.l0(r13)
            goto L_0x0369
        L_0x029e:
            boolean r11 = r0.v(r4, r1)
            if (r11 == 0) goto L_0x036a
        L_0x02a4:
            int r11 = com.google.android.gms.internal.clearcut.x.q0(r13)
            goto L_0x0369
        L_0x02aa:
            boolean r11 = r0.v(r4, r1)
            if (r11 == 0) goto L_0x036a
            int r11 = com.google.android.gms.internal.clearcut.a3.r(r14, r1)
        L_0x02b4:
            int r11 = com.google.android.gms.internal.clearcut.x.r0(r13, r11)
            goto L_0x0369
        L_0x02ba:
            boolean r11 = r0.v(r4, r1)
            if (r11 == 0) goto L_0x036a
            int r11 = com.google.android.gms.internal.clearcut.a3.r(r14, r1)
        L_0x02c4:
            int r11 = com.google.android.gms.internal.clearcut.x.m0(r13, r11)
            goto L_0x0369
        L_0x02ca:
            boolean r11 = r0.v(r4, r1)
            if (r11 == 0) goto L_0x036a
        L_0x02d0:
            java.lang.Object r11 = com.google.android.gms.internal.clearcut.a3.w(r14, r1)
            goto L_0x02f7
        L_0x02d5:
            boolean r11 = r0.v(r4, r1)
            if (r11 == 0) goto L_0x036a
        L_0x02db:
            java.lang.Object r11 = com.google.android.gms.internal.clearcut.a3.w(r14, r1)
            com.google.android.gms.internal.clearcut.i2 r12 = r0.w(r4)
            int r11 = com.google.android.gms.internal.clearcut.k2.k(r13, r12, r11)
            goto L_0x0369
        L_0x02e9:
            boolean r11 = r0.v(r4, r1)
            if (r11 == 0) goto L_0x036a
            java.lang.Object r11 = com.google.android.gms.internal.clearcut.a3.w(r14, r1)
            boolean r12 = r11 instanceof com.google.android.gms.internal.clearcut.u
            if (r12 == 0) goto L_0x02ff
        L_0x02f7:
            com.google.android.gms.internal.clearcut.u r11 = (com.google.android.gms.internal.clearcut.u) r11
            int r11 = com.google.android.gms.internal.clearcut.x.Y(r13, r11)
            goto L_0x0369
        L_0x02ff:
            java.lang.String r11 = (java.lang.String) r11
            int r11 = com.google.android.gms.internal.clearcut.x.Q(r11, r13)
            goto L_0x0369
        L_0x0306:
            boolean r11 = r0.v(r4, r1)
            if (r11 == 0) goto L_0x036a
        L_0x030c:
            int r11 = com.google.android.gms.internal.clearcut.x.X(r13)
            goto L_0x0369
        L_0x0311:
            boolean r11 = r0.v(r4, r1)
            if (r11 == 0) goto L_0x036a
        L_0x0317:
            int r11 = com.google.android.gms.internal.clearcut.x.p0(r13)
            goto L_0x0369
        L_0x031c:
            boolean r11 = r0.v(r4, r1)
            if (r11 == 0) goto L_0x036a
        L_0x0322:
            int r11 = com.google.android.gms.internal.clearcut.x.j0(r13)
            goto L_0x0369
        L_0x0327:
            boolean r11 = r0.v(r4, r1)
            if (r11 == 0) goto L_0x036a
            int r11 = com.google.android.gms.internal.clearcut.a3.r(r14, r1)
        L_0x0331:
            int r11 = com.google.android.gms.internal.clearcut.x.k0(r13, r11)
            goto L_0x0369
        L_0x0336:
            boolean r11 = r0.v(r4, r1)
            if (r11 == 0) goto L_0x036a
            long r11 = com.google.android.gms.internal.clearcut.a3.s(r14, r1)
        L_0x0340:
            int r11 = com.google.android.gms.internal.clearcut.x.f0(r13, r11)
            goto L_0x0369
        L_0x0345:
            boolean r11 = r0.v(r4, r1)
            if (r11 == 0) goto L_0x036a
            long r11 = com.google.android.gms.internal.clearcut.a3.s(r14, r1)
        L_0x034f:
            int r11 = com.google.android.gms.internal.clearcut.x.c0(r13, r11)
            goto L_0x0369
        L_0x0354:
            boolean r11 = r0.v(r4, r1)
            if (r11 == 0) goto L_0x036a
        L_0x035a:
            int r11 = com.google.android.gms.internal.clearcut.x.P(r13)
            goto L_0x0369
        L_0x035f:
            boolean r11 = r0.v(r4, r1)
            if (r11 == 0) goto L_0x036a
        L_0x0365:
            int r11 = com.google.android.gms.internal.clearcut.x.W(r13)
        L_0x0369:
            int r10 = r10 + r11
        L_0x036a:
            int r4 = r4 + 4
            goto L_0x0017
        L_0x036e:
            com.google.android.gms.internal.clearcut.v2 r1 = r6.i(r1)
            int r1 = r6.h(r1)
            int r1 = r1 + r10
            return r1
        L_0x0378:
            r4 = -1
            r10 = 0
            r11 = 0
            r12 = 0
        L_0x037c:
            int r13 = r8.length
            if (r10 >= r13) goto L_0x06f4
            int r13 = r0.z(r10)
            r14 = r8[r10]
            r15 = r13 & r2
            int r15 = r15 >>> 20
            r2 = 17
            if (r15 > r2) goto L_0x03a5
            int r2 = r10 + 2
            r2 = r8[r2]
            r9 = r2 & r3
            int r2 = r2 >>> 20
            r16 = 1
            int r2 = r16 << r2
            if (r9 == r4) goto L_0x03a1
            long r3 = (long) r9
            int r12 = r7.getInt(r1, r3)
            r4 = r9
        L_0x03a1:
            r3 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x03a6
        L_0x03a5:
            r2 = 0
        L_0x03a6:
            r9 = r13 & r3
            r13 = r4
            long r3 = (long) r9
            switch(r15) {
                case 0: goto L_0x06de;
                case 1: goto L_0x06d6;
                case 2: goto L_0x06c9;
                case 3: goto L_0x06bc;
                case 4: goto L_0x06af;
                case 5: goto L_0x06a7;
                case 6: goto L_0x069e;
                case 7: goto L_0x0696;
                case 8: goto L_0x067c;
                case 9: goto L_0x066c;
                case 10: goto L_0x0664;
                case 11: goto L_0x0658;
                case 12: goto L_0x064c;
                case 13: goto L_0x0644;
                case 14: goto L_0x063c;
                case 15: goto L_0x0630;
                case 16: goto L_0x0623;
                case 17: goto L_0x0610;
                case 18: goto L_0x0604;
                case 19: goto L_0x05f7;
                case 20: goto L_0x05ec;
                case 21: goto L_0x05e1;
                case 22: goto L_0x05d6;
                case 23: goto L_0x05cb;
                case 24: goto L_0x05f7;
                case 25: goto L_0x05c0;
                case 26: goto L_0x05b4;
                case 27: goto L_0x05a4;
                case 28: goto L_0x0598;
                case 29: goto L_0x058c;
                case 30: goto L_0x0580;
                case 31: goto L_0x05f7;
                case 32: goto L_0x05cb;
                case 33: goto L_0x0574;
                case 34: goto L_0x0568;
                case 35: goto L_0x054f;
                case 36: goto L_0x0542;
                case 37: goto L_0x0535;
                case 38: goto L_0x0528;
                case 39: goto L_0x051b;
                case 40: goto L_0x050e;
                case 41: goto L_0x0501;
                case 42: goto L_0x04f4;
                case 43: goto L_0x04e6;
                case 44: goto L_0x04d8;
                case 45: goto L_0x04ca;
                case 46: goto L_0x04bc;
                case 47: goto L_0x04ae;
                case 48: goto L_0x04a0;
                case 49: goto L_0x0490;
                case 50: goto L_0x0483;
                case 51: goto L_0x0477;
                case 52: goto L_0x046b;
                case 53: goto L_0x045b;
                case 54: goto L_0x044b;
                case 55: goto L_0x043b;
                case 56: goto L_0x042f;
                case 57: goto L_0x0423;
                case 58: goto L_0x0417;
                case 59: goto L_0x0407;
                case 60: goto L_0x03ff;
                case 61: goto L_0x03f7;
                case 62: goto L_0x03eb;
                case 63: goto L_0x03df;
                case 64: goto L_0x03d7;
                case 65: goto L_0x03cf;
                case 66: goto L_0x03c3;
                case 67: goto L_0x03b7;
                case 68: goto L_0x03af;
                default: goto L_0x03ad;
            }
        L_0x03ad:
            goto L_0x06e8
        L_0x03af:
            boolean r2 = r0.u(r14, r10, r1)
            if (r2 == 0) goto L_0x06e8
            goto L_0x0613
        L_0x03b7:
            boolean r2 = r0.u(r14, r10, r1)
            if (r2 == 0) goto L_0x06e8
            long r2 = I(r3, r1)
            goto L_0x062a
        L_0x03c3:
            boolean r2 = r0.u(r14, r10, r1)
            if (r2 == 0) goto L_0x06e8
            int r2 = H(r3, r1)
            goto L_0x0637
        L_0x03cf:
            boolean r2 = r0.u(r14, r10, r1)
            if (r2 == 0) goto L_0x06e8
            goto L_0x063f
        L_0x03d7:
            boolean r2 = r0.u(r14, r10, r1)
            if (r2 == 0) goto L_0x06e8
            goto L_0x0647
        L_0x03df:
            boolean r2 = r0.u(r14, r10, r1)
            if (r2 == 0) goto L_0x06e8
            int r2 = H(r3, r1)
            goto L_0x0653
        L_0x03eb:
            boolean r2 = r0.u(r14, r10, r1)
            if (r2 == 0) goto L_0x06e8
            int r2 = H(r3, r1)
            goto L_0x065f
        L_0x03f7:
            boolean r2 = r0.u(r14, r10, r1)
            if (r2 == 0) goto L_0x06e8
            goto L_0x0667
        L_0x03ff:
            boolean r2 = r0.u(r14, r10, r1)
            if (r2 == 0) goto L_0x06e8
            goto L_0x066f
        L_0x0407:
            boolean r2 = r0.u(r14, r10, r1)
            if (r2 == 0) goto L_0x06e8
            java.lang.Object r2 = r7.getObject(r1, r3)
            boolean r3 = r2 instanceof com.google.android.gms.internal.clearcut.u
            if (r3 == 0) goto L_0x068e
            goto L_0x0687
        L_0x0417:
            boolean r2 = r0.u(r14, r10, r1)
            if (r2 == 0) goto L_0x06e8
            int r2 = com.google.android.gms.internal.clearcut.x.X(r14)
            goto L_0x0694
        L_0x0423:
            boolean r2 = r0.u(r14, r10, r1)
            if (r2 == 0) goto L_0x06e8
            int r2 = com.google.android.gms.internal.clearcut.x.p0(r14)
            goto L_0x0694
        L_0x042f:
            boolean r2 = r0.u(r14, r10, r1)
            if (r2 == 0) goto L_0x06e8
            int r2 = com.google.android.gms.internal.clearcut.x.j0(r14)
            goto L_0x0694
        L_0x043b:
            boolean r2 = r0.u(r14, r10, r1)
            if (r2 == 0) goto L_0x06e8
            int r2 = H(r3, r1)
            int r2 = com.google.android.gms.internal.clearcut.x.k0(r14, r2)
            goto L_0x0694
        L_0x044b:
            boolean r2 = r0.u(r14, r10, r1)
            if (r2 == 0) goto L_0x06e8
            long r2 = I(r3, r1)
            int r2 = com.google.android.gms.internal.clearcut.x.f0(r14, r2)
            goto L_0x0694
        L_0x045b:
            boolean r2 = r0.u(r14, r10, r1)
            if (r2 == 0) goto L_0x06e8
            long r2 = I(r3, r1)
            int r2 = com.google.android.gms.internal.clearcut.x.c0(r14, r2)
            goto L_0x0694
        L_0x046b:
            boolean r2 = r0.u(r14, r10, r1)
            if (r2 == 0) goto L_0x06e8
            int r2 = com.google.android.gms.internal.clearcut.x.P(r14)
            goto L_0x0694
        L_0x0477:
            boolean r2 = r0.u(r14, r10, r1)
            if (r2 == 0) goto L_0x06e8
            int r2 = com.google.android.gms.internal.clearcut.x.W(r14)
            goto L_0x0694
        L_0x0483:
            java.lang.Object r2 = r7.getObject(r1, r3)
            r0.x(r10)
            r5.e(r2)
            r2 = 0
            goto L_0x0694
        L_0x0490:
            java.lang.Object r2 = r7.getObject(r1, r3)
            java.util.List r2 = (java.util.List) r2
            com.google.android.gms.internal.clearcut.i2 r3 = r0.w(r10)
            int r2 = com.google.android.gms.internal.clearcut.k2.q(r14, r2, r3)
            goto L_0x0694
        L_0x04a0:
            java.lang.Object r2 = r7.getObject(r1, r3)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.clearcut.k2.n(r2)
            if (r2 <= 0) goto L_0x06e8
            goto L_0x055b
        L_0x04ae:
            java.lang.Object r2 = r7.getObject(r1, r3)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.clearcut.k2.z(r2)
            if (r2 <= 0) goto L_0x06e8
            goto L_0x055b
        L_0x04bc:
            java.lang.Object r2 = r7.getObject(r1, r3)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.clearcut.k2.D(r2)
            if (r2 <= 0) goto L_0x06e8
            goto L_0x055b
        L_0x04ca:
            java.lang.Object r2 = r7.getObject(r1, r3)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.clearcut.k2.B(r2)
            if (r2 <= 0) goto L_0x06e8
            goto L_0x055b
        L_0x04d8:
            java.lang.Object r2 = r7.getObject(r1, r3)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.clearcut.k2.r(r2)
            if (r2 <= 0) goto L_0x06e8
            goto L_0x055b
        L_0x04e6:
            java.lang.Object r2 = r7.getObject(r1, r3)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.clearcut.k2.x(r2)
            if (r2 <= 0) goto L_0x06e8
            goto L_0x055b
        L_0x04f4:
            java.lang.Object r2 = r7.getObject(r1, r3)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.clearcut.k2.F(r2)
            if (r2 <= 0) goto L_0x06e8
            goto L_0x055b
        L_0x0501:
            java.lang.Object r2 = r7.getObject(r1, r3)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.clearcut.k2.B(r2)
            if (r2 <= 0) goto L_0x06e8
            goto L_0x055b
        L_0x050e:
            java.lang.Object r2 = r7.getObject(r1, r3)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.clearcut.k2.D(r2)
            if (r2 <= 0) goto L_0x06e8
            goto L_0x055b
        L_0x051b:
            java.lang.Object r2 = r7.getObject(r1, r3)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.clearcut.k2.v(r2)
            if (r2 <= 0) goto L_0x06e8
            goto L_0x055b
        L_0x0528:
            java.lang.Object r2 = r7.getObject(r1, r3)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.clearcut.k2.g(r2)
            if (r2 <= 0) goto L_0x06e8
            goto L_0x055b
        L_0x0535:
            java.lang.Object r2 = r7.getObject(r1, r3)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.clearcut.k2.a(r2)
            if (r2 <= 0) goto L_0x06e8
            goto L_0x055b
        L_0x0542:
            java.lang.Object r2 = r7.getObject(r1, r3)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.clearcut.k2.B(r2)
            if (r2 <= 0) goto L_0x06e8
            goto L_0x055b
        L_0x054f:
            java.lang.Object r2 = r7.getObject(r1, r3)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.clearcut.k2.D(r2)
            if (r2 <= 0) goto L_0x06e8
        L_0x055b:
            int r3 = com.google.android.gms.internal.clearcut.x.v0(r14)
            int r4 = com.google.android.gms.internal.clearcut.x.x0(r2)
            int r4 = r4 + r3
            int r4 = r4 + r2
            int r11 = r11 + r4
            goto L_0x06e8
        L_0x0568:
            java.lang.Object r2 = r7.getObject(r1, r3)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.clearcut.k2.N(r14, r2)
            goto L_0x0601
        L_0x0574:
            java.lang.Object r2 = r7.getObject(r1, r3)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.clearcut.k2.R(r14, r2)
            goto L_0x0601
        L_0x0580:
            java.lang.Object r2 = r7.getObject(r1, r3)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.clearcut.k2.O(r14, r2)
            goto L_0x0601
        L_0x058c:
            java.lang.Object r2 = r7.getObject(r1, r3)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.clearcut.k2.Q(r14, r2)
            goto L_0x0694
        L_0x0598:
            java.lang.Object r2 = r7.getObject(r1, r3)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.clearcut.k2.p(r14, r2)
            goto L_0x0694
        L_0x05a4:
            java.lang.Object r2 = r7.getObject(r1, r3)
            java.util.List r2 = (java.util.List) r2
            com.google.android.gms.internal.clearcut.i2 r3 = r0.w(r10)
            int r2 = com.google.android.gms.internal.clearcut.k2.m(r14, r2, r3)
            goto L_0x0694
        L_0x05b4:
            java.lang.Object r2 = r7.getObject(r1, r3)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.clearcut.k2.l(r14, r2)
            goto L_0x0694
        L_0x05c0:
            java.lang.Object r2 = r7.getObject(r1, r3)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.clearcut.k2.U(r14, r2)
            goto L_0x0601
        L_0x05cb:
            java.lang.Object r2 = r7.getObject(r1, r3)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.clearcut.k2.T(r14, r2)
            goto L_0x0601
        L_0x05d6:
            java.lang.Object r2 = r7.getObject(r1, r3)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.clearcut.k2.P(r14, r2)
            goto L_0x0601
        L_0x05e1:
            java.lang.Object r2 = r7.getObject(r1, r3)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.clearcut.k2.M(r14, r2)
            goto L_0x0601
        L_0x05ec:
            java.lang.Object r2 = r7.getObject(r1, r3)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.clearcut.k2.L(r14, r2)
            goto L_0x0601
        L_0x05f7:
            java.lang.Object r2 = r7.getObject(r1, r3)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.clearcut.k2.S(r14, r2)
        L_0x0601:
            int r11 = r11 + r2
            goto L_0x06ea
        L_0x0604:
            java.lang.Object r2 = r7.getObject(r1, r3)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.clearcut.k2.T(r14, r2)
            goto L_0x0694
        L_0x0610:
            r2 = r2 & r12
            if (r2 == 0) goto L_0x06e8
        L_0x0613:
            java.lang.Object r2 = r7.getObject(r1, r3)
            com.google.android.gms.internal.clearcut.r1 r2 = (com.google.android.gms.internal.clearcut.r1) r2
            com.google.android.gms.internal.clearcut.i2 r3 = r0.w(r10)
            int r2 = com.google.android.gms.internal.clearcut.x.Z(r14, r2, r3)
            goto L_0x0694
        L_0x0623:
            r2 = r2 & r12
            if (r2 == 0) goto L_0x06e8
            long r2 = r7.getLong(r1, r3)
        L_0x062a:
            int r2 = com.google.android.gms.internal.clearcut.x.g0(r14, r2)
            goto L_0x0694
        L_0x0630:
            r2 = r2 & r12
            if (r2 == 0) goto L_0x06e8
            int r2 = r7.getInt(r1, r3)
        L_0x0637:
            int r2 = com.google.android.gms.internal.clearcut.x.o0(r14, r2)
            goto L_0x0694
        L_0x063c:
            r2 = r2 & r12
            if (r2 == 0) goto L_0x06e8
        L_0x063f:
            int r2 = com.google.android.gms.internal.clearcut.x.l0(r14)
            goto L_0x0694
        L_0x0644:
            r2 = r2 & r12
            if (r2 == 0) goto L_0x06e8
        L_0x0647:
            int r2 = com.google.android.gms.internal.clearcut.x.q0(r14)
            goto L_0x0694
        L_0x064c:
            r2 = r2 & r12
            if (r2 == 0) goto L_0x06e8
            int r2 = r7.getInt(r1, r3)
        L_0x0653:
            int r2 = com.google.android.gms.internal.clearcut.x.r0(r14, r2)
            goto L_0x0694
        L_0x0658:
            r2 = r2 & r12
            if (r2 == 0) goto L_0x06e8
            int r2 = r7.getInt(r1, r3)
        L_0x065f:
            int r2 = com.google.android.gms.internal.clearcut.x.m0(r14, r2)
            goto L_0x0694
        L_0x0664:
            r2 = r2 & r12
            if (r2 == 0) goto L_0x06e8
        L_0x0667:
            java.lang.Object r2 = r7.getObject(r1, r3)
            goto L_0x0687
        L_0x066c:
            r2 = r2 & r12
            if (r2 == 0) goto L_0x06e8
        L_0x066f:
            java.lang.Object r2 = r7.getObject(r1, r3)
            com.google.android.gms.internal.clearcut.i2 r3 = r0.w(r10)
            int r2 = com.google.android.gms.internal.clearcut.k2.k(r14, r3, r2)
            goto L_0x0694
        L_0x067c:
            r2 = r2 & r12
            if (r2 == 0) goto L_0x06e8
            java.lang.Object r2 = r7.getObject(r1, r3)
            boolean r3 = r2 instanceof com.google.android.gms.internal.clearcut.u
            if (r3 == 0) goto L_0x068e
        L_0x0687:
            com.google.android.gms.internal.clearcut.u r2 = (com.google.android.gms.internal.clearcut.u) r2
            int r2 = com.google.android.gms.internal.clearcut.x.Y(r14, r2)
            goto L_0x0694
        L_0x068e:
            java.lang.String r2 = (java.lang.String) r2
            int r2 = com.google.android.gms.internal.clearcut.x.Q(r2, r14)
        L_0x0694:
            int r11 = r11 + r2
            goto L_0x06e8
        L_0x0696:
            r2 = r2 & r12
            if (r2 == 0) goto L_0x06e8
            int r2 = com.google.android.gms.internal.clearcut.x.X(r14)
            goto L_0x06e5
        L_0x069e:
            r2 = r2 & r12
            if (r2 == 0) goto L_0x06ea
            int r2 = com.google.android.gms.internal.clearcut.x.p0(r14)
        L_0x06a5:
            int r11 = r11 + r2
            goto L_0x06ea
        L_0x06a7:
            r2 = r2 & r12
            if (r2 == 0) goto L_0x06ea
            int r2 = com.google.android.gms.internal.clearcut.x.j0(r14)
            goto L_0x06a5
        L_0x06af:
            r2 = r2 & r12
            if (r2 == 0) goto L_0x06ea
            int r2 = r7.getInt(r1, r3)
            int r2 = com.google.android.gms.internal.clearcut.x.k0(r14, r2)
            goto L_0x0601
        L_0x06bc:
            r2 = r2 & r12
            if (r2 == 0) goto L_0x06ea
            long r2 = r7.getLong(r1, r3)
            int r2 = com.google.android.gms.internal.clearcut.x.f0(r14, r2)
            goto L_0x0601
        L_0x06c9:
            r2 = r2 & r12
            if (r2 == 0) goto L_0x06ea
            long r2 = r7.getLong(r1, r3)
            int r2 = com.google.android.gms.internal.clearcut.x.c0(r14, r2)
            goto L_0x0601
        L_0x06d6:
            r2 = r2 & r12
            if (r2 == 0) goto L_0x06ea
            int r2 = com.google.android.gms.internal.clearcut.x.P(r14)
            goto L_0x06a5
        L_0x06de:
            r2 = r2 & r12
            if (r2 == 0) goto L_0x06ea
            int r2 = com.google.android.gms.internal.clearcut.x.W(r14)
        L_0x06e5:
            int r2 = r2 + r11
        L_0x06e6:
            r11 = r2
            goto L_0x06ea
        L_0x06e8:
            r2 = r11
            goto L_0x06e6
        L_0x06ea:
            int r10 = r10 + 4
            r4 = r13
            r2 = 267386880(0xff00000, float:2.3665827E-29)
            r3 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x037c
        L_0x06f4:
            com.google.android.gms.internal.clearcut.v2 r2 = r6.i(r1)
            int r2 = r6.h(r2)
            int r2 = r2 + r11
            boolean r3 = r0.f2557g
            if (r3 == 0) goto L_0x070c
            com.google.android.gms.internal.clearcut.c0<?> r3 = r0.f2564o
            com.google.android.gms.internal.clearcut.g0 r1 = r3.a(r1)
            int r1 = r1.g()
            int r2 = r2 + r1
        L_0x070c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.v1.d(java.lang.Object):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x0366  */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0378  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x038a  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x039c  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x03ae  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x03c0  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x03d2  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x03e4  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x03f6  */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x040e  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0422  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0436  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x044a  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x045e  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0472  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0486  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x049c  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x04b4  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x04c8  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x04dc  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x04f0  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x0503  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0516  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x0529  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x053c  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x054f  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x056b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0168  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0179  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0190  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01a7  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01b2  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01c5  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01d6  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01e8  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01fa  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x020c  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x021e  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0230  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0242  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0254  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0266  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0278  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x028a  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x029c  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x02ae  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x02c0  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x02d2  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x02e4  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x02f6  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0308  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x031a  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x032c  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x033e  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0354  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(java.lang.Object r18, com.google.android.gms.internal.clearcut.y r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r19.getClass()
            boolean r3 = r0.f2558h
            if (r3 == 0) goto L_0x0588
            boolean r4 = r0.f2557g
            com.google.android.gms.internal.clearcut.c0<?> r5 = r0.f2564o
            if (r4 == 0) goto L_0x0028
            com.google.android.gms.internal.clearcut.g0 r4 = r5.a(r1)
            boolean r6 = r4.a()
            if (r6 != 0) goto L_0x0028
            java.util.Iterator r4 = r4.c()
            java.lang.Object r6 = r4.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            goto L_0x002a
        L_0x0028:
            r4 = 0
            r6 = 0
        L_0x002a:
            int[] r7 = r0.f2552a
            int r8 = r7.length
            r9 = 0
            r10 = r9
        L_0x002f:
            if (r10 >= r8) goto L_0x0567
            int r11 = r0.z(r10)
            r12 = r7[r10]
        L_0x0037:
            if (r6 == 0) goto L_0x0050
            r5.b(r6)
            if (r12 < 0) goto L_0x0050
            r5.c(r6)
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x004e
            java.lang.Object r6 = r4.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            goto L_0x0037
        L_0x004e:
            r6 = 0
            goto L_0x0037
        L_0x0050:
            r13 = 267386880(0xff00000, float:2.3665827E-29)
            r13 = r13 & r11
            int r13 = r13 >>> 20
            r14 = 1
            r15 = 1048575(0xfffff, float:1.469367E-39)
            switch(r13) {
                case 0: goto L_0x054f;
                case 1: goto L_0x053c;
                case 2: goto L_0x0529;
                case 3: goto L_0x0516;
                case 4: goto L_0x0503;
                case 5: goto L_0x04f0;
                case 6: goto L_0x04dc;
                case 7: goto L_0x04c8;
                case 8: goto L_0x04b4;
                case 9: goto L_0x049c;
                case 10: goto L_0x0486;
                case 11: goto L_0x0472;
                case 12: goto L_0x045e;
                case 13: goto L_0x044a;
                case 14: goto L_0x0436;
                case 15: goto L_0x0422;
                case 16: goto L_0x040e;
                case 17: goto L_0x03f6;
                case 18: goto L_0x03e4;
                case 19: goto L_0x03d2;
                case 20: goto L_0x03c0;
                case 21: goto L_0x03ae;
                case 22: goto L_0x039c;
                case 23: goto L_0x038a;
                case 24: goto L_0x0378;
                case 25: goto L_0x0366;
                case 26: goto L_0x0354;
                case 27: goto L_0x033e;
                case 28: goto L_0x032c;
                case 29: goto L_0x031a;
                case 30: goto L_0x0308;
                case 31: goto L_0x02f6;
                case 32: goto L_0x02e4;
                case 33: goto L_0x02d2;
                case 34: goto L_0x02c0;
                case 35: goto L_0x02ae;
                case 36: goto L_0x029c;
                case 37: goto L_0x028a;
                case 38: goto L_0x0278;
                case 39: goto L_0x0266;
                case 40: goto L_0x0254;
                case 41: goto L_0x0242;
                case 42: goto L_0x0230;
                case 43: goto L_0x021e;
                case 44: goto L_0x020c;
                case 45: goto L_0x01fa;
                case 46: goto L_0x01e8;
                case 47: goto L_0x01d6;
                case 48: goto L_0x01c5;
                case 49: goto L_0x01b2;
                case 50: goto L_0x01a7;
                case 51: goto L_0x0190;
                case 52: goto L_0x0179;
                case 53: goto L_0x0168;
                case 54: goto L_0x0157;
                case 55: goto L_0x0146;
                case 56: goto L_0x0135;
                case 57: goto L_0x0124;
                case 58: goto L_0x010d;
                case 59: goto L_0x00fc;
                case 60: goto L_0x00e7;
                case 61: goto L_0x00d4;
                case 62: goto L_0x00c4;
                case 63: goto L_0x00b4;
                case 64: goto L_0x00a4;
                case 65: goto L_0x0094;
                case 66: goto L_0x0084;
                case 67: goto L_0x0074;
                case 68: goto L_0x0060;
                default: goto L_0x005c;
            }
        L_0x005c:
            r16 = r4
            goto L_0x0561
        L_0x0060:
            boolean r13 = r0.u(r12, r10, r1)
            if (r13 == 0) goto L_0x005c
            r11 = r11 & r15
            long r13 = (long) r11
            java.lang.Object r11 = com.google.android.gms.internal.clearcut.a3.w(r13, r1)
            com.google.android.gms.internal.clearcut.i2 r13 = r0.w(r10)
            r2.h(r12, r13, r11)
            goto L_0x005c
        L_0x0074:
            boolean r13 = r0.u(r12, r10, r1)
            if (r13 == 0) goto L_0x005c
            r11 = r11 & r15
            long r13 = (long) r11
            long r13 = I(r13, r1)
            r2.g(r12, r13)
            goto L_0x005c
        L_0x0084:
            boolean r13 = r0.u(r12, r10, r1)
            if (r13 == 0) goto L_0x005c
            r11 = r11 & r15
            long r13 = (long) r11
            int r11 = H(r13, r1)
            r2.m(r12, r11)
            goto L_0x005c
        L_0x0094:
            boolean r13 = r0.u(r12, r10, r1)
            if (r13 == 0) goto L_0x005c
            r11 = r11 & r15
            long r13 = (long) r11
            long r13 = I(r13, r1)
            r2.p(r12, r13)
            goto L_0x005c
        L_0x00a4:
            boolean r13 = r0.u(r12, r10, r1)
            if (r13 == 0) goto L_0x005c
            r11 = r11 & r15
            long r13 = (long) r11
            int r11 = H(r13, r1)
            r2.q(r12, r11)
            goto L_0x005c
        L_0x00b4:
            boolean r13 = r0.u(r12, r10, r1)
            if (r13 == 0) goto L_0x005c
            r11 = r11 & r15
            long r13 = (long) r11
            int r11 = H(r13, r1)
            r2.r(r12, r11)
            goto L_0x005c
        L_0x00c4:
            boolean r13 = r0.u(r12, r10, r1)
            if (r13 == 0) goto L_0x005c
            r11 = r11 & r15
            long r13 = (long) r11
            int r11 = H(r13, r1)
            r2.l(r12, r11)
            goto L_0x005c
        L_0x00d4:
            boolean r13 = r0.u(r12, r10, r1)
            if (r13 == 0) goto L_0x005c
            r11 = r11 & r15
            long r13 = (long) r11
            java.lang.Object r11 = com.google.android.gms.internal.clearcut.a3.w(r13, r1)
            com.google.android.gms.internal.clearcut.u r11 = (com.google.android.gms.internal.clearcut.u) r11
            r2.d(r12, r11)
            goto L_0x005c
        L_0x00e7:
            boolean r13 = r0.u(r12, r10, r1)
            if (r13 == 0) goto L_0x005c
            r11 = r11 & r15
            long r13 = (long) r11
            java.lang.Object r11 = com.google.android.gms.internal.clearcut.a3.w(r13, r1)
            com.google.android.gms.internal.clearcut.i2 r13 = r0.w(r10)
            r2.e(r12, r13, r11)
            goto L_0x005c
        L_0x00fc:
            boolean r13 = r0.u(r12, r10, r1)
            if (r13 == 0) goto L_0x005c
            r11 = r11 & r15
            long r13 = (long) r11
            java.lang.Object r11 = com.google.android.gms.internal.clearcut.a3.w(r13, r1)
            q(r12, r11, r2)
            goto L_0x005c
        L_0x010d:
            boolean r13 = r0.u(r12, r10, r1)
            if (r13 == 0) goto L_0x005c
            r11 = r11 & r15
            long r13 = (long) r11
            java.lang.Object r11 = com.google.android.gms.internal.clearcut.a3.w(r13, r1)
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            r2.i(r12, r11)
            goto L_0x005c
        L_0x0124:
            boolean r13 = r0.u(r12, r10, r1)
            if (r13 == 0) goto L_0x005c
            r11 = r11 & r15
            long r13 = (long) r11
            int r11 = H(r13, r1)
            r2.n(r12, r11)
            goto L_0x005c
        L_0x0135:
            boolean r13 = r0.u(r12, r10, r1)
            if (r13 == 0) goto L_0x005c
            r11 = r11 & r15
            long r13 = (long) r11
            long r13 = I(r13, r1)
            r2.k(r12, r13)
            goto L_0x005c
        L_0x0146:
            boolean r13 = r0.u(r12, r10, r1)
            if (r13 == 0) goto L_0x005c
            r11 = r11 & r15
            long r13 = (long) r11
            int r11 = H(r13, r1)
            r2.j(r12, r11)
            goto L_0x005c
        L_0x0157:
            boolean r13 = r0.u(r12, r10, r1)
            if (r13 == 0) goto L_0x005c
            r11 = r11 & r15
            long r13 = (long) r11
            long r13 = I(r13, r1)
            r2.c(r12, r13)
            goto L_0x005c
        L_0x0168:
            boolean r13 = r0.u(r12, r10, r1)
            if (r13 == 0) goto L_0x005c
            r11 = r11 & r15
            long r13 = (long) r11
            long r13 = I(r13, r1)
            r2.o(r12, r13)
            goto L_0x005c
        L_0x0179:
            boolean r13 = r0.u(r12, r10, r1)
            if (r13 == 0) goto L_0x005c
            r11 = r11 & r15
            long r13 = (long) r11
            java.lang.Object r11 = com.google.android.gms.internal.clearcut.a3.w(r13, r1)
            java.lang.Float r11 = (java.lang.Float) r11
            float r11 = r11.floatValue()
            r2.b(r12, r11)
            goto L_0x005c
        L_0x0190:
            boolean r13 = r0.u(r12, r10, r1)
            if (r13 == 0) goto L_0x005c
            r11 = r11 & r15
            long r13 = (long) r11
            java.lang.Object r11 = com.google.android.gms.internal.clearcut.a3.w(r13, r1)
            java.lang.Double r11 = (java.lang.Double) r11
            double r13 = r11.doubleValue()
            r2.a(r13, r12)
            goto L_0x005c
        L_0x01a7:
            r11 = r11 & r15
            long r13 = (long) r11
            java.lang.Object r11 = com.google.android.gms.internal.clearcut.a3.w(r13, r1)
            r0.s(r2, r12, r11, r10)
            goto L_0x005c
        L_0x01b2:
            r12 = r7[r10]
            r11 = r11 & r15
            long r13 = (long) r11
            java.lang.Object r11 = com.google.android.gms.internal.clearcut.a3.w(r13, r1)
            java.util.List r11 = (java.util.List) r11
            com.google.android.gms.internal.clearcut.i2 r13 = r0.w(r10)
            com.google.android.gms.internal.clearcut.k2.i(r12, r11, r2, r13)
            goto L_0x005c
        L_0x01c5:
            r12 = r7[r10]
            r11 = r11 & r15
            r16 = r4
            long r3 = (long) r11
            java.lang.Object r3 = com.google.android.gms.internal.clearcut.a3.w(r3, r1)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.clearcut.k2.w(r12, r3, r2, r14)
            goto L_0x0561
        L_0x01d6:
            r16 = r4
            r3 = r7[r10]
            r4 = r11 & r15
            long r11 = (long) r4
            java.lang.Object r4 = com.google.android.gms.internal.clearcut.a3.w(r11, r1)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.clearcut.k2.G(r3, r4, r2, r14)
            goto L_0x0561
        L_0x01e8:
            r16 = r4
            r3 = r7[r10]
            r4 = r11 & r15
            long r11 = (long) r4
            java.lang.Object r4 = com.google.android.gms.internal.clearcut.a3.w(r11, r1)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.clearcut.k2.A(r3, r4, r2, r14)
            goto L_0x0561
        L_0x01fa:
            r16 = r4
            r3 = r7[r10]
            r4 = r11 & r15
            long r11 = (long) r4
            java.lang.Object r4 = com.google.android.gms.internal.clearcut.a3.w(r11, r1)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.clearcut.k2.I(r3, r4, r2, r14)
            goto L_0x0561
        L_0x020c:
            r16 = r4
            r3 = r7[r10]
            r4 = r11 & r15
            long r11 = (long) r4
            java.lang.Object r4 = com.google.android.gms.internal.clearcut.a3.w(r11, r1)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.clearcut.k2.J(r3, r4, r2, r14)
            goto L_0x0561
        L_0x021e:
            r16 = r4
            r3 = r7[r10]
            r4 = r11 & r15
            long r11 = (long) r4
            java.lang.Object r4 = com.google.android.gms.internal.clearcut.a3.w(r11, r1)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.clearcut.k2.E(r3, r4, r2, r14)
            goto L_0x0561
        L_0x0230:
            r16 = r4
            r3 = r7[r10]
            r4 = r11 & r15
            long r11 = (long) r4
            java.lang.Object r4 = com.google.android.gms.internal.clearcut.a3.w(r11, r1)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.clearcut.k2.K(r3, r4, r2, r14)
            goto L_0x0561
        L_0x0242:
            r16 = r4
            r3 = r7[r10]
            r4 = r11 & r15
            long r11 = (long) r4
            java.lang.Object r4 = com.google.android.gms.internal.clearcut.a3.w(r11, r1)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.clearcut.k2.H(r3, r4, r2, r14)
            goto L_0x0561
        L_0x0254:
            r16 = r4
            r3 = r7[r10]
            r4 = r11 & r15
            long r11 = (long) r4
            java.lang.Object r4 = com.google.android.gms.internal.clearcut.a3.w(r11, r1)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.clearcut.k2.y(r3, r4, r2, r14)
            goto L_0x0561
        L_0x0266:
            r16 = r4
            r3 = r7[r10]
            r4 = r11 & r15
            long r11 = (long) r4
            java.lang.Object r4 = com.google.android.gms.internal.clearcut.a3.w(r11, r1)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.clearcut.k2.C(r3, r4, r2, r14)
            goto L_0x0561
        L_0x0278:
            r16 = r4
            r3 = r7[r10]
            r4 = r11 & r15
            long r11 = (long) r4
            java.lang.Object r4 = com.google.android.gms.internal.clearcut.a3.w(r11, r1)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.clearcut.k2.t(r3, r4, r2, r14)
            goto L_0x0561
        L_0x028a:
            r16 = r4
            r3 = r7[r10]
            r4 = r11 & r15
            long r11 = (long) r4
            java.lang.Object r4 = com.google.android.gms.internal.clearcut.a3.w(r11, r1)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.clearcut.k2.o(r3, r4, r2, r14)
            goto L_0x0561
        L_0x029c:
            r16 = r4
            r3 = r7[r10]
            r4 = r11 & r15
            long r11 = (long) r4
            java.lang.Object r4 = com.google.android.gms.internal.clearcut.a3.w(r11, r1)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.clearcut.k2.j(r3, r4, r2, r14)
            goto L_0x0561
        L_0x02ae:
            r16 = r4
            r3 = r7[r10]
            r4 = r11 & r15
            long r11 = (long) r4
            java.lang.Object r4 = com.google.android.gms.internal.clearcut.a3.w(r11, r1)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.clearcut.k2.e(r3, r4, r2, r14)
            goto L_0x0561
        L_0x02c0:
            r16 = r4
            r3 = r7[r10]
            r4 = r11 & r15
            long r11 = (long) r4
            java.lang.Object r4 = com.google.android.gms.internal.clearcut.a3.w(r11, r1)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.clearcut.k2.w(r3, r4, r2, r9)
            goto L_0x0561
        L_0x02d2:
            r16 = r4
            r3 = r7[r10]
            r4 = r11 & r15
            long r11 = (long) r4
            java.lang.Object r4 = com.google.android.gms.internal.clearcut.a3.w(r11, r1)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.clearcut.k2.G(r3, r4, r2, r9)
            goto L_0x0561
        L_0x02e4:
            r16 = r4
            r3 = r7[r10]
            r4 = r11 & r15
            long r11 = (long) r4
            java.lang.Object r4 = com.google.android.gms.internal.clearcut.a3.w(r11, r1)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.clearcut.k2.A(r3, r4, r2, r9)
            goto L_0x0561
        L_0x02f6:
            r16 = r4
            r3 = r7[r10]
            r4 = r11 & r15
            long r11 = (long) r4
            java.lang.Object r4 = com.google.android.gms.internal.clearcut.a3.w(r11, r1)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.clearcut.k2.I(r3, r4, r2, r9)
            goto L_0x0561
        L_0x0308:
            r16 = r4
            r3 = r7[r10]
            r4 = r11 & r15
            long r11 = (long) r4
            java.lang.Object r4 = com.google.android.gms.internal.clearcut.a3.w(r11, r1)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.clearcut.k2.J(r3, r4, r2, r9)
            goto L_0x0561
        L_0x031a:
            r16 = r4
            r3 = r7[r10]
            r4 = r11 & r15
            long r11 = (long) r4
            java.lang.Object r4 = com.google.android.gms.internal.clearcut.a3.w(r11, r1)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.clearcut.k2.E(r3, r4, r2, r9)
            goto L_0x0561
        L_0x032c:
            r16 = r4
            r3 = r7[r10]
            r4 = r11 & r15
            long r11 = (long) r4
            java.lang.Object r4 = com.google.android.gms.internal.clearcut.a3.w(r11, r1)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.clearcut.k2.h(r3, r4, r2)
            goto L_0x0561
        L_0x033e:
            r16 = r4
            r3 = r7[r10]
            r4 = r11 & r15
            long r11 = (long) r4
            java.lang.Object r4 = com.google.android.gms.internal.clearcut.a3.w(r11, r1)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.clearcut.i2 r11 = r0.w(r10)
            com.google.android.gms.internal.clearcut.k2.d(r3, r4, r2, r11)
            goto L_0x0561
        L_0x0354:
            r16 = r4
            r3 = r7[r10]
            r4 = r11 & r15
            long r11 = (long) r4
            java.lang.Object r4 = com.google.android.gms.internal.clearcut.a3.w(r11, r1)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.clearcut.k2.c(r3, r4, r2)
            goto L_0x0561
        L_0x0366:
            r16 = r4
            r3 = r7[r10]
            r4 = r11 & r15
            long r11 = (long) r4
            java.lang.Object r4 = com.google.android.gms.internal.clearcut.a3.w(r11, r1)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.clearcut.k2.K(r3, r4, r2, r9)
            goto L_0x0561
        L_0x0378:
            r16 = r4
            r3 = r7[r10]
            r4 = r11 & r15
            long r11 = (long) r4
            java.lang.Object r4 = com.google.android.gms.internal.clearcut.a3.w(r11, r1)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.clearcut.k2.H(r3, r4, r2, r9)
            goto L_0x0561
        L_0x038a:
            r16 = r4
            r3 = r7[r10]
            r4 = r11 & r15
            long r11 = (long) r4
            java.lang.Object r4 = com.google.android.gms.internal.clearcut.a3.w(r11, r1)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.clearcut.k2.y(r3, r4, r2, r9)
            goto L_0x0561
        L_0x039c:
            r16 = r4
            r3 = r7[r10]
            r4 = r11 & r15
            long r11 = (long) r4
            java.lang.Object r4 = com.google.android.gms.internal.clearcut.a3.w(r11, r1)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.clearcut.k2.C(r3, r4, r2, r9)
            goto L_0x0561
        L_0x03ae:
            r16 = r4
            r3 = r7[r10]
            r4 = r11 & r15
            long r11 = (long) r4
            java.lang.Object r4 = com.google.android.gms.internal.clearcut.a3.w(r11, r1)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.clearcut.k2.t(r3, r4, r2, r9)
            goto L_0x0561
        L_0x03c0:
            r16 = r4
            r3 = r7[r10]
            r4 = r11 & r15
            long r11 = (long) r4
            java.lang.Object r4 = com.google.android.gms.internal.clearcut.a3.w(r11, r1)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.clearcut.k2.o(r3, r4, r2, r9)
            goto L_0x0561
        L_0x03d2:
            r16 = r4
            r3 = r7[r10]
            r4 = r11 & r15
            long r11 = (long) r4
            java.lang.Object r4 = com.google.android.gms.internal.clearcut.a3.w(r11, r1)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.clearcut.k2.j(r3, r4, r2, r9)
            goto L_0x0561
        L_0x03e4:
            r16 = r4
            r3 = r7[r10]
            r4 = r11 & r15
            long r11 = (long) r4
            java.lang.Object r4 = com.google.android.gms.internal.clearcut.a3.w(r11, r1)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.clearcut.k2.e(r3, r4, r2, r9)
            goto L_0x0561
        L_0x03f6:
            r16 = r4
            boolean r3 = r0.v(r10, r1)
            if (r3 == 0) goto L_0x0561
            r3 = r11 & r15
            long r3 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.clearcut.a3.w(r3, r1)
            com.google.android.gms.internal.clearcut.i2 r4 = r0.w(r10)
            r2.h(r12, r4, r3)
            goto L_0x0561
        L_0x040e:
            r16 = r4
            boolean r3 = r0.v(r10, r1)
            if (r3 == 0) goto L_0x0561
            r3 = r11 & r15
            long r3 = (long) r3
            long r3 = com.google.android.gms.internal.clearcut.a3.s(r3, r1)
            r2.g(r12, r3)
            goto L_0x0561
        L_0x0422:
            r16 = r4
            boolean r3 = r0.v(r10, r1)
            if (r3 == 0) goto L_0x0561
            r3 = r11 & r15
            long r3 = (long) r3
            int r3 = com.google.android.gms.internal.clearcut.a3.r(r3, r1)
            r2.m(r12, r3)
            goto L_0x0561
        L_0x0436:
            r16 = r4
            boolean r3 = r0.v(r10, r1)
            if (r3 == 0) goto L_0x0561
            r3 = r11 & r15
            long r3 = (long) r3
            long r3 = com.google.android.gms.internal.clearcut.a3.s(r3, r1)
            r2.p(r12, r3)
            goto L_0x0561
        L_0x044a:
            r16 = r4
            boolean r3 = r0.v(r10, r1)
            if (r3 == 0) goto L_0x0561
            r3 = r11 & r15
            long r3 = (long) r3
            int r3 = com.google.android.gms.internal.clearcut.a3.r(r3, r1)
            r2.q(r12, r3)
            goto L_0x0561
        L_0x045e:
            r16 = r4
            boolean r3 = r0.v(r10, r1)
            if (r3 == 0) goto L_0x0561
            r3 = r11 & r15
            long r3 = (long) r3
            int r3 = com.google.android.gms.internal.clearcut.a3.r(r3, r1)
            r2.r(r12, r3)
            goto L_0x0561
        L_0x0472:
            r16 = r4
            boolean r3 = r0.v(r10, r1)
            if (r3 == 0) goto L_0x0561
            r3 = r11 & r15
            long r3 = (long) r3
            int r3 = com.google.android.gms.internal.clearcut.a3.r(r3, r1)
            r2.l(r12, r3)
            goto L_0x0561
        L_0x0486:
            r16 = r4
            boolean r3 = r0.v(r10, r1)
            if (r3 == 0) goto L_0x0561
            r3 = r11 & r15
            long r3 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.clearcut.a3.w(r3, r1)
            com.google.android.gms.internal.clearcut.u r3 = (com.google.android.gms.internal.clearcut.u) r3
            r2.d(r12, r3)
            goto L_0x0561
        L_0x049c:
            r16 = r4
            boolean r3 = r0.v(r10, r1)
            if (r3 == 0) goto L_0x0561
            r3 = r11 & r15
            long r3 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.clearcut.a3.w(r3, r1)
            com.google.android.gms.internal.clearcut.i2 r4 = r0.w(r10)
            r2.e(r12, r4, r3)
            goto L_0x0561
        L_0x04b4:
            r16 = r4
            boolean r3 = r0.v(r10, r1)
            if (r3 == 0) goto L_0x0561
            r3 = r11 & r15
            long r3 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.clearcut.a3.w(r3, r1)
            q(r12, r3, r2)
            goto L_0x0561
        L_0x04c8:
            r16 = r4
            boolean r3 = r0.v(r10, r1)
            if (r3 == 0) goto L_0x0561
            r3 = r11 & r15
            long r3 = (long) r3
            boolean r3 = com.google.android.gms.internal.clearcut.a3.t(r3, r1)
            r2.i(r12, r3)
            goto L_0x0561
        L_0x04dc:
            r16 = r4
            boolean r3 = r0.v(r10, r1)
            if (r3 == 0) goto L_0x0561
            r3 = r11 & r15
            long r3 = (long) r3
            int r3 = com.google.android.gms.internal.clearcut.a3.r(r3, r1)
            r2.n(r12, r3)
            goto L_0x0561
        L_0x04f0:
            r16 = r4
            boolean r3 = r0.v(r10, r1)
            if (r3 == 0) goto L_0x0561
            r3 = r11 & r15
            long r3 = (long) r3
            long r3 = com.google.android.gms.internal.clearcut.a3.s(r3, r1)
            r2.k(r12, r3)
            goto L_0x0561
        L_0x0503:
            r16 = r4
            boolean r3 = r0.v(r10, r1)
            if (r3 == 0) goto L_0x0561
            r3 = r11 & r15
            long r3 = (long) r3
            int r3 = com.google.android.gms.internal.clearcut.a3.r(r3, r1)
            r2.j(r12, r3)
            goto L_0x0561
        L_0x0516:
            r16 = r4
            boolean r3 = r0.v(r10, r1)
            if (r3 == 0) goto L_0x0561
            r3 = r11 & r15
            long r3 = (long) r3
            long r3 = com.google.android.gms.internal.clearcut.a3.s(r3, r1)
            r2.c(r12, r3)
            goto L_0x0561
        L_0x0529:
            r16 = r4
            boolean r3 = r0.v(r10, r1)
            if (r3 == 0) goto L_0x0561
            r3 = r11 & r15
            long r3 = (long) r3
            long r3 = com.google.android.gms.internal.clearcut.a3.s(r3, r1)
            r2.o(r12, r3)
            goto L_0x0561
        L_0x053c:
            r16 = r4
            boolean r3 = r0.v(r10, r1)
            if (r3 == 0) goto L_0x0561
            r3 = r11 & r15
            long r3 = (long) r3
            float r3 = com.google.android.gms.internal.clearcut.a3.u(r3, r1)
            r2.b(r12, r3)
            goto L_0x0561
        L_0x054f:
            r16 = r4
            boolean r3 = r0.v(r10, r1)
            if (r3 == 0) goto L_0x0561
            r3 = r11 & r15
            long r3 = (long) r3
            double r3 = com.google.android.gms.internal.clearcut.a3.v(r3, r1)
            r2.a(r3, r12)
        L_0x0561:
            int r10 = r10 + 4
            r4 = r16
            goto L_0x002f
        L_0x0567:
            r16 = r4
        L_0x0569:
            if (r6 == 0) goto L_0x057e
            r5.c(r6)
            boolean r3 = r16.hasNext()
            if (r3 == 0) goto L_0x057c
            java.lang.Object r3 = r16.next()
            r6 = r3
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            goto L_0x0569
        L_0x057c:
            r6 = 0
            goto L_0x0569
        L_0x057e:
            com.google.android.gms.internal.clearcut.u2<?, ?> r3 = r0.f2563n
            com.google.android.gms.internal.clearcut.v2 r1 = r3.i(r1)
            r3.b(r1, r2)
            return
        L_0x0588:
            r17.E(r18, r19)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.v1.e(java.lang.Object, com.google.android.gms.internal.clearcut.y):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005c, code lost:
        if (com.google.android.gms.internal.clearcut.k2.u(com.google.android.gms.internal.clearcut.a3.w(r7, r11), com.google.android.gms.internal.clearcut.a3.w(r7, r12)) != false) goto L_0x01a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0070, code lost:
        if (com.google.android.gms.internal.clearcut.a3.s(r7, r11) == com.google.android.gms.internal.clearcut.a3.s(r7, r12)) goto L_0x01a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0082, code lost:
        if (com.google.android.gms.internal.clearcut.a3.r(r7, r11) == com.google.android.gms.internal.clearcut.a3.r(r7, r12)) goto L_0x01a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0096, code lost:
        if (com.google.android.gms.internal.clearcut.a3.s(r7, r11) == com.google.android.gms.internal.clearcut.a3.s(r7, r12)) goto L_0x01a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a8, code lost:
        if (com.google.android.gms.internal.clearcut.a3.r(r7, r11) == com.google.android.gms.internal.clearcut.a3.r(r7, r12)) goto L_0x01a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ba, code lost:
        if (com.google.android.gms.internal.clearcut.a3.r(r7, r11) == com.google.android.gms.internal.clearcut.a3.r(r7, r12)) goto L_0x01a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00cc, code lost:
        if (com.google.android.gms.internal.clearcut.a3.r(r7, r11) == com.google.android.gms.internal.clearcut.a3.r(r7, r12)) goto L_0x01a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00e2, code lost:
        if (com.google.android.gms.internal.clearcut.k2.u(com.google.android.gms.internal.clearcut.a3.w(r7, r11), com.google.android.gms.internal.clearcut.a3.w(r7, r12)) != false) goto L_0x01a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00f8, code lost:
        if (com.google.android.gms.internal.clearcut.k2.u(com.google.android.gms.internal.clearcut.a3.w(r7, r11), com.google.android.gms.internal.clearcut.a3.w(r7, r12)) != false) goto L_0x01a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x010e, code lost:
        if (com.google.android.gms.internal.clearcut.k2.u(com.google.android.gms.internal.clearcut.a3.w(r7, r11), com.google.android.gms.internal.clearcut.a3.w(r7, r12)) != false) goto L_0x01a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0120, code lost:
        if (com.google.android.gms.internal.clearcut.a3.t(r7, r11) == com.google.android.gms.internal.clearcut.a3.t(r7, r12)) goto L_0x01a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0132, code lost:
        if (com.google.android.gms.internal.clearcut.a3.r(r7, r11) == com.google.android.gms.internal.clearcut.a3.r(r7, r12)) goto L_0x01a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0146, code lost:
        if (com.google.android.gms.internal.clearcut.a3.s(r7, r11) == com.google.android.gms.internal.clearcut.a3.s(r7, r12)) goto L_0x01a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0157, code lost:
        if (com.google.android.gms.internal.clearcut.a3.r(r7, r11) == com.google.android.gms.internal.clearcut.a3.r(r7, r12)) goto L_0x01a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x016a, code lost:
        if (com.google.android.gms.internal.clearcut.a3.s(r7, r11) == com.google.android.gms.internal.clearcut.a3.s(r7, r12)) goto L_0x01a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x017d, code lost:
        if (com.google.android.gms.internal.clearcut.a3.s(r7, r11) == com.google.android.gms.internal.clearcut.a3.s(r7, r12)) goto L_0x01a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x018e, code lost:
        if (com.google.android.gms.internal.clearcut.a3.r(r7, r11) == com.google.android.gms.internal.clearcut.a3.r(r7, r12)) goto L_0x01a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01a1, code lost:
        if (com.google.android.gms.internal.clearcut.a3.s(r7, r11) == com.google.android.gms.internal.clearcut.a3.s(r7, r12)) goto L_0x01a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01a3, code lost:
        r4 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0038, code lost:
        if (com.google.android.gms.internal.clearcut.k2.u(com.google.android.gms.internal.clearcut.a3.w(r7, r11), com.google.android.gms.internal.clearcut.a3.w(r7, r12)) != false) goto L_0x01a4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean f(T r11, T r12) {
        /*
            r10 = this;
            int[] r0 = r10.f2552a
            int r1 = r0.length
            r2 = 0
            r3 = r2
        L_0x0005:
            r4 = 1
            if (r3 >= r1) goto L_0x01ab
            int r5 = r10.z(r3)
            r6 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r5 & r6
            long r7 = (long) r7
            r9 = 267386880(0xff00000, float:2.3665827E-29)
            r5 = r5 & r9
            int r5 = r5 >>> 20
            switch(r5) {
                case 0: goto L_0x0191;
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
            goto L_0x01a4
        L_0x001c:
            int r5 = r3 + 2
            r5 = r0[r5]
            r5 = r5 & r6
            long r5 = (long) r5
            int r9 = com.google.android.gms.internal.clearcut.a3.r(r5, r11)
            int r5 = com.google.android.gms.internal.clearcut.a3.r(r5, r12)
            if (r9 != r5) goto L_0x01a3
            java.lang.Object r5 = com.google.android.gms.internal.clearcut.a3.w(r7, r11)
            java.lang.Object r6 = com.google.android.gms.internal.clearcut.a3.w(r7, r12)
            boolean r5 = com.google.android.gms.internal.clearcut.k2.u(r5, r6)
            if (r5 != 0) goto L_0x01a4
            goto L_0x01a3
        L_0x003c:
            java.lang.Object r4 = com.google.android.gms.internal.clearcut.a3.w(r7, r11)
            java.lang.Object r5 = com.google.android.gms.internal.clearcut.a3.w(r7, r12)
            boolean r4 = com.google.android.gms.internal.clearcut.k2.u(r4, r5)
            goto L_0x01a4
        L_0x004a:
            boolean r5 = r10.F(r3, r11, r12)
            if (r5 == 0) goto L_0x01a3
            java.lang.Object r5 = com.google.android.gms.internal.clearcut.a3.w(r7, r11)
            java.lang.Object r6 = com.google.android.gms.internal.clearcut.a3.w(r7, r12)
            boolean r5 = com.google.android.gms.internal.clearcut.k2.u(r5, r6)
            if (r5 != 0) goto L_0x01a4
            goto L_0x01a3
        L_0x0060:
            boolean r5 = r10.F(r3, r11, r12)
            if (r5 == 0) goto L_0x01a3
            long r5 = com.google.android.gms.internal.clearcut.a3.s(r7, r11)
            long r7 = com.google.android.gms.internal.clearcut.a3.s(r7, r12)
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 == 0) goto L_0x01a4
            goto L_0x01a3
        L_0x0074:
            boolean r5 = r10.F(r3, r11, r12)
            if (r5 == 0) goto L_0x01a3
            int r5 = com.google.android.gms.internal.clearcut.a3.r(r7, r11)
            int r6 = com.google.android.gms.internal.clearcut.a3.r(r7, r12)
            if (r5 == r6) goto L_0x01a4
            goto L_0x01a3
        L_0x0086:
            boolean r5 = r10.F(r3, r11, r12)
            if (r5 == 0) goto L_0x01a3
            long r5 = com.google.android.gms.internal.clearcut.a3.s(r7, r11)
            long r7 = com.google.android.gms.internal.clearcut.a3.s(r7, r12)
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 == 0) goto L_0x01a4
            goto L_0x01a3
        L_0x009a:
            boolean r5 = r10.F(r3, r11, r12)
            if (r5 == 0) goto L_0x01a3
            int r5 = com.google.android.gms.internal.clearcut.a3.r(r7, r11)
            int r6 = com.google.android.gms.internal.clearcut.a3.r(r7, r12)
            if (r5 == r6) goto L_0x01a4
            goto L_0x01a3
        L_0x00ac:
            boolean r5 = r10.F(r3, r11, r12)
            if (r5 == 0) goto L_0x01a3
            int r5 = com.google.android.gms.internal.clearcut.a3.r(r7, r11)
            int r6 = com.google.android.gms.internal.clearcut.a3.r(r7, r12)
            if (r5 == r6) goto L_0x01a4
            goto L_0x01a3
        L_0x00be:
            boolean r5 = r10.F(r3, r11, r12)
            if (r5 == 0) goto L_0x01a3
            int r5 = com.google.android.gms.internal.clearcut.a3.r(r7, r11)
            int r6 = com.google.android.gms.internal.clearcut.a3.r(r7, r12)
            if (r5 == r6) goto L_0x01a4
            goto L_0x01a3
        L_0x00d0:
            boolean r5 = r10.F(r3, r11, r12)
            if (r5 == 0) goto L_0x01a3
            java.lang.Object r5 = com.google.android.gms.internal.clearcut.a3.w(r7, r11)
            java.lang.Object r6 = com.google.android.gms.internal.clearcut.a3.w(r7, r12)
            boolean r5 = com.google.android.gms.internal.clearcut.k2.u(r5, r6)
            if (r5 != 0) goto L_0x01a4
            goto L_0x01a3
        L_0x00e6:
            boolean r5 = r10.F(r3, r11, r12)
            if (r5 == 0) goto L_0x01a3
            java.lang.Object r5 = com.google.android.gms.internal.clearcut.a3.w(r7, r11)
            java.lang.Object r6 = com.google.android.gms.internal.clearcut.a3.w(r7, r12)
            boolean r5 = com.google.android.gms.internal.clearcut.k2.u(r5, r6)
            if (r5 != 0) goto L_0x01a4
            goto L_0x01a3
        L_0x00fc:
            boolean r5 = r10.F(r3, r11, r12)
            if (r5 == 0) goto L_0x01a3
            java.lang.Object r5 = com.google.android.gms.internal.clearcut.a3.w(r7, r11)
            java.lang.Object r6 = com.google.android.gms.internal.clearcut.a3.w(r7, r12)
            boolean r5 = com.google.android.gms.internal.clearcut.k2.u(r5, r6)
            if (r5 != 0) goto L_0x01a4
            goto L_0x01a3
        L_0x0112:
            boolean r5 = r10.F(r3, r11, r12)
            if (r5 == 0) goto L_0x01a3
            boolean r5 = com.google.android.gms.internal.clearcut.a3.t(r7, r11)
            boolean r6 = com.google.android.gms.internal.clearcut.a3.t(r7, r12)
            if (r5 == r6) goto L_0x01a4
            goto L_0x01a3
        L_0x0124:
            boolean r5 = r10.F(r3, r11, r12)
            if (r5 == 0) goto L_0x01a3
            int r5 = com.google.android.gms.internal.clearcut.a3.r(r7, r11)
            int r6 = com.google.android.gms.internal.clearcut.a3.r(r7, r12)
            if (r5 == r6) goto L_0x01a4
            goto L_0x01a3
        L_0x0136:
            boolean r5 = r10.F(r3, r11, r12)
            if (r5 == 0) goto L_0x01a3
            long r5 = com.google.android.gms.internal.clearcut.a3.s(r7, r11)
            long r7 = com.google.android.gms.internal.clearcut.a3.s(r7, r12)
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 == 0) goto L_0x01a4
            goto L_0x01a3
        L_0x0149:
            boolean r5 = r10.F(r3, r11, r12)
            if (r5 == 0) goto L_0x01a3
            int r5 = com.google.android.gms.internal.clearcut.a3.r(r7, r11)
            int r6 = com.google.android.gms.internal.clearcut.a3.r(r7, r12)
            if (r5 == r6) goto L_0x01a4
            goto L_0x01a3
        L_0x015a:
            boolean r5 = r10.F(r3, r11, r12)
            if (r5 == 0) goto L_0x01a3
            long r5 = com.google.android.gms.internal.clearcut.a3.s(r7, r11)
            long r7 = com.google.android.gms.internal.clearcut.a3.s(r7, r12)
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 == 0) goto L_0x01a4
            goto L_0x01a3
        L_0x016d:
            boolean r5 = r10.F(r3, r11, r12)
            if (r5 == 0) goto L_0x01a3
            long r5 = com.google.android.gms.internal.clearcut.a3.s(r7, r11)
            long r7 = com.google.android.gms.internal.clearcut.a3.s(r7, r12)
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 == 0) goto L_0x01a4
            goto L_0x01a3
        L_0x0180:
            boolean r5 = r10.F(r3, r11, r12)
            if (r5 == 0) goto L_0x01a3
            int r5 = com.google.android.gms.internal.clearcut.a3.r(r7, r11)
            int r6 = com.google.android.gms.internal.clearcut.a3.r(r7, r12)
            if (r5 == r6) goto L_0x01a4
            goto L_0x01a3
        L_0x0191:
            boolean r5 = r10.F(r3, r11, r12)
            if (r5 == 0) goto L_0x01a3
            long r5 = com.google.android.gms.internal.clearcut.a3.s(r7, r11)
            long r7 = com.google.android.gms.internal.clearcut.a3.s(r7, r12)
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 == 0) goto L_0x01a4
        L_0x01a3:
            r4 = r2
        L_0x01a4:
            if (r4 != 0) goto L_0x01a7
            return r2
        L_0x01a7:
            int r3 = r3 + 4
            goto L_0x0005
        L_0x01ab:
            com.google.android.gms.internal.clearcut.u2<?, ?> r0 = r10.f2563n
            com.google.android.gms.internal.clearcut.v2 r1 = r0.i(r11)
            com.google.android.gms.internal.clearcut.v2 r0 = r0.i(r12)
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x01bc
            return r2
        L_0x01bc:
            boolean r0 = r10.f2557g
            if (r0 == 0) goto L_0x01cf
            com.google.android.gms.internal.clearcut.c0<?> r0 = r10.f2564o
            com.google.android.gms.internal.clearcut.g0 r11 = r0.a(r11)
            com.google.android.gms.internal.clearcut.g0 r12 = r0.a(r12)
            boolean r11 = r11.equals(r12)
            return r11
        L_0x01cf:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.v1.f(java.lang.Object, java.lang.Object):boolean");
    }

    public final T g() {
        return this.l.a(this.f2556f);
    }

    /* JADX WARNING: Removed duplicated region for block: B:84:0x00e4 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0107 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean h(T r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 1
            int[] r3 = r0.f2559i
            if (r3 == 0) goto L_0x0121
            int r4 = r3.length
            if (r4 != 0) goto L_0x000e
            goto L_0x0121
        L_0x000e:
            int r4 = r3.length
            r5 = 0
            r6 = -1
            r7 = r5
            r8 = r7
        L_0x0013:
            if (r7 >= r4) goto L_0x010e
            r9 = r3[r7]
            int r10 = r0.A(r9)
            int r11 = r0.z(r10)
            r12 = 1048575(0xfffff, float:1.469367E-39)
            boolean r13 = r0.f2558h
            if (r13 != 0) goto L_0x0042
            int r14 = r10 + 2
            int[] r15 = r0.f2552a
            r14 = r15[r14]
            r15 = r14 & r12
            int r14 = r14 >>> 20
            int r14 = r2 << r14
            if (r15 == r6) goto L_0x003f
            sun.misc.Unsafe r6 = f2551q
            r16 = r3
            long r2 = (long) r15
            int r8 = r6.getInt(r1, r2)
            r6 = r15
            goto L_0x0045
        L_0x003f:
            r16 = r3
            goto L_0x0045
        L_0x0042:
            r16 = r3
            r14 = r5
        L_0x0045:
            r2 = 268435456(0x10000000, float:2.5243549E-29)
            r2 = r2 & r11
            if (r2 == 0) goto L_0x004c
            r2 = 1
            goto L_0x004d
        L_0x004c:
            r2 = r5
        L_0x004d:
            if (r2 == 0) goto L_0x0060
            if (r13 == 0) goto L_0x0056
            boolean r2 = r0.v(r10, r1)
            goto L_0x005d
        L_0x0056:
            r2 = r8 & r14
            if (r2 == 0) goto L_0x005c
            r2 = 1
            goto L_0x005d
        L_0x005c:
            r2 = r5
        L_0x005d:
            if (r2 != 0) goto L_0x0060
            return r5
        L_0x0060:
            r2 = 267386880(0xff00000, float:2.3665827E-29)
            r2 = r2 & r11
            int r2 = r2 >>> 20
            r3 = 9
            if (r2 == r3) goto L_0x00e5
            r3 = 17
            if (r2 == r3) goto L_0x00e5
            r3 = 27
            if (r2 == r3) goto L_0x00b8
            r3 = 60
            if (r2 == r3) goto L_0x00a0
            r3 = 68
            if (r2 == r3) goto L_0x00a0
            r3 = 49
            if (r2 == r3) goto L_0x00b8
            r3 = 50
            if (r2 == r3) goto L_0x0083
            goto L_0x0107
        L_0x0083:
            r2 = r11 & r12
            long r2 = (long) r2
            java.lang.Object r2 = com.google.android.gms.internal.clearcut.a3.w(r2, r1)
            com.google.android.gms.internal.clearcut.m1 r3 = r0.f2565p
            com.google.android.gms.internal.clearcut.l1 r2 = r3.m(r2)
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x0098
            goto L_0x0107
        L_0x0098:
            r0.x(r10)
            r3.k()
            r1 = 0
            throw r1
        L_0x00a0:
            boolean r2 = r0.u(r9, r10, r1)
            if (r2 == 0) goto L_0x0107
            com.google.android.gms.internal.clearcut.i2 r2 = r0.w(r10)
            r3 = r11 & r12
            long r9 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.clearcut.a3.w(r9, r1)
            boolean r2 = r2.h(r3)
            if (r2 != 0) goto L_0x0107
            return r5
        L_0x00b8:
            r2 = r11 & r12
            long r2 = (long) r2
            java.lang.Object r2 = com.google.android.gms.internal.clearcut.a3.w(r2, r1)
            java.util.List r2 = (java.util.List) r2
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L_0x00e1
            com.google.android.gms.internal.clearcut.i2 r3 = r0.w(r10)
            r9 = r5
        L_0x00cc:
            int r10 = r2.size()
            if (r9 >= r10) goto L_0x00e1
            java.lang.Object r10 = r2.get(r9)
            boolean r10 = r3.h(r10)
            if (r10 != 0) goto L_0x00de
            r2 = r5
            goto L_0x00e2
        L_0x00de:
            int r9 = r9 + 1
            goto L_0x00cc
        L_0x00e1:
            r2 = 1
        L_0x00e2:
            if (r2 != 0) goto L_0x0107
            return r5
        L_0x00e5:
            if (r13 == 0) goto L_0x00ec
            boolean r2 = r0.v(r10, r1)
            goto L_0x00f3
        L_0x00ec:
            r2 = r8 & r14
            if (r2 == 0) goto L_0x00f2
            r2 = 1
            goto L_0x00f3
        L_0x00f2:
            r2 = r5
        L_0x00f3:
            if (r2 == 0) goto L_0x0107
            com.google.android.gms.internal.clearcut.i2 r2 = r0.w(r10)
            r3 = r11 & r12
            long r9 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.clearcut.a3.w(r9, r1)
            boolean r2 = r2.h(r3)
            if (r2 != 0) goto L_0x0107
            return r5
        L_0x0107:
            int r7 = r7 + 1
            r3 = r16
            r2 = 1
            goto L_0x0013
        L_0x010e:
            boolean r2 = r0.f2557g
            if (r2 == 0) goto L_0x011f
            com.google.android.gms.internal.clearcut.c0<?> r2 = r0.f2564o
            com.google.android.gms.internal.clearcut.g0 r1 = r2.a(r1)
            boolean r1 = r1.b()
            if (r1 != 0) goto L_0x011f
            return r5
        L_0x011f:
            r1 = 1
            return r1
        L_0x0121:
            r1 = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.v1.h(java.lang.Object):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005e, code lost:
        r4 = com.google.android.gms.internal.clearcut.a3.w(r6, r10);
        r3 = r3 * 53;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0096, code lost:
        r3 = r3 * 53;
        r4 = H(r6, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ab, code lost:
        r3 = r3 * 53;
        r4 = I(r6, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00dd, code lost:
        if (r4 != null) goto L_0x00f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00e0, code lost:
        r3 = r3 * 53;
        r4 = com.google.android.gms.internal.clearcut.a3.w(r6, r10);
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
        r4 = ((java.lang.String) com.google.android.gms.internal.clearcut.a3.w(r6, r10)).hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x010f, code lost:
        r4 = com.google.android.gms.internal.clearcut.r0.b(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0128, code lost:
        r4 = java.lang.Float.floatToIntBits(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0133, code lost:
        r4 = java.lang.Double.doubleToLongBits(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0137, code lost:
        r4 = com.google.android.gms.internal.clearcut.r0.c(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x013b, code lost:
        r3 = r4 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x013d, code lost:
        r2 = r2 + 4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int i(T r10) {
        /*
            r9 = this;
            int[] r0 = r9.f2552a
            int r1 = r0.length
            r2 = 0
            r3 = r2
        L_0x0005:
            if (r2 >= r1) goto L_0x0141
            int r4 = r9.z(r2)
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
            java.lang.Object r4 = com.google.android.gms.internal.clearcut.a3.w(r6, r10)
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
            java.lang.Object r4 = com.google.android.gms.internal.clearcut.a3.w(r6, r10)
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
            int r4 = H(r6, r10)
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
            long r4 = I(r6, r10)
            goto L_0x0137
        L_0x00b3:
            boolean r4 = r9.u(r5, r2, r10)
            if (r4 == 0) goto L_0x013d
            int r3 = r3 * 53
            java.lang.Object r4 = com.google.android.gms.internal.clearcut.a3.w(r6, r10)
            java.lang.Float r4 = (java.lang.Float) r4
            float r4 = r4.floatValue()
            goto L_0x0128
        L_0x00c6:
            boolean r4 = r9.u(r5, r2, r10)
            if (r4 == 0) goto L_0x013d
            int r3 = r3 * 53
            java.lang.Object r4 = com.google.android.gms.internal.clearcut.a3.w(r6, r10)
            java.lang.Double r4 = (java.lang.Double) r4
            double r4 = r4.doubleValue()
            goto L_0x0133
        L_0x00d9:
            java.lang.Object r4 = com.google.android.gms.internal.clearcut.a3.w(r6, r10)
            if (r4 == 0) goto L_0x00f6
            goto L_0x00f1
        L_0x00e0:
            int r3 = r3 * 53
            java.lang.Object r4 = com.google.android.gms.internal.clearcut.a3.w(r6, r10)
        L_0x00e6:
            int r4 = r4.hashCode()
            goto L_0x013b
        L_0x00eb:
            java.lang.Object r4 = com.google.android.gms.internal.clearcut.a3.w(r6, r10)
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
            java.lang.Object r4 = com.google.android.gms.internal.clearcut.a3.w(r6, r10)
            java.lang.String r4 = (java.lang.String) r4
            int r4 = r4.hashCode()
            goto L_0x013b
        L_0x0109:
            int r3 = r3 * 53
            boolean r4 = com.google.android.gms.internal.clearcut.a3.t(r6, r10)
        L_0x010f:
            int r4 = com.google.android.gms.internal.clearcut.r0.b(r4)
            goto L_0x013b
        L_0x0114:
            int r3 = r3 * 53
            int r4 = com.google.android.gms.internal.clearcut.a3.r(r6, r10)
            goto L_0x013b
        L_0x011b:
            int r3 = r3 * 53
            long r4 = com.google.android.gms.internal.clearcut.a3.s(r6, r10)
            goto L_0x0137
        L_0x0122:
            int r3 = r3 * 53
            float r4 = com.google.android.gms.internal.clearcut.a3.u(r6, r10)
        L_0x0128:
            int r4 = java.lang.Float.floatToIntBits(r4)
            goto L_0x013b
        L_0x012d:
            int r3 = r3 * 53
            double r4 = com.google.android.gms.internal.clearcut.a3.v(r6, r10)
        L_0x0133:
            long r4 = java.lang.Double.doubleToLongBits(r4)
        L_0x0137:
            int r4 = com.google.android.gms.internal.clearcut.r0.c(r4)
        L_0x013b:
            int r4 = r4 + r3
            r3 = r4
        L_0x013d:
            int r2 = r2 + 4
            goto L_0x0005
        L_0x0141:
            int r3 = r3 * 53
            com.google.android.gms.internal.clearcut.u2<?, ?> r0 = r9.f2563n
            com.google.android.gms.internal.clearcut.v2 r0 = r0.i(r10)
            int r0 = r0.hashCode()
            int r0 = r0 + r3
            boolean r1 = r9.f2557g
            if (r1 == 0) goto L_0x015f
            int r0 = r0 * 53
            com.google.android.gms.internal.clearcut.c0<?> r1 = r9.f2564o
            com.google.android.gms.internal.clearcut.g0 r10 = r1.a(r10)
            int r10 = r10.hashCode()
            int r0 = r0 + r10
        L_0x015f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.v1.i(java.lang.Object):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00d3, code lost:
        if (r3 == null) goto L_0x00d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00d5, code lost:
        r3 = r11.f2536c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00d9, code lost:
        r3 = com.google.android.gms.internal.clearcut.r0.a(r3, r11.f2536c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x010c, code lost:
        r2 = r2 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0143, code lost:
        r3 = java.lang.Integer.valueOf(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0150, code lost:
        r3 = java.lang.Long.valueOf(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0154, code lost:
        r14.putObject(r1, r9, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0163, code lost:
        r14.putObject(r1, r9, r2);
        r2 = r4 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0173, code lost:
        r14.putObject(r1, r9, r2);
        r2 = r4 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0178, code lost:
        r14.putInt(r1, r12, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:?, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:?, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x004c, code lost:
        if (r3 == null) goto L_0x00d5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int m(T r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, int r25, long r26, int r28, com.google.android.gms.internal.clearcut.r r29) {
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
            int[] r12 = r0.f2552a
            r7 = r12[r7]
            r12 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r7 & r12
            long r12 = (long) r7
            r7 = 1
            r15 = 2
            sun.misc.Unsafe r14 = f2551q
            switch(r25) {
                case 51: goto L_0x0169;
                case 52: goto L_0x0158;
                case 53: goto L_0x0148;
                case 54: goto L_0x0148;
                case 55: goto L_0x013b;
                case 56: goto L_0x0130;
                case 57: goto L_0x0124;
                case 58: goto L_0x010f;
                case 59: goto L_0x00e1;
                case 60: goto L_0x00bb;
                case 61: goto L_0x00a5;
                case 62: goto L_0x013b;
                case 63: goto L_0x006c;
                case 64: goto L_0x0124;
                case 65: goto L_0x0130;
                case 66: goto L_0x005e;
                case 67: goto L_0x0050;
                case 68: goto L_0x0028;
                default: goto L_0x0026;
            }
        L_0x0026:
            goto L_0x017c
        L_0x0028:
            r7 = 3
            if (r5 != r7) goto L_0x017c
            r2 = r2 & -8
            r7 = r2 | 4
            com.google.android.gms.internal.clearcut.i2 r2 = r0.w(r6)
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r7
            r7 = r29
            int r2 = k(r2, r3, r4, r5, r6, r7)
            int r3 = r14.getInt(r1, r12)
            if (r3 != r8) goto L_0x004b
            java.lang.Object r3 = r14.getObject(r1, r9)
            goto L_0x004c
        L_0x004b:
            r3 = 0
        L_0x004c:
            if (r3 != 0) goto L_0x00d9
            goto L_0x00d5
        L_0x0050:
            if (r5 != 0) goto L_0x017c
            int r2 = s6.a.e0(r3, r4, r11)
            long r3 = r11.f2535b
            long r3 = s6.a.V(r3)
            goto L_0x0150
        L_0x005e:
            if (r5 != 0) goto L_0x017c
            int r2 = s6.a.S(r3, r4, r11)
            int r3 = r11.f2534a
            int r3 = s6.a.E0(r3)
            goto L_0x0143
        L_0x006c:
            if (r5 != 0) goto L_0x017c
            int r3 = s6.a.S(r3, r4, r11)
            int r4 = r11.f2534a
            com.google.android.gms.internal.clearcut.t0 r5 = r0.y(r6)
            if (r5 == 0) goto L_0x009b
            com.google.android.gms.internal.clearcut.s0 r5 = r5.j(r4)
            if (r5 == 0) goto L_0x0081
            goto L_0x009b
        L_0x0081:
            com.google.android.gms.internal.clearcut.p0 r1 = (com.google.android.gms.internal.clearcut.p0) r1
            com.google.android.gms.internal.clearcut.v2 r5 = r1.zzjp
            com.google.android.gms.internal.clearcut.v2 r6 = com.google.android.gms.internal.clearcut.v2.f2566f
            if (r5 != r6) goto L_0x0090
            com.google.android.gms.internal.clearcut.v2 r5 = new com.google.android.gms.internal.clearcut.v2
            r5.<init>()
            r1.zzjp = r5
        L_0x0090:
            long r6 = (long) r4
            java.lang.Long r1 = java.lang.Long.valueOf(r6)
            r5.c(r2, r1)
            r2 = r3
            goto L_0x017d
        L_0x009b:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r14.putObject(r1, r9, r2)
            r2 = r3
            goto L_0x0178
        L_0x00a5:
            if (r5 != r15) goto L_0x017c
            int r2 = s6.a.S(r3, r4, r11)
            int r4 = r11.f2534a
            if (r4 != 0) goto L_0x00b3
            com.google.android.gms.internal.clearcut.w r3 = com.google.android.gms.internal.clearcut.u.f2544p
            goto L_0x0154
        L_0x00b3:
            com.google.android.gms.internal.clearcut.w r3 = com.google.android.gms.internal.clearcut.u.m(r3, r2, r4)
            r14.putObject(r1, r9, r3)
            goto L_0x010c
        L_0x00bb:
            if (r5 != r15) goto L_0x017c
            com.google.android.gms.internal.clearcut.i2 r2 = r0.w(r6)
            r5 = r20
            int r2 = l(r2, r3, r4, r5, r11)
            int r3 = r14.getInt(r1, r12)
            if (r3 != r8) goto L_0x00d2
            java.lang.Object r3 = r14.getObject(r1, r9)
            goto L_0x00d3
        L_0x00d2:
            r3 = 0
        L_0x00d3:
            if (r3 != 0) goto L_0x00d9
        L_0x00d5:
            java.lang.Object r3 = r11.f2536c
            goto L_0x0154
        L_0x00d9:
            java.lang.Object r4 = r11.f2536c
            com.google.android.gms.internal.clearcut.p0 r3 = com.google.android.gms.internal.clearcut.r0.a(r3, r4)
            goto L_0x0154
        L_0x00e1:
            if (r5 != r15) goto L_0x017c
            int r2 = s6.a.S(r3, r4, r11)
            int r4 = r11.f2534a
            if (r4 != 0) goto L_0x00ee
            java.lang.String r3 = ""
            goto L_0x0154
        L_0x00ee:
            r5 = 536870912(0x20000000, float:1.0842022E-19)
            r5 = r24 & r5
            if (r5 == 0) goto L_0x0102
            int r5 = r2 + r4
            boolean r5 = com.google.android.gms.internal.clearcut.c3.c(r3, r2, r5)
            if (r5 == 0) goto L_0x00fd
            goto L_0x0102
        L_0x00fd:
            com.google.android.gms.internal.clearcut.v0 r1 = com.google.android.gms.internal.clearcut.v0.c()
            throw r1
        L_0x0102:
            java.lang.String r5 = new java.lang.String
            java.nio.charset.Charset r6 = com.google.android.gms.internal.clearcut.r0.f2537a
            r5.<init>(r3, r2, r4, r6)
            r14.putObject(r1, r9, r5)
        L_0x010c:
            int r2 = r2 + r4
            goto L_0x0178
        L_0x010f:
            if (r5 != 0) goto L_0x017c
            int r2 = s6.a.e0(r3, r4, r11)
            long r3 = r11.f2535b
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L_0x011e
            goto L_0x011f
        L_0x011e:
            r7 = 0
        L_0x011f:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r7)
            goto L_0x0154
        L_0x0124:
            r2 = 5
            if (r5 != r2) goto L_0x017c
            int r2 = s6.a.i0(r4, r3)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x0163
        L_0x0130:
            if (r5 != r7) goto L_0x017c
            long r2 = s6.a.q0(r4, r3)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            goto L_0x0173
        L_0x013b:
            if (r5 != 0) goto L_0x017c
            int r2 = s6.a.S(r3, r4, r11)
            int r3 = r11.f2534a
        L_0x0143:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x0154
        L_0x0148:
            if (r5 != 0) goto L_0x017c
            int r2 = s6.a.e0(r3, r4, r11)
            long r3 = r11.f2535b
        L_0x0150:
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
        L_0x0154:
            r14.putObject(r1, r9, r3)
            goto L_0x0178
        L_0x0158:
            r2 = 5
            if (r5 != r2) goto L_0x017c
            float r2 = s6.a.v0(r4, r3)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
        L_0x0163:
            r14.putObject(r1, r9, r2)
            int r2 = r4 + 4
            goto L_0x0178
        L_0x0169:
            if (r5 != r7) goto L_0x017c
            double r2 = s6.a.r0(r4, r3)
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
        L_0x0173:
            r14.putObject(r1, r9, r2)
            int r2 = r4 + 8
        L_0x0178:
            r14.putInt(r1, r12, r8)
            goto L_0x017d
        L_0x017c:
            r2 = r4
        L_0x017d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.v1.m(java.lang.Object, byte[], int, int, int, int, int, int, int, long, int, com.google.android.gms.internal.clearcut.r):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0232, code lost:
        if (r7.f2535b != 0) goto L_0x024d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0235, code lost:
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0236, code lost:
        r12.h(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0239, code lost:
        if (r4 >= r5) goto L_0x0381;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x023b, code lost:
        r6 = s6.a.S(r3, r4, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0241, code lost:
        if (r2 != r7.f2534a) goto L_0x0381;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0243, code lost:
        r4 = s6.a.e0(r3, r6, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x024b, code lost:
        if (r7.f2535b == 0) goto L_0x0235;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x024d, code lost:
        r6 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:?, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:?, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:?, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:?, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0136, code lost:
        if (r4 == 0) goto L_0x0153;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0139, code lost:
        r12.add(com.google.android.gms.internal.clearcut.u.m(r3, r1, r4));
        r1 = r1 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0141, code lost:
        if (r1 >= r5) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0143, code lost:
        r4 = s6.a.S(r3, r1, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0149, code lost:
        if (r2 != r7.f2534a) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x014b, code lost:
        r1 = s6.a.S(r3, r4, r7);
        r4 = r7.f2534a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0151, code lost:
        if (r4 != 0) goto L_0x0139;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0153, code lost:
        r12.add(com.google.android.gms.internal.clearcut.u.f2544p);
     */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0196  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01d0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int n(T r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, long r25, int r27, long r28, com.google.android.gms.internal.clearcut.r r30) {
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
            sun.misc.Unsafe r11 = f2551q
            java.lang.Object r12 = r11.getObject(r1, r9)
            com.google.android.gms.internal.clearcut.u0 r12 = (com.google.android.gms.internal.clearcut.u0) r12
            boolean r13 = r12.l()
            r14 = 1
            if (r13 != 0) goto L_0x0034
            int r13 = r12.size()
            if (r13 != 0) goto L_0x002c
            r13 = 10
            goto L_0x002d
        L_0x002c:
            int r13 = r13 << r14
        L_0x002d:
            com.google.android.gms.internal.clearcut.u0 r12 = r12.r(r13)
            r11.putObject(r1, r9, r12)
        L_0x0034:
            r9 = 0
            r11 = 5
            r13 = 2
            switch(r27) {
                case 18: goto L_0x0349;
                case 19: goto L_0x0312;
                case 20: goto L_0x02da;
                case 21: goto L_0x02da;
                case 22: goto L_0x02c0;
                case 23: goto L_0x0287;
                case 24: goto L_0x024f;
                case 25: goto L_0x01fe;
                case 26: goto L_0x0173;
                case 27: goto L_0x0159;
                case 28: goto L_0x012e;
                case 29: goto L_0x02c0;
                case 30: goto L_0x00f8;
                case 31: goto L_0x024f;
                case 32: goto L_0x0287;
                case 33: goto L_0x00b8;
                case 34: goto L_0x0078;
                case 35: goto L_0x0349;
                case 36: goto L_0x0312;
                case 37: goto L_0x02da;
                case 38: goto L_0x02da;
                case 39: goto L_0x02c0;
                case 40: goto L_0x0287;
                case 41: goto L_0x024f;
                case 42: goto L_0x01fe;
                case 43: goto L_0x02c0;
                case 44: goto L_0x00f8;
                case 45: goto L_0x024f;
                case 46: goto L_0x0287;
                case 47: goto L_0x00b8;
                case 48: goto L_0x0078;
                case 49: goto L_0x003d;
                default: goto L_0x003b;
            }
        L_0x003b:
            goto L_0x0381
        L_0x003d:
            r1 = 3
            if (r6 != r1) goto L_0x0381
            com.google.android.gms.internal.clearcut.i2 r1 = r0.w(r8)
            r6 = r2 & -8
            r6 = r6 | 4
            r22 = r1
            r23 = r18
            r24 = r19
            r25 = r20
            r26 = r6
            r27 = r30
            int r4 = k(r22, r23, r24, r25, r26, r27)
        L_0x0058:
            java.lang.Object r8 = r7.f2536c
            r12.add(r8)
            if (r4 >= r5) goto L_0x0381
            int r8 = s6.a.S(r3, r4, r7)
            int r9 = r7.f2534a
            if (r2 != r9) goto L_0x0381
            r22 = r1
            r23 = r18
            r24 = r8
            r25 = r20
            r26 = r6
            r27 = r30
            int r4 = k(r22, r23, r24, r25, r26, r27)
            goto L_0x0058
        L_0x0078:
            if (r6 != r13) goto L_0x009c
            com.google.android.gms.internal.clearcut.h1 r12 = (com.google.android.gms.internal.clearcut.h1) r12
            int r1 = s6.a.S(r3, r4, r7)
            int r2 = r7.f2534a
            int r2 = r2 + r1
        L_0x0083:
            if (r1 >= r2) goto L_0x0093
            int r1 = s6.a.e0(r3, r1, r7)
            long r4 = r7.f2535b
            long r4 = s6.a.V(r4)
            r12.m(r4)
            goto L_0x0083
        L_0x0093:
            if (r1 != r2) goto L_0x0097
            goto L_0x0382
        L_0x0097:
            com.google.android.gms.internal.clearcut.v0 r1 = com.google.android.gms.internal.clearcut.v0.a()
            throw r1
        L_0x009c:
            if (r6 != 0) goto L_0x0381
            com.google.android.gms.internal.clearcut.h1 r12 = (com.google.android.gms.internal.clearcut.h1) r12
        L_0x00a0:
            int r1 = s6.a.e0(r3, r4, r7)
            long r8 = r7.f2535b
            long r8 = s6.a.V(r8)
            r12.m(r8)
            if (r1 >= r5) goto L_0x0382
            int r4 = s6.a.S(r3, r1, r7)
            int r6 = r7.f2534a
            if (r2 != r6) goto L_0x0382
            goto L_0x00a0
        L_0x00b8:
            if (r6 != r13) goto L_0x00dc
            com.google.android.gms.internal.clearcut.q0 r12 = (com.google.android.gms.internal.clearcut.q0) r12
            int r1 = s6.a.S(r3, r4, r7)
            int r2 = r7.f2534a
            int r2 = r2 + r1
        L_0x00c3:
            if (r1 >= r2) goto L_0x00d3
            int r1 = s6.a.S(r3, r1, r7)
            int r4 = r7.f2534a
            int r4 = s6.a.E0(r4)
            r12.h(r4)
            goto L_0x00c3
        L_0x00d3:
            if (r1 != r2) goto L_0x00d7
            goto L_0x0382
        L_0x00d7:
            com.google.android.gms.internal.clearcut.v0 r1 = com.google.android.gms.internal.clearcut.v0.a()
            throw r1
        L_0x00dc:
            if (r6 != 0) goto L_0x0381
            com.google.android.gms.internal.clearcut.q0 r12 = (com.google.android.gms.internal.clearcut.q0) r12
        L_0x00e0:
            int r1 = s6.a.S(r3, r4, r7)
            int r4 = r7.f2534a
            int r4 = s6.a.E0(r4)
            r12.h(r4)
            if (r1 >= r5) goto L_0x0382
            int r4 = s6.a.S(r3, r1, r7)
            int r6 = r7.f2534a
            if (r2 != r6) goto L_0x0382
            goto L_0x00e0
        L_0x00f8:
            if (r6 != r13) goto L_0x00ff
            int r2 = s6.a.T(r3, r4, r12, r7)
            goto L_0x0110
        L_0x00ff:
            if (r6 != 0) goto L_0x0381
            r2 = r21
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r12
            r7 = r30
            int r2 = s6.a.P(r2, r3, r4, r5, r6, r7)
        L_0x0110:
            com.google.android.gms.internal.clearcut.p0 r1 = (com.google.android.gms.internal.clearcut.p0) r1
            com.google.android.gms.internal.clearcut.v2 r3 = r1.zzjp
            com.google.android.gms.internal.clearcut.v2 r4 = com.google.android.gms.internal.clearcut.v2.f2566f
            if (r3 != r4) goto L_0x0119
            r3 = 0
        L_0x0119:
            com.google.android.gms.internal.clearcut.t0 r4 = r0.y(r8)
            com.google.android.gms.internal.clearcut.u2<?, ?> r5 = r0.f2563n
            r6 = r22
            java.lang.Object r3 = com.google.android.gms.internal.clearcut.k2.b(r6, r12, r4, r3, r5)
            com.google.android.gms.internal.clearcut.v2 r3 = (com.google.android.gms.internal.clearcut.v2) r3
            if (r3 == 0) goto L_0x012b
            r1.zzjp = r3
        L_0x012b:
            r1 = r2
            goto L_0x0382
        L_0x012e:
            if (r6 != r13) goto L_0x0381
            int r1 = s6.a.S(r3, r4, r7)
            int r4 = r7.f2534a
            if (r4 != 0) goto L_0x0139
            goto L_0x0153
        L_0x0139:
            com.google.android.gms.internal.clearcut.w r6 = com.google.android.gms.internal.clearcut.u.m(r3, r1, r4)
            r12.add(r6)
            int r1 = r1 + r4
        L_0x0141:
            if (r1 >= r5) goto L_0x0382
            int r4 = s6.a.S(r3, r1, r7)
            int r6 = r7.f2534a
            if (r2 != r6) goto L_0x0382
            int r1 = s6.a.S(r3, r4, r7)
            int r4 = r7.f2534a
            if (r4 != 0) goto L_0x0139
        L_0x0153:
            com.google.android.gms.internal.clearcut.w r4 = com.google.android.gms.internal.clearcut.u.f2544p
            r12.add(r4)
            goto L_0x0141
        L_0x0159:
            if (r6 != r13) goto L_0x0381
            com.google.android.gms.internal.clearcut.i2 r1 = r0.w(r8)
            r22 = r1
            r23 = r21
            r24 = r18
            r25 = r19
            r26 = r20
            r27 = r12
            r28 = r30
            int r1 = j(r22, r23, r24, r25, r26, r27, r28)
            goto L_0x0382
        L_0x0173:
            if (r6 != r13) goto L_0x0381
            r13 = 536870912(0x20000000, double:2.652494739E-315)
            long r13 = r25 & r13
            int r1 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            java.lang.String r6 = ""
            if (r1 != 0) goto L_0x01b2
            int r1 = s6.a.S(r3, r4, r7)
            int r4 = r7.f2534a
            if (r4 != 0) goto L_0x0189
            goto L_0x01a6
        L_0x0189:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = com.google.android.gms.internal.clearcut.r0.f2537a
            r8.<init>(r3, r1, r4, r9)
        L_0x0190:
            r12.add(r8)
            int r1 = r1 + r4
        L_0x0194:
            if (r1 >= r5) goto L_0x0382
            int r4 = s6.a.S(r3, r1, r7)
            int r8 = r7.f2534a
            if (r2 != r8) goto L_0x0382
            int r1 = s6.a.S(r3, r4, r7)
            int r4 = r7.f2534a
            if (r4 != 0) goto L_0x01aa
        L_0x01a6:
            r12.add(r6)
            goto L_0x0194
        L_0x01aa:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = com.google.android.gms.internal.clearcut.r0.f2537a
            r8.<init>(r3, r1, r4, r9)
            goto L_0x0190
        L_0x01b2:
            int r1 = s6.a.S(r3, r4, r7)
            int r4 = r7.f2534a
            if (r4 != 0) goto L_0x01bb
            goto L_0x01e0
        L_0x01bb:
            int r8 = r1 + r4
            boolean r9 = com.google.android.gms.internal.clearcut.c3.c(r3, r1, r8)
            if (r9 == 0) goto L_0x01f9
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = com.google.android.gms.internal.clearcut.r0.f2537a
            r9.<init>(r3, r1, r4, r10)
        L_0x01ca:
            r12.add(r9)
            r1 = r8
        L_0x01ce:
            if (r1 >= r5) goto L_0x0382
            int r4 = s6.a.S(r3, r1, r7)
            int r8 = r7.f2534a
            if (r2 != r8) goto L_0x0382
            int r1 = s6.a.S(r3, r4, r7)
            int r4 = r7.f2534a
            if (r4 != 0) goto L_0x01e4
        L_0x01e0:
            r12.add(r6)
            goto L_0x01ce
        L_0x01e4:
            int r8 = r1 + r4
            boolean r9 = com.google.android.gms.internal.clearcut.c3.c(r3, r1, r8)
            if (r9 == 0) goto L_0x01f4
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = com.google.android.gms.internal.clearcut.r0.f2537a
            r9.<init>(r3, r1, r4, r10)
            goto L_0x01ca
        L_0x01f4:
            com.google.android.gms.internal.clearcut.v0 r1 = com.google.android.gms.internal.clearcut.v0.c()
            throw r1
        L_0x01f9:
            com.google.android.gms.internal.clearcut.v0 r1 = com.google.android.gms.internal.clearcut.v0.c()
            throw r1
        L_0x01fe:
            r1 = 0
            if (r6 != r13) goto L_0x0226
            com.google.android.gms.internal.clearcut.s r12 = (com.google.android.gms.internal.clearcut.s) r12
            int r2 = s6.a.S(r3, r4, r7)
            int r4 = r7.f2534a
            int r4 = r4 + r2
        L_0x020a:
            if (r2 >= r4) goto L_0x021d
            int r2 = s6.a.e0(r3, r2, r7)
            long r5 = r7.f2535b
            int r5 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r5 == 0) goto L_0x0218
            r5 = r14
            goto L_0x0219
        L_0x0218:
            r5 = r1
        L_0x0219:
            r12.h(r5)
            goto L_0x020a
        L_0x021d:
            if (r2 != r4) goto L_0x0221
            goto L_0x012b
        L_0x0221:
            com.google.android.gms.internal.clearcut.v0 r1 = com.google.android.gms.internal.clearcut.v0.a()
            throw r1
        L_0x0226:
            if (r6 != 0) goto L_0x0381
            com.google.android.gms.internal.clearcut.s r12 = (com.google.android.gms.internal.clearcut.s) r12
            int r4 = s6.a.e0(r3, r4, r7)
            long r14 = r7.f2535b
            int r6 = (r14 > r9 ? 1 : (r14 == r9 ? 0 : -1))
            if (r6 == 0) goto L_0x0235
            goto L_0x024d
        L_0x0235:
            r6 = r1
        L_0x0236:
            r12.h(r6)
            if (r4 >= r5) goto L_0x0381
            int r6 = s6.a.S(r3, r4, r7)
            int r11 = r7.f2534a
            if (r2 != r11) goto L_0x0381
            int r4 = s6.a.e0(r3, r6, r7)
            long r13 = r7.f2535b
            int r6 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r6 == 0) goto L_0x0235
        L_0x024d:
            r6 = 1
            goto L_0x0236
        L_0x024f:
            if (r6 != r13) goto L_0x026f
            com.google.android.gms.internal.clearcut.q0 r12 = (com.google.android.gms.internal.clearcut.q0) r12
            int r1 = s6.a.S(r3, r4, r7)
            int r2 = r7.f2534a
            int r2 = r2 + r1
        L_0x025a:
            if (r1 >= r2) goto L_0x0266
            int r4 = s6.a.i0(r1, r3)
            r12.h(r4)
            int r1 = r1 + 4
            goto L_0x025a
        L_0x0266:
            if (r1 != r2) goto L_0x026a
            goto L_0x0382
        L_0x026a:
            com.google.android.gms.internal.clearcut.v0 r1 = com.google.android.gms.internal.clearcut.v0.a()
            throw r1
        L_0x026f:
            if (r6 != r11) goto L_0x0381
            com.google.android.gms.internal.clearcut.q0 r12 = (com.google.android.gms.internal.clearcut.q0) r12
        L_0x0273:
            int r1 = s6.a.i0(r4, r3)
            r12.h(r1)
            int r1 = r4 + 4
            if (r1 >= r5) goto L_0x0382
            int r4 = s6.a.S(r3, r1, r7)
            int r6 = r7.f2534a
            if (r2 != r6) goto L_0x0382
            goto L_0x0273
        L_0x0287:
            if (r6 != r13) goto L_0x02a7
            com.google.android.gms.internal.clearcut.h1 r12 = (com.google.android.gms.internal.clearcut.h1) r12
            int r1 = s6.a.S(r3, r4, r7)
            int r2 = r7.f2534a
            int r2 = r2 + r1
        L_0x0292:
            if (r1 >= r2) goto L_0x029e
            long r4 = s6.a.q0(r1, r3)
            r12.m(r4)
            int r1 = r1 + 8
            goto L_0x0292
        L_0x029e:
            if (r1 != r2) goto L_0x02a2
            goto L_0x0382
        L_0x02a2:
            com.google.android.gms.internal.clearcut.v0 r1 = com.google.android.gms.internal.clearcut.v0.a()
            throw r1
        L_0x02a7:
            r1 = 1
            if (r6 != r1) goto L_0x0381
            com.google.android.gms.internal.clearcut.h1 r12 = (com.google.android.gms.internal.clearcut.h1) r12
        L_0x02ac:
            long r8 = s6.a.q0(r4, r3)
            r12.m(r8)
            int r1 = r4 + 8
            if (r1 >= r5) goto L_0x0382
            int r4 = s6.a.S(r3, r1, r7)
            int r6 = r7.f2534a
            if (r2 != r6) goto L_0x0382
            goto L_0x02ac
        L_0x02c0:
            if (r6 != r13) goto L_0x02c8
            int r1 = s6.a.T(r3, r4, r12, r7)
            goto L_0x0382
        L_0x02c8:
            if (r6 != 0) goto L_0x0381
            r22 = r18
            r23 = r19
            r24 = r20
            r25 = r12
            r26 = r30
            int r1 = s6.a.P(r21, r22, r23, r24, r25, r26)
            goto L_0x0382
        L_0x02da:
            if (r6 != r13) goto L_0x02fa
            com.google.android.gms.internal.clearcut.h1 r12 = (com.google.android.gms.internal.clearcut.h1) r12
            int r1 = s6.a.S(r3, r4, r7)
            int r2 = r7.f2534a
            int r2 = r2 + r1
        L_0x02e5:
            if (r1 >= r2) goto L_0x02f1
            int r1 = s6.a.e0(r3, r1, r7)
            long r4 = r7.f2535b
            r12.m(r4)
            goto L_0x02e5
        L_0x02f1:
            if (r1 != r2) goto L_0x02f5
            goto L_0x0382
        L_0x02f5:
            com.google.android.gms.internal.clearcut.v0 r1 = com.google.android.gms.internal.clearcut.v0.a()
            throw r1
        L_0x02fa:
            if (r6 != 0) goto L_0x0381
            com.google.android.gms.internal.clearcut.h1 r12 = (com.google.android.gms.internal.clearcut.h1) r12
        L_0x02fe:
            int r1 = s6.a.e0(r3, r4, r7)
            long r8 = r7.f2535b
            r12.m(r8)
            if (r1 >= r5) goto L_0x0382
            int r4 = s6.a.S(r3, r1, r7)
            int r6 = r7.f2534a
            if (r2 != r6) goto L_0x0382
            goto L_0x02fe
        L_0x0312:
            if (r6 != r13) goto L_0x0331
            com.google.android.gms.internal.clearcut.n0 r12 = (com.google.android.gms.internal.clearcut.n0) r12
            int r1 = s6.a.S(r3, r4, r7)
            int r2 = r7.f2534a
            int r2 = r2 + r1
        L_0x031d:
            if (r1 >= r2) goto L_0x0329
            float r4 = s6.a.v0(r1, r3)
            r12.h(r4)
            int r1 = r1 + 4
            goto L_0x031d
        L_0x0329:
            if (r1 != r2) goto L_0x032c
            goto L_0x0382
        L_0x032c:
            com.google.android.gms.internal.clearcut.v0 r1 = com.google.android.gms.internal.clearcut.v0.a()
            throw r1
        L_0x0331:
            if (r6 != r11) goto L_0x0381
            com.google.android.gms.internal.clearcut.n0 r12 = (com.google.android.gms.internal.clearcut.n0) r12
        L_0x0335:
            float r1 = s6.a.v0(r4, r3)
            r12.h(r1)
            int r1 = r4 + 4
            if (r1 >= r5) goto L_0x0382
            int r4 = s6.a.S(r3, r1, r7)
            int r6 = r7.f2534a
            if (r2 != r6) goto L_0x0382
            goto L_0x0335
        L_0x0349:
            if (r6 != r13) goto L_0x0368
            com.google.android.gms.internal.clearcut.z r12 = (com.google.android.gms.internal.clearcut.z) r12
            int r1 = s6.a.S(r3, r4, r7)
            int r2 = r7.f2534a
            int r2 = r2 + r1
        L_0x0354:
            if (r1 >= r2) goto L_0x0360
            double r4 = s6.a.r0(r1, r3)
            r12.h(r4)
            int r1 = r1 + 8
            goto L_0x0354
        L_0x0360:
            if (r1 != r2) goto L_0x0363
            goto L_0x0382
        L_0x0363:
            com.google.android.gms.internal.clearcut.v0 r1 = com.google.android.gms.internal.clearcut.v0.a()
            throw r1
        L_0x0368:
            r1 = 1
            if (r6 != r1) goto L_0x0381
            com.google.android.gms.internal.clearcut.z r12 = (com.google.android.gms.internal.clearcut.z) r12
        L_0x036d:
            double r8 = s6.a.r0(r4, r3)
            r12.h(r8)
            int r1 = r4 + 8
            if (r1 >= r5) goto L_0x0382
            int r4 = s6.a.S(r3, r1, r7)
            int r6 = r7.f2534a
            if (r2 != r6) goto L_0x0382
            goto L_0x036d
        L_0x0381:
            r1 = r4
        L_0x0382:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.v1.n(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.google.android.gms.internal.clearcut.r):int");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v44, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v36, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v37, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v38, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v39, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v24, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x031f, code lost:
        if (r0 == r24) goto L_0x0376;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0374, code lost:
        if (r0 == r14) goto L_0x0376;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x037a, code lost:
        r1 = r38;
        r9 = r20;
        r7 = r28;
        r8 = r29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x007c, code lost:
        r10 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x007e, code lost:
        r19 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00f9, code lost:
        r6 = r37;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0150, code lost:
        r1 = r8 | r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0152, code lost:
        r6 = r37;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x016f, code lost:
        r1 = r11.f2536c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x017d, code lost:
        r6 = r37;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x019e, code lost:
        r9.putObject(r14, r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01fd, code lost:
        r0 = r2;
        r8 = r8 | r23;
        r1 = r38;
        r2 = r12;
        r12 = r13;
        r10 = -1;
        r13 = r6;
        r6 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0243, code lost:
        r6 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0276, code lost:
        r1 = r8 | r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0278, code lost:
        r8 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x027a, code lost:
        r6 = r38;
        r30 = r9;
        r21 = r10;
        r9 = r12;
        r15 = r14;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x03ac  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int o(T r34, byte[] r35, int r36, int r37, int r38, com.google.android.gms.internal.clearcut.r r39) {
        /*
            r33 = this;
            r15 = r33
            r14 = r34
            r12 = r35
            r13 = r37
            r11 = r39
            sun.misc.Unsafe r9 = f2551q
            r10 = -1
            r16 = 0
            r0 = r36
            r1 = r38
            r7 = r10
            r6 = r11
            r2 = r16
            r8 = r2
        L_0x0018:
            r17 = 0
            int[] r5 = r15.f2552a
            r18 = 1048575(0xfffff, float:1.469367E-39)
            if (r0 >= r13) goto L_0x03d0
            int r2 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x0030
            int r0 = s6.a.R(r0, r12, r2, r6)
            int r2 = r6.f2534a
            r4 = r2
            r2 = r0
            goto L_0x0031
        L_0x0030:
            r4 = r0
        L_0x0031:
            int r3 = r4 >>> 3
            r0 = r4 & 7
            r36 = r6
            int r6 = r15.A(r3)
            r19 = r4
            com.google.android.gms.internal.clearcut.v2 r4 = com.google.android.gms.internal.clearcut.v2.f2566f
            if (r6 == r10) goto L_0x0383
            int r1 = r6 + 1
            r1 = r5[r1]
            r20 = 267386880(0xff00000, float:2.3665827E-29)
            r20 = r1 & r20
            int r10 = r20 >>> 20
            r13 = r1 & r18
            long r12 = (long) r13
            r20 = r1
            r1 = 17
            r22 = r4
            if (r10 > r1) goto L_0x0284
            int r1 = r6 + 2
            r1 = r5[r1]
            int r23 = r1 >>> 20
            r4 = 1
            int r23 = r4 << r23
            r1 = r1 & r18
            r24 = r12
            if (r1 == r7) goto L_0x0072
            r12 = -1
            if (r7 == r12) goto L_0x006c
            long r12 = (long) r7
            r9.putInt(r14, r12, r8)
        L_0x006c:
            long r7 = (long) r1
            int r8 = r9.getInt(r14, r7)
            r7 = r1
        L_0x0072:
            r1 = 5
            switch(r10) {
                case 0: goto L_0x025e;
                case 1: goto L_0x0246;
                case 2: goto L_0x0221;
                case 3: goto L_0x0221;
                case 4: goto L_0x0209;
                case 5: goto L_0x01de;
                case 6: goto L_0x01c6;
                case 7: goto L_0x01a3;
                case 8: goto L_0x0181;
                case 9: goto L_0x0156;
                case 10: goto L_0x013c;
                case 11: goto L_0x0209;
                case 12: goto L_0x00fc;
                case 13: goto L_0x01c6;
                case 14: goto L_0x01de;
                case 15: goto L_0x00e3;
                case 16: goto L_0x00c3;
                case 17: goto L_0x0082;
                default: goto L_0x0076;
            }
        L_0x0076:
            r13 = r35
            r6 = r37
            r12 = r19
        L_0x007c:
            r10 = r22
        L_0x007e:
            r19 = r5
            goto L_0x027a
        L_0x0082:
            r1 = 3
            if (r0 != r1) goto L_0x00b7
            int r0 = r3 << 3
            r4 = r0 | 4
            com.google.android.gms.internal.clearcut.i2 r0 = r15.w(r6)
            r1 = r35
            r3 = r37
            r12 = r19
            r5 = r39
            int r0 = k(r0, r1, r2, r3, r4, r5)
            r1 = r8 & r23
            if (r1 != 0) goto L_0x00a2
            java.lang.Object r1 = r11.f2536c
            r3 = r24
            goto L_0x00ae
        L_0x00a2:
            r3 = r24
            java.lang.Object r1 = r9.getObject(r14, r3)
            java.lang.Object r2 = r11.f2536c
            com.google.android.gms.internal.clearcut.p0 r1 = com.google.android.gms.internal.clearcut.r0.a(r1, r2)
        L_0x00ae:
            r9.putObject(r14, r3, r1)
            r1 = r8 | r23
            r13 = r35
            goto L_0x0152
        L_0x00b7:
            r12 = r19
            r13 = r35
            r6 = r37
            r19 = r5
            r10 = r22
            goto L_0x027a
        L_0x00c3:
            r12 = r19
            r3 = r24
            r13 = r35
            if (r0 != 0) goto L_0x00f9
            int r6 = s6.a.e0(r13, r2, r11)
            long r0 = r11.f2535b
            long r17 = s6.a.V(r0)
            r0 = r9
            r1 = r34
            r2 = r3
            r4 = r17
            r0.putLong(r1, r2, r4)
            r8 = r8 | r23
            r0 = r6
            goto L_0x0243
        L_0x00e3:
            r13 = r35
            r12 = r19
            r3 = r24
            if (r0 != 0) goto L_0x00f9
            int r0 = s6.a.S(r13, r2, r11)
            int r1 = r11.f2534a
            int r1 = s6.a.E0(r1)
            r9.putInt(r14, r3, r1)
            goto L_0x0150
        L_0x00f9:
            r6 = r37
            goto L_0x007c
        L_0x00fc:
            r13 = r35
            r12 = r19
            r3 = r24
            if (r0 != 0) goto L_0x0139
            int r0 = s6.a.S(r13, r2, r11)
            int r1 = r11.f2534a
            com.google.android.gms.internal.clearcut.t0 r2 = r15.y(r6)
            if (r2 == 0) goto L_0x0130
            com.google.android.gms.internal.clearcut.s0 r2 = r2.j(r1)
            if (r2 == 0) goto L_0x0117
            goto L_0x0130
        L_0x0117:
            r2 = r14
            com.google.android.gms.internal.clearcut.p0 r2 = (com.google.android.gms.internal.clearcut.p0) r2
            com.google.android.gms.internal.clearcut.v2 r3 = r2.zzjp
            r10 = r22
            if (r3 != r10) goto L_0x0127
            com.google.android.gms.internal.clearcut.v2 r3 = new com.google.android.gms.internal.clearcut.v2
            r3.<init>()
            r2.zzjp = r3
        L_0x0127:
            long r1 = (long) r1
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r3.c(r12, r1)
            goto L_0x0135
        L_0x0130:
            r9.putInt(r14, r3, r1)
            r8 = r8 | r23
        L_0x0135:
            r6 = r37
            goto L_0x0243
        L_0x0139:
            r10 = r22
            goto L_0x017d
        L_0x013c:
            r13 = r35
            r12 = r19
            r10 = r22
            r3 = r24
            r1 = 2
            if (r0 != r1) goto L_0x017d
            int r0 = s6.a.t0(r13, r2, r11)
            java.lang.Object r1 = r11.f2536c
            r9.putObject(r14, r3, r1)
        L_0x0150:
            r1 = r8 | r23
        L_0x0152:
            r6 = r37
            goto L_0x0278
        L_0x0156:
            r13 = r35
            r12 = r19
            r10 = r22
            r3 = r24
            r1 = 2
            if (r0 != r1) goto L_0x017d
            com.google.android.gms.internal.clearcut.i2 r0 = r15.w(r6)
            r6 = r37
            int r0 = l(r0, r13, r2, r6, r11)
            r1 = r8 & r23
            if (r1 != 0) goto L_0x0172
        L_0x016f:
            java.lang.Object r1 = r11.f2536c
            goto L_0x019e
        L_0x0172:
            java.lang.Object r1 = r9.getObject(r14, r3)
            java.lang.Object r2 = r11.f2536c
            com.google.android.gms.internal.clearcut.p0 r1 = com.google.android.gms.internal.clearcut.r0.a(r1, r2)
            goto L_0x019e
        L_0x017d:
            r6 = r37
            goto L_0x007e
        L_0x0181:
            r13 = r35
            r6 = r37
            r12 = r19
            r10 = r22
            r3 = r24
            r1 = 2
            if (r0 != r1) goto L_0x007e
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r20 & r0
            if (r0 != 0) goto L_0x0199
            int r0 = s6.a.j0(r13, r2, r11)
            goto L_0x016f
        L_0x0199:
            int r0 = s6.a.p0(r13, r2, r11)
            goto L_0x016f
        L_0x019e:
            r9.putObject(r14, r3, r1)
            goto L_0x0276
        L_0x01a3:
            r13 = r35
            r6 = r37
            r12 = r19
            r10 = r22
            r19 = r5
            r4 = r24
            if (r0 != 0) goto L_0x027a
            int r0 = s6.a.e0(r13, r2, r11)
            long r1 = r11.f2535b
            r17 = 0
            int r1 = (r1 > r17 ? 1 : (r1 == r17 ? 0 : -1))
            if (r1 == 0) goto L_0x01bf
            r1 = 1
            goto L_0x01c1
        L_0x01bf:
            r1 = r16
        L_0x01c1:
            com.google.android.gms.internal.clearcut.a3.g(r14, r4, r1)
            goto L_0x0276
        L_0x01c6:
            r13 = r35
            r6 = r37
            r12 = r19
            r10 = r22
            r19 = r5
            r4 = r24
            if (r0 != r1) goto L_0x027a
            int r0 = s6.a.i0(r2, r13)
            r9.putInt(r14, r4, r0)
            int r2 = r2 + 4
            goto L_0x01fd
        L_0x01de:
            r13 = r35
            r6 = r37
            r1 = r4
            r12 = r19
            r10 = r22
            r19 = r5
            r4 = r24
            if (r0 != r1) goto L_0x027a
            long r17 = s6.a.q0(r2, r13)
            r0 = r9
            r1 = r34
            r10 = r2
            r2 = r4
            r4 = r17
            r0.putLong(r1, r2, r4)
            int r2 = r10 + 8
        L_0x01fd:
            r0 = r2
            r8 = r8 | r23
            r1 = r38
            r2 = r12
            r12 = r13
            r10 = -1
            r13 = r6
            r6 = r11
            goto L_0x0018
        L_0x0209:
            r13 = r35
            r6 = r37
            r12 = r19
            r10 = r22
            r19 = r5
            r4 = r24
            if (r0 != 0) goto L_0x027a
            int r0 = s6.a.S(r13, r2, r11)
            int r1 = r11.f2534a
            r9.putInt(r14, r4, r1)
            goto L_0x0276
        L_0x0221:
            r13 = r35
            r6 = r37
            r12 = r19
            r10 = r22
            r19 = r5
            r4 = r24
            if (r0 != 0) goto L_0x027a
            int r10 = s6.a.e0(r13, r2, r11)
            long r2 = r11.f2535b
            r0 = r9
            r1 = r34
            r17 = r2
            r2 = r4
            r4 = r17
            r0.putLong(r1, r2, r4)
            r8 = r8 | r23
            r0 = r10
        L_0x0243:
            r6 = r11
            goto L_0x02c7
        L_0x0246:
            r13 = r35
            r6 = r37
            r12 = r19
            r10 = r22
            r19 = r5
            r4 = r24
            if (r0 != r1) goto L_0x027a
            float r0 = s6.a.v0(r2, r13)
            com.google.android.gms.internal.clearcut.a3.e(r14, r4, r0)
            int r0 = r2 + 4
            goto L_0x0276
        L_0x025e:
            r13 = r35
            r6 = r37
            r1 = r4
            r12 = r19
            r10 = r22
            r19 = r5
            r4 = r24
            if (r0 != r1) goto L_0x027a
            double r0 = s6.a.r0(r2, r13)
            com.google.android.gms.internal.clearcut.a3.d(r14, r4, r0)
            int r0 = r2 + 8
        L_0x0276:
            r1 = r8 | r23
        L_0x0278:
            r8 = r1
            goto L_0x0243
        L_0x027a:
            r6 = r38
            r30 = r9
            r21 = r10
            r9 = r12
            r15 = r14
            goto L_0x0399
        L_0x0284:
            r31 = r12
            r13 = r35
            r12 = r19
            r19 = r5
            r4 = r31
            r1 = 27
            if (r10 != r1) goto L_0x02de
            r1 = 2
            if (r0 != r1) goto L_0x02d0
            java.lang.Object r0 = r9.getObject(r14, r4)
            com.google.android.gms.internal.clearcut.u0 r0 = (com.google.android.gms.internal.clearcut.u0) r0
            boolean r1 = r0.l()
            if (r1 != 0) goto L_0x02b3
            int r1 = r0.size()
            if (r1 != 0) goto L_0x02aa
            r1 = 10
            goto L_0x02ac
        L_0x02aa:
            int r1 = r1 << 1
        L_0x02ac:
            com.google.android.gms.internal.clearcut.u0 r0 = r0.r(r1)
            r9.putObject(r14, r4, r0)
        L_0x02b3:
            r5 = r0
            com.google.android.gms.internal.clearcut.i2 r0 = r15.w(r6)
            r1 = r12
            r3 = r2
            r2 = r35
            r4 = r37
            r10 = r36
            r6 = r39
            int r0 = j(r0, r1, r2, r3, r4, r5, r6)
            r6 = r10
        L_0x02c7:
            r1 = r38
            r2 = r12
            r12 = r13
            r10 = -1
            r13 = r37
            goto L_0x0018
        L_0x02d0:
            r28 = r7
            r29 = r8
            r30 = r9
            r20 = r12
            r15 = r14
            r21 = r22
            r14 = r2
            goto L_0x0346
        L_0x02de:
            r1 = 49
            if (r10 > r1) goto L_0x0323
            r36 = r10
            r1 = r20
            r20 = r9
            long r9 = (long) r1
            r1 = r0
            r0 = r33
            r23 = r1
            r1 = r34
            r24 = r2
            r2 = r35
            r25 = r3
            r3 = r24
            r26 = r4
            r5 = r22
            r4 = r37
            r15 = r5
            r5 = r12
            r22 = r6
            r6 = r25
            r28 = r7
            r7 = r23
            r29 = r8
            r8 = r22
            r30 = r20
            r11 = r36
            r20 = r12
            r12 = r26
            r21 = r15
            r15 = r14
            r14 = r39
            int r0 = r0.n(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            r14 = r24
            if (r0 != r14) goto L_0x037a
            goto L_0x0376
        L_0x0323:
            r23 = r0
            r25 = r3
            r26 = r4
            r28 = r7
            r29 = r8
            r30 = r9
            r36 = r10
            r15 = r14
            r1 = r20
            r21 = r22
            r14 = r2
            r22 = r6
            r20 = r12
            r0 = 50
            r9 = r36
            r7 = r23
            if (r9 != r0) goto L_0x035c
            r0 = 2
            if (r7 == r0) goto L_0x0349
        L_0x0346:
            r1 = r38
            goto L_0x0391
        L_0x0349:
            r0 = r33
            r1 = r34
            r2 = r35
            r3 = r14
            r4 = r37
            r5 = r22
            r6 = r26
            r8 = r39
            r0.t(r1, r2, r3, r4, r5, r6, r8)
            throw r17
        L_0x035c:
            r0 = r33
            r8 = r1
            r1 = r34
            r2 = r35
            r3 = r14
            r4 = r37
            r5 = r20
            r6 = r25
            r10 = r26
            r12 = r22
            r13 = r39
            int r0 = r0.m(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 != r14) goto L_0x037a
        L_0x0376:
            r2 = r0
            r1 = r38
            goto L_0x0392
        L_0x037a:
            r1 = r38
            r9 = r20
            r7 = r28
            r8 = r29
            goto L_0x03c0
        L_0x0383:
            r21 = r4
            r28 = r7
            r29 = r8
            r30 = r9
            r15 = r14
            r20 = r19
            r14 = r2
            r19 = r5
        L_0x0391:
            r2 = r14
        L_0x0392:
            r6 = r1
            r9 = r20
            r7 = r28
            r8 = r29
        L_0x0399:
            if (r9 != r6) goto L_0x03a3
            if (r6 != 0) goto L_0x039e
            goto L_0x03a3
        L_0x039e:
            r0 = r2
            r1 = r6
            r2 = r9
            r3 = -1
            goto L_0x03da
        L_0x03a3:
            r0 = r15
            com.google.android.gms.internal.clearcut.p0 r0 = (com.google.android.gms.internal.clearcut.p0) r0
            com.google.android.gms.internal.clearcut.v2 r1 = r0.zzjp
            r3 = r21
            if (r1 != r3) goto L_0x03b3
            com.google.android.gms.internal.clearcut.v2 r1 = new com.google.android.gms.internal.clearcut.v2
            r1.<init>()
            r0.zzjp = r1
        L_0x03b3:
            r4 = r1
            r0 = r9
            r1 = r35
            r3 = r37
            r5 = r39
            int r0 = s6.a.Q(r0, r1, r2, r3, r4, r5)
            r1 = r6
        L_0x03c0:
            r12 = r35
            r13 = r37
            r6 = r39
            r11 = r6
            r2 = r9
            r14 = r15
            r9 = r30
            r10 = -1
            r15 = r33
            goto L_0x0018
        L_0x03d0:
            r19 = r5
            r28 = r7
            r29 = r8
            r30 = r9
            r15 = r14
            r3 = r10
        L_0x03da:
            if (r7 == r3) goto L_0x03e2
            long r3 = (long) r7
            r5 = r30
            r5.putInt(r15, r3, r8)
        L_0x03e2:
            r3 = r33
            int[] r4 = r3.f2560j
            if (r4 == 0) goto L_0x0446
            int r5 = r4.length
            r6 = r16
        L_0x03eb:
            if (r6 >= r5) goto L_0x0446
            r7 = r4[r6]
            r8 = r19[r7]
            int r8 = r3.z(r7)
            r8 = r8 & r18
            long r8 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.a3.w(r8, r15)
            if (r8 != 0) goto L_0x03ff
            goto L_0x0443
        L_0x03ff:
            com.google.android.gms.internal.clearcut.t0 r9 = r3.y(r7)
            if (r9 != 0) goto L_0x0406
            goto L_0x0443
        L_0x0406:
            com.google.android.gms.internal.clearcut.m1 r10 = r3.f2565p
            com.google.android.gms.internal.clearcut.l1 r8 = r10.n(r8)
            r3.x(r7)
            r10.k()
            java.util.Set r7 = r8.entrySet()
            java.util.Iterator r7 = r7.iterator()
        L_0x041a:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x0443
            java.lang.Object r8 = r7.next()
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8
            java.lang.Object r10 = r8.getValue()
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            com.google.android.gms.internal.clearcut.s0 r10 = r9.j(r10)
            if (r10 == 0) goto L_0x0437
            goto L_0x041a
        L_0x0437:
            com.google.android.gms.internal.clearcut.u2<?, ?> r0 = r3.f2563n
            r0.e()
            r8.getKey()
            r8.getValue()
            throw r17
        L_0x0443:
            int r6 = r6 + 1
            goto L_0x03eb
        L_0x0446:
            if (r1 != 0) goto L_0x0452
            r4 = r37
            if (r0 != r4) goto L_0x044d
            goto L_0x0458
        L_0x044d:
            com.google.android.gms.internal.clearcut.v0 r0 = com.google.android.gms.internal.clearcut.v0.b()
            throw r0
        L_0x0452:
            r4 = r37
            if (r0 > r4) goto L_0x0459
            if (r2 != r1) goto L_0x0459
        L_0x0458:
            return r0
        L_0x0459:
            com.google.android.gms.internal.clearcut.v0 r0 = com.google.android.gms.internal.clearcut.v0.b()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.v1.o(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.clearcut.r):int");
    }

    public final void r(int i10, Object obj, Object obj2) {
        long z = (long) (z(i10) & 1048575);
        if (v(i10, obj2)) {
            Object w = a3.w(z, obj);
            Object w10 = a3.w(z, obj2);
            if (w != null && w10 != null) {
                a3.j(z, obj, r0.a(w, w10));
                C(i10, obj);
            } else if (w10 != null) {
                a3.j(z, obj, w10);
                C(i10, obj);
            }
        }
    }

    public final void s(y yVar, int i10, Object obj, int i11) {
        if (obj != null) {
            x(i11);
            m1 m1Var = this.f2565p;
            m1Var.k();
            l1 m10 = m1Var.m(obj);
            yVar.getClass();
            Iterator it = m10.entrySet().iterator();
            if (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                yVar.f2594a.R(i10, 2);
                entry.getKey();
                entry.getValue();
                throw null;
            }
        }
    }

    public final void t(Object obj, byte[] bArr, int i10, int i11, int i12, long j8, r rVar) {
        x(i12);
        Unsafe unsafe = f2551q;
        Object object = unsafe.getObject(obj, j8);
        m1 m1Var = this.f2565p;
        if (m1Var.l(object)) {
            l1 d10 = m1Var.d();
            m1Var.c(d10, object);
            unsafe.putObject(obj, j8, d10);
            object = d10;
        }
        m1Var.k();
        m1Var.n(object);
        int S = a.S(bArr, i10, rVar);
        int i13 = rVar.f2534a;
        if (i13 < 0 || i13 > i11 - S) {
            throw v0.a();
        }
        throw null;
    }

    public final boolean u(int i10, int i11, Object obj) {
        if (a3.r((long) (this.f2552a[i11 + 2] & 1048575), obj) == i10) {
            return true;
        }
        return false;
    }

    public final boolean v(int i10, Object obj) {
        if (this.f2558h) {
            int z = z(i10);
            long j8 = (long) (z & 1048575);
            switch ((z & 267386880) >>> 20) {
                case 0:
                    if (a3.v(j8, obj) != 0.0d) {
                        return true;
                    }
                    return false;
                case 1:
                    if (a3.u(j8, obj) != 0.0f) {
                        return true;
                    }
                    return false;
                case 2:
                    if (a3.s(j8, obj) != 0) {
                        return true;
                    }
                    return false;
                case 3:
                    if (a3.s(j8, obj) != 0) {
                        return true;
                    }
                    return false;
                case 4:
                    if (a3.r(j8, obj) != 0) {
                        return true;
                    }
                    return false;
                case 5:
                    if (a3.s(j8, obj) != 0) {
                        return true;
                    }
                    return false;
                case 6:
                    if (a3.r(j8, obj) != 0) {
                        return true;
                    }
                    return false;
                case 7:
                    return a3.t(j8, obj);
                case 8:
                    Object w = a3.w(j8, obj);
                    if (w instanceof String) {
                        if (!((String) w).isEmpty()) {
                            return true;
                        }
                        return false;
                    } else if (!(w instanceof u)) {
                        throw new IllegalArgumentException();
                    } else if (!u.f2544p.equals(w)) {
                        return true;
                    } else {
                        return false;
                    }
                case 9:
                    if (a3.w(j8, obj) != null) {
                        return true;
                    }
                    return false;
                case 10:
                    if (!u.f2544p.equals(a3.w(j8, obj))) {
                        return true;
                    }
                    return false;
                case 11:
                    if (a3.r(j8, obj) != 0) {
                        return true;
                    }
                    return false;
                case 12:
                    if (a3.r(j8, obj) != 0) {
                        return true;
                    }
                    return false;
                case 13:
                    if (a3.r(j8, obj) != 0) {
                        return true;
                    }
                    return false;
                case 14:
                    if (a3.s(j8, obj) != 0) {
                        return true;
                    }
                    return false;
                case 15:
                    if (a3.r(j8, obj) != 0) {
                        return true;
                    }
                    return false;
                case 16:
                    if (a3.s(j8, obj) != 0) {
                        return true;
                    }
                    return false;
                case 17:
                    if (a3.w(j8, obj) != null) {
                        return true;
                    }
                    return false;
                default:
                    throw new IllegalArgumentException();
            }
        } else {
            int i11 = this.f2552a[i10 + 2];
            if ((a3.r((long) (i11 & 1048575), obj) & (1 << (i11 >>> 20))) != 0) {
                return true;
            }
            return false;
        }
    }

    public final i2 w(int i10) {
        int i11 = (i10 / 4) << 1;
        Object[] objArr = this.f2553b;
        i2 i2Var = (i2) objArr[i11];
        if (i2Var != null) {
            return i2Var;
        }
        i2 a10 = d2.f2398c.a((Class) objArr[i11 + 1]);
        objArr[i11] = a10;
        return a10;
    }

    public final Object x(int i10) {
        return this.f2553b[(i10 / 4) << 1];
    }

    public final t0<?> y(int i10) {
        return (t0) this.f2553b[((i10 / 4) << 1) + 1];
    }

    public final int z(int i10) {
        return this.f2552a[i10 + 1];
    }
}
