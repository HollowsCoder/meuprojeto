package j1;

import android.graphics.Path;
import android.graphics.PointF;
import h1.l;
import java.util.ArrayList;
import java.util.List;
import k1.a;
import m1.e;
import o1.q;
import p1.b;
import u1.c;

public final class f implements m, a.C0091a, k {

    /* renamed from: a  reason: collision with root package name */
    public final Path f6427a = new Path();

    /* renamed from: b  reason: collision with root package name */
    public final String f6428b;

    /* renamed from: c  reason: collision with root package name */
    public final l f6429c;
    public final k1.f d;

    /* renamed from: e  reason: collision with root package name */
    public final a<?, PointF> f6430e;

    /* renamed from: f  reason: collision with root package name */
    public final o1.a f6431f;

    /* renamed from: g  reason: collision with root package name */
    public final b f6432g = new b(0);

    /* renamed from: h  reason: collision with root package name */
    public boolean f6433h;

    public f(l lVar, b bVar, o1.a aVar) {
        this.f6428b = aVar.f7605a;
        this.f6429c = lVar;
        a a10 = aVar.f7607c.a();
        this.d = (k1.f) a10;
        a<PointF, PointF> a11 = aVar.f7606b.a();
        this.f6430e = a11;
        this.f6431f = aVar;
        bVar.d(a10);
        bVar.d(a11);
        a10.a(this);
        a11.a(this);
    }

    public final void b() {
        this.f6433h = false;
        this.f6429c.invalidateSelf();
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
                        this.f6432g.f6416a.add(sVar);
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
        float f10;
        float f11;
        float f12;
        float f13;
        boolean z = this.f6433h;
        Path path = this.f6427a;
        if (z) {
            return path;
        }
        path.reset();
        o1.a aVar = this.f6431f;
        if (aVar.f7608e) {
            this.f6433h = true;
            return path;
        }
        PointF pointF = (PointF) this.d.f();
        float f14 = pointF.x / 2.0f;
        float f15 = pointF.y / 2.0f;
        float f16 = f14 * 0.55228f;
        float f17 = f15 * 0.55228f;
        path.reset();
        if (aVar.d) {
            f13 = -f15;
            path.moveTo(0.0f, f13);
            float f18 = 0.0f - f16;
            float f19 = -f14;
            f10 = 0.0f - f17;
            Path path2 = path;
            path2.cubicTo(f18, f13, f19, f10, f19, 0.0f);
            f12 = f17 + 0.0f;
            path2.cubicTo(f19, f12, f18, f15, 0.0f, f15);
            f11 = f16 + 0.0f;
        } else {
            f13 = -f15;
            path.moveTo(0.0f, f13);
            float f20 = f16 + 0.0f;
            f10 = 0.0f - f17;
            Path path3 = path;
            path3.cubicTo(f20, f13, f14, f10, f14, 0.0f);
            f12 = f17 + 0.0f;
            path3.cubicTo(f14, f12, f20, f15, 0.0f, f15);
            f11 = 0.0f - f16;
            f14 = -f14;
        }
        Path path4 = path;
        path4.cubicTo(f11, f15, f14, f12, f14, 0.0f);
        path4.cubicTo(f14, f10, f11, f13, 0.0f, f13);
        PointF f21 = this.f6430e.f();
        path.offset(f21.x, f21.y);
        path.close();
        this.f6432g.d(path);
        this.f6433h = true;
        return path;
    }

    public final void g(e eVar, int i10, ArrayList arrayList, e eVar2) {
        t1.f.d(eVar, i10, arrayList, eVar2, this);
    }

    public final String getName() {
        return this.f6428b;
    }

    public final void h(c cVar, Object obj) {
        a aVar;
        if (obj == h1.q.f5192i) {
            aVar = this.d;
        } else if (obj == h1.q.l) {
            aVar = this.f6430e;
        } else {
            return;
        }
        aVar.k(cVar);
    }
}
