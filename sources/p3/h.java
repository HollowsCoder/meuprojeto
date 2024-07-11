package p3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import p3.c;

public final class h extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c.i f7916a;

    public h(c.i iVar) {
        this.f7916a = iVar;
    }

    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        c.i iVar = this.f7916a;
        if (iVar.getParent() != null) {
            ((ViewGroup) iVar.getParent()).removeView(iVar);
        }
    }
}
