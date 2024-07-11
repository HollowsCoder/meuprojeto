package com.google.android.gms.internal.clearcut;

import com.karumi.dexter.BuildConfig;
import java.nio.ByteBuffer;
import java.util.Arrays;
import q2.e;
import s6.a;

public final class a4 extends o3<a4> implements Cloneable {
    public x3 A;
    public final String B;
    public long C;
    public y3 D;
    public byte[] E;
    public final String F;
    public int[] G;
    public boolean H;

    /* renamed from: q  reason: collision with root package name */
    public long f2373q = 0;

    /* renamed from: r  reason: collision with root package name */
    public long f2374r = 0;

    /* renamed from: s  reason: collision with root package name */
    public final String f2375s = BuildConfig.FLAVOR;

    /* renamed from: t  reason: collision with root package name */
    public int f2376t = 0;
    public final String u = BuildConfig.FLAVOR;

    /* renamed from: v  reason: collision with root package name */
    public b4[] f2377v;
    public final byte[] w;

    /* renamed from: x  reason: collision with root package name */
    public byte[] f2378x;

    /* renamed from: y  reason: collision with root package name */
    public final String f2379y;
    public final String z;

    public a4() {
        if (b4.f2391s == null) {
            synchronized (r3.f2540a) {
                if (b4.f2391s == null) {
                    b4.f2391s = new b4[0];
                }
            }
        }
        this.f2377v = b4.f2391s;
        byte[] bArr = a.B;
        this.w = bArr;
        this.f2378x = bArr;
        this.f2379y = BuildConfig.FLAVOR;
        this.z = BuildConfig.FLAVOR;
        this.A = null;
        this.B = BuildConfig.FLAVOR;
        this.C = 180000;
        this.D = null;
        this.E = bArr;
        this.F = BuildConfig.FLAVOR;
        this.G = a.f8808x;
        this.H = false;
        this.f2512p = null;
        this.f2543o = -1;
    }

    public final Object clone() {
        try {
            a4 a4Var = (a4) super.clone();
            b4[] b4VarArr = this.f2377v;
            if (b4VarArr != null && b4VarArr.length > 0) {
                a4Var.f2377v = new b4[b4VarArr.length];
                int i10 = 0;
                while (true) {
                    b4[] b4VarArr2 = this.f2377v;
                    if (i10 >= b4VarArr2.length) {
                        break;
                    }
                    b4 b4Var = b4VarArr2[i10];
                    if (b4Var != null) {
                        a4Var.f2377v[i10] = (b4) b4Var.clone();
                    }
                    i10++;
                }
            }
            x3 x3Var = this.A;
            if (x3Var != null) {
                a4Var.A = (x3) x3Var.clone();
            }
            y3 y3Var = this.D;
            if (y3Var != null) {
                a4Var.D = (y3) y3Var.clone();
            }
            int[] iArr = this.G;
            if (iArr != null && iArr.length > 0) {
                a4Var.G = (int[]) iArr.clone();
            }
            return a4Var;
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }

    public final int e() {
        int i10;
        int[] iArr;
        int i11;
        int i12;
        super.e();
        long j8 = this.f2373q;
        int i13 = 0;
        if (j8 != 0) {
            i10 = n3.m(j8) + n3.n(1) + 0;
        } else {
            i10 = 0;
        }
        String str = this.f2375s;
        if (str != null && !str.equals(BuildConfig.FLAVOR)) {
            i10 += n3.h(str, 2);
        }
        b4[] b4VarArr = this.f2377v;
        if (b4VarArr != null && b4VarArr.length > 0) {
            int i14 = 0;
            while (true) {
                b4[] b4VarArr2 = this.f2377v;
                if (i14 >= b4VarArr2.length) {
                    break;
                }
                b4 b4Var = b4VarArr2[i14];
                if (b4Var != null) {
                    int n10 = n3.n(3);
                    int d = b4Var.d();
                    i10 += n3.o(d) + d + n10;
                }
                i14++;
            }
        }
        byte[] bArr = a.B;
        byte[] bArr2 = this.w;
        if (!Arrays.equals(bArr2, bArr)) {
            i10 += n3.g(4, bArr2);
        }
        if (!Arrays.equals(this.f2378x, bArr)) {
            i10 += n3.g(6, this.f2378x);
        }
        x3 x3Var = this.A;
        if (x3Var != null) {
            int n11 = n3.n(7);
            int d10 = x3Var.d();
            i10 += n3.o(d10) + d10 + n11;
        }
        String str2 = this.f2379y;
        if (str2 != null && !str2.equals(BuildConfig.FLAVOR)) {
            i10 += n3.h(str2, 8);
        }
        int i15 = this.f2376t;
        if (i15 != 0) {
            int n12 = n3.n(11);
            if (i15 >= 0) {
                i12 = n3.o(i15);
            } else {
                i12 = 10;
            }
            i10 += i12 + n12;
        }
        String str3 = this.z;
        if (str3 != null && !str3.equals(BuildConfig.FLAVOR)) {
            i10 += n3.h(str3, 13);
        }
        String str4 = this.B;
        if (str4 != null && !str4.equals(BuildConfig.FLAVOR)) {
            i10 += n3.h(str4, 14);
        }
        long j10 = this.C;
        if (j10 != 180000) {
            i10 += n3.m((j10 >> 63) ^ (j10 << 1)) + n3.n(15);
        }
        y3 y3Var = this.D;
        if (y3Var != null) {
            int n13 = n3.n(16);
            int d11 = y3Var.d();
            i10 += n3.o(d11) + d11 + n13;
        }
        long j11 = this.f2374r;
        if (j11 != 0) {
            i10 += n3.m(j11) + n3.n(17);
        }
        if (!Arrays.equals(this.E, bArr)) {
            i10 += n3.g(18, this.E);
        }
        int[] iArr2 = this.G;
        if (iArr2 != null && iArr2.length > 0) {
            int i16 = 0;
            while (true) {
                iArr = this.G;
                if (i13 >= iArr.length) {
                    break;
                }
                int i17 = iArr[i13];
                if (i17 >= 0) {
                    i11 = n3.o(i17);
                } else {
                    i11 = 10;
                }
                i16 += i11;
                i13++;
            }
            i10 = i10 + i16 + (iArr.length * 2);
        }
        String str5 = this.F;
        if (str5 != null && !str5.equals(BuildConfig.FLAVOR)) {
            i10 += n3.h(str5, 24);
        }
        if (this.H) {
            i10 += n3.n(25) + 1;
        }
        String str6 = this.u;
        if (str6 == null || str6.equals(BuildConfig.FLAVOR)) {
            return i10;
        }
        return i10 + n3.h(str6, 26);
    }

    public final boolean equals(Object obj) {
        boolean z10;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a4)) {
            return false;
        }
        a4 a4Var = (a4) obj;
        if (this.f2373q != a4Var.f2373q || this.f2374r != a4Var.f2374r) {
            return false;
        }
        String str = a4Var.f2375s;
        String str2 = this.f2375s;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        if (this.f2376t != a4Var.f2376t) {
            return false;
        }
        String str3 = a4Var.u;
        String str4 = this.u;
        if (str4 == null) {
            if (str3 != null) {
                return false;
            }
        } else if (!str4.equals(str3)) {
            return false;
        }
        if (!r3.a(this.f2377v, a4Var.f2377v) || !Arrays.equals(this.w, a4Var.w)) {
            return false;
        }
        a4Var.getClass();
        if (!Arrays.equals(this.f2378x, a4Var.f2378x)) {
            return false;
        }
        String str5 = a4Var.f2379y;
        String str6 = this.f2379y;
        if (str6 == null) {
            if (str5 != null) {
                return false;
            }
        } else if (!str6.equals(str5)) {
            return false;
        }
        String str7 = a4Var.z;
        String str8 = this.z;
        if (str8 == null) {
            if (str7 != null) {
                return false;
            }
        } else if (!str8.equals(str7)) {
            return false;
        }
        x3 x3Var = this.A;
        if (x3Var == null) {
            if (a4Var.A != null) {
                return false;
            }
        } else if (!x3Var.equals(a4Var.A)) {
            return false;
        }
        String str9 = a4Var.B;
        String str10 = this.B;
        if (str10 == null) {
            if (str9 != null) {
                return false;
            }
        } else if (!str10.equals(str9)) {
            return false;
        }
        if (this.C != a4Var.C) {
            return false;
        }
        y3 y3Var = this.D;
        if (y3Var == null) {
            if (a4Var.D != null) {
                return false;
            }
        } else if (!y3Var.equals(a4Var.D)) {
            return false;
        }
        if (!Arrays.equals(this.E, a4Var.E)) {
            return false;
        }
        String str11 = a4Var.F;
        String str12 = this.F;
        if (str12 == null) {
            if (str11 != null) {
                return false;
            }
        } else if (!str12.equals(str11)) {
            return false;
        }
        int[] iArr = this.G;
        int[] iArr2 = a4Var.G;
        if (iArr != null && iArr.length != 0) {
            z10 = Arrays.equals(iArr, iArr2);
        } else if (iArr2 == null || iArr2.length == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return false;
        }
        a4Var.getClass();
        if (this.H != a4Var.H) {
            return false;
        }
        p3 p3Var = this.f2512p;
        if (p3Var != null && !p3Var.c()) {
            return this.f2512p.equals(a4Var.f2512p);
        }
        p3 p3Var2 = a4Var.f2512p;
        if (p3Var2 == null || p3Var2.c()) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ s3 h() {
        return (a4) clone();
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        long j8 = this.f2373q;
        long j10 = this.f2374r;
        int hashCode = (((((a4.class.getName().hashCode() + 527) * 31) + ((int) (j8 ^ (j8 >>> 32)))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31 * 31;
        int i19 = 0;
        String str = this.f2375s;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int i20 = (((hashCode + i10) * 31) + this.f2376t) * 31;
        String str2 = this.u;
        if (str2 == null) {
            i11 = 0;
        } else {
            i11 = str2.hashCode();
        }
        int i21 = 1237;
        int hashCode2 = (Arrays.hashCode(this.f2378x) + ((((Arrays.hashCode(this.w) + ((((((i20 + i11) * 31 * 31) + 1237) * 31) + r3.b(this.f2377v)) * 31)) * 31) + 0) * 31)) * 31;
        String str3 = this.f2379y;
        if (str3 == null) {
            i12 = 0;
        } else {
            i12 = str3.hashCode();
        }
        int i22 = (hashCode2 + i12) * 31;
        String str4 = this.z;
        if (str4 == null) {
            i13 = 0;
        } else {
            i13 = str4.hashCode();
        }
        int i23 = i22 + i13;
        x3 x3Var = this.A;
        int i24 = i23 * 31;
        if (x3Var == null) {
            i14 = 0;
        } else {
            i14 = x3Var.hashCode();
        }
        int i25 = (i24 + i14) * 31;
        String str5 = this.B;
        if (str5 == null) {
            i15 = 0;
        } else {
            i15 = str5.hashCode();
        }
        long j11 = this.C;
        y3 y3Var = this.D;
        int i26 = (((i25 + i15) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        if (y3Var == null) {
            i16 = 0;
        } else {
            i16 = y3Var.hashCode();
        }
        int hashCode3 = (Arrays.hashCode(this.E) + ((i26 + i16) * 31)) * 31;
        String str6 = this.F;
        if (str6 == null) {
            i17 = 0;
        } else {
            i17 = str6.hashCode();
        }
        int i27 = (hashCode3 + i17) * 31 * 31;
        int[] iArr = this.G;
        if (iArr == null || iArr.length == 0) {
            i18 = 0;
        } else {
            i18 = Arrays.hashCode(iArr);
        }
        int i28 = (((i18 + i27) * 31 * 31) + 0) * 31;
        if (this.H) {
            i21 = 1231;
        }
        int i29 = (i28 + i21) * 31;
        p3 p3Var = this.f2512p;
        if (p3Var != null && !p3Var.c()) {
            i19 = this.f2512p.hashCode();
        }
        return i29 + i19;
    }

    public final void i(n3 n3Var) {
        long j8 = this.f2373q;
        if (j8 != 0) {
            n3Var.i(1, 0);
            n3Var.l(j8);
        }
        String str = this.f2375s;
        if (str != null && !str.equals(BuildConfig.FLAVOR)) {
            n3Var.d(str, 2);
        }
        b4[] b4VarArr = this.f2377v;
        if (b4VarArr != null && b4VarArr.length > 0) {
            int i10 = 0;
            while (true) {
                b4[] b4VarArr2 = this.f2377v;
                if (i10 >= b4VarArr2.length) {
                    break;
                }
                b4 b4Var = b4VarArr2[i10];
                if (b4Var != null) {
                    n3Var.b(3, b4Var);
                }
                i10++;
            }
        }
        byte[] bArr = a.B;
        byte[] bArr2 = this.w;
        if (!Arrays.equals(bArr2, bArr)) {
            n3Var.c(4, bArr2);
        }
        if (!Arrays.equals(this.f2378x, bArr)) {
            n3Var.c(6, this.f2378x);
        }
        x3 x3Var = this.A;
        if (x3Var != null) {
            n3Var.b(7, x3Var);
        }
        String str2 = this.f2379y;
        if (str2 != null && !str2.equals(BuildConfig.FLAVOR)) {
            n3Var.d(str2, 8);
        }
        int i11 = this.f2376t;
        if (i11 != 0) {
            n3Var.i(11, 0);
            if (i11 >= 0) {
                n3Var.f(i11);
            } else {
                n3Var.l((long) i11);
            }
        }
        String str3 = this.z;
        if (str3 != null && !str3.equals(BuildConfig.FLAVOR)) {
            n3Var.d(str3, 13);
        }
        String str4 = this.B;
        if (str4 != null && !str4.equals(BuildConfig.FLAVOR)) {
            n3Var.d(str4, 14);
        }
        long j10 = this.C;
        if (j10 != 180000) {
            n3Var.i(15, 0);
            n3Var.l((j10 << 1) ^ (j10 >> 63));
        }
        y3 y3Var = this.D;
        if (y3Var != null) {
            n3Var.b(16, y3Var);
        }
        long j11 = this.f2374r;
        if (j11 != 0) {
            n3Var.i(17, 0);
            n3Var.l(j11);
        }
        if (!Arrays.equals(this.E, bArr)) {
            n3Var.c(18, this.E);
        }
        int[] iArr = this.G;
        if (iArr != null && iArr.length > 0) {
            int i12 = 0;
            while (true) {
                int[] iArr2 = this.G;
                if (i12 >= iArr2.length) {
                    break;
                }
                int i13 = iArr2[i12];
                n3Var.i(20, 0);
                if (i13 >= 0) {
                    n3Var.f(i13);
                } else {
                    n3Var.l((long) i13);
                }
                i12++;
            }
        }
        String str5 = this.F;
        if (str5 != null && !str5.equals(BuildConfig.FLAVOR)) {
            n3Var.d(str5, 24);
        }
        boolean z10 = this.H;
        if (z10) {
            n3Var.i(25, 0);
            byte b10 = z10 ? (byte) 1 : 0;
            ByteBuffer byteBuffer = n3Var.f2506a;
            if (byteBuffer.hasRemaining()) {
                byteBuffer.put(b10);
            } else {
                throw new e(byteBuffer.position(), byteBuffer.limit());
            }
        }
        String str6 = this.u;
        if (str6 != null && !str6.equals(BuildConfig.FLAVOR)) {
            n3Var.d(str6, 26);
        }
        super.i(n3Var);
    }

    public final /* synthetic */ o3 j() {
        return (a4) clone();
    }
}
