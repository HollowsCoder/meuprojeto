package j3;

import android.graphics.drawable.Drawable;
import m3.j;

public abstract class c<T> implements g<T> {

    /* renamed from: o  reason: collision with root package name */
    public final int f6521o;

    /* renamed from: p  reason: collision with root package name */
    public final int f6522p;

    /* renamed from: q  reason: collision with root package name */
    public i3.c f6523q;

    public c() {
        if (j.h(Integer.MIN_VALUE, Integer.MIN_VALUE)) {
            this.f6521o = Integer.MIN_VALUE;
            this.f6522p = Integer.MIN_VALUE;
            return;
        }
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: -2147483648 and height: -2147483648");
    }

    public final void a() {
    }

    public final void b() {
    }

    public final void c(f fVar) {
        fVar.b(this.f6521o, this.f6522p);
    }

    public final void d(Drawable drawable) {
    }

    public final void e(f fVar) {
    }

    public final void f(Drawable drawable) {
    }

    public final void g(i3.c cVar) {
        this.f6523q = cVar;
    }

    public final i3.c h() {
        return this.f6523q;
    }

    public final void k() {
    }
}
