package z2;

import android.graphics.Bitmap;
import q2.c;
import q2.g;
import q2.h;
import q2.k;

public final class b implements k<Bitmap> {

    /* renamed from: p  reason: collision with root package name */
    public static final g<Integer> f9796p = g.a(90, "com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality");

    /* renamed from: q  reason: collision with root package name */
    public static final g<Bitmap.CompressFormat> f9797q = new g<>("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat", null, g.f8217e);

    /* renamed from: o  reason: collision with root package name */
    public final t2.b f9798o;

    public b(t2.b bVar) {
        this.f9798o = bVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: com.bumptech.glide.load.data.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: com.bumptech.glide.load.data.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: com.bumptech.glide.load.data.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: com.bumptech.glide.load.data.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: com.bumptech.glide.load.data.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: java.io.FileOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: com.bumptech.glide.load.data.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: com.bumptech.glide.load.data.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: com.bumptech.glide.load.data.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: com.bumptech.glide.load.data.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: com.bumptech.glide.load.data.c} */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:16|(2:46|47)|48|49) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:48:0x00bd */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00ba A[SYNTHETIC, Splitter:B:46:0x00ba] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean d(java.lang.Object r10, java.io.File r11, q2.h r12) {
        /*
            r9 = this;
            s2.w r10 = (s2.w) r10
            java.lang.String r0 = "BitmapEncoder"
            java.lang.String r1 = "Compressed with type: "
            java.lang.Object r10 = r10.get()
            android.graphics.Bitmap r10 = (android.graphics.Bitmap) r10
            q2.g<android.graphics.Bitmap$CompressFormat> r2 = f9797q
            java.lang.Object r3 = r12.c(r2)
            android.graphics.Bitmap$CompressFormat r3 = (android.graphics.Bitmap.CompressFormat) r3
            if (r3 == 0) goto L_0x0017
            goto L_0x0022
        L_0x0017:
            boolean r3 = r10.hasAlpha()
            if (r3 == 0) goto L_0x0020
            android.graphics.Bitmap$CompressFormat r3 = android.graphics.Bitmap.CompressFormat.PNG
            goto L_0x0022
        L_0x0020:
            android.graphics.Bitmap$CompressFormat r3 = android.graphics.Bitmap.CompressFormat.JPEG
        L_0x0022:
            r10.getWidth()
            r10.getHeight()
            int r4 = m3.f.f7074b     // Catch:{ all -> 0x00be }
            long r4 = android.os.SystemClock.elapsedRealtimeNanos()     // Catch:{ all -> 0x00be }
            q2.g<java.lang.Integer> r6 = f9796p     // Catch:{ all -> 0x00be }
            java.lang.Object r6 = r12.c(r6)     // Catch:{ all -> 0x00be }
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch:{ all -> 0x00be }
            int r6 = r6.intValue()     // Catch:{ all -> 0x00be }
            r7 = 0
            java.io.FileOutputStream r8 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x005d }
            r8.<init>(r11)     // Catch:{ IOException -> 0x005d }
            t2.b r11 = r9.f9798o
            if (r11 == 0) goto L_0x004f
            com.bumptech.glide.load.data.c r7 = new com.bumptech.glide.load.data.c     // Catch:{ IOException -> 0x004c, all -> 0x004a }
            r7.<init>(r8, r11)     // Catch:{ IOException -> 0x004c, all -> 0x004a }
            goto L_0x0050
        L_0x004a:
            r10 = move-exception
            goto L_0x00b8
        L_0x004c:
            r11 = move-exception
            r7 = r8
            goto L_0x005e
        L_0x004f:
            r7 = r8
        L_0x0050:
            r10.compress(r3, r6, r7)     // Catch:{ IOException -> 0x005d }
            r7.close()     // Catch:{ IOException -> 0x005d }
            r7.close()     // Catch:{ IOException -> 0x0059 }
        L_0x0059:
            r11 = 1
            goto L_0x0070
        L_0x005b:
            r10 = move-exception
            goto L_0x00b7
        L_0x005d:
            r11 = move-exception
        L_0x005e:
            r6 = 3
            boolean r6 = android.util.Log.isLoggable(r0, r6)     // Catch:{ all -> 0x005b }
            if (r6 == 0) goto L_0x006a
            java.lang.String r6 = "Failed to encode Bitmap"
            android.util.Log.d(r0, r6, r11)     // Catch:{ all -> 0x005b }
        L_0x006a:
            if (r7 == 0) goto L_0x006f
            r7.close()     // Catch:{ IOException -> 0x006f }
        L_0x006f:
            r11 = 0
        L_0x0070:
            r6 = 2
            boolean r6 = android.util.Log.isLoggable(r0, r6)     // Catch:{ all -> 0x00be }
            if (r6 == 0) goto L_0x00b6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x00be }
            r6.<init>(r1)     // Catch:{ all -> 0x00be }
            r6.append(r3)     // Catch:{ all -> 0x00be }
            java.lang.String r1 = " of size "
            r6.append(r1)     // Catch:{ all -> 0x00be }
            int r1 = m3.j.c(r10)     // Catch:{ all -> 0x00be }
            r6.append(r1)     // Catch:{ all -> 0x00be }
            java.lang.String r1 = " in "
            r6.append(r1)     // Catch:{ all -> 0x00be }
            double r3 = m3.f.a(r4)     // Catch:{ all -> 0x00be }
            r6.append(r3)     // Catch:{ all -> 0x00be }
            java.lang.String r1 = ", options format: "
            r6.append(r1)     // Catch:{ all -> 0x00be }
            java.lang.Object r12 = r12.c(r2)     // Catch:{ all -> 0x00be }
            r6.append(r12)     // Catch:{ all -> 0x00be }
            java.lang.String r12 = ", hasAlpha: "
            r6.append(r12)     // Catch:{ all -> 0x00be }
            boolean r10 = r10.hasAlpha()     // Catch:{ all -> 0x00be }
            r6.append(r10)     // Catch:{ all -> 0x00be }
            java.lang.String r10 = r6.toString()     // Catch:{ all -> 0x00be }
            android.util.Log.v(r0, r10)     // Catch:{ all -> 0x00be }
        L_0x00b6:
            return r11
        L_0x00b7:
            r8 = r7
        L_0x00b8:
            if (r8 == 0) goto L_0x00bd
            r8.close()     // Catch:{ IOException -> 0x00bd }
        L_0x00bd:
            throw r10     // Catch:{ all -> 0x00be }
        L_0x00be:
            r10 = move-exception
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: z2.b.d(java.lang.Object, java.io.File, q2.h):boolean");
    }

    public final c h(h hVar) {
        return c.TRANSFORMED;
    }
}
