package f7;

import b0.d;
import com.karumi.dexter.BuildConfig;
import f7.a0;

public final class r extends a0.e.d.a.b.C0062d.C0063a {

    /* renamed from: a  reason: collision with root package name */
    public final long f4851a;

    /* renamed from: b  reason: collision with root package name */
    public final String f4852b;

    /* renamed from: c  reason: collision with root package name */
    public final String f4853c;
    public final long d;

    /* renamed from: e  reason: collision with root package name */
    public final int f4854e;

    public static final class a extends a0.e.d.a.b.C0062d.C0063a.C0064a {

        /* renamed from: a  reason: collision with root package name */
        public Long f4855a;

        /* renamed from: b  reason: collision with root package name */
        public String f4856b;

        /* renamed from: c  reason: collision with root package name */
        public String f4857c;
        public Long d;

        /* renamed from: e  reason: collision with root package name */
        public Integer f4858e;

        public final r a() {
            String str;
            if (this.f4855a == null) {
                str = " pc";
            } else {
                str = BuildConfig.FLAVOR;
            }
            if (this.f4856b == null) {
                str = str.concat(" symbol");
            }
            if (this.d == null) {
                str = d.e(str, " offset");
            }
            if (this.f4858e == null) {
                str = d.e(str, " importance");
            }
            if (str.isEmpty()) {
                return new r(this.f4855a.longValue(), this.f4856b, this.f4857c, this.d.longValue(), this.f4858e.intValue());
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }
    }

    public r(long j8, String str, String str2, long j10, int i10) {
        this.f4851a = j8;
        this.f4852b = str;
        this.f4853c = str2;
        this.d = j10;
        this.f4854e = i10;
    }

    public final String a() {
        return this.f4853c;
    }

    public final int b() {
        return this.f4854e;
    }

    public final long c() {
        return this.d;
    }

    public final long d() {
        return this.f4851a;
    }

    public final String e() {
        return this.f4852b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0021, code lost:
        r1 = r7.f4853c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r8 instanceof f7.a0.e.d.a.b.C0062d.C0063a
            r2 = 0
            if (r1 == 0) goto L_0x004b
            f7.a0$e$d$a$b$d$a r8 = (f7.a0.e.d.a.b.C0062d.C0063a) r8
            long r3 = r8.d()
            long r5 = r7.f4851a
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x0049
            java.lang.String r1 = r7.f4852b
            java.lang.String r3 = r8.e()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0049
            java.lang.String r1 = r7.f4853c
            if (r1 != 0) goto L_0x002c
            java.lang.String r1 = r8.a()
            if (r1 != 0) goto L_0x0049
            goto L_0x0036
        L_0x002c:
            java.lang.String r3 = r8.a()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0049
        L_0x0036:
            long r3 = r7.d
            long r5 = r8.c()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0049
            int r1 = r7.f4854e
            int r8 = r8.b()
            if (r1 != r8) goto L_0x0049
            goto L_0x004a
        L_0x0049:
            r0 = r2
        L_0x004a:
            return r0
        L_0x004b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: f7.r.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        long j8 = this.f4851a;
        int hashCode = (((((int) (j8 ^ (j8 >>> 32))) ^ 1000003) * 1000003) ^ this.f4852b.hashCode()) * 1000003;
        String str = this.f4853c;
        int hashCode2 = str == null ? 0 : str.hashCode();
        long j10 = this.d;
        return ((((hashCode ^ hashCode2) * 1000003) ^ ((int) ((j10 >>> 32) ^ j10))) * 1000003) ^ this.f4854e;
    }

    public final String toString() {
        return "Frame{pc=" + this.f4851a + ", symbol=" + this.f4852b + ", file=" + this.f4853c + ", offset=" + this.d + ", importance=" + this.f4854e + "}";
    }
}
