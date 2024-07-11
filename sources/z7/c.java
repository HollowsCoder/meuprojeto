package z7;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.JsonReader;
import android.util.Log;
import com.karumi.dexter.BuildConfig;
import d8.g;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import n4.m;
import org.json.JSONException;
import org.json.JSONObject;
import r4.a;
import t7.d;
import v7.b;
import w7.f;
import z7.d;
import z7.f;

public final class c {

    /* renamed from: e  reason: collision with root package name */
    public static final Pattern f9949e = Pattern.compile("[0-9]+s");

    /* renamed from: f  reason: collision with root package name */
    public static final Charset f9950f = Charset.forName("UTF-8");

    /* renamed from: a  reason: collision with root package name */
    public final Context f9951a;

    /* renamed from: b  reason: collision with root package name */
    public final b<g> f9952b;

    /* renamed from: c  reason: collision with root package name */
    public final b<d> f9953c;
    public final e d = new e();

    public c(Context context, b<g> bVar, b<d> bVar2) {
        this.f9951a = context;
        this.f9952b = bVar;
        this.f9953c = bVar2;
    }

    public static URL a(String str) {
        try {
            return new URL(String.format("https://%s/%s/%s", new Object[]{"firebaseinstallations.googleapis.com", "v1", str}));
        } catch (MalformedURLException e10) {
            String message = e10.getMessage();
            f.a aVar = f.a.BAD_CONFIG;
            throw new f(message);
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x004d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void b(java.net.HttpURLConnection r10, java.lang.String r11, java.lang.String r12, java.lang.String r13) {
        /*
            java.io.InputStream r0 = r10.getErrorStream()
            r1 = 2
            r2 = 1
            r3 = 0
            r4 = 3
            r5 = 0
            if (r0 != 0) goto L_0x000c
            goto L_0x0050
        L_0x000c:
            java.io.BufferedReader r6 = new java.io.BufferedReader
            java.io.InputStreamReader r7 = new java.io.InputStreamReader
            java.nio.charset.Charset r8 = f9950f
            r7.<init>(r0, r8)
            r6.<init>(r7)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x004d, all -> 0x0048 }
            r0.<init>()     // Catch:{ IOException -> 0x004d, all -> 0x0048 }
        L_0x001d:
            java.lang.String r7 = r6.readLine()     // Catch:{ IOException -> 0x004d, all -> 0x0048 }
            if (r7 == 0) goto L_0x002c
            r0.append(r7)     // Catch:{ IOException -> 0x004d, all -> 0x0048 }
            r7 = 10
            r0.append(r7)     // Catch:{ IOException -> 0x004d, all -> 0x0048 }
            goto L_0x001d
        L_0x002c:
            java.lang.String r7 = "Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]"
            java.lang.Object[] r8 = new java.lang.Object[r4]     // Catch:{ IOException -> 0x004d, all -> 0x0048 }
            int r9 = r10.getResponseCode()     // Catch:{ IOException -> 0x004d, all -> 0x0048 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ IOException -> 0x004d, all -> 0x0048 }
            r8[r3] = r9     // Catch:{ IOException -> 0x004d, all -> 0x0048 }
            java.lang.String r10 = r10.getResponseMessage()     // Catch:{ IOException -> 0x004d, all -> 0x0048 }
            r8[r2] = r10     // Catch:{ IOException -> 0x004d, all -> 0x0048 }
            r8[r1] = r0     // Catch:{ IOException -> 0x004d, all -> 0x0048 }
            java.lang.String r10 = java.lang.String.format(r7, r8)     // Catch:{ IOException -> 0x004d, all -> 0x0048 }
            r5 = r10
            goto L_0x004d
        L_0x0048:
            r10 = move-exception
            r6.close()     // Catch:{ IOException -> 0x004c }
        L_0x004c:
            throw r10
        L_0x004d:
            r6.close()     // Catch:{ IOException -> 0x0050 }
        L_0x0050:
            boolean r10 = android.text.TextUtils.isEmpty(r5)
            if (r10 != 0) goto L_0x007b
            java.lang.String r10 = "Firebase-Installations"
            android.util.Log.w(r10, r5)
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r0[r3] = r12
            r0[r2] = r13
            boolean r12 = android.text.TextUtils.isEmpty(r11)
            if (r12 == 0) goto L_0x006a
            java.lang.String r11 = ""
            goto L_0x0070
        L_0x006a:
            java.lang.String r12 = ", "
            java.lang.String r11 = androidx.appcompat.widget.x0.e(r12, r11)
        L_0x0070:
            r0[r1] = r11
            java.lang.String r11 = "Firebase options used while communicating with Firebase server APIs: %s, %s%s"
            java.lang.String r11 = java.lang.String.format(r11, r0)
            android.util.Log.w(r10, r11)
        L_0x007b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: z7.c.b(java.net.HttpURLConnection, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public static long d(String str) {
        m.a("Invalid Expiration Timestamp.", f9949e.matcher(str).matches());
        if (str == null || str.length() == 0) {
            return 0;
        }
        return Long.parseLong(str.substring(0, str.length() - 1));
    }

    public static a e(HttpURLConnection httpURLConnection) {
        String str;
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f9950f));
        Long l = 0L;
        jsonReader.beginObject();
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        b bVar = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("name")) {
                str3 = jsonReader.nextString();
            } else if (nextName.equals("fid")) {
                str4 = jsonReader.nextString();
            } else if (nextName.equals("refreshToken")) {
                str5 = jsonReader.nextString();
            } else if (nextName.equals("authToken")) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    if (nextName2.equals("token")) {
                        str2 = jsonReader.nextString();
                    } else if (nextName2.equals("expiresIn")) {
                        l = Long.valueOf(d(jsonReader.nextString()));
                    } else {
                        jsonReader.skipValue();
                    }
                }
                if (l == null) {
                    str = " tokenExpirationTimestamp";
                } else {
                    str = BuildConfig.FLAVOR;
                }
                if (str.isEmpty()) {
                    bVar = new b(str2, l.longValue(), (f.b) null);
                    jsonReader.endObject();
                } else {
                    throw new IllegalStateException("Missing required properties:".concat(str));
                }
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return new a(str3, str4, str5, bVar, d.a.OK);
    }

    public static b f(HttpURLConnection httpURLConnection) {
        String str;
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f9950f));
        Long l = 0L;
        jsonReader.beginObject();
        String str2 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("token")) {
                str2 = jsonReader.nextString();
            } else if (nextName.equals("expiresIn")) {
                l = Long.valueOf(d(jsonReader.nextString()));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        f.b bVar = f.b.OK;
        if (l == null) {
            str = " tokenExpirationTimestamp";
        } else {
            str = BuildConfig.FLAVOR;
        }
        if (str.isEmpty()) {
            return new b(str2, l.longValue(), bVar);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public static void g(HttpURLConnection httpURLConnection, String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fid", str);
            jSONObject.put("appId", str2);
            jSONObject.put("authVersion", "FIS_v2");
            jSONObject.put("sdkVersion", "a:17.0.0");
            i(httpURLConnection, jSONObject.toString().getBytes("UTF-8"));
        } catch (JSONException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public static void h(HttpURLConnection httpURLConnection) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sdkVersion", "a:17.0.0");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("installation", jSONObject);
            i(httpURLConnection, jSONObject2.toString().getBytes("UTF-8"));
        } catch (JSONException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public static void i(URLConnection uRLConnection, byte[] bArr) {
        OutputStream outputStream = uRLConnection.getOutputStream();
        if (outputStream != null) {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
            try {
                gZIPOutputStream.write(bArr);
            } finally {
                try {
                    gZIPOutputStream.close();
                    outputStream.close();
                } catch (IOException unused) {
                }
            }
        } else {
            throw new IOException("Cannot send request to FIS servers. No OutputStream available.");
        }
    }

    public final HttpURLConnection c(URL url, String str) {
        String str2;
        d.a a10;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.addRequestProperty("Content-Type", "application/json");
            httpURLConnection.addRequestProperty("Accept", "application/json");
            httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
            httpURLConnection.addRequestProperty("Cache-Control", "no-cache");
            Context context = this.f9951a;
            httpURLConnection.addRequestProperty("X-Android-Package", context.getPackageName());
            b<t7.d> bVar = this.f9953c;
            if (bVar.get() != null) {
                b<g> bVar2 = this.f9952b;
                if (!(bVar2.get() == null || (a10 = bVar.get().a("fire-installations-id")) == d.a.NONE)) {
                    httpURLConnection.addRequestProperty("x-firebase-client", bVar2.get().a());
                    httpURLConnection.addRequestProperty("x-firebase-client-log-type", Integer.toString(a10.getCode()));
                }
            }
            try {
                byte[] a11 = a.a(context, context.getPackageName());
                if (a11 == null) {
                    Log.e("ContentValues", "Could not get fingerprint hash for package: " + context.getPackageName());
                    str2 = null;
                    httpURLConnection.addRequestProperty("X-Android-Cert", str2);
                    httpURLConnection.addRequestProperty("x-goog-api-key", str);
                    return httpURLConnection;
                }
                str2 = r4.f.a(a11);
                httpURLConnection.addRequestProperty("X-Android-Cert", str2);
                httpURLConnection.addRequestProperty("x-goog-api-key", str);
                return httpURLConnection;
            } catch (PackageManager.NameNotFoundException e10) {
                Log.e("ContentValues", "No such package: " + context.getPackageName(), e10);
            }
        } catch (IOException unused) {
            f.a aVar = f.a.BAD_CONFIG;
            throw new w7.f("Firebase Installations Service is unavailable. Please try again later.");
        }
    }
}
