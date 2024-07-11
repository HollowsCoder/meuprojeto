package com.google.android.gms.internal.clearcut;

import com.karumi.dexter.BuildConfig;

public final class b4 extends o3<b4> implements Cloneable {

    /* renamed from: s  reason: collision with root package name */
    public static volatile b4[] f2391s;

    /* renamed from: q  reason: collision with root package name */
    public final String f2392q = BuildConfig.FLAVOR;

    /* renamed from: r  reason: collision with root package name */
    public final String f2393r = BuildConfig.FLAVOR;

    public b4() {
        this.f2512p = null;
        this.f2543o = -1;
    }

    public final Object clone() {
        try {
            return (b4) super.clone();
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }

    public final int e() {
        super.e();
        int i10 = 0;
        String str = this.f2392q;
        if (str != null && !str.equals(BuildConfig.FLAVOR)) {
            i10 = 0 + n3.h(str, 1);
        }
        String str2 = this.f2393r;
        return (str2 == null || str2.equals(BuildConfig.FLAVOR)) ? i10 : i10 + n3.h(str2, 2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b4)) {
            return false;
        }
        b4 b4Var = (b4) obj;
        String str = this.f2392q;
        if (str == null) {
            if (b4Var.f2392q != null) {
                return false;
            }
        } else if (!str.equals(b4Var.f2392q)) {
            return false;
        }
        String str2 = this.f2393r;
        if (str2 == null) {
            if (b4Var.f2393r != null) {
                return false;
            }
        } else if (!str2.equals(b4Var.f2393r)) {
            return false;
        }
        p3 p3Var = this.f2512p;
        if (p3Var != null && !p3Var.c()) {
            return this.f2512p.equals(b4Var.f2512p);
        }
        p3 p3Var2 = b4Var.f2512p;
        return p3Var2 == null || p3Var2.c();
    }

    public final /* synthetic */ s3 h() {
        return (b4) clone();
    }

    public final int hashCode() {
        int hashCode = (b4.class.getName().hashCode() + 527) * 31;
        int i10 = 0;
        String str = this.f2392q;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f2393r;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        p3 p3Var = this.f2512p;
        if (p3Var != null && !p3Var.c()) {
            i10 = this.f2512p.hashCode();
        }
        return hashCode3 + i10;
    }

    public final void i(n3 n3Var) {
        String str = this.f2392q;
        if (str != null && !str.equals(BuildConfig.FLAVOR)) {
            n3Var.d(str, 1);
        }
        String str2 = this.f2393r;
        if (str2 != null && !str2.equals(BuildConfig.FLAVOR)) {
            n3Var.d(str2, 2);
        }
        super.i(n3Var);
    }

    public final /* synthetic */ o3 j() {
        return (b4) clone();
    }
}
