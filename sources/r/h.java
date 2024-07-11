package r;

import java.util.HashSet;
import java.util.Iterator;
import q.d;
import q.e;
import q.f;
import q.g;
import r.b;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final b.a f8308a = new b.a();

    public static boolean a(e eVar) {
        f fVar;
        boolean z;
        boolean z10;
        e.b bVar;
        e.b bVar2;
        e.b[] bVarArr = eVar.U;
        e.b bVar3 = bVarArr[0];
        e.b bVar4 = bVarArr[1];
        e eVar2 = eVar.V;
        if (eVar2 != null) {
            fVar = (f) eVar2;
        } else {
            fVar = null;
        }
        if (fVar != null) {
            e.b bVar5 = fVar.U[0];
            e.b bVar6 = e.b.FIXED;
        }
        if (fVar != null) {
            e.b bVar7 = fVar.U[1];
            e.b bVar8 = e.b.FIXED;
        }
        e.b bVar9 = e.b.FIXED;
        if (bVar3 == bVar9 || eVar.u() || bVar3 == e.b.WRAP_CONTENT || ((bVar3 == (bVar2 = e.b.MATCH_CONSTRAINT) && eVar.f8183r == 0 && eVar.Y == 0.0f && eVar.n(0)) || (bVar3 == bVar2 && eVar.f8183r == 1 && eVar.o(0, eVar.k())))) {
            z = true;
        } else {
            z = false;
        }
        if (bVar4 == bVar9 || eVar.v() || bVar4 == e.b.WRAP_CONTENT || ((bVar4 == (bVar = e.b.MATCH_CONSTRAINT) && eVar.f8184s == 0 && eVar.Y == 0.0f && eVar.n(1)) || (bVar3 == bVar && eVar.f8184s == 1 && eVar.o(1, eVar.i())))) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (eVar.Y > 0.0f && (z || z10)) {
            return true;
        }
        if (!z || !z10) {
            return false;
        }
        return true;
    }

    public static void b(int i10, e eVar, b.C0118b bVar, boolean z) {
        boolean z10;
        d dVar;
        d dVar2;
        d dVar3;
        boolean z11;
        d dVar4;
        d dVar5;
        e eVar2 = eVar;
        b.C0118b bVar2 = bVar;
        boolean z12 = z;
        if (!eVar2.f8173m) {
            if (!(eVar2 instanceof f) && eVar.t() && a(eVar)) {
                f.L(eVar2, bVar2, new b.a());
            }
            d g10 = eVar2.g(d.b.LEFT);
            d g11 = eVar2.g(d.b.RIGHT);
            int c10 = g10.c();
            int c11 = g11.c();
            HashSet<d> hashSet = g10.f8142a;
            char c12 = 0;
            if (hashSet != null && g10.f8144c) {
                Iterator<d> it = hashSet.iterator();
                while (it.hasNext()) {
                    d next = it.next();
                    e eVar3 = next.d;
                    int i11 = i10 + 1;
                    boolean a10 = a(eVar3);
                    if (eVar3.t() && a10) {
                        f.L(eVar3, bVar2, new b.a());
                    }
                    e.b bVar3 = eVar3.U[c12];
                    e.b bVar4 = e.b.MATCH_CONSTRAINT;
                    d dVar6 = eVar3.J;
                    d dVar7 = eVar3.L;
                    if (bVar3 != bVar4 || a10) {
                        if (!eVar3.t()) {
                            if (next == dVar6 && dVar7.f8146f == null) {
                                int d = dVar6.d() + c10;
                                eVar3.z(d, eVar3.k() + d);
                            } else if (next == dVar7 && dVar6.f8146f == null) {
                                int d10 = c10 - dVar7.d();
                                eVar3.z(d10 - eVar3.k(), d10);
                            } else if (next == dVar6 && (dVar3 = dVar7.f8146f) != null && dVar3.f8144c && !eVar3.r()) {
                                c(i11, eVar3, bVar2, z12);
                            }
                            b(i11, eVar3, bVar2, z12);
                        }
                    } else if (bVar3 == bVar4 && eVar3.f8186v >= 0 && eVar3.u >= 0 && ((eVar3.f8167i0 == 8 || (eVar3.f8183r == 0 && eVar3.Y == 0.0f)) && !eVar3.r() && !eVar3.G)) {
                        if ((next != dVar6 || (dVar5 = dVar7.f8146f) == null || !dVar5.f8144c) && (next != dVar7 || (dVar4 = dVar6.f8146f) == null || !dVar4.f8144c)) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        if (z11 && !eVar3.r()) {
                            d(i11, eVar2, bVar2, eVar3, z12);
                        }
                    }
                    c12 = 0;
                }
            }
            if (!(eVar2 instanceof g)) {
                HashSet<d> hashSet2 = g11.f8142a;
                if (hashSet2 != null && g11.f8144c) {
                    Iterator<d> it2 = hashSet2.iterator();
                    while (it2.hasNext()) {
                        d next2 = it2.next();
                        e eVar4 = next2.d;
                        int i12 = i10 + 1;
                        boolean a11 = a(eVar4);
                        if (eVar4.t() && a11) {
                            f.L(eVar4, bVar2, new b.a());
                        }
                        d dVar8 = eVar4.J;
                        d dVar9 = eVar4.L;
                        if ((next2 != dVar8 || (dVar2 = dVar9.f8146f) == null || !dVar2.f8144c) && (next2 != dVar9 || (dVar = dVar8.f8146f) == null || !dVar.f8144c)) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        e.b bVar5 = eVar4.U[0];
                        e.b bVar6 = e.b.MATCH_CONSTRAINT;
                        if (bVar5 != bVar6 || a11) {
                            if (!eVar4.t()) {
                                if (next2 == dVar8 && dVar9.f8146f == null) {
                                    int d11 = dVar8.d() + c11;
                                    eVar4.z(d11, eVar4.k() + d11);
                                } else if (next2 == dVar9 && dVar8.f8146f == null) {
                                    int d12 = c11 - dVar9.d();
                                    eVar4.z(d12 - eVar4.k(), d12);
                                } else if (z10 && !eVar4.r()) {
                                    c(i12, eVar4, bVar2, z12);
                                }
                                b(i12, eVar4, bVar2, z12);
                            }
                        } else if (bVar5 == bVar6 && eVar4.f8186v >= 0 && eVar4.u >= 0) {
                            if (eVar4.f8167i0 != 8) {
                                if (eVar4.f8183r == 0) {
                                    if (eVar4.Y != 0.0f) {
                                    }
                                }
                            }
                            if (!eVar4.r() && !eVar4.G && z10 && !eVar4.r()) {
                                d(i12, eVar2, bVar2, eVar4, z12);
                            }
                        }
                    }
                }
                eVar2.f8173m = true;
            }
        }
    }

    public static void c(int i10, e eVar, b.C0118b bVar, boolean z) {
        float f10;
        float f11 = eVar.f8161f0;
        d dVar = eVar.J;
        int c10 = dVar.f8146f.c();
        d dVar2 = eVar.L;
        int c11 = dVar2.f8146f.c();
        int d = dVar.d() + c10;
        int d10 = c11 - dVar2.d();
        if (c10 == c11) {
            f11 = 0.5f;
        } else {
            c10 = d;
            c11 = d10;
        }
        int k10 = eVar.k();
        int i11 = (c11 - c10) - k10;
        if (c10 > c11) {
            i11 = (c10 - c11) - k10;
        }
        if (i11 > 0) {
            f10 = (f11 * ((float) i11)) + 0.5f;
        } else {
            f10 = f11 * ((float) i11);
        }
        int i12 = ((int) f10) + c10;
        int i13 = i12 + k10;
        if (c10 > c11) {
            i13 = i12 - k10;
        }
        eVar.z(i12, i13);
        b(i10 + 1, eVar, bVar, z);
    }

    public static void d(int i10, e eVar, b.C0118b bVar, e eVar2, boolean z) {
        float f10 = eVar2.f8161f0;
        d dVar = eVar2.J;
        int d = dVar.d() + dVar.f8146f.c();
        d dVar2 = eVar2.L;
        int c10 = dVar2.f8146f.c() - dVar2.d();
        if (c10 >= d) {
            int k10 = eVar2.k();
            if (eVar2.f8167i0 != 8) {
                int i11 = eVar2.f8183r;
                if (i11 == 2) {
                    if (!(eVar instanceof f)) {
                        eVar = eVar.V;
                    }
                    k10 = (int) (eVar2.f8161f0 * 0.5f * ((float) eVar.k()));
                } else if (i11 == 0) {
                    k10 = c10 - d;
                }
                k10 = Math.max(eVar2.u, k10);
                int i12 = eVar2.f8186v;
                if (i12 > 0) {
                    k10 = Math.min(i12, k10);
                }
            }
            int i13 = d + ((int) ((f10 * ((float) ((c10 - d) - k10))) + 0.5f));
            eVar2.z(i13, k10 + i13);
            b(i10 + 1, eVar2, bVar, z);
        }
    }

    public static void e(int i10, e eVar, b.C0118b bVar) {
        float f10;
        float f11 = eVar.f8163g0;
        d dVar = eVar.K;
        int c10 = dVar.f8146f.c();
        d dVar2 = eVar.M;
        int c11 = dVar2.f8146f.c();
        int d = dVar.d() + c10;
        int d10 = c11 - dVar2.d();
        if (c10 == c11) {
            f11 = 0.5f;
        } else {
            c10 = d;
            c11 = d10;
        }
        int i11 = eVar.i();
        int i12 = (c11 - c10) - i11;
        if (c10 > c11) {
            i12 = (c10 - c11) - i11;
        }
        if (i12 > 0) {
            f10 = (f11 * ((float) i12)) + 0.5f;
        } else {
            f10 = f11 * ((float) i12);
        }
        int i13 = (int) f10;
        int i14 = c10 + i13;
        int i15 = i14 + i11;
        if (c10 > c11) {
            i14 = c10 - i13;
            i15 = i14 - i11;
        }
        eVar.A(i14, i15);
        g(i10 + 1, eVar, bVar);
    }

    public static void f(int i10, e eVar, b.C0118b bVar, e eVar2) {
        float f10 = eVar2.f8163g0;
        d dVar = eVar2.K;
        int d = dVar.d() + dVar.f8146f.c();
        d dVar2 = eVar2.M;
        int c10 = dVar2.f8146f.c() - dVar2.d();
        if (c10 >= d) {
            int i11 = eVar2.i();
            if (eVar2.f8167i0 != 8) {
                int i12 = eVar2.f8184s;
                if (i12 == 2) {
                    if (!(eVar instanceof f)) {
                        eVar = eVar.V;
                    }
                    i11 = (int) (f10 * 0.5f * ((float) eVar.i()));
                } else if (i12 == 0) {
                    i11 = c10 - d;
                }
                i11 = Math.max(eVar2.f8187x, i11);
                int i13 = eVar2.f8188y;
                if (i13 > 0) {
                    i11 = Math.min(i13, i11);
                }
            }
            int i14 = d + ((int) ((f10 * ((float) ((c10 - d) - i11))) + 0.5f));
            eVar2.A(i14, i11 + i14);
            g(i10 + 1, eVar2, bVar);
        }
    }

    public static void g(int i10, e eVar, b.C0118b bVar) {
        d dVar;
        boolean z;
        d dVar2;
        d dVar3;
        d dVar4;
        boolean z10;
        d dVar5;
        d dVar6;
        e eVar2 = eVar;
        b.C0118b bVar2 = bVar;
        if (!eVar2.f8175n) {
            if (!(eVar2 instanceof f) && eVar.t() && a(eVar)) {
                f.L(eVar2, bVar2, new b.a());
            }
            d g10 = eVar2.g(d.b.TOP);
            d g11 = eVar2.g(d.b.BOTTOM);
            int c10 = g10.c();
            int c11 = g11.c();
            HashSet<d> hashSet = g10.f8142a;
            char c12 = 1;
            if (hashSet != null && g10.f8144c) {
                Iterator<d> it = hashSet.iterator();
                while (it.hasNext()) {
                    d next = it.next();
                    e eVar3 = next.d;
                    int i11 = i10 + 1;
                    boolean a10 = a(eVar3);
                    if (eVar3.t() && a10) {
                        f.L(eVar3, bVar2, new b.a());
                    }
                    e.b bVar3 = eVar3.U[c12];
                    e.b bVar4 = e.b.MATCH_CONSTRAINT;
                    d dVar7 = eVar3.K;
                    d dVar8 = eVar3.M;
                    if (bVar3 != bVar4 || a10) {
                        if (!eVar3.t()) {
                            if (next == dVar7 && dVar8.f8146f == null) {
                                int d = dVar7.d() + c10;
                                eVar3.A(d, eVar3.i() + d);
                            } else if (next == dVar8 && dVar8.f8146f == null) {
                                int d10 = c10 - dVar8.d();
                                eVar3.A(d10 - eVar3.i(), d10);
                            } else if (next == dVar7 && (dVar4 = dVar8.f8146f) != null && dVar4.f8144c) {
                                e(i11, eVar3, bVar2);
                            }
                            g(i11, eVar3, bVar2);
                        }
                    } else if (bVar3 == bVar4 && eVar3.f8188y >= 0 && eVar3.f8187x >= 0 && ((eVar3.f8167i0 == 8 || (eVar3.f8184s == 0 && eVar3.Y == 0.0f)) && !eVar3.s() && !eVar3.G)) {
                        if ((next != dVar7 || (dVar6 = dVar8.f8146f) == null || !dVar6.f8144c) && (next != dVar8 || (dVar5 = dVar7.f8146f) == null || !dVar5.f8144c)) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        if (z10 && !eVar3.s()) {
                            f(i11, eVar2, bVar2, eVar3);
                        }
                    }
                    c12 = 1;
                }
            }
            if (!(eVar2 instanceof g)) {
                HashSet<d> hashSet2 = g11.f8142a;
                if (hashSet2 != null && g11.f8144c) {
                    Iterator<d> it2 = hashSet2.iterator();
                    while (it2.hasNext()) {
                        d next2 = it2.next();
                        e eVar4 = next2.d;
                        int i12 = i10 + 1;
                        boolean a11 = a(eVar4);
                        if (eVar4.t() && a11) {
                            f.L(eVar4, bVar2, new b.a());
                        }
                        d dVar9 = eVar4.K;
                        d dVar10 = eVar4.M;
                        if ((next2 != dVar9 || (dVar3 = dVar10.f8146f) == null || !dVar3.f8144c) && (next2 != dVar10 || (dVar2 = dVar9.f8146f) == null || !dVar2.f8144c)) {
                            z = false;
                        } else {
                            z = true;
                        }
                        e.b bVar5 = eVar4.U[1];
                        e.b bVar6 = e.b.MATCH_CONSTRAINT;
                        if (bVar5 != bVar6 || a11) {
                            if (!eVar4.t()) {
                                if (next2 == dVar9 && dVar10.f8146f == null) {
                                    int d11 = dVar9.d() + c11;
                                    eVar4.A(d11, eVar4.i() + d11);
                                } else if (next2 == dVar10 && dVar9.f8146f == null) {
                                    int d12 = c11 - dVar10.d();
                                    eVar4.A(d12 - eVar4.i(), d12);
                                } else if (z && !eVar4.s()) {
                                    e(i12, eVar4, bVar2);
                                }
                                g(i12, eVar4, bVar2);
                            }
                        } else if (bVar5 == bVar6 && eVar4.f8188y >= 0 && eVar4.f8187x >= 0) {
                            if ((eVar4.f8167i0 == 8 || (eVar4.f8184s == 0 && eVar4.Y == 0.0f)) && !eVar4.s() && !eVar4.G && z && !eVar4.s()) {
                                f(i12, eVar2, bVar2, eVar4);
                            }
                        }
                    }
                }
                d g12 = eVar2.g(d.b.BASELINE);
                if (g12.f8142a != null && g12.f8144c) {
                    int c13 = g12.c();
                    Iterator<d> it3 = g12.f8142a.iterator();
                    while (it3.hasNext()) {
                        d next3 = it3.next();
                        e eVar5 = next3.d;
                        int i13 = i10 + 1;
                        boolean a12 = a(eVar5);
                        if (eVar5.t() && a12) {
                            f.L(eVar5, bVar2, new b.a());
                        }
                        if ((eVar5.U[1] != e.b.MATCH_CONSTRAINT || a12) && !eVar5.t() && next3 == (dVar = eVar5.N)) {
                            int d13 = next3.d() + c13;
                            if (eVar5.E) {
                                int i14 = d13 - eVar5.f8156c0;
                                int i15 = eVar5.X + i14;
                                eVar5.f8154b0 = i14;
                                eVar5.K.i(i14);
                                eVar5.M.i(i15);
                                dVar.i(d13);
                                eVar5.l = true;
                            }
                            g(i13, eVar5, bVar2);
                        }
                    }
                }
                eVar2.f8175n = true;
            }
        }
    }
}
