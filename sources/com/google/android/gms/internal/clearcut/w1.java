package com.google.android.gms.internal.clearcut;

import java.util.Iterator;
import java.util.Map;
import s6.a;

public final class w1<T> implements i2<T> {

    /* renamed from: a  reason: collision with root package name */
    public final r1 f2572a;

    /* renamed from: b  reason: collision with root package name */
    public final u2<?, ?> f2573b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f2574c;
    public final c0<?> d;

    public w1(u2<?, ?> u2Var, c0<?> c0Var, r1 r1Var) {
        this.f2573b = u2Var;
        this.f2574c = c0Var.f(r1Var);
        this.d = c0Var;
        this.f2572a = r1Var;
    }

    public final void a(T t10) {
        this.f2573b.c(t10);
        this.d.e(t10);
    }

    public final void b(T t10, T t11) {
        Class<?> cls = k2.f2474a;
        u2<?, ?> u2Var = this.f2573b;
        u2Var.f(t10, u2Var.g(u2Var.i(t10), u2Var.i(t11)));
        if (this.f2574c) {
            k2.f(this.d, t10, t11);
        }
    }

    public final void c(T t10, byte[] bArr, int i10, int i11, r rVar) {
        int i12;
        p0 p0Var = (p0) t10;
        v2 v2Var = p0Var.zzjp;
        if (v2Var == v2.f2566f) {
            v2Var = new v2();
            p0Var.zzjp = v2Var;
        }
        while (i10 < i11) {
            int S = a.S(bArr, i10, rVar);
            int i13 = rVar.f2534a;
            if (i13 == 11) {
                int i14 = 0;
                u uVar = null;
                while (true) {
                    if (S >= i11) {
                        i12 = S;
                        break;
                    }
                    i12 = a.S(bArr, S, rVar);
                    int i15 = rVar.f2534a;
                    int i16 = i15 >>> 3;
                    int i17 = i15 & 7;
                    if (i16 != 2) {
                        if (i16 == 3 && i17 == 2) {
                            S = a.t0(bArr, i12, rVar);
                            uVar = (u) rVar.f2536c;
                        }
                    } else if (i17 == 0) {
                        S = a.S(bArr, i12, rVar);
                        i14 = rVar.f2534a;
                    }
                    if (i15 == 12) {
                        break;
                    }
                    S = a.O(i15, bArr, i12, i11, rVar);
                }
                if (uVar != null) {
                    v2Var.c((i14 << 3) | 2, uVar);
                }
                i10 = i12;
            } else if ((i13 & 7) == 2) {
                i10 = a.Q(i13, bArr, S, i11, v2Var, rVar);
            } else {
                i10 = a.O(i13, bArr, S, i11, rVar);
            }
        }
        if (i10 != i11) {
            throw v0.b();
        }
    }

    public final int d(T t10) {
        m2 m2Var;
        u2<?, ?> u2Var = this.f2573b;
        int i10 = 0;
        int j8 = u2Var.j(u2Var.i(t10)) + 0;
        if (!this.f2574c) {
            return j8;
        }
        g0<?> a10 = this.d.a(t10);
        int i11 = 0;
        while (true) {
            m2Var = a10.f2421a;
            if (i10 >= m2Var.e()) {
                break;
            }
            i11 += g0.l(m2Var.c(i10));
            i10++;
        }
        for (Map.Entry l : m2Var.f()) {
            i11 += g0.l(l);
        }
        return j8 + i11;
    }

    public final void e(Object obj, y yVar) {
        Object obj2;
        Iterator<Map.Entry<?, Object>> c10 = this.d.a(obj).c();
        while (c10.hasNext()) {
            Map.Entry next = c10.next();
            j0 j0Var = (j0) next.getKey();
            if (j0Var.f() == m3.MESSAGE) {
                j0Var.m();
                j0Var.d();
                boolean z = next instanceof z0;
                j0Var.zzc();
                if (z) {
                    obj2 = ((z0) next).f2602o.getValue().c();
                } else {
                    obj2 = next.getValue();
                }
                yVar.f(0, obj2);
            } else {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
        }
        u2<?, ?> u2Var = this.f2573b;
        u2Var.d(u2Var.i(obj), yVar);
    }

    public final boolean f(T t10, T t11) {
        u2<?, ?> u2Var = this.f2573b;
        if (!u2Var.i(t10).equals(u2Var.i(t11))) {
            return false;
        }
        if (!this.f2574c) {
            return true;
        }
        c0<?> c0Var = this.d;
        return c0Var.a(t10).equals(c0Var.a(t11));
    }

    public final T g() {
        return this.f2572a.k().n();
    }

    public final boolean h(T t10) {
        return this.d.a(t10).b();
    }

    public final int i(T t10) {
        int hashCode = this.f2573b.i(t10).hashCode();
        return this.f2574c ? (hashCode * 53) + this.d.a(t10).hashCode() : hashCode;
    }
}
