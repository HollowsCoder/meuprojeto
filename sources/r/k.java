package r;

import java.util.ArrayList;
import java.util.Iterator;
import q.a;
import q.e;
import r.f;

public final class k extends p {
    public k(e eVar) {
        super(eVar);
    }

    public final void a(d dVar) {
        a aVar = (a) this.f8321b;
        int i10 = aVar.t0;
        f fVar = this.f8326h;
        Iterator it = fVar.l.iterator();
        int i11 = 0;
        int i12 = -1;
        while (it.hasNext()) {
            int i13 = ((f) it.next()).f8302g;
            if (i12 == -1 || i13 < i12) {
                i12 = i13;
            }
            if (i11 < i13) {
                i11 = i13;
            }
        }
        if (i10 == 0 || i10 == 2) {
            fVar.d(i12 + aVar.f8125v0);
        } else {
            fVar.d(i11 + aVar.f8125v0);
        }
    }

    public final void d() {
        p pVar;
        e eVar = this.f8321b;
        if (eVar instanceof a) {
            f fVar = this.f8326h;
            fVar.f8298b = true;
            a aVar = (a) eVar;
            int i10 = aVar.t0;
            boolean z = aVar.f8124u0;
            ArrayList arrayList = fVar.l;
            int i11 = 0;
            if (i10 == 0) {
                fVar.f8300e = f.a.LEFT;
                while (i11 < aVar.f8203s0) {
                    e eVar2 = aVar.f8202r0[i11];
                    if (z || eVar2.f8167i0 != 8) {
                        f fVar2 = eVar2.d.f8326h;
                        fVar2.f8306k.add(fVar);
                        arrayList.add(fVar2);
                    }
                    i11++;
                }
            } else if (i10 != 1) {
                if (i10 == 2) {
                    fVar.f8300e = f.a.TOP;
                    while (i11 < aVar.f8203s0) {
                        e eVar3 = aVar.f8202r0[i11];
                        if (z || eVar3.f8167i0 != 8) {
                            f fVar3 = eVar3.f8158e.f8326h;
                            fVar3.f8306k.add(fVar);
                            arrayList.add(fVar3);
                        }
                        i11++;
                    }
                } else if (i10 == 3) {
                    fVar.f8300e = f.a.BOTTOM;
                    while (i11 < aVar.f8203s0) {
                        e eVar4 = aVar.f8202r0[i11];
                        if (z || eVar4.f8167i0 != 8) {
                            f fVar4 = eVar4.f8158e.f8327i;
                            fVar4.f8306k.add(fVar);
                            arrayList.add(fVar4);
                        }
                        i11++;
                    }
                } else {
                    return;
                }
                m(this.f8321b.f8158e.f8326h);
                pVar = this.f8321b.f8158e;
                m(pVar.f8327i);
            } else {
                fVar.f8300e = f.a.RIGHT;
                while (i11 < aVar.f8203s0) {
                    e eVar5 = aVar.f8202r0[i11];
                    if (z || eVar5.f8167i0 != 8) {
                        f fVar5 = eVar5.d.f8327i;
                        fVar5.f8306k.add(fVar);
                        arrayList.add(fVar5);
                    }
                    i11++;
                }
            }
            m(this.f8321b.d.f8326h);
            pVar = this.f8321b.d;
            m(pVar.f8327i);
        }
    }

    public final void e() {
        e eVar = this.f8321b;
        if (eVar instanceof a) {
            int i10 = ((a) eVar).t0;
            f fVar = this.f8326h;
            if (i10 == 0 || i10 == 1) {
                eVar.f8152a0 = fVar.f8302g;
            } else {
                eVar.f8154b0 = fVar.f8302g;
            }
        }
    }

    public final void f() {
        this.f8322c = null;
        this.f8326h.c();
    }

    public final boolean k() {
        return false;
    }

    public final void m(f fVar) {
        f fVar2 = this.f8326h;
        fVar2.f8306k.add(fVar);
        fVar.l.add(fVar2);
    }
}
