package r1;

import d7.h;
import h1.f;
import j1.b;
import java.util.ArrayList;
import k1.g;
import n1.e;
import s1.a;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a.C0126a f8355a = a.C0126a.a("k", "x", "y");

    public static b a(s1.b bVar, f fVar) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        if (bVar.r() == a.b.BEGIN_ARRAY) {
            bVar.a();
            while (bVar.g()) {
                if (bVar.r() == a.b.BEGIN_OBJECT) {
                    z = true;
                } else {
                    z = false;
                }
                s1.b bVar2 = bVar;
                f fVar2 = fVar;
                arrayList.add(new g(fVar, n.b(bVar2, fVar2, t1.g.c(), h.f4230q, z, false)));
            }
            bVar.c();
            o.b(arrayList);
        } else {
            arrayList.add(new u1.a(m.b(bVar, t1.g.c())));
        }
        return new b(arrayList);
    }

    public static n1.h b(s1.b bVar, f fVar) {
        bVar.b();
        b bVar2 = null;
        n1.b bVar3 = null;
        boolean z = false;
        n1.b bVar4 = null;
        while (bVar.r() != a.b.END_OBJECT) {
            int t10 = bVar.t(f8355a);
            if (t10 != 0) {
                if (t10 != 1) {
                    if (t10 != 2) {
                        bVar.u();
                        bVar.x();
                    } else if (bVar.r() != a.b.STRING) {
                        bVar3 = s6.a.D(bVar, fVar, true);
                    }
                } else if (bVar.r() != a.b.STRING) {
                    bVar4 = s6.a.D(bVar, fVar, true);
                }
                bVar.x();
                z = true;
            } else {
                bVar2 = a(bVar, fVar);
            }
        }
        bVar.d();
        if (z) {
            fVar.a("Lottie doesn't support expressions.");
        }
        if (bVar2 != null) {
            return bVar2;
        }
        return new e(bVar4, bVar3);
    }
}
