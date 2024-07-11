package b3;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import d3.c;
import s2.s;
import s2.w;
import s6.a;

public abstract class b<T extends Drawable> implements w<T>, s {

    /* renamed from: o  reason: collision with root package name */
    public final T f1953o;

    public b(T t10) {
        a.n(t10);
        this.f1953o = t10;
    }

    public void a() {
        Bitmap bitmap;
        T t10 = this.f1953o;
        if (t10 instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) t10).getBitmap();
        } else if (t10 instanceof c) {
            bitmap = ((c) t10).f4151o.f4159a.l;
        } else {
            return;
        }
        bitmap.prepareToDraw();
    }

    public final Object get() {
        T t10 = this.f1953o;
        Drawable.ConstantState constantState = t10.getConstantState();
        return constantState == null ? t10 : constantState.newDrawable();
    }
}
