package q1;

import android.os.Bundle;
import android.util.Log;
import b7.a;
import b8.m;
import com.google.android.gms.internal.measurement.r4;
import com.karumi.dexter.BuildConfig;
import h1.c;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.concurrent.ScheduledFuture;
import l7.e;
import m5.i;
import org.json.JSONObject;

public final class d implements r4, a, m5.a, m5.d {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ int f8212o;

    /* renamed from: p  reason: collision with root package name */
    public final Object f8213p;

    public d() {
        this.f8212o = 4;
        this.f8213p = new HashMap();
    }

    public static String a(String str, b bVar, boolean z) {
        StringBuilder sb = new StringBuilder("lottie_cache_");
        sb.append(str.replaceAll("\\W+", BuildConfig.FLAVOR));
        sb.append(z ? bVar.tempExtension() : bVar.extension);
        return sb.toString();
    }

    public final File b() {
        c cVar = (c) ((c) this.f8213p);
        cVar.getClass();
        File file = new File(cVar.f5112a.getCacheDir(), "lottie_network_cache");
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public final Object c(i iVar) {
        ((m) this.f8213p).getClass();
        Bundle bundle = (Bundle) iVar.j();
        if (bundle != null) {
            String string = bundle.getString("registration_id");
            if (string != null || (string = bundle.getString("unregistered")) != null) {
                return string;
            }
            String string2 = bundle.getString("error");
            if ("RST".equals(string2)) {
                throw new IOException("INSTANCE_ID_RESET");
            } else if (string2 != null) {
                throw new IOException(string2);
            } else {
                String obj = bundle.toString();
                Log.w("FirebaseMessaging", "Unexpected response: ".concat(obj), new Throwable());
                throw new IOException("SERVICE_NOT_AVAILABLE");
            }
        } else {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
    }

    public final e d(JSONObject jSONObject) {
        k7.e eVar;
        if (jSONObject.getInt("settings_version") != 3) {
            eVar = new q0.d(13);
        } else {
            eVar = new n.e(11);
        }
        return eVar.c((q0.d) this.f8213p, jSONObject);
    }

    public final File e(String str, InputStream inputStream, b bVar) {
        FileOutputStream fileOutputStream;
        File file = new File(b(), a(str, bVar, true));
        try {
            fileOutputStream = new FileOutputStream(file);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    inputStream.close();
                    return file;
                }
            }
        } catch (Throwable th) {
            inputStream.close();
            throw th;
        }
    }

    public final void f(i iVar) {
        ((ScheduledFuture) this.f8213p).cancel(false);
    }

    public final void i(Bundle bundle) {
        ((w6.a) this.f8213p).g("clx", "_ae", bundle);
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00c4 A[Catch:{ RuntimeException -> 0x00b6, all -> 0x019c }] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0196 A[Catch:{ RuntimeException -> 0x00b6, all -> 0x019c }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object zza() {
        /*
            r14 = this;
            int r0 = r14.f8212o
            r1 = 1
            r2 = 0
            java.lang.Object r3 = r14.f8213p
            switch(r0) {
                case 2: goto L_0x000a;
                default: goto L_0x0009;
            }
        L_0x0009:
            goto L_0x005c
        L_0x000a:
            com.google.android.gms.internal.measurement.b4 r3 = (com.google.android.gms.internal.measurement.b4) r3
            android.content.ContentResolver r4 = r3.f2629a
            android.net.Uri r5 = r3.f2630b
            java.lang.String[] r6 = com.google.android.gms.internal.measurement.b4.f2628h
            r7 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r0 = r4.query(r5, r6, r7, r8, r9)
            if (r0 != 0) goto L_0x0020
            java.util.Map r0 = java.util.Collections.emptyMap()
            goto L_0x0056
        L_0x0020:
            int r3 = r0.getCount()     // Catch:{ all -> 0x0057 }
            if (r3 != 0) goto L_0x002f
            java.util.Map r1 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x0057 }
            r0.close()
            r0 = r1
            goto L_0x0056
        L_0x002f:
            r4 = 256(0x100, float:3.59E-43)
            if (r3 > r4) goto L_0x0039
            n.b r4 = new n.b     // Catch:{ all -> 0x0057 }
            r4.<init>((int) r3)     // Catch:{ all -> 0x0057 }
            goto L_0x0040
        L_0x0039:
            java.util.HashMap r4 = new java.util.HashMap     // Catch:{ all -> 0x0057 }
            r5 = 1065353216(0x3f800000, float:1.0)
            r4.<init>(r3, r5)     // Catch:{ all -> 0x0057 }
        L_0x0040:
            boolean r3 = r0.moveToNext()     // Catch:{ all -> 0x0057 }
            if (r3 == 0) goto L_0x0052
            java.lang.String r3 = r0.getString(r2)     // Catch:{ all -> 0x0057 }
            java.lang.String r5 = r0.getString(r1)     // Catch:{ all -> 0x0057 }
            r4.put(r3, r5)     // Catch:{ all -> 0x0057 }
            goto L_0x0040
        L_0x0052:
            r0.close()
            r0 = r4
        L_0x0056:
            return r0
        L_0x0057:
            r1 = move-exception
            r0.close()
            throw r1
        L_0x005c:
            java.lang.String r0 = "HermeticFileOverrides"
            android.content.Context r3 = (android.content.Context) r3
            java.lang.Object r4 = com.google.android.gms.internal.measurement.m4.f2821f
            java.lang.String r4 = android.os.Build.TYPE
            java.lang.String r5 = android.os.Build.TAGS
            java.lang.String r6 = "eng"
            boolean r6 = r4.equals(r6)
            if (r6 != 0) goto L_0x0077
            java.lang.String r6 = "userdebug"
            boolean r4 = r4.equals(r6)
            if (r4 != 0) goto L_0x0077
            goto L_0x0088
        L_0x0077:
            java.lang.String r4 = "dev-keys"
            boolean r4 = r5.contains(r4)
            if (r4 != 0) goto L_0x008c
            java.lang.String r4 = "test-keys"
            boolean r4 = r5.contains(r4)
            if (r4 == 0) goto L_0x0088
            goto L_0x008c
        L_0x0088:
            com.google.android.gms.internal.measurement.o4<java.lang.Object> r0 = com.google.android.gms.internal.measurement.o4.f2858o
            goto L_0x019b
        L_0x008c:
            boolean r4 = r3.isDeviceProtectedStorage()
            if (r4 != 0) goto L_0x0096
            android.content.Context r3 = r3.createDeviceProtectedStorageContext()
        L_0x0096:
            android.os.StrictMode$ThreadPolicy r4 = android.os.StrictMode.allowThreadDiskReads()
            android.os.StrictMode.allowThreadDiskWrites()     // Catch:{ all -> 0x019c }
            java.io.File r5 = new java.io.File     // Catch:{ RuntimeException -> 0x00b6 }
            java.lang.String r6 = "phenotype_hermetic"
            java.io.File r3 = r3.getDir(r6, r2)     // Catch:{ RuntimeException -> 0x00b6 }
            java.lang.String r6 = "overrides.txt"
            r5.<init>(r3, r6)     // Catch:{ RuntimeException -> 0x00b6 }
            boolean r3 = r5.exists()     // Catch:{ all -> 0x019c }
            if (r3 == 0) goto L_0x00bc
            com.google.android.gms.internal.measurement.q4 r3 = new com.google.android.gms.internal.measurement.q4     // Catch:{ all -> 0x019c }
            r3.<init>(r5)     // Catch:{ all -> 0x019c }
            goto L_0x00be
        L_0x00b6:
            r3 = move-exception
            java.lang.String r5 = "no data dir"
            android.util.Log.e(r0, r5, r3)     // Catch:{ all -> 0x019c }
        L_0x00bc:
            com.google.android.gms.internal.measurement.o4<java.lang.Object> r3 = com.google.android.gms.internal.measurement.o4.f2858o     // Catch:{ all -> 0x019c }
        L_0x00be:
            boolean r5 = r3.a()     // Catch:{ all -> 0x019c }
            if (r5 == 0) goto L_0x0196
            java.lang.Object r3 = r3.b()     // Catch:{ all -> 0x019c }
            java.io.File r3 = (java.io.File) r3     // Catch:{ all -> 0x019c }
            java.io.BufferedReader r5 = new java.io.BufferedReader     // Catch:{ IOException -> 0x018f }
            java.io.InputStreamReader r6 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x018f }
            java.io.FileInputStream r7 = new java.io.FileInputStream     // Catch:{ IOException -> 0x018f }
            r7.<init>(r3)     // Catch:{ IOException -> 0x018f }
            r6.<init>(r7)     // Catch:{ IOException -> 0x018f }
            r5.<init>(r6)     // Catch:{ IOException -> 0x018f }
            java.util.HashMap r6 = new java.util.HashMap     // Catch:{ all -> 0x0183 }
            r6.<init>()     // Catch:{ all -> 0x0183 }
            java.util.HashMap r7 = new java.util.HashMap     // Catch:{ all -> 0x0183 }
            r7.<init>()     // Catch:{ all -> 0x0183 }
        L_0x00e3:
            java.lang.String r8 = r5.readLine()     // Catch:{ all -> 0x0183 }
            if (r8 == 0) goto L_0x0156
            java.lang.String r9 = " "
            r10 = 3
            java.lang.String[] r9 = r8.split(r9, r10)     // Catch:{ all -> 0x0183 }
            int r11 = r9.length     // Catch:{ all -> 0x0183 }
            if (r11 == r10) goto L_0x0109
            java.lang.String r9 = "Invalid: "
            int r10 = r8.length()     // Catch:{ all -> 0x0183 }
            if (r10 == 0) goto L_0x0100
            java.lang.String r8 = r9.concat(r8)     // Catch:{ all -> 0x0183 }
            goto L_0x0105
        L_0x0100:
            java.lang.String r8 = new java.lang.String     // Catch:{ all -> 0x0183 }
            r8.<init>(r9)     // Catch:{ all -> 0x0183 }
        L_0x0105:
            android.util.Log.e(r0, r8)     // Catch:{ all -> 0x0183 }
            goto L_0x00e3
        L_0x0109:
            r8 = r9[r2]     // Catch:{ all -> 0x0183 }
            java.lang.String r10 = new java.lang.String     // Catch:{ all -> 0x0183 }
            r10.<init>(r8)     // Catch:{ all -> 0x0183 }
            r8 = r9[r1]     // Catch:{ all -> 0x0183 }
            java.lang.String r11 = new java.lang.String     // Catch:{ all -> 0x0183 }
            r11.<init>(r8)     // Catch:{ all -> 0x0183 }
            java.lang.String r8 = android.net.Uri.decode(r11)     // Catch:{ all -> 0x0183 }
            r11 = 2
            r12 = r9[r11]     // Catch:{ all -> 0x0183 }
            java.lang.Object r12 = r7.get(r12)     // Catch:{ all -> 0x0183 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x0183 }
            if (r12 != 0) goto L_0x013e
            r9 = r9[r11]     // Catch:{ all -> 0x0183 }
            java.lang.String r11 = new java.lang.String     // Catch:{ all -> 0x0183 }
            r11.<init>(r9)     // Catch:{ all -> 0x0183 }
            java.lang.String r12 = android.net.Uri.decode(r11)     // Catch:{ all -> 0x0183 }
            int r9 = r12.length()     // Catch:{ all -> 0x0183 }
            r13 = 1024(0x400, float:1.435E-42)
            if (r9 < r13) goto L_0x013b
            if (r12 != r11) goto L_0x013e
        L_0x013b:
            r7.put(r11, r12)     // Catch:{ all -> 0x0183 }
        L_0x013e:
            boolean r9 = r6.containsKey(r10)     // Catch:{ all -> 0x0183 }
            if (r9 != 0) goto L_0x014c
            java.util.HashMap r9 = new java.util.HashMap     // Catch:{ all -> 0x0183 }
            r9.<init>()     // Catch:{ all -> 0x0183 }
            r6.put(r10, r9)     // Catch:{ all -> 0x0183 }
        L_0x014c:
            java.lang.Object r9 = r6.get(r10)     // Catch:{ all -> 0x0183 }
            java.util.Map r9 = (java.util.Map) r9     // Catch:{ all -> 0x0183 }
            r9.put(r8, r12)     // Catch:{ all -> 0x0183 }
            goto L_0x00e3
        L_0x0156:
            java.lang.String r1 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x0183 }
            int r2 = r1.length()     // Catch:{ all -> 0x0183 }
            int r2 = r2 + 7
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0183 }
            r3.<init>(r2)     // Catch:{ all -> 0x0183 }
            java.lang.String r2 = "Parsed "
            r3.append(r2)     // Catch:{ all -> 0x0183 }
            r3.append(r1)     // Catch:{ all -> 0x0183 }
            java.lang.String r1 = r3.toString()     // Catch:{ all -> 0x0183 }
            android.util.Log.i(r0, r1)     // Catch:{ all -> 0x0183 }
            com.google.android.gms.internal.measurement.e4 r0 = new com.google.android.gms.internal.measurement.e4     // Catch:{ all -> 0x0183 }
            r0.<init>(r6)     // Catch:{ all -> 0x0183 }
            r5.close()     // Catch:{ IOException -> 0x018f }
            com.google.android.gms.internal.measurement.q4 r1 = new com.google.android.gms.internal.measurement.q4     // Catch:{ all -> 0x019c }
            r1.<init>(r0)     // Catch:{ all -> 0x019c }
            r0 = r1
            goto L_0x0198
        L_0x0183:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x0188 }
            goto L_0x018e
        L_0x0188:
            r1 = move-exception
            androidx.activity.result.c r2 = com.google.android.gms.internal.measurement.z4.f3021a     // Catch:{ IOException -> 0x018f }
            r2.x(r0, r1)     // Catch:{ IOException -> 0x018f }
        L_0x018e:
            throw r0     // Catch:{ IOException -> 0x018f }
        L_0x018f:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ all -> 0x019c }
            r1.<init>(r0)     // Catch:{ all -> 0x019c }
            throw r1     // Catch:{ all -> 0x019c }
        L_0x0196:
            com.google.android.gms.internal.measurement.o4<java.lang.Object> r0 = com.google.android.gms.internal.measurement.o4.f2858o     // Catch:{ all -> 0x019c }
        L_0x0198:
            android.os.StrictMode.setThreadPolicy(r4)
        L_0x019b:
            return r0
        L_0x019c:
            r0 = move-exception
            android.os.StrictMode.setThreadPolicy(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.d.zza():java.lang.Object");
    }

    public /* synthetic */ d(int i10, Object obj) {
        this.f8212o = i10;
        this.f8213p = obj;
    }
}
