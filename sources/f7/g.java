package f7;

import b0.d;
import com.karumi.dexter.BuildConfig;
import f7.a0;

public final class g extends a0.e {

    /* renamed from: a  reason: collision with root package name */
    public final String f4773a;

    /* renamed from: b  reason: collision with root package name */
    public final String f4774b;

    /* renamed from: c  reason: collision with root package name */
    public final long f4775c;
    public final Long d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f4776e;

    /* renamed from: f  reason: collision with root package name */
    public final a0.e.a f4777f;

    /* renamed from: g  reason: collision with root package name */
    public final a0.e.f f4778g;

    /* renamed from: h  reason: collision with root package name */
    public final a0.e.C0066e f4779h;

    /* renamed from: i  reason: collision with root package name */
    public final a0.e.c f4780i;

    /* renamed from: j  reason: collision with root package name */
    public final b0<a0.e.d> f4781j;

    /* renamed from: k  reason: collision with root package name */
    public final int f4782k;

    public static final class a extends a0.e.b {

        /* renamed from: a  reason: collision with root package name */
        public String f4783a;

        /* renamed from: b  reason: collision with root package name */
        public String f4784b;

        /* renamed from: c  reason: collision with root package name */
        public Long f4785c;
        public Long d;

        /* renamed from: e  reason: collision with root package name */
        public Boolean f4786e;

        /* renamed from: f  reason: collision with root package name */
        public a0.e.a f4787f;

        /* renamed from: g  reason: collision with root package name */
        public a0.e.f f4788g;

        /* renamed from: h  reason: collision with root package name */
        public a0.e.C0066e f4789h;

        /* renamed from: i  reason: collision with root package name */
        public a0.e.c f4790i;

        /* renamed from: j  reason: collision with root package name */
        public b0<a0.e.d> f4791j;

        /* renamed from: k  reason: collision with root package name */
        public Integer f4792k;

        public a() {
        }

        public a(a0.e eVar) {
            this.f4783a = eVar.e();
            this.f4784b = eVar.g();
            this.f4785c = Long.valueOf(eVar.i());
            this.d = eVar.c();
            this.f4786e = Boolean.valueOf(eVar.k());
            this.f4787f = eVar.a();
            this.f4788g = eVar.j();
            this.f4789h = eVar.h();
            this.f4790i = eVar.b();
            this.f4791j = eVar.d();
            this.f4792k = Integer.valueOf(eVar.f());
        }

        public final g a() {
            String str;
            if (this.f4783a == null) {
                str = " generator";
            } else {
                str = BuildConfig.FLAVOR;
            }
            if (this.f4784b == null) {
                str = str.concat(" identifier");
            }
            if (this.f4785c == null) {
                str = d.e(str, " startedAt");
            }
            if (this.f4786e == null) {
                str = d.e(str, " crashed");
            }
            if (this.f4787f == null) {
                str = d.e(str, " app");
            }
            if (this.f4792k == null) {
                str = d.e(str, " generatorType");
            }
            if (str.isEmpty()) {
                return new g(this.f4783a, this.f4784b, this.f4785c.longValue(), this.d, this.f4786e.booleanValue(), this.f4787f, this.f4788g, this.f4789h, this.f4790i, this.f4791j, this.f4792k.intValue());
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }
    }

    public g() {
        throw null;
    }

    public g(String str, String str2, long j8, Long l, boolean z, a0.e.a aVar, a0.e.f fVar, a0.e.C0066e eVar, a0.e.c cVar, b0 b0Var, int i10) {
        this.f4773a = str;
        this.f4774b = str2;
        this.f4775c = j8;
        this.d = l;
        this.f4776e = z;
        this.f4777f = aVar;
        this.f4778g = fVar;
        this.f4779h = eVar;
        this.f4780i = cVar;
        this.f4781j = b0Var;
        this.f4782k = i10;
    }

    public final a0.e.a a() {
        return this.f4777f;
    }

    public final a0.e.c b() {
        return this.f4780i;
    }

    public final Long c() {
        return this.d;
    }

    public final b0<a0.e.d> d() {
        return this.f4781j;
    }

    public final String e() {
        return this.f4773a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002d, code lost:
        r1 = r7.d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0056, code lost:
        r1 = r7.f4778g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006b, code lost:
        r1 = r7.f4779h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0080, code lost:
        r1 = r7.f4780i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0095, code lost:
        r1 = r7.f4781j;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r8 instanceof f7.a0.e
            r2 = 0
            if (r1 == 0) goto L_0x00b5
            f7.a0$e r8 = (f7.a0.e) r8
            java.lang.String r1 = r8.e()
            java.lang.String r3 = r7.f4773a
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x00b3
            java.lang.String r1 = r7.f4774b
            java.lang.String r3 = r8.g()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00b3
            long r3 = r7.f4775c
            long r5 = r8.i()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x00b3
            java.lang.Long r1 = r7.d
            if (r1 != 0) goto L_0x0038
            java.lang.Long r1 = r8.c()
            if (r1 != 0) goto L_0x00b3
            goto L_0x0042
        L_0x0038:
            java.lang.Long r3 = r8.c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00b3
        L_0x0042:
            boolean r1 = r7.f4776e
            boolean r3 = r8.k()
            if (r1 != r3) goto L_0x00b3
            f7.a0$e$a r1 = r7.f4777f
            f7.a0$e$a r3 = r8.a()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00b3
            f7.a0$e$f r1 = r7.f4778g
            if (r1 != 0) goto L_0x0061
            f7.a0$e$f r1 = r8.j()
            if (r1 != 0) goto L_0x00b3
            goto L_0x006b
        L_0x0061:
            f7.a0$e$f r3 = r8.j()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00b3
        L_0x006b:
            f7.a0$e$e r1 = r7.f4779h
            if (r1 != 0) goto L_0x0076
            f7.a0$e$e r1 = r8.h()
            if (r1 != 0) goto L_0x00b3
            goto L_0x0080
        L_0x0076:
            f7.a0$e$e r3 = r8.h()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00b3
        L_0x0080:
            f7.a0$e$c r1 = r7.f4780i
            if (r1 != 0) goto L_0x008b
            f7.a0$e$c r1 = r8.b()
            if (r1 != 0) goto L_0x00b3
            goto L_0x0095
        L_0x008b:
            f7.a0$e$c r3 = r8.b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00b3
        L_0x0095:
            f7.b0<f7.a0$e$d> r1 = r7.f4781j
            if (r1 != 0) goto L_0x00a0
            f7.b0 r1 = r8.d()
            if (r1 != 0) goto L_0x00b3
            goto L_0x00aa
        L_0x00a0:
            f7.b0 r3 = r8.d()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00b3
        L_0x00aa:
            int r1 = r7.f4782k
            int r8 = r8.f()
            if (r1 != r8) goto L_0x00b3
            goto L_0x00b4
        L_0x00b3:
            r0 = r2
        L_0x00b4:
            return r0
        L_0x00b5:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: f7.g.equals(java.lang.Object):boolean");
    }

    public final int f() {
        return this.f4782k;
    }

    public final String g() {
        return this.f4774b;
    }

    public final a0.e.C0066e h() {
        return this.f4779h;
    }

    public final int hashCode() {
        long j8 = this.f4775c;
        int hashCode = (((((this.f4773a.hashCode() ^ 1000003) * 1000003) ^ this.f4774b.hashCode()) * 1000003) ^ ((int) ((j8 >>> 32) ^ j8))) * 1000003;
        int i10 = 0;
        Long l = this.d;
        int hashCode2 = (((((hashCode ^ (l == null ? 0 : l.hashCode())) * 1000003) ^ (this.f4776e ? 1231 : 1237)) * 1000003) ^ this.f4777f.hashCode()) * 1000003;
        a0.e.f fVar = this.f4778g;
        int hashCode3 = (hashCode2 ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003;
        a0.e.C0066e eVar = this.f4779h;
        int hashCode4 = (hashCode3 ^ (eVar == null ? 0 : eVar.hashCode())) * 1000003;
        a0.e.c cVar = this.f4780i;
        int hashCode5 = (hashCode4 ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        b0<a0.e.d> b0Var = this.f4781j;
        if (b0Var != null) {
            i10 = b0Var.hashCode();
        }
        return ((hashCode5 ^ i10) * 1000003) ^ this.f4782k;
    }

    public final long i() {
        return this.f4775c;
    }

    public final a0.e.f j() {
        return this.f4778g;
    }

    public final boolean k() {
        return this.f4776e;
    }

    public final a l() {
        return new a(this);
    }

    public final String toString() {
        return "Session{generator=" + this.f4773a + ", identifier=" + this.f4774b + ", startedAt=" + this.f4775c + ", endedAt=" + this.d + ", crashed=" + this.f4776e + ", app=" + this.f4777f + ", user=" + this.f4778g + ", os=" + this.f4779h + ", device=" + this.f4780i + ", events=" + this.f4781j + ", generatorType=" + this.f4782k + "}";
    }
}
