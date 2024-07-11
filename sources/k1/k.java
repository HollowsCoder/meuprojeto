package k1;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Collections;
import k1.a;
import u1.a;
import u1.c;

public final class k extends a<PointF, PointF> {

    /* renamed from: i  reason: collision with root package name */
    public final PointF f6653i = new PointF();

    /* renamed from: j  reason: collision with root package name */
    public final PointF f6654j = new PointF();

    /* renamed from: k  reason: collision with root package name */
    public final a<Float, Float> f6655k;
    public final a<Float, Float> l;

    /* renamed from: m  reason: collision with root package name */
    public c<Float> f6656m;

    /* renamed from: n  reason: collision with root package name */
    public c<Float> f6657n;

    public k(c cVar, c cVar2) {
        super(Collections.emptyList());
        this.f6655k = cVar;
        this.l = cVar2;
        j(this.d);
    }

    public final Object f() {
        return l(0.0f);
    }

    public final /* bridge */ /* synthetic */ Object g(a aVar, float f10) {
        return l(f10);
    }

    public final void j(float f10) {
        a<Float, Float> aVar = this.f6655k;
        aVar.j(f10);
        a<Float, Float> aVar2 = this.l;
        aVar2.j(f10);
        this.f6653i.set(aVar.f().floatValue(), aVar2.f().floatValue());
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f6631a;
            if (i10 < arrayList.size()) {
                ((a.C0091a) arrayList.get(i10)).b();
                i10++;
            } else {
                return;
            }
        }
    }

    public final PointF l(float f10) {
        Float f11;
        a<Float, Float> aVar;
        u1.a<Float> b10;
        a<Float, Float> aVar2;
        u1.a<Float> b11;
        Float f12 = null;
        if (this.f6656m == null || (b11 = aVar2.b()) == null) {
            f11 = null;
        } else {
            (aVar2 = this.f6655k).d();
            Float f13 = b11.f9046h;
            c<Float> cVar = this.f6656m;
            if (f13 != null) {
                f13.floatValue();
            }
            f11 = (Float) cVar.a(b11.f9041b, b11.f9042c);
        }
        if (!(this.f6657n == null || (b10 = aVar.b()) == null)) {
            (aVar = this.l).d();
            Float f14 = b10.f9046h;
            c<Float> cVar2 = this.f6657n;
            if (f14 != null) {
                f14.floatValue();
            }
            f12 = (Float) cVar2.a(b10.f9041b, b10.f9042c);
        }
        PointF pointF = this.f6653i;
        PointF pointF2 = this.f6654j;
        pointF2.set(f11 == null ? pointF.x : f11.floatValue(), 0.0f);
        pointF2.set(pointF2.x, f12 == null ? pointF.y : f12.floatValue());
        return pointF2;
    }
}
