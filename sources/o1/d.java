package o1;

import android.graphics.Path;
import h1.l;
import j1.h;
import n1.c;
import p1.b;

public final class d implements b {

    /* renamed from: a  reason: collision with root package name */
    public final f f7611a;

    /* renamed from: b  reason: collision with root package name */
    public final Path.FillType f7612b;

    /* renamed from: c  reason: collision with root package name */
    public final c f7613c;
    public final n1.d d;

    /* renamed from: e  reason: collision with root package name */
    public final c f7614e;

    /* renamed from: f  reason: collision with root package name */
    public final c f7615f;

    /* renamed from: g  reason: collision with root package name */
    public final String f7616g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f7617h;

    public d(String str, f fVar, Path.FillType fillType, c cVar, n1.d dVar, c cVar2, c cVar3, boolean z) {
        this.f7611a = fVar;
        this.f7612b = fillType;
        this.f7613c = cVar;
        this.d = dVar;
        this.f7614e = cVar2;
        this.f7615f = cVar3;
        this.f7616g = str;
        this.f7617h = z;
    }

    public final j1.c a(l lVar, b bVar) {
        return new h(lVar, bVar, this);
    }
}
