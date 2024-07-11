package u3;

import u3.g;

public final class b extends g {

    /* renamed from: a  reason: collision with root package name */
    public final g.a f9088a;

    /* renamed from: b  reason: collision with root package name */
    public final long f9089b;

    public b(g.a aVar, long j8) {
        if (aVar != null) {
            this.f9088a = aVar;
            this.f9089b = j8;
            return;
        }
        throw new NullPointerException("Null status");
    }

    public final long a() {
        return this.f9089b;
    }

    public final g.a b() {
        return this.f9088a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f9088a.equals(gVar.b()) && this.f9089b == gVar.a();
    }

    public final int hashCode() {
        long j8 = this.f9089b;
        return ((this.f9088a.hashCode() ^ 1000003) * 1000003) ^ ((int) ((j8 >>> 32) ^ j8));
    }

    public final String toString() {
        return "BackendResponse{status=" + this.f9088a + ", nextRequestWaitMillis=" + this.f9089b + "}";
    }
}
