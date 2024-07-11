package p6;

import android.animation.ValueAnimator;
import com.google.android.material.textfield.b;

public final class g implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f7932a;

    public g(b bVar) {
        this.f7932a = bVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f7932a.f7939c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
