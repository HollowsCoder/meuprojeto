package z2;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import q2.h;
import q2.j;
import s2.w;

public final class a<DataType> implements j<DataType, BitmapDrawable> {

    /* renamed from: a  reason: collision with root package name */
    public final j<DataType, Bitmap> f9793a;

    /* renamed from: b  reason: collision with root package name */
    public final Resources f9794b;

    public a(Resources resources, j<DataType, Bitmap> jVar) {
        this.f9794b = resources;
        this.f9793a = jVar;
    }

    public final w<BitmapDrawable> a(DataType datatype, int i10, int i11, h hVar) {
        w<Bitmap> a10 = this.f9793a.a(datatype, i10, i11, hVar);
        if (a10 == null) {
            return null;
        }
        return new u(this.f9794b, a10);
    }

    public final boolean b(DataType datatype, h hVar) {
        return this.f9793a.b(datatype, hVar);
    }
}
