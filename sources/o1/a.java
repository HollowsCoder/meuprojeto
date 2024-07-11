package o1;

import android.graphics.PointF;
import h1.l;
import j1.f;
import n1.c;
import n1.h;
import p1.b;

public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    public final String f7605a;

    /* renamed from: b  reason: collision with root package name */
    public final h<PointF, PointF> f7606b;

    /* renamed from: c  reason: collision with root package name */
    public final c f7607c;
    public final boolean d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f7608e;

    public a(String str, h<PointF, PointF> hVar, c cVar, boolean z, boolean z10) {
        this.f7605a = str;
        this.f7606b = hVar;
        this.f7607c = cVar;
        this.d = z;
        this.f7608e = z10;
    }

    public final j1.c a(l lVar, b bVar) {
        return new f(lVar, bVar, this);
    }
}
