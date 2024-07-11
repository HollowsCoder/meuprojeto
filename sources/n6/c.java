package n6;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.SnackbarContentLayout;

public final class c extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ BaseTransientBottomBar f7487a;

    public c(BaseTransientBottomBar baseTransientBottomBar) {
        this.f7487a = baseTransientBottomBar;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f7487a.d();
    }

    public final void onAnimationStart(Animator animator) {
        SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) this.f7487a.d;
        snackbarContentLayout.f3555o.setAlpha(0.0f);
        long j8 = (long) 180;
        long j10 = (long) 70;
        snackbarContentLayout.f3555o.animate().alpha(1.0f).setDuration(j8).setStartDelay(j10).start();
        if (snackbarContentLayout.f3556p.getVisibility() == 0) {
            snackbarContentLayout.f3556p.setAlpha(0.0f);
            snackbarContentLayout.f3556p.animate().alpha(1.0f).setDuration(j8).setStartDelay(j10).start();
        }
    }
}
