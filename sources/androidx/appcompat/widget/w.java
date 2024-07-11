package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.karumi.dexter.R;

public final class w extends SeekBar {

    /* renamed from: o  reason: collision with root package name */
    public final x f722o;

    public w(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarStyle);
        z0.a(this, getContext());
        x xVar = new x(this);
        this.f722o = xVar;
        xVar.a(attributeSet, R.attr.seekBarStyle);
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        x xVar = this.f722o;
        Drawable drawable = xVar.f723e;
        if (drawable != null && drawable.isStateful()) {
            SeekBar seekBar = xVar.d;
            if (drawable.setState(seekBar.getDrawableState())) {
                seekBar.invalidateDrawable(drawable);
            }
        }
    }

    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f722o.f723e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f722o.d(canvas);
    }
}
