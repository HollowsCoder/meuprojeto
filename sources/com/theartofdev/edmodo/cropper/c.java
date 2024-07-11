package com.theartofdev.edmodo.cropper;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.util.Log;
import android.util.Pair;
import com.theartofdev.edmodo.cropper.CropImageView;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final Rect f4079a = new Rect();

    /* renamed from: b  reason: collision with root package name */
    public static final RectF f4080b = new RectF();

    /* renamed from: c  reason: collision with root package name */
    public static final RectF f4081c = new RectF();
    public static final float[] d = new float[6];

    /* renamed from: e  reason: collision with root package name */
    public static final float[] f4082e = new float[6];

    /* renamed from: f  reason: collision with root package name */
    public static int f4083f;

    /* renamed from: g  reason: collision with root package name */
    public static Pair<String, WeakReference<Bitmap>> f4084g;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final Bitmap f4085a;

        /* renamed from: b  reason: collision with root package name */
        public final int f4086b;

        public a(Bitmap bitmap, int i10) {
            this.f4085a = bitmap;
            this.f4086b = i10;
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final Bitmap f4087a;

        /* renamed from: b  reason: collision with root package name */
        public final int f4088b;

        public b(Bitmap bitmap, int i10) {
            this.f4087a = bitmap;
            this.f4088b = i10;
        }
    }

    public static int a(int i10, int i11) {
        int i12 = 1;
        if (f4083f == 0) {
            int i13 = 2048;
            try {
                EGL10 egl10 = (EGL10) EGLContext.getEGL();
                EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
                egl10.eglInitialize(eglGetDisplay, new int[2]);
                int[] iArr = new int[1];
                egl10.eglGetConfigs(eglGetDisplay, (EGLConfig[]) null, 0, iArr);
                int i14 = iArr[0];
                EGLConfig[] eGLConfigArr = new EGLConfig[i14];
                egl10.eglGetConfigs(eglGetDisplay, eGLConfigArr, i14, iArr);
                int[] iArr2 = new int[1];
                int i15 = 0;
                for (int i16 = 0; i16 < iArr[0]; i16++) {
                    egl10.eglGetConfigAttrib(eglGetDisplay, eGLConfigArr[i16], 12332, iArr2);
                    int i17 = iArr2[0];
                    if (i15 < i17) {
                        i15 = i17;
                    }
                }
                egl10.eglTerminate(eglGetDisplay);
                i13 = Math.max(i15, 2048);
            } catch (Exception unused) {
            }
            f4083f = i13;
        }
        if (f4083f > 0) {
            while (true) {
                int i18 = i11 / i12;
                int i19 = f4083f;
                if (i18 <= i19 && i10 / i12 <= i19) {
                    break;
                }
                i12 *= 2;
            }
        }
        return i12;
    }

    public static int b(int i10, int i11, int i12, int i13) {
        int i14 = 1;
        if (i11 > i13 || i10 > i12) {
            while ((i11 / 2) / i14 > i13 && (i10 / 2) / i14 > i12) {
                i14 *= 2;
            }
        }
        return i14;
    }

    public static void c(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static a d(Context context, Uri uri, float[] fArr, int i10, int i11, int i12, boolean z, int i13, int i14, int i15, int i16, boolean z10, boolean z11) {
        OutOfMemoryError outOfMemoryError;
        int i17 = 1;
        do {
            try {
                return e(context, uri, fArr, i10, i11, i12, z, i13, i14, i15, i16, z10, z11, i17);
            } catch (OutOfMemoryError e10) {
                outOfMemoryError = e10;
                i17 *= 2;
                if (i17 > 16) {
                    throw new RuntimeException("Failed to handle OOM by sampling (" + i17 + "): " + uri + "\r\n" + outOfMemoryError.getMessage(), outOfMemoryError);
                }
            }
        } while (i17 > 16);
        throw new RuntimeException("Failed to handle OOM by sampling (" + i17 + "): " + uri + "\r\n" + outOfMemoryError.getMessage(), outOfMemoryError);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00e8, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00e9, code lost:
        r17 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00f9, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0119, code lost:
        throw new java.lang.RuntimeException("Failed to load sampled bitmap: " + r7 + "\r\n" + r0.getMessage(), r0);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0045 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x009b A[SYNTHETIC, Splitter:B:42:0x009b] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00f9 A[ExcHandler: Exception (r0v3 'e' java.lang.Exception A[CUSTOM_DECLARE]), Splitter:B:42:0x009b] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.theartofdev.edmodo.cropper.c.a e(android.content.Context r18, android.net.Uri r19, float[] r20, int r21, int r22, int r23, boolean r24, int r25, int r26, int r27, int r28, boolean r29, boolean r30, int r31) {
        /*
            r7 = r19
            r0 = r20
            r10 = r21
            r1 = r20
            r2 = r22
            r3 = r23
            r4 = r24
            r5 = r25
            r6 = r26
            android.graphics.Rect r8 = n(r1, r2, r3, r4, r5, r6)
            if (r27 <= 0) goto L_0x001b
            r9 = r27
            goto L_0x0020
        L_0x001b:
            int r1 = r8.width()
            r9 = r1
        L_0x0020:
            if (r28 <= 0) goto L_0x0025
            r11 = r28
            goto L_0x002a
        L_0x0025:
            int r1 = r8.height()
            r11 = r1
        L_0x002a:
            r17 = 0
            r1 = r18
            r2 = r19
            r3 = r8
            r4 = r9
            r5 = r11
            r6 = r31
            com.theartofdev.edmodo.cropper.c$a r1 = k(r1, r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x003e }
            android.graphics.Bitmap r2 = r1.f4085a     // Catch:{ Exception -> 0x003e }
            int r1 = r1.f4086b     // Catch:{ Exception -> 0x0040 }
            goto L_0x0041
        L_0x003e:
            r2 = r17
        L_0x0040:
            r1 = 1
        L_0x0041:
            r12 = r1
            r13 = r2
            if (r13 == 0) goto L_0x009b
            if (r10 > 0) goto L_0x004b
            if (r29 != 0) goto L_0x004b
            if (r30 == 0) goto L_0x007a
        L_0x004b:
            android.graphics.Matrix r6 = new android.graphics.Matrix     // Catch:{ OutOfMemoryError -> 0x0094 }
            r6.<init>()     // Catch:{ OutOfMemoryError -> 0x0094 }
            float r1 = (float) r10     // Catch:{ OutOfMemoryError -> 0x0094 }
            r6.setRotate(r1)     // Catch:{ OutOfMemoryError -> 0x0094 }
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r29 == 0) goto L_0x005c
            r3 = r1
            goto L_0x005d
        L_0x005c:
            r3 = r2
        L_0x005d:
            if (r30 == 0) goto L_0x0060
            goto L_0x0061
        L_0x0060:
            r1 = r2
        L_0x0061:
            r6.postScale(r3, r1)     // Catch:{ OutOfMemoryError -> 0x0094 }
            r2 = 0
            r3 = 0
            int r4 = r13.getWidth()     // Catch:{ OutOfMemoryError -> 0x0094 }
            int r5 = r13.getHeight()     // Catch:{ OutOfMemoryError -> 0x0094 }
            r7 = 0
            r1 = r13
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createBitmap(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ OutOfMemoryError -> 0x0094 }
            if (r1 == r13) goto L_0x0079
            r13.recycle()     // Catch:{ OutOfMemoryError -> 0x0094 }
        L_0x0079:
            r13 = r1
        L_0x007a:
            int r1 = r10 % 90
            if (r1 == 0) goto L_0x008e
            r1 = r13
            r2 = r20
            r3 = r8
            r4 = r21
            r5 = r24
            r6 = r25
            r7 = r26
            android.graphics.Bitmap r13 = h(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ OutOfMemoryError -> 0x0094 }
        L_0x008e:
            com.theartofdev.edmodo.cropper.c$a r0 = new com.theartofdev.edmodo.cropper.c$a
            r0.<init>(r13, r12)
            return r0
        L_0x0094:
            r0 = move-exception
            if (r13 == 0) goto L_0x009a
            r13.recycle()
        L_0x009a:
            throw r0
        L_0x009b:
            android.graphics.BitmapFactory$Options r1 = new android.graphics.BitmapFactory$Options     // Catch:{ OutOfMemoryError -> 0x011a, Exception -> 0x00f9 }
            r1.<init>()     // Catch:{ OutOfMemoryError -> 0x011a, Exception -> 0x00f9 }
            int r2 = r8.width()     // Catch:{ OutOfMemoryError -> 0x011a, Exception -> 0x00f9 }
            int r3 = r8.height()     // Catch:{ OutOfMemoryError -> 0x011a, Exception -> 0x00f9 }
            int r2 = b(r2, r3, r9, r11)     // Catch:{ OutOfMemoryError -> 0x011a, Exception -> 0x00f9 }
            int r2 = r2 * r31
            r1.inSampleSize = r2     // Catch:{ OutOfMemoryError -> 0x011a, Exception -> 0x00f9 }
            android.content.ContentResolver r3 = r18.getContentResolver()     // Catch:{ OutOfMemoryError -> 0x011a, Exception -> 0x00f9 }
            android.graphics.Bitmap r3 = i(r3, r7, r1)     // Catch:{ OutOfMemoryError -> 0x011a, Exception -> 0x00f9 }
            if (r3 == 0) goto L_0x00f1
            int r4 = r0.length     // Catch:{ all -> 0x00ec }
            float[] r9 = new float[r4]     // Catch:{ all -> 0x00ec }
            int r5 = r0.length     // Catch:{ all -> 0x00ec }
            r6 = 0
            java.lang.System.arraycopy(r0, r6, r9, r6, r5)     // Catch:{ all -> 0x00ec }
        L_0x00c2:
            if (r6 >= r4) goto L_0x00cf
            r0 = r9[r6]     // Catch:{ all -> 0x00ec }
            int r5 = r1.inSampleSize     // Catch:{ all -> 0x00ec }
            float r5 = (float) r5     // Catch:{ all -> 0x00ec }
            float r0 = r0 / r5
            r9[r6] = r0     // Catch:{ all -> 0x00ec }
            int r6 = r6 + 1
            goto L_0x00c2
        L_0x00cf:
            r14 = 1065353216(0x3f800000, float:1.0)
            r8 = r3
            r10 = r21
            r11 = r24
            r12 = r25
            r13 = r26
            r15 = r29
            r16 = r30
            android.graphics.Bitmap r1 = g(r8, r9, r10, r11, r12, r13, r14, r15, r16)     // Catch:{ all -> 0x00ec }
            if (r1 == r3) goto L_0x00f3
            r3.recycle()     // Catch:{ OutOfMemoryError -> 0x00e8, Exception -> 0x00f9 }
            goto L_0x00f3
        L_0x00e8:
            r0 = move-exception
            r17 = r1
            goto L_0x011b
        L_0x00ec:
            r0 = move-exception
            r3.recycle()     // Catch:{ OutOfMemoryError -> 0x011a, Exception -> 0x00f9 }
            throw r0     // Catch:{ OutOfMemoryError -> 0x011a, Exception -> 0x00f9 }
        L_0x00f1:
            r1 = r17
        L_0x00f3:
            com.theartofdev.edmodo.cropper.c$a r0 = new com.theartofdev.edmodo.cropper.c$a
            r0.<init>(r1, r2)
            return r0
        L_0x00f9:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Failed to load sampled bitmap: "
            r2.<init>(r3)
            r2.append(r7)
            java.lang.String r3 = "\r\n"
            r2.append(r3)
            java.lang.String r3 = r0.getMessage()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2, r0)
            throw r1
        L_0x011a:
            r0 = move-exception
        L_0x011b:
            if (r17 == 0) goto L_0x0120
            r17.recycle()
        L_0x0120:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.theartofdev.edmodo.cropper.c.e(android.content.Context, android.net.Uri, float[], int, int, int, boolean, int, int, int, int, boolean, boolean, int):com.theartofdev.edmodo.cropper.c$a");
    }

    public static a f(Bitmap bitmap, float[] fArr, int i10, boolean z, int i11, int i12, boolean z10, boolean z11) {
        int i13 = 1;
        do {
            try {
                return new a(g(bitmap, fArr, i10, z, i11, i12, 1.0f / ((float) i13), z10, z11), i13);
            } catch (OutOfMemoryError e10) {
                i13 *= 2;
                if (i13 > 8) {
                    throw e10;
                }
            }
        } while (i13 > 8);
        throw e10;
    }

    public static Bitmap g(Bitmap bitmap, float[] fArr, int i10, boolean z, int i11, int i12, float f10, boolean z10, boolean z11) {
        Bitmap bitmap2 = bitmap;
        int i13 = i10;
        float f11 = f10;
        Rect n10 = n(fArr, bitmap.getWidth(), bitmap.getHeight(), z, i11, i12);
        Matrix matrix = new Matrix();
        matrix.setRotate((float) i13, (float) (bitmap.getWidth() / 2), (float) (bitmap.getHeight() / 2));
        float f12 = z10 ? -f11 : f11;
        if (z11) {
            f11 = -f11;
        }
        matrix.postScale(f12, f11);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, n10.left, n10.top, n10.width(), n10.height(), matrix, true);
        if (createBitmap == bitmap2) {
            createBitmap = bitmap.copy(bitmap.getConfig(), false);
        }
        return i13 % 90 != 0 ? h(createBitmap, fArr, n10, i10, z, i11, i12) : createBitmap;
    }

    public static Bitmap h(Bitmap bitmap, float[] fArr, Rect rect, int i10, boolean z, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        if (i10 % 90 == 0) {
            return bitmap;
        }
        double radians = Math.toRadians((double) i10);
        int i16 = (i10 < 90 || (i10 > 180 && i10 < 270)) ? rect.left : rect.right;
        int i17 = 0;
        int i18 = 0;
        while (true) {
            if (i18 >= fArr.length) {
                i13 = 0;
                i14 = 0;
                i15 = 0;
                break;
            }
            float f10 = fArr[i18];
            if (f10 >= ((float) (i16 - 1)) && f10 <= ((float) (i16 + 1))) {
                int i19 = i18 + 1;
                int abs = (int) Math.abs(Math.sin(radians) * ((double) (((float) rect.bottom) - fArr[i19])));
                int abs2 = (int) Math.abs(Math.cos(radians) * ((double) (fArr[i19] - ((float) rect.top))));
                int abs3 = (int) Math.abs(((double) (((float) rect.bottom) - fArr[i19])) / Math.cos(radians));
                i15 = abs2;
                i14 = abs3;
                i13 = abs;
                i17 = (int) Math.abs(((double) (fArr[i19] - ((float) rect.top))) / Math.sin(radians));
                break;
            }
            i18 += 2;
        }
        rect.set(i13, i15, i17 + i13, i14 + i15);
        if (z) {
            l(rect, i11, i12);
        }
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, rect.left, rect.top, rect.width(), rect.height());
        if (bitmap != createBitmap) {
            bitmap.recycle();
        }
        return createBitmap;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002d, code lost:
        c((java.io.Closeable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0030, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000f, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
        r4.inSampleSize *= 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0017, code lost:
        c((java.io.Closeable) null);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0011 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap i(android.content.ContentResolver r2, android.net.Uri r3, android.graphics.BitmapFactory.Options r4) {
        /*
        L_0x0000:
            r0 = 0
            java.io.InputStream r0 = r2.openInputStream(r3)     // Catch:{ OutOfMemoryError -> 0x0011 }
            android.graphics.Rect r1 = f4079a     // Catch:{ OutOfMemoryError -> 0x0011 }
            android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeStream(r0, r1, r4)     // Catch:{ OutOfMemoryError -> 0x0011 }
            c(r0)
            return r2
        L_0x000f:
            r2 = move-exception
            goto L_0x002d
        L_0x0011:
            int r1 = r4.inSampleSize     // Catch:{ all -> 0x000f }
            int r1 = r1 * 2
            r4.inSampleSize = r1     // Catch:{ all -> 0x000f }
            c(r0)
            int r0 = r4.inSampleSize
            r1 = 512(0x200, float:7.175E-43)
            if (r0 > r1) goto L_0x0021
            goto L_0x0000
        L_0x0021:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.String r4 = "Failed to decode image: "
            java.lang.String r3 = androidx.appcompat.widget.x0.d(r4, r3)
            r2.<init>(r3)
            throw r2
        L_0x002d:
            c(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.theartofdev.edmodo.cropper.c.i(android.content.ContentResolver, android.net.Uri, android.graphics.BitmapFactory$Options):android.graphics.Bitmap");
    }

    public static a j(Context context, Uri uri, int i10, int i11) {
        InputStream inputStream;
        try {
            ContentResolver contentResolver = context.getContentResolver();
            try {
                inputStream = contentResolver.openInputStream(uri);
                try {
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeStream(inputStream, f4079a, options);
                    options.inJustDecodeBounds = false;
                    c(inputStream);
                    int i12 = options.outWidth;
                    if (i12 == -1) {
                        if (options.outHeight == -1) {
                            throw new RuntimeException("File is not a picture");
                        }
                    }
                    options.inSampleSize = Math.max(b(i12, options.outHeight, i10, i11), a(options.outWidth, options.outHeight));
                    return new a(i(contentResolver, uri, options), options.inSampleSize);
                } catch (Throwable th) {
                    th = th;
                    c(inputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                inputStream = null;
                c(inputStream);
                throw th;
            }
        } catch (Exception e10) {
            throw new RuntimeException("Failed to load sampled bitmap: " + uri + "\r\n" + e10.getMessage(), e10);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: android.graphics.BitmapRegionDecoder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: android.graphics.BitmapRegionDecoder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v9, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v10, resolved type: android.graphics.BitmapRegionDecoder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: android.graphics.BitmapRegionDecoder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v12, resolved type: android.graphics.BitmapRegionDecoder} */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002d, code lost:
        c(r5);
        r8.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0033, code lost:
        return r9;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0038 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x008f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.theartofdev.edmodo.cropper.c.a k(android.content.Context r5, android.net.Uri r6, android.graphics.Rect r7, int r8, int r9, int r10) {
        /*
            r0 = 0
            android.graphics.BitmapFactory$Options r1 = new android.graphics.BitmapFactory$Options     // Catch:{ Exception -> 0x0063, all -> 0x005f }
            r1.<init>()     // Catch:{ Exception -> 0x0063, all -> 0x005f }
            int r2 = r7.width()     // Catch:{ Exception -> 0x0063, all -> 0x005f }
            int r3 = r7.height()     // Catch:{ Exception -> 0x0063, all -> 0x005f }
            int r8 = b(r2, r3, r8, r9)     // Catch:{ Exception -> 0x0063, all -> 0x005f }
            int r10 = r10 * r8
            r1.inSampleSize = r10     // Catch:{ Exception -> 0x0063, all -> 0x005f }
            android.content.ContentResolver r5 = r5.getContentResolver()     // Catch:{ Exception -> 0x0063, all -> 0x005f }
            java.io.InputStream r5 = r5.openInputStream(r6)     // Catch:{ Exception -> 0x0063, all -> 0x005f }
            r8 = 0
            android.graphics.BitmapRegionDecoder r8 = android.graphics.BitmapRegionDecoder.newInstance(r5, r8)     // Catch:{ Exception -> 0x005a, all -> 0x0055 }
        L_0x0022:
            com.theartofdev.edmodo.cropper.c$a r9 = new com.theartofdev.edmodo.cropper.c$a     // Catch:{ OutOfMemoryError -> 0x0038 }
            android.graphics.Bitmap r10 = r8.decodeRegion(r7, r1)     // Catch:{ OutOfMemoryError -> 0x0038 }
            int r2 = r1.inSampleSize     // Catch:{ OutOfMemoryError -> 0x0038 }
            r9.<init>(r10, r2)     // Catch:{ OutOfMemoryError -> 0x0038 }
            c(r5)
            r8.recycle()
            return r9
        L_0x0034:
            r6 = move-exception
            goto L_0x0051
        L_0x0036:
            r7 = move-exception
            goto L_0x0053
        L_0x0038:
            int r9 = r1.inSampleSize     // Catch:{ Exception -> 0x0036, all -> 0x0034 }
            int r9 = r9 * 2
            r1.inSampleSize = r9     // Catch:{ Exception -> 0x0036, all -> 0x0034 }
            r10 = 512(0x200, float:7.175E-43)
            if (r9 <= r10) goto L_0x0022
            c(r5)
            if (r8 == 0) goto L_0x004a
            r8.recycle()
        L_0x004a:
            com.theartofdev.edmodo.cropper.c$a r5 = new com.theartofdev.edmodo.cropper.c$a
            r6 = 1
            r5.<init>(r0, r6)
            return r5
        L_0x0051:
            r0 = r8
            goto L_0x0056
        L_0x0053:
            r0 = r8
            goto L_0x005b
        L_0x0055:
            r6 = move-exception
        L_0x0056:
            r4 = r0
            r0 = r5
            r5 = r4
            goto L_0x008a
        L_0x005a:
            r7 = move-exception
        L_0x005b:
            r4 = r0
            r0 = r5
            r5 = r4
            goto L_0x0066
        L_0x005f:
            r5 = move-exception
            r6 = r5
            r5 = r0
            goto L_0x008a
        L_0x0063:
            r5 = move-exception
            r7 = r5
            r5 = r0
        L_0x0066:
            java.lang.RuntimeException r8 = new java.lang.RuntimeException     // Catch:{ all -> 0x0089 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x0089 }
            r9.<init>()     // Catch:{ all -> 0x0089 }
            java.lang.String r10 = "Failed to load sampled bitmap: "
            r9.append(r10)     // Catch:{ all -> 0x0089 }
            r9.append(r6)     // Catch:{ all -> 0x0089 }
            java.lang.String r6 = "\r\n"
            r9.append(r6)     // Catch:{ all -> 0x0089 }
            java.lang.String r6 = r7.getMessage()     // Catch:{ all -> 0x0089 }
            r9.append(r6)     // Catch:{ all -> 0x0089 }
            java.lang.String r6 = r9.toString()     // Catch:{ all -> 0x0089 }
            r8.<init>(r6, r7)     // Catch:{ all -> 0x0089 }
            throw r8     // Catch:{ all -> 0x0089 }
        L_0x0089:
            r6 = move-exception
        L_0x008a:
            c(r0)
            if (r5 == 0) goto L_0x0092
            r5.recycle()
        L_0x0092:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.theartofdev.edmodo.cropper.c.k(android.content.Context, android.net.Uri, android.graphics.Rect, int, int, int):com.theartofdev.edmodo.cropper.c$a");
    }

    public static void l(Rect rect, int i10, int i11) {
        if (i10 == i11 && rect.width() != rect.height()) {
            if (rect.height() > rect.width()) {
                rect.bottom -= rect.height() - rect.width();
            } else {
                rect.right -= rect.width() - rect.height();
            }
        }
    }

    public static float m(float[] fArr) {
        return Math.max(Math.max(Math.max(fArr[1], fArr[3]), fArr[5]), fArr[7]);
    }

    public static Rect n(float[] fArr, int i10, int i11, boolean z, int i12, int i13) {
        Rect rect = new Rect(Math.round(Math.max(0.0f, o(fArr))), Math.round(Math.max(0.0f, q(fArr))), Math.round(Math.min((float) i10, p(fArr))), Math.round(Math.min((float) i11, m(fArr))));
        if (z) {
            l(rect, i12, i13);
        }
        return rect;
    }

    public static float o(float[] fArr) {
        return Math.min(Math.min(Math.min(fArr[0], fArr[2]), fArr[4]), fArr[6]);
    }

    public static float p(float[] fArr) {
        return Math.max(Math.max(Math.max(fArr[0], fArr[2]), fArr[4]), fArr[6]);
    }

    public static float q(float[] fArr) {
        return Math.min(Math.min(Math.min(fArr[1], fArr[3]), fArr[5]), fArr[7]);
    }

    public static Bitmap r(Bitmap bitmap, int i10, int i11, CropImageView.j jVar) {
        Bitmap bitmap2;
        if (i10 > 0 && i11 > 0) {
            try {
                CropImageView.j jVar2 = CropImageView.j.RESIZE_FIT;
                if (jVar == jVar2 || jVar == CropImageView.j.RESIZE_INSIDE || jVar == CropImageView.j.RESIZE_EXACT) {
                    if (jVar == CropImageView.j.RESIZE_EXACT) {
                        bitmap2 = Bitmap.createScaledBitmap(bitmap, i10, i11, false);
                    } else {
                        float width = (float) bitmap.getWidth();
                        float height = (float) bitmap.getHeight();
                        float max = Math.max(width / ((float) i10), height / ((float) i11));
                        if (max <= 1.0f) {
                            if (jVar != jVar2) {
                                bitmap2 = null;
                            }
                        }
                        bitmap2 = Bitmap.createScaledBitmap(bitmap, (int) (width / max), (int) (height / max), false);
                    }
                    if (bitmap2 != null) {
                        if (bitmap2 != bitmap) {
                            bitmap.recycle();
                        }
                        return bitmap2;
                    }
                }
            } catch (Exception e10) {
                Log.w("AIC", "Failed to resize cropped image, return bitmap before resize", e10);
            }
        }
        return bitmap;
    }
}
