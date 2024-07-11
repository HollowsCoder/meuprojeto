package com.google.android.gms.internal.measurement;

import com.karumi.dexter.BuildConfig;
import java.util.ArrayList;

public final class b3 extends f6<b3, a3> implements j7 {
    /* access modifiers changed from: private */
    public static final b3 zzk;
    private int zza;
    private String zze = BuildConfig.FLAVOR;
    private String zzf = BuildConfig.FLAVOR;
    private long zzg;
    private float zzh;
    private double zzi;
    private m6<b3> zzj = r7.f2908r;

    static {
        b3 b3Var = new b3();
        zzk = b3Var;
        f6.p(b3.class, b3Var);
    }

    public static a3 D() {
        return (a3) zzk.m();
    }

    public static /* synthetic */ void F(b3 b3Var, String str) {
        str.getClass();
        b3Var.zza |= 1;
        b3Var.zze = str;
    }

    public static /* synthetic */ void G(b3 b3Var, String str) {
        str.getClass();
        b3Var.zza |= 2;
        b3Var.zzf = str;
    }

    public static /* synthetic */ void H(b3 b3Var) {
        b3Var.zza &= -3;
        b3Var.zzf = zzk.zzf;
    }

    public static /* synthetic */ void I(b3 b3Var, long j8) {
        b3Var.zza |= 4;
        b3Var.zzg = j8;
    }

    public static /* synthetic */ void J(b3 b3Var) {
        b3Var.zza &= -5;
        b3Var.zzg = 0;
    }

    public static /* synthetic */ void K(b3 b3Var, double d) {
        b3Var.zza |= 16;
        b3Var.zzi = d;
    }

    public static /* synthetic */ void L(b3 b3Var) {
        b3Var.zza &= -17;
        b3Var.zzi = 0.0d;
    }

    public static void M(b3 b3Var, b3 b3Var2) {
        m6<b3> m6Var = b3Var.zzj;
        if (!m6Var.zza()) {
            b3Var.zzj = f6.l(m6Var);
        }
        b3Var.zzj.add(b3Var2);
    }

    public static void N(b3 b3Var, ArrayList arrayList) {
        m6<b3> m6Var = b3Var.zzj;
        if (!m6Var.zza()) {
            b3Var.zzj = f6.l(m6Var);
        }
        b5.g(arrayList, b3Var.zzj);
    }

    public static void O(b3 b3Var) {
        b3Var.zzj = r7.f2908r;
    }

    public final double A() {
        return this.zzi;
    }

    public final m6 B() {
        return this.zzj;
    }

    public final int C() {
        return this.zzj.size();
    }

    public final Object q(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new s7(zzk, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zza", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", b3.class});
        } else if (i11 == 3) {
            return new b3();
        } else {
            if (i11 == 4) {
                return new a3(0);
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

    public final String s() {
        return this.zze;
    }

    public final boolean t() {
        return (this.zza & 2) != 0;
    }

    public final String u() {
        return this.zzf;
    }

    public final boolean v() {
        return (this.zza & 4) != 0;
    }

    public final long w() {
        return this.zzg;
    }

    public final boolean x() {
        return (this.zza & 8) != 0;
    }

    public final float y() {
        return this.zzh;
    }

    public final boolean z() {
        return (this.zza & 16) != 0;
    }
}
