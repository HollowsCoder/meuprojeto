package b0;

import a0.d;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.Method;
import n.g;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final l f1935a;

    /* renamed from: b  reason: collision with root package name */
    public static final g<String, Typeface> f1936b = new g<>(16);

    public static class a extends s6.a {
        public final d.c S;

        public a(d.c cVar) {
            this.S = cVar;
        }
    }

    static {
        boolean z;
        l fVar;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            fVar = new j();
        } else if (i10 >= 28) {
            fVar = new i();
        } else if (i10 >= 26) {
            fVar = new h();
        } else {
            Method method = g.f1943c;
            if (method == null) {
                Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
            }
            if (method != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                fVar = new g();
            } else {
                fVar = new f();
            }
        }
        f1935a = fVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0024, code lost:
        if (r0.equals(r4) == false) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Typeface a(android.content.Context r7, a0.c.a r8, android.content.res.Resources r9, int r10, int r11, a0.d.c r12, boolean r13) {
        /*
            boolean r0 = r8 instanceof a0.c.d
            r1 = -3
            if (r0 == 0) goto L_0x0148
            a0.c$d r8 = (a0.c.d) r8
            java.lang.String r0 = r8.d
            r2 = 0
            r3 = 0
            if (r0 == 0) goto L_0x0027
            boolean r4 = r0.isEmpty()
            if (r4 == 0) goto L_0x0014
            goto L_0x0027
        L_0x0014:
            android.graphics.Typeface r0 = android.graphics.Typeface.create(r0, r3)
            android.graphics.Typeface r4 = android.graphics.Typeface.DEFAULT
            android.graphics.Typeface r4 = android.graphics.Typeface.create(r4, r3)
            if (r0 == 0) goto L_0x0027
            boolean r4 = r0.equals(r4)
            if (r4 != 0) goto L_0x0027
            goto L_0x0028
        L_0x0027:
            r0 = r2
        L_0x0028:
            if (r0 == 0) goto L_0x0030
            if (r12 == 0) goto L_0x002f
            r12.b(r0)
        L_0x002f:
            return r0
        L_0x0030:
            if (r13 == 0) goto L_0x0037
            int r0 = r8.f21c
            if (r0 != 0) goto L_0x003a
            goto L_0x0039
        L_0x0037:
            if (r12 != 0) goto L_0x003a
        L_0x0039:
            r3 = 1
        L_0x003a:
            r0 = -1
            if (r13 == 0) goto L_0x0040
            int r13 = r8.f20b
            goto L_0x0041
        L_0x0040:
            r13 = r0
        L_0x0041:
            android.os.Handler r4 = new android.os.Handler
            android.os.Looper r5 = android.os.Looper.getMainLooper()
            r4.<init>(r5)
            b0.e$a r5 = new b0.e$a
            r5.<init>(r12)
            f0.e r8 = r8.f19a
            f0.c r12 = new f0.c
            r12.<init>(r5, r4)
            if (r3 == 0) goto L_0x00cc
            n.g<java.lang.String, android.graphics.Typeface> r3 = f0.j.f4571a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r6 = r8.f4562e
            r3.append(r6)
            java.lang.String r6 = "-"
            r3.append(r6)
            r3.append(r11)
            java.lang.String r3 = r3.toString()
            n.g<java.lang.String, android.graphics.Typeface> r6 = f0.j.f4571a
            java.lang.Object r6 = r6.b(r3)
            android.graphics.Typeface r6 = (android.graphics.Typeface) r6
            if (r6 == 0) goto L_0x0085
            f0.a r7 = new f0.a
            r7.<init>(r5, r6)
            r4.post(r7)
            r2 = r6
            goto L_0x015b
        L_0x0085:
            if (r13 != r0) goto L_0x0092
            f0.j$a r7 = f0.j.a(r3, r7, r8, r11)
            r12.a(r7)
            android.graphics.Typeface r2 = r7.f4574a
            goto L_0x015b
        L_0x0092:
            f0.f r0 = new f0.f
            r0.<init>(r3, r7, r8, r11)
            java.util.concurrent.ThreadPoolExecutor r7 = f0.j.f4572b     // Catch:{ InterruptedException -> 0x00be }
            java.util.concurrent.Future r7 = r7.submit(r0)     // Catch:{ InterruptedException -> 0x00be }
            long r3 = (long) r13
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ ExecutionException -> 0x00b7, InterruptedException -> 0x00b5, TimeoutException -> 0x00ad }
            java.lang.Object r7 = r7.get(r3, r8)     // Catch:{ ExecutionException -> 0x00b7, InterruptedException -> 0x00b5, TimeoutException -> 0x00ad }
            f0.j$a r7 = (f0.j.a) r7     // Catch:{ InterruptedException -> 0x00be }
            r12.a(r7)     // Catch:{ InterruptedException -> 0x00be }
            android.graphics.Typeface r2 = r7.f4574a     // Catch:{ InterruptedException -> 0x00be }
            goto L_0x015b
        L_0x00ad:
            java.lang.InterruptedException r7 = new java.lang.InterruptedException     // Catch:{ InterruptedException -> 0x00be }
            java.lang.String r8 = "timeout"
            r7.<init>(r8)     // Catch:{ InterruptedException -> 0x00be }
            throw r7     // Catch:{ InterruptedException -> 0x00be }
        L_0x00b5:
            r7 = move-exception
            throw r7     // Catch:{ InterruptedException -> 0x00be }
        L_0x00b7:
            r7 = move-exception
            java.lang.RuntimeException r8 = new java.lang.RuntimeException     // Catch:{ InterruptedException -> 0x00be }
            r8.<init>(r7)     // Catch:{ InterruptedException -> 0x00be }
            throw r8     // Catch:{ InterruptedException -> 0x00be }
        L_0x00be:
            f0.b r7 = new f0.b
            s6.a r8 = r12.f4556a
            r7.<init>(r8, r1)
            android.os.Handler r8 = r12.f4557b
            r8.post(r7)
            goto L_0x015b
        L_0x00cc:
            n.g<java.lang.String, android.graphics.Typeface> r13 = f0.j.f4571a
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r0 = r8.f4562e
            r13.append(r0)
            java.lang.String r0 = "-"
            r13.append(r0)
            r13.append(r11)
            java.lang.String r13 = r13.toString()
            n.g<java.lang.String, android.graphics.Typeface> r0 = f0.j.f4571a
            java.lang.Object r0 = r0.b(r13)
            android.graphics.Typeface r0 = (android.graphics.Typeface) r0
            if (r0 == 0) goto L_0x00f8
            f0.a r7 = new f0.a
            r7.<init>(r5, r0)
            r4.post(r7)
            r2 = r0
            goto L_0x015b
        L_0x00f8:
            f0.g r0 = new f0.g
            r0.<init>(r12)
            java.lang.Object r3 = f0.j.f4573c
            monitor-enter(r3)
            n.i<java.lang.String, java.util.ArrayList<h0.a<f0.j$a>>> r12 = f0.j.d     // Catch:{ all -> 0x0145 }
            java.lang.Object r1 = r12.getOrDefault(r13, r2)     // Catch:{ all -> 0x0145 }
            java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch:{ all -> 0x0145 }
            if (r1 == 0) goto L_0x010f
            r1.add(r0)     // Catch:{ all -> 0x0145 }
            monitor-exit(r3)     // Catch:{ all -> 0x0145 }
            goto L_0x015b
        L_0x010f:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0145 }
            r1.<init>()     // Catch:{ all -> 0x0145 }
            r1.add(r0)     // Catch:{ all -> 0x0145 }
            r12.put(r13, r1)     // Catch:{ all -> 0x0145 }
            monitor-exit(r3)     // Catch:{ all -> 0x0145 }
            f0.h r12 = new f0.h
            r12.<init>(r13, r7, r8, r11)
            java.util.concurrent.ThreadPoolExecutor r7 = f0.j.f4572b
            f0.i r8 = new f0.i
            r8.<init>(r13)
            android.os.Looper r13 = android.os.Looper.myLooper()
            if (r13 != 0) goto L_0x0137
            android.os.Handler r13 = new android.os.Handler
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            r13.<init>(r0)
            goto L_0x013c
        L_0x0137:
            android.os.Handler r13 = new android.os.Handler
            r13.<init>()
        L_0x013c:
            f0.n r0 = new f0.n
            r0.<init>(r13, r12, r8)
            r7.execute(r0)
            goto L_0x015b
        L_0x0145:
            r7 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0145 }
            throw r7
        L_0x0148:
            b0.l r13 = f1935a
            a0.c$b r8 = (a0.c.b) r8
            android.graphics.Typeface r2 = r13.a(r7, r8, r9, r11)
            if (r12 == 0) goto L_0x015b
            if (r2 == 0) goto L_0x0158
            r12.b(r2)
            goto L_0x015b
        L_0x0158:
            r12.a(r1)
        L_0x015b:
            if (r2 == 0) goto L_0x0166
            n.g<java.lang.String, android.graphics.Typeface> r7 = f1936b
            java.lang.String r8 = b(r9, r10, r11)
            r7.c(r8, r2)
        L_0x0166:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.e.a(android.content.Context, a0.c$a, android.content.res.Resources, int, int, a0.d$c, boolean):android.graphics.Typeface");
    }

    public static String b(Resources resources, int i10, int i11) {
        return resources.getResourcePackageName(i10) + "-" + i10 + "-" + i11;
    }
}
