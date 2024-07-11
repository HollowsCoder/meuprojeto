package com.google.android.gms.internal.measurement;

import java.util.Arrays;

public final class f8 {

    /* renamed from: f  reason: collision with root package name */
    public static final f8 f2700f = new f8(0, new int[0], new Object[0], false);

    /* renamed from: a  reason: collision with root package name */
    public int f2701a;

    /* renamed from: b  reason: collision with root package name */
    public int[] f2702b;

    /* renamed from: c  reason: collision with root package name */
    public Object[] f2703c;
    public int d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f2704e;

    public f8() {
        this(0, new int[8], new Object[8], true);
    }

    public f8(int i10, int[] iArr, Object[] objArr, boolean z) {
        this.d = -1;
        this.f2701a = i10;
        this.f2702b = iArr;
        this.f2703c = objArr;
        this.f2704e = z;
    }

    public static f8 a() {
        return new f8(0, new int[8], new Object[8], true);
    }

    public final int b() {
        int i10;
        int i11;
        int i12;
        int i13 = this.d;
        if (i13 != -1) {
            return i13;
        }
        int i14 = 0;
        for (int i15 = 0; i15 < this.f2701a; i15++) {
            int i16 = this.f2702b[i15];
            int i17 = i16 >>> 3;
            int i18 = i16 & 7;
            if (i18 != 0) {
                if (i18 == 1) {
                    ((Long) this.f2703c[i15]).longValue();
                    i12 = n5.Z0(i17 << 3) + 8;
                } else if (i18 == 2) {
                    int Z0 = n5.Z0(i17 << 3);
                    int i19 = ((k5) this.f2703c[i15]).i();
                    i14 = n5.Z0(i19) + i19 + Z0 + i14;
                } else if (i18 == 3) {
                    int X0 = n5.X0(i17);
                    i11 = X0 + X0;
                    i10 = ((f8) this.f2703c[i15]).b();
                } else if (i18 == 5) {
                    ((Integer) this.f2703c[i15]).intValue();
                    i12 = n5.Z0(i17 << 3) + 4;
                } else {
                    int i20 = p6.f2880o;
                    throw new IllegalStateException(new o6());
                }
                i14 = i12 + i14;
            } else {
                long longValue = ((Long) this.f2703c[i15]).longValue();
                i11 = n5.Z0(i17 << 3);
                i10 = n5.a1(longValue);
            }
            i14 = i10 + i11 + i14;
        }
        this.d = i14;
        return i14;
    }

    public final void c(int i10, Object obj) {
        if (this.f2704e) {
            int i11 = this.f2701a;
            int[] iArr = this.f2702b;
            if (i11 == iArr.length) {
                int i12 = i11 + (i11 < 4 ? 8 : i11 >> 1);
                this.f2702b = Arrays.copyOf(iArr, i12);
                this.f2703c = Arrays.copyOf(this.f2703c, i12);
            }
            int[] iArr2 = this.f2702b;
            int i13 = this.f2701a;
            iArr2[i13] = i10;
            this.f2703c[i13] = obj;
            this.f2701a = i13 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final void d(o5 o5Var) {
        if (this.f2701a != 0) {
            for (int i10 = 0; i10 < this.f2701a; i10++) {
                int i11 = this.f2702b[i10];
                Object obj = this.f2703c[i10];
                int i12 = i11 >>> 3;
                int i13 = i11 & 7;
                if (i13 == 0) {
                    o5Var.b(i12, ((Long) obj).longValue());
                } else if (i13 == 1) {
                    o5Var.i(i12, ((Long) obj).longValue());
                } else if (i13 == 2) {
                    o5Var.l(i12, (k5) obj);
                } else if (i13 == 3) {
                    o5Var.f2859a.I0(i12, 3);
                    ((f8) obj).d(o5Var);
                    o5Var.f2859a.I0(i12, 4);
                } else if (i13 == 5) {
                    o5Var.j(i12, ((Integer) obj).intValue());
                } else {
                    int i14 = p6.f2880o;
                    throw new RuntimeException(new o6());
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof f8)) {
            return false;
        }
        f8 f8Var = (f8) obj;
        int i10 = this.f2701a;
        if (i10 == f8Var.f2701a) {
            int[] iArr = this.f2702b;
            int[] iArr2 = f8Var.f2702b;
            int i11 = 0;
            while (true) {
                if (i11 >= i10) {
                    Object[] objArr = this.f2703c;
                    Object[] objArr2 = f8Var.f2703c;
                    int i12 = this.f2701a;
                    int i13 = 0;
                    while (i13 < i12) {
                        if (objArr[i13].equals(objArr2[i13])) {
                            i13++;
                        }
                    }
                    return true;
                } else if (iArr[i11] != iArr2[i11]) {
                    break;
                } else {
                    i11++;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f2701a;
        int i11 = (i10 + 527) * 31;
        int[] iArr = this.f2702b;
        int i12 = 17;
        int i13 = 17;
        for (int i14 = 0; i14 < i10; i14++) {
            i13 = (i13 * 31) + iArr[i14];
        }
        int i15 = (i11 + i13) * 31;
        Object[] objArr = this.f2703c;
        int i16 = this.f2701a;
        for (int i17 = 0; i17 < i16; i17++) {
            i12 = (i12 * 31) + objArr[i17].hashCode();
        }
        return i15 + i12;
    }
}
