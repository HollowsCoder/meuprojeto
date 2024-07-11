package q;

import java.util.ArrayList;
import r.o;

public class i extends e implements h {

    /* renamed from: r0  reason: collision with root package name */
    public e[] f8202r0 = new e[4];

    /* renamed from: s0  reason: collision with root package name */
    public int f8203s0 = 0;

    public final void H(int i10, o oVar, ArrayList arrayList) {
        for (int i11 = 0; i11 < this.f8203s0; i11++) {
            e eVar = this.f8202r0[i11];
            ArrayList<e> arrayList2 = oVar.f8316a;
            if (!arrayList2.contains(eVar)) {
                arrayList2.add(eVar);
            }
        }
        for (int i12 = 0; i12 < this.f8203s0; i12++) {
            r.i.a(this.f8202r0[i12], i10, arrayList, oVar);
        }
    }
}
