package p6;

import android.animation.ValueAnimator;
import com.google.android.material.textfield.a;

public final class d implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a f7931a;

    public d(a aVar) {
        this.f7931a = aVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        a aVar = this.f7931a;
        aVar.f7939c.setScaleX(floatValue);
        aVar.f7939c.setScaleY(floatValue);
    }
}
