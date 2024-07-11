package o1;

import android.graphics.PointF;
import h1.l;
import j1.o;
import n1.b;
import n1.c;
import n1.h;

public final class j implements b {

    /* renamed from: a  reason: collision with root package name */
    public final String f7643a;

    /* renamed from: b  reason: collision with root package name */
    public final h<PointF, PointF> f7644b;

    /* renamed from: c  reason: collision with root package name */
    public final h<PointF, PointF> f7645c;
    public final b d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f7646e;

    public j(String str, h hVar, c cVar, b bVar, boolean z) {
        this.f7643a = str;
        this.f7644b = hVar;
        this.f7645c = cVar;
        this.d = bVar;
        this.f7646e = z;
    }

    public final j1.c a(l lVar, p1.b bVar) {
        return new o(lVar, bVar, this);
    }

    public final String toString() {
        return "RectangleShape{position=" + this.f7644b + ", size=" + this.f7645c + '}';
    }
}
