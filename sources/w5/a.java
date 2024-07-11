package w5;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import m6.f;

public final class a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ BottomSheetBehavior f9240a;

    public a(BottomSheetBehavior bottomSheetBehavior) {
        this.f9240a = bottomSheetBehavior;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        f fVar = this.f9240a.f3281i;
        if (fVar != null) {
            f.b bVar = fVar.f7121o;
            if (bVar.f7139j != floatValue) {
                bVar.f7139j = floatValue;
                fVar.f7125s = true;
                fVar.invalidateSelf();
            }
        }
    }
}
