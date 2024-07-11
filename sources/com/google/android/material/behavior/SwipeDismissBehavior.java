package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.i;
import com.google.android.material.snackbar.k;
import i0.b0;
import i0.w;
import j0.b;
import java.util.WeakHashMap;
import o0.c;

public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.c<V> {

    /* renamed from: a  reason: collision with root package name */
    public o0.c f3240a;

    /* renamed from: b  reason: collision with root package name */
    public b f3241b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f3242c;
    public int d = 2;

    /* renamed from: e  reason: collision with root package name */
    public final float f3243e = 0.5f;

    /* renamed from: f  reason: collision with root package name */
    public float f3244f = 0.0f;

    /* renamed from: g  reason: collision with root package name */
    public float f3245g = 0.5f;

    /* renamed from: h  reason: collision with root package name */
    public final a f3246h = new a();

    public class a extends c.C0108c {

        /* renamed from: a  reason: collision with root package name */
        public int f3247a;

        /* renamed from: b  reason: collision with root package name */
        public int f3248b = -1;

        public a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0021, code lost:
            r0 = r3.f3247a - r4.getWidth();
            r4 = r3.f3247a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
            if (r0 != false) goto L_0x0021;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0017, code lost:
            if (r0 != false) goto L_0x0019;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final int a(android.view.View r4, int r5) {
            /*
                r3 = this;
                java.util.WeakHashMap<android.view.View, i0.b0> r0 = i0.w.f6004a
                int r0 = i0.w.e.d(r4)
                r1 = 1
                if (r0 != r1) goto L_0x000b
                r0 = r1
                goto L_0x000c
            L_0x000b:
                r0 = 0
            L_0x000c:
                com.google.android.material.behavior.SwipeDismissBehavior r2 = com.google.android.material.behavior.SwipeDismissBehavior.this
                int r2 = r2.d
                if (r2 != 0) goto L_0x0015
                if (r0 == 0) goto L_0x0019
                goto L_0x0021
            L_0x0015:
                if (r2 != r1) goto L_0x002b
                if (r0 == 0) goto L_0x0021
            L_0x0019:
                int r0 = r3.f3247a
                int r4 = r4.getWidth()
                int r4 = r4 + r0
                goto L_0x0039
            L_0x0021:
                int r0 = r3.f3247a
                int r4 = r4.getWidth()
                int r0 = r0 - r4
                int r4 = r3.f3247a
                goto L_0x0039
            L_0x002b:
                int r0 = r3.f3247a
                int r1 = r4.getWidth()
                int r0 = r0 - r1
                int r1 = r3.f3247a
                int r4 = r4.getWidth()
                int r4 = r4 + r1
            L_0x0039:
                int r5 = java.lang.Math.max(r0, r5)
                int r4 = java.lang.Math.min(r5, r4)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.a.a(android.view.View, int):int");
        }

        public final int b(View view, int i10) {
            return view.getTop();
        }

        public final int c(View view) {
            return view.getWidth();
        }

        public final void e(View view, int i10) {
            this.f3248b = i10;
            this.f3247a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        public final void f(int i10) {
            b bVar = SwipeDismissBehavior.this.f3241b;
            if (bVar != null) {
                BaseTransientBottomBar baseTransientBottomBar = ((i) bVar).f3567a;
                if (i10 == 0) {
                    k b10 = k.b();
                    BaseTransientBottomBar.c cVar = baseTransientBottomBar.f3540n;
                    synchronized (b10.f3571a) {
                        if (b10.c(cVar)) {
                            k.c cVar2 = b10.f3573c;
                            if (cVar2.f3577c) {
                                cVar2.f3577c = false;
                                b10.d(cVar2);
                            }
                        }
                    }
                } else if (i10 == 1 || i10 == 2) {
                    k b11 = k.b();
                    BaseTransientBottomBar.c cVar3 = baseTransientBottomBar.f3540n;
                    synchronized (b11.f3571a) {
                        if (b11.c(cVar3)) {
                            k.c cVar4 = b11.f3573c;
                            if (!cVar4.f3577c) {
                                cVar4.f3577c = true;
                                b11.f3572b.removeCallbacksAndMessages(cVar4);
                            }
                        }
                    }
                }
            }
        }

        public final void g(View view, int i10, int i11) {
            SwipeDismissBehavior swipeDismissBehavior = SwipeDismissBehavior.this;
            float width = (((float) view.getWidth()) * swipeDismissBehavior.f3244f) + ((float) this.f3247a);
            float width2 = (((float) view.getWidth()) * swipeDismissBehavior.f3245g) + ((float) this.f3247a);
            float f10 = (float) i10;
            if (f10 <= width) {
                view.setAlpha(1.0f);
            } else if (f10 >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((f10 - width) / (width2 - width))), 1.0f));
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0050, code lost:
            if (java.lang.Math.abs(r9.getLeft() - r8.f3247a) >= java.lang.Math.round(((float) r9.getWidth()) * r3.f3243e)) goto L_0x0052;
         */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0057  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0063  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x0072  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x007d  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void h(android.view.View r9, float r10, float r11) {
            /*
                r8 = this;
                r11 = -1
                r8.f3248b = r11
                int r11 = r9.getWidth()
                r0 = 0
                int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
                r2 = 1
                com.google.android.material.behavior.SwipeDismissBehavior r3 = com.google.android.material.behavior.SwipeDismissBehavior.this
                r4 = 0
                if (r1 == 0) goto L_0x0039
                java.util.WeakHashMap<android.view.View, i0.b0> r5 = i0.w.f6004a
                int r5 = i0.w.e.d(r9)
                if (r5 != r2) goto L_0x001a
                r5 = r2
                goto L_0x001b
            L_0x001a:
                r5 = r4
            L_0x001b:
                int r6 = r3.d
                r7 = 2
                if (r6 != r7) goto L_0x0021
                goto L_0x0052
            L_0x0021:
                if (r6 != 0) goto L_0x002d
                if (r5 == 0) goto L_0x002a
                int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
                if (r10 >= 0) goto L_0x0054
                goto L_0x0052
            L_0x002a:
                if (r1 <= 0) goto L_0x0054
                goto L_0x0052
            L_0x002d:
                if (r6 != r2) goto L_0x0054
                if (r5 == 0) goto L_0x0034
                if (r1 <= 0) goto L_0x0054
                goto L_0x0052
            L_0x0034:
                int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
                if (r10 >= 0) goto L_0x0054
                goto L_0x0052
            L_0x0039:
                int r10 = r9.getLeft()
                int r0 = r8.f3247a
                int r10 = r10 - r0
                int r0 = r9.getWidth()
                float r0 = (float) r0
                float r1 = r3.f3243e
                float r0 = r0 * r1
                int r0 = java.lang.Math.round(r0)
                int r10 = java.lang.Math.abs(r10)
                if (r10 < r0) goto L_0x0054
            L_0x0052:
                r10 = r2
                goto L_0x0055
            L_0x0054:
                r10 = r4
            L_0x0055:
                if (r10 == 0) goto L_0x0063
                int r10 = r9.getLeft()
                int r0 = r8.f3247a
                if (r10 >= r0) goto L_0x0061
                int r0 = r0 - r11
                goto L_0x0066
            L_0x0061:
                int r0 = r0 + r11
                goto L_0x0066
            L_0x0063:
                int r0 = r8.f3247a
                r2 = r4
            L_0x0066:
                o0.c r10 = r3.f3240a
                int r11 = r9.getTop()
                boolean r10 = r10.q(r0, r11)
                if (r10 == 0) goto L_0x007d
                com.google.android.material.behavior.SwipeDismissBehavior$c r10 = new com.google.android.material.behavior.SwipeDismissBehavior$c
                r10.<init>(r9, r2)
                java.util.WeakHashMap<android.view.View, i0.b0> r11 = i0.w.f6004a
                i0.w.d.m(r9, r10)
                goto L_0x0088
            L_0x007d:
                if (r2 == 0) goto L_0x0088
                com.google.android.material.behavior.SwipeDismissBehavior$b r10 = r3.f3241b
                if (r10 == 0) goto L_0x0088
                com.google.android.material.snackbar.i r10 = (com.google.android.material.snackbar.i) r10
                r10.a(r9)
            L_0x0088:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.a.h(android.view.View, float, float):void");
        }

        public final boolean i(View view, int i10) {
            int i11 = this.f3248b;
            return (i11 == -1 || i11 == i10) && SwipeDismissBehavior.this.s(view);
        }
    }

    public interface b {
    }

    public class c implements Runnable {

        /* renamed from: o  reason: collision with root package name */
        public final View f3250o;

        /* renamed from: p  reason: collision with root package name */
        public final boolean f3251p;

        public c(View view, boolean z) {
            this.f3250o = view;
            this.f3251p = z;
        }

        public final void run() {
            b bVar;
            SwipeDismissBehavior swipeDismissBehavior = SwipeDismissBehavior.this;
            o0.c cVar = swipeDismissBehavior.f3240a;
            View view = this.f3250o;
            if (cVar != null && cVar.g()) {
                WeakHashMap<View, b0> weakHashMap = w.f6004a;
                w.d.m(view, this);
            } else if (this.f3251p && (bVar = swipeDismissBehavior.f3241b) != null) {
                ((i) bVar).a(view);
            }
        }
    }

    public boolean g(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
        boolean z = this.f3242c;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z = coordinatorLayout.p(v10, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f3242c = z;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f3242c = false;
        }
        if (!z) {
            return false;
        }
        if (this.f3240a == null) {
            this.f3240a = new o0.c(coordinatorLayout.getContext(), coordinatorLayout, this.f3246h);
        }
        return this.f3240a.r(motionEvent);
    }

    public final boolean h(CoordinatorLayout coordinatorLayout, V v10, int i10) {
        WeakHashMap<View, b0> weakHashMap = w.f6004a;
        if (w.d.c(v10) == 0) {
            w.d.s(v10, 1);
            w.h(v10, 1048576);
            w.f(v10, 0);
            if (s(v10)) {
                w.i(v10, b.a.f6394j, new a(this));
            }
        }
        return false;
    }

    public final boolean r(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
        o0.c cVar = this.f3240a;
        if (cVar == null) {
            return false;
        }
        cVar.k(motionEvent);
        return true;
    }

    public boolean s(View view) {
        return true;
    }
}
