package s2;

import java.security.MessageDigest;

public final class f implements q2.f {

    /* renamed from: b  reason: collision with root package name */
    public final q2.f f8576b;

    /* renamed from: c  reason: collision with root package name */
    public final q2.f f8577c;

    public f(q2.f fVar, q2.f fVar2) {
        this.f8576b = fVar;
        this.f8577c = fVar2;
    }

    public final void a(MessageDigest messageDigest) {
        this.f8576b.a(messageDigest);
        this.f8577c.a(messageDigest);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f8576b.equals(fVar.f8576b) && this.f8577c.equals(fVar.f8577c);
    }

    public final int hashCode() {
        return this.f8577c.hashCode() + (this.f8576b.hashCode() * 31);
    }

    public final String toString() {
        return "DataCacheKey{sourceKey=" + this.f8576b + ", signature=" + this.f8577c + '}';
    }
}
