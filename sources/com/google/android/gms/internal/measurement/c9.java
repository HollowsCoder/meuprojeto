package com.google.android.gms.internal.measurement;

public final class c9 implements b9 {

    /* renamed from: a  reason: collision with root package name */
    public static final i4 f2657a;

    /* renamed from: b  reason: collision with root package name */
    public static final i4 f2658b;

    static {
        k4 k4Var = new k4(g4.a());
        f2657a = k4Var.b("measurement.frontend.directly_maybe_log_error_events", false);
        f2658b = k4Var.b("measurement.upload.directly_maybe_log_error_events", true);
        k4Var.a("measurement.id.frontend.directly_maybe_log_error_events", 0);
    }

    public final boolean a() {
        return ((Boolean) f2658b.b()).booleanValue();
    }

    public final boolean zza() {
        return ((Boolean) f2657a.b()).booleanValue();
    }
}
