package com.google.android.gms.internal.measurement;

import com.karumi.dexter.BuildConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class f3 extends f6<f3, e3> implements j7 {
    public static final /* synthetic */ int zza = 0;
    /* access modifiers changed from: private */
    public static final f3 zzaa;
    private String zzA = BuildConfig.FLAVOR;
    private long zzB;
    private int zzC;
    private String zzD = BuildConfig.FLAVOR;
    private String zzE = BuildConfig.FLAVOR;
    private boolean zzF;
    private m6<t2> zzG;
    private String zzH;
    private int zzI;
    private int zzJ;
    private int zzK;
    private String zzL;
    private long zzM;
    private long zzN;
    private String zzO;
    private String zzP;
    private int zzQ;
    private String zzR;
    private k3 zzS;
    private k6 zzT;
    private long zzU;
    private long zzV;
    private String zzW;
    private String zzX;
    private int zzY;
    private boolean zzZ;
    private int zze;
    private int zzf;
    private int zzg;
    private m6<x2> zzh;
    private m6<q3> zzi;
    private long zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private String zzo = BuildConfig.FLAVOR;
    private String zzp = BuildConfig.FLAVOR;
    private String zzq = BuildConfig.FLAVOR;
    private String zzr = BuildConfig.FLAVOR;
    private int zzs;
    private String zzt = BuildConfig.FLAVOR;
    private String zzu = BuildConfig.FLAVOR;
    private String zzv = BuildConfig.FLAVOR;
    private long zzw;
    private long zzx;
    private String zzy = BuildConfig.FLAVOR;
    private boolean zzz;

    static {
        f3 f3Var = new f3();
        zzaa = f3Var;
        f6.p(f3.class, f3Var);
    }

    public f3() {
        r7<Object> r7Var = r7.f2908r;
        this.zzh = r7Var;
        this.zzi = r7Var;
        this.zzG = r7Var;
        this.zzH = BuildConfig.FLAVOR;
        this.zzL = BuildConfig.FLAVOR;
        this.zzO = BuildConfig.FLAVOR;
        this.zzP = BuildConfig.FLAVOR;
        this.zzR = BuildConfig.FLAVOR;
        this.zzT = g6.f2718r;
        this.zzW = BuildConfig.FLAVOR;
        this.zzX = BuildConfig.FLAVOR;
    }

    public static e3 B0() {
        return (e3) zzaa.m();
    }

    public static /* synthetic */ void D0(f3 f3Var) {
        f3Var.zze |= 1;
        f3Var.zzg = 1;
    }

    public static /* synthetic */ void E0(f3 f3Var, int i10, x2 x2Var) {
        f3Var.S0();
        f3Var.zzh.set(i10, x2Var);
    }

    public static /* synthetic */ void F0(f3 f3Var, x2 x2Var) {
        f3Var.S0();
        f3Var.zzh.add(x2Var);
    }

    public static /* synthetic */ void G0(f3 f3Var, ArrayList arrayList) {
        f3Var.S0();
        b5.g(arrayList, f3Var.zzh);
    }

    public static void H0(f3 f3Var) {
        f3Var.zzh = r7.f2908r;
    }

    public static /* synthetic */ void I0(f3 f3Var, int i10) {
        f3Var.S0();
        f3Var.zzh.remove(i10);
    }

    public static /* synthetic */ void J0(f3 f3Var, int i10, q3 q3Var) {
        f3Var.T0();
        f3Var.zzi.set(i10, q3Var);
    }

    public static /* synthetic */ void K0(f3 f3Var, q3 q3Var) {
        f3Var.T0();
        f3Var.zzi.add(q3Var);
    }

    public static /* synthetic */ void L0(f3 f3Var, int i10) {
        f3Var.T0();
        f3Var.zzi.remove(i10);
    }

    public static /* synthetic */ void M0(f3 f3Var, long j8) {
        f3Var.zze |= 2;
        f3Var.zzj = j8;
    }

    public static /* synthetic */ void N0(f3 f3Var, long j8) {
        f3Var.zze |= 4;
        f3Var.zzk = j8;
    }

    public static /* synthetic */ void O0(f3 f3Var, long j8) {
        f3Var.zze |= 8;
        f3Var.zzl = j8;
    }

    public static /* synthetic */ void P0(f3 f3Var, long j8) {
        f3Var.zze |= 16;
        f3Var.zzm = j8;
    }

    public static /* synthetic */ void Q0(f3 f3Var) {
        f3Var.zze &= -17;
        f3Var.zzm = 0;
    }

    public static /* synthetic */ void S(f3 f3Var, long j8) {
        f3Var.zze |= 32;
        f3Var.zzn = j8;
    }

    public static /* synthetic */ void T(f3 f3Var) {
        f3Var.zze &= -33;
        f3Var.zzn = 0;
    }

    public static /* synthetic */ void U(f3 f3Var) {
        f3Var.zze |= 64;
        f3Var.zzo = "android";
    }

    public static /* synthetic */ void U0(f3 f3Var, String str) {
        f3Var.zze |= 16777216;
        f3Var.zzH = str;
    }

    public static /* synthetic */ void V(f3 f3Var, String str) {
        str.getClass();
        f3Var.zze |= 128;
        f3Var.zzp = str;
    }

    public static /* synthetic */ void V0(f3 f3Var, int i10) {
        f3Var.zze |= 33554432;
        f3Var.zzI = i10;
    }

    public static /* synthetic */ void W(f3 f3Var, String str) {
        str.getClass();
        f3Var.zze |= 256;
        f3Var.zzq = str;
    }

    public static /* synthetic */ void W0(f3 f3Var) {
        f3Var.zze &= -268435457;
        f3Var.zzL = zzaa.zzL;
    }

    public static /* synthetic */ void X(f3 f3Var, String str) {
        str.getClass();
        f3Var.zze |= 512;
        f3Var.zzr = str;
    }

    public static /* synthetic */ void X0(f3 f3Var, long j8) {
        f3Var.zze |= 536870912;
        f3Var.zzM = j8;
    }

    public static /* synthetic */ void Y(f3 f3Var, int i10) {
        f3Var.zze |= 1024;
        f3Var.zzs = i10;
    }

    public static /* synthetic */ void Y0(f3 f3Var, long j8) {
        f3Var.zze |= 1073741824;
        f3Var.zzN = j8;
    }

    public static /* synthetic */ void Z(f3 f3Var, String str) {
        str.getClass();
        f3Var.zze |= 2048;
        f3Var.zzt = str;
    }

    public static /* synthetic */ void Z0(f3 f3Var) {
        f3Var.zze &= Integer.MAX_VALUE;
        f3Var.zzO = zzaa.zzO;
    }

    public static /* synthetic */ void a0(f3 f3Var, String str) {
        str.getClass();
        f3Var.zze |= 4096;
        f3Var.zzu = str;
    }

    public static /* synthetic */ void a1(f3 f3Var, int i10) {
        f3Var.zzf |= 2;
        f3Var.zzQ = i10;
    }

    public static /* synthetic */ void b0(f3 f3Var, String str) {
        str.getClass();
        f3Var.zze |= 8192;
        f3Var.zzv = str;
    }

    public static /* synthetic */ void b1(f3 f3Var, String str) {
        str.getClass();
        f3Var.zzf |= 4;
        f3Var.zzR = str;
    }

    public static /* synthetic */ void c0(f3 f3Var, long j8) {
        f3Var.zze |= 16384;
        f3Var.zzw = j8;
    }

    public static void c1(f3 f3Var, ArrayList arrayList) {
        int i10;
        k6 k6Var = f3Var.zzT;
        if (!((c5) k6Var).f2654o) {
            int size = k6Var.size();
            if (size == 0) {
                i10 = 10;
            } else {
                i10 = size + size;
            }
            g6 g6Var = (g6) k6Var;
            if (i10 >= g6Var.f2720q) {
                f3Var.zzT = new g6(Arrays.copyOf(g6Var.f2719p, i10), g6Var.f2720q);
            } else {
                throw new IllegalArgumentException();
            }
        }
        b5.g(arrayList, f3Var.zzT);
    }

    public static /* synthetic */ void d0(f3 f3Var) {
        f3Var.zze |= 32768;
        f3Var.zzx = 42004;
    }

    public static /* synthetic */ void d1(f3 f3Var, long j8) {
        f3Var.zzf |= 16;
        f3Var.zzU = j8;
    }

    public static /* synthetic */ void e0(f3 f3Var, String str) {
        str.getClass();
        f3Var.zze |= 65536;
        f3Var.zzy = str;
    }

    public static /* synthetic */ void e1(f3 f3Var, long j8) {
        f3Var.zzf |= 32;
        f3Var.zzV = j8;
    }

    public static /* synthetic */ void f0(f3 f3Var) {
        f3Var.zze &= -65537;
        f3Var.zzy = zzaa.zzy;
    }

    public static /* synthetic */ void f1(f3 f3Var, String str) {
        str.getClass();
        f3Var.zzf |= 64;
        f3Var.zzW = str;
    }

    public static /* synthetic */ void g0(f3 f3Var, boolean z) {
        f3Var.zze |= 131072;
        f3Var.zzz = z;
    }

    public static /* synthetic */ void g1(f3 f3Var, String str) {
        str.getClass();
        f3Var.zzf |= 128;
        f3Var.zzX = str;
    }

    public static /* synthetic */ void h0(f3 f3Var) {
        f3Var.zze &= -131073;
        f3Var.zzz = false;
    }

    public static /* synthetic */ void i0(f3 f3Var, String str) {
        f3Var.zze |= 262144;
        f3Var.zzA = str;
    }

    public static /* synthetic */ void j0(f3 f3Var) {
        f3Var.zze &= -262145;
        f3Var.zzA = zzaa.zzA;
    }

    public static /* synthetic */ void k0(f3 f3Var, long j8) {
        f3Var.zze |= 524288;
        f3Var.zzB = j8;
    }

    public static /* synthetic */ void l0(f3 f3Var, int i10) {
        f3Var.zze |= 1048576;
        f3Var.zzC = i10;
    }

    public static /* synthetic */ void m0(f3 f3Var, String str) {
        f3Var.zze |= 2097152;
        f3Var.zzD = str;
    }

    public static /* synthetic */ void n0(f3 f3Var) {
        f3Var.zze &= -2097153;
        f3Var.zzD = zzaa.zzD;
    }

    public static /* synthetic */ void o0(f3 f3Var, String str) {
        str.getClass();
        f3Var.zze |= 4194304;
        f3Var.zzE = str;
    }

    public static /* synthetic */ void p0(f3 f3Var) {
        f3Var.zze |= 8388608;
        f3Var.zzF = false;
    }

    public static /* synthetic */ void q0(f3 f3Var, ArrayList arrayList) {
        m6<t2> m6Var = f3Var.zzG;
        if (!m6Var.zza()) {
            f3Var.zzG = f6.l(m6Var);
        }
        b5.g(arrayList, f3Var.zzG);
    }

    public static void r0(f3 f3Var) {
        f3Var.zzG = r7.f2908r;
    }

    public final String A() {
        return this.zzA;
    }

    public final String A0() {
        return this.zzX;
    }

    public final String A1() {
        return this.zzr;
    }

    public final boolean B() {
        return (this.zze & 524288) != 0;
    }

    public final boolean B1() {
        return (this.zze & 1024) != 0;
    }

    public final long C() {
        return this.zzB;
    }

    public final int C1() {
        return this.zzs;
    }

    public final boolean D() {
        return (this.zze & 1048576) != 0;
    }

    public final String D1() {
        return this.zzt;
    }

    public final int E() {
        return this.zzC;
    }

    public final String F() {
        return this.zzD;
    }

    public final String G() {
        return this.zzE;
    }

    public final boolean H() {
        return (this.zze & 8388608) != 0;
    }

    public final boolean I() {
        return this.zzF;
    }

    public final m6 J() {
        return this.zzG;
    }

    public final String K() {
        return this.zzH;
    }

    public final boolean L() {
        return (this.zze & 33554432) != 0;
    }

    public final int M() {
        return this.zzI;
    }

    public final boolean N() {
        return (this.zze & 536870912) != 0;
    }

    public final long O() {
        return this.zzM;
    }

    public final boolean P() {
        return (this.zze & 1073741824) != 0;
    }

    public final long Q() {
        return this.zzN;
    }

    public final boolean R() {
        return (this.zze & 1) != 0;
    }

    public final int R0() {
        return this.zzg;
    }

    public final void S0() {
        m6<x2> m6Var = this.zzh;
        if (!m6Var.zza()) {
            this.zzh = f6.l(m6Var);
        }
    }

    public final void T0() {
        m6<q3> m6Var = this.zzi;
        if (!m6Var.zza()) {
            this.zzi = f6.l(m6Var);
        }
    }

    public final List<x2> h1() {
        return this.zzh;
    }

    public final int i1() {
        return this.zzh.size();
    }

    public final x2 j1(int i10) {
        return this.zzh.get(i10);
    }

    public final m6 k1() {
        return this.zzi;
    }

    public final int l1() {
        return this.zzi.size();
    }

    public final q3 m1(int i10) {
        return this.zzi.get(i10);
    }

    public final boolean n1() {
        return (this.zze & 2) != 0;
    }

    public final long o1() {
        return this.zzj;
    }

    public final boolean p1() {
        return (this.zze & 4) != 0;
    }

    public final Object q(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new s7(zzaa, "\u0001.\u0000\u0002\u00017.\u0000\u0004\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဂ\u0001\u0005ဂ\u0002\u0006ဂ\u0003\u0007ဂ\u0005\bဈ\u0006\tဈ\u0007\nဈ\b\u000bဈ\t\fင\n\rဈ\u000b\u000eဈ\f\u0010ဈ\r\u0011ဂ\u000e\u0012ဂ\u000f\u0013ဈ\u0010\u0014ဇ\u0011\u0015ဈ\u0012\u0016ဂ\u0013\u0017င\u0014\u0018ဈ\u0015\u0019ဈ\u0016\u001aဂ\u0004\u001cဇ\u0017\u001d\u001b\u001eဈ\u0018\u001fင\u0019 င\u001a!င\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဈ\u001f&ဈ 'င!)ဈ\",ဉ#-\u001d.ဂ$/ဂ%2ဈ&4ဈ'5ဌ(7ဇ)", new Object[]{"zze", "zzf", "zzg", "zzh", x2.class, "zzi", q3.class, "zzj", "zzk", "zzl", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", "zzE", "zzm", "zzF", "zzG", t2.class, "zzH", "zzI", "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", "zzQ", "zzR", "zzS", "zzT", "zzU", "zzV", "zzW", "zzX", "zzY", r2.zzb(), "zzZ"});
        } else if (i11 == 3) {
            return new f3();
        } else {
            if (i11 == 4) {
                return new e3(0);
            }
            if (i11 != 5) {
                return null;
            }
            return zzaa;
        }
    }

    public final long q1() {
        return this.zzk;
    }

    public final String r() {
        return this.zzu;
    }

    public final boolean r1() {
        return (this.zze & 8) != 0;
    }

    public final String s() {
        return this.zzv;
    }

    public final String s0() {
        return this.zzO;
    }

    public final long s1() {
        return this.zzl;
    }

    public final boolean t() {
        return (this.zze & 16384) != 0;
    }

    public final boolean t0() {
        return (this.zzf & 2) != 0;
    }

    public final boolean t1() {
        return (this.zze & 16) != 0;
    }

    public final long u() {
        return this.zzw;
    }

    public final int u0() {
        return this.zzQ;
    }

    public final long u1() {
        return this.zzm;
    }

    public final boolean v() {
        return (this.zze & 32768) != 0;
    }

    public final String v0() {
        return this.zzR;
    }

    public final boolean v1() {
        return (this.zze & 32) != 0;
    }

    public final long w() {
        return this.zzx;
    }

    public final boolean w0() {
        return (this.zzf & 16) != 0;
    }

    public final long w1() {
        return this.zzn;
    }

    public final String x() {
        return this.zzy;
    }

    public final long x0() {
        return this.zzU;
    }

    public final String x1() {
        return this.zzo;
    }

    public final boolean y() {
        return (this.zze & 131072) != 0;
    }

    public final String y0() {
        return this.zzW;
    }

    public final String y1() {
        return this.zzp;
    }

    public final boolean z() {
        return this.zzz;
    }

    public final boolean z0() {
        return (this.zzf & 128) != 0;
    }

    public final String z1() {
        return this.zzq;
    }
}
