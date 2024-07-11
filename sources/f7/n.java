package f7;

import b0.d;
import com.karumi.dexter.BuildConfig;
import f7.a0;

public final class n extends a0.e.d.a.b.C0059a {

    /* renamed from: a  reason: collision with root package name */
    public final long f4835a;

    /* renamed from: b  reason: collision with root package name */
    public final long f4836b;

    /* renamed from: c  reason: collision with root package name */
    public final String f4837c;
    public final String d;

    public static final class a extends a0.e.d.a.b.C0059a.C0060a {

        /* renamed from: a  reason: collision with root package name */
        public Long f4838a;

        /* renamed from: b  reason: collision with root package name */
        public Long f4839b;

        /* renamed from: c  reason: collision with root package name */
        public String f4840c;
        public String d;

        public final n a() {
            String str;
            if (this.f4838a == null) {
                str = " baseAddress";
            } else {
                str = BuildConfig.FLAVOR;
            }
            if (this.f4839b == null) {
                str = str.concat(" size");
            }
            if (this.f4840c == null) {
                str = d.e(str, " name");
            }
            if (str.isEmpty()) {
                return new n(this.f4838a.longValue(), this.f4839b.longValue(), this.f4840c, this.d);
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }
    }

    public n(long j8, long j10, String str, String str2) {
        this.f4835a = j8;
        this.f4836b = j10;
        this.f4837c = str;
        this.d = str2;
    }

    public final long a() {
        return this.f4835a;
    }

    public final String b() {
        return this.f4837c;
    }

    public final long c() {
        return this.f4836b;
    }

    public final String d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a0.e.d.a.b.C0059a)) {
            return false;
        }
        a0.e.d.a.b.C0059a aVar = (a0.e.d.a.b.C0059a) obj;
        if (this.f4835a == aVar.a() && this.f4836b == aVar.c() && this.f4837c.equals(aVar.b())) {
            String str = this.d;
            String d10 = aVar.d();
            if (str == null) {
                if (d10 == null) {
                    return true;
                }
            } else if (str.equals(d10)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j8 = this.f4835a;
        long j10 = this.f4836b;
        int hashCode = (((((((int) (j8 ^ (j8 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j10 >>> 32) ^ j10))) * 1000003) ^ this.f4837c.hashCode()) * 1000003;
        String str = this.d;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BinaryImage{baseAddress=");
        sb.append(this.f4835a);
        sb.append(", size=");
        sb.append(this.f4836b);
        sb.append(", name=");
        sb.append(this.f4837c);
        sb.append(", uuid=");
        return d.g(sb, this.d, "}");
    }
}
