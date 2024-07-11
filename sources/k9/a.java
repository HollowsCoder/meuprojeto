package k9;

import f9.h;
import i9.c;
import i9.c0;
import i9.d0;
import i9.s;

public final class a implements s {

    /* renamed from: b  reason: collision with root package name */
    public static final C0095a f6729b = new C0095a();

    /* renamed from: a  reason: collision with root package name */
    public final c f6730a;

    /* renamed from: k9.a$a  reason: collision with other inner class name */
    public static final class C0095a {
        public static final c0 a(C0095a aVar, c0 c0Var) {
            d0 d0Var;
            aVar.getClass();
            if (c0Var != null) {
                d0Var = c0Var.f6196v;
            } else {
                d0Var = null;
            }
            if (d0Var == null) {
                return c0Var;
            }
            c0Var.getClass();
            c0.a aVar2 = new c0.a(c0Var);
            aVar2.f6204g = null;
            return aVar2.a();
        }

        public static boolean b(String str) {
            return !h.V("Connection", str) && !h.V("Keep-Alive", str) && !h.V("Proxy-Authenticate", str) && !h.V("Proxy-Authorization", str) && !h.V("TE", str) && !h.V("Trailers", str) && !h.V("Transfer-Encoding", str) && !h.V("Upgrade", str);
        }
    }

    public a(c cVar) {
        this.f6730a = cVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: m9.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v9, resolved type: i9.c$d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v12, resolved type: i9.c$d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v13, resolved type: k9.e$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v14, resolved type: k9.e$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v18, resolved type: i9.c$d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v26, resolved type: k9.e$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v27, resolved type: k9.e$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: m9.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: m9.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v43, resolved type: k9.e$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v44, resolved type: k9.e$a} */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00e3, code lost:
        if (r3 != null) goto L_0x00e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x022c, code lost:
        if (r4 > 0) goto L_0x022e;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0270  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x027f  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0287  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0292  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x029b  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x02a0  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x02e6  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x02eb  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0314  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x031a  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x032f  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x035a  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x0377  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x039e  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x03af  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x03b1  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x03ca A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x040a  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x042c  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:310:0x061f A[SYNTHETIC, Splitter:B:310:0x061f] */
    /* JADX WARNING: Removed duplicated region for block: B:315:0x0626  */
    /* JADX WARNING: Removed duplicated region for block: B:317:0x065c  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x016c  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x017f  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0187  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final i9.c0 a(n9.f r26) {
        /*
            r25 = this;
            r1 = r25
            r0 = r26
            m9.e r2 = r0.f7508b
            i9.c r3 = r1.f6730a
            r4 = 0
            r6 = 0
            if (r3 == 0) goto L_0x00e8
            i9.x r7 = r0.f7511f
            java.lang.String r8 = "request"
            z8.g.f(r7, r8)
            i9.c$b r8 = i9.c.f6167p
            i9.r r9 = r7.f6366b
            r8.getClass()
            java.lang.String r8 = i9.c.b.a(r9)
            k9.e r3 = r3.f6168o     // Catch:{ IOException -> 0x00e8 }
            k9.e$c r3 = r3.d(r8)     // Catch:{ IOException -> 0x00e8 }
            if (r3 == 0) goto L_0x00e8
            i9.c$c r8 = new i9.c$c     // Catch:{ IOException -> 0x00e5 }
            java.util.List<w9.b0> r10 = r3.f6761q     // Catch:{ IOException -> 0x00e5 }
            java.lang.Object r10 = r10.get(r4)     // Catch:{ IOException -> 0x00e5 }
            w9.b0 r10 = (w9.b0) r10     // Catch:{ IOException -> 0x00e5 }
            r8.<init>((w9.b0) r10)     // Catch:{ IOException -> 0x00e5 }
            i9.q r10 = r8.f6177b     // Catch:{ IOException -> 0x00e5 }
            java.lang.String r11 = r8.f6178c     // Catch:{ IOException -> 0x00e5 }
            java.lang.String r12 = r8.f6176a     // Catch:{ IOException -> 0x00e5 }
            i9.q r13 = r8.f6181g
            java.lang.String r14 = "Content-Type"
            java.lang.String r14 = r13.e(r14)
            java.lang.String r15 = "Content-Length"
            java.lang.String r15 = r13.e(r15)
            i9.x$a r4 = new i9.x$a
            r4.<init>()
            r4.e(r12)
            r4.c(r11, r6)
            java.lang.String r6 = "headers"
            z8.g.f(r10, r6)
            i9.q$a r6 = r10.i()
            r4.f6372c = r6
            i9.x r4 = r4.a()
            i9.c0$a r6 = new i9.c0$a
            r6.<init>()
            r6.f6199a = r4
            i9.w r4 = r8.d
            java.lang.String r5 = "protocol"
            z8.g.f(r4, r5)
            r6.f6200b = r4
            int r4 = r8.f6179e
            r6.f6201c = r4
            java.lang.String r4 = r8.f6180f
            java.lang.String r5 = "message"
            z8.g.f(r4, r5)
            r6.d = r4
            r6.c(r13)
            i9.c$a r4 = new i9.c$a
            r4.<init>(r3, r14, r15)
            r6.f6204g = r4
            i9.p r3 = r8.f6182h
            r6.f6202e = r3
            long r3 = r8.f6183i
            r6.f6208k = r3
            long r3 = r8.f6184j
            r6.l = r3
            i9.c0 r3 = r6.a()
            java.lang.String r4 = r9.f6311j
            boolean r4 = z8.g.a(r12, r4)
            if (r4 == 0) goto L_0x00de
            java.lang.String r4 = r7.f6367c
            boolean r4 = z8.g.a(r11, r4)
            if (r4 == 0) goto L_0x00de
            i9.q r4 = r3.u
            java.util.Set r4 = i9.c.b.c(r4)
            boolean r5 = r4.isEmpty()
            if (r5 == 0) goto L_0x00b5
            goto L_0x00d9
        L_0x00b5:
            java.util.Iterator r4 = r4.iterator()
        L_0x00b9:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x00d9
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            java.util.List r6 = r10.m(r5)
            i9.q r8 = r7.d
            java.util.List r5 = r8.m(r5)
            boolean r5 = z8.g.a(r6, r5)
            r6 = 1
            r5 = r5 ^ r6
            if (r5 == 0) goto L_0x00b9
            r6 = 0
            goto L_0x00da
        L_0x00d9:
            r6 = 1
        L_0x00da:
            if (r6 == 0) goto L_0x00de
            r6 = 1
            goto L_0x00df
        L_0x00de:
            r6 = 0
        L_0x00df:
            if (r6 != 0) goto L_0x00e9
            i9.d0 r3 = r3.f6196v
            if (r3 == 0) goto L_0x00e8
        L_0x00e5:
            j9.c.c(r3)
        L_0x00e8:
            r3 = 0
        L_0x00e9:
            long r4 = java.lang.System.currentTimeMillis()
            i9.x r6 = r0.f7511f
            java.lang.String r7 = "request"
            z8.g.f(r6, r7)
            if (r3 == 0) goto L_0x016c
            long r10 = r3.z
            long r12 = r3.A
            i9.q r14 = r3.u
            java.lang.String[] r15 = r14.f6300o
            int r15 = r15.length
            int r15 = r15 / 2
            r8 = 0
            r9 = -1
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
        L_0x010f:
            if (r8 >= r15) goto L_0x0167
            java.lang.String r7 = r14.h(r8)
            r22 = r9
            java.lang.String r9 = r14.k(r8)
            r23 = r10
            java.lang.String r10 = "Date"
            boolean r10 = f9.h.V(r7, r10)
            if (r10 == 0) goto L_0x012e
            java.util.Date r16 = n9.c.a(r9)
            r21 = r9
        L_0x012b:
            r9 = r22
            goto L_0x0162
        L_0x012e:
            java.lang.String r10 = "Expires"
            boolean r10 = f9.h.V(r7, r10)
            if (r10 == 0) goto L_0x013b
            java.util.Date r17 = n9.c.a(r9)
            goto L_0x012b
        L_0x013b:
            java.lang.String r10 = "Last-Modified"
            boolean r10 = f9.h.V(r7, r10)
            if (r10 == 0) goto L_0x014a
            java.util.Date r18 = n9.c.a(r9)
            r20 = r9
            goto L_0x012b
        L_0x014a:
            java.lang.String r10 = "ETag"
            boolean r10 = f9.h.V(r7, r10)
            if (r10 == 0) goto L_0x0155
            r19 = r9
            goto L_0x012b
        L_0x0155:
            java.lang.String r10 = "Age"
            boolean r7 = f9.h.V(r7, r10)
            if (r7 == 0) goto L_0x012b
            r7 = -1
            int r9 = j9.c.w(r9, r7)
        L_0x0162:
            int r8 = r8 + 1
            r10 = r23
            goto L_0x010f
        L_0x0167:
            r22 = r9
            r23 = r10
            goto L_0x017d
        L_0x016c:
            r9 = -1
            r10 = 0
            r12 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
        L_0x017d:
            if (r3 != 0) goto L_0x0187
            k9.d r4 = new k9.d
            r7 = 0
            r4.<init>(r6, r7)
            goto L_0x0358
        L_0x0187:
            r7 = 0
            i9.r r8 = r6.f6366b
            boolean r8 = r8.f6303a
            if (r8 == 0) goto L_0x0199
            i9.p r8 = r3.f6195t
            if (r8 != 0) goto L_0x0199
            k9.d r4 = new k9.d
            r4.<init>(r6, r7)
            goto L_0x0358
        L_0x0199:
            boolean r8 = k9.d.a.a(r6, r3)
            if (r8 != 0) goto L_0x01a6
            k9.d r4 = new k9.d
            r4.<init>(r6, r7)
            goto L_0x0358
        L_0x01a6:
            i9.d r7 = r6.f6365a
            if (r7 != 0) goto L_0x01b7
            i9.d$b r7 = i9.d.f6211o
            r7.getClass()
            i9.q r7 = r6.d
            i9.d r7 = i9.d.b.a(r7)
            r6.f6365a = r7
        L_0x01b7:
            boolean r8 = r7.f6212a
            if (r8 != 0) goto L_0x036d
            java.lang.String r8 = "If-Modified-Since"
            i9.q r14 = r6.d
            java.lang.String r14 = r14.e(r8)
            java.lang.String r15 = "If-None-Match"
            if (r14 != 0) goto L_0x01d2
            i9.q r14 = r6.d
            java.lang.String r14 = r14.e(r15)
            if (r14 == 0) goto L_0x01d0
            goto L_0x01d2
        L_0x01d0:
            r14 = 0
            goto L_0x01d3
        L_0x01d2:
            r14 = 1
        L_0x01d3:
            if (r14 == 0) goto L_0x01d7
            goto L_0x036d
        L_0x01d7:
            i9.d r14 = r3.a()
            if (r16 == 0) goto L_0x01ee
            long r22 = r16.getTime()
            long r0 = r12 - r22
            r23 = r14
            r22 = r15
            r14 = 0
            long r0 = java.lang.Math.max(r14, r0)
            goto L_0x01f4
        L_0x01ee:
            r23 = r14
            r22 = r15
            r0 = 0
        L_0x01f4:
            r14 = -1
            if (r9 == r14) goto L_0x0204
            java.util.concurrent.TimeUnit r14 = java.util.concurrent.TimeUnit.SECONDS
            r15 = r8
            long r8 = (long) r9
            long r8 = r14.toMillis(r8)
            long r0 = java.lang.Math.max(r0, r8)
            goto L_0x0205
        L_0x0204:
            r15 = r8
        L_0x0205:
            long r8 = r12 - r10
            long r4 = r4 - r12
            long r0 = r0 + r8
            long r0 = r0 + r4
            i9.d r4 = r3.a()
            int r4 = r4.f6214c
            r5 = -1
            if (r4 == r5) goto L_0x021b
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS
            long r8 = (long) r4
            long r4 = r5.toMillis(r8)
            goto L_0x022e
        L_0x021b:
            if (r17 == 0) goto L_0x0232
            if (r16 == 0) goto L_0x0223
            long r12 = r16.getTime()
        L_0x0223:
            long r4 = r17.getTime()
            long r4 = r4 - r12
            r8 = 0
            int r10 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r10 <= 0) goto L_0x0268
        L_0x022e:
            r8 = r4
            r4 = 0
            goto L_0x026b
        L_0x0232:
            if (r18 == 0) goto L_0x0268
            i9.x r4 = r3.f6191p
            i9.r r4 = r4.f6366b
            java.util.List<java.lang.String> r4 = r4.f6309h
            if (r4 != 0) goto L_0x023e
            r4 = 0
            goto L_0x024f
        L_0x023e:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            i9.r$b r8 = i9.r.l
            r8.getClass()
            i9.r.b.f(r4, r5)
            java.lang.String r4 = r5.toString()
        L_0x024f:
            if (r4 != 0) goto L_0x0268
            if (r16 == 0) goto L_0x0257
            long r10 = r16.getTime()
        L_0x0257:
            long r4 = r18.getTime()
            long r10 = r10 - r4
            r4 = 0
            int r8 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r8 <= 0) goto L_0x026a
            r8 = 10
            long r8 = (long) r8
            long r8 = r10 / r8
            goto L_0x026b
        L_0x0268:
            r4 = 0
        L_0x026a:
            r8 = r4
        L_0x026b:
            int r10 = r7.f6214c
            r11 = -1
            if (r10 == r11) goto L_0x027b
            java.util.concurrent.TimeUnit r12 = java.util.concurrent.TimeUnit.SECONDS
            long r13 = (long) r10
            long r12 = r12.toMillis(r13)
            long r8 = java.lang.Math.min(r8, r12)
        L_0x027b:
            int r10 = r7.f6219i
            if (r10 == r11) goto L_0x0287
            java.util.concurrent.TimeUnit r12 = java.util.concurrent.TimeUnit.SECONDS
            long r13 = (long) r10
            long r12 = r12.toMillis(r13)
            goto L_0x0288
        L_0x0287:
            r12 = r4
        L_0x0288:
            r10 = r23
            boolean r14 = r10.f6217g
            if (r14 != 0) goto L_0x029b
            int r7 = r7.f6218h
            if (r7 == r11) goto L_0x029b
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS
            r11 = r15
            long r14 = (long) r7
            long r4 = r4.toMillis(r14)
            goto L_0x029c
        L_0x029b:
            r11 = r15
        L_0x029c:
            boolean r7 = r10.f6212a
            if (r7 != 0) goto L_0x02e4
            long r12 = r12 + r0
            long r4 = r4 + r8
            int r4 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r4 >= 0) goto L_0x02e4
            i9.c0$a r4 = new i9.c0$a
            r4.<init>(r3)
            int r5 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r5 < 0) goto L_0x02b8
            java.lang.String r5 = "110 HttpURLConnection \"Response is stale\""
            java.lang.String r7 = "Warning"
            i9.q$a r8 = r4.f6203f
            r8.a(r7, r5)
        L_0x02b8:
            r7 = 86400000(0x5265c00, double:4.2687272E-316)
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 <= 0) goto L_0x02d8
            i9.d r0 = r3.a()
            int r0 = r0.f6214c
            r1 = -1
            if (r0 != r1) goto L_0x02cc
            if (r17 != 0) goto L_0x02cc
            r0 = 1
            goto L_0x02cd
        L_0x02cc:
            r0 = 0
        L_0x02cd:
            if (r0 == 0) goto L_0x02d8
            java.lang.String r0 = "113 HttpURLConnection \"Heuristic expiration\""
            java.lang.String r1 = "Warning"
            i9.q$a r5 = r4.f6203f
            r5.a(r1, r0)
        L_0x02d8:
            k9.d r0 = new k9.d
            i9.c0 r1 = r4.a()
            r4 = 0
            r0.<init>(r4, r1)
            goto L_0x0373
        L_0x02e4:
            if (r19 == 0) goto L_0x02eb
            r0 = r19
            r8 = r22
            goto L_0x02f7
        L_0x02eb:
            if (r18 == 0) goto L_0x02f0
            r19 = r20
            goto L_0x02f4
        L_0x02f0:
            if (r16 == 0) goto L_0x0366
            r19 = r21
        L_0x02f4:
            r8 = r11
            r0 = r19
        L_0x02f7:
            i9.q r1 = r6.d
            i9.q$a r4 = r1.i()
            z8.g.c(r0)
            r4.c(r8, r0)
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.lang.String r9 = r6.f6367c
            i9.b0 r11 = r6.f6368e
            java.util.Map<java.lang.Class<?>, java.lang.Object> r0 = r6.f6369f
            boolean r5 = r0.isEmpty()
            if (r5 == 0) goto L_0x031a
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            goto L_0x0320
        L_0x031a:
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            r5.<init>(r0)
            r0 = r5
        L_0x0320:
            r1.i()
            i9.q r1 = r4.d()
            i9.q$a r1 = r1.i()
            i9.r r8 = r6.f6366b
            if (r8 == 0) goto L_0x035a
            i9.q r10 = r1.d()
            byte[] r1 = j9.c.f6602a
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x033e
            o8.l r0 = o8.l.f7765o
            goto L_0x034c
        L_0x033e:
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>(r0)
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r1)
            java.lang.String r1 = "Collections.unmodifiableMap(LinkedHashMap(this))"
            z8.g.e(r0, r1)
        L_0x034c:
            r12 = r0
            i9.x r0 = new i9.x
            r7 = r0
            r7.<init>(r8, r9, r10, r11, r12)
            k9.d r4 = new k9.d
            r4.<init>(r0, r3)
        L_0x0358:
            r0 = r4
            goto L_0x0373
        L_0x035a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "url == null"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0366:
            k9.d r0 = new k9.d
            r1 = 0
            r0.<init>(r6, r1)
            goto L_0x0373
        L_0x036d:
            r1 = 0
            k9.d r0 = new k9.d
            r0.<init>(r6, r1)
        L_0x0373:
            i9.x r1 = r0.f6735a
            if (r1 == 0) goto L_0x0393
            i9.d r1 = r6.f6365a
            if (r1 != 0) goto L_0x0388
            i9.d$b r1 = i9.d.f6211o
            r1.getClass()
            i9.q r1 = r6.d
            i9.d r1 = i9.d.b.a(r1)
            r6.f6365a = r1
        L_0x0388:
            boolean r1 = r1.f6220j
            if (r1 == 0) goto L_0x0393
            k9.d r0 = new k9.d
            r7 = 0
            r0.<init>(r7, r7)
            goto L_0x0394
        L_0x0393:
            r7 = 0
        L_0x0394:
            i9.x r1 = r0.f6735a
            i9.c0 r4 = r0.f6736b
            r5 = r25
            i9.c r6 = r5.f6730a
            if (r6 == 0) goto L_0x03ab
            monitor-enter(r6)
            i9.x r8 = r0.f6735a     // Catch:{ all -> 0x03a8 }
            if (r8 == 0) goto L_0x03a4
            goto L_0x03a6
        L_0x03a4:
            i9.c0 r0 = r0.f6736b     // Catch:{ all -> 0x03a8 }
        L_0x03a6:
            monitor-exit(r6)
            goto L_0x03ab
        L_0x03a8:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L_0x03ab:
            boolean r0 = r2 instanceof m9.e
            if (r0 != 0) goto L_0x03b1
            r0 = r7
            goto L_0x03b2
        L_0x03b1:
            r0 = r2
        L_0x03b2:
            if (r0 == 0) goto L_0x03b9
            i9.n r0 = r0.f7236p
            if (r0 == 0) goto L_0x03b9
            goto L_0x03bb
        L_0x03b9:
            i9.n$a r0 = i9.n.f6286a
        L_0x03bb:
            if (r3 == 0) goto L_0x03c6
            if (r4 != 0) goto L_0x03c6
            i9.d0 r6 = r3.f6196v
            if (r6 == 0) goto L_0x03c6
            j9.c.c(r6)
        L_0x03c6:
            r8 = -1
            if (r1 != 0) goto L_0x0406
            if (r4 != 0) goto L_0x0406
            i9.c0$a r1 = new i9.c0$a
            r1.<init>()
            r6 = r26
            i9.x r3 = r6.f7511f
            java.lang.String r4 = "request"
            z8.g.f(r3, r4)
            r1.f6199a = r3
            i9.w r3 = i9.w.HTTP_1_1
            java.lang.String r4 = "protocol"
            z8.g.f(r3, r4)
            r1.f6200b = r3
            r3 = 504(0x1f8, float:7.06E-43)
            r1.f6201c = r3
            java.lang.String r3 = "Unsatisfiable Request (only-if-cached)"
            r1.d = r3
            i9.e0 r3 = j9.c.f6604c
            r1.f6204g = r3
            r1.f6208k = r8
            long r3 = java.lang.System.currentTimeMillis()
            r1.l = r3
            i9.c0 r1 = r1.a()
            r0.getClass()
            java.lang.String r0 = "call"
            z8.g.f(r2, r0)
            return r1
        L_0x0406:
            r6 = r26
            if (r1 != 0) goto L_0x042c
            z8.g.c(r4)
            i9.c0$a r1 = new i9.c0$a
            r1.<init>(r4)
            k9.a$a r3 = f6729b
            i9.c0 r3 = k9.a.C0095a.a(r3, r4)
            java.lang.String r4 = "cacheResponse"
            i9.c0.a.b(r4, r3)
            r1.f6206i = r3
            i9.c0 r1 = r1.a()
            r0.getClass()
            java.lang.String r0 = "call"
            z8.g.f(r2, r0)
            return r1
        L_0x042c:
            if (r4 == 0) goto L_0x0437
            r0.getClass()
            java.lang.String r10 = "call"
            z8.g.f(r2, r10)
            goto L_0x0443
        L_0x0437:
            i9.c r10 = r5.f6730a
            if (r10 == 0) goto L_0x0443
            r0.getClass()
            java.lang.String r10 = "call"
            z8.g.f(r2, r10)
        L_0x0443:
            i9.c0 r3 = r6.b(r1)     // Catch:{ all -> 0x06a1 }
            if (r4 == 0) goto L_0x056f
            int r6 = r3.f6194s
            r10 = 304(0x130, float:4.26E-43)
            if (r6 != r10) goto L_0x0566
            i9.c0$a r1 = new i9.c0$a
            r1.<init>(r4)
            k9.a$a r6 = f6729b
            i9.q r8 = r4.u
            i9.q r9 = r3.u
            r6.getClass()
            i9.q$a r6 = new i9.q$a
            r6.<init>()
            java.lang.String[] r10 = r8.f6300o
            int r10 = r10.length
            int r10 = r10 / 2
            r11 = 0
        L_0x0468:
            if (r11 >= r10) goto L_0x04b5
            java.lang.String r12 = r8.h(r11)
            java.lang.String r13 = r8.k(r11)
            java.lang.String r14 = "Warning"
            boolean r14 = f9.h.V(r14, r12)
            if (r14 == 0) goto L_0x0484
            java.lang.String r14 = "1"
            r15 = 0
            boolean r14 = f9.h.a0(r13, r14, r15)
            if (r14 == 0) goto L_0x0485
            goto L_0x04b2
        L_0x0484:
            r15 = 0
        L_0x0485:
            java.lang.String r14 = "Content-Length"
            boolean r14 = f9.h.V(r14, r12)
            if (r14 != 0) goto L_0x04a0
            java.lang.String r14 = "Content-Encoding"
            boolean r14 = f9.h.V(r14, r12)
            if (r14 != 0) goto L_0x04a0
            java.lang.String r14 = "Content-Type"
            boolean r14 = f9.h.V(r14, r12)
            if (r14 == 0) goto L_0x049e
            goto L_0x04a0
        L_0x049e:
            r14 = r15
            goto L_0x04a1
        L_0x04a0:
            r14 = 1
        L_0x04a1:
            if (r14 != 0) goto L_0x04af
            boolean r14 = k9.a.C0095a.b(r12)
            if (r14 == 0) goto L_0x04af
            java.lang.String r14 = r9.e(r12)
            if (r14 != 0) goto L_0x04b2
        L_0x04af:
            r6.c(r12, r13)
        L_0x04b2:
            int r11 = r11 + 1
            goto L_0x0468
        L_0x04b5:
            r15 = 0
            java.lang.String[] r8 = r9.f6300o
            int r8 = r8.length
            int r8 = r8 / 2
            r10 = r15
        L_0x04bc:
            if (r10 >= r8) goto L_0x04f0
            java.lang.String r11 = r9.h(r10)
            java.lang.String r12 = "Content-Length"
            boolean r12 = f9.h.V(r12, r11)
            if (r12 != 0) goto L_0x04dd
            java.lang.String r12 = "Content-Encoding"
            boolean r12 = f9.h.V(r12, r11)
            if (r12 != 0) goto L_0x04dd
            java.lang.String r12 = "Content-Type"
            boolean r12 = f9.h.V(r12, r11)
            if (r12 == 0) goto L_0x04db
            goto L_0x04dd
        L_0x04db:
            r12 = r15
            goto L_0x04de
        L_0x04dd:
            r12 = 1
        L_0x04de:
            if (r12 != 0) goto L_0x04ed
            boolean r12 = k9.a.C0095a.b(r11)
            if (r12 == 0) goto L_0x04ed
            java.lang.String r12 = r9.k(r10)
            r6.c(r11, r12)
        L_0x04ed:
            int r10 = r10 + 1
            goto L_0x04bc
        L_0x04f0:
            i9.q r6 = r6.d()
            r1.c(r6)
            long r8 = r3.z
            r1.f6208k = r8
            long r8 = r3.A
            r1.l = r8
            k9.a$a r6 = f6729b
            i9.c0 r8 = k9.a.C0095a.a(r6, r4)
            java.lang.String r9 = "cacheResponse"
            i9.c0.a.b(r9, r8)
            r1.f6206i = r8
            i9.c0 r6 = k9.a.C0095a.a(r6, r3)
            java.lang.String r8 = "networkResponse"
            i9.c0.a.b(r8, r6)
            r1.f6205h = r6
            i9.c0 r1 = r1.a()
            i9.d0 r3 = r3.f6196v
            z8.g.c(r3)
            r3.close()
            i9.c r3 = r5.f6730a
            z8.g.c(r3)
            monitor-enter(r3)
            monitor-exit(r3)
            i9.c r3 = r5.f6730a
            r3.getClass()
            i9.c$c r3 = new i9.c$c
            r3.<init>((i9.c0) r1)
            i9.d0 r4 = r4.f6196v
            if (r4 == 0) goto L_0x055e
            i9.c$a r4 = (i9.c.a) r4
            k9.e$c r4 = r4.f6170r
            java.lang.String r6 = r4.f6759o     // Catch:{ IOException -> 0x054f }
            long r8 = r4.f6760p     // Catch:{ IOException -> 0x054f }
            k9.e r4 = r4.f6762r     // Catch:{ IOException -> 0x054f }
            k9.e$a r6 = r4.c(r6, r8)     // Catch:{ IOException -> 0x054f }
            if (r6 == 0) goto L_0x0555
            r3.c(r6)     // Catch:{ IOException -> 0x0550 }
            r6.b()     // Catch:{ IOException -> 0x0550 }
            goto L_0x0555
        L_0x054f:
            r6 = r7
        L_0x0550:
            if (r6 == 0) goto L_0x0555
            r6.a()     // Catch:{ IOException -> 0x0555 }
        L_0x0555:
            r0.getClass()
            java.lang.String r0 = "call"
            z8.g.f(r2, r0)
            return r1
        L_0x055e:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "null cannot be cast to non-null type okhttp3.Cache.CacheResponseBody"
            r0.<init>(r1)
            throw r0
        L_0x0566:
            r15 = 0
            i9.d0 r6 = r4.f6196v
            if (r6 == 0) goto L_0x0570
            j9.c.c(r6)
            goto L_0x0570
        L_0x056f:
            r15 = 0
        L_0x0570:
            i9.c0$a r6 = new i9.c0$a
            r6.<init>(r3)
            k9.a$a r10 = f6729b
            i9.c0 r11 = k9.a.C0095a.a(r10, r4)
            java.lang.String r12 = "cacheResponse"
            i9.c0.a.b(r12, r11)
            r6.f6206i = r11
            i9.c0 r3 = k9.a.C0095a.a(r10, r3)
            java.lang.String r10 = "networkResponse"
            i9.c0.a.b(r10, r3)
            r6.f6205h = r3
            i9.c0 r3 = r6.a()
            i9.c r6 = r5.f6730a
            if (r6 == 0) goto L_0x06a0
            boolean r6 = n9.e.a(r3)
            if (r6 == 0) goto L_0x0665
            boolean r6 = k9.d.a.a(r1, r3)
            if (r6 == 0) goto L_0x0665
            i9.c r1 = r5.f6730a
            r1.getClass()
            i9.x r6 = r3.f6191p
            java.lang.String r10 = r6.f6367c
            java.lang.String r11 = "method"
            z8.g.f(r10, r11)
            java.lang.String r11 = "POST"
            boolean r11 = z8.g.a(r10, r11)
            if (r11 != 0) goto L_0x05d7
            java.lang.String r11 = "PATCH"
            boolean r11 = z8.g.a(r10, r11)
            if (r11 != 0) goto L_0x05d7
            java.lang.String r11 = "PUT"
            boolean r11 = z8.g.a(r10, r11)
            if (r11 != 0) goto L_0x05d7
            java.lang.String r11 = "DELETE"
            boolean r11 = z8.g.a(r10, r11)
            if (r11 != 0) goto L_0x05d7
            java.lang.String r11 = "MOVE"
            boolean r11 = z8.g.a(r10, r11)
            if (r11 == 0) goto L_0x05d8
        L_0x05d7:
            r15 = 1
        L_0x05d8:
            if (r15 == 0) goto L_0x05de
            r1.a(r6)     // Catch:{ IOException -> 0x0622 }
            goto L_0x0622
        L_0x05de:
            java.lang.String r11 = "GET"
            boolean r10 = z8.g.a(r10, r11)
            r11 = 1
            r10 = r10 ^ r11
            if (r10 == 0) goto L_0x05e9
            goto L_0x0622
        L_0x05e9:
            i9.c$b r10 = i9.c.f6167p
            r10.getClass()
            i9.q r10 = r3.u
            java.util.Set r10 = i9.c.b.c(r10)
            java.lang.String r11 = "*"
            boolean r10 = r10.contains(r11)
            if (r10 == 0) goto L_0x05fd
            goto L_0x0622
        L_0x05fd:
            i9.c$c r10 = new i9.c$c
            r10.<init>((i9.c0) r3)
            k9.e r11 = r1.f6168o     // Catch:{ IOException -> 0x061c }
            i9.r r6 = r6.f6366b     // Catch:{ IOException -> 0x061c }
            java.lang.String r6 = i9.c.b.a(r6)     // Catch:{ IOException -> 0x061c }
            f9.c r12 = k9.e.J     // Catch:{ IOException -> 0x061c }
            k9.e$a r6 = r11.c(r6, r8)     // Catch:{ IOException -> 0x061c }
            if (r6 == 0) goto L_0x0622
            r10.c(r6)     // Catch:{ IOException -> 0x061d }
            i9.c$d r8 = new i9.c$d     // Catch:{ IOException -> 0x061d }
            r8.<init>(r6)     // Catch:{ IOException -> 0x061d }
            r6 = r8
            goto L_0x0623
        L_0x061c:
            r6 = r7
        L_0x061d:
            if (r6 == 0) goto L_0x0622
            r6.a()     // Catch:{ IOException -> 0x0622 }
        L_0x0622:
            r6 = r7
        L_0x0623:
            if (r6 != 0) goto L_0x0626
            goto L_0x065a
        L_0x0626:
            i9.c$d$a r1 = r6.f6186b
            i9.d0 r7 = r3.f6196v
            z8.g.c(r7)
            w9.i r7 = r7.c()
            w9.u r1 = n.e.n(r1)
            k9.b r8 = new k9.b
            r8.<init>(r7, r6, r1)
            java.lang.String r1 = "Content-Type"
            java.lang.String r1 = i9.c0.b(r3, r1)
            i9.d0 r6 = r3.f6196v
            long r6 = r6.a()
            i9.c0$a r9 = new i9.c0$a
            r9.<init>(r3)
            n9.g r3 = new n9.g
            w9.v r8 = n.e.o(r8)
            r3.<init>(r1, r6, r8)
            r9.f6204g = r3
            i9.c0 r3 = r9.a()
        L_0x065a:
            if (r4 == 0) goto L_0x0664
            r0.getClass()
            java.lang.String r0 = "call"
            z8.g.f(r2, r0)
        L_0x0664:
            return r3
        L_0x0665:
            r11 = 1
            java.lang.String r0 = r1.f6367c
            java.lang.String r2 = "method"
            z8.g.f(r0, r2)
            java.lang.String r2 = "POST"
            boolean r2 = z8.g.a(r0, r2)
            if (r2 != 0) goto L_0x0698
            java.lang.String r2 = "PATCH"
            boolean r2 = z8.g.a(r0, r2)
            if (r2 != 0) goto L_0x0698
            java.lang.String r2 = "PUT"
            boolean r2 = z8.g.a(r0, r2)
            if (r2 != 0) goto L_0x0698
            java.lang.String r2 = "DELETE"
            boolean r2 = z8.g.a(r0, r2)
            if (r2 != 0) goto L_0x0698
            java.lang.String r2 = "MOVE"
            boolean r0 = z8.g.a(r0, r2)
            if (r0 == 0) goto L_0x0696
            goto L_0x0698
        L_0x0696:
            r4 = r15
            goto L_0x0699
        L_0x0698:
            r4 = r11
        L_0x0699:
            if (r4 == 0) goto L_0x06a0
            i9.c r0 = r5.f6730a     // Catch:{ IOException -> 0x06a0 }
            r0.a(r1)     // Catch:{ IOException -> 0x06a0 }
        L_0x06a0:
            return r3
        L_0x06a1:
            r0 = move-exception
            r1 = r0
            if (r3 == 0) goto L_0x06ac
            i9.d0 r0 = r3.f6196v
            if (r0 == 0) goto L_0x06ac
            j9.c.c(r0)
        L_0x06ac:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: k9.a.a(n9.f):i9.c0");
    }
}
