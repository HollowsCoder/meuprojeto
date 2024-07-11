package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.floatingactionbutton.d;

public final class b extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public boolean f3488a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f3489b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ d.f f3490c;
    public final /* synthetic */ d d;

    public b(d dVar, boolean z, a aVar) {
        this.d = dVar;
        this.f3489b = z;
        this.f3490c = aVar;
    }

    public final void onAnimationCancel(Animator animator) {
        this.f3488a = true;
    }

    public final void onAnimationEnd(Animator animator) {
        int i10;
        d dVar = this.d;
        dVar.f3511t = 0;
        dVar.f3505n = null;
        if (!this.f3488a) {
            boolean z = this.f3489b;
            if (z) {
                i10 = 8;
            } else {
                i10 = 4;
            }
            dVar.f3513x.b(i10, z);
            d.f fVar = this.f3490c;
            if (fVar != null) {
                a aVar = (a) fVar;
                aVar.f3486a.a(aVar.f3487b);
            }
        }
    }

    public final void onAnimationStart(Animator animator) {
        d dVar = this.d;
        dVar.f3513x.b(0, this.f3489b);
        dVar.f3511t = 1;
        dVar.f3505n = animator;
        this.f3488a = false;
    }
}
