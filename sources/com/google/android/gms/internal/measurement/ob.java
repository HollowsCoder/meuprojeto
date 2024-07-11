package com.google.android.gms.internal.measurement;

public final class ob implements nb {

    /* renamed from: a  reason: collision with root package name */
    public static final i4 f2868a;

    /* renamed from: b  reason: collision with root package name */
    public static final j4 f2869b;

    /* renamed from: c  reason: collision with root package name */
    public static final h4 f2870c;
    public static final h4 d;

    /* renamed from: e  reason: collision with root package name */
    public static final h4 f2871e;

    static {
        k4 k4Var = new k4(g4.a());
        f2868a = k4Var.b("measurement.test.boolean_flag", false);
        f2869b = new j4(k4Var, Double.valueOf(-3.0d));
        f2870c = k4Var.a("measurement.test.int_flag", -2);
        d = k4Var.a("measurement.test.long_flag", -1);
        f2871e = k4Var.c("measurement.test.string_flag", "---");
    }

    public final double a() {
        return ((Double) f2869b.b()).doubleValue();
    }

    public final long b() {
        return ((Long) d.b()).longValue();
    }

    public final String c() {
        return (String) f2871e.b();
    }

    public final boolean zza() {
        return ((Boolean) f2868a.b()).booleanValue();
    }

    public final long zzc() {
        return ((Long) f2870c.b()).longValue();
    }
}
