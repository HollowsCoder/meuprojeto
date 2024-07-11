package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.PowerManager;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.internal.measurement.w0;
import h5.g3;
import h5.h6;
import h5.i4;
import h5.i6;
import h5.j6;
import h5.p4;
import h5.z6;
import i4.o;
import v0.a;

public final class AppMeasurementService extends Service implements i6 {

    /* renamed from: o  reason: collision with root package name */
    public j6 f3202o;

    public final void a(Intent intent) {
        SparseArray<PowerManager.WakeLock> sparseArray = a.f9116a;
        int intExtra = intent.getIntExtra("androidx.contentpager.content.wakelockid", 0);
        if (intExtra != 0) {
            SparseArray<PowerManager.WakeLock> sparseArray2 = a.f9116a;
            synchronized (sparseArray2) {
                PowerManager.WakeLock wakeLock = sparseArray2.get(intExtra);
                if (wakeLock != null) {
                    wakeLock.release();
                    sparseArray2.remove(intExtra);
                } else {
                    Log.w("WakefulBroadcastReceiv.", "No active wake lock id #" + intExtra);
                }
            }
        }
    }

    public final void b(JobParameters jobParameters) {
        throw new UnsupportedOperationException();
    }

    public final j6 c() {
        if (this.f3202o == null) {
            this.f3202o = new j6((Context) this);
        }
        return this.f3202o;
    }

    public final boolean d(int i10) {
        return stopSelfResult(i10);
    }

    public final IBinder onBind(Intent intent) {
        j6 c10 = c();
        if (intent == null) {
            c10.g().f5397t.a("onBind called with null intent");
        } else {
            c10.getClass();
            String action = intent.getAction();
            if ("com.google.android.gms.measurement.START".equals(action)) {
                return new p4(z6.t((Context) c10.f5493o));
            }
            c10.g().w.b(action, "onBind received unknown action");
        }
        return null;
    }

    public final void onCreate() {
        super.onCreate();
        c().c();
    }

    public final void onDestroy() {
        c().d();
        super.onDestroy();
    }

    public final void onRebind(Intent intent) {
        c().f(intent);
    }

    public final int onStartCommand(Intent intent, int i10, int i11) {
        j6 c10 = c();
        g3 g3Var = i4.h((Context) c10.f5493o, (w0) null, (Long) null).w;
        i4.n(g3Var);
        if (intent == null) {
            g3Var.w.a("AppMeasurementService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        g3Var.B.c(Integer.valueOf(i11), action, "Local AppMeasurementService called. startId, action");
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            return 2;
        }
        h6 h6Var = new h6(c10, i11, g3Var, intent);
        z6 t10 = z6.t((Context) c10.f5493o);
        t10.f().n(new o(t10, h6Var));
        return 2;
    }

    public final boolean onUnbind(Intent intent) {
        c().e(intent);
        return true;
    }
}
