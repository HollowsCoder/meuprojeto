package k1;

import android.graphics.PointF;
import java.util.List;
import o1.c;
import t1.f;
import u1.a;

public final class d extends f {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ int f6643i;

    /* renamed from: j  reason: collision with root package name */
    public final Object f6644j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(int i10, List list) {
        super(list);
        this.f6643i = i10;
        if (i10 != 1) {
            int i11 = 0;
            c cVar = (c) ((a) list.get(0)).f9041b;
            i11 = cVar != null ? cVar.f7610b.length : i11;
            this.f6644j = new c(new float[i11], new int[i11]);
            return;
        }
        super(list);
        this.f6644j = new PointF();
    }

    public final Object g(a aVar, float f10) {
        switch (this.f6643i) {
            case 0:
                c cVar = (c) this.f6644j;
                c cVar2 = (c) aVar.f9041b;
                c cVar3 = (c) aVar.f9042c;
                cVar.getClass();
                int[] iArr = cVar2.f7610b;
                int length = iArr.length;
                int[] iArr2 = cVar3.f7610b;
                if (length == iArr2.length) {
                    for (int i10 = 0; i10 < iArr.length; i10++) {
                        float f11 = cVar2.f7609a[i10];
                        float f12 = cVar3.f7609a[i10];
                        PointF pointF = f.f8885a;
                        cVar.f7609a[i10] = b0.d.a(f12, f11, f10, f11);
                        cVar.f7610b[i10] = s6.a.v(f10, iArr[i10], iArr2[i10]);
                    }
                    return cVar;
                }
                throw new IllegalArgumentException("Cannot interpolate between gradients. Lengths vary (" + iArr.length + " vs " + iArr2.length + ")");
            default:
                return l(aVar, f10, f10, f10);
        }
    }

    public final /* bridge */ /* synthetic */ Object h(a aVar, float f10, float f11, float f12) {
        switch (this.f6643i) {
            case 1:
                return l(aVar, f10, f11, f12);
            default:
                super.h(aVar, f10, f11, f12);
                throw null;
        }
    }

    public final PointF l(a aVar, float f10, float f11, float f12) {
        T t10;
        T t11 = aVar.f9041b;
        if (t11 == null || (t10 = aVar.f9042c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        PointF pointF = (PointF) t11;
        PointF pointF2 = (PointF) t10;
        u1.c<A> cVar = this.f6634e;
        if (cVar != null) {
            aVar.f9046h.floatValue();
            e();
            PointF pointF3 = (PointF) cVar.a(pointF, pointF2);
            if (pointF3 != null) {
                return pointF3;
            }
        }
        PointF pointF4 = (PointF) this.f6644j;
        float f13 = pointF.x;
        float a10 = b0.d.a(pointF2.x, f13, f11, f13);
        float f14 = pointF.y;
        pointF4.set(a10, ((pointF2.y - f14) * f12) + f14);
        return pointF4;
    }
}
