package t4;

import android.content.Context;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static Context f8992a;

    /* renamed from: b  reason: collision with root package name */
    public static Boolean f8993b;

    /* JADX WARNING: Can't wrap try/catch for region: R(4:17|18|19|20) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x003d */
    @androidx.annotation.RecentlyNonNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized boolean a(@androidx.annotation.RecentlyNonNull android.content.Context r4) {
        /*
            java.lang.Class<t4.a> r0 = t4.a.class
            monitor-enter(r0)
            android.content.Context r1 = r4.getApplicationContext()     // Catch:{ all -> 0x004a }
            android.content.Context r2 = f8992a     // Catch:{ all -> 0x004a }
            if (r2 == 0) goto L_0x0017
            java.lang.Boolean r3 = f8993b     // Catch:{ all -> 0x004a }
            if (r3 == 0) goto L_0x0017
            if (r2 != r1) goto L_0x0017
            boolean r4 = r3.booleanValue()     // Catch:{ all -> 0x004a }
            monitor-exit(r0)
            return r4
        L_0x0017:
            r2 = 0
            f8993b = r2     // Catch:{ all -> 0x004a }
            boolean r2 = r4.g.a()     // Catch:{ all -> 0x004a }
            if (r2 == 0) goto L_0x002f
            android.content.pm.PackageManager r4 = r1.getPackageManager()     // Catch:{ all -> 0x004a }
            boolean r4 = r4.isInstantApp()     // Catch:{ all -> 0x004a }
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch:{ all -> 0x004a }
        L_0x002c:
            f8993b = r4     // Catch:{ all -> 0x004a }
            goto L_0x0040
        L_0x002f:
            java.lang.ClassLoader r4 = r4.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x003d }
            java.lang.String r2 = "com.google.android.instantapps.supervisor.InstantAppsRuntime"
            r4.loadClass(r2)     // Catch:{ ClassNotFoundException -> 0x003d }
            java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch:{ ClassNotFoundException -> 0x003d }
            f8993b = r4     // Catch:{ ClassNotFoundException -> 0x003d }
            goto L_0x0040
        L_0x003d:
            java.lang.Boolean r4 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x004a }
            goto L_0x002c
        L_0x0040:
            f8992a = r1     // Catch:{ all -> 0x004a }
            java.lang.Boolean r4 = f8993b     // Catch:{ all -> 0x004a }
            boolean r4 = r4.booleanValue()     // Catch:{ all -> 0x004a }
            monitor-exit(r0)
            return r4
        L_0x004a:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: t4.a.a(android.content.Context):boolean");
    }
}
