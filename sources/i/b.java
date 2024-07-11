package i;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import d0.c;
import n.i;

public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public final Context f5937a;

    /* renamed from: b  reason: collision with root package name */
    public i<d0.b, MenuItem> f5938b;

    /* renamed from: c  reason: collision with root package name */
    public i<c, SubMenu> f5939c;

    public b(Context context) {
        this.f5937a = context;
    }

    public final MenuItem c(MenuItem menuItem) {
        if (!(menuItem instanceof d0.b)) {
            return menuItem;
        }
        d0.b bVar = (d0.b) menuItem;
        if (this.f5938b == null) {
            this.f5938b = new i<>();
        }
        MenuItem orDefault = this.f5938b.getOrDefault(menuItem, null);
        if (orDefault != null) {
            return orDefault;
        }
        c cVar = new c(this.f5937a, bVar);
        this.f5938b.put(bVar, cVar);
        return cVar;
    }

    public final SubMenu d(SubMenu subMenu) {
        if (!(subMenu instanceof c)) {
            return subMenu;
        }
        c cVar = (c) subMenu;
        if (this.f5939c == null) {
            this.f5939c = new i<>();
        }
        SubMenu orDefault = this.f5939c.getOrDefault(cVar, null);
        if (orDefault != null) {
            return orDefault;
        }
        g gVar = new g(this.f5937a, cVar);
        this.f5939c.put(cVar, gVar);
        return gVar;
    }
}
