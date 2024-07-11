package t5;

import android.animation.ValueAnimator;
import m6.f;

public final class b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ f f8998a;

    public b(f fVar) {
        this.f8998a = fVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f8998a.i(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
