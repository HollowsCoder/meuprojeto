package com.google.android.gms.internal.measurement;

import com.karumi.dexter.BuildConfig;

public final class k2 extends f6<k2, h2> implements j7 {
    /* access modifiers changed from: private */
    public static final k2 zzi;
    private int zza;
    private int zze;
    private String zzf = BuildConfig.FLAVOR;
    private boolean zzg;
    private m6<String> zzh = r7.f2908r;

    static {
        k2 k2Var = new k2();
        zzi = k2Var;
        f6.p(k2.class, k2Var);
    }

    public static k2 z() {
        return zzi;
    }

    public final Object q(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new s7(zzi, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zza", "zze", j2.zzb(), "zzf", "zzg", "zzh"});
        } else if (i11 == 3) {
            return new k2();
        } else {
            if (i11 == 4) {
                return new h2();
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

    public final j2 s() {
        j2 zza2 = j2.zza(this.zze);
        return zza2 == null ? j2.UNKNOWN_MATCH_TYPE : zza2;
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

    public final boolean w() {
        return this.zzg;
    }

    public final m6 x() {
        return this.zzh;
    }

    public final int y() {
        return this.zzh.size();
    }
}
