package k1;

import android.graphics.Path;
import android.graphics.PointF;
import b0.d;
import java.util.ArrayList;
import java.util.List;
import o1.l;
import t1.c;
import t1.f;
import u1.a;

public final class j extends a<l, Path> {

    /* renamed from: i  reason: collision with root package name */
    public final l f6651i = new l();

    /* renamed from: j  reason: collision with root package name */
    public final Path f6652j = new Path();

    public j(List<a<l>> list) {
        super(list);
    }

    public final Object g(a aVar, float f10) {
        boolean z;
        a aVar2 = aVar;
        float f11 = f10;
        l lVar = (l) aVar2.f9041b;
        l lVar2 = (l) aVar2.f9042c;
        l lVar3 = this.f6651i;
        if (lVar3.f7652b == null) {
            lVar3.f7652b = new PointF();
        }
        if (lVar.f7653c || lVar2.f7653c) {
            z = true;
        } else {
            z = false;
        }
        lVar3.f7653c = z;
        ArrayList arrayList = lVar.f7651a;
        int size = arrayList.size();
        int size2 = lVar2.f7651a.size();
        ArrayList arrayList2 = lVar2.f7651a;
        if (size != size2) {
            c.b("Curves must have the same number of control points. Shape 1: " + arrayList.size() + "\tShape 2: " + arrayList2.size());
        }
        int min = Math.min(arrayList.size(), arrayList2.size());
        ArrayList arrayList3 = lVar3.f7651a;
        if (arrayList3.size() < min) {
            for (int size3 = arrayList3.size(); size3 < min; size3++) {
                arrayList3.add(new m1.a());
            }
        } else if (arrayList3.size() > min) {
            for (int size4 = arrayList3.size() - 1; size4 >= min; size4--) {
                arrayList3.remove(arrayList3.size() - 1);
            }
        }
        PointF pointF = lVar.f7652b;
        PointF pointF2 = lVar2.f7652b;
        float f12 = pointF.x;
        float f13 = pointF2.x;
        PointF pointF3 = f.f8885a;
        float a10 = d.a(f13, f12, f11, f12);
        float f14 = pointF.y;
        float a11 = d.a(pointF2.y, f14, f11, f14);
        if (lVar3.f7652b == null) {
            lVar3.f7652b = new PointF();
        }
        lVar3.f7652b.set(a10, a11);
        for (int size5 = arrayList3.size() - 1; size5 >= 0; size5--) {
            m1.a aVar3 = (m1.a) arrayList.get(size5);
            m1.a aVar4 = (m1.a) arrayList2.get(size5);
            PointF pointF4 = aVar3.f7028a;
            PointF pointF5 = aVar4.f7028a;
            float f15 = pointF4.x;
            float a12 = d.a(pointF5.x, f15, f11, f15);
            float f16 = pointF4.y;
            ((m1.a) arrayList3.get(size5)).f7028a.set(a12, d.a(pointF5.y, f16, f11, f16));
            PointF pointF6 = aVar3.f7029b;
            float f17 = pointF6.x;
            PointF pointF7 = aVar4.f7029b;
            float a13 = d.a(pointF7.x, f17, f11, f17);
            float f18 = pointF6.y;
            ((m1.a) arrayList3.get(size5)).f7029b.set(a13, d.a(pointF7.y, f18, f11, f18));
            PointF pointF8 = aVar3.f7030c;
            float f19 = pointF8.x;
            PointF pointF9 = aVar4.f7030c;
            float a14 = d.a(pointF9.x, f19, f11, f19);
            float f20 = pointF8.y;
            ((m1.a) arrayList3.get(size5)).f7030c.set(a14, d.a(pointF9.y, f20, f11, f20));
        }
        Path path = this.f6652j;
        path.reset();
        PointF pointF10 = lVar3.f7652b;
        path.moveTo(pointF10.x, pointF10.y);
        PointF pointF11 = f.f8885a;
        pointF11.set(pointF10.x, pointF10.y);
        for (int i10 = 0; i10 < arrayList3.size(); i10++) {
            m1.a aVar5 = (m1.a) arrayList3.get(i10);
            PointF pointF12 = aVar5.f7028a;
            boolean equals = pointF12.equals(pointF11);
            PointF pointF13 = aVar5.f7029b;
            PointF pointF14 = aVar5.f7030c;
            if (!equals || !pointF13.equals(pointF14)) {
                path.cubicTo(pointF12.x, pointF12.y, pointF13.x, pointF13.y, pointF14.x, pointF14.y);
            } else {
                path.lineTo(pointF14.x, pointF14.y);
            }
            pointF11.set(pointF14.x, pointF14.y);
        }
        if (lVar3.f7653c) {
            path.close();
        }
        return path;
    }
}
