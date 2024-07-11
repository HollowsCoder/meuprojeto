package v5;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.bottomappbar.BottomAppBar;

public final class a extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ BottomAppBar f9129a;

    public a(BottomAppBar bottomAppBar) {
        this.f9129a = bottomAppBar;
    }

    public final void onAnimationEnd(Animator animator) {
        BottomAppBar bottomAppBar = this.f9129a;
        bottomAppBar.getClass();
        bottomAppBar.f3255f0 = null;
    }

    public final void onAnimationStart(Animator animator) {
        this.f9129a.getClass();
    }
}
