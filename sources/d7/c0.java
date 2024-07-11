package d7;

import android.util.Log;
import m5.j;
import s6.c;

public final class c0 {

    /* renamed from: a  reason: collision with root package name */
    public final c f4207a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f4208b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public final j<Void> f4209c = new j<>();
    public boolean d = false;

    /* renamed from: e  reason: collision with root package name */
    public final Boolean f4210e;

    /* renamed from: f  reason: collision with root package name */
    public final j<Void> f4211f = new j<>();

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0078  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public c0(s6.c r7) {
        /*
            r6 = this;
            r6.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r6.f4208b = r0
            m5.j r0 = new m5.j
            r0.<init>()
            r6.f4209c = r0
            r0 = 0
            r6.d = r0
            m5.j r1 = new m5.j
            r1.<init>()
            r6.f4211f = r1
            r7.a()
            android.content.Context r1 = r7.f8815a
            r6.f4207a = r7
            java.lang.String r7 = "com.google.firebase.crashlytics"
            android.content.SharedPreferences r7 = r1.getSharedPreferences(r7, r0)
            java.lang.String r2 = "firebase_crashlytics_collection_enabled"
            boolean r3 = r7.contains(r2)
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L_0x003d
            r6.d = r0
            boolean r7 = r7.getBoolean(r2, r4)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            goto L_0x003e
        L_0x003d:
            r7 = r5
        L_0x003e:
            if (r7 != 0) goto L_0x0084
            java.lang.String r7 = "firebase_crashlytics_collection_enabled"
            android.content.pm.PackageManager r2 = r1.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0069 }
            if (r2 == 0) goto L_0x0071
            java.lang.String r1 = r1.getPackageName()     // Catch:{ NameNotFoundException -> 0x0069 }
            r3 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r1 = r2.getApplicationInfo(r1, r3)     // Catch:{ NameNotFoundException -> 0x0069 }
            if (r1 == 0) goto L_0x0071
            android.os.Bundle r2 = r1.metaData     // Catch:{ NameNotFoundException -> 0x0069 }
            if (r2 == 0) goto L_0x0071
            boolean r2 = r2.containsKey(r7)     // Catch:{ NameNotFoundException -> 0x0069 }
            if (r2 == 0) goto L_0x0071
            android.os.Bundle r1 = r1.metaData     // Catch:{ NameNotFoundException -> 0x0069 }
            boolean r7 = r1.getBoolean(r7)     // Catch:{ NameNotFoundException -> 0x0069 }
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)     // Catch:{ NameNotFoundException -> 0x0069 }
            goto L_0x0072
        L_0x0069:
            r7 = move-exception
            java.lang.String r1 = "FirebaseCrashlytics"
            java.lang.String r2 = "Could not read data collection permission from manifest"
            android.util.Log.e(r1, r2, r7)
        L_0x0071:
            r7 = r5
        L_0x0072:
            if (r7 != 0) goto L_0x0078
            r6.d = r0
            r7 = r5
            goto L_0x0084
        L_0x0078:
            r6.d = r4
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r7 = r0.equals(r7)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
        L_0x0084:
            r6.f4210e = r7
            java.lang.Object r7 = r6.f4208b
            monitor-enter(r7)
            boolean r0 = r6.a()     // Catch:{ all -> 0x0096 }
            if (r0 == 0) goto L_0x0094
            m5.j<java.lang.Void> r0 = r6.f4209c     // Catch:{ all -> 0x0096 }
            r0.c(r5)     // Catch:{ all -> 0x0096 }
        L_0x0094:
            monitor-exit(r7)     // Catch:{ all -> 0x0096 }
            return
        L_0x0096:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0096 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: d7.c0.<init>(s6.c):void");
    }

    public final synchronized boolean a() {
        boolean booleanValue;
        Boolean bool = this.f4210e;
        booleanValue = bool != null ? bool.booleanValue() : this.f4207a.g();
        b(booleanValue);
        return booleanValue;
    }

    public final void b(boolean z) {
        String str;
        String str2;
        if (z) {
            str = "ENABLED";
        } else {
            str = "DISABLED";
        }
        if (this.f4210e == null) {
            str2 = "global Firebase setting";
        } else if (this.d) {
            str2 = "firebase_crashlytics_collection_enabled manifest flag";
        } else {
            str2 = "API";
        }
        boolean z10 = false;
        String format = String.format("Crashlytics automatic data collection %s by %s.", new Object[]{str, str2});
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            z10 = true;
        }
        if (z10) {
            Log.d("FirebaseCrashlytics", format, (Throwable) null);
        }
    }
}
