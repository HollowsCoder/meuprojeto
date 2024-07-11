package o3;

import android.content.Context;
import android.view.ScaleGestureDetector;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import o3.k;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public int f7708a = -1;

    /* renamed from: b  reason: collision with root package name */
    public int f7709b = 0;

    /* renamed from: c  reason: collision with root package name */
    public final ScaleGestureDetector f7710c;
    public VelocityTracker d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f7711e;

    /* renamed from: f  reason: collision with root package name */
    public float f7712f;

    /* renamed from: g  reason: collision with root package name */
    public float f7713g;

    /* renamed from: h  reason: collision with root package name */
    public final float f7714h;

    /* renamed from: i  reason: collision with root package name */
    public final float f7715i;

    /* renamed from: j  reason: collision with root package name */
    public final c f7716j;

    public b(Context context, k.a aVar) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f7715i = (float) viewConfiguration.getScaledMinimumFlingVelocity();
        this.f7714h = (float) viewConfiguration.getScaledTouchSlop();
        this.f7716j = aVar;
        this.f7710c = new ScaleGestureDetector(context, new a(this));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004c, code lost:
        if (r2 != null) goto L_0x01d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01d7, code lost:
        if (r2 != null) goto L_0x01d9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.view.MotionEvent r23) {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            int r2 = r23.getAction()
            r2 = r2 & 255(0xff, float:3.57E-43)
            r3 = -1
            r4 = 0
            if (r2 == 0) goto L_0x01e0
            r5 = 1
            o3.c r6 = r0.f7716j
            if (r2 == r5) goto L_0x00f5
            r7 = 2
            if (r2 == r7) goto L_0x0050
            r6 = 3
            if (r2 == r6) goto L_0x0048
            r6 = 6
            if (r2 == r6) goto L_0x001e
            goto L_0x020d
        L_0x001e:
            int r2 = r23.getAction()
            r6 = 65280(0xff00, float:9.1477E-41)
            r2 = r2 & r6
            int r2 = r2 >> 8
            int r6 = r1.getPointerId(r2)
            int r7 = r0.f7708a
            if (r6 != r7) goto L_0x020d
            if (r2 != 0) goto L_0x0033
            goto L_0x0034
        L_0x0033:
            r5 = r4
        L_0x0034:
            int r2 = r1.getPointerId(r5)
            r0.f7708a = r2
            float r2 = r1.getX(r5)
            r0.f7712f = r2
            float r2 = r1.getY(r5)
            r0.f7713g = r2
            goto L_0x020d
        L_0x0048:
            r0.f7708a = r3
            android.view.VelocityTracker r2 = r0.d
            if (r2 == 0) goto L_0x020d
            goto L_0x01d9
        L_0x0050:
            int r2 = r0.f7709b     // Catch:{ Exception -> 0x0057 }
            float r2 = r1.getX(r2)     // Catch:{ Exception -> 0x0057 }
            goto L_0x005b
        L_0x0057:
            float r2 = r23.getX()
        L_0x005b:
            int r8 = r0.f7709b     // Catch:{ Exception -> 0x0062 }
            float r8 = r1.getY(r8)     // Catch:{ Exception -> 0x0062 }
            goto L_0x0066
        L_0x0062:
            float r8 = r23.getY()
        L_0x0066:
            float r9 = r0.f7712f
            float r9 = r2 - r9
            float r10 = r0.f7713g
            float r10 = r8 - r10
            boolean r11 = r0.f7711e
            if (r11 != 0) goto L_0x0088
            float r11 = r9 * r9
            float r12 = r10 * r10
            float r12 = r12 + r11
            double r11 = (double) r12
            double r11 = java.lang.Math.sqrt(r11)
            float r13 = r0.f7714h
            double r13 = (double) r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 < 0) goto L_0x0085
            r11 = r5
            goto L_0x0086
        L_0x0085:
            r11 = r4
        L_0x0086:
            r0.f7711e = r11
        L_0x0088:
            boolean r11 = r0.f7711e
            if (r11 == 0) goto L_0x020d
            o3.k$a r6 = (o3.k.a) r6
            o3.k r6 = o3.k.this
            o3.b r11 = r6.f7724x
            android.view.ScaleGestureDetector r11 = r11.f7710c
            boolean r11 = r11.isInProgress()
            if (r11 == 0) goto L_0x009b
            goto L_0x00e8
        L_0x009b:
            android.graphics.Matrix r11 = r6.A
            r11.postTranslate(r9, r10)
            r6.a()
            android.widget.ImageView r11 = r6.f7723v
            android.view.ViewParent r11 = r11.getParent()
            boolean r12 = r6.f7722t
            if (r12 == 0) goto L_0x00e3
            o3.b r12 = r6.f7724x
            android.view.ScaleGestureDetector r12 = r12.f7710c
            boolean r12 = r12.isInProgress()
            if (r12 != 0) goto L_0x00e3
            boolean r12 = r6.u
            if (r12 != 0) goto L_0x00e3
            int r12 = r6.I
            if (r12 == r7) goto L_0x00dd
            r7 = 1065353216(0x3f800000, float:1.0)
            if (r12 != 0) goto L_0x00c7
            int r13 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r13 >= 0) goto L_0x00dd
        L_0x00c7:
            r13 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r12 != r5) goto L_0x00cf
            int r9 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r9 <= 0) goto L_0x00dd
        L_0x00cf:
            int r6 = r6.J
            if (r6 != 0) goto L_0x00d7
            int r7 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r7 >= 0) goto L_0x00dd
        L_0x00d7:
            if (r6 != r5) goto L_0x00e8
            int r5 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r5 > 0) goto L_0x00e8
        L_0x00dd:
            if (r11 == 0) goto L_0x00e8
            r11.requestDisallowInterceptTouchEvent(r4)
            goto L_0x00e8
        L_0x00e3:
            if (r11 == 0) goto L_0x00e8
            r11.requestDisallowInterceptTouchEvent(r5)
        L_0x00e8:
            r0.f7712f = r2
            r0.f7713g = r8
            android.view.VelocityTracker r2 = r0.d
            if (r2 == 0) goto L_0x020d
            r2.addMovement(r1)
            goto L_0x020d
        L_0x00f5:
            r0.f7708a = r3
            boolean r2 = r0.f7711e
            if (r2 == 0) goto L_0x01d5
            android.view.VelocityTracker r2 = r0.d
            if (r2 == 0) goto L_0x01d5
            int r2 = r0.f7709b     // Catch:{ Exception -> 0x0106 }
            float r2 = r1.getX(r2)     // Catch:{ Exception -> 0x0106 }
            goto L_0x010a
        L_0x0106:
            float r2 = r23.getX()
        L_0x010a:
            r0.f7712f = r2
            int r2 = r0.f7709b     // Catch:{ Exception -> 0x0113 }
            float r2 = r1.getY(r2)     // Catch:{ Exception -> 0x0113 }
            goto L_0x0117
        L_0x0113:
            float r2 = r23.getY()
        L_0x0117:
            r0.f7713g = r2
            android.view.VelocityTracker r2 = r0.d
            r2.addMovement(r1)
            android.view.VelocityTracker r2 = r0.d
            r5 = 1000(0x3e8, float:1.401E-42)
            r2.computeCurrentVelocity(r5)
            android.view.VelocityTracker r2 = r0.d
            float r2 = r2.getXVelocity()
            android.view.VelocityTracker r5 = r0.d
            float r5 = r5.getYVelocity()
            float r7 = java.lang.Math.abs(r2)
            float r8 = java.lang.Math.abs(r5)
            float r7 = java.lang.Math.max(r7, r8)
            float r8 = r0.f7715i
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 < 0) goto L_0x01d5
            float r2 = -r2
            float r5 = -r5
            o3.k$a r6 = (o3.k.a) r6
            o3.k$f r7 = new o3.k$f
            o3.k r6 = o3.k.this
            android.widget.ImageView r8 = r6.f7723v
            android.content.Context r8 = r8.getContext()
            r7.<init>(r8)
            r6.H = r7
            android.widget.ImageView r8 = r6.f7723v
            int r9 = r8.getWidth()
            int r10 = r8.getPaddingLeft()
            int r9 = r9 - r10
            int r10 = r8.getPaddingRight()
            int r9 = r9 - r10
            int r10 = r8.getHeight()
            int r11 = r8.getPaddingTop()
            int r10 = r10 - r11
            int r11 = r8.getPaddingBottom()
            int r10 = r10 - r11
            int r14 = (int) r2
            int r15 = (int) r5
            android.graphics.RectF r2 = r6.c()
            if (r2 != 0) goto L_0x017d
            goto L_0x01d0
        L_0x017d:
            float r5 = r2.left
            float r5 = -r5
            int r12 = java.lang.Math.round(r5)
            float r5 = (float) r9
            float r9 = r2.width()
            int r9 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r9 >= 0) goto L_0x0199
            float r9 = r2.width()
            float r9 = r9 - r5
            int r5 = java.lang.Math.round(r9)
            r16 = r4
            goto L_0x019c
        L_0x0199:
            r5 = r12
            r16 = r5
        L_0x019c:
            float r9 = r2.top
            float r9 = -r9
            int r13 = java.lang.Math.round(r9)
            float r9 = (float) r10
            float r10 = r2.height()
            int r10 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r10 >= 0) goto L_0x01b8
            float r2 = r2.height()
            float r2 = r2 - r9
            int r2 = java.lang.Math.round(r2)
            r18 = r4
            goto L_0x01bb
        L_0x01b8:
            r2 = r13
            r18 = r2
        L_0x01bb:
            r7.f7737p = r12
            r7.f7738q = r13
            if (r12 != r5) goto L_0x01c3
            if (r13 == r2) goto L_0x01d0
        L_0x01c3:
            android.widget.OverScroller r11 = r7.f7736o
            r20 = 0
            r21 = 0
            r17 = r5
            r19 = r2
            r11.fling(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
        L_0x01d0:
            o3.k$f r2 = r6.H
            r8.post(r2)
        L_0x01d5:
            android.view.VelocityTracker r2 = r0.d
            if (r2 == 0) goto L_0x020d
        L_0x01d9:
            r2.recycle()
            r2 = 0
            r0.d = r2
            goto L_0x020d
        L_0x01e0:
            int r2 = r1.getPointerId(r4)
            r0.f7708a = r2
            android.view.VelocityTracker r2 = android.view.VelocityTracker.obtain()
            r0.d = r2
            if (r2 == 0) goto L_0x01f1
            r2.addMovement(r1)
        L_0x01f1:
            int r2 = r0.f7709b     // Catch:{ Exception -> 0x01f8 }
            float r2 = r1.getX(r2)     // Catch:{ Exception -> 0x01f8 }
            goto L_0x01fc
        L_0x01f8:
            float r2 = r23.getX()
        L_0x01fc:
            r0.f7712f = r2
            int r2 = r0.f7709b     // Catch:{ Exception -> 0x0205 }
            float r2 = r1.getY(r2)     // Catch:{ Exception -> 0x0205 }
            goto L_0x0209
        L_0x0205:
            float r2 = r23.getY()
        L_0x0209:
            r0.f7713g = r2
            r0.f7711e = r4
        L_0x020d:
            int r2 = r0.f7708a
            if (r2 == r3) goto L_0x0212
            r4 = r2
        L_0x0212:
            int r1 = r1.findPointerIndex(r4)
            r0.f7709b = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o3.b.a(android.view.MotionEvent):void");
    }
}
