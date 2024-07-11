package androidx.fragment.app;

import android.graphics.Rect;
import android.view.View;

public final class j implements Runnable {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ m0 f1188o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ View f1189p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ Rect f1190q;

    public j(m0 m0Var, View view, Rect rect) {
        this.f1188o = m0Var;
        this.f1189p = view;
        this.f1190q = rect;
    }

    public final void run() {
        this.f1188o.getClass();
        m0.g(this.f1189p, this.f1190q);
    }
}
