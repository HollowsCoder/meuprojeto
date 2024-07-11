package q3;

import b0.d;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final String f8225a;

    public b(String str) {
        if (str != null) {
            this.f8225a = str;
            return;
        }
        throw new NullPointerException("name is null");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        return this.f8225a.equals(((b) obj).f8225a);
    }

    public final int hashCode() {
        return this.f8225a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return d.g(new StringBuilder("Encoding{name=\""), this.f8225a, "\"}");
    }
}
