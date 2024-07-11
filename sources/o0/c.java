package o0;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import i0.b0;
import i0.w;
import java.util.Arrays;
import java.util.WeakHashMap;

public final class c {

    /* renamed from: v  reason: collision with root package name */
    public static final a f7585v = new a();

    /* renamed from: a  reason: collision with root package name */
    public int f7586a;

    /* renamed from: b  reason: collision with root package name */
    public int f7587b;

    /* renamed from: c  reason: collision with root package name */
    public int f7588c = -1;
    public float[] d;

    /* renamed from: e  reason: collision with root package name */
    public float[] f7589e;

    /* renamed from: f  reason: collision with root package name */
    public float[] f7590f;

    /* renamed from: g  reason: collision with root package name */
    public float[] f7591g;

    /* renamed from: h  reason: collision with root package name */
    public int[] f7592h;

    /* renamed from: i  reason: collision with root package name */
    public int[] f7593i;

    /* renamed from: j  reason: collision with root package name */
    public int[] f7594j;

    /* renamed from: k  reason: collision with root package name */
    public int f7595k;
    public VelocityTracker l;

    /* renamed from: m  reason: collision with root package name */
    public final float f7596m;

    /* renamed from: n  reason: collision with root package name */
    public final float f7597n;

    /* renamed from: o  reason: collision with root package name */
    public final int f7598o;

    /* renamed from: p  reason: collision with root package name */
    public final OverScroller f7599p;

    /* renamed from: q  reason: collision with root package name */
    public final C0108c f7600q;

    /* renamed from: r  reason: collision with root package name */
    public View f7601r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f7602s;

    /* renamed from: t  reason: collision with root package name */
    public final ViewGroup f7603t;
    public final b u = new b();

    public class a implements Interpolator {
        public final float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public final void run() {
            c.this.p(0);
        }
    }

    /* renamed from: o0.c$c  reason: collision with other inner class name */
    public static abstract class C0108c {
        public abstract int a(View view, int i10);

        public abstract int b(View view, int i10);

        public int c(View view) {
            return 0;
        }

        public int d() {
            return 0;
        }

        public void e(View view, int i10) {
        }

        public void f(int i10) {
        }

        public abstract void g(View view, int i10, int i11);

        public abstract void h(View view, float f10, float f11);

        public abstract boolean i(View view, int i10);
    }

    public c(Context context, ViewGroup viewGroup, C0108c cVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        } else if (cVar != null) {
            this.f7603t = viewGroup;
            this.f7600q = cVar;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            this.f7598o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.f7587b = viewConfiguration.getScaledTouchSlop();
            this.f7596m = (float) viewConfiguration.getScaledMaximumFlingVelocity();
            this.f7597n = (float) viewConfiguration.getScaledMinimumFlingVelocity();
            this.f7599p = new OverScroller(context, f7585v);
        } else {
            throw new IllegalArgumentException("Callback may not be null");
        }
    }

    public final void a() {
        this.f7588c = -1;
        float[] fArr = this.d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f7589e, 0.0f);
            Arrays.fill(this.f7590f, 0.0f);
            Arrays.fill(this.f7591g, 0.0f);
            Arrays.fill(this.f7592h, 0);
            Arrays.fill(this.f7593i, 0);
            Arrays.fill(this.f7594j, 0);
            this.f7595k = 0;
        }
        VelocityTracker velocityTracker = this.l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.l = null;
        }
    }

    public final void b(View view, int i10) {
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = this.f7603t;
        if (parent == viewGroup) {
            this.f7601r = view;
            this.f7588c = i10;
            this.f7600q.e(view, i10);
            p(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + viewGroup + ")");
    }

    public final boolean c(float f10, float f11, int i10, int i11) {
        float abs = Math.abs(f10);
        float abs2 = Math.abs(f11);
        if ((this.f7592h[i10] & i11) != i11 || (0 & i11) == 0 || (this.f7594j[i10] & i11) == i11 || (this.f7593i[i10] & i11) == i11) {
            return false;
        }
        int i12 = this.f7587b;
        if (abs <= ((float) i12) && abs2 <= ((float) i12)) {
            return false;
        }
        if (abs < abs2 * 0.5f) {
            this.f7600q.getClass();
        }
        return (this.f7593i[i10] & i11) == 0 && abs > ((float) this.f7587b);
    }

    public final boolean d(View view, float f10, float f11) {
        if (view == null) {
            return false;
        }
        C0108c cVar = this.f7600q;
        boolean z = cVar.c(view) > 0;
        boolean z10 = cVar.d() > 0;
        if (!z || !z10) {
            return z ? Math.abs(f10) > ((float) this.f7587b) : z10 && Math.abs(f11) > ((float) this.f7587b);
        }
        float f12 = f11 * f11;
        int i10 = this.f7587b;
        return f12 + (f10 * f10) > ((float) (i10 * i10));
    }

    public final void e(int i10) {
        float[] fArr = this.d;
        if (fArr != null) {
            int i11 = this.f7595k;
            boolean z = true;
            int i12 = 1 << i10;
            if ((i12 & i11) == 0) {
                z = false;
            }
            if (z) {
                fArr[i10] = 0.0f;
                this.f7589e[i10] = 0.0f;
                this.f7590f[i10] = 0.0f;
                this.f7591g[i10] = 0.0f;
                this.f7592h[i10] = 0;
                this.f7593i[i10] = 0;
                this.f7594j[i10] = 0;
                this.f7595k = (~i12) & i11;
            }
        }
    }

    public final int f(int i10, int i11, int i12) {
        int i13;
        if (i10 == 0) {
            return 0;
        }
        int width = this.f7603t.getWidth();
        float f10 = (float) (width / 2);
        float sin = (((float) Math.sin((double) ((Math.min(1.0f, ((float) Math.abs(i10)) / ((float) width)) - 0.5f) * 0.47123894f))) * f10) + f10;
        int abs = Math.abs(i11);
        if (abs > 0) {
            i13 = Math.round(Math.abs(sin / ((float) abs)) * 1000.0f) * 4;
        } else {
            i13 = (int) (((((float) Math.abs(i10)) / ((float) i12)) + 1.0f) * 256.0f);
        }
        return Math.min(i13, 600);
    }

    public final boolean g() {
        if (this.f7586a == 2) {
            OverScroller overScroller = this.f7599p;
            boolean computeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.f7601r.getLeft();
            int top = currY - this.f7601r.getTop();
            if (left != 0) {
                View view = this.f7601r;
                WeakHashMap<View, b0> weakHashMap = w.f6004a;
                view.offsetLeftAndRight(left);
            }
            if (top != 0) {
                View view2 = this.f7601r;
                WeakHashMap<View, b0> weakHashMap2 = w.f6004a;
                view2.offsetTopAndBottom(top);
            }
            if (!(left == 0 && top == 0)) {
                this.f7600q.g(this.f7601r, currX, currY);
            }
            if (computeScrollOffset && currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                overScroller.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                this.f7603t.post(this.u);
            }
        }
        if (this.f7586a == 2) {
            return true;
        }
        return false;
    }

    public final View h(int i10, int i11) {
        ViewGroup viewGroup = this.f7603t;
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            this.f7600q.getClass();
            View childAt = viewGroup.getChildAt(childCount);
            if (i10 >= childAt.getLeft() && i10 < childAt.getRight() && i11 >= childAt.getTop() && i11 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0065  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean i(int r11, int r12, int r13, int r14) {
        /*
            r10 = this;
            android.view.View r0 = r10.f7601r
            int r2 = r0.getLeft()
            android.view.View r0 = r10.f7601r
            int r3 = r0.getTop()
            int r4 = r11 - r2
            int r5 = r12 - r3
            android.widget.OverScroller r1 = r10.f7599p
            r11 = 0
            if (r4 != 0) goto L_0x001e
            if (r5 != 0) goto L_0x001e
            r1.abortAnimation()
            r10.p(r11)
            return r11
        L_0x001e:
            android.view.View r12 = r10.f7601r
            float r0 = r10.f7597n
            int r0 = (int) r0
            float r6 = r10.f7596m
            int r6 = (int) r6
            int r7 = java.lang.Math.abs(r13)
            if (r7 >= r0) goto L_0x002e
            r13 = r11
            goto L_0x0035
        L_0x002e:
            if (r7 <= r6) goto L_0x0035
            if (r13 <= 0) goto L_0x0034
            r13 = r6
            goto L_0x0035
        L_0x0034:
            int r13 = -r6
        L_0x0035:
            int r7 = java.lang.Math.abs(r14)
            if (r7 >= r0) goto L_0x003c
            goto L_0x0043
        L_0x003c:
            if (r7 <= r6) goto L_0x0044
            if (r14 <= 0) goto L_0x0042
            r14 = r6
            goto L_0x0044
        L_0x0042:
            int r11 = -r6
        L_0x0043:
            r14 = r11
        L_0x0044:
            int r11 = java.lang.Math.abs(r4)
            int r0 = java.lang.Math.abs(r5)
            int r6 = java.lang.Math.abs(r13)
            int r7 = java.lang.Math.abs(r14)
            int r8 = r6 + r7
            int r9 = r11 + r0
            if (r13 == 0) goto L_0x005d
            float r11 = (float) r6
            float r6 = (float) r8
            goto L_0x005f
        L_0x005d:
            float r11 = (float) r11
            float r6 = (float) r9
        L_0x005f:
            float r11 = r11 / r6
            if (r14 == 0) goto L_0x0065
            float r0 = (float) r7
            float r6 = (float) r8
            goto L_0x0067
        L_0x0065:
            float r0 = (float) r0
            float r6 = (float) r9
        L_0x0067:
            float r0 = r0 / r6
            o0.c$c r6 = r10.f7600q
            int r12 = r6.c(r12)
            int r12 = r10.f(r4, r13, r12)
            int r13 = r6.d()
            int r13 = r10.f(r5, r14, r13)
            float r12 = (float) r12
            float r12 = r12 * r11
            float r11 = (float) r13
            float r11 = r11 * r0
            float r11 = r11 + r12
            int r6 = (int) r11
            r1.startScroll(r2, r3, r4, r5, r6)
            r11 = 2
            r10.p(r11)
            r11 = 1
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.c.i(int, int, int, int):boolean");
    }

    public final boolean j(int i10) {
        boolean z;
        if ((this.f7595k & (1 << i10)) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i10 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    public final void k(MotionEvent motionEvent) {
        int i10;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.l == null) {
            this.l = VelocityTracker.obtain();
        }
        this.l.addMovement(motionEvent);
        int i11 = 0;
        C0108c cVar = this.f7600q;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (this.f7586a != 1) {
                        int pointerCount = motionEvent.getPointerCount();
                        while (i11 < pointerCount) {
                            int pointerId = motionEvent.getPointerId(i11);
                            if (j(pointerId)) {
                                float x10 = motionEvent.getX(i11);
                                float y10 = motionEvent.getY(i11);
                                float f10 = x10 - this.d[pointerId];
                                float f11 = y10 - this.f7589e[pointerId];
                                m(f10, f11, pointerId);
                                if (this.f7586a != 1) {
                                    View h10 = h((int) x10, (int) y10);
                                    if (d(h10, f10, f11) && s(h10, pointerId)) {
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                            i11++;
                        }
                    } else if (j(this.f7588c)) {
                        int findPointerIndex = motionEvent.findPointerIndex(this.f7588c);
                        float x11 = motionEvent.getX(findPointerIndex);
                        float y11 = motionEvent.getY(findPointerIndex);
                        float[] fArr = this.f7590f;
                        int i12 = this.f7588c;
                        int i13 = (int) (x11 - fArr[i12]);
                        int i14 = (int) (y11 - this.f7591g[i12]);
                        int left = this.f7601r.getLeft() + i13;
                        int top = this.f7601r.getTop() + i14;
                        int left2 = this.f7601r.getLeft();
                        int top2 = this.f7601r.getTop();
                        if (i13 != 0) {
                            left = cVar.a(this.f7601r, left);
                            WeakHashMap<View, b0> weakHashMap = w.f6004a;
                            this.f7601r.offsetLeftAndRight(left - left2);
                        }
                        if (i14 != 0) {
                            top = cVar.b(this.f7601r, top);
                            WeakHashMap<View, b0> weakHashMap2 = w.f6004a;
                            this.f7601r.offsetTopAndBottom(top - top2);
                        }
                        if (!(i13 == 0 && i14 == 0)) {
                            cVar.g(this.f7601r, left, top);
                        }
                    } else {
                        return;
                    }
                    o(motionEvent);
                    return;
                } else if (actionMasked != 3) {
                    if (actionMasked == 5) {
                        int pointerId2 = motionEvent.getPointerId(actionIndex);
                        float x12 = motionEvent.getX(actionIndex);
                        float y12 = motionEvent.getY(actionIndex);
                        n(x12, y12, pointerId2);
                        if (this.f7586a == 0) {
                            s(h((int) x12, (int) y12), pointerId2);
                            if ((this.f7592h[pointerId2] & 0) == 0) {
                                return;
                            }
                        } else {
                            int i15 = (int) x12;
                            int i16 = (int) y12;
                            View view = this.f7601r;
                            if (view != null && i15 >= view.getLeft() && i15 < view.getRight() && i16 >= view.getTop() && i16 < view.getBottom()) {
                                i11 = 1;
                            }
                            if (i11 != 0) {
                                s(this.f7601r, pointerId2);
                                return;
                            }
                            return;
                        }
                    } else if (actionMasked == 6) {
                        int pointerId3 = motionEvent.getPointerId(actionIndex);
                        if (this.f7586a == 1 && pointerId3 == this.f7588c) {
                            int pointerCount2 = motionEvent.getPointerCount();
                            while (true) {
                                if (i11 >= pointerCount2) {
                                    i10 = -1;
                                    break;
                                }
                                int pointerId4 = motionEvent.getPointerId(i11);
                                if (pointerId4 != this.f7588c) {
                                    View h11 = h((int) motionEvent.getX(i11), (int) motionEvent.getY(i11));
                                    View view2 = this.f7601r;
                                    if (h11 == view2 && s(view2, pointerId4)) {
                                        i10 = this.f7588c;
                                        break;
                                    }
                                }
                                i11++;
                            }
                            if (i10 == -1) {
                                l();
                            }
                        }
                        e(pointerId3);
                        return;
                    } else {
                        return;
                    }
                } else if (this.f7586a == 1) {
                    this.f7602s = true;
                    cVar.h(this.f7601r, 0.0f, 0.0f);
                    this.f7602s = false;
                    if (this.f7586a == 1) {
                        p(0);
                    }
                }
            } else if (this.f7586a == 1) {
                l();
            }
            a();
            return;
        }
        float x13 = motionEvent.getX();
        float y13 = motionEvent.getY();
        int pointerId5 = motionEvent.getPointerId(0);
        View h12 = h((int) x13, (int) y13);
        n(x13, y13, pointerId5);
        s(h12, pointerId5);
        if ((this.f7592h[pointerId5] & 0) == 0) {
            return;
        }
        cVar.getClass();
    }

    public final void l() {
        VelocityTracker velocityTracker = this.l;
        float f10 = this.f7596m;
        velocityTracker.computeCurrentVelocity(1000, f10);
        float xVelocity = this.l.getXVelocity(this.f7588c);
        float abs = Math.abs(xVelocity);
        float f11 = this.f7597n;
        float f12 = 0.0f;
        if (abs < f11) {
            xVelocity = 0.0f;
        } else if (abs > f10) {
            if (xVelocity > 0.0f) {
                xVelocity = f10;
            } else {
                xVelocity = -f10;
            }
        }
        float yVelocity = this.l.getYVelocity(this.f7588c);
        float abs2 = Math.abs(yVelocity);
        if (abs2 >= f11) {
            if (abs2 > f10) {
                if (yVelocity <= 0.0f) {
                    f10 = -f10;
                }
                f12 = f10;
            } else {
                f12 = yVelocity;
            }
        }
        this.f7602s = true;
        this.f7600q.h(this.f7601r, xVelocity, f12);
        this.f7602s = false;
        if (this.f7586a == 1) {
            p(0);
        }
    }

    public final void m(float f10, float f11, int i10) {
        boolean c10 = c(f10, f11, i10, 1);
        if (c(f11, f10, i10, 4)) {
            c10 |= true;
        }
        if (c(f10, f11, i10, 2)) {
            c10 |= true;
        }
        if (c(f11, f10, i10, 8)) {
            c10 |= true;
        }
        if (c10) {
            int[] iArr = this.f7593i;
            iArr[i10] = iArr[i10] | c10;
            this.f7600q.getClass();
        }
    }

    public final void n(float f10, float f11, int i10) {
        float[] fArr = this.d;
        int i11 = 0;
        if (fArr == null || fArr.length <= i10) {
            int i12 = i10 + 1;
            float[] fArr2 = new float[i12];
            float[] fArr3 = new float[i12];
            float[] fArr4 = new float[i12];
            float[] fArr5 = new float[i12];
            int[] iArr = new int[i12];
            int[] iArr2 = new int[i12];
            int[] iArr3 = new int[i12];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f7589e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f7590f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f7591g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f7592h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f7593i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f7594j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.d = fArr2;
            this.f7589e = fArr3;
            this.f7590f = fArr4;
            this.f7591g = fArr5;
            this.f7592h = iArr;
            this.f7593i = iArr2;
            this.f7594j = iArr3;
        }
        float[] fArr9 = this.d;
        this.f7590f[i10] = f10;
        fArr9[i10] = f10;
        float[] fArr10 = this.f7589e;
        this.f7591g[i10] = f11;
        fArr10[i10] = f11;
        int[] iArr7 = this.f7592h;
        int i13 = (int) f10;
        int i14 = (int) f11;
        ViewGroup viewGroup = this.f7603t;
        int left = viewGroup.getLeft();
        int i15 = this.f7598o;
        if (i13 < left + i15) {
            i11 = 1;
        }
        if (i14 < viewGroup.getTop() + i15) {
            i11 |= 4;
        }
        if (i13 > viewGroup.getRight() - i15) {
            i11 |= 2;
        }
        if (i14 > viewGroup.getBottom() - i15) {
            i11 |= 8;
        }
        iArr7[i10] = i11;
        this.f7595k |= 1 << i10;
    }

    public final void o(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i10 = 0; i10 < pointerCount; i10++) {
            int pointerId = motionEvent.getPointerId(i10);
            if (j(pointerId)) {
                float x10 = motionEvent.getX(i10);
                float y10 = motionEvent.getY(i10);
                this.f7590f[pointerId] = x10;
                this.f7591g[pointerId] = y10;
            }
        }
    }

    public final void p(int i10) {
        this.f7603t.removeCallbacks(this.u);
        if (this.f7586a != i10) {
            this.f7586a = i10;
            this.f7600q.f(i10);
            if (this.f7586a == 0) {
                this.f7601r = null;
            }
        }
    }

    public final boolean q(int i10, int i11) {
        if (this.f7602s) {
            return i(i10, i11, (int) this.l.getXVelocity(this.f7588c), (int) this.l.getYVelocity(this.f7588c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0057, code lost:
        if ((r0.f7592h[r2] & 0) != 0) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00d2, code lost:
        if (r13 != r12) goto L_0x00db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x011c, code lost:
        if ((r0.f7592h[r1] & 0) != 0) goto L_0x0059;
     */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean r(android.view.MotionEvent r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            int r2 = r19.getActionMasked()
            int r3 = r19.getActionIndex()
            if (r2 != 0) goto L_0x0011
            r18.a()
        L_0x0011:
            android.view.VelocityTracker r4 = r0.l
            if (r4 != 0) goto L_0x001b
            android.view.VelocityTracker r4 = android.view.VelocityTracker.obtain()
            r0.l = r4
        L_0x001b:
            android.view.VelocityTracker r4 = r0.l
            r4.addMovement(r1)
            r4 = 1
            r5 = 0
            r6 = 2
            o0.c$c r7 = r0.f7600q
            if (r2 == 0) goto L_0x00f7
            if (r2 == r4) goto L_0x00f3
            if (r2 == r6) goto L_0x006f
            r8 = 3
            if (r2 == r8) goto L_0x00f3
            r8 = 5
            if (r2 == r8) goto L_0x003f
            r6 = 6
            if (r2 == r6) goto L_0x0036
            goto L_0x0120
        L_0x0036:
            int r1 = r1.getPointerId(r3)
            r0.e(r1)
            goto L_0x0120
        L_0x003f:
            int r2 = r1.getPointerId(r3)
            float r8 = r1.getX(r3)
            float r1 = r1.getY(r3)
            r0.n(r8, r1, r2)
            int r3 = r0.f7586a
            if (r3 != 0) goto L_0x005e
            int[] r1 = r0.f7592h
            r1 = r1[r2]
            r1 = r1 & r5
            if (r1 == 0) goto L_0x0120
        L_0x0059:
            r7.getClass()
            goto L_0x0120
        L_0x005e:
            if (r3 != r6) goto L_0x0120
            int r3 = (int) r8
            int r1 = (int) r1
            android.view.View r1 = r0.h(r3, r1)
            android.view.View r3 = r0.f7601r
            if (r1 != r3) goto L_0x0120
            r0.s(r1, r2)
            goto L_0x0120
        L_0x006f:
            float[] r2 = r0.d
            if (r2 == 0) goto L_0x0120
            float[] r2 = r0.f7589e
            if (r2 != 0) goto L_0x0079
            goto L_0x0120
        L_0x0079:
            int r2 = r19.getPointerCount()
            r3 = r5
        L_0x007e:
            if (r3 >= r2) goto L_0x00ef
            int r6 = r1.getPointerId(r3)
            boolean r8 = r0.j(r6)
            if (r8 != 0) goto L_0x008b
            goto L_0x00ec
        L_0x008b:
            float r8 = r1.getX(r3)
            float r9 = r1.getY(r3)
            float[] r10 = r0.d
            r10 = r10[r6]
            float r10 = r8 - r10
            float[] r11 = r0.f7589e
            r11 = r11[r6]
            float r11 = r9 - r11
            int r8 = (int) r8
            int r9 = (int) r9
            android.view.View r8 = r0.h(r8, r9)
            if (r8 == 0) goto L_0x00af
            boolean r9 = r0.d(r8, r10, r11)
            if (r9 == 0) goto L_0x00af
            r9 = r4
            goto L_0x00b0
        L_0x00af:
            r9 = r5
        L_0x00b0:
            if (r9 == 0) goto L_0x00db
            int r12 = r8.getLeft()
            int r13 = (int) r10
            int r13 = r13 + r12
            int r13 = r7.a(r8, r13)
            int r14 = r8.getTop()
            int r15 = (int) r11
            int r15 = r15 + r14
            int r15 = r7.b(r8, r15)
            int r16 = r7.c(r8)
            int r17 = r7.d()
            if (r16 == 0) goto L_0x00d4
            if (r16 <= 0) goto L_0x00db
            if (r13 != r12) goto L_0x00db
        L_0x00d4:
            if (r17 == 0) goto L_0x00ef
            if (r17 <= 0) goto L_0x00db
            if (r15 != r14) goto L_0x00db
            goto L_0x00ef
        L_0x00db:
            r0.m(r10, r11, r6)
            int r10 = r0.f7586a
            if (r10 != r4) goto L_0x00e3
            goto L_0x00ef
        L_0x00e3:
            if (r9 == 0) goto L_0x00ec
            boolean r6 = r0.s(r8, r6)
            if (r6 == 0) goto L_0x00ec
            goto L_0x00ef
        L_0x00ec:
            int r3 = r3 + 1
            goto L_0x007e
        L_0x00ef:
            r18.o(r19)
            goto L_0x0120
        L_0x00f3:
            r18.a()
            goto L_0x0120
        L_0x00f7:
            float r2 = r19.getX()
            float r3 = r19.getY()
            int r1 = r1.getPointerId(r5)
            r0.n(r2, r3, r1)
            int r2 = (int) r2
            int r3 = (int) r3
            android.view.View r2 = r0.h(r2, r3)
            android.view.View r3 = r0.f7601r
            if (r2 != r3) goto L_0x0117
            int r3 = r0.f7586a
            if (r3 != r6) goto L_0x0117
            r0.s(r2, r1)
        L_0x0117:
            int[] r2 = r0.f7592h
            r1 = r2[r1]
            r1 = r1 & r5
            if (r1 == 0) goto L_0x0120
            goto L_0x0059
        L_0x0120:
            int r1 = r0.f7586a
            if (r1 != r4) goto L_0x0125
            goto L_0x0126
        L_0x0125:
            r4 = r5
        L_0x0126:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.c.r(android.view.MotionEvent):boolean");
    }

    public final boolean s(View view, int i10) {
        if (view == this.f7601r && this.f7588c == i10) {
            return true;
        }
        if (view == null || !this.f7600q.i(view, i10)) {
            return false;
        }
        this.f7588c = i10;
        b(view, i10);
        return true;
    }
}
