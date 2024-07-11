package com.google.android.gms.internal.measurement;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import g5.a;
import h5.d4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import n4.m;

public final class u1 {

    /* renamed from: g  reason: collision with root package name */
    public static volatile u1 f2944g;

    /* renamed from: a  reason: collision with root package name */
    public final ExecutorService f2945a;

    /* renamed from: b  reason: collision with root package name */
    public final a f2946b = new a(this);

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f2947c = new ArrayList();
    public int d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f2948e;

    /* renamed from: f  reason: collision with root package name */
    public volatile n0 f2949f;

    public u1(Context context, Bundle bundle) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new j1());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f2945a = Executors.unconfigurableExecutorService(threadPoolExecutor);
        try {
            s6.a.X(context, d4.a(context));
        } catch (IllegalStateException unused) {
        }
        c(new c1(this, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            Log.w("FA", "Unable to register lifecycle notifications. Application null.");
        } else {
            application.registerActivityLifecycleCallbacks(new t1(this));
        }
    }

    public static u1 e(Context context, Bundle bundle) {
        m.h(context);
        if (f2944g == null) {
            synchronized (u1.class) {
                if (f2944g == null) {
                    f2944g = new u1(context, bundle);
                }
            }
        }
        return f2944g;
    }

    public final Map<String, Object> a(String str, String str2, boolean z) {
        j0 j0Var = new j0();
        c(new h1(this, str, str2, z, j0Var));
        Bundle K = j0Var.K(5000);
        if (K == null || K.size() == 0) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap(K.size());
        for (String next : K.keySet()) {
            Object obj = K.get(next);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                hashMap.put(next, obj);
            }
        }
        return hashMap;
    }

    public final int b(String str) {
        j0 j0Var = new j0();
        c(new k1(this, str, j0Var));
        Integer num = (Integer) j0.L(j0Var.K(10000), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    public final void c(n1 n1Var) {
        this.f2945a.execute(n1Var);
    }

    public final void d(Exception exc, boolean z, boolean z10) {
        this.f2948e |= z;
        if (z) {
            Log.w("FA", "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z10) {
            c(new i1(this, exc));
        }
        Log.w("FA", "Error with data collection. Data lost.", exc);
    }

    public final List<Bundle> f(String str, String str2) {
        j0 j0Var = new j0();
        c(new a1(this, str, str2, j0Var));
        List<Bundle> list = (List) j0.L(j0Var.K(5000), List.class);
        return list == null ? Collections.emptyList() : list;
    }
}
