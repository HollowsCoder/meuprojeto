package z8;

import d9.a;
import d9.d;

public abstract class l extends b implements d {
    public l() {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l(Class cls, int i10) {
        super(cls, "layoutContainer", "getLayoutContainer()Landroid/view/View;", (i10 & 1) != 1 ? false : true);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof l) {
            l lVar = (l) obj;
            if (!b().equals(lVar.b()) || !this.f9963r.equals(lVar.f9963r) || !this.f9964s.equals(lVar.f9964s) || !g.a(this.f9961p, lVar.f9961p)) {
                return false;
            }
            return true;
        } else if (!(obj instanceof d)) {
            return false;
        } else {
            a aVar = this.f9960o;
            if (aVar == null) {
                aVar = a();
                this.f9960o = aVar;
            }
            return obj.equals(aVar);
        }
    }

    public final int hashCode() {
        int hashCode = this.f9963r.hashCode();
        return this.f9964s.hashCode() + ((hashCode + (b().hashCode() * 31)) * 31);
    }

    public final String toString() {
        a aVar = this.f9960o;
        if (aVar == null) {
            aVar = a();
            this.f9960o = aVar;
        }
        if (aVar != this) {
            return aVar.toString();
        }
        return b0.d.g(new StringBuilder("property "), this.f9963r, " (Kotlin reflection is not available)");
    }
}
