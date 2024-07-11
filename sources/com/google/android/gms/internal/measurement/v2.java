package com.google.android.gms.internal.measurement;

public final class v2 extends f6<v2, u2> implements j7 {
    /* access modifiers changed from: private */
    public static final v2 zzg;
    private int zza;
    private int zze;
    private long zzf;

    static {
        v2 v2Var = new v2();
        zzg = v2Var;
        f6.p(v2.class, v2Var);
    }

    public static u2 v() {
        return (u2) zzg.m();
    }

    public static /* synthetic */ void x(v2 v2Var, int i10) {
        v2Var.zza |= 1;
        v2Var.zze = i10;
    }

    public static /* synthetic */ void y(v2 v2Var, long j8) {
        v2Var.zza |= 2;
        v2Var.zzf = j8;
    }

    public final Object q(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new s7(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zza", "zze", "zzf"});
        } else if (i11 == 3) {
            return new v2();
        } else {
            if (i11 == 4) {
                return new u2(0);
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

    public final boolean t() {
        return (this.zza & 2) != 0;
    }

    public final long u() {
        return this.zzf;
    }
}
