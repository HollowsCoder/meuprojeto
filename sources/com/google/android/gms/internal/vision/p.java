package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.q1;
import com.karumi.dexter.BuildConfig;

public final class p extends q1<p, a> implements y2 {
    /* access modifiers changed from: private */
    public static final p zzj;
    private static volatile i3<p> zzk;
    private int zzc;
    private String zzd = BuildConfig.FLAVOR;
    private long zze;
    private f zzf;
    private String zzg = BuildConfig.FLAVOR;
    private l zzh;
    private g zzi;

    public static final class a extends q1.b<p, a> implements y2 {
        public a() {
            super(p.zzj);
        }
    }

    static {
        p pVar = new p();
        zzj = pVar;
        q1.l(p.class, pVar);
    }

    /* JADX WARNING: type inference failed for: r4v13, types: [com.google.android.gms.internal.vision.i3<com.google.android.gms.internal.vision.p>, com.google.android.gms.internal.vision.q1$a] */
    public final Object i(int i10) {
        i3<p> i3Var;
        switch (v.f3176a[i10 - 1]) {
            case 1:
                return new p();
            case 2:
                return new a();
            case 3:
                return new k3(zzj, "\u0001\u0006\u0000\u0001\u0001\u0011\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဉ\u0002\u0006ဈ\u0003\u0010ဉ\u0004\u0011ဉ\u0005", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzj;
            case 5:
                i3<p> i3Var2 = zzk;
                i3<p> i3Var3 = i3Var2;
                if (i3Var2 == null) {
                    synchronized (p.class) {
                        i3<p> i3Var4 = zzk;
                        i3Var = i3Var4;
                        if (i3Var4 == null) {
                            ? aVar = new q1.a();
                            zzk = aVar;
                            i3Var = aVar;
                        }
                    }
                    i3Var3 = i3Var;
                }
                return i3Var3;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
