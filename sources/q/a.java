package q;

import androidx.appcompat.widget.x0;
import o.b;
import o.g;
import q.d;
import q.e;

public final class a extends i {
    public int t0 = 0;

    /* renamed from: u0  reason: collision with root package name */
    public boolean f8124u0 = true;

    /* renamed from: v0  reason: collision with root package name */
    public int f8125v0 = 0;

    /* renamed from: w0  reason: collision with root package name */
    public boolean f8126w0 = false;

    public final boolean I() {
        int i10;
        d.b bVar;
        d.b bVar2;
        d.b bVar3;
        int i11;
        int i12;
        boolean z = true;
        int i13 = 0;
        while (true) {
            i10 = this.f8203s0;
            if (i13 >= i10) {
                break;
            }
            e eVar = this.f8202r0[i13];
            if ((this.f8124u0 || eVar.c()) && ((((i11 = this.t0) == 0 || i11 == 1) && !eVar.u()) || (((i12 = this.t0) == 2 || i12 == 3) && !eVar.v()))) {
                z = false;
            }
            i13++;
        }
        if (!z || i10 <= 0) {
            return false;
        }
        int i14 = 0;
        boolean z10 = false;
        for (int i15 = 0; i15 < this.f8203s0; i15++) {
            e eVar2 = this.f8202r0[i15];
            if (this.f8124u0 || eVar2.c()) {
                if (!z10) {
                    int i16 = this.t0;
                    if (i16 == 0) {
                        bVar3 = d.b.LEFT;
                    } else if (i16 == 1) {
                        bVar3 = d.b.RIGHT;
                    } else if (i16 == 2) {
                        bVar3 = d.b.TOP;
                    } else {
                        if (i16 == 3) {
                            bVar3 = d.b.BOTTOM;
                        }
                        z10 = true;
                    }
                    i14 = eVar2.g(bVar3).c();
                    z10 = true;
                }
                int i17 = this.t0;
                if (i17 == 0) {
                    bVar2 = d.b.LEFT;
                } else {
                    if (i17 == 1) {
                        bVar = d.b.RIGHT;
                    } else if (i17 == 2) {
                        bVar2 = d.b.TOP;
                    } else if (i17 == 3) {
                        bVar = d.b.BOTTOM;
                    }
                    i14 = Math.max(i14, eVar2.g(bVar).c());
                }
                i14 = Math.min(i14, eVar2.g(bVar2).c());
            }
        }
        int i18 = i14 + this.f8125v0;
        int i19 = this.t0;
        if (i19 == 0 || i19 == 1) {
            z(i18, i18);
        } else {
            A(i18, i18);
        }
        this.f8126w0 = true;
        return true;
    }

    public final int J() {
        int i10 = this.t0;
        if (i10 == 0 || i10 == 1) {
            return 0;
        }
        return (i10 == 2 || i10 == 3) ? 1 : -1;
    }

    public final void b(o.d dVar, boolean z) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i10;
        d dVar2;
        g gVar;
        int i11;
        int i12;
        int i13;
        int i14;
        g gVar2;
        o.d dVar3 = dVar;
        d[] dVarArr = this.R;
        d dVar4 = this.J;
        dVarArr[0] = dVar4;
        int i15 = 2;
        d dVar5 = this.K;
        dVarArr[2] = dVar5;
        d dVar6 = this.L;
        dVarArr[1] = dVar6;
        d dVar7 = this.M;
        dVarArr[3] = dVar7;
        for (d dVar8 : dVarArr) {
            dVar8.f8149i = dVar3.l(dVar8);
        }
        int i16 = this.t0;
        if (i16 >= 0 && i16 < 4) {
            d dVar9 = dVarArr[i16];
            if (!this.f8126w0) {
                I();
            }
            if (this.f8126w0) {
                this.f8126w0 = false;
                int i17 = this.t0;
                if (i17 == 0 || i17 == 1) {
                    dVar3.d(dVar4.f8149i, this.f8152a0);
                    gVar2 = dVar6.f8149i;
                    i14 = this.f8152a0;
                } else if (i17 == 2 || i17 == 3) {
                    dVar3.d(dVar5.f8149i, this.f8154b0);
                    gVar2 = dVar7.f8149i;
                    i14 = this.f8154b0;
                } else {
                    return;
                }
                dVar3.d(gVar2, i14);
                return;
            }
            int i18 = 0;
            while (true) {
                if (i18 >= this.f8203s0) {
                    z10 = false;
                    break;
                }
                e eVar = this.f8202r0[i18];
                if ((this.f8124u0 || eVar.c()) && ((((i13 = this.t0) == 0 || i13 == 1) && eVar.U[0] == e.b.MATCH_CONSTRAINT && eVar.J.f8146f != null && eVar.L.f8146f != null) || ((i13 == 2 || i13 == 3) && eVar.U[1] == e.b.MATCH_CONSTRAINT && eVar.K.f8146f != null && eVar.M.f8146f != null))) {
                    z10 = true;
                } else {
                    i18++;
                }
            }
            z10 = true;
            if (dVar4.e() || dVar6.e()) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (dVar5.e() || dVar7.e()) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z10 || (((i12 = this.t0) != 0 || !z11) && ((i12 != 2 || !z12) && ((i12 != 1 || !z11) && (i12 != 3 || !z12))))) {
                z13 = false;
            } else {
                z13 = true;
            }
            if (!z13) {
                i10 = 4;
            } else {
                i10 = 5;
            }
            int i19 = 0;
            while (i19 < this.f8203s0) {
                e eVar2 = this.f8202r0[i19];
                if (this.f8124u0 || eVar2.c()) {
                    g l = dVar3.l(eVar2.R[this.t0]);
                    int i20 = this.t0;
                    d dVar10 = eVar2.R[i20];
                    dVar10.f8149i = l;
                    d dVar11 = dVar10.f8146f;
                    if (dVar11 == null || dVar11.d != this) {
                        i11 = 0;
                    } else {
                        i11 = dVar10.f8147g + 0;
                    }
                    if (i20 == 0 || i20 == i15) {
                        b m10 = dVar.m();
                        g n10 = dVar.n();
                        n10.f7564r = 0;
                        m10.d(dVar9.f8149i, l, n10, this.f8125v0 - i11);
                        dVar3.c(m10);
                    } else {
                        b m11 = dVar.m();
                        g n11 = dVar.n();
                        n11.f7564r = 0;
                        m11.c(dVar9.f8149i, l, n11, this.f8125v0 + i11);
                        dVar3.c(m11);
                    }
                    dVar3.e(dVar9.f8149i, l, this.f8125v0 + i11, i10);
                }
                i19++;
                i15 = 2;
            }
            int i21 = this.t0;
            if (i21 == 0) {
                dVar3.e(dVar6.f8149i, dVar4.f8149i, 0, 8);
                dVar3.e(dVar4.f8149i, this.V.L.f8149i, 0, 4);
                gVar = dVar4.f8149i;
                dVar2 = this.V.J;
            } else if (i21 == 1) {
                dVar3.e(dVar4.f8149i, dVar6.f8149i, 0, 8);
                dVar3.e(dVar4.f8149i, this.V.J.f8149i, 0, 4);
                gVar = dVar4.f8149i;
                dVar2 = this.V.L;
            } else if (i21 == 2) {
                dVar3.e(dVar7.f8149i, dVar5.f8149i, 0, 8);
                dVar3.e(dVar5.f8149i, this.V.M.f8149i, 0, 4);
                gVar = dVar5.f8149i;
                dVar2 = this.V.K;
            } else if (i21 == 3) {
                dVar3.e(dVar5.f8149i, dVar7.f8149i, 0, 8);
                dVar3.e(dVar5.f8149i, this.V.K.f8149i, 0, 4);
                gVar = dVar5.f8149i;
                dVar2 = this.V.M;
            } else {
                return;
            }
            dVar3.e(gVar, dVar2.f8149i, 0, 0);
        }
    }

    public final boolean c() {
        return true;
    }

    public final String toString() {
        String g10 = b0.d.g(new StringBuilder("[Barrier] "), this.f8169j0, " {");
        for (int i10 = 0; i10 < this.f8203s0; i10++) {
            e eVar = this.f8202r0[i10];
            if (i10 > 0) {
                g10 = b0.d.e(g10, ", ");
            }
            StringBuilder g11 = x0.g(g10);
            g11.append(eVar.f8169j0);
            g10 = g11.toString();
        }
        return b0.d.e(g10, "}");
    }

    public final boolean u() {
        return this.f8126w0;
    }

    public final boolean v() {
        return this.f8126w0;
    }
}
