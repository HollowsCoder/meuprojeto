package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import d4.a;
import e2.b;
import t3.j;
import t3.s;
import t3.x;
import z3.f;
import z3.m;

public class JobInfoSchedulerService extends JobService {

    /* renamed from: o  reason: collision with root package name */
    public static final /* synthetic */ int f2306o = 0;

    public final boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i10 = jobParameters.getExtras().getInt("priority");
        int i11 = jobParameters.getExtras().getInt("attemptNumber");
        x.b(getApplicationContext());
        j.a a10 = s.a();
        a10.b(string);
        a10.c(a.b(i10));
        if (string2 != null) {
            a10.f8962b = Base64.decode(string2, 0);
        }
        m mVar = x.a().d;
        j a11 = a10.a();
        b bVar = new b(1, this, jobParameters);
        mVar.getClass();
        mVar.f9909e.execute(new f(mVar, a11, i11, bVar));
        return true;
    }

    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
