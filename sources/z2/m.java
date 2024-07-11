package z2;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.DisplayMetrics;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import m3.j;
import q2.g;
import q2.h;
import q2.i;
import t2.c;
import z2.k;

public final class m {

    /* renamed from: f  reason: collision with root package name */
    public static final g<q2.b> f9826f = g.a(q2.b.DEFAULT, "com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat");

    /* renamed from: g  reason: collision with root package name */
    public static final g<i> f9827g = g.a(i.SRGB, "com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace");

    /* renamed from: h  reason: collision with root package name */
    public static final g<Boolean> f9828h;

    /* renamed from: i  reason: collision with root package name */
    public static final g<Boolean> f9829i;

    /* renamed from: j  reason: collision with root package name */
    public static final a f9830j = new a();

    /* renamed from: k  reason: collision with root package name */
    public static final ArrayDeque f9831k = new ArrayDeque(0);

    /* renamed from: a  reason: collision with root package name */
    public final c f9832a;

    /* renamed from: b  reason: collision with root package name */
    public final DisplayMetrics f9833b;

    /* renamed from: c  reason: collision with root package name */
    public final t2.b f9834c;
    public final List<ImageHeaderParser> d;

    /* renamed from: e  reason: collision with root package name */
    public final r f9835e;

    public class a implements b {
        public final void a(Bitmap bitmap, c cVar) {
        }

        public final void b() {
        }
    }

    public interface b {
        void a(Bitmap bitmap, c cVar);

        void b();
    }

    static {
        k.e eVar = k.f9820a;
        Boolean bool = Boolean.FALSE;
        f9828h = g.a(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize");
        f9829i = g.a(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode");
        Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"image/vnd.wap.wbmp", "image/x-ico"})));
        Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG));
        char[] cArr = j.f7084a;
    }

    public m(List<ImageHeaderParser> list, DisplayMetrics displayMetrics, c cVar, t2.b bVar) {
        if (r.f9843j == null) {
            synchronized (r.class) {
                if (r.f9843j == null) {
                    r.f9843j = new r();
                }
            }
        }
        this.f9835e = r.f9843j;
        this.d = list;
        s6.a.n(displayMetrics);
        this.f9833b = displayMetrics;
        s6.a.n(cVar);
        this.f9832a = cVar;
        s6.a.n(bVar);
        this.f9834c = bVar;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:20|21) */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        throw r1;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0046 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap c(z2.s r5, android.graphics.BitmapFactory.Options r6, z2.m.b r7, t2.c r8) {
        /*
            java.lang.String r0 = "Downsampler"
            boolean r1 = r6.inJustDecodeBounds
            if (r1 != 0) goto L_0x000c
            r7.b()
            r5.b()
        L_0x000c:
            int r1 = r6.outWidth
            int r2 = r6.outHeight
            java.lang.String r3 = r6.outMimeType
            java.util.concurrent.locks.Lock r4 = z2.z.f9873b
            r4.lock()
            android.graphics.Bitmap r5 = r5.a(r6)     // Catch:{ IllegalArgumentException -> 0x0021 }
            r4.unlock()
            return r5
        L_0x001f:
            r5 = move-exception
            goto L_0x0048
        L_0x0021:
            r4 = move-exception
            java.io.IOException r1 = e(r4, r1, r2, r3, r6)     // Catch:{ all -> 0x001f }
            r2 = 3
            boolean r2 = android.util.Log.isLoggable(r0, r2)     // Catch:{ all -> 0x001f }
            if (r2 == 0) goto L_0x0032
            java.lang.String r2 = "Failed to decode with inBitmap, trying again without Bitmap re-use"
            android.util.Log.d(r0, r2, r1)     // Catch:{ all -> 0x001f }
        L_0x0032:
            android.graphics.Bitmap r0 = r6.inBitmap     // Catch:{ all -> 0x001f }
            if (r0 == 0) goto L_0x0047
            r8.e(r0)     // Catch:{ IOException -> 0x0046 }
            r0 = 0
            r6.inBitmap = r0     // Catch:{ IOException -> 0x0046 }
            android.graphics.Bitmap r5 = c(r5, r6, r7, r8)     // Catch:{ IOException -> 0x0046 }
            java.util.concurrent.locks.Lock r6 = z2.z.f9873b
            r6.unlock()
            return r5
        L_0x0046:
            throw r1     // Catch:{ all -> 0x001f }
        L_0x0047:
            throw r1     // Catch:{ all -> 0x001f }
        L_0x0048:
            java.util.concurrent.locks.Lock r6 = z2.z.f9873b
            r6.unlock()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: z2.m.c(z2.s, android.graphics.BitmapFactory$Options, z2.m$b, t2.c):android.graphics.Bitmap");
    }

    @TargetApi(19)
    public static String d(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + (" (" + bitmap.getAllocationByteCount() + ")");
    }

    public static IOException e(IllegalArgumentException illegalArgumentException, int i10, int i11, String str, BitmapFactory.Options options) {
        return new IOException("Exception decoding bitmap, outWidth: " + i10 + ", outHeight: " + i11 + ", outMimeType: " + str + ", inBitmap: " + d(options.inBitmap), illegalArgumentException);
    }

    public static void f(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            options.inPreferredColorSpace = null;
            options.outColorSpace = null;
            options.outConfig = null;
        }
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    public final d a(s sVar, int i10, int i11, h hVar, b bVar) {
        ArrayDeque arrayDeque;
        BitmapFactory.Options options;
        BitmapFactory.Options options2;
        boolean z;
        h hVar2 = hVar;
        byte[] bArr = (byte[]) this.f9834c.c(65536, byte[].class);
        synchronized (m.class) {
            arrayDeque = f9831k;
            synchronized (arrayDeque) {
                options = (BitmapFactory.Options) arrayDeque.poll();
            }
            if (options == null) {
                options = new BitmapFactory.Options();
                f(options);
            }
            options2 = options;
        }
        options2.inTempStorage = bArr;
        q2.b bVar2 = (q2.b) hVar2.c(f9826f);
        i iVar = (i) hVar2.c(f9827g);
        k kVar = (k) hVar2.c(k.f9824f);
        boolean booleanValue = ((Boolean) hVar2.c(f9828h)).booleanValue();
        g gVar = f9829i;
        if (hVar2.c(gVar) == null || !((Boolean) hVar2.c(gVar)).booleanValue()) {
            z = false;
        } else {
            z = true;
        }
        try {
            d e10 = d.e(b(sVar, options2, kVar, bVar2, iVar, z, i10, i11, booleanValue, bVar), this.f9832a);
            f(options2);
            synchronized (arrayDeque) {
                arrayDeque.offer(options2);
            }
            this.f9834c.put(bArr);
            return e10;
        } catch (Throwable th) {
            f(options2);
            ArrayDeque arrayDeque2 = f9831k;
            synchronized (arrayDeque2) {
                arrayDeque2.offer(options2);
                this.f9834c.put(bArr);
                throw th;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:203:0x04fe, code lost:
        r1.postScale(-1.0f, 1.0f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x050d, code lost:
        r2 = new android.graphics.RectF(0.0f, 0.0f, (float) r0.getWidth(), (float) r0.getHeight());
        r1.mapRect(r2);
        r3 = java.lang.Math.round(r2.width());
        r4 = java.lang.Math.round(r2.height());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x0534, code lost:
        if (r0.getConfig() == null) goto L_0x053b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x0536, code lost:
        r5 = r0.getConfig();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x053b, code lost:
        r5 = android.graphics.Bitmap.Config.ARGB_8888;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x053d, code lost:
        r3 = r14.d(r3, r4, r5);
        r1.postTranslate(-r2.left, -r2.top);
        r3.setHasAlpha(r0.hasAlpha());
        z2.z.a(r0, r3, r1);
        r9 = r3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x01d3  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x01d7  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x01e5  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0256  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0358  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x035e  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x0384  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x03d6  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x03e4  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x03e7  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x03f8  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x0424  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x0443  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x04c8  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0190  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0193  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01b8  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01bb  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x01ca A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Bitmap b(z2.s r41, android.graphics.BitmapFactory.Options r42, z2.k r43, q2.b r44, q2.i r45, boolean r46, int r47, int r48, boolean r49, z2.m.b r50) {
        /*
            r40 = this;
            r1 = r40
            r2 = r41
            r3 = r42
            r0 = r43
            r4 = r44
            r5 = r47
            r6 = r48
            r7 = r50
            int r8 = m3.f.f7074b
            long r8 = android.os.SystemClock.elapsedRealtimeNanos()
            r10 = 1
            r3.inJustDecodeBounds = r10
            t2.c r11 = r1.f9832a
            c(r2, r3, r7, r11)
            r12 = 0
            r3.inJustDecodeBounds = r12
            int r13 = r3.outWidth
            int r14 = r3.outHeight
            java.lang.String r15 = r3.outMimeType
            r12 = -1
            if (r13 == r12) goto L_0x0030
            if (r14 != r12) goto L_0x002d
            goto L_0x0030
        L_0x002d:
            r12 = r46
            goto L_0x0031
        L_0x0030:
            r12 = 0
        L_0x0031:
            int r16 = r41.c()
            switch(r16) {
                case 3: goto L_0x0042;
                case 4: goto L_0x0042;
                case 5: goto L_0x003f;
                case 6: goto L_0x003f;
                case 7: goto L_0x003c;
                case 8: goto L_0x003c;
                default: goto L_0x0038;
            }
        L_0x0038:
            r17 = r8
            r8 = 0
            goto L_0x004a
        L_0x003c:
            r17 = 270(0x10e, float:3.78E-43)
            goto L_0x0044
        L_0x003f:
            r17 = 90
            goto L_0x0044
        L_0x0042:
            r17 = 180(0xb4, float:2.52E-43)
        L_0x0044:
            r38 = r8
            r8 = r17
            r17 = r38
        L_0x004a:
            switch(r16) {
                case 2: goto L_0x004f;
                case 3: goto L_0x004f;
                case 4: goto L_0x004f;
                case 5: goto L_0x004f;
                case 6: goto L_0x004f;
                case 7: goto L_0x004f;
                case 8: goto L_0x004f;
                default: goto L_0x004d;
            }
        L_0x004d:
            r9 = 0
            goto L_0x0050
        L_0x004f:
            r9 = 1
        L_0x0050:
            r10 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r5 != r10) goto L_0x0068
            r10 = 90
            if (r8 == r10) goto L_0x005f
            r10 = 270(0x10e, float:3.78E-43)
            if (r8 != r10) goto L_0x005d
            goto L_0x005f
        L_0x005d:
            r10 = 0
            goto L_0x0060
        L_0x005f:
            r10 = 1
        L_0x0060:
            if (r10 == 0) goto L_0x0064
            r10 = r14
            goto L_0x0065
        L_0x0064:
            r10 = r13
        L_0x0065:
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x006d
        L_0x0068:
            r38 = r10
            r10 = r5
            r5 = r38
        L_0x006d:
            if (r6 != r5) goto L_0x0081
            r5 = 90
            if (r8 == r5) goto L_0x007a
            r5 = 270(0x10e, float:3.78E-43)
            if (r8 != r5) goto L_0x0078
            goto L_0x007a
        L_0x0078:
            r5 = 0
            goto L_0x007b
        L_0x007a:
            r5 = 1
        L_0x007b:
            if (r5 == 0) goto L_0x007f
            r5 = r13
            goto L_0x0082
        L_0x007f:
            r5 = r14
            goto L_0x0082
        L_0x0081:
            r5 = r6
        L_0x0082:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = r41.d()
            r20 = r15
            java.lang.String r15 = ", target density: "
            java.lang.String r4 = ", density: "
            r22 = r9
            java.lang.String r9 = "x"
            r23 = r12
            java.lang.String r12 = "Downsampler"
            java.lang.String r1 = "]"
            if (r13 <= 0) goto L_0x02ab
            if (r14 > 0) goto L_0x009c
            goto L_0x02ab
        L_0x009c:
            r24 = r1
            r1 = 90
            if (r8 == r1) goto L_0x00a9
            r1 = 270(0x10e, float:3.78E-43)
            if (r8 != r1) goto L_0x00a7
            goto L_0x00a9
        L_0x00a7:
            r1 = 0
            goto L_0x00aa
        L_0x00a9:
            r1 = 1
        L_0x00aa:
            r46 = r4
            if (r1 == 0) goto L_0x00b1
            r4 = r13
            r1 = r14
            goto L_0x00b3
        L_0x00b1:
            r1 = r13
            r4 = r14
        L_0x00b3:
            r19 = r15
            float r15 = r0.b(r1, r4, r10, r5)
            r21 = 0
            int r25 = (r15 > r21 ? 1 : (r15 == r21 ? 0 : -1))
            if (r25 <= 0) goto L_0x026a
            r25 = r8
            z2.k$g r8 = r0.a(r1, r4, r10, r5)
            if (r8 == 0) goto L_0x0262
            r26 = r14
            float r14 = (float) r1
            r27 = r9
            float r9 = r15 * r14
            r29 = r12
            r28 = r13
            double r12 = (double) r9
            r30 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r12 = r12 + r30
            int r9 = (int) r12
            float r12 = (float) r4
            float r13 = r15 * r12
            r33 = r10
            r32 = r11
            double r10 = (double) r13
            double r10 = r10 + r30
            int r10 = (int) r10
            int r9 = r1 / r9
            int r10 = r4 / r10
            z2.k$g r11 = z2.k.g.MEMORY
            if (r8 != r11) goto L_0x00f0
            int r9 = java.lang.Math.max(r9, r10)
            goto L_0x00f4
        L_0x00f0:
            int r9 = java.lang.Math.min(r9, r10)
        L_0x00f4:
            int r9 = java.lang.Integer.highestOneBit(r9)
            r10 = 1
            int r9 = java.lang.Math.max(r10, r9)
            if (r8 != r11) goto L_0x010a
            float r8 = (float) r9
            r10 = 1065353216(0x3f800000, float:1.0)
            float r11 = r10 / r15
            int r8 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r8 >= 0) goto L_0x010a
            int r9 = r9 << 1
        L_0x010a:
            r3.inSampleSize = r9
            com.bumptech.glide.load.ImageHeaderParser$ImageType r8 = com.bumptech.glide.load.ImageHeaderParser.ImageType.JPEG
            if (r6 != r8) goto L_0x0130
            r1 = 8
            int r1 = java.lang.Math.min(r9, r1)
            float r1 = (float) r1
            float r14 = r14 / r1
            double r10 = (double) r14
            double r10 = java.lang.Math.ceil(r10)
            int r4 = (int) r10
            float r12 = r12 / r1
            double r10 = (double) r12
            double r10 = java.lang.Math.ceil(r10)
            int r1 = (int) r10
            int r6 = r9 / 8
            if (r6 <= 0) goto L_0x012b
            int r4 = r4 / r6
            int r1 = r1 / r6
        L_0x012b:
            r6 = r4
            r4 = r1
        L_0x012d:
            r1 = r32
            goto L_0x0183
        L_0x0130:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r8 = com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG
            if (r6 == r8) goto L_0x0172
            com.bumptech.glide.load.ImageHeaderParser$ImageType r8 = com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG_A
            if (r6 != r8) goto L_0x0139
            goto L_0x0172
        L_0x0139:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r8 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP
            if (r6 == r8) goto L_0x0164
            com.bumptech.glide.load.ImageHeaderParser$ImageType r8 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP_A
            if (r6 != r8) goto L_0x0142
            goto L_0x0164
        L_0x0142:
            int r6 = r1 % r9
            if (r6 != 0) goto L_0x014f
            int r6 = r4 % r9
            if (r6 == 0) goto L_0x014b
            goto L_0x014f
        L_0x014b:
            int r1 = r1 / r9
            int r4 = r4 / r9
            r6 = r1
            goto L_0x012d
        L_0x014f:
            r1 = 1
            r3.inJustDecodeBounds = r1
            r1 = r32
            c(r2, r3, r7, r1)
            r4 = 0
            r3.inJustDecodeBounds = r4
            int r4 = r3.outWidth
            int r6 = r3.outHeight
            r38 = r6
            r6 = r4
            r4 = r38
            goto L_0x0183
        L_0x0164:
            r1 = r32
            float r4 = (float) r9
            float r14 = r14 / r4
            int r6 = java.lang.Math.round(r14)
            float r12 = r12 / r4
            int r4 = java.lang.Math.round(r12)
            goto L_0x0183
        L_0x0172:
            r1 = r32
            float r4 = (float) r9
            float r14 = r14 / r4
            double r10 = (double) r14
            double r10 = java.lang.Math.floor(r10)
            int r6 = (int) r10
            float r12 = r12 / r4
            double r10 = (double) r12
            double r10 = java.lang.Math.floor(r10)
            int r4 = (int) r10
        L_0x0183:
            r13 = r33
            float r0 = r0.b(r6, r4, r13, r5)
            double r10 = (double) r0
            r32 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r0 = (r10 > r32 ? 1 : (r10 == r32 ? 0 : -1))
            if (r0 > 0) goto L_0x0193
            r34 = r10
            goto L_0x0195
        L_0x0193:
            double r34 = r32 / r10
        L_0x0195:
            r36 = 4746794007244308480(0x41dfffffffc00000, double:2.147483647E9)
            double r34 = r34 * r36
            long r7 = java.lang.Math.round(r34)
            int r7 = (int) r7
            r8 = r1
            double r1 = (double) r7
            double r1 = r1 * r10
            double r1 = r1 + r30
            int r1 = (int) r1
            float r2 = (float) r1
            float r7 = (float) r7
            float r2 = r2 / r7
            r43 = r8
            double r7 = (double) r2
            double r7 = r10 / r7
            double r1 = (double) r1
            double r7 = r7 * r1
            double r7 = r7 + r30
            int r1 = (int) r7
            r3.inTargetDensity = r1
            if (r0 > 0) goto L_0x01bb
            r32 = r10
            goto L_0x01bd
        L_0x01bb:
            double r32 = r32 / r10
        L_0x01bd:
            double r32 = r32 * r36
            long r0 = java.lang.Math.round(r32)
            int r0 = (int) r0
            r3.inDensity = r0
            int r1 = r3.inTargetDensity
            if (r1 <= 0) goto L_0x01d0
            if (r0 <= 0) goto L_0x01d0
            if (r1 == r0) goto L_0x01d0
            r0 = 1
            goto L_0x01d1
        L_0x01d0:
            r0 = 0
        L_0x01d1:
            if (r0 == 0) goto L_0x01d7
            r1 = 1
            r3.inScaled = r1
            goto L_0x01dc
        L_0x01d7:
            r1 = 0
            r3.inTargetDensity = r1
            r3.inDensity = r1
        L_0x01dc:
            r2 = r29
            r1 = 2
            boolean r0 = android.util.Log.isLoggable(r2, r1)
            if (r0 == 0) goto L_0x0256
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Calculate scaling, source: ["
            r0.<init>(r1)
            r1 = r28
            r0.append(r1)
            r7 = r27
            r0.append(r7)
            r8 = r26
            r0.append(r8)
            java.lang.String r12 = "], degreesToRotate: "
            r0.append(r12)
            r12 = r25
            r0.append(r12)
            java.lang.String r12 = ", target: ["
            r0.append(r12)
            r0.append(r13)
            r0.append(r7)
            r0.append(r5)
            java.lang.String r12 = "], power of two scaled: ["
            r0.append(r12)
            r0.append(r6)
            r0.append(r7)
            r0.append(r4)
            java.lang.String r4 = "], exact scale factor: "
            r0.append(r4)
            r0.append(r15)
            java.lang.String r4 = ", power of 2 sample size: "
            r0.append(r4)
            r0.append(r9)
            java.lang.String r4 = ", adjusted scale factor: "
            r0.append(r4)
            r0.append(r10)
            r4 = r19
            r0.append(r4)
            int r6 = r3.inTargetDensity
            r0.append(r6)
            r9 = r46
            r0.append(r9)
            int r6 = r3.inDensity
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r2, r0)
            goto L_0x02de
        L_0x0256:
            r9 = r46
            r4 = r19
            r8 = r26
            r7 = r27
            r1 = r28
            goto L_0x02de
        L_0x0262:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Cannot round with null rounding"
            r0.<init>(r1)
            throw r0
        L_0x026a:
            r7 = r9
            r1 = r13
            r8 = r14
            r13 = r10
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Cannot scale with factor: "
            r3.<init>(r4)
            r3.append(r15)
            java.lang.String r4 = " from: "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = ", source: ["
            r3.append(r0)
            r3.append(r1)
            r3.append(r7)
            r3.append(r8)
            java.lang.String r0 = "], target: ["
            r3.append(r0)
            r3.append(r13)
            r3.append(r7)
            r3.append(r5)
            r0 = r24
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        L_0x02ab:
            r0 = r1
            r7 = r9
            r43 = r11
            r2 = r12
            r1 = r13
            r8 = r14
            r9 = r4
            r13 = r10
            r4 = r15
            r10 = 3
            boolean r11 = android.util.Log.isLoggable(r2, r10)
            if (r11 == 0) goto L_0x02de
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "Unable to determine dimensions for: "
            r10.<init>(r11)
            r10.append(r6)
            java.lang.String r6 = " with target ["
            r10.append(r6)
            r10.append(r13)
            r10.append(r7)
            r10.append(r5)
            r10.append(r0)
            java.lang.String r0 = r10.toString()
            android.util.Log.d(r2, r0)
        L_0x02de:
            r6 = r40
            z2.r r0 = r6.f9835e
            r11 = r22
            r10 = r23
            boolean r0 = r0.a(r13, r5, r10, r11)
            if (r0 == 0) goto L_0x02f6
            android.graphics.Bitmap$Config r10 = android.graphics.Bitmap.Config.HARDWARE
            r3.inPreferredConfig = r10
            r10 = 0
            r3.inMutable = r10
            goto L_0x02f7
        L_0x02f6:
            r10 = 0
        L_0x02f7:
            if (r0 == 0) goto L_0x02fc
            r11 = r9
        L_0x02fa:
            r9 = 1
            goto L_0x033c
        L_0x02fc:
            q2.b r0 = q2.b.PREFER_ARGB_8888
            r11 = r9
            r9 = r44
            if (r9 == r0) goto L_0x0337
            com.bumptech.glide.load.ImageHeaderParser$ImageType r0 = r41.d()     // Catch:{ IOException -> 0x030c }
            boolean r0 = r0.hasAlpha()     // Catch:{ IOException -> 0x030c }
            goto L_0x0326
        L_0x030c:
            r0 = move-exception
            r12 = 3
            boolean r12 = android.util.Log.isLoggable(r2, r12)
            if (r12 == 0) goto L_0x0325
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r14 = "Cannot determine whether the image has alpha or not from header, format "
            r12.<init>(r14)
            r12.append(r9)
            java.lang.String r9 = r12.toString()
            android.util.Log.d(r2, r9, r0)
        L_0x0325:
            r0 = r10
        L_0x0326:
            if (r0 == 0) goto L_0x032b
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            goto L_0x032d
        L_0x032b:
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.RGB_565
        L_0x032d:
            r3.inPreferredConfig = r0
            android.graphics.Bitmap$Config r9 = android.graphics.Bitmap.Config.RGB_565
            if (r0 != r9) goto L_0x02fa
            r9 = 1
            r3.inDither = r9
            goto L_0x033c
        L_0x0337:
            r9 = 1
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            r3.inPreferredConfig = r0
        L_0x033c:
            int r0 = android.os.Build.VERSION.SDK_INT
            int r12 = r3.inSampleSize
            if (r1 < 0) goto L_0x0349
            if (r8 < 0) goto L_0x0349
            if (r49 == 0) goto L_0x0349
            r10 = r13
            goto L_0x03cd
        L_0x0349:
            int r5 = r3.inTargetDensity
            if (r5 <= 0) goto L_0x0355
            int r13 = r3.inDensity
            if (r13 <= 0) goto L_0x0355
            if (r5 == r13) goto L_0x0355
            r13 = r9
            goto L_0x0356
        L_0x0355:
            r13 = r10
        L_0x0356:
            if (r13 == 0) goto L_0x035e
            float r5 = (float) r5
            int r13 = r3.inDensity
            float r13 = (float) r13
            float r5 = r5 / r13
            goto L_0x0360
        L_0x035e:
            r5 = 1065353216(0x3f800000, float:1.0)
        L_0x0360:
            float r13 = (float) r1
            float r14 = (float) r12
            float r13 = r13 / r14
            double r9 = (double) r13
            double r9 = java.lang.Math.ceil(r9)
            int r9 = (int) r9
            float r10 = (float) r8
            float r10 = r10 / r14
            double r13 = (double) r10
            double r13 = java.lang.Math.ceil(r13)
            int r10 = (int) r13
            float r9 = (float) r9
            float r9 = r9 * r5
            int r9 = java.lang.Math.round(r9)
            float r10 = (float) r10
            float r10 = r10 * r5
            int r10 = java.lang.Math.round(r10)
            r13 = 2
            boolean r14 = android.util.Log.isLoggable(r2, r13)
            if (r14 == 0) goto L_0x03cb
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r14 = "Calculated target ["
            r13.<init>(r14)
            r13.append(r9)
            r13.append(r7)
            r13.append(r10)
            java.lang.String r14 = "] for source ["
            r13.append(r14)
            r13.append(r1)
            r13.append(r7)
            r13.append(r8)
            java.lang.String r14 = "], sampleSize: "
            r13.append(r14)
            r13.append(r12)
            java.lang.String r12 = ", targetDensity: "
            r13.append(r12)
            int r12 = r3.inTargetDensity
            r13.append(r12)
            r13.append(r11)
            int r12 = r3.inDensity
            r13.append(r12)
            java.lang.String r12 = ", density multiplier: "
            r13.append(r12)
            r13.append(r5)
            java.lang.String r5 = r13.toString()
            android.util.Log.v(r2, r5)
        L_0x03cb:
            r5 = r10
            r10 = r9
        L_0x03cd:
            r9 = 0
            r12 = 26
            if (r10 <= 0) goto L_0x03f2
            if (r5 <= 0) goto L_0x03f2
            if (r0 < r12) goto L_0x03e4
            android.graphics.Bitmap$Config r13 = r3.inPreferredConfig
            android.graphics.Bitmap$Config r14 = android.graphics.Bitmap.Config.HARDWARE
            if (r13 != r14) goto L_0x03df
            goto L_0x03f2
        L_0x03df:
            android.graphics.Bitmap$Config r13 = r42.outConfig
            goto L_0x03e5
        L_0x03e4:
            r13 = r9
        L_0x03e5:
            if (r13 != 0) goto L_0x03e9
            android.graphics.Bitmap$Config r13 = r3.inPreferredConfig
        L_0x03e9:
            r14 = r43
            android.graphics.Bitmap r5 = r14.c(r10, r5, r13)
            r3.inBitmap = r5
            goto L_0x03f4
        L_0x03f2:
            r14 = r43
        L_0x03f4:
            r5 = 28
            if (r0 < r5) goto L_0x0424
            q2.i r0 = q2.i.DISPLAY_P3
            r5 = r45
            if (r5 != r0) goto L_0x0410
            android.graphics.ColorSpace r0 = r42.outColorSpace
            if (r0 == 0) goto L_0x0410
            android.graphics.ColorSpace r0 = r42.outColorSpace
            boolean r0 = r0.isWideGamut()
            if (r0 == 0) goto L_0x0410
            r10 = 1
            goto L_0x0411
        L_0x0410:
            r10 = 0
        L_0x0411:
            if (r10 == 0) goto L_0x0418
            android.graphics.ColorSpace$Named r0 = android.graphics.ColorSpace.Named.DISPLAY_P3
            goto L_0x041c
        L_0x0418:
            android.graphics.ColorSpace$Named r0 = android.graphics.ColorSpace.Named.SRGB
        L_0x041c:
            android.graphics.ColorSpace r0 = android.graphics.ColorSpace.get(r0)
            r3.inPreferredColorSpace = r0
            goto L_0x0431
        L_0x0424:
            if (r0 < r12) goto L_0x0431
            android.graphics.ColorSpace$Named r0 = android.graphics.ColorSpace.Named.SRGB
            android.graphics.ColorSpace r0 = android.graphics.ColorSpace.get(r0)
            r3.inPreferredColorSpace = r0
        L_0x0431:
            r5 = r41
            r10 = r50
            android.graphics.Bitmap r0 = c(r5, r3, r10, r14)
            r10.a(r0, r14)
            r5 = 2
            boolean r5 = android.util.Log.isLoggable(r2, r5)
            if (r5 == 0) goto L_0x04c6
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r10 = "Decoded "
            r5.<init>(r10)
            java.lang.String r10 = d(r0)
            r5.append(r10)
            java.lang.String r10 = " from ["
            r5.append(r10)
            r5.append(r1)
            r5.append(r7)
            r5.append(r8)
            java.lang.String r1 = "] "
            r5.append(r1)
            r1 = r20
            r5.append(r1)
            java.lang.String r1 = " with inBitmap "
            r5.append(r1)
            android.graphics.Bitmap r1 = r3.inBitmap
            java.lang.String r1 = d(r1)
            r5.append(r1)
            java.lang.String r1 = " for ["
            r5.append(r1)
            r1 = r47
            r5.append(r1)
            r5.append(r7)
            r1 = r48
            r5.append(r1)
            java.lang.String r1 = "], sample size: "
            r5.append(r1)
            int r1 = r3.inSampleSize
            r5.append(r1)
            r5.append(r11)
            int r1 = r3.inDensity
            r5.append(r1)
            r5.append(r4)
            int r1 = r3.inTargetDensity
            r5.append(r1)
            java.lang.String r1 = ", thread: "
            r5.append(r1)
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            java.lang.String r1 = r1.getName()
            r5.append(r1)
            java.lang.String r1 = ", duration: "
            r5.append(r1)
            double r3 = m3.f.a(r17)
            r5.append(r3)
            java.lang.String r1 = r5.toString()
            android.util.Log.v(r2, r1)
        L_0x04c6:
            if (r0 == 0) goto L_0x055e
            android.util.DisplayMetrics r1 = r6.f9833b
            int r1 = r1.densityDpi
            r0.setDensity(r1)
            switch(r16) {
                case 2: goto L_0x04d4;
                case 3: goto L_0x04d4;
                case 4: goto L_0x04d4;
                case 5: goto L_0x04d4;
                case 6: goto L_0x04d4;
                case 7: goto L_0x04d4;
                case 8: goto L_0x04d4;
                default: goto L_0x04d2;
            }
        L_0x04d2:
            r10 = 0
            goto L_0x04d5
        L_0x04d4:
            r10 = 1
        L_0x04d5:
            if (r10 != 0) goto L_0x04da
            r9 = r0
            goto L_0x0555
        L_0x04da:
            android.graphics.Matrix r1 = new android.graphics.Matrix
            r1.<init>()
            r2 = -1028390912(0xffffffffc2b40000, float:-90.0)
            r3 = 1119092736(0x42b40000, float:90.0)
            r4 = 1127481344(0x43340000, float:180.0)
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            switch(r16) {
                case 2: goto L_0x0508;
                case 3: goto L_0x0504;
                case 4: goto L_0x04fb;
                case 5: goto L_0x04f7;
                case 6: goto L_0x04f3;
                case 7: goto L_0x04ef;
                case 8: goto L_0x04eb;
                default: goto L_0x04ea;
            }
        L_0x04ea:
            goto L_0x050d
        L_0x04eb:
            r1.setRotate(r2)
            goto L_0x050d
        L_0x04ef:
            r1.setRotate(r2)
            goto L_0x04fe
        L_0x04f3:
            r1.setRotate(r3)
            goto L_0x050d
        L_0x04f7:
            r1.setRotate(r3)
            goto L_0x04fe
        L_0x04fb:
            r1.setRotate(r4)
        L_0x04fe:
            r2 = 1065353216(0x3f800000, float:1.0)
            r1.postScale(r5, r2)
            goto L_0x050d
        L_0x0504:
            r1.setRotate(r4)
            goto L_0x050d
        L_0x0508:
            r2 = 1065353216(0x3f800000, float:1.0)
            r1.setScale(r5, r2)
        L_0x050d:
            android.graphics.RectF r2 = new android.graphics.RectF
            int r3 = r0.getWidth()
            float r3 = (float) r3
            int r4 = r0.getHeight()
            float r4 = (float) r4
            r5 = 0
            r2.<init>(r5, r5, r3, r4)
            r1.mapRect(r2)
            float r3 = r2.width()
            int r3 = java.lang.Math.round(r3)
            float r4 = r2.height()
            int r4 = java.lang.Math.round(r4)
            android.graphics.Bitmap$Config r5 = r0.getConfig()
            if (r5 == 0) goto L_0x053b
            android.graphics.Bitmap$Config r5 = r0.getConfig()
            goto L_0x053d
        L_0x053b:
            android.graphics.Bitmap$Config r5 = android.graphics.Bitmap.Config.ARGB_8888
        L_0x053d:
            android.graphics.Bitmap r3 = r14.d(r3, r4, r5)
            float r4 = r2.left
            float r4 = -r4
            float r2 = r2.top
            float r2 = -r2
            r1.postTranslate(r4, r2)
            boolean r2 = r0.hasAlpha()
            r3.setHasAlpha(r2)
            z2.z.a(r0, r3, r1)
            r9 = r3
        L_0x0555:
            boolean r1 = r0.equals(r9)
            if (r1 != 0) goto L_0x055e
            r14.e(r0)
        L_0x055e:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: z2.m.b(z2.s, android.graphics.BitmapFactory$Options, z2.k, q2.b, q2.i, boolean, int, int, boolean, z2.m$b):android.graphics.Bitmap");
    }
}
