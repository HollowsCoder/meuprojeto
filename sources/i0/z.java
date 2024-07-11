package i0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

public final class z extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c0 f6022a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f6023b;

    public z(c0 c0Var, View view) {
        this.f6022a = c0Var;
        this.f6023b = view;
    }

    public final void onAnimationCancel(Animator animator) {
        this.f6022a.f(this.f6023b);
    }

    public final void onAnimationEnd(Animator animator) {
        this.f6022a.a();
    }

    public final void onAnimationStart(Animator animator) {
        this.f6022a.k();
    }
}
