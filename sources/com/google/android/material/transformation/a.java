package com.google.android.material.transformation;

import android.animation.ValueAnimator;
import android.view.View;

public final class a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ View f3697a;

    public a(View view) {
        this.f3697a = view;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f3697a.invalidate();
    }
}
