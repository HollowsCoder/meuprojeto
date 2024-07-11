package f7;

import b0.d;
import f7.a0;

public final class t extends a0.e.d.C0065d {

    /* renamed from: a  reason: collision with root package name */
    public final String f4869a;

    public t(String str) {
        this.f4869a = str;
    }

    public final String a() {
        return this.f4869a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a0.e.d.C0065d) {
            return this.f4869a.equals(((a0.e.d.C0065d) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f4869a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return d.g(new StringBuilder("Log{content="), this.f4869a, "}");
    }
}
