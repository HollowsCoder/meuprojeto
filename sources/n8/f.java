package n8;

import java.io.Serializable;
import n.e;
import y8.a;
import z8.g;

public final class f<T> implements Serializable {

    /* renamed from: o  reason: collision with root package name */
    public a<? extends T> f7498o;

    /* renamed from: p  reason: collision with root package name */
    public volatile Object f7499p = e.f7298r;

    /* renamed from: q  reason: collision with root package name */
    public final Object f7500q = this;

    public f(a aVar) {
        this.f7498o = aVar;
    }

    public final T a() {
        T t10;
        T t11 = this.f7499p;
        T t12 = e.f7298r;
        if (t11 != t12) {
            return t11;
        }
        synchronized (this.f7500q) {
            t10 = this.f7499p;
            if (t10 == t12) {
                a aVar = this.f7498o;
                g.c(aVar);
                t10 = aVar.n();
                this.f7499p = t10;
                this.f7498o = null;
            }
        }
        return t10;
    }

    public final String toString() {
        boolean z;
        if (this.f7499p != e.f7298r) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return String.valueOf(a());
        }
        return "Lazy value not initialized yet.";
    }
}
