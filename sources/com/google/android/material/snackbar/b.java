package com.google.android.material.snackbar;

import android.animation.ValueAnimator;

public final class b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ BaseTransientBottomBar f3560a;

    public b(BaseTransientBottomBar baseTransientBottomBar) {
        this.f3560a = baseTransientBottomBar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f3560a.f3531c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
