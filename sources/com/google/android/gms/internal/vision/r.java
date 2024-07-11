package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.q1;

public final class r extends q1<r, a> implements y2 {
    /* access modifiers changed from: private */
    public static final r zzf;
    private static volatile i3<r> zzg;
    private int zzc;
    private int zzd;
    private int zze;

    public static final class a extends q1.b<r, a> implements y2 {
        public a() {
            super(r.zzf);
        }
    }

    static {
        r rVar = new r();
        zzf = rVar;
        q1.l(r.class, rVar);
    }

    /* JADX WARNING: type inference failed for: r4v13, types: [com.google.android.gms.internal.vision.i3<com.google.android.gms.internal.vision.r>, com.google.android.gms.internal.vision.q1$a] */
    public final Object i(int i10) {
        i3<r> i3Var;
        switch (v.f3176a[i10 - 1]) {
            case 1:
                return new r();
            case 2:
                return new a();
            case 3:
                return new k3(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zzc", "zzd", "zze"});
            case 4:
                return zzf;
            case 5:
                i3<r> i3Var2 = zzg;
                i3<r> i3Var3 = i3Var2;
                if (i3Var2 == null) {
                    synchronized (r.class) {
                        i3<r> i3Var4 = zzg;
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
