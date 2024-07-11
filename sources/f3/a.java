package f3;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import m3.j;

public final class a implements h {

    /* renamed from: o  reason: collision with root package name */
    public final Set<i> f4595o = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: p  reason: collision with root package name */
    public boolean f4596p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f4597q;

    public final void a(i iVar) {
        this.f4595o.remove(iVar);
    }

    public final void b(i iVar) {
        this.f4595o.add(iVar);
        if (this.f4597q) {
            iVar.b();
        } else if (this.f4596p) {
            iVar.k();
        } else {
            iVar.a();
        }
    }

    public final void c() {
        this.f4597q = true;
        Iterator it = j.d(this.f4595o).iterator();
        while (it.hasNext()) {
            ((i) it.next()).b();
        }
    }

    public final void d() {
        this.f4596p = true;
        Iterator it = j.d(this.f4595o).iterator();
        while (it.hasNext()) {
            ((i) it.next()).k();
        }
    }

    public final void e() {
        this.f4596p = false;
        Iterator it = j.d(this.f4595o).iterator();
        while (it.hasNext()) {
            ((i) it.next()).a();
        }
    }
}
