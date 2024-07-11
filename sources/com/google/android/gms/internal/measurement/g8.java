package com.google.android.gms.internal.measurement;

import java.util.Arrays;

public final class g8 extends e8<f8, f8> {
    public final /* bridge */ /* synthetic */ void a(int i10, long j8, Object obj) {
        ((f8) obj).c(i10 << 3, Long.valueOf(j8));
    }

    public final /* bridge */ /* synthetic */ f8 b() {
        return f8.a();
    }

    public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
        ((f6) obj).zzc = (f8) obj2;
    }

    public final /* bridge */ /* synthetic */ f8 d(Object obj) {
        return ((f6) obj).zzc;
    }

    public final void e(Object obj) {
        ((f6) obj).zzc.f2704e = false;
    }

    public final Object f(Object obj, Object obj2) {
        f8 f8Var = (f8) obj2;
        if (f8Var.equals(f8.f2700f)) {
            return obj;
        }
        f8 f8Var2 = (f8) obj;
        int i10 = f8Var2.f2701a + f8Var.f2701a;
        int[] copyOf = Arrays.copyOf(f8Var2.f2702b, i10);
        System.arraycopy(f8Var.f2702b, 0, copyOf, f8Var2.f2701a, f8Var.f2701a);
        Object[] copyOf2 = Arrays.copyOf(f8Var2.f2703c, i10);
        System.arraycopy(f8Var.f2703c, 0, copyOf2, f8Var2.f2701a, f8Var.f2701a);
        return new f8(i10, copyOf, copyOf2, true);
    }

    public final int g(Object obj) {
        f8 f8Var = (f8) obj;
        int i10 = f8Var.d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < f8Var.f2701a; i12++) {
            int i13 = f8Var.f2702b[i12];
            int Z0 = n5.Z0(8);
            int i14 = ((k5) f8Var.f2703c[i12]).i();
            i11 += n5.Z0(i14) + i14 + n5.Z0(24) + n5.Z0(i13 >>> 3) + n5.Z0(16) + Z0 + Z0;
        }
        f8Var.d = i11;
        return i11;
    }

    public final /* bridge */ /* synthetic */ int h(Object obj) {
        return ((f8) obj).b();
    }

    public final /* bridge */ /* synthetic */ void i(Object obj, o5 o5Var) {
        ((f8) obj).d(o5Var);
    }
}
