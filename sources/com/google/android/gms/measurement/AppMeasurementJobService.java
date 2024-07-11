package com.google.android.gms.measurement;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.internal.measurement.w0;
import h5.g3;
import h5.i4;
import h5.i6;
import h5.j6;
import h5.z6;
import i4.o;
import l4.g0;

@TargetApi(24)
public final class AppMeasurementJobService extends JobService implements i6 {

    /* renamed from: o  reason: collision with root package name */
    public j6 f3200o;

    public final void a(Intent intent) {
    }

    @TargetApi(24)
    public final void b(JobParameters jobParameters) {
        jobFinished(jobParameters, false);
    }

    public final j6 c() {
        if (this.f3200o == null) {
            this.f3200o = new j6((Context) this);
        }
        return this.f3200o;
    }

    public final boolean d(int i10) {
        throw new UnsupportedOperationException();
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

    public final boolean onStartJob(JobParameters jobParameters) {
        j6 c10 = c();
        g3 g3Var = i4.h((Context) c10.f5493o, (w0) null, (Long) null).w;
        i4.n(g3Var);
        String string = jobParameters.getExtras().getString("action");
        g3Var.B.b(string, "Local AppMeasurementJobService called. action");
        if (!"com.google.android.gms.measurement.UPLOAD".equals(string)) {
            return true;
        }
        g0 g0Var = new g0(c10, g3Var, jobParameters);
        z6 t10 = z6.t((Context) c10.f5493o);
        t10.f().n(new o(t10, g0Var));
        return true;
    }

    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    public final boolean onUnbind(Intent intent) {
        c().e(intent);
        return true;
    }
}
