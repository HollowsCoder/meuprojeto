package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import i.f;

public abstract class n0 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: o  reason: collision with root package name */
    public final float f657o;

    /* renamed from: p  reason: collision with root package name */
    public final int f658p;

    /* renamed from: q  reason: collision with root package name */
    public final int f659q;

    /* renamed from: r  reason: collision with root package name */
    public final View f660r;

    /* renamed from: s  reason: collision with root package name */
    public a f661s;

    /* renamed from: t  reason: collision with root package name */
    public b f662t;
    public boolean u;

    /* renamed from: v  reason: collision with root package name */
    public int f663v;
    public final int[] w = new int[2];

    public class a implements Runnable {
        public a() {
        }

        public final void run() {
            ViewParent parent = n0.this.f660r.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public final void run() {
            n0 n0Var = n0.this;
            n0Var.a();
            View view = n0Var.f660r;
            if (view.isEnabled() && !view.isLongClickable() && n0Var.c()) {
                view.getParent().requestDisallowInterceptTouchEvent(true);
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                view.onTouchEvent(obtain);
                obtain.recycle();
                n0Var.u = true;
            }
        }
    }

    public n0(View view) {
        this.f660r = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f657o = (float) ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f658p = tapTimeout;
        this.f659q = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        b bVar = this.f662t;
        View view = this.f660r;
        if (bVar != null) {
            view.removeCallbacks(bVar);
        }
        a aVar = this.f661s;
        if (aVar != null) {
            view.removeCallbacks(aVar);
        }
    }

    public abstract f b();

    public abstract boolean c();

    public boolean d() {
        f b10 = b();
        if (b10 == null || !b10.c()) {
            return true;
        }
        b10.dismiss();
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0080, code lost:
        if (r4 != 3) goto L_0x00fe;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x010c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouch(android.view.View r13, android.view.MotionEvent r14) {
        /*
            r12 = this;
            boolean r13 = r12.u
            r0 = 3
            android.view.View r1 = r12.f660r
            r2 = 1
            r3 = 0
            if (r13 == 0) goto L_0x006d
            i.f r4 = r12.b()
            if (r4 == 0) goto L_0x005d
            boolean r5 = r4.c()
            if (r5 != 0) goto L_0x0016
            goto L_0x005d
        L_0x0016:
            androidx.appcompat.widget.l0 r4 = r4.g()
            if (r4 == 0) goto L_0x005d
            boolean r5 = r4.isShown()
            if (r5 != 0) goto L_0x0023
            goto L_0x005d
        L_0x0023:
            android.view.MotionEvent r5 = android.view.MotionEvent.obtainNoHistory(r14)
            int[] r6 = r12.w
            r1.getLocationOnScreen(r6)
            r1 = r6[r3]
            float r1 = (float) r1
            r7 = r6[r2]
            float r7 = (float) r7
            r5.offsetLocation(r1, r7)
            r4.getLocationOnScreen(r6)
            r1 = r6[r3]
            int r1 = -r1
            float r1 = (float) r1
            r6 = r6[r2]
            int r6 = -r6
            float r6 = (float) r6
            r5.offsetLocation(r1, r6)
            int r1 = r12.f663v
            boolean r1 = r4.b(r5, r1)
            r5.recycle()
            int r14 = r14.getActionMasked()
            if (r14 == r2) goto L_0x0056
            if (r14 == r0) goto L_0x0056
            r14 = r2
            goto L_0x0057
        L_0x0056:
            r14 = r3
        L_0x0057:
            if (r1 == 0) goto L_0x005d
            if (r14 == 0) goto L_0x005d
            r14 = r2
            goto L_0x005e
        L_0x005d:
            r14 = r3
        L_0x005e:
            if (r14 != 0) goto L_0x006a
            boolean r14 = r12.d()
            if (r14 != 0) goto L_0x0067
            goto L_0x006a
        L_0x0067:
            r14 = r3
            goto L_0x011f
        L_0x006a:
            r14 = r2
            goto L_0x011f
        L_0x006d:
            boolean r4 = r1.isEnabled()
            if (r4 != 0) goto L_0x0075
            goto L_0x00fe
        L_0x0075:
            int r4 = r14.getActionMasked()
            if (r4 == 0) goto L_0x00d2
            if (r4 == r2) goto L_0x00ce
            r5 = 2
            if (r4 == r5) goto L_0x0084
            if (r4 == r0) goto L_0x00ce
            goto L_0x00fe
        L_0x0084:
            int r0 = r12.f663v
            int r0 = r14.findPointerIndex(r0)
            if (r0 < 0) goto L_0x00fe
            float r4 = r14.getX(r0)
            float r14 = r14.getY(r0)
            float r0 = r12.f657o
            float r5 = -r0
            int r6 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r6 < 0) goto L_0x00bf
            int r5 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r5 < 0) goto L_0x00bf
            int r5 = r1.getRight()
            int r6 = r1.getLeft()
            int r5 = r5 - r6
            float r5 = (float) r5
            float r5 = r5 + r0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 >= 0) goto L_0x00bf
            int r4 = r1.getBottom()
            int r5 = r1.getTop()
            int r4 = r4 - r5
            float r4 = (float) r4
            float r4 = r4 + r0
            int r14 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r14 >= 0) goto L_0x00bf
            r14 = r2
            goto L_0x00c0
        L_0x00bf:
            r14 = r3
        L_0x00c0:
            if (r14 != 0) goto L_0x00fe
            r12.a()
            android.view.ViewParent r14 = r1.getParent()
            r14.requestDisallowInterceptTouchEvent(r2)
            r14 = r2
            goto L_0x00ff
        L_0x00ce:
            r12.a()
            goto L_0x00fe
        L_0x00d2:
            int r14 = r14.getPointerId(r3)
            r12.f663v = r14
            androidx.appcompat.widget.n0$a r14 = r12.f661s
            if (r14 != 0) goto L_0x00e3
            androidx.appcompat.widget.n0$a r14 = new androidx.appcompat.widget.n0$a
            r14.<init>()
            r12.f661s = r14
        L_0x00e3:
            androidx.appcompat.widget.n0$a r14 = r12.f661s
            int r0 = r12.f658p
            long r4 = (long) r0
            r1.postDelayed(r14, r4)
            androidx.appcompat.widget.n0$b r14 = r12.f662t
            if (r14 != 0) goto L_0x00f6
            androidx.appcompat.widget.n0$b r14 = new androidx.appcompat.widget.n0$b
            r14.<init>()
            r12.f662t = r14
        L_0x00f6:
            androidx.appcompat.widget.n0$b r14 = r12.f662t
            int r0 = r12.f659q
            long r4 = (long) r0
            r1.postDelayed(r14, r4)
        L_0x00fe:
            r14 = r3
        L_0x00ff:
            if (r14 == 0) goto L_0x0109
            boolean r14 = r12.c()
            if (r14 == 0) goto L_0x0109
            r14 = r2
            goto L_0x010a
        L_0x0109:
            r14 = r3
        L_0x010a:
            if (r14 == 0) goto L_0x011f
            long r6 = android.os.SystemClock.uptimeMillis()
            r8 = 3
            r9 = 0
            r10 = 0
            r11 = 0
            r4 = r6
            android.view.MotionEvent r0 = android.view.MotionEvent.obtain(r4, r6, r8, r9, r10, r11)
            r1.onTouchEvent(r0)
            r0.recycle()
        L_0x011f:
            r12.u = r14
            if (r14 != 0) goto L_0x0127
            if (r13 == 0) goto L_0x0126
            goto L_0x0127
        L_0x0126:
            r2 = r3
        L_0x0127:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.n0.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public final void onViewAttachedToWindow(View view) {
    }

    public final void onViewDetachedFromWindow(View view) {
        this.u = false;
        this.f663v = -1;
        a aVar = this.f661s;
        if (aVar != null) {
            this.f660r.removeCallbacks(aVar);
        }
    }
}
