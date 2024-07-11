package com.google.android.gms.internal.vision;

import com.karumi.dexter.BuildConfig;

public final class s0 {
    public static int a(int i10, byte[] bArr) {
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    public static int b(int i10, byte[] bArr, int i11, int i12, t0 t0Var) {
        if ((i10 >>> 3) != 0) {
            int i13 = i10 & 7;
            if (i13 == 0) {
                return k(bArr, i11, t0Var);
            }
            if (i13 == 1) {
                return i11 + 8;
            }
            if (i13 == 2) {
                return i(bArr, i11, t0Var) + t0Var.f3164a;
            }
            if (i13 == 3) {
                int i14 = (i10 & -8) | 4;
                int i15 = 0;
                while (i11 < i12) {
                    i11 = i(bArr, i11, t0Var);
                    i15 = t0Var.f3164a;
                    if (i15 == i14) {
                        break;
                    }
                    i11 = b(i15, bArr, i11, i12, t0Var);
                }
                if (i11 <= i12 && i15 == i14) {
                    return i11;
                }
                throw z1.c();
            } else if (i13 == 5) {
                return i11 + 4;
            } else {
                throw new z1("Protocol message contained an invalid tag (zero).");
            }
        } else {
            throw new z1("Protocol message contained an invalid tag (zero).");
        }
    }

    public static int c(int i10, byte[] bArr, int i11, int i12, a2<?> a2Var, t0 t0Var) {
        s1 s1Var = (s1) a2Var;
        int i13 = i(bArr, i11, t0Var);
        while (true) {
            s1Var.h(t0Var.f3164a);
            if (i13 >= i12) {
                break;
            }
            int i14 = i(bArr, i13, t0Var);
            if (i10 != t0Var.f3164a) {
                break;
            }
            i13 = i(bArr, i14, t0Var);
        }
        return i13;
    }

    public static int d(int i10, byte[] bArr, int i11, int i12, y3 y3Var, t0 t0Var) {
        z0 z0Var;
        if ((i10 >>> 3) != 0) {
            int i13 = i10 & 7;
            if (i13 == 0) {
                int k10 = k(bArr, i11, t0Var);
                y3Var.a(i10, Long.valueOf(t0Var.f3165b));
                return k10;
            } else if (i13 == 1) {
                y3Var.a(i10, Long.valueOf(l(i11, bArr)));
                return i11 + 8;
            } else if (i13 == 2) {
                int i14 = i(bArr, i11, t0Var);
                int i15 = t0Var.f3164a;
                if (i15 < 0) {
                    throw z1.b();
                } else if (i15 <= bArr.length - i14) {
                    if (i15 == 0) {
                        z0Var = w0.f3182p;
                    } else {
                        z0Var = w0.k(bArr, i14, i15);
                    }
                    y3Var.a(i10, z0Var);
                    return i14 + i15;
                } else {
                    throw z1.a();
                }
            } else if (i13 == 3) {
                y3 y3Var2 = new y3();
                int i16 = (i10 & -8) | 4;
                int i17 = 0;
                while (true) {
                    if (i11 >= i12) {
                        break;
                    }
                    int i18 = i(bArr, i11, t0Var);
                    int i19 = t0Var.f3164a;
                    i17 = i19;
                    if (i19 == i16) {
                        i11 = i18;
                        break;
                    }
                    int d = d(i17, bArr, i18, i12, y3Var2, t0Var);
                    i17 = i19;
                    i11 = d;
                }
                if (i11 > i12 || i17 != i16) {
                    throw z1.c();
                }
                y3Var.a(i10, y3Var2);
                return i11;
            } else if (i13 == 5) {
                y3Var.a(i10, Integer.valueOf(a(i11, bArr)));
                return i11 + 4;
            } else {
                throw new z1("Protocol message contained an invalid tag (zero).");
            }
        } else {
            throw new z1("Protocol message contained an invalid tag (zero).");
        }
    }

    public static int e(int i10, byte[] bArr, int i11, t0 t0Var) {
        int i12;
        int i13;
        int i14 = i10 & 127;
        int i15 = i11 + 1;
        byte b10 = bArr[i11];
        if (b10 >= 0) {
            i13 = b10 << 7;
        } else {
            int i16 = i14 | ((b10 & Byte.MAX_VALUE) << 7);
            int i17 = i15 + 1;
            byte b11 = bArr[i15];
            if (b11 >= 0) {
                i12 = b11 << 14;
            } else {
                i14 = i16 | ((b11 & Byte.MAX_VALUE) << 14);
                i15 = i17 + 1;
                byte b12 = bArr[i17];
                if (b12 >= 0) {
                    i13 = b12 << 21;
                } else {
                    i16 = i14 | ((b12 & Byte.MAX_VALUE) << 21);
                    i17 = i15 + 1;
                    byte b13 = bArr[i15];
                    if (b13 >= 0) {
                        i12 = b13 << 28;
                    } else {
                        int i18 = i16 | ((b13 & Byte.MAX_VALUE) << 28);
                        while (true) {
                            int i19 = i17 + 1;
                            if (bArr[i17] >= 0) {
                                t0Var.f3164a = i18;
                                return i19;
                            }
                            i17 = i19;
                        }
                    }
                }
            }
            t0Var.f3164a = i16 | i12;
            return i17;
        }
        t0Var.f3164a = i14 | i13;
        return i15;
    }

    public static int f(m3<?> m3Var, int i10, byte[] bArr, int i11, int i12, a2<?> a2Var, t0 t0Var) {
        int h10 = h(m3Var, bArr, i11, i12, t0Var);
        while (true) {
            a2Var.add(t0Var.f3166c);
            if (h10 >= i12) {
                break;
            }
            int i13 = i(bArr, h10, t0Var);
            if (i10 != t0Var.f3164a) {
                break;
            }
            h10 = h(m3Var, bArr, i13, i12, t0Var);
        }
        return h10;
    }

    public static int g(m3 m3Var, byte[] bArr, int i10, int i11, int i12, t0 t0Var) {
        a3 a3Var = (a3) m3Var;
        Object h10 = a3Var.h();
        int l = a3Var.l(h10, bArr, i10, i11, i12, t0Var);
        a3Var.a(h10);
        t0Var.f3166c = h10;
        return l;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int h(com.google.android.gms.internal.vision.m3 r6, byte[] r7, int r8, int r9, com.google.android.gms.internal.vision.t0 r10) {
        /*
            int r0 = r8 + 1
            byte r8 = r7[r8]
            if (r8 >= 0) goto L_0x000c
            int r0 = e(r8, r7, r0, r10)
            int r8 = r10.f3164a
        L_0x000c:
            r3 = r0
            if (r8 < 0) goto L_0x0025
            int r9 = r9 - r3
            if (r8 > r9) goto L_0x0025
            java.lang.Object r9 = r6.h()
            int r8 = r8 + r3
            r0 = r6
            r1 = r9
            r2 = r7
            r4 = r8
            r5 = r10
            r0.g(r1, r2, r3, r4, r5)
            r6.a(r9)
            r10.f3166c = r9
            return r8
        L_0x0025:
            com.google.android.gms.internal.vision.z1 r6 = com.google.android.gms.internal.vision.z1.a()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.s0.h(com.google.android.gms.internal.vision.m3, byte[], int, int, com.google.android.gms.internal.vision.t0):int");
    }

    public static int i(byte[] bArr, int i10, t0 t0Var) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 < 0) {
            return e(b10, bArr, i11, t0Var);
        }
        t0Var.f3164a = b10;
        return i11;
    }

    public static int j(byte[] bArr, int i10, a2<?> a2Var, t0 t0Var) {
        s1 s1Var = (s1) a2Var;
        int i11 = i(bArr, i10, t0Var);
        int i12 = t0Var.f3164a + i11;
        while (i11 < i12) {
            i11 = i(bArr, i11, t0Var);
            s1Var.h(t0Var.f3164a);
        }
        if (i11 == i12) {
            return i11;
        }
        throw z1.a();
    }

    public static int k(byte[] bArr, int i10, t0 t0Var) {
        int i11 = i10 + 1;
        long j8 = (long) bArr[i10];
        if (j8 >= 0) {
            t0Var.f3165b = j8;
            return i11;
        }
        int i12 = i11 + 1;
        byte b10 = bArr[i11];
        long j10 = (j8 & 127) | (((long) (b10 & Byte.MAX_VALUE)) << 7);
        int i13 = 7;
        while (b10 < 0) {
            int i14 = i12 + 1;
            byte b11 = bArr[i12];
            i13 += 7;
            j10 |= ((long) (b11 & Byte.MAX_VALUE)) << i13;
            int i15 = i14;
            b10 = b11;
            i12 = i15;
        }
        t0Var.f3165b = j10;
        return i12;
    }

    public static long l(int i10, byte[] bArr) {
        return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
    }

    public static double m(int i10, byte[] bArr) {
        return Double.longBitsToDouble(l(i10, bArr));
    }

    public static int n(byte[] bArr, int i10, t0 t0Var) {
        int i11 = i(bArr, i10, t0Var);
        int i12 = t0Var.f3164a;
        if (i12 < 0) {
            throw z1.b();
        } else if (i12 == 0) {
            t0Var.f3166c = BuildConfig.FLAVOR;
            return i11;
        } else {
            t0Var.f3166c = new String(bArr, i11, i12, u1.f3170a);
            return i11 + i12;
        }
    }

    public static float o(int i10, byte[] bArr) {
        return Float.intBitsToFloat(a(i10, bArr));
    }

    public static int p(byte[] bArr, int i10, t0 t0Var) {
        int i11 = i(bArr, i10, t0Var);
        int i12 = t0Var.f3164a;
        if (i12 < 0) {
            throw z1.b();
        } else if (i12 == 0) {
            t0Var.f3166c = BuildConfig.FLAVOR;
            return i11;
        } else {
            t0Var.f3166c = e4.f3085a.B(bArr, i11, i12);
            return i11 + i12;
        }
    }

    public static int q(byte[] bArr, int i10, t0 t0Var) {
        int i11 = i(bArr, i10, t0Var);
        int i12 = t0Var.f3164a;
        if (i12 < 0) {
            throw z1.b();
        } else if (i12 > bArr.length - i11) {
            throw z1.a();
        } else if (i12 == 0) {
            t0Var.f3166c = w0.f3182p;
            return i11;
        } else {
            t0Var.f3166c = w0.k(bArr, i11, i12);
            return i11 + i12;
        }
    }
}
