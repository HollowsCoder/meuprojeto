package f7;

import b0.d;
import com.karumi.dexter.BuildConfig;
import f7.a0;

public final class b extends a0 {

    /* renamed from: b  reason: collision with root package name */
    public final String f4738b;

    /* renamed from: c  reason: collision with root package name */
    public final String f4739c;
    public final int d;

    /* renamed from: e  reason: collision with root package name */
    public final String f4740e;

    /* renamed from: f  reason: collision with root package name */
    public final String f4741f;

    /* renamed from: g  reason: collision with root package name */
    public final String f4742g;

    /* renamed from: h  reason: collision with root package name */
    public final a0.e f4743h;

    /* renamed from: i  reason: collision with root package name */
    public final a0.d f4744i;

    public static final class a extends a0.b {

        /* renamed from: a  reason: collision with root package name */
        public String f4745a;

        /* renamed from: b  reason: collision with root package name */
        public String f4746b;

        /* renamed from: c  reason: collision with root package name */
        public Integer f4747c;
        public String d;

        /* renamed from: e  reason: collision with root package name */
        public String f4748e;

        /* renamed from: f  reason: collision with root package name */
        public String f4749f;

        /* renamed from: g  reason: collision with root package name */
        public a0.e f4750g;

        /* renamed from: h  reason: collision with root package name */
        public a0.d f4751h;

        public a() {
        }

        public a(a0 a0Var) {
            this.f4745a = a0Var.g();
            this.f4746b = a0Var.c();
            this.f4747c = Integer.valueOf(a0Var.f());
            this.d = a0Var.d();
            this.f4748e = a0Var.a();
            this.f4749f = a0Var.b();
            this.f4750g = a0Var.h();
            this.f4751h = a0Var.e();
        }

        public final b a() {
            String str;
            if (this.f4745a == null) {
                str = " sdkVersion";
            } else {
                str = BuildConfig.FLAVOR;
            }
            if (this.f4746b == null) {
                str = str.concat(" gmpAppId");
            }
            if (this.f4747c == null) {
                str = d.e(str, " platform");
            }
            if (this.d == null) {
                str = d.e(str, " installationUuid");
            }
            if (this.f4748e == null) {
                str = d.e(str, " buildVersion");
            }
            if (this.f4749f == null) {
                str = d.e(str, " displayVersion");
            }
            if (str.isEmpty()) {
                return new b(this.f4745a, this.f4746b, this.f4747c.intValue(), this.d, this.f4748e, this.f4749f, this.f4750g, this.f4751h);
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }
    }

    public b(String str, String str2, int i10, String str3, String str4, String str5, a0.e eVar, a0.d dVar) {
        this.f4738b = str;
        this.f4739c = str2;
        this.d = i10;
        this.f4740e = str3;
        this.f4741f = str4;
        this.f4742g = str5;
        this.f4743h = eVar;
        this.f4744i = dVar;
    }

    public final String a() {
        return this.f4741f;
    }

    public final String b() {
        return this.f4742g;
    }

    public final String c() {
        return this.f4739c;
    }

    public final String d() {
        return this.f4740e;
    }

    public final a0.d e() {
        return this.f4744i;
    }

    public final boolean equals(Object obj) {
        a0.e eVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        if (this.f4738b.equals(a0Var.g()) && this.f4739c.equals(a0Var.c()) && this.d == a0Var.f() && this.f4740e.equals(a0Var.d()) && this.f4741f.equals(a0Var.a()) && this.f4742g.equals(a0Var.b()) && ((eVar = this.f4743h) != null ? eVar.equals(a0Var.h()) : a0Var.h() == null)) {
            a0.d dVar = this.f4744i;
            a0.d e10 = a0Var.e();
            if (dVar == null) {
                if (e10 == null) {
                    return true;
                }
            } else if (dVar.equals(e10)) {
                return true;
            }
        }
        return false;
    }

    public final int f() {
        return this.d;
    }

    public final String g() {
        return this.f4738b;
    }

    public final a0.e h() {
        return this.f4743h;
    }

    public final int hashCode() {
        int hashCode = (((((((((((this.f4738b.hashCode() ^ 1000003) * 1000003) ^ this.f4739c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.f4740e.hashCode()) * 1000003) ^ this.f4741f.hashCode()) * 1000003) ^ this.f4742g.hashCode()) * 1000003;
        int i10 = 0;
        a0.e eVar = this.f4743h;
        int hashCode2 = (hashCode ^ (eVar == null ? 0 : eVar.hashCode())) * 1000003;
        a0.d dVar = this.f4744i;
        if (dVar != null) {
            i10 = dVar.hashCode();
        }
        return hashCode2 ^ i10;
    }

    public final String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f4738b + ", gmpAppId=" + this.f4739c + ", platform=" + this.d + ", installationUuid=" + this.f4740e + ", buildVersion=" + this.f4741f + ", displayVersion=" + this.f4742g + ", session=" + this.f4743h + ", ndkPayload=" + this.f4744i + "}";
    }
}
