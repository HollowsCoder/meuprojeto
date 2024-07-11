package w7;

public final class a extends i {

    /* renamed from: a  reason: collision with root package name */
    public final String f9264a;

    /* renamed from: b  reason: collision with root package name */
    public final long f9265b;

    /* renamed from: c  reason: collision with root package name */
    public final long f9266c;

    public a(String str, long j8, long j10) {
        this.f9264a = str;
        this.f9265b = j8;
        this.f9266c = j10;
    }

    public final String a() {
        return this.f9264a;
    }

    public final long b() {
        return this.f9266c;
    }

    public final long c() {
        return this.f9265b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f9264a.equals(iVar.a()) && this.f9265b == iVar.c() && this.f9266c == iVar.b();
    }

    public final int hashCode() {
        long j8 = this.f9265b;
        long j10 = this.f9266c;
        return ((((this.f9264a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        return "InstallationTokenResult{token=" + this.f9264a + ", tokenExpirationTimestamp=" + this.f9265b + ", tokenCreationTimestamp=" + this.f9266c + "}";
    }
}
