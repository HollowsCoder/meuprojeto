package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.q1;

public final class s extends q1<s, a> implements y2 {
    /* access modifiers changed from: private */
    public static final s zzh;
    private static volatile i3<s> zzi;
    private int zzc;
    private i zzd;
    private int zze;
    private m zzf;
    private h zzg;

    public static final class a extends q1.b<s, a> implements y2 {
        public a() {
            super(s.zzh);
        }
    }

    static {
        s sVar = new s();
        zzh = sVar;
        q1.l(s.class, sVar);
    }

    /* JADX WARNING: type inference failed for: r4v13, types: [com.google.android.gms.internal.vision.i3<com.google.android.gms.internal.vision.s>, com.google.android.gms.internal.vision.q1$a] */
    public final Object i(int i10) {
        i3<s> i3Var;
        switch (v.f3176a[i10 - 1]) {
            case 1:
                return new s();
            case 2:
                return new a();
            case 3:
                return new k3(zzh, "\u0001\u0004\u0000\u0001\u0001\u0011\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002င\u0001\u0010ဉ\u0002\u0011ဉ\u0003", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
            case 4:
                return zzh;
            case 5:
                i3<s> i3Var2 = zzi;
                i3<s> i3Var3 = i3Var2;
                if (i3Var2 == null) {
                    synchronized (s.class) {
                        i3<s> i3Var4 = zzi;
                        i3Var = i3Var4;
                        if (i3Var4 == null) {
                            ? aVar = new q1.a();
                            zzi = aVar;
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
