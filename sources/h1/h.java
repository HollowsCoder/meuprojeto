package h1;

import android.content.Context;
import java.util.concurrent.Callable;

public final class h implements Callable<r<f>> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f5135a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f5136b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f5137c;

    public h(Context context, String str, String str2) {
        this.f5135a = context;
        this.f5136b = str;
        this.f5137c = str2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00c8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object call() {
        /*
            r11 = this;
            android.content.Context r0 = r11.f5135a
            q1.e r1 = androidx.databinding.a.f1009l0
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L_0x003d
            java.lang.Class<q1.e> r4 = q1.e.class
            monitor-enter(r4)
            q1.e r1 = androidx.databinding.a.f1009l0     // Catch:{ all -> 0x003a }
            if (r1 != 0) goto L_0x0038
            q1.e r1 = new q1.e     // Catch:{ all -> 0x003a }
            q1.d r5 = androidx.databinding.a.f1010m0     // Catch:{ all -> 0x003a }
            if (r5 != 0) goto L_0x002e
            java.lang.Class<q1.d> r5 = q1.d.class
            monitor-enter(r5)     // Catch:{ all -> 0x003a }
            q1.d r6 = androidx.databinding.a.f1010m0     // Catch:{ all -> 0x002b }
            if (r6 != 0) goto L_0x0028
            q1.d r6 = new q1.d     // Catch:{ all -> 0x002b }
            h1.c r7 = new h1.c     // Catch:{ all -> 0x002b }
            r7.<init>(r0)     // Catch:{ all -> 0x002b }
            r6.<init>(r2, r7)     // Catch:{ all -> 0x002b }
            androidx.databinding.a.f1010m0 = r6     // Catch:{ all -> 0x002b }
        L_0x0028:
            monitor-exit(r5)     // Catch:{ all -> 0x002b }
            r5 = r6
            goto L_0x002e
        L_0x002b:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x002b }
            throw r0     // Catch:{ all -> 0x003a }
        L_0x002e:
            q0.d r0 = new q0.d     // Catch:{ all -> 0x003a }
            r0.<init>((int) r3)     // Catch:{ all -> 0x003a }
            r1.<init>(r5, r0)     // Catch:{ all -> 0x003a }
            androidx.databinding.a.f1009l0 = r1     // Catch:{ all -> 0x003a }
        L_0x0038:
            monitor-exit(r4)     // Catch:{ all -> 0x003a }
            goto L_0x003d
        L_0x003a:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x003a }
            throw r0
        L_0x003d:
            java.lang.String r0 = r11.f5136b
            java.lang.String r4 = r11.f5137c
            r5 = 0
            if (r4 != 0) goto L_0x0046
            goto L_0x00bf
        L_0x0046:
            q1.d r6 = r1.f8214a
            r6.getClass()
            java.io.File r7 = new java.io.File     // Catch:{ FileNotFoundException -> 0x009a }
            java.io.File r8 = r6.b()     // Catch:{ FileNotFoundException -> 0x009a }
            q1.b r9 = q1.b.JSON     // Catch:{ FileNotFoundException -> 0x009a }
            java.lang.String r10 = q1.d.a(r0, r9, r2)     // Catch:{ FileNotFoundException -> 0x009a }
            r7.<init>(r8, r10)     // Catch:{ FileNotFoundException -> 0x009a }
            boolean r8 = r7.exists()     // Catch:{ FileNotFoundException -> 0x009a }
            if (r8 == 0) goto L_0x0061
            goto L_0x0078
        L_0x0061:
            java.io.File r7 = new java.io.File     // Catch:{ FileNotFoundException -> 0x009a }
            java.io.File r6 = r6.b()     // Catch:{ FileNotFoundException -> 0x009a }
            q1.b r8 = q1.b.ZIP     // Catch:{ FileNotFoundException -> 0x009a }
            java.lang.String r8 = q1.d.a(r0, r8, r2)     // Catch:{ FileNotFoundException -> 0x009a }
            r7.<init>(r6, r8)     // Catch:{ FileNotFoundException -> 0x009a }
            boolean r6 = r7.exists()     // Catch:{ FileNotFoundException -> 0x009a }
            if (r6 == 0) goto L_0x0077
            goto L_0x0078
        L_0x0077:
            r7 = r5
        L_0x0078:
            if (r7 != 0) goto L_0x007b
            goto L_0x009a
        L_0x007b:
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x009a }
            r6.<init>(r7)     // Catch:{ FileNotFoundException -> 0x009a }
            java.lang.String r8 = r7.getAbsolutePath()
            java.lang.String r10 = ".zip"
            boolean r8 = r8.endsWith(r10)
            if (r8 == 0) goto L_0x008e
            q1.b r9 = q1.b.ZIP
        L_0x008e:
            r7.getAbsolutePath()
            t1.c.a()
            android.util.Pair r7 = new android.util.Pair
            r7.<init>(r9, r6)
            goto L_0x009b
        L_0x009a:
            r7 = r5
        L_0x009b:
            if (r7 != 0) goto L_0x009e
            goto L_0x00bf
        L_0x009e:
            java.lang.Object r6 = r7.first
            q1.b r6 = (q1.b) r6
            java.lang.Object r7 = r7.second
            java.io.InputStream r7 = (java.io.InputStream) r7
            q1.b r8 = q1.b.ZIP
            if (r6 != r8) goto L_0x00b4
            java.util.zip.ZipInputStream r6 = new java.util.zip.ZipInputStream
            r6.<init>(r7)
            h1.r r6 = h1.g.f(r6, r0)
            goto L_0x00b8
        L_0x00b4:
            h1.r r6 = h1.g.c(r7, r0)
        L_0x00b8:
            V r6 = r6.f5206a
            if (r6 == 0) goto L_0x00bf
            h1.f r6 = (h1.f) r6
            goto L_0x00c0
        L_0x00bf:
            r6 = r5
        L_0x00c0:
            if (r6 == 0) goto L_0x00c8
            h1.r r0 = new h1.r
            r0.<init>((h1.f) r6)
            goto L_0x0123
        L_0x00c8:
            t1.c.a()
            java.lang.String r6 = "LottieFetchResult close failed "
            t1.c.a()
            q0.d r7 = r1.f8215b     // Catch:{ Exception -> 0x00e8 }
            r7.getClass()     // Catch:{ Exception -> 0x00e8 }
            q1.a r5 = q0.d.a(r0)     // Catch:{ Exception -> 0x00e8 }
            java.net.HttpURLConnection r7 = r5.f8211o
            int r8 = r7.getResponseCode()     // Catch:{ IOException -> 0x00ea }
            int r8 = r8 / 100
            r9 = 2
            if (r8 != r9) goto L_0x00ea
            r2 = r3
            goto L_0x00ea
        L_0x00e6:
            r0 = move-exception
            goto L_0x0135
        L_0x00e8:
            r0 = move-exception
            goto L_0x0113
        L_0x00ea:
            if (r2 == 0) goto L_0x00fc
            java.io.InputStream r2 = r7.getInputStream()     // Catch:{ Exception -> 0x00e8 }
            java.lang.String r3 = r7.getContentType()     // Catch:{ Exception -> 0x00e8 }
            h1.r r0 = r1.a(r0, r2, r3, r4)     // Catch:{ Exception -> 0x00e8 }
            t1.c.a()     // Catch:{ Exception -> 0x00e8 }
            goto L_0x010a
        L_0x00fc:
            h1.r r0 = new h1.r     // Catch:{ Exception -> 0x00e8 }
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ Exception -> 0x00e8 }
            java.lang.String r2 = r5.a()     // Catch:{ Exception -> 0x00e8 }
            r1.<init>(r2)     // Catch:{ Exception -> 0x00e8 }
            r0.<init>((java.lang.Throwable) r1)     // Catch:{ Exception -> 0x00e8 }
        L_0x010a:
            r5.close()     // Catch:{ IOException -> 0x010e }
            goto L_0x0123
        L_0x010e:
            r1 = move-exception
            t1.c.c(r6, r1)
            goto L_0x0123
        L_0x0113:
            h1.r r1 = new h1.r     // Catch:{ all -> 0x00e6 }
            r1.<init>((java.lang.Throwable) r0)     // Catch:{ all -> 0x00e6 }
            if (r5 == 0) goto L_0x0122
            r5.close()     // Catch:{ IOException -> 0x011e }
            goto L_0x0122
        L_0x011e:
            r0 = move-exception
            t1.c.c(r6, r0)
        L_0x0122:
            r0 = r1
        L_0x0123:
            java.lang.String r1 = r11.f5137c
            if (r1 == 0) goto L_0x0134
            V r2 = r0.f5206a
            if (r2 == 0) goto L_0x0134
            m1.g r3 = m1.g.f7050b
            h1.f r2 = (h1.f) r2
            n.g<java.lang.String, h1.f> r3 = r3.f7051a
            r3.c(r1, r2)
        L_0x0134:
            return r0
        L_0x0135:
            if (r5 == 0) goto L_0x013f
            r5.close()     // Catch:{ IOException -> 0x013b }
            goto L_0x013f
        L_0x013b:
            r1 = move-exception
            t1.c.c(r6, r1)
        L_0x013f:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h1.h.call():java.lang.Object");
    }
}
