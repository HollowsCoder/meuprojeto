package v5;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.bottomappbar.BottomAppBar;

public final class c extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ BottomAppBar f9133a;

    public c(BottomAppBar bottomAppBar) {
        this.f9133a = bottomAppBar;
    }

    public final void onAnimationEnd(Animator animator) {
        BottomAppBar bottomAppBar = this.f9133a;
        bottomAppBar.getClass();
        bottomAppBar.f3256g0 = null;
    }

    public final void onAnimationStart(Animator animator) {
        this.f9133a.getClass();
    }
}
