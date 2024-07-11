package s3;

import java.util.List;

public final class g extends m {

    /* renamed from: a  reason: collision with root package name */
    public final long f8772a;

    /* renamed from: b  reason: collision with root package name */
    public final long f8773b;

    /* renamed from: c  reason: collision with root package name */
    public final k f8774c;
    public final Integer d;

    /* renamed from: e  reason: collision with root package name */
    public final String f8775e;

    /* renamed from: f  reason: collision with root package name */
    public final List<l> f8776f;

    /* renamed from: g  reason: collision with root package name */
    public final p f8777g;

    public g() {
        throw null;
    }

    public g(long j8, long j10, k kVar, Integer num, String str, List list, p pVar) {
        this.f8772a = j8;
        this.f8773b = j10;
        this.f8774c = kVar;
        this.d = num;
        this.f8775e = str;
        this.f8776f = list;
        this.f8777g = pVar;
    }

    public final k a() {
        return this.f8774c;
    }

    public final List<l> b() {
        return this.f8776f;
    }

    public final Integer c() {
        return this.d;
    }

    public final String d() {
        return this.f8775e;
    }

    public final p e() {
        return this.f8777g;
    }

    public final boolean equals(Object obj) {
        k kVar;
        Integer num;
        String str;
        List<l> list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (this.f8772a == mVar.f() && this.f8773b == mVar.g() && ((kVar = this.f8774c) != null ? kVar.equals(mVar.a()) : mVar.a() == null) && ((num = this.d) != null ? num.equals(mVar.c()) : mVar.c() == null) && ((str = this.f8775e) != null ? str.equals(mVar.d()) : mVar.d() == null) && ((list = this.f8776f) != null ? list.equals(mVar.b()) : mVar.b() == null)) {
            p pVar = this.f8777g;
            p e10 = mVar.e();
            if (pVar == null) {
                if (e10 == null) {
                    return true;
                }
            } else if (pVar.equals(e10)) {
                return true;
            }
        }
        return false;
    }

    public final long f() {
        return this.f8772a;
    }

    public final long g() {
        return this.f8773b;
    }

    public final int hashCode() {
        long j8 = this.f8772a;
        long j10 = this.f8773b;
        int i10 = (((((int) (j8 ^ (j8 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j10 >>> 32) ^ j10))) * 1000003;
        int i11 = 0;
        k kVar = this.f8774c;
        int hashCode = (i10 ^ (kVar == null ? 0 : kVar.hashCode())) * 1000003;
        Integer num = this.d;
        int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f8775e;
        int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List<l> list = this.f8776f;
        int hashCode4 = (hashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        p pVar = this.f8777g;
        if (pVar != null) {
            i11 = pVar.hashCode();
        }
        return hashCode4 ^ i11;
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.f8772a + ", requestUptimeMs=" + this.f8773b + ", clientInfo=" + this.f8774c + ", logSource=" + this.d + ", logSourceName=" + this.f8775e + ", logEvents=" + this.f8776f + ", qosTier=" + this.f8777g + "}";
    }
}
