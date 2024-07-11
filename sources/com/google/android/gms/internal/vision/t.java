package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.q1;

public final class t extends q1<t, a> implements y2 {
    /* access modifiers changed from: private */
    public static final t zzi;
    private static volatile i3<t> zzj;
    private int zzc;
    private j zzd;
    private p zze;
    private n zzf;
    private int zzg;
    private boolean zzh;

    public static final class a extends q1.b<t, a> implements y2 {
        public a() {
            super(t.zzi);
        }
    }

    static {
        t tVar = new t();
        zzi = tVar;
        q1.l(t.class, tVar);
    }

    public static void o(t tVar, n nVar) {
        tVar.getClass();
        tVar.zzf = nVar;
        tVar.zzc |= 4;
    }

    public static a p() {
        return (a) ((q1.b) zzi.i(5));
    }

    /* JADX WARNING: type inference failed for: r4v13, types: [com.google.android.gms.internal.vision.i3<com.google.android.gms.internal.vision.t>, com.google.android.gms.internal.vision.q1$a] */
    public final Object i(int i10) {
        i3<t> i3Var;
        switch (v.f3176a[i10 - 1]) {
            case 1:
                return new t();
            case 2:
                return new a();
            case 3:
                return new k3(zzi, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004င\u0003\u0005ဇ\u0004", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzi;
            case 5:
                i3<t> i3Var2 = zzj;
                i3<t> i3Var3 = i3Var2;
                if (i3Var2 == null) {
                    synchronized (t.class) {
                        i3<t> i3Var4 = zzj;
                        i3Var = i3Var4;
                        if (i3Var4 == null) {
                            ? aVar = new q1.a();
                            zzj = aVar;
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
