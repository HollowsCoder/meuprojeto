package b8;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import m5.i;
import m5.l;
import n.b;

public final class b0 {

    /* renamed from: i  reason: collision with root package name */
    public static final long f1978i = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: j  reason: collision with root package name */
    public static final /* synthetic */ int f1979j = 0;

    /* renamed from: a  reason: collision with root package name */
    public final Context f1980a;

    /* renamed from: b  reason: collision with root package name */
    public final p f1981b;

    /* renamed from: c  reason: collision with root package name */
    public final m f1982c;
    public final FirebaseMessaging d;

    /* renamed from: e  reason: collision with root package name */
    public final b f1983e = new b();

    /* renamed from: f  reason: collision with root package name */
    public final ScheduledExecutorService f1984f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f1985g = false;

    /* renamed from: h  reason: collision with root package name */
    public final z f1986h;

    public b0(FirebaseMessaging firebaseMessaging, p pVar, z zVar, m mVar, Context context, ScheduledExecutorService scheduledExecutorService) {
        this.d = firebaseMessaging;
        this.f1981b = pVar;
        this.f1986h = zVar;
        this.f1982c = mVar;
        this.f1980a = context;
        this.f1984f = scheduledExecutorService;
    }

    public static <T> void a(i<T> iVar) {
        try {
            l.b(iVar, 30, TimeUnit.SECONDS);
        } catch (ExecutionException e10) {
            Throwable cause = e10.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            } else if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else {
                throw new IOException(e10);
            }
        } catch (InterruptedException | TimeoutException e11) {
            throw new IOException("SERVICE_NOT_AVAILABLE", e11);
        }
    }

    public static boolean d() {
        return Log.isLoggable("FirebaseMessaging", 3);
    }

    public final void b(String str) {
        String str2;
        String str3;
        String a10 = this.d.a();
        m mVar = this.f1982c;
        mVar.getClass();
        Bundle bundle = new Bundle();
        String valueOf = String.valueOf(str);
        if (valueOf.length() != 0) {
            str2 = "/topics/".concat(valueOf);
        } else {
            str2 = new String("/topics/");
        }
        bundle.putString("gcm.topic", str2);
        String valueOf2 = String.valueOf(str);
        if (valueOf2.length() != 0) {
            str3 = "/topics/".concat(valueOf2);
        } else {
            str3 = new String("/topics/");
        }
        a(mVar.a(mVar.c(a10, str3, bundle)));
    }

    public final void c(String str) {
        String str2;
        String str3;
        String a10 = this.d.a();
        m mVar = this.f1982c;
        mVar.getClass();
        Bundle bundle = new Bundle();
        String valueOf = String.valueOf(str);
        if (valueOf.length() != 0) {
            str2 = "/topics/".concat(valueOf);
        } else {
            str2 = new String("/topics/");
        }
        bundle.putString("gcm.topic", str2);
        bundle.putString("delete", "1");
        String valueOf2 = String.valueOf(str);
        if (valueOf2.length() != 0) {
            str3 = "/topics/".concat(valueOf2);
        } else {
            str3 = new String("/topics/");
        }
        a(mVar.a(mVar.c(a10, str3, bundle)));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r4 = r0.f2060b;
        r5 = r4.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0025, code lost:
        if (r5 == 83) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0029, code lost:
        if (r5 == 85) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0032, code lost:
        if (r4.equals("U") == false) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0034, code lost:
        r4 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003c, code lost:
        if (r4.equals("S") == false) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003e, code lost:
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0040, code lost:
        r4 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0041, code lost:
        r6 = r0.f2059a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0045, code lost:
        if (r4 == 0) goto L_0x0091;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0047, code lost:
        if (r4 == 1) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x004d, code lost:
        if (d() == false) goto L_0x00fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x004f, code lost:
        r4 = r0.toString();
        r6 = new java.lang.StringBuilder(r4.length() + 24);
        r6.append("Unknown topic operation");
        r6.append(r4);
        r6.append(".");
        r4 = r6.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0070, code lost:
        c(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0077, code lost:
        if (d() == false) goto L_0x00fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0079, code lost:
        r7 = new java.lang.StringBuilder(java.lang.String.valueOf(r6).length() + 35);
        r7.append("Unsubscribe from topic: ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x008d, code lost:
        r7.append(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0091, code lost:
        b(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0098, code lost:
        if (d() == false) goto L_0x00fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x009a, code lost:
        r7 = new java.lang.StringBuilder(java.lang.String.valueOf(r6).length() + 31);
        r7.append("Subscribe to topic: ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00af, code lost:
        r7.append(" succeeded.");
        r4 = r7.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b6, code lost:
        android.util.Log.d("FirebaseMessaging", r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00ba, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00c5, code lost:
        if ("SERVICE_NOT_AVAILABLE".equals(r1.getMessage()) != false) goto L_0x00de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00d8, code lost:
        if (r1.getMessage() == null) goto L_0x00da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00da, code lost:
        r1 = "Topic operation failed without exception message. Will retry Topic operation.";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00dd, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00de, code lost:
        r1 = r1.getMessage();
        r1 = androidx.appcompat.widget.x0.f(new java.lang.StringBuilder(java.lang.String.valueOf(r1).length() + 53), "Topic operation failed: ", r1, ". Will retry Topic operation.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00f9, code lost:
        android.util.Log.e("FirebaseMessaging", r1);
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0018, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean e() {
        /*
            r8 = this;
        L_0x0000:
            monitor-enter(r8)
            b8.z r0 = r8.f1986h     // Catch:{ all -> 0x0158 }
            b8.y r0 = r0.a()     // Catch:{ all -> 0x0158 }
            r1 = 1
            if (r0 != 0) goto L_0x0019
            boolean r0 = d()     // Catch:{ all -> 0x0158 }
            if (r0 == 0) goto L_0x0017
            java.lang.String r0 = "FirebaseMessaging"
            java.lang.String r2 = "topic sync succeeded"
            android.util.Log.d(r0, r2)     // Catch:{ all -> 0x0158 }
        L_0x0017:
            monitor-exit(r8)     // Catch:{ all -> 0x0158 }
            return r1
        L_0x0019:
            monitor-exit(r8)     // Catch:{ all -> 0x0158 }
            java.lang.String r2 = "FirebaseMessaging"
            r3 = 0
            java.lang.String r4 = r0.f2060b     // Catch:{ IOException -> 0x00ba }
            int r5 = r4.hashCode()     // Catch:{ IOException -> 0x00ba }
            r6 = 83
            if (r5 == r6) goto L_0x0036
            r6 = 85
            if (r5 == r6) goto L_0x002c
            goto L_0x0040
        L_0x002c:
            java.lang.String r5 = "U"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0040
            r4 = r1
            goto L_0x0041
        L_0x0036:
            java.lang.String r5 = "S"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0040
            r4 = r3
            goto L_0x0041
        L_0x0040:
            r4 = -1
        L_0x0041:
            java.lang.String r5 = " succeeded."
            java.lang.String r6 = r0.f2059a
            if (r4 == 0) goto L_0x0091
            if (r4 == r1) goto L_0x0070
            boolean r4 = d()     // Catch:{ IOException -> 0x00ba }
            if (r4 == 0) goto L_0x00fd
            java.lang.String r4 = r0.toString()     // Catch:{ IOException -> 0x00ba }
            int r5 = r4.length()     // Catch:{ IOException -> 0x00ba }
            int r5 = r5 + 24
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00ba }
            r6.<init>(r5)     // Catch:{ IOException -> 0x00ba }
            java.lang.String r5 = "Unknown topic operation"
            r6.append(r5)     // Catch:{ IOException -> 0x00ba }
            r6.append(r4)     // Catch:{ IOException -> 0x00ba }
            java.lang.String r4 = "."
            r6.append(r4)     // Catch:{ IOException -> 0x00ba }
            java.lang.String r4 = r6.toString()     // Catch:{ IOException -> 0x00ba }
            goto L_0x00b6
        L_0x0070:
            r8.c(r6)     // Catch:{ IOException -> 0x00ba }
            boolean r4 = d()     // Catch:{ IOException -> 0x00ba }
            if (r4 == 0) goto L_0x00fd
            java.lang.String r4 = java.lang.String.valueOf(r6)     // Catch:{ IOException -> 0x00ba }
            int r4 = r4.length()     // Catch:{ IOException -> 0x00ba }
            int r4 = r4 + 35
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00ba }
            r7.<init>(r4)     // Catch:{ IOException -> 0x00ba }
            java.lang.String r4 = "Unsubscribe from topic: "
            r7.append(r4)     // Catch:{ IOException -> 0x00ba }
        L_0x008d:
            r7.append(r6)     // Catch:{ IOException -> 0x00ba }
            goto L_0x00af
        L_0x0091:
            r8.b(r6)     // Catch:{ IOException -> 0x00ba }
            boolean r4 = d()     // Catch:{ IOException -> 0x00ba }
            if (r4 == 0) goto L_0x00fd
            java.lang.String r4 = java.lang.String.valueOf(r6)     // Catch:{ IOException -> 0x00ba }
            int r4 = r4.length()     // Catch:{ IOException -> 0x00ba }
            int r4 = r4 + 31
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00ba }
            r7.<init>(r4)     // Catch:{ IOException -> 0x00ba }
            java.lang.String r4 = "Subscribe to topic: "
            r7.append(r4)     // Catch:{ IOException -> 0x00ba }
            goto L_0x008d
        L_0x00af:
            r7.append(r5)     // Catch:{ IOException -> 0x00ba }
            java.lang.String r4 = r7.toString()     // Catch:{ IOException -> 0x00ba }
        L_0x00b6:
            android.util.Log.d(r2, r4)     // Catch:{ IOException -> 0x00ba }
            goto L_0x00fd
        L_0x00ba:
            r1 = move-exception
            java.lang.String r4 = "SERVICE_NOT_AVAILABLE"
            java.lang.String r5 = r1.getMessage()
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x00de
            java.lang.String r4 = "INTERNAL_SERVER_ERROR"
            java.lang.String r5 = r1.getMessage()
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x00d4
            goto L_0x00de
        L_0x00d4:
            java.lang.String r4 = r1.getMessage()
            if (r4 != 0) goto L_0x00dd
            java.lang.String r1 = "Topic operation failed without exception message. Will retry Topic operation."
            goto L_0x00f9
        L_0x00dd:
            throw r1
        L_0x00de:
            java.lang.String r1 = r1.getMessage()
            java.lang.String r4 = java.lang.String.valueOf(r1)
            int r4 = r4.length()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            int r4 = r4 + 53
            r5.<init>(r4)
            java.lang.String r4 = "Topic operation failed: "
            java.lang.String r6 = ". Will retry Topic operation."
            java.lang.String r1 = androidx.appcompat.widget.x0.f(r5, r4, r1, r6)
        L_0x00f9:
            android.util.Log.e(r2, r1)
            r1 = r3
        L_0x00fd:
            if (r1 != 0) goto L_0x0100
            return r3
        L_0x0100:
            b8.z r1 = r8.f1986h
            monitor-enter(r1)
            b8.w r2 = r1.f2063a     // Catch:{ all -> 0x0155 }
            java.lang.String r3 = r0.f2061c     // Catch:{ all -> 0x0155 }
            java.util.ArrayDeque<java.lang.String> r4 = r2.d     // Catch:{ all -> 0x0155 }
            monitor-enter(r4)     // Catch:{ all -> 0x0155 }
            java.util.ArrayDeque<java.lang.String> r5 = r2.d     // Catch:{ all -> 0x0152 }
            boolean r3 = r5.remove(r3)     // Catch:{ all -> 0x0152 }
            if (r3 == 0) goto L_0x011d
            i4.l r3 = new i4.l     // Catch:{ all -> 0x0152 }
            r5 = 6
            r3.<init>(r5, r2)     // Catch:{ all -> 0x0152 }
            java.util.concurrent.Executor r2 = r2.f2054e     // Catch:{ all -> 0x0152 }
            r2.execute(r3)     // Catch:{ all -> 0x0152 }
        L_0x011d:
            monitor-exit(r4)     // Catch:{ all -> 0x0152 }
            monitor-exit(r1)
            n.b r2 = r8.f1983e
            monitor-enter(r2)
            java.lang.String r0 = r0.f2061c     // Catch:{ all -> 0x014f }
            n.b r1 = r8.f1983e     // Catch:{ all -> 0x014f }
            boolean r1 = r1.containsKey(r0)     // Catch:{ all -> 0x014f }
            if (r1 != 0) goto L_0x012d
            goto L_0x014c
        L_0x012d:
            n.b r1 = r8.f1983e     // Catch:{ all -> 0x014f }
            r3 = 0
            java.lang.Object r1 = r1.getOrDefault(r0, r3)     // Catch:{ all -> 0x014f }
            java.util.ArrayDeque r1 = (java.util.ArrayDeque) r1     // Catch:{ all -> 0x014f }
            java.lang.Object r4 = r1.poll()     // Catch:{ all -> 0x014f }
            m5.j r4 = (m5.j) r4     // Catch:{ all -> 0x014f }
            if (r4 == 0) goto L_0x0141
            r4.a(r3)     // Catch:{ all -> 0x014f }
        L_0x0141:
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x014f }
            if (r1 == 0) goto L_0x014c
            n.b r1 = r8.f1983e     // Catch:{ all -> 0x014f }
            r1.remove(r0)     // Catch:{ all -> 0x014f }
        L_0x014c:
            monitor-exit(r2)     // Catch:{ all -> 0x014f }
            goto L_0x0000
        L_0x014f:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x014f }
            throw r0
        L_0x0152:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0152 }
            throw r0     // Catch:{ all -> 0x0155 }
        L_0x0155:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x0158:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0158 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b8.b0.e():boolean");
    }

    public final void f(long j8) {
        this.f1984f.schedule(new c0(this, this.f1980a, this.f1981b, Math.min(Math.max(30, j8 + j8), f1978i)), j8, TimeUnit.SECONDS);
        synchronized (this) {
            this.f1985g = true;
        }
    }
}
