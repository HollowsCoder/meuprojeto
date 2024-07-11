package n8;

import z8.g;

public final class c implements Comparable<c> {

    /* renamed from: s  reason: collision with root package name */
    public static final c f7490s = new c();

    /* renamed from: o  reason: collision with root package name */
    public final int f7491o = 1;

    /* renamed from: p  reason: collision with root package name */
    public final int f7492p = 7;

    /* renamed from: q  reason: collision with root package name */
    public final int f7493q = 10;

    /* renamed from: r  reason: collision with root package name */
    public final int f7494r;

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0038, code lost:
        if (r1 != false) goto L_0x003c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public c() {
        /*
            r6 = this;
            r6.<init>()
            r0 = 1
            r6.f7491o = r0
            r1 = 7
            r6.f7492p = r1
            r2 = 10
            r6.f7493q = r2
            c9.c r3 = new c9.c
            r4 = 0
            r5 = 255(0xff, float:3.57E-43)
            r3.<init>(r4, r5)
            int r3 = r3.f2195p
            if (r0 > r3) goto L_0x001b
            r3 = r0
            goto L_0x001c
        L_0x001b:
            r3 = r4
        L_0x001c:
            if (r3 == 0) goto L_0x003b
            c9.c r3 = new c9.c
            r3.<init>(r4, r5)
            int r3 = r3.f2195p
            if (r1 > r3) goto L_0x0029
            r1 = r0
            goto L_0x002a
        L_0x0029:
            r1 = r4
        L_0x002a:
            if (r1 == 0) goto L_0x003b
            c9.c r1 = new c9.c
            r1.<init>(r4, r5)
            int r1 = r1.f2195p
            if (r2 > r1) goto L_0x0037
            r1 = r0
            goto L_0x0038
        L_0x0037:
            r1 = r4
        L_0x0038:
            if (r1 == 0) goto L_0x003b
            goto L_0x003c
        L_0x003b:
            r0 = r4
        L_0x003c:
            if (r0 == 0) goto L_0x0044
            r0 = 67338(0x1070a, float:9.436E-41)
            r6.f7494r = r0
            return
        L_0x0044:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Version components are out of range: 1.7.10"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n8.c.<init>():void");
    }

    public final int compareTo(Object obj) {
        c cVar = (c) obj;
        g.f(cVar, "other");
        return this.f7494r - cVar.f7494r;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        c cVar = obj instanceof c ? (c) obj : null;
        if (cVar == null) {
            return false;
        }
        return this.f7494r == cVar.f7494r;
    }

    public final int hashCode() {
        return this.f7494r;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f7491o);
        sb.append('.');
        sb.append(this.f7492p);
        sb.append('.');
        sb.append(this.f7493q);
        return sb.toString();
    }
}
