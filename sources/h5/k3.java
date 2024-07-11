package h5;

import java.net.URL;
import java.util.Map;
import n.b;
import n4.m;

public final class k3 implements Runnable {

    /* renamed from: o  reason: collision with root package name */
    public final URL f5501o;

    /* renamed from: p  reason: collision with root package name */
    public final byte[] f5502p;

    /* renamed from: q  reason: collision with root package name */
    public final i3 f5503q;

    /* renamed from: r  reason: collision with root package name */
    public final String f5504r;

    /* renamed from: s  reason: collision with root package name */
    public final Map<String, String> f5505s;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ l3 f5506t;

    public k3(l3 l3Var, String str, URL url, byte[] bArr, b bVar, i3 i3Var) {
        this.f5506t = l3Var;
        m.e(str);
        this.f5501o = url;
        this.f5502p = bArr;
        this.f5503q = i3Var;
        this.f5504r = str;
        this.f5505s = bVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00ce A[SYNTHETIC, Splitter:B:40:0x00ce] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00ee A[SYNTHETIC, Splitter:B:59:0x00ee] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0124 A[SYNTHETIC, Splitter:B:71:0x0124] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x013a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r16 = this;
            r1 = r16
            java.lang.String r2 = r1.f5504r
            java.lang.String r3 = "Error closing HTTP compressed POST connection output stream. appId"
            h5.l3 r0 = r1.f5506t
            h5.i4 r4 = r0.f5649o
            h5.h4 r4 = r4.f5459x
            h5.i4.n(r4)
            r4.k()
            h5.i4 r4 = r0.f5649o
            r5 = 0
            r6 = 0
            java.net.URL r7 = r1.f5501o     // Catch:{ IOException -> 0x011c, all -> 0x00e7 }
            java.net.HttpURLConnection r7 = r0.l(r7)     // Catch:{ IOException -> 0x011c, all -> 0x00e7 }
            java.util.Map<java.lang.String, java.lang.String> r8 = r1.f5505s     // Catch:{ IOException -> 0x00e4, all -> 0x00e0 }
            if (r8 == 0) goto L_0x0044
            java.util.Set r8 = r8.entrySet()     // Catch:{ IOException -> 0x00e4, all -> 0x00e0 }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ IOException -> 0x00e4, all -> 0x00e0 }
        L_0x0028:
            boolean r9 = r8.hasNext()     // Catch:{ IOException -> 0x00e4, all -> 0x00e0 }
            if (r9 == 0) goto L_0x0044
            java.lang.Object r9 = r8.next()     // Catch:{ IOException -> 0x00e4, all -> 0x00e0 }
            java.util.Map$Entry r9 = (java.util.Map.Entry) r9     // Catch:{ IOException -> 0x00e4, all -> 0x00e0 }
            java.lang.Object r10 = r9.getKey()     // Catch:{ IOException -> 0x00e4, all -> 0x00e0 }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ IOException -> 0x00e4, all -> 0x00e0 }
            java.lang.Object r9 = r9.getValue()     // Catch:{ IOException -> 0x00e4, all -> 0x00e0 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ IOException -> 0x00e4, all -> 0x00e0 }
            r7.addRequestProperty(r10, r9)     // Catch:{ IOException -> 0x00e4, all -> 0x00e0 }
            goto L_0x0028
        L_0x0044:
            byte[] r8 = r1.f5502p
            if (r8 == 0) goto L_0x008d
            h5.z6 r0 = r0.f5701p     // Catch:{ IOException -> 0x00e4, all -> 0x00e0 }
            h5.b7 r0 = r0.u     // Catch:{ IOException -> 0x00e4, all -> 0x00e0 }
            h5.z6.E(r0)     // Catch:{ IOException -> 0x00e4, all -> 0x00e0 }
            byte[] r0 = r0.D(r8)     // Catch:{ IOException -> 0x00e4, all -> 0x00e0 }
            h5.g3 r8 = r4.w     // Catch:{ IOException -> 0x00e4, all -> 0x00e0 }
            h5.i4.n(r8)     // Catch:{ IOException -> 0x00e4, all -> 0x00e0 }
            h5.e3 r8 = r8.B     // Catch:{ IOException -> 0x00e4, all -> 0x00e0 }
            int r9 = r0.length     // Catch:{ IOException -> 0x00e4, all -> 0x00e0 }
            java.lang.String r10 = "Uploading data. size"
            java.lang.Integer r11 = java.lang.Integer.valueOf(r9)     // Catch:{ IOException -> 0x00e4, all -> 0x00e0 }
            r8.b(r11, r10)     // Catch:{ IOException -> 0x00e4, all -> 0x00e0 }
            r8 = 1
            r7.setDoOutput(r8)     // Catch:{ IOException -> 0x00e4, all -> 0x00e0 }
            java.lang.String r8 = "Content-Encoding"
            java.lang.String r10 = "gzip"
            r7.addRequestProperty(r8, r10)     // Catch:{ IOException -> 0x00e4, all -> 0x00e0 }
            r7.setFixedLengthStreamingMode(r9)     // Catch:{ IOException -> 0x00e4, all -> 0x00e0 }
            r7.connect()     // Catch:{ IOException -> 0x00e4, all -> 0x00e0 }
            java.io.OutputStream r8 = r7.getOutputStream()     // Catch:{ IOException -> 0x00e4, all -> 0x00e0 }
            r8.write(r0)     // Catch:{ IOException -> 0x0086, all -> 0x0080 }
            r8.close()     // Catch:{ IOException -> 0x0086, all -> 0x0080 }
            goto L_0x008d
        L_0x0080:
            r0 = move-exception
            r9 = r5
            r12 = r6
            r6 = r8
            goto L_0x00eb
        L_0x0086:
            r0 = move-exception
            r12 = r0
            r11 = r5
            r14 = r6
            r6 = r8
            goto L_0x0122
        L_0x008d:
            int r12 = r7.getResponseCode()     // Catch:{ IOException -> 0x00e4, all -> 0x00e0 }
            java.util.Map r15 = r7.getHeaderFields()     // Catch:{ IOException -> 0x00dd, all -> 0x00da }
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x00ca }
            r0.<init>()     // Catch:{ all -> 0x00ca }
            java.io.InputStream r8 = r7.getInputStream()     // Catch:{ all -> 0x00ca }
            r9 = 1024(0x400, float:1.435E-42)
            byte[] r9 = new byte[r9]     // Catch:{ all -> 0x00c8 }
        L_0x00a2:
            int r10 = r8.read(r9)     // Catch:{ all -> 0x00c8 }
            if (r10 <= 0) goto L_0x00ac
            r0.write(r9, r5, r10)     // Catch:{ all -> 0x00c8 }
            goto L_0x00a2
        L_0x00ac:
            byte[] r14 = r0.toByteArray()     // Catch:{ all -> 0x00c8 }
            r8.close()     // Catch:{ IOException -> 0x00d7, all -> 0x00d2 }
            r7.disconnect()
            h5.h4 r0 = r4.f5459x
            h5.i4.n(r0)
            h5.j3 r2 = new h5.j3
            java.lang.String r10 = r1.f5504r
            h5.i3 r11 = r1.f5503q
            r13 = 0
            r9 = r2
            r9.<init>(r10, r11, r12, r13, r14, r15)
            goto L_0x014d
        L_0x00c8:
            r0 = move-exception
            goto L_0x00cc
        L_0x00ca:
            r0 = move-exception
            r8 = r6
        L_0x00cc:
            if (r8 == 0) goto L_0x00d1
            r8.close()     // Catch:{ IOException -> 0x00d7, all -> 0x00d2 }
        L_0x00d1:
            throw r0     // Catch:{ IOException -> 0x00d7, all -> 0x00d2 }
        L_0x00d2:
            r0 = move-exception
            r5 = r0
            r9 = r12
            r12 = r15
            goto L_0x00ec
        L_0x00d7:
            r0 = move-exception
            r5 = r12
            goto L_0x011f
        L_0x00da:
            r0 = move-exception
            r5 = r12
            goto L_0x00e1
        L_0x00dd:
            r0 = move-exception
            r5 = r12
            goto L_0x00e5
        L_0x00e0:
            r0 = move-exception
        L_0x00e1:
            r9 = r5
            r12 = r6
            goto L_0x00eb
        L_0x00e4:
            r0 = move-exception
        L_0x00e5:
            r15 = r6
            goto L_0x011f
        L_0x00e7:
            r0 = move-exception
            r9 = r5
            r7 = r6
            r12 = r7
        L_0x00eb:
            r5 = r0
        L_0x00ec:
            if (r6 == 0) goto L_0x0102
            r6.close()     // Catch:{ IOException -> 0x00f2 }
            goto L_0x0102
        L_0x00f2:
            r0 = move-exception
            r6 = r0
            h5.g3 r0 = r4.w
            h5.i4.n(r0)
            h5.f3 r2 = h5.g3.p(r2)
            h5.e3 r0 = r0.f5397t
            r0.c(r2, r6, r3)
        L_0x0102:
            if (r7 == 0) goto L_0x0107
            r7.disconnect()
        L_0x0107:
            h5.h4 r0 = r4.f5459x
            h5.i4.n(r0)
            h5.j3 r2 = new h5.j3
            java.lang.String r7 = r1.f5504r
            h5.i3 r8 = r1.f5503q
            r10 = 0
            r11 = 0
            r6 = r2
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r0.n(r2)
            throw r5
        L_0x011c:
            r0 = move-exception
            r7 = r6
            r15 = r7
        L_0x011f:
            r12 = r0
            r11 = r5
            r14 = r15
        L_0x0122:
            if (r6 == 0) goto L_0x0138
            r6.close()     // Catch:{ IOException -> 0x0128 }
            goto L_0x0138
        L_0x0128:
            r0 = move-exception
            r5 = r0
            h5.g3 r0 = r4.w
            h5.i4.n(r0)
            h5.f3 r2 = h5.g3.p(r2)
            h5.e3 r0 = r0.f5397t
            r0.c(r2, r5, r3)
        L_0x0138:
            if (r7 == 0) goto L_0x013d
            r7.disconnect()
        L_0x013d:
            h5.h4 r0 = r4.f5459x
            h5.i4.n(r0)
            h5.j3 r2 = new h5.j3
            java.lang.String r9 = r1.f5504r
            h5.i3 r10 = r1.f5503q
            r13 = 0
            r8 = r2
            r8.<init>(r9, r10, r11, r12, r13, r14)
        L_0x014d:
            r0.n(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h5.k3.run():void");
    }
}
