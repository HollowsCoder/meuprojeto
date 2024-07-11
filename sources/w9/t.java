package w9;

import z8.g;

public final class t implements b0 {

    /* renamed from: o  reason: collision with root package name */
    public final f f9352o;

    /* renamed from: p  reason: collision with root package name */
    public w f9353p;

    /* renamed from: q  reason: collision with root package name */
    public int f9354q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f9355r;

    /* renamed from: s  reason: collision with root package name */
    public long f9356s;

    /* renamed from: t  reason: collision with root package name */
    public final i f9357t;

    public t(i iVar) {
        g.f(iVar, "upstream");
        this.f9357t = iVar;
        f e10 = iVar.e();
        this.f9352o = e10;
        w wVar = e10.f9324o;
        this.f9353p = wVar;
        this.f9354q = wVar != null ? wVar.f9366b : -1;
    }

    public final void close() {
        this.f9355r = true;
    }

    public final c0 h() {
        return this.f9357t.h();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0028, code lost:
        if (r5 == r7.f9366b) goto L_0x002a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0066  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long w(w9.f r9, long r10) {
        /*
            r8 = this;
            java.lang.String r0 = "sink"
            z8.g.f(r9, r0)
            r0 = 0
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r2 < 0) goto L_0x000f
            r5 = r4
            goto L_0x0010
        L_0x000f:
            r5 = r3
        L_0x0010:
            if (r5 == 0) goto L_0x007e
            boolean r5 = r8.f9355r
            r5 = r5 ^ r4
            if (r5 == 0) goto L_0x0072
            w9.w r5 = r8.f9353p
            w9.f r6 = r8.f9352o
            if (r5 == 0) goto L_0x002a
            w9.w r7 = r6.f9324o
            if (r5 != r7) goto L_0x002b
            int r5 = r8.f9354q
            z8.g.c(r7)
            int r7 = r7.f9366b
            if (r5 != r7) goto L_0x002b
        L_0x002a:
            r3 = r4
        L_0x002b:
            if (r3 == 0) goto L_0x0066
            if (r2 != 0) goto L_0x0030
            return r0
        L_0x0030:
            long r0 = r8.f9356s
            r2 = 1
            long r0 = r0 + r2
            w9.i r2 = r8.f9357t
            boolean r0 = r2.v(r0)
            if (r0 != 0) goto L_0x0040
            r9 = -1
            return r9
        L_0x0040:
            w9.w r0 = r8.f9353p
            if (r0 != 0) goto L_0x004e
            w9.w r0 = r6.f9324o
            if (r0 == 0) goto L_0x004e
            r8.f9353p = r0
            int r0 = r0.f9366b
            r8.f9354q = r0
        L_0x004e:
            long r0 = r6.f9325p
            long r2 = r8.f9356s
            long r0 = r0 - r2
            long r10 = java.lang.Math.min(r10, r0)
            w9.f r2 = r8.f9352o
            long r4 = r8.f9356s
            r3 = r9
            r6 = r10
            r2.l(r3, r4, r6)
            long r0 = r8.f9356s
            long r0 = r0 + r10
            r8.f9356s = r0
            return r10
        L_0x0066:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Peek source is invalid because upstream source was used"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L_0x0072:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "closed"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L_0x007e:
            java.lang.String r9 = "byteCount < 0: "
            java.lang.String r9 = b0.d.d(r9, r10)
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: w9.t.w(w9.f, long):long");
    }
}
