package com.squareup.picasso;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.widget.ImageView;
import com.squareup.picasso.t;

public final class u extends BitmapDrawable {

    /* renamed from: h  reason: collision with root package name */
    public static final Paint f3988h = new Paint();

    /* renamed from: a  reason: collision with root package name */
    public final boolean f3989a;

    /* renamed from: b  reason: collision with root package name */
    public final float f3990b;

    /* renamed from: c  reason: collision with root package name */
    public final t.c f3991c;
    public Drawable d;

    /* renamed from: e  reason: collision with root package name */
    public final long f3992e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f3993f;

    /* renamed from: g  reason: collision with root package name */
    public int f3994g = 255;

    public u(Context context, Bitmap bitmap, Drawable drawable, t.c cVar, boolean z, boolean z10) {
        super(context.getResources(), bitmap);
        this.f3989a = z10;
        this.f3990b = context.getResources().getDisplayMetrics().density;
        this.f3991c = cVar;
        if (cVar != t.c.MEMORY && !z) {
            this.d = drawable;
            this.f3993f = true;
            this.f3992e = SystemClock.uptimeMillis();
        }
    }

    public static void a(ImageView imageView, Context context, Bitmap bitmap, t.c cVar, boolean z, boolean z10) {
        Drawable drawable = imageView.getDrawable();
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        imageView.setImageDrawable(new u(context, bitmap, drawable, cVar, z, z10));
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void draw(android.graphics.Canvas r7) {
        /*
            r6 = this;
            boolean r0 = r6.f3993f
            r1 = 0
            if (r0 != 0) goto L_0x0006
            goto L_0x001c
        L_0x0006:
            long r2 = android.os.SystemClock.uptimeMillis()
            long r4 = r6.f3992e
            long r2 = r2 - r4
            float r0 = (float) r2
            r2 = 1128792064(0x43480000, float:200.0)
            float r0 = r0 / r2
            r2 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 < 0) goto L_0x0020
            r6.f3993f = r1
            r0 = 0
            r6.d = r0
        L_0x001c:
            super.draw(r7)
            goto L_0x0037
        L_0x0020:
            android.graphics.drawable.Drawable r2 = r6.d
            if (r2 == 0) goto L_0x0027
            r2.draw(r7)
        L_0x0027:
            int r2 = r6.f3994g
            float r2 = (float) r2
            float r2 = r2 * r0
            int r0 = (int) r2
            super.setAlpha(r0)
            super.draw(r7)
            int r0 = r6.f3994g
            super.setAlpha(r0)
        L_0x0037:
            boolean r0 = r6.f3989a
            if (r0 == 0) goto L_0x0079
            android.graphics.Paint r0 = f3988h
            r2 = -1
            r0.setColor(r2)
            float r2 = r6.f3990b
            r3 = 1098907648(0x41800000, float:16.0)
            float r3 = r3 * r2
            int r3 = (int) r3
            android.graphics.Path r4 = new android.graphics.Path
            r4.<init>()
            float r5 = (float) r1
            r4.moveTo(r5, r5)
            int r3 = r3 + r1
            float r3 = (float) r3
            r4.lineTo(r3, r5)
            r4.lineTo(r5, r3)
            r7.drawPath(r4, r0)
            com.squareup.picasso.t$c r3 = r6.f3991c
            int r3 = r3.debugColor
            r0.setColor(r3)
            r3 = 1097859072(0x41700000, float:15.0)
            float r2 = r2 * r3
            int r2 = (int) r2
            android.graphics.Path r3 = new android.graphics.Path
            r3.<init>()
            r3.moveTo(r5, r5)
            int r2 = r2 + r1
            float r1 = (float) r2
            r3.lineTo(r1, r5)
            r3.lineTo(r5, r1)
            r7.drawPath(r3, r0)
        L_0x0079:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.picasso.u.draw(android.graphics.Canvas):void");
    }

    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        super.onBoundsChange(rect);
    }

    public final void setAlpha(int i10) {
        this.f3994g = i10;
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.setAlpha(i10);
        }
        super.setAlpha(i10);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        super.setColorFilter(colorFilter);
    }
}
