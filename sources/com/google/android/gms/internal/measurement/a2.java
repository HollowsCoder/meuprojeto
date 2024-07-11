package com.google.android.gms.internal.measurement;

import com.karumi.dexter.BuildConfig;

public final class a2 extends f6<a2, z1> implements j7 {
    /* access modifiers changed from: private */
    public static final a2 zzi;
    private int zza;
    private k2 zze;
    private e2 zzf;
    private boolean zzg;
    private String zzh = BuildConfig.FLAVOR;

    static {
        a2 a2Var = new a2();
        zzi = a2Var;
        f6.p(a2.class, a2Var);
    }

    public static /* synthetic */ void B(a2 a2Var, String str) {
        a2Var.zza |= 8;
        a2Var.zzh = str;
    }

    public static a2 z() {
        return zzi;
    }

    public final Object q(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new s7(zzi, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zza", "zze", "zzf", "zzg", "zzh"});
        } else if (i11 == 3) {
            return new a2();
        } else {
            if (i11 == 4) {
                return new z1(0);
            }
            if (i11 != 5) {
                return null;
            }
            return zzi;
        }
    }

    public final boolean r() {
        return (this.zza & 1) != 0;
    }

    public final k2 s() {
        k2 k2Var = this.zze;
        return k2Var == null ? k2.z() : k2Var;
    }

    public final boolean t() {
        return (this.zza & 2) != 0;
    }

    public final e2 u() {
        e2 e2Var = this.zzf;
        return e2Var == null ? e2.B() : e2Var;
    }

    public final boolean v() {
        return (this.zza & 4) != 0;
    }

    public final boolean w() {
        return this.zzg;
    }

    public final boolean x() {
        return (this.zza & 8) != 0;
    }

    public final String y() {
        return this.zzh;
    }
}
