package h2;

import android.view.animation.Animation;
import n8.i;

public final class a implements Animation.AnimationListener {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ y8.a<i> f5217o;

    public a(y8.a<i> aVar) {
        this.f5217o = aVar;
    }

    public final void onAnimationEnd(Animation animation) {
        this.f5217o.n();
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
    }
}
