package com.google.android.material.timepicker;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.karumi.dexter.R;
import i0.b0;
import i0.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import p9.u;

class ClockHandView extends View {

    /* renamed from: o  reason: collision with root package name */
    public final ArrayList f3663o = new ArrayList();

    /* renamed from: p  reason: collision with root package name */
    public final int f3664p;

    /* renamed from: q  reason: collision with root package name */
    public final float f3665q;

    /* renamed from: r  reason: collision with root package name */
    public final Paint f3666r;

    /* renamed from: s  reason: collision with root package name */
    public final RectF f3667s;

    /* renamed from: t  reason: collision with root package name */
    public final int f3668t;
    public float u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f3669v;
    public double w;

    /* renamed from: x  reason: collision with root package name */
    public int f3670x;

    public interface a {
        void a(float f10);
    }

    public ClockHandView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        Paint paint = new Paint();
        this.f3666r = paint;
        this.f3667s = new RectF();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u.f8117v, R.attr.materialClockStyle, 2131952346);
        this.f3670x = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f3664p = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        Resources resources = getResources();
        this.f3668t = resources.getDimensionPixelSize(R.dimen.material_clock_hand_stroke_width);
        this.f3665q = (float) resources.getDimensionPixelSize(R.dimen.material_clock_hand_center_dot_radius);
        int color = obtainStyledAttributes.getColor(0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        a(0.0f);
        ViewConfiguration.get(context).getScaledTouchSlop();
        WeakHashMap<View, b0> weakHashMap = w.f6004a;
        w.d.s(this, 2);
        obtainStyledAttributes.recycle();
    }

    public final void a(float f10) {
        b(f10, false);
    }

    public final void b(float f10, boolean z) {
        float f11 = f10 % 360.0f;
        this.u = f11;
        this.w = Math.toRadians((double) (f11 - 90.0f));
        float cos = (((float) this.f3670x) * ((float) Math.cos(this.w))) + ((float) (getWidth() / 2));
        float sin = (((float) this.f3670x) * ((float) Math.sin(this.w))) + ((float) (getHeight() / 2));
        float f12 = (float) this.f3664p;
        this.f3667s.set(cos - f12, sin - f12, cos + f12, sin + f12);
        Iterator it = this.f3663o.iterator();
        while (it.hasNext()) {
            ((a) it.next()).a(f11);
        }
        invalidate();
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float f10 = (float) width;
        float f11 = (float) height;
        Paint paint = this.f3666r;
        paint.setStrokeWidth(0.0f);
        int i10 = this.f3664p;
        canvas.drawCircle((((float) this.f3670x) * ((float) Math.cos(this.w))) + f10, (((float) this.f3670x) * ((float) Math.sin(this.w))) + f11, (float) i10, paint);
        double sin = Math.sin(this.w);
        double cos = Math.cos(this.w);
        double d = (double) ((float) (this.f3670x - i10));
        paint.setStrokeWidth((float) this.f3668t);
        canvas.drawLine(f10, f11, (float) (width + ((int) (cos * d))), (float) (height + ((int) (d * sin))), paint);
        canvas.drawCircle(f10, f11, this.f3665q, paint);
    }

    public final void onLayout(boolean z, int i10, int i11, int i12, int i13) {
        super.onLayout(z, i10, i11, i12, i13);
        a(this.u);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z10;
        boolean z11;
        int actionMasked = motionEvent.getActionMasked();
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        boolean z12 = false;
        if (actionMasked == 0) {
            this.f3669v = false;
            z = true;
            z10 = false;
        } else if (actionMasked == 1 || actionMasked == 2) {
            z10 = this.f3669v;
            z = false;
        } else {
            z10 = false;
            z = false;
        }
        boolean z13 = this.f3669v;
        int degrees = ((int) Math.toDegrees(Math.atan2((double) (y10 - ((float) (getHeight() / 2))), (double) (x10 - ((float) (getWidth() / 2)))))) + 90;
        if (degrees < 0) {
            degrees += 360;
        }
        float f10 = (float) degrees;
        if (this.u != f10) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z || !z11) {
            if (z11 || z10) {
                a(f10);
            }
            this.f3669v = z13 | z12;
            return true;
        }
        z12 = true;
        this.f3669v = z13 | z12;
        return true;
    }
}
