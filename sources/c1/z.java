package c1;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;
import com.karumi.dexter.R;

public final class z extends m {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ViewGroup f2134a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f2135b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f2136c;
    public final /* synthetic */ a0 d;

    public z(a0 a0Var, ViewGroup viewGroup, View view, View view2) {
        this.d = a0Var;
        this.f2134a = viewGroup;
        this.f2135b = view;
        this.f2136c = view2;
    }

    public final void a() {
        ((ViewGroupOverlay) new r(this.f2134a).f2129o).remove(this.f2135b);
    }

    public final void b(j jVar) {
        this.f2136c.setTag(R.id.save_overlay_view, (Object) null);
        ((ViewGroupOverlay) new r(this.f2134a).f2129o).remove(this.f2135b);
        jVar.A(this);
    }

    public final void c() {
        View view = this.f2135b;
        if (view.getParent() == null) {
            ((ViewGroupOverlay) new r(this.f2134a).f2129o).add(view);
        } else {
            this.d.cancel();
        }
    }
}
