package p3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.appfab.facematchlive.ui.flow.main.MainActivity;
import d2.a;
import p3.c;
import z8.g;

public final class e extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Animator.AnimatorListener f7912a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ c.i f7913b;

    public e(c.i iVar, h hVar) {
        this.f7913b = iVar;
        this.f7912a = hVar;
    }

    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.f7912a.onAnimationEnd(animator);
        c.e eVar = this.f7913b.D;
        if (eVar != null) {
            a aVar = (a) eVar;
            aVar.getClass();
            int i10 = MainActivity.P;
            MainActivity mainActivity = aVar.f4124o;
            g.f(mainActivity, "this$0");
            mainActivity.K = false;
        }
    }
}
