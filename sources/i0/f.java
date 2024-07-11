package i0;

import java.util.Objects;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final Object f5990a;

    public f(Object obj) {
        this.f5990a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f5990a, ((f) obj).f5990a);
    }

    public final int hashCode() {
        Object obj = this.f5990a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f5990a + "}";
    }
}
