package q0;

import android.os.Looper;
import android.util.Log;
import com.google.android.gms.internal.vision.y0;
import f3.m;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;
import k7.e;
import l7.b;
import l7.c;
import org.json.JSONObject;
import q1.a;
import q2.h;
import q2.k;
import s2.w;

public class d implements k, m, y0, e {

    /* renamed from: p  reason: collision with root package name */
    public static d f8209p;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ int f8210o;

    public d() {
        this.f8210o = 0;
    }

    public static a a(String str) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.connect();
        return new a(httpURLConnection);
    }

    public static final boolean b() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public final l7.e c(d dVar, JSONObject jSONObject) {
        long j8;
        jSONObject.optInt("settings_version", 0);
        int optInt = jSONObject.optInt("cache_duration", 3600);
        JSONObject jSONObject2 = jSONObject.getJSONObject("app");
        jSONObject2.getString("status");
        jSONObject2.getString("url");
        jSONObject2.getString("reports_url");
        jSONObject2.getString("ndk_reports_url");
        jSONObject2.optBoolean("update_required", false);
        l7.a aVar = new l7.a(0);
        c cVar = new c(jSONObject.getJSONObject("session").optInt("max_custom_exception_events", 8));
        JSONObject jSONObject3 = jSONObject.getJSONObject("features");
        b bVar = new b(jSONObject3.optBoolean("collect_reports", true), jSONObject3.optBoolean("collect_anrs", false));
        long j10 = (long) optInt;
        if (jSONObject.has("expires_at")) {
            j8 = jSONObject.optLong("expires_at");
        } else {
            dVar.getClass();
            j8 = (j10 * 1000) + System.currentTimeMillis();
        }
        return new l7.e(j8, aVar, cVar, bVar);
    }

    public final boolean d(Object obj, File file, h hVar) {
        try {
            m3.a.b(((d3.c) ((w) obj).get()).f4151o.f4159a.f4161a.g().asReadOnlyBuffer(), file);
            return true;
        } catch (IOException e10) {
            if (Log.isLoggable("GifEncoder", 5)) {
                Log.w("GifEncoder", "Failed to encode GIF drawable data", e10);
            }
            return false;
        }
    }

    public final q2.c h(h hVar) {
        return q2.c.SOURCE;
    }

    public final byte[] j(byte[] bArr, int i10, int i11) {
        return Arrays.copyOfRange(bArr, i10, i11 + i10);
    }

    public /* synthetic */ d(int i10) {
        this.f8210o = i10;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i10, int i11) {
        this(6);
        this.f8210o = i10;
        if (i10 != 7) {
        } else {
            this(7);
        }
    }

    public d(b0.d dVar) {
        this.f8210o = 11;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj) {
        this(9);
        this.f8210o = 9;
    }
}
