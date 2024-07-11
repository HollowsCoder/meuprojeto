package com.google.android.gms.internal.measurement;

import com.karumi.dexter.BuildConfig;
import java.util.List;

public final class y1 extends f6<y1, x1> implements j7 {
    /* access modifiers changed from: private */
    public static final y1 zzm;
    private int zza;
    private int zze;
    private String zzf = BuildConfig.FLAVOR;
    private m6<a2> zzg = r7.f2908r;
    private boolean zzh;
    private e2 zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;

    static {
        y1 y1Var = new y1();
        zzm = y1Var;
        f6.p(y1.class, y1Var);
    }

    public static x1 D() {
        return (x1) zzm.m();
    }

    public static /* synthetic */ void F(y1 y1Var, String str) {
        y1Var.zza |= 2;
        y1Var.zzf = str;
    }

    public static /* synthetic */ void G(y1 y1Var, int i10, a2 a2Var) {
        m6<a2> m6Var = y1Var.zzg;
        if (!m6Var.zza()) {
            y1Var.zzg = f6.l(m6Var);
        }
        y1Var.zzg.set(i10, a2Var);
    }

    public final boolean A() {
        return this.zzk;
    }

    public final boolean B() {
        return (this.zza & 64) != 0;
    }

    public final boolean C() {
        return this.zzl;
    }

    public final Object q(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new s7(zzm, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zza", "zze", "zzf", "zzg", a2.class, "zzh", "zzi", "zzj", "zzk", "zzl"});
        } else if (i11 == 3) {
            return new y1();
        } else {
            if (i11 == 4) {
                return new x1(0);
            }
            if (i11 != 5) {
                return null;
            }
            return zzm;
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

    public final List<a2> u() {
        return this.zzg;
    }

    public final int v() {
        return this.zzg.size();
    }

    public final a2 w(int i10) {
        return this.zzg.get(i10);
    }

    public final boolean x() {
        return (this.zza & 8) != 0;
    }

    public final e2 y() {
        e2 e2Var = this.zzi;
        return e2Var == null ? e2.B() : e2Var;
    }

    public final boolean z() {
        return this.zzj;
    }
}
