package com.google.android.gms.internal.clearcut;

import java.util.Arrays;

public final class v2 {

    /* renamed from: f  reason: collision with root package name */
    public static final v2 f2566f = new v2(0, new int[0], new Object[0], false);

    /* renamed from: a  reason: collision with root package name */
    public int f2567a;

    /* renamed from: b  reason: collision with root package name */
    public int[] f2568b;

    /* renamed from: c  reason: collision with root package name */
    public Object[] f2569c;
    public int d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f2570e;

    public v2() {
        this(0, new int[8], new Object[8], true);
    }

    public v2(int i10, int[] iArr, Object[] objArr, boolean z) {
        this.d = -1;
        this.f2567a = i10;
        this.f2568b = iArr;
        this.f2569c = objArr;
        this.f2570e = z;
    }

    public final int a() {
        int i10;
        int i11 = this.d;
        if (i11 != -1) {
            return i11;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < this.f2567a; i13++) {
            int i14 = this.f2568b[i13];
            int i15 = i14 >>> 3;
            int i16 = i14 & 7;
            if (i16 == 0) {
                i10 = x.f0(i15, ((Long) this.f2569c[i13]).longValue());
            } else if (i16 == 1) {
                ((Long) this.f2569c[i13]).longValue();
                i10 = x.j0(i15);
            } else if (i16 == 2) {
                i10 = x.Y(i15, (u) this.f2569c[i13]);
            } else if (i16 == 3) {
                i12 = ((v2) this.f2569c[i13]).a() + (x.v0(i15) << 1) + i12;
            } else if (i16 == 5) {
                ((Integer) this.f2569c[i13]).intValue();
                i10 = x.p0(i15);
            } else {
                int i17 = v0.f2550o;
                throw new IllegalStateException(new w0());
            }
            i12 = i10 + i12;
        }
        this.d = i12;
        return i12;
    }

    public final void b(y yVar) {
        if (this.f2567a != 0) {
            yVar.getClass();
            for (int i10 = 0; i10 < this.f2567a; i10++) {
                int i11 = this.f2568b[i10];
                Object obj = this.f2569c[i10];
                int i12 = i11 >>> 3;
                int i13 = i11 & 7;
                if (i13 == 0) {
                    yVar.o(i12, ((Long) obj).longValue());
                } else if (i13 == 1) {
                    yVar.k(i12, ((Long) obj).longValue());
                } else if (i13 == 2) {
                    yVar.d(i12, (u) obj);
                } else if (i13 == 3) {
                    x xVar = yVar.f2594a;
                    xVar.R(i12, 3);
                    ((v2) obj).b(yVar);
                    xVar.R(i12, 4);
                } else if (i13 == 5) {
                    yVar.n(i12, ((Integer) obj).intValue());
                } else {
                    int i14 = v0.f2550o;
                    throw new RuntimeException(new w0());
                }
            }
        }
    }

    public final void c(int i10, Object obj) {
        if (this.f2570e) {
            int i11 = this.f2567a;
            int[] iArr = this.f2568b;
            if (i11 == iArr.length) {
                int i12 = i11 + (i11 < 4 ? 8 : i11 >> 1);
                this.f2568b = Arrays.copyOf(iArr, i12);
                this.f2569c = Arrays.copyOf(this.f2569c, i12);
            }
            int[] iArr2 = this.f2568b;
            int i13 = this.f2567a;
            iArr2[i13] = i10;
            this.f2569c[i13] = obj;
            this.f2567a = i13 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z10;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof v2)) {
            return false;
        }
        v2 v2Var = (v2) obj;
        int i10 = this.f2567a;
        if (i10 == v2Var.f2567a) {
            int[] iArr = this.f2568b;
            int[] iArr2 = v2Var.f2568b;
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
                Object[] objArr = this.f2569c;
                Object[] objArr2 = v2Var.f2569c;
                int i12 = this.f2567a;
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
        int i10 = this.f2567a;
        int i11 = (i10 + 527) * 31;
        int[] iArr = this.f2568b;
        int i12 = 17;
        int i13 = 17;
        for (int i14 = 0; i14 < i10; i14++) {
            i13 = (i13 * 31) + iArr[i14];
        }
        int i15 = (i11 + i13) * 31;
        Object[] objArr = this.f2569c;
        int i16 = this.f2567a;
        for (int i17 = 0; i17 < i16; i17++) {
            i12 = (i12 * 31) + objArr[i17].hashCode();
        }
        return i15 + i12;
    }
}
