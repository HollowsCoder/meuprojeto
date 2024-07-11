package h6;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.appcompat.widget.o0;
import com.karumi.dexter.R;
import p9.u;

public class f extends o0 {
    public Drawable D;
    public final Rect E;
    public final Rect F;
    public int G;
    public final boolean H;
    public boolean I;

    public f(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public f(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, 0);
        this.E = new Rect();
        this.F = new Rect();
        this.G = R.styleable.AppCompatTheme_windowActionModeOverlay;
        this.H = true;
        this.I = false;
        TypedArray d = k.d(context, attributeSet, u.A, 0, 0, new int[0]);
        this.G = d.getInt(1, this.G);
        Drawable drawable = d.getDrawable(0);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.H = d.getBoolean(2, true);
        d.recycle();
    }

    public final void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.D;
        if (drawable != null) {
            if (this.I) {
                this.I = false;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                boolean z = this.H;
                Rect rect = this.E;
                if (z) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                int i10 = this.G;
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                Rect rect2 = this.F;
                Gravity.apply(i10, intrinsicWidth, intrinsicHeight, rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @TargetApi(21)
    public final void drawableHotspotChanged(float f10, float f11) {
        super.drawableHotspotChanged(f10, f11);
        Drawable drawable = this.D;
        if (drawable != null) {
            drawable.setHotspot(f10, f11);
        }
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.D;
        if (drawable != null && drawable.isStateful()) {
            this.D.setState(getDrawableState());
        }
    }

    public Drawable getForeground() {
        return this.D;
    }

    public int getForegroundGravity() {
        return this.G;
    }

    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.D;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public final void onLayout(boolean z, int i10, int i11, int i12, int i13) {
        super.onLayout(z, i10, i11, i12, i13);
        this.I = z | this.I;
    }

    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.I = true;
    }

    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.D;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
                unscheduleDrawable(this.D);
            }
            this.D = drawable;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.G == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    public void setForegroundGravity(int i10) {
        if (this.G != i10) {
            if ((8388615 & i10) == 0) {
                i10 |= 8388611;
            }
            if ((i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
                i10 |= 48;
            }
            this.G = i10;
            if (i10 == 119 && this.D != null) {
                this.D.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.D;
    }
}
