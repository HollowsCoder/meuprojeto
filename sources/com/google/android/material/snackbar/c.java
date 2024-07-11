package com.google.android.material.snackbar;

import android.animation.ValueAnimator;

public final class c implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ BaseTransientBottomBar f3561a;

    public c(BaseTransientBottomBar baseTransientBottomBar) {
        this.f3561a = baseTransientBottomBar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        BaseTransientBottomBar baseTransientBottomBar = this.f3561a;
        baseTransientBottomBar.f3531c.setScaleX(floatValue);
        baseTransientBottomBar.f3531c.setScaleY(floatValue);
    }
}
