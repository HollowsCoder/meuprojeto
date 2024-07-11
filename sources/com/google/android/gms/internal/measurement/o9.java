package com.google.android.gms.internal.measurement;

public final class o9 implements n9 {

    /* renamed from: a  reason: collision with root package name */
    public static final h4 f2867a;

    static {
        k4 k4Var = new k4(g4.a());
        k4Var.b("measurement.client.consent_state_v1", true);
        k4Var.b("measurement.client.3p_consent_state_v1", true);
        k4Var.b("measurement.service.consent_state_v1_W36", true);
        k4Var.a("measurement.id.service.consent_state_v1_W36", 0);
        f2867a = k4Var.a("measurement.service.storage_consent_support_version", 203590);
    }

    public final long zza() {
        return ((Long) f2867a.b()).longValue();
    }
}
