package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.c;
import androidx.fragment.app.p0;

public final class e extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ViewGroup f1139a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f1140b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ boolean f1141c;
    public final /* synthetic */ p0.e d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ c.b f1142e;

    public e(ViewGroup viewGroup, View view, boolean z, p0.e eVar, c.b bVar) {
        this.f1139a = viewGroup;
        this.f1140b = view;
        this.f1141c = z;
        this.d = eVar;
        this.f1142e = bVar;
    }

    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup = this.f1139a;
        View view = this.f1140b;
        viewGroup.endViewTransition(view);
        if (this.f1141c) {
            this.d.f1277a.applyState(view);
        }
        this.f1142e.a();
    }
}
