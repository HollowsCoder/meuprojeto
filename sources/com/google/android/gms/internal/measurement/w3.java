package com.google.android.gms.internal.measurement;

import com.karumi.dexter.BuildConfig;
import java.util.List;

public final class w3 extends f6<w3, b2> implements j7 {
    /* access modifiers changed from: private */
    public static final w3 zzk;
    private int zza;
    private int zze;
    private m6<w3> zzf = r7.f2908r;
    private String zzg = BuildConfig.FLAVOR;
    private String zzh = BuildConfig.FLAVOR;
    private boolean zzi;
    private double zzj;

    static {
        w3 w3Var = new w3();
        zzk = w3Var;
        f6.p(w3.class, w3Var);
    }

    public final Object q(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new s7(zzk, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006က\u0004", new Object[]{"zza", "zze", v3.zzb(), "zzf", w3.class, "zzg", "zzh", "zzi", "zzj"});
        } else if (i11 == 3) {
            return new w3();
        } else {
            if (i11 == 4) {
                return new b2(3, 0);
            }
            if (i11 != 5) {
                return null;
            }
            return zzk;
        }
    }

    public final v3 r() {
        v3 zza2 = v3.zza(this.zze);
        return zza2 == null ? v3.UNKNOWN : zza2;
    }

    public final List<w3> s() {
        return this.zzf;
    }

    public final String t() {
        return this.zzg;
    }

    public final boolean u() {
        return (this.zza & 4) != 0;
    }

    public final String v() {
        return this.zzh;
    }

    public final boolean w() {
        return (this.zza & 8) != 0;
    }

    public final boolean x() {
        return this.zzi;
    }

    public final boolean y() {
        return (this.zza & 16) != 0;
    }

    public final double z() {
        return this.zzj;
    }
}
