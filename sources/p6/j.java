package p6;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.textfield.b;

public final class j extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f7936a;

    public j(b bVar) {
        this.f7936a = bVar;
    }

    public final void onAnimationEnd(Animator animator) {
        b bVar = this.f7936a;
        bVar.f7939c.setChecked(bVar.f3636j);
        bVar.f3641p.start();
    }
}
