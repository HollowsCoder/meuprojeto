package f7;

import b0.d;
import f7.a0;

public final class v extends a0.e.f {

    /* renamed from: a  reason: collision with root package name */
    public final String f4876a;

    public v(String str) {
        this.f4876a = str;
    }

    public final String a() {
        return this.f4876a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a0.e.f) {
            return this.f4876a.equals(((a0.e.f) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f4876a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return d.g(new StringBuilder("User{identifier="), this.f4876a, "}");
    }
}
