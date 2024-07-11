package b8;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import m5.j;

public final class g0 implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    public final Context f2015a;

    /* renamed from: b  reason: collision with root package name */
    public final Intent f2016b;

    /* renamed from: c  reason: collision with root package name */
    public final ScheduledExecutorService f2017c;
    public final ArrayDeque d = new ArrayDeque();

    /* renamed from: e  reason: collision with root package name */
    public f0 f2018e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f2019f = false;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final Intent f2020a;

        /* renamed from: b  reason: collision with root package name */
        public final j<Void> f2021b = new j<>();

        public a(Intent intent) {
            this.f2020a = intent;
        }
    }

    public g0(Context context) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(0, new s4.a("Firebase-FirebaseInstanceIdServiceConnection"));
        Context applicationContext = context.getApplicationContext();
        this.f2015a = applicationContext;
        this.f2016b = new Intent("com.google.firebase.MESSAGING_EVENT").setPackage(applicationContext.getPackageName());
        this.f2017c = scheduledThreadPoolExecutor;
    }

    public final synchronized void a() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "flush queue called");
        }
        while (!this.d.isEmpty()) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "found intent to be delivered");
            }
            f0 f0Var = this.f2018e;
            if (f0Var == null || !f0Var.isBinderAlive()) {
                b();
                return;
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "binder is alive, sending the intent.");
            }
            this.f2018e.a((a) this.d.poll());
        }
    }

    public final void b() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            boolean z = this.f2019f;
            StringBuilder sb = new StringBuilder(39);
            sb.append("binder is dead. start connection? ");
            sb.append(!z);
            Log.d("FirebaseMessaging", sb.toString());
        }
        if (!this.f2019f) {
            this.f2019f = true;
            try {
                if (!q4.a.b().a(this.f2015a, this.f2016b, this, 65)) {
                    Log.e("FirebaseMessaging", "binding to the service failed");
                    this.f2019f = false;
                    while (true) {
                        ArrayDeque arrayDeque = this.d;
                        if (!arrayDeque.isEmpty()) {
                            ((a) arrayDeque.poll()).f2021b.c((Object) null);
                        } else {
                            return;
                        }
                    }
                }
            } catch (SecurityException e10) {
                Log.e("FirebaseMessaging", "Exception while binding the service", e10);
            }
        }
    }

    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceConnected: ".concat(String.valueOf(componentName)));
        }
        this.f2019f = false;
        if (!(iBinder instanceof f0)) {
            Log.e("FirebaseMessaging", "Invalid service connection: ".concat(String.valueOf(iBinder)));
            while (true) {
                ArrayDeque arrayDeque = this.d;
                if (!arrayDeque.isEmpty()) {
                    ((a) arrayDeque.poll()).f2021b.c((Object) null);
                } else {
                    return;
                }
            }
        } else {
            this.f2018e = (f0) iBinder;
            a();
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceDisconnected: ".concat(String.valueOf(componentName)));
        }
        a();
    }
}
