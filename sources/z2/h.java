package z2;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;
import java.security.MessageDigest;
import q2.f;
import t2.c;

public final class h extends e {

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f9813b = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(f.f8216a);

    public final void a(MessageDigest messageDigest) {
        messageDigest.update(f9813b);
    }

    public final Bitmap c(c cVar, Bitmap bitmap, int i10, int i11) {
        float f10;
        float f11;
        Bitmap.Config config;
        Paint paint = z.f9872a;
        if (bitmap.getWidth() == i10 && bitmap.getHeight() == i11) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float f12 = 0.0f;
        if (bitmap.getWidth() * i11 > bitmap.getHeight() * i10) {
            f11 = ((float) i11) / ((float) bitmap.getHeight());
            f12 = (((float) i10) - (((float) bitmap.getWidth()) * f11)) * 0.5f;
            f10 = 0.0f;
        } else {
            f11 = ((float) i10) / ((float) bitmap.getWidth());
            f10 = (((float) i11) - (((float) bitmap.getHeight()) * f11)) * 0.5f;
        }
        matrix.setScale(f11, f11);
        matrix.postTranslate((float) ((int) (f12 + 0.5f)), (float) ((int) (f10 + 0.5f)));
        if (bitmap.getConfig() != null) {
            config = bitmap.getConfig();
        } else {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap d = cVar.d(i10, i11, config);
        d.setHasAlpha(bitmap.hasAlpha());
        z.a(bitmap, d, matrix);
        return d;
    }

    public final boolean equals(Object obj) {
        return obj instanceof h;
    }

    public final int hashCode() {
        return -599754482;
    }
}
