package com.google.android.gms.internal.clearcut;

import androidx.activity.result.c;
import java.nio.ByteBuffer;

public final class d3 extends c {
    public final int A(byte[] bArr, int i10, int i11) {
        while (r9 < i11 && bArr[r9] >= 0) {
            i10 = r9 + 1;
        }
        if (r9 >= i11) {
            return 0;
        }
        while (r9 < i11) {
            int i12 = r9 + 1;
            byte b10 = bArr[r9];
            if (b10 < 0) {
                if (b10 < -32) {
                    if (i12 >= i11) {
                        return b10;
                    }
                    if (b10 >= -62) {
                        r9 = i12 + 1;
                        if (bArr[i12] > -65) {
                        }
                    }
                    return -1;
                } else if (b10 < -16) {
                    if (i12 >= i11 - 1) {
                        return c3.d(bArr, i12, i11);
                    }
                    int i13 = i12 + 1;
                    byte b11 = bArr[i12];
                    if (b11 <= -65 && ((b10 != -32 || b11 >= -96) && (b10 != -19 || b11 < -96))) {
                        r9 = i13 + 1;
                        if (bArr[i13] > -65) {
                        }
                    }
                    return -1;
                } else if (i12 >= i11 - 2) {
                    return c3.d(bArr, i12, i11);
                } else {
                    int i14 = i12 + 1;
                    byte b12 = bArr[i12];
                    if (b12 <= -65) {
                        if ((((b12 + 112) + (b10 << 28)) >> 30) == 0) {
                            int i15 = i14 + 1;
                            if (bArr[i14] <= -65) {
                                i12 = i15 + 1;
                                if (bArr[i15] > -65) {
                                }
                            }
                        }
                    }
                    return -1;
                }
            }
            r9 = i12;
        }
        return 0;
    }

    public final void C(CharSequence charSequence, ByteBuffer byteBuffer) {
        c.D(charSequence, byteBuffer);
    }

    public final int z(CharSequence charSequence, byte[] bArr, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        char charAt;
        int length = charSequence.length();
        int i15 = i11 + i10;
        int i16 = 0;
        while (i16 < length && (i14 = i16 + i10) < i15 && (charAt = charSequence.charAt(i16)) < 128) {
            bArr[i14] = (byte) charAt;
            i16++;
        }
        if (i16 == length) {
            return i10 + length;
        }
        int i17 = i10 + i16;
        while (i16 < length) {
            char charAt2 = charSequence.charAt(i16);
            if (charAt2 < 128 && i17 < i15) {
                i12 = i17 + 1;
                bArr[i17] = (byte) charAt2;
            } else if (charAt2 < 2048 && i17 <= i15 - 2) {
                int i18 = i17 + 1;
                bArr[i17] = (byte) ((charAt2 >>> 6) | 960);
                i17 = i18 + 1;
                bArr[i18] = (byte) ((charAt2 & '?') | 128);
                i16++;
            } else if ((charAt2 < 55296 || 57343 < charAt2) && i17 <= i15 - 3) {
                int i19 = i17 + 1;
                bArr[i17] = (byte) ((charAt2 >>> 12) | 480);
                int i20 = i19 + 1;
                bArr[i19] = (byte) (((charAt2 >>> 6) & 63) | 128);
                i12 = i20 + 1;
                bArr[i20] = (byte) ((charAt2 & '?') | 128);
            } else if (i17 <= i15 - 4) {
                int i21 = i16 + 1;
                if (i21 != charSequence.length()) {
                    char charAt3 = charSequence.charAt(i21);
                    if (Character.isSurrogatePair(charAt2, charAt3)) {
                        int codePoint = Character.toCodePoint(charAt2, charAt3);
                        int i22 = i17 + 1;
                        bArr[i17] = (byte) ((codePoint >>> 18) | 240);
                        int i23 = i22 + 1;
                        bArr[i22] = (byte) (((codePoint >>> 12) & 63) | 128);
                        int i24 = i23 + 1;
                        bArr[i23] = (byte) (((codePoint >>> 6) & 63) | 128);
                        i17 = i24 + 1;
                        bArr[i24] = (byte) ((codePoint & 63) | 128);
                        i16 = i21;
                        i16++;
                    } else {
                        i16 = i21;
                    }
                }
                throw new e3(i16 - 1, length);
            } else if (55296 > charAt2 || charAt2 > 57343 || ((i13 = i16 + 1) != charSequence.length() && Character.isSurrogatePair(charAt2, charSequence.charAt(i13)))) {
                StringBuilder sb = new StringBuilder(37);
                sb.append("Failed writing ");
                sb.append(charAt2);
                sb.append(" at index ");
                sb.append(i17);
                throw new ArrayIndexOutOfBoundsException(sb.toString());
            } else {
                throw new e3(i16, length);
            }
            i17 = i12;
            i16++;
        }
        return i17;
    }
}
