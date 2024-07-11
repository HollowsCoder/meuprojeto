package r;

import q.e;
import q.g;

public final class j extends p {
    public j(e eVar) {
        super(eVar);
        eVar.d.f();
        eVar.f8158e.f();
        this.f8324f = ((g) eVar).f8199v0;
    }

    public final void a(d dVar) {
        f fVar = this.f8326h;
        if (fVar.f8299c && !fVar.f8305j) {
            fVar.d((int) ((((float) ((f) fVar.l.get(0)).f8302g) * ((g) this.f8321b).f8196r0) + 0.5f));
        }
    }

    public final void d() {
        p pVar;
        e eVar = this.f8321b;
        g gVar = (g) eVar;
        int i10 = gVar.f8197s0;
        int i11 = gVar.t0;
        int i12 = gVar.f8199v0;
        f fVar = this.f8326h;
        if (i12 == 1) {
            if (i10 != -1) {
                fVar.l.add(eVar.V.d.f8326h);
                this.f8321b.V.d.f8326h.f8306k.add(fVar);
                fVar.f8301f = i10;
            } else if (i11 != -1) {
                fVar.l.add(eVar.V.d.f8327i);
                this.f8321b.V.d.f8327i.f8306k.add(fVar);
                fVar.f8301f = -i11;
            } else {
                fVar.f8298b = true;
                fVar.l.add(eVar.V.d.f8327i);
                this.f8321b.V.d.f8327i.f8306k.add(fVar);
            }
            m(this.f8321b.d.f8326h);
            pVar = this.f8321b.d;
        } else {
            if (i10 != -1) {
                fVar.l.add(eVar.V.f8158e.f8326h);
                this.f8321b.V.f8158e.f8326h.f8306k.add(fVar);
                fVar.f8301f = i10;
            } else if (i11 != -1) {
                fVar.l.add(eVar.V.f8158e.f8327i);
                this.f8321b.V.f8158e.f8327i.f8306k.add(fVar);
                fVar.f8301f = -i11;
            } else {
                fVar.f8298b = true;
                fVar.l.add(eVar.V.f8158e.f8327i);
                this.f8321b.V.f8158e.f8327i.f8306k.add(fVar);
            }
            m(this.f8321b.f8158e.f8326h);
            pVar = this.f8321b.f8158e;
        }
        m(pVar.f8327i);
    }

    public final void e() {
        e eVar = this.f8321b;
        int i10 = ((g) eVar).f8199v0;
        f fVar = this.f8326h;
        if (i10 == 1) {
            eVar.f8152a0 = fVar.f8302g;
        } else {
            eVar.f8154b0 = fVar.f8302g;
        }
    }

    public final void f() {
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
