package z8;

import d9.a;
import d9.c;
import d9.d;

public abstract class j extends l implements c {
    public j(Class cls, int i10) {
        super(cls, i10);
    }

    public final j a() {
        n.f9972a.getClass();
        return this;
    }

    public final void j() {
        a aVar = this.f9960o;
        if (aVar == null) {
            a();
            this.f9960o = this;
            aVar = this;
        }
        if (aVar != this) {
            ((c) ((d) aVar)).j();
            return;
        }
        throw new x8.a();
    }

    public final Object k(Object obj) {
        ((k) this).j();
        throw null;
    }
}
