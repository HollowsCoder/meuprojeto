package p3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.appfab.facematchlive.ui.flow.main.MainActivity;
import d2.b;
import p3.c;
import z8.g;

public final class d extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c.i f7911a;

    public d(c.i iVar) {
        this.f7911a = iVar;
    }

    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        c.d dVar = this.f7911a.C;
        if (dVar != null) {
            MainActivity mainActivity = (MainActivity) ((b) dVar).f4126p;
            int i10 = MainActivity.P;
            g.f(mainActivity, "this$0");
            mainActivity.K = true;
        }
    }
}
