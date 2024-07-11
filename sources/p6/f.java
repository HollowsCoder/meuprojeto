package p6;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import m6.i;

public final class f extends m6.f {
    public final Paint L;
    public final RectF M;
    public int N;

    public f() {
        this((i) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(i iVar) {
        super(iVar == null ? new i() : iVar);
        Paint paint = new Paint(1);
        this.L = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.M = new RectF();
    }

    public final void draw(Canvas canvas) {
        Drawable.Callback callback = getCallback();
        if (callback instanceof View) {
            View view = (View) callback;
            if (view.getLayerType() != 2) {
                view.setLayerType(2, (Paint) null);
            }
        } else {
            this.N = canvas.saveLayer(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight(), (Paint) null);
        }
        super.draw(canvas);
        canvas.drawRect(this.M, this.L);
        if (!(getCallback() instanceof View)) {
            canvas.restoreToCount(this.N);
        }
    }

    public final void n(float f10, float f11, float f12, float f13) {
        RectF rectF = this.M;
        if (f10 != rectF.left || f11 != rectF.top || f12 != rectF.right || f13 != rectF.bottom) {
            rectF.set(f10, f11, f12, f13);
            invalidateSelf();
        }
    }
}
