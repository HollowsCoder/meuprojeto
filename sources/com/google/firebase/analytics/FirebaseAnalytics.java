package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.internal.measurement.b1;
import com.google.android.gms.internal.measurement.u1;
import h5.j5;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import m5.l;
import n4.m;
import s6.c;
import v6.a;
import w7.d;
import w7.e;

public final class FirebaseAnalytics {

    /* renamed from: b  reason: collision with root package name */
    public static volatile FirebaseAnalytics f3701b;

    /* renamed from: a  reason: collision with root package name */
    public final u1 f3702a;

    public FirebaseAnalytics(u1 u1Var) {
        m.h(u1Var);
        this.f3702a = u1Var;
    }

    @Keep
    public static FirebaseAnalytics getInstance(Context context) {
        if (f3701b == null) {
            synchronized (FirebaseAnalytics.class) {
                if (f3701b == null) {
                    f3701b = new FirebaseAnalytics(u1.e(context, (Bundle) null));
                }
            }
        }
        return f3701b;
    }

    @Keep
    public static j5 getScionFrontendApiImplementation(Context context, Bundle bundle) {
        u1 e10 = u1.e(context, bundle);
        if (e10 == null) {
            return null;
        }
        return new a(e10);
    }

    @Keep
    public String getFirebaseInstanceId() {
        try {
            Object obj = d.f9271m;
            c b10 = c.b();
            b10.a();
            return (String) l.b(((d) b10.d.a(e.class)).getId(), 30000, TimeUnit.MILLISECONDS);
        } catch (ExecutionException e10) {
            throw new IllegalStateException(e10.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        } catch (InterruptedException e11) {
            throw new IllegalStateException(e11);
        }
    }

    @Deprecated
    @Keep
    public void setCurrentScreen(Activity activity, String str, String str2) {
        u1 u1Var = this.f3702a;
        u1Var.getClass();
        u1Var.c(new b1(u1Var, activity, str, str2));
    }
}
