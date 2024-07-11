package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.q1;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public final class u1 {

    /* renamed from: a  reason: collision with root package name */
    public static final Charset f3170a = Charset.forName("UTF-8");

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f3171b;

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f3171b = bArr;
        ByteBuffer.wrap(bArr);
        int length = bArr.length;
        if (length < 0) {
            throw z1.b();
        } else if (0 + length > Integer.MAX_VALUE) {
            try {
                throw z1.a();
            } catch (z1 e10) {
                throw new IllegalArgumentException(e10);
            }
        }
    }

    public static int a(long j8) {
        return (int) (j8 ^ (j8 >>> 32));
    }

    public static int b(boolean z) {
        return z ? 1231 : 1237;
    }

    public static q1 c(Object obj, Object obj2) {
        q1.b e10 = ((w2) obj).e();
        w2 w2Var = (w2) obj2;
        e10.getClass();
        if (e10.f3142o.getClass().isInstance(w2Var)) {
            e10.k((q1) ((n0) w2Var));
            return e10.q();
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
