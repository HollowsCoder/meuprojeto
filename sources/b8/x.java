package b8;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class x implements Runnable {

    /* renamed from: o  reason: collision with root package name */
    public final long f2055o;

    /* renamed from: p  reason: collision with root package name */
    public final PowerManager.WakeLock f2056p;

    /* renamed from: q  reason: collision with root package name */
    public final FirebaseMessaging f2057q;

    public static class a extends BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        public x f2058a;

        public a(x xVar) {
            this.f2058a = xVar;
        }

        public final void a() {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            this.f2058a.f2057q.d.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        public final void onReceive(Context context, Intent intent) {
            x xVar = this.f2058a;
            if (xVar != null && xVar.a()) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                }
                x xVar2 = this.f2058a;
                xVar2.f2057q.getClass();
                FirebaseMessaging.b(xVar2, 0);
                this.f2058a.f2057q.d.unregisterReceiver(this);
                this.f2058a = null;
            }
        }
    }

    @SuppressLint({"InvalidWakeLockTag"})
    public x(FirebaseMessaging firebaseMessaging, long j8) {
        new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new s4.a("firebase-iid-executor"));
        this.f2057q = firebaseMessaging;
        this.f2055o = j8;
        PowerManager.WakeLock newWakeLock = ((PowerManager) firebaseMessaging.d.getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f2056p = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    public final boolean a() {
        NetworkInfo networkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f2057q.d.getSystemService("connectivity");
        if (connectivityManager != null) {
            networkInfo = connectivityManager.getActiveNetworkInfo();
        } else {
            networkInfo = null;
        }
        if (networkInfo == null || !networkInfo.isConnected()) {
            return false;
        }
        return true;
    }

    public final boolean b() {
        String str;
        boolean z = true;
        try {
            if (this.f2057q.a() == null) {
                Log.e("FirebaseMessaging", "Token retrieval failed: null");
                return false;
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Token successfully retrieved");
            }
            return true;
        } catch (IOException e10) {
            String message = e10.getMessage();
            if (!"SERVICE_NOT_AVAILABLE".equals(message) && !"INTERNAL_SERVER_ERROR".equals(message) && !"InternalServerError".equals(message)) {
                z = false;
            }
            if (z) {
                String message2 = e10.getMessage();
                StringBuilder sb = new StringBuilder(String.valueOf(message2).length() + 52);
                sb.append("Token retrieval failed: ");
                sb.append(message2);
                sb.append(". Will retry token retrieval");
                str = sb.toString();
            } else if (e10.getMessage() == null) {
                str = "Token retrieval failed without exception message. Will retry token retrieval";
            } else {
                throw e10;
            }
            Log.w("FirebaseMessaging", str);
            return false;
        } catch (SecurityException unused) {
            str = "Token retrieval failed with SecurityException. Will retry token retrieval";
            Log.w("FirebaseMessaging", str);
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0038, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x003b, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:?, code lost:
        r3 = r3.getMessage();
        r6 = new java.lang.StringBuilder(java.lang.String.valueOf(r3).length() + 93);
        r6.append("Topic sync or token retrieval failed on hard failure exceptions: ");
        r6.append(r3);
        r6.append(". Won't retry the operation.");
        android.util.Log.e("FirebaseMessaging", r6.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00b6, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:?, code lost:
        r1.f3713i = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00c4, code lost:
        if (b8.v.a().c(r1.d) != false) goto L_0x00c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00c6, code lost:
        r2.release();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x00d7, code lost:
        if (b8.v.a().c(r1.d) != false) goto L_0x00da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x00da, code lost:
        r2.release();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x00dd, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:?, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    @android.annotation.SuppressLint({"WakelockTimeout"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r7 = this;
            b8.v r0 = b8.v.a()
            com.google.firebase.messaging.FirebaseMessaging r1 = r7.f2057q
            android.content.Context r2 = r1.d
            boolean r0 = r0.c(r2)
            android.os.PowerManager$WakeLock r2 = r7.f2056p
            if (r0 == 0) goto L_0x0013
            r2.acquire()
        L_0x0013:
            r0 = 0
            monitor-enter(r1)     // Catch:{ IOException -> 0x003b }
            r3 = 1
            r1.f3713i = r3     // Catch:{ all -> 0x008a }
            monitor-exit(r1)     // Catch:{ IOException -> 0x003b }
            b8.p r3 = r1.f3712h     // Catch:{ IOException -> 0x003b }
            boolean r3 = r3.c()     // Catch:{ IOException -> 0x003b }
            if (r3 != 0) goto L_0x003d
            monitor-enter(r1)     // Catch:{ IOException -> 0x003b }
            r1.f3713i = r0     // Catch:{ all -> 0x0035 }
            monitor-exit(r1)     // Catch:{ IOException -> 0x003b }
            b8.v r0 = b8.v.a()
            android.content.Context r1 = r1.d
            boolean r0 = r0.c(r1)
            if (r0 == 0) goto L_0x0034
            r2.release()
        L_0x0034:
            return
        L_0x0035:
            r3 = move-exception
            monitor-exit(r1)     // Catch:{ IOException -> 0x003b }
            throw r3     // Catch:{ IOException -> 0x003b }
        L_0x0038:
            r0 = move-exception
            goto L_0x00cd
        L_0x003b:
            r3 = move-exception
            goto L_0x008d
        L_0x003d:
            b8.v r3 = b8.v.a()     // Catch:{ IOException -> 0x003b }
            android.content.Context r4 = r1.d     // Catch:{ IOException -> 0x003b }
            boolean r3 = r3.b(r4)     // Catch:{ IOException -> 0x003b }
            if (r3 == 0) goto L_0x0067
            boolean r3 = r7.a()     // Catch:{ IOException -> 0x003b }
            if (r3 != 0) goto L_0x0067
            b8.x$a r3 = new b8.x$a     // Catch:{ IOException -> 0x003b }
            r3.<init>(r7)     // Catch:{ IOException -> 0x003b }
            r3.a()     // Catch:{ IOException -> 0x003b }
            b8.v r0 = b8.v.a()
            android.content.Context r1 = r1.d
            boolean r0 = r0.c(r1)
            if (r0 == 0) goto L_0x0066
            r2.release()
        L_0x0066:
            return
        L_0x0067:
            boolean r3 = r7.b()     // Catch:{ IOException -> 0x003b }
            if (r3 == 0) goto L_0x0075
            monitor-enter(r1)     // Catch:{ IOException -> 0x003b }
            r1.f3713i = r0     // Catch:{ all -> 0x0072 }
            monitor-exit(r1)     // Catch:{ IOException -> 0x003b }
            goto L_0x007a
        L_0x0072:
            r3 = move-exception
            monitor-exit(r1)     // Catch:{ IOException -> 0x003b }
            throw r3     // Catch:{ IOException -> 0x003b }
        L_0x0075:
            long r3 = r7.f2055o     // Catch:{ IOException -> 0x003b }
            r1.e(r3)     // Catch:{ IOException -> 0x003b }
        L_0x007a:
            b8.v r0 = b8.v.a()
            android.content.Context r1 = r1.d
            boolean r0 = r0.c(r1)
            if (r0 == 0) goto L_0x00c9
            r2.release()
            return
        L_0x008a:
            r3 = move-exception
            monitor-exit(r1)     // Catch:{ IOException -> 0x003b }
            throw r3     // Catch:{ IOException -> 0x003b }
        L_0x008d:
            java.lang.String r4 = "FirebaseMessaging"
            java.lang.String r3 = r3.getMessage()     // Catch:{ all -> 0x0038 }
            java.lang.String r5 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x0038 }
            int r5 = r5.length()     // Catch:{ all -> 0x0038 }
            int r5 = r5 + 93
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0038 }
            r6.<init>(r5)     // Catch:{ all -> 0x0038 }
            java.lang.String r5 = "Topic sync or token retrieval failed on hard failure exceptions: "
            r6.append(r5)     // Catch:{ all -> 0x0038 }
            r6.append(r3)     // Catch:{ all -> 0x0038 }
            java.lang.String r3 = ". Won't retry the operation."
            r6.append(r3)     // Catch:{ all -> 0x0038 }
            java.lang.String r3 = r6.toString()     // Catch:{ all -> 0x0038 }
            android.util.Log.e(r4, r3)     // Catch:{ all -> 0x0038 }
            monitor-enter(r1)     // Catch:{ all -> 0x0038 }
            r1.f3713i = r0     // Catch:{ all -> 0x00ca }
            monitor-exit(r1)     // Catch:{ all -> 0x0038 }
            b8.v r0 = b8.v.a()
            android.content.Context r1 = r1.d
            boolean r0 = r0.c(r1)
            if (r0 == 0) goto L_0x00c9
            r2.release()
        L_0x00c9:
            return
        L_0x00ca:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0038 }
            throw r0     // Catch:{ all -> 0x0038 }
        L_0x00cd:
            b8.v r3 = b8.v.a()
            android.content.Context r1 = r1.d
            boolean r1 = r3.c(r1)
            if (r1 != 0) goto L_0x00da
            goto L_0x00dd
        L_0x00da:
            r2.release()
        L_0x00dd:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b8.x.run():void");
    }
}
