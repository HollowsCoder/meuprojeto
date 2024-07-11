package c1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class l extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ j f2113a;

    public l(j jVar) {
        this.f2113a = jVar;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f2113a.r();
        animator.removeListener(this);
    }
}
