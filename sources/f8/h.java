package f8;

import androidx.emoji2.text.f;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.regex.Pattern;
import r4.b;

public final class h {

    /* renamed from: e  reason: collision with root package name */
    public static final Pattern f4918e = Pattern.compile("^(1|true|t|yes|y|on)$", 2);

    /* renamed from: f  reason: collision with root package name */
    public static final Pattern f4919f = Pattern.compile("^(0|false|f|no|n|off|)$", 2);

    /* renamed from: a  reason: collision with root package name */
    public final HashSet f4920a = new HashSet();

    /* renamed from: b  reason: collision with root package name */
    public final Executor f4921b;

    /* renamed from: c  reason: collision with root package name */
    public final d f4922c;
    public final d d;

    static {
        Charset.forName("UTF-8");
    }

    public h(ExecutorService executorService, d dVar, d dVar2) {
        this.f4921b = executorService;
        this.f4922c = dVar;
        this.d = dVar2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0024, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0029, code lost:
        android.util.Log.d("FirebaseRemoteConfig", "Reading from storage file failed.", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        return (f8.e) f8.d.a(r2.b(), java.util.concurrent.TimeUnit.SECONDS);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static f8.e b(f8.d r2) {
        /*
            monitor-enter(r2)
            m5.r r0 = r2.f4905c     // Catch:{ all -> 0x0032 }
            if (r0 == 0) goto L_0x0015
            boolean r0 = r0.m()     // Catch:{ all -> 0x0032 }
            if (r0 == 0) goto L_0x0015
            m5.r r0 = r2.f4905c     // Catch:{ all -> 0x0032 }
            java.lang.Object r0 = r0.i()     // Catch:{ all -> 0x0032 }
            f8.e r0 = (f8.e) r0     // Catch:{ all -> 0x0032 }
            monitor-exit(r2)     // Catch:{ all -> 0x0032 }
            goto L_0x0031
        L_0x0015:
            monitor-exit(r2)     // Catch:{ all -> 0x0032 }
            m5.i r2 = r2.b()     // Catch:{ InterruptedException -> 0x0028, ExecutionException -> 0x0026, TimeoutException -> 0x0024 }
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException -> 0x0028, ExecutionException -> 0x0026, TimeoutException -> 0x0024 }
            java.lang.Object r2 = f8.d.a(r2, r0)     // Catch:{ InterruptedException -> 0x0028, ExecutionException -> 0x0026, TimeoutException -> 0x0024 }
            r0 = r2
            f8.e r0 = (f8.e) r0     // Catch:{ InterruptedException -> 0x0028, ExecutionException -> 0x0026, TimeoutException -> 0x0024 }
            goto L_0x0031
        L_0x0024:
            r2 = move-exception
            goto L_0x0029
        L_0x0026:
            r2 = move-exception
            goto L_0x0029
        L_0x0028:
            r2 = move-exception
        L_0x0029:
            java.lang.String r0 = "FirebaseRemoteConfig"
            java.lang.String r1 = "Reading from storage file failed."
            android.util.Log.d(r0, r1, r2)
            r0 = 0
        L_0x0031:
            return r0
        L_0x0032:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0032 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: f8.h.b(f8.d):f8.e");
    }

    public final void a(e eVar, String str) {
        if (eVar != null) {
            synchronized (this.f4920a) {
                Iterator it = this.f4920a.iterator();
                while (it.hasNext()) {
                    this.f4921b.execute(new f((b) it.next(), str, eVar, 2));
                }
            }
        }
    }
}
