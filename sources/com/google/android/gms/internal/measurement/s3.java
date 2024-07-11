package com.google.android.gms.internal.measurement;

import com.karumi.dexter.BuildConfig;
import java.util.List;

public final class s3 extends f6<s3, y2> implements j7 {
    /* access modifiers changed from: private */
    public static final s3 zzg;
    private int zza;
    private String zze = BuildConfig.FLAVOR;
    private m6<w3> zzf = r7.f2908r;

    static {
        s3 s3Var = new s3();
        zzg = s3Var;
        f6.p(s3.class, s3Var);
    }

    public final Object q(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new s7(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zza", "zze", "zzf", w3.class});
        } else if (i11 == 3) {
            return new s3();
        } else {
            if (i11 == 4) {
                return new y2();
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

    public final List<w3> s() {
        return this.zzf;
    }
}
