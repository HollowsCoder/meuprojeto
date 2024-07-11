package h7;

import java.util.HashMap;
import java.util.Map;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f5913a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, String> f5914b;

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f5915c = new HashMap();

    public a(String str, HashMap hashMap) {
        this.f5913a = str;
        this.f5914b = hashMap;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0070, code lost:
        r8 = r0.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0078, code lost:
        if (r8.isEmpty() == false) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x007a, code lost:
        return r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0081, code lost:
        if (r7.contains("?") == false) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0087, code lost:
        if (r7.endsWith("&") != false) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0089, code lost:
        r8 = "&".concat(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0091, code lost:
        return b0.d.e(r7, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1:0x002c, code lost:
        if (r4 != null) goto L_0x0063;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00a4, code lost:
        return r7 + "?" + r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x002f, code lost:
        r1 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0030, code lost:
        r2.append(r5);
        r0.append(r2.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0040, code lost:
        if (r8.hasNext() == false) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0042, code lost:
        r2 = (java.util.Map.Entry) r8.next();
        r5 = new java.lang.StringBuilder("&");
        r5.append((java.lang.String) r2.getKey());
        r5.append("=");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x005d, code lost:
        if (r2.getValue() == null) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x005f, code lost:
        r6 = r5;
        r5 = r1;
        r1 = r2;
        r2 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0063, code lost:
        r6 = r5;
        r5 = (java.lang.String) r1.getValue();
        r1 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x006d, code lost:
        r2 = r5;
        r5 = r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(java.lang.String r7, java.util.Map r8) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.Set r8 = r8.entrySet()
            java.util.Iterator r8 = r8.iterator()
            java.lang.Object r1 = r8.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.Object r3 = r1.getKey()
            java.lang.String r3 = (java.lang.String) r3
            r2.append(r3)
            java.lang.String r3 = "="
            r2.append(r3)
            java.lang.Object r4 = r1.getValue()
            java.lang.String r5 = ""
            if (r4 == 0) goto L_0x002f
            goto L_0x0063
        L_0x002f:
            r1 = r5
        L_0x0030:
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            r0.append(r2)
            boolean r2 = r8.hasNext()
            java.lang.String r4 = "&"
            if (r2 == 0) goto L_0x0070
            java.lang.Object r2 = r8.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r4)
            java.lang.Object r4 = r2.getKey()
            java.lang.String r4 = (java.lang.String) r4
            r5.append(r4)
            r5.append(r3)
            java.lang.Object r4 = r2.getValue()
            if (r4 == 0) goto L_0x006d
            r6 = r5
            r5 = r1
            r1 = r2
            r2 = r6
        L_0x0063:
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            r6 = r5
            r5 = r1
            r1 = r6
            goto L_0x0030
        L_0x006d:
            r2 = r5
            r5 = r1
            goto L_0x002f
        L_0x0070:
            java.lang.String r8 = r0.toString()
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L_0x007b
            return r7
        L_0x007b:
            java.lang.String r0 = "?"
            boolean r1 = r7.contains(r0)
            if (r1 == 0) goto L_0x0092
            boolean r0 = r7.endsWith(r4)
            if (r0 != 0) goto L_0x008d
            java.lang.String r8 = r4.concat(r8)
        L_0x008d:
            java.lang.String r7 = b0.d.e(r7, r8)
            return r7
        L_0x0092:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r7)
            r1.append(r0)
            r1.append(r8)
            java.lang.String r7 = r1.toString()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: h7.a.a(java.lang.String, java.util.Map):java.lang.String");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v1, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r2v3 */
    /* JADX WARNING: type inference failed for: r2v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final h0.d b() {
        /*
            r8 = this;
            java.lang.String r0 = "FirebaseCrashlytics"
            java.lang.String r1 = "GET Request URL: "
            r2 = 0
            java.lang.String r3 = r8.f5913a     // Catch:{ all -> 0x00a7 }
            java.util.Map<java.lang.String, java.lang.String> r4 = r8.f5914b     // Catch:{ all -> 0x00a7 }
            java.lang.String r3 = a(r3, r4)     // Catch:{ all -> 0x00a7 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a7 }
            r4.<init>(r1)     // Catch:{ all -> 0x00a7 }
            r4.append(r3)     // Catch:{ all -> 0x00a7 }
            java.lang.String r1 = r4.toString()     // Catch:{ all -> 0x00a7 }
            r4 = 2
            boolean r4 = android.util.Log.isLoggable(r0, r4)     // Catch:{ all -> 0x00a7 }
            if (r4 == 0) goto L_0x0023
            android.util.Log.v(r0, r1, r2)     // Catch:{ all -> 0x00a7 }
        L_0x0023:
            java.net.URL r0 = new java.net.URL     // Catch:{ all -> 0x00a7 }
            r0.<init>(r3)     // Catch:{ all -> 0x00a7 }
            java.net.URLConnection r0 = r0.openConnection()     // Catch:{ all -> 0x00a7 }
            javax.net.ssl.HttpsURLConnection r0 = (javax.net.ssl.HttpsURLConnection) r0     // Catch:{ all -> 0x00a7 }
            r1 = 10000(0x2710, float:1.4013E-41)
            r0.setReadTimeout(r1)     // Catch:{ all -> 0x00a5 }
            r0.setConnectTimeout(r1)     // Catch:{ all -> 0x00a5 }
            java.lang.String r1 = "GET"
            r0.setRequestMethod(r1)     // Catch:{ all -> 0x00a5 }
            java.util.HashMap r1 = r8.f5915c     // Catch:{ all -> 0x00a5 }
            java.util.Set r1 = r1.entrySet()     // Catch:{ all -> 0x00a5 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x00a5 }
        L_0x0045:
            boolean r3 = r1.hasNext()     // Catch:{ all -> 0x00a5 }
            if (r3 == 0) goto L_0x0061
            java.lang.Object r3 = r1.next()     // Catch:{ all -> 0x00a5 }
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch:{ all -> 0x00a5 }
            java.lang.Object r4 = r3.getKey()     // Catch:{ all -> 0x00a5 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x00a5 }
            java.lang.Object r3 = r3.getValue()     // Catch:{ all -> 0x00a5 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x00a5 }
            r0.addRequestProperty(r4, r3)     // Catch:{ all -> 0x00a5 }
            goto L_0x0045
        L_0x0061:
            r0.connect()     // Catch:{ all -> 0x00a5 }
            int r1 = r0.getResponseCode()     // Catch:{ all -> 0x00a5 }
            java.io.InputStream r3 = r0.getInputStream()     // Catch:{ all -> 0x00a5 }
            if (r3 == 0) goto L_0x0097
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ all -> 0x0094 }
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch:{ all -> 0x0094 }
            java.lang.String r5 = "UTF-8"
            r4.<init>(r3, r5)     // Catch:{ all -> 0x0094 }
            r2.<init>(r4)     // Catch:{ all -> 0x0094 }
            r4 = 8192(0x2000, float:1.14794E-41)
            char[] r4 = new char[r4]     // Catch:{ all -> 0x0094 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0094 }
            r5.<init>()     // Catch:{ all -> 0x0094 }
        L_0x0083:
            int r6 = r2.read(r4)     // Catch:{ all -> 0x0094 }
            r7 = -1
            if (r6 == r7) goto L_0x008f
            r7 = 0
            r5.append(r4, r7, r6)     // Catch:{ all -> 0x0094 }
            goto L_0x0083
        L_0x008f:
            java.lang.String r2 = r5.toString()     // Catch:{ all -> 0x0094 }
            goto L_0x0097
        L_0x0094:
            r1 = move-exception
            r2 = r3
            goto L_0x00aa
        L_0x0097:
            if (r3 == 0) goto L_0x009c
            r3.close()
        L_0x009c:
            r0.disconnect()
            h0.d r0 = new h0.d
            r0.<init>(r2, r1)
            return r0
        L_0x00a5:
            r1 = move-exception
            goto L_0x00aa
        L_0x00a7:
            r0 = move-exception
            r1 = r0
            r0 = r2
        L_0x00aa:
            if (r2 == 0) goto L_0x00af
            r2.close()
        L_0x00af:
            if (r0 == 0) goto L_0x00b4
            r0.disconnect()
        L_0x00b4:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: h7.a.b():h0.d");
    }
}
