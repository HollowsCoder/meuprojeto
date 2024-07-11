package b8;

import java.util.concurrent.TimeUnit;
import l5.a;

public final class d0 {

    /* renamed from: a  reason: collision with root package name */
    public static final long f2000a = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: b  reason: collision with root package name */
    public static final Object f2001b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public static a f2002c;

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0035, code lost:
        return r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.ComponentName a(android.content.Context r4, android.content.Intent r5) {
        /*
            java.lang.Object r0 = f2001b
            monitor-enter(r0)
            l5.a r1 = f2002c     // Catch:{ all -> 0x0036 }
            r2 = 1
            if (r1 != 0) goto L_0x0016
            l5.a r1 = new l5.a     // Catch:{ all -> 0x0036 }
            r1.<init>(r4)     // Catch:{ all -> 0x0036 }
            f2002c = r1     // Catch:{ all -> 0x0036 }
            android.os.PowerManager$WakeLock r3 = r1.f6955b     // Catch:{ all -> 0x0036 }
            r3.setReferenceCounted(r2)     // Catch:{ all -> 0x0036 }
            r1.f6958f = r2     // Catch:{ all -> 0x0036 }
        L_0x0016:
            java.lang.String r1 = "com.google.firebase.iid.WakeLockHolder.wakefulintent"
            r3 = 0
            boolean r1 = r5.getBooleanExtra(r1, r3)     // Catch:{ all -> 0x0036 }
            java.lang.String r3 = "com.google.firebase.iid.WakeLockHolder.wakefulintent"
            r5.putExtra(r3, r2)     // Catch:{ all -> 0x0036 }
            android.content.ComponentName r4 = r4.startService(r5)     // Catch:{ all -> 0x0036 }
            if (r4 != 0) goto L_0x002b
            monitor-exit(r0)     // Catch:{ all -> 0x0036 }
            r4 = 0
            return r4
        L_0x002b:
            if (r1 != 0) goto L_0x0034
            l5.a r5 = f2002c     // Catch:{ all -> 0x0036 }
            long r1 = f2000a     // Catch:{ all -> 0x0036 }
            r5.a(r1)     // Catch:{ all -> 0x0036 }
        L_0x0034:
            monitor-exit(r0)     // Catch:{ all -> 0x0036 }
            return r4
        L_0x0036:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0036 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: b8.d0.a(android.content.Context, android.content.Intent):android.content.ComponentName");
    }
}
