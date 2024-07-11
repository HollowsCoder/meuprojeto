package d7;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Debug;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;
import com.karumi.dexter.BuildConfig;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final char[] f4214a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: b  reason: collision with root package name */
    public static long f4215b = -1;

    public enum a {
        X86_32,
        X86_64,
        ARM_UNKNOWN,
        PPC,
        PPC64,
        ARMV6,
        ARMV7,
        UNKNOWN,
        ARMV7S,
        ARM64;
        
        private static final Map<String, a> matcher = null;

        /* access modifiers changed from: public */
        static {
            a aVar;
            a aVar2;
            a aVar3;
            a aVar4;
            HashMap hashMap = new HashMap(4);
            matcher = hashMap;
            hashMap.put("armeabi-v7a", aVar3);
            hashMap.put("armeabi", aVar2);
            hashMap.put("arm64-v8a", aVar4);
            hashMap.put("x86", aVar);
        }

        public static a getValue() {
            boolean z;
            String str = Build.CPU_ABI;
            if (TextUtils.isEmpty(str)) {
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    Log.v("FirebaseCrashlytics", "Architecture#getValue()::Build.CPU_ABI returned null or empty", (Throwable) null);
                }
                return UNKNOWN;
            }
            a aVar = matcher.get(str.toLowerCase(Locale.US));
            if (aVar == null) {
                return UNKNOWN;
            }
            return aVar;
        }
    }

    public static void a(Closeable closeable, String str) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e10) {
                Log.e("FirebaseCrashlytics", str, e10);
            }
        }
    }

    public static long b(String str, int i10, String str2) {
        return Long.parseLong(str.split(str2)[0].trim()) * ((long) i10);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v2, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r3v3 */
    /* JADX WARNING: type inference failed for: r3v4 */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String c(java.io.File r7) {
        /*
            java.lang.String r0 = "MemTotal"
            java.lang.String r1 = "Failed to close system file reader."
            boolean r2 = r7.exists()
            r3 = 0
            if (r2 == 0) goto L_0x005f
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ Exception -> 0x003d, all -> 0x003b }
            java.io.FileReader r4 = new java.io.FileReader     // Catch:{ Exception -> 0x003d, all -> 0x003b }
            r4.<init>(r7)     // Catch:{ Exception -> 0x003d, all -> 0x003b }
            r5 = 1024(0x400, float:1.435E-42)
            r2.<init>(r4, r5)     // Catch:{ Exception -> 0x003d, all -> 0x003b }
        L_0x0017:
            java.lang.String r4 = r2.readLine()     // Catch:{ Exception -> 0x0039 }
            if (r4 == 0) goto L_0x0055
            java.lang.String r5 = "\\s*:\\s*"
            java.util.regex.Pattern r5 = java.util.regex.Pattern.compile(r5)     // Catch:{ Exception -> 0x0039 }
            r6 = 2
            java.lang.String[] r4 = r5.split(r4, r6)     // Catch:{ Exception -> 0x0039 }
            int r5 = r4.length     // Catch:{ Exception -> 0x0039 }
            r6 = 1
            if (r5 <= r6) goto L_0x0017
            r5 = 0
            r5 = r4[r5]     // Catch:{ Exception -> 0x0039 }
            boolean r5 = r5.equals(r0)     // Catch:{ Exception -> 0x0039 }
            if (r5 == 0) goto L_0x0017
            r7 = r4[r6]     // Catch:{ Exception -> 0x0039 }
            r3 = r7
            goto L_0x0055
        L_0x0039:
            r0 = move-exception
            goto L_0x003f
        L_0x003b:
            r7 = move-exception
            goto L_0x005b
        L_0x003d:
            r0 = move-exception
            r2 = r3
        L_0x003f:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0059 }
            r4.<init>()     // Catch:{ all -> 0x0059 }
            java.lang.String r5 = "Error parsing "
            r4.append(r5)     // Catch:{ all -> 0x0059 }
            r4.append(r7)     // Catch:{ all -> 0x0059 }
            java.lang.String r7 = r4.toString()     // Catch:{ all -> 0x0059 }
            java.lang.String r4 = "FirebaseCrashlytics"
            android.util.Log.e(r4, r7, r0)     // Catch:{ all -> 0x0059 }
        L_0x0055:
            a(r2, r1)
            goto L_0x005f
        L_0x0059:
            r7 = move-exception
            r3 = r2
        L_0x005b:
            a(r3, r1)
            throw r7
        L_0x005f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: d7.e.c(java.io.File):java.lang.String");
    }

    public static int d(Context context) {
        boolean z;
        boolean i10 = i(context);
        if (j(context)) {
            i10 |= true;
        }
        if (Debug.isDebuggerConnected() || Debug.waitingForDebugger()) {
            z = true;
        } else {
            z = false;
        }
        return z ? i10 | true ? 1 : 0 : i10 ? 1 : 0;
    }

    public static String e(Context context) {
        int f10 = f(context, "com.google.firebase.crashlytics.mapping_file_id", "string");
        if (f10 == 0) {
            f10 = f(context, "com.crashlytics.android.build_id", "string");
        }
        if (f10 != 0) {
            return context.getResources().getString(f10);
        }
        return null;
    }

    public static int f(Context context, String str, String str2) {
        String str3;
        Resources resources = context.getResources();
        int i10 = context.getApplicationContext().getApplicationInfo().icon;
        if (i10 > 0) {
            try {
                str3 = context.getResources().getResourcePackageName(i10);
                if ("android".equals(str3)) {
                    str3 = context.getPackageName();
                }
            } catch (Resources.NotFoundException unused) {
            }
            return resources.getIdentifier(str, str2, str3);
        }
        str3 = context.getPackageName();
        return resources.getIdentifier(str, str2, str3);
    }

    public static synchronized long g() {
        long j8;
        long j10;
        synchronized (e.class) {
            if (f4215b == -1) {
                String c10 = c(new File("/proc/meminfo"));
                if (!TextUtils.isEmpty(c10)) {
                    String upperCase = c10.toUpperCase(Locale.US);
                    try {
                        if (upperCase.endsWith("KB")) {
                            j10 = b(upperCase, 1024, "KB");
                        } else if (upperCase.endsWith("MB")) {
                            j10 = b(upperCase, 1048576, "MB");
                        } else if (upperCase.endsWith("GB")) {
                            j10 = b(upperCase, 1073741824, "GB");
                        } else {
                            Log.w("FirebaseCrashlytics", "Unexpected meminfo format while computing RAM: ".concat(upperCase), (Throwable) null);
                        }
                    } catch (NumberFormatException e10) {
                        Log.e("FirebaseCrashlytics", "Unexpected meminfo format while computing RAM: " + upperCase, e10);
                    }
                    f4215b = j10;
                }
                j10 = 0;
                f4215b = j10;
            }
            j8 = f4215b;
        }
        return j8;
    }

    public static String h(byte[] bArr) {
        char[] cArr = new char[(bArr.length * 2)];
        for (int i10 = 0; i10 < bArr.length; i10++) {
            byte b10 = bArr[i10] & 255;
            int i11 = i10 * 2;
            char[] cArr2 = f4214a;
            cArr[i11] = cArr2[b10 >>> 4];
            cArr[i11 + 1] = cArr2[b10 & 15];
        }
        return new String(cArr);
    }

    public static boolean i(Context context) {
        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        if (!Build.PRODUCT.contains("sdk")) {
            String str = Build.HARDWARE;
            return str.contains("goldfish") || str.contains("ranchu") || string == null;
        }
    }

    public static boolean j(Context context) {
        boolean i10 = i(context);
        String str = Build.TAGS;
        if ((!i10 && str != null && str.contains("test-keys")) || new File("/system/app/Superuser.apk").exists()) {
            return true;
        }
        return !i10 && new File("/system/xbin/su").exists();
    }

    public static String k(String str) {
        byte[] bytes = str.getBytes();
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-1");
            instance.update(bytes);
            return h(instance.digest());
        } catch (NoSuchAlgorithmException e10) {
            Log.e("FirebaseCrashlytics", "Could not create hashing algorithm: SHA-1, returning empty string.", e10);
            return BuildConfig.FLAVOR;
        }
    }
}
