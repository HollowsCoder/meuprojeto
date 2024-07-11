package com.google.android.gms.internal.measurement;

import java.util.List;

public final class w1 extends f6<w1, v1> implements j7 {
    /* access modifiers changed from: private */
    public static final w1 zzj;
    private int zza;
    private int zze;
    private m6<g2> zzf;
    private m6<y1> zzg;
    private boolean zzh;
    private boolean zzi;

    static {
        w1 w1Var = new w1();
        zzj = w1Var;
        f6.p(w1.class, w1Var);
    }

    public w1() {
        r7<Object> r7Var = r7.f2908r;
        this.zzf = r7Var;
        this.zzg = r7Var;
    }

    public static /* synthetic */ void A(w1 w1Var, int i10, g2 g2Var) {
        m6<g2> m6Var = w1Var.zzf;
        if (!m6Var.zza()) {
            w1Var.zzf = f6.l(m6Var);
        }
        w1Var.zzf.set(i10, g2Var);
    }

    public static /* synthetic */ void B(w1 w1Var, int i10, y1 y1Var) {
        m6<y1> m6Var = w1Var.zzg;
        if (!m6Var.zza()) {
            w1Var.zzg = f6.l(m6Var);
        }
        w1Var.zzg.set(i10, y1Var);
    }

    public final Object q(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new s7(zzj, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zza", "zze", "zzf", g2.class, "zzg", y1.class, "zzh", "zzi"});
        } else if (i11 == 3) {
            return new w1();
        } else {
            if (i11 == 4) {
                return new v1(0);
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

    public final int s() {
        return this.zze;
    }

    public final List<g2> t() {
        return this.zzf;
    }

    public final int u() {
        return this.zzf.size();
    }

    public final g2 v(int i10) {
        return this.zzf.get(i10);
    }

    public final m6 w() {
        return this.zzg;
    }

    public final int x() {
        return this.zzg.size();
    }

    public final y1 y(int i10) {
        return this.zzg.get(i10);
    }
}
