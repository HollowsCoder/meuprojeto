package z7;

import com.karumi.dexter.BuildConfig;
import z7.f;

public final class b extends f {

    /* renamed from: a  reason: collision with root package name */
    public final String f9944a;

    /* renamed from: b  reason: collision with root package name */
    public final long f9945b;

    /* renamed from: c  reason: collision with root package name */
    public final f.b f9946c;

    public static final class a extends f.a {

        /* renamed from: a  reason: collision with root package name */
        public Long f9947a;

        /* renamed from: b  reason: collision with root package name */
        public f.b f9948b;

        public final b a() {
            String str = this.f9947a == null ? " tokenExpirationTimestamp" : BuildConfig.FLAVOR;
            if (str.isEmpty()) {
                return new b((String) null, this.f9947a.longValue(), this.f9948b);
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }
    }

    public b(String str, long j8, f.b bVar) {
        this.f9944a = str;
        this.f9945b = j8;
        this.f9946c = bVar;
    }

    public final f.b a() {
        return this.f9946c;
    }

    public final String b() {
        return this.f9944a;
    }

    public final long c() {
        return this.f9945b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        String str = this.f9944a;
        if (str != null ? str.equals(fVar.b()) : fVar.b() == null) {
            if (this.f9945b == fVar.c()) {
                f.b bVar = this.f9946c;
                if (bVar == null) {
                    if (fVar.a() == null) {
                        return true;
                    }
                } else if (bVar.equals(fVar.a())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = 0;
        String str = this.f9944a;
        int hashCode = str == null ? 0 : str.hashCode();
        long j8 = this.f9945b;
        int i11 = (((hashCode ^ 1000003) * 1000003) ^ ((int) ((j8 >>> 32) ^ j8))) * 1000003;
        f.b bVar = this.f9946c;
        if (bVar != null) {
            i10 = bVar.hashCode();
        }
        return i10 ^ i11;
    }

    public final String toString() {
        return "TokenResult{token=" + this.f9944a + ", tokenExpirationTimestamp=" + this.f9945b + ", responseCode=" + this.f9946c + "}";
    }
}
