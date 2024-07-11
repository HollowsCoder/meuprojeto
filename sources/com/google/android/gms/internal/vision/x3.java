package com.google.android.gms.internal.vision;

import java.util.Arrays;

public final class x3 extends w3<y3, y3> {
    public final y3 a() {
        return new y3();
    }

    public final /* synthetic */ void b(int i10, long j8, Object obj) {
        ((y3) obj).a(i10 << 3, Long.valueOf(j8));
    }

    public final /* synthetic */ void c(Object obj, b1 b1Var) {
        ((y3) obj).b(b1Var);
    }

    public final void d(Object obj, Object obj2) {
        ((q1) obj).zzb = (y3) obj2;
    }

    public final /* synthetic */ y3 e(Object obj) {
        return ((q1) obj).zzb;
    }

    public final void f(Object obj, b1 b1Var) {
        y3 y3Var = (y3) obj;
        y3Var.getClass();
        b1Var.getClass();
        for (int i10 = 0; i10 < y3Var.f3190a; i10++) {
            b1Var.g(y3Var.f3191b[i10] >>> 3, y3Var.f3192c[i10]);
        }
    }

    public final y3 g(Object obj, Object obj2) {
        y3 y3Var = (y3) obj;
        y3 y3Var2 = (y3) obj2;
        if (y3Var2.equals(y3.f3189f)) {
            return y3Var;
        }
        int i10 = y3Var.f3190a + y3Var2.f3190a;
        int[] copyOf = Arrays.copyOf(y3Var.f3191b, i10);
        System.arraycopy(y3Var2.f3191b, 0, copyOf, y3Var.f3190a, y3Var2.f3190a);
        Object[] copyOf2 = Arrays.copyOf(y3Var.f3192c, i10);
        System.arraycopy(y3Var2.f3192c, 0, copyOf2, y3Var.f3190a, y3Var2.f3190a);
        return new y3(i10, copyOf, copyOf2, true);
    }

    public final void h(Object obj) {
        ((q1) obj).zzb.f3193e = false;
    }

    public final int i(Object obj) {
        y3 y3Var = (y3) obj;
        int i10 = y3Var.d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < y3Var.f3190a; i12++) {
            i11 += a1.X(3, (w0) y3Var.f3192c[i12]) + a1.m0(2, y3Var.f3191b[i12] >>> 3) + (a1.n0(8) << 1);
        }
        y3Var.d = i11;
        return i11;
    }

    public final /* synthetic */ int j(Object obj) {
        return ((y3) obj).c();
    }
}
