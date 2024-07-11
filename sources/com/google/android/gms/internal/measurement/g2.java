package com.google.android.gms.internal.measurement;

import com.karumi.dexter.BuildConfig;

public final class g2 extends f6<g2, f2> implements j7 {
    /* access modifiers changed from: private */
    public static final g2 zzk;
    private int zza;
    private int zze;
    private String zzf = BuildConfig.FLAVOR;
    private a2 zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;

    static {
        g2 g2Var = new g2();
        zzk = g2Var;
        f6.p(g2.class, g2Var);
    }

    public static /* synthetic */ void B(g2 g2Var, String str) {
        g2Var.zza |= 2;
        g2Var.zzf = str;
    }

    public static f2 z() {
        return (f2) zzk.m();
    }

    public final Object q(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new s7(zzk, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zza", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        } else if (i11 == 3) {
            return new g2();
        } else {
            if (i11 == 4) {
                return new f2(0);
            }
            if (i11 != 5) {
                return null;
            }
            return zzk;
        }
    }

    public final boolean r() {
        return (this.zza & 1) != 0;
    }

    public final int s() {
        return this.zze;
    }

    public final String t() {
        return this.zzf;
    }

    public final a2 u() {
        a2 a2Var = this.zzg;
        return a2Var == null ? a2.z() : a2Var;
    }

    public final boolean v() {
        return this.zzh;
    }

    public final boolean w() {
        return this.zzi;
    }

    public final boolean x() {
        return (this.zza & 32) != 0;
    }

    public final boolean y() {
        return this.zzj;
    }
}
