package com.google.android.material.snackbar;

import android.animation.ValueAnimator;
import android.os.Handler;

public final class e implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ BaseTransientBottomBar f3563a;

    public e(BaseTransientBottomBar baseTransientBottomBar) {
        this.f3563a = baseTransientBottomBar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        Handler handler = BaseTransientBottomBar.f3526o;
        this.f3563a.f3531c.setTranslationY((float) intValue);
    }
}
