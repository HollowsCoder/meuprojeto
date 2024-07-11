package c1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import n.b;

public final class k extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f2111a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ j f2112b;

    public k(j jVar, b bVar) {
        this.f2112b = jVar;
        this.f2111a = bVar;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f2111a.remove(animator);
        this.f2112b.A.remove(animator);
    }

    public final void onAnimationStart(Animator animator) {
        this.f2112b.A.add(animator);
    }
}
