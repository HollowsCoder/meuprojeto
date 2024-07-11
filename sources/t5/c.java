package t5;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

public abstract class c<V extends View> extends e<V> {

    /* renamed from: c  reason: collision with root package name */
    public a f8999c;
    public OverScroller d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f9000e;

    /* renamed from: f  reason: collision with root package name */
    public int f9001f = -1;

    /* renamed from: g  reason: collision with root package name */
    public int f9002g;

    /* renamed from: h  reason: collision with root package name */
    public int f9003h = -1;

    /* renamed from: i  reason: collision with root package name */
    public VelocityTracker f9004i;

    public class a implements Runnable {

        /* renamed from: o  reason: collision with root package name */
        public final CoordinatorLayout f9005o;

        /* renamed from: p  reason: collision with root package name */
        public final V f9006p;

        public a(CoordinatorLayout coordinatorLayout, V v10) {
            this.f9005o = coordinatorLayout;
            this.f9006p = v10;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
            r1 = r4.f9007q;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r4 = this;
                V r0 = r4.f9006p
                if (r0 == 0) goto L_0x0024
                t5.c r1 = t5.c.this
                android.widget.OverScroller r2 = r1.d
                if (r2 == 0) goto L_0x0024
                boolean r2 = r2.computeScrollOffset()
                androidx.coordinatorlayout.widget.CoordinatorLayout r3 = r4.f9005o
                if (r2 == 0) goto L_0x0021
                android.widget.OverScroller r2 = r1.d
                int r2 = r2.getCurrY()
                r1.A(r3, r0, r2)
                java.util.WeakHashMap<android.view.View, i0.b0> r1 = i0.w.f6004a
                i0.w.d.m(r0, r4)
                goto L_0x0024
            L_0x0021:
                r1.y(r0, r3)
            L_0x0024:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: t5.c.a.run():void");
        }
    }

    public c() {
    }

    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void A(CoordinatorLayout coordinatorLayout, View view, int i10) {
        z(coordinatorLayout, view, i10, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public final boolean g(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
        boolean z;
        int findPointerIndex;
        if (this.f9003h < 0) {
            this.f9003h = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f9000e) {
            int i10 = this.f9001f;
            if (i10 == -1 || (findPointerIndex = motionEvent.findPointerIndex(i10)) == -1) {
                return false;
            }
            int y10 = (int) motionEvent.getY(findPointerIndex);
            if (Math.abs(y10 - this.f9002g) > this.f9003h) {
                this.f9002g = y10;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f9001f = -1;
            int x10 = (int) motionEvent.getX();
            int y11 = (int) motionEvent.getY();
            if (!u(v10) || !coordinatorLayout.p(v10, x10, y11)) {
                z = false;
            } else {
                z = true;
            }
            this.f9000e = z;
            if (z) {
                this.f9002g = y11;
                this.f9001f = motionEvent.getPointerId(0);
                if (this.f9004i == null) {
                    this.f9004i = VelocityTracker.obtain();
                }
                OverScroller overScroller = this.d;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.d.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.f9004i;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00dc A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:43:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean r(androidx.coordinatorlayout.widget.CoordinatorLayout r20, V r21, android.view.MotionEvent r22) {
        /*
            r19 = this;
            r6 = r19
            r1 = r20
            r2 = r21
            r7 = r22
            int r0 = r22.getActionMasked()
            r3 = 0
            r4 = -1
            r8 = 1
            r9 = 0
            if (r0 == r8) goto L_0x0060
            r5 = 2
            if (r0 == r5) goto L_0x0036
            r1 = 3
            if (r0 == r1) goto L_0x00c3
            r1 = 6
            if (r0 == r1) goto L_0x001c
            goto L_0x005d
        L_0x001c:
            int r0 = r22.getActionIndex()
            if (r0 != 0) goto L_0x0024
            r0 = r8
            goto L_0x0025
        L_0x0024:
            r0 = r9
        L_0x0025:
            int r1 = r7.getPointerId(r0)
            r6.f9001f = r1
            float r0 = r7.getY(r0)
            r1 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 + r1
            int r0 = (int) r0
            r6.f9002g = r0
            goto L_0x005d
        L_0x0036:
            int r0 = r6.f9001f
            int r0 = r7.findPointerIndex(r0)
            if (r0 != r4) goto L_0x003f
            return r9
        L_0x003f:
            float r0 = r7.getY(r0)
            int r0 = (int) r0
            int r3 = r6.f9002g
            int r3 = r3 - r0
            r6.f9002g = r0
            int r4 = r6.v(r2)
            r5 = 0
            int r0 = r19.x()
            int r3 = r0 - r3
            r0 = r19
            r1 = r20
            r2 = r21
            r0.z(r1, r2, r3, r4, r5)
        L_0x005d:
            r0 = r9
            goto L_0x00d1
        L_0x0060:
            android.view.VelocityTracker r0 = r6.f9004i
            if (r0 == 0) goto L_0x00c3
            r0.addMovement(r7)
            android.view.VelocityTracker r0 = r6.f9004i
            r5 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r5)
            android.view.VelocityTracker r0 = r6.f9004i
            int r5 = r6.f9001f
            float r0 = r0.getYVelocity(r5)
            int r5 = r6.w(r2)
            int r5 = -r5
            r18 = 0
            t5.c$a r10 = r6.f8999c
            if (r10 == 0) goto L_0x0086
            r2.removeCallbacks(r10)
            r6.f8999c = r3
        L_0x0086:
            android.widget.OverScroller r10 = r6.d
            if (r10 != 0) goto L_0x0095
            android.widget.OverScroller r10 = new android.widget.OverScroller
            android.content.Context r11 = r21.getContext()
            r10.<init>(r11)
            r6.d = r10
        L_0x0095:
            android.widget.OverScroller r10 = r6.d
            r11 = 0
            int r12 = r19.s()
            r13 = 0
            int r14 = java.lang.Math.round(r0)
            r15 = 0
            r16 = 0
            r17 = r5
            r10.fling(r11, r12, r13, r14, r15, r16, r17, r18)
            android.widget.OverScroller r0 = r6.d
            boolean r0 = r0.computeScrollOffset()
            if (r0 == 0) goto L_0x00be
            t5.c$a r0 = new t5.c$a
            r0.<init>(r1, r2)
            r6.f8999c = r0
            java.util.WeakHashMap<android.view.View, i0.b0> r1 = i0.w.f6004a
            i0.w.d.m(r2, r0)
            goto L_0x00c1
        L_0x00be:
            r6.y(r2, r1)
        L_0x00c1:
            r0 = r8
            goto L_0x00c4
        L_0x00c3:
            r0 = r9
        L_0x00c4:
            r6.f9000e = r9
            r6.f9001f = r4
            android.view.VelocityTracker r1 = r6.f9004i
            if (r1 == 0) goto L_0x00d1
            r1.recycle()
            r6.f9004i = r3
        L_0x00d1:
            android.view.VelocityTracker r1 = r6.f9004i
            if (r1 == 0) goto L_0x00d8
            r1.addMovement(r7)
        L_0x00d8:
            boolean r1 = r6.f9000e
            if (r1 != 0) goto L_0x00e0
            if (r0 == 0) goto L_0x00df
            goto L_0x00e0
        L_0x00df:
            r8 = r9
        L_0x00e0:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: t5.c.r(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    public boolean u(V v10) {
        return false;
    }

    public int v(V v10) {
        return -v10.getHeight();
    }

    public int w(V v10) {
        return v10.getHeight();
    }

    public int x() {
        return s();
    }

    public void y(View view, CoordinatorLayout coordinatorLayout) {
    }

    public int z(CoordinatorLayout coordinatorLayout, V v10, int i10, int i11, int i12) {
        int l;
        int s10 = s();
        if (i11 == 0 || s10 < i11 || s10 > i12 || s10 == (l = androidx.databinding.a.l(i10, i11, i12))) {
            return 0;
        }
        f fVar = this.f9011a;
        if (fVar == null) {
            this.f9012b = l;
        } else if (fVar.d != l) {
            fVar.d = l;
            fVar.a();
        }
        return s10 - l;
    }
}
