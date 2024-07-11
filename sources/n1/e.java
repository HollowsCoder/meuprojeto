package n1;

import android.graphics.PointF;
import java.util.List;
import k1.a;
import k1.c;
import k1.k;

public final class e implements h<PointF, PointF> {

    /* renamed from: a  reason: collision with root package name */
    public final b f7344a;

    /* renamed from: b  reason: collision with root package name */
    public final b f7345b;

    public e(b bVar, b bVar2) {
        this.f7344a = bVar;
        this.f7345b = bVar2;
    }

    public final a<PointF, PointF> a() {
        return new k((c) this.f7344a.a(), (c) this.f7345b.a());
    }

    public final List<u1.a<PointF>> b() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    public final boolean c() {
        return this.f7344a.c() && this.f7345b.c();
    }
}
