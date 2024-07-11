package com.google.android.gms.internal.measurement;

public final class wa implements ua {

    /* renamed from: a  reason: collision with root package name */
    public static final i4 f2983a;

    /* renamed from: b  reason: collision with root package name */
    public static final i4 f2984b;

    /* renamed from: c  reason: collision with root package name */
    public static final i4 f2985c;
    public static final i4 d;

    static {
        k4 k4Var = new k4(g4.a());
        f2983a = k4Var.b("measurement.sdk.collection.enable_extend_user_property_size", true);
        f2984b = k4Var.b("measurement.sdk.collection.last_deep_link_referrer2", true);
        f2985c = k4Var.b("measurement.sdk.collection.last_deep_link_referrer_campaign2", false);
        d = k4Var.b("measurement.sdk.collection.last_gclid_from_referrer2", false);
        k4Var.a("measurement.id.sdk.collection.last_deep_link_referrer2", 0);
    }

    public final boolean a() {
        return ((Boolean) f2984b.b()).booleanValue();
    }

    public final boolean b() {
        return ((Boolean) d.b()).booleanValue();
    }

    public final boolean zza() {
        return ((Boolean) f2983a.b()).booleanValue();
    }

    public final boolean zzc() {
        return ((Boolean) f2985c.b()).booleanValue();
    }
}
