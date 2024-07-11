package z2;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import b3.b;
import b3.d;
import q2.h;
import q2.j;
import s2.w;
import t2.c;

public final class x implements j<Uri, Bitmap> {

    /* renamed from: a  reason: collision with root package name */
    public final d f9866a;

    /* renamed from: b  reason: collision with root package name */
    public final c f9867b;

    public x(d dVar, c cVar) {
        this.f9866a = dVar;
        this.f9867b = cVar;
    }

    public final w a(Object obj, int i10, int i11, h hVar) {
        w c10 = this.f9866a.c((Uri) obj);
        if (c10 == null) {
            return null;
        }
        return n.a(this.f9867b, (Drawable) ((b) c10).get(), i10, i11);
    }

    public final boolean b(Object obj, h hVar) {
        return "android.resource".equals(((Uri) obj).getScheme());
    }
}
