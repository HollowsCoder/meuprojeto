package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.fragment.app.f0;
import b8.a0;
import b8.b0;
import b8.i;
import b8.j;
import b8.k;
import b8.m;
import b8.p;
import b8.t;
import b8.x;
import c1.r;
import com.google.firebase.messaging.a;
import com.karumi.dexter.BuildConfig;
import com.karumi.dexter.R;
import i4.l;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import q3.g;
import s6.c;
import s7.d;
import v7.b;
import w7.e;

public class FirebaseMessaging {

    /* renamed from: j  reason: collision with root package name */
    public static final long f3703j = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: k  reason: collision with root package name */
    public static a f3704k;
    @SuppressLint({"FirebaseUnknownNullness"})
    public static g l;

    /* renamed from: m  reason: collision with root package name */
    public static ScheduledThreadPoolExecutor f3705m;

    /* renamed from: a  reason: collision with root package name */
    public final c f3706a;

    /* renamed from: b  reason: collision with root package name */
    public final u7.a f3707b;

    /* renamed from: c  reason: collision with root package name */
    public final e f3708c;
    public final Context d;

    /* renamed from: e  reason: collision with root package name */
    public final m f3709e;

    /* renamed from: f  reason: collision with root package name */
    public final t f3710f;

    /* renamed from: g  reason: collision with root package name */
    public final a f3711g;

    /* renamed from: h  reason: collision with root package name */
    public final p f3712h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f3713i;

    public class a {

        /* renamed from: a  reason: collision with root package name */
        public final d f3714a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f3715b;

        /* renamed from: c  reason: collision with root package name */
        public k f3716c;
        public Boolean d;

        public a(d dVar) {
            this.f3714a = dVar;
        }

        public final synchronized void a() {
            if (!this.f3715b) {
                Boolean b10 = b();
                this.d = b10;
                if (b10 == null) {
                    k kVar = new k(this);
                    this.f3716c = kVar;
                    this.f3714a.c(kVar);
                }
                this.f3715b = true;
            }
        }

        public final Boolean b() {
            ApplicationInfo applicationInfo;
            Bundle bundle;
            c cVar = FirebaseMessaging.this.f3706a;
            cVar.a();
            Context context = cVar.f8815a;
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("auto_init")) {
                return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
            }
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                    return null;
                }
                return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }
    }

    public FirebaseMessaging() {
        throw null;
    }

    public FirebaseMessaging(c cVar, u7.a aVar, b<d8.g> bVar, b<t7.d> bVar2, e eVar, g gVar, d dVar) {
        c cVar2 = cVar;
        u7.a aVar2 = aVar;
        cVar.a();
        Context context = cVar2.f8815a;
        p pVar = new p(context);
        m mVar = new m(cVar, pVar, bVar, bVar2, eVar);
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new s4.a("Firebase-Messaging-Task"));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new s4.a("Firebase-Messaging-Init"));
        this.f3713i = false;
        l = gVar;
        this.f3706a = cVar2;
        this.f3707b = aVar2;
        this.f3708c = eVar;
        this.f3711g = new a(dVar);
        cVar.a();
        Context context2 = cVar2.f8815a;
        this.d = context2;
        i iVar = new i();
        this.f3712h = pVar;
        this.f3709e = mVar;
        this.f3710f = new t(newSingleThreadExecutor);
        cVar.a();
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(iVar);
        } else {
            String valueOf = String.valueOf(context);
            StringBuilder sb = new StringBuilder(valueOf.length() + R.styleable.AppCompatTheme_windowMinWidthMinor);
            sb.append("Context ");
            sb.append(valueOf);
            sb.append(" was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
            Log.w("FirebaseMessaging", sb.toString());
        }
        if (aVar2 != null) {
            aVar.c();
        }
        scheduledThreadPoolExecutor.execute(new l(5, this));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = new ScheduledThreadPoolExecutor(1, new s4.a("Firebase-Messaging-Topics-Io"));
        int i10 = b0.f1979j;
        m5.l.c(scheduledThreadPoolExecutor2, new a0(context2, this, mVar, pVar, scheduledThreadPoolExecutor2)).d(scheduledThreadPoolExecutor, new r(7, this));
        scheduledThreadPoolExecutor.execute(new i4.m(1, this));
    }

    public static void b(x xVar, long j8) {
        synchronized (FirebaseMessaging.class) {
            if (f3705m == null) {
                f3705m = new ScheduledThreadPoolExecutor(1, new s4.a("TAG"));
            }
            f3705m.schedule(xVar, j8, TimeUnit.SECONDS);
        }
    }

    @Keep
    public static synchronized FirebaseMessaging getInstance(c cVar) {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            Class<FirebaseMessaging> cls = FirebaseMessaging.class;
            cVar.a();
            firebaseMessaging = (FirebaseMessaging) cVar.d.a(cls);
            n4.m.i(firebaseMessaging, "Firebase Messaging component is not present");
        }
        return firebaseMessaging;
    }

    public final String a() {
        m5.i<TContinuationResult> iVar;
        String str;
        String str2;
        u7.a aVar = this.f3707b;
        if (aVar != null) {
            try {
                return (String) m5.l.a(aVar.b());
            } catch (InterruptedException | ExecutionException e10) {
                throw new IOException(e10);
            }
        } else {
            a.C0042a c10 = c();
            if (!f(c10)) {
                return c10.f3720a;
            }
            String a10 = p.a(this.f3706a);
            t tVar = this.f3710f;
            synchronized (tVar) {
                iVar = (m5.i) tVar.f2046b.getOrDefault(a10, null);
                if (iVar == null) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        String valueOf = String.valueOf(a10);
                        if (valueOf.length() != 0) {
                            str = "Making new request for: ".concat(valueOf);
                        } else {
                            str = new String("Making new request for: ");
                        }
                        Log.d("FirebaseMessaging", str);
                    }
                    m mVar = this.f3709e;
                    iVar = mVar.a(mVar.c(p.a(mVar.f2029a), "*", new Bundle())).n(j.f2026o, new f0(this, a10, c10, 7)).g(tVar.f2045a, new androidx.appcompat.widget.m(11, tVar, a10));
                    tVar.f2046b.put(a10, iVar);
                } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                    String valueOf2 = String.valueOf(a10);
                    if (valueOf2.length() != 0) {
                        str2 = "Joining ongoing request for: ".concat(valueOf2);
                    } else {
                        str2 = new String("Joining ongoing request for: ");
                    }
                    Log.d("FirebaseMessaging", str2);
                }
            }
            try {
                return (String) m5.l.a(iVar);
            } catch (InterruptedException | ExecutionException e11) {
                throw new IOException(e11);
            }
        }
    }

    public final a.C0042a c() {
        a aVar;
        String str;
        a.C0042a b10;
        Context context = this.d;
        synchronized (FirebaseMessaging.class) {
            if (f3704k == null) {
                f3704k = new a(context);
            }
            aVar = f3704k;
        }
        c cVar = this.f3706a;
        cVar.a();
        if ("[DEFAULT]".equals(cVar.f8816b)) {
            str = BuildConfig.FLAVOR;
        } else {
            str = cVar.c();
        }
        String a10 = p.a(this.f3706a);
        synchronized (aVar) {
            b10 = a.C0042a.b(aVar.f3719a.getString(a.a(str, a10), (String) null));
        }
        return b10;
    }

    public final void d() {
        u7.a aVar = this.f3707b;
        if (aVar != null) {
            aVar.a();
        } else if (f(c())) {
            synchronized (this) {
                if (!this.f3713i) {
                    e(0);
                }
            }
        }
    }

    public final synchronized void e(long j8) {
        b(new x(this, Math.min(Math.max(30, j8 + j8), f3703j)), j8);
        this.f3713i = true;
    }

    public final boolean f(a.C0042a aVar) {
        String str;
        boolean z;
        if (aVar != null) {
            p pVar = this.f3712h;
            synchronized (pVar) {
                if (pVar.f2038b == null) {
                    pVar.d();
                }
                str = pVar.f2038b;
            }
            if (System.currentTimeMillis() > aVar.f3722c + a.C0042a.d || !str.equals(aVar.f3721b)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return true;
            }
            return false;
        }
        return true;
    }
}
