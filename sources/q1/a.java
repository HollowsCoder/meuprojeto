package q1;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

public final class a implements Closeable {

    /* renamed from: o  reason: collision with root package name */
    public final HttpURLConnection f8211o;

    public a(HttpURLConnection httpURLConnection) {
        this.f8211o = httpURLConnection;
    }

    public static String b(HttpURLConnection httpURLConnection) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
        StringBuilder sb = new StringBuilder();
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb.append(readLine);
                    sb.append(10);
                } else {
                    try {
                        break;
                    } catch (Exception unused) {
                    }
                }
            } catch (Exception e10) {
                throw e10;
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Exception unused2) {
                }
                throw th;
            }
        }
        bufferedReader.close();
        return sb.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0014 A[SYNTHETIC, Splitter:B:10:0x0014] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0012 A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String a() {
        /*
            r4 = this;
            java.net.HttpURLConnection r0 = r4.f8211o
            java.lang.String r1 = "Unable to fetch "
            int r2 = r0.getResponseCode()     // Catch:{ IOException -> 0x000f }
            int r2 = r2 / 100
            r3 = 2
            if (r2 != r3) goto L_0x000f
            r2 = 1
            goto L_0x0010
        L_0x000f:
            r2 = 0
        L_0x0010:
            if (r2 == 0) goto L_0x0014
            r0 = 0
            goto L_0x003c
        L_0x0014:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x003d }
            r2.<init>(r1)     // Catch:{ IOException -> 0x003d }
            java.net.URL r1 = r0.getURL()     // Catch:{ IOException -> 0x003d }
            r2.append(r1)     // Catch:{ IOException -> 0x003d }
            java.lang.String r1 = ". Failed with "
            r2.append(r1)     // Catch:{ IOException -> 0x003d }
            int r1 = r0.getResponseCode()     // Catch:{ IOException -> 0x003d }
            r2.append(r1)     // Catch:{ IOException -> 0x003d }
            java.lang.String r1 = "\n"
            r2.append(r1)     // Catch:{ IOException -> 0x003d }
            java.lang.String r0 = b(r0)     // Catch:{ IOException -> 0x003d }
            r2.append(r0)     // Catch:{ IOException -> 0x003d }
            java.lang.String r0 = r2.toString()     // Catch:{ IOException -> 0x003d }
        L_0x003c:
            return r0
        L_0x003d:
            r0 = move-exception
            java.lang.String r1 = "get error failed "
            t1.c.c(r1, r0)
            java.lang.String r0 = r0.getMessage()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.a.a():java.lang.String");
    }

    public final void close() {
        this.f8211o.disconnect();
    }
}
