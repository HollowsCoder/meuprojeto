package com.google.android.gms.internal.measurement;

public final class t2 extends f6<t2, s2> implements j7 {
    /* access modifiers changed from: private */
    public static final t2 zzi;
    private int zza;
    private int zze;
    private m3 zzf;
    private m3 zzg;
    private boolean zzh;

    static {
        t2 t2Var = new t2();
        zzi = t2Var;
        f6.p(t2.class, t2Var);
    }

    public static /* synthetic */ void A(t2 t2Var, int i10) {
        t2Var.zza |= 1;
        t2Var.zze = i10;
    }

    public static /* synthetic */ void B(t2 t2Var, m3 m3Var) {
        t2Var.zzf = m3Var;
        t2Var.zza |= 2;
    }

    public static /* synthetic */ void C(t2 t2Var, m3 m3Var) {
        t2Var.zzg = m3Var;
        t2Var.zza |= 4;
    }

    public static /* synthetic */ void D(t2 t2Var, boolean z) {
        t2Var.zza |= 8;
        t2Var.zzh = z;
    }

    public static s2 y() {
        return (s2) zzi.m();
    }

    public final Object q(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new s7(zzi, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zza", "zze", "zzf", "zzg", "zzh"});
        } else if (i11 == 3) {
            return new t2();
        } else {
            if (i11 == 4) {
                return new s2(0);
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

    public final int s() {
        return this.zze;
    }

    public final m3 t() {
        m3 m3Var = this.zzf;
        return m3Var == null ? m3.C() : m3Var;
    }

    public final boolean u() {
        return (this.zza & 4) != 0;
    }

    public final m3 v() {
        m3 m3Var = this.zzg;
        return m3Var == null ? m3.C() : m3Var;
    }

    public final boolean w() {
        return (this.zza & 8) != 0;
    }

    public final boolean x() {
        return this.zzh;
    }
}
