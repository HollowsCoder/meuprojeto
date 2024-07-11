package d3;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import com.karumi.dexter.R;
import d3.f;
import java.util.ArrayList;

public final class c extends Drawable implements f.b, Animatable {

    /* renamed from: o  reason: collision with root package name */
    public final a f4151o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f4152p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f4153q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f4154r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f4155s;

    /* renamed from: t  reason: collision with root package name */
    public int f4156t;
    public final int u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f4157v;
    public Paint w;

    /* renamed from: x  reason: collision with root package name */
    public Rect f4158x;

    public static final class a extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        public final f f4159a;

        public a(f fVar) {
            this.f4159a = fVar;
        }

        public final int getChangingConfigurations() {
            return 0;
        }

        public final Drawable newDrawable() {
            return new c(this);
        }

        public final Drawable newDrawable(Resources resources) {
            return new c(this);
        }
    }

    public c() {
        throw null;
    }

    public c(a aVar) {
        this.f4155s = true;
        this.u = -1;
        s6.a.n(aVar);
        this.f4151o = aVar;
    }

    public final void a() {
        int i10;
        Drawable.Callback callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        if (callback == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        f fVar = this.f4151o.f4159a;
        f.a aVar = fVar.f4168i;
        if (aVar != null) {
            i10 = aVar.f4177s;
        } else {
            i10 = -1;
        }
        if (i10 == fVar.f4161a.d() - 1) {
            this.f4156t++;
        }
        int i11 = this.u;
        if (i11 != -1 && this.f4156t >= i11) {
            stop();
        }
    }

    public final void b() {
        s6.a.l("You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.", !this.f4154r);
        a aVar = this.f4151o;
        if (aVar.f4159a.f4161a.d() != 1) {
            if (!this.f4152p) {
                this.f4152p = true;
                f fVar = aVar.f4159a;
                if (!fVar.f4169j) {
                    ArrayList arrayList = fVar.f4163c;
                    if (!arrayList.contains(this)) {
                        boolean isEmpty = arrayList.isEmpty();
                        arrayList.add(this);
                        if (isEmpty && !fVar.f4165f) {
                            fVar.f4165f = true;
                            fVar.f4169j = false;
                            fVar.a();
                        }
                    } else {
                        throw new IllegalStateException("Cannot subscribe twice in a row");
                    }
                } else {
                    throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
                }
            } else {
                return;
            }
        }
        invalidateSelf();
    }

    public final void draw(Canvas canvas) {
        Bitmap bitmap;
        if (!this.f4154r) {
            if (this.f4157v) {
                int intrinsicWidth = getIntrinsicWidth();
                int intrinsicHeight = getIntrinsicHeight();
                Rect bounds = getBounds();
                if (this.f4158x == null) {
                    this.f4158x = new Rect();
                }
                Gravity.apply(R.styleable.AppCompatTheme_windowActionModeOverlay, intrinsicWidth, intrinsicHeight, bounds, this.f4158x);
                this.f4157v = false;
            }
            f fVar = this.f4151o.f4159a;
            f.a aVar = fVar.f4168i;
            if (aVar != null) {
                bitmap = aVar.u;
            } else {
                bitmap = fVar.l;
            }
            if (this.f4158x == null) {
                this.f4158x = new Rect();
            }
            Rect rect = this.f4158x;
            if (this.w == null) {
                this.w = new Paint(2);
            }
            canvas.drawBitmap(bitmap, (Rect) null, rect, this.w);
        }
    }

    public final Drawable.ConstantState getConstantState() {
        return this.f4151o;
    }

    public final int getIntrinsicHeight() {
        return this.f4151o.f4159a.f4175q;
    }

    public final int getIntrinsicWidth() {
        return this.f4151o.f4159a.f4174p;
    }

    public final int getOpacity() {
        return -2;
    }

    public final boolean isRunning() {
        return this.f4152p;
    }

    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f4157v = true;
    }

    public final void setAlpha(int i10) {
        if (this.w == null) {
            this.w = new Paint(2);
        }
        this.w.setAlpha(i10);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.w == null) {
            this.w = new Paint(2);
        }
        this.w.setColorFilter(colorFilter);
    }

    public final boolean setVisible(boolean z, boolean z10) {
        s6.a.l("Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.", !this.f4154r);
        this.f4155s = z;
        if (!z) {
            this.f4152p = false;
            f fVar = this.f4151o.f4159a;
            ArrayList arrayList = fVar.f4163c;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                fVar.f4165f = false;
            }
        } else if (this.f4153q) {
            b();
        }
        return super.setVisible(z, z10);
    }

    public final void start() {
        this.f4153q = true;
        this.f4156t = 0;
        if (this.f4155s) {
            b();
        }
    }

    public final void stop() {
        this.f4153q = false;
        this.f4152p = false;
        f fVar = this.f4151o.f4159a;
        ArrayList arrayList = fVar.f4163c;
        arrayList.remove(this);
        if (arrayList.isEmpty()) {
            fVar.f4165f = false;
        }
    }
}
