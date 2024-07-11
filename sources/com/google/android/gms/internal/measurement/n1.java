package com.google.android.gms.internal.measurement;

import android.os.SystemClock;

public abstract class n1 implements Runnable {

    /* renamed from: o  reason: collision with root package name */
    public final long f2839o = System.currentTimeMillis();

    /* renamed from: p  reason: collision with root package name */
    public final long f2840p = SystemClock.elapsedRealtime();

    /* renamed from: q  reason: collision with root package name */
    public final boolean f2841q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ u1 f2842r;

    public n1(u1 u1Var, boolean z) {
        this.f2842r = u1Var;
        u1Var.getClass();
        this.f2841q = z;
    }

    public abstract void a();

    public void b() {
    }

    public final void run() {
        u1 u1Var = this.f2842r;
        if (u1Var.f2948e) {
            b();
            return;
        }
        try {
            a();
        } catch (Exception e10) {
            u1Var.d(e10, false, this.f2841q);
            b();
        }
    }
}
