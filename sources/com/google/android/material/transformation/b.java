package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.Drawable;
import b6.d;

public final class b extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d f3698a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Drawable f3699b;

    public b(d dVar, Drawable drawable) {
        this.f3698a = dVar;
        this.f3699b = drawable;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f3698a.setCircularRevealOverlayDrawable((Drawable) null);
    }

    public final void onAnimationStart(Animator animator) {
        this.f3698a.setCircularRevealOverlayDrawable(this.f3699b);
    }
}
