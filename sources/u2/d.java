package u2;

import java.io.File;
import o2.a;

public final class d implements a {

    /* renamed from: o  reason: collision with root package name */
    public final j f9067o;

    /* renamed from: p  reason: collision with root package name */
    public final File f9068p;

    /* renamed from: q  reason: collision with root package name */
    public final long f9069q;

    /* renamed from: r  reason: collision with root package name */
    public final b f9070r = new b();

    /* renamed from: s  reason: collision with root package name */
    public a f9071s;

    @Deprecated
    public d(File file, long j8) {
        this.f9068p = file;
        this.f9069q = j8;
        this.f9067o = new j();
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x00b0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(q2.f r8, s2.g r9) {
        /*
            r7 = this;
            java.lang.String r0 = "Had two simultaneous puts for: "
            java.lang.String r1 = "Put: Obtained: "
            u2.j r2 = r7.f9067o
            java.lang.String r2 = r2.a(r8)
            u2.b r3 = r7.f9070r
            monitor-enter(r3)
            java.util.HashMap r4 = r3.f9060a     // Catch:{ all -> 0x00d6 }
            java.lang.Object r4 = r4.get(r2)     // Catch:{ all -> 0x00d6 }
            u2.b$a r4 = (u2.b.a) r4     // Catch:{ all -> 0x00d6 }
            if (r4 != 0) goto L_0x0035
            u2.b$b r4 = r3.f9061b     // Catch:{ all -> 0x00d6 }
            java.util.ArrayDeque r5 = r4.f9064a     // Catch:{ all -> 0x00d6 }
            monitor-enter(r5)     // Catch:{ all -> 0x00d6 }
            java.util.ArrayDeque r4 = r4.f9064a     // Catch:{ all -> 0x0032 }
            java.lang.Object r4 = r4.poll()     // Catch:{ all -> 0x0032 }
            u2.b$a r4 = (u2.b.a) r4     // Catch:{ all -> 0x0032 }
            monitor-exit(r5)     // Catch:{ all -> 0x0032 }
            if (r4 != 0) goto L_0x002c
            u2.b$a r4 = new u2.b$a     // Catch:{ all -> 0x00d6 }
            r4.<init>()     // Catch:{ all -> 0x00d6 }
        L_0x002c:
            java.util.HashMap r5 = r3.f9060a     // Catch:{ all -> 0x00d6 }
            r5.put(r2, r4)     // Catch:{ all -> 0x00d6 }
            goto L_0x0035
        L_0x0032:
            r8 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0032 }
            throw r8     // Catch:{ all -> 0x00d6 }
        L_0x0035:
            int r5 = r4.f9063b     // Catch:{ all -> 0x00d6 }
            r6 = 1
            int r5 = r5 + r6
            r4.f9063b = r5     // Catch:{ all -> 0x00d6 }
            monitor-exit(r3)     // Catch:{ all -> 0x00d6 }
            java.util.concurrent.locks.ReentrantLock r3 = r4.f9062a
            r3.lock()
            java.lang.String r3 = "DiskLruCacheWrapper"
            r4 = 2
            boolean r3 = android.util.Log.isLoggable(r3, r4)     // Catch:{ all -> 0x00cf }
            if (r3 == 0) goto L_0x0063
            java.lang.String r3 = "DiskLruCacheWrapper"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00cf }
            r4.<init>(r1)     // Catch:{ all -> 0x00cf }
            r4.append(r2)     // Catch:{ all -> 0x00cf }
            java.lang.String r1 = " for for Key: "
            r4.append(r1)     // Catch:{ all -> 0x00cf }
            r4.append(r8)     // Catch:{ all -> 0x00cf }
            java.lang.String r8 = r4.toString()     // Catch:{ all -> 0x00cf }
            android.util.Log.v(r3, r8)     // Catch:{ all -> 0x00cf }
        L_0x0063:
            monitor-enter(r7)     // Catch:{ IOException -> 0x00a6 }
            o2.a r8 = r7.f9071s     // Catch:{ all -> 0x00bb }
            if (r8 != 0) goto L_0x0072
            java.io.File r8 = r7.f9068p     // Catch:{ all -> 0x00bb }
            long r3 = r7.f9069q     // Catch:{ all -> 0x00bb }
            o2.a r8 = o2.a.l(r8, r3)     // Catch:{ all -> 0x00bb }
            r7.f9071s = r8     // Catch:{ all -> 0x00bb }
        L_0x0072:
            o2.a r8 = r7.f9071s     // Catch:{ all -> 0x00bb }
            monitor-exit(r7)     // Catch:{ IOException -> 0x00a6 }
            o2.a$e r1 = r8.g(r2)     // Catch:{ IOException -> 0x00a6 }
            if (r1 == 0) goto L_0x0081
        L_0x007b:
            u2.b r8 = r7.f9070r
            r8.a(r2)
            return
        L_0x0081:
            o2.a$c r8 = r8.d(r2)     // Catch:{ IOException -> 0x00a6 }
            if (r8 == 0) goto L_0x00b1
            java.io.File r0 = r8.b()     // Catch:{ all -> 0x00a8 }
            DataType r1 = r9.f8579b     // Catch:{ all -> 0x00a8 }
            q2.h r3 = r9.f8580c     // Catch:{ all -> 0x00a8 }
            q2.d<DataType> r9 = r9.f8578a     // Catch:{ all -> 0x00a8 }
            boolean r9 = r9.d(r1, r0, r3)     // Catch:{ all -> 0x00a8 }
            if (r9 == 0) goto L_0x009e
            o2.a r9 = o2.a.this     // Catch:{ all -> 0x00a8 }
            o2.a.a(r9, r8, r6)     // Catch:{ all -> 0x00a8 }
            r8.f7692c = r6     // Catch:{ all -> 0x00a8 }
        L_0x009e:
            boolean r9 = r8.f7692c     // Catch:{ IOException -> 0x00a6 }
            if (r9 != 0) goto L_0x007b
            r8.a()     // Catch:{ IOException -> 0x007b }
            goto L_0x007b
        L_0x00a6:
            r8 = move-exception
            goto L_0x00be
        L_0x00a8:
            r9 = move-exception
            boolean r0 = r8.f7692c     // Catch:{ IOException -> 0x00a6 }
            if (r0 != 0) goto L_0x00b0
            r8.a()     // Catch:{ IOException -> 0x00b0 }
        L_0x00b0:
            throw r9     // Catch:{ IOException -> 0x00a6 }
        L_0x00b1:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x00a6 }
            java.lang.String r9 = r0.concat(r2)     // Catch:{ IOException -> 0x00a6 }
            r8.<init>(r9)     // Catch:{ IOException -> 0x00a6 }
            throw r8     // Catch:{ IOException -> 0x00a6 }
        L_0x00bb:
            r8 = move-exception
            monitor-exit(r7)     // Catch:{ IOException -> 0x00a6 }
            throw r8     // Catch:{ IOException -> 0x00a6 }
        L_0x00be:
            java.lang.String r9 = "DiskLruCacheWrapper"
            r0 = 5
            boolean r9 = android.util.Log.isLoggable(r9, r0)     // Catch:{ all -> 0x00cf }
            if (r9 == 0) goto L_0x007b
            java.lang.String r9 = "DiskLruCacheWrapper"
            java.lang.String r0 = "Unable to put to disk cache"
            android.util.Log.w(r9, r0, r8)     // Catch:{ all -> 0x00cf }
            goto L_0x007b
        L_0x00cf:
            r8 = move-exception
            u2.b r9 = r7.f9070r
            r9.a(r2)
            throw r8
        L_0x00d6:
            r8 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00d6 }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: u2.d.a(q2.f, s2.g):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0046, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0050, code lost:
        if (android.util.Log.isLoggable("DiskLruCacheWrapper", 5) != false) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0052, code lost:
        android.util.Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", r5);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.io.File e(q2.f r5) {
        /*
            r4 = this;
            u2.j r0 = r4.f9067o
            java.lang.String r0 = r0.a(r5)
            java.lang.String r1 = "DiskLruCacheWrapper"
            r2 = 2
            boolean r2 = android.util.Log.isLoggable(r1, r2)
            if (r2 == 0) goto L_0x0028
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Get: Obtained: "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r3 = " for for Key: "
            r2.append(r3)
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            android.util.Log.v(r1, r5)
        L_0x0028:
            monitor-enter(r4)     // Catch:{ IOException -> 0x0046 }
            o2.a r5 = r4.f9071s     // Catch:{ all -> 0x0048 }
            if (r5 != 0) goto L_0x0037
            java.io.File r5 = r4.f9068p     // Catch:{ all -> 0x0048 }
            long r2 = r4.f9069q     // Catch:{ all -> 0x0048 }
            o2.a r5 = o2.a.l(r5, r2)     // Catch:{ all -> 0x0048 }
            r4.f9071s = r5     // Catch:{ all -> 0x0048 }
        L_0x0037:
            o2.a r5 = r4.f9071s     // Catch:{ all -> 0x0048 }
            monitor-exit(r4)     // Catch:{ IOException -> 0x0046 }
            o2.a$e r5 = r5.g(r0)     // Catch:{ IOException -> 0x0046 }
            if (r5 == 0) goto L_0x0057
            java.io.File[] r5 = r5.f7699a     // Catch:{ IOException -> 0x0046 }
            r0 = 0
            r5 = r5[r0]     // Catch:{ IOException -> 0x0046 }
            goto L_0x0058
        L_0x0046:
            r5 = move-exception
            goto L_0x004b
        L_0x0048:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ IOException -> 0x0046 }
            throw r5     // Catch:{ IOException -> 0x0046 }
        L_0x004b:
            r0 = 5
            boolean r0 = android.util.Log.isLoggable(r1, r0)
            if (r0 == 0) goto L_0x0057
            java.lang.String r0 = "Unable to get from disk cache"
            android.util.Log.w(r1, r0, r5)
        L_0x0057:
            r5 = 0
        L_0x0058:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: u2.d.e(q2.f):java.io.File");
    }
}
