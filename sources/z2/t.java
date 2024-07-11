package z2;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;
import m3.a;
import q2.h;
import q2.j;
import s2.w;

public final class t implements j<InputStream, Bitmap> {

    /* renamed from: a  reason: collision with root package name */
    public final c f9856a = new c();

    public final w a(Object obj, int i10, int i11, h hVar) {
        InputStream inputStream = (InputStream) obj;
        AtomicReference<byte[]> atomicReference = a.f7060a;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        AtomicReference<byte[]> atomicReference2 = a.f7060a;
        byte[] andSet = atomicReference2.getAndSet((Object) null);
        if (andSet == null) {
            andSet = new byte[16384];
        }
        while (true) {
            int read = inputStream.read(andSet);
            if (read >= 0) {
                byteArrayOutputStream.write(andSet, 0, read);
            } else {
                atomicReference2.set(andSet);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                return this.f9856a.a(ImageDecoder.createSource((ByteBuffer) ByteBuffer.allocateDirect(byteArray.length).put(byteArray).position(0)), i10, i11, hVar);
            }
        }
    }

    public final /* bridge */ /* synthetic */ boolean b(Object obj, h hVar) {
        InputStream inputStream = (InputStream) obj;
        return true;
    }
}
