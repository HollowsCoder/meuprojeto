package z2;

import android.graphics.Bitmap;
import java.security.MessageDigest;
import q2.f;
import t2.c;

public final class q extends e {

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f9839b = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(f.f8216a);

    public final void a(MessageDigest messageDigest) {
        messageDigest.update(f9839b);
    }

    public final Bitmap c(c cVar, Bitmap bitmap, int i10, int i11) {
        return z.b(cVar, bitmap, i10, i11);
    }

    public final boolean equals(Object obj) {
        return obj instanceof q;
    }

    public final int hashCode() {
        return 1572326941;
    }
}
