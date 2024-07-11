package r;

import java.util.ArrayList;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final p f8311a = null;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList<p> f8312b = new ArrayList<>();

    public m(p pVar) {
        this.f8311a = pVar;
    }

    public static long a(f fVar, long j8) {
        p pVar = fVar.d;
        if (pVar instanceof k) {
            return j8;
        }
        ArrayList arrayList = fVar.f8306k;
        int size = arrayList.size();
        long j10 = j8;
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = (d) arrayList.get(i10);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.d != pVar) {
                    j10 = Math.min(j10, a(fVar2, ((long) fVar2.f8301f) + j8));
                }
            }
        }
        if (fVar != pVar.f8327i) {
            return j10;
        }
        long j11 = pVar.j();
        f fVar3 = pVar.f8326h;
        long j12 = j8 - j11;
        return Math.min(Math.min(j10, a(fVar3, j12)), j12 - ((long) fVar3.f8301f));
    }

    public static long b(f fVar, long j8) {
        p pVar = fVar.d;
        if (pVar instanceof k) {
            return j8;
        }
        ArrayList arrayList = fVar.f8306k;
        int size = arrayList.size();
        long j10 = j8;
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = (d) arrayList.get(i10);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.d != pVar) {
                    j10 = Math.max(j10, b(fVar2, ((long) fVar2.f8301f) + j8));
                }
            }
        }
        if (fVar != pVar.f8326h) {
            return j10;
        }
        long j11 = pVar.j();
        f fVar3 = pVar.f8327i;
        long j12 = j8 + j11;
        return Math.max(Math.max(j10, b(fVar3, j12)), j12 - ((long) fVar3.f8301f));
    }
}
