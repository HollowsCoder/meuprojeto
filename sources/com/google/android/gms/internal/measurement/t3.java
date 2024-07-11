package com.google.android.gms.internal.measurement;

import java.util.List;

public final class t3 extends f6<t3, h2> implements j7 {
    /* access modifiers changed from: private */
    public static final t3 zzg;
    private int zza;
    private m6<w3> zze = r7.f2908r;
    private r3 zzf;

    static {
        t3 t3Var = new t3();
        zzg = t3Var;
        f6.p(t3.class, t3Var);
    }

    public final Object q(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new s7(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zza", "zze", w3.class, "zzf"});
        } else if (i11 == 3) {
            return new t3();
        } else {
            if (i11 == 4) {
                return new h2(0);
            }
            if (i11 != 5) {
                return null;
            }
            return zzg;
        }
    }

    public final List<w3> r() {
        return this.zze;
    }

    public final r3 s() {
        r3 r3Var = this.zzf;
        return r3Var == null ? r3.t() : r3Var;
    }
}
