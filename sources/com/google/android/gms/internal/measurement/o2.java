package com.google.android.gms.internal.measurement;

import com.karumi.dexter.BuildConfig;
import java.util.List;

public final class o2 extends f6<o2, n2> implements j7 {
    /* access modifiers changed from: private */
    public static final o2 zzn;
    private int zza;
    private long zze;
    private String zzf = BuildConfig.FLAVOR;
    private int zzg;
    private m6<p2> zzh;
    private m6<m2> zzi;
    private m6<w1> zzj;
    private String zzk;
    private boolean zzl;
    private m6<t3> zzm;

    static {
        o2 o2Var = new o2();
        zzn = o2Var;
        f6.p(o2.class, o2Var);
    }

    public o2() {
        r7<Object> r7Var = r7.f2908r;
        this.zzh = r7Var;
        this.zzi = r7Var;
        this.zzj = r7Var;
        this.zzk = BuildConfig.FLAVOR;
        this.zzm = r7Var;
    }

    public static n2 C() {
        return (n2) zzn.m();
    }

    public static o2 D() {
        return zzn;
    }

    public static /* synthetic */ void F(o2 o2Var, int i10, m2 m2Var) {
        m6<m2> m6Var = o2Var.zzi;
        if (!m6Var.zza()) {
            o2Var.zzi = f6.l(m6Var);
        }
        o2Var.zzi.set(i10, m2Var);
    }

    public static void G(o2 o2Var) {
        o2Var.zzj = r7.f2908r;
    }

    public final List<t3> A() {
        return this.zzm;
    }

    public final int B() {
        return this.zzm.size();
    }

    public final Object q(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new s7(zzn, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0004\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b", new Object[]{"zza", "zze", "zzf", "zzg", "zzh", p2.class, "zzi", m2.class, "zzj", w1.class, "zzk", "zzl", "zzm", t3.class});
        } else if (i11 == 3) {
            return new o2();
        } else {
            if (i11 == 4) {
                return new n2(0);
            }
            if (i11 != 5) {
                return null;
            }
            return zzn;
        }
    }

    public final boolean r() {
        return (this.zza & 1) != 0;
    }

    public final long s() {
        return this.zze;
    }

    public final boolean t() {
        return (this.zza & 2) != 0;
    }

    public final String u() {
        return this.zzf;
    }

    public final m6 v() {
        return this.zzh;
    }

    public final int w() {
        return this.zzi.size();
    }

    public final m2 x(int i10) {
        return this.zzi.get(i10);
    }

    public final m6 y() {
        return this.zzj;
    }

    public final boolean z() {
        return this.zzl;
    }
}
