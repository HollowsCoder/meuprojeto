package c1;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.ViewGroup;
import b8.b0;
import b8.f0;
import b8.g0;
import c7.a;
import com.google.firebase.messaging.FirebaseMessaging;
import e3.b;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.MissingFormatArgumentException;
import java.util.concurrent.TimeUnit;
import m5.f;
import m5.i;
import m9.j;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import q2.d;
import q2.h;
import s2.w;
import z2.u;
import z8.g;

public final class r implements d, b, b7.b, c7.b, f, m5.d {

    /* renamed from: o  reason: collision with root package name */
    public Object f2129o;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public r(int i10) {
        this(TimeUnit.MINUTES);
        if (i10 == 10) {
        } else if (i10 == 11) {
            this.f2129o = new LinkedHashSet();
        }
    }

    public static boolean m(Bundle bundle) {
        if ("1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")))) {
            return true;
        }
        return false;
    }

    public static String o(String str, Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String next : bundle.keySet()) {
            jSONObject2.put(next, bundle.get(next));
        }
        jSONObject.put("name", str);
        jSONObject.put("parameters", jSONObject2);
        return jSONObject.toString();
    }

    public static String p(String str) {
        return str.startsWith("gcm.n.") ? str.substring(6) : str;
    }

    public final void a(String str, Bundle bundle) {
        a aVar = (a) this.f2129o;
        if (aVar != null) {
            try {
                aVar.a("$A$:" + o(str, bundle));
            } catch (JSONException unused) {
                Log.w("FirebaseCrashlytics", "Unable to serialize Firebase Analytics event to breadcrumb.", (Throwable) null);
            }
        }
    }

    public final w b(w wVar, h hVar) {
        Resources resources = (Resources) this.f2129o;
        if (wVar == null) {
            return null;
        }
        return new u(resources, wVar);
    }

    public final void c(Object obj) {
        boolean z;
        boolean z10;
        boolean z11;
        b0 b0Var = (b0) obj;
        FirebaseMessaging.a aVar = ((FirebaseMessaging) this.f2129o).f3711g;
        synchronized (aVar) {
            aVar.a();
            Boolean bool = aVar.d;
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                z = FirebaseMessaging.this.f3706a.g();
            }
        }
        if (z) {
            if (b0Var.f1986h.a() != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                synchronized (b0Var) {
                    z11 = b0Var.f1985g;
                }
                if (!z11) {
                    b0Var.f(0);
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0042 A[Catch:{ all -> 0x0038 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0049 A[SYNTHETIC, Splitter:B:23:0x0049] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0057 A[SYNTHETIC, Splitter:B:29:0x0057] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean d(java.lang.Object r5, java.io.File r6, q2.h r7) {
        /*
            r4 = this;
            java.io.InputStream r5 = (java.io.InputStream) r5
            java.lang.String r7 = "StreamEncoder"
            java.lang.Object r0 = r4.f2129o
            t2.b r0 = (t2.b) r0
            r1 = 65536(0x10000, float:9.18355E-41)
            java.lang.Class<byte[]> r2 = byte[].class
            java.lang.Object r0 = r0.c(r1, r2)
            byte[] r0 = (byte[]) r0
            r1 = 0
            r2 = 0
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x003a }
            r3.<init>(r6)     // Catch:{ IOException -> 0x003a }
        L_0x0019:
            int r6 = r5.read(r0)     // Catch:{ IOException -> 0x0035, all -> 0x0033 }
            r2 = -1
            if (r6 == r2) goto L_0x0024
            r3.write(r0, r1, r6)     // Catch:{ IOException -> 0x0035, all -> 0x0033 }
            goto L_0x0019
        L_0x0024:
            r3.close()     // Catch:{ IOException -> 0x0035, all -> 0x0033 }
            r3.close()     // Catch:{ IOException -> 0x002a }
        L_0x002a:
            java.lang.Object r5 = r4.f2129o
            t2.b r5 = (t2.b) r5
            r5.put(r0)
            r1 = 1
            goto L_0x0053
        L_0x0033:
            r5 = move-exception
            goto L_0x0055
        L_0x0035:
            r5 = move-exception
            r2 = r3
            goto L_0x003b
        L_0x0038:
            r5 = move-exception
            goto L_0x0054
        L_0x003a:
            r5 = move-exception
        L_0x003b:
            r6 = 3
            boolean r6 = android.util.Log.isLoggable(r7, r6)     // Catch:{ all -> 0x0038 }
            if (r6 == 0) goto L_0x0047
            java.lang.String r6 = "Failed to encode data onto the OutputStream"
            android.util.Log.d(r7, r6, r5)     // Catch:{ all -> 0x0038 }
        L_0x0047:
            if (r2 == 0) goto L_0x004c
            r2.close()     // Catch:{ IOException -> 0x004c }
        L_0x004c:
            java.lang.Object r5 = r4.f2129o
            t2.b r5 = (t2.b) r5
            r5.put(r0)
        L_0x0053:
            return r1
        L_0x0054:
            r3 = r2
        L_0x0055:
            if (r3 == 0) goto L_0x005a
            r3.close()     // Catch:{ IOException -> 0x005a }
        L_0x005a:
            java.lang.Object r6 = r4.f2129o
            t2.b r6 = (t2.b) r6
            r6.put(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: c1.r.d(java.lang.Object, java.io.File, q2.h):boolean");
    }

    public final void e(a aVar) {
        boolean z;
        this.f2129o = aVar;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Log.d("FirebaseCrashlytics", "Registered Firebase Analytics event receiver for breadcrumbs", (Throwable) null);
        }
    }

    public final void f(i iVar) {
        int i10 = f0.f2012b;
        ((g0.a) this.f2129o).f2021b.c((Object) null);
    }

    public final boolean g(String str) {
        String l = l(str);
        return "1".equals(l) || Boolean.parseBoolean(l);
    }

    public final Integer i(String str) {
        String l = l(str);
        if (TextUtils.isEmpty(l)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(l));
        } catch (NumberFormatException unused) {
            String p10 = p(str);
            StringBuilder sb = new StringBuilder(String.valueOf(p10).length() + 38 + String.valueOf(l).length());
            sb.append("Couldn't parse value of ");
            sb.append(p10);
            sb.append("(");
            sb.append(l);
            sb.append(") into an int");
            Log.w("NotificationParams", sb.toString());
            return null;
        }
    }

    public final JSONArray j(String str) {
        String l = l(str);
        if (TextUtils.isEmpty(l)) {
            return null;
        }
        try {
            return new JSONArray(l);
        } catch (JSONException unused) {
            String p10 = p(str);
            StringBuilder sb = new StringBuilder(String.valueOf(p10).length() + 50 + String.valueOf(l).length());
            sb.append("Malformed JSON for key ");
            sb.append(p10);
            sb.append(": ");
            sb.append(l);
            sb.append(", falling back to default");
            Log.w("NotificationParams", sb.toString());
            return null;
        }
    }

    public final String k(Resources resources, String str, String str2) {
        String[] strArr;
        String l = l(str2);
        if (!TextUtils.isEmpty(l)) {
            return l;
        }
        String l8 = l(str2.concat("_loc_key"));
        if (TextUtils.isEmpty(l8)) {
            return null;
        }
        int identifier = resources.getIdentifier(l8, "string", str);
        if (identifier == 0) {
            String p10 = p(str2.concat("_loc_key"));
            StringBuilder sb = new StringBuilder(String.valueOf(p10).length() + 49 + str2.length());
            sb.append(p10);
            sb.append(" resource not found: ");
            sb.append(str2);
            sb.append(" Default value will be used.");
            Log.w("NotificationParams", sb.toString());
            return null;
        }
        JSONArray j8 = j(str2.concat("_loc_args"));
        if (j8 == null) {
            strArr = null;
        } else {
            int length = j8.length();
            strArr = new String[length];
            for (int i10 = 0; i10 < length; i10++) {
                strArr[i10] = j8.optString(i10);
            }
        }
        if (strArr == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, strArr);
        } catch (MissingFormatArgumentException e10) {
            String p11 = p(str2);
            String arrays = Arrays.toString(strArr);
            StringBuilder sb2 = new StringBuilder(String.valueOf(p11).length() + 58 + String.valueOf(arrays).length());
            sb2.append("Missing format argument for ");
            sb2.append(p11);
            sb2.append(": ");
            sb2.append(arrays);
            sb2.append(" Default value will be used.");
            Log.w("NotificationParams", sb2.toString(), e10);
            return null;
        }
    }

    public final String l(String str) {
        String str2;
        Bundle bundle = (Bundle) this.f2129o;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            if (!str.startsWith("gcm.n.")) {
                str2 = str;
            } else {
                str2 = str.replace("gcm.n.", "gcm.notification.");
            }
            if (((Bundle) this.f2129o).containsKey(str2)) {
                str = str2;
            }
        }
        return bundle.getString(str);
    }

    public final Bundle n() {
        boolean z;
        Bundle bundle = new Bundle((Bundle) this.f2129o);
        for (String next : ((Bundle) this.f2129o).keySet()) {
            if (next.startsWith("google.c.a.") || next.equals("from")) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                bundle.remove(next);
            }
        }
        return bundle;
    }

    public /* synthetic */ r(int i10, Object obj) {
        this.f2129o = obj;
    }

    public r(Context context) {
        Context context2;
        SharedPreferences sharedPreferences;
        try {
            boolean z = j4.h.f6549a;
            try {
                context2 = context.createPackageContext("com.google.android.gms", 3);
            } catch (PackageManager.NameNotFoundException unused) {
                context2 = null;
            }
            if (context2 == null) {
                sharedPreferences = null;
            } else {
                sharedPreferences = context2.getSharedPreferences("google_ads_flags", 0);
            }
            this.f2129o = sharedPreferences;
        } catch (Throwable th) {
            Log.w("GmscoreFlag", "Error while getting SharedPreferences ", th);
            this.f2129o = null;
        }
    }

    public r(Resources resources) {
        this.f2129o = resources;
    }

    public r(Bundle bundle) {
        this.f2129o = new Bundle(bundle);
    }

    public r(ViewGroup viewGroup) {
        this.f2129o = viewGroup.getOverlay();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public r(TimeUnit timeUnit) {
        this(new j(l9.d.f6995h, timeUnit));
        g.f(timeUnit, "timeUnit");
    }

    public r(j jVar) {
        this.f2129o = jVar;
    }
}
