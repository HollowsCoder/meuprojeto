package com.google.android.gms.internal.measurement;

public final class ma implements la {

    /* renamed from: a  reason: collision with root package name */
    public static final i4 f2833a;

    static {
        k4 k4Var = new k4(g4.a());
        k4Var.b("measurement.collection.efficient_engagement_reporting_enabled_2", true);
        f2833a = k4Var.b("measurement.collection.redundant_engagement_removal_enabled", false);
        k4Var.a("measurement.id.collection.redundant_engagement_removal_enabled", 0);
    }

    public final boolean zza() {
        return ((Boolean) f2833a.b()).booleanValue();
    }
}
