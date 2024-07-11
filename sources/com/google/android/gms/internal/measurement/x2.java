package com.google.android.gms.internal.measurement;

import com.karumi.dexter.BuildConfig;
import java.util.List;

public final class x2 extends f6<x2, w2> implements j7 {
    /* access modifiers changed from: private */
    public static final x2 zzj;
    private int zza;
    private m6<b3> zze = r7.f2908r;
    private String zzf = BuildConfig.FLAVOR;
    private long zzg;
    private long zzh;
    private int zzi;

    static {
        x2 x2Var = new x2();
        zzj = x2Var;
        f6.p(x2.class, x2Var);
    }

    public static w2 B() {
        return (w2) zzj.m();
    }

    public static /* synthetic */ void D(x2 x2Var, int i10, b3 b3Var) {
        x2Var.L();
        x2Var.zze.set(i10, b3Var);
    }

    public static /* synthetic */ void E(x2 x2Var, b3 b3Var) {
        x2Var.L();
        x2Var.zze.add(b3Var);
    }

    public static /* synthetic */ void F(x2 x2Var, Iterable iterable) {
        x2Var.L();
        b5.g(iterable, x2Var.zze);
    }

    public static void G(x2 x2Var) {
        x2Var.zze = r7.f2908r;
    }

    public static /* synthetic */ void H(x2 x2Var, int i10) {
        x2Var.L();
        x2Var.zze.remove(i10);
    }

    public static /* synthetic */ void I(x2 x2Var, String str) {
        str.getClass();
        x2Var.zza |= 1;
        x2Var.zzf = str;
    }

    public static /* synthetic */ void J(long j8, x2 x2Var) {
        x2Var.zza |= 2;
        x2Var.zzg = j8;
    }

    public static /* synthetic */ void K(long j8, x2 x2Var) {
        x2Var.zza |= 4;
        x2Var.zzh = j8;
    }

    public final int A() {
        return this.zzi;
    }

    public final void L() {
        m6<b3> m6Var = this.zze;
        if (!m6Var.zza()) {
            this.zze = f6.l(m6Var);
        }
    }

    public final Object q(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new s7(zzj, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003", new Object[]{"zza", "zze", b3.class, "zzf", "zzg", "zzh", "zzi"});
        } else if (i11 == 3) {
            return new x2();
        } else {
            if (i11 == 4) {
                return new w2(0);
            }
            if (i11 != 5) {
                return null;
            }
            return zzj;
        }
    }

    public final List<b3> r() {
        return this.zze;
    }

    public final int s() {
        return this.zze.size();
    }

    public final b3 t(int i10) {
        return this.zze.get(i10);
    }

    public final String u() {
        return this.zzf;
    }

    public final boolean v() {
        return (this.zza & 2) != 0;
    }

    public final long w() {
        return this.zzg;
    }

    public final boolean x() {
        return (this.zza & 4) != 0;
    }

    public final long y() {
        return this.zzh;
    }

    public final boolean z() {
        return (this.zza & 8) != 0;
    }
}
