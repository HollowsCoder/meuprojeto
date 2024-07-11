package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

public final class t1 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ u1 f2933o;

    public t1(u1 u1Var) {
        this.f2933o = u1Var;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        this.f2933o.c(new k1(this, bundle, activity));
    }

    public final void onActivityDestroyed(Activity activity) {
        this.f2933o.c(new q1(this, activity, 1));
    }

    public final void onActivityPaused(Activity activity) {
        this.f2933o.c(new q1(this, activity, 0));
    }

    public final void onActivityResumed(Activity activity) {
        this.f2933o.c(new d1(this, activity));
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        j0 j0Var = new j0();
        this.f2933o.c(new s1(this, activity, j0Var));
        Bundle K = j0Var.K(50);
        if (K != null) {
            bundle.putAll(K);
        }
    }

    public final void onActivityStarted(Activity activity) {
        this.f2933o.c(new p1(this, activity, 0));
    }

    public final void onActivityStopped(Activity activity) {
        this.f2933o.c(new p1(this, activity, 1));
    }
}
