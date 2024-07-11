package f7;

import b0.d;
import com.karumi.dexter.BuildConfig;
import f7.a0;

public final class k extends a0.e.d {

    /* renamed from: a  reason: collision with root package name */
    public final long f4815a;

    /* renamed from: b  reason: collision with root package name */
    public final String f4816b;

    /* renamed from: c  reason: collision with root package name */
    public final a0.e.d.a f4817c;
    public final a0.e.d.c d;

    /* renamed from: e  reason: collision with root package name */
    public final a0.e.d.C0065d f4818e;

    public static final class a extends a0.e.d.b {

        /* renamed from: a  reason: collision with root package name */
        public Long f4819a;

        /* renamed from: b  reason: collision with root package name */
        public String f4820b;

        /* renamed from: c  reason: collision with root package name */
        public a0.e.d.a f4821c;
        public a0.e.d.c d;

        /* renamed from: e  reason: collision with root package name */
        public a0.e.d.C0065d f4822e;

        public a() {
        }

        public a(a0.e.d dVar) {
            this.f4819a = Long.valueOf(dVar.d());
            this.f4820b = dVar.e();
            this.f4821c = dVar.a();
            this.d = dVar.b();
            this.f4822e = dVar.c();
        }

        public final k a() {
            String str;
            if (this.f4819a == null) {
                str = " timestamp";
            } else {
                str = BuildConfig.FLAVOR;
            }
            if (this.f4820b == null) {
                str = str.concat(" type");
            }
            if (this.f4821c == null) {
                str = d.e(str, " app");
            }
            if (this.d == null) {
                str = d.e(str, " device");
            }
            if (str.isEmpty()) {
                return new k(this.f4819a.longValue(), this.f4820b, this.f4821c, this.d, this.f4822e);
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }
    }

    public k(long j8, String str, a0.e.d.a aVar, a0.e.d.c cVar, a0.e.d.C0065d dVar) {
        this.f4815a = j8;
        this.f4816b = str;
        this.f4817c = aVar;
        this.d = cVar;
        this.f4818e = dVar;
    }

    public final a0.e.d.a a() {
        return this.f4817c;
    }

    public final a0.e.d.c b() {
        return this.d;
    }

    public final a0.e.d.C0065d c() {
        return this.f4818e;
    }

    public final long d() {
        return this.f4815a;
    }

    public final String e() {
        return this.f4816b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a0.e.d)) {
            return false;
        }
        a0.e.d dVar = (a0.e.d) obj;
        if (this.f4815a == dVar.d() && this.f4816b.equals(dVar.e()) && this.f4817c.equals(dVar.a()) && this.d.equals(dVar.b())) {
            a0.e.d.C0065d dVar2 = this.f4818e;
            a0.e.d.C0065d c10 = dVar.c();
            if (dVar2 == null) {
                if (c10 == null) {
                    return true;
                }
            } else if (dVar2.equals(c10)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j8 = this.f4815a;
        int hashCode = (((((((((int) ((j8 >>> 32) ^ j8)) ^ 1000003) * 1000003) ^ this.f4816b.hashCode()) * 1000003) ^ this.f4817c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        a0.e.d.C0065d dVar = this.f4818e;
        return hashCode ^ (dVar == null ? 0 : dVar.hashCode());
    }

    public final String toString() {
        return "Event{timestamp=" + this.f4815a + ", type=" + this.f4816b + ", app=" + this.f4817c + ", device=" + this.d + ", log=" + this.f4818e + "}";
    }
}
