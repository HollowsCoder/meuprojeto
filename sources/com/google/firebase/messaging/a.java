package com.google.firebase.messaging;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final SharedPreferences f3719a;

    /* renamed from: com.google.firebase.messaging.a$a  reason: collision with other inner class name */
    public static class C0042a {
        public static final long d = TimeUnit.DAYS.toMillis(7);

        /* renamed from: a  reason: collision with root package name */
        public final String f3720a;

        /* renamed from: b  reason: collision with root package name */
        public final String f3721b;

        /* renamed from: c  reason: collision with root package name */
        public final long f3722c;

        public C0042a(long j8, String str, String str2) {
            this.f3720a = str;
            this.f3721b = str2;
            this.f3722c = j8;
        }

        public static String a(long j8, String str, String str2) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("token", str);
                jSONObject.put("appVersion", str2);
                jSONObject.put("timestamp", j8);
                return jSONObject.toString();
            } catch (JSONException e10) {
                Log.w("FirebaseMessaging", "Failed to encode token: ".concat(e10.toString()));
                return null;
            }
        }

        public static C0042a b(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (!str.startsWith("{")) {
                return new C0042a(0, str, (String) null);
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                return new C0042a(jSONObject.getLong("timestamp"), jSONObject.getString("token"), jSONObject.getString("appVersion"));
            } catch (JSONException e10) {
                Log.w("FirebaseMessaging", "Failed to parse token: ".concat(e10.toString()));
                return null;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004d, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0055, code lost:
        if (android.util.Log.isLoggable("FirebaseMessaging", 3) != false) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0057, code lost:
        r4 = java.lang.String.valueOf(r4.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0065, code lost:
        if (r4.length() != 0) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0067, code lost:
        r4 = "Error creating file in no backup dir: ".concat(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x006c, code lost:
        r4 = new java.lang.String("Error creating file in no backup dir: ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0071, code lost:
        android.util.Log.d("FirebaseMessaging", r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public a(android.content.Context r4) {
        /*
            r3 = this;
            r3.<init>()
            java.lang.String r0 = "com.google.android.gms.appid"
            r1 = 0
            android.content.SharedPreferences r0 = r4.getSharedPreferences(r0, r1)
            r3.f3719a = r0
            java.lang.Object r1 = y.a.f9523a
            java.io.File r4 = y.a.c.c(r4)
            java.io.File r1 = new java.io.File
            java.lang.String r2 = "com.google.android.gms.appid-no-backup"
            r1.<init>(r4, r2)
            boolean r4 = r1.exists()
            if (r4 == 0) goto L_0x0020
            goto L_0x0076
        L_0x0020:
            boolean r4 = r1.createNewFile()     // Catch:{ IOException -> 0x004d }
            if (r4 == 0) goto L_0x0076
            monitor-enter(r3)     // Catch:{ IOException -> 0x004d }
            java.util.Map r4 = r0.getAll()     // Catch:{ all -> 0x004a }
            boolean r4 = r4.isEmpty()     // Catch:{ all -> 0x004a }
            monitor-exit(r3)     // Catch:{ IOException -> 0x004d }
            if (r4 != 0) goto L_0x0076
            java.lang.String r4 = "FirebaseMessaging"
            java.lang.String r1 = "App restored, clearing state"
            android.util.Log.i(r4, r1)     // Catch:{ IOException -> 0x004d }
            monitor-enter(r3)     // Catch:{ IOException -> 0x004d }
            android.content.SharedPreferences$Editor r4 = r0.edit()     // Catch:{ all -> 0x0047 }
            android.content.SharedPreferences$Editor r4 = r4.clear()     // Catch:{ all -> 0x0047 }
            r4.commit()     // Catch:{ all -> 0x0047 }
            monitor-exit(r3)     // Catch:{ IOException -> 0x004d }
            goto L_0x0076
        L_0x0047:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ IOException -> 0x004d }
            throw r4     // Catch:{ IOException -> 0x004d }
        L_0x004a:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ IOException -> 0x004d }
            throw r4     // Catch:{ IOException -> 0x004d }
        L_0x004d:
            r4 = move-exception
            java.lang.String r0 = "FirebaseMessaging"
            r1 = 3
            boolean r0 = android.util.Log.isLoggable(r0, r1)
            if (r0 == 0) goto L_0x0076
            java.lang.String r4 = r4.getMessage()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r0 = "Error creating file in no backup dir: "
            int r1 = r4.length()
            if (r1 == 0) goto L_0x006c
            java.lang.String r4 = r0.concat(r4)
            goto L_0x0071
        L_0x006c:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r0)
        L_0x0071:
            java.lang.String r0 = "FirebaseMessaging"
            android.util.Log.d(r0, r4)
        L_0x0076:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.a.<init>(android.content.Context):void");
    }

    public static String a(String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 5 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("|T|");
        sb.append(str2);
        sb.append("|*");
        return sb.toString();
    }
}
