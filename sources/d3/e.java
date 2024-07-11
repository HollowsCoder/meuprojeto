package d3;

import android.graphics.Bitmap;
import com.bumptech.glide.b;
import com.bumptech.glide.g;
import java.security.MessageDigest;
import q2.l;
import s2.w;
import s6.a;
import z2.d;

public final class e implements l<c> {

    /* renamed from: b  reason: collision with root package name */
    public final l<Bitmap> f4160b;

    public e(l<Bitmap> lVar) {
        a.n(lVar);
        this.f4160b = lVar;
    }

    public final void a(MessageDigest messageDigest) {
        this.f4160b.a(messageDigest);
    }

    public final w b(g gVar, w wVar, int i10, int i11) {
        c cVar = (c) wVar.get();
        d dVar = new d(cVar.f4151o.f4159a.l, b.b(gVar).f2232o);
        l<Bitmap> lVar = this.f4160b;
        w b10 = lVar.b(gVar, dVar, i10, i11);
        if (!dVar.equals(b10)) {
            dVar.d();
        }
        cVar.f4151o.f4159a.c(lVar, (Bitmap) b10.get());
        return wVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.f4160b.equals(((e) obj).f4160b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4160b.hashCode();
    }
}
