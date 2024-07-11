package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import b6.d;

public final class c extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d f3700a;

    public c(d dVar) {
        this.f3700a = dVar;
    }

    public final void onAnimationEnd(Animator animator) {
        d dVar = this.f3700a;
        d.C0023d revealInfo = dVar.getRevealInfo();
        revealInfo.f1965c = Float.MAX_VALUE;
        dVar.setRevealInfo(revealInfo);
    }
}
