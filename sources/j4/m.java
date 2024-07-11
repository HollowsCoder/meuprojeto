package j4;

import android.content.Context;
import n4.n0;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public static volatile n0 f6555a;

    /* renamed from: b  reason: collision with root package name */
    public static final Object f6556b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public static Context f6557c;

    /* JADX WARNING: type inference failed for: r3v5, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static j4.v a(java.lang.String r5, j4.n r6, boolean r7, boolean r8) {
        /*
            r0 = 0
            n4.n0 r1 = f6555a     // Catch:{ a -> 0x007d }
            if (r1 != 0) goto L_0x0042
            android.content.Context r1 = f6557c     // Catch:{ a -> 0x007d }
            n4.m.h(r1)     // Catch:{ a -> 0x007d }
            java.lang.Object r1 = f6556b     // Catch:{ a -> 0x007d }
            monitor-enter(r1)     // Catch:{ a -> 0x007d }
            n4.n0 r2 = f6555a     // Catch:{ all -> 0x003f }
            if (r2 != 0) goto L_0x003d
            android.content.Context r2 = f6557c     // Catch:{ all -> 0x003f }
            com.google.android.gms.dynamite.c r3 = com.google.android.gms.dynamite.DynamiteModule.f2348j     // Catch:{ all -> 0x003f }
            java.lang.String r4 = "com.google.android.gms.googlecertificates"
            com.google.android.gms.dynamite.DynamiteModule r2 = com.google.android.gms.dynamite.DynamiteModule.c(r2, r3, r4)     // Catch:{ all -> 0x003f }
            java.lang.String r3 = "com.google.android.gms.common.GoogleCertificatesImpl"
            android.os.IBinder r2 = r2.b(r3)     // Catch:{ all -> 0x003f }
            int r3 = n4.m0.f7450a     // Catch:{ all -> 0x003f }
            if (r2 != 0) goto L_0x0027
            r2 = 0
            goto L_0x003b
        L_0x0027:
            java.lang.String r3 = "com.google.android.gms.common.internal.IGoogleCertificatesApi"
            android.os.IInterface r3 = r2.queryLocalInterface(r3)     // Catch:{ all -> 0x003f }
            boolean r4 = r3 instanceof n4.n0     // Catch:{ all -> 0x003f }
            if (r4 == 0) goto L_0x0035
            r2 = r3
            n4.n0 r2 = (n4.n0) r2     // Catch:{ all -> 0x003f }
            goto L_0x003b
        L_0x0035:
            n4.o0 r3 = new n4.o0     // Catch:{ all -> 0x003f }
            r3.<init>(r2)     // Catch:{ all -> 0x003f }
            r2 = r3
        L_0x003b:
            f6555a = r2     // Catch:{ all -> 0x003f }
        L_0x003d:
            monitor-exit(r1)     // Catch:{ all -> 0x003f }
            goto L_0x0042
        L_0x003f:
            r5 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x003f }
            throw r5     // Catch:{ a -> 0x007d }
        L_0x0042:
            android.content.Context r1 = f6557c
            n4.m.h(r1)
            j4.t r1 = new j4.t
            r1.<init>((java.lang.String) r5, (j4.n) r6, (boolean) r7, (boolean) r8)
            n4.n0 r8 = f6555a     // Catch:{ RemoteException -> 0x006d }
            android.content.Context r2 = f6557c     // Catch:{ RemoteException -> 0x006d }
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch:{ RemoteException -> 0x006d }
            u4.b r3 = new u4.b     // Catch:{ RemoteException -> 0x006d }
            r3.<init>(r2)     // Catch:{ RemoteException -> 0x006d }
            boolean r8 = r8.v(r1, r3)     // Catch:{ RemoteException -> 0x006d }
            if (r8 == 0) goto L_0x0062
            j4.v r5 = j4.v.d
            return r5
        L_0x0062:
            j4.o r8 = new j4.o
            r8.<init>(r7, r5, r6)
            j4.x r5 = new j4.x
            r5.<init>(r8)
            return r5
        L_0x006d:
            r5 = move-exception
            java.lang.String r6 = "GoogleCertificates"
            java.lang.String r7 = "Failed to get Google certificates from remote"
            android.util.Log.e(r6, r7, r5)
            java.lang.String r6 = "module call"
            j4.v r7 = new j4.v
            r7.<init>(r0, r6, r5)
            return r7
        L_0x007d:
            r5 = move-exception
            java.lang.String r6 = "GoogleCertificates"
            java.lang.String r7 = "Failed to get Google certificates from remote"
            android.util.Log.e(r6, r7, r5)
            java.lang.String r6 = "module init: "
            java.lang.String r7 = r5.getMessage()
            java.lang.String r7 = java.lang.String.valueOf(r7)
            int r8 = r7.length()
            if (r8 == 0) goto L_0x009a
            java.lang.String r6 = r6.concat(r7)
            goto L_0x00a0
        L_0x009a:
            java.lang.String r7 = new java.lang.String
            r7.<init>(r6)
            r6 = r7
        L_0x00a0:
            j4.v r7 = new j4.v
            r7.<init>(r0, r6, r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: j4.m.a(java.lang.String, j4.n, boolean, boolean):j4.v");
    }
}
