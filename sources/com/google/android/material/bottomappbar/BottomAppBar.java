package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.karumi.dexter.R;
import h6.n;
import i0.b0;
import i0.w;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import v5.e;
import v5.f;

public final class BottomAppBar extends Toolbar implements CoordinatorLayout.b {

    /* renamed from: n0  reason: collision with root package name */
    public static final /* synthetic */ int f3254n0 = 0;

    /* renamed from: f0  reason: collision with root package name */
    public Animator f3255f0;

    /* renamed from: g0  reason: collision with root package name */
    public Animator f3256g0;

    /* renamed from: h0  reason: collision with root package name */
    public int f3257h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f3258i0;

    /* renamed from: j0  reason: collision with root package name */
    public boolean f3259j0;

    /* renamed from: k0  reason: collision with root package name */
    public int f3260k0;

    /* renamed from: l0  reason: collision with root package name */
    public boolean f3261l0;

    /* renamed from: m0  reason: collision with root package name */
    public Behavior f3262m0;

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {

        /* renamed from: e  reason: collision with root package name */
        public final Rect f3263e = new Rect();

        /* renamed from: f  reason: collision with root package name */
        public WeakReference<BottomAppBar> f3264f;

        /* renamed from: g  reason: collision with root package name */
        public int f3265g;

        /* renamed from: h  reason: collision with root package name */
        public final a f3266h = new a();

        public class a implements View.OnLayoutChangeListener {
            public a() {
            }

            public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                Behavior behavior = Behavior.this;
                BottomAppBar bottomAppBar = behavior.f3264f.get();
                if (bottomAppBar == null || !(view instanceof FloatingActionButton)) {
                    view.removeOnLayoutChangeListener(this);
                    return;
                }
                FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                int measuredWidth = floatingActionButton.getMeasuredWidth();
                int measuredHeight = floatingActionButton.getMeasuredHeight();
                Rect rect = behavior.f3263e;
                rect.set(0, 0, measuredWidth, measuredHeight);
                floatingActionButton.k(rect);
                int height = rect.height();
                bottomAppBar.z(height);
                bottomAppBar.setFabCornerSize(floatingActionButton.getShapeAppearanceModel().f7154e.a(new RectF(rect)));
                CoordinatorLayout.f fVar = (CoordinatorLayout.f) view.getLayoutParams();
                if (behavior.f3265g == 0) {
                    fVar.bottomMargin = bottomAppBar.getBottomInset() + (bottomAppBar.getResources().getDimensionPixelOffset(R.dimen.mtrl_bottomappbar_fab_bottom_margin) - ((floatingActionButton.getMeasuredHeight() - height) / 2));
                    fVar.leftMargin = bottomAppBar.getLeftInset();
                    fVar.rightMargin = bottomAppBar.getRightInset();
                    if (n.a(floatingActionButton)) {
                        fVar.leftMargin += 0;
                    } else {
                        fVar.rightMargin += 0;
                    }
                }
            }
        }

        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i10) {
            BottomAppBar bottomAppBar = (BottomAppBar) view;
            this.f3264f = new WeakReference<>(bottomAppBar);
            int i11 = BottomAppBar.f3254n0;
            View v10 = bottomAppBar.v();
            if (v10 != null) {
                WeakHashMap<View, b0> weakHashMap = w.f6004a;
                if (!w.g.c(v10)) {
                    CoordinatorLayout.f fVar = (CoordinatorLayout.f) v10.getLayoutParams();
                    fVar.d = 49;
                    this.f3265g = fVar.bottomMargin;
                    if (v10 instanceof FloatingActionButton) {
                        FloatingActionButton floatingActionButton = (FloatingActionButton) v10;
                        floatingActionButton.addOnLayoutChangeListener(this.f3266h);
                        floatingActionButton.d();
                        floatingActionButton.e(new e(bottomAppBar));
                        floatingActionButton.f();
                    }
                    bottomAppBar.y();
                    throw null;
                }
            }
            coordinatorLayout.r(bottomAppBar, i10);
            super.h(coordinatorLayout, bottomAppBar, i10);
            return false;
        }

        public final boolean p(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i10, int i11) {
            BottomAppBar bottomAppBar = (BottomAppBar) view;
            if (!bottomAppBar.getHideOnScroll() || !super.p(coordinatorLayout, bottomAppBar, view2, view3, i10, i11)) {
                return false;
            }
            return true;
        }
    }

    public class a implements Runnable {

        /* renamed from: o  reason: collision with root package name */
        public final /* synthetic */ ActionMenuView f3268o;

        /* renamed from: p  reason: collision with root package name */
        public final /* synthetic */ int f3269p;

        /* renamed from: q  reason: collision with root package name */
        public final /* synthetic */ boolean f3270q;

        public a(ActionMenuView actionMenuView, int i10, boolean z) {
            this.f3268o = actionMenuView;
            this.f3269p = i10;
            this.f3270q = z;
        }

        public final void run() {
            int i10 = this.f3269p;
            boolean z = this.f3270q;
            BottomAppBar bottomAppBar = BottomAppBar.this;
            ActionMenuView actionMenuView = this.f3268o;
            actionMenuView.setTranslationX((float) bottomAppBar.w(actionMenuView, i10, z));
        }
    }

    public static class b extends n0.a {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: q  reason: collision with root package name */
        public int f3272q;

        /* renamed from: r  reason: collision with root package name */
        public boolean f3273r;

        public static class a implements Parcelable.ClassLoaderCreator<b> {
            public final Object createFromParcel(Parcel parcel) {
                return new b(parcel, (ClassLoader) null);
            }

            public final Object[] newArray(int i10) {
                return new b[i10];
            }

            public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new b(parcel, classLoader);
            }
        }

        public b(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f3272q = parcel.readInt();
            this.f3273r = parcel.readInt() != 0;
        }

        public b(Toolbar.g gVar) {
            super(gVar);
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f7340o, i10);
            parcel.writeInt(this.f3272q);
            parcel.writeInt(this.f3273r ? 1 : 0);
        }
    }

    private ActionMenuView getActionMenuView() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    /* access modifiers changed from: private */
    public int getBottomInset() {
        return 0;
    }

    private float getFabTranslationX() {
        return x(this.f3257h0);
    }

    private float getFabTranslationY() {
        return -getTopEdgeTreatment().f9142r;
    }

    /* access modifiers changed from: private */
    public int getLeftInset() {
        return 0;
    }

    /* access modifiers changed from: private */
    public int getRightInset() {
        return 0;
    }

    private f getTopEdgeTreatment() {
        throw null;
    }

    public final void A(ActionMenuView actionMenuView, int i10, boolean z, boolean z10) {
        a aVar = new a(actionMenuView, i10, z);
        if (z10) {
            actionMenuView.post(aVar);
        } else {
            aVar.run();
        }
    }

    public ColorStateList getBackgroundTint() {
        throw null;
    }

    public Behavior getBehavior() {
        if (this.f3262m0 == null) {
            this.f3262m0 = new Behavior();
        }
        return this.f3262m0;
    }

    public float getCradleVerticalOffset() {
        return getTopEdgeTreatment().f9142r;
    }

    public int getFabAlignmentMode() {
        return this.f3257h0;
    }

    public int getFabAnimationMode() {
        return this.f3258i0;
    }

    public float getFabCradleMargin() {
        return getTopEdgeTreatment().f9140p;
    }

    public float getFabCradleRoundedCornerRadius() {
        return getTopEdgeTreatment().f9139o;
    }

    public boolean getHideOnScroll() {
        return this.f3259j0;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        n.e.E(this, (m6.f) null);
        throw null;
    }

    /* JADX WARNING: type inference failed for: r3v3, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
        /*
            r0 = this;
            super.onLayout(r1, r2, r3, r4, r5)
            r2 = 0
            if (r1 == 0) goto L_0x0018
            android.animation.Animator r1 = r0.f3256g0
            if (r1 == 0) goto L_0x000d
            r1.cancel()
        L_0x000d:
            android.animation.Animator r1 = r0.f3255f0
            if (r1 == 0) goto L_0x0014
            r1.cancel()
        L_0x0014:
            r0.y()
            throw r2
        L_0x0018:
            androidx.appcompat.widget.ActionMenuView r1 = r0.getActionMenuView()
            if (r1 == 0) goto L_0x004b
            android.animation.Animator r3 = r0.f3256g0
            if (r3 != 0) goto L_0x004b
            r3 = 1065353216(0x3f800000, float:1.0)
            r1.setAlpha(r3)
            android.view.View r3 = r0.v()
            boolean r4 = r3 instanceof com.google.android.material.floatingactionbutton.FloatingActionButton
            if (r4 == 0) goto L_0x0032
            r2 = r3
            com.google.android.material.floatingactionbutton.FloatingActionButton r2 = (com.google.android.material.floatingactionbutton.FloatingActionButton) r2
        L_0x0032:
            r3 = 0
            if (r2 == 0) goto L_0x003d
            boolean r2 = r2.j()
            if (r2 == 0) goto L_0x003d
            r2 = 1
            goto L_0x003e
        L_0x003d:
            r2 = r3
        L_0x003e:
            if (r2 != 0) goto L_0x0044
            r0.A(r1, r3, r3, r3)
            goto L_0x004b
        L_0x0044:
            int r2 = r0.f3257h0
            boolean r4 = r0.f3261l0
            r0.A(r1, r2, r4, r3)
        L_0x004b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomappbar.BottomAppBar.onLayout(boolean, int, int, int, int):void");
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.f7340o);
        this.f3257h0 = bVar.f3272q;
        this.f3261l0 = bVar.f3273r;
    }

    public final Parcelable onSaveInstanceState() {
        b bVar = new b((Toolbar.g) super.onSaveInstanceState());
        bVar.f3272q = this.f3257h0;
        bVar.f3273r = this.f3261l0;
        return bVar;
    }

    public void setBackgroundTint(ColorStateList colorStateList) {
        throw null;
    }

    public void setCradleVerticalOffset(float f10) {
        if (f10 != getCradleVerticalOffset()) {
            f topEdgeTreatment = getTopEdgeTreatment();
            if (f10 >= 0.0f) {
                topEdgeTreatment.f9142r = f10;
                throw null;
            } else {
                topEdgeTreatment.getClass();
                throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
            }
        }
    }

    public void setElevation(float f10) {
        throw null;
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [android.view.View] */
    /* JADX WARNING: type inference failed for: r2v4, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setFabAlignmentMode(int r13) {
        /*
            r12 = this;
            r0 = 0
            r12.f3260k0 = r0
            boolean r1 = r12.f3261l0
            java.util.WeakHashMap<android.view.View, i0.b0> r2 = i0.w.f6004a
            boolean r2 = i0.w.g.c(r12)
            r3 = 0
            r4 = 1
            if (r2 != 0) goto L_0x0021
            int r1 = r12.f3260k0
            if (r1 == 0) goto L_0x00ba
            r12.f3260k0 = r0
            android.view.Menu r2 = r12.getMenu()
            r2.clear()
            r12.k(r1)
            goto L_0x00ba
        L_0x0021:
            android.animation.Animator r2 = r12.f3256g0
            if (r2 == 0) goto L_0x0028
            r2.cancel()
        L_0x0028:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            android.view.View r5 = r12.v()
            boolean r6 = r5 instanceof com.google.android.material.floatingactionbutton.FloatingActionButton
            if (r6 == 0) goto L_0x0038
            com.google.android.material.floatingactionbutton.FloatingActionButton r5 = (com.google.android.material.floatingactionbutton.FloatingActionButton) r5
            goto L_0x0039
        L_0x0038:
            r5 = r3
        L_0x0039:
            if (r5 == 0) goto L_0x0043
            boolean r5 = r5.j()
            if (r5 == 0) goto L_0x0043
            r5 = r4
            goto L_0x0044
        L_0x0043:
            r5 = r0
        L_0x0044:
            if (r5 != 0) goto L_0x0049
            r1 = r0
            r5 = r1
            goto L_0x004a
        L_0x0049:
            r5 = r13
        L_0x004a:
            androidx.appcompat.widget.ActionMenuView r6 = r12.getActionMenuView()
            if (r6 != 0) goto L_0x0051
            goto L_0x00a3
        L_0x0051:
            float[] r7 = new float[r4]
            r8 = 1065353216(0x3f800000, float:1.0)
            r7[r0] = r8
            java.lang.String r9 = "alpha"
            android.animation.ObjectAnimator r7 = android.animation.ObjectAnimator.ofFloat(r6, r9, r7)
            float r10 = r6.getTranslationX()
            int r11 = r12.w(r6, r5, r1)
            float r11 = (float) r11
            float r10 = r10 - r11
            float r10 = java.lang.Math.abs(r10)
            int r10 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r10 <= 0) goto L_0x0098
            float[] r8 = new float[r4]
            r10 = 0
            r8[r0] = r10
            android.animation.ObjectAnimator r8 = android.animation.ObjectAnimator.ofFloat(r6, r9, r8)
            v5.d r9 = new v5.d
            r9.<init>(r12, r6, r5, r1)
            r8.addListener(r9)
            android.animation.AnimatorSet r1 = new android.animation.AnimatorSet
            r1.<init>()
            r5 = 150(0x96, double:7.4E-322)
            r1.setDuration(r5)
            r5 = 2
            android.animation.Animator[] r5 = new android.animation.Animator[r5]
            r5[r0] = r8
            r5[r4] = r7
            r1.playSequentially(r5)
            r2.add(r1)
            goto L_0x00a3
        L_0x0098:
            float r1 = r6.getAlpha()
            int r1 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r1 >= 0) goto L_0x00a3
            r2.add(r7)
        L_0x00a3:
            android.animation.AnimatorSet r1 = new android.animation.AnimatorSet
            r1.<init>()
            r1.playTogether(r2)
            r12.f3256g0 = r1
            v5.c r2 = new v5.c
            r2.<init>(r12)
            r1.addListener(r2)
            android.animation.Animator r1 = r12.f3256g0
            r1.start()
        L_0x00ba:
            int r1 = r12.f3257h0
            if (r1 == r13) goto L_0x012a
            boolean r1 = i0.w.g.c(r12)
            if (r1 != 0) goto L_0x00c5
            goto L_0x012a
        L_0x00c5:
            android.animation.Animator r1 = r12.f3255f0
            if (r1 == 0) goto L_0x00cc
            r1.cancel()
        L_0x00cc:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r2 = r12.f3258i0
            if (r2 != r4) goto L_0x00f7
            android.view.View r2 = r12.v()
            boolean r5 = r2 instanceof com.google.android.material.floatingactionbutton.FloatingActionButton
            if (r5 == 0) goto L_0x00e0
            r3 = r2
            com.google.android.material.floatingactionbutton.FloatingActionButton r3 = (com.google.android.material.floatingactionbutton.FloatingActionButton) r3
        L_0x00e0:
            float[] r2 = new float[r4]
            float r4 = r12.x(r13)
            r2[r0] = r4
            java.lang.String r0 = "translationX"
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r3, r0, r2)
            r2 = 300(0x12c, double:1.48E-321)
            r0.setDuration(r2)
            r1.add(r0)
            goto L_0x0113
        L_0x00f7:
            android.view.View r0 = r12.v()
            boolean r2 = r0 instanceof com.google.android.material.floatingactionbutton.FloatingActionButton
            if (r2 == 0) goto L_0x0102
            r3 = r0
            com.google.android.material.floatingactionbutton.FloatingActionButton r3 = (com.google.android.material.floatingactionbutton.FloatingActionButton) r3
        L_0x0102:
            if (r3 == 0) goto L_0x0113
            boolean r0 = r3.i()
            if (r0 == 0) goto L_0x010b
            goto L_0x0113
        L_0x010b:
            v5.b r0 = new v5.b
            r0.<init>(r12, r13)
            r3.h(r0, r4)
        L_0x0113:
            android.animation.AnimatorSet r0 = new android.animation.AnimatorSet
            r0.<init>()
            r0.playTogether(r1)
            r12.f3255f0 = r0
            v5.a r1 = new v5.a
            r1.<init>(r12)
            r0.addListener(r1)
            android.animation.Animator r0 = r12.f3255f0
            r0.start()
        L_0x012a:
            r12.f3257h0 = r13
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomappbar.BottomAppBar.setFabAlignmentMode(int):void");
    }

    public void setFabAnimationMode(int i10) {
        this.f3258i0 = i10;
    }

    public void setFabCornerSize(float f10) {
        if (f10 != getTopEdgeTreatment().f9143s) {
            getTopEdgeTreatment().f9143s = f10;
            throw null;
        }
    }

    public void setFabCradleMargin(float f10) {
        if (f10 != getFabCradleMargin()) {
            getTopEdgeTreatment().f9140p = f10;
            throw null;
        }
    }

    public void setFabCradleRoundedCornerRadius(float f10) {
        if (f10 != getFabCradleRoundedCornerRadius()) {
            getTopEdgeTreatment().f9139o = f10;
            throw null;
        }
    }

    public void setHideOnScroll(boolean z) {
        this.f3259j0 = z;
    }

    public void setSubtitle(CharSequence charSequence) {
    }

    public void setTitle(CharSequence charSequence) {
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x0030  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View v() {
        /*
            r4 = this;
            android.view.ViewParent r0 = r4.getParent()
            boolean r0 = r0 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout
            r1 = 0
            if (r0 != 0) goto L_0x000a
            return r1
        L_0x000a:
            android.view.ViewParent r0 = r4.getParent()
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r0
            o.c r2 = r0.f932p
            java.lang.Object r2 = r2.f7536b
            n.i r2 = (n.i) r2
            java.lang.Object r2 = r2.getOrDefault(r4, r1)
            java.util.List r2 = (java.util.List) r2
            java.util.ArrayList r0 = r0.f934r
            r0.clear()
            if (r2 == 0) goto L_0x0026
            r0.addAll(r2)
        L_0x0026:
            java.util.Iterator r0 = r0.iterator()
        L_0x002a:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x003f
            java.lang.Object r2 = r0.next()
            android.view.View r2 = (android.view.View) r2
            boolean r3 = r2 instanceof com.google.android.material.floatingactionbutton.FloatingActionButton
            if (r3 != 0) goto L_0x003e
            boolean r3 = r2 instanceof com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton
            if (r3 == 0) goto L_0x002a
        L_0x003e:
            return r2
        L_0x003f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomappbar.BottomAppBar.v():android.view.View");
    }

    public final int w(ActionMenuView actionMenuView, int i10, boolean z) {
        if (i10 != 1 || !z) {
            return 0;
        }
        boolean a10 = n.a(this);
        int measuredWidth = a10 ? getMeasuredWidth() : 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if ((childAt.getLayoutParams() instanceof Toolbar.e) && (((Toolbar.e) childAt.getLayoutParams()).f4326a & 8388615) == 8388611) {
                measuredWidth = a10 ? Math.min(measuredWidth, childAt.getLeft()) : Math.max(measuredWidth, childAt.getRight());
            }
        }
        return measuredWidth - ((a10 ? actionMenuView.getRight() : actionMenuView.getLeft()) + 0);
    }

    public final float x(int i10) {
        boolean a10 = n.a(this);
        int i11 = 1;
        if (i10 != 1) {
            return 0.0f;
        }
        int measuredWidth = (getMeasuredWidth() / 2) + 0;
        if (a10) {
            i11 = -1;
        }
        return (float) (measuredWidth * i11);
    }

    public final void y() {
        FloatingActionButton floatingActionButton;
        f topEdgeTreatment = getTopEdgeTreatment();
        getFabTranslationX();
        topEdgeTreatment.getClass();
        v();
        if (this.f3261l0) {
            View v10 = v();
            if (v10 instanceof FloatingActionButton) {
                floatingActionButton = (FloatingActionButton) v10;
            } else {
                floatingActionButton = null;
            }
            if (floatingActionButton != null) {
                floatingActionButton.j();
            }
        }
        throw null;
    }

    public final void z(int i10) {
        float f10 = (float) i10;
        if (f10 != getTopEdgeTreatment().f9141q) {
            getTopEdgeTreatment().f9141q = f10;
            throw null;
        }
    }
}
