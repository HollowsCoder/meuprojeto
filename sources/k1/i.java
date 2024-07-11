package k1;

import android.graphics.PointF;
import java.util.List;
import t1.f;
import u1.a;
import u1.c;
import u1.d;

public final class i extends f<d> {

    /* renamed from: i  reason: collision with root package name */
    public final d f6650i = new d();

    public i(List<a<d>> list) {
        super(list);
    }

    public final Object g(a aVar, float f10) {
        T t10;
        T t11 = aVar.f9041b;
        if (t11 == null || (t10 = aVar.f9042c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        d dVar = (d) t11;
        d dVar2 = (d) t10;
        c<A> cVar = this.f6634e;
        if (cVar != null) {
            aVar.f9046h.floatValue();
            e();
            d dVar3 = (d) cVar.a(dVar, dVar2);
            if (dVar3 != null) {
                return dVar3;
            }
        }
        float f11 = dVar.f9058a;
        float f12 = dVar2.f9058a;
        PointF pointF = f.f8885a;
        float a10 = b0.d.a(f12, f11, f10, f11);
        float f13 = dVar.f9059b;
        float a11 = b0.d.a(dVar2.f9059b, f13, f10, f13);
        d dVar4 = this.f6650i;
        dVar4.f9058a = a10;
        dVar4.f9059b = a11;
        return dVar4;
    }
}
