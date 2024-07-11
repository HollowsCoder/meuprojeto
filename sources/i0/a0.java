package i0;

import android.animation.ValueAnimator;
import android.view.View;
import e.r;

public final class a0 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d0 f5954a;

    public a0(r.c cVar, View view) {
        this.f5954a = cVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ((View) r.this.d.getParent()).invalidate();
    }
}
