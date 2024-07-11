package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;

public final class f extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RecyclerView.c0 f1768a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f1769b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f1770c;
    public final /* synthetic */ k d;

    public f(View view, ViewPropertyAnimator viewPropertyAnimator, k kVar, RecyclerView.c0 c0Var) {
        this.d = kVar;
        this.f1768a = c0Var;
        this.f1769b = viewPropertyAnimator;
        this.f1770c = view;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f1769b.setListener((Animator.AnimatorListener) null);
        this.f1770c.setAlpha(1.0f);
        k kVar = this.d;
        RecyclerView.c0 c0Var = this.f1768a;
        kVar.c(c0Var);
        kVar.f1794q.remove(c0Var);
        kVar.i();
    }

    public final void onAnimationStart(Animator animator) {
        this.d.getClass();
    }
}
