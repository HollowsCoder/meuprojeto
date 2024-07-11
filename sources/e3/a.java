package e3;

import a3.b;
import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;
import q2.h;
import s2.w;

public final class a implements b<Bitmap, byte[]> {

    /* renamed from: o  reason: collision with root package name */
    public final Bitmap.CompressFormat f4470o = Bitmap.CompressFormat.JPEG;

    /* renamed from: p  reason: collision with root package name */
    public final int f4471p = 100;

    public final w<byte[]> b(w<Bitmap> wVar, h hVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        wVar.get().compress(this.f4470o, this.f4471p, byteArrayOutputStream);
        wVar.d();
        return new b(byteArrayOutputStream.toByteArray());
    }
}
