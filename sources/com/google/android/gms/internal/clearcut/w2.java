package com.google.android.gms.internal.clearcut;

import java.util.Arrays;

public final class w2 extends u2<v2, v2> {
    public final /* synthetic */ void a(int i10, long j8, Object obj) {
        ((v2) obj).c(i10 << 3, Long.valueOf(j8));
    }

    public final /* synthetic */ void b(Object obj, y yVar) {
        ((v2) obj).b(yVar);
    }

    public final void c(Object obj) {
        ((p0) obj).zzjp.f2570e = false;
    }

    public final void d(Object obj, y yVar) {
        v2 v2Var = (v2) obj;
        v2Var.getClass();
        yVar.getClass();
        for (int i10 = 0; i10 < v2Var.f2567a; i10++) {
            yVar.f(v2Var.f2568b[i10] >>> 3, v2Var.f2569c[i10]);
        }
    }

    public final v2 e() {
        return new v2();
    }

    public final void f(Object obj, Object obj2) {
        ((p0) obj).zzjp = (v2) obj2;
    }

    public final v2 g(Object obj, Object obj2) {
        v2 v2Var = (v2) obj;
        v2 v2Var2 = (v2) obj2;
        if (v2Var2.equals(v2.f2566f)) {
            return v2Var;
        }
        int i10 = v2Var.f2567a + v2Var2.f2567a;
        int[] copyOf = Arrays.copyOf(v2Var.f2568b, i10);
        System.arraycopy(v2Var2.f2568b, 0, copyOf, v2Var.f2567a, v2Var2.f2567a);
        Object[] copyOf2 = Arrays.copyOf(v2Var.f2569c, i10);
        System.arraycopy(v2Var2.f2569c, 0, copyOf2, v2Var.f2567a, v2Var2.f2567a);
        return new v2(i10, copyOf, copyOf2, true);
    }

    public final /* synthetic */ int h(Object obj) {
        return ((v2) obj).a();
    }

    public final /* synthetic */ v2 i(Object obj) {
        return ((p0) obj).zzjp;
    }

    public final int j(Object obj) {
        v2 v2Var = (v2) obj;
        int i10 = v2Var.d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < v2Var.f2567a; i12++) {
            i11 += x.Y(3, (u) v2Var.f2569c[i12]) + x.m0(2, v2Var.f2568b[i12] >>> 3) + (x.v0(1) << 1);
        }
        v2Var.d = i11;
        return i11;
    }
}
