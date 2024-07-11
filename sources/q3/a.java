package q3;

public final class a<T> extends c<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Integer f8222a = null;

    /* renamed from: b  reason: collision with root package name */
    public final T f8223b;

    /* renamed from: c  reason: collision with root package name */
    public final d f8224c;

    public a(Object obj, d dVar) {
        if (obj != null) {
            this.f8223b = obj;
            if (dVar != null) {
                this.f8224c = dVar;
                return;
            }
            throw new NullPointerException("Null priority");
        }
        throw new NullPointerException("Null payload");
    }

    public final Integer a() {
        return this.f8222a;
    }

    public final T b() {
        return this.f8223b;
    }

    public final d c() {
        return this.f8224c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        Integer num = this.f8222a;
        if (num != null ? num.equals(cVar.a()) : cVar.a() == null) {
            if (this.f8223b.equals(cVar.b()) && this.f8224c.equals(cVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Integer num = this.f8222a;
        return (((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.f8223b.hashCode()) * 1000003) ^ this.f8224c.hashCode();
    }

    public final String toString() {
        return "Event{code=" + this.f8222a + ", payload=" + this.f8223b + ", priority=" + this.f8224c + "}";
    }
}
