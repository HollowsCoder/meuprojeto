package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.c;
import e0.b;

public final class h implements b.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ View f1179a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ViewGroup f1180b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ c.b f1181c;

    public h(View view, ViewGroup viewGroup, c.b bVar) {
        this.f1179a = view;
        this.f1180b = viewGroup;
        this.f1181c = bVar;
    }

    public final void onCancel() {
        View view = this.f1179a;
        view.clearAnimation();
        this.f1180b.endViewTransition(view);
        this.f1181c.a();
    }
}
