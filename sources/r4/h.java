package r4;

import android.os.StrictMode;
import java.io.BufferedReader;
import java.io.FileReader;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static String f8435a;

    /* renamed from: b  reason: collision with root package name */
    public static int f8436b;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v2, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r1v3 */
    /* JADX WARNING: type inference failed for: r1v4, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r1v5 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r1v8 */
    /* JADX WARNING: type inference failed for: r1v10 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0048 A[SYNTHETIC, Splitter:B:17:0x0048] */
    @androidx.annotation.RecentlyNullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a() {
        /*
            java.lang.String r0 = f8435a
            if (r0 != 0) goto L_0x0055
            int r0 = f8436b
            if (r0 != 0) goto L_0x000e
            int r0 = android.os.Process.myPid()
            f8436b = r0
        L_0x000e:
            int r0 = f8436b
            r1 = 0
            if (r0 > 0) goto L_0x0014
            goto L_0x0053
        L_0x0014:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x004c, all -> 0x0045 }
            r3 = 25
            r2.<init>(r3)     // Catch:{ IOException -> 0x004c, all -> 0x0045 }
            java.lang.String r3 = "/proc/"
            r2.append(r3)     // Catch:{ IOException -> 0x004c, all -> 0x0045 }
            r2.append(r0)     // Catch:{ IOException -> 0x004c, all -> 0x0045 }
            java.lang.String r0 = "/cmdline"
            r2.append(r0)     // Catch:{ IOException -> 0x004c, all -> 0x0045 }
            java.lang.String r0 = r2.toString()     // Catch:{ IOException -> 0x004c, all -> 0x0045 }
            java.io.BufferedReader r0 = b(r0)     // Catch:{ IOException -> 0x004c, all -> 0x0045 }
            java.lang.String r2 = r0.readLine()     // Catch:{ IOException -> 0x0041, all -> 0x003c }
            n4.m.h(r2)     // Catch:{ IOException -> 0x0041, all -> 0x003c }
            java.lang.String r1 = r2.trim()     // Catch:{ IOException -> 0x0041, all -> 0x003c }
            goto L_0x0041
        L_0x003c:
            r1 = move-exception
            r4 = r1
            r1 = r0
            r0 = r4
            goto L_0x0046
        L_0x0041:
            r4 = r1
            r1 = r0
            r0 = r4
            goto L_0x004d
        L_0x0045:
            r0 = move-exception
        L_0x0046:
            if (r1 == 0) goto L_0x004b
            r1.close()     // Catch:{ IOException -> 0x004b }
        L_0x004b:
            throw r0
        L_0x004c:
            r0 = r1
        L_0x004d:
            if (r1 == 0) goto L_0x0052
            r1.close()     // Catch:{ IOException -> 0x0052 }
        L_0x0052:
            r1 = r0
        L_0x0053:
            f8435a = r1
        L_0x0055:
            java.lang.String r0 = f8435a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: r4.h.a():java.lang.String");
    }

    public static BufferedReader b(String str) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return new BufferedReader(new FileReader(str));
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }
}
