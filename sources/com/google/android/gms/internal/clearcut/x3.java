package com.google.android.gms.internal.clearcut;

import java.util.Arrays;
import s6.a;

public final class x3 extends o3<x3> implements Cloneable {

    /* renamed from: q  reason: collision with root package name */
    public String[] f2590q;

    /* renamed from: r  reason: collision with root package name */
    public String[] f2591r;

    /* renamed from: s  reason: collision with root package name */
    public int[] f2592s = a.f8808x;

    /* renamed from: t  reason: collision with root package name */
    public long[] f2593t;
    public long[] u;

    public x3() {
        String[] strArr = a.z;
        this.f2590q = strArr;
        this.f2591r = strArr;
        long[] jArr = a.f8809y;
        this.f2593t = jArr;
        this.u = jArr;
        this.f2512p = null;
        this.f2543o = -1;
    }

    public final Object clone() {
        try {
            x3 x3Var = (x3) super.clone();
            String[] strArr = this.f2590q;
            if (strArr != null && strArr.length > 0) {
                x3Var.f2590q = (String[]) strArr.clone();
            }
            String[] strArr2 = this.f2591r;
            if (strArr2 != null && strArr2.length > 0) {
                x3Var.f2591r = (String[]) strArr2.clone();
            }
            int[] iArr = this.f2592s;
            if (iArr != null && iArr.length > 0) {
                x3Var.f2592s = (int[]) iArr.clone();
            }
            long[] jArr = this.f2593t;
            if (jArr != null && jArr.length > 0) {
                x3Var.f2593t = (long[]) jArr.clone();
            }
            long[] jArr2 = this.u;
            if (jArr2 != null && jArr2.length > 0) {
                x3Var.u = (long[]) jArr2.clone();
            }
            return x3Var;
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }

    public final int e() {
        int i10;
        long[] jArr;
        int[] iArr;
        int i11;
        super.e();
        String[] strArr = this.f2590q;
        int i12 = 0;
        if (strArr == null || strArr.length <= 0) {
            i10 = 0;
        } else {
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            while (true) {
                String[] strArr2 = this.f2590q;
                if (i13 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i13];
                if (str != null) {
                    i15++;
                    int a10 = n3.a(str);
                    i14 += n3.o(a10) + a10;
                }
                i13++;
            }
            i10 = (i15 * 1) + i14 + 0;
        }
        String[] strArr3 = this.f2591r;
        if (strArr3 != null && strArr3.length > 0) {
            int i16 = 0;
            int i17 = 0;
            int i18 = 0;
            while (true) {
                String[] strArr4 = this.f2591r;
                if (i16 >= strArr4.length) {
                    break;
                }
                String str2 = strArr4[i16];
                if (str2 != null) {
                    i18++;
                    int a11 = n3.a(str2);
                    i17 += n3.o(a11) + a11;
                }
                i16++;
            }
            i10 = i10 + i17 + (i18 * 1);
        }
        int[] iArr2 = this.f2592s;
        if (iArr2 != null && iArr2.length > 0) {
            int i19 = 0;
            int i20 = 0;
            while (true) {
                iArr = this.f2592s;
                if (i19 >= iArr.length) {
                    break;
                }
                int i21 = iArr[i19];
                if (i21 >= 0) {
                    i11 = n3.o(i21);
                } else {
                    i11 = 10;
                }
                i20 += i11;
                i19++;
            }
            i10 = i10 + i20 + (iArr.length * 1);
        }
        long[] jArr2 = this.f2593t;
        if (jArr2 != null && jArr2.length > 0) {
            int i22 = 0;
            int i23 = 0;
            while (true) {
                jArr = this.f2593t;
                if (i22 >= jArr.length) {
                    break;
                }
                i23 += n3.m(jArr[i22]);
                i22++;
            }
            i10 = i10 + i23 + (jArr.length * 1);
        }
        long[] jArr3 = this.u;
        if (jArr3 == null || jArr3.length <= 0) {
            return i10;
        }
        int i24 = 0;
        while (true) {
            long[] jArr4 = this.u;
            if (i12 >= jArr4.length) {
                return i10 + i24 + (jArr4.length * 1);
            }
            i24 += n3.m(jArr4[i12]);
            i12++;
        }
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z10;
        boolean z11;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof x3)) {
            return false;
        }
        x3 x3Var = (x3) obj;
        if (!r3.a(this.f2590q, x3Var.f2590q) || !r3.a(this.f2591r, x3Var.f2591r)) {
            return false;
        }
        int[] iArr = this.f2592s;
        int[] iArr2 = x3Var.f2592s;
        if (iArr != null && iArr.length != 0) {
            z = Arrays.equals(iArr, iArr2);
        } else if (iArr2 == null || iArr2.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        long[] jArr = this.f2593t;
        long[] jArr2 = x3Var.f2593t;
        if (jArr != null && jArr.length != 0) {
            z10 = Arrays.equals(jArr, jArr2);
        } else if (jArr2 == null || jArr2.length == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return false;
        }
        long[] jArr3 = this.u;
        long[] jArr4 = x3Var.u;
        if (jArr3 != null && jArr3.length != 0) {
            z11 = Arrays.equals(jArr3, jArr4);
        } else if (jArr4 == null || jArr4.length == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            return false;
        }
        p3 p3Var = this.f2512p;
        if (p3Var != null && !p3Var.c()) {
            return this.f2512p.equals(x3Var.f2512p);
        }
        p3 p3Var2 = x3Var.f2512p;
        if (p3Var2 == null || p3Var2.c()) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ s3 h() {
        return (x3) clone();
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12;
        int hashCode = (((((x3.class.getName().hashCode() + 527) * 31) + r3.b(this.f2590q)) * 31) + r3.b(this.f2591r)) * 31;
        int[] iArr = this.f2592s;
        int i13 = 0;
        if (iArr == null || iArr.length == 0) {
            i10 = 0;
        } else {
            i10 = Arrays.hashCode(iArr);
        }
        int i14 = (i10 + hashCode) * 31;
        long[] jArr = this.f2593t;
        if (jArr == null || jArr.length == 0) {
            i11 = 0;
        } else {
            i11 = Arrays.hashCode(jArr);
        }
        int i15 = (i11 + i14) * 31;
        long[] jArr2 = this.u;
        if (jArr2 == null || jArr2.length == 0) {
            i12 = 0;
        } else {
            i12 = Arrays.hashCode(jArr2);
        }
        int i16 = (i12 + i15) * 31;
        p3 p3Var = this.f2512p;
        if (p3Var != null && !p3Var.c()) {
            i13 = this.f2512p.hashCode();
        }
        return i16 + i13;
    }

    public final void i(n3 n3Var) {
        String[] strArr = this.f2590q;
        if (strArr != null && strArr.length > 0) {
            int i10 = 0;
            while (true) {
                String[] strArr2 = this.f2590q;
                if (i10 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i10];
                if (str != null) {
                    n3Var.d(str, 1);
                }
                i10++;
            }
        }
        String[] strArr3 = this.f2591r;
        if (strArr3 != null && strArr3.length > 0) {
            int i11 = 0;
            while (true) {
                String[] strArr4 = this.f2591r;
                if (i11 >= strArr4.length) {
                    break;
                }
                String str2 = strArr4[i11];
                if (str2 != null) {
                    n3Var.d(str2, 2);
                }
                i11++;
            }
        }
        int[] iArr = this.f2592s;
        if (iArr != null && iArr.length > 0) {
            int i12 = 0;
            while (true) {
                int[] iArr2 = this.f2592s;
                if (i12 >= iArr2.length) {
                    break;
                }
                int i13 = iArr2[i12];
                n3Var.i(3, 0);
                if (i13 >= 0) {
                    n3Var.f(i13);
                } else {
                    n3Var.l((long) i13);
                }
                i12++;
            }
        }
        long[] jArr = this.f2593t;
        if (jArr != null && jArr.length > 0) {
            int i14 = 0;
            while (true) {
                long[] jArr2 = this.f2593t;
                if (i14 >= jArr2.length) {
                    break;
                }
                long j8 = jArr2[i14];
                n3Var.i(4, 0);
                n3Var.l(j8);
                i14++;
            }
        }
        long[] jArr3 = this.u;
        if (jArr3 != null && jArr3.length > 0) {
            int i15 = 0;
            while (true) {
                long[] jArr4 = this.u;
                if (i15 >= jArr4.length) {
                    break;
                }
                long j10 = jArr4[i15];
                n3Var.i(5, 0);
                n3Var.l(j10);
                i15++;
            }
        }
        super.i(n3Var);
    }

    public final /* synthetic */ o3 j() {
        return (x3) clone();
    }
}
