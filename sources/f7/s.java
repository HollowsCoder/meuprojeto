package f7;

import b0.d;
import com.karumi.dexter.BuildConfig;
import f7.a0;

public final class s extends a0.e.d.c {

    /* renamed from: a  reason: collision with root package name */
    public final Double f4859a;

    /* renamed from: b  reason: collision with root package name */
    public final int f4860b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f4861c;
    public final int d;

    /* renamed from: e  reason: collision with root package name */
    public final long f4862e;

    /* renamed from: f  reason: collision with root package name */
    public final long f4863f;

    public static final class a extends a0.e.d.c.a {

        /* renamed from: a  reason: collision with root package name */
        public Double f4864a;

        /* renamed from: b  reason: collision with root package name */
        public Integer f4865b;

        /* renamed from: c  reason: collision with root package name */
        public Boolean f4866c;
        public Integer d;

        /* renamed from: e  reason: collision with root package name */
        public Long f4867e;

        /* renamed from: f  reason: collision with root package name */
        public Long f4868f;

        public final s a() {
            String str;
            if (this.f4865b == null) {
                str = " batteryVelocity";
            } else {
                str = BuildConfig.FLAVOR;
            }
            if (this.f4866c == null) {
                str = str.concat(" proximityOn");
            }
            if (this.d == null) {
                str = d.e(str, " orientation");
            }
            if (this.f4867e == null) {
                str = d.e(str, " ramUsed");
            }
            if (this.f4868f == null) {
                str = d.e(str, " diskUsed");
            }
            if (str.isEmpty()) {
                return new s(this.f4864a, this.f4865b.intValue(), this.f4866c.booleanValue(), this.d.intValue(), this.f4867e.longValue(), this.f4868f.longValue());
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }
    }

    public s(Double d10, int i10, boolean z, int i11, long j8, long j10) {
        this.f4859a = d10;
        this.f4860b = i10;
        this.f4861c = z;
        this.d = i11;
        this.f4862e = j8;
        this.f4863f = j10;
    }

    public final Double a() {
        return this.f4859a;
    }

    public final int b() {
        return this.f4860b;
    }

    public final long c() {
        return this.f4863f;
    }

    public final int d() {
        return this.d;
    }

    public final long e() {
        return this.f4862e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a0.e.d.c)) {
            return false;
        }
        a0.e.d.c cVar = (a0.e.d.c) obj;
        Double d10 = this.f4859a;
        if (d10 != null ? d10.equals(cVar.a()) : cVar.a() == null) {
            if (this.f4860b == cVar.b() && this.f4861c == cVar.f() && this.d == cVar.d() && this.f4862e == cVar.e() && this.f4863f == cVar.c()) {
                return true;
            }
        }
        return false;
    }

    public final boolean f() {
        return this.f4861c;
    }

    public final int hashCode() {
        Double d10 = this.f4859a;
        int hashCode = ((((d10 == null ? 0 : d10.hashCode()) ^ 1000003) * 1000003) ^ this.f4860b) * 1000003;
        int i10 = this.f4861c ? 1231 : 1237;
        long j8 = this.f4862e;
        long j10 = this.f4863f;
        return ((((((hashCode ^ i10) * 1000003) ^ this.d) * 1000003) ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        return "Device{batteryLevel=" + this.f4859a + ", batteryVelocity=" + this.f4860b + ", proximityOn=" + this.f4861c + ", orientation=" + this.d + ", ramUsed=" + this.f4862e + ", diskUsed=" + this.f4863f + "}";
    }
}
