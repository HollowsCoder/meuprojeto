package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.q1;
import com.karumi.dexter.BuildConfig;

public final class h extends q1<h, a> implements y2 {
    /* access modifiers changed from: private */
    public static final h zzg;
    private static volatile i3<h> zzh;
    private int zzc;
    private int zzd;
    private int zze;
    private String zzf = BuildConfig.FLAVOR;

    public static final class a extends q1.b<h, a> implements y2 {
        public a() {
            super(h.zzg);
        }
    }

    static {
        h hVar = new h();
        zzg = hVar;
        q1.l(h.class, hVar);
    }

    /* JADX WARNING: type inference failed for: r4v13, types: [com.google.android.gms.internal.vision.i3<com.google.android.gms.internal.vision.h>, com.google.android.gms.internal.vision.q1$a] */
    public final Object i(int i10) {
        i3<h> i3Var;
        switch (v.f3176a[i10 - 1]) {
            case 1:
                return new h();
            case 2:
                return new a();
            case 3:
                return new k3(zzg, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဈ\u0002", new Object[]{"zzc", "zzd", i0.zzb(), "zze", j0.zzb(), "zzf"});
            case 4:
                return zzg;
            case 5:
                i3<h> i3Var2 = zzh;
                i3<h> i3Var3 = i3Var2;
                if (i3Var2 == null) {
                    synchronized (h.class) {
                        i3<h> i3Var4 = zzh;
                        i3Var = i3Var4;
                        if (i3Var4 == null) {
                            ? aVar = new q1.a();
                            zzh = aVar;
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
