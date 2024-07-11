package r1;

import h1.f;
import java.util.ArrayList;
import k1.g;
import s1.a;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    public static final a.C0126a f8383a = a.C0126a.a("k");

    public static ArrayList a(a aVar, f fVar, float f10, d0 d0Var, boolean z) {
        ArrayList arrayList = new ArrayList();
        if (aVar.r() == a.b.STRING) {
            fVar.a("Lottie doesn't support expressions.");
            return arrayList;
        }
        aVar.b();
        while (aVar.g()) {
            if (aVar.t(f8383a) != 0) {
                aVar.x();
            } else if (aVar.r() == a.b.BEGIN_ARRAY) {
                aVar.a();
                if (aVar.r() == a.b.NUMBER) {
                    arrayList.add(n.b(aVar, fVar, f10, d0Var, false, z));
                } else {
                    while (aVar.g()) {
                        arrayList.add(n.b(aVar, fVar, f10, d0Var, true, z));
                    }
                }
                aVar.c();
            } else {
                arrayList.add(n.b(aVar, fVar, f10, d0Var, false, z));
            }
        }
        aVar.d();
        b(arrayList);
        return arrayList;
    }

    public static void b(ArrayList arrayList) {
        int i10;
        T t10;
        int size = arrayList.size();
        int i11 = 0;
        while (true) {
            i10 = size - 1;
            if (i11 >= i10) {
                break;
            }
            u1.a aVar = (u1.a) arrayList.get(i11);
            i11++;
            u1.a aVar2 = (u1.a) arrayList.get(i11);
            aVar.f9046h = Float.valueOf(aVar2.f9045g);
            if (aVar.f9042c == null && (t10 = aVar2.f9041b) != null) {
                aVar.f9042c = t10;
                if (aVar instanceof g) {
                    ((g) aVar).d();
                }
            }
        }
        u1.a aVar3 = (u1.a) arrayList.get(i10);
        if ((aVar3.f9041b == null || aVar3.f9042c == null) && arrayList.size() > 1) {
            arrayList.remove(aVar3);
        }
    }
}
