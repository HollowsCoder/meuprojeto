package l3;

import java.security.MessageDigest;
import q2.f;
import s6.a;

public final class b implements f {

    /* renamed from: b  reason: collision with root package name */
    public final Object f6871b;

    public b(Object obj) {
        a.n(obj);
        this.f6871b = obj;
    }

    public final void a(MessageDigest messageDigest) {
        messageDigest.update(this.f6871b.toString().getBytes(f.f8216a));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return this.f6871b.equals(((b) obj).f6871b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6871b.hashCode();
    }

    public final String toString() {
        return "ObjectKey{object=" + this.f6871b + '}';
    }
}
