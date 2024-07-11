package com.google.android.gms.internal.measurement;

import com.karumi.dexter.BuildConfig;

public final class z2 extends f6<z2, y2> implements j7 {
    /* access modifiers changed from: private */
    public static final z2 zzg;
    private int zza;
    private String zze = BuildConfig.FLAVOR;
    private long zzf;

    static {
        z2 z2Var = new z2();
        zzg = z2Var;
        f6.p(z2.class, z2Var);
    }

    public final Object q(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new s7(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"zza", "zze", "zzf"});
        } else if (i11 == 3) {
            return new z2();
        } else {
            if (i11 == 4) {
                return new y2(0);
            }
            if (i11 != 5) {
                return null;
            }
            return zzg;
        }
    }
}
