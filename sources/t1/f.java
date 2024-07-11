package t1;

import android.graphics.PointF;
import j1.k;
import java.util.ArrayList;
import m1.e;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final PointF f8885a = new PointF();

    public static PointF a(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static float b(float f10, float f11, float f12) {
        return Math.max(f11, Math.min(f12, f10));
    }

    public static int c(float f10, float f11) {
        int i10 = (int) f10;
        int i11 = (int) f11;
        int i12 = i10 / i11;
        int i13 = i10 % i11;
        if (!((i10 ^ i11) >= 0) && i13 != 0) {
            i12--;
        }
        return i10 - (i11 * i12);
    }

    public static void d(e eVar, int i10, ArrayList arrayList, e eVar2, k kVar) {
        if (eVar.a(kVar.getName(), i10)) {
            String name = kVar.getName();
            eVar2.getClass();
            e eVar3 = new e(eVar2);
            eVar3.f7048a.add(name);
            e eVar4 = new e(eVar3);
            eVar4.f7049b = kVar;
            arrayList.add(eVar4);
        }
    }
}
