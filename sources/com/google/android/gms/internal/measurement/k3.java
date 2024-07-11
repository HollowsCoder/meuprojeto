package com.google.android.gms.internal.measurement;

public final class k3 extends f6<k3, g3> implements j7 {
    /* access modifiers changed from: private */
    public static final k3 zzg;
    private int zza;
    private int zze = 1;
    private m6<z2> zzf = r7.f2908r;

    static {
        k3 k3Var = new k3();
        zzg = k3Var;
        f6.p(k3.class, k3Var);
    }

    public final Object q(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new s7(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b", new Object[]{"zza", "zze", j3.zzb(), "zzf", z2.class});
        } else if (i11 == 3) {
            return new k3();
        } else {
            if (i11 == 4) {
                return new g3(0);
            }
            if (i11 != 5) {
                return null;
            }
            return zzg;
        }
    }
}
