package k1;

import android.graphics.Path;
import android.graphics.PointF;
import h1.f;
import t1.g;
import u1.a;

public final class g extends a<PointF> {

    /* renamed from: q  reason: collision with root package name */
    public Path f6645q;

    /* renamed from: r  reason: collision with root package name */
    public final a<PointF> f6646r;

    public g(f fVar, a<PointF> aVar) {
        super(fVar, aVar.f9041b, aVar.f9042c, aVar.d, aVar.f9043e, aVar.f9044f, aVar.f9045g, aVar.f9046h);
        this.f6646r = aVar;
        d();
    }

    public final void d() {
        boolean z;
        T t10;
        T t11 = this.f9042c;
        T t12 = this.f9041b;
        if (t11 == null || t12 == null || !((PointF) t12).equals(((PointF) t11).x, ((PointF) t11).y)) {
            z = false;
        } else {
            z = true;
        }
        if (t12 != null && (t10 = this.f9042c) != null && !z) {
            PointF pointF = (PointF) t12;
            PointF pointF2 = (PointF) t10;
            a<PointF> aVar = this.f6646r;
            PointF pointF3 = aVar.f9052o;
            PointF pointF4 = aVar.f9053p;
            g.a aVar2 = t1.g.f8886a;
            Path path = new Path();
            path.moveTo(pointF.x, pointF.y);
            if (pointF3 == null || pointF4 == null || (pointF3.length() == 0.0f && pointF4.length() == 0.0f)) {
                path.lineTo(pointF2.x, pointF2.y);
            } else {
                float f10 = pointF.x;
                float f11 = pointF2.x;
                float f12 = pointF2.y;
                path.cubicTo(pointF3.x + f10, pointF.y + pointF3.y, f11 + pointF4.x, f12 + pointF4.y, f11, f12);
            }
            this.f6645q = path;
        }
    }
}
