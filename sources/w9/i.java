package w9;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

public interface i extends b0, ReadableByteChannel {
    int A(r rVar);

    long B(f fVar);

    String D();

    boolean F();

    long O(j jVar);

    String R(long j8);

    void X(long j8);

    long c0();

    String d0(Charset charset);

    f e();

    InputStream f0();

    j q(long j8);

    byte readByte();

    int readInt();

    short readShort();

    void skip(long j8);

    boolean v(long j8);
}
