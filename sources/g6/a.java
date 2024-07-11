package g6;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import m6.c;
import m6.f;
import m6.i;
import m6.j;

public final class a extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    public final j f4975a = j.a.f7181a;

    /* renamed from: b  reason: collision with root package name */
    public final Paint f4976b;

    /* renamed from: c  reason: collision with root package name */
    public final Path f4977c = new Path();
    public final Rect d = new Rect();

    /* renamed from: e  reason: collision with root package name */
    public final RectF f4978e = new RectF();

    /* renamed from: f  reason: collision with root package name */
    public final RectF f4979f = new RectF();

    /* renamed from: g  reason: collision with root package name */
    public final C0070a f4980g = new C0070a();

    /* renamed from: h  reason: collision with root package name */
    public float f4981h;

    /* renamed from: i  reason: collision with root package name */
    public int f4982i;

    /* renamed from: j  reason: collision with root package name */
    public int f4983j;

    /* renamed from: k  reason: collision with root package name */
    public int f4984k;
    public int l;

    /* renamed from: m  reason: collision with root package name */
    public int f4985m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f4986n = true;

    /* renamed from: o  reason: collision with root package name */
    public i f4987o;

    /* renamed from: p  reason: collision with root package name */
    public ColorStateList f4988p;

    /* renamed from: g6.a$a  reason: collision with other inner class name */
    public class C0070a extends Drawable.ConstantState {
        public C0070a() {
        }

        public final int getChangingConfigurations() {
            return 0;
        }

        public final Drawable newDrawable() {
            return a.this;
        }
    }

    public a(i iVar) {
        this.f4987o = iVar;
        Paint paint = new Paint(1);
        this.f4976b = paint;
        paint.setStyle(Paint.Style.STROKE);
    }

    public final void draw(Canvas canvas) {
        boolean z = this.f4986n;
        Paint paint = this.f4976b;
        Rect rect = this.d;
        if (z) {
            copyBounds(rect);
            float height = this.f4981h / ((float) rect.height());
            paint.setShader(new LinearGradient(0.0f, (float) rect.top, 0.0f, (float) rect.bottom, new int[]{b0.a.b(this.f4982i, this.f4985m), b0.a.b(this.f4983j, this.f4985m), b0.a.b(b0.a.c(this.f4983j, 0), this.f4985m), b0.a.b(b0.a.c(this.l, 0), this.f4985m), b0.a.b(this.l, this.f4985m), b0.a.b(this.f4984k, this.f4985m)}, new float[]{0.0f, height, 0.5f, 0.5f, 1.0f - height, 1.0f}, Shader.TileMode.CLAMP));
            this.f4986n = false;
        }
        float strokeWidth = paint.getStrokeWidth() / 2.0f;
        copyBounds(rect);
        RectF rectF = this.f4978e;
        rectF.set(rect);
        c cVar = this.f4987o.f7154e;
        RectF rectF2 = this.f4979f;
        rectF2.set(getBounds());
        float min = Math.min(cVar.a(rectF2), rectF.width() / 2.0f);
        i iVar = this.f4987o;
        rectF2.set(getBounds());
        if (iVar.c(rectF2)) {
            rectF.inset(strokeWidth, strokeWidth);
            canvas.drawRoundRect(rectF, min, min, paint);
        }
    }

    public final Drawable.ConstantState getConstantState() {
        return this.f4980g;
    }

    public final int getOpacity() {
        return this.f4981h > 0.0f ? -3 : -2;
    }

    @TargetApi(21)
    public final void getOutline(Outline outline) {
        i iVar = this.f4987o;
        RectF rectF = this.f4979f;
        rectF.set(getBounds());
        if (iVar.c(rectF)) {
            c cVar = this.f4987o.f7154e;
            rectF.set(getBounds());
            outline.setRoundRect(getBounds(), cVar.a(rectF));
            return;
        }
        Rect rect = this.d;
        copyBounds(rect);
        RectF rectF2 = this.f4978e;
        rectF2.set(rect);
        i iVar2 = this.f4987o;
        Path path = this.f4977c;
        this.f4975a.a(iVar2, 1.0f, rectF2, (f.a) null, path);
        if (path.isConvex()) {
            outline.setConvexPath(path);
        }
    }

    public final boolean getPadding(Rect rect) {
        i iVar = this.f4987o;
        RectF rectF = this.f4979f;
        rectF.set(getBounds());
        if (!iVar.c(rectF)) {
            return true;
        }
        int round = Math.round(this.f4981h);
        rect.set(round, round, round, round);
        return true;
    }

    public final boolean isStateful() {
        ColorStateList colorStateList = this.f4988p;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    public final void onBoundsChange(Rect rect) {
        this.f4986n = true;
    }

    public final boolean onStateChange(int[] iArr) {
        int colorForState;
        ColorStateList colorStateList = this.f4988p;
        if (!(colorStateList == null || (colorForState = colorStateList.getColorForState(iArr, this.f4985m)) == this.f4985m)) {
            this.f4986n = true;
            this.f4985m = colorForState;
        }
        if (this.f4986n) {
            invalidateSelf();
        }
        return this.f4986n;
    }

    public final void setAlpha(int i10) {
        this.f4976b.setAlpha(i10);
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f4976b.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
