package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.c;

public final class g implements Animation.AnimationListener {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ ViewGroup f1154o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ View f1155p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ c.b f1156q;

    public class a implements Runnable {
        public a() {
        }

        public final void run() {
            g gVar = g.this;
            gVar.f1154o.endViewTransition(gVar.f1155p);
            gVar.f1156q.a();
        }
    }

    public g(View view, ViewGroup viewGroup, c.b bVar) {
        this.f1154o = viewGroup;
        this.f1155p = view;
        this.f1156q = bVar;
    }

    public final void onAnimationEnd(Animation animation) {
        this.f1154o.post(new a());
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
    }
}
