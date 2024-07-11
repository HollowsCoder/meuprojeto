package y6;

import b0.d;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final Class<?> f9582a;

    /* renamed from: b  reason: collision with root package name */
    public final int f9583b;

    /* renamed from: c  reason: collision with root package name */
    public final int f9584c;

    public k(int i10, int i11, Class cls) {
        this.f9582a = cls;
        this.f9583b = i10;
        this.f9584c = i11;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r4 = (y6.k) r4;
        r0 = r4.f9582a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof y6.k
            r1 = 0
            if (r0 == 0) goto L_0x001a
            y6.k r4 = (y6.k) r4
            java.lang.Class<?> r0 = r4.f9582a
            java.lang.Class<?> r2 = r3.f9582a
            if (r2 != r0) goto L_0x001a
            int r0 = r3.f9583b
            int r2 = r4.f9583b
            if (r0 != r2) goto L_0x001a
            int r0 = r3.f9584c
            int r4 = r4.f9584c
            if (r0 != r4) goto L_0x001a
            r1 = 1
        L_0x001a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: y6.k.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return ((((this.f9582a.hashCode() ^ 1000003) * 1000003) ^ this.f9583b) * 1000003) ^ this.f9584c;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.f9582a);
        sb.append(", type=");
        int i10 = this.f9583b;
        if (i10 == 1) {
            str = "required";
        } else if (i10 == 0) {
            str = "optional";
        } else {
            str = "set";
        }
        sb.append(str);
        sb.append(", injection=");
        int i11 = this.f9584c;
        if (i11 == 0) {
            str2 = "direct";
        } else if (i11 == 1) {
            str2 = "provider";
        } else if (i11 == 2) {
            str2 = "deferred";
        } else {
            throw new AssertionError(d.c("Unsupported injection: ", i11));
        }
        return d.g(sb, str2, "}");
    }
}
