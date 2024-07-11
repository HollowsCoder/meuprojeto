package j1;

import android.graphics.Path;
import h1.l;
import java.util.ArrayList;
import java.util.List;
import k1.a;
import o1.o;
import o1.q;
import p1.b;

public final class q implements m, a.C0091a {

    /* renamed from: a  reason: collision with root package name */
    public final Path f6504a = new Path();

    /* renamed from: b  reason: collision with root package name */
    public final boolean f6505b;

    /* renamed from: c  reason: collision with root package name */
    public final l f6506c;
    public final a<?, Path> d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f6507e;

    /* renamed from: f  reason: collision with root package name */
    public final b f6508f = new b(0);

    public q(l lVar, b bVar, o oVar) {
        oVar.getClass();
        this.f6505b = oVar.d;
        this.f6506c = lVar;
        a<?, Path> a10 = oVar.f7664c.a();
        this.d = a10;
        bVar.d(a10);
        a10.a(this);
    }

    public final void b() {
        this.f6507e = false;
        this.f6506c.invalidateSelf();
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
                        this.f6508f.f6416a.add(sVar);
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
        boolean z = this.f6507e;
        Path path = this.f6504a;
        if (z) {
            return path;
        }
        path.reset();
        if (this.f6505b) {
            this.f6507e = true;
            return path;
        }
        path.set(this.d.f());
        path.setFillType(Path.FillType.EVEN_ODD);
        this.f6508f.d(path);
        this.f6507e = true;
        return path;
    }
}
