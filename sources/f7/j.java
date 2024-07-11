package f7;

import b0.d;
import com.karumi.dexter.BuildConfig;
import f7.a0;

public final class j extends a0.e.c {

    /* renamed from: a  reason: collision with root package name */
    public final int f4799a;

    /* renamed from: b  reason: collision with root package name */
    public final String f4800b;

    /* renamed from: c  reason: collision with root package name */
    public final int f4801c;
    public final long d;

    /* renamed from: e  reason: collision with root package name */
    public final long f4802e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f4803f;

    /* renamed from: g  reason: collision with root package name */
    public final int f4804g;

    /* renamed from: h  reason: collision with root package name */
    public final String f4805h;

    /* renamed from: i  reason: collision with root package name */
    public final String f4806i;

    public static final class a extends a0.e.c.a {

        /* renamed from: a  reason: collision with root package name */
        public Integer f4807a;

        /* renamed from: b  reason: collision with root package name */
        public String f4808b;

        /* renamed from: c  reason: collision with root package name */
        public Integer f4809c;
        public Long d;

        /* renamed from: e  reason: collision with root package name */
        public Long f4810e;

        /* renamed from: f  reason: collision with root package name */
        public Boolean f4811f;

        /* renamed from: g  reason: collision with root package name */
        public Integer f4812g;

        /* renamed from: h  reason: collision with root package name */
        public String f4813h;

        /* renamed from: i  reason: collision with root package name */
        public String f4814i;

        public final j a() {
            String str;
            if (this.f4807a == null) {
                str = " arch";
            } else {
                str = BuildConfig.FLAVOR;
            }
            if (this.f4808b == null) {
                str = str.concat(" model");
            }
            if (this.f4809c == null) {
                str = d.e(str, " cores");
            }
            if (this.d == null) {
                str = d.e(str, " ram");
            }
            if (this.f4810e == null) {
                str = d.e(str, " diskSpace");
            }
            if (this.f4811f == null) {
                str = d.e(str, " simulator");
            }
            if (this.f4812g == null) {
                str = d.e(str, " state");
            }
            if (this.f4813h == null) {
                str = d.e(str, " manufacturer");
            }
            if (this.f4814i == null) {
                str = d.e(str, " modelClass");
            }
            if (str.isEmpty()) {
                return new j(this.f4807a.intValue(), this.f4808b, this.f4809c.intValue(), this.d.longValue(), this.f4810e.longValue(), this.f4811f.booleanValue(), this.f4812g.intValue(), this.f4813h, this.f4814i);
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }
    }

    public j(int i10, String str, int i11, long j8, long j10, boolean z, int i12, String str2, String str3) {
        this.f4799a = i10;
        this.f4800b = str;
        this.f4801c = i11;
        this.d = j8;
        this.f4802e = j10;
        this.f4803f = z;
        this.f4804g = i12;
        this.f4805h = str2;
        this.f4806i = str3;
    }

    public final int a() {
        return this.f4799a;
    }

    public final int b() {
        return this.f4801c;
    }

    public final long c() {
        return this.f4802e;
    }

    public final String d() {
        return this.f4805h;
    }

    public final String e() {
        return this.f4800b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a0.e.c)) {
            return false;
        }
        a0.e.c cVar = (a0.e.c) obj;
        return this.f4799a == cVar.a() && this.f4800b.equals(cVar.e()) && this.f4801c == cVar.b() && this.d == cVar.g() && this.f4802e == cVar.c() && this.f4803f == cVar.i() && this.f4804g == cVar.h() && this.f4805h.equals(cVar.d()) && this.f4806i.equals(cVar.f());
    }

    public final String f() {
        return this.f4806i;
    }

    public final long g() {
        return this.d;
    }

    public final int h() {
        return this.f4804g;
    }

    public final int hashCode() {
        long j8 = this.d;
        long j10 = this.f4802e;
        return ((((((((((((((((this.f4799a ^ 1000003) * 1000003) ^ this.f4800b.hashCode()) * 1000003) ^ this.f4801c) * 1000003) ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ (this.f4803f ? 1231 : 1237)) * 1000003) ^ this.f4804g) * 1000003) ^ this.f4805h.hashCode()) * 1000003) ^ this.f4806i.hashCode();
    }

    public final boolean i() {
        return this.f4803f;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Device{arch=");
        sb.append(this.f4799a);
        sb.append(", model=");
        sb.append(this.f4800b);
        sb.append(", cores=");
        sb.append(this.f4801c);
        sb.append(", ram=");
        sb.append(this.d);
        sb.append(", diskSpace=");
        sb.append(this.f4802e);
        sb.append(", simulator=");
        sb.append(this.f4803f);
        sb.append(", state=");
        sb.append(this.f4804g);
        sb.append(", manufacturer=");
        sb.append(this.f4805h);
        sb.append(", modelClass=");
        return d.g(sb, this.f4806i, "}");
    }
}
