package com.google.android.gms.internal.measurement;

import com.karumi.dexter.BuildConfig;

public final class q3 extends f6<q3, p3> implements j7 {
    /* access modifiers changed from: private */
    public static final q3 zzk;
    private int zza;
    private long zze;
    private String zzf = BuildConfig.FLAVOR;
    private String zzg = BuildConfig.FLAVOR;
    private long zzh;
    private float zzi;
    private double zzj;

    static {
        q3 q3Var = new q3();
        zzk = q3Var;
        f6.p(q3.class, q3Var);
    }

    public static p3 A() {
        return (p3) zzk.m();
    }

    public static /* synthetic */ void C(q3 q3Var, long j8) {
        q3Var.zza |= 1;
        q3Var.zze = j8;
    }

    public static /* synthetic */ void D(q3 q3Var, String str) {
        str.getClass();
        q3Var.zza |= 2;
        q3Var.zzf = str;
    }

    public static /* synthetic */ void E(q3 q3Var, String str) {
        str.getClass();
        q3Var.zza |= 4;
        q3Var.zzg = str;
    }

    public static /* synthetic */ void F(q3 q3Var) {
        q3Var.zza &= -5;
        q3Var.zzg = zzk.zzg;
    }

    public static /* synthetic */ void G(q3 q3Var, long j8) {
        q3Var.zza |= 8;
        q3Var.zzh = j8;
    }

    public static /* synthetic */ void H(q3 q3Var) {
        q3Var.zza &= -9;
        q3Var.zzh = 0;
    }

    public static /* synthetic */ void I(q3 q3Var, double d) {
        q3Var.zza |= 32;
        q3Var.zzj = d;
    }

    public static /* synthetic */ void J(q3 q3Var) {
        q3Var.zza &= -33;
        q3Var.zzj = 0.0d;
    }

    public final Object q(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new s7(zzk, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new Object[]{"zza", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        } else if (i11 == 3) {
            return new q3();
        } else {
            if (i11 == 4) {
                return new p3(0);
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

    public final long s() {
        return this.zze;
    }

    public final String t() {
        return this.zzf;
    }

    public final boolean u() {
        return (this.zza & 4) != 0;
    }

    public final String v() {
        return this.zzg;
    }

    public final boolean w() {
        return (this.zza & 8) != 0;
    }

    public final long x() {
        return this.zzh;
    }

    public final boolean y() {
        return (this.zza & 32) != 0;
    }

    public final double z() {
        return this.zzj;
    }
}
