package d2;

import android.animation.Animator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.TranslateAnimation;
import com.appfab.facematchlive.ui.flow.main.MainActivity;
import com.karumi.dexter.R;
import x1.e;
import z8.g;

public final class i implements Animator.AnimatorListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MainActivity f4135a;

    public i(MainActivity mainActivity) {
        this.f4135a = mainActivity;
    }

    public final void onAnimationCancel(Animator animator) {
        g.f(animator, "p0");
    }

    public final void onAnimationEnd(Animator animator) {
        g.f(animator, "p0");
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, -65.0f);
        translateAnimation.setDuration(1000);
        translateAnimation.setFillAfter(true);
        translateAnimation.setFillBefore(false);
        MainActivity mainActivity = this.f4135a;
        T t10 = mainActivity.E;
        g.c(t10);
        ((e) t10).V0.startAnimation(translateAnimation);
        Animation loadAnimation = AnimationUtils.loadAnimation(mainActivity, R.anim.fadein);
        g.e(loadAnimation, "loadAnimation(this@MainActivity, R.anim.fadein)");
        loadAnimation.setDuration(1000);
        loadAnimation.setFillAfter(true);
        loadAnimation.setFillBefore(false);
        T t11 = mainActivity.E;
        g.c(t11);
        ((e) t11).W0.startAnimation(loadAnimation);
    }

    public final void onAnimationRepeat(Animator animator) {
        g.f(animator, "p0");
    }

    public final void onAnimationStart(Animator animator) {
        g.f(animator, "p0");
    }
}
