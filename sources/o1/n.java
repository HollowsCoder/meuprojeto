package o1;

import h1.l;
import j1.c;
import j1.d;
import java.util.Arrays;
import java.util.List;
import p1.b;

public final class n implements b {

    /* renamed from: a  reason: collision with root package name */
    public final String f7659a;

    /* renamed from: b  reason: collision with root package name */
    public final List<b> f7660b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f7661c;

    public n(String str, List<b> list, boolean z) {
        this.f7659a = str;
        this.f7660b = list;
        this.f7661c = z;
    }

    public final c a(l lVar, b bVar) {
        return new d(lVar, bVar, this);
    }

    public final String toString() {
        return "ShapeGroup{name='" + this.f7659a + "' Shapes: " + Arrays.toString(this.f7660b.toArray()) + '}';
    }
}
