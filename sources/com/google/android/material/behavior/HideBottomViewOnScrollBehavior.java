package com.google.android.material.behavior;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import s5.a;
import u0.d;

public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.c<V> {

    /* renamed from: a  reason: collision with root package name */
    public int f3237a = 0;

    /* renamed from: b  reason: collision with root package name */
    public int f3238b = 2;

    /* renamed from: c  reason: collision with root package name */
    public int f3239c = 0;
    public ViewPropertyAnimator d;

    public HideBottomViewOnScrollBehavior() {
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean h(CoordinatorLayout coordinatorLayout, V v10, int i10) {
        this.f3237a = v10.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) v10.getLayoutParams()).bottomMargin;
        return false;
    }

    public final void l(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int[] iArr) {
        if (i10 > 0) {
            if (this.f3238b != 1) {
                ViewPropertyAnimator viewPropertyAnimator = this.d;
                if (viewPropertyAnimator != null) {
                    viewPropertyAnimator.cancel();
                    view.clearAnimation();
                }
                this.f3238b = 1;
                s(view, this.f3237a + this.f3239c, 175, a.f8786c);
            }
        } else if (i10 < 0 && this.f3238b != 2) {
            ViewPropertyAnimator viewPropertyAnimator2 = this.d;
            if (viewPropertyAnimator2 != null) {
                viewPropertyAnimator2.cancel();
                view.clearAnimation();
            }
            this.f3238b = 2;
            s(view, 0, 225, a.d);
        }
    }

    public boolean p(CoordinatorLayout coordinatorLayout, V v10, View view, View view2, int i10, int i11) {
        return i10 == 2;
    }

    public final void s(View view, int i10, long j8, d dVar) {
        this.d = view.animate().translationY((float) i10).setInterpolator(dVar).setDuration(j8).setListener(new u5.a(this));
    }
}
