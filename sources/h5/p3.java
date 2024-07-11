package h5;

import android.content.SharedPreferences;
import android.os.Bundle;
import n4.m;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class p3 {

    /* renamed from: a  reason: collision with root package name */
    public final String f5628a = "default_event_parameters";

    /* renamed from: b  reason: collision with root package name */
    public final Bundle f5629b = new Bundle();

    /* renamed from: c  reason: collision with root package name */
    public Bundle f5630c;
    public final /* synthetic */ u3 d;

    public p3(u3 u3Var) {
        this.d = u3Var;
        m.e("default_event_parameters");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:35|36|47) */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        r5 = r0.f5649o.w;
        h5.i4.n(r5);
        r5.f5397t.a("Error reading value from SharedPreferences. Value dropped");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00a0 */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0098 A[Catch:{ NumberFormatException | JSONException -> 0x00a0 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle a() {
        /*
            r12 = this;
            android.os.Bundle r0 = r12.f5630c
            if (r0 == 0) goto L_0x0006
            goto L_0x00cb
        L_0x0006:
            h5.u3 r0 = r12.d
            android.content.SharedPreferences r1 = r0.l()
            java.lang.String r2 = r12.f5628a
            r3 = 0
            java.lang.String r1 = r1.getString(r2, r3)
            if (r1 == 0) goto L_0x00c3
            android.os.Bundle r2 = new android.os.Bundle     // Catch:{ JSONException -> 0x00b5 }
            r2.<init>()     // Catch:{ JSONException -> 0x00b5 }
            org.json.JSONArray r3 = new org.json.JSONArray     // Catch:{ JSONException -> 0x00b5 }
            r3.<init>(r1)     // Catch:{ JSONException -> 0x00b5 }
            r1 = 0
            r4 = r1
        L_0x0021:
            int r5 = r3.length()     // Catch:{ JSONException -> 0x00b5 }
            if (r4 >= r5) goto L_0x00b2
            org.json.JSONObject r5 = r3.getJSONObject(r4)     // Catch:{ NumberFormatException | JSONException -> 0x00a0 }
            java.lang.String r6 = "n"
            java.lang.String r6 = r5.getString(r6)     // Catch:{ NumberFormatException | JSONException -> 0x00a0 }
            java.lang.String r7 = "t"
            java.lang.String r7 = r5.getString(r7)     // Catch:{ NumberFormatException | JSONException -> 0x00a0 }
            int r8 = r7.hashCode()     // Catch:{ NumberFormatException | JSONException -> 0x00a0 }
            r9 = 100
            r10 = 2
            r11 = 1
            if (r8 == r9) goto L_0x005e
            r9 = 108(0x6c, float:1.51E-43)
            if (r8 == r9) goto L_0x0054
            r9 = 115(0x73, float:1.61E-43)
            if (r8 == r9) goto L_0x004a
            goto L_0x0068
        L_0x004a:
            java.lang.String r8 = "s"
            boolean r8 = r7.equals(r8)
            if (r8 == 0) goto L_0x0068
            r8 = r1
            goto L_0x0069
        L_0x0054:
            java.lang.String r8 = "l"
            boolean r8 = r7.equals(r8)
            if (r8 == 0) goto L_0x0068
            r8 = r10
            goto L_0x0069
        L_0x005e:
            java.lang.String r8 = "d"
            boolean r8 = r7.equals(r8)
            if (r8 == 0) goto L_0x0068
            r8 = r11
            goto L_0x0069
        L_0x0068:
            r8 = -1
        L_0x0069:
            java.lang.String r9 = "v"
            if (r8 == 0) goto L_0x0098
            if (r8 == r11) goto L_0x008c
            if (r8 == r10) goto L_0x0080
            h5.i4 r5 = r0.f5649o     // Catch:{ NumberFormatException | JSONException -> 0x00a0 }
            h5.g3 r5 = r5.w     // Catch:{ NumberFormatException | JSONException -> 0x00a0 }
            h5.i4.n(r5)     // Catch:{ NumberFormatException | JSONException -> 0x00a0 }
            h5.e3 r5 = r5.f5397t     // Catch:{ NumberFormatException | JSONException -> 0x00a0 }
            java.lang.String r6 = "Unrecognized persisted bundle type. Type"
            r5.b(r7, r6)     // Catch:{ NumberFormatException | JSONException -> 0x00a0 }
            goto L_0x00ae
        L_0x0080:
            java.lang.String r5 = r5.getString(r9)     // Catch:{ NumberFormatException | JSONException -> 0x00a0 }
            long r7 = java.lang.Long.parseLong(r5)     // Catch:{ NumberFormatException | JSONException -> 0x00a0 }
            r2.putLong(r6, r7)     // Catch:{ NumberFormatException | JSONException -> 0x00a0 }
            goto L_0x00ae
        L_0x008c:
            java.lang.String r5 = r5.getString(r9)     // Catch:{ NumberFormatException | JSONException -> 0x00a0 }
            double r7 = java.lang.Double.parseDouble(r5)     // Catch:{ NumberFormatException | JSONException -> 0x00a0 }
            r2.putDouble(r6, r7)     // Catch:{ NumberFormatException | JSONException -> 0x00a0 }
            goto L_0x00ae
        L_0x0098:
            java.lang.String r5 = r5.getString(r9)     // Catch:{ NumberFormatException | JSONException -> 0x00a0 }
            r2.putString(r6, r5)     // Catch:{ NumberFormatException | JSONException -> 0x00a0 }
            goto L_0x00ae
        L_0x00a0:
            h5.i4 r5 = r0.f5649o     // Catch:{ JSONException -> 0x00b5 }
            h5.g3 r5 = r5.w     // Catch:{ JSONException -> 0x00b5 }
            h5.i4.n(r5)     // Catch:{ JSONException -> 0x00b5 }
            h5.e3 r5 = r5.f5397t     // Catch:{ JSONException -> 0x00b5 }
            java.lang.String r6 = "Error reading value from SharedPreferences. Value dropped"
            r5.a(r6)     // Catch:{ JSONException -> 0x00b5 }
        L_0x00ae:
            int r4 = r4 + 1
            goto L_0x0021
        L_0x00b2:
            r12.f5630c = r2     // Catch:{ JSONException -> 0x00b5 }
            goto L_0x00c3
        L_0x00b5:
            h5.i4 r0 = r0.f5649o
            h5.g3 r0 = r0.w
            h5.i4.n(r0)
            java.lang.String r1 = "Error loading bundle from SharedPreferences. Values will be lost"
            h5.e3 r0 = r0.f5397t
            r0.a(r1)
        L_0x00c3:
            android.os.Bundle r0 = r12.f5630c
            if (r0 != 0) goto L_0x00cb
            android.os.Bundle r0 = r12.f5629b
            r12.f5630c = r0
        L_0x00cb:
            android.os.Bundle r0 = r12.f5630c
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h5.p3.a():android.os.Bundle");
    }

    public final void b(Bundle bundle) {
        String str;
        if (bundle == null) {
            bundle = new Bundle();
        }
        u3 u3Var = this.d;
        SharedPreferences.Editor edit = u3Var.l().edit();
        int size = bundle.size();
        String str2 = this.f5628a;
        if (size == 0) {
            edit.remove(str2);
        } else {
            JSONArray jSONArray = new JSONArray();
            for (String next : bundle.keySet()) {
                Object obj = bundle.get(next);
                if (obj != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("n", next);
                        jSONObject.put("v", String.valueOf(obj));
                        if (obj instanceof String) {
                            str = "s";
                        } else if (obj instanceof Long) {
                            str = "l";
                        } else if (obj instanceof Double) {
                            str = "d";
                        } else {
                            g3 g3Var = u3Var.f5649o.w;
                            i4.n(g3Var);
                            g3Var.f5397t.b(obj.getClass(), "Cannot serialize bundle value to SharedPreferences. Type");
                        }
                        jSONObject.put("t", str);
                        jSONArray.put(jSONObject);
                    } catch (JSONException e10) {
                        g3 g3Var2 = u3Var.f5649o.w;
                        i4.n(g3Var2);
                        g3Var2.f5397t.b(e10, "Cannot serialize bundle value to SharedPreferences");
                    }
                }
            }
            edit.putString(str2, jSONArray.toString());
        }
        edit.apply();
        this.f5630c = bundle;
    }
}
