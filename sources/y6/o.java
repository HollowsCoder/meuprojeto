package y6;

import v7.b;

public final class o<T> implements b<T> {

    /* renamed from: c  reason: collision with root package name */
    public static final Object f9589c = new Object();

    /* renamed from: a  reason: collision with root package name */
    public volatile Object f9590a = f9589c;

    /* renamed from: b  reason: collision with root package name */
    public volatile b<T> f9591b;

    public o(b<T> bVar) {
        this.f9591b = bVar;
    }

    public final T get() {
        T t10 = this.f9590a;
        T t11 = f9589c;
        if (t10 == t11) {
            synchronized (this) {
                t10 = this.f9590a;
                if (t10 == t11) {
                    t10 = this.f9591b.get();
                    this.f9590a = t10;
                    this.f9591b = null;
                }
            }
        }
        return t10;
    }
}
