package e4;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import androidx.appcompat.widget.x0;
import i4.s;
import j4.f;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import n4.m;
import y4.c;
import y4.d;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public j4.a f4476a;

    /* renamed from: b  reason: collision with root package name */
    public y4.b f4477b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f4478c;
    public final Object d = new Object();

    /* renamed from: e  reason: collision with root package name */
    public b f4479e;

    /* renamed from: f  reason: collision with root package name */
    public final Context f4480f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f4481g;

    /* renamed from: h  reason: collision with root package name */
    public final long f4482h;

    /* renamed from: e4.a$a  reason: collision with other inner class name */
    public static final class C0054a {

        /* renamed from: a  reason: collision with root package name */
        public final String f4483a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f4484b;

        public C0054a(String str, boolean z) {
            this.f4483a = str;
            this.f4484b = z;
        }

        public final String toString() {
            String str = this.f4483a;
            StringBuilder sb = new StringBuilder(x0.a(str, 7));
            sb.append("{");
            sb.append(str);
            sb.append("}");
            sb.append(this.f4484b);
            return sb.toString();
        }
    }

    public static class b extends Thread {

        /* renamed from: o  reason: collision with root package name */
        public final WeakReference<a> f4485o;

        /* renamed from: p  reason: collision with root package name */
        public final long f4486p;

        /* renamed from: q  reason: collision with root package name */
        public final CountDownLatch f4487q = new CountDownLatch(1);

        /* renamed from: r  reason: collision with root package name */
        public boolean f4488r = false;

        public b(a aVar, long j8) {
            this.f4485o = new WeakReference<>(aVar);
            this.f4486p = j8;
            start();
        }

        public final void run() {
            a aVar;
            WeakReference<a> weakReference = this.f4485o;
            try {
                if (!this.f4487q.await(this.f4486p, TimeUnit.MILLISECONDS) && (aVar = weakReference.get()) != null) {
                    aVar.a();
                    this.f4488r = true;
                }
            } catch (InterruptedException unused) {
                a aVar2 = weakReference.get();
                if (aVar2 != null) {
                    aVar2.a();
                    this.f4488r = true;
                }
            }
        }
    }

    public a(Context context, boolean z, boolean z10) {
        Context applicationContext;
        m.h(context);
        if (z && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.f4480f = context;
        this.f4478c = false;
        this.f4482h = -1;
        this.f4481g = z10;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002a A[Catch:{ all -> 0x0033 }] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x002b A[Catch:{ all -> 0x0033 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0043 A[Catch:{ all -> 0x004c }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0044 A[Catch:{ all -> 0x004c }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x005a A[Catch:{ all -> 0x0062 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x005b A[Catch:{ all -> 0x0062 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static e4.a.C0054a b(android.content.Context r14) {
        /*
            java.lang.String r0 = "Error while reading from SharedPreferences "
            java.lang.String r1 = "GmscoreFlag"
            c1.r r2 = new c1.r
            r2.<init>((android.content.Context) r14)
            java.lang.String r3 = "gads:ad_id_app_context:enabled"
            r4 = 0
            java.lang.Object r5 = r2.f2129o     // Catch:{ all -> 0x001b }
            r6 = r5
            android.content.SharedPreferences r6 = (android.content.SharedPreferences) r6     // Catch:{ all -> 0x001b }
            if (r6 != 0) goto L_0x0014
            goto L_0x001f
        L_0x0014:
            android.content.SharedPreferences r5 = (android.content.SharedPreferences) r5     // Catch:{ all -> 0x001b }
            boolean r3 = r5.getBoolean(r3, r4)     // Catch:{ all -> 0x001b }
            goto L_0x0020
        L_0x001b:
            r3 = move-exception
            android.util.Log.w(r1, r0, r3)
        L_0x001f:
            r3 = r4
        L_0x0020:
            java.lang.String r5 = "gads:ad_id_app_context:ping_ratio"
            r6 = 0
            java.lang.Object r7 = r2.f2129o     // Catch:{ all -> 0x0033 }
            r8 = r7
            android.content.SharedPreferences r8 = (android.content.SharedPreferences) r8     // Catch:{ all -> 0x0033 }
            if (r8 != 0) goto L_0x002b
            goto L_0x0037
        L_0x002b:
            android.content.SharedPreferences r7 = (android.content.SharedPreferences) r7     // Catch:{ all -> 0x0033 }
            float r5 = r7.getFloat(r5, r6)     // Catch:{ all -> 0x0033 }
            r12 = r5
            goto L_0x0038
        L_0x0033:
            r5 = move-exception
            android.util.Log.w(r1, r0, r5)
        L_0x0037:
            r12 = r6
        L_0x0038:
            java.lang.String r5 = "gads:ad_id_use_shared_preference:experiment_id"
            java.lang.String r6 = ""
            java.lang.Object r7 = r2.f2129o     // Catch:{ all -> 0x004c }
            r8 = r7
            android.content.SharedPreferences r8 = (android.content.SharedPreferences) r8     // Catch:{ all -> 0x004c }
            if (r8 != 0) goto L_0x0044
            goto L_0x0050
        L_0x0044:
            android.content.SharedPreferences r7 = (android.content.SharedPreferences) r7     // Catch:{ all -> 0x004c }
            java.lang.String r5 = r7.getString(r5, r6)     // Catch:{ all -> 0x004c }
            r13 = r5
            goto L_0x0051
        L_0x004c:
            r5 = move-exception
            android.util.Log.w(r1, r0, r5)
        L_0x0050:
            r13 = r6
        L_0x0051:
            java.lang.String r5 = "gads:ad_id_use_persistent_service:enabled"
            java.lang.Object r2 = r2.f2129o     // Catch:{ all -> 0x0062 }
            r6 = r2
            android.content.SharedPreferences r6 = (android.content.SharedPreferences) r6     // Catch:{ all -> 0x0062 }
            if (r6 != 0) goto L_0x005b
            goto L_0x0066
        L_0x005b:
            android.content.SharedPreferences r2 = (android.content.SharedPreferences) r2     // Catch:{ all -> 0x0062 }
            boolean r4 = r2.getBoolean(r5, r4)     // Catch:{ all -> 0x0062 }
            goto L_0x0066
        L_0x0062:
            r2 = move-exception
            android.util.Log.w(r1, r0, r2)
        L_0x0066:
            e4.a r0 = new e4.a
            r0.<init>(r14, r3, r4)
            long r1 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0088 }
            r0.f()     // Catch:{ all -> 0x0088 }
            e4.a$a r14 = r0.c()     // Catch:{ all -> 0x0088 }
            long r4 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0088 }
            long r8 = r4 - r1
            r11 = 0
            r5 = r14
            r6 = r3
            r7 = r12
            r10 = r13
            g(r5, r6, r7, r8, r10, r11)     // Catch:{ all -> 0x0088 }
            r0.a()
            return r14
        L_0x0088:
            r14 = move-exception
            r5 = 0
            r8 = -1
            r6 = r3
            r7 = r12
            r10 = r13
            r11 = r14
            g(r5, r6, r7, r8, r10, r11)     // Catch:{ all -> 0x0094 }
            throw r14     // Catch:{ all -> 0x0094 }
        L_0x0094:
            r14 = move-exception
            r0.a()
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: e4.a.b(android.content.Context):e4.a$a");
    }

    public static j4.a d(Context context, boolean z) {
        String str;
        try {
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
            int b10 = f.f6547b.b(context, 12451000);
            if (b10 == 0 || b10 == 2) {
                if (z) {
                    str = "com.google.android.gms.ads.identifier.service.PERSISTENT_START";
                } else {
                    str = "com.google.android.gms.ads.identifier.service.START";
                }
                j4.a aVar = new j4.a();
                Intent intent = new Intent(str);
                intent.setPackage("com.google.android.gms");
                try {
                    if (q4.a.b().a(context, intent, aVar, 1)) {
                        return aVar;
                    }
                    throw new IOException("Connection failure");
                } catch (Throwable th) {
                    throw new IOException(th);
                }
            } else {
                throw new IOException("Google Play services not available");
            }
        } catch (PackageManager.NameNotFoundException unused) {
            throw new s();
        }
    }

    public static y4.b e(j4.a aVar) {
        try {
            IBinder a10 = aVar.a(TimeUnit.MILLISECONDS);
            int i10 = c.f9552a;
            IInterface queryLocalInterface = a10.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
            if (queryLocalInterface instanceof y4.b) {
                return (y4.b) queryLocalInterface;
            }
            return new d(a10);
        } catch (InterruptedException unused) {
            throw new IOException("Interrupted exception");
        } catch (Throwable th) {
            throw new IOException(th);
        }
    }

    public static void g(C0054a aVar, boolean z, float f10, long j8, String str, Throwable th) {
        String str2;
        if (Math.random() <= ((double) f10)) {
            HashMap hashMap = new HashMap();
            String str3 = "1";
            hashMap.put("app_context", z ? str3 : "0");
            if (aVar != null) {
                if (!aVar.f4484b) {
                    str3 = "0";
                }
                hashMap.put("limit_ad_tracking", str3);
            }
            if (!(aVar == null || (str2 = aVar.f4483a) == null)) {
                hashMap.put("ad_id_size", Integer.toString(str2.length()));
            }
            if (th != null) {
                hashMap.put("error", th.getClass().getName());
            }
            if (str != null && !str.isEmpty()) {
                hashMap.put("experiment_id", str);
            }
            hashMap.put("tag", "AdvertisingIdClient");
            hashMap.put("time_spent", Long.toString(j8));
            new b(hashMap).start();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0032, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r3 = this;
            java.lang.String r0 = "Calling this from your main thread can lead to deadlock"
            n4.m.g(r0)
            monitor-enter(r3)
            android.content.Context r0 = r3.f4480f     // Catch:{ all -> 0x0033 }
            if (r0 == 0) goto L_0x0031
            j4.a r0 = r3.f4476a     // Catch:{ all -> 0x0033 }
            if (r0 != 0) goto L_0x000f
            goto L_0x0031
        L_0x000f:
            boolean r0 = r3.f4478c     // Catch:{ all -> 0x001f }
            if (r0 == 0) goto L_0x0027
            q4.a r0 = q4.a.b()     // Catch:{ all -> 0x001f }
            android.content.Context r1 = r3.f4480f     // Catch:{ all -> 0x001f }
            j4.a r2 = r3.f4476a     // Catch:{ all -> 0x001f }
            r0.c(r1, r2)     // Catch:{ all -> 0x001f }
            goto L_0x0027
        L_0x001f:
            r0 = move-exception
            java.lang.String r1 = "AdvertisingIdClient"
            java.lang.String r2 = "AdvertisingIdClient unbindService failed."
            android.util.Log.i(r1, r2, r0)     // Catch:{ all -> 0x0033 }
        L_0x0027:
            r0 = 0
            r3.f4478c = r0     // Catch:{ all -> 0x0033 }
            r0 = 0
            r3.f4477b = r0     // Catch:{ all -> 0x0033 }
            r3.f4476a = r0     // Catch:{ all -> 0x0033 }
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            return
        L_0x0031:
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            return
        L_0x0033:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e4.a.a():void");
    }

    public final C0054a c() {
        C0054a aVar;
        m.g("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (!this.f4478c) {
                synchronized (this.d) {
                    b bVar = this.f4479e;
                    if (bVar == null || !bVar.f4488r) {
                        throw new IOException("AdvertisingIdClient is not connected.");
                    }
                }
                try {
                    f();
                    if (!this.f4478c) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.");
                    }
                } catch (RemoteException e10) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", e10);
                    throw new IOException("Remote exception");
                } catch (Exception e11) {
                    throw new IOException("AdvertisingIdClient cannot reconnect.", e11);
                }
            }
            m.h(this.f4476a);
            m.h(this.f4477b);
            aVar = new C0054a(this.f4477b.getId(), this.f4477b.a());
        }
        h();
        return aVar;
    }

    public final void f() {
        m.g("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.f4478c) {
                a();
            }
            j4.a d10 = d(this.f4480f, this.f4481g);
            this.f4476a = d10;
            this.f4477b = e(d10);
            this.f4478c = true;
        }
    }

    public final void finalize() {
        a();
        super.finalize();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:2|3|(3:5|6|7)|8|9|(1:11)|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0011 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0019  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.d
            monitor-enter(r0)
            e4.a$b r1 = r5.f4479e     // Catch:{ all -> 0x0024 }
            if (r1 == 0) goto L_0x0011
            java.util.concurrent.CountDownLatch r1 = r1.f4487q     // Catch:{ all -> 0x0024 }
            r1.countDown()     // Catch:{ all -> 0x0024 }
            e4.a$b r1 = r5.f4479e     // Catch:{ InterruptedException -> 0x0011 }
            r1.join()     // Catch:{ InterruptedException -> 0x0011 }
        L_0x0011:
            long r1 = r5.f4482h     // Catch:{ all -> 0x0024 }
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto L_0x0022
            e4.a$b r1 = new e4.a$b     // Catch:{ all -> 0x0024 }
            long r2 = r5.f4482h     // Catch:{ all -> 0x0024 }
            r1.<init>(r5, r2)     // Catch:{ all -> 0x0024 }
            r5.f4479e = r1     // Catch:{ all -> 0x0024 }
        L_0x0022:
            monitor-exit(r0)     // Catch:{ all -> 0x0024 }
            return
        L_0x0024:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0024 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: e4.a.h():void");
    }
}
