package k1;

import android.graphics.PointF;
import java.util.List;
import t1.f;
import u1.a;
import u1.c;

public final class e extends f<Integer> {
    public e(List<a<Integer>> list) {
        super(list);
    }

    public final Object g(a aVar, float f10) {
        return Integer.valueOf(l(aVar, f10));
    }

    public final int l(a<Integer> aVar, float f10) {
        if (aVar.f9041b == null || aVar.f9042c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        c<A> cVar = this.f6634e;
        T t10 = aVar.f9041b;
        if (cVar != null) {
            aVar.f9046h.floatValue();
            T t11 = aVar.f9042c;
            e();
            Integer num = (Integer) cVar.a(t10, t11);
            if (num != null) {
                return num.intValue();
            }
        }
        if (aVar.f9049k == 784923401) {
            aVar.f9049k = ((Integer) t10).intValue();
        }
        int i10 = aVar.f9049k;
        if (aVar.l == 784923401) {
            aVar.l = ((Integer) aVar.f9042c).intValue();
        }
        int i11 = aVar.l;
        PointF pointF = f.f8885a;
        return (int) ((f10 * ((float) (i11 - i10))) + ((float) i10));
    }
}
