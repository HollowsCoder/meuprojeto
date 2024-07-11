package b8;

import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import androidx.databinding.a;
import b8.g0;
import i4.m;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import m5.i;
import m5.l;
import m5.r;
import q1.d;
import r4.g;

public final class h {

    /* renamed from: b  reason: collision with root package name */
    public static final Object f2022b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public static g0 f2023c;

    /* renamed from: a  reason: collision with root package name */
    public final Context f2024a;

    public h(Context context) {
        this.f2024a = context;
    }

    public static i<Integer> a(Context context, Intent intent) {
        g0 g0Var;
        r<TResult> rVar;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        synchronized (f2022b) {
            if (f2023c == null) {
                f2023c = new g0(context);
            }
            g0Var = f2023c;
        }
        synchronized (g0Var) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
            }
            g0.a aVar = new g0.a(intent);
            ScheduledExecutorService scheduledExecutorService = g0Var.f2017c;
            aVar.f2021b.f7089a.p(scheduledExecutorService, new d(8, scheduledExecutorService.schedule(new m(2, aVar), 9000, TimeUnit.MILLISECONDS)));
            g0Var.d.add(aVar);
            g0Var.a();
            rVar = aVar.f2021b.f7089a;
        }
        return rVar.e(g.f2014o, a.f1018r);
    }

    public final i<Integer> b(Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        boolean z = false;
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        boolean a10 = g.a();
        Context context = this.f2024a;
        if (a10 && context.getApplicationInfo().targetSdkVersion >= 26) {
            z = true;
        }
        int flags = intent.getFlags() & 268435456;
        if (z && flags == 0) {
            return a(context, intent);
        }
        g gVar = g.f2014o;
        return l.c(gVar, new f(context, intent)).g(gVar, new m1.i(7, context, intent));
    }
}
