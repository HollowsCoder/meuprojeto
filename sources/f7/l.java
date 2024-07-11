package f7;

import com.karumi.dexter.BuildConfig;
import f7.a0;

public final class l extends a0.e.d.a {

    /* renamed from: a  reason: collision with root package name */
    public final a0.e.d.a.b f4823a;

    /* renamed from: b  reason: collision with root package name */
    public final b0<a0.c> f4824b;

    /* renamed from: c  reason: collision with root package name */
    public final b0<a0.c> f4825c;
    public final Boolean d;

    /* renamed from: e  reason: collision with root package name */
    public final int f4826e;

    public static final class a extends a0.e.d.a.C0058a {

        /* renamed from: a  reason: collision with root package name */
        public a0.e.d.a.b f4827a;

        /* renamed from: b  reason: collision with root package name */
        public b0<a0.c> f4828b;

        /* renamed from: c  reason: collision with root package name */
        public b0<a0.c> f4829c;
        public Boolean d;

        /* renamed from: e  reason: collision with root package name */
        public Integer f4830e;

        public a(a0.e.d.a aVar) {
            this.f4827a = aVar.c();
            this.f4828b = aVar.b();
            this.f4829c = aVar.d();
            this.d = aVar.a();
            this.f4830e = Integer.valueOf(aVar.e());
        }

        public final l a() {
            String str = this.f4827a == null ? " execution" : BuildConfig.FLAVOR;
            if (this.f4830e == null) {
                str = str.concat(" uiOrientation");
            }
            if (str.isEmpty()) {
                return new l(this.f4827a, this.f4828b, this.f4829c, this.d, this.f4830e.intValue());
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }
    }

    public l() {
        throw null;
    }

    public l(a0.e.d.a.b bVar, b0 b0Var, b0 b0Var2, Boolean bool, int i10) {
        this.f4823a = bVar;
        this.f4824b = b0Var;
        this.f4825c = b0Var2;
        this.d = bool;
        this.f4826e = i10;
    }

    public final Boolean a() {
        return this.d;
    }

    public final b0<a0.c> b() {
        return this.f4824b;
    }

    public final a0.e.d.a.b c() {
        return this.f4823a;
    }

    public final b0<a0.c> d() {
        return this.f4825c;
    }

    public final int e() {
        return this.f4826e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
        r1 = r4.f4825c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0041, code lost:
        r1 = r4.d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r1 = r4.f4824b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof f7.a0.e.d.a
            r2 = 0
            if (r1 == 0) goto L_0x0061
            f7.a0$e$d$a r5 = (f7.a0.e.d.a) r5
            f7.a0$e$d$a$b r1 = r5.c()
            f7.a0$e$d$a$b r3 = r4.f4823a
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x005f
            f7.b0<f7.a0$c> r1 = r4.f4824b
            if (r1 != 0) goto L_0x0022
            f7.b0 r1 = r5.b()
            if (r1 != 0) goto L_0x005f
            goto L_0x002c
        L_0x0022:
            f7.b0 r3 = r5.b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x005f
        L_0x002c:
            f7.b0<f7.a0$c> r1 = r4.f4825c
            if (r1 != 0) goto L_0x0037
            f7.b0 r1 = r5.d()
            if (r1 != 0) goto L_0x005f
            goto L_0x0041
        L_0x0037:
            f7.b0 r3 = r5.d()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x005f
        L_0x0041:
            java.lang.Boolean r1 = r4.d
            if (r1 != 0) goto L_0x004c
            java.lang.Boolean r1 = r5.a()
            if (r1 != 0) goto L_0x005f
            goto L_0x0056
        L_0x004c:
            java.lang.Boolean r3 = r5.a()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x005f
        L_0x0056:
            int r1 = r4.f4826e
            int r5 = r5.e()
            if (r1 != r5) goto L_0x005f
            goto L_0x0060
        L_0x005f:
            r0 = r2
        L_0x0060:
            return r0
        L_0x0061:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: f7.l.equals(java.lang.Object):boolean");
    }

    public final a f() {
        return new a(this);
    }

    public final int hashCode() {
        int hashCode = (this.f4823a.hashCode() ^ 1000003) * 1000003;
        int i10 = 0;
        b0<a0.c> b0Var = this.f4824b;
        int hashCode2 = (hashCode ^ (b0Var == null ? 0 : b0Var.hashCode())) * 1000003;
        b0<a0.c> b0Var2 = this.f4825c;
        int hashCode3 = (hashCode2 ^ (b0Var2 == null ? 0 : b0Var2.hashCode())) * 1000003;
        Boolean bool = this.d;
        if (bool != null) {
            i10 = bool.hashCode();
        }
        return ((hashCode3 ^ i10) * 1000003) ^ this.f4826e;
    }

    public final String toString() {
        return "Application{execution=" + this.f4823a + ", customAttributes=" + this.f4824b + ", internalKeys=" + this.f4825c + ", background=" + this.d + ", uiOrientation=" + this.f4826e + "}";
    }
}
