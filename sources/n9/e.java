package n9;

import f9.h;
import i9.c0;
import j9.c;
import w9.j;
import z8.g;

public final class e {
    static {
        j jVar = j.f9328r;
        j.a.c("\"\\");
        j.a.c("\t ,=");
    }

    public static final boolean a(c0 c0Var) {
        if (g.a(c0Var.f6191p.f6367c, "HEAD")) {
            return false;
        }
        int i10 = c0Var.f6194s;
        if (((i10 >= 100 && i10 < 200) || i10 == 204 || i10 == 304) && c.j(c0Var) == -1 && !h.V("chunked", c0.b(c0Var, "Transfer-Encoding"))) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01d5, code lost:
        if (r3.f4938o.matcher(r0).matches() == false) goto L_0x01da;
     */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0229  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0234 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(i9.k r36, i9.r r37, i9.q r38) {
        /*
            r1 = r36
            r2 = r37
            r0 = r38
            java.lang.String r3 = "$this$receiveHeaders"
            z8.g.f(r1, r3)
            java.lang.String r3 = "url"
            z8.g.f(r2, r3)
            java.lang.String r3 = "headers"
            z8.g.f(r0, r3)
            s6.a r3 = i9.k.f6281j
            if (r1 != r3) goto L_0x001a
            return
        L_0x001a:
            i9.j$a r3 = i9.j.f6272n
            r3.getClass()
            java.lang.String r3 = "Set-Cookie"
            java.util.List r3 = r0.m(r3)
            int r4 = r3.size()
            r6 = 0
            r7 = r6
            r8 = 0
        L_0x002c:
            if (r7 >= r4) goto L_0x023a
            java.lang.Object r0 = r3.get(r7)
            r9 = r0
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r0 = "setCookie"
            z8.g.f(r9, r0)
            long r10 = java.lang.System.currentTimeMillis()
            byte[] r0 = j9.c.f6602a
            int r0 = r9.length()
            r12 = 59
            int r0 = j9.c.e(r9, r12, r6, r0)
            r13 = 61
            int r14 = j9.c.e(r9, r13, r6, r0)
            if (r14 != r0) goto L_0x0056
        L_0x0052:
            r35 = r3
            goto L_0x0226
        L_0x0056:
            java.lang.String r16 = j9.c.x(r9, r6, r14)
            int r15 = r16.length()
            r17 = 1
            if (r15 != 0) goto L_0x0065
            r15 = r17
            goto L_0x0066
        L_0x0065:
            r15 = r6
        L_0x0066:
            if (r15 != 0) goto L_0x0052
            int r15 = j9.c.l(r16)
            r5 = -1
            if (r15 == r5) goto L_0x0070
            goto L_0x0052
        L_0x0070:
            int r14 = r14 + 1
            java.lang.String r14 = j9.c.x(r9, r14, r0)
            int r15 = j9.c.l(r14)
            if (r15 == r5) goto L_0x007d
            goto L_0x0052
        L_0x007d:
            int r0 = r0 + 1
            int r5 = r9.length()
            r18 = 253402300799999(0xe677d21fdbff, double:1.251973714024093E-309)
            r20 = -1
            r22 = r6
            r23 = r22
            r24 = r23
            r25 = r17
            r28 = r18
            r26 = r20
            r15 = 0
            r30 = 0
        L_0x0099:
            r31 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r33 = -9223372036854775808
            if (r0 >= r5) goto L_0x0175
            int r6 = j9.c.e(r9, r12, r0, r5)
            int r12 = j9.c.e(r9, r13, r0, r6)
            java.lang.String r0 = j9.c.x(r9, r0, r12)
            if (r12 >= r6) goto L_0x00b7
            int r12 = r12 + 1
            java.lang.String r12 = j9.c.x(r9, r12, r6)
            goto L_0x00b9
        L_0x00b7:
            java.lang.String r12 = ""
        L_0x00b9:
            java.lang.String r13 = "expires"
            boolean r13 = f9.h.V(r0, r13)
            if (r13 == 0) goto L_0x00d2
            int r0 = r12.length()     // Catch:{ IllegalArgumentException -> 0x00ce }
            long r12 = i9.j.a.b(r12, r0)     // Catch:{ IllegalArgumentException -> 0x00ce }
            r35 = r3
            r28 = r12
            goto L_0x0112
        L_0x00ce:
            r35 = r3
            goto L_0x016a
        L_0x00d2:
            java.lang.String r13 = "max-age"
            boolean r13 = f9.h.V(r0, r13)
            if (r13 == 0) goto L_0x0116
            long r12 = java.lang.Long.parseLong(r12)     // Catch:{ NumberFormatException -> 0x00ec }
            r26 = 0
            int r0 = (r12 > r26 ? 1 : (r12 == r26 ? 0 : -1))
            if (r0 > 0) goto L_0x00e5
            goto L_0x00e7
        L_0x00e5:
            r33 = r12
        L_0x00e7:
            r35 = r3
            r26 = r33
            goto L_0x0112
        L_0x00ec:
            r0 = move-exception
            r13 = r0
            java.lang.String r0 = "-?\\d+"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)     // Catch:{  }
            r35 = r3
            java.lang.String r3 = "compile(pattern)"
            z8.g.e(r0, r3)     // Catch:{ NumberFormatException -> 0x016a }
            java.util.regex.Matcher r0 = r0.matcher(r12)     // Catch:{ NumberFormatException -> 0x016a }
            boolean r0 = r0.matches()     // Catch:{ NumberFormatException -> 0x016a }
            if (r0 == 0) goto L_0x0115
            java.lang.String r0 = "-"
            r3 = 0
            boolean r0 = f9.h.a0(r12, r0, r3)     // Catch:{ NumberFormatException -> 0x016a }
            if (r0 == 0) goto L_0x0110
            r31 = r33
        L_0x0110:
            r26 = r31
        L_0x0112:
            r24 = r17
            goto L_0x016a
        L_0x0115:
            throw r13     // Catch:{ NumberFormatException -> 0x016a }
        L_0x0116:
            r35 = r3
            java.lang.String r3 = "domain"
            boolean r3 = f9.h.V(r0, r3)
            if (r3 == 0) goto L_0x014a
            java.lang.String r0 = "."
            boolean r3 = r12.endsWith(r0)     // Catch:{  }
            r3 = r3 ^ 1
            if (r3 == 0) goto L_0x013e
            java.lang.String r0 = f9.l.l0(r0, r12)     // Catch:{  }
            java.lang.String r0 = s6.a.J(r0)     // Catch:{  }
            if (r0 == 0) goto L_0x0138
            r15 = r0
            r25 = 0
            goto L_0x016a
        L_0x0138:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{  }
            r0.<init>()     // Catch:{  }
            throw r0     // Catch:{  }
        L_0x013e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{  }
            java.lang.String r3 = "Failed requirement."
            java.lang.String r3 = r3.toString()     // Catch:{  }
            r0.<init>(r3)     // Catch:{  }
            throw r0     // Catch:{  }
        L_0x014a:
            java.lang.String r3 = "path"
            boolean r3 = f9.h.V(r0, r3)
            if (r3 == 0) goto L_0x0155
            r30 = r12
            goto L_0x016a
        L_0x0155:
            java.lang.String r3 = "secure"
            boolean r3 = f9.h.V(r0, r3)
            if (r3 == 0) goto L_0x0160
            r22 = r17
            goto L_0x016a
        L_0x0160:
            java.lang.String r3 = "httponly"
            boolean r0 = f9.h.V(r0, r3)
            if (r0 == 0) goto L_0x016a
            r23 = r17
        L_0x016a:
            int r0 = r6 + 1
            r3 = r35
            r6 = 0
            r12 = 59
            r13 = 61
            goto L_0x0099
        L_0x0175:
            r35 = r3
            int r0 = (r26 > r33 ? 1 : (r26 == r33 ? 0 : -1))
            if (r0 != 0) goto L_0x017e
            r18 = r33
            goto L_0x01a0
        L_0x017e:
            int r0 = (r26 > r20 ? 1 : (r26 == r20 ? 0 : -1))
            if (r0 == 0) goto L_0x019e
            r5 = 9223372036854775(0x20c49ba5e353f7, double:4.663754807431093E-308)
            int r0 = (r26 > r5 ? 1 : (r26 == r5 ? 0 : -1))
            if (r0 > 0) goto L_0x0190
            r0 = 1000(0x3e8, float:1.401E-42)
            long r5 = (long) r0
            long r31 = r26 * r5
        L_0x0190:
            long r31 = r10 + r31
            int r0 = (r31 > r10 ? 1 : (r31 == r10 ? 0 : -1))
            if (r0 < 0) goto L_0x01a0
            int r0 = (r31 > r18 ? 1 : (r31 == r18 ? 0 : -1))
            if (r0 <= 0) goto L_0x019b
            goto L_0x01a0
        L_0x019b:
            r18 = r31
            goto L_0x01a0
        L_0x019e:
            r18 = r28
        L_0x01a0:
            java.lang.String r0 = r2.f6306e
            if (r15 != 0) goto L_0x01a6
            r3 = r0
            goto L_0x01de
        L_0x01a6:
            boolean r3 = z8.g.a(r0, r15)
            if (r3 == 0) goto L_0x01ad
            goto L_0x01da
        L_0x01ad:
            boolean r3 = f9.h.U(r0, r15)
            if (r3 == 0) goto L_0x01d8
            int r3 = r0.length()
            int r5 = r15.length()
            int r3 = r3 - r5
            int r3 = r3 + -1
            char r3 = r0.charAt(r3)
            r5 = 46
            if (r3 != r5) goto L_0x01d8
            f9.c r3 = j9.c.f6606f
            r3.getClass()
            java.util.regex.Pattern r3 = r3.f4938o
            java.util.regex.Matcher r3 = r3.matcher(r0)
            boolean r3 = r3.matches()
            if (r3 != 0) goto L_0x01d8
            goto L_0x01da
        L_0x01d8:
            r17 = 0
        L_0x01da:
            if (r17 != 0) goto L_0x01dd
            goto L_0x01f0
        L_0x01dd:
            r3 = r15
        L_0x01de:
            int r0 = r0.length()
            int r5 = r3.length()
            if (r0 == r5) goto L_0x01f2
            okhttp3.internal.publicsuffix.PublicSuffixDatabase r0 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.f7792g
            java.lang.String r0 = r0.a(r3)
            if (r0 != 0) goto L_0x01f2
        L_0x01f0:
            r6 = 0
            goto L_0x0226
        L_0x01f2:
            java.lang.String r0 = "/"
            r5 = r30
            r6 = 0
            if (r5 == 0) goto L_0x0203
            boolean r9 = f9.h.a0(r5, r0, r6)
            if (r9 != 0) goto L_0x0200
            goto L_0x0203
        L_0x0200:
            r21 = r5
            goto L_0x021b
        L_0x0203:
            java.lang.String r5 = r37.b()
            r9 = 47
            r10 = 6
            int r9 = f9.l.j0(r5, r9, r6, r10)
            if (r9 == 0) goto L_0x0219
            java.lang.String r0 = r5.substring(r6, r9)
            java.lang.String r5 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
            z8.g.e(r0, r5)
        L_0x0219:
            r21 = r0
        L_0x021b:
            i9.j r0 = new i9.j
            r15 = r0
            r17 = r14
            r20 = r3
            r15.<init>(r16, r17, r18, r20, r21, r22, r23, r24, r25)
            goto L_0x0227
        L_0x0226:
            r0 = 0
        L_0x0227:
            if (r0 == 0) goto L_0x0234
            if (r8 != 0) goto L_0x0231
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r8 = r3
        L_0x0231:
            r8.add(r0)
        L_0x0234:
            int r7 = r7 + 1
            r3 = r35
            goto L_0x002c
        L_0x023a:
            if (r8 == 0) goto L_0x0246
            java.util.List r0 = java.util.Collections.unmodifiableList(r8)
            java.lang.String r3 = "Collections.unmodifiableList(cookies)"
            z8.g.e(r0, r3)
            goto L_0x0248
        L_0x0246:
            o8.k r0 = o8.k.f7764o
        L_0x0248:
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L_0x024f
            return
        L_0x024f:
            r1.a(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n9.e.b(i9.k, i9.r, i9.q):void");
    }
}
