package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.floatingactionbutton.d;

public final class c extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ boolean f3491a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d.f f3492b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ d f3493c;

    public c(d dVar, boolean z, a aVar) {
        this.f3493c = dVar;
        this.f3491a = z;
        this.f3492b = aVar;
    }

    public final void onAnimationEnd(Animator animator) {
        d dVar = this.f3493c;
        dVar.f3511t = 0;
        dVar.f3505n = null;
        d.f fVar = this.f3492b;
        if (fVar != null) {
            ((a) fVar).f3486a.b();
        }
    }

    public final void onAnimationStart(Animator animator) {
        d dVar = this.f3493c;
        dVar.f3513x.b(0, this.f3491a);
        dVar.f3511t = 2;
        dVar.f3505n = animator;
    }
}
