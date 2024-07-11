package r;

import java.util.Iterator;
import r.f;

public class g extends f {

    /* renamed from: m  reason: collision with root package name */
    public int f8307m;

    public g(p pVar) {
        super(pVar);
        this.f8300e = pVar instanceof l ? f.a.HORIZONTAL_DIMENSION : f.a.VERTICAL_DIMENSION;
    }

    public final void d(int i10) {
        if (!this.f8305j) {
            this.f8305j = true;
            this.f8302g = i10;
            Iterator it = this.f8306k.iterator();
            while (it.hasNext()) {
                d dVar = (d) it.next();
                dVar.a(dVar);
            }
        }
    }
}
