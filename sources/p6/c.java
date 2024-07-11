package p6;

import android.animation.ValueAnimator;
import com.google.android.material.textfield.a;

public final class c implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a f7930a;

    public c(a aVar) {
        this.f7930a = aVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f7930a.f7939c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
