package androidx.appcompat.view.menu;

import android.view.MenuItem;
import androidx.appcompat.view.menu.b;

public final class c implements Runnable {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ b.d f295o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ MenuItem f296p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ f f297q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ b.c f298r;

    public c(b.c cVar, b.d dVar, h hVar, f fVar) {
        this.f298r = cVar;
        this.f295o = dVar;
        this.f296p = hVar;
        this.f297q = fVar;
    }

    public final void run() {
        b.d dVar = this.f295o;
        if (dVar != null) {
            b.c cVar = this.f298r;
            b.this.O = true;
            dVar.f293b.c(false);
            b.this.O = false;
        }
        MenuItem menuItem = this.f296p;
        if (menuItem.isEnabled() && menuItem.hasSubMenu()) {
            this.f297q.q(menuItem, (j) null, 4);
        }
    }
}
