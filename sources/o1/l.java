package o1;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;
import m1.a;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f7651a;

    /* renamed from: b  reason: collision with root package name */
    public PointF f7652b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f7653c;

    public l() {
        this.f7651a = new ArrayList();
    }

    public l(PointF pointF, boolean z, List<a> list) {
        this.f7652b = pointF;
        this.f7653c = z;
        this.f7651a = new ArrayList(list);
    }

    public final String toString() {
        return "ShapeData{numCurves=" + this.f7651a.size() + "closed=" + this.f7653c + '}';
    }
}
