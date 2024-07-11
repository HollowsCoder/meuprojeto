package j1;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import h1.l;
import java.util.ArrayList;
import java.util.List;
import k1.a;
import k1.c;
import m1.e;
import o1.j;
import o1.q;
import p1.b;
import t1.f;

public final class o implements a.C0091a, k, m {

    /* renamed from: a  reason: collision with root package name */
    public final Path f6486a = new Path();

    /* renamed from: b  reason: collision with root package name */
    public final RectF f6487b = new RectF();

    /* renamed from: c  reason: collision with root package name */
    public final String f6488c;
    public final boolean d;

    /* renamed from: e  reason: collision with root package name */
    public final l f6489e;

    /* renamed from: f  reason: collision with root package name */
    public final a<?, PointF> f6490f;

    /* renamed from: g  reason: collision with root package name */
    public final a<?, PointF> f6491g;

    /* renamed from: h  reason: collision with root package name */
    public final c f6492h;

    /* renamed from: i  reason: collision with root package name */
    public final b f6493i = new b(0);

    /* renamed from: j  reason: collision with root package name */
    public boolean f6494j;

    public o(l lVar, b bVar, j jVar) {
        this.f6488c = jVar.f7643a;
        this.d = jVar.f7646e;
        this.f6489e = lVar;
        a<PointF, PointF> a10 = jVar.f7644b.a();
        this.f6490f = a10;
        a<PointF, PointF> a11 = jVar.f7645c.a();
        this.f6491g = a11;
        a<Float, Float> a12 = jVar.d.a();
        this.f6492h = (c) a12;
        bVar.d(a10);
        bVar.d(a11);
        bVar.d(a12);
        a10.a(this);
        a11.a(this);
        a12.a(this);
    }

    public final void b() {
        this.f6494j = false;
        this.f6489e.invalidateSelf();
    }

    public final void c(List<c> list, List<c> list2) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) list;
            if (i10 < arrayList.size()) {
                c cVar = (c) arrayList.get(i10);
                if (cVar instanceof s) {
                    s sVar = (s) cVar;
                    if (sVar.f6516c == q.a.SIMULTANEOUSLY) {
                        this.f6493i.f6416a.add(sVar);
                        sVar.d(this);
                    }
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public final Path f() {
        boolean z = this.f6494j;
        Path path = this.f6486a;
        if (z) {
            return path;
        }
        path.reset();
        if (this.d) {
            this.f6494j = true;
            return path;
        }
        PointF f10 = this.f6491g.f();
        float f11 = f10.x / 2.0f;
        float f12 = f10.y / 2.0f;
        c cVar = this.f6492h;
        float l = cVar == null ? 0.0f : cVar.l();
        float min = Math.min(f11, f12);
        if (l > min) {
            l = min;
        }
        PointF f13 = this.f6490f.f();
        path.moveTo(f13.x + f11, (f13.y - f12) + l);
        path.lineTo(f13.x + f11, (f13.y + f12) - l);
        int i10 = (l > 0.0f ? 1 : (l == 0.0f ? 0 : -1));
        RectF rectF = this.f6487b;
        if (i10 > 0) {
            float f14 = f13.x + f11;
            float f15 = l * 2.0f;
            float f16 = f13.y + f12;
            rectF.set(f14 - f15, f16 - f15, f14, f16);
            path.arcTo(rectF, 0.0f, 90.0f, false);
        }
        path.lineTo((f13.x - f11) + l, f13.y + f12);
        if (i10 > 0) {
            float f17 = f13.x - f11;
            float f18 = f13.y + f12;
            float f19 = l * 2.0f;
            rectF.set(f17, f18 - f19, f19 + f17, f18);
            path.arcTo(rectF, 90.0f, 90.0f, false);
        }
        path.lineTo(f13.x - f11, (f13.y - f12) + l);
        if (i10 > 0) {
            float f20 = f13.x - f11;
            float f21 = f13.y - f12;
            float f22 = l * 2.0f;
            rectF.set(f20, f21, f20 + f22, f22 + f21);
            path.arcTo(rectF, 180.0f, 90.0f, false);
        }
        path.lineTo((f13.x + f11) - l, f13.y - f12);
        if (i10 > 0) {
            float f23 = f13.x + f11;
            float f24 = l * 2.0f;
            float f25 = f13.y - f12;
            rectF.set(f23 - f24, f25, f23, f24 + f25);
            path.arcTo(rectF, 270.0f, 90.0f, false);
        }
        path.close();
        this.f6493i.d(path);
        this.f6494j = true;
        return path;
    }

    public final void g(e eVar, int i10, ArrayList arrayList, e eVar2) {
        f.d(eVar, i10, arrayList, eVar2, this);
    }

    public final String getName() {
        return this.f6488c;
    }

    public final void h(u1.c cVar, Object obj) {
        a aVar;
        if (obj == h1.q.f5193j) {
            aVar = this.f6491g;
        } else if (obj == h1.q.l) {
            aVar = this.f6490f;
        } else if (obj == h1.q.f5194k) {
            aVar = this.f6492h;
        } else {
            return;
        }
        aVar.k(cVar);
    }
}
