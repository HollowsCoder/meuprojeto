package z8;

public final class i implements c {

    /* renamed from: a  reason: collision with root package name */
    public final Class<?> f9970a;

    public i(Class cls) {
        g.f(cls, "jClass");
        this.f9970a = cls;
    }

    public final Class<?> a() {
        return this.f9970a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            if (g.a(this.f9970a, ((i) obj).f9970a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f9970a.hashCode();
    }

    public final String toString() {
        return this.f9970a.toString() + " (Kotlin reflection is not available)";
    }
}
