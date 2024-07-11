package o1;

import android.graphics.Path;
import h1.l;
import j1.c;
import j1.g;
import n1.a;
import n1.d;
import p1.b;

public final class m implements b {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f7654a;

    /* renamed from: b  reason: collision with root package name */
    public final Path.FillType f7655b;

    /* renamed from: c  reason: collision with root package name */
    public final String f7656c;
    public final a d;

    /* renamed from: e  reason: collision with root package name */
    public final d f7657e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f7658f;

    public m(String str, boolean z, Path.FillType fillType, a aVar, d dVar, boolean z10) {
        this.f7656c = str;
        this.f7654a = z;
        this.f7655b = fillType;
        this.d = aVar;
        this.f7657e = dVar;
        this.f7658f = z10;
    }

    public final c a(l lVar, b bVar) {
        return new g(lVar, bVar, this);
    }

    public final String toString() {
        return "ShapeFill{color=, fillEnabled=" + this.f7654a + '}';
    }
}
