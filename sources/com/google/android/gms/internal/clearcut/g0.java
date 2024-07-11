package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.j0;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Map;

public final class g0<FieldDescriptorType extends j0<FieldDescriptorType>> {
    public static final g0 d = new g0(0);

    /* renamed from: a  reason: collision with root package name */
    public final m2 f2421a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f2422b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f2423c = false;

    public g0() {
        int i10 = l2.u;
        this.f2421a = new m2(16);
    }

    public static int d(h3 h3Var, int i10, Object obj) {
        int v02 = x.v0(i10);
        if (h3Var == h3.GROUP) {
            r1 r1Var = (r1) obj;
            Charset charset = r0.f2537a;
            v02 <<= 1;
        }
        return i(h3Var, obj) + v02;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0028, code lost:
        if ((r3 instanceof com.google.android.gms.internal.clearcut.s0) == false) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0031, code lost:
        if ((r3 instanceof byte[]) == false) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001d, code lost:
        if ((r3 instanceof com.google.android.gms.internal.clearcut.y0) == false) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0020, code lost:
        r0 = false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0048 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0049  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void f(com.google.android.gms.internal.clearcut.h3 r2, java.lang.Object r3) {
        /*
            java.nio.charset.Charset r0 = com.google.android.gms.internal.clearcut.r0.f2537a
            r3.getClass()
            int[] r0 = com.google.android.gms.internal.clearcut.h0.f2446a
            com.google.android.gms.internal.clearcut.m3 r2 = r2.zzek()
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 1
            r1 = 0
            switch(r2) {
                case 1: goto L_0x0043;
                case 2: goto L_0x0040;
                case 3: goto L_0x003d;
                case 4: goto L_0x003a;
                case 5: goto L_0x0037;
                case 6: goto L_0x0034;
                case 7: goto L_0x002b;
                case 8: goto L_0x0022;
                case 9: goto L_0x0017;
                default: goto L_0x0016;
            }
        L_0x0016:
            goto L_0x0046
        L_0x0017:
            boolean r2 = r3 instanceof com.google.android.gms.internal.clearcut.r1
            if (r2 != 0) goto L_0x0045
            boolean r2 = r3 instanceof com.google.android.gms.internal.clearcut.y0
            if (r2 == 0) goto L_0x0020
            goto L_0x0045
        L_0x0020:
            r0 = r1
            goto L_0x0045
        L_0x0022:
            boolean r2 = r3 instanceof java.lang.Integer
            if (r2 != 0) goto L_0x0045
            boolean r2 = r3 instanceof com.google.android.gms.internal.clearcut.s0
            if (r2 == 0) goto L_0x0020
            goto L_0x0045
        L_0x002b:
            boolean r2 = r3 instanceof com.google.android.gms.internal.clearcut.u
            if (r2 != 0) goto L_0x0045
            boolean r2 = r3 instanceof byte[]
            if (r2 == 0) goto L_0x0020
            goto L_0x0045
        L_0x0034:
            boolean r0 = r3 instanceof java.lang.String
            goto L_0x0045
        L_0x0037:
            boolean r0 = r3 instanceof java.lang.Boolean
            goto L_0x0045
        L_0x003a:
            boolean r0 = r3 instanceof java.lang.Double
            goto L_0x0045
        L_0x003d:
            boolean r0 = r3 instanceof java.lang.Float
            goto L_0x0045
        L_0x0040:
            boolean r0 = r3 instanceof java.lang.Long
            goto L_0x0045
        L_0x0043:
            boolean r0 = r3 instanceof java.lang.Integer
        L_0x0045:
            r1 = r0
        L_0x0046:
            if (r1 == 0) goto L_0x0049
            return
        L_0x0049:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Wrong object type used with protocol message reflection."
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.g0.f(com.google.android.gms.internal.clearcut.h3, java.lang.Object):void");
    }

    public static int h(j0<?> j0Var, Object obj) {
        j0Var.e();
        j0Var.zzc();
        j0Var.m();
        return d((h3) null, 0, obj);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00ec, code lost:
        r3 = com.google.android.gms.internal.clearcut.x.f2576p;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00ef, code lost:
        return 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00f5, code lost:
        r3 = com.google.android.gms.internal.clearcut.x.f2576p;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00f9, code lost:
        return 8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int i(com.google.android.gms.internal.clearcut.h3 r3, java.lang.Object r4) {
        /*
            int[] r0 = com.google.android.gms.internal.clearcut.h0.f2447b
            int r3 = r3.ordinal()
            r3 = r0[r3]
            r0 = 1
            switch(r3) {
                case 1: goto L_0x00f0;
                case 2: goto L_0x00e7;
                case 3: goto L_0x00dc;
                case 4: goto L_0x00d1;
                case 5: goto L_0x00c6;
                case 6: goto L_0x00c0;
                case 7: goto L_0x00ba;
                case 8: goto L_0x00b2;
                case 9: goto L_0x00a9;
                case 10: goto L_0x0090;
                case 11: goto L_0x0077;
                case 12: goto L_0x005a;
                case 13: goto L_0x004f;
                case 14: goto L_0x00ba;
                case 15: goto L_0x00c0;
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
            boolean r3 = r4 instanceof com.google.android.gms.internal.clearcut.s0
            if (r3 == 0) goto L_0x0023
            com.google.android.gms.internal.clearcut.s0 r4 = (com.google.android.gms.internal.clearcut.s0) r4
            int r3 = r4.zzc()
            int r3 = com.google.android.gms.internal.clearcut.x.w0(r3)
            return r3
        L_0x0023:
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r3 = r4.intValue()
            int r3 = com.google.android.gms.internal.clearcut.x.w0(r3)
            return r3
        L_0x002e:
            java.lang.Long r4 = (java.lang.Long) r4
            long r3 = r4.longValue()
            long r0 = r3 << r0
            r2 = 63
            long r3 = r3 >> r2
            long r3 = r3 ^ r0
            int r3 = com.google.android.gms.internal.clearcut.x.h0(r3)
            return r3
        L_0x003f:
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r3 = r4.intValue()
            int r4 = r3 << 1
            int r3 = r3 >> 31
            r3 = r3 ^ r4
            int r3 = com.google.android.gms.internal.clearcut.x.x0(r3)
            return r3
        L_0x004f:
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r3 = r4.intValue()
            int r3 = com.google.android.gms.internal.clearcut.x.x0(r3)
            return r3
        L_0x005a:
            boolean r3 = r4 instanceof com.google.android.gms.internal.clearcut.u
            if (r3 == 0) goto L_0x006c
            com.google.android.gms.internal.clearcut.u r4 = (com.google.android.gms.internal.clearcut.u) r4
            java.util.logging.Logger r3 = com.google.android.gms.internal.clearcut.x.f2576p
            int r3 = r4.size()
            int r4 = com.google.android.gms.internal.clearcut.x.x0(r3)
            int r4 = r4 + r3
            return r4
        L_0x006c:
            byte[] r4 = (byte[]) r4
            java.util.logging.Logger r3 = com.google.android.gms.internal.clearcut.x.f2576p
            int r3 = r4.length
            int r4 = com.google.android.gms.internal.clearcut.x.x0(r3)
            int r4 = r4 + r3
            return r4
        L_0x0077:
            boolean r3 = r4 instanceof com.google.android.gms.internal.clearcut.u
            if (r3 == 0) goto L_0x0089
            com.google.android.gms.internal.clearcut.u r4 = (com.google.android.gms.internal.clearcut.u) r4
            java.util.logging.Logger r3 = com.google.android.gms.internal.clearcut.x.f2576p
            int r3 = r4.size()
            int r4 = com.google.android.gms.internal.clearcut.x.x0(r3)
            int r4 = r4 + r3
            return r4
        L_0x0089:
            java.lang.String r4 = (java.lang.String) r4
            int r3 = com.google.android.gms.internal.clearcut.x.n0(r4)
            return r3
        L_0x0090:
            boolean r3 = r4 instanceof com.google.android.gms.internal.clearcut.y0
            if (r3 == 0) goto L_0x009b
            com.google.android.gms.internal.clearcut.y0 r4 = (com.google.android.gms.internal.clearcut.y0) r4
            int r3 = com.google.android.gms.internal.clearcut.x.G(r4)
            return r3
        L_0x009b:
            com.google.android.gms.internal.clearcut.r1 r4 = (com.google.android.gms.internal.clearcut.r1) r4
            java.util.logging.Logger r3 = com.google.android.gms.internal.clearcut.x.f2576p
            int r3 = r4.l()
            int r4 = com.google.android.gms.internal.clearcut.x.x0(r3)
            int r4 = r4 + r3
            return r4
        L_0x00a9:
            com.google.android.gms.internal.clearcut.r1 r4 = (com.google.android.gms.internal.clearcut.r1) r4
            java.util.logging.Logger r3 = com.google.android.gms.internal.clearcut.x.f2576p
            int r3 = r4.l()
            return r3
        L_0x00b2:
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            r4.booleanValue()
            java.util.logging.Logger r3 = com.google.android.gms.internal.clearcut.x.f2576p
            return r0
        L_0x00ba:
            java.lang.Integer r4 = (java.lang.Integer) r4
            r4.intValue()
            goto L_0x00ec
        L_0x00c0:
            java.lang.Long r4 = (java.lang.Long) r4
            r4.longValue()
            goto L_0x00f5
        L_0x00c6:
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r3 = r4.intValue()
            int r3 = com.google.android.gms.internal.clearcut.x.w0(r3)
            return r3
        L_0x00d1:
            java.lang.Long r4 = (java.lang.Long) r4
            long r3 = r4.longValue()
            int r3 = com.google.android.gms.internal.clearcut.x.h0(r3)
            return r3
        L_0x00dc:
            java.lang.Long r4 = (java.lang.Long) r4
            long r3 = r4.longValue()
            int r3 = com.google.android.gms.internal.clearcut.x.h0(r3)
            return r3
        L_0x00e7:
            java.lang.Float r4 = (java.lang.Float) r4
            r4.floatValue()
        L_0x00ec:
            java.util.logging.Logger r3 = com.google.android.gms.internal.clearcut.x.f2576p
            r3 = 4
            return r3
        L_0x00f0:
            java.lang.Double r4 = (java.lang.Double) r4
            r4.doubleValue()
        L_0x00f5:
            java.util.logging.Logger r3 = com.google.android.gms.internal.clearcut.x.f2576p
            r3 = 8
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.g0.i(com.google.android.gms.internal.clearcut.h3, java.lang.Object):int");
    }

    public static boolean j(Map.Entry<FieldDescriptorType, Object> entry) {
        j0 j0Var = (j0) entry.getKey();
        if (j0Var.f() == m3.MESSAGE) {
            j0Var.m();
            Object value = entry.getValue();
            if (value instanceof r1) {
                if (!((r1) value).c()) {
                    return false;
                }
            } else if (value instanceof y0) {
                return true;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        }
        return true;
    }

    public static int l(Map.Entry<FieldDescriptorType, Object> entry) {
        j0 j0Var = (j0) entry.getKey();
        Object value = entry.getValue();
        if (j0Var.f() != m3.MESSAGE) {
            return h(j0Var, value);
        }
        j0Var.m();
        j0Var.d();
        boolean z = value instanceof y0;
        ((j0) entry.getKey()).zzc();
        if (z) {
            int m02 = x.m0(2, 0) + (x.v0(1) << 1);
            int v02 = x.v0(3);
            int a10 = ((y0) value).a();
            return x.x0(a10) + a10 + v02 + m02;
        }
        int m03 = x.m0(2, 0) + (x.v0(1) << 1);
        int v03 = x.v0(3);
        int l = ((r1) value).l();
        return x.x0(l) + l + v03 + m03;
    }

    public static Object m(Object obj) {
        if (obj instanceof x1) {
            return ((x1) obj).f();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public final boolean a() {
        return this.f2421a.isEmpty();
    }

    public final boolean b() {
        int i10 = 0;
        while (true) {
            m2 m2Var = this.f2421a;
            if (i10 >= m2Var.e()) {
                for (Map.Entry j8 : m2Var.f()) {
                    if (!j(j8)) {
                        return false;
                    }
                }
                return true;
            } else if (!j(m2Var.c(i10))) {
                return false;
            } else {
                i10++;
            }
        }
    }

    public final Iterator<Map.Entry<FieldDescriptorType, Object>> c() {
        boolean z = this.f2423c;
        m2 m2Var = this.f2421a;
        return z ? new a1(((r2) m2Var.entrySet()).iterator()) : ((r2) m2Var.entrySet()).iterator();
    }

    public final /* synthetic */ Object clone() {
        m2 m2Var;
        g0 g0Var = new g0();
        int i10 = 0;
        while (true) {
            m2Var = this.f2421a;
            if (i10 >= m2Var.e()) {
                break;
            }
            Map.Entry c10 = m2Var.c(i10);
            g0Var.e((j0) c10.getKey(), c10.getValue());
            i10++;
        }
        for (Map.Entry entry : m2Var.f()) {
            g0Var.e((j0) entry.getKey(), entry.getValue());
        }
        g0Var.f2423c = this.f2423c;
        return g0Var;
    }

    public final void e(FieldDescriptorType fielddescriptortype, Object obj) {
        fielddescriptortype.m();
        fielddescriptortype.e();
        f((h3) null, obj);
        if (obj instanceof y0) {
            this.f2423c = true;
        }
        this.f2421a.put(fielddescriptortype, obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        return this.f2421a.equals(((g0) obj).f2421a);
    }

    public final int g() {
        m2 m2Var;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            m2Var = this.f2421a;
            if (i10 >= m2Var.e()) {
                break;
            }
            Map.Entry c10 = m2Var.c(i10);
            i11 += h((j0) c10.getKey(), c10.getValue());
            i10++;
        }
        for (Map.Entry entry : m2Var.f()) {
            i11 += h((j0) entry.getKey(), entry.getValue());
        }
        return i11;
    }

    public final int hashCode() {
        return this.f2421a.hashCode();
    }

    /* JADX WARNING: type inference failed for: r5v13, types: [com.google.android.gms.internal.clearcut.x1] */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void k(java.util.Map.Entry<FieldDescriptorType, java.lang.Object> r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r5.getKey()
            com.google.android.gms.internal.clearcut.j0 r0 = (com.google.android.gms.internal.clearcut.j0) r0
            java.lang.Object r5 = r5.getValue()
            boolean r1 = r5 instanceof com.google.android.gms.internal.clearcut.y0
            if (r1 != 0) goto L_0x0086
            r0.m()
            com.google.android.gms.internal.clearcut.m3 r1 = r0.f()
            com.google.android.gms.internal.clearcut.m3 r2 = com.google.android.gms.internal.clearcut.m3.MESSAGE
            com.google.android.gms.internal.clearcut.m2 r3 = r4.f2421a
            if (r1 != r2) goto L_0x007e
            java.lang.Object r1 = r3.get(r0)
            boolean r2 = r1 instanceof com.google.android.gms.internal.clearcut.y0
            if (r2 != 0) goto L_0x0076
            if (r1 != 0) goto L_0x0026
            goto L_0x007e
        L_0x0026:
            boolean r2 = r1 instanceof com.google.android.gms.internal.clearcut.x1
            if (r2 == 0) goto L_0x0033
            com.google.android.gms.internal.clearcut.x1 r1 = (com.google.android.gms.internal.clearcut.x1) r1
            com.google.android.gms.internal.clearcut.x1 r5 = (com.google.android.gms.internal.clearcut.x1) r5
            com.google.android.gms.internal.clearcut.x1 r5 = r0.zza()
            goto L_0x006c
        L_0x0033:
            com.google.android.gms.internal.clearcut.r1 r1 = (com.google.android.gms.internal.clearcut.r1) r1
            com.google.android.gms.internal.clearcut.p0$a r1 = r1.j()
            com.google.android.gms.internal.clearcut.r1 r5 = (com.google.android.gms.internal.clearcut.r1) r5
            com.google.android.gms.internal.clearcut.p0$a r5 = r0.h(r1, r5)
            com.google.android.gms.internal.clearcut.p0 r5 = r5.n()
            r1 = 1
            java.lang.Object r2 = r5.e(r1)
            java.lang.Byte r2 = (java.lang.Byte) r2
            byte r2 = r2.byteValue()
            if (r2 != r1) goto L_0x0051
            goto L_0x006a
        L_0x0051:
            if (r2 != 0) goto L_0x0055
            r1 = 0
            goto L_0x006a
        L_0x0055:
            com.google.android.gms.internal.clearcut.d2 r1 = com.google.android.gms.internal.clearcut.d2.f2398c
            r1.getClass()
            java.lang.Class r2 = r5.getClass()
            com.google.android.gms.internal.clearcut.i2 r1 = r1.a(r2)
            boolean r1 = r1.h(r5)
            r2 = 2
            r5.e(r2)
        L_0x006a:
            if (r1 == 0) goto L_0x0070
        L_0x006c:
            r3.put(r0, r5)
            return
        L_0x0070:
            com.google.android.gms.internal.clearcut.t2 r5 = new com.google.android.gms.internal.clearcut.t2
            r5.<init>()
            throw r5
        L_0x0076:
            int r5 = com.google.android.gms.internal.clearcut.y0.f2595c
            java.lang.NoSuchMethodError r5 = new java.lang.NoSuchMethodError
            r5.<init>()
            throw r5
        L_0x007e:
            java.lang.Object r5 = m(r5)
            r3.put(r0, r5)
            return
        L_0x0086:
            int r5 = com.google.android.gms.internal.clearcut.y0.f2595c
            java.lang.NoSuchMethodError r5 = new java.lang.NoSuchMethodError
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.g0.k(java.util.Map$Entry):void");
    }

    public g0(int i10) {
        int i11 = l2.u;
        m2 m2Var = new m2(0);
        this.f2421a = m2Var;
        if (!this.f2422b) {
            m2Var.i();
            this.f2422b = true;
        }
    }
}
