package h5;

import android.content.Context;
import com.google.android.gms.internal.measurement.b4;
import com.google.android.gms.internal.measurement.g4;
import d7.h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import s6.a;

public final class u2 {
    public static final s2<Long> A = b("measurement.upload.retry_time", 1800000L, 1800000L, g0.f5391o);
    public static final s2<Integer> B = b("measurement.upload.retry_count", 6, 6, h0.f5423o);
    public static final s2<Long> C = b("measurement.upload.max_queue_time", 2419200000L, 2419200000L, i0.f5449o);
    public static final s2<Integer> D = b("measurement.lifetimevalue.max_currency_tracked", 4, 4, j0.f5480o);
    public static final s2<Integer> E = b("measurement.audience.filter_result_max_count", 200, 200, l0.f5523o);
    public static final s2<Integer> F = b("measurement.upload.max_public_user_properties", 25, 25, (r2) null);
    public static final s2<Integer> G = b("measurement.upload.max_event_name_cardinality", 500, 500, (r2) null);
    public static final s2<Integer> H = b("measurement.upload.max_public_event_params", 25, 25, (r2) null);
    public static final s2<Long> I = b("measurement.service_client.idle_disconnect_millis", 5000L, 5000L, m0.f5551o);
    public static final s2<Boolean> J;
    public static final s2<String> K = b("measurement.test.string_flag", "---", "---", o0.f5600o);
    public static final s2<Long> L = b("measurement.test.long_flag", -1L, -1L, p0.f5625o);
    public static final s2<Integer> M = b("measurement.test.int_flag", -2, -2, q0.f5642o);
    public static final s2<Double> N;
    public static final s2<Integer> O = b("measurement.experiment.max_ids", 50, 50, s0.f5677o);
    public static final s2<Integer> P = b("measurement.max_bundles_per_iteration", 100, 100, t0.f5693o);
    public static final s2<Long> Q = b("measurement.sdk.attribution.cache.ttl", 604800000L, 604800000L, u0.f5703o);
    public static final s2<Boolean> R;
    public static final s2<Boolean> S;
    public static final s2<Boolean> T;
    public static final s2<Boolean> U;
    public static final s2<Boolean> V;
    public static final s2<Boolean> W;
    public static final s2<Boolean> X;
    public static final s2<Boolean> Y;
    public static final s2<Boolean> Z;

    /* renamed from: a  reason: collision with root package name */
    public static final List<s2<?>> f5707a = Collections.synchronizedList(new ArrayList());

    /* renamed from: a0  reason: collision with root package name */
    public static final s2<Boolean> f5708a0;

    /* renamed from: b  reason: collision with root package name */
    public static final s2<Long> f5709b = b("measurement.ad_id_cache_time", 10000L, 10000L, a.I);

    /* renamed from: b0  reason: collision with root package name */
    public static final s2<Boolean> f5710b0;

    /* renamed from: c  reason: collision with root package name */
    public static final s2<Long> f5711c = b("measurement.monitoring.sample_period_millis", 86400000L, 86400000L, z.f5830o);

    /* renamed from: c0  reason: collision with root package name */
    public static final s2<Boolean> f5712c0;
    public static final s2<Long> d = b("measurement.config.cache_time", 86400000L, 3600000L, k0.f5498o);

    /* renamed from: d0  reason: collision with root package name */
    public static final s2<Boolean> f5713d0;

    /* renamed from: e  reason: collision with root package name */
    public static final s2<String> f5714e = b("measurement.config.url_scheme", "https", "https", v0.f5776o);

    /* renamed from: e0  reason: collision with root package name */
    public static final s2<Boolean> f5715e0;

    /* renamed from: f  reason: collision with root package name */
    public static final s2<String> f5716f = b("measurement.config.url_authority", "app-measurement.com", "app-measurement.com", g1.f5392o);

    /* renamed from: f0  reason: collision with root package name */
    public static final s2<Boolean> f5717f0;

    /* renamed from: g  reason: collision with root package name */
    public static final s2<Integer> f5718g = b("measurement.upload.max_bundles", 100, 100, r1.f5666o);

    /* renamed from: g0  reason: collision with root package name */
    public static final s2<Boolean> f5719g0;

    /* renamed from: h  reason: collision with root package name */
    public static final s2<Integer> f5720h = b("measurement.upload.max_batch_size", 65536, 65536, d2.f5325o);

    /* renamed from: h0  reason: collision with root package name */
    public static final s2<Boolean> f5721h0;

    /* renamed from: i  reason: collision with root package name */
    public static final s2<Integer> f5722i = b("measurement.upload.max_bundle_size", 65536, 65536, o2.f5602o);

    /* renamed from: i0  reason: collision with root package name */
    public static final s2<Boolean> f5723i0;

    /* renamed from: j  reason: collision with root package name */
    public static final s2<Integer> f5724j = b("measurement.upload.max_events_per_bundle", 1000, 1000, p2.f5627o);

    /* renamed from: j0  reason: collision with root package name */
    public static final s2<Boolean> f5725j0;

    /* renamed from: k  reason: collision with root package name */
    public static final s2<Integer> f5726k = b("measurement.upload.max_events_per_day", 100000, 100000, q2.f5644o);

    /* renamed from: k0  reason: collision with root package name */
    public static final s2<Boolean> f5727k0;
    public static final s2<Integer> l = b("measurement.upload.max_error_events_per_day", 1000, 1000, androidx.databinding.a.f1015p0);

    /* renamed from: l0  reason: collision with root package name */
    public static final s2<Boolean> f5728l0;

    /* renamed from: m  reason: collision with root package name */
    public static final s2<Integer> f5729m = b("measurement.upload.max_public_events_per_day", 50000, 50000, r.f5663o);

    /* renamed from: m0  reason: collision with root package name */
    public static final s2<Boolean> f5730m0;

    /* renamed from: n  reason: collision with root package name */
    public static final s2<Integer> f5731n = b("measurement.upload.max_conversions_per_day", 10000, 10000, h.f4228o);

    /* renamed from: n0  reason: collision with root package name */
    public static final s2<Boolean> f5732n0;

    /* renamed from: o  reason: collision with root package name */
    public static final s2<Integer> f5733o = b("measurement.upload.max_realtime_events_per_day", 10, 10, s.f5676o);

    /* renamed from: o0  reason: collision with root package name */
    public static final s2<Boolean> f5734o0;

    /* renamed from: p  reason: collision with root package name */
    public static final s2<Integer> f5735p = b("measurement.store.max_stored_events_per_app", 100000, 100000, t.f5692o);

    /* renamed from: p0  reason: collision with root package name */
    public static final s2<Boolean> f5736p0;

    /* renamed from: q  reason: collision with root package name */
    public static final s2<String> f5737q = b("measurement.upload.url", "https://app-measurement.com/a", "https://app-measurement.com/a", u.f5702o);

    /* renamed from: q0  reason: collision with root package name */
    public static final s2<Boolean> f5738q0;

    /* renamed from: r  reason: collision with root package name */
    public static final s2<Long> f5739r = b("measurement.upload.backoff_period", 43200000L, 43200000L, v.f5775o);

    /* renamed from: r0  reason: collision with root package name */
    public static final s2<Boolean> f5740r0;

    /* renamed from: s  reason: collision with root package name */
    public static final s2<Long> f5741s = b("measurement.upload.interval", 3600000L, 3600000L, x.f5800o);

    /* renamed from: s0  reason: collision with root package name */
    public static final s2<Integer> f5742s0 = b("measurement.service.storage_consent_support_version", 203600, 203600, b2.f5286o);

    /* renamed from: t  reason: collision with root package name */
    public static final s2<Long> f5743t = b("measurement.upload.realtime_upload_interval", 10000L, 10000L, y.f5810o);
    public static final s2<Boolean> t0;
    public static final s2<Long> u = b("measurement.upload.debug_upload_interval", 1000L, 1000L, a0.f5264o);

    /* renamed from: u0  reason: collision with root package name */
    public static final s2<Boolean> f5744u0;

    /* renamed from: v  reason: collision with root package name */
    public static final s2<Long> f5745v = b("measurement.upload.minimum_delay", 500L, 500L, b0.f5284o);

    /* renamed from: v0  reason: collision with root package name */
    public static final s2<Boolean> f5746v0;
    public static final s2<Long> w = b("measurement.alarm_manager.minimum_interval", 60000L, 60000L, c0.f5300o);

    /* renamed from: w0  reason: collision with root package name */
    public static final s2<Boolean> f5747w0;

    /* renamed from: x  reason: collision with root package name */
    public static final s2<Long> f5748x = b("measurement.upload.stale_data_deletion_interval", 86400000L, 86400000L, d0.f5323o);
    public static final s2<Boolean> x0;

    /* renamed from: y  reason: collision with root package name */
    public static final s2<Long> f5749y = b("measurement.upload.refresh_blacklisted_config_interval", 604800000L, 604800000L, e0.f5346o);
    public static final s2<Boolean> y0;
    public static final s2<Long> z = b("measurement.upload.initial_upload_delay_time", 15000L, 15000L, f0.f5369o);

    /* renamed from: z0  reason: collision with root package name */
    public static final s2<Boolean> f5750z0;

    static {
        Collections.synchronizedSet(new HashSet());
        b("measurement.upload.window_interval", 3600000L, 3600000L, w.f5789o);
        Boolean bool = Boolean.FALSE;
        J = b("measurement.test.boolean_flag", bool, bool, n0.f5588o);
        Double valueOf = Double.valueOf(-3.0d);
        N = b("measurement.test.double_flag", valueOf, valueOf, r0.f5665o);
        R = b("measurement.validation.internal_limits_internal_event_params", bool, bool, w0.f5790o);
        Boolean bool2 = Boolean.TRUE;
        S = b("measurement.collection.firebase_global_collection_flag_enabled", bool2, bool2, x0.f5801o);
        T = b("measurement.collection.redundant_engagement_removal_enabled", bool, bool, y0.f5811o);
        b("measurement.collection.log_event_and_bundle_v2", bool2, bool2, z0.f5831o);
        U = b("measurement.quality.checksum", bool, bool, (r2) null);
        V = b("measurement.sdk.collection.validate_param_names_alphabetical", bool2, bool2, a1.f5265o);
        W = b("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", bool, bool, b1.f5285o);
        X = b("measurement.audience.refresh_event_count_filters_timestamp", bool, bool, c1.f5301o);
        Y = b("measurement.audience.use_bundle_timestamp_for_event_count_filters", bool, bool, d1.f5324o);
        Z = b("measurement.sdk.collection.retrieve_deeplink_from_bow_2", bool2, bool2, e1.f5347o);
        f5708a0 = b("measurement.sdk.collection.last_deep_link_referrer2", bool2, bool2, f1.f5370o);
        f5710b0 = b("measurement.sdk.collection.last_deep_link_referrer_campaign2", bool, bool, h1.f5424o);
        f5712c0 = b("measurement.sdk.collection.last_gclid_from_referrer2", bool, bool, i1.f5450o);
        f5713d0 = b("measurement.sdk.collection.enable_extend_user_property_size", bool2, bool2, j1.f5481o);
        f5715e0 = b("measurement.upload.file_lock_state_check", bool2, bool2, k1.f5499o);
        f5717f0 = b("measurement.ga.ga_app_id", bool, bool, l1.f5524o);
        f5719g0 = b("measurement.lifecycle.app_in_background_parameter", bool, bool, m1.f5552o);
        f5721h0 = b("measurement.integration.disable_firebase_instance_id", bool, bool, n1.f5589o);
        f5723i0 = b("measurement.lifecycle.app_backgrounded_engagement", bool, bool, o1.f5601o);
        f5725j0 = b("measurement.collection.service.update_with_analytics_fix", bool, bool, p1.f5626o);
        f5727k0 = b("measurement.service.use_appinfo_modified", bool2, bool2, q1.f5643o);
        f5728l0 = b("measurement.client.firebase_feature_rollout.v1.enable", bool2, bool2, s1.f5678o);
        f5730m0 = b("measurement.client.sessions.check_on_reset_and_enable2", bool2, bool2, t1.f5694o);
        f5732n0 = b("measurement.scheduler.task_thread.cleanup_on_exit", bool, bool, v1.f5777o);
        f5734o0 = b("measurement.upload.file_truncate_fix", bool, bool, w1.f5791o);
        f5736p0 = b("measurement.sdk.screen.disabling_automatic_reporting", bool2, bool2, x1.f5802o);
        f5738q0 = b("measurement.sdk.screen.manual_screen_view_logging", bool2, bool2, y1.f5812o);
        b("measurement.collection.synthetic_data_mitigation", bool, bool, z1.f5832o);
        f5740r0 = b("measurement.androidId.delete_feature", bool2, bool2, a2.f5266o);
        t0 = b("measurement.upload.directly_maybe_log_error_events", bool2, bool2, c2.f5302o);
        f5744u0 = b("measurement.frontend.directly_maybe_log_error_events", bool, bool, e2.f5348o);
        f5746v0 = b("measurement.client.properties.non_null_origin", bool2, bool2, f2.f5371o);
        b("measurement.client.click_identifier_control.dev", bool, bool, g2.f5393o);
        b("measurement.service.click_identifier_control", bool, bool, h2.f5425o);
        f5747w0 = b("measurement.client.reject_blank_user_id", bool2, bool2, i2.f5451o);
        x0 = b("measurement.config.persist_last_modified", bool2, bool2, j2.f5482o);
        y0 = b("measurement.client.consent.suppress_1p_in_ga4f_install", bool2, bool2, k2.f5500o);
        f5750z0 = b("measurement.module.pixie.ees", bool, bool, l2.f5525o);
        b("measurement.euid.client.dev", bool, bool, m2.f5553o);
        b("measurement.euid.service", bool, bool, n2.f5590o);
    }

    public static Map<String, String> a(Context context) {
        b4 a10 = b4.a(context.getContentResolver(), g4.a());
        return a10 == null ? Collections.emptyMap() : a10.b();
    }

    public static <V> s2<V> b(String str, V v10, V v11, r2<V> r2Var) {
        s2<V> s2Var = new s2<>(str, v10, v11, r2Var);
        f5707a.add(s2Var);
        return s2Var;
    }
}
