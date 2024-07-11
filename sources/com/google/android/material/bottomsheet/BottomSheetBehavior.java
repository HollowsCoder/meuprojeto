package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.karumi.dexter.R;
import h6.l;
import h6.m;
import h6.n;
import i0.a;
import i0.b0;
import i0.w;
import j0.b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import m6.f;
import m6.i;
import o0.c;
import p9.u;

public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.c<V> {
    public int A;
    public final float B = -1.0f;
    public boolean C;
    public boolean D;
    public boolean E = true;
    public int F = 4;
    public o0.c G;
    public boolean H;
    public int I;
    public boolean J;
    public int K;
    public int L;
    public int M;
    public WeakReference<V> N;
    public WeakReference<View> O;
    public final ArrayList<d> P = new ArrayList<>();
    public VelocityTracker Q;
    public int R;
    public int S;
    public boolean T;
    public HashMap U;
    public int V = -1;
    public final c W = new c();

    /* renamed from: a  reason: collision with root package name */
    public int f3274a = 0;

    /* renamed from: b  reason: collision with root package name */
    public boolean f3275b = true;

    /* renamed from: c  reason: collision with root package name */
    public final float f3276c;
    public int d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f3277e;

    /* renamed from: f  reason: collision with root package name */
    public int f3278f;

    /* renamed from: g  reason: collision with root package name */
    public final int f3279g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f3280h;

    /* renamed from: i  reason: collision with root package name */
    public m6.f f3281i;

    /* renamed from: j  reason: collision with root package name */
    public int f3282j = -1;

    /* renamed from: k  reason: collision with root package name */
    public int f3283k;
    public boolean l;

    /* renamed from: m  reason: collision with root package name */
    public final boolean f3284m;

    /* renamed from: n  reason: collision with root package name */
    public final boolean f3285n;

    /* renamed from: o  reason: collision with root package name */
    public final boolean f3286o;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f3287p;

    /* renamed from: q  reason: collision with root package name */
    public int f3288q;

    /* renamed from: r  reason: collision with root package name */
    public int f3289r;

    /* renamed from: s  reason: collision with root package name */
    public i f3290s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f3291t;
    public BottomSheetBehavior<V>.f u = null;

    /* renamed from: v  reason: collision with root package name */
    public ValueAnimator f3292v;
    public int w;

    /* renamed from: x  reason: collision with root package name */
    public int f3293x;

    /* renamed from: y  reason: collision with root package name */
    public int f3294y;
    public float z = 0.5f;

    public class a implements Runnable {

        /* renamed from: o  reason: collision with root package name */
        public final /* synthetic */ View f3295o;

        /* renamed from: p  reason: collision with root package name */
        public final /* synthetic */ ViewGroup.LayoutParams f3296p;

        public a(View view, ViewGroup.LayoutParams layoutParams) {
            this.f3295o = view;
            this.f3296p = layoutParams;
        }

        public final void run() {
            this.f3295o.setLayoutParams(this.f3296p);
        }
    }

    public class b implements Runnable {

        /* renamed from: o  reason: collision with root package name */
        public final /* synthetic */ View f3297o;

        /* renamed from: p  reason: collision with root package name */
        public final /* synthetic */ int f3298p;

        public b(View view, int i10) {
            this.f3297o = view;
            this.f3298p = i10;
        }

        public final void run() {
            BottomSheetBehavior.this.F(this.f3297o, this.f3298p);
        }
    }

    public class c extends c.C0108c {
        public c() {
        }

        public final int a(View view, int i10) {
            return view.getLeft();
        }

        public final int b(View view, int i10) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return androidx.databinding.a.l(i10, bottomSheetBehavior.y(), bottomSheetBehavior.C ? bottomSheetBehavior.M : bottomSheetBehavior.A);
        }

        public final int d() {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return bottomSheetBehavior.C ? bottomSheetBehavior.M : bottomSheetBehavior.A;
        }

        public final void f(int i10) {
            if (i10 == 1) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.E) {
                    bottomSheetBehavior.E(1);
                }
            }
        }

        public final void g(View view, int i10, int i11) {
            BottomSheetBehavior.this.v(i11);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:23:0x006b, code lost:
            if (java.lang.Math.abs(r6.getTop() - r4.y()) < java.lang.Math.abs(r6.getTop() - r4.f3294y)) goto L_0x00c5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x0097, code lost:
            if (java.lang.Math.abs(r7 - r4.f3294y) < java.lang.Math.abs(r7 - r4.A)) goto L_0x00db;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b1, code lost:
            if (java.lang.Math.abs(r7 - r4.f3293x) < java.lang.Math.abs(r7 - r4.A)) goto L_0x00b3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x00c3, code lost:
            if (r7 < java.lang.Math.abs(r7 - r4.A)) goto L_0x00c5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:0x00c5, code lost:
            r7 = r4.y();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:45:0x00d9, code lost:
            if (java.lang.Math.abs(r7 - r8) < java.lang.Math.abs(r7 - r4.A)) goto L_0x00db;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:5:0x0015, code lost:
            if (r7 > r8) goto L_0x00e1;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void h(android.view.View r6, float r7, float r8) {
            /*
                r5 = this;
                r0 = 0
                int r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
                r2 = 1
                r3 = 6
                com.google.android.material.bottomsheet.BottomSheetBehavior r4 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                if (r1 >= 0) goto L_0x0019
                boolean r7 = r4.f3275b
                if (r7 == 0) goto L_0x000f
                goto L_0x00b3
            L_0x000f:
                int r7 = r6.getTop()
                int r8 = r4.f3294y
                if (r7 <= r8) goto L_0x00c5
                goto L_0x00e1
            L_0x0019:
                boolean r1 = r4.C
                if (r1 == 0) goto L_0x006e
                boolean r1 = r4.H(r6, r8)
                if (r1 == 0) goto L_0x006e
                float r7 = java.lang.Math.abs(r7)
                float r0 = java.lang.Math.abs(r8)
                int r7 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
                if (r7 >= 0) goto L_0x0035
                r7 = 1140457472(0x43fa0000, float:500.0)
                int r7 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
                if (r7 > 0) goto L_0x0049
            L_0x0035:
                int r7 = r6.getTop()
                int r8 = r4.M
                int r0 = r4.y()
                int r0 = r0 + r8
                int r0 = r0 / 2
                if (r7 <= r0) goto L_0x0046
                r7 = r2
                goto L_0x0047
            L_0x0046:
                r7 = 0
            L_0x0047:
                if (r7 == 0) goto L_0x004e
            L_0x0049:
                int r8 = r4.M
                r3 = 5
                goto L_0x00e1
            L_0x004e:
                boolean r7 = r4.f3275b
                if (r7 == 0) goto L_0x0053
                goto L_0x00b3
            L_0x0053:
                int r7 = r6.getTop()
                int r8 = r4.y()
                int r7 = r7 - r8
                int r7 = java.lang.Math.abs(r7)
                int r8 = r6.getTop()
                int r0 = r4.f3294y
                int r8 = r8 - r0
                int r8 = java.lang.Math.abs(r8)
                if (r7 >= r8) goto L_0x00db
                goto L_0x00c5
            L_0x006e:
                int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
                if (r0 == 0) goto L_0x009a
                float r7 = java.lang.Math.abs(r7)
                float r8 = java.lang.Math.abs(r8)
                int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
                if (r7 <= 0) goto L_0x007f
                goto L_0x009a
            L_0x007f:
                boolean r7 = r4.f3275b
                if (r7 == 0) goto L_0x0084
                goto L_0x00de
            L_0x0084:
                int r7 = r6.getTop()
                int r8 = r4.f3294y
                int r8 = r7 - r8
                int r8 = java.lang.Math.abs(r8)
                int r0 = r4.A
                int r7 = r7 - r0
                int r7 = java.lang.Math.abs(r7)
                if (r8 >= r7) goto L_0x00de
                goto L_0x00db
            L_0x009a:
                int r7 = r6.getTop()
                boolean r8 = r4.f3275b
                if (r8 == 0) goto L_0x00b7
                int r8 = r4.f3293x
                int r8 = r7 - r8
                int r8 = java.lang.Math.abs(r8)
                int r0 = r4.A
                int r7 = r7 - r0
                int r7 = java.lang.Math.abs(r7)
                if (r8 >= r7) goto L_0x00de
            L_0x00b3:
                int r7 = r4.f3293x
            L_0x00b5:
                r8 = r7
                goto L_0x00ca
            L_0x00b7:
                int r8 = r4.f3294y
                if (r7 >= r8) goto L_0x00cc
                int r8 = r4.A
                int r8 = r7 - r8
                int r8 = java.lang.Math.abs(r8)
                if (r7 >= r8) goto L_0x00db
            L_0x00c5:
                int r7 = r4.y()
                goto L_0x00b5
            L_0x00ca:
                r3 = 3
                goto L_0x00e1
            L_0x00cc:
                int r8 = r7 - r8
                int r8 = java.lang.Math.abs(r8)
                int r0 = r4.A
                int r7 = r7 - r0
                int r7 = java.lang.Math.abs(r7)
                if (r8 >= r7) goto L_0x00de
            L_0x00db:
                int r8 = r4.f3294y
                goto L_0x00e1
            L_0x00de:
                int r8 = r4.A
                r3 = 4
            L_0x00e1:
                r4.I(r6, r3, r8, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.c.h(android.view.View, float, float):void");
        }

        public final boolean i(View view, int i10) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i11 = bottomSheetBehavior.F;
            if (i11 == 1 || bottomSheetBehavior.T) {
                return false;
            }
            if (i11 == 3 && bottomSheetBehavior.R == i10) {
                WeakReference<View> weakReference = bottomSheetBehavior.O;
                View view2 = weakReference != null ? weakReference.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            WeakReference<V> weakReference2 = bottomSheetBehavior.N;
            return weakReference2 != null && weakReference2.get() == view;
        }
    }

    public static abstract class d {
        public abstract void a(View view);

        public abstract void b(View view, int i10);
    }

    public static class e extends n0.a {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* renamed from: q  reason: collision with root package name */
        public final int f3301q;

        /* renamed from: r  reason: collision with root package name */
        public final int f3302r;

        /* renamed from: s  reason: collision with root package name */
        public final boolean f3303s;

        /* renamed from: t  reason: collision with root package name */
        public final boolean f3304t;
        public final boolean u;

        public static class a implements Parcelable.ClassLoaderCreator<e> {
            public final Object createFromParcel(Parcel parcel) {
                return new e(parcel, (ClassLoader) null);
            }

            public final Object[] newArray(int i10) {
                return new e[i10];
            }

            public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new e(parcel, classLoader);
            }
        }

        public e(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f3301q = parcel.readInt();
            this.f3302r = parcel.readInt();
            boolean z = false;
            this.f3303s = parcel.readInt() == 1;
            this.f3304t = parcel.readInt() == 1;
            this.u = parcel.readInt() == 1 ? true : z;
        }

        public e(AbsSavedState absSavedState, BottomSheetBehavior bottomSheetBehavior) {
            super(absSavedState);
            this.f3301q = bottomSheetBehavior.F;
            this.f3302r = bottomSheetBehavior.d;
            this.f3303s = bottomSheetBehavior.f3275b;
            this.f3304t = bottomSheetBehavior.C;
            this.u = bottomSheetBehavior.D;
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f7340o, i10);
            parcel.writeInt(this.f3301q);
            parcel.writeInt(this.f3302r);
            parcel.writeInt(this.f3303s ? 1 : 0);
            parcel.writeInt(this.f3304t ? 1 : 0);
            parcel.writeInt(this.u ? 1 : 0);
        }
    }

    public class f implements Runnable {

        /* renamed from: o  reason: collision with root package name */
        public final View f3305o;

        /* renamed from: p  reason: collision with root package name */
        public boolean f3306p;

        /* renamed from: q  reason: collision with root package name */
        public int f3307q;

        public f(View view, int i10) {
            this.f3305o = view;
            this.f3307q = i10;
        }

        public final void run() {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            o0.c cVar = bottomSheetBehavior.G;
            if (cVar == null || !cVar.g()) {
                bottomSheetBehavior.E(this.f3307q);
            } else {
                WeakHashMap<View, b0> weakHashMap = w.f6004a;
                w.d.m(this.f3305o, this);
            }
            this.f3306p = false;
        }
    }

    public BottomSheetBehavior() {
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i10;
        int i11;
        int i12;
        this.f3279g = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u.f8114r);
        this.f3280h = obtainStyledAttributes.hasValue(16);
        boolean hasValue = obtainStyledAttributes.hasValue(2);
        if (hasValue) {
            u(context, attributeSet, hasValue, j6.c.a(context, obtainStyledAttributes, 2));
        } else {
            u(context, attributeSet, hasValue, (ColorStateList) null);
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.f3292v = ofFloat;
        ofFloat.setDuration(500);
        this.f3292v.addUpdateListener(new w5.a(this));
        this.B = obtainStyledAttributes.getDimension(1, -1.0f);
        if (obtainStyledAttributes.hasValue(0)) {
            this.f3282j = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(8);
        if (peekValue == null || (i12 = peekValue.data) != -1) {
            C(obtainStyledAttributes.getDimensionPixelSize(8, -1));
        } else {
            C(i12);
        }
        B(obtainStyledAttributes.getBoolean(7, false));
        this.l = obtainStyledAttributes.getBoolean(11, false);
        boolean z10 = obtainStyledAttributes.getBoolean(5, true);
        if (this.f3275b != z10) {
            this.f3275b = z10;
            if (this.N != null) {
                s();
            }
            if (!this.f3275b || this.F != 6) {
                i11 = this.F;
            } else {
                i11 = 3;
            }
            E(i11);
            J();
        }
        this.D = obtainStyledAttributes.getBoolean(10, false);
        this.E = obtainStyledAttributes.getBoolean(3, true);
        this.f3274a = obtainStyledAttributes.getInt(9, 0);
        float f10 = obtainStyledAttributes.getFloat(6, 0.5f);
        if (f10 <= 0.0f || f10 >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.z = f10;
        if (this.N != null) {
            this.f3294y = (int) ((1.0f - f10) * ((float) this.M));
        }
        TypedValue peekValue2 = obtainStyledAttributes.peekValue(4);
        if (peekValue2 == null || peekValue2.type != 16) {
            i10 = obtainStyledAttributes.getDimensionPixelOffset(4, 0);
        } else {
            i10 = peekValue2.data;
        }
        A(i10);
        this.f3284m = obtainStyledAttributes.getBoolean(12, false);
        this.f3285n = obtainStyledAttributes.getBoolean(13, false);
        this.f3286o = obtainStyledAttributes.getBoolean(14, false);
        this.f3287p = obtainStyledAttributes.getBoolean(15, true);
        obtainStyledAttributes.recycle();
        this.f3276c = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    public static View w(View view) {
        WeakHashMap<View, b0> weakHashMap = w.f6004a;
        if (w.i.p(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View w10 = w(viewGroup.getChildAt(i10));
            if (w10 != null) {
                return w10;
            }
        }
        return null;
    }

    public static BottomSheetBehavior x(FrameLayout frameLayout) {
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        if (layoutParams instanceof CoordinatorLayout.f) {
            CoordinatorLayout.c cVar = ((CoordinatorLayout.f) layoutParams).f942a;
            if (cVar instanceof BottomSheetBehavior) {
                return (BottomSheetBehavior) cVar;
            }
            throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
        }
        throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
    }

    public final void A(int i10) {
        if (i10 >= 0) {
            this.w = i10;
            return;
        }
        throw new IllegalArgumentException("offset must be greater than or equal to 0");
    }

    public final void B(boolean z10) {
        if (this.C != z10) {
            this.C = z10;
            if (!z10 && this.F == 5) {
                D(4);
            }
            J();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x001f  */
    /* JADX WARNING: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void C(int r4) {
        /*
            r3 = this;
            r0 = 0
            r1 = -1
            r2 = 1
            if (r4 != r1) goto L_0x000c
            boolean r4 = r3.f3277e
            if (r4 != 0) goto L_0x001d
            r3.f3277e = r2
            goto L_0x001c
        L_0x000c:
            boolean r1 = r3.f3277e
            if (r1 != 0) goto L_0x0014
            int r1 = r3.d
            if (r1 == r4) goto L_0x001d
        L_0x0014:
            r3.f3277e = r0
            int r4 = java.lang.Math.max(r0, r4)
            r3.d = r4
        L_0x001c:
            r0 = r2
        L_0x001d:
            if (r0 == 0) goto L_0x0022
            r3.M()
        L_0x0022:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.C(int):void");
    }

    public final void D(int i10) {
        if (i10 != this.F) {
            if (this.N != null) {
                G(i10);
            } else if (i10 == 4 || i10 == 3 || i10 == 6 || (this.C && i10 == 5)) {
                this.F = i10;
            }
        }
    }

    public final void E(int i10) {
        View view;
        if (this.F != i10) {
            this.F = i10;
            WeakReference<V> weakReference = this.N;
            if (weakReference != null && (view = (View) weakReference.get()) != null) {
                int i11 = 0;
                if (i10 == 3) {
                    L(true);
                } else if (i10 == 6 || i10 == 5 || i10 == 4) {
                    L(false);
                }
                K(i10);
                while (true) {
                    ArrayList<d> arrayList = this.P;
                    if (i11 < arrayList.size()) {
                        arrayList.get(i11).b(view, i10);
                        i11++;
                    } else {
                        J();
                        return;
                    }
                }
            }
        }
    }

    public final void F(View view, int i10) {
        int i11;
        int i12;
        if (i10 == 4) {
            i11 = this.A;
        } else if (i10 == 6) {
            i11 = this.f3294y;
            if (this.f3275b && i11 <= (i12 = this.f3293x)) {
                i10 = 3;
                i11 = i12;
            }
        } else if (i10 == 3) {
            i11 = y();
        } else if (!this.C || i10 != 5) {
            throw new IllegalArgumentException(b0.d.c("Illegal state argument: ", i10));
        } else {
            i11 = this.M;
        }
        I(view, i10, i11, false);
    }

    public final void G(int i10) {
        View view = (View) this.N.get();
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent != null && parent.isLayoutRequested()) {
                WeakHashMap<View, b0> weakHashMap = w.f6004a;
                if (w.g.b(view)) {
                    view.post(new b(view, i10));
                    return;
                }
            }
            F(view, i10);
        }
    }

    public final boolean H(View view, float f10) {
        if (this.D) {
            return true;
        }
        if (view.getTop() < this.A) {
            return false;
        }
        return Math.abs(((f10 * 0.1f) + ((float) view.getTop())) - ((float) this.A)) / ((float) t()) > 0.5f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002d, code lost:
        if (r7 != false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (r0.q(r5.getLeft(), r7) != false) goto L_0x002f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void I(android.view.View r5, int r6, int r7, boolean r8) {
        /*
            r4 = this;
            o0.c r0 = r4.G
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0030
            if (r8 == 0) goto L_0x0013
            int r8 = r5.getLeft()
            boolean r7 = r0.q(r8, r7)
            if (r7 == 0) goto L_0x0030
            goto L_0x002f
        L_0x0013:
            int r8 = r5.getLeft()
            r0.f7601r = r5
            r3 = -1
            r0.f7588c = r3
            boolean r7 = r0.i(r8, r7, r2, r2)
            if (r7 != 0) goto L_0x002d
            int r8 = r0.f7586a
            if (r8 != 0) goto L_0x002d
            android.view.View r8 = r0.f7601r
            if (r8 == 0) goto L_0x002d
            r8 = 0
            r0.f7601r = r8
        L_0x002d:
            if (r7 == 0) goto L_0x0030
        L_0x002f:
            r2 = r1
        L_0x0030:
            if (r2 == 0) goto L_0x0056
            r7 = 2
            r4.E(r7)
            r4.K(r6)
            com.google.android.material.bottomsheet.BottomSheetBehavior<V>$f r7 = r4.u
            if (r7 != 0) goto L_0x0044
            com.google.android.material.bottomsheet.BottomSheetBehavior$f r7 = new com.google.android.material.bottomsheet.BottomSheetBehavior$f
            r7.<init>(r5, r6)
            r4.u = r7
        L_0x0044:
            com.google.android.material.bottomsheet.BottomSheetBehavior<V>$f r7 = r4.u
            boolean r8 = r7.f3306p
            r7.f3307q = r6
            if (r8 != 0) goto L_0x0059
            java.util.WeakHashMap<android.view.View, i0.b0> r6 = i0.w.f6004a
            i0.w.d.m(r5, r7)
            com.google.android.material.bottomsheet.BottomSheetBehavior<V>$f r5 = r4.u
            r5.f3306p = r1
            goto L_0x0059
        L_0x0056:
            r4.E(r6)
        L_0x0059:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.I(android.view.View, int, int, boolean):void");
    }

    public final void J() {
        View view;
        b.a aVar;
        int i10;
        boolean z10;
        i0.a aVar2;
        WeakReference<V> weakReference = this.N;
        if (weakReference != null && (view = (View) weakReference.get()) != null) {
            w.h(view, 524288);
            w.f(view, 0);
            w.h(view, 262144);
            w.f(view, 0);
            w.h(view, 1048576);
            w.f(view, 0);
            int i11 = this.V;
            if (i11 != -1) {
                w.h(view, i11);
                w.f(view, 0);
            }
            int i12 = 6;
            if (!this.f3275b && this.F != 6) {
                String string = view.getResources().getString(R.string.bottomsheet_action_expand_halfway);
                w5.c cVar = new w5.c(this, 6);
                ArrayList d10 = w.d(view);
                int i13 = 0;
                while (true) {
                    if (i13 >= d10.size()) {
                        int i14 = 0;
                        int i15 = -1;
                        while (true) {
                            int[] iArr = w.d;
                            if (i14 >= iArr.length || i15 != -1) {
                                i10 = i15;
                            } else {
                                int i16 = iArr[i14];
                                boolean z11 = true;
                                for (int i17 = 0; i17 < d10.size(); i17++) {
                                    if (((b.a) d10.get(i17)).a() != i16) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    z11 &= z10;
                                }
                                if (z11) {
                                    i15 = i16;
                                }
                                i14++;
                            }
                        }
                        i10 = i15;
                    } else if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((b.a) d10.get(i13)).f6396a).getLabel())) {
                        i10 = ((b.a) d10.get(i13)).a();
                        break;
                    } else {
                        i13++;
                    }
                }
                if (i10 != -1) {
                    b.a aVar3 = new b.a((Object) null, i10, string, cVar, (Class) null);
                    View.AccessibilityDelegate c10 = w.c(view);
                    if (c10 == null) {
                        aVar2 = null;
                    } else if (c10 instanceof a.C0078a) {
                        aVar2 = ((a.C0078a) c10).f5953a;
                    } else {
                        aVar2 = new i0.a(c10);
                    }
                    if (aVar2 == null) {
                        aVar2 = new i0.a();
                    }
                    w.k(view, aVar2);
                    w.h(view, aVar3.a());
                    w.d(view).add(aVar3);
                    w.f(view, 0);
                }
                this.V = i10;
            }
            if (this.C && this.F != 5) {
                z(view, b.a.f6394j, 5);
            }
            int i18 = this.F;
            if (i18 == 3) {
                if (this.f3275b) {
                    i12 = 4;
                }
                aVar = b.a.f6393i;
            } else if (i18 == 4) {
                if (this.f3275b) {
                    i12 = 3;
                }
                aVar = b.a.f6392h;
            } else if (i18 == 6) {
                z(view, b.a.f6393i, 4);
                z(view, b.a.f6392h, 3);
                return;
            } else {
                return;
            }
            z(view, aVar, i12);
        }
    }

    public final void K(int i10) {
        ValueAnimator valueAnimator;
        if (i10 != 2) {
            boolean z10 = i10 == 3;
            if (this.f3291t != z10) {
                this.f3291t = z10;
                if (this.f3281i != null && (valueAnimator = this.f3292v) != null) {
                    if (valueAnimator.isRunning()) {
                        this.f3292v.reverse();
                        return;
                    }
                    float f10 = z10 ? 0.0f : 1.0f;
                    this.f3292v.setFloatValues(new float[]{1.0f - f10, f10});
                    this.f3292v.start();
                }
            }
        }
    }

    public final void L(boolean z10) {
        WeakReference<V> weakReference = this.N;
        if (weakReference != null) {
            ViewParent parent = ((View) weakReference.get()).getParent();
            if (parent instanceof CoordinatorLayout) {
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
                int childCount = coordinatorLayout.getChildCount();
                if (z10) {
                    if (this.U == null) {
                        this.U = new HashMap(childCount);
                    } else {
                        return;
                    }
                }
                for (int i10 = 0; i10 < childCount; i10++) {
                    V childAt = coordinatorLayout.getChildAt(i10);
                    if (childAt != this.N.get() && z10) {
                        this.U.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                    }
                }
                if (!z10) {
                    this.U = null;
                }
            }
        }
    }

    public final void M() {
        View view;
        if (this.N != null) {
            s();
            if (this.F == 4 && (view = (View) this.N.get()) != null) {
                view.requestLayout();
            }
        }
    }

    public final void c(CoordinatorLayout.f fVar) {
        this.N = null;
        this.G = null;
    }

    public final void f() {
        this.N = null;
        this.G = null;
    }

    public final boolean g(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
        o0.c cVar;
        boolean z10;
        View view;
        if (!v10.isShown() || !this.E) {
            this.H = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        View view2 = null;
        if (actionMasked == 0) {
            this.R = -1;
            VelocityTracker velocityTracker = this.Q;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.Q = null;
            }
        }
        if (this.Q == null) {
            this.Q = VelocityTracker.obtain();
        }
        this.Q.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x10 = (int) motionEvent.getX();
            this.S = (int) motionEvent.getY();
            if (this.F != 2) {
                WeakReference<View> weakReference = this.O;
                if (weakReference != null) {
                    view = weakReference.get();
                } else {
                    view = null;
                }
                if (view != null && coordinatorLayout.p(view, x10, this.S)) {
                    this.R = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.T = true;
                }
            }
            if (this.R != -1 || coordinatorLayout.p(v10, x10, this.S)) {
                z10 = false;
            } else {
                z10 = true;
            }
            this.H = z10;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.T = false;
            this.R = -1;
            if (this.H) {
                this.H = false;
                return false;
            }
        }
        if (!this.H && (cVar = this.G) != null && cVar.r(motionEvent)) {
            return true;
        }
        WeakReference<View> weakReference2 = this.O;
        if (weakReference2 != null) {
            view2 = weakReference2.get();
        }
        if (actionMasked != 2 || view2 == null || this.H || this.F == 1 || coordinatorLayout.p(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.G == null || Math.abs(((float) this.S) - motionEvent.getY()) <= ((float) this.G.f7587b)) {
            return false;
        }
        return true;
    }

    public final boolean h(CoordinatorLayout coordinatorLayout, V v10, int i10) {
        int i11;
        boolean z10;
        boolean z11;
        float f10;
        m6.f fVar;
        WeakHashMap<View, b0> weakHashMap = w.f6004a;
        if (w.d.b(coordinatorLayout) && !w.d.b(v10)) {
            v10.setFitsSystemWindows(true);
        }
        if (this.N == null) {
            this.f3278f = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            if (Build.VERSION.SDK_INT < 29 || this.l || this.f3277e) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (this.f3284m || this.f3285n || this.f3286o || z10) {
                w.i.u(v10, new l(new w5.b(this, z10), new n.b(w.e.f(v10), v10.getPaddingTop(), w.e.e(v10), v10.getPaddingBottom())));
                if (w.g.b(v10)) {
                    w.h.c(v10);
                } else {
                    v10.addOnAttachStateChangeListener(new m());
                }
            }
            this.N = new WeakReference<>(v10);
            if (this.f3280h && (fVar = this.f3281i) != null) {
                w.d.q(v10, fVar);
            }
            m6.f fVar2 = this.f3281i;
            if (fVar2 != null) {
                float f11 = this.B;
                if (f11 == -1.0f) {
                    f11 = w.i.i(v10);
                }
                fVar2.i(f11);
                if (this.F == 3) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.f3291t = z11;
                m6.f fVar3 = this.f3281i;
                if (z11) {
                    f10 = 0.0f;
                } else {
                    f10 = 1.0f;
                }
                f.b bVar = fVar3.f7121o;
                if (bVar.f7139j != f10) {
                    bVar.f7139j = f10;
                    fVar3.f7125s = true;
                    fVar3.invalidateSelf();
                }
            }
            J();
            if (w.d.c(v10) == 0) {
                w.d.s(v10, 1);
            }
            int measuredWidth = v10.getMeasuredWidth();
            int i12 = this.f3282j;
            if (measuredWidth > i12 && i12 != -1) {
                ViewGroup.LayoutParams layoutParams = v10.getLayoutParams();
                layoutParams.width = this.f3282j;
                v10.post(new a(v10, layoutParams));
            }
        }
        if (this.G == null) {
            this.G = new o0.c(coordinatorLayout.getContext(), coordinatorLayout, this.W);
        }
        int top = v10.getTop();
        coordinatorLayout.r(v10, i10);
        this.L = coordinatorLayout.getWidth();
        this.M = coordinatorLayout.getHeight();
        int height = v10.getHeight();
        this.K = height;
        int i13 = this.M;
        int i14 = i13 - height;
        int i15 = this.f3289r;
        if (i14 < i15) {
            if (this.f3287p) {
                this.K = i13;
            } else {
                this.K = i13 - i15;
            }
        }
        this.f3293x = Math.max(0, i13 - this.K);
        this.f3294y = (int) ((1.0f - this.z) * ((float) this.M));
        s();
        int i16 = this.F;
        if (i16 == 3) {
            i11 = y();
        } else if (i16 == 6) {
            i11 = this.f3294y;
        } else if (this.C && i16 == 5) {
            i11 = this.M;
        } else if (i16 == 4) {
            i11 = this.A;
        } else {
            if (i16 == 1 || i16 == 2) {
                v10.offsetTopAndBottom(top - v10.getTop());
            }
            this.O = new WeakReference<>(w(v10));
            return true;
        }
        v10.offsetTopAndBottom(i11);
        this.O = new WeakReference<>(w(v10));
        return true;
    }

    public final boolean j(View view) {
        WeakReference<View> weakReference = this.O;
        return (weakReference == null || view != weakReference.get() || this.F == 3) ? false : true;
    }

    public final void k(CoordinatorLayout coordinatorLayout, V v10, View view, int i10, int i11, int[] iArr, int i12) {
        View view2;
        int i13;
        if (i12 != 1) {
            WeakReference<View> weakReference = this.O;
            if (weakReference != null) {
                view2 = weakReference.get();
            } else {
                view2 = null;
            }
            if (view == view2) {
                int top = v10.getTop();
                int i14 = top - i11;
                if (i11 <= 0) {
                    if (i11 < 0 && !view.canScrollVertically(-1)) {
                        int i15 = this.A;
                        if (i14 > i15 && !this.C) {
                            int i16 = top - i15;
                            iArr[1] = i16;
                            int i17 = -i16;
                            WeakHashMap<View, b0> weakHashMap = w.f6004a;
                            v10.offsetTopAndBottom(i17);
                            i13 = 4;
                            E(i13);
                        } else if (this.E) {
                            iArr[1] = i11;
                        } else {
                            return;
                        }
                    }
                    v(v10.getTop());
                    this.I = i11;
                    this.J = true;
                } else if (i14 < y()) {
                    int y10 = top - y();
                    iArr[1] = y10;
                    int i18 = -y10;
                    WeakHashMap<View, b0> weakHashMap2 = w.f6004a;
                    v10.offsetTopAndBottom(i18);
                    i13 = 3;
                    E(i13);
                    v(v10.getTop());
                    this.I = i11;
                    this.J = true;
                } else if (this.E) {
                    iArr[1] = i11;
                } else {
                    return;
                }
                int i19 = -i11;
                WeakHashMap<View, b0> weakHashMap3 = w.f6004a;
                v10.offsetTopAndBottom(i19);
                E(1);
                v(v10.getTop());
                this.I = i11;
                this.J = true;
            }
        }
    }

    public final void l(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int[] iArr) {
    }

    public final void n(View view, Parcelable parcelable) {
        e eVar = (e) parcelable;
        int i10 = this.f3274a;
        if (i10 != 0) {
            if (i10 == -1 || (i10 & 1) == 1) {
                this.d = eVar.f3302r;
            }
            if (i10 == -1 || (i10 & 2) == 2) {
                this.f3275b = eVar.f3303s;
            }
            if (i10 == -1 || (i10 & 4) == 4) {
                this.C = eVar.f3304t;
            }
            if (i10 == -1 || (i10 & 8) == 8) {
                this.D = eVar.u;
            }
        }
        int i11 = eVar.f3301q;
        if (i11 == 1 || i11 == 2) {
            this.F = 4;
        } else {
            this.F = i11;
        }
    }

    public final Parcelable o(View view) {
        return new e(View.BaseSavedState.EMPTY_STATE, this);
    }

    public final boolean p(CoordinatorLayout coordinatorLayout, V v10, View view, View view2, int i10, int i11) {
        this.I = 0;
        this.J = false;
        return (i10 & 2) != 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002f, code lost:
        if (r3 > r6) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0072, code lost:
        if (java.lang.Math.abs(r3 - r2.f3293x) < java.lang.Math.abs(r3 - r2.A)) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0083, code lost:
        if (r3 < java.lang.Math.abs(r3 - r2.A)) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0085, code lost:
        r6 = y();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0097, code lost:
        if (java.lang.Math.abs(r3 - r6) < java.lang.Math.abs(r3 - r2.A)) goto L_0x00b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00b2, code lost:
        if (java.lang.Math.abs(r3 - r2.f3294y) < java.lang.Math.abs(r3 - r2.A)) goto L_0x00b4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void q(androidx.coordinatorlayout.widget.CoordinatorLayout r3, V r4, android.view.View r5, int r6) {
        /*
            r2 = this;
            int r3 = r4.getTop()
            int r6 = r2.y()
            r0 = 3
            if (r3 != r6) goto L_0x000f
            r2.E(r0)
            return
        L_0x000f:
            java.lang.ref.WeakReference<android.view.View> r3 = r2.O
            if (r3 == 0) goto L_0x00c1
            java.lang.Object r3 = r3.get()
            if (r5 != r3) goto L_0x00c1
            boolean r3 = r2.J
            if (r3 != 0) goto L_0x001f
            goto L_0x00c1
        L_0x001f:
            int r3 = r2.I
            r5 = 6
            if (r3 <= 0) goto L_0x0034
            boolean r3 = r2.f3275b
            if (r3 == 0) goto L_0x0029
            goto L_0x0074
        L_0x0029:
            int r3 = r4.getTop()
            int r6 = r2.f3294y
            if (r3 <= r6) goto L_0x0085
        L_0x0031:
            r0 = r5
            goto L_0x00bb
        L_0x0034:
            boolean r3 = r2.C
            if (r3 == 0) goto L_0x0057
            android.view.VelocityTracker r3 = r2.Q
            if (r3 != 0) goto L_0x003e
            r3 = 0
            goto L_0x004d
        L_0x003e:
            r6 = 1000(0x3e8, float:1.401E-42)
            float r1 = r2.f3276c
            r3.computeCurrentVelocity(r6, r1)
            android.view.VelocityTracker r3 = r2.Q
            int r6 = r2.R
            float r3 = r3.getYVelocity(r6)
        L_0x004d:
            boolean r3 = r2.H(r4, r3)
            if (r3 == 0) goto L_0x0057
            int r6 = r2.M
            r0 = 5
            goto L_0x00bb
        L_0x0057:
            int r3 = r2.I
            if (r3 != 0) goto L_0x009a
            int r3 = r4.getTop()
            boolean r6 = r2.f3275b
            if (r6 == 0) goto L_0x0077
            int r5 = r2.f3293x
            int r5 = r3 - r5
            int r5 = java.lang.Math.abs(r5)
            int r6 = r2.A
            int r3 = r3 - r6
            int r3 = java.lang.Math.abs(r3)
            if (r5 >= r3) goto L_0x00b8
        L_0x0074:
            int r6 = r2.f3293x
            goto L_0x00bb
        L_0x0077:
            int r6 = r2.f3294y
            if (r3 >= r6) goto L_0x008a
            int r6 = r2.A
            int r6 = r3 - r6
            int r6 = java.lang.Math.abs(r6)
            if (r3 >= r6) goto L_0x00b4
        L_0x0085:
            int r6 = r2.y()
            goto L_0x00bb
        L_0x008a:
            int r6 = r3 - r6
            int r6 = java.lang.Math.abs(r6)
            int r0 = r2.A
            int r3 = r3 - r0
            int r3 = java.lang.Math.abs(r3)
            if (r6 >= r3) goto L_0x00b8
            goto L_0x00b4
        L_0x009a:
            boolean r3 = r2.f3275b
            if (r3 == 0) goto L_0x009f
            goto L_0x00b8
        L_0x009f:
            int r3 = r4.getTop()
            int r6 = r2.f3294y
            int r6 = r3 - r6
            int r6 = java.lang.Math.abs(r6)
            int r0 = r2.A
            int r3 = r3 - r0
            int r3 = java.lang.Math.abs(r3)
            if (r6 >= r3) goto L_0x00b8
        L_0x00b4:
            int r6 = r2.f3294y
            goto L_0x0031
        L_0x00b8:
            int r6 = r2.A
            r0 = 4
        L_0x00bb:
            r3 = 0
            r2.I(r4, r0, r6, r3)
            r2.J = r3
        L_0x00c1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.q(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }

    public final boolean r(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
        if (!v10.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.F == 1 && actionMasked == 0) {
            return true;
        }
        o0.c cVar = this.G;
        if (cVar != null) {
            cVar.k(motionEvent);
        }
        if (actionMasked == 0) {
            this.R = -1;
            VelocityTracker velocityTracker = this.Q;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.Q = null;
            }
        }
        if (this.Q == null) {
            this.Q = VelocityTracker.obtain();
        }
        this.Q.addMovement(motionEvent);
        if (this.G != null && actionMasked == 2 && !this.H) {
            float abs = Math.abs(((float) this.S) - motionEvent.getY());
            o0.c cVar2 = this.G;
            if (abs > ((float) cVar2.f7587b)) {
                cVar2.b(v10, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.H;
    }

    public final void s() {
        int t10 = t();
        if (this.f3275b) {
            this.A = Math.max(this.M - t10, this.f3293x);
        } else {
            this.A = this.M - t10;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0025, code lost:
        r0 = r3.f3283k;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int t() {
        /*
            r3 = this;
            boolean r0 = r3.f3277e
            if (r0 == 0) goto L_0x001d
            int r0 = r3.f3278f
            int r1 = r3.M
            int r2 = r3.L
            int r2 = r2 * 9
            int r2 = r2 / 16
            int r1 = r1 - r2
            int r0 = java.lang.Math.max(r0, r1)
            int r1 = r3.K
            int r0 = java.lang.Math.min(r0, r1)
            int r1 = r3.f3288q
            int r0 = r0 + r1
            return r0
        L_0x001d:
            boolean r0 = r3.l
            if (r0 != 0) goto L_0x0033
            boolean r0 = r3.f3284m
            if (r0 != 0) goto L_0x0033
            int r0 = r3.f3283k
            if (r0 <= 0) goto L_0x0033
            int r1 = r3.d
            int r2 = r3.f3279g
            int r0 = r0 + r2
            int r0 = java.lang.Math.max(r1, r0)
            return r0
        L_0x0033:
            int r0 = r3.d
            int r1 = r3.f3288q
            int r0 = r0 + r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.t():int");
    }

    public final void u(Context context, AttributeSet attributeSet, boolean z10, ColorStateList colorStateList) {
        if (this.f3280h) {
            m6.a aVar = new m6.a((float) 0);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u.J, R.attr.bottomSheetStyle, R.style.Widget_Design_BottomSheet_Modal);
            int resourceId = obtainStyledAttributes.getResourceId(0, 0);
            int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
            obtainStyledAttributes.recycle();
            this.f3290s = new i(i.a(context, resourceId, resourceId2, aVar));
            m6.f fVar = new m6.f(this.f3290s);
            this.f3281i = fVar;
            fVar.h(context);
            if (!z10 || colorStateList == null) {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(16842801, typedValue, true);
                this.f3281i.setTint(typedValue.data);
                return;
            }
            this.f3281i.j(colorStateList);
        }
    }

    public final void v(int i10) {
        View view = (View) this.N.get();
        if (view != null) {
            ArrayList<d> arrayList = this.P;
            if (!arrayList.isEmpty()) {
                int i11 = this.A;
                if (i10 <= i11 && i11 != y()) {
                    y();
                }
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    arrayList.get(i12).a(view);
                }
            }
        }
    }

    public final int y() {
        if (this.f3275b) {
            return this.f3293x;
        }
        return Math.max(this.w, this.f3287p ? 0 : this.f3289r);
    }

    public final void z(V v10, b.a aVar, int i10) {
        w.i(v10, aVar, new w5.c(this, i10));
    }
}
