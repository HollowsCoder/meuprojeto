package com.google.android.gms.internal.measurement;

import java.util.List;

public final class d3 extends f6<d3, c3> implements j7 {
    /* access modifiers changed from: private */
    public static final d3 zze;
    private m6<f3> zza = r7.f2908r;

    static {
        d3 d3Var = new d3();
        zze = d3Var;
        f6.p(d3.class, d3Var);
    }

    public static c3 t() {
        return (c3) zze.m();
    }

    public static /* synthetic */ void v(d3 d3Var, f3 f3Var) {
        m6<f3> m6Var = d3Var.zza;
        if (!m6Var.zza()) {
            d3Var.zza = f6.l(m6Var);
        }
        d3Var.zza.add(f3Var);
    }

    public final Object q(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new s7(zze, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zza", f3.class});
        } else if (i11 == 3) {
            return new d3();
        } else {
            if (i11 == 4) {
                return new c3(0);
            }
            if (i11 != 5) {
                return null;
            }
            return zze;
        }
    }

    public final List<f3> r() {
        return this.zza;
    }

    public final f3 s() {
        return this.zza.get(0);
    }
}
