package androidx.emoji2.text;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import q0.b;

public final class l {

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final ByteBuffer f1084a;

        public a(ByteBuffer byteBuffer) {
            this.f1084a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        public final long a() {
            return ((long) this.f1084a.getInt()) & 4294967295L;
        }

        public final void b(int i10) {
            ByteBuffer byteBuffer = this.f1084a;
            byteBuffer.position(byteBuffer.position() + i10);
        }
    }

    public static b a(MappedByteBuffer mappedByteBuffer) {
        ByteBuffer byteBuffer;
        long j8;
        ByteBuffer duplicate = mappedByteBuffer.duplicate();
        a aVar = new a(duplicate);
        aVar.b(4);
        short s10 = duplicate.getShort() & 65535;
        if (s10 <= 100) {
            aVar.b(6);
            int i10 = 0;
            while (true) {
                byteBuffer = aVar.f1084a;
                if (i10 >= s10) {
                    j8 = -1;
                    break;
                }
                int i11 = byteBuffer.getInt();
                aVar.b(4);
                j8 = aVar.a();
                aVar.b(4);
                if (1835365473 == i11) {
                    break;
                }
                i10++;
            }
            if (j8 != -1) {
                aVar.b((int) (j8 - ((long) duplicate.position())));
                aVar.b(12);
                long a10 = aVar.a();
                for (int i12 = 0; ((long) i12) < a10; i12++) {
                    int i13 = byteBuffer.getInt();
                    long a11 = aVar.a();
                    aVar.a();
                    if (1164798569 == i13 || 1701669481 == i13) {
                        duplicate.position((int) (a11 + j8));
                        b bVar = new b();
                        duplicate.order(ByteOrder.LITTLE_ENDIAN);
                        int position = duplicate.position() + duplicate.getInt(duplicate.position());
                        bVar.f8207b = duplicate;
                        bVar.f8206a = position;
                        int i14 = position - duplicate.getInt(position);
                        bVar.f8208c = i14;
                        bVar.d = bVar.f8207b.getShort(i14);
                        return bVar;
                    }
                }
            }
            throw new IOException("Cannot read metadata.");
        }
        throw new IOException("Cannot read metadata.");
    }
}
