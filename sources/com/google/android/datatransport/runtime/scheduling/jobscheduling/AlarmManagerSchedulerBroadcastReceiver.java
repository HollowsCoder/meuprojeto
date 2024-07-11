package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import d4.a;
import t3.j;
import t3.s;
import t3.x;
import z3.f;
import z3.m;

public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f2305a = 0;

    public final void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int intValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i10 = intent.getExtras().getInt("attemptNumber");
        x.b(context);
        j.a a10 = s.a();
        a10.b(queryParameter);
        a10.c(a.b(intValue));
        if (queryParameter2 != null) {
            a10.f8962b = Base64.decode(queryParameter2, 0);
        }
        m mVar = x.a().d;
        j a11 = a10.a();
        z3.a aVar = new z3.a();
        mVar.getClass();
        mVar.f9909e.execute(new f(mVar, a11, i10, aVar));
    }
}
