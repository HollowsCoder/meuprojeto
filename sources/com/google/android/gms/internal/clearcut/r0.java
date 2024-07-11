package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.p0;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public final class r0 {

    /* renamed from: a  reason: collision with root package name */
    public static final Charset f2537a = Charset.forName("UTF-8");

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f2538b;

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f2538b = bArr;
        ByteBuffer.wrap(bArr);
        int length = bArr.length;
        if (length < 0) {
            throw new v0("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        } else if ((0 - 0) + length > Integer.MAX_VALUE) {
            try {
                throw v0.a();
            } catch (v0 e10) {
                throw new IllegalArgumentException(e10);
            }
        }
    }

    public static p0 a(Object obj, Object obj2) {
        p0.a j8 = ((r1) obj).j();
        r1 r1Var = (r1) obj2;
        j8.getClass();
        if (j8.f2514o.getClass().isInstance(r1Var)) {
            j8.e((p0) ((m) r1Var));
            return j8.n();
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    public static int b(boolean z) {
        return z ? 1231 : 1237;
    }

    public static int c(long j8) {
        return (int) (j8 ^ (j8 >>> 32));
    }
}
