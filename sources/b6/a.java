package b6;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class a extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d f1958a;

    public a(d dVar) {
        this.f1958a = dVar;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f1958a.a();
    }

    public final void onAnimationStart(Animator animator) {
        this.f1958a.b();
    }
}
