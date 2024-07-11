package com.google.android.gms.internal.clearcut;

import androidx.activity.result.c;
import java.nio.ByteBuffer;

public final class c3 {

    /* renamed from: a  reason: collision with root package name */
    public static final c f2396a;

    static {
        boolean z;
        c cVar;
        if (!a3.f2368f || !a3.f2367e) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            cVar = new f3();
        } else {
            cVar = new d3();
        }
        f2396a = cVar;
    }

    public static int a(CharSequence charSequence) {
        int length = charSequence.length();
        int i10 = 0;
        int i11 = 0;
        while (i11 < length && charSequence.charAt(i11) < 128) {
            i11++;
        }
        int i12 = length;
        while (true) {
            if (i11 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i11);
            if (charAt < 2048) {
                i12 += (127 - charAt) >>> 31;
                i11++;
            } else {
                int length2 = charSequence.length();
                while (i11 < length2) {
                    char charAt2 = charSequence.charAt(i11);
                    if (charAt2 < 2048) {
                        i10 += (127 - charAt2) >>> 31;
                    } else {
                        i10 += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i11) >= 65536) {
                                i11++;
                            } else {
                                throw new e3(i11, length2);
                            }
                        }
                    }
                    i11++;
                }
                i12 += i10;
            }
        }
        if (i12 >= length) {
            return i12;
        }
        StringBuilder sb = new StringBuilder(54);
        sb.append("UTF-8 length does not fit in int: ");
        sb.append(((long) i12) + 4294967296L);
        throw new IllegalArgumentException(sb.toString());
    }

    public static void b(CharSequence charSequence, ByteBuffer byteBuffer) {
        boolean hasArray = byteBuffer.hasArray();
        c cVar = f2396a;
        if (hasArray) {
            int arrayOffset = byteBuffer.arrayOffset();
            byteBuffer.position(cVar.z(charSequence, byteBuffer.array(), byteBuffer.position() + arrayOffset, byteBuffer.remaining()) - arrayOffset);
        } else if (byteBuffer.isDirect()) {
            cVar.C(charSequence, byteBuffer);
        } else {
            c.D(charSequence, byteBuffer);
        }
    }

    public static boolean c(byte[] bArr, int i10, int i11) {
        return f2396a.A(bArr, i10, i11) == 0;
    }

    public static int d(byte[] bArr, int i10, int i11) {
        byte b10 = bArr[i10 - 1];
        int i12 = i11 - i10;
        if (i12 == 0) {
            if (b10 > -12) {
                b10 = -1;
            }
            return b10;
        } else if (i12 == 1) {
            byte b11 = bArr[i10];
            if (b10 > -12 || b11 > -65) {
                return -1;
            }
            return b10 ^ (b11 << 8);
        } else if (i12 == 2) {
            byte b12 = bArr[i10];
            byte b13 = bArr[i10 + 1];
            if (b10 > -12 || b12 > -65 || b13 > -65) {
                return -1;
            }
            return ((b12 << 8) ^ b10) ^ (b13 << 16);
        } else {
            throw new AssertionError();
        }
    }
}
