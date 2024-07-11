package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.l1;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Map;

public final class j1<T extends l1<T>> {
    public static final j1 d = new j1(0);

    /* renamed from: a  reason: collision with root package name */
    public final p3<T, Object> f3101a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f3102b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f3103c;

    public j1() {
        int i10 = p3.u;
        this.f3101a = new o3(16);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0106, code lost:
        r3 = com.google.android.gms.internal.vision.a1.f3034p;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0109, code lost:
        return 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x010f, code lost:
        r3 = com.google.android.gms.internal.vision.a1.f3034p;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0113, code lost:
        return 8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int a(com.google.android.gms.internal.vision.k4 r3, java.lang.Object r4) {
        /*
            int[] r0 = com.google.android.gms.internal.vision.i1.f3098b
            int r3 = r3.ordinal()
            r3 = r0[r3]
            r0 = 1
            switch(r3) {
                case 1: goto L_0x010a;
                case 2: goto L_0x0101;
                case 3: goto L_0x00f6;
                case 4: goto L_0x00eb;
                case 5: goto L_0x00e0;
                case 6: goto L_0x00da;
                case 7: goto L_0x00d4;
                case 8: goto L_0x00cc;
                case 9: goto L_0x00c3;
                case 10: goto L_0x0090;
                case 11: goto L_0x0077;
                case 12: goto L_0x005a;
                case 13: goto L_0x004f;
                case 14: goto L_0x00d4;
                case 15: goto L_0x00da;
                case 16: goto L_0x003f;
                case 17: goto L_0x002e;
                case 18: goto L_0x0014;
                default: goto L_0x000c;
            }
        L_0x000c:
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            java.lang.String r4 = "There is no way to get here, but the compiler thinks otherwise."
            r3.<init>(r4)
            throw r3
        L_0x0014:
            boolean r3 = r4 instanceof com.google.android.gms.internal.vision.t1
            if (r3 == 0) goto L_0x0023
            com.google.android.gms.internal.vision.t1 r4 = (com.google.android.gms.internal.vision.t1) r4
            int r3 = r4.zza()
            int r3 = com.google.android.gms.internal.vision.a1.i0(r3)
            return r3
        L_0x0023:
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r3 = r4.intValue()
            int r3 = com.google.android.gms.internal.vision.a1.i0(r3)
            return r3
        L_0x002e:
            java.lang.Long r4 = (java.lang.Long) r4
            long r3 = r4.longValue()
            long r0 = r3 << r0
            r2 = 63
            long r3 = r3 >> r2
            long r3 = r3 ^ r0
            int r3 = com.google.android.gms.internal.vision.a1.g0(r3)
            return r3
        L_0x003f:
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r3 = r4.intValue()
            int r4 = r3 << 1
            int r3 = r3 >> 31
            r3 = r3 ^ r4
            int r3 = com.google.android.gms.internal.vision.a1.n0(r3)
            return r3
        L_0x004f:
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r3 = r4.intValue()
            int r3 = com.google.android.gms.internal.vision.a1.n0(r3)
            return r3
        L_0x005a:
            boolean r3 = r4 instanceof com.google.android.gms.internal.vision.w0
            if (r3 == 0) goto L_0x006c
            com.google.android.gms.internal.vision.w0 r4 = (com.google.android.gms.internal.vision.w0) r4
            java.util.logging.Logger r3 = com.google.android.gms.internal.vision.a1.f3034p
            int r3 = r4.p()
            int r4 = com.google.android.gms.internal.vision.a1.n0(r3)
            int r4 = r4 + r3
            return r4
        L_0x006c:
            byte[] r4 = (byte[]) r4
            java.util.logging.Logger r3 = com.google.android.gms.internal.vision.a1.f3034p
            int r3 = r4.length
            int r4 = com.google.android.gms.internal.vision.a1.n0(r3)
            int r4 = r4 + r3
            return r4
        L_0x0077:
            boolean r3 = r4 instanceof com.google.android.gms.internal.vision.w0
            if (r3 == 0) goto L_0x0089
            com.google.android.gms.internal.vision.w0 r4 = (com.google.android.gms.internal.vision.w0) r4
            java.util.logging.Logger r3 = com.google.android.gms.internal.vision.a1.f3034p
            int r3 = r4.p()
            int r4 = com.google.android.gms.internal.vision.a1.n0(r3)
            int r4 = r4 + r3
            return r4
        L_0x0089:
            java.lang.String r4 = (java.lang.String) r4
            int r3 = com.google.android.gms.internal.vision.a1.Q(r4)
            return r3
        L_0x0090:
            boolean r3 = r4 instanceof com.google.android.gms.internal.vision.d2
            if (r3 == 0) goto L_0x00b5
            com.google.android.gms.internal.vision.d2 r4 = (com.google.android.gms.internal.vision.d2) r4
            java.util.logging.Logger r3 = com.google.android.gms.internal.vision.a1.f3034p
            com.google.android.gms.internal.vision.w0 r3 = r4.f3096b
            if (r3 == 0) goto L_0x00a3
            com.google.android.gms.internal.vision.w0 r3 = r4.f3096b
            int r3 = r3.p()
            goto L_0x00af
        L_0x00a3:
            com.google.android.gms.internal.vision.w2 r3 = r4.f3095a
            if (r3 == 0) goto L_0x00ae
            com.google.android.gms.internal.vision.w2 r3 = r4.f3095a
            int r3 = r3.n()
            goto L_0x00af
        L_0x00ae:
            r3 = 0
        L_0x00af:
            int r4 = com.google.android.gms.internal.vision.a1.n0(r3)
            int r4 = r4 + r3
            return r4
        L_0x00b5:
            com.google.android.gms.internal.vision.w2 r4 = (com.google.android.gms.internal.vision.w2) r4
            java.util.logging.Logger r3 = com.google.android.gms.internal.vision.a1.f3034p
            int r3 = r4.n()
            int r4 = com.google.android.gms.internal.vision.a1.n0(r3)
            int r4 = r4 + r3
            return r4
        L_0x00c3:
            com.google.android.gms.internal.vision.w2 r4 = (com.google.android.gms.internal.vision.w2) r4
            java.util.logging.Logger r3 = com.google.android.gms.internal.vision.a1.f3034p
            int r3 = r4.n()
            return r3
        L_0x00cc:
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            r4.booleanValue()
            java.util.logging.Logger r3 = com.google.android.gms.internal.vision.a1.f3034p
            return r0
        L_0x00d4:
            java.lang.Integer r4 = (java.lang.Integer) r4
            r4.intValue()
            goto L_0x0106
        L_0x00da:
            java.lang.Long r4 = (java.lang.Long) r4
            r4.longValue()
            goto L_0x010f
        L_0x00e0:
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r3 = r4.intValue()
            int r3 = com.google.android.gms.internal.vision.a1.i0(r3)
            return r3
        L_0x00eb:
            java.lang.Long r4 = (java.lang.Long) r4
            long r3 = r4.longValue()
            int r3 = com.google.android.gms.internal.vision.a1.g0(r3)
            return r3
        L_0x00f6:
            java.lang.Long r4 = (java.lang.Long) r4
            long r3 = r4.longValue()
            int r3 = com.google.android.gms.internal.vision.a1.g0(r3)
            return r3
        L_0x0101:
            java.lang.Float r4 = (java.lang.Float) r4
            r4.floatValue()
        L_0x0106:
            java.util.logging.Logger r3 = com.google.android.gms.internal.vision.a1.f3034p
            r3 = 4
            return r3
        L_0x010a:
            java.lang.Double r4 = (java.lang.Double) r4
            r4.doubleValue()
        L_0x010f:
            java.util.logging.Logger r3 = com.google.android.gms.internal.vision.a1.f3034p
            r3 = 8
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.j1.a(com.google.android.gms.internal.vision.k4, java.lang.Object):int");
    }

    public static Object c(Object obj) {
        if (obj instanceof e3) {
            return ((e3) obj).zza();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public static <T extends l1<T>> boolean e(Map.Entry<T, Object> entry) {
        l1 l1Var = (l1) entry.getKey();
        if (l1Var.zzc() == n4.MESSAGE) {
            l1Var.b();
            Object value = entry.getValue();
            if (value instanceof w2) {
                if (!((w2) value).d()) {
                    return false;
                }
            } else if (value instanceof d2) {
                return true;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        }
        return true;
    }

    public static int g(l1<?> l1Var, Object obj) {
        l1Var.a();
        l1Var.zza();
        l1Var.b();
        int e02 = a1.e0(0);
        if (k4.GROUP == null) {
            w2 w2Var = (w2) obj;
            if (w2Var instanceof p0) {
                p0 p0Var = (p0) w2Var;
            }
            e02 <<= 1;
        }
        return a((k4) null, obj) + e02;
    }

    public static int h(Map.Entry<T, Object> entry) {
        l1 l1Var = (l1) entry.getKey();
        Object value = entry.getValue();
        if (l1Var.zzc() != n4.MESSAGE) {
            return g(l1Var, value);
        }
        l1Var.b();
        l1Var.c();
        boolean z = value instanceof d2;
        ((l1) entry.getKey()).zza();
        int i10 = 0;
        if (z) {
            d2 d2Var = (d2) value;
            int m02 = a1.m0(2, 0) + (a1.n0(8) << 1);
            int n02 = a1.n0(24);
            if (d2Var.f3096b != null) {
                i10 = d2Var.f3096b.p();
            } else if (d2Var.f3095a != null) {
                i10 = d2Var.f3095a.n();
            }
            return a1.n0(i10) + i10 + n02 + m02;
        }
        int m03 = a1.m0(2, 0) + (a1.n0(8) << 1);
        int n03 = a1.n0(24);
        int n10 = ((w2) value).n();
        return a1.n0(n10) + n10 + n03 + m03;
    }

    public static void j(T t10, Object obj) {
        t10.a();
        Charset charset = u1.f3170a;
        obj.getClass();
        int[] iArr = i1.f3097a;
        throw null;
    }

    public final Object b(T t10) {
        Object obj = this.f3101a.get(t10);
        if (!(obj instanceof d2)) {
            return obj;
        }
        d2 d2Var = (d2) obj;
        int i10 = d2.f3082c;
        throw new NoSuchMethodError();
    }

    public final /* synthetic */ Object clone() {
        p3<T, Object> p3Var;
        j1 j1Var = new j1();
        int i10 = 0;
        while (true) {
            p3Var = this.f3101a;
            if (i10 >= p3Var.e()) {
                break;
            }
            Map.Entry<T, Object> d10 = p3Var.d(i10);
            j1Var.d((l1) d10.getKey(), d10.getValue());
            i10++;
        }
        for (Map.Entry next : p3Var.g()) {
            j1Var.d((l1) next.getKey(), next.getValue());
        }
        j1Var.f3103c = this.f3103c;
        return j1Var;
    }

    public final void d(T t10, Object obj) {
        t10.b();
        j(t10, obj);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j1)) {
            return false;
        }
        return this.f3101a.equals(((j1) obj).f3101a);
    }

    public final void f(Map.Entry<T, Object> entry) {
        Object b10;
        Object obj;
        l1 l1Var = (l1) entry.getKey();
        Object value = entry.getValue();
        if (!(value instanceof d2)) {
            l1Var.b();
            n4 zzc = l1Var.zzc();
            n4 n4Var = n4.MESSAGE;
            p3<T, Object> p3Var = this.f3101a;
            if (zzc != n4Var || (b10 = b(l1Var)) == null) {
                p3Var.put(l1Var, c(value));
                return;
            }
            if (b10 instanceof e3) {
                e3 e3Var = (e3) b10;
                e3 e3Var2 = (e3) value;
                obj = l1Var.zza();
            } else {
                obj = l1Var.j(((w2) b10).e(), (w2) value).r();
            }
            p3Var.put(l1Var, obj);
            return;
        }
        d2 d2Var = (d2) value;
        int i10 = d2.f3082c;
        throw new NoSuchMethodError();
    }

    public final int hashCode() {
        return this.f3101a.hashCode();
    }

    public final Iterator<Map.Entry<T, Object>> i() {
        boolean z = this.f3103c;
        p3<T, Object> p3Var = this.f3101a;
        return z ? new e2(p3Var.entrySet().iterator()) : p3Var.entrySet().iterator();
    }

    public final boolean k() {
        int i10 = 0;
        while (true) {
            p3<T, Object> p3Var = this.f3101a;
            if (i10 >= p3Var.e()) {
                for (Map.Entry<T, Object> e10 : p3Var.g()) {
                    if (!e(e10)) {
                        return false;
                    }
                }
                return true;
            } else if (!e(p3Var.d(i10))) {
                return false;
            } else {
                i10++;
            }
        }
    }

    public j1(int i10) {
        int i11 = p3.u;
        o3 o3Var = new o3(0);
        this.f3101a = o3Var;
        if (!this.f3102b) {
            o3Var.c();
            this.f3102b = true;
        }
        if (!this.f3102b) {
            o3Var.c();
            this.f3102b = true;
        }
    }
}
