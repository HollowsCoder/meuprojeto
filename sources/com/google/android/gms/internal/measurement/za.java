package com.google.android.gms.internal.measurement;

public final class za implements ya {

    /* renamed from: a  reason: collision with root package name */
    public static final i4 f3030a;

    /* renamed from: b  reason: collision with root package name */
    public static final i4 f3031b;

    static {
        k4 k4Var = new k4(g4.a());
        k4Var.a("measurement.id.lifecycle.app_in_background_parameter", 0);
        f3030a = k4Var.b("measurement.lifecycle.app_backgrounded_engagement", false);
        k4Var.b("measurement.lifecycle.app_backgrounded_tracking", true);
        f3031b = k4Var.b("measurement.lifecycle.app_in_background_parameter", false);
        k4Var.a("measurement.id.lifecycle.app_backgrounded_tracking", 0);
    }

    public final boolean a() {
        return ((Boolean) f3031b.b()).booleanValue();
    }

    public final boolean zza() {
        return ((Boolean) f3030a.b()).booleanValue();
    }
}
