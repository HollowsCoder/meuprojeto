package com.google.android.gms.internal.measurement;

public final class l9 implements k9 {
    public static final h4 A;
    public static final h4 B;
    public static final h4 C;
    public static final h4 D;
    public static final h4 E;
    public static final h4 F;
    public static final h4 G;
    public static final h4 H;
    public static final h4 I;

    /* renamed from: a  reason: collision with root package name */
    public static final h4 f2794a;

    /* renamed from: b  reason: collision with root package name */
    public static final h4 f2795b;

    /* renamed from: c  reason: collision with root package name */
    public static final h4 f2796c;
    public static final h4 d;

    /* renamed from: e  reason: collision with root package name */
    public static final h4 f2797e;

    /* renamed from: f  reason: collision with root package name */
    public static final h4 f2798f;

    /* renamed from: g  reason: collision with root package name */
    public static final h4 f2799g;

    /* renamed from: h  reason: collision with root package name */
    public static final h4 f2800h;

    /* renamed from: i  reason: collision with root package name */
    public static final h4 f2801i;

    /* renamed from: j  reason: collision with root package name */
    public static final h4 f2802j;

    /* renamed from: k  reason: collision with root package name */
    public static final h4 f2803k;
    public static final h4 l;

    /* renamed from: m  reason: collision with root package name */
    public static final h4 f2804m;

    /* renamed from: n  reason: collision with root package name */
    public static final h4 f2805n;

    /* renamed from: o  reason: collision with root package name */
    public static final h4 f2806o;

    /* renamed from: p  reason: collision with root package name */
    public static final h4 f2807p;

    /* renamed from: q  reason: collision with root package name */
    public static final h4 f2808q;

    /* renamed from: r  reason: collision with root package name */
    public static final h4 f2809r;

    /* renamed from: s  reason: collision with root package name */
    public static final h4 f2810s;

    /* renamed from: t  reason: collision with root package name */
    public static final h4 f2811t;
    public static final h4 u;

    /* renamed from: v  reason: collision with root package name */
    public static final h4 f2812v;
    public static final h4 w;

    /* renamed from: x  reason: collision with root package name */
    public static final h4 f2813x;

    /* renamed from: y  reason: collision with root package name */
    public static final h4 f2814y;
    public static final h4 z;

    static {
        k4 k4Var = new k4(g4.a());
        f2794a = k4Var.a("measurement.ad_id_cache_time", 10000);
        f2795b = k4Var.a("measurement.max_bundles_per_iteration", 100);
        f2796c = k4Var.a("measurement.config.cache_time", 86400000);
        k4Var.c("measurement.log_tag", "FA");
        d = k4Var.c("measurement.config.url_authority", "app-measurement.com");
        f2797e = k4Var.c("measurement.config.url_scheme", "https");
        f2798f = k4Var.a("measurement.upload.debug_upload_interval", 1000);
        f2799g = k4Var.a("measurement.lifetimevalue.max_currency_tracked", 4);
        f2800h = k4Var.a("measurement.store.max_stored_events_per_app", 100000);
        f2801i = k4Var.a("measurement.experiment.max_ids", 50);
        f2802j = k4Var.a("measurement.audience.filter_result_max_count", 200);
        f2803k = k4Var.a("measurement.alarm_manager.minimum_interval", 60000);
        l = k4Var.a("measurement.upload.minimum_delay", 500);
        f2804m = k4Var.a("measurement.monitoring.sample_period_millis", 86400000);
        f2805n = k4Var.a("measurement.upload.realtime_upload_interval", 10000);
        f2806o = k4Var.a("measurement.upload.refresh_blacklisted_config_interval", 604800000);
        k4Var.a("measurement.config.cache_time.service", 3600000);
        f2807p = k4Var.a("measurement.service_client.idle_disconnect_millis", 5000);
        k4Var.c("measurement.log_tag.service", "FA-SVC");
        f2808q = k4Var.a("measurement.upload.stale_data_deletion_interval", 86400000);
        f2809r = k4Var.a("measurement.sdk.attribution.cache.ttl", 604800000);
        f2810s = k4Var.a("measurement.upload.backoff_period", 43200000);
        f2811t = k4Var.a("measurement.upload.initial_upload_delay_time", 15000);
        u = k4Var.a("measurement.upload.interval", 3600000);
        f2812v = k4Var.a("measurement.upload.max_bundle_size", 65536);
        w = k4Var.a("measurement.upload.max_bundles", 100);
        f2813x = k4Var.a("measurement.upload.max_conversions_per_day", 500);
        f2814y = k4Var.a("measurement.upload.max_error_events_per_day", 1000);
        z = k4Var.a("measurement.upload.max_events_per_bundle", 1000);
        A = k4Var.a("measurement.upload.max_events_per_day", 100000);
        B = k4Var.a("measurement.upload.max_public_events_per_day", 50000);
        C = k4Var.a("measurement.upload.max_queue_time", 2419200000L);
        D = k4Var.a("measurement.upload.max_realtime_events_per_day", 10);
        E = k4Var.a("measurement.upload.max_batch_size", 65536);
        F = k4Var.a("measurement.upload.retry_count", 6);
        G = k4Var.a("measurement.upload.retry_time", 1800000);
        H = k4Var.c("measurement.upload.url", "https://app-measurement.com/a");
        I = k4Var.a("measurement.upload.window_interval", 3600000);
    }

    public final long A() {
        return ((Long) f2810s.b()).longValue();
    }

    public final long B() {
        return ((Long) D.b()).longValue();
    }

    public final long C() {
        return ((Long) f2806o.b()).longValue();
    }

    public final long D() {
        return ((Long) I.b()).longValue();
    }

    public final long E() {
        return ((Long) E.b()).longValue();
    }

    public final long F() {
        return ((Long) f2813x.b()).longValue();
    }

    public final long G() {
        return ((Long) A.b()).longValue();
    }

    public final long a() {
        return ((Long) f2795b.b()).longValue();
    }

    public final String b() {
        return (String) d.b();
    }

    public final String c() {
        return (String) f2797e.b();
    }

    public final long d() {
        return ((Long) f2803k.b()).longValue();
    }

    public final long e() {
        return ((Long) f2807p.b()).longValue();
    }

    public final long f() {
        return ((Long) f2800h.b()).longValue();
    }

    public final long g() {
        return ((Long) f2801i.b()).longValue();
    }

    public final long h() {
        return ((Long) f2809r.b()).longValue();
    }

    public final long i() {
        return ((Long) f2798f.b()).longValue();
    }

    public final long j() {
        return ((Long) f2799g.b()).longValue();
    }

    public final long k() {
        return ((Long) l.b()).longValue();
    }

    public final long l() {
        return ((Long) u.b()).longValue();
    }

    public final long m() {
        return ((Long) f2808q.b()).longValue();
    }

    public final long n() {
        return ((Long) f2804m.b()).longValue();
    }

    public final long o() {
        return ((Long) f2812v.b()).longValue();
    }

    public final long p() {
        return ((Long) f2802j.b()).longValue();
    }

    public final long q() {
        return ((Long) f2811t.b()).longValue();
    }

    public final long r() {
        return ((Long) F.b()).longValue();
    }

    public final long s() {
        return ((Long) f2814y.b()).longValue();
    }

    public final long t() {
        return ((Long) B.b()).longValue();
    }

    public final long u() {
        return ((Long) z.b()).longValue();
    }

    public final long v() {
        return ((Long) G.b()).longValue();
    }

    public final long w() {
        return ((Long) C.b()).longValue();
    }

    public final long x() {
        return ((Long) f2805n.b()).longValue();
    }

    public final long y() {
        return ((Long) w.b()).longValue();
    }

    public final String z() {
        return (String) H.b();
    }

    public final long zza() {
        return ((Long) f2794a.b()).longValue();
    }

    public final long zzc() {
        return ((Long) f2796c.b()).longValue();
    }
}
