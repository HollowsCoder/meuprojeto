package f7;

import b0.d;
import com.karumi.dexter.BuildConfig;
import f7.a0;

public final class c extends a0.a {

    /* renamed from: a  reason: collision with root package name */
    public final int f4753a;

    /* renamed from: b  reason: collision with root package name */
    public final String f4754b;

    /* renamed from: c  reason: collision with root package name */
    public final int f4755c;
    public final int d;

    /* renamed from: e  reason: collision with root package name */
    public final long f4756e;

    /* renamed from: f  reason: collision with root package name */
    public final long f4757f;

    /* renamed from: g  reason: collision with root package name */
    public final long f4758g;

    /* renamed from: h  reason: collision with root package name */
    public final String f4759h;

    public static final class a extends a0.a.C0056a {

        /* renamed from: a  reason: collision with root package name */
        public Integer f4760a;

        /* renamed from: b  reason: collision with root package name */
        public String f4761b;

        /* renamed from: c  reason: collision with root package name */
        public Integer f4762c;
        public Integer d;

        /* renamed from: e  reason: collision with root package name */
        public Long f4763e;

        /* renamed from: f  reason: collision with root package name */
        public Long f4764f;

        /* renamed from: g  reason: collision with root package name */
        public Long f4765g;

        /* renamed from: h  reason: collision with root package name */
        public String f4766h;

        public final c a() {
            String str;
            if (this.f4760a == null) {
                str = " pid";
            } else {
                str = BuildConfig.FLAVOR;
            }
            if (this.f4761b == null) {
                str = str.concat(" processName");
            }
            if (this.f4762c == null) {
                str = d.e(str, " reasonCode");
            }
            if (this.d == null) {
                str = d.e(str, " importance");
            }
            if (this.f4763e == null) {
                str = d.e(str, " pss");
            }
            if (this.f4764f == null) {
                str = d.e(str, " rss");
            }
            if (this.f4765g == null) {
                str = d.e(str, " timestamp");
            }
            if (str.isEmpty()) {
                return new c(this.f4760a.intValue(), this.f4761b, this.f4762c.intValue(), this.d.intValue(), this.f4763e.longValue(), this.f4764f.longValue(), this.f4765g.longValue(), this.f4766h);
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }
    }

    public c(int i10, String str, int i11, int i12, long j8, long j10, long j11, String str2) {
        this.f4753a = i10;
        this.f4754b = str;
        this.f4755c = i11;
        this.d = i12;
        this.f4756e = j8;
        this.f4757f = j10;
        this.f4758g = j11;
        this.f4759h = str2;
    }

    public final int a() {
        return this.d;
    }

    public final int b() {
        return this.f4753a;
    }

    public final String c() {
        return this.f4754b;
    }

    public final long d() {
        return this.f4756e;
    }

    public final int e() {
        return this.f4755c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a0.a)) {
            return false;
        }
        a0.a aVar = (a0.a) obj;
        if (this.f4753a == aVar.b() && this.f4754b.equals(aVar.c()) && this.f4755c == aVar.e() && this.d == aVar.a() && this.f4756e == aVar.d() && this.f4757f == aVar.f() && this.f4758g == aVar.g()) {
            String str = this.f4759h;
            String h10 = aVar.h();
            if (str == null) {
                if (h10 == null) {
                    return true;
                }
            } else if (str.equals(h10)) {
                return true;
            }
        }
        return false;
    }

    public final long f() {
        return this.f4757f;
    }

    public final long g() {
        return this.f4758g;
    }

    public final String h() {
        return this.f4759h;
    }

    public final int hashCode() {
        long j8 = this.f4756e;
        long j10 = this.f4757f;
        long j11 = this.f4758g;
        int hashCode = (((((((((((((this.f4753a ^ 1000003) * 1000003) ^ this.f4754b.hashCode()) * 1000003) ^ this.f4755c) * 1000003) ^ this.d) * 1000003) ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        String str = this.f4759h;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ApplicationExitInfo{pid=");
        sb.append(this.f4753a);
        sb.append(", processName=");
        sb.append(this.f4754b);
        sb.append(", reasonCode=");
        sb.append(this.f4755c);
        sb.append(", importance=");
        sb.append(this.d);
        sb.append(", pss=");
        sb.append(this.f4756e);
        sb.append(", rss=");
        sb.append(this.f4757f);
        sb.append(", timestamp=");
        sb.append(this.f4758g);
        sb.append(", traceFile=");
        return d.g(sb, this.f4759h, "}");
    }
}
