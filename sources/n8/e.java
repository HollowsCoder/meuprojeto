package n8;

import java.io.Serializable;
import z8.g;

public final class e<T> implements Serializable {

    public static final class a implements Serializable {

        /* renamed from: o  reason: collision with root package name */
        public final Throwable f7497o;

        public a(Throwable th) {
            g.f(th, "exception");
            this.f7497o = th;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                if (g.a(this.f7497o, ((a) obj).f7497o)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return this.f7497o.hashCode();
        }

        public final String toString() {
            return "Failure(" + this.f7497o + ')';
        }
    }

    public static final Throwable a(Object obj) {
        if (obj instanceof a) {
            return ((a) obj).f7497o;
        }
        return null;
    }
}
