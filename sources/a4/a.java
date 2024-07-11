package a4;

public final class a extends e {

    /* renamed from: b  reason: collision with root package name */
    public final long f62b;

    /* renamed from: c  reason: collision with root package name */
    public final int f63c;
    public final int d;

    /* renamed from: e  reason: collision with root package name */
    public final long f64e;

    /* renamed from: f  reason: collision with root package name */
    public final int f65f;

    public a(long j8, int i10, int i11, long j10, int i12) {
        this.f62b = j8;
        this.f63c = i10;
        this.d = i11;
        this.f64e = j10;
        this.f65f = i12;
    }

    public final int a() {
        return this.d;
    }

    public final long b() {
        return this.f64e;
    }

    public final int c() {
        return this.f63c;
    }

    public final int d() {
        return this.f65f;
    }

    public final long e() {
        return this.f62b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f62b == eVar.e() && this.f63c == eVar.c() && this.d == eVar.a() && this.f64e == eVar.b() && this.f65f == eVar.d();
    }

    public final int hashCode() {
        long j8 = this.f62b;
        long j10 = this.f64e;
        return ((((((((((int) (j8 ^ (j8 >>> 32))) ^ 1000003) * 1000003) ^ this.f63c) * 1000003) ^ this.d) * 1000003) ^ ((int) ((j10 >>> 32) ^ j10))) * 1000003) ^ this.f65f;
    }

    public final String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.f62b + ", loadBatchSize=" + this.f63c + ", criticalSectionEnterTimeoutMs=" + this.d + ", eventCleanUpAge=" + this.f64e + ", maxBlobByteSizePerRow=" + this.f65f + "}";
    }
}
