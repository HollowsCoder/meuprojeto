package com.google.android.gms.internal.clearcut;

public final class p3 implements Cloneable {

    /* renamed from: o  reason: collision with root package name */
    public final int[] f2521o;

    /* renamed from: p  reason: collision with root package name */
    public final q3[] f2522p;

    /* renamed from: q  reason: collision with root package name */
    public int f2523q;

    static {
        new q3();
    }

    public p3() {
        this(10);
    }

    public p3(int i10) {
        int i11 = i10 << 2;
        int i12 = 4;
        while (true) {
            if (i12 >= 32) {
                break;
            }
            int i13 = (1 << i12) - 12;
            if (i11 <= i13) {
                i11 = i13;
                break;
            }
            i12++;
        }
        int i14 = i11 / 4;
        this.f2521o = new int[i14];
        this.f2522p = new q3[i14];
        this.f2523q = 0;
    }

    public final boolean c() {
        return this.f2523q == 0;
    }

    public final /* synthetic */ Object clone() {
        int i10 = this.f2523q;
        p3 p3Var = new p3(i10);
        System.arraycopy(this.f2521o, 0, p3Var.f2521o, 0, i10);
        for (int i11 = 0; i11 < i10; i11++) {
            q3 q3Var = this.f2522p[i11];
            if (q3Var != null) {
                p3Var.f2522p[i11] = q3Var.clone();
            }
        }
        p3Var.f2523q = i10;
        return p3Var;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z10;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p3)) {
            return false;
        }
        p3 p3Var = (p3) obj;
        int i10 = this.f2523q;
        if (i10 != p3Var.f2523q) {
            return false;
        }
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                z = true;
                break;
            } else if (this.f2521o[i11] != p3Var.f2521o[i11]) {
                z = false;
                break;
            } else {
                i11++;
            }
        }
        if (z) {
            int i12 = this.f2523q;
            int i13 = 0;
            while (true) {
                if (i13 >= i12) {
                    z10 = true;
                    break;
                } else if (!this.f2522p[i13].equals(p3Var.f2522p[i13])) {
                    z10 = false;
                    break;
                } else {
                    i13++;
                }
            }
            if (z10) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = 17;
        for (int i11 = 0; i11 < this.f2523q; i11++) {
            i10 = (((i10 * 31) + this.f2521o[i11]) * 31) + this.f2522p[i11].hashCode();
        }
        return i10;
    }
}
