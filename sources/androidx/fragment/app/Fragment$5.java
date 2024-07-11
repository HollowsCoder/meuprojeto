package androidx.fragment.app;

import android.view.View;
import androidx.lifecycle.h;
import androidx.lifecycle.l;
import androidx.lifecycle.n;

class Fragment$5 implements l {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ n f1094o;

    public Fragment$5(n nVar) {
        this.f1094o = nVar;
    }

    public final void f(n nVar, h.b bVar) {
        View view;
        if (bVar == h.b.ON_STOP && (view = this.f1094o.S) != null) {
            view.cancelPendingInputEvents();
        }
    }
}
