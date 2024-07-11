package s3;

import java.util.Arrays;
import s3.l;

public final class f extends l {

    /* renamed from: a  reason: collision with root package name */
    public final long f8760a;

    /* renamed from: b  reason: collision with root package name */
    public final Integer f8761b;

    /* renamed from: c  reason: collision with root package name */
    public final long f8762c;
    public final byte[] d;

    /* renamed from: e  reason: collision with root package name */
    public final String f8763e;

    /* renamed from: f  reason: collision with root package name */
    public final long f8764f;

    /* renamed from: g  reason: collision with root package name */
    public final o f8765g;

    public static final class a extends l.a {

        /* renamed from: a  reason: collision with root package name */
        public Long f8766a;

        /* renamed from: b  reason: collision with root package name */
        public Integer f8767b;

        /* renamed from: c  reason: collision with root package name */
        public Long f8768c;
        public byte[] d;

        /* renamed from: e  reason: collision with root package name */
        public String f8769e;

        /* renamed from: f  reason: collision with root package name */
        public Long f8770f;

        /* renamed from: g  reason: collision with root package name */
        public o f8771g;
    }

    public f(long j8, Integer num, long j10, byte[] bArr, String str, long j11, o oVar) {
        this.f8760a = j8;
        this.f8761b = num;
        this.f8762c = j10;
        this.d = bArr;
        this.f8763e = str;
        this.f8764f = j11;
        this.f8765g = oVar;
    }

    public final Integer a() {
        return this.f8761b;
    }

    public final long b() {
        return this.f8760a;
    }

    public final long c() {
        return this.f8762c;
    }

    public final o d() {
        return this.f8765g;
    }

    public final byte[] e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        Integer num;
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (this.f8760a == lVar.b() && ((num = this.f8761b) != null ? num.equals(lVar.a()) : lVar.a() == null) && this.f8762c == lVar.c()) {
            if (Arrays.equals(this.d, lVar instanceof f ? ((f) lVar).d : lVar.e()) && ((str = this.f8763e) != null ? str.equals(lVar.f()) : lVar.f() == null) && this.f8764f == lVar.g()) {
                o oVar = this.f8765g;
                o d10 = lVar.d();
                if (oVar == null) {
                    if (d10 == null) {
                        return true;
                    }
                } else if (oVar.equals(d10)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final String f() {
        return this.f8763e;
    }

    public final long g() {
        return this.f8764f;
    }

    public final int hashCode() {
        long j8 = this.f8760a;
        int i10 = (((int) (j8 ^ (j8 >>> 32))) ^ 1000003) * 1000003;
        int i11 = 0;
        Integer num = this.f8761b;
        int hashCode = num == null ? 0 : num.hashCode();
        long j10 = this.f8762c;
        int hashCode2 = (((((i10 ^ hashCode) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.d)) * 1000003;
        String str = this.f8763e;
        int hashCode3 = str == null ? 0 : str.hashCode();
        long j11 = this.f8764f;
        int i12 = (((hashCode2 ^ hashCode3) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        o oVar = this.f8765g;
        if (oVar != null) {
            i11 = oVar.hashCode();
        }
        return i12 ^ i11;
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.f8760a + ", eventCode=" + this.f8761b + ", eventUptimeMs=" + this.f8762c + ", sourceExtension=" + Arrays.toString(this.d) + ", sourceExtensionJsonProto3=" + this.f8763e + ", timezoneOffsetSeconds=" + this.f8764f + ", networkConnectionInfo=" + this.f8765g + "}";
    }
}
