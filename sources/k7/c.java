package k7;

import android.content.Context;
import android.util.Log;
import androidx.appcompat.widget.x0;
import androidx.fragment.app.f0;
import androidx.lifecycle.r;
import d7.c0;
import java.util.concurrent.atomic.AtomicReference;
import l7.a;
import l7.b;
import l7.e;
import l7.f;
import m5.j;
import org.json.JSONObject;
import q1.d;

public final class c implements d {

    /* renamed from: a  reason: collision with root package name */
    public final Context f6712a;

    /* renamed from: b  reason: collision with root package name */
    public final f f6713b;

    /* renamed from: c  reason: collision with root package name */
    public final d f6714c;
    public final q0.d d;

    /* renamed from: e  reason: collision with root package name */
    public final r f6715e;

    /* renamed from: f  reason: collision with root package name */
    public final f0 f6716f;

    /* renamed from: g  reason: collision with root package name */
    public final c0 f6717g;

    /* renamed from: h  reason: collision with root package name */
    public final AtomicReference<l7.d> f6718h;

    /* renamed from: i  reason: collision with root package name */
    public final AtomicReference<j<a>> f6719i = new AtomicReference<>(new j());

    public c(Context context, f fVar, q0.d dVar, d dVar2, r rVar, f0 f0Var, c0 c0Var) {
        long j8;
        AtomicReference<l7.d> atomicReference = new AtomicReference<>();
        this.f6718h = atomicReference;
        this.f6712a = context;
        this.f6713b = fVar;
        this.d = dVar;
        this.f6714c = dVar2;
        this.f6715e = rVar;
        this.f6716f = f0Var;
        this.f6717g = c0Var;
        JSONObject jSONObject = new JSONObject();
        l7.c cVar = new l7.c(jSONObject.optInt("max_custom_exception_events", 8));
        b bVar = new b(jSONObject.optBoolean("collect_reports", true), jSONObject.optBoolean("collect_anrs", false));
        if (jSONObject.has("expires_at")) {
            j8 = jSONObject.optLong("expires_at");
        } else {
            j8 = System.currentTimeMillis() + 3600000;
        }
        atomicReference.set(new e(j8, (a) null, cVar, bVar));
    }

    public static void b(JSONObject jSONObject, String str) {
        StringBuilder g10 = x0.g(str);
        g10.append(jSONObject.toString());
        String sb = g10.toString();
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", sb, (Throwable) null);
        }
    }

    public final e a(a aVar) {
        boolean z;
        e eVar = null;
        try {
            if (a.SKIP_CACHE_LOOKUP.equals(aVar)) {
                return null;
            }
            JSONObject a10 = this.f6715e.a();
            if (a10 != null) {
                e d10 = this.f6714c.d(a10);
                if (d10 != null) {
                    b(a10, "Loaded cached settings: ");
                    this.d.getClass();
                    long currentTimeMillis = System.currentTimeMillis();
                    if (!a.IGNORE_CACHE_EXPIRATION.equals(aVar)) {
                        if (d10.d < currentTimeMillis) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            if (!Log.isLoggable("FirebaseCrashlytics", 2)) {
                                return null;
                            }
                            Log.v("FirebaseCrashlytics", "Cached settings have expired.", (Throwable) null);
                            return null;
                        }
                    }
                    try {
                        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                            Log.v("FirebaseCrashlytics", "Returning cached settings.", (Throwable) null);
                        }
                        return d10;
                    } catch (Exception e10) {
                        e = e10;
                        eVar = d10;
                        Log.e("FirebaseCrashlytics", "Failed to get cached settings", e);
                        return eVar;
                    }
                } else {
                    Log.e("FirebaseCrashlytics", "Failed to parse cached settings data.", (Throwable) null);
                    return null;
                }
            } else if (!Log.isLoggable("FirebaseCrashlytics", 3)) {
                return null;
            } else {
                Log.d("FirebaseCrashlytics", "No cached settings data found.", (Throwable) null);
                return null;
            }
        } catch (Exception e11) {
            e = e11;
            Log.e("FirebaseCrashlytics", "Failed to get cached settings", e);
            return eVar;
        }
    }
}
