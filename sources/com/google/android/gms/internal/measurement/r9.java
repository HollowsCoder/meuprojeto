package com.google.android.gms.internal.measurement;

public final class r9 implements q9 {

    /* renamed from: a  reason: collision with root package name */
    public static final i4 f2911a;

    /* renamed from: b  reason: collision with root package name */
    public static final i4 f2912b;

    static {
        k4 k4Var = new k4(g4.a());
        f2911a = k4Var.b("measurement.euid.client.dev", false);
        f2912b = k4Var.b("measurement.euid.service", false);
    }

    public final boolean a() {
        return ((Boolean) f2912b.b()).booleanValue();
    }

    public final boolean zza() {
        return ((Boolean) f2911a.b()).booleanValue();
    }
}
