package b8;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import b8.f0;
import h5.j4;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import m5.j;
import m5.r;
import s2.t;

@SuppressLint({"UnwrappedWakefulBroadcastReceiver"})
public abstract class e extends Service {

    /* renamed from: o  reason: collision with root package name */
    public final ExecutorService f2003o;

    /* renamed from: p  reason: collision with root package name */
    public f0 f2004p;

    /* renamed from: q  reason: collision with root package name */
    public final Object f2005q = new Object();

    /* renamed from: r  reason: collision with root package name */
    public int f2006r;

    /* renamed from: s  reason: collision with root package name */
    public int f2007s = 0;

    public class a implements f0.a {
        public a() {
        }
    }

    public e() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new s4.a("Firebase-Messaging-Intent-Handle"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f2003o = Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    public final void a(Intent intent) {
        if (intent != null) {
            synchronized (d0.f2001b) {
                if (d0.f2002c != null && intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false)) {
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    d0.f2002c.b();
                }
            }
        }
        synchronized (this.f2005q) {
            try {
                int i10 = this.f2007s - 1;
                this.f2007s = i10;
                if (i10 == 0) {
                    stopSelfResult(this.f2006r);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Intent b(Intent intent) {
        return intent;
    }

    public abstract void c(Intent intent);

    public final synchronized IBinder onBind(Intent intent) {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            Log.d("EnhancedIntentService", "Service received bind request");
        }
        if (this.f2004p == null) {
            this.f2004p = new f0(new a());
        }
        return this.f2004p;
    }

    public final void onDestroy() {
        this.f2003o.shutdown();
        super.onDestroy();
    }

    public final int onStartCommand(Intent intent, int i10, int i11) {
        synchronized (this.f2005q) {
            this.f2006r = i11;
            this.f2007s++;
        }
        Intent b10 = b(intent);
        if (b10 == null) {
            a(intent);
            return 2;
        }
        j jVar = new j();
        this.f2003o.execute(new j4(this, b10, jVar, 3));
        r<TResult> rVar = jVar.f7089a;
        if (rVar.l()) {
            a(intent);
            return 2;
        }
        rVar.p(d.f1999o, new t((Object) this, (Object) intent));
        return 3;
    }
}
