package d3;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.a;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import q2.j;
import s2.w;
import t2.b;

public final class h implements j<InputStream, c> {

    /* renamed from: a  reason: collision with root package name */
    public final List<ImageHeaderParser> f4182a;

    /* renamed from: b  reason: collision with root package name */
    public final j<ByteBuffer, c> f4183b;

    /* renamed from: c  reason: collision with root package name */
    public final b f4184c;

    public h(List list, a aVar, b bVar) {
        this.f4182a = list;
        this.f4183b = aVar;
        this.f4184c = bVar;
    }

    public final w a(Object obj, int i10, int i11, q2.h hVar) {
        byte[] bArr;
        InputStream inputStream = (InputStream) obj;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr2 = new byte[16384];
            while (true) {
                int read = inputStream.read(bArr2);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr2, 0, read);
            }
            byteArrayOutputStream.flush();
            bArr = byteArrayOutputStream.toByteArray();
        } catch (IOException e10) {
            if (Log.isLoggable("StreamGifDecoder", 5)) {
                Log.w("StreamGifDecoder", "Error reading data from stream", e10);
            }
            bArr = null;
        }
        if (bArr == null) {
            return null;
        }
        return this.f4183b.a(ByteBuffer.wrap(bArr), i10, i11, hVar);
    }

    public final boolean b(Object obj, q2.h hVar) {
        InputStream inputStream = (InputStream) obj;
        if (!((Boolean) hVar.c(g.f4181b)).booleanValue()) {
            if (a.b(this.f4184c, inputStream, this.f4182a) == ImageHeaderParser.ImageType.GIF) {
                return true;
            }
        }
        return false;
    }
}
