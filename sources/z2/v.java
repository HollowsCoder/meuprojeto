package z2;

import android.graphics.Bitmap;
import android.os.ParcelFileDescriptor;
import q2.h;
import q2.j;
import s2.w;
import z2.s;

public final class v implements j<ParcelFileDescriptor, Bitmap> {

    /* renamed from: a  reason: collision with root package name */
    public final m f9859a;

    public v(m mVar) {
        this.f9859a = mVar;
    }

    public final w a(Object obj, int i10, int i11, h hVar) {
        m mVar = this.f9859a;
        return mVar.a(new s.b((ParcelFileDescriptor) obj, mVar.d, mVar.f9834c), i10, i11, hVar, m.f9830j);
    }

    public final boolean b(Object obj, h hVar) {
        ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) obj;
        this.f9859a.getClass();
        return true;
    }
}
