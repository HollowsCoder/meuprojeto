package e;

import android.view.View;
import androidx.databinding.a;
import i0.b0;
import i0.c0;
import i0.w;
import java.util.WeakHashMap;

public final class k extends a {

    /* renamed from: z0  reason: collision with root package name */
    public final /* synthetic */ g f4385z0;

    public k(g gVar) {
        this.f4385z0 = gVar;
    }

    public final void a() {
        g gVar = this.f4385z0;
        gVar.C.setAlpha(1.0f);
        gVar.F.d((c0) null);
        gVar.F = null;
    }

    public final void k() {
        g gVar = this.f4385z0;
        gVar.C.setVisibility(0);
        if (gVar.C.getParent() instanceof View) {
            WeakHashMap<View, b0> weakHashMap = w.f6004a;
            w.h.c((View) gVar.C.getParent());
        }
    }
}
