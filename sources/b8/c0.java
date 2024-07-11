package b8;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.PowerManager;
import android.util.Log;
import java.util.concurrent.TimeUnit;

public final class c0 implements Runnable {

    /* renamed from: t  reason: collision with root package name */
    public static final Object f1990t = new Object();
    public static Boolean u;

    /* renamed from: v  reason: collision with root package name */
    public static Boolean f1991v;

    /* renamed from: o  reason: collision with root package name */
    public final Context f1992o;

    /* renamed from: p  reason: collision with root package name */
    public final p f1993p;

    /* renamed from: q  reason: collision with root package name */
    public final PowerManager.WakeLock f1994q;

    /* renamed from: r  reason: collision with root package name */
    public final b0 f1995r;

    /* renamed from: s  reason: collision with root package name */
    public final long f1996s;

    public class a extends BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        public c0 f1997a;

        public a(c0 c0Var) {
            this.f1997a = c0Var;
        }

        public final void a() {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            c0.this.f1992o.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        public final synchronized void onReceive(Context context, Intent intent) {
            c0 c0Var = this.f1997a;
            if (c0Var != null) {
                if (c0Var.d()) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                    }
                    c0 c0Var2 = this.f1997a;
                    c0Var2.f1995r.f1984f.schedule(c0Var2, 0, TimeUnit.SECONDS);
                    context.unregisterReceiver(this);
                    this.f1997a = null;
                }
            }
        }
    }

    public c0(b0 b0Var, Context context, p pVar, long j8) {
        this.f1995r = b0Var;
        this.f1992o = context;
        this.f1996s = j8;
        this.f1993p = pVar;
        this.f1994q = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    public static boolean a(Context context) {
        boolean booleanValue;
        synchronized (f1990t) {
            Boolean bool = f1991v;
            Boolean valueOf = Boolean.valueOf(bool == null ? b(context, "android.permission.ACCESS_NETWORK_STATE", bool) : bool.booleanValue());
            f1991v = valueOf;
            booleanValue = valueOf.booleanValue();
        }
        return booleanValue;
    }

    public static boolean b(Context context, String str, Boolean bool) {
        boolean z;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (context.checkCallingOrSelfPermission(str) == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z || !Log.isLoggable("FirebaseMessaging", 3)) {
            return z;
        }
        StringBuilder sb = new StringBuilder(str.length() + 142);
        sb.append("Missing Permission: ");
        sb.append(str);
        sb.append(". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        Log.d("FirebaseMessaging", sb.toString());
        return false;
    }

    public static boolean c(Context context) {
        boolean booleanValue;
        synchronized (f1990t) {
            Boolean bool = u;
            Boolean valueOf = Boolean.valueOf(bool == null ? b(context, "android.permission.WAKE_LOCK", bool) : bool.booleanValue());
            u = valueOf;
            booleanValue = valueOf.booleanValue();
        }
        return booleanValue;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001f, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean d() {
        /*
            r2 = this;
            monitor-enter(r2)
            android.content.Context r0 = r2.f1992o     // Catch:{ all -> 0x0021 }
            java.lang.String r1 = "connectivity"
            java.lang.Object r0 = r0.getSystemService(r1)     // Catch:{ all -> 0x0021 }
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0     // Catch:{ all -> 0x0021 }
            if (r0 == 0) goto L_0x0012
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()     // Catch:{ all -> 0x0021 }
            goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            if (r0 == 0) goto L_0x001e
            boolean r0 = r0.isConnected()     // Catch:{ all -> 0x0021 }
            if (r0 == 0) goto L_0x001e
            monitor-exit(r2)
            r0 = 1
            return r0
        L_0x001e:
            monitor-exit(r2)
            r0 = 0
            return r0
        L_0x0021:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b8.c0.d():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:104:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0038, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x003b, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:?, code lost:
        r6 = java.lang.String.valueOf(r6.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0091, code lost:
        if (r6.length() != 0) goto L_0x0093;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0093, code lost:
        r6 = "Failed to sync topics. Won't retry sync. ".concat(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0098, code lost:
        r6 = new java.lang.String("Failed to sync topics. Won't retry sync. ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x009d, code lost:
        android.util.Log.e("FirebaseMessaging", r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x00a0, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:?, code lost:
        r2.f1985g = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x00a8, code lost:
        if (c(r3) != false) goto L_0x00aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:?, code lost:
        r5.release();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x00ad, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x00ae, code lost:
        android.util.Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x00b9, code lost:
        if (c(r3) != false) goto L_0x00bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:?, code lost:
        r5.release();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x00bf, code lost:
        android.util.Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x00c2, code lost:
        throw r2;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    @android.annotation.SuppressLint({"Wakelock"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r9 = this;
            java.lang.String r0 = "TopicsSyncTask's wakelock was already released due to timeout."
            java.lang.String r1 = "FirebaseMessaging"
            b8.b0 r2 = r9.f1995r
            android.content.Context r3 = r9.f1992o
            boolean r4 = c(r3)
            android.os.PowerManager$WakeLock r5 = r9.f1994q
            if (r4 == 0) goto L_0x0015
            long r6 = b8.b.f1977a
            r5.acquire(r6)
        L_0x0015:
            r4 = 0
            monitor-enter(r2)     // Catch:{ IOException -> 0x003b }
            r6 = 1
            r2.f1985g = r6     // Catch:{ all -> 0x0080 }
            monitor-exit(r2)     // Catch:{ IOException -> 0x003b }
            b8.p r6 = r9.f1993p     // Catch:{ IOException -> 0x003b }
            boolean r6 = r6.c()     // Catch:{ IOException -> 0x003b }
            if (r6 != 0) goto L_0x003d
            monitor-enter(r2)     // Catch:{ IOException -> 0x003b }
            r2.f1985g = r4     // Catch:{ all -> 0x0035 }
            monitor-exit(r2)     // Catch:{ IOException -> 0x003b }
            boolean r2 = c(r3)
            if (r2 == 0) goto L_0x0034
            r5.release()     // Catch:{ RuntimeException -> 0x0031 }
            return
        L_0x0031:
            android.util.Log.i(r1, r0)
        L_0x0034:
            return
        L_0x0035:
            r6 = move-exception
            monitor-exit(r2)     // Catch:{ IOException -> 0x003b }
            throw r6     // Catch:{ IOException -> 0x003b }
        L_0x0038:
            r2 = move-exception
            goto L_0x00b5
        L_0x003b:
            r6 = move-exception
            goto L_0x0083
        L_0x003d:
            boolean r6 = a(r3)     // Catch:{ IOException -> 0x003b }
            if (r6 == 0) goto L_0x005f
            boolean r6 = r9.d()     // Catch:{ IOException -> 0x003b }
            if (r6 != 0) goto L_0x005f
            b8.c0$a r6 = new b8.c0$a     // Catch:{ IOException -> 0x003b }
            r6.<init>(r9)     // Catch:{ IOException -> 0x003b }
            r6.a()     // Catch:{ IOException -> 0x003b }
            boolean r2 = c(r3)
            if (r2 == 0) goto L_0x005e
            r5.release()     // Catch:{ RuntimeException -> 0x005b }
            return
        L_0x005b:
            android.util.Log.i(r1, r0)
        L_0x005e:
            return
        L_0x005f:
            boolean r6 = r2.e()     // Catch:{ IOException -> 0x003b }
            if (r6 == 0) goto L_0x006d
            monitor-enter(r2)     // Catch:{ IOException -> 0x003b }
            r2.f1985g = r4     // Catch:{ all -> 0x006a }
            monitor-exit(r2)     // Catch:{ IOException -> 0x003b }
            goto L_0x0072
        L_0x006a:
            r6 = move-exception
            monitor-exit(r2)     // Catch:{ IOException -> 0x003b }
            throw r6     // Catch:{ IOException -> 0x003b }
        L_0x006d:
            long r6 = r9.f1996s     // Catch:{ IOException -> 0x003b }
            r2.f(r6)     // Catch:{ IOException -> 0x003b }
        L_0x0072:
            boolean r2 = c(r3)
            if (r2 == 0) goto L_0x00b1
            r5.release()     // Catch:{ RuntimeException -> 0x007c }
            return
        L_0x007c:
            android.util.Log.i(r1, r0)
            return
        L_0x0080:
            r6 = move-exception
            monitor-exit(r2)     // Catch:{ IOException -> 0x003b }
            throw r6     // Catch:{ IOException -> 0x003b }
        L_0x0083:
            java.lang.String r7 = "Failed to sync topics. Won't retry sync. "
            java.lang.String r6 = r6.getMessage()     // Catch:{ all -> 0x0038 }
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x0038 }
            int r8 = r6.length()     // Catch:{ all -> 0x0038 }
            if (r8 == 0) goto L_0x0098
            java.lang.String r6 = r7.concat(r6)     // Catch:{ all -> 0x0038 }
            goto L_0x009d
        L_0x0098:
            java.lang.String r6 = new java.lang.String     // Catch:{ all -> 0x0038 }
            r6.<init>(r7)     // Catch:{ all -> 0x0038 }
        L_0x009d:
            android.util.Log.e(r1, r6)     // Catch:{ all -> 0x0038 }
            monitor-enter(r2)     // Catch:{ all -> 0x0038 }
            r2.f1985g = r4     // Catch:{ all -> 0x00b2 }
            monitor-exit(r2)     // Catch:{ all -> 0x0038 }
            boolean r2 = c(r3)
            if (r2 == 0) goto L_0x00b1
            r5.release()     // Catch:{ RuntimeException -> 0x00ae }
            return
        L_0x00ae:
            android.util.Log.i(r1, r0)
        L_0x00b1:
            return
        L_0x00b2:
            r4 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0038 }
            throw r4     // Catch:{ all -> 0x0038 }
        L_0x00b5:
            boolean r3 = c(r3)
            if (r3 == 0) goto L_0x00c2
            r5.release()     // Catch:{ RuntimeException -> 0x00bf }
            goto L_0x00c2
        L_0x00bf:
            android.util.Log.i(r1, r0)
        L_0x00c2:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: b8.c0.run():void");
    }
}
