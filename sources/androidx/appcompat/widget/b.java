package androidx.appcompat.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;

public final class b extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    public final ActionBarContainer f509a;

    public b(ActionBarContainer actionBarContainer) {
        this.f509a = actionBarContainer;
    }

    public final void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f509a;
        if (actionBarContainer.f386v) {
            Drawable drawable = actionBarContainer.u;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f384s;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Drawable drawable3 = actionBarContainer.f385t;
        if (drawable3 != null && actionBarContainer.w) {
            drawable3.draw(canvas);
        }
    }

    public final int getOpacity() {
        return 0;
    }

    public final void getOutline(Outline outline) {
        Drawable drawable;
        ActionBarContainer actionBarContainer = this.f509a;
        if (actionBarContainer.f386v) {
            drawable = actionBarContainer.u;
            if (drawable == null) {
                return;
            }
        } else {
            drawable = actionBarContainer.f384s;
            if (drawable == null) {
                return;
            }
        }
        drawable.getOutline(outline);
    }

    public final void setAlpha(int i10) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
