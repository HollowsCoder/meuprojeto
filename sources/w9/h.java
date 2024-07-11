package w9;

import java.nio.channels.WritableByteChannel;

public interface h extends z, WritableByteChannel {
    long N(b0 b0Var);

    h P();

    h Y(String str);

    h Z(long j8);

    f e();

    h e0(j jVar);

    void flush();

    h p(long j8);

    h write(byte[] bArr);

    h write(byte[] bArr, int i10, int i11);

    h writeByte(int i10);

    h writeInt(int i10);

    h writeShort(int i10);
}
