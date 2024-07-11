package h5;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.karumi.dexter.BuildConfig;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final /* synthetic */ class k5 implements Runnable {

    /* renamed from: o  reason: collision with root package name */
    public final l5 f5511o;

    /* renamed from: p  reason: collision with root package name */
    public final int f5512p;

    /* renamed from: q  reason: collision with root package name */
    public final Exception f5513q;

    /* renamed from: r  reason: collision with root package name */
    public final byte[] f5514r;

    public k5(l5 l5Var, int i10, IOException iOException, byte[] bArr, Map map) {
        this.f5511o = l5Var;
        this.f5512p = i10;
        this.f5513q = iOException;
        this.f5514r = bArr;
    }

    public final void run() {
        i4 i4Var = this.f5511o.f5532q.f5649o;
        g7 g7Var = i4Var.z;
        int i10 = this.f5512p;
        Exception exc = this.f5513q;
        g3 g3Var = i4Var.w;
        if (!(i10 == 200 || i10 == 204)) {
            if (i10 == 304) {
                i10 = 304;
            }
            i4.n(g3Var);
            g3Var.w.c(Integer.valueOf(i10), exc, "Network Request for Deferred Deep Link failed. response, exception");
        }
        if (exc == null) {
            u3 u3Var = i4Var.f5458v;
            i4.l(u3Var);
            u3Var.F.b(true);
            byte[] bArr = this.f5514r;
            if (bArr == null || bArr.length == 0) {
                i4.n(g3Var);
                g3Var.A.a("Deferred Deep Link response empty.");
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(new String(bArr));
                String optString = jSONObject.optString("deeplink", BuildConfig.FLAVOR);
                String optString2 = jSONObject.optString("gclid", BuildConfig.FLAVOR);
                double optDouble = jSONObject.optDouble("timestamp", 0.0d);
                if (TextUtils.isEmpty(optString)) {
                    i4.n(g3Var);
                    g3Var.A.a("Deferred Deep Link is empty.");
                    return;
                }
                i4.l(g7Var);
                i4 i4Var2 = g7Var.f5649o;
                if (!TextUtils.isEmpty(optString)) {
                    Context context = i4Var2.f5452o;
                    List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(optString)), 0);
                    if (queryIntentActivities != null && !queryIntentActivities.isEmpty()) {
                        Bundle bundle = new Bundle();
                        bundle.putString("gclid", optString2);
                        bundle.putString("_cis", "ddp");
                        i4Var.D.x("auto", "_cmp", bundle);
                        if (!TextUtils.isEmpty(optString)) {
                            try {
                                SharedPreferences.Editor edit = context.getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
                                edit.putString("deeplink", optString);
                                edit.putLong("timestamp", Double.doubleToRawLongBits(optDouble));
                                if (edit.commit()) {
                                    context.sendBroadcast(new Intent("android.google.analytics.action.DEEPLINK_ACTION"));
                                    return;
                                }
                                return;
                            } catch (RuntimeException e10) {
                                g3 g3Var2 = i4Var2.w;
                                i4.n(g3Var2);
                                g3Var2.f5397t.b(e10, "Failed to persist Deferred Deep Link. exception");
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                }
                i4.n(g3Var);
                g3Var.w.c(optString2, optString, "Deferred Deep Link validation failed. gclid, deep link");
                return;
            } catch (JSONException e11) {
                i4.n(g3Var);
                g3Var.f5397t.b(e11, "Failed to parse the Deferred Deep Link response. exception");
                return;
            }
        }
        i4.n(g3Var);
        g3Var.w.c(Integer.valueOf(i10), exc, "Network Request for Deferred Deep Link failed. response, exception");
    }
}
