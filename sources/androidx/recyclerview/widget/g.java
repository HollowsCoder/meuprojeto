package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;

public final class g extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RecyclerView.c0 f1771a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f1772b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f1773c;
    public final /* synthetic */ k d;

    public g(View view, ViewPropertyAnimator viewPropertyAnimator, k kVar, RecyclerView.c0 c0Var) {
        this.d = kVar;
        this.f1771a = c0Var;
        this.f1772b = view;
        this.f1773c = viewPropertyAnimator;
    }

    public final void onAnimationCancel(Animator animator) {
        this.f1772b.setAlpha(1.0f);
    }

    public final void onAnimationEnd(Animator animator) {
        this.f1773c.setListener((Animator.AnimatorListener) null);
        k kVar = this.d;
        RecyclerView.c0 c0Var = this.f1771a;
        kVar.c(c0Var);
        kVar.f1792o.remove(c0Var);
        kVar.i();
    }

    public final void onAnimationStart(Animator animator) {
        this.d.getClass();
    }
}
