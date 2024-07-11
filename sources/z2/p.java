package z2;

import com.bumptech.glide.load.ImageHeaderParser;
import java.io.InputStream;
import java.nio.ByteBuffer;
import s0.a;
import t2.b;

public final class p implements ImageHeaderParser {
    public final ImageHeaderParser.ImageType a(ByteBuffer byteBuffer) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    public final ImageHeaderParser.ImageType b(InputStream inputStream) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    public final int c(InputStream inputStream, b bVar) {
        int c10 = new a(inputStream).c();
        if (c10 == 0) {
            return -1;
        }
        return c10;
    }
}
