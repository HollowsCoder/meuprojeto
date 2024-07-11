package com.google.android.gms.internal.clearcut;

import com.karumi.dexter.BuildConfig;
import java.util.Arrays;
import s6.a;

public final class y3 extends o3<y3> implements Cloneable {

    /* renamed from: q  reason: collision with root package name */
    public final byte[] f2597q = a.B;

    /* renamed from: r  reason: collision with root package name */
    public final String f2598r = BuildConfig.FLAVOR;

    /* renamed from: s  reason: collision with root package name */
    public byte[][] f2599s = a.A;

    public y3() {
        this.f2512p = null;
        this.f2543o = -1;
    }

    public final Object clone() {
        try {
            y3 y3Var = (y3) super.clone();
            byte[][] bArr = this.f2599s;
            if (bArr != null && bArr.length > 0) {
                y3Var.f2599s = (byte[][]) bArr.clone();
            }
            return y3Var;
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }

    public final int e() {
        int i10;
        super.e();
        byte[] bArr = a.B;
        byte[] bArr2 = this.f2597q;
        int i11 = 0;
        if (!Arrays.equals(bArr2, bArr)) {
            i10 = n3.g(1, bArr2) + 0;
        } else {
            i10 = 0;
        }
        byte[][] bArr3 = this.f2599s;
        if (bArr3 != null && bArr3.length > 0) {
            int i12 = 0;
            int i13 = 0;
            while (true) {
                byte[][] bArr4 = this.f2599s;
                if (i11 >= bArr4.length) {
                    break;
                }
                byte[] bArr5 = bArr4[i11];
                if (bArr5 != null) {
                    i13++;
                    i12 = n3.o(bArr5.length) + bArr5.length + i12;
                }
                i11++;
            }
            i10 = i10 + i12 + (i13 * 1);
        }
        String str = this.f2598r;
        if (str == null || str.equals(BuildConfig.FLAVOR)) {
            return i10;
        }
        return i10 + n3.h(str, 4);
    }

    public final boolean equals(Object obj) {
        int i10;
        int i11;
        boolean z;
        boolean z10;
        boolean z11;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof y3)) {
            return false;
        }
        y3 y3Var = (y3) obj;
        if (!Arrays.equals(this.f2597q, y3Var.f2597q)) {
            return false;
        }
        String str = y3Var.f2598r;
        String str2 = this.f2598r;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        byte[][] bArr = this.f2599s;
        byte[][] bArr2 = y3Var.f2599s;
        Object obj2 = r3.f2540a;
        if (bArr == null) {
            i10 = 0;
        } else {
            i10 = bArr.length;
        }
        if (bArr2 == null) {
            i11 = 0;
        } else {
            i11 = bArr2.length;
        }
        int i12 = 0;
        int i13 = 0;
        while (true) {
            if (i12 >= i10 || bArr[i12] != null) {
                while (i13 < i11 && bArr2[i13] == null) {
                    i13++;
                }
                if (i12 >= i10) {
                    z = true;
                } else {
                    z = false;
                }
                if (i13 >= i11) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z && z10) {
                    z11 = true;
                    break;
                } else if (z == z10 && Arrays.equals(bArr[i12], bArr2[i13])) {
                    i12++;
                    i13++;
                }
            } else {
                i12++;
            }
        }
        z11 = false;
        if (!z11) {
            return false;
        }
        p3 p3Var = this.f2512p;
        if (p3Var != null && !p3Var.c()) {
            return this.f2512p.equals(y3Var.f2512p);
        }
        p3 p3Var2 = y3Var.f2512p;
        if (p3Var2 == null || p3Var2.c()) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ s3 h() {
        return (y3) clone();
    }

    public final int hashCode() {
        int i10;
        int i11;
        int hashCode = (Arrays.hashCode(this.f2597q) + ((y3.class.getName().hashCode() + 527) * 31)) * 31;
        int i12 = 0;
        String str = this.f2598r;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int i13 = (hashCode + i10) * 31;
        byte[][] bArr = this.f2599s;
        Object obj = r3.f2540a;
        if (bArr == null) {
            i11 = 0;
        } else {
            i11 = bArr.length;
        }
        int i14 = 0;
        for (int i15 = 0; i15 < i11; i15++) {
            byte[] bArr2 = bArr[i15];
            if (bArr2 != null) {
                i14 = (i14 * 31) + Arrays.hashCode(bArr2);
            }
        }
        int i16 = (((i13 + i14) * 31) + 1237) * 31;
        p3 p3Var = this.f2512p;
        if (p3Var != null && !p3Var.c()) {
            i12 = this.f2512p.hashCode();
        }
        return i16 + i12;
    }

    public final void i(n3 n3Var) {
        byte[] bArr = a.B;
        byte[] bArr2 = this.f2597q;
        if (!Arrays.equals(bArr2, bArr)) {
            n3Var.c(1, bArr2);
        }
        byte[][] bArr3 = this.f2599s;
        if (bArr3 != null && bArr3.length > 0) {
            int i10 = 0;
            while (true) {
                byte[][] bArr4 = this.f2599s;
                if (i10 >= bArr4.length) {
                    break;
                }
                byte[] bArr5 = bArr4[i10];
                if (bArr5 != null) {
                    n3Var.c(2, bArr5);
                }
                i10++;
            }
        }
        String str = this.f2598r;
        if (str != null && !str.equals(BuildConfig.FLAVOR)) {
            n3Var.d(str, 4);
        }
        super.i(n3Var);
    }

    public final /* synthetic */ o3 j() {
        return (y3) clone();
    }
}
