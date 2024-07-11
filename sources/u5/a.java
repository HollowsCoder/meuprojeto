package u5;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;

public final class a extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ HideBottomViewOnScrollBehavior f9107a;

    public a(HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior) {
        this.f9107a = hideBottomViewOnScrollBehavior;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f9107a.d = null;
    }
}
