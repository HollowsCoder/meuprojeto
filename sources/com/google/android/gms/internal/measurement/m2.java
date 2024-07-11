package com.google.android.gms.internal.measurement;

import com.karumi.dexter.BuildConfig;

public final class m2 extends f6<m2, l2> implements j7 {
    /* access modifiers changed from: private */
    public static final m2 zzi;
    private int zza;
    private String zze = BuildConfig.FLAVOR;
    private boolean zzf;
    private boolean zzg;
    private int zzh;

    static {
        m2 m2Var = new m2();
        zzi = m2Var;
        f6.p(m2.class, m2Var);
    }

    public static /* synthetic */ void x(m2 m2Var, String str) {
        str.getClass();
        m2Var.zza |= 1;
        m2Var.zze = str;
    }

    public final Object q(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new s7(zzi, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zza", "zze", "zzf", "zzg", "zzh"});
        } else if (i11 == 3) {
            return new m2();
        } else {
            if (i11 == 4) {
                return new l2(0);
            }
            if (i11 != 5) {
                return null;
            }
            return zzi;
        }
    }

    public final String r() {
        return this.zze;
    }

    public final boolean s() {
        return this.zzf;
    }

    public final boolean t() {
        return this.zzg;
    }

    public final boolean u() {
        return (this.zza & 8) != 0;
    }

    public final int v() {
        return this.zzh;
    }
}
