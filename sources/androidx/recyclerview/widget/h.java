package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;

public final class h extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RecyclerView.c0 f1774a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f1775b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f1776c;
    public final /* synthetic */ int d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f1777e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ k f1778f;

    public h(k kVar, RecyclerView.c0 c0Var, int i10, View view, int i11, ViewPropertyAnimator viewPropertyAnimator) {
        this.f1778f = kVar;
        this.f1774a = c0Var;
        this.f1775b = i10;
        this.f1776c = view;
        this.d = i11;
        this.f1777e = viewPropertyAnimator;
    }

    public final void onAnimationCancel(Animator animator) {
        int i10 = this.f1775b;
        View view = this.f1776c;
        if (i10 != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.d != 0) {
            view.setTranslationY(0.0f);
        }
    }

    public final void onAnimationEnd(Animator animator) {
        this.f1777e.setListener((Animator.AnimatorListener) null);
        k kVar = this.f1778f;
        RecyclerView.c0 c0Var = this.f1774a;
        kVar.c(c0Var);
        kVar.f1793p.remove(c0Var);
        kVar.i();
    }

    public final void onAnimationStart(Animator animator) {
        this.f1778f.getClass();
    }
}
