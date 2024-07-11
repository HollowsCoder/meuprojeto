package h5;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;

@TargetApi(14)
public final class h5 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ i5 f5436o;

    public /* synthetic */ h5(i5 i5Var) {
        this.f5436o = i5Var;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        u5 u5Var;
        boolean z;
        String str;
        i5 i5Var = this.f5436o;
        try {
            g3 g3Var = i5Var.f5649o.w;
            i4.n(g3Var);
            g3Var.B.a("onActivityCreated");
            Intent intent = activity.getIntent();
            i4 i4Var = i5Var.f5649o;
            if (intent != null) {
                Uri data = intent.getData();
                if (data != null) {
                    if (data.isHierarchical()) {
                        i4.l(i4Var.z);
                        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
                        boolean z10 = true;
                        if ("android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "https://www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra)) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (true != z) {
                            str = "auto";
                        } else {
                            str = "gs";
                        }
                        String str2 = str;
                        String queryParameter = data.getQueryParameter("referrer");
                        if (bundle != null) {
                            z10 = false;
                        }
                        h4 h4Var = i4Var.f5459x;
                        i4.n(h4Var);
                        h4Var.n(new g5(this, z10, data, str2, queryParameter));
                    }
                }
            }
            u5Var = i4Var.C;
        } catch (RuntimeException e10) {
            g3 g3Var2 = i5Var.f5649o.w;
            i4.n(g3Var2);
            g3Var2.f5397t.b(e10, "Throwable caught in onActivityCreated");
            u5Var = i5Var.f5649o.C;
        } catch (Throwable th) {
            u5 u5Var2 = i5Var.f5649o.C;
            i4.m(u5Var2);
            u5Var2.r(activity, bundle);
            throw th;
        }
        i4.m(u5Var);
        u5Var.r(activity, bundle);
    }

    public final void onActivityDestroyed(Activity activity) {
        u5 u5Var = this.f5436o.f5649o.C;
        i4.m(u5Var);
        synchronized (u5Var.z) {
            if (activity == u5Var.u) {
                u5Var.u = null;
            }
        }
        if (u5Var.f5649o.u.q()) {
            u5Var.f5770t.remove(activity);
        }
    }

    public final void onActivityPaused(Activity activity) {
        u5 u5Var = this.f5436o.f5649o.C;
        i4.m(u5Var);
        if (u5Var.f5649o.u.m((String) null, u2.f5738q0)) {
            synchronized (u5Var.z) {
                u5Var.f5773y = false;
                u5Var.f5771v = true;
            }
        }
        u5Var.f5649o.B.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!u5Var.f5649o.u.m((String) null, u2.f5736p0) || u5Var.f5649o.u.q()) {
            p5 n10 = u5Var.n(activity);
            u5Var.f5768r = u5Var.f5767q;
            u5Var.f5767q = null;
            h4 h4Var = u5Var.f5649o.f5459x;
            i4.n(h4Var);
            h4Var.n(new t5(u5Var, n10, elapsedRealtime));
        } else {
            u5Var.f5767q = null;
            h4 h4Var2 = u5Var.f5649o.f5459x;
            i4.n(h4Var2);
            h4Var2.n(new s5(u5Var, elapsedRealtime, 0));
        }
        q6 q6Var = this.f5436o.f5649o.f5460y;
        i4.m(q6Var);
        q6Var.f5649o.B.getClass();
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        h4 h4Var3 = q6Var.f5649o.f5459x;
        i4.n(h4Var3);
        h4Var3.n(new s5(q6Var, elapsedRealtime2, 1));
    }

    public final void onActivityResumed(Activity activity) {
        q6 q6Var = this.f5436o.f5649o.f5460y;
        i4.m(q6Var);
        q6Var.f5649o.B.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        h4 h4Var = q6Var.f5649o.f5459x;
        i4.n(h4Var);
        h4Var.n(new k6(q6Var, elapsedRealtime));
        u5 u5Var = this.f5436o.f5649o.C;
        i4.m(u5Var);
        if (u5Var.f5649o.u.m((String) null, u2.f5738q0)) {
            synchronized (u5Var.z) {
                u5Var.f5773y = true;
                if (activity != u5Var.u) {
                    synchronized (u5Var.z) {
                        u5Var.u = activity;
                        u5Var.f5771v = false;
                    }
                    if (u5Var.f5649o.u.m((String) null, u2.f5736p0) && u5Var.f5649o.u.q()) {
                        u5Var.w = null;
                        h4 h4Var2 = u5Var.f5649o.f5459x;
                        i4.n(h4Var2);
                        h4Var2.n(new r5(1, u5Var));
                    }
                }
            }
        }
        if (!u5Var.f5649o.u.m((String) null, u2.f5736p0) || u5Var.f5649o.u.q()) {
            u5Var.k(activity, u5Var.n(activity), false);
            u1 g10 = u5Var.f5649o.g();
            g10.f5649o.B.getClass();
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            h4 h4Var3 = g10.f5649o.f5459x;
            i4.n(h4Var3);
            h4Var3.n(new y4(g10, elapsedRealtime2, 2));
            return;
        }
        u5Var.f5767q = u5Var.w;
        h4 h4Var4 = u5Var.f5649o.f5459x;
        i4.n(h4Var4);
        h4Var4.n(new r5(0, u5Var));
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        p5 p5Var;
        u5 u5Var = this.f5436o.f5649o.C;
        i4.m(u5Var);
        if (u5Var.f5649o.u.q() && bundle != null && (p5Var = (p5) u5Var.f5770t.get(activity)) != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("id", p5Var.f5636c);
            bundle2.putString("name", p5Var.f5634a);
            bundle2.putString("referrer_name", p5Var.f5635b);
            bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
        }
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }
}
