package c9;

public final class c extends a {

    /* renamed from: r  reason: collision with root package name */
    public static final c f2201r = new c(1, 0);

    public c(int i10, int i11) {
        super(i10, i11, 1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0013, code lost:
        r3 = (c9.c) r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof c9.c
            if (r0 == 0) goto L_0x0023
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0013
            r0 = r3
            c9.c r0 = (c9.c) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0021
        L_0x0013:
            c9.c r3 = (c9.c) r3
            int r0 = r3.f2194o
            int r1 = r2.f2194o
            if (r1 != r0) goto L_0x0023
            int r3 = r3.f2195p
            int r0 = r2.f2195p
            if (r0 != r3) goto L_0x0023
        L_0x0021:
            r3 = 1
            goto L_0x0024
        L_0x0023:
            r3 = 0
        L_0x0024:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: c9.c.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f2194o * 31) + this.f2195p;
    }

    public final boolean isEmpty() {
        return this.f2194o > this.f2195p;
    }

    public final String toString() {
        return this.f2194o + ".." + this.f2195p;
    }
}
