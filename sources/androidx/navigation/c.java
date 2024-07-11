package androidx.navigation;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final n f1452a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f1453b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f1454c;
    public final Object d;

    public c(n<?> nVar, boolean z, Object obj, boolean z10) {
        if (!nVar.f1528a && z) {
            throw new IllegalArgumentException(nVar.b() + " does not allow nullable values");
        } else if (z || !z10 || obj != null) {
            this.f1452a = nVar;
            this.f1453b = z;
            this.d = obj;
            this.f1454c = z10;
        } else {
            throw new IllegalArgumentException("Argument with type " + nVar.b() + " has null value but is not nullable.");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f1453b != cVar.f1453b || this.f1454c != cVar.f1454c || !this.f1452a.equals(cVar.f1452a)) {
            return false;
        }
        Object obj2 = cVar.d;
        Object obj3 = this.d;
        return obj3 != null ? obj3.equals(obj2) : obj2 == null;
    }

    public final int hashCode() {
        int hashCode = ((((this.f1452a.hashCode() * 31) + (this.f1453b ? 1 : 0)) * 31) + (this.f1454c ? 1 : 0)) * 31;
        Object obj = this.d;
        return hashCode + (obj != null ? obj.hashCode() : 0);
    }
}
