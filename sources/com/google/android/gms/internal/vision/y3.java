package com.google.android.gms.internal.vision;

import java.util.Arrays;

public final class y3 {

    /* renamed from: f  reason: collision with root package name */
    public static final y3 f3189f = new y3(0, new int[0], new Object[0], false);

    /* renamed from: a  reason: collision with root package name */
    public int f3190a;

    /* renamed from: b  reason: collision with root package name */
    public int[] f3191b;

    /* renamed from: c  reason: collision with root package name */
    public Object[] f3192c;
    public int d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f3193e;

    public y3() {
        this(0, new int[8], new Object[8], true);
    }

    public y3(int i10, int[] iArr, Object[] objArr, boolean z) {
        this.d = -1;
        this.f3190a = i10;
        this.f3191b = iArr;
        this.f3192c = objArr;
        this.f3193e = z;
    }

    public final void a(int i10, Object obj) {
        if (this.f3193e) {
            int i11 = this.f3190a;
            int[] iArr = this.f3191b;
            if (i11 == iArr.length) {
                int i12 = i11 + (i11 < 4 ? 8 : i11 >> 1);
                this.f3191b = Arrays.copyOf(iArr, i12);
                this.f3192c = Arrays.copyOf(this.f3192c, i12);
            }
            int[] iArr2 = this.f3191b;
            int i13 = this.f3190a;
            iArr2[i13] = i10;
            this.f3192c[i13] = obj;
            this.f3190a = i13 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final void b(b1 b1Var) {
        if (this.f3190a != 0) {
            b1Var.getClass();
            for (int i10 = 0; i10 < this.f3190a; i10++) {
                int i11 = this.f3191b[i10];
                Object obj = this.f3192c[i10];
                int i12 = i11 >>> 3;
                int i13 = i11 & 7;
                if (i13 == 0) {
                    b1Var.d(i12, ((Long) obj).longValue());
                } else if (i13 == 1) {
                    b1Var.o(i12, ((Long) obj).longValue());
                } else if (i13 == 2) {
                    b1Var.e(i12, (w0) obj);
                } else if (i13 == 3) {
                    a1 a1Var = b1Var.f3058a;
                    a1Var.H(i12, 3);
                    ((y3) obj).b(b1Var);
                    a1Var.H(i12, 4);
                } else if (i13 == 5) {
                    b1Var.n(i12, ((Integer) obj).intValue());
                } else {
                    int i14 = z1.f3195o;
                    throw new RuntimeException(new c2());
                }
            }
        }
    }

    public final int c() {
        int i10;
        int i11 = this.d;
        if (i11 != -1) {
            return i11;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < this.f3190a; i13++) {
            int i14 = this.f3191b[i13];
            int i15 = i14 >>> 3;
            int i16 = i14 & 7;
            if (i16 == 0) {
                i10 = a1.f0(i15, ((Long) this.f3192c[i13]).longValue());
            } else if (i16 == 1) {
                ((Long) this.f3192c[i13]).longValue();
                i10 = a1.l0(i15);
            } else if (i16 == 2) {
                i10 = a1.X(i15, (w0) this.f3192c[i13]);
            } else if (i16 == 3) {
                i12 = ((y3) this.f3192c[i13]).c() + (a1.e0(i15) << 1) + i12;
            } else if (i16 == 5) {
                ((Integer) this.f3192c[i13]).intValue();
                i10 = a1.q0(i15);
            } else {
                int i17 = z1.f3195o;
                throw new IllegalStateException(new c2());
            }
            i12 = i10 + i12;
        }
        this.d = i12;
        return i12;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z10;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof y3)) {
            return false;
        }
        y3 y3Var = (y3) obj;
        int i10 = this.f3190a;
        if (i10 == y3Var.f3190a) {
            int[] iArr = this.f3191b;
            int[] iArr2 = y3Var.f3191b;
            int i11 = 0;
            while (true) {
                if (i11 >= i10) {
                    z = true;
                    break;
                } else if (iArr[i11] != iArr2[i11]) {
                    z = false;
                    break;
                } else {
                    i11++;
                }
            }
            if (z) {
                Object[] objArr = this.f3192c;
                Object[] objArr2 = y3Var.f3192c;
                int i12 = this.f3190a;
                int i13 = 0;
                while (true) {
                    if (i13 >= i12) {
                        z10 = true;
                        break;
                    } else if (!objArr[i13].equals(objArr2[i13])) {
                        z10 = false;
                        break;
                    } else {
                        i13++;
                    }
                }
                return z10;
            }
        }
    }

    public final int hashCode() {
        int i10 = this.f3190a;
        int i11 = (i10 + 527) * 31;
        int[] iArr = this.f3191b;
        int i12 = 17;
        int i13 = 17;
        for (int i14 = 0; i14 < i10; i14++) {
            i13 = (i13 * 31) + iArr[i14];
        }
        int i15 = (i11 + i13) * 31;
        Object[] objArr = this.f3192c;
        int i16 = this.f3190a;
        for (int i17 = 0; i17 < i16; i17++) {
            i12 = (i12 * 31) + objArr[i17].hashCode();
        }
        return i15 + i12;
    }
}
