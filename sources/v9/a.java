package v9;

import i9.q;
import i9.s;
import o8.m;

public final class a implements s {

    /* renamed from: a  reason: collision with root package name */
    public volatile m f9146a = m.f7766o;

    /* renamed from: b  reason: collision with root package name */
    public volatile C0143a f9147b = C0143a.NONE;

    /* renamed from: c  reason: collision with root package name */
    public final b f9148c = b.f9149a;

    /* renamed from: v9.a$a  reason: collision with other inner class name */
    public enum C0143a {
        NONE,
        BASIC,
        HEADERS,
        BODY
    }

    public interface b {

        /* renamed from: a  reason: collision with root package name */
        public static final b f9149a = new b();

        void a(String str);
    }

    public a(int i10) {
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00f1 A[LOOP:0: B:40:0x00ef->B:41:0x00f1, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final i9.c0 a(n9.f r25) {
        /*
            r24 = this;
            r1 = r24
            r0 = r25
            v9.a$a r2 = r1.f9147b
            i9.x r3 = r0.f7511f
            v9.a$a r4 = v9.a.C0143a.NONE
            if (r2 != r4) goto L_0x0011
            i9.c0 r0 = r0.b(r3)
            return r0
        L_0x0011:
            v9.a$a r4 = v9.a.C0143a.BODY
            if (r2 != r4) goto L_0x0017
            r4 = 1
            goto L_0x0018
        L_0x0017:
            r4 = 0
        L_0x0018:
            if (r4 != 0) goto L_0x0021
            v9.a$a r5 = v9.a.C0143a.HEADERS
            if (r2 != r5) goto L_0x001f
            goto L_0x0021
        L_0x001f:
            r2 = 0
            goto L_0x0022
        L_0x0021:
            r2 = 1
        L_0x0022:
            i9.b0 r5 = r3.f6368e
            m9.h r6 = r25.c()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "--> "
            r7.<init>(r8)
            java.lang.String r8 = r3.f6367c
            r7.append(r8)
            r8 = 32
            r7.append(r8)
            i9.r r8 = r3.f6366b
            r7.append(r8)
            java.lang.String r8 = ""
            if (r6 == 0) goto L_0x0056
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = " "
            r9.<init>(r10)
            i9.w r6 = r6.f7255e
            z8.g.c(r6)
            r9.append(r6)
            java.lang.String r6 = r9.toString()
            goto L_0x0057
        L_0x0056:
            r6 = r8
        L_0x0057:
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            java.lang.String r7 = "-byte body)"
            java.lang.String r9 = " ("
            if (r2 != 0) goto L_0x0078
            if (r5 == 0) goto L_0x0078
            java.lang.StringBuilder r6 = androidx.appcompat.widget.x0.h(r6, r9)
            long r10 = r5.a()
            r6.append(r10)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
        L_0x0078:
            v9.a$b r10 = r1.f9148c
            r10.a(r6)
            java.lang.String r6 = "identity"
            java.lang.String r10 = "gzip"
            java.lang.String r11 = "Content-Encoding"
            java.lang.String r12 = "-byte body omitted)"
            java.lang.String r13 = "UTF_8"
            if (r2 == 0) goto L_0x01b4
            i9.q r14 = r3.d
            if (r5 == 0) goto L_0x00e3
            i9.t r15 = r5.b()
            r16 = r2
            if (r15 == 0) goto L_0x00b3
            java.lang.String r2 = "Content-Type"
            java.lang.String r2 = r14.e(r2)
            if (r2 != 0) goto L_0x00b3
            v9.a$b r2 = r1.f9148c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r17 = r12
            java.lang.String r12 = "Content-Type: "
            r0.<init>(r12)
            r0.append(r15)
            java.lang.String r0 = r0.toString()
            r2.a(r0)
            goto L_0x00b5
        L_0x00b3:
            r17 = r12
        L_0x00b5:
            long r18 = r5.a()
            r20 = -1
            int r0 = (r18 > r20 ? 1 : (r18 == r20 ? 0 : -1))
            if (r0 == 0) goto L_0x00e1
            java.lang.String r0 = "Content-Length"
            java.lang.String r0 = r14.e(r0)
            if (r0 != 0) goto L_0x00e1
            v9.a$b r0 = r1.f9148c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r12 = "Content-Length: "
            r2.<init>(r12)
            r15 = r7
            r12 = r8
            long r7 = r5.a()
            r2.append(r7)
            java.lang.String r2 = r2.toString()
            r0.a(r2)
            goto L_0x00e9
        L_0x00e1:
            r15 = r7
            goto L_0x00e8
        L_0x00e3:
            r16 = r2
            r15 = r7
            r17 = r12
        L_0x00e8:
            r12 = r8
        L_0x00e9:
            java.lang.String[] r0 = r14.f6300o
            int r0 = r0.length
            int r0 = r0 / 2
            r2 = 0
        L_0x00ef:
            if (r2 >= r0) goto L_0x00f7
            r1.b(r14, r2)
            int r2 = r2 + 1
            goto L_0x00ef
        L_0x00f7:
            java.lang.String r0 = "--> END "
            if (r4 == 0) goto L_0x019d
            if (r5 != 0) goto L_0x00ff
            goto L_0x019d
        L_0x00ff:
            i9.q r2 = r3.d
            java.lang.String r2 = r2.e(r11)
            if (r2 == 0) goto L_0x0115
            boolean r7 = f9.h.V(r2, r6)
            if (r7 != 0) goto L_0x0115
            boolean r2 = f9.h.V(r2, r10)
            if (r2 != 0) goto L_0x0115
            r2 = 1
            goto L_0x0116
        L_0x0115:
            r2 = 0
        L_0x0116:
            if (r2 == 0) goto L_0x012c
            v9.a$b r2 = r1.f9148c
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r0)
            java.lang.String r0 = r3.f6367c
            r5.append(r0)
            java.lang.String r0 = " (encoded body omitted)"
            r7 = r5
            r8 = r15
            r5 = r17
            goto L_0x01a9
        L_0x012c:
            w9.f r2 = new w9.f
            r2.<init>()
            r5.c(r2)
            i9.t r7 = r5.b()
            if (r7 == 0) goto L_0x0143
            java.nio.charset.Charset r8 = java.nio.charset.StandardCharsets.UTF_8
            java.nio.charset.Charset r7 = r7.a(r8)
            if (r7 == 0) goto L_0x0143
            goto L_0x0148
        L_0x0143:
            java.nio.charset.Charset r7 = java.nio.charset.StandardCharsets.UTF_8
            z8.g.b(r7, r13)
        L_0x0148:
            v9.a$b r8 = r1.f9148c
            r8.a(r12)
            boolean r8 = s6.a.y(r2)
            if (r8 == 0) goto L_0x017e
            v9.a$b r8 = r1.f9148c
            r18 = r15
            long r14 = r2.f9325p
            java.lang.String r2 = r2.y(r14, r7)
            r8.a(r2)
            v9.a$b r2 = r1.f9148c
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r0)
            java.lang.String r0 = r3.f6367c
            r7.append(r0)
            r7.append(r9)
            long r14 = r5.a()
            r7.append(r14)
            r8 = r18
            r7.append(r8)
            r5 = r17
            goto L_0x01ac
        L_0x017e:
            r8 = r15
            v9.a$b r2 = r1.f9148c
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r0)
            java.lang.String r0 = r3.f6367c
            r7.append(r0)
            java.lang.String r0 = " (binary "
            r7.append(r0)
            long r14 = r5.a()
            r7.append(r14)
            r5 = r17
            r7.append(r5)
            goto L_0x01ac
        L_0x019d:
            r8 = r15
            r5 = r17
            v9.a$b r2 = r1.f9148c
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r0)
            java.lang.String r0 = r3.f6367c
        L_0x01a9:
            r7.append(r0)
        L_0x01ac:
            java.lang.String r0 = r7.toString()
            r2.a(r0)
            goto L_0x01b9
        L_0x01b4:
            r16 = r2
            r5 = r12
            r12 = r8
            r8 = r7
        L_0x01b9:
            long r14 = java.lang.System.nanoTime()
            r0 = r25
            i9.c0 r0 = r0.b(r3)     // Catch:{ Exception -> 0x0385 }
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r17 = java.lang.System.nanoTime()
            long r14 = r17 - r14
            long r2 = r2.toMillis(r14)
            i9.d0 r7 = r0.f6196v
            if (r7 == 0) goto L_0x0376
            long r14 = r7.a()
            r17 = -1
            int r17 = (r14 > r17 ? 1 : (r14 == r17 ? 0 : -1))
            r18 = r8
            if (r17 == 0) goto L_0x01f3
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r14)
            r19 = r14
            java.lang.String r14 = "-byte"
            r8.append(r14)
            java.lang.String r8 = r8.toString()
            goto L_0x01f7
        L_0x01f3:
            r19 = r14
            java.lang.String r8 = "unknown-length"
        L_0x01f7:
            v9.a$b r14 = r1.f9148c
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r17 = r5
            java.lang.String r5 = "<-- "
            r15.<init>(r5)
            int r5 = r0.f6194s
            r15.append(r5)
            java.lang.String r5 = r0.f6193r
            int r5 = r5.length()
            if (r5 != 0) goto L_0x0211
            r5 = 1
            goto L_0x0212
        L_0x0211:
            r5 = 0
        L_0x0212:
            if (r5 == 0) goto L_0x021e
            r5 = 32
            r21 = r12
            r23 = r13
            r12 = r5
            r5 = r21
            goto L_0x023b
        L_0x021e:
            java.lang.String r5 = r0.f6193r
            r21 = r12
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r22 = 32
            r23 = r13
            java.lang.String r13 = java.lang.String.valueOf(r22)
            r12.append(r13)
            r12.append(r5)
            java.lang.String r5 = r12.toString()
            r12 = r22
        L_0x023b:
            r15.append(r5)
            r15.append(r12)
            i9.x r5 = r0.f6191p
            i9.r r5 = r5.f6366b
            r15.append(r5)
            r15.append(r9)
            r15.append(r2)
            java.lang.String r2 = "ms"
            r15.append(r2)
            if (r16 != 0) goto L_0x025e
            java.lang.String r2 = ", "
            java.lang.String r3 = " body"
            java.lang.String r2 = b0.d.f(r2, r8, r3)
            goto L_0x0260
        L_0x025e:
            r2 = r21
        L_0x0260:
            r15.append(r2)
            r2 = 41
            r15.append(r2)
            java.lang.String r2 = r15.toString()
            r14.a(r2)
            if (r16 == 0) goto L_0x0375
            i9.q r2 = r0.u
            java.lang.String[] r3 = r2.f6300o
            int r3 = r3.length
            int r3 = r3 / 2
            r5 = 0
        L_0x0279:
            if (r5 >= r3) goto L_0x0281
            r1.b(r2, r5)
            int r5 = r5 + 1
            goto L_0x0279
        L_0x0281:
            if (r4 == 0) goto L_0x036e
            boolean r3 = n9.e.a(r0)
            if (r3 != 0) goto L_0x028b
            goto L_0x036e
        L_0x028b:
            i9.q r3 = r0.u
            java.lang.String r3 = r3.e(r11)
            if (r3 == 0) goto L_0x02a1
            boolean r4 = f9.h.V(r3, r6)
            if (r4 != 0) goto L_0x02a1
            boolean r3 = f9.h.V(r3, r10)
            if (r3 != 0) goto L_0x02a1
            r3 = 1
            goto L_0x02a2
        L_0x02a1:
            r3 = 0
        L_0x02a2:
            if (r3 == 0) goto L_0x02aa
            v9.a$b r2 = r1.f9148c
            java.lang.String r3 = "<-- END HTTP (encoded body omitted)"
            goto L_0x0372
        L_0x02aa:
            w9.i r3 = r7.c()
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r3.v(r4)
            w9.f r3 = r3.e()
            java.lang.String r2 = r2.e(r11)
            boolean r2 = f9.h.V(r10, r2)
            r4 = 0
            if (r2 == 0) goto L_0x02ea
            long r5 = r3.f9325p
            java.lang.Long r2 = java.lang.Long.valueOf(r5)
            w9.n r5 = new w9.n
            w9.f r3 = r3.clone()
            r5.<init>(r3)
            w9.f r3 = new w9.f     // Catch:{ all -> 0x02e1 }
            r3.<init>()     // Catch:{ all -> 0x02e1 }
            r3.N(r5)     // Catch:{ all -> 0x02e1 }
            s6.a.r(r5, r4)
            r4 = r2
            goto L_0x02ea
        L_0x02e1:
            r0 = move-exception
            r2 = r0
            throw r2     // Catch:{ all -> 0x02e4 }
        L_0x02e4:
            r0 = move-exception
            r3 = r0
            s6.a.r(r5, r2)
            throw r3
        L_0x02ea:
            i9.t r2 = r7.b()
            if (r2 == 0) goto L_0x02f9
            java.nio.charset.Charset r5 = java.nio.charset.StandardCharsets.UTF_8
            java.nio.charset.Charset r2 = r2.a(r5)
            if (r2 == 0) goto L_0x02f9
            goto L_0x0300
        L_0x02f9:
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_8
            r5 = r23
            z8.g.b(r2, r5)
        L_0x0300:
            boolean r5 = s6.a.y(r3)
            if (r5 != 0) goto L_0x0328
            v9.a$b r2 = r1.f9148c
            r5 = r21
            r2.a(r5)
            v9.a$b r2 = r1.f9148c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "<-- END HTTP (binary "
            r4.<init>(r5)
            long r5 = r3.f9325p
            r4.append(r5)
            r3 = r17
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r2.a(r3)
            return r0
        L_0x0328:
            r5 = r21
            r6 = 0
            int r6 = (r19 > r6 ? 1 : (r19 == r6 ? 0 : -1))
            if (r6 == 0) goto L_0x0344
            v9.a$b r6 = r1.f9148c
            r6.a(r5)
            v9.a$b r5 = r1.f9148c
            w9.f r6 = r3.clone()
            long r7 = r6.f9325p
            java.lang.String r2 = r6.y(r7, r2)
            r5.a(r2)
        L_0x0344:
            v9.a$b r2 = r1.f9148c
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "<-- END HTTP ("
            r5.<init>(r6)
            if (r4 == 0) goto L_0x035f
            long r6 = r3.f9325p
            r5.append(r6)
            java.lang.String r3 = "-byte, "
            r5.append(r3)
            r5.append(r4)
            java.lang.String r7 = "-gzipped-byte body)"
            goto L_0x0366
        L_0x035f:
            long r3 = r3.f9325p
            r5.append(r3)
            r7 = r18
        L_0x0366:
            r5.append(r7)
            java.lang.String r3 = r5.toString()
            goto L_0x0372
        L_0x036e:
            v9.a$b r2 = r1.f9148c
            java.lang.String r3 = "<-- END HTTP"
        L_0x0372:
            r2.a(r3)
        L_0x0375:
            return r0
        L_0x0376:
            n8.b r0 = new n8.b
            r0.<init>()
            java.lang.Class<z8.g> r2 = z8.g.class
            java.lang.String r2 = r2.getName()
            z8.g.j(r2, r0)
            throw r0
        L_0x0385:
            r0 = move-exception
            r2 = r0
            v9.a$b r0 = r1.f9148c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "<-- HTTP FAILED: "
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            r0.a(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: v9.a.a(n9.f):i9.c0");
    }

    public final void b(q qVar, int i10) {
        this.f9146a.contains(qVar.h(i10));
        String k10 = qVar.k(i10);
        b bVar = this.f9148c;
        bVar.a(qVar.h(i10) + ": " + k10);
    }
}
