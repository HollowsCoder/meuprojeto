package androidx.appcompat.widget;

import android.view.View;
import android.view.Window;
import i.a;

public final class g1 implements View.OnClickListener {

    /* renamed from: o  reason: collision with root package name */
    public final a f573o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ h1 f574p;

    public g1(h1 h1Var) {
        this.f574p = h1Var;
        this.f573o = new a(h1Var.f582a.getContext(), h1Var.f589i);
    }

    public final void onClick(View view) {
        h1 h1Var = this.f574p;
        Window.Callback callback = h1Var.l;
        if (callback != null && h1Var.f592m) {
            callback.onMenuItemSelected(0, this.f573o);
        }
    }
}
