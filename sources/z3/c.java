package z3;

import b0.d;
import com.karumi.dexter.BuildConfig;
import java.util.Set;
import z3.e;

public final class c extends e.a {

    /* renamed from: a  reason: collision with root package name */
    public final long f9876a;

    /* renamed from: b  reason: collision with root package name */
    public final long f9877b;

    /* renamed from: c  reason: collision with root package name */
    public final Set<e.b> f9878c;

    public static final class a extends e.a.C0173a {

        /* renamed from: a  reason: collision with root package name */
        public Long f9879a;

        /* renamed from: b  reason: collision with root package name */
        public Long f9880b;

        /* renamed from: c  reason: collision with root package name */
        public Set<e.b> f9881c;

        public final c a() {
            String str;
            if (this.f9879a == null) {
                str = " delta";
            } else {
                str = BuildConfig.FLAVOR;
            }
            if (this.f9880b == null) {
                str = str.concat(" maxAllowedDelay");
            }
            if (this.f9881c == null) {
                str = d.e(str, " flags");
            }
            if (str.isEmpty()) {
                return new c(this.f9879a.longValue(), this.f9880b.longValue(), this.f9881c);
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }
    }

    public c(long j8, long j10, Set set) {
        this.f9876a = j8;
        this.f9877b = j10;
        this.f9878c = set;
    }

    public final long a() {
        return this.f9876a;
    }

    public final Set<e.b> b() {
        return this.f9878c;
    }

    public final long c() {
        return this.f9877b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e.a)) {
            return false;
        }
        e.a aVar = (e.a) obj;
        return this.f9876a == aVar.a() && this.f9877b == aVar.c() && this.f9878c.equals(aVar.b());
    }

    public final int hashCode() {
        long j8 = this.f9876a;
        long j10 = this.f9877b;
        return ((((((int) (j8 ^ (j8 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j10 >>> 32) ^ j10))) * 1000003) ^ this.f9878c.hashCode();
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f9876a + ", maxAllowedDelay=" + this.f9877b + ", flags=" + this.f9878c + "}";
    }
}
