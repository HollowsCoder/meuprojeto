package f7;

import b0.d;
import com.karumi.dexter.BuildConfig;
import f7.a0;

public final class u extends a0.e.C0066e {

    /* renamed from: a  reason: collision with root package name */
    public final int f4870a;

    /* renamed from: b  reason: collision with root package name */
    public final String f4871b;

    /* renamed from: c  reason: collision with root package name */
    public final String f4872c;
    public final boolean d;

    public static final class a extends a0.e.C0066e.a {

        /* renamed from: a  reason: collision with root package name */
        public Integer f4873a;

        /* renamed from: b  reason: collision with root package name */
        public String f4874b;

        /* renamed from: c  reason: collision with root package name */
        public String f4875c;
        public Boolean d;

        public final u a() {
            String str;
            if (this.f4873a == null) {
                str = " platform";
            } else {
                str = BuildConfig.FLAVOR;
            }
            if (this.f4874b == null) {
                str = str.concat(" version");
            }
            if (this.f4875c == null) {
                str = d.e(str, " buildVersion");
            }
            if (this.d == null) {
                str = d.e(str, " jailbroken");
            }
            if (str.isEmpty()) {
                return new u(this.f4873a.intValue(), this.f4874b, this.f4875c, this.d.booleanValue());
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }
    }

    public u(int i10, String str, String str2, boolean z) {
        this.f4870a = i10;
        this.f4871b = str;
        this.f4872c = str2;
        this.d = z;
    }

    public final String a() {
        return this.f4872c;
    }

    public final int b() {
        return this.f4870a;
    }

    public final String c() {
        return this.f4871b;
    }

    public final boolean d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a0.e.C0066e)) {
            return false;
        }
        a0.e.C0066e eVar = (a0.e.C0066e) obj;
        return this.f4870a == eVar.b() && this.f4871b.equals(eVar.c()) && this.f4872c.equals(eVar.a()) && this.d == eVar.d();
    }

    public final int hashCode() {
        return ((((((this.f4870a ^ 1000003) * 1000003) ^ this.f4871b.hashCode()) * 1000003) ^ this.f4872c.hashCode()) * 1000003) ^ (this.d ? 1231 : 1237);
    }

    public final String toString() {
        return "OperatingSystem{platform=" + this.f4870a + ", version=" + this.f4871b + ", buildVersion=" + this.f4872c + ", jailbroken=" + this.d + "}";
    }
}
