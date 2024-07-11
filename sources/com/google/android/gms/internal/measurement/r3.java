package com.google.android.gms.internal.measurement;

import java.util.List;

public final class r3 extends f6<r3, b2> implements j7 {
    /* access modifiers changed from: private */
    public static final r3 zze;
    private m6<s3> zza = r7.f2908r;

    static {
        r3 r3Var = new r3();
        zze = r3Var;
        f6.p(r3.class, r3Var);
    }

    public static r3 t() {
        return zze;
    }

    public final Object q(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new s7(zze, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zza", s3.class});
        } else if (i11 == 3) {
            return new r3();
        } else {
            if (i11 == 4) {
                return new b2(2, 0);
            }
            if (i11 != 5) {
                return null;
            }
            return zze;
        }
    }

    public final List<s3> r() {
        return this.zza;
    }

    public final int s() {
        return this.zza.size();
    }
}
