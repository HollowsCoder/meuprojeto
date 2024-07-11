package com.google.android.gms.internal.clearcut;

import androidx.activity.result.c;

public final class f3 extends c {
    public static int E(long j8, byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            c cVar = c3.f2396a;
            if (i10 > -12) {
                return -1;
            }
            return i10;
        } else if (i11 == 1) {
            byte a10 = a3.a(bArr, j8);
            c cVar2 = c3.f2396a;
            if (i10 > -12 || a10 > -65) {
                return -1;
            }
            return i10 ^ (a10 << 8);
        } else if (i11 == 2) {
            byte a11 = a3.a(bArr, j8);
            byte a12 = a3.a(bArr, j8 + 1);
            c cVar3 = c3.f2396a;
            if (i10 > -12 || a11 > -65 || a12 > -65) {
                return -1;
            }
            return ((a11 << 8) ^ i10) ^ (a12 << 16);
        } else {
            throw new AssertionError();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x005b, code lost:
        return -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00b0, code lost:
        return -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A(byte[] r13, int r14, int r15) {
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
            byte r0 = com.google.android.gms.internal.clearcut.a3.a(r13, r8)
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
            byte r15 = com.google.android.gms.internal.clearcut.a3.a(r13, r4)
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
            byte r15 = com.google.android.gms.internal.clearcut.a3.a(r13, r4)
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
            byte r4 = com.google.android.gms.internal.clearcut.a3.a(r13, r4)
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
            byte r15 = com.google.android.gms.internal.clearcut.a3.a(r13, r10)
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
            byte r4 = com.google.android.gms.internal.clearcut.a3.a(r13, r4)
            if (r4 > r9) goto L_0x00b0
            int r15 = r15 << 28
            int r4 = r4 + 112
            int r4 = r4 + r15
            int r15 = r4 >> 30
            if (r15 != 0) goto L_0x00b0
            long r4 = r10 + r6
            byte r15 = com.google.android.gms.internal.clearcut.a3.a(r13, r10)
            if (r15 > r9) goto L_0x00b0
            long r10 = r4 + r6
            byte r15 = com.google.android.gms.internal.clearcut.a3.a(r13, r4)
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.f3.A(byte[], int, int):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0044 A[LOOP:1: B:10:0x0044->B:35:0x0108, LOOP_START, PHI: r2 r4 r6 r9 r12 
      PHI: (r2v3 long) = (r2v1 long), (r2v4 long) binds: [B:8:0x003e, B:35:0x0108] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r4v5 long) = (r4v4 long), (r4v7 long) binds: [B:8:0x003e, B:35:0x0108] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r6v3 long) = (r6v2 long), (r6v4 long) binds: [B:8:0x003e, B:35:0x0108] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r9v4 int) = (r9v3 int), (r9v6 int) binds: [B:8:0x003e, B:35:0x0108] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r12v1 char) = (r12v0 char), (r12v2 char) binds: [B:8:0x003e, B:35:0x0108] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0040  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void C(java.lang.CharSequence r22, java.nio.ByteBuffer r23) {
        /*
            r21 = this;
            r0 = r22
            r1 = r23
            com.google.android.gms.internal.clearcut.a3$d r2 = com.google.android.gms.internal.clearcut.a3.d
            long r3 = com.google.android.gms.internal.clearcut.a3.f2370h
            long r2 = r2.k(r3, r1)
            int r4 = r23.position()
            long r4 = (long) r4
            long r4 = r4 + r2
            int r6 = r23.limit()
            long r6 = (long) r6
            long r6 = r6 + r2
            int r8 = r22.length()
            long r9 = (long) r8
            long r11 = r6 - r4
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            java.lang.String r10 = " at index "
            java.lang.String r11 = "Failed writing "
            if (r9 > 0) goto L_0x015d
            r9 = 0
        L_0x0028:
            r12 = 128(0x80, float:1.794E-43)
            r13 = 1
            if (r9 >= r8) goto L_0x003e
            char r15 = r0.charAt(r9)
            if (r15 >= r12) goto L_0x003e
            long r12 = r4 + r13
            byte r14 = (byte) r15
            com.google.android.gms.internal.clearcut.a3.b(r4, r14)
            int r9 = r9 + 1
            r4 = r12
            goto L_0x0028
        L_0x003e:
            if (r9 != r8) goto L_0x0044
            long r4 = r4 - r2
            int r0 = (int) r4
            goto L_0x0159
        L_0x0044:
            if (r9 >= r8) goto L_0x0152
            char r15 = r0.charAt(r9)
            if (r15 >= r12) goto L_0x0060
            int r16 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r16 >= 0) goto L_0x0060
            long r16 = r4 + r13
            byte r15 = (byte) r15
            com.google.android.gms.internal.clearcut.a3.b(r4, r15)
            r19 = r6
            r1 = r9
            r9 = r12
            r4 = r16
            r17 = r2
            goto L_0x0108
        L_0x0060:
            r12 = 2048(0x800, float:2.87E-42)
            if (r15 >= r12) goto L_0x0084
            r17 = 2
            long r17 = r6 - r17
            int r12 = (r4 > r17 ? 1 : (r4 == r17 ? 0 : -1))
            if (r12 > 0) goto L_0x0084
            r17 = r2
            long r1 = r4 + r13
            int r3 = r15 >>> 6
            r3 = r3 | 960(0x3c0, float:1.345E-42)
            byte r3 = (byte) r3
            com.google.android.gms.internal.clearcut.a3.b(r4, r3)
            long r3 = r1 + r13
            r5 = r15 & 63
            r12 = 128(0x80, float:1.794E-43)
            r5 = r5 | r12
            byte r5 = (byte) r5
            com.google.android.gms.internal.clearcut.a3.b(r1, r5)
            goto L_0x00b9
        L_0x0084:
            r17 = r2
            r1 = 57343(0xdfff, float:8.0355E-41)
            r2 = 55296(0xd800, float:7.7486E-41)
            if (r15 < r2) goto L_0x0090
            if (r1 >= r15) goto L_0x00c0
        L_0x0090:
            r19 = 3
            long r19 = r6 - r19
            int r3 = (r4 > r19 ? 1 : (r4 == r19 ? 0 : -1))
            if (r3 > 0) goto L_0x00c0
            long r1 = r4 + r13
            int r3 = r15 >>> 12
            r3 = r3 | 480(0x1e0, float:6.73E-43)
            byte r3 = (byte) r3
            com.google.android.gms.internal.clearcut.a3.b(r4, r3)
            long r3 = r1 + r13
            int r5 = r15 >>> 6
            r5 = r5 & 63
            r12 = 128(0x80, float:1.794E-43)
            r5 = r5 | r12
            byte r5 = (byte) r5
            com.google.android.gms.internal.clearcut.a3.b(r1, r5)
            long r1 = r3 + r13
            r5 = r15 & 63
            r5 = r5 | r12
            byte r5 = (byte) r5
            com.google.android.gms.internal.clearcut.a3.b(r3, r5)
            r3 = r1
        L_0x00b9:
            r4 = r3
            r19 = r6
            r1 = r9
            r9 = 128(0x80, float:1.794E-43)
            goto L_0x0108
        L_0x00c0:
            r19 = 4
            long r19 = r6 - r19
            int r3 = (r4 > r19 ? 1 : (r4 == r19 ? 0 : -1))
            if (r3 > 0) goto L_0x011d
            int r1 = r9 + 1
            if (r1 == r8) goto L_0x0115
            char r2 = r0.charAt(r1)
            boolean r3 = java.lang.Character.isSurrogatePair(r15, r2)
            if (r3 == 0) goto L_0x0114
            int r2 = java.lang.Character.toCodePoint(r15, r2)
            r19 = r6
            long r6 = r4 + r13
            int r3 = r2 >>> 18
            r3 = r3 | 240(0xf0, float:3.36E-43)
            byte r3 = (byte) r3
            com.google.android.gms.internal.clearcut.a3.b(r4, r3)
            long r3 = r6 + r13
            int r5 = r2 >>> 12
            r5 = r5 & 63
            r9 = 128(0x80, float:1.794E-43)
            r5 = r5 | r9
            byte r5 = (byte) r5
            com.google.android.gms.internal.clearcut.a3.b(r6, r5)
            long r5 = r3 + r13
            int r7 = r2 >>> 6
            r7 = r7 & 63
            r7 = r7 | r9
            byte r7 = (byte) r7
            com.google.android.gms.internal.clearcut.a3.b(r3, r7)
            long r3 = r5 + r13
            r2 = r2 & 63
            r2 = r2 | r9
            byte r2 = (byte) r2
            com.google.android.gms.internal.clearcut.a3.b(r5, r2)
            r4 = r3
        L_0x0108:
            int r1 = r1 + 1
            r12 = r9
            r2 = r17
            r6 = r19
            r9 = r1
            r1 = r23
            goto L_0x0044
        L_0x0114:
            r9 = r1
        L_0x0115:
            com.google.android.gms.internal.clearcut.e3 r0 = new com.google.android.gms.internal.clearcut.e3
            int r9 = r9 + -1
            r0.<init>(r9, r8)
            throw r0
        L_0x011d:
            if (r2 > r15) goto L_0x0135
            if (r15 > r1) goto L_0x0135
            int r1 = r9 + 1
            if (r1 == r8) goto L_0x012f
            char r0 = r0.charAt(r1)
            boolean r0 = java.lang.Character.isSurrogatePair(r15, r0)
            if (r0 != 0) goto L_0x0135
        L_0x012f:
            com.google.android.gms.internal.clearcut.e3 r0 = new com.google.android.gms.internal.clearcut.e3
            r0.<init>(r9, r8)
            throw r0
        L_0x0135:
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 46
            r1.<init>(r2)
            r1.append(r11)
            r1.append(r15)
            r1.append(r10)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0152:
            r17 = r2
            long r4 = r4 - r17
            int r0 = (int) r4
            r1 = r23
        L_0x0159:
            r1.position(r0)
            return
        L_0x015d:
            java.lang.ArrayIndexOutOfBoundsException r2 = new java.lang.ArrayIndexOutOfBoundsException
            int r8 = r8 + -1
            char r0 = r0.charAt(r8)
            int r1 = r23.limit()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = 37
            r3.<init>(r4)
            r3.append(r11)
            r3.append(r0)
            r3.append(r10)
            r3.append(r1)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.f3.C(java.lang.CharSequence, java.nio.ByteBuffer):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0033 A[LOOP:1: B:13:0x0033->B:37:0x00fc, LOOP_START, PHI: r2 r3 r4 r11 
      PHI: (r2v4 int) = (r2v3 int), (r2v6 int) binds: [B:10:0x002f, B:37:0x00fc] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r3v3 char) = (r3v2 char), (r3v4 char) binds: [B:10:0x002f, B:37:0x00fc] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r4v3 long) = (r4v2 long), (r4v5 long) binds: [B:10:0x002f, B:37:0x00fc] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r11v3 long) = (r11v2 long), (r11v5 long) binds: [B:10:0x002f, B:37:0x00fc] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int z(java.lang.CharSequence r22, byte[] r23, int r24, int r25) {
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
            com.google.android.gms.internal.clearcut.a3.h(r1, r4, r3)
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
            com.google.android.gms.internal.clearcut.a3.h(r1, r4, r13)
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
            com.google.android.gms.internal.clearcut.a3.h(r1, r4, r3)
            long r3 = r14 + r11
            r5 = r13 & 63
            r13 = 128(0x80, float:1.794E-43)
            r5 = r5 | r13
            byte r5 = (byte) r5
            com.google.android.gms.internal.clearcut.a3.h(r1, r14, r5)
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
            com.google.android.gms.internal.clearcut.a3.h(r1, r4, r3)
            long r3 = r14 + r11
            int r5 = r13 >>> 6
            r5 = r5 & 63
            r11 = 128(0x80, float:1.794E-43)
            r5 = r5 | r11
            byte r5 = (byte) r5
            com.google.android.gms.internal.clearcut.a3.h(r1, r14, r5)
            r14 = 1
            long r17 = r3 + r14
            r5 = r13 & 63
            r5 = r5 | r11
            byte r5 = (byte) r5
            com.google.android.gms.internal.clearcut.a3.h(r1, r3, r5)
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
            com.google.android.gms.internal.clearcut.a3.h(r1, r4, r15)
            long r4 = r13 + r11
            int r15 = r2 >>> 12
            r15 = r15 & 63
            r11 = 128(0x80, float:1.794E-43)
            r12 = r15 | 128(0x80, float:1.794E-43)
            byte r12 = (byte) r12
            com.google.android.gms.internal.clearcut.a3.h(r1, r13, r12)
            r12 = 1
            long r14 = r4 + r12
            int r16 = r2 >>> 6
            r12 = r16 & 63
            r12 = r12 | r11
            byte r12 = (byte) r12
            com.google.android.gms.internal.clearcut.a3.h(r1, r4, r12)
            r4 = 1
            long r12 = r14 + r4
            r2 = r2 & 63
            r2 = r2 | r11
            byte r2 = (byte) r2
            com.google.android.gms.internal.clearcut.a3.h(r1, r14, r2)
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
            com.google.android.gms.internal.clearcut.e3 r0 = new com.google.android.gms.internal.clearcut.e3
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
            com.google.android.gms.internal.clearcut.e3 r0 = new com.google.android.gms.internal.clearcut.e3
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.f3.z(java.lang.CharSequence, byte[], int, int):int");
    }
}
