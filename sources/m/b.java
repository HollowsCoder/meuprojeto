package m;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

public final class b extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    public float f7005a;

    /* renamed from: b  reason: collision with root package name */
    public final Paint f7006b;

    /* renamed from: c  reason: collision with root package name */
    public final RectF f7007c;
    public final Rect d;

    /* renamed from: e  reason: collision with root package name */
    public float f7008e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f7009f = false;

    /* renamed from: g  reason: collision with root package name */
    public boolean f7010g = true;

    /* renamed from: h  reason: collision with root package name */
    public ColorStateList f7011h;

    /* renamed from: i  reason: collision with root package name */
    public PorterDuffColorFilter f7012i;

    /* renamed from: j  reason: collision with root package name */
    public ColorStateList f7013j;

    /* renamed from: k  reason: collision with root package name */
    public PorterDuff.Mode f7014k = PorterDuff.Mode.SRC_IN;

    public b(float f10, ColorStateList colorStateList) {
        this.f7005a = f10;
        this.f7006b = new Paint(5);
        b(colorStateList);
        this.f7007c = new RectF();
        this.d = new Rect();
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public final void b(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f7011h = colorStateList;
        this.f7006b.setColor(colorStateList.getColorForState(getState(), this.f7011h.getDefaultColor()));
    }

    public final void c(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        RectF rectF = this.f7007c;
        rectF.set((float) rect.left, (float) rect.top, (float) rect.right, (float) rect.bottom);
        Rect rect2 = this.d;
        rect2.set(rect);
        if (this.f7009f) {
            float f10 = this.f7008e;
            float f11 = this.f7005a;
            boolean z = this.f7010g;
            float f12 = 1.5f * f10;
            if (z) {
                f12 = (float) (((1.0d - c.f7015a) * ((double) f11)) + ((double) f12));
            } else {
                int i10 = c.f7016b;
            }
            if (z) {
                f10 = (float) (((1.0d - c.f7015a) * ((double) f11)) + ((double) f10));
            }
            rect2.inset((int) Math.ceil((double) f10), (int) Math.ceil((double) f12));
            rectF.set(rect2);
        }
    }

    public final void draw(Canvas canvas) {
        boolean z;
        Paint paint = this.f7006b;
        if (this.f7012i == null || paint.getColorFilter() != null) {
            z = false;
        } else {
            paint.setColorFilter(this.f7012i);
            z = true;
        }
        RectF rectF = this.f7007c;
        float f10 = this.f7005a;
        canvas.drawRoundRect(rectF, f10, f10, paint);
        if (z) {
            paint.setColorFilter((ColorFilter) null);
        }
    }

    public final int getOpacity() {
        return -3;
    }

    public final void getOutline(Outline outline) {
        outline.setRoundRect(this.d, this.f7005a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        r0 = r1.f7011h;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean isStateful() {
        /*
            r1 = this;
            android.content.res.ColorStateList r0 = r1.f7013j
            if (r0 == 0) goto L_0x000a
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x001a
        L_0x000a:
            android.content.res.ColorStateList r0 = r1.f7011h
            if (r0 == 0) goto L_0x0014
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x001a
        L_0x0014:
            boolean r0 = super.isStateful()
            if (r0 == 0) goto L_0x001c
        L_0x001a:
            r0 = 1
            goto L_0x001d
        L_0x001c:
            r0 = 0
        L_0x001d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: m.b.isStateful():boolean");
    }

    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        c(rect);
    }

    public final boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f7011h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        Paint paint = this.f7006b;
        boolean z = colorForState != paint.getColor();
        if (z) {
            paint.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f7013j;
        if (colorStateList2 == null || (mode = this.f7014k) == null) {
            return z;
        }
        this.f7012i = a(colorStateList2, mode);
        return true;
    }

    public final void setAlpha(int i10) {
        this.f7006b.setAlpha(i10);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f7006b.setColorFilter(colorFilter);
    }

    public final void setTintList(ColorStateList colorStateList) {
        this.f7013j = colorStateList;
        this.f7012i = a(colorStateList, this.f7014k);
        invalidateSelf();
    }

    public final void setTintMode(PorterDuff.Mode mode) {
        this.f7014k = mode;
        this.f7012i = a(this.f7013j, mode);
        invalidateSelf();
    }
}
