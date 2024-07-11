package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.k;

public final class i extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ k.a f1779a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f1780b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f1781c;
    public final /* synthetic */ k d;

    public i(k kVar, k.a aVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.d = kVar;
        this.f1779a = aVar;
        this.f1780b = viewPropertyAnimator;
        this.f1781c = view;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f1780b.setListener((Animator.AnimatorListener) null);
        View view = this.f1781c;
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        k.a aVar = this.f1779a;
        RecyclerView.c0 c0Var = aVar.f1796a;
        k kVar = this.d;
        kVar.c(c0Var);
        kVar.f1795r.remove(aVar.f1796a);
        kVar.i();
    }

    public final void onAnimationStart(Animator animator) {
        RecyclerView.c0 c0Var = this.f1779a.f1796a;
        this.d.getClass();
    }
}
