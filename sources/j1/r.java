package j1;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import h1.l;
import h1.q;
import k1.a;
import k1.n;
import o1.p;
import p1.b;
import u1.c;

public final class r extends a {

    /* renamed from: o  reason: collision with root package name */
    public final b f6509o;

    /* renamed from: p  reason: collision with root package name */
    public final String f6510p;

    /* renamed from: q  reason: collision with root package name */
    public final boolean f6511q;

    /* renamed from: r  reason: collision with root package name */
    public final a<Integer, Integer> f6512r;

    /* renamed from: s  reason: collision with root package name */
    public n f6513s;

    public r(l lVar, b bVar, p pVar) {
        super(lVar, bVar, pVar.f7670g.toPaintCap(), pVar.f7671h.toPaintJoin(), pVar.f7672i, pVar.f7668e, pVar.f7669f, pVar.f7667c, pVar.f7666b);
        this.f6509o = bVar;
        this.f6510p = pVar.f7665a;
        this.f6511q = pVar.f7673j;
        a<Integer, Integer> a10 = pVar.d.a();
        this.f6512r = a10;
        a10.a(this);
        bVar.d(a10);
    }

    public final void e(Canvas canvas, Matrix matrix, int i10) {
        if (!this.f6511q) {
            k1.b bVar = (k1.b) this.f6512r;
            int l = bVar.l(bVar.b(), bVar.d());
            i1.a aVar = this.f6409i;
            aVar.setColor(l);
            n nVar = this.f6513s;
            if (nVar != null) {
                aVar.setColorFilter((ColorFilter) nVar.f());
            }
            super.e(canvas, matrix, i10);
        }
    }

    public final String getName() {
        return this.f6510p;
    }

    public final void h(c cVar, Object obj) {
        super.h(cVar, obj);
        Integer num = q.f5186b;
        a<Integer, Integer> aVar = this.f6512r;
        if (obj == num) {
            aVar.k(cVar);
        } else if (obj == q.E) {
            n nVar = this.f6513s;
            b bVar = this.f6509o;
            if (nVar != null) {
                bVar.n(nVar);
            }
            if (cVar == null) {
                this.f6513s = null;
                return;
            }
            n nVar2 = new n(cVar, null);
            this.f6513s = nVar2;
            nVar2.a(this);
            bVar.d(aVar);
        }
    }
}
