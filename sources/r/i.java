package r;

import java.util.ArrayList;
import q.d;
import q.e;
import q.g;

public final class i {
    public static o a(e eVar, int i10, ArrayList<o> arrayList, o oVar) {
        int i11;
        boolean z;
        d dVar;
        int i12;
        if (i10 == 0) {
            i11 = eVar.f8180p0;
        } else {
            i11 = eVar.f8182q0;
        }
        int i13 = 0;
        if (i11 != -1 && (oVar == null || i11 != oVar.f8317b)) {
            int i14 = 0;
            while (true) {
                if (i14 >= arrayList.size()) {
                    break;
                }
                o oVar2 = arrayList.get(i14);
                if (oVar2.f8317b == i11) {
                    if (oVar != null) {
                        oVar.c(i10, oVar2);
                        arrayList.remove(oVar);
                    }
                    oVar = oVar2;
                } else {
                    i14++;
                }
            }
        } else if (i11 != -1) {
            return oVar;
        }
        if (oVar == null) {
            if (eVar instanceof q.i) {
                q.i iVar = (q.i) eVar;
                int i15 = 0;
                while (true) {
                    if (i15 >= iVar.f8203s0) {
                        i12 = -1;
                        break;
                    }
                    e eVar2 = iVar.f8202r0[i15];
                    if ((i10 == 0 && (i12 = eVar2.f8180p0) != -1) || (i10 == 1 && (i12 = eVar2.f8182q0) != -1)) {
                        break;
                    }
                    i15++;
                }
                if (i12 != -1) {
                    int i16 = 0;
                    while (true) {
                        if (i16 >= arrayList.size()) {
                            break;
                        }
                        o oVar3 = arrayList.get(i16);
                        if (oVar3.f8317b == i12) {
                            oVar = oVar3;
                            break;
                        }
                        i16++;
                    }
                }
            }
            if (oVar == null) {
                oVar = new o(i10);
            }
            arrayList.add(oVar);
        }
        ArrayList<e> arrayList2 = oVar.f8316a;
        if (arrayList2.contains(eVar)) {
            z = false;
        } else {
            arrayList2.add(eVar);
            z = true;
        }
        if (z) {
            if (eVar instanceof g) {
                g gVar = (g) eVar;
                d dVar2 = gVar.f8198u0;
                if (gVar.f8199v0 == 0) {
                    i13 = 1;
                }
                dVar2.b(i13, oVar, arrayList);
            }
            int i17 = oVar.f8317b;
            if (i10 == 0) {
                eVar.f8180p0 = i17;
                eVar.J.b(i10, oVar, arrayList);
                dVar = eVar.L;
            } else {
                eVar.f8182q0 = i17;
                eVar.K.b(i10, oVar, arrayList);
                eVar.N.b(i10, oVar, arrayList);
                dVar = eVar.M;
            }
            dVar.b(i10, oVar, arrayList);
            eVar.Q.b(i10, oVar, arrayList);
        }
        return oVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r3 = q.e.b.WRAP_CONTENT;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean b(q.e.b r5, q.e.b r6, q.e.b r7, q.e.b r8) {
        /*
            q.e$b r0 = q.e.b.FIXED
            r1 = 0
            r2 = 1
            if (r7 == r0) goto L_0x0013
            q.e$b r3 = q.e.b.WRAP_CONTENT
            if (r7 == r3) goto L_0x0013
            q.e$b r4 = q.e.b.MATCH_PARENT
            if (r7 != r4) goto L_0x0011
            if (r5 == r3) goto L_0x0011
            goto L_0x0013
        L_0x0011:
            r5 = r1
            goto L_0x0014
        L_0x0013:
            r5 = r2
        L_0x0014:
            if (r8 == r0) goto L_0x0023
            q.e$b r7 = q.e.b.WRAP_CONTENT
            if (r8 == r7) goto L_0x0023
            q.e$b r0 = q.e.b.MATCH_PARENT
            if (r8 != r0) goto L_0x0021
            if (r6 == r7) goto L_0x0021
            goto L_0x0023
        L_0x0021:
            r6 = r1
            goto L_0x0024
        L_0x0023:
            r6 = r2
        L_0x0024:
            if (r5 != 0) goto L_0x002a
            if (r6 == 0) goto L_0x0029
            goto L_0x002a
        L_0x0029:
            return r1
        L_0x002a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: r.i.b(q.e$b, q.e$b, q.e$b, q.e$b):boolean");
    }
}
