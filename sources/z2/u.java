package z2;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import s2.s;
import s2.w;
import s6.a;

public final class u implements w<BitmapDrawable>, s {

    /* renamed from: o  reason: collision with root package name */
    public final Resources f9857o;

    /* renamed from: p  reason: collision with root package name */
    public final w<Bitmap> f9858p;

    public u(Resources resources, w<Bitmap> wVar) {
        a.n(resources);
        this.f9857o = resources;
        a.n(wVar);
        this.f9858p = wVar;
    }

    public final void a() {
        w<Bitmap> wVar = this.f9858p;
        if (wVar instanceof s) {
            ((s) wVar).a();
        }
    }

    public final int b() {
        return this.f9858p.b();
    }

    public final Class<BitmapDrawable> c() {
        return BitmapDrawable.class;
    }

    public final void d() {
        this.f9858p.d();
    }

    public final Object get() {
        return new BitmapDrawable(this.f9857o, this.f9858p.get());
    }
}
