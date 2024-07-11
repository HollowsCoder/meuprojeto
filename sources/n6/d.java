package n6;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.SnackbarContentLayout;

public final class d extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ BaseTransientBottomBar f7488a;

    public d(BaseTransientBottomBar baseTransientBottomBar, int i10) {
        this.f7488a = baseTransientBottomBar;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f7488a.c();
    }

    public final void onAnimationStart(Animator animator) {
        SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) this.f7488a.d;
        snackbarContentLayout.f3555o.setAlpha(1.0f);
        long j8 = (long) 180;
        long j10 = (long) 0;
        snackbarContentLayout.f3555o.animate().alpha(0.0f).setDuration(j8).setStartDelay(j10).start();
        if (snackbarContentLayout.f3556p.getVisibility() == 0) {
            snackbarContentLayout.f3556p.setAlpha(1.0f);
            snackbarContentLayout.f3556p.animate().alpha(0.0f).setDuration(j8).setStartDelay(j10).start();
        }
    }
}
