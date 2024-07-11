package com.google.android.gms.internal.clearcut;

import androidx.appcompat.widget.x0;
import b0.d;
import java.lang.reflect.Field;
import java.util.Arrays;

public final class g2 {
    public Object A;

    /* renamed from: a  reason: collision with root package name */
    public final h2 f2424a;

    /* renamed from: b  reason: collision with root package name */
    public final Object[] f2425b;

    /* renamed from: c  reason: collision with root package name */
    public final Class<?> f2426c;
    public final int d;

    /* renamed from: e  reason: collision with root package name */
    public final int f2427e;

    /* renamed from: f  reason: collision with root package name */
    public final int f2428f;

    /* renamed from: g  reason: collision with root package name */
    public final int f2429g;

    /* renamed from: h  reason: collision with root package name */
    public final int f2430h;

    /* renamed from: i  reason: collision with root package name */
    public final int f2431i;

    /* renamed from: j  reason: collision with root package name */
    public final int f2432j;

    /* renamed from: k  reason: collision with root package name */
    public final int f2433k;
    public final int l;

    /* renamed from: m  reason: collision with root package name */
    public final int[] f2434m;

    /* renamed from: n  reason: collision with root package name */
    public int f2435n;

    /* renamed from: o  reason: collision with root package name */
    public int f2436o;

    /* renamed from: p  reason: collision with root package name */
    public int f2437p = Integer.MAX_VALUE;

    /* renamed from: q  reason: collision with root package name */
    public int f2438q = Integer.MIN_VALUE;

    /* renamed from: r  reason: collision with root package name */
    public int f2439r = 0;

    /* renamed from: s  reason: collision with root package name */
    public int f2440s;

    /* renamed from: t  reason: collision with root package name */
    public int f2441t;
    public int u;

    /* renamed from: v  reason: collision with root package name */
    public int f2442v;
    public int w;

    /* renamed from: x  reason: collision with root package name */
    public Field f2443x;

    /* renamed from: y  reason: collision with root package name */
    public Object f2444y;
    public Object z;

    public g2(Class<?> cls, String str, Object[] objArr) {
        this.f2426c = cls;
        h2 h2Var = new h2(str);
        this.f2424a = h2Var;
        this.f2425b = objArr;
        this.d = h2Var.a();
        int a10 = h2Var.a();
        this.f2427e = a10;
        int[] iArr = null;
        if (a10 == 0) {
            this.f2428f = 0;
            this.f2429g = 0;
            this.f2430h = 0;
            this.f2431i = 0;
            this.f2433k = 0;
            this.f2432j = 0;
            this.l = 0;
            this.f2434m = null;
            return;
        }
        int a11 = h2Var.a();
        this.f2428f = a11;
        int a12 = h2Var.a();
        this.f2429g = h2Var.a();
        this.f2430h = h2Var.a();
        this.f2433k = h2Var.a();
        this.f2432j = h2Var.a();
        this.f2431i = h2Var.a();
        this.l = h2Var.a();
        int a13 = h2Var.a();
        this.f2434m = a13 != 0 ? new int[a13] : iArr;
        this.f2435n = (a11 << 1) + a12;
    }

    public static Field b(String str, Class cls) {
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

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00d0, code lost:
        if (r4 != false) goto L_0x0168;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x015e, code lost:
        if (r4 != false) goto L_0x0168;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0166, code lost:
        if (r4 != false) goto L_0x0168;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a() {
        /*
            r18 = this;
            r0 = r18
            com.google.android.gms.internal.clearcut.h2 r1 = r0.f2424a
            int r2 = r1.f2450a
            java.lang.Object r3 = r1.f2451b
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.length()
            r4 = 0
            r5 = 1
            if (r2 >= r3) goto L_0x0014
            r2 = r5
            goto L_0x0015
        L_0x0014:
            r2 = r4
        L_0x0015:
            if (r2 != 0) goto L_0x0018
            return r4
        L_0x0018:
            int r2 = r1.a()
            r0.f2440s = r2
            int r2 = r1.a()
            r0.f2441t = r2
            r2 = r2 & 255(0xff, float:3.57E-43)
            r0.u = r2
            int r3 = r0.f2440s
            int r6 = r0.f2437p
            if (r3 >= r6) goto L_0x0030
            r0.f2437p = r3
        L_0x0030:
            int r6 = r0.f2438q
            if (r3 <= r6) goto L_0x0036
            r0.f2438q = r3
        L_0x0036:
            com.google.android.gms.internal.clearcut.k0 r3 = com.google.android.gms.internal.clearcut.k0.MAP
            int r6 = r3.id()
            if (r2 != r6) goto L_0x003f
            goto L_0x004e
        L_0x003f:
            int r2 = r0.u
            com.google.android.gms.internal.clearcut.k0 r6 = com.google.android.gms.internal.clearcut.k0.DOUBLE_LIST
            int r6 = r6.id()
            if (r2 < r6) goto L_0x004e
            com.google.android.gms.internal.clearcut.k0 r2 = com.google.android.gms.internal.clearcut.k0.GROUP_LIST
            r2.id()
        L_0x004e:
            int r2 = r0.f2439r
            int r2 = r2 + r5
            r0.f2439r = r2
            int r6 = r0.f2437p
            int r7 = r0.f2440s
            java.lang.Class<?> r8 = com.google.android.gms.internal.clearcut.k2.f2474a
            r8 = 40
            if (r7 >= r8) goto L_0x005e
            goto L_0x0074
        L_0x005e:
            long r8 = (long) r7
            long r10 = (long) r6
            long r8 = r8 - r10
            r10 = 1
            long r8 = r8 + r10
            long r10 = (long) r2
            r12 = 2
            long r12 = r12 * r10
            r14 = 3
            long r12 = r12 + r14
            long r10 = r10 + r14
            r16 = 9
            long r8 = r8 + r16
            long r10 = r10 * r14
            long r10 = r10 + r12
            int r2 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
        L_0x0074:
            int r2 = r0.f2441t
            r2 = r2 & 1024(0x400, float:1.435E-42)
            if (r2 == 0) goto L_0x007c
            r2 = r5
            goto L_0x007d
        L_0x007c:
            r2 = r4
        L_0x007d:
            if (r2 == 0) goto L_0x0089
            int r2 = r0.f2436o
            int r6 = r2 + 1
            r0.f2436o = r6
            int[] r6 = r0.f2434m
            r6[r2] = r7
        L_0x0089:
            r2 = 0
            r0.f2444y = r2
            r0.z = r2
            r0.A = r2
            int r2 = r0.u
            int r6 = r3.id()
            if (r2 <= r6) goto L_0x009a
            r2 = r5
            goto L_0x009b
        L_0x009a:
            r2 = r4
        L_0x009b:
            int r6 = r0.d
            if (r2 == 0) goto L_0x00d4
            int r1 = r1.a()
            r0.f2442v = r1
            int r1 = r0.u
            com.google.android.gms.internal.clearcut.k0 r2 = com.google.android.gms.internal.clearcut.k0.MESSAGE
            int r2 = r2.id()
            int r2 = r2 + 51
            if (r1 == r2) goto L_0x016f
            int r1 = r0.u
            com.google.android.gms.internal.clearcut.k0 r2 = com.google.android.gms.internal.clearcut.k0.GROUP
            int r2 = r2.id()
            int r2 = r2 + 51
            if (r1 != r2) goto L_0x00bf
            goto L_0x016f
        L_0x00bf:
            int r1 = r0.u
            com.google.android.gms.internal.clearcut.k0 r2 = com.google.android.gms.internal.clearcut.k0.ENUM
            int r2 = r2.id()
            int r2 = r2 + 51
            if (r1 != r2) goto L_0x017c
            r1 = r6 & 1
            if (r1 != r5) goto L_0x00d0
            r4 = r5
        L_0x00d0:
            if (r4 == 0) goto L_0x017c
            goto L_0x0168
        L_0x00d4:
            java.lang.Object r2 = r18.c()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Class<?> r7 = r0.f2426c
            java.lang.reflect.Field r2 = b(r2, r7)
            r0.f2443x = r2
            r2 = r6 & 1
            if (r2 != r5) goto L_0x00e8
            r2 = r5
            goto L_0x00e9
        L_0x00e8:
            r2 = r4
        L_0x00e9:
            if (r2 == 0) goto L_0x00f7
            int r2 = r0.u
            com.google.android.gms.internal.clearcut.k0 r7 = com.google.android.gms.internal.clearcut.k0.GROUP
            int r7 = r7.id()
            if (r2 > r7) goto L_0x00f7
            r2 = r5
            goto L_0x00f8
        L_0x00f7:
            r2 = r4
        L_0x00f8:
            if (r2 == 0) goto L_0x0100
            int r1 = r1.a()
            r0.w = r1
        L_0x0100:
            int r1 = r0.u
            com.google.android.gms.internal.clearcut.k0 r2 = com.google.android.gms.internal.clearcut.k0.MESSAGE
            int r2 = r2.id()
            if (r1 == r2) goto L_0x0174
            int r1 = r0.u
            com.google.android.gms.internal.clearcut.k0 r2 = com.google.android.gms.internal.clearcut.k0.GROUP
            int r2 = r2.id()
            if (r1 != r2) goto L_0x0115
            goto L_0x0174
        L_0x0115:
            int r1 = r0.u
            com.google.android.gms.internal.clearcut.k0 r2 = com.google.android.gms.internal.clearcut.k0.MESSAGE_LIST
            int r2 = r2.id()
            if (r1 == r2) goto L_0x016f
            int r1 = r0.u
            com.google.android.gms.internal.clearcut.k0 r2 = com.google.android.gms.internal.clearcut.k0.GROUP_LIST
            int r2 = r2.id()
            if (r1 != r2) goto L_0x012a
            goto L_0x016f
        L_0x012a:
            int r1 = r0.u
            com.google.android.gms.internal.clearcut.k0 r2 = com.google.android.gms.internal.clearcut.k0.ENUM
            int r2 = r2.id()
            if (r1 == r2) goto L_0x0161
            int r1 = r0.u
            com.google.android.gms.internal.clearcut.k0 r2 = com.google.android.gms.internal.clearcut.k0.ENUM_LIST
            int r2 = r2.id()
            if (r1 == r2) goto L_0x0161
            int r1 = r0.u
            com.google.android.gms.internal.clearcut.k0 r2 = com.google.android.gms.internal.clearcut.k0.ENUM_LIST_PACKED
            int r2 = r2.id()
            if (r1 != r2) goto L_0x0149
            goto L_0x0161
        L_0x0149:
            int r1 = r0.u
            int r2 = r3.id()
            if (r1 != r2) goto L_0x017c
            java.lang.Object r1 = r18.c()
            r0.A = r1
            int r1 = r0.f2441t
            r1 = r1 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x015e
            r4 = r5
        L_0x015e:
            if (r4 == 0) goto L_0x017c
            goto L_0x0168
        L_0x0161:
            r1 = r6 & 1
            if (r1 != r5) goto L_0x0166
            r4 = r5
        L_0x0166:
            if (r4 == 0) goto L_0x017c
        L_0x0168:
            java.lang.Object r1 = r18.c()
            r0.z = r1
            goto L_0x017c
        L_0x016f:
            java.lang.Object r1 = r18.c()
            goto L_0x017a
        L_0x0174:
            java.lang.reflect.Field r1 = r0.f2443x
            java.lang.Class r1 = r1.getType()
        L_0x017a:
            r0.f2444y = r1
        L_0x017c:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.g2.a():boolean");
    }

    public final Object c() {
        int i10 = this.f2435n;
        this.f2435n = i10 + 1;
        return this.f2425b[i10];
    }
}
