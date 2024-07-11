package com.google.android.gms.internal.measurement;

public final class cb implements bb {

    /* renamed from: a  reason: collision with root package name */
    public static final i4 f2659a;

    /* renamed from: b  reason: collision with root package name */
    public static final i4 f2660b;

    static {
        k4 k4Var = new k4(g4.a());
        f2659a = k4Var.b("measurement.sdk.screen.manual_screen_view_logging", true);
        f2660b = k4Var.b("measurement.sdk.screen.disabling_automatic_reporting", true);
    }

    public final boolean a() {
        return ((Boolean) f2659a.b()).booleanValue();
    }

    public final void zza() {
    }

    public final boolean zzc() {
        return ((Boolean) f2660b.b()).booleanValue();
    }
}
