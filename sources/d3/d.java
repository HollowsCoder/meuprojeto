package d3;

import android.graphics.Bitmap;
import b3.b;
import com.bumptech.glide.m;
import d3.f;

public final class d extends b<c> {
    public d(c cVar) {
        super(cVar);
    }

    public final void a() {
        ((c) this.f1953o).f4151o.f4159a.l.prepareToDraw();
    }

    public final int b() {
        f fVar = ((c) this.f1953o).f4151o.f4159a;
        return fVar.f4161a.f() + fVar.f4173o;
    }

    public final Class<c> c() {
        return c.class;
    }

    public final void d() {
        c cVar = (c) this.f1953o;
        cVar.stop();
        cVar.f4154r = true;
        f fVar = cVar.f4151o.f4159a;
        fVar.f4163c.clear();
        Bitmap bitmap = fVar.l;
        if (bitmap != null) {
            fVar.f4164e.e(bitmap);
            fVar.l = null;
        }
        fVar.f4165f = false;
        f.a aVar = fVar.f4168i;
        m mVar = fVar.d;
        if (aVar != null) {
            mVar.l(aVar);
            fVar.f4168i = null;
        }
        f.a aVar2 = fVar.f4170k;
        if (aVar2 != null) {
            mVar.l(aVar2);
            fVar.f4170k = null;
        }
        f.a aVar3 = fVar.f4172n;
        if (aVar3 != null) {
            mVar.l(aVar3);
            fVar.f4172n = null;
        }
        fVar.f4161a.clear();
        fVar.f4169j = true;
    }
}
