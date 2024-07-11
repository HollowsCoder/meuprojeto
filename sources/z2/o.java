package z2;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.b;
import com.bumptech.glide.g;
import java.security.MessageDigest;
import q2.l;
import s2.w;
import t2.c;

public final class o implements l<Drawable> {

    /* renamed from: b  reason: collision with root package name */
    public final l<Bitmap> f9837b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f9838c;

    public o(l<Bitmap> lVar, boolean z) {
        this.f9837b = lVar;
        this.f9838c = z;
    }

    public final void a(MessageDigest messageDigest) {
        this.f9837b.a(messageDigest);
    }

    public final w b(g gVar, w wVar, int i10, int i11) {
        c cVar = b.b(gVar).f2232o;
        Drawable drawable = (Drawable) wVar.get();
        d a10 = n.a(cVar, drawable, i10, i11);
        if (a10 != null) {
            w b10 = this.f9837b.b(gVar, a10, i10, i11);
            if (!b10.equals(a10)) {
                return new u(gVar.getResources(), b10);
            }
            b10.d();
            return wVar;
        } else if (!this.f9838c) {
            return wVar;
        } else {
            throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o) {
            return this.f9837b.equals(((o) obj).f9837b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f9837b.hashCode();
    }
}
