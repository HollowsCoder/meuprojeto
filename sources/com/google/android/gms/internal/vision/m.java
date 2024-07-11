package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.q1;

public final class m extends q1<m, a> implements y2 {
    /* access modifiers changed from: private */
    public static final m zzj;
    private static volatile i3<m> zzk;
    private int zzc;
    private float zzd;
    private float zze;
    private float zzf;
    private float zzg;
    private float zzh;
    private float zzi;

    public static final class a extends q1.b<m, a> implements y2 {
        public a() {
            super(m.zzj);
        }
    }

    static {
        m mVar = new m();
        zzj = mVar;
        q1.l(m.class, mVar);
    }

    /* JADX WARNING: type inference failed for: r4v13, types: [com.google.android.gms.internal.vision.q1$a, com.google.android.gms.internal.vision.i3<com.google.android.gms.internal.vision.m>] */
    public final Object i(int i10) {
        i3<m> i3Var;
        switch (v.f3176a[i10 - 1]) {
            case 1:
                return new m();
            case 2:
                return new a();
            case 3:
                return new k3(zzj, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003\u0005ခ\u0004\u0006ခ\u0005", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzj;
            case 5:
                i3<m> i3Var2 = zzk;
                i3<m> i3Var3 = i3Var2;
                if (i3Var2 == null) {
                    synchronized (m.class) {
                        i3<m> i3Var4 = zzk;
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
