package h5;

import android.content.SharedPreferences;
import android.util.Pair;
import com.karumi.dexter.BuildConfig;
import n4.m;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

public final class u3 extends r4 {
    public static final Pair<String, Long> L = new Pair<>(BuildConfig.FLAVOR, 0L);
    public final t3 A = new t3(this, "non_personalized_ads");
    public final o3 B = new o3(this, "allow_remote_dynamite", false);
    public final q3 C = new q3(this, "last_pause_time", 0);
    public boolean D;
    public final o3 E = new o3(this, "app_backgrounded", false);
    public final o3 F = new o3(this, "deep_link_retrieval_complete", false);
    public final q3 G = new q3(this, "deep_link_retrieval_attempts", 0);
    public final t3 H = new t3(this, "firebase_feature_rollouts");
    public final t3 I = new t3(this, "deferred_attribution_cache");
    public final q3 J = new q3(this, "deferred_attribution_cache_timestamp", 0);
    public final p3 K = new p3(this);

    /* renamed from: q  reason: collision with root package name */
    public SharedPreferences f5751q;

    /* renamed from: r  reason: collision with root package name */
    public r3 f5752r;

    /* renamed from: s  reason: collision with root package name */
    public final q3 f5753s = new q3(this, "first_open_time", 0);

    /* renamed from: t  reason: collision with root package name */
    public final q3 f5754t = new q3(this, "app_install_time", 0);
    public final t3 u = new t3(this, "app_instance_id");

    /* renamed from: v  reason: collision with root package name */
    public String f5755v;
    public boolean w;

    /* renamed from: x  reason: collision with root package name */
    public long f5756x;

    /* renamed from: y  reason: collision with root package name */
    public final q3 f5757y = new q3(this, "session_timeout", 1800000);
    public final o3 z = new o3(this, "start_new_session", true);

    public u3(i4 i4Var) {
        super(i4Var);
    }

    public final boolean h() {
        return true;
    }

    @EnsuresNonNull.List({@EnsuresNonNull({"this.preferences"}), @EnsuresNonNull({"this.monitoringSample"})})
    public final void k() {
        SharedPreferences sharedPreferences = this.f5649o.f5452o.getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.f5751q = sharedPreferences;
        boolean z10 = sharedPreferences.getBoolean("has_been_opened", false);
        this.D = z10;
        if (!z10) {
            SharedPreferences.Editor edit = this.f5751q.edit();
            edit.putBoolean("has_been_opened", true);
            edit.apply();
        }
        this.f5752r = new r3(this, Math.max(0, u2.f5711c.a(null).longValue()));
    }

    public final SharedPreferences l() {
        g();
        i();
        m.h(this.f5751q);
        return this.f5751q;
    }

    public final void m(Boolean bool) {
        g();
        SharedPreferences.Editor edit = l().edit();
        if (bool != null) {
            edit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            edit.remove("measurement_enabled");
        }
        edit.apply();
    }

    public final Boolean n() {
        g();
        if (l().contains("measurement_enabled")) {
            return Boolean.valueOf(l().getBoolean("measurement_enabled", true));
        }
        return null;
    }

    public final boolean o(int i10) {
        return i10 <= l().getInt("consent_source", 100);
    }

    public final f p() {
        g();
        return f.b(l().getString("consent_settings", "G1"));
    }

    public final void q(boolean z10) {
        g();
        g3 g3Var = this.f5649o.w;
        i4.n(g3Var);
        g3Var.B.b(Boolean.valueOf(z10), "App measurement setting deferred collection");
        SharedPreferences.Editor edit = l().edit();
        edit.putBoolean("deferred_analytics_collection", z10);
        edit.apply();
    }

    public final boolean r(long j8) {
        return j8 - this.f5757y.a() > this.C.a();
    }
}
