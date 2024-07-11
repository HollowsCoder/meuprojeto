package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.q1;
import com.karumi.dexter.BuildConfig;

public final class f extends q1<f, a> implements y2 {
    /* access modifiers changed from: private */
    public static final f zzf;
    private static volatile i3<f> zzg;
    private int zzc;
    private String zzd = BuildConfig.FLAVOR;
    private String zze = BuildConfig.FLAVOR;

    public static final class a extends q1.b<f, a> implements y2 {
        public a() {
            super(f.zzf);
        }
    }

    static {
        f fVar = new f();
        zzf = fVar;
        q1.l(f.class, fVar);
    }

    public static void o(f fVar, String str) {
        fVar.getClass();
        str.getClass();
        fVar.zzc |= 1;
        fVar.zzd = str;
    }

    public static a p() {
        return (a) ((q1.b) zzf.i(5));
    }

    public static void r(f fVar, String str) {
        fVar.getClass();
        fVar.zzc |= 2;
        fVar.zze = str;
    }

    /* JADX WARNING: type inference failed for: r4v13, types: [com.google.android.gms.internal.vision.i3<com.google.android.gms.internal.vision.f>, com.google.android.gms.internal.vision.q1$a] */
    public final Object i(int i10) {
        i3<f> i3Var;
        switch (v.f3176a[i10 - 1]) {
            case 1:
                return new f();
            case 2:
                return new a();
            case 3:
                return new k3(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzc", "zzd", "zze"});
            case 4:
                return zzf;
            case 5:
                i3<f> i3Var2 = zzg;
                i3<f> i3Var3 = i3Var2;
                if (i3Var2 == null) {
                    synchronized (f.class) {
                        i3<f> i3Var4 = zzg;
                        i3Var = i3Var4;
                        if (i3Var4 == null) {
                            ? aVar = new q1.a();
                            zzg = aVar;
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
