package com.google.android.gms.internal.measurement;

import com.karumi.dexter.BuildConfig;

public final class e2 extends f6<e2, b2> implements j7 {
    /* access modifiers changed from: private */
    public static final e2 zzj;
    private int zza;
    private int zze;
    private boolean zzf;
    private String zzg = BuildConfig.FLAVOR;
    private String zzh = BuildConfig.FLAVOR;
    private String zzi = BuildConfig.FLAVOR;

    static {
        e2 e2Var = new e2();
        zzj = e2Var;
        f6.p(e2.class, e2Var);
    }

    public static e2 B() {
        return zzj;
    }

    public final String A() {
        return this.zzi;
    }

    public final Object q(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new s7(zzj, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zza", "zze", d2.zzb(), "zzf", "zzg", "zzh", "zzi"});
        } else if (i11 == 3) {
            return new e2();
        } else {
            if (i11 == 4) {
                return new b2();
            }
            if (i11 != 5) {
                return null;
            }
            return zzj;
        }
    }

    public final boolean r() {
        return (this.zza & 1) != 0;
    }

    public final d2 s() {
        d2 zza2 = d2.zza(this.zze);
        return zza2 == null ? d2.UNKNOWN_COMPARISON_TYPE : zza2;
    }

    public final boolean t() {
        return (this.zza & 2) != 0;
    }

    public final boolean u() {
        return this.zzf;
    }

    public final boolean v() {
        return (this.zza & 4) != 0;
    }

    public final String w() {
        return this.zzg;
    }

    public final boolean x() {
        return (this.zza & 8) != 0;
    }

    public final String y() {
        return this.zzh;
    }

    public final boolean z() {
        return (this.zza & 16) != 0;
    }
}
