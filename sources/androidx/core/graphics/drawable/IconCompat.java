package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import com.karumi.dexter.BuildConfig;
import java.lang.reflect.InvocationTargetException;

public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k  reason: collision with root package name */
    public static final PorterDuff.Mode f970k = PorterDuff.Mode.SRC_IN;

    /* renamed from: a  reason: collision with root package name */
    public int f971a;

    /* renamed from: b  reason: collision with root package name */
    public Object f972b;

    /* renamed from: c  reason: collision with root package name */
    public byte[] f973c;
    public Parcelable d;

    /* renamed from: e  reason: collision with root package name */
    public int f974e;

    /* renamed from: f  reason: collision with root package name */
    public int f975f;

    /* renamed from: g  reason: collision with root package name */
    public ColorStateList f976g;

    /* renamed from: h  reason: collision with root package name */
    public PorterDuff.Mode f977h;

    /* renamed from: i  reason: collision with root package name */
    public String f978i;

    /* renamed from: j  reason: collision with root package name */
    public String f979j;

    public IconCompat() {
        this.f971a = -1;
        this.f973c = null;
        this.d = null;
        this.f974e = 0;
        this.f975f = 0;
        this.f976g = null;
        this.f977h = f970k;
        this.f978i = null;
    }

    public IconCompat(int i10) {
        this.f973c = null;
        this.d = null;
        this.f974e = 0;
        this.f975f = 0;
        this.f976g = null;
        this.f977h = f970k;
        this.f978i = null;
        this.f971a = i10;
    }

    public static Bitmap a(Bitmap bitmap, boolean z) {
        int min = (int) (((float) Math.min(bitmap.getWidth(), bitmap.getHeight())) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f10 = (float) min;
        float f11 = 0.5f * f10;
        float f12 = 0.9166667f * f11;
        if (z) {
            float f13 = 0.010416667f * f10;
            paint.setColor(0);
            paint.setShadowLayer(f13, 0.0f, f10 * 0.020833334f, 1023410176);
            canvas.drawCircle(f11, f11, f12, paint);
            paint.setShadowLayer(f13, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f11, f11, f12, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((float) ((-(bitmap.getWidth() - min)) / 2), (float) ((-(bitmap.getHeight() - min)) / 2));
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f11, f11, f12, paint);
        canvas.setBitmap((Bitmap) null);
        return createBitmap;
    }

    public static IconCompat b(int i10) {
        if (i10 != 0) {
            IconCompat iconCompat = new IconCompat(2);
            iconCompat.f974e = i10;
            iconCompat.f972b = BuildConfig.FLAVOR;
            iconCompat.f979j = BuildConfig.FLAVOR;
            return iconCompat;
        }
        throw new IllegalArgumentException("Drawable resource ID must not be 0");
    }

    public final int c() {
        int i10 = this.f971a;
        if (i10 == -1) {
            int i11 = Build.VERSION.SDK_INT;
            Icon icon = (Icon) this.f972b;
            if (i11 >= 28) {
                return icon.getResId();
            }
            try {
                return ((Integer) icon.getClass().getMethod("getResId", new Class[0]).invoke(icon, new Object[0])).intValue();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e10) {
                Log.e("IconCompat", "Unable to get icon resource", e10);
                return 0;
            }
        } else if (i10 == 2) {
            return this.f974e;
        } else {
            throw new IllegalStateException("called getResId() on " + this);
        }
    }

    public final Uri d() {
        int i10 = this.f971a;
        if (i10 == -1) {
            int i11 = Build.VERSION.SDK_INT;
            Icon icon = (Icon) this.f972b;
            if (i11 >= 28) {
                return icon.getUri();
            }
            try {
                return (Uri) icon.getClass().getMethod("getUri", new Class[0]).invoke(icon, new Object[0]);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e10) {
                Log.e("IconCompat", "Unable to get icon uri", e10);
                return null;
            }
        } else if (i10 == 4 || i10 == 6) {
            return Uri.parse((String) this.f972b);
        } else {
            throw new IllegalStateException("called getUri() on " + this);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: type inference failed for: r2v6, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r2v8 */
    /* JADX WARNING: type inference failed for: r2v9 */
    /* JADX WARNING: type inference failed for: r2v10 */
    /* JADX WARNING: type inference failed for: r2v11 */
    /* JADX WARNING: type inference failed for: r2v12 */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c9, code lost:
        r8 = a(r8, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0153, code lost:
        r8 = android.graphics.drawable.Icon.createWithBitmap(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0157, code lost:
        r0 = r7.f976g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0159, code lost:
        if (r0 == null) goto L_0x015e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x015b, code lost:
        r8.setTintList(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x015e, code lost:
        r0 = r7.f977h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0162, code lost:
        if (r0 == f970k) goto L_0x0167;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0164, code lost:
        r8.setTintMode(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0167, code lost:
        return r8;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0087  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.drawable.Icon e(android.content.Context r8) {
        /*
            r7 = this;
            int r0 = r7.f971a
            r1 = 26
            r2 = 0
            java.lang.String r3 = "IconCompat"
            r4 = 0
            switch(r0) {
                case -1: goto L_0x0168;
                case 0: goto L_0x000b;
                case 1: goto L_0x014f;
                case 2: goto L_0x00e7;
                case 3: goto L_0x00d9;
                case 4: goto L_0x00cf;
                case 5: goto L_0x00b7;
                case 6: goto L_0x0013;
                default: goto L_0x000b;
            }
        L_0x000b:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Unknown type"
            r8.<init>(r0)
            throw r8
        L_0x0013:
            int r0 = android.os.Build.VERSION.SDK_INT
            r5 = 30
            if (r0 < r5) goto L_0x0023
            android.net.Uri r8 = r7.d()
            android.graphics.drawable.Icon r8 = android.graphics.drawable.Icon.createWithAdaptiveBitmapContentUri(r8)
            goto L_0x0157
        L_0x0023:
            if (r8 == 0) goto L_0x009f
            android.net.Uri r0 = r7.d()
            java.lang.String r5 = r0.getScheme()
            java.lang.String r6 = "content"
            boolean r6 = r6.equals(r5)
            if (r6 != 0) goto L_0x0057
            java.lang.String r6 = "file"
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L_0x003e
            goto L_0x0057
        L_0x003e:
            java.io.FileInputStream r8 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x004e }
            java.io.File r5 = new java.io.File     // Catch:{ FileNotFoundException -> 0x004e }
            java.lang.Object r6 = r7.f972b     // Catch:{ FileNotFoundException -> 0x004e }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ FileNotFoundException -> 0x004e }
            r5.<init>(r6)     // Catch:{ FileNotFoundException -> 0x004e }
            r8.<init>(r5)     // Catch:{ FileNotFoundException -> 0x004e }
            r2 = r8
            goto L_0x0072
        L_0x004e:
            r8 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Unable to load image from path: "
            r5.<init>(r6)
            goto L_0x0068
        L_0x0057:
            android.content.ContentResolver r8 = r8.getContentResolver()     // Catch:{ Exception -> 0x0060 }
            java.io.InputStream r2 = r8.openInputStream(r0)     // Catch:{ Exception -> 0x0060 }
            goto L_0x0072
        L_0x0060:
            r8 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Unable to load image from URI: "
            r5.<init>(r6)
        L_0x0068:
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            android.util.Log.w(r3, r0, r8)
        L_0x0072:
            if (r2 == 0) goto L_0x0087
            int r8 = android.os.Build.VERSION.SDK_INT
            if (r8 < r1) goto L_0x0082
            android.graphics.Bitmap r8 = android.graphics.BitmapFactory.decodeStream(r2)
            android.graphics.drawable.Icon r8 = android.graphics.drawable.Icon.createWithAdaptiveBitmap(r8)
            goto L_0x0157
        L_0x0082:
            android.graphics.Bitmap r8 = android.graphics.BitmapFactory.decodeStream(r2)
            goto L_0x00c9
        L_0x0087:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Cannot load adaptive icon from uri: "
            r0.<init>(r1)
            android.net.Uri r1 = r7.d()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r8.<init>(r0)
            throw r8
        L_0x009f:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Context is required to resolve the file uri of the icon: "
            r0.<init>(r1)
            android.net.Uri r1 = r7.d()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r8.<init>(r0)
            throw r8
        L_0x00b7:
            int r8 = android.os.Build.VERSION.SDK_INT
            if (r8 < r1) goto L_0x00c5
            java.lang.Object r8 = r7.f972b
            android.graphics.Bitmap r8 = (android.graphics.Bitmap) r8
            android.graphics.drawable.Icon r8 = android.graphics.drawable.Icon.createWithAdaptiveBitmap(r8)
            goto L_0x0157
        L_0x00c5:
            java.lang.Object r8 = r7.f972b
            android.graphics.Bitmap r8 = (android.graphics.Bitmap) r8
        L_0x00c9:
            android.graphics.Bitmap r8 = a(r8, r4)
            goto L_0x0153
        L_0x00cf:
            java.lang.Object r8 = r7.f972b
            java.lang.String r8 = (java.lang.String) r8
            android.graphics.drawable.Icon r8 = android.graphics.drawable.Icon.createWithContentUri(r8)
            goto L_0x0157
        L_0x00d9:
            java.lang.Object r8 = r7.f972b
            byte[] r8 = (byte[]) r8
            int r0 = r7.f974e
            int r1 = r7.f975f
            android.graphics.drawable.Icon r8 = android.graphics.drawable.Icon.createWithData(r8, r0, r1)
            goto L_0x0157
        L_0x00e7:
            r8 = -1
            if (r0 != r8) goto L_0x011a
            int r8 = android.os.Build.VERSION.SDK_INT
            java.lang.Object r0 = r7.f972b
            android.graphics.drawable.Icon r0 = (android.graphics.drawable.Icon) r0
            r1 = 28
            if (r8 < r1) goto L_0x00f9
            java.lang.String r2 = r0.getResPackage()
            goto L_0x0134
        L_0x00f9:
            java.lang.Class r8 = r0.getClass()     // Catch:{ IllegalAccessException -> 0x0113, InvocationTargetException -> 0x0111, NoSuchMethodException -> 0x010f }
            java.lang.String r1 = "getResPackage"
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch:{ IllegalAccessException -> 0x0113, InvocationTargetException -> 0x0111, NoSuchMethodException -> 0x010f }
            java.lang.reflect.Method r8 = r8.getMethod(r1, r5)     // Catch:{ IllegalAccessException -> 0x0113, InvocationTargetException -> 0x0111, NoSuchMethodException -> 0x010f }
            java.lang.Object[] r1 = new java.lang.Object[r4]     // Catch:{ IllegalAccessException -> 0x0113, InvocationTargetException -> 0x0111, NoSuchMethodException -> 0x010f }
            java.lang.Object r8 = r8.invoke(r0, r1)     // Catch:{ IllegalAccessException -> 0x0113, InvocationTargetException -> 0x0111, NoSuchMethodException -> 0x010f }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ IllegalAccessException -> 0x0113, InvocationTargetException -> 0x0111, NoSuchMethodException -> 0x010f }
            r2 = r8
            goto L_0x0134
        L_0x010f:
            r8 = move-exception
            goto L_0x0114
        L_0x0111:
            r8 = move-exception
            goto L_0x0114
        L_0x0113:
            r8 = move-exception
        L_0x0114:
            java.lang.String r0 = "Unable to get icon package"
            android.util.Log.e(r3, r0, r8)
            goto L_0x0134
        L_0x011a:
            r1 = 2
            if (r0 != r1) goto L_0x013b
            java.lang.String r0 = r7.f979j
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0132
            java.lang.Object r0 = r7.f972b
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = ":"
            java.lang.String[] r8 = r0.split(r1, r8)
            r2 = r8[r4]
            goto L_0x0134
        L_0x0132:
            java.lang.String r2 = r7.f979j
        L_0x0134:
            int r8 = r7.f974e
            android.graphics.drawable.Icon r8 = android.graphics.drawable.Icon.createWithResource(r2, r8)
            goto L_0x0157
        L_0x013b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "called getResPackage() on "
            r0.<init>(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            r8.<init>(r0)
            throw r8
        L_0x014f:
            java.lang.Object r8 = r7.f972b
            android.graphics.Bitmap r8 = (android.graphics.Bitmap) r8
        L_0x0153:
            android.graphics.drawable.Icon r8 = android.graphics.drawable.Icon.createWithBitmap(r8)
        L_0x0157:
            android.content.res.ColorStateList r0 = r7.f976g
            if (r0 == 0) goto L_0x015e
            r8.setTintList(r0)
        L_0x015e:
            android.graphics.PorterDuff$Mode r0 = r7.f977h
            android.graphics.PorterDuff$Mode r1 = f970k
            if (r0 == r1) goto L_0x0167
            r8.setTintMode(r0)
        L_0x0167:
            return r8
        L_0x0168:
            java.lang.Object r8 = r7.f972b
            android.graphics.drawable.Icon r8 = (android.graphics.drawable.Icon) r8
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.IconCompat.e(android.content.Context):android.graphics.drawable.Icon");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String toString() {
        /*
            r4 = this;
            int r0 = r4.f971a
            r1 = -1
            if (r0 != r1) goto L_0x000c
            java.lang.Object r0 = r4.f972b
            java.lang.String r0 = java.lang.String.valueOf(r0)
            return r0
        L_0x000c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Icon(typ="
            r0.<init>(r1)
            int r1 = r4.f971a
            switch(r1) {
                case 1: goto L_0x002a;
                case 2: goto L_0x0027;
                case 3: goto L_0x0024;
                case 4: goto L_0x0021;
                case 5: goto L_0x001e;
                case 6: goto L_0x001b;
                default: goto L_0x0018;
            }
        L_0x0018:
            java.lang.String r1 = "UNKNOWN"
            goto L_0x002c
        L_0x001b:
            java.lang.String r1 = "URI_MASKABLE"
            goto L_0x002c
        L_0x001e:
            java.lang.String r1 = "BITMAP_MASKABLE"
            goto L_0x002c
        L_0x0021:
            java.lang.String r1 = "URI"
            goto L_0x002c
        L_0x0024:
            java.lang.String r1 = "DATA"
            goto L_0x002c
        L_0x0027:
            java.lang.String r1 = "RESOURCE"
            goto L_0x002c
        L_0x002a:
            java.lang.String r1 = "BITMAP"
        L_0x002c:
            r0.append(r1)
            int r1 = r4.f971a
            switch(r1) {
                case 1: goto L_0x007d;
                case 2: goto L_0x0056;
                case 3: goto L_0x0040;
                case 4: goto L_0x0035;
                case 5: goto L_0x007d;
                case 6: goto L_0x0035;
                default: goto L_0x0034;
            }
        L_0x0034:
            goto L_0x009d
        L_0x0035:
            java.lang.String r1 = " uri="
            r0.append(r1)
            java.lang.Object r1 = r4.f972b
            r0.append(r1)
            goto L_0x009d
        L_0x0040:
            java.lang.String r1 = " len="
            r0.append(r1)
            int r1 = r4.f974e
            r0.append(r1)
            int r1 = r4.f975f
            if (r1 == 0) goto L_0x009d
            java.lang.String r1 = " off="
            r0.append(r1)
            int r1 = r4.f975f
            goto L_0x009a
        L_0x0056:
            java.lang.String r1 = " pkg="
            r0.append(r1)
            java.lang.String r1 = r4.f979j
            r0.append(r1)
            java.lang.String r1 = " id="
            r0.append(r1)
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            int r2 = r4.c()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 0
            r1[r3] = r2
            java.lang.String r2 = "0x%08x"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r0.append(r1)
            goto L_0x009d
        L_0x007d:
            java.lang.String r1 = " size="
            r0.append(r1)
            java.lang.Object r1 = r4.f972b
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            int r1 = r1.getWidth()
            r0.append(r1)
            java.lang.String r1 = "x"
            r0.append(r1)
            java.lang.Object r1 = r4.f972b
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            int r1 = r1.getHeight()
        L_0x009a:
            r0.append(r1)
        L_0x009d:
            android.content.res.ColorStateList r1 = r4.f976g
            if (r1 == 0) goto L_0x00ab
            java.lang.String r1 = " tint="
            r0.append(r1)
            android.content.res.ColorStateList r1 = r4.f976g
            r0.append(r1)
        L_0x00ab:
            android.graphics.PorterDuff$Mode r1 = r4.f977h
            android.graphics.PorterDuff$Mode r2 = f970k
            if (r1 == r2) goto L_0x00bb
            java.lang.String r1 = " mode="
            r0.append(r1)
            android.graphics.PorterDuff$Mode r1 = r4.f977h
            r0.append(r1)
        L_0x00bb:
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.IconCompat.toString():java.lang.String");
    }
}
