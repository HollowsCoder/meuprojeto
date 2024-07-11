package j4;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import n4.m;
import n4.n0;

public final class i {

    /* renamed from: c  reason: collision with root package name */
    public static i f6552c;

    /* renamed from: a  reason: collision with root package name */
    public final Context f6553a;

    /* renamed from: b  reason: collision with root package name */
    public volatile String f6554b;

    public i(Context context) {
        this.f6553a = context.getApplicationContext();
    }

    @RecentlyNonNull
    public static i a(@RecentlyNonNull Context context) {
        m.h(context);
        synchronized (i.class) {
            if (f6552c == null) {
                n0 n0Var = m.f6555a;
                synchronized (m.class) {
                    if (m.f6557c == null) {
                        m.f6557c = context.getApplicationContext();
                    } else {
                        Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
                    }
                }
                f6552c = new i(context);
            }
        }
        return f6552c;
    }

    public static n c(PackageInfo packageInfo, n... nVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null) {
            return null;
        }
        if (signatureArr.length != 1) {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return null;
        }
        q qVar = new q(packageInfo.signatures[0].toByteArray());
        for (int i10 = 0; i10 < nVarArr.length; i10++) {
            if (nVarArr[i10].equals(qVar)) {
                return nVarArr[i10];
            }
        }
        return null;
    }

    @RecentlyNonNull
    public static boolean d(@RecentlyNonNull PackageInfo packageInfo, @RecentlyNonNull boolean z) {
        n nVar;
        if (!(packageInfo == null || packageInfo.signatures == null)) {
            if (z) {
                nVar = c(packageInfo, s.f6564a);
            } else {
                nVar = c(packageInfo, s.f6564a[0]);
            }
            if (nVar != null) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00a0  */
    @androidx.annotation.RecentlyNonNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b(@androidx.annotation.RecentlyNonNull int r12) {
        /*
            r11 = this;
            android.content.Context r0 = r11.f6553a
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            java.lang.String[] r12 = r0.getPackagesForUid(r12)
            r0 = 0
            r1 = 0
            if (r12 == 0) goto L_0x00ca
            int r2 = r12.length
            if (r2 != 0) goto L_0x0013
            goto L_0x00ca
        L_0x0013:
            int r2 = r12.length
            r4 = r0
            r3 = r1
        L_0x0016:
            if (r3 >= r2) goto L_0x00c6
            r4 = r12[r3]
            java.lang.String r5 = "null pkg"
            if (r4 != 0) goto L_0x0025
            j4.v r4 = new j4.v
            r4.<init>(r1, r5, r0)
            goto L_0x00bd
        L_0x0025:
            java.lang.String r6 = r11.f6554b
            boolean r6 = r4.equals(r6)
            if (r6 == 0) goto L_0x0031
            j4.v r4 = j4.v.d
            goto L_0x00bd
        L_0x0031:
            android.content.Context r6 = r11.f6553a     // Catch:{ NameNotFoundException -> 0x00a4 }
            android.content.pm.PackageManager r6 = r6.getPackageManager()     // Catch:{ NameNotFoundException -> 0x00a4 }
            r7 = 64
            android.content.pm.PackageInfo r6 = r6.getPackageInfo(r4, r7)     // Catch:{ NameNotFoundException -> 0x00a4 }
            android.content.Context r7 = r11.f6553a
            boolean r7 = j4.h.a(r7)
            if (r6 != 0) goto L_0x0046
            goto L_0x0097
        L_0x0046:
            android.content.pm.Signature[] r5 = r6.signatures
            if (r5 == 0) goto L_0x0095
            int r5 = r5.length
            r8 = 1
            if (r5 == r8) goto L_0x004f
            goto L_0x0095
        L_0x004f:
            j4.q r5 = new j4.q
            android.content.pm.Signature[] r9 = r6.signatures
            r9 = r9[r1]
            byte[] r9 = r9.toByteArray()
            r5.<init>(r9)
            java.lang.String r9 = r6.packageName
            n4.n0 r10 = j4.m.f6555a
            android.os.StrictMode$ThreadPolicy r10 = android.os.StrictMode.allowThreadDiskReads()
            j4.v r7 = j4.m.a(r9, r5, r7, r1)     // Catch:{ all -> 0x0090 }
            android.os.StrictMode.setThreadPolicy(r10)
            boolean r10 = r7.f6569a
            if (r10 == 0) goto L_0x009c
            android.content.pm.ApplicationInfo r6 = r6.applicationInfo
            if (r6 == 0) goto L_0x009c
            int r6 = r6.flags
            r6 = r6 & 2
            if (r6 == 0) goto L_0x009c
            android.os.StrictMode$ThreadPolicy r6 = android.os.StrictMode.allowThreadDiskReads()
            j4.v r5 = j4.m.a(r9, r5, r1, r8)     // Catch:{ all -> 0x008b }
            android.os.StrictMode.setThreadPolicy(r6)
            boolean r5 = r5.f6569a
            if (r5 == 0) goto L_0x009c
            java.lang.String r5 = "debuggable release cert app rejected"
            goto L_0x0097
        L_0x008b:
            r12 = move-exception
            android.os.StrictMode.setThreadPolicy(r6)
            throw r12
        L_0x0090:
            r12 = move-exception
            android.os.StrictMode.setThreadPolicy(r10)
            throw r12
        L_0x0095:
            java.lang.String r5 = "single cert required"
        L_0x0097:
            j4.v r7 = new j4.v
            r7.<init>(r1, r5, r0)
        L_0x009c:
            boolean r5 = r7.f6569a
            if (r5 == 0) goto L_0x00a2
            r11.f6554b = r4
        L_0x00a2:
            r4 = r7
            goto L_0x00bd
        L_0x00a4:
            r5 = move-exception
            int r6 = r4.length()
            java.lang.String r7 = "no pkg "
            if (r6 == 0) goto L_0x00b2
            java.lang.String r4 = r7.concat(r4)
            goto L_0x00b7
        L_0x00b2:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r7)
        L_0x00b7:
            j4.v r6 = new j4.v
            r6.<init>(r1, r4, r5)
            r4 = r6
        L_0x00bd:
            boolean r5 = r4.f6569a
            if (r5 == 0) goto L_0x00c2
            goto L_0x00d1
        L_0x00c2:
            int r3 = r3 + 1
            goto L_0x0016
        L_0x00c6:
            n4.m.h(r4)
            goto L_0x00d1
        L_0x00ca:
            j4.v r4 = new j4.v
            java.lang.String r12 = "no pkgs"
            r4.<init>(r1, r12, r0)
        L_0x00d1:
            boolean r12 = r4.f6569a
            if (r12 != 0) goto L_0x00f1
            r12 = 3
            java.lang.String r0 = "GoogleCertificatesRslt"
            boolean r12 = android.util.Log.isLoggable(r0, r12)
            if (r12 == 0) goto L_0x00f1
            java.lang.Throwable r12 = r4.f6571c
            if (r12 == 0) goto L_0x00ea
            java.lang.String r1 = r4.a()
            android.util.Log.d(r0, r1, r12)
            goto L_0x00f1
        L_0x00ea:
            java.lang.String r12 = r4.a()
            android.util.Log.d(r0, r12)
        L_0x00f1:
            boolean r12 = r4.f6569a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: j4.i.b(int):boolean");
    }
}
