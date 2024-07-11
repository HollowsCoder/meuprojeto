package t3;

import b0.d;
import com.karumi.dexter.BuildConfig;
import java.util.Map;
import t3.n;

public final class h extends n {

    /* renamed from: a  reason: collision with root package name */
    public final String f8944a;

    /* renamed from: b  reason: collision with root package name */
    public final Integer f8945b;

    /* renamed from: c  reason: collision with root package name */
    public final m f8946c;
    public final long d;

    /* renamed from: e  reason: collision with root package name */
    public final long f8947e;

    /* renamed from: f  reason: collision with root package name */
    public final Map<String, String> f8948f;

    public static final class a extends n.a {

        /* renamed from: a  reason: collision with root package name */
        public String f8949a;

        /* renamed from: b  reason: collision with root package name */
        public Integer f8950b;

        /* renamed from: c  reason: collision with root package name */
        public m f8951c;
        public Long d;

        /* renamed from: e  reason: collision with root package name */
        public Long f8952e;

        /* renamed from: f  reason: collision with root package name */
        public Map<String, String> f8953f;

        public final h b() {
            String str;
            if (this.f8949a == null) {
                str = " transportName";
            } else {
                str = BuildConfig.FLAVOR;
            }
            if (this.f8951c == null) {
                str = str.concat(" encodedPayload");
            }
            if (this.d == null) {
                str = d.e(str, " eventMillis");
            }
            if (this.f8952e == null) {
                str = d.e(str, " uptimeMillis");
            }
            if (this.f8953f == null) {
                str = d.e(str, " autoMetadata");
            }
            if (str.isEmpty()) {
                return new h(this.f8949a, this.f8950b, this.f8951c, this.d.longValue(), this.f8952e.longValue(), this.f8953f);
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }

        public final a c(m mVar) {
            if (mVar != null) {
                this.f8951c = mVar;
                return this;
            }
            throw new NullPointerException("Null encodedPayload");
        }

        public final a d(String str) {
            if (str != null) {
                this.f8949a = str;
                return this;
            }
            throw new NullPointerException("Null transportName");
        }
    }

    public h(String str, Integer num, m mVar, long j8, long j10, Map map) {
        this.f8944a = str;
        this.f8945b = num;
        this.f8946c = mVar;
        this.d = j8;
        this.f8947e = j10;
        this.f8948f = map;
    }

    public final Map<String, String> b() {
        return this.f8948f;
    }

    public final Integer c() {
        return this.f8945b;
    }

    public final m d() {
        return this.f8946c;
    }

    public final long e() {
        return this.d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r1 = r7.f8945b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r8 instanceof t3.n
            r2 = 0
            if (r1 == 0) goto L_0x005b
            t3.n r8 = (t3.n) r8
            java.lang.String r1 = r8.g()
            java.lang.String r3 = r7.f8944a
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x0059
            java.lang.Integer r1 = r7.f8945b
            if (r1 != 0) goto L_0x0022
            java.lang.Integer r1 = r8.c()
            if (r1 != 0) goto L_0x0059
            goto L_0x002c
        L_0x0022:
            java.lang.Integer r3 = r8.c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0059
        L_0x002c:
            t3.m r1 = r7.f8946c
            t3.m r3 = r8.d()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0059
            long r3 = r7.d
            long r5 = r8.e()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0059
            long r3 = r7.f8947e
            long r5 = r8.h()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0059
            java.util.Map<java.lang.String, java.lang.String> r1 = r7.f8948f
            java.util.Map r8 = r8.b()
            boolean r8 = r1.equals(r8)
            if (r8 == 0) goto L_0x0059
            goto L_0x005a
        L_0x0059:
            r0 = r2
        L_0x005a:
            return r0
        L_0x005b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: t3.h.equals(java.lang.Object):boolean");
    }

    public final String g() {
        return this.f8944a;
    }

    public final long h() {
        return this.f8947e;
    }

    public final int hashCode() {
        int hashCode = (this.f8944a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f8945b;
        int hashCode2 = num == null ? 0 : num.hashCode();
        long j8 = this.d;
        long j10 = this.f8947e;
        return ((((((((hashCode ^ hashCode2) * 1000003) ^ this.f8946c.hashCode()) * 1000003) ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f8948f.hashCode();
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.f8944a + ", code=" + this.f8945b + ", encodedPayload=" + this.f8946c + ", eventMillis=" + this.d + ", uptimeMillis=" + this.f8947e + ", autoMetadata=" + this.f8948f + "}";
    }
}
