package z2;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import java.nio.ByteBuffer;
import q2.h;
import q2.j;
import s2.w;

public final class g implements j<ByteBuffer, Bitmap> {

    /* renamed from: a  reason: collision with root package name */
    public final c f9812a = new c();

    public final w a(Object obj, int i10, int i11, h hVar) {
        return this.f9812a.a(ImageDecoder.createSource((ByteBuffer) obj), i10, i11, hVar);
    }

    public final /* bridge */ /* synthetic */ boolean b(Object obj, h hVar) {
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        return true;
    }
}
