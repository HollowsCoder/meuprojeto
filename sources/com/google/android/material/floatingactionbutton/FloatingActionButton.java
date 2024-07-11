package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.appcompat.widget.k;
import androidx.appcompat.widget.p;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.floatingactionbutton.d;
import com.karumi.dexter.R;
import g6.d;
import h6.o;
import i0.b0;
import i0.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import m6.f;
import m6.i;
import m6.m;
import p9.u;
import s5.g;
import v5.b;
import v5.e;

public class FloatingActionButton extends o implements f6.a, m, CoordinatorLayout.b {
    public final Rect A = new Rect();
    public final p B;
    public final f6.b C;
    public d D;

    /* renamed from: p  reason: collision with root package name */
    public ColorStateList f3475p;

    /* renamed from: q  reason: collision with root package name */
    public PorterDuff.Mode f3476q;

    /* renamed from: r  reason: collision with root package name */
    public ColorStateList f3477r;

    /* renamed from: s  reason: collision with root package name */
    public PorterDuff.Mode f3478s;

    /* renamed from: t  reason: collision with root package name */
    public ColorStateList f3479t;
    public int u;

    /* renamed from: v  reason: collision with root package name */
    public int f3480v;
    public int w;

    /* renamed from: x  reason: collision with root package name */
    public final int f3481x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f3482y;
    public final Rect z = new Rect();

    public static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.c<T> {

        /* renamed from: a  reason: collision with root package name */
        public Rect f3483a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f3484b;

        public BaseBehavior() {
            this.f3484b = true;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u.f8119y);
            this.f3484b = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        }

        public final boolean a(View view, Rect rect) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            int left = floatingActionButton.getLeft();
            Rect rect2 = floatingActionButton.z;
            rect.set(left + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        public final void c(CoordinatorLayout.f fVar) {
            if (fVar.f948h == 0) {
                fVar.f948h = 80;
            }
        }

        public final boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
            boolean z;
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                t(coordinatorLayout, (AppBarLayout) view2, floatingActionButton);
            } else {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof CoordinatorLayout.f) {
                    z = ((CoordinatorLayout.f) layoutParams).f942a instanceof BottomSheetBehavior;
                } else {
                    z = false;
                }
                if (z) {
                    u(view2, floatingActionButton);
                }
            }
            return false;
        }

        public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i10) {
            int i11;
            boolean z;
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            ArrayList f10 = coordinatorLayout.f(floatingActionButton);
            int size = f10.size();
            int i12 = 0;
            for (int i13 = 0; i13 < size; i13++) {
                View view2 = (View) f10.get(i13);
                if (!(view2 instanceof AppBarLayout)) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if (layoutParams instanceof CoordinatorLayout.f) {
                        z = ((CoordinatorLayout.f) layoutParams).f942a instanceof BottomSheetBehavior;
                    } else {
                        z = false;
                    }
                    if (z && u(view2, floatingActionButton)) {
                        break;
                    }
                } else if (t(coordinatorLayout, (AppBarLayout) view2, floatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.r(floatingActionButton, i10);
            Rect rect = floatingActionButton.z;
            if (rect == null || rect.centerX() <= 0 || rect.centerY() <= 0) {
                return true;
            }
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) floatingActionButton.getLayoutParams();
            if (floatingActionButton.getRight() >= coordinatorLayout.getWidth() - fVar.rightMargin) {
                i11 = rect.right;
            } else if (floatingActionButton.getLeft() <= fVar.leftMargin) {
                i11 = -rect.left;
            } else {
                i11 = 0;
            }
            if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - fVar.bottomMargin) {
                i12 = rect.bottom;
            } else if (floatingActionButton.getTop() <= fVar.topMargin) {
                i12 = -rect.top;
            }
            if (i12 != 0) {
                WeakHashMap<View, b0> weakHashMap = w.f6004a;
                floatingActionButton.offsetTopAndBottom(i12);
            }
            if (i11 == 0) {
                return true;
            }
            WeakHashMap<View, b0> weakHashMap2 = w.f6004a;
            floatingActionButton.offsetLeftAndRight(i11);
            return true;
        }

        public final boolean s(View view, FloatingActionButton floatingActionButton) {
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) floatingActionButton.getLayoutParams();
            if (this.f3484b && fVar.f946f == view.getId() && floatingActionButton.getUserSetVisibility() == 0) {
                return true;
            }
            return false;
        }

        public final boolean t(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (!s(appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.f3483a == null) {
                this.f3483a = new Rect();
            }
            Rect rect = this.f3483a;
            h6.d.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.h((v5.b) null, false);
                return true;
            }
            floatingActionButton.n((b.a) null, false);
            return true;
        }

        public final boolean u(View view, FloatingActionButton floatingActionButton) {
            if (!s(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((CoordinatorLayout.f) floatingActionButton.getLayoutParams()).topMargin) {
                floatingActionButton.h((v5.b) null, false);
                return true;
            }
            floatingActionButton.n((b.a) null, false);
            return true;
        }
    }

    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static abstract class a {
        public void a(FloatingActionButton floatingActionButton) {
        }

        public void b() {
        }
    }

    public class b implements l6.b {
        public b() {
        }

        public final void a(Drawable drawable) {
            if (drawable != null) {
                FloatingActionButton.super.setBackgroundDrawable(drawable);
            }
        }
    }

    public class c<T extends FloatingActionButton> implements d.e {
        public c(FloatingActionButton floatingActionButton) {
        }

        public final void a() {
            throw null;
        }

        public final void b() {
            throw null;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            ((c) obj).getClass();
            throw null;
        }

        public final int hashCode() {
            throw null;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public FloatingActionButton(android.content.Context r19, android.util.AttributeSet r20) {
        /*
            r18 = this;
            r0 = r18
            r7 = r20
            r8 = 2130968999(0x7f0401a7, float:1.7546667E38)
            r9 = 2131952230(0x7f130266, float:1.9540897E38)
            r1 = r19
            android.content.Context r1 = q6.a.a(r1, r7, r8, r9)
            r0.<init>(r1, r7, r8)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.z = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.A = r1
            android.content.Context r10 = r18.getContext()
            int[] r3 = p9.u.f8118x
            r5 = 2131952230(0x7f130266, float:1.9540897E38)
            r11 = 0
            int[] r6 = new int[r11]
            r4 = 2130968999(0x7f0401a7, float:1.7546667E38)
            r1 = r10
            r2 = r20
            android.content.res.TypedArray r1 = h6.k.d(r1, r2, r3, r4, r5, r6)
            r2 = 1
            android.content.res.ColorStateList r3 = j6.c.a(r10, r1, r2)
            r0.f3475p = r3
            r3 = 2
            r4 = -1
            int r3 = r1.getInt(r3, r4)
            r5 = 0
            android.graphics.PorterDuff$Mode r3 = h6.n.b(r3, r5)
            r0.f3476q = r3
            r3 = 12
            android.content.res.ColorStateList r3 = j6.c.a(r10, r1, r3)
            r0.f3479t = r3
            r3 = 7
            int r3 = r1.getInt(r3, r4)
            r0.u = r3
            r3 = 6
            int r3 = r1.getDimensionPixelSize(r3, r11)
            r0.f3480v = r3
            r3 = 3
            int r3 = r1.getDimensionPixelSize(r3, r11)
            r4 = 4
            r5 = 0
            float r4 = r1.getDimension(r4, r5)
            r6 = 9
            float r6 = r1.getDimension(r6, r5)
            r12 = 11
            float r5 = r1.getDimension(r12, r5)
            r12 = 16
            boolean r12 = r1.getBoolean(r12, r11)
            r0.f3482y = r12
            android.content.res.Resources r12 = r18.getResources()
            r13 = 2131165507(0x7f070143, float:1.7945233E38)
            int r12 = r12.getDimensionPixelSize(r13)
            r13 = 10
            int r13 = r1.getDimensionPixelSize(r13, r11)
            r0.f3481x = r13
            r14 = 15
            s5.g r14 = s5.g.a(r10, r1, r14)
            r15 = 8
            s5.g r15 = s5.g.a(r10, r1, r15)
            m6.g r2 = m6.i.f7150m
            r16 = r15
            int[] r15 = p9.u.J
            android.content.res.TypedArray r9 = r10.obtainStyledAttributes(r7, r15, r8, r9)
            int r15 = r9.getResourceId(r11, r11)
            r17 = r14
            r8 = 1
            int r14 = r9.getResourceId(r8, r11)
            r9.recycle()
            m6.i$a r2 = m6.i.a(r10, r15, r14, r2)
            m6.i r8 = new m6.i
            r8.<init>(r2)
            r2 = 5
            boolean r2 = r1.getBoolean(r2, r11)
            r9 = 1
            boolean r9 = r1.getBoolean(r11, r9)
            r0.setEnabled(r9)
            r1.recycle()
            androidx.appcompat.widget.p r1 = new androidx.appcompat.widget.p
            r1.<init>(r0)
            r0.B = r1
            r9 = 2130968999(0x7f0401a7, float:1.7546667E38)
            r1.b(r7, r9)
            f6.b r1 = new f6.b
            r1.<init>(r0)
            r0.C = r1
            com.google.android.material.floatingactionbutton.d r1 = r18.getImpl()
            r1.m(r8)
            com.google.android.material.floatingactionbutton.d r1 = r18.getImpl()
            android.content.res.ColorStateList r7 = r0.f3475p
            android.graphics.PorterDuff$Mode r8 = r0.f3476q
            android.content.res.ColorStateList r9 = r0.f3479t
            r1.f(r7, r8, r9, r3)
            com.google.android.material.floatingactionbutton.d r1 = r18.getImpl()
            r1.f3503k = r12
            com.google.android.material.floatingactionbutton.d r1 = r18.getImpl()
            float r3 = r1.f3500h
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 == 0) goto L_0x0111
            r1.f3500h = r4
            float r3 = r1.f3501i
            float r7 = r1.f3502j
            r1.j(r4, r3, r7)
        L_0x0111:
            com.google.android.material.floatingactionbutton.d r1 = r18.getImpl()
            float r3 = r1.f3501i
            int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r3 == 0) goto L_0x0124
            r1.f3501i = r6
            float r3 = r1.f3500h
            float r4 = r1.f3502j
            r1.j(r3, r6, r4)
        L_0x0124:
            com.google.android.material.floatingactionbutton.d r1 = r18.getImpl()
            float r3 = r1.f3502j
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L_0x0137
            r1.f3502j = r5
            float r3 = r1.f3500h
            float r4 = r1.f3501i
            r1.j(r3, r4, r5)
        L_0x0137:
            com.google.android.material.floatingactionbutton.d r1 = r18.getImpl()
            int r3 = r1.f3510s
            if (r3 == r13) goto L_0x014f
            r1.f3510s = r13
            float r3 = r1.f3509r
            r1.f3509r = r3
            android.graphics.Matrix r4 = r1.C
            r1.a(r3, r4)
            com.google.android.material.floatingactionbutton.FloatingActionButton r1 = r1.f3513x
            r1.setImageMatrix(r4)
        L_0x014f:
            com.google.android.material.floatingactionbutton.d r1 = r18.getImpl()
            r3 = r17
            r1.f3506o = r3
            com.google.android.material.floatingactionbutton.d r1 = r18.getImpl()
            r3 = r16
            r1.f3507p = r3
            com.google.android.material.floatingactionbutton.d r1 = r18.getImpl()
            r1.f3498f = r2
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.MATRIX
            r0.setScaleType(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.floatingactionbutton.FloatingActionButton.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private d getImpl() {
        if (this.D == null) {
            this.D = new g6.d(this, new b());
        }
        return this.D;
    }

    public static int m(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        if (mode == Integer.MIN_VALUE) {
            return Math.min(i10, size);
        }
        if (mode == 0) {
            return i10;
        }
        if (mode == 1073741824) {
            return size;
        }
        throw new IllegalArgumentException();
    }

    public final boolean a() {
        return this.C.f4632b;
    }

    public final void d() {
        d impl = getImpl();
        if (impl.f3512v == null) {
            impl.f3512v = new ArrayList<>();
        }
        impl.f3512v.add((Object) null);
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().i(getDrawableState());
    }

    public final void e(e eVar) {
        d impl = getImpl();
        if (impl.u == null) {
            impl.u = new ArrayList<>();
        }
        impl.u.add(eVar);
    }

    public final void f() {
        d impl = getImpl();
        c cVar = new c(this);
        if (impl.w == null) {
            impl.w = new ArrayList<>();
        }
        impl.w.add(cVar);
    }

    public final int g(int i10) {
        int i11 = this.f3480v;
        if (i11 != 0) {
            return i11;
        }
        Resources resources = getResources();
        if (i10 == -1) {
            return Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? g(1) : g(0);
        }
        return resources.getDimensionPixelSize(i10 != 1 ? R.dimen.design_fab_size_normal : R.dimen.design_fab_size_mini);
    }

    public ColorStateList getBackgroundTintList() {
        return this.f3475p;
    }

    public PorterDuff.Mode getBackgroundTintMode() {
        return this.f3476q;
    }

    public CoordinatorLayout.c<FloatingActionButton> getBehavior() {
        return new Behavior();
    }

    public float getCompatElevation() {
        return getImpl().d();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().f3501i;
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().f3502j;
    }

    public Drawable getContentBackground() {
        return getImpl().f3497e;
    }

    public int getCustomSize() {
        return this.f3480v;
    }

    public int getExpandedComponentIdHint() {
        return this.C.f4633c;
    }

    public g getHideMotionSpec() {
        return getImpl().f3507p;
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.f3479t;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.f3479t;
    }

    public i getShapeAppearanceModel() {
        i iVar = getImpl().f3494a;
        iVar.getClass();
        return iVar;
    }

    public g getShowMotionSpec() {
        return getImpl().f3506o;
    }

    public int getSize() {
        return this.u;
    }

    public int getSizeDimension() {
        return g(this.u);
    }

    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    public ColorStateList getSupportImageTintList() {
        return this.f3477r;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        return this.f3478s;
    }

    public boolean getUseCompatPadding() {
        return this.f3482y;
    }

    public final void h(v5.b bVar, boolean z10) {
        a aVar;
        boolean z11;
        int i10;
        d impl = getImpl();
        if (bVar == null) {
            aVar = null;
        } else {
            aVar = new a(this, bVar);
        }
        boolean z12 = true;
        if (impl.f3513x.getVisibility() != 0 ? impl.f3511t == 2 : impl.f3511t != 1) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (!z11) {
            Animator animator = impl.f3505n;
            if (animator != null) {
                animator.cancel();
            }
            WeakHashMap<View, b0> weakHashMap = w.f6004a;
            FloatingActionButton floatingActionButton = impl.f3513x;
            if (!w.g.c(floatingActionButton) || floatingActionButton.isInEditMode()) {
                z12 = false;
            }
            if (z12) {
                g gVar = impl.f3507p;
                if (gVar == null) {
                    if (impl.f3504m == null) {
                        impl.f3504m = g.b(floatingActionButton.getContext(), R.animator.design_fab_hide_motion_spec);
                    }
                    gVar = impl.f3504m;
                    gVar.getClass();
                }
                AnimatorSet b10 = impl.b(gVar, 0.0f, 0.0f, 0.0f);
                b10.addListener(new b(impl, z10, aVar));
                ArrayList<Animator.AnimatorListener> arrayList = impl.f3512v;
                if (arrayList != null) {
                    Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                    while (it.hasNext()) {
                        b10.addListener(it.next());
                    }
                }
                b10.start();
                return;
            }
            if (z10) {
                i10 = 8;
            } else {
                i10 = 4;
            }
            floatingActionButton.b(i10, z10);
            if (aVar != null) {
                aVar.f3486a.a(aVar.f3487b);
            }
        }
    }

    public final boolean i() {
        d impl = getImpl();
        int visibility = impl.f3513x.getVisibility();
        int i10 = impl.f3511t;
        if (visibility == 0) {
            if (i10 != 1) {
                return false;
            }
        } else if (i10 == 2) {
            return false;
        }
        return true;
    }

    public final boolean j() {
        d impl = getImpl();
        int visibility = impl.f3513x.getVisibility();
        int i10 = impl.f3511t;
        if (visibility != 0) {
            if (i10 != 2) {
                return false;
            }
        } else if (i10 == 1) {
            return false;
        }
        return true;
    }

    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().g();
    }

    public final void k(Rect rect) {
        int i10 = rect.left;
        Rect rect2 = this.z;
        rect.left = i10 + rect2.left;
        rect.top += rect2.top;
        rect.right -= rect2.right;
        rect.bottom -= rect2.bottom;
    }

    public final void l() {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            ColorStateList colorStateList = this.f3477r;
            if (colorStateList == null) {
                drawable.clearColorFilter();
                return;
            }
            int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
            PorterDuff.Mode mode = this.f3478s;
            if (mode == null) {
                mode = PorterDuff.Mode.SRC_IN;
            }
            drawable.mutate().setColorFilter(k.c(colorForState, mode));
        }
    }

    public final void n(b.a aVar, boolean z10) {
        a aVar2;
        boolean z11;
        d impl = getImpl();
        if (aVar == null) {
            aVar2 = null;
        } else {
            aVar2 = new a(this, aVar);
        }
        boolean z12 = true;
        if (impl.f3513x.getVisibility() == 0 ? impl.f3511t == 1 : impl.f3511t != 2) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (!z11) {
            Animator animator = impl.f3505n;
            if (animator != null) {
                animator.cancel();
            }
            WeakHashMap<View, b0> weakHashMap = w.f6004a;
            FloatingActionButton floatingActionButton = impl.f3513x;
            if (!w.g.c(floatingActionButton) || floatingActionButton.isInEditMode()) {
                z12 = false;
            }
            Matrix matrix = impl.C;
            if (z12) {
                if (floatingActionButton.getVisibility() != 0) {
                    floatingActionButton.setAlpha(0.0f);
                    floatingActionButton.setScaleY(0.0f);
                    floatingActionButton.setScaleX(0.0f);
                    impl.f3509r = 0.0f;
                    impl.a(0.0f, matrix);
                    floatingActionButton.setImageMatrix(matrix);
                }
                g gVar = impl.f3506o;
                if (gVar == null) {
                    if (impl.l == null) {
                        impl.l = g.b(floatingActionButton.getContext(), R.animator.design_fab_show_motion_spec);
                    }
                    gVar = impl.l;
                    gVar.getClass();
                }
                AnimatorSet b10 = impl.b(gVar, 1.0f, 1.0f, 1.0f);
                b10.addListener(new c(impl, z10, aVar2));
                ArrayList<Animator.AnimatorListener> arrayList = impl.u;
                if (arrayList != null) {
                    Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                    while (it.hasNext()) {
                        b10.addListener(it.next());
                    }
                }
                b10.start();
                return;
            }
            floatingActionButton.b(0, z10);
            floatingActionButton.setAlpha(1.0f);
            floatingActionButton.setScaleY(1.0f);
            floatingActionButton.setScaleX(1.0f);
            impl.f3509r = 1.0f;
            impl.a(1.0f, matrix);
            floatingActionButton.setImageMatrix(matrix);
            if (aVar2 != null) {
                aVar2.f3486a.b();
            }
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d impl = getImpl();
        f fVar = impl.f3495b;
        FloatingActionButton floatingActionButton = impl.f3513x;
        if (fVar != null) {
            n.e.E(floatingActionButton, fVar);
        }
        if (!(impl instanceof g6.d)) {
            ViewTreeObserver viewTreeObserver = floatingActionButton.getViewTreeObserver();
            if (impl.D == null) {
                impl.D = new g6.c(impl);
            }
            viewTreeObserver.addOnPreDrawListener(impl.D);
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d impl = getImpl();
        ViewTreeObserver viewTreeObserver = impl.f3513x.getViewTreeObserver();
        g6.c cVar = impl.D;
        if (cVar != null) {
            viewTreeObserver.removeOnPreDrawListener(cVar);
            impl.D = null;
        }
    }

    public final void onMeasure(int i10, int i11) {
        int sizeDimension = getSizeDimension();
        this.w = (sizeDimension - this.f3481x) / 2;
        getImpl().p();
        int min = Math.min(m(sizeDimension, i10), m(sizeDimension, i11));
        Rect rect = this.z;
        setMeasuredDimension(rect.left + min + rect.right, min + rect.top + rect.bottom);
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof o6.a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        o6.a aVar = (o6.a) parcelable;
        super.onRestoreInstanceState(aVar.f7340o);
        Bundle orDefault = aVar.f7747q.getOrDefault("expandableWidgetHelper", null);
        orDefault.getClass();
        Bundle bundle = orDefault;
        f6.b bVar = this.C;
        bVar.getClass();
        bVar.f4632b = bundle.getBoolean("expanded", false);
        bVar.f4633c = bundle.getInt("expandedComponentIdHint", 0);
        if (bVar.f4632b) {
            View view = bVar.f4631a;
            ViewParent parent = view.getParent();
            if (parent instanceof CoordinatorLayout) {
                ((CoordinatorLayout) parent).d(view);
            }
        }
    }

    public final Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState == null) {
            onSaveInstanceState = new Bundle();
        }
        o6.a aVar = new o6.a(onSaveInstanceState);
        n.i<String, Bundle> iVar = aVar.f7747q;
        f6.b bVar = this.C;
        bVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", bVar.f4632b);
        bundle.putInt("expandedComponentIdHint", bVar.f4633c);
        iVar.put("expandableWidgetHelper", bundle);
        return aVar;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        if (motionEvent.getAction() == 0) {
            WeakHashMap<View, b0> weakHashMap = w.f6004a;
            boolean c10 = w.g.c(this);
            Rect rect = this.A;
            if (c10) {
                rect.set(0, 0, getWidth(), getHeight());
                k(rect);
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && !rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBackgroundColor(int i10) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundResource(int i10) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.f3475p != colorStateList) {
            this.f3475p = colorStateList;
            d impl = getImpl();
            f fVar = impl.f3495b;
            if (fVar != null) {
                fVar.setTintList(colorStateList);
            }
            g6.a aVar = impl.d;
            if (aVar != null) {
                if (colorStateList != null) {
                    aVar.f4985m = colorStateList.getColorForState(aVar.getState(), aVar.f4985m);
                }
                aVar.f4988p = colorStateList;
                aVar.f4986n = true;
                aVar.invalidateSelf();
            }
        }
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f3476q != mode) {
            this.f3476q = mode;
            f fVar = getImpl().f3495b;
            if (fVar != null) {
                fVar.setTintMode(mode);
            }
        }
    }

    public void setCompatElevation(float f10) {
        d impl = getImpl();
        if (impl.f3500h != f10) {
            impl.f3500h = f10;
            impl.j(f10, impl.f3501i, impl.f3502j);
        }
    }

    public void setCompatElevationResource(int i10) {
        setCompatElevation(getResources().getDimension(i10));
    }

    public void setCompatHoveredFocusedTranslationZ(float f10) {
        d impl = getImpl();
        if (impl.f3501i != f10) {
            impl.f3501i = f10;
            impl.j(impl.f3500h, f10, impl.f3502j);
        }
    }

    public void setCompatHoveredFocusedTranslationZResource(int i10) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i10));
    }

    public void setCompatPressedTranslationZ(float f10) {
        d impl = getImpl();
        if (impl.f3502j != f10) {
            impl.f3502j = f10;
            impl.j(impl.f3500h, impl.f3501i, f10);
        }
    }

    public void setCompatPressedTranslationZResource(int i10) {
        setCompatPressedTranslationZ(getResources().getDimension(i10));
    }

    public void setCustomSize(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("Custom size must be non-negative");
        } else if (i10 != this.f3480v) {
            this.f3480v = i10;
            requestLayout();
        }
    }

    public void setElevation(float f10) {
        super.setElevation(f10);
        f fVar = getImpl().f3495b;
        if (fVar != null) {
            fVar.i(f10);
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z10) {
        if (z10 != getImpl().f3498f) {
            getImpl().f3498f = z10;
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(int i10) {
        this.C.f4633c = i10;
    }

    public void setHideMotionSpec(g gVar) {
        getImpl().f3507p = gVar;
    }

    public void setHideMotionSpecResource(int i10) {
        setHideMotionSpec(g.b(getContext(), i10));
    }

    public void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            d impl = getImpl();
            float f10 = impl.f3509r;
            impl.f3509r = f10;
            Matrix matrix = impl.C;
            impl.a(f10, matrix);
            impl.f3513x.setImageMatrix(matrix);
            if (this.f3477r != null) {
                l();
            }
        }
    }

    public void setImageResource(int i10) {
        this.B.c(i10);
        l();
    }

    public void setRippleColor(int i10) {
        setRippleColor(ColorStateList.valueOf(i10));
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.f3479t != colorStateList) {
            this.f3479t = colorStateList;
            getImpl().l(this.f3479t);
        }
    }

    public void setScaleX(float f10) {
        super.setScaleX(f10);
        ArrayList<d.e> arrayList = getImpl().w;
        if (arrayList != null) {
            Iterator<d.e> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
        }
    }

    public void setScaleY(float f10) {
        super.setScaleY(f10);
        ArrayList<d.e> arrayList = getImpl().w;
        if (arrayList != null) {
            Iterator<d.e> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
        }
    }

    public void setShadowPaddingEnabled(boolean z10) {
        d impl = getImpl();
        impl.f3499g = z10;
        impl.p();
    }

    public void setShapeAppearanceModel(i iVar) {
        getImpl().m(iVar);
    }

    public void setShowMotionSpec(g gVar) {
        getImpl().f3506o = gVar;
    }

    public void setShowMotionSpecResource(int i10) {
        setShowMotionSpec(g.b(getContext(), i10));
    }

    public void setSize(int i10) {
        this.f3480v = 0;
        if (i10 != this.u) {
            this.u = i10;
            requestLayout();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.f3477r != colorStateList) {
            this.f3477r = colorStateList;
            l();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.f3478s != mode) {
            this.f3478s = mode;
            l();
        }
    }

    public void setTranslationX(float f10) {
        super.setTranslationX(f10);
        getImpl().k();
    }

    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        getImpl().k();
    }

    public void setTranslationZ(float f10) {
        super.setTranslationZ(f10);
        getImpl().k();
    }

    public void setUseCompatPadding(boolean z10) {
        if (this.f3482y != z10) {
            this.f3482y = z10;
            getImpl().h();
        }
    }

    public void setVisibility(int i10) {
        super.setVisibility(i10);
    }
}
