package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

public final class m3 extends f6<m3, l3> implements j7 {
    /* access modifiers changed from: private */
    public static final m3 zzh;
    private l6 zza;
    private l6 zze;
    private m6<v2> zzf;
    private m6<o3> zzg;

    static {
        m3 m3Var = new m3();
        zzh = m3Var;
        f6.p(m3.class, m3Var);
    }

    public m3() {
        x6 x6Var = x6.f2988r;
        this.zza = x6Var;
        this.zze = x6Var;
        r7<Object> r7Var = r7.f2908r;
        this.zzf = r7Var;
        this.zzg = r7Var;
    }

    public static l3 B() {
        return (l3) zzh.m();
    }

    public static m3 C() {
        return zzh;
    }

    public static void E(m3 m3Var, List list) {
        l6 l6Var = m3Var.zza;
        if (!((c5) l6Var).f2654o) {
            m3Var.zza = f6.k(l6Var);
        }
        b5.g(list, m3Var.zza);
    }

    public static void F(m3 m3Var) {
        m3Var.zza = x6.f2988r;
    }

    public static void G(m3 m3Var, List list) {
        l6 l6Var = m3Var.zze;
        if (!((c5) l6Var).f2654o) {
            m3Var.zze = f6.k(l6Var);
        }
        b5.g(list, m3Var.zze);
    }

    public static void H(m3 m3Var) {
        m3Var.zze = x6.f2988r;
    }

    public static void I(m3 m3Var, ArrayList arrayList) {
        m6<v2> m6Var = m3Var.zzf;
        if (!m6Var.zza()) {
            m3Var.zzf = f6.l(m6Var);
        }
        b5.g(arrayList, m3Var.zzf);
    }

    public static void J(m3 m3Var, int i10) {
        m6<v2> m6Var = m3Var.zzf;
        if (!m6Var.zza()) {
            m3Var.zzf = f6.l(m6Var);
        }
        m3Var.zzf.remove(i10);
    }

    public static /* synthetic */ void K(m3 m3Var, List list) {
        m3Var.M();
        b5.g(list, m3Var.zzg);
    }

    public static /* synthetic */ void L(m3 m3Var, int i10) {
        m3Var.M();
        m3Var.zzg.remove(i10);
    }

    public final o3 A(int i10) {
        return this.zzg.get(i10);
    }

    public final void M() {
        m6<o3> m6Var = this.zzg;
        if (!m6Var.zza()) {
            this.zzg = f6.l(m6Var);
        }
    }

    public final Object q(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new s7(zzh, "\u0001\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zza", "zze", "zzf", v2.class, "zzg", o3.class});
        } else if (i11 == 3) {
            return new m3();
        } else {
            if (i11 == 4) {
                return new l3(0);
            }
            if (i11 != 5) {
                return null;
            }
            return zzh;
        }
    }

    public final List<Long> r() {
        return this.zza;
    }

    public final int s() {
        return this.zza.size();
    }

    public final List<Long> t() {
        return this.zze;
    }

    public final int u() {
        return this.zze.size();
    }

    public final m6 v() {
        return this.zzf;
    }

    public final int w() {
        return this.zzf.size();
    }

    public final v2 x(int i10) {
        return this.zzf.get(i10);
    }

    public final m6 y() {
        return this.zzg;
    }

    public final int z() {
        return this.zzg.size();
    }
}
