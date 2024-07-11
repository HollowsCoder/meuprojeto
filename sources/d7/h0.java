package d7;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.karumi.dexter.BuildConfig;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Pattern;
import w7.e;

public final class h0 implements i0 {

    /* renamed from: g  reason: collision with root package name */
    public static final Pattern f4231g = Pattern.compile("[^\\p{Alnum}]");

    /* renamed from: h  reason: collision with root package name */
    public static final String f4232h = Pattern.quote("/");

    /* renamed from: a  reason: collision with root package name */
    public final j0 f4233a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f4234b;

    /* renamed from: c  reason: collision with root package name */
    public final String f4235c;
    public final e d;

    /* renamed from: e  reason: collision with root package name */
    public final c0 f4236e;

    /* renamed from: f  reason: collision with root package name */
    public String f4237f;

    public h0(Context context, String str, e eVar, c0 c0Var) {
        if (str != null) {
            this.f4234b = context;
            this.f4235c = str;
            this.d = eVar;
            this.f4236e = c0Var;
            this.f4233a = new j0();
            return;
        }
        throw new IllegalArgumentException("appIdentifier must not be null");
    }

    public static String b() {
        return "SYN_" + UUID.randomUUID().toString();
    }

    public final synchronized String a(String str, SharedPreferences sharedPreferences) {
        String str2;
        String uuid = UUID.randomUUID().toString();
        if (uuid == null) {
            str2 = null;
        } else {
            str2 = f4231g.matcher(uuid).replaceAll(BuildConfig.FLAVOR).toLowerCase(Locale.US);
        }
        String str3 = "Created new Crashlytics installation ID: " + str2 + " for FID: " + str;
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", str3, (Throwable) null);
        }
        sharedPreferences.edit().putString("crashlytics.installation.id", str2).putString("firebase.installation.id", str).apply();
        return str2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x00b5 A[Catch:{ Exception -> 0x005b }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00dc A[Catch:{ Exception -> 0x005b }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.lang.String c() {
        /*
            r9 = this;
            java.lang.String r0 = "Crashlytics installation ID: "
            java.lang.String r1 = "Fetched Firebase Installation ID: "
            java.lang.String r2 = "Cached Firebase Installation ID: "
            monitor-enter(r9)
            java.lang.String r3 = r9.f4237f     // Catch:{ all -> 0x00e5 }
            if (r3 == 0) goto L_0x000d
            monitor-exit(r9)
            return r3
        L_0x000d:
            java.lang.String r3 = "Determining Crashlytics installation ID..."
            java.lang.String r4 = "FirebaseCrashlytics"
            r5 = 2
            boolean r4 = android.util.Log.isLoggable(r4, r5)     // Catch:{ all -> 0x00e5 }
            r6 = 0
            if (r4 == 0) goto L_0x001e
            java.lang.String r4 = "FirebaseCrashlytics"
            android.util.Log.v(r4, r3, r6)     // Catch:{ all -> 0x00e5 }
        L_0x001e:
            android.content.Context r3 = r9.f4234b     // Catch:{ all -> 0x00e5 }
            java.lang.String r4 = "com.google.firebase.crashlytics"
            r7 = 0
            android.content.SharedPreferences r3 = r3.getSharedPreferences(r4, r7)     // Catch:{ all -> 0x00e5 }
            java.lang.String r4 = "firebase.installation.id"
            java.lang.String r4 = r3.getString(r4, r6)     // Catch:{ all -> 0x00e5 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e5 }
            r8.<init>(r2)     // Catch:{ all -> 0x00e5 }
            r8.append(r4)     // Catch:{ all -> 0x00e5 }
            java.lang.String r2 = r8.toString()     // Catch:{ all -> 0x00e5 }
            java.lang.String r8 = "FirebaseCrashlytics"
            boolean r8 = android.util.Log.isLoggable(r8, r5)     // Catch:{ all -> 0x00e5 }
            if (r8 == 0) goto L_0x0046
            java.lang.String r8 = "FirebaseCrashlytics"
            android.util.Log.v(r8, r2, r6)     // Catch:{ all -> 0x00e5 }
        L_0x0046:
            d7.c0 r2 = r9.f4236e     // Catch:{ all -> 0x00e5 }
            boolean r2 = r2.a()     // Catch:{ all -> 0x00e5 }
            if (r2 == 0) goto L_0x0099
            w7.e r2 = r9.d     // Catch:{ all -> 0x00e5 }
            m5.r r2 = r2.getId()     // Catch:{ all -> 0x00e5 }
            java.lang.Object r2 = d7.p0.a(r2)     // Catch:{ Exception -> 0x005b }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x005b }
            goto L_0x0064
        L_0x005b:
            r2 = move-exception
            java.lang.String r7 = "FirebaseCrashlytics"
            java.lang.String r8 = "Failed to retrieve Firebase Installations ID."
            android.util.Log.w(r7, r8, r2)     // Catch:{ all -> 0x00e5 }
            r2 = r6
        L_0x0064:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e5 }
            r7.<init>(r1)     // Catch:{ all -> 0x00e5 }
            r7.append(r2)     // Catch:{ all -> 0x00e5 }
            java.lang.String r1 = r7.toString()     // Catch:{ all -> 0x00e5 }
            java.lang.String r7 = "FirebaseCrashlytics"
            boolean r7 = android.util.Log.isLoggable(r7, r5)     // Catch:{ all -> 0x00e5 }
            if (r7 == 0) goto L_0x007d
            java.lang.String r7 = "FirebaseCrashlytics"
            android.util.Log.v(r7, r1, r6)     // Catch:{ all -> 0x00e5 }
        L_0x007d:
            if (r2 != 0) goto L_0x0087
            if (r4 != 0) goto L_0x0086
            java.lang.String r2 = b()     // Catch:{ all -> 0x00e5 }
            goto L_0x0087
        L_0x0086:
            r2 = r4
        L_0x0087:
            boolean r1 = r2.equals(r4)     // Catch:{ all -> 0x00e5 }
            if (r1 == 0) goto L_0x0094
            java.lang.String r1 = "crashlytics.installation.id"
        L_0x008f:
            java.lang.String r1 = r3.getString(r1, r6)     // Catch:{ all -> 0x00e5 }
            goto L_0x00b1
        L_0x0094:
            java.lang.String r1 = r9.a(r2, r3)     // Catch:{ all -> 0x00e5 }
            goto L_0x00b1
        L_0x0099:
            if (r4 == 0) goto L_0x00a4
            java.lang.String r1 = "SYN_"
            boolean r1 = r4.startsWith(r1)     // Catch:{ all -> 0x00e5 }
            if (r1 == 0) goto L_0x00a4
            r7 = 1
        L_0x00a4:
            if (r7 == 0) goto L_0x00a9
            java.lang.String r1 = "crashlytics.installation.id"
            goto L_0x008f
        L_0x00a9:
            java.lang.String r1 = b()     // Catch:{ all -> 0x00e5 }
            java.lang.String r1 = r9.a(r1, r3)     // Catch:{ all -> 0x00e5 }
        L_0x00b1:
            r9.f4237f = r1     // Catch:{ all -> 0x00e5 }
            if (r1 != 0) goto L_0x00c6
            java.lang.String r1 = "Unable to determine Crashlytics Install Id, creating a new one."
            java.lang.String r2 = "FirebaseCrashlytics"
            android.util.Log.w(r2, r1, r6)     // Catch:{ all -> 0x00e5 }
            java.lang.String r1 = b()     // Catch:{ all -> 0x00e5 }
            java.lang.String r1 = r9.a(r1, r3)     // Catch:{ all -> 0x00e5 }
            r9.f4237f = r1     // Catch:{ all -> 0x00e5 }
        L_0x00c6:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e5 }
            r1.<init>(r0)     // Catch:{ all -> 0x00e5 }
            java.lang.String r0 = r9.f4237f     // Catch:{ all -> 0x00e5 }
            r1.append(r0)     // Catch:{ all -> 0x00e5 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00e5 }
            java.lang.String r1 = "FirebaseCrashlytics"
            boolean r1 = android.util.Log.isLoggable(r1, r5)     // Catch:{ all -> 0x00e5 }
            if (r1 == 0) goto L_0x00e1
            java.lang.String r1 = "FirebaseCrashlytics"
            android.util.Log.v(r1, r0, r6)     // Catch:{ all -> 0x00e5 }
        L_0x00e1:
            java.lang.String r0 = r9.f4237f     // Catch:{ all -> 0x00e5 }
            monitor-exit(r9)
            return r0
        L_0x00e5:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: d7.h0.c():java.lang.String");
    }

    public final String d() {
        String str;
        j0 j0Var = this.f4233a;
        Context context = this.f4234b;
        synchronized (j0Var) {
            if (j0Var.f4239b == null) {
                String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                if (installerPackageName == null) {
                    installerPackageName = BuildConfig.FLAVOR;
                }
                j0Var.f4239b = installerPackageName;
            }
            if (BuildConfig.FLAVOR.equals(j0Var.f4239b)) {
                str = null;
            } else {
                str = j0Var.f4239b;
            }
        }
        return str;
    }
}
