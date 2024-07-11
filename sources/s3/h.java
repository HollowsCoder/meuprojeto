package s3;

public final class h extends n {

    /* renamed from: a  reason: collision with root package name */
    public final long f8778a;

    public h(long j8) {
        this.f8778a = j8;
    }

    public final long b() {
        return this.f8778a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n) {
            return this.f8778a == ((n) obj).b();
        }
        return false;
    }

    public final int hashCode() {
        long j8 = this.f8778a;
        return ((int) ((j8 >>> 32) ^ j8)) ^ 1000003;
    }

    public final String toString() {
        return "LogResponse{nextRequestWaitMillis=" + this.f8778a + "}";
    }
}
