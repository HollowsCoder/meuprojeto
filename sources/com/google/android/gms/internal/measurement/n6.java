package com.google.android.gms.internal.measurement;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public final class n6 {

    /* renamed from: a  reason: collision with root package name */
    public static final Charset f2844a = Charset.forName("UTF-8");

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f2845b;

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f2845b = bArr;
        ByteBuffer.wrap(bArr);
    }

    public static int a(long j8) {
        return (int) (j8 ^ (j8 >>> 32));
    }

    public static int b(boolean z) {
        return z ? 1231 : 1237;
    }

    public static f6 c(Object obj, Object obj2) {
        b6 i10 = ((i7) obj).i();
        i7 i7Var = (i7) obj2;
        i10.getClass();
        if (i10.f2634o.getClass().isInstance(i7Var)) {
            i10.k((f6) ((b5) i7Var));
            return i10.p();
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
