package q;

import java.util.ArrayList;
import o.c;

public class l extends e {

    /* renamed from: r0  reason: collision with root package name */
    public ArrayList<e> f8205r0 = new ArrayList<>();

    public void H() {
        ArrayList<e> arrayList = this.f8205r0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                e eVar = this.f8205r0.get(i10);
                if (eVar instanceof l) {
                    ((l) eVar).H();
                }
            }
        }
    }

    public void w() {
        this.f8205r0.clear();
        super.w();
    }

    public final void y(c cVar) {
        super.y(cVar);
        int size = this.f8205r0.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f8205r0.get(i10).y(cVar);
        }
    }
}
