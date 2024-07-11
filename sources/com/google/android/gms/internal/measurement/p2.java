package com.google.android.gms.internal.measurement;

import com.karumi.dexter.BuildConfig;

public final class p2 extends f6<p2, b2> implements j7 {
    /* access modifiers changed from: private */
    public static final p2 zzg;
    private int zza;
    private String zze = BuildConfig.FLAVOR;
    private String zzf = BuildConfig.FLAVOR;

    static {
        p2 p2Var = new p2();
        zzg = p2Var;
        f6.p(p2.class, p2Var);
    }

    public final Object q(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new s7(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zza", "zze", "zzf"});
        } else if (i11 == 3) {
            return new p2();
        } else {
            if (i11 == 4) {
                return new b2(0);
            }
            if (i11 != 5) {
                return null;
            }
            return zzg;
        }
    }

    public final String r() {
        return this.zze;
    }

    public final String s() {
        return this.zzf;
    }
}
