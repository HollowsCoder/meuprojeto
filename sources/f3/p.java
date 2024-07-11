package f3;

import j3.g;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import m3.j;

public final class p implements i {

    /* renamed from: o  reason: collision with root package name */
    public final Set<g<?>> f4630o = Collections.newSetFromMap(new WeakHashMap());

    public final void a() {
        Iterator it = j.d(this.f4630o).iterator();
        while (it.hasNext()) {
            ((g) it.next()).a();
        }
    }

    public final void b() {
        Iterator it = j.d(this.f4630o).iterator();
        while (it.hasNext()) {
            ((g) it.next()).b();
        }
    }

    public final void k() {
        Iterator it = j.d(this.f4630o).iterator();
        while (it.hasNext()) {
            ((g) it.next()).k();
        }
    }
}
