package m3;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public Class<?> f7081a;

    /* renamed from: b  reason: collision with root package name */
    public Class<?> f7082b;

    /* renamed from: c  reason: collision with root package name */
    public Class<?> f7083c;

    public i() {
    }

    public i(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        this.f7081a = cls;
        this.f7082b = cls2;
        this.f7083c = cls3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        return this.f7081a.equals(iVar.f7081a) && this.f7082b.equals(iVar.f7082b) && j.a(this.f7083c, iVar.f7083c);
    }

    public final int hashCode() {
        int hashCode = (this.f7082b.hashCode() + (this.f7081a.hashCode() * 31)) * 31;
        Class<?> cls = this.f7083c;
        return hashCode + (cls != null ? cls.hashCode() : 0);
    }

    public final String toString() {
        return "MultiClassKey{first=" + this.f7081a + ", second=" + this.f7082b + '}';
    }
}
