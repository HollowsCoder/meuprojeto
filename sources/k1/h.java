package k1;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.List;
import u1.a;
import u1.c;

public final class h extends f<PointF> {

    /* renamed from: i  reason: collision with root package name */
    public final PointF f6647i = new PointF();

    /* renamed from: j  reason: collision with root package name */
    public final float[] f6648j = new float[2];

    /* renamed from: k  reason: collision with root package name */
    public final PathMeasure f6649k = new PathMeasure();
    public g l;

    public h(List<? extends a<PointF>> list) {
        super(list);
    }

    public final Object g(a aVar, float f10) {
        g gVar = (g) aVar;
        Path path = gVar.f6645q;
        if (path == null) {
            return (PointF) aVar.f9041b;
        }
        c<A> cVar = this.f6634e;
        if (cVar != null) {
            gVar.f9046h.floatValue();
            T t10 = gVar.f9042c;
            e();
            PointF pointF = (PointF) cVar.a(gVar.f9041b, t10);
            if (pointF != null) {
                return pointF;
            }
        }
        g gVar2 = this.l;
        PathMeasure pathMeasure = this.f6649k;
        if (gVar2 != gVar) {
            pathMeasure.setPath(path, false);
            this.l = gVar;
        }
        float[] fArr = this.f6648j;
        pathMeasure.getPosTan(pathMeasure.getLength() * f10, fArr, (float[]) null);
        PointF pointF2 = this.f6647i;
        pointF2.set(fArr[0], fArr[1]);
        return pointF2;
    }
}
