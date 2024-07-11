package r1;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Collections;
import o1.l;
import s1.a;
import t1.f;

public final class x implements d0<l> {

    /* renamed from: o  reason: collision with root package name */
    public static final x f8397o = new x();

    /* renamed from: p  reason: collision with root package name */
    public static final a.C0126a f8398p = a.C0126a.a("c", "v", "i", "o");

    public final Object f(a aVar, float f10) {
        if (aVar.r() == a.b.BEGIN_ARRAY) {
            aVar.a();
        }
        aVar.b();
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        boolean z = false;
        while (aVar.g()) {
            int t10 = aVar.t(f8398p);
            if (t10 == 0) {
                z = aVar.j();
            } else if (t10 == 1) {
                arrayList = m.c(aVar, f10);
            } else if (t10 == 2) {
                arrayList2 = m.c(aVar, f10);
            } else if (t10 != 3) {
                aVar.u();
                aVar.x();
            } else {
                arrayList3 = m.c(aVar, f10);
            }
        }
        aVar.d();
        if (aVar.r() == a.b.END_ARRAY) {
            aVar.c();
        }
        if (arrayList == null || arrayList2 == null || arrayList3 == null) {
            throw new IllegalArgumentException("Shape data was missing information.");
        } else if (arrayList.isEmpty()) {
            return new l(new PointF(), false, Collections.emptyList());
        } else {
            int size = arrayList.size();
            PointF pointF = (PointF) arrayList.get(0);
            ArrayList arrayList4 = new ArrayList(size);
            for (int i10 = 1; i10 < size; i10++) {
                PointF pointF2 = (PointF) arrayList.get(i10);
                int i11 = i10 - 1;
                arrayList4.add(new m1.a(f.a((PointF) arrayList.get(i11), (PointF) arrayList3.get(i11)), f.a(pointF2, (PointF) arrayList2.get(i10)), pointF2));
            }
            if (z) {
                PointF pointF3 = (PointF) arrayList.get(0);
                int i12 = size - 1;
                arrayList4.add(new m1.a(f.a((PointF) arrayList.get(i12), (PointF) arrayList3.get(i12)), f.a(pointF3, (PointF) arrayList2.get(0)), pointF3));
            }
            return new l(pointF, z, arrayList4);
        }
    }
}
