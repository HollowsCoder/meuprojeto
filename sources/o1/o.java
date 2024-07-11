package o1;

import h1.l;
import j1.c;
import j1.q;
import n1.a;
import p1.b;

public final class o implements b {

    /* renamed from: a  reason: collision with root package name */
    public final String f7662a;

    /* renamed from: b  reason: collision with root package name */
    public final int f7663b;

    /* renamed from: c  reason: collision with root package name */
    public final a f7664c;
    public final boolean d;

    public o(String str, int i10, a aVar, boolean z) {
        this.f7662a = str;
        this.f7663b = i10;
        this.f7664c = aVar;
        this.d = z;
    }

    public final c a(l lVar, b bVar) {
        return new q(lVar, bVar, this);
    }

    public final String toString() {
        return "ShapePath{name=" + this.f7662a + ", index=" + this.f7663b + '}';
    }
}
