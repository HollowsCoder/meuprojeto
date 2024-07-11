package com.google.android.gms.internal.vision;

import androidx.activity.result.c;
import s6.a;

public final class g4 extends c {
    public final String B(byte[] bArr, int i10, int i11) {
        boolean z;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        if ((i10 | i11 | ((bArr.length - i10) - i11)) >= 0) {
            int i12 = i10 + i11;
            char[] cArr = new char[i11];
            int i13 = 0;
            while (r13 < i12) {
                byte b10 = bArr[r13];
                if (b10 >= 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (!z13) {
                    break;
                }
                i10 = r13 + 1;
                cArr[i13] = (char) b10;
                i13++;
            }
            int i14 = i13;
            while (r13 < i12) {
                int i15 = r13 + 1;
                byte b11 = bArr[r13];
                if (b11 >= 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    int i16 = i14 + 1;
                    cArr[i14] = (char) b11;
                    r13 = i15;
                    while (true) {
                        i14 = i16;
                        if (r13 < i12) {
                            byte b12 = bArr[r13];
                            if (b12 >= 0) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (!z12) {
                                break;
                            }
                            r13++;
                            i16 = i14 + 1;
                            cArr[i14] = (char) b12;
                        } else {
                            break;
                        }
                    }
                } else {
                    if (b11 < -32) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        if (b11 < -16) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z11) {
                            if (i15 < i12 - 1) {
                                int i17 = i15 + 1;
                                a.a0(b11, bArr[i15], bArr[i17], cArr, i14);
                                r13 = i17 + 1;
                                i14++;
                            } else {
                                throw z1.d();
                            }
                        } else if (i15 < i12 - 2) {
                            int i18 = i15 + 1;
                            byte b13 = bArr[i15];
                            int i19 = i18 + 1;
                            a.Z(b11, b13, bArr[i18], bArr[i19], cArr, i14);
                            i14 = i14 + 1 + 1;
                            r13 = i19 + 1;
                        } else {
                            throw z1.d();
                        }
                    } else if (i15 < i12) {
                        int i20 = i15 + 1;
                        byte b14 = bArr[i15];
                        int i21 = i14 + 1;
                        if (b11 < -62 || a.y0(b14)) {
                            throw z1.d();
                        }
                        cArr[i14] = (char) (((b11 & 31) << 6) | (b14 & 63));
                        r13 = i20;
                        i14 = i21;
                    } else {
                        throw z1.d();
                    }
                }
            }
            return new String(cArr, 0, i14);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)}));
    }

    public final int u(CharSequence charSequence, byte[] bArr, int i10, int i11) {
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
                throw new f4(i16 - 1, length);
            } else if (55296 > charAt2 || charAt2 > 57343 || ((i13 = i16 + 1) != charSequence.length() && Character.isSurrogatePair(charAt2, charSequence.charAt(i13)))) {
                StringBuilder sb = new StringBuilder(37);
                sb.append("Failed writing ");
                sb.append(charAt2);
                sb.append(" at index ");
                sb.append(i17);
                throw new ArrayIndexOutOfBoundsException(sb.toString());
            } else {
                throw new f4(i16, length);
            }
            i17 = i12;
            i16++;
        }
        return i17;
    }

    public final int v(byte[] bArr, int i10, int i11) {
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
                        return e4.c(bArr, i12, i11);
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
                    return e4.c(bArr, i12, i11);
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
}
