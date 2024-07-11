package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.q1;

public final class i extends q1<i, a> implements y2 {
    /* access modifiers changed from: private */
    public static final i zzd;
    private static volatile i3<i> zze;
    private a2<r> zzc = l3.f3115r;

    public static final class a extends q1.b<i, a> implements y2 {
        public a() {
            super(i.zzd);
        }
    }

    static {
        i iVar = new i();
        zzd = iVar;
        q1.l(i.class, iVar);
    }

    /* JADX WARNING: type inference failed for: r4v13, types: [com.google.android.gms.internal.vision.i3<com.google.android.gms.internal.vision.i>, com.google.android.gms.internal.vision.q1$a] */
    public final Object i(int i10) {
        i3<i> i3Var;
        switch (v.f3176a[i10 - 1]) {
            case 1:
                return new i();
            case 2:
                return new a();
            case 3:
                return new k3(zzd, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzc", r.class});
            case 4:
                return zzd;
            case 5:
                i3<i> i3Var2 = zze;
                i3<i> i3Var3 = i3Var2;
                if (i3Var2 == null) {
                    synchronized (i.class) {
                        i3<i> i3Var4 = zze;
                        i3Var = i3Var4;
                        if (i3Var4 == null) {
                            ? aVar = new q1.a();
                            zze = aVar;
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
