package f7;

import f7.a0;

public final class p extends a0.e.d.a.b.c {

    /* renamed from: a  reason: collision with root package name */
    public final String f4845a;

    /* renamed from: b  reason: collision with root package name */
    public final String f4846b;

    /* renamed from: c  reason: collision with root package name */
    public final long f4847c;

    public p(String str, String str2, long j8) {
        this.f4845a = str;
        this.f4846b = str2;
        this.f4847c = j8;
    }

    public final long a() {
        return this.f4847c;
    }

    public final String b() {
        return this.f4846b;
    }

    public final String c() {
        return this.f4845a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a0.e.d.a.b.c)) {
            return false;
        }
        a0.e.d.a.b.c cVar = (a0.e.d.a.b.c) obj;
        return this.f4845a.equals(cVar.c()) && this.f4846b.equals(cVar.b()) && this.f4847c == cVar.a();
    }

    public final int hashCode() {
        long j8 = this.f4847c;
        return ((((this.f4845a.hashCode() ^ 1000003) * 1000003) ^ this.f4846b.hashCode()) * 1000003) ^ ((int) ((j8 >>> 32) ^ j8));
    }

    public final String toString() {
        return "Signal{name=" + this.f4845a + ", code=" + this.f4846b + ", address=" + this.f4847c + "}";
    }
}
