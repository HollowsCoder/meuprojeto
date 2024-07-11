package k1;

import java.util.List;
import t1.f;
import u1.a;
import u1.c;

public final class b extends f<Integer> {
    public b(List<a<Integer>> list) {
        super(list);
    }

    public final Object g(a aVar, float f10) {
        return Integer.valueOf(l(aVar, f10));
    }

    public final int l(a<Integer> aVar, float f10) {
        T t10 = aVar.f9041b;
        if (t10 == null || aVar.f9042c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        int intValue = ((Integer) t10).intValue();
        int intValue2 = ((Integer) aVar.f9042c).intValue();
        c<A> cVar = this.f6634e;
        if (cVar != null) {
            aVar.f9046h.floatValue();
            Integer valueOf = Integer.valueOf(intValue);
            Integer valueOf2 = Integer.valueOf(intValue2);
            e();
            Integer num = (Integer) cVar.a(valueOf, valueOf2);
            if (num != null) {
                return num.intValue();
            }
        }
        return s6.a.v(f.b(f10, 0.0f, 1.0f), intValue, intValue2);
    }
}
