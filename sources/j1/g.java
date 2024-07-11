package j1;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import h1.l;
import h1.q;
import java.util.ArrayList;
import java.util.List;
import k1.a;
import k1.f;
import k1.n;
import m1.e;
import n1.d;
import o1.m;
import p1.b;
import u1.c;

public final class g implements e, a.C0091a, k {

    /* renamed from: a  reason: collision with root package name */
    public final Path f6434a;

    /* renamed from: b  reason: collision with root package name */
    public final i1.a f6435b = new i1.a(1);

    /* renamed from: c  reason: collision with root package name */
    public final b f6436c;
    public final String d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f6437e;

    /* renamed from: f  reason: collision with root package name */
    public final ArrayList f6438f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    public final a<Integer, Integer> f6439g;

    /* renamed from: h  reason: collision with root package name */
    public final f f6440h;

    /* renamed from: i  reason: collision with root package name */
    public n f6441i;

    /* renamed from: j  reason: collision with root package name */
    public final l f6442j;

    public g(l lVar, b bVar, m mVar) {
        d dVar;
        Path path = new Path();
        this.f6434a = path;
        this.f6436c = bVar;
        this.d = mVar.f7656c;
        this.f6437e = mVar.f7658f;
        this.f6442j = lVar;
        n1.a aVar = mVar.d;
        if (aVar == null || (dVar = mVar.f7657e) == null) {
            this.f6439g = null;
            this.f6440h = null;
            return;
        }
        path.setFillType(mVar.f7655b);
        a<Integer, Integer> a10 = aVar.a();
        this.f6439g = a10;
        a10.a(this);
        bVar.d(a10);
        a a11 = dVar.a();
        this.f6440h = (f) a11;
        a11.a(this);
        bVar.d(a11);
    }

    public final void a(RectF rectF, Matrix matrix, boolean z) {
        Path path = this.f6434a;
        path.reset();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f6438f;
            if (i10 < arrayList.size()) {
                path.addPath(((m) arrayList.get(i10)).f(), matrix);
                i10++;
            } else {
                path.computeBounds(rectF, false);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            }
        }
    }

    public final void b() {
        this.f6442j.invalidateSelf();
    }

    public final void c(List<c> list, List<c> list2) {
        for (int i10 = 0; i10 < list2.size(); i10++) {
            c cVar = list2.get(i10);
            if (cVar instanceof m) {
                this.f6438f.add((m) cVar);
            }
        }
    }

    public final void e(Canvas canvas, Matrix matrix, int i10) {
        if (!this.f6437e) {
            k1.b bVar = (k1.b) this.f6439g;
            int l = bVar.l(bVar.b(), bVar.d());
            i1.a aVar = this.f6435b;
            aVar.setColor(l);
            PointF pointF = t1.f.f8885a;
            int i11 = 0;
            aVar.setAlpha(Math.max(0, Math.min(255, (int) ((((((float) i10) / 255.0f) * ((float) ((Integer) this.f6440h.f()).intValue())) / 100.0f) * 255.0f))));
            n nVar = this.f6441i;
            if (nVar != null) {
                aVar.setColorFilter((ColorFilter) nVar.f());
            }
            Path path = this.f6434a;
            path.reset();
            while (true) {
                ArrayList arrayList = this.f6438f;
                if (i11 < arrayList.size()) {
                    path.addPath(((m) arrayList.get(i11)).f(), matrix);
                    i11++;
                } else {
                    canvas.drawPath(path, aVar);
                    androidx.databinding.a.n();
                    return;
                }
            }
        }
    }

    public final void g(e eVar, int i10, ArrayList arrayList, e eVar2) {
        t1.f.d(eVar, i10, arrayList, eVar2, this);
    }

    public final String getName() {
        return this.d;
    }

    public final void h(c cVar, Object obj) {
        a aVar;
        if (obj == q.f5185a) {
            aVar = this.f6439g;
        } else if (obj == q.d) {
            aVar = this.f6440h;
        } else if (obj == q.E) {
            n nVar = this.f6441i;
            b bVar = this.f6436c;
            if (nVar != null) {
                bVar.n(nVar);
            }
            if (cVar == null) {
                this.f6441i = null;
                return;
            }
            n nVar2 = new n(cVar, null);
            this.f6441i = nVar2;
            nVar2.a(this);
            bVar.d(this.f6441i);
            return;
        } else {
            return;
        }
        aVar.k(cVar);
    }
}
