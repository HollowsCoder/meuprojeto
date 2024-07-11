package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import e8.d;
import e8.e;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

public class ConfigFetchHttpClient {

    /* renamed from: h  reason: collision with root package name */
    public static final Pattern f3723h = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");

    /* renamed from: a  reason: collision with root package name */
    public final Context f3724a;

    /* renamed from: b  reason: collision with root package name */
    public final String f3725b;

    /* renamed from: c  reason: collision with root package name */
    public final String f3726c;
    public final String d;

    /* renamed from: e  reason: collision with root package name */
    public final String f3727e;

    /* renamed from: f  reason: collision with root package name */
    public final long f3728f;

    /* renamed from: g  reason: collision with root package name */
    public final long f3729g;

    public ConfigFetchHttpClient(Context context, String str, String str2, long j8, long j10) {
        String str3;
        this.f3724a = context;
        this.f3725b = str;
        this.f3726c = str2;
        Matcher matcher = f3723h.matcher(str);
        if (matcher.matches()) {
            str3 = matcher.group(1);
        } else {
            str3 = null;
        }
        this.d = str3;
        this.f3727e = "firebase";
        this.f3728f = j8;
        this.f3729g = j10;
    }

    public static JSONObject c(URLConnection uRLConnection) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(uRLConnection.getInputStream(), "utf-8"));
        StringBuilder sb = new StringBuilder();
        while (true) {
            int read = bufferedReader.read();
            if (read == -1) {
                return new JSONObject(sb.toString());
            }
            sb.append((char) read);
        }
    }

    public static void d(HttpURLConnection httpURLConnection, byte[] bArr) {
        httpURLConnection.setFixedLengthStreamingMode(bArr.length);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
        bufferedOutputStream.write(bArr);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }

    public final JSONObject a(String str, String str2, Map<String, String> map) {
        long j8;
        HashMap hashMap = new HashMap();
        if (str != null) {
            hashMap.put("appInstanceId", str);
            hashMap.put("appInstanceIdToken", str2);
            hashMap.put("appId", this.f3725b);
            Context context = this.f3724a;
            Locale locale = context.getResources().getConfiguration().locale;
            hashMap.put("countryCode", locale.getCountry());
            int i10 = Build.VERSION.SDK_INT;
            hashMap.put("languageCode", locale.toLanguageTag());
            hashMap.put("platformVersion", Integer.toString(i10));
            hashMap.put("timeZone", TimeZone.getDefault().getID());
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
                if (packageInfo != null) {
                    hashMap.put("appVersion", packageInfo.versionName);
                    if (i10 >= 28) {
                        j8 = packageInfo.getLongVersionCode();
                    } else {
                        j8 = (long) packageInfo.versionCode;
                    }
                    hashMap.put("appBuild", Long.toString(j8));
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            hashMap.put("packageName", context.getPackageName());
            hashMap.put("sdkVersion", "21.0.0");
            hashMap.put("analyticsUserProperties", new JSONObject(map));
            return new JSONObject(hashMap);
        }
        throw new d("Fetch failed: Firebase installation id is null.");
    }

    public final HttpURLConnection b() {
        try {
            return (HttpURLConnection) new URL(String.format("https://firebaseremoteconfig.googleapis.com/v1/projects/%s/namespaces/%s:fetch", new Object[]{this.d, this.f3727e})).openConnection();
        } catch (IOException e10) {
            throw new e(e10.getMessage());
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(17:30|31|32|33|34|(3:38|39|40)|41|(2:43|44)|(3:48|49|50)|51|53|54|(3:57|58|59)|60|61|62|63) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:60:0x0145 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x009b A[LOOP:0: B:10:0x0095->B:12:0x009b, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x00cd A[Catch:{ IOException | JSONException -> 0x0164, all -> 0x016f }] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x015a A[SYNTHETIC, Splitter:B:67:0x015a] */
    @androidx.annotation.Keep
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.firebase.remoteconfig.internal.a.C0043a fetch(java.net.HttpURLConnection r7, java.lang.String r8, java.lang.String r9, java.util.Map<java.lang.String, java.lang.String> r10, java.lang.String r11, java.util.Map<java.lang.String, java.lang.String> r12, java.util.Date r13) {
        /*
            r6 = this;
            r0 = 1
            r7.setDoOutput(r0)
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS
            long r2 = r6.f3728f
            long r2 = r1.toMillis(r2)
            int r2 = (int) r2
            r7.setConnectTimeout(r2)
            long r2 = r6.f3729g
            long r1 = r1.toMillis(r2)
            int r1 = (int) r1
            r7.setReadTimeout(r1)
            java.lang.String r1 = "If-None-Match"
            r7.setRequestProperty(r1, r11)
            java.lang.String r11 = "X-Goog-Api-Key"
            java.lang.String r1 = r6.f3726c
            r7.setRequestProperty(r11, r1)
            android.content.Context r11 = r6.f3724a
            java.lang.String r1 = r11.getPackageName()
            java.lang.String r2 = "X-Android-Package"
            r7.setRequestProperty(r2, r1)
            java.lang.String r1 = "FirebaseRemoteConfig"
            java.lang.String r2 = "Could not get fingerprint hash for package: "
            r3 = 0
            java.lang.String r4 = r11.getPackageName()     // Catch:{ NameNotFoundException -> 0x0059 }
            byte[] r4 = r4.a.a(r11, r4)     // Catch:{ NameNotFoundException -> 0x0059 }
            if (r4 != 0) goto L_0x0054
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ NameNotFoundException -> 0x0059 }
            r4.<init>(r2)     // Catch:{ NameNotFoundException -> 0x0059 }
            java.lang.String r2 = r11.getPackageName()     // Catch:{ NameNotFoundException -> 0x0059 }
            r4.append(r2)     // Catch:{ NameNotFoundException -> 0x0059 }
            java.lang.String r2 = r4.toString()     // Catch:{ NameNotFoundException -> 0x0059 }
            android.util.Log.e(r1, r2)     // Catch:{ NameNotFoundException -> 0x0059 }
            goto L_0x006f
        L_0x0054:
            java.lang.String r11 = r4.f.a(r4)     // Catch:{ NameNotFoundException -> 0x0059 }
            goto L_0x0070
        L_0x0059:
            r2 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "No such package: "
            r4.<init>(r5)
            java.lang.String r11 = r11.getPackageName()
            r4.append(r11)
            java.lang.String r11 = r4.toString()
            android.util.Log.e(r1, r11, r2)
        L_0x006f:
            r11 = r3
        L_0x0070:
            java.lang.String r1 = "X-Android-Cert"
            r7.setRequestProperty(r1, r11)
            java.lang.String r11 = "X-Google-GFE-Can-Retry"
            java.lang.String r1 = "yes"
            r7.setRequestProperty(r11, r1)
            java.lang.String r11 = "X-Goog-Firebase-Installations-Auth"
            r7.setRequestProperty(r11, r9)
            java.lang.String r11 = "Content-Type"
            java.lang.String r1 = "application/json"
            r7.setRequestProperty(r11, r1)
            java.lang.String r11 = "Accept"
            r7.setRequestProperty(r11, r1)
            java.util.Set r11 = r12.entrySet()
            java.util.Iterator r11 = r11.iterator()
        L_0x0095:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x00b1
            java.lang.Object r12 = r11.next()
            java.util.Map$Entry r12 = (java.util.Map.Entry) r12
            java.lang.Object r1 = r12.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r12 = r12.getValue()
            java.lang.String r12 = (java.lang.String) r12
            r7.setRequestProperty(r1, r12)
            goto L_0x0095
        L_0x00b1:
            org.json.JSONObject r8 = r6.a(r8, r9, r10)     // Catch:{ IOException -> 0x0166, JSONException -> 0x0164 }
            java.lang.String r8 = r8.toString()     // Catch:{ IOException -> 0x0166, JSONException -> 0x0164 }
            java.lang.String r9 = "utf-8"
            byte[] r8 = r8.getBytes(r9)     // Catch:{ IOException -> 0x0166, JSONException -> 0x0164 }
            d(r7, r8)     // Catch:{ IOException -> 0x0166, JSONException -> 0x0164 }
            r7.connect()     // Catch:{ IOException -> 0x0166, JSONException -> 0x0164 }
            int r8 = r7.getResponseCode()     // Catch:{ IOException -> 0x0166, JSONException -> 0x0164 }
            r9 = 200(0xc8, float:2.8E-43)
            if (r8 != r9) goto L_0x015a
            java.lang.String r8 = "ETag"
            java.lang.String r8 = r7.getHeaderField(r8)     // Catch:{ IOException -> 0x0166, JSONException -> 0x0164 }
            org.json.JSONObject r9 = c(r7)     // Catch:{ IOException -> 0x0166, JSONException -> 0x0164 }
            r7.disconnect()
            java.io.InputStream r7 = r7.getInputStream()     // Catch:{ IOException -> 0x00e1 }
            r7.close()     // Catch:{ IOException -> 0x00e1 }
        L_0x00e1:
            java.lang.String r7 = "state"
            java.lang.Object r7 = r9.get(r7)     // Catch:{ JSONException -> 0x00ef }
            java.lang.String r10 = "NO_CHANGE"
            boolean r7 = r7.equals(r10)     // Catch:{ JSONException -> 0x00ef }
            r7 = r7 ^ r0
            goto L_0x00f0
        L_0x00ef:
            r7 = r0
        L_0x00f0:
            if (r7 != 0) goto L_0x00f8
            com.google.firebase.remoteconfig.internal.a$a r7 = new com.google.firebase.remoteconfig.internal.a$a
            r7.<init>(r0, r3, r3)
            return r7
        L_0x00f8:
            java.util.Date r7 = f8.e.f4907f     // Catch:{ JSONException -> 0x0151 }
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0151 }
            r7.<init>()     // Catch:{ JSONException -> 0x0151 }
            java.util.Date r10 = f8.e.f4907f     // Catch:{ JSONException -> 0x0151 }
            org.json.JSONArray r10 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0151 }
            r10.<init>()     // Catch:{ JSONException -> 0x0151 }
            org.json.JSONObject r11 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0151 }
            r11.<init>()     // Catch:{ JSONException -> 0x0151 }
            java.lang.String r12 = "entries"
            org.json.JSONObject r12 = r9.getJSONObject(r12)     // Catch:{ JSONException -> 0x0112 }
            goto L_0x0113
        L_0x0112:
            r12 = r3
        L_0x0113:
            if (r12 == 0) goto L_0x011f
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ JSONException -> 0x011f }
            java.lang.String r12 = r12.toString()     // Catch:{ JSONException -> 0x011f }
            r0.<init>(r12)     // Catch:{ JSONException -> 0x011f }
            r7 = r0
        L_0x011f:
            java.lang.String r12 = "experimentDescriptions"
            org.json.JSONArray r12 = r9.getJSONArray(r12)     // Catch:{ JSONException -> 0x0126 }
            goto L_0x0127
        L_0x0126:
            r12 = r3
        L_0x0127:
            if (r12 == 0) goto L_0x0133
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0133 }
            java.lang.String r12 = r12.toString()     // Catch:{ JSONException -> 0x0133 }
            r0.<init>(r12)     // Catch:{ JSONException -> 0x0133 }
            r10 = r0
        L_0x0133:
            java.lang.String r12 = "personalizationMetadata"
            org.json.JSONObject r3 = r9.getJSONObject(r12)     // Catch:{ JSONException -> 0x0139 }
        L_0x0139:
            if (r3 == 0) goto L_0x0145
            org.json.JSONObject r9 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0145 }
            java.lang.String r12 = r3.toString()     // Catch:{ JSONException -> 0x0145 }
            r9.<init>(r12)     // Catch:{ JSONException -> 0x0145 }
            r11 = r9
        L_0x0145:
            f8.e r9 = new f8.e     // Catch:{ JSONException -> 0x0151 }
            r9.<init>(r7, r13, r10, r11)     // Catch:{ JSONException -> 0x0151 }
            com.google.firebase.remoteconfig.internal.a$a r7 = new com.google.firebase.remoteconfig.internal.a$a
            r10 = 0
            r7.<init>(r10, r9, r8)
            return r7
        L_0x0151:
            r7 = move-exception
            e8.d r8 = new e8.d
            java.lang.String r9 = "Fetch failed: fetch response could not be parsed."
            r8.<init>(r9, r7)
            throw r8
        L_0x015a:
            e8.g r9 = new e8.g     // Catch:{ IOException -> 0x0166, JSONException -> 0x0164 }
            java.lang.String r10 = r7.getResponseMessage()     // Catch:{ IOException -> 0x0166, JSONException -> 0x0164 }
            r9.<init>(r10, r8)     // Catch:{ IOException -> 0x0166, JSONException -> 0x0164 }
            throw r9     // Catch:{ IOException -> 0x0166, JSONException -> 0x0164 }
        L_0x0164:
            r8 = move-exception
            goto L_0x0167
        L_0x0166:
            r8 = move-exception
        L_0x0167:
            e8.d r9 = new e8.d     // Catch:{ all -> 0x016f }
            java.lang.String r10 = "The client had an error while calling the backend!"
            r9.<init>(r10, r8)     // Catch:{ all -> 0x016f }
            throw r9     // Catch:{ all -> 0x016f }
        L_0x016f:
            r8 = move-exception
            r7.disconnect()
            java.io.InputStream r7 = r7.getInputStream()     // Catch:{ IOException -> 0x017a }
            r7.close()     // Catch:{ IOException -> 0x017a }
        L_0x017a:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient.fetch(java.net.HttpURLConnection, java.lang.String, java.lang.String, java.util.Map, java.lang.String, java.util.Map, java.util.Date):com.google.firebase.remoteconfig.internal.a$a");
    }
}
