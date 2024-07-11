package y9;

public abstract class e0<T> {
    /* JADX WARNING: Removed duplicated region for block: B:385:0x08d8  */
    /* JADX WARNING: Removed duplicated region for block: B:560:0x08dc A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static y9.k b(y9.d0 r28, java.lang.reflect.Method r29) {
        /*
            r0 = r28
            r1 = r29
            y9.a0$a r2 = new y9.a0$a
            r2.<init>(r0, r1)
            java.lang.annotation.Annotation[] r3 = r2.f9643c
            int r4 = r3.length
            r5 = 0
            r6 = r5
        L_0x000e:
            r7 = 1
            java.lang.String r8 = "HEAD"
            java.lang.reflect.Method r9 = r2.f9642b
            if (r6 >= r4) goto L_0x0135
            r10 = r3[r6]
            boolean r11 = r10 instanceof aa.b
            if (r11 == 0) goto L_0x0024
            aa.b r10 = (aa.b) r10
            java.lang.String r7 = r10.value()
            java.lang.String r8 = "DELETE"
            goto L_0x0073
        L_0x0024:
            boolean r11 = r10 instanceof aa.f
            if (r11 == 0) goto L_0x0031
            aa.f r10 = (aa.f) r10
            java.lang.String r7 = r10.value()
            java.lang.String r8 = "GET"
            goto L_0x0073
        L_0x0031:
            boolean r11 = r10 instanceof aa.g
            if (r11 == 0) goto L_0x003c
            aa.g r10 = (aa.g) r10
            java.lang.String r7 = r10.value()
            goto L_0x0073
        L_0x003c:
            boolean r8 = r10 instanceof aa.n
            if (r8 == 0) goto L_0x0049
            aa.n r10 = (aa.n) r10
            java.lang.String r8 = r10.value()
            java.lang.String r9 = "PATCH"
            goto L_0x0062
        L_0x0049:
            boolean r8 = r10 instanceof aa.o
            if (r8 == 0) goto L_0x0056
            aa.o r10 = (aa.o) r10
            java.lang.String r8 = r10.value()
            java.lang.String r9 = "POST"
            goto L_0x0062
        L_0x0056:
            boolean r8 = r10 instanceof aa.p
            if (r8 == 0) goto L_0x0067
            aa.p r10 = (aa.p) r10
            java.lang.String r8 = r10.value()
            java.lang.String r9 = "PUT"
        L_0x0062:
            r2.b(r9, r8, r7)
            goto L_0x0131
        L_0x0067:
            boolean r8 = r10 instanceof aa.m
            if (r8 == 0) goto L_0x0078
            aa.m r10 = (aa.m) r10
            java.lang.String r7 = r10.value()
            java.lang.String r8 = "OPTIONS"
        L_0x0073:
            r2.b(r8, r7, r5)
            goto L_0x0131
        L_0x0078:
            boolean r8 = r10 instanceof aa.h
            if (r8 == 0) goto L_0x008f
            aa.h r10 = (aa.h) r10
            java.lang.String r7 = r10.method()
            java.lang.String r8 = r10.path()
            boolean r9 = r10.hasBody()
            r2.b(r7, r8, r9)
            goto L_0x0131
        L_0x008f:
            boolean r8 = r10 instanceof aa.k
            if (r8 == 0) goto L_0x010a
            aa.k r10 = (aa.k) r10
            java.lang.String[] r8 = r10.value()
            int r10 = r8.length
            if (r10 == 0) goto L_0x0100
            i9.q$a r10 = new i9.q$a
            r10.<init>()
            int r11 = r8.length
            r12 = r5
        L_0x00a3:
            if (r12 >= r11) goto L_0x00f9
            r13 = r8[r12]
            r14 = 58
            int r14 = r13.indexOf(r14)
            r15 = -1
            if (r14 == r15) goto L_0x00ed
            if (r14 == 0) goto L_0x00ed
            int r15 = r13.length()
            int r15 = r15 - r7
            if (r14 == r15) goto L_0x00ed
            java.lang.String r15 = r13.substring(r5, r14)
            int r14 = r14 + 1
            java.lang.String r13 = r13.substring(r14)
            java.lang.String r13 = r13.trim()
            java.lang.String r14 = "Content-Type"
            boolean r14 = r14.equalsIgnoreCase(r15)
            if (r14 == 0) goto L_0x00e7
            i9.t$a r14 = i9.t.f6320f     // Catch:{ IllegalArgumentException -> 0x00db }
            r14.getClass()     // Catch:{ IllegalArgumentException -> 0x00db }
            i9.t r14 = i9.t.a.a(r13)     // Catch:{ IllegalArgumentException -> 0x00db }
            r2.f9658t = r14     // Catch:{ IllegalArgumentException -> 0x00db }
            goto L_0x00ea
        L_0x00db:
            r0 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r7]
            r1[r5] = r13
            java.lang.String r2 = "Malformed content type: %s"
            java.lang.IllegalArgumentException r0 = y9.h0.j(r9, r0, r2, r1)
            throw r0
        L_0x00e7:
            r10.a(r15, r13)
        L_0x00ea:
            int r12 = r12 + 1
            goto L_0x00a3
        L_0x00ed:
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r5] = r13
            java.lang.String r1 = "@Headers value must be in the form \"Name: Value\". Found: \"%s\""
            r2 = 0
            java.lang.IllegalArgumentException r0 = y9.h0.j(r9, r2, r1, r0)
            throw r0
        L_0x00f9:
            i9.q r7 = r10.d()
            r2.f9657s = r7
            goto L_0x0131
        L_0x0100:
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.String r2 = "@Headers annotation is empty."
            java.lang.IllegalArgumentException r0 = y9.h0.j(r9, r0, r2, r1)
            throw r0
        L_0x010a:
            r8 = 0
            boolean r11 = r10 instanceof aa.l
            java.lang.String r12 = "Only one encoding annotation is allowed."
            if (r11 == 0) goto L_0x011f
            boolean r10 = r2.f9654p
            if (r10 != 0) goto L_0x0118
            r2.f9655q = r7
            goto L_0x0131
        L_0x0118:
            java.lang.Object[] r0 = new java.lang.Object[r5]
            java.lang.IllegalArgumentException r0 = y9.h0.j(r9, r8, r12, r0)
            throw r0
        L_0x011f:
            boolean r10 = r10 instanceof aa.e
            if (r10 == 0) goto L_0x0131
            boolean r10 = r2.f9655q
            if (r10 != 0) goto L_0x012a
            r2.f9654p = r7
            goto L_0x0131
        L_0x012a:
            java.lang.Object[] r0 = new java.lang.Object[r5]
            java.lang.IllegalArgumentException r0 = y9.h0.j(r9, r8, r12, r0)
            throw r0
        L_0x0131:
            int r6 = r6 + 1
            goto L_0x000e
        L_0x0135:
            java.lang.String r3 = r2.f9652n
            if (r3 == 0) goto L_0x0adf
            boolean r3 = r2.f9653o
            if (r3 != 0) goto L_0x015a
            boolean r3 = r2.f9655q
            if (r3 != 0) goto L_0x0150
            boolean r3 = r2.f9654p
            if (r3 != 0) goto L_0x0146
            goto L_0x015a
        L_0x0146:
            java.lang.Object[] r0 = new java.lang.Object[r5]
            java.lang.String r1 = "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST)."
            r2 = 0
            java.lang.IllegalArgumentException r0 = y9.h0.j(r9, r2, r1, r0)
            throw r0
        L_0x0150:
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.String r2 = "Multipart can only be specified on HTTP methods with request body (e.g., @POST)."
            java.lang.IllegalArgumentException r0 = y9.h0.j(r9, r0, r2, r1)
            throw r0
        L_0x015a:
            java.lang.annotation.Annotation[][] r3 = r2.d
            int r4 = r3.length
            y9.x[] r6 = new y9.x[r4]
            r2.f9659v = r6
            int r6 = r4 + -1
            r11 = r2
            r10 = r7
            r7 = r5
        L_0x0166:
            if (r5 >= r4) goto L_0x094b
            y9.x<?>[] r12 = r11.f9659v
            java.lang.reflect.Type[] r13 = r11.f9644e
            r13 = r13[r5]
            r14 = r3[r5]
            if (r5 != r6) goto L_0x0173
            r7 = r10
        L_0x0173:
            if (r14 == 0) goto L_0x0909
            int r10 = r14.length
            r15 = 0
            r16 = 0
            r17 = r16
            r16 = r3
            r3 = r15
            r15 = r11
        L_0x017f:
            if (r3 >= r10) goto L_0x08fb
            r18 = r4
            r4 = r14[r3]
            r19 = r6
            boolean r6 = r4 instanceof aa.y
            r20 = r10
            java.lang.String r10 = "@Path parameters may not be used with @Url."
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            if (r6 == 0) goto L_0x021f
            r11.c(r5, r13)
            boolean r4 = r15.f9651m
            if (r4 != 0) goto L_0x0215
            boolean r4 = r15.f9648i
            if (r4 != 0) goto L_0x020d
            boolean r4 = r15.f9649j
            if (r4 != 0) goto L_0x0203
            boolean r4 = r15.f9650k
            if (r4 != 0) goto L_0x01f9
            boolean r4 = r15.l
            if (r4 != 0) goto L_0x01ef
            java.lang.String r4 = r15.f9656r
            if (r4 != 0) goto L_0x01e0
            r4 = 1
            r15.f9651m = r4
            java.lang.Class<i9.r> r4 = i9.r.class
            if (r13 == r4) goto L_0x01d7
            if (r13 == r1) goto L_0x01d7
            java.lang.Class<java.net.URI> r1 = java.net.URI.class
            if (r13 == r1) goto L_0x01d7
            boolean r1 = r13 instanceof java.lang.Class
            if (r1 == 0) goto L_0x01cd
            r1 = r13
            java.lang.Class r1 = (java.lang.Class) r1
            java.lang.String r1 = r1.getName()
            java.lang.String r4 = "android.net.Uri"
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L_0x01cd
            goto L_0x01d7
        L_0x01cd:
            java.lang.String r0 = "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type."
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.IllegalArgumentException r0 = y9.h0.k(r9, r5, r0, r1)
            throw r0
        L_0x01d7:
            y9.x$n r1 = new y9.x$n
            r1.<init>(r5, r9)
            r21 = r8
            goto L_0x026a
        L_0x01e0:
            r0 = 0
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = r15.f9652n
            r1[r0] = r2
            java.lang.String r0 = "@Url cannot be used with @%s URL"
            java.lang.IllegalArgumentException r0 = y9.h0.k(r9, r5, r0, r1)
            throw r0
        L_0x01ef:
            r0 = 0
            java.lang.String r1 = "A @Url parameter must not come after a @QueryMap."
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.IllegalArgumentException r0 = y9.h0.k(r9, r5, r1, r0)
            throw r0
        L_0x01f9:
            r0 = 0
            java.lang.String r1 = "A @Url parameter must not come after a @QueryName."
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.IllegalArgumentException r0 = y9.h0.k(r9, r5, r1, r0)
            throw r0
        L_0x0203:
            r0 = 0
            java.lang.String r1 = "A @Url parameter must not come after a @Query."
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.IllegalArgumentException r0 = y9.h0.k(r9, r5, r1, r0)
            throw r0
        L_0x020d:
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.IllegalArgumentException r0 = y9.h0.k(r9, r5, r10, r0)
            throw r0
        L_0x0215:
            r0 = 0
            java.lang.String r1 = "Multiple @Url method annotations found."
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.IllegalArgumentException r0 = y9.h0.k(r9, r5, r1, r0)
            throw r0
        L_0x021f:
            boolean r6 = r4 instanceof aa.s
            r21 = r8
            y9.d0 r8 = r15.f9641a
            if (r6 == 0) goto L_0x02cd
            r11.c(r5, r13)
            boolean r1 = r15.f9649j
            if (r1 != 0) goto L_0x02c3
            boolean r1 = r15.f9650k
            if (r1 != 0) goto L_0x02b9
            boolean r1 = r15.l
            if (r1 != 0) goto L_0x02af
            boolean r1 = r15.f9651m
            if (r1 != 0) goto L_0x02a7
            java.lang.String r1 = r15.f9656r
            if (r1 == 0) goto L_0x0298
            r1 = 1
            r15.f9648i = r1
            aa.s r4 = (aa.s) r4
            java.lang.String r1 = r4.value()
            java.util.regex.Pattern r6 = y9.a0.a.f9640y
            java.util.regex.Matcher r6 = r6.matcher(r1)
            boolean r6 = r6.matches()
            if (r6 == 0) goto L_0x0282
            java.util.LinkedHashSet r6 = r15.u
            boolean r6 = r6.contains(r1)
            if (r6 == 0) goto L_0x0270
            r8.e(r13, r14)
            y9.x$i r6 = new y9.x$i
            java.lang.reflect.Method r8 = r15.f9642b
            boolean r4 = r4.encoded()
            r6.<init>(r8, r5, r1, r4)
            r1 = r6
        L_0x026a:
            r23 = r7
            r22 = r12
            goto L_0x03de
        L_0x0270:
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = r15.f9656r
            r3 = 0
            r0[r3] = r2
            r2 = 1
            r0[r2] = r1
            java.lang.String r1 = "URL \"%s\" does not contain \"{%s}\"."
            java.lang.IllegalArgumentException r0 = y9.h0.k(r9, r5, r1, r0)
            throw r0
        L_0x0282:
            r0 = 1
            r2 = 0
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.util.regex.Pattern r4 = y9.a0.a.f9639x
            java.lang.String r4 = r4.pattern()
            r3[r2] = r4
            r3[r0] = r1
            java.lang.String r0 = "@Path parameter name must match %s. Found: %s"
            java.lang.IllegalArgumentException r0 = y9.h0.k(r9, r5, r0, r3)
            throw r0
        L_0x0298:
            r0 = 1
            r1 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = r15.f9652n
            r0[r1] = r2
            java.lang.String r1 = "@Path can only be used with relative url on @%s"
            java.lang.IllegalArgumentException r0 = y9.h0.k(r9, r5, r1, r0)
            throw r0
        L_0x02a7:
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.IllegalArgumentException r0 = y9.h0.k(r9, r5, r10, r0)
            throw r0
        L_0x02af:
            r0 = 0
            java.lang.String r1 = "A @Path parameter must not come after a @QueryMap."
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.IllegalArgumentException r0 = y9.h0.k(r9, r5, r1, r0)
            throw r0
        L_0x02b9:
            r0 = 0
            java.lang.String r1 = "A @Path parameter must not come after a @QueryName."
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.IllegalArgumentException r0 = y9.h0.k(r9, r5, r1, r0)
            throw r0
        L_0x02c3:
            r0 = 0
            java.lang.String r1 = "A @Path parameter must not come after a @Query."
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.IllegalArgumentException r0 = y9.h0.k(r9, r5, r1, r0)
            throw r0
        L_0x02cd:
            boolean r6 = r4 instanceof aa.t
            java.lang.String r10 = "<String>)"
            java.lang.String r0 = " must include generic type (e.g., "
            r22 = r12
            java.lang.Class<java.lang.Iterable> r12 = java.lang.Iterable.class
            if (r6 == 0) goto L_0x035d
            r11.c(r5, r13)
            aa.t r4 = (aa.t) r4
            java.lang.String r1 = r4.value()
            boolean r4 = r4.encoded()
            java.lang.Class r6 = y9.h0.f(r13)
            r23 = r7
            r7 = 1
            r15.f9649j = r7
            boolean r7 = r12.isAssignableFrom(r6)
            if (r7 == 0) goto L_0x0335
            boolean r7 = r13 instanceof java.lang.reflect.ParameterizedType
            if (r7 == 0) goto L_0x0310
            r0 = r13
            java.lang.reflect.ParameterizedType r0 = (java.lang.reflect.ParameterizedType) r0
            r6 = 0
            java.lang.reflect.Type r0 = y9.h0.e(r6, r0)
            r8.e(r0, r14)
            y9.x$j r0 = new y9.x$j
            r0.<init>(r1, r4)
            y9.v r1 = new y9.v
            r1.<init>(r0)
            goto L_0x03de
        L_0x0310:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r6.getSimpleName()
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r6.getSimpleName()
            r1.append(r0)
            r1.append(r10)
            java.lang.String r0 = r1.toString()
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.IllegalArgumentException r0 = y9.h0.k(r9, r5, r0, r1)
            throw r0
        L_0x0335:
            boolean r0 = r6.isArray()
            if (r0 == 0) goto L_0x0352
            java.lang.Class r0 = r6.getComponentType()
            java.lang.Class r0 = y9.a0.a.a(r0)
            r8.e(r0, r14)
            y9.x$j r0 = new y9.x$j
            r0.<init>(r1, r4)
            y9.w r1 = new y9.w
            r1.<init>(r0)
            goto L_0x03de
        L_0x0352:
            r8.e(r13, r14)
            y9.x$j r0 = new y9.x$j
            r0.<init>(r1, r4)
        L_0x035a:
            r1 = r0
            goto L_0x03de
        L_0x035d:
            r23 = r7
            boolean r6 = r4 instanceof aa.v
            if (r6 == 0) goto L_0x03e3
            r11.c(r5, r13)
            aa.v r4 = (aa.v) r4
            boolean r1 = r4.encoded()
            java.lang.Class r4 = y9.h0.f(r13)
            r6 = 1
            r15.f9650k = r6
            boolean r6 = r12.isAssignableFrom(r4)
            if (r6 == 0) goto L_0x03b8
            boolean r6 = r13 instanceof java.lang.reflect.ParameterizedType
            if (r6 == 0) goto L_0x0393
            r0 = r13
            java.lang.reflect.ParameterizedType r0 = (java.lang.reflect.ParameterizedType) r0
            r4 = 0
            java.lang.reflect.Type r0 = y9.h0.e(r4, r0)
            r8.e(r0, r14)
            y9.x$l r0 = new y9.x$l
            r0.<init>(r1)
            y9.v r1 = new y9.v
            r1.<init>(r0)
            goto L_0x03de
        L_0x0393:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r4.getSimpleName()
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r4.getSimpleName()
            r1.append(r0)
            r1.append(r10)
            java.lang.String r0 = r1.toString()
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.IllegalArgumentException r0 = y9.h0.k(r9, r5, r0, r1)
            throw r0
        L_0x03b8:
            boolean r0 = r4.isArray()
            if (r0 == 0) goto L_0x03d4
            java.lang.Class r0 = r4.getComponentType()
            java.lang.Class r0 = y9.a0.a.a(r0)
            r8.e(r0, r14)
            y9.x$l r0 = new y9.x$l
            r0.<init>(r1)
            y9.w r1 = new y9.w
            r1.<init>(r0)
            goto L_0x03de
        L_0x03d4:
            r8.e(r13, r14)
            y9.x$l r0 = new y9.x$l
            r0.<init>(r1)
            goto L_0x035a
        L_0x03de:
            r0 = r2
            r24 = r3
            goto L_0x08d5
        L_0x03e3:
            boolean r6 = r4 instanceof aa.u
            java.lang.String r7 = "Map must include generic types (e.g., Map<String, String>)"
            r24 = r3
            java.lang.Class<java.util.Map> r3 = java.util.Map.class
            if (r6 == 0) goto L_0x044a
            r11.c(r5, r13)
            java.lang.Class r0 = y9.h0.f(r13)
            r6 = 1
            r15.l = r6
            boolean r3 = r3.isAssignableFrom(r0)
            if (r3 == 0) goto L_0x0440
            java.lang.reflect.Type r0 = y9.h0.g(r13, r0)
            boolean r3 = r0 instanceof java.lang.reflect.ParameterizedType
            if (r3 == 0) goto L_0x0438
            java.lang.reflect.ParameterizedType r0 = (java.lang.reflect.ParameterizedType) r0
            r3 = 0
            java.lang.reflect.Type r3 = y9.h0.e(r3, r0)
            if (r1 != r3) goto L_0x0422
            java.lang.reflect.Type r0 = y9.h0.e(r6, r0)
            r8.e(r0, r14)
            y9.x$k r0 = new y9.x$k
            aa.u r4 = (aa.u) r4
            boolean r1 = r4.encoded()
            r0.<init>(r9, r5, r1)
            goto L_0x05f9
        L_0x0422:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "@QueryMap keys must be of type String: "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.IllegalArgumentException r0 = y9.h0.k(r9, r5, r0, r1)
            throw r0
        L_0x0438:
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.IllegalArgumentException r0 = y9.h0.k(r9, r5, r7, r0)
            throw r0
        L_0x0440:
            r0 = 0
            java.lang.String r1 = "@QueryMap parameter type must be Map."
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.IllegalArgumentException r0 = y9.h0.k(r9, r5, r1, r0)
            throw r0
        L_0x044a:
            boolean r6 = r4 instanceof aa.i
            if (r6 == 0) goto L_0x04c8
            r11.c(r5, r13)
            aa.i r4 = (aa.i) r4
            java.lang.String r1 = r4.value()
            java.lang.Class r3 = y9.h0.f(r13)
            boolean r4 = r12.isAssignableFrom(r3)
            if (r4 == 0) goto L_0x04a0
            boolean r4 = r13 instanceof java.lang.reflect.ParameterizedType
            if (r4 == 0) goto L_0x047b
            r0 = r13
            java.lang.reflect.ParameterizedType r0 = (java.lang.reflect.ParameterizedType) r0
            r3 = 0
            java.lang.reflect.Type r0 = y9.h0.e(r3, r0)
            r8.e(r0, r14)
            y9.x$d r0 = new y9.x$d
            r0.<init>(r1)
            y9.v r1 = new y9.v
            r1.<init>(r0)
            goto L_0x04bb
        L_0x047b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r3.getSimpleName()
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r3.getSimpleName()
            r1.append(r0)
            r1.append(r10)
            java.lang.String r0 = r1.toString()
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.IllegalArgumentException r0 = y9.h0.k(r9, r5, r0, r1)
            throw r0
        L_0x04a0:
            boolean r0 = r3.isArray()
            if (r0 == 0) goto L_0x04be
            java.lang.Class r0 = r3.getComponentType()
            java.lang.Class r0 = y9.a0.a.a(r0)
            r8.e(r0, r14)
            y9.x$d r0 = new y9.x$d
            r0.<init>(r1)
            y9.w r1 = new y9.w
            r1.<init>(r0)
        L_0x04bb:
            r0 = r1
            goto L_0x05f9
        L_0x04be:
            r8.e(r13, r14)
            y9.x$d r0 = new y9.x$d
            r0.<init>(r1)
            goto L_0x05f9
        L_0x04c8:
            boolean r6 = r4 instanceof aa.j
            if (r6 == 0) goto L_0x052c
            java.lang.Class<i9.q> r0 = i9.q.class
            if (r13 != r0) goto L_0x04d7
            y9.x$f r0 = new y9.x$f
            r0.<init>(r5, r9)
            goto L_0x05f9
        L_0x04d7:
            r11.c(r5, r13)
            java.lang.Class r0 = y9.h0.f(r13)
            boolean r3 = r3.isAssignableFrom(r0)
            if (r3 == 0) goto L_0x0522
            java.lang.reflect.Type r0 = y9.h0.g(r13, r0)
            boolean r3 = r0 instanceof java.lang.reflect.ParameterizedType
            if (r3 == 0) goto L_0x051a
            java.lang.reflect.ParameterizedType r0 = (java.lang.reflect.ParameterizedType) r0
            r3 = 0
            java.lang.reflect.Type r3 = y9.h0.e(r3, r0)
            if (r1 != r3) goto L_0x0504
            r1 = 1
            java.lang.reflect.Type r0 = y9.h0.e(r1, r0)
            r8.e(r0, r14)
            y9.x$e r0 = new y9.x$e
            r0.<init>(r9, r5)
            goto L_0x05f9
        L_0x0504:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "@HeaderMap keys must be of type String: "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.IllegalArgumentException r0 = y9.h0.k(r9, r5, r0, r1)
            throw r0
        L_0x051a:
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.IllegalArgumentException r0 = y9.h0.k(r9, r5, r7, r0)
            throw r0
        L_0x0522:
            r0 = 0
            java.lang.String r1 = "@HeaderMap parameter type must be Map."
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.IllegalArgumentException r0 = y9.h0.k(r9, r5, r1, r0)
            throw r0
        L_0x052c:
            boolean r6 = r4 instanceof aa.c
            if (r6 == 0) goto L_0x05be
            r11.c(r5, r13)
            boolean r1 = r15.f9654p
            if (r1 == 0) goto L_0x05b4
            aa.c r4 = (aa.c) r4
            java.lang.String r1 = r4.value()
            boolean r3 = r4.encoded()
            r4 = 1
            r15.f9645f = r4
            java.lang.Class r4 = y9.h0.f(r13)
            boolean r6 = r12.isAssignableFrom(r4)
            if (r6 == 0) goto L_0x058e
            boolean r6 = r13 instanceof java.lang.reflect.ParameterizedType
            if (r6 == 0) goto L_0x0569
            r0 = r13
            java.lang.reflect.ParameterizedType r0 = (java.lang.reflect.ParameterizedType) r0
            r4 = 0
            java.lang.reflect.Type r0 = y9.h0.e(r4, r0)
            r8.e(r0, r14)
            y9.x$b r0 = new y9.x$b
            r0.<init>(r1, r3)
            y9.v r1 = new y9.v
            r1.<init>(r0)
            goto L_0x04bb
        L_0x0569:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r4.getSimpleName()
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r4.getSimpleName()
            r1.append(r0)
            r1.append(r10)
            java.lang.String r0 = r1.toString()
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.IllegalArgumentException r0 = y9.h0.k(r9, r5, r0, r1)
            throw r0
        L_0x058e:
            boolean r0 = r4.isArray()
            if (r0 == 0) goto L_0x05ab
            java.lang.Class r0 = r4.getComponentType()
            java.lang.Class r0 = y9.a0.a.a(r0)
            r8.e(r0, r14)
            y9.x$b r0 = new y9.x$b
            r0.<init>(r1, r3)
            y9.w r1 = new y9.w
            r1.<init>(r0)
            goto L_0x04bb
        L_0x05ab:
            r8.e(r13, r14)
            y9.x$b r0 = new y9.x$b
            r0.<init>(r1, r3)
            goto L_0x05f9
        L_0x05b4:
            java.lang.String r0 = "@Field parameters can only be used with form encoding."
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.IllegalArgumentException r0 = y9.h0.k(r9, r5, r0, r1)
            throw r0
        L_0x05be:
            boolean r6 = r4 instanceof aa.d
            if (r6 == 0) goto L_0x062e
            r11.c(r5, r13)
            boolean r0 = r15.f9654p
            if (r0 == 0) goto L_0x0624
            java.lang.Class r0 = y9.h0.f(r13)
            boolean r3 = r3.isAssignableFrom(r0)
            if (r3 == 0) goto L_0x061a
            java.lang.reflect.Type r0 = y9.h0.g(r13, r0)
            boolean r3 = r0 instanceof java.lang.reflect.ParameterizedType
            if (r3 == 0) goto L_0x0612
            java.lang.reflect.ParameterizedType r0 = (java.lang.reflect.ParameterizedType) r0
            r3 = 0
            java.lang.reflect.Type r3 = y9.h0.e(r3, r0)
            if (r1 != r3) goto L_0x05fc
            r1 = 1
            java.lang.reflect.Type r0 = y9.h0.e(r1, r0)
            r8.e(r0, r14)
            r15.f9645f = r1
            y9.x$c r0 = new y9.x$c
            aa.d r4 = (aa.d) r4
            boolean r1 = r4.encoded()
            r0.<init>(r9, r5, r1)
        L_0x05f9:
            r1 = r0
            goto L_0x06cd
        L_0x05fc:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "@FieldMap keys must be of type String: "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.IllegalArgumentException r0 = y9.h0.k(r9, r5, r0, r1)
            throw r0
        L_0x0612:
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.IllegalArgumentException r0 = y9.h0.k(r9, r5, r7, r0)
            throw r0
        L_0x061a:
            r0 = 0
            java.lang.String r1 = "@FieldMap parameter type must be Map."
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.IllegalArgumentException r0 = y9.h0.k(r9, r5, r1, r0)
            throw r0
        L_0x0624:
            r0 = 0
            java.lang.String r1 = "@FieldMap parameters can only be used with form encoding."
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.IllegalArgumentException r0 = y9.h0.k(r9, r5, r1, r0)
            throw r0
        L_0x062e:
            boolean r6 = r4 instanceof aa.q
            r25 = r7
            java.lang.annotation.Annotation[] r7 = r15.f9643c
            r26 = r1
            java.lang.Class<i9.u$c> r1 = i9.u.c.class
            if (r6 == 0) goto L_0x07ab
            r11.c(r5, r13)
            boolean r3 = r15.f9655q
            if (r3 == 0) goto L_0x07a1
            aa.q r4 = (aa.q) r4
            r3 = 1
            r15.f9646g = r3
            java.lang.String r3 = r4.value()
            java.lang.Class r6 = y9.h0.f(r13)
            boolean r25 = r3.isEmpty()
            if (r25 == 0) goto L_0x06d7
            boolean r3 = r12.isAssignableFrom(r6)
            y9.x$m r4 = y9.x.m.f9766a
            java.lang.String r7 = "@Part annotation must supply a name or use MultipartBody.Part parameter type."
            if (r3 == 0) goto L_0x06a7
            boolean r3 = r13 instanceof java.lang.reflect.ParameterizedType
            if (r3 == 0) goto L_0x0682
            r0 = r13
            java.lang.reflect.ParameterizedType r0 = (java.lang.reflect.ParameterizedType) r0
            r3 = 0
            java.lang.reflect.Type r0 = y9.h0.e(r3, r0)
            java.lang.Class r0 = y9.h0.f(r0)
            boolean r0 = r1.isAssignableFrom(r0)
            if (r0 == 0) goto L_0x067b
            y9.v r0 = new y9.v
            r0.<init>(r4)
            goto L_0x05f9
        L_0x067b:
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.IllegalArgumentException r0 = y9.h0.k(r9, r5, r7, r0)
            throw r0
        L_0x0682:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r6.getSimpleName()
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r6.getSimpleName()
            r1.append(r0)
            r1.append(r10)
            java.lang.String r0 = r1.toString()
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.IllegalArgumentException r0 = y9.h0.k(r9, r5, r0, r1)
            throw r0
        L_0x06a7:
            r0 = 0
            boolean r3 = r6.isArray()
            if (r3 == 0) goto L_0x06c6
            java.lang.Class r3 = r6.getComponentType()
            boolean r1 = r1.isAssignableFrom(r3)
            if (r1 == 0) goto L_0x06bf
            y9.w r0 = new y9.w
            r0.<init>(r4)
            goto L_0x05f9
        L_0x06bf:
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.IllegalArgumentException r0 = y9.h0.k(r9, r5, r7, r0)
            throw r0
        L_0x06c6:
            boolean r1 = r1.isAssignableFrom(r6)
            if (r1 == 0) goto L_0x06d0
            r1 = r4
        L_0x06cd:
            r0 = r2
            goto L_0x08d5
        L_0x06d0:
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.IllegalArgumentException r0 = y9.h0.k(r9, r5, r7, r0)
            throw r0
        L_0x06d7:
            r11 = 0
            r15 = 4
            java.lang.String[] r15 = new java.lang.String[r15]
            java.lang.String r25 = "Content-Disposition"
            r15[r11] = r25
            java.lang.String r11 = "form-data; name=\""
            r27 = r2
            java.lang.String r2 = "\""
            java.lang.String r2 = b0.d.f(r11, r3, r2)
            r3 = 1
            r15[r3] = r2
            java.lang.String r2 = "Content-Transfer-Encoding"
            r3 = 2
            r15[r3] = r2
            r2 = 3
            java.lang.String r3 = r4.encoding()
            r15[r2] = r3
            i9.q$b r2 = i9.q.f6299p
            r2.getClass()
            i9.q r2 = i9.q.b.c(r15)
            boolean r3 = r12.isAssignableFrom(r6)
            java.lang.String r4 = "@Part parameters using the MultipartBody.Part must not include a part name in the annotation."
            if (r3 == 0) goto L_0x075a
            boolean r3 = r13 instanceof java.lang.reflect.ParameterizedType
            if (r3 == 0) goto L_0x0735
            r0 = r13
            java.lang.reflect.ParameterizedType r0 = (java.lang.reflect.ParameterizedType) r0
            r3 = 0
            java.lang.reflect.Type r0 = y9.h0.e(r3, r0)
            java.lang.Class r6 = y9.h0.f(r0)
            boolean r1 = r1.isAssignableFrom(r6)
            if (r1 != 0) goto L_0x072e
            y9.f r0 = r8.c(r0, r14, r7)
            y9.x$g r1 = new y9.x$g
            r1.<init>(r9, r5, r2, r0)
            y9.v r0 = new y9.v
            r0.<init>(r1)
            goto L_0x077c
        L_0x072e:
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.IllegalArgumentException r0 = y9.h0.k(r9, r5, r4, r0)
            throw r0
        L_0x0735:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r6.getSimpleName()
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r6.getSimpleName()
            r1.append(r0)
            r1.append(r10)
            java.lang.String r0 = r1.toString()
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.IllegalArgumentException r0 = y9.h0.k(r9, r5, r0, r1)
            throw r0
        L_0x075a:
            boolean r0 = r6.isArray()
            if (r0 == 0) goto L_0x0789
            java.lang.Class r0 = r6.getComponentType()
            java.lang.Class r0 = y9.a0.a.a(r0)
            boolean r1 = r1.isAssignableFrom(r0)
            if (r1 != 0) goto L_0x0781
            y9.f r0 = r8.c(r0, r14, r7)
            y9.x$g r1 = new y9.x$g
            r1.<init>(r9, r5, r2, r0)
            y9.w r0 = new y9.w
            r0.<init>(r1)
        L_0x077c:
            r1 = r0
        L_0x077d:
            r0 = r27
            goto L_0x08d3
        L_0x0781:
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.IllegalArgumentException r0 = y9.h0.k(r9, r5, r4, r0)
            throw r0
        L_0x0789:
            r0 = 0
            boolean r1 = r1.isAssignableFrom(r6)
            if (r1 != 0) goto L_0x079a
            y9.f r0 = r8.c(r13, r14, r7)
            y9.x$g r1 = new y9.x$g
            r1.<init>(r9, r5, r2, r0)
            goto L_0x077d
        L_0x079a:
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.IllegalArgumentException r0 = y9.h0.k(r9, r5, r4, r0)
            throw r0
        L_0x07a1:
            r0 = 0
            java.lang.String r1 = "@Part parameters can only be used with multipart encoding."
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.IllegalArgumentException r0 = y9.h0.k(r9, r5, r1, r0)
            throw r0
        L_0x07ab:
            r27 = r2
            boolean r0 = r4 instanceof aa.r
            if (r0 == 0) goto L_0x0837
            r0 = r27
            r0.c(r5, r13)
            boolean r2 = r0.f9655q
            if (r2 == 0) goto L_0x082d
            r2 = 1
            r0.f9646g = r2
            java.lang.Class r6 = y9.h0.f(r13)
            boolean r3 = r3.isAssignableFrom(r6)
            if (r3 == 0) goto L_0x0823
            java.lang.reflect.Type r3 = y9.h0.g(r13, r6)
            boolean r6 = r3 instanceof java.lang.reflect.ParameterizedType
            if (r6 == 0) goto L_0x0819
            java.lang.reflect.ParameterizedType r3 = (java.lang.reflect.ParameterizedType) r3
            r6 = 0
            java.lang.reflect.Type r6 = y9.h0.e(r6, r3)
            r10 = r26
            if (r10 != r6) goto L_0x0803
            java.lang.reflect.Type r2 = y9.h0.e(r2, r3)
            java.lang.Class r3 = y9.h0.f(r2)
            boolean r1 = r1.isAssignableFrom(r3)
            if (r1 != 0) goto L_0x07f9
            y9.f r1 = r8.c(r2, r14, r7)
            aa.r r4 = (aa.r) r4
            y9.x$h r2 = new y9.x$h
            java.lang.String r3 = r4.encoding()
            r2.<init>(r9, r5, r1, r3)
            goto L_0x08d0
        L_0x07f9:
            java.lang.String r0 = "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead."
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.IllegalArgumentException r0 = y9.h0.k(r9, r5, r0, r1)
            throw r0
        L_0x0803:
            r0 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "@PartMap keys must be of type String: "
            r1.<init>(r2)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.IllegalArgumentException r0 = y9.h0.k(r9, r5, r1, r0)
            throw r0
        L_0x0819:
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = r25
            java.lang.IllegalArgumentException r0 = y9.h0.k(r9, r5, r1, r0)
            throw r0
        L_0x0823:
            r0 = 0
            java.lang.String r1 = "@PartMap parameter type must be Map."
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.IllegalArgumentException r0 = y9.h0.k(r9, r5, r1, r0)
            throw r0
        L_0x082d:
            r0 = 0
            java.lang.String r1 = "@PartMap parameters can only be used with multipart encoding."
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.IllegalArgumentException r0 = y9.h0.k(r9, r5, r1, r0)
            throw r0
        L_0x0837:
            r0 = r27
            boolean r1 = r4 instanceof aa.a
            if (r1 == 0) goto L_0x087d
            r0.c(r5, r13)
            boolean r1 = r0.f9654p
            if (r1 != 0) goto L_0x0873
            boolean r1 = r0.f9655q
            if (r1 != 0) goto L_0x0873
            boolean r1 = r0.f9647h
            if (r1 != 0) goto L_0x0869
            y9.f r1 = r8.c(r13, r14, r7)     // Catch:{ RuntimeException -> 0x085a }
            r2 = 1
            r0.f9647h = r2
            y9.x$a r2 = new y9.x$a
            r2.<init>(r9, r5, r1)
            goto L_0x08d0
        L_0x085a:
            r0 = move-exception
            r1 = r0
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r2 = 0
            r0[r2] = r13
            java.lang.String r2 = "Unable to create @Body converter for %s"
            java.lang.IllegalArgumentException r0 = y9.h0.l(r9, r1, r5, r2, r0)
            throw r0
        L_0x0869:
            r0 = 0
            java.lang.String r1 = "Multiple @Body method annotations found."
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.IllegalArgumentException r0 = y9.h0.k(r9, r5, r1, r0)
            throw r0
        L_0x0873:
            r0 = 0
            java.lang.String r1 = "@Body parameters cannot be used with form or multi-part encoding."
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.IllegalArgumentException r0 = y9.h0.k(r9, r5, r1, r0)
            throw r0
        L_0x087d:
            boolean r1 = r4 instanceof aa.x
            if (r1 == 0) goto L_0x08d2
            r0.c(r5, r13)
            java.lang.Class r1 = y9.h0.f(r13)
            int r2 = r5 + -1
        L_0x088a:
            if (r2 < 0) goto L_0x08cb
            y9.x<?>[] r3 = r0.f9659v
            r3 = r3[r2]
            boolean r4 = r3 instanceof y9.x.o
            if (r4 == 0) goto L_0x08c8
            y9.x$o r3 = (y9.x.o) r3
            java.lang.Class<T> r3 = r3.f9769a
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L_0x089f
            goto L_0x08c8
        L_0x089f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "@Tag type "
            r0.<init>(r3)
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.lang.String r1 = " is duplicate of parameter #"
            r0.append(r1)
            int r2 = r2 + 1
            r0.append(r2)
            java.lang.String r1 = " and would always overwrite its value."
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.IllegalArgumentException r0 = y9.h0.k(r9, r5, r0, r1)
            throw r0
        L_0x08c8:
            int r2 = r2 + -1
            goto L_0x088a
        L_0x08cb:
            y9.x$o r2 = new y9.x$o
            r2.<init>(r1)
        L_0x08d0:
            r1 = r2
            goto L_0x08d3
        L_0x08d2:
            r1 = 0
        L_0x08d3:
            r11 = r0
            r15 = r11
        L_0x08d5:
            if (r1 != 0) goto L_0x08d8
            goto L_0x08dc
        L_0x08d8:
            if (r17 != 0) goto L_0x08f1
            r17 = r1
        L_0x08dc:
            int r3 = r24 + 1
            r1 = r29
            r2 = r0
            r4 = r18
            r6 = r19
            r10 = r20
            r8 = r21
            r12 = r22
            r7 = r23
            r0 = r28
            goto L_0x017f
        L_0x08f1:
            java.lang.String r0 = "Multiple Retrofit annotations found, only one allowed."
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.IllegalArgumentException r0 = y9.h0.k(r9, r5, r0, r1)
            throw r0
        L_0x08fb:
            r0 = r2
            r18 = r4
            r19 = r6
            r23 = r7
            r21 = r8
            r22 = r12
            r1 = r11
            r11 = r15
            goto L_0x0919
        L_0x0909:
            r0 = r2
            r16 = r3
            r18 = r4
            r19 = r6
            r23 = r7
            r21 = r8
            r22 = r12
            r17 = 0
            r1 = r11
        L_0x0919:
            if (r17 != 0) goto L_0x0935
            if (r23 == 0) goto L_0x092b
            java.lang.Class r2 = y9.h0.f(r13)     // Catch:{ NoClassDefFoundError -> 0x092b }
            java.lang.Class<q8.d> r3 = q8.d.class
            if (r2 != r3) goto L_0x092b
            r2 = 1
            r11.w = r2     // Catch:{ NoClassDefFoundError -> 0x092b }
            r17 = 0
            goto L_0x0935
        L_0x092b:
            java.lang.String r0 = "No Retrofit annotation found."
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.IllegalArgumentException r0 = y9.h0.k(r9, r5, r0, r1)
            throw r0
        L_0x0935:
            r22[r5] = r17
            int r5 = r5 + 1
            r7 = 0
            r10 = 1
            r2 = r0
            r11 = r1
            r3 = r16
            r4 = r18
            r6 = r19
            r8 = r21
            r0 = r28
            r1 = r29
            goto L_0x0166
        L_0x094b:
            r21 = r8
            java.lang.String r0 = r11.f9656r
            if (r0 != 0) goto L_0x0966
            boolean r0 = r11.f9651m
            if (r0 == 0) goto L_0x0956
            goto L_0x0966
        L_0x0956:
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = r11.f9652n
            r2 = 0
            r0[r2] = r1
            java.lang.String r1 = "Missing either @%s URL or @Url parameter."
            r2 = 0
            java.lang.IllegalArgumentException r0 = y9.h0.j(r9, r2, r1, r0)
            throw r0
        L_0x0966:
            boolean r0 = r11.f9654p
            if (r0 != 0) goto L_0x0982
            boolean r1 = r11.f9655q
            if (r1 != 0) goto L_0x0982
            boolean r1 = r11.f9653o
            if (r1 != 0) goto L_0x0982
            boolean r1 = r11.f9647h
            if (r1 != 0) goto L_0x0977
            goto L_0x0982
        L_0x0977:
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "Non-body HTTP method cannot contain @Body."
            r2 = 0
            java.lang.IllegalArgumentException r0 = y9.h0.j(r9, r2, r1, r0)
            throw r0
        L_0x0982:
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L_0x0994
            boolean r0 = r11.f9645f
            if (r0 == 0) goto L_0x098b
            goto L_0x0994
        L_0x098b:
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.String r1 = "Form-encoded method must contain at least one @Field."
            java.lang.IllegalArgumentException r0 = y9.h0.j(r9, r2, r1, r0)
            throw r0
        L_0x0994:
            boolean r0 = r11.f9655q
            if (r0 == 0) goto L_0x09a6
            boolean r0 = r11.f9646g
            if (r0 == 0) goto L_0x099d
            goto L_0x09a6
        L_0x099d:
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.String r1 = "Multipart method must contain at least one @Part."
            java.lang.IllegalArgumentException r0 = y9.h0.j(r9, r2, r1, r0)
            throw r0
        L_0x09a6:
            y9.a0 r0 = new y9.a0
            r0.<init>(r11)
            java.lang.reflect.Type r1 = r29.getGenericReturnType()
            boolean r2 = y9.h0.h(r1)
            if (r2 != 0) goto L_0x0acf
            java.lang.Class r2 = java.lang.Void.TYPE
            if (r1 == r2) goto L_0x0ac2
            java.lang.annotation.Annotation[] r1 = r29.getAnnotations()
            boolean r2 = r0.f9638k
            java.lang.Class<y9.b0> r3 = y9.b0.class
            if (r2 == 0) goto L_0x0a18
            java.lang.reflect.Type[] r4 = r29.getGenericParameterTypes()
            int r5 = r4.length
            int r5 = r5 + -1
            r4 = r4[r5]
            java.lang.reflect.ParameterizedType r4 = (java.lang.reflect.ParameterizedType) r4
            java.lang.reflect.Type[] r4 = r4.getActualTypeArguments()
            r5 = 0
            r4 = r4[r5]
            boolean r6 = r4 instanceof java.lang.reflect.WildcardType
            if (r6 == 0) goto L_0x09e1
            java.lang.reflect.WildcardType r4 = (java.lang.reflect.WildcardType) r4
            java.lang.reflect.Type[] r4 = r4.getLowerBounds()
            r4 = r4[r5]
        L_0x09e1:
            java.lang.Class r6 = y9.h0.f(r4)
            if (r6 != r3) goto L_0x09f3
            boolean r6 = r4 instanceof java.lang.reflect.ParameterizedType
            if (r6 == 0) goto L_0x09f3
            java.lang.reflect.ParameterizedType r4 = (java.lang.reflect.ParameterizedType) r4
            java.lang.reflect.Type r4 = y9.h0.e(r5, r4)
            r6 = 1
            goto L_0x09f4
        L_0x09f3:
            r6 = r5
        L_0x09f4:
            y9.h0$b r7 = new y9.h0$b
            r8 = 1
            java.lang.reflect.Type[] r9 = new java.lang.reflect.Type[r8]
            r9[r5] = r4
            java.lang.Class<y9.b> r4 = y9.b.class
            r10 = 0
            r7.<init>(r10, r4, r9)
            java.lang.Class<y9.f0> r4 = y9.f0.class
            boolean r4 = y9.h0.i(r1, r4)
            if (r4 == 0) goto L_0x0a0a
            goto L_0x0a1d
        L_0x0a0a:
            int r4 = r1.length
            int r4 = r4 + r8
            java.lang.annotation.Annotation[] r4 = new java.lang.annotation.Annotation[r4]
            y9.g0 r9 = y9.g0.f9683a
            r4[r5] = r9
            int r9 = r1.length
            java.lang.System.arraycopy(r1, r5, r4, r8, r9)
            r1 = r4
            goto L_0x0a1d
        L_0x0a18:
            java.lang.reflect.Type r7 = r29.getGenericReturnType()
            r6 = 0
        L_0x0a1d:
            r4 = r28
            y9.c r1 = r4.a(r7, r1)     // Catch:{ RuntimeException -> 0x0ab1 }
            java.lang.reflect.Type r5 = r1.b()
            java.lang.Class<i9.c0> r7 = i9.c0.class
            if (r5 == r7) goto L_0x0a8b
            if (r5 == r3) goto L_0x0a7e
            java.lang.String r3 = r0.f9631c
            r7 = r21
            boolean r3 = r3.equals(r7)
            if (r3 == 0) goto L_0x0a4d
            java.lang.Class<java.lang.Void> r3 = java.lang.Void.class
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x0a40
            goto L_0x0a4d
        L_0x0a40:
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "HEAD method must use Void as response type."
            r2 = 0
            r3 = r29
            java.lang.IllegalArgumentException r0 = y9.h0.j(r3, r2, r1, r0)
            throw r0
        L_0x0a4d:
            r3 = r29
            java.lang.annotation.Annotation[] r7 = r29.getAnnotations()
            y9.f r3 = r4.d(r5, r7)     // Catch:{ RuntimeException -> 0x0a6f }
            i9.e$a r4 = r4.f9667b
            if (r2 != 0) goto L_0x0a61
            y9.k$a r2 = new y9.k$a
            r2.<init>(r0, r4, r3, r1)
            goto L_0x0a6e
        L_0x0a61:
            if (r6 == 0) goto L_0x0a69
            y9.k$c r2 = new y9.k$c
            r2.<init>(r0, r4, r3, r1)
            goto L_0x0a6e
        L_0x0a69:
            y9.k$b r2 = new y9.k$b
            r2.<init>(r0, r4, r3, r1)
        L_0x0a6e:
            return r2
        L_0x0a6f:
            r0 = move-exception
            r1 = r0
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r2 = 0
            r0[r2] = r5
            java.lang.String r2 = "Unable to create converter for %s"
            java.lang.IllegalArgumentException r0 = y9.h0.j(r3, r1, r2, r0)
            throw r0
        L_0x0a7e:
            r3 = r29
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "Response must include generic type (e.g., Response<String>)"
            r2 = 0
            java.lang.IllegalArgumentException r0 = y9.h0.j(r3, r2, r1, r0)
            throw r0
        L_0x0a8b:
            r3 = r29
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "'"
            r0.<init>(r1)
            java.lang.Class r1 = y9.h0.f(r5)
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.lang.String r1 = "' is not a valid response body type. Did you mean ResponseBody?"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            java.lang.IllegalArgumentException r0 = y9.h0.j(r3, r2, r0, r1)
            throw r0
        L_0x0ab1:
            r0 = move-exception
            r3 = r29
            r1 = r0
            r0 = 0
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r0] = r7
            java.lang.String r0 = "Unable to create call adapter for %s"
            java.lang.IllegalArgumentException r0 = y9.h0.j(r3, r1, r0, r2)
            throw r0
        L_0x0ac2:
            r3 = r29
            r0 = 0
            r1 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = "Service methods cannot return void."
            java.lang.IllegalArgumentException r0 = y9.h0.j(r3, r1, r2, r0)
            throw r0
        L_0x0acf:
            r3 = r29
            r0 = 0
            r2 = 0
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r0] = r1
            java.lang.String r0 = "Method return type must not include a type variable or wildcard: %s"
            java.lang.IllegalArgumentException r0 = y9.h0.j(r3, r2, r0, r4)
            throw r0
        L_0x0adf:
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.String r2 = "HTTP method annotation is required (e.g., @GET, @POST, etc.)."
            java.lang.IllegalArgumentException r0 = y9.h0.j(r9, r0, r2, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: y9.e0.b(y9.d0, java.lang.reflect.Method):y9.k");
    }

    public abstract T a(Object[] objArr);
}
