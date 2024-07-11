package n6;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.snackbar.BaseTransientBottomBar;

public final class b extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ BaseTransientBottomBar f7486a;

    public b(BaseTransientBottomBar baseTransientBottomBar, int i10) {
        this.f7486a = baseTransientBottomBar;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f7486a.c();
    }
}
