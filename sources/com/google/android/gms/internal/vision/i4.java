package com.google.android.gms.internal.vision;

import androidx.activity.result.c;
import s6.a;

public final class i4 extends c {
    public static int E(long j8, byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            c cVar = e4.f3085a;
            if (i10 > -12) {
                return -1;
            }
            return i10;
        } else if (i11 == 1) {
            byte a10 = b4.a(bArr, j8);
            c cVar2 = e4.f3085a;
            if (i10 > -12 || a10 > -65) {
                return -1;
            }
            return i10 ^ (a10 << 8);
        } else if (i11 == 2) {
            byte a11 = b4.a(bArr, j8);
            byte a12 = b4.a(bArr, j8 + 1);
            c cVar3 = e4.f3085a;
            if (i10 > -12 || a11 > -65 || a12 > -65) {
                return -1;
            }
            return ((a11 << 8) ^ i10) ^ (a12 << 16);
        } else {
            throw new AssertionError();
        }
    }

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
                byte a10 = b4.a(bArr, (long) r13);
                if (a10 >= 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (!z13) {
                    break;
                }
                i10 = r13 + 1;
                cArr[i13] = (char) a10;
                i13++;
            }
            int i14 = i13;
            while (r13 < i12) {
                int i15 = r13 + 1;
                byte a11 = b4.a(bArr, (long) r13);
                if (a11 >= 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    int i16 = i14 + 1;
                    cArr[i14] = (char) a11;
                    r13 = i15;
                    while (true) {
                        i14 = i16;
                        if (r13 < i12) {
                            byte a12 = b4.a(bArr, (long) r13);
                            if (a12 >= 0) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (!z12) {
                                break;
                            }
                            r13++;
                            i16 = i14 + 1;
                            cArr[i14] = (char) a12;
                        } else {
                            break;
                        }
                    }
                } else {
                    if (a11 < -32) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        if (a11 < -16) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z11) {
                            if (i15 < i12 - 1) {
                                int i17 = i15 + 1;
                                a.a0(a11, b4.a(bArr, (long) i15), b4.a(bArr, (long) i17), cArr, i14);
                                r13 = i17 + 1;
                                i14++;
                            } else {
                                throw z1.d();
                            }
                        } else if (i15 < i12 - 2) {
                            int i18 = i15 + 1;
                            byte a13 = b4.a(bArr, (long) i15);
                            int i19 = i18 + 1;
                            a.Z(a11, a13, b4.a(bArr, (long) i18), b4.a(bArr, (long) i19), cArr, i14);
                            i14 = i14 + 1 + 1;
                            r13 = i19 + 1;
                        } else {
                            throw z1.d();
                        }
                    } else if (i15 < i12) {
                        int i20 = i15 + 1;
                        byte a14 = b4.a(bArr, (long) i15);
                        int i21 = i14 + 1;
                        if (a11 < -62 || a.y0(a14)) {
                            throw z1.d();
                        }
                        cArr[i14] = (char) (((a11 & 31) << 6) | (a14 & 63));
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

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0033 A[LOOP:1: B:13:0x0033->B:37:0x00fc, LOOP_START, PHI: r2 r3 r4 r11 
      PHI: (r2v4 int) = (r2v3 int), (r2v6 int) binds: [B:10:0x002f, B:37:0x00fc] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r3v3 char) = (r3v2 char), (r3v4 char) binds: [B:10:0x002f, B:37:0x00fc] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r4v3 long) = (r4v2 long), (r4v5 long) binds: [B:10:0x002f, B:37:0x00fc] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r11v3 long) = (r11v2 long), (r11v5 long) binds: [B:10:0x002f, B:37:0x00fc] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int u(java.lang.CharSequence r22, byte[] r23, int r24, int r25) {
        /*
            r21 = this;
            r0 = r22
            r1 = r23
            r2 = r24
            r3 = r25
            long r4 = (long) r2
            long r6 = (long) r3
            long r6 = r6 + r4
            int r8 = r22.length()
            java.lang.String r9 = " at index "
            java.lang.String r10 = "Failed writing "
            if (r8 > r3) goto L_0x0146
            int r11 = r1.length
            int r11 = r11 - r3
            if (r11 < r2) goto L_0x0146
            r2 = 0
        L_0x001a:
            r11 = 1
            r3 = 128(0x80, float:1.794E-43)
            if (r2 >= r8) goto L_0x002f
            char r13 = r0.charAt(r2)
            if (r13 >= r3) goto L_0x002f
            long r11 = r11 + r4
            byte r3 = (byte) r13
            com.google.android.gms.internal.vision.b4.h(r1, r4, r3)
            int r2 = r2 + 1
            r4 = r11
            goto L_0x001a
        L_0x002f:
            if (r2 != r8) goto L_0x0033
            int r0 = (int) r4
            return r0
        L_0x0033:
            if (r2 >= r8) goto L_0x0144
            char r13 = r0.charAt(r2)
            if (r13 >= r3) goto L_0x004a
            int r14 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r14 >= 0) goto L_0x004a
            long r14 = r4 + r11
            byte r13 = (byte) r13
            com.google.android.gms.internal.vision.b4.h(r1, r4, r13)
            r4 = r11
            r12 = r14
            r11 = r3
            goto L_0x00fc
        L_0x004a:
            r14 = 2048(0x800, float:2.87E-42)
            if (r13 >= r14) goto L_0x0074
            r14 = 2
            long r14 = r6 - r14
            int r14 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r14 > 0) goto L_0x0074
            long r14 = r4 + r11
            int r3 = r13 >>> 6
            r3 = r3 | 960(0x3c0, float:1.345E-42)
            byte r3 = (byte) r3
            com.google.android.gms.internal.vision.b4.h(r1, r4, r3)
            long r3 = r14 + r11
            r5 = r13 & 63
            r13 = 128(0x80, float:1.794E-43)
            r5 = r5 | r13
            byte r5 = (byte) r5
            com.google.android.gms.internal.vision.b4.h(r1, r14, r5)
            r19 = r11
            r11 = 128(0x80, float:1.794E-43)
            r12 = r3
            r4 = r19
            goto L_0x00fc
        L_0x0074:
            r3 = 57343(0xdfff, float:8.0355E-41)
            r14 = 55296(0xd800, float:7.7486E-41)
            if (r13 < r14) goto L_0x007e
            if (r3 >= r13) goto L_0x00af
        L_0x007e:
            r15 = 3
            long r15 = r6 - r15
            int r15 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1))
            if (r15 > 0) goto L_0x00af
            long r14 = r4 + r11
            int r3 = r13 >>> 12
            r3 = r3 | 480(0x1e0, float:6.73E-43)
            byte r3 = (byte) r3
            com.google.android.gms.internal.vision.b4.h(r1, r4, r3)
            long r3 = r14 + r11
            int r5 = r13 >>> 6
            r5 = r5 & 63
            r11 = 128(0x80, float:1.794E-43)
            r5 = r5 | r11
            byte r5 = (byte) r5
            com.google.android.gms.internal.vision.b4.h(r1, r14, r5)
            r14 = 1
            long r17 = r3 + r14
            r5 = r13 & 63
            r5 = r5 | r11
            byte r5 = (byte) r5
            com.google.android.gms.internal.vision.b4.h(r1, r3, r5)
            r12 = r17
            r4 = 1
            r11 = 128(0x80, float:1.794E-43)
            goto L_0x00fc
        L_0x00af:
            r11 = 4
            long r11 = r6 - r11
            int r11 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r11 > 0) goto L_0x010f
            int r3 = r2 + 1
            if (r3 == r8) goto L_0x0107
            char r2 = r0.charAt(r3)
            boolean r11 = java.lang.Character.isSurrogatePair(r13, r2)
            if (r11 == 0) goto L_0x0106
            int r2 = java.lang.Character.toCodePoint(r13, r2)
            r11 = 1
            long r13 = r4 + r11
            int r15 = r2 >>> 18
            r15 = r15 | 240(0xf0, float:3.36E-43)
            byte r15 = (byte) r15
            com.google.android.gms.internal.vision.b4.h(r1, r4, r15)
            long r4 = r13 + r11
            int r15 = r2 >>> 12
            r15 = r15 & 63
            r11 = 128(0x80, float:1.794E-43)
            r12 = r15 | 128(0x80, float:1.794E-43)
            byte r12 = (byte) r12
            com.google.android.gms.internal.vision.b4.h(r1, r13, r12)
            r12 = 1
            long r14 = r4 + r12
            int r16 = r2 >>> 6
            r12 = r16 & 63
            r12 = r12 | r11
            byte r12 = (byte) r12
            com.google.android.gms.internal.vision.b4.h(r1, r4, r12)
            r4 = 1
            long r12 = r14 + r4
            r2 = r2 & 63
            r2 = r2 | r11
            byte r2 = (byte) r2
            com.google.android.gms.internal.vision.b4.h(r1, r14, r2)
            r2 = r3
        L_0x00fc:
            int r2 = r2 + 1
            r3 = r11
            r19 = r4
            r4 = r12
            r11 = r19
            goto L_0x0033
        L_0x0106:
            r2 = r3
        L_0x0107:
            com.google.android.gms.internal.vision.f4 r0 = new com.google.android.gms.internal.vision.f4
            int r2 = r2 + -1
            r0.<init>(r2, r8)
            throw r0
        L_0x010f:
            if (r14 > r13) goto L_0x0127
            if (r13 > r3) goto L_0x0127
            int r1 = r2 + 1
            if (r1 == r8) goto L_0x0121
            char r0 = r0.charAt(r1)
            boolean r0 = java.lang.Character.isSurrogatePair(r13, r0)
            if (r0 != 0) goto L_0x0127
        L_0x0121:
            com.google.android.gms.internal.vision.f4 r0 = new com.google.android.gms.internal.vision.f4
            r0.<init>(r2, r8)
            throw r0
        L_0x0127:
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 46
            r1.<init>(r2)
            r1.append(r10)
            r1.append(r13)
            r1.append(r9)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0144:
            int r0 = (int) r4
            return r0
        L_0x0146:
            java.lang.ArrayIndexOutOfBoundsException r1 = new java.lang.ArrayIndexOutOfBoundsException
            int r8 = r8 + -1
            char r0 = r0.charAt(r8)
            int r2 = r2 + r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = 37
            r3.<init>(r4)
            r3.append(r10)
            r3.append(r0)
            r3.append(r9)
            r3.append(r2)
            java.lang.String r0 = r3.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.i4.u(java.lang.CharSequence, byte[], int, int):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x005b, code lost:
        return -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00b0, code lost:
        return -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int v(byte[] r13, int r14, int r15) {
        /*
            r12 = this;
            r0 = r14 | r15
            int r1 = r13.length
            int r1 = r1 - r15
            r0 = r0 | r1
            r1 = 2
            r2 = 3
            r3 = 0
            if (r0 < 0) goto L_0x00b1
            long r4 = (long) r14
            long r14 = (long) r15
            long r14 = r14 - r4
            int r14 = (int) r14
            r15 = 16
            r6 = 1
            if (r14 >= r15) goto L_0x0016
            r15 = r3
            goto L_0x0028
        L_0x0016:
            r15 = r3
            r8 = r4
        L_0x0018:
            if (r15 >= r14) goto L_0x0027
            long r10 = r8 + r6
            byte r0 = com.google.android.gms.internal.vision.b4.a(r13, r8)
            if (r0 >= 0) goto L_0x0023
            goto L_0x0028
        L_0x0023:
            int r15 = r15 + 1
            r8 = r10
            goto L_0x0018
        L_0x0027:
            r15 = r14
        L_0x0028:
            int r14 = r14 - r15
            long r8 = (long) r15
            long r4 = r4 + r8
        L_0x002b:
            r15 = r3
        L_0x002c:
            if (r14 <= 0) goto L_0x003b
            long r8 = r4 + r6
            byte r15 = com.google.android.gms.internal.vision.b4.a(r13, r4)
            if (r15 < 0) goto L_0x003a
            int r14 = r14 + -1
            r4 = r8
            goto L_0x002c
        L_0x003a:
            r4 = r8
        L_0x003b:
            if (r14 != 0) goto L_0x003e
            return r3
        L_0x003e:
            int r14 = r14 + -1
            r0 = -1
            r8 = -32
            r9 = -65
            if (r15 >= r8) goto L_0x005c
            if (r14 != 0) goto L_0x004a
            return r15
        L_0x004a:
            int r14 = r14 + -1
            r8 = -62
            if (r15 < r8) goto L_0x005b
            long r10 = r4 + r6
            byte r15 = com.google.android.gms.internal.vision.b4.a(r13, r4)
            if (r15 <= r9) goto L_0x0059
            goto L_0x005b
        L_0x0059:
            r4 = r10
            goto L_0x002b
        L_0x005b:
            return r0
        L_0x005c:
            r10 = -16
            if (r15 >= r10) goto L_0x0086
            if (r14 >= r1) goto L_0x0067
            int r13 = E(r4, r13, r15, r14)
            return r13
        L_0x0067:
            int r14 = r14 + -2
            long r10 = r4 + r6
            byte r4 = com.google.android.gms.internal.vision.b4.a(r13, r4)
            if (r4 > r9) goto L_0x0085
            r5 = -96
            if (r15 != r8) goto L_0x0077
            if (r4 < r5) goto L_0x0085
        L_0x0077:
            r8 = -19
            if (r15 != r8) goto L_0x007d
            if (r4 >= r5) goto L_0x0085
        L_0x007d:
            long r4 = r10 + r6
            byte r15 = com.google.android.gms.internal.vision.b4.a(r13, r10)
            if (r15 <= r9) goto L_0x002b
        L_0x0085:
            return r0
        L_0x0086:
            if (r14 >= r2) goto L_0x008d
            int r13 = E(r4, r13, r15, r14)
            return r13
        L_0x008d:
            int r14 = r14 + -3
            long r10 = r4 + r6
            byte r4 = com.google.android.gms.internal.vision.b4.a(r13, r4)
            if (r4 > r9) goto L_0x00b0
            int r15 = r15 << 28
            int r4 = r4 + 112
            int r4 = r4 + r15
            int r15 = r4 >> 30
            if (r15 != 0) goto L_0x00b0
            long r4 = r10 + r6
            byte r15 = com.google.android.gms.internal.vision.b4.a(r13, r10)
            if (r15 > r9) goto L_0x00b0
            long r10 = r4 + r6
            byte r15 = com.google.android.gms.internal.vision.b4.a(r13, r4)
            if (r15 <= r9) goto L_0x0059
        L_0x00b0:
            return r0
        L_0x00b1:
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
            java.lang.Object[] r2 = new java.lang.Object[r2]
            int r13 = r13.length
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r2[r3] = r13
            java.lang.Integer r13 = java.lang.Integer.valueOf(r14)
            r14 = 1
            r2[r14] = r13
            java.lang.Integer r13 = java.lang.Integer.valueOf(r15)
            r2[r1] = r13
            java.lang.String r13 = "Array length=%d, index=%d, limit=%d"
            java.lang.String r13 = java.lang.String.format(r13, r2)
            r0.<init>(r13)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.i4.v(byte[], int, int):int");
    }
}
