package z2;

import android.media.MediaDataSource;
import java.nio.ByteBuffer;

public final class d0 extends MediaDataSource {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ ByteBuffer f9809o;

    public d0(ByteBuffer byteBuffer) {
        this.f9809o = byteBuffer;
    }

    public final void close() {
    }

    public final long getSize() {
        return (long) this.f9809o.limit();
    }

    public final int readAt(long j8, byte[] bArr, int i10, int i11) {
        ByteBuffer byteBuffer = this.f9809o;
        if (j8 >= ((long) byteBuffer.limit())) {
            return -1;
        }
        byteBuffer.position((int) j8);
        int min = Math.min(i11, byteBuffer.remaining());
        byteBuffer.get(bArr, i10, min);
        return min;
    }
}
