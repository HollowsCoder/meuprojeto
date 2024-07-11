package r1;

import android.graphics.PointF;
import s1.a;

public final class s implements d0<PointF> {

    /* renamed from: o  reason: collision with root package name */
    public static final s f8392o = new s();

    public final Object f(a aVar, float f10) {
        a.b r5 = aVar.r();
        if (r5 == a.b.BEGIN_ARRAY || r5 == a.b.BEGIN_OBJECT) {
            return m.b(aVar, f10);
        }
        if (r5 == a.b.NUMBER) {
            PointF pointF = new PointF(((float) aVar.l()) * f10, ((float) aVar.l()) * f10);
            while (aVar.g()) {
                aVar.x();
            }
            return pointF;
        }
        throw new IllegalArgumentException("Cannot convert json to point. Next token is " + r5);
    }
}
