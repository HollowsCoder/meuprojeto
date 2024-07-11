package f7;

import f7.a0;

public final class o extends a0.e.d.a.b.C0061b {

    /* renamed from: a  reason: collision with root package name */
    public final String f4841a;

    /* renamed from: b  reason: collision with root package name */
    public final String f4842b;

    /* renamed from: c  reason: collision with root package name */
    public final b0<a0.e.d.a.b.C0062d.C0063a> f4843c;
    public final a0.e.d.a.b.C0061b d;

    /* renamed from: e  reason: collision with root package name */
    public final int f4844e;

    public o() {
        throw null;
    }

    public o(String str, String str2, b0 b0Var, a0.e.d.a.b.C0061b bVar, int i10) {
        this.f4841a = str;
        this.f4842b = str2;
        this.f4843c = b0Var;
        this.d = bVar;
        this.f4844e = i10;
    }

    public final a0.e.d.a.b.C0061b a() {
        return this.d;
    }

    public final b0<a0.e.d.a.b.C0062d.C0063a> b() {
        return this.f4843c;
    }

    public final int c() {
        return this.f4844e;
    }

    public final String d() {
        return this.f4842b;
    }

    public final String e() {
        return this.f4841a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0038, code lost:
        r1 = r4.d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r1 = r4.f4842b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof f7.a0.e.d.a.b.C0061b
            r2 = 0
            if (r1 == 0) goto L_0x0058
            f7.a0$e$d$a$b$b r5 = (f7.a0.e.d.a.b.C0061b) r5
            java.lang.String r1 = r5.e()
            java.lang.String r3 = r4.f4841a
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x0056
            java.lang.String r1 = r4.f4842b
            if (r1 != 0) goto L_0x0022
            java.lang.String r1 = r5.d()
            if (r1 != 0) goto L_0x0056
            goto L_0x002c
        L_0x0022:
            java.lang.String r3 = r5.d()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0056
        L_0x002c:
            f7.b0<f7.a0$e$d$a$b$d$a> r1 = r4.f4843c
            f7.b0 r3 = r5.b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0056
            f7.a0$e$d$a$b$b r1 = r4.d
            if (r1 != 0) goto L_0x0043
            f7.a0$e$d$a$b$b r1 = r5.a()
            if (r1 != 0) goto L_0x0056
            goto L_0x004d
        L_0x0043:
            f7.a0$e$d$a$b$b r3 = r5.a()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0056
        L_0x004d:
            int r1 = r4.f4844e
            int r5 = r5.c()
            if (r1 != r5) goto L_0x0056
            goto L_0x0057
        L_0x0056:
            r0 = r2
        L_0x0057:
            return r0
        L_0x0058:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: f7.o.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int hashCode = (this.f4841a.hashCode() ^ 1000003) * 1000003;
        int i10 = 0;
        String str = this.f4842b;
        int hashCode2 = (((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f4843c.hashCode()) * 1000003;
        a0.e.d.a.b.C0061b bVar = this.d;
        if (bVar != null) {
            i10 = bVar.hashCode();
        }
        return ((hashCode2 ^ i10) * 1000003) ^ this.f4844e;
    }

    public final String toString() {
        return "Exception{type=" + this.f4841a + ", reason=" + this.f4842b + ", frames=" + this.f4843c + ", causedBy=" + this.d + ", overflowCount=" + this.f4844e + "}";
    }
}
