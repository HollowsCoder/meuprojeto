package j3;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

public abstract class e<Z> extends h<ImageView, Z> {

    /* renamed from: q  reason: collision with root package name */
    public Animatable f6524q;

    public e(ImageView imageView) {
        super(imageView);
    }

    public final void a() {
        Animatable animatable = this.f6524q;
        if (animatable != null) {
            animatable.stop();
        }
    }

    public final void d(Drawable drawable) {
        l((Object) null);
        this.f6524q = null;
        ((ImageView) this.f6525o).setImageDrawable(drawable);
    }

    public final void f(Drawable drawable) {
        l((Object) null);
        this.f6524q = null;
        ((ImageView) this.f6525o).setImageDrawable(drawable);
    }

    public final void i(Drawable drawable) {
        super.i(drawable);
        Animatable animatable = this.f6524q;
        if (animatable != null) {
            animatable.stop();
        }
        l((Object) null);
        this.f6524q = null;
        ((ImageView) this.f6525o).setImageDrawable(drawable);
    }

    public final void j(Object obj) {
        l(obj);
        if (obj instanceof Animatable) {
            Animatable animatable = (Animatable) obj;
            this.f6524q = animatable;
            animatable.start();
            return;
        }
        this.f6524q = null;
    }

    public final void k() {
        Animatable animatable = this.f6524q;
        if (animatable != null) {
            animatable.start();
        }
    }

    public abstract void l(Z z);
}
