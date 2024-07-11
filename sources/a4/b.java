package a4;

import t3.n;
import t3.s;

public final class b extends j {

    /* renamed from: a  reason: collision with root package name */
    public final long f66a;

    /* renamed from: b  reason: collision with root package name */
    public final s f67b;

    /* renamed from: c  reason: collision with root package name */
    public final n f68c;

    public b(long j8, s sVar, n nVar) {
        this.f66a = j8;
        if (sVar != null) {
            this.f67b = sVar;
            if (nVar != null) {
                this.f68c = nVar;
                return;
            }
            throw new NullPointerException("Null event");
        }
        throw new NullPointerException("Null transportContext");
    }

    public final n a() {
        return this.f68c;
    }

    public final long b() {
        return this.f66a;
    }

    public final s c() {
        return this.f67b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f66a == jVar.b() && this.f67b.equals(jVar.c()) && this.f68c.equals(jVar.a());
    }

    public final int hashCode() {
        long j8 = this.f66a;
        return ((((((int) ((j8 >>> 32) ^ j8)) ^ 1000003) * 1000003) ^ this.f67b.hashCode()) * 1000003) ^ this.f68c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f66a + ", transportContext=" + this.f67b + ", event=" + this.f68c + "}";
    }
}
