package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.q1;

public final class q extends q1<q, a> implements y2 {
    /* access modifiers changed from: private */
    public static final q zzf;
    private static volatile i3<q> zzg;
    private int zzc;
    private long zzd;
    private long zze;

    public static final class a extends q1.b<q, a> implements y2 {
        public a() {
            super(q.zzf);
        }
    }

    static {
        q qVar = new q();
        zzf = qVar;
        q1.l(q.class, qVar);
    }

    /* JADX WARNING: type inference failed for: r4v13, types: [com.google.android.gms.internal.vision.i3<com.google.android.gms.internal.vision.q>, com.google.android.gms.internal.vision.q1$a] */
    public final Object i(int i10) {
        i3<q> i3Var;
        switch (v.f3176a[i10 - 1]) {
            case 1:
                return new q();
            case 2:
                return new a();
            case 3:
                return new k3(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001", new Object[]{"zzc", "zzd", "zze"});
            case 4:
                return zzf;
            case 5:
                i3<q> i3Var2 = zzg;
                i3<q> i3Var3 = i3Var2;
                if (i3Var2 == null) {
                    synchronized (q.class) {
                        i3<q> i3Var4 = zzg;
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
