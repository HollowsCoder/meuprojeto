package com.google.android.material.snackbar;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import n6.c;

public final class a implements Runnable {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ BaseTransientBottomBar f3559o;

    public a(BaseTransientBottomBar baseTransientBottomBar) {
        this.f3559o = baseTransientBottomBar;
    }

    public final void run() {
        BaseTransientBottomBar baseTransientBottomBar = this.f3559o;
        BaseTransientBottomBar.h hVar = baseTransientBottomBar.f3531c;
        if (hVar != null) {
            ViewParent parent = hVar.getParent();
            BaseTransientBottomBar.h hVar2 = baseTransientBottomBar.f3531c;
            if (parent != null) {
                hVar2.setVisibility(0);
            }
            if (hVar2.getAnimationMode() == 1) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
                ofFloat.setInterpolator(s5.a.f8784a);
                ofFloat.addUpdateListener(new b(baseTransientBottomBar));
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{0.8f, 1.0f});
                ofFloat2.setInterpolator(s5.a.d);
                ofFloat2.addUpdateListener(new c(baseTransientBottomBar));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2});
                animatorSet.setDuration(150);
                animatorSet.addListener(new n6.a(baseTransientBottomBar));
                animatorSet.start();
                return;
            }
            int height = hVar2.getHeight();
            ViewGroup.LayoutParams layoutParams = hVar2.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                height += ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
            }
            hVar2.setTranslationY((float) height);
            ValueAnimator valueAnimator = new ValueAnimator();
            valueAnimator.setIntValues(new int[]{height, 0});
            valueAnimator.setInterpolator(s5.a.f8785b);
            valueAnimator.setDuration(250);
            valueAnimator.addListener(new c(baseTransientBottomBar));
            valueAnimator.addUpdateListener(new d(baseTransientBottomBar, height));
            valueAnimator.start();
        }
    }
}
