package z2;

import android.graphics.Bitmap;
import m3.j;
import s2.s;
import s2.w;
import t2.c;

public final class d implements w<Bitmap>, s {

    /* renamed from: o  reason: collision with root package name */
    public final Bitmap f9807o;

    /* renamed from: p  reason: collision with root package name */
    public final c f9808p;

    public d(Bitmap bitmap, c cVar) {
        if (bitmap != null) {
            this.f9807o = bitmap;
            if (cVar != null) {
                this.f9808p = cVar;
                return;
            }
            throw new NullPointerException("BitmapPool must not be null");
        }
        throw new NullPointerException("Bitmap must not be null");
    }

    public static d e(Bitmap bitmap, c cVar) {
        if (bitmap == null) {
            return null;
        }
        return new d(bitmap, cVar);
    }

    public final void a() {
        this.f9807o.prepareToDraw();
    }

    public final int b() {
        return j.c(this.f9807o);
    }

    public final Class<Bitmap> c() {
        return Bitmap.class;
    }

    public final void d() {
        this.f9808p.e(this.f9807o);
    }

    public final Object get() {
        return this.f9807o;
    }
}
