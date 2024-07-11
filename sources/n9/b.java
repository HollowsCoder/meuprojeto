package n9;

import i9.s;

public final class b implements s {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f7503a;

    public b(boolean z) {
        this.f7503a = z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x016c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final i9.c0 a(n9.f r18) {
        /*
            r17 = this;
            r0 = r18
            java.lang.String r1 = "call"
            m9.c r2 = r0.f7510e
            z8.g.c(r2)
            n9.d r3 = r2.f7215f
            i9.n r4 = r2.d
            m9.e r5 = r2.f7213c
            i9.x r0 = r0.f7511f
            i9.b0 r6 = r0.f6368e
            long r7 = java.lang.System.currentTimeMillis()
            r4.getClass()     // Catch:{ IOException -> 0x01a2 }
            z8.g.f(r5, r1)     // Catch:{ IOException -> 0x01a2 }
            r3.g(r0)     // Catch:{ IOException -> 0x01a2 }
            java.lang.String r9 = r0.f6367c
            boolean r9 = n.e.D(r9)
            r10 = 1
            r12 = 0
            m9.h r13 = r2.f7212b
            if (r9 == 0) goto L_0x009a
            if (r6 == 0) goto L_0x009a
            i9.q r9 = r0.d
            java.lang.String r14 = "Expect"
            java.lang.String r9 = r9.e(r14)
            java.lang.String r14 = "100-continue"
            boolean r9 = f9.h.V(r14, r9)
            if (r9 == 0) goto L_0x0059
            r3.b()     // Catch:{ IOException -> 0x004d }
            i9.c0$a r9 = r2.b(r10)
            r4.getClass()
            z8.g.f(r5, r1)
            r14 = r12
            goto L_0x005b
        L_0x004d:
            r0 = move-exception
            r3 = r0
            r4.getClass()
            z8.g.f(r5, r1)
            r2.c(r3)
            throw r3
        L_0x0059:
            r14 = r10
            r9 = 0
        L_0x005b:
            if (r9 != 0) goto L_0x0082
            r2.f7211a = r12
            i9.b0 r10 = r0.f6368e
            z8.g.c(r10)
            long r11 = r10.a()
            r4.getClass()
            z8.g.f(r5, r1)
            w9.z r10 = r3.d(r0, r11)
            m9.c$a r15 = new m9.c$a
            r15.<init>(r2, r10, r11)
            w9.u r10 = n.e.n(r15)
            r6.c(r10)
            r10.close()
            goto L_0x0096
        L_0x0082:
            r11 = r12
            r6 = 0
            r5.k(r2, r10, r11, r6)
            p9.f r6 = r13.f7256f
            if (r6 == 0) goto L_0x008c
            goto L_0x008d
        L_0x008c:
            r10 = 0
        L_0x008d:
            if (r10 != 0) goto L_0x0096
            m9.h r6 = r3.h()
            r6.k()
        L_0x0096:
            r10 = r9
            r6 = 0
            r9 = 0
            goto L_0x00a1
        L_0x009a:
            r6 = 0
            r9 = 0
            r5.k(r2, r10, r9, r6)
            r14 = r10
            r10 = r6
        L_0x00a1:
            r3.a()     // Catch:{ IOException -> 0x019a }
            if (r10 != 0) goto L_0x00b8
            i9.c0$a r10 = r2.b(r9)
            z8.g.c(r10)
            if (r14 == 0) goto L_0x00b8
            r4.getClass()
            z8.g.f(r5, r1)
            r16 = 0
            goto L_0x00ba
        L_0x00b8:
            r16 = r14
        L_0x00ba:
            r10.f6199a = r0
            i9.p r9 = r13.d
            r10.f6202e = r9
            r10.f6208k = r7
            long r11 = java.lang.System.currentTimeMillis()
            r10.l = r11
            i9.c0 r9 = r10.a()
            r10 = 100
            int r11 = r9.f6194s
            if (r11 != r10) goto L_0x00f6
            r10 = 0
            i9.c0$a r9 = r2.b(r10)
            z8.g.c(r9)
            if (r16 == 0) goto L_0x00e2
            r4.getClass()
            z8.g.f(r5, r1)
        L_0x00e2:
            r9.f6199a = r0
            i9.p r0 = r13.d
            r9.f6202e = r0
            r9.f6208k = r7
            long r0 = java.lang.System.currentTimeMillis()
            r9.l = r0
            i9.c0 r9 = r9.a()
            int r11 = r9.f6194s
        L_0x00f6:
            r7 = r17
            boolean r0 = r7.f7503a
            if (r0 == 0) goto L_0x0108
            r0 = 101(0x65, float:1.42E-43)
            if (r11 != r0) goto L_0x0108
            i9.c0$a r0 = new i9.c0$a
            r0.<init>(r9)
            i9.e0 r1 = j9.c.f6604c
            goto L_0x012a
        L_0x0108:
            i9.c0$a r0 = new i9.c0$a
            r0.<init>(r9)
            java.lang.String r1 = "Content-Type"
            java.lang.String r1 = i9.c0.b(r9, r1)     // Catch:{ IOException -> 0x0195 }
            long r4 = r3.c(r9)     // Catch:{ IOException -> 0x0195 }
            w9.b0 r8 = r3.e(r9)     // Catch:{ IOException -> 0x0195 }
            m9.c$b r9 = new m9.c$b     // Catch:{ IOException -> 0x0195 }
            r9.<init>(r2, r8, r4)     // Catch:{ IOException -> 0x0195 }
            n9.g r8 = new n9.g     // Catch:{ IOException -> 0x0195 }
            w9.v r9 = n.e.o(r9)     // Catch:{ IOException -> 0x0195 }
            r8.<init>(r1, r4, r9)     // Catch:{ IOException -> 0x0195 }
            r1 = r8
        L_0x012a:
            r0.f6204g = r1
            i9.c0 r0 = r0.a()
            i9.x r1 = r0.f6191p
            i9.q r1 = r1.d
            java.lang.String r2 = "Connection"
            java.lang.String r1 = r1.e(r2)
            java.lang.String r4 = "close"
            boolean r1 = f9.h.V(r4, r1)
            if (r1 != 0) goto L_0x014c
            java.lang.String r1 = i9.c0.b(r0, r2)
            boolean r1 = f9.h.V(r4, r1)
            if (r1 == 0) goto L_0x0153
        L_0x014c:
            m9.h r1 = r3.h()
            r1.k()
        L_0x0153:
            r1 = 204(0xcc, float:2.86E-43)
            if (r11 == r1) goto L_0x015b
            r1 = 205(0xcd, float:2.87E-43)
            if (r11 != r1) goto L_0x0194
        L_0x015b:
            i9.d0 r1 = r0.f6196v
            if (r1 == 0) goto L_0x0164
            long r2 = r1.a()
            goto L_0x0166
        L_0x0164:
            r2 = -1
        L_0x0166:
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L_0x0194
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "HTTP "
            r2.<init>(r3)
            r2.append(r11)
            java.lang.String r3 = " had non-zero Content-Length: "
            r2.append(r3)
            if (r1 == 0) goto L_0x0188
            long r3 = r1.a()
            java.lang.Long r11 = java.lang.Long.valueOf(r3)
            goto L_0x0189
        L_0x0188:
            r11 = r6
        L_0x0189:
            r2.append(r11)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L_0x0194:
            return r0
        L_0x0195:
            r0 = move-exception
            r2.c(r0)
            throw r0
        L_0x019a:
            r0 = move-exception
            r7 = r17
            r1 = r0
            r2.c(r1)
            throw r1
        L_0x01a2:
            r0 = move-exception
            r7 = r17
            r4.getClass()
            z8.g.f(r5, r1)
            r2.c(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n9.b.a(n9.f):i9.c0");
    }
}
