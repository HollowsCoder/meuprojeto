package q;

import o.d;
import q.e;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean[] f8204a = new boolean[3];

    public static void a(f fVar, d dVar, e eVar) {
        eVar.f8177o = -1;
        eVar.f8179p = -1;
        e.b bVar = fVar.U[0];
        e.b bVar2 = e.b.WRAP_CONTENT;
        e.b[] bVarArr = eVar.U;
        if (bVar != bVar2 && bVarArr[0] == e.b.MATCH_PARENT) {
            d dVar2 = eVar.J;
            int i10 = dVar2.f8147g;
            int k10 = fVar.k();
            d dVar3 = eVar.L;
            int i11 = k10 - dVar3.f8147g;
            dVar2.f8149i = dVar.l(dVar2);
            dVar3.f8149i = dVar.l(dVar3);
            dVar.d(dVar2.f8149i, i10);
            dVar.d(dVar3.f8149i, i11);
            eVar.f8177o = 2;
            eVar.f8152a0 = i10;
            int i12 = i11 - i10;
            eVar.W = i12;
            int i13 = eVar.f8157d0;
            if (i12 < i13) {
                eVar.W = i13;
            }
        }
        if (fVar.U[1] != bVar2 && bVarArr[1] == e.b.MATCH_PARENT) {
            d dVar4 = eVar.K;
            int i14 = dVar4.f8147g;
            int i15 = fVar.i();
            d dVar5 = eVar.M;
            int i16 = i15 - dVar5.f8147g;
            dVar4.f8149i = dVar.l(dVar4);
            dVar5.f8149i = dVar.l(dVar5);
            dVar.d(dVar4.f8149i, i14);
            dVar.d(dVar5.f8149i, i16);
            if (eVar.f8156c0 > 0 || eVar.f8167i0 == 8) {
                d dVar6 = eVar.N;
                dVar6.f8149i = dVar.l(dVar6);
                dVar.d(dVar6.f8149i, eVar.f8156c0 + i14);
            }
            eVar.f8179p = 2;
            eVar.f8154b0 = i14;
            int i17 = i16 - i14;
            eVar.X = i17;
            int i18 = eVar.f8159e0;
            if (i17 < i18) {
                eVar.X = i18;
            }
        }
    }

    public static final boolean b(int i10, int i11) {
        return (i10 & i11) == i11;
    }
}
