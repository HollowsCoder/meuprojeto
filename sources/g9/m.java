package g9;

import androidx.emoji2.text.a;
import f9.g;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public final class m extends f0 {

    /* renamed from: p  reason: collision with root package name */
    public static final m f5026p = new m();
    private static volatile Executor pool;

    /* renamed from: q  reason: collision with root package name */
    public static final int f5027q;

    static {
        String str;
        int i10;
        try {
            str = System.getProperty("kotlinx.coroutines.default.parallelism");
        } catch (Throwable unused) {
            str = null;
        }
        if (str == null) {
            i10 = -1;
        } else {
            Integer T = g.T(str);
            if (T == null || T.intValue() < 1) {
                throw new IllegalStateException(z8.g.k(str, "Expected positive number in kotlinx.coroutines.default.parallelism, but has ").toString());
            }
            i10 = T.intValue();
        }
        f5027q = i10;
    }

    public static int C() {
        Integer valueOf = Integer.valueOf(f5027q);
        if (!(valueOf.intValue() > 0)) {
            valueOf = null;
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        int availableProcessors = Runtime.getRuntime().availableProcessors() - 1;
        if (availableProcessors < 1) {
            return 1;
        }
        return availableProcessors;
    }

    public static ExecutorService y() {
        return Executors.newFixedThreadPool(C(), new a(new AtomicInteger(), 1));
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0070 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.concurrent.ExecutorService z() {
        /*
            java.lang.SecurityManager r0 = java.lang.System.getSecurityManager()
            if (r0 == 0) goto L_0x000b
            java.util.concurrent.ExecutorService r0 = y()
            return r0
        L_0x000b:
            r0 = 0
            java.lang.String r1 = "java.util.concurrent.ForkJoinPool"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ all -> 0x0013 }
            goto L_0x0014
        L_0x0013:
            r1 = r0
        L_0x0014:
            if (r1 != 0) goto L_0x001b
            java.util.concurrent.ExecutorService r0 = y()
            return r0
        L_0x001b:
            int r2 = f5027q
            g9.m r3 = f5026p
            r4 = 1
            r5 = 0
            if (r2 >= 0) goto L_0x0071
            java.lang.String r2 = "commonPool"
            java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch:{ all -> 0x0038 }
            java.lang.reflect.Method r2 = r1.getMethod(r2, r6)     // Catch:{ all -> 0x0038 }
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ all -> 0x0038 }
            java.lang.Object r2 = r2.invoke(r0, r6)     // Catch:{ all -> 0x0038 }
            boolean r6 = r2 instanceof java.util.concurrent.ExecutorService     // Catch:{ all -> 0x0038 }
            if (r6 == 0) goto L_0x0038
            java.util.concurrent.ExecutorService r2 = (java.util.concurrent.ExecutorService) r2     // Catch:{ all -> 0x0038 }
            goto L_0x0039
        L_0x0038:
            r2 = r0
        L_0x0039:
            if (r2 != 0) goto L_0x003c
            goto L_0x0071
        L_0x003c:
            r3.getClass()
            g9.l r6 = new g9.l
            r6.<init>()
            r2.submit(r6)
            java.lang.String r6 = "getPoolSize"
            java.lang.Class[] r7 = new java.lang.Class[r5]     // Catch:{ all -> 0x005c }
            java.lang.reflect.Method r6 = r1.getMethod(r6, r7)     // Catch:{ all -> 0x005c }
            java.lang.Object[] r7 = new java.lang.Object[r5]     // Catch:{ all -> 0x005c }
            java.lang.Object r6 = r6.invoke(r2, r7)     // Catch:{ all -> 0x005c }
            boolean r7 = r6 instanceof java.lang.Integer     // Catch:{ all -> 0x005c }
            if (r7 == 0) goto L_0x005c
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch:{ all -> 0x005c }
            goto L_0x005d
        L_0x005c:
            r6 = r0
        L_0x005d:
            if (r6 != 0) goto L_0x0060
            goto L_0x0068
        L_0x0060:
            int r6 = r6.intValue()
            if (r6 < r4) goto L_0x0068
            r6 = r4
            goto L_0x0069
        L_0x0068:
            r6 = r5
        L_0x0069:
            if (r6 == 0) goto L_0x006c
            goto L_0x006d
        L_0x006c:
            r2 = r0
        L_0x006d:
            if (r2 != 0) goto L_0x0070
            goto L_0x0071
        L_0x0070:
            return r2
        L_0x0071:
            java.lang.Class[] r2 = new java.lang.Class[r4]     // Catch:{ all -> 0x0095 }
            java.lang.Class r6 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0095 }
            r2[r5] = r6     // Catch:{ all -> 0x0095 }
            java.lang.reflect.Constructor r1 = r1.getConstructor(r2)     // Catch:{ all -> 0x0095 }
            java.lang.Object[] r2 = new java.lang.Object[r4]     // Catch:{ all -> 0x0095 }
            r3.getClass()     // Catch:{ all -> 0x0095 }
            int r3 = C()     // Catch:{ all -> 0x0095 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0095 }
            r2[r5] = r3     // Catch:{ all -> 0x0095 }
            java.lang.Object r1 = r1.newInstance(r2)     // Catch:{ all -> 0x0095 }
            boolean r2 = r1 instanceof java.util.concurrent.ExecutorService     // Catch:{ all -> 0x0095 }
            if (r2 == 0) goto L_0x0095
            java.util.concurrent.ExecutorService r1 = (java.util.concurrent.ExecutorService) r1     // Catch:{ all -> 0x0095 }
            r0 = r1
        L_0x0095:
            if (r0 != 0) goto L_0x009b
            java.util.concurrent.ExecutorService r0 = y()
        L_0x009b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g9.m.z():java.util.concurrent.ExecutorService");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0018, code lost:
        g9.w.u.J(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(q8.f r1, java.lang.Runnable r2) {
        /*
            r0 = this;
            java.util.concurrent.Executor r1 = pool     // Catch:{ RejectedExecutionException -> 0x0018 }
            if (r1 != 0) goto L_0x0014
            monitor-enter(r0)     // Catch:{ RejectedExecutionException -> 0x0018 }
            java.util.concurrent.Executor r1 = pool     // Catch:{ all -> 0x0011 }
            if (r1 != 0) goto L_0x000f
            java.util.concurrent.ExecutorService r1 = z()     // Catch:{ all -> 0x0011 }
            pool = r1     // Catch:{ all -> 0x0011 }
        L_0x000f:
            monitor-exit(r0)     // Catch:{ RejectedExecutionException -> 0x0018 }
            goto L_0x0014
        L_0x0011:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ RejectedExecutionException -> 0x0018 }
            throw r1     // Catch:{ RejectedExecutionException -> 0x0018 }
        L_0x0014:
            r1.execute(r2)     // Catch:{ RejectedExecutionException -> 0x0018 }
            goto L_0x001d
        L_0x0018:
            g9.w r1 = g9.w.u
            r1.J(r2)
        L_0x001d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g9.m.b(q8.f, java.lang.Runnable):void");
    }

    public final void close() {
        throw new IllegalStateException("Close cannot be invoked on CommonPool".toString());
    }

    public final String toString() {
        return "CommonPool";
    }
}
