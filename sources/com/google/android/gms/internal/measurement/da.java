package com.google.android.gms.internal.measurement;

public final class da implements ca {

    /* renamed from: a  reason: collision with root package name */
    public static final i4 f2676a;

    /* renamed from: b  reason: collision with root package name */
    public static final i4 f2677b;

    /* renamed from: c  reason: collision with root package name */
    public static final i4 f2678c;

    static {
        k4 k4Var = new k4(g4.a());
        k4Var.b("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
        f2676a = k4Var.b("measurement.audience.refresh_event_count_filters_timestamp", false);
        f2677b = k4Var.b("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        f2678c = k4Var.b("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }

    public final boolean a() {
        return ((Boolean) f2676a.b()).booleanValue();
    }

    public final boolean b() {
        return ((Boolean) f2678c.b()).booleanValue();
    }

    public final void zza() {
    }

    public final boolean zzc() {
        return ((Boolean) f2677b.b()).booleanValue();
    }
}
