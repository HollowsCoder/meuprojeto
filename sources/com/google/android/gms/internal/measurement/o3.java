package com.google.android.gms.internal.measurement;

import java.util.List;

public final class o3 extends f6<o3, n3> implements j7 {
    /* access modifiers changed from: private */
    public static final o3 zzg;
    private int zza;
    private int zze;
    private l6 zzf = x6.f2988r;

    static {
        o3 o3Var = new o3();
        zzg = o3Var;
        f6.p(o3.class, o3Var);
    }

    public static n3 w() {
        return (n3) zzg.m();
    }

    public static /* synthetic */ void y(o3 o3Var, int i10) {
        o3Var.zza |= 1;
        o3Var.zze = i10;
    }

    public static void z(o3 o3Var, List list) {
        l6 l6Var = o3Var.zzf;
        if (!((c5) l6Var).f2654o) {
            o3Var.zzf = f6.k(l6Var);
        }
        b5.g(list, o3Var.zzf);
    }

    public final Object q(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new s7(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zza", "zze", "zzf"});
        } else if (i11 == 3) {
            return new o3();
        } else {
            if (i11 == 4) {
                return new n3(0);
            }
            if (i11 != 5) {
                return null;
            }
            return zzg;
        }
    }

    public final boolean r() {
        return (this.zza & 1) != 0;
    }

    public final int s() {
        return this.zze;
    }

    public final List<Long> t() {
        return this.zzf;
    }

    public final int u() {
        return this.zzf.size();
    }

    public final long v(int i10) {
        x6 x6Var = (x6) this.zzf;
        x6Var.i(i10);
        return x6Var.f2989p[i10];
    }
}
