package g6;

import android.view.ViewTreeObserver;
import com.google.android.material.floatingactionbutton.d;

public final class c implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ d f4991o;

    public c(d dVar) {
        this.f4991o = dVar;
    }

    public final boolean onPreDraw() {
        d dVar = this.f4991o;
        float rotation = dVar.f3513x.getRotation();
        if (dVar.f3508q == rotation) {
            return true;
        }
        dVar.f3508q = rotation;
        dVar.o();
        return true;
    }
}
