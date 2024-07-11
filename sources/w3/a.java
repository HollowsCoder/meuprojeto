package w3;

public final class a<T> implements m8.a<T>, v3.a<T> {

    /* renamed from: c  reason: collision with root package name */
    public static final Object f9232c = new Object();

    /* renamed from: a  reason: collision with root package name */
    public volatile m8.a<T> f9233a;

    /* renamed from: b  reason: collision with root package name */
    public volatile Object f9234b = f9232c;

    public a(m8.a<T> aVar) {
        this.f9233a = aVar;
    }

    public static m8.a a(b bVar) {
        return bVar instanceof a ? bVar : new a(bVar);
    }

    public final T get() {
        boolean z;
        T t10 = this.f9234b;
        T t11 = f9232c;
        if (t10 == t11) {
            synchronized (this) {
                t10 = this.f9234b;
                if (t10 == t11) {
                    t10 = this.f9233a.get();
                    T t12 = this.f9234b;
                    if (t12 != t11) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        if (t12 != t10) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + t12 + " & " + t10 + ". This is likely due to a circular dependency.");
                        }
                    }
                    this.f9234b = t10;
                    this.f9233a = null;
                }
            }
        }
        return t10;
    }
}
