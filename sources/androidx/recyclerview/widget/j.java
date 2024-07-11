package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.k;

public final class j extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ k.a f1782a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f1783b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f1784c;
    public final /* synthetic */ k d;

    public j(k kVar, k.a aVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.d = kVar;
        this.f1782a = aVar;
        this.f1783b = viewPropertyAnimator;
        this.f1784c = view;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f1783b.setListener((Animator.AnimatorListener) null);
        View view = this.f1784c;
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        k.a aVar = this.f1782a;
        RecyclerView.c0 c0Var = aVar.f1797b;
        k kVar = this.d;
        kVar.c(c0Var);
        kVar.f1795r.remove(aVar.f1797b);
        kVar.i();
    }

    public final void onAnimationStart(Animator animator) {
        RecyclerView.c0 c0Var = this.f1782a.f1797b;
        this.d.getClass();
    }
}
