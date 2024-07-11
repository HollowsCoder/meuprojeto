package e8;

import android.content.Context;
import com.google.firebase.remoteconfig.internal.a;
import com.google.firebase.remoteconfig.internal.b;
import f8.d;
import f8.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import org.json.JSONArray;
import org.json.JSONObject;
import w7.e;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final Context f4517a;

    /* renamed from: b  reason: collision with root package name */
    public final t6.c f4518b;

    /* renamed from: c  reason: collision with root package name */
    public final Executor f4519c;
    public final d d;

    /* renamed from: e  reason: collision with root package name */
    public final d f4520e;

    /* renamed from: f  reason: collision with root package name */
    public final d f4521f;

    /* renamed from: g  reason: collision with root package name */
    public final a f4522g;

    /* renamed from: h  reason: collision with root package name */
    public final h f4523h;

    /* renamed from: i  reason: collision with root package name */
    public final b f4524i;

    /* renamed from: j  reason: collision with root package name */
    public final e f4525j;

    public c(Context context, e eVar, t6.c cVar, ExecutorService executorService, d dVar, d dVar2, d dVar3, a aVar, h hVar, b bVar) {
        this.f4517a = context;
        this.f4525j = eVar;
        this.f4518b = cVar;
        this.f4519c = executorService;
        this.d = dVar;
        this.f4520e = dVar2;
        this.f4521f = dVar3;
        this.f4522g = aVar;
        this.f4523h = hVar;
        this.f4524i = bVar;
    }

    public static ArrayList c(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = jSONArray.getJSONObject(i10);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.getString(next));
            }
            arrayList.add(hashMap);
        }
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0048 A[SYNTHETIC, Splitter:B:16:0x0048] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(java.lang.String r10) {
        /*
            r9 = this;
            f8.h r0 = r9.f4523h
            f8.d r1 = r0.f4922c
            f8.e r2 = f8.h.b(r1)
            r3 = 0
            if (r2 != 0) goto L_0x000d
        L_0x000b:
            r2 = r3
            goto L_0x0013
        L_0x000d:
            org.json.JSONObject r2 = r2.f4909b     // Catch:{ JSONException -> 0x000b }
            java.lang.String r2 = r2.getString(r10)     // Catch:{ JSONException -> 0x000b }
        L_0x0013:
            java.util.regex.Pattern r4 = f8.h.f4919f
            java.util.regex.Pattern r5 = f8.h.f4918e
            r6 = 0
            r7 = 1
            if (r2 == 0) goto L_0x003f
            java.util.regex.Matcher r8 = r5.matcher(r2)
            boolean r8 = r8.matches()
            if (r8 == 0) goto L_0x002d
            f8.e r1 = f8.h.b(r1)
            r0.a(r1, r10)
            goto L_0x005a
        L_0x002d:
            java.util.regex.Matcher r2 = r4.matcher(r2)
            boolean r2 = r2.matches()
            if (r2 == 0) goto L_0x003f
            f8.e r1 = f8.h.b(r1)
            r0.a(r1, r10)
            goto L_0x007b
        L_0x003f:
            f8.d r0 = r0.d
            f8.e r0 = f8.h.b(r0)
            if (r0 != 0) goto L_0x0048
            goto L_0x004e
        L_0x0048:
            org.json.JSONObject r0 = r0.f4909b     // Catch:{ JSONException -> 0x004e }
            java.lang.String r3 = r0.getString(r10)     // Catch:{ JSONException -> 0x004e }
        L_0x004e:
            if (r3 == 0) goto L_0x0067
            java.util.regex.Matcher r0 = r5.matcher(r3)
            boolean r0 = r0.matches()
            if (r0 == 0) goto L_0x005c
        L_0x005a:
            r6 = r7
            goto L_0x007b
        L_0x005c:
            java.util.regex.Matcher r0 = r4.matcher(r3)
            boolean r0 = r0.matches()
            if (r0 == 0) goto L_0x0067
            goto L_0x007b
        L_0x0067:
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "Boolean"
            r0[r6] = r1
            r0[r7] = r10
            java.lang.String r10 = "No value of type '%s' exists for parameter key '%s'."
            java.lang.String r10 = java.lang.String.format(r10, r0)
            java.lang.String r0 = "FirebaseRemoteConfig"
            android.util.Log.w(r0, r10)
        L_0x007b:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.c.a(java.lang.String):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long b(java.lang.String r7) {
        /*
            r6 = this;
            f8.h r0 = r6.f4523h
            f8.d r1 = r0.f4922c
            f8.e r2 = f8.h.b(r1)
            r3 = 0
            if (r2 != 0) goto L_0x000d
        L_0x000b:
            r2 = r3
            goto L_0x0017
        L_0x000d:
            org.json.JSONObject r2 = r2.f4909b     // Catch:{ JSONException -> 0x000b }
            long r4 = r2.getLong(r7)     // Catch:{ JSONException -> 0x000b }
            java.lang.Long r2 = java.lang.Long.valueOf(r4)     // Catch:{ JSONException -> 0x000b }
        L_0x0017:
            if (r2 == 0) goto L_0x0025
            f8.e r1 = f8.h.b(r1)
            r0.a(r1, r7)
            long r0 = r2.longValue()
            goto L_0x0057
        L_0x0025:
            f8.d r0 = r0.d
            f8.e r0 = f8.h.b(r0)
            if (r0 != 0) goto L_0x002e
            goto L_0x0038
        L_0x002e:
            org.json.JSONObject r0 = r0.f4909b     // Catch:{ JSONException -> 0x0038 }
            long r0 = r0.getLong(r7)     // Catch:{ JSONException -> 0x0038 }
            java.lang.Long r3 = java.lang.Long.valueOf(r0)     // Catch:{ JSONException -> 0x0038 }
        L_0x0038:
            if (r3 == 0) goto L_0x003f
            long r0 = r3.longValue()
            goto L_0x0057
        L_0x003f:
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            java.lang.String r2 = "Long"
            r0[r1] = r2
            r1 = 1
            r0[r1] = r7
            java.lang.String r7 = "No value of type '%s' exists for parameter key '%s'."
            java.lang.String r7 = java.lang.String.format(r7, r0)
            java.lang.String r0 = "FirebaseRemoteConfig"
            android.util.Log.w(r0, r7)
            r0 = 0
        L_0x0057:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.c.b(java.lang.String):long");
    }
}
