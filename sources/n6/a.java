package n6;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.snackbar.BaseTransientBottomBar;

public final class a extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ BaseTransientBottomBar f7485a;

    public a(BaseTransientBottomBar baseTransientBottomBar) {
        this.f7485a = baseTransientBottomBar;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f7485a.d();
    }
}
