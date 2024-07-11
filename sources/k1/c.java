package k1;

import android.graphics.PointF;
import b0.d;
import java.util.List;
import t1.f;
import u1.a;

public final class c extends f<Float> {
    public c(List<a<Float>> list) {
        super(list);
    }

    public final Object g(a aVar, float f10) {
        return Float.valueOf(m(aVar, f10));
    }

    public final float l() {
        return m(b(), d());
    }

    public final float m(a<Float> aVar, float f10) {
        if (aVar.f9041b == null || aVar.f9042c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        u1.c<A> cVar = this.f6634e;
        T t10 = aVar.f9041b;
        if (cVar != null) {
            aVar.f9046h.floatValue();
            T t11 = aVar.f9042c;
            e();
            Float f11 = (Float) cVar.a(t10, t11);
            if (f11 != null) {
                return f11.floatValue();
            }
        }
        if (aVar.f9047i == -3987645.8f) {
            aVar.f9047i = ((Float) t10).floatValue();
        }
        float f12 = aVar.f9047i;
        if (aVar.f9048j == -3987645.8f) {
            aVar.f9048j = ((Float) aVar.f9042c).floatValue();
        }
        float f13 = aVar.f9048j;
        PointF pointF = f.f8885a;
        return d.a(f13, f12, f10, f12);
    }
}
