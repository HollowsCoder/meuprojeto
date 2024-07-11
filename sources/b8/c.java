package b8;

import android.content.Context;
import c1.r;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f1987a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f1988b;

    /* renamed from: c  reason: collision with root package name */
    public final r f1989c;

    public c(Context context, r rVar, ExecutorService executorService) {
        this.f1987a = executorService;
        this.f1988b = context;
        this.f1989c = rVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x009c A[SYNTHETIC, Splitter:B:33:0x009c] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00ee  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a() {
        /*
            r11 = this;
            c1.r r0 = r11.f1989c
            java.lang.String r1 = "gcm.n.noui"
            boolean r1 = r0.g(r1)
            r2 = 1
            if (r1 == 0) goto L_0x000c
            return r2
        L_0x000c:
            android.content.Context r1 = r11.f1988b
            java.lang.String r3 = "keyguard"
            java.lang.Object r3 = r1.getSystemService(r3)
            android.app.KeyguardManager r3 = (android.app.KeyguardManager) r3
            boolean r3 = r3.inKeyguardRestrictedInputMode()
            r4 = 0
            if (r3 == 0) goto L_0x001e
            goto L_0x004c
        L_0x001e:
            int r3 = android.os.Process.myPid()
            java.lang.String r5 = "activity"
            java.lang.Object r5 = r1.getSystemService(r5)
            android.app.ActivityManager r5 = (android.app.ActivityManager) r5
            java.util.List r5 = r5.getRunningAppProcesses()
            if (r5 == 0) goto L_0x004c
            java.util.Iterator r5 = r5.iterator()
        L_0x0034:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x004c
            java.lang.Object r6 = r5.next()
            android.app.ActivityManager$RunningAppProcessInfo r6 = (android.app.ActivityManager.RunningAppProcessInfo) r6
            int r7 = r6.pid
            if (r7 != r3) goto L_0x0034
            int r3 = r6.importance
            r5 = 100
            if (r3 != r5) goto L_0x004c
            r3 = r2
            goto L_0x004d
        L_0x004c:
            r3 = r4
        L_0x004d:
            if (r3 == 0) goto L_0x0050
            return r4
        L_0x0050:
            java.lang.String r3 = "gcm.n.image"
            java.lang.String r3 = r0.l(r3)
            boolean r5 = android.text.TextUtils.isEmpty(r3)
            java.lang.String r6 = "FirebaseMessaging"
            if (r5 == 0) goto L_0x005f
            goto L_0x0083
        L_0x005f:
            b8.n r5 = new b8.n     // Catch:{ MalformedURLException -> 0x006a }
            java.net.URL r7 = new java.net.URL     // Catch:{ MalformedURLException -> 0x006a }
            r7.<init>(r3)     // Catch:{ MalformedURLException -> 0x006a }
            r5.<init>(r7)     // Catch:{ MalformedURLException -> 0x006a }
            goto L_0x0084
        L_0x006a:
            java.lang.String r3 = java.lang.String.valueOf(r3)
            int r5 = r3.length()
            java.lang.String r7 = "Not downloading image, bad URL: "
            if (r5 == 0) goto L_0x007b
            java.lang.String r3 = r7.concat(r3)
            goto L_0x0080
        L_0x007b:
            java.lang.String r3 = new java.lang.String
            r3.<init>(r7)
        L_0x0080:
            android.util.Log.w(r6, r3)
        L_0x0083:
            r5 = 0
        L_0x0084:
            if (r5 == 0) goto L_0x0093
            x4.e r3 = new x4.e
            r3.<init>(r2, r5)
            java.util.concurrent.Executor r7 = r11.f1987a
            m5.r r3 = m5.l.c(r7, r3)
            r5.f2035p = r3
        L_0x0093:
            b8.a$a r0 = b8.a.a(r1, r0)
            x.j r3 = r0.f1971a
            if (r5 != 0) goto L_0x009c
            goto L_0x00e7
        L_0x009c:
            m5.r r7 = r5.f2035p     // Catch:{ ExecutionException -> 0x00d5, InterruptedException -> 0x00c5, TimeoutException -> 0x00bc }
            n4.m.h(r7)     // Catch:{ ExecutionException -> 0x00d5, InterruptedException -> 0x00c5, TimeoutException -> 0x00bc }
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ ExecutionException -> 0x00d5, InterruptedException -> 0x00c5, TimeoutException -> 0x00bc }
            r9 = 5
            java.lang.Object r7 = m5.l.b(r7, r9, r8)     // Catch:{ ExecutionException -> 0x00d5, InterruptedException -> 0x00c5, TimeoutException -> 0x00bc }
            android.graphics.Bitmap r7 = (android.graphics.Bitmap) r7     // Catch:{ ExecutionException -> 0x00d5, InterruptedException -> 0x00c5, TimeoutException -> 0x00bc }
            r3.c(r7)     // Catch:{ ExecutionException -> 0x00d5, InterruptedException -> 0x00c5, TimeoutException -> 0x00bc }
            x.h r8 = new x.h     // Catch:{ ExecutionException -> 0x00d5, InterruptedException -> 0x00c5, TimeoutException -> 0x00bc }
            r8.<init>()     // Catch:{ ExecutionException -> 0x00d5, InterruptedException -> 0x00c5, TimeoutException -> 0x00bc }
            r8.f9405b = r7     // Catch:{ ExecutionException -> 0x00d5, InterruptedException -> 0x00c5, TimeoutException -> 0x00bc }
            r8.d()     // Catch:{ ExecutionException -> 0x00d5, InterruptedException -> 0x00c5, TimeoutException -> 0x00bc }
            r3.d(r8)     // Catch:{ ExecutionException -> 0x00d5, InterruptedException -> 0x00c5, TimeoutException -> 0x00bc }
            goto L_0x00e7
        L_0x00bc:
            java.lang.String r7 = "Failed to download image in time, showing notification without it"
            android.util.Log.w(r6, r7)
            r5.close()
            goto L_0x00e7
        L_0x00c5:
            java.lang.String r7 = "Interrupted while downloading image, showing notification without it"
            android.util.Log.w(r6, r7)
            r5.close()
            java.lang.Thread r5 = java.lang.Thread.currentThread()
            r5.interrupt()
            goto L_0x00e7
        L_0x00d5:
            r5 = move-exception
            java.lang.Throwable r5 = r5.getCause()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r7 = "Failed to download image: "
            java.lang.String r5 = r7.concat(r5)
            android.util.Log.w(r6, r5)
        L_0x00e7:
            r5 = 3
            boolean r5 = android.util.Log.isLoggable(r6, r5)
            if (r5 == 0) goto L_0x00f3
            java.lang.String r5 = "Showing notification"
            android.util.Log.d(r6, r5)
        L_0x00f3:
            java.lang.String r5 = "notification"
            java.lang.Object r1 = r1.getSystemService(r5)
            android.app.NotificationManager r1 = (android.app.NotificationManager) r1
            java.lang.String r0 = r0.f1972b
            android.app.Notification r3 = r3.a()
            r1.notify(r0, r4, r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: b8.c.a():boolean");
    }
}
