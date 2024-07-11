package h5;

import java.io.IOException;
import java.net.URL;
import java.util.Map;
import n4.m;

public final class l5 implements Runnable {

    /* renamed from: o  reason: collision with root package name */
    public final URL f5530o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ n5 f5531p;

    /* renamed from: q  reason: collision with root package name */
    public final q4 f5532q;

    public l5(n5 n5Var, String str, URL url, q4 q4Var) {
        this.f5531p = n5Var;
        m.e(str);
        this.f5530o = url;
        this.f5532q = q4Var;
    }

    public final void a(int i10, IOException iOException, byte[] bArr, Map map) {
        h4 h4Var = this.f5531p.f5649o.f5459x;
        i4.n(h4Var);
        h4Var.n(new k5(this, i10, iOException, bArr, map));
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0047 A[SYNTHETIC, Splitter:B:24:0x0047] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0076  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r10 = this;
            h5.n5 r0 = r10.f5531p
            h5.i4 r1 = r0.f5649o
            h5.h4 r1 = r1.f5459x
            h5.i4.n(r1)
            r1.k()
            r1 = 0
            r2 = 0
            java.net.URL r3 = r10.f5530o     // Catch:{ IOException -> 0x006f, all -> 0x0061 }
            java.net.HttpURLConnection r0 = r0.k(r3)     // Catch:{ IOException -> 0x006f, all -> 0x0061 }
            int r3 = r0.getResponseCode()     // Catch:{ IOException -> 0x005b, all -> 0x0055 }
            java.util.Map r4 = r0.getHeaderFields()     // Catch:{ IOException -> 0x0052, all -> 0x004f }
            java.io.ByteArrayOutputStream r5 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x0043 }
            r5.<init>()     // Catch:{ all -> 0x0043 }
            java.io.InputStream r6 = r0.getInputStream()     // Catch:{ all -> 0x0043 }
            r7 = 1024(0x400, float:1.435E-42)
            byte[] r7 = new byte[r7]     // Catch:{ all -> 0x0041 }
        L_0x0029:
            int r8 = r6.read(r7)     // Catch:{ all -> 0x0041 }
            if (r8 <= 0) goto L_0x0033
            r5.write(r7, r1, r8)     // Catch:{ all -> 0x0041 }
            goto L_0x0029
        L_0x0033:
            byte[] r1 = r5.toByteArray()     // Catch:{ all -> 0x0041 }
            r6.close()     // Catch:{ IOException -> 0x004d, all -> 0x004b }
            r0.disconnect()
            r10.a(r3, r2, r1, r4)
            return
        L_0x0041:
            r1 = move-exception
            goto L_0x0045
        L_0x0043:
            r1 = move-exception
            r6 = r2
        L_0x0045:
            if (r6 == 0) goto L_0x004a
            r6.close()     // Catch:{ IOException -> 0x004d, all -> 0x004b }
        L_0x004a:
            throw r1     // Catch:{ IOException -> 0x004d, all -> 0x004b }
        L_0x004b:
            r1 = move-exception
            goto L_0x0066
        L_0x004d:
            r1 = move-exception
            goto L_0x0074
        L_0x004f:
            r1 = move-exception
            r4 = r2
            goto L_0x0066
        L_0x0052:
            r1 = move-exception
            r4 = r2
            goto L_0x0074
        L_0x0055:
            r3 = move-exception
            r4 = r2
            r9 = r3
            r3 = r1
            r1 = r9
            goto L_0x0066
        L_0x005b:
            r3 = move-exception
            r4 = r2
            r9 = r3
            r3 = r1
            r1 = r9
            goto L_0x0074
        L_0x0061:
            r0 = move-exception
            r3 = r1
            r4 = r2
            r1 = r0
            r0 = r4
        L_0x0066:
            if (r0 == 0) goto L_0x006b
            r0.disconnect()
        L_0x006b:
            r10.a(r3, r2, r2, r4)
            throw r1
        L_0x006f:
            r0 = move-exception
            r3 = r1
            r4 = r2
            r1 = r0
            r0 = r4
        L_0x0074:
            if (r0 == 0) goto L_0x0079
            r0.disconnect()
        L_0x0079:
            r10.a(r3, r1, r2, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h5.l5.run():void");
    }
}
