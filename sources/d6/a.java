package d6;

import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

public final class a implements View.OnTouchListener {

    /* renamed from: o  reason: collision with root package name */
    public final Dialog f4188o;

    /* renamed from: p  reason: collision with root package name */
    public final int f4189p;

    /* renamed from: q  reason: collision with root package name */
    public final int f4190q;

    /* renamed from: r  reason: collision with root package name */
    public final int f4191r;

    public a(Dialog dialog, Rect rect) {
        this.f4188o = dialog;
        this.f4189p = rect.left;
        this.f4190q = rect.top;
        this.f4191r = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View findViewById = view.findViewById(16908290);
        int left = findViewById.getLeft() + this.f4189p;
        int width = findViewById.getWidth() + left;
        int top = findViewById.getTop() + this.f4190q;
        if (new RectF((float) left, (float) top, (float) width, (float) (findViewById.getHeight() + top)).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            obtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            obtain.setAction(0);
            int i10 = this.f4191r;
            obtain.setLocation((float) ((-i10) - 1), (float) ((-i10) - 1));
        }
        view.performClick();
        return this.f4188o.onTouchEvent(obtain);
    }
}
