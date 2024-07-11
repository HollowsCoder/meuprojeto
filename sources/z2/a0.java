package z2;

import android.graphics.Bitmap;
import q2.h;
import q2.j;
import s2.w;

public final class a0 implements j<Bitmap, Bitmap> {

    public static final class a implements w<Bitmap> {

        /* renamed from: o  reason: collision with root package name */
        public final Bitmap f9795o;

        public a(Bitmap bitmap) {
            this.f9795o = bitmap;
        }

        public final int b() {
            return m3.j.c(this.f9795o);
        }

        public final Class<Bitmap> c() {
            return Bitmap.class;
        }

        public final void d() {
        }

        public final Object get() {
            return this.f9795o;
        }
    }

    public final w a(Object obj, int i10, int i11, h hVar) {
        return new a((Bitmap) obj);
    }

    public final /* bridge */ /* synthetic */ boolean b(Object obj, h hVar) {
        Bitmap bitmap = (Bitmap) obj;
        return true;
    }
}
