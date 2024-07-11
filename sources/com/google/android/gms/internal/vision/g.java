package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.q1;
import q0.d;

public final class g extends q1<g, a> implements y2 {
    private static final x1<Integer, i0> zzd = new d(8);
    /* access modifiers changed from: private */
    public static final g zze;
    private static volatile i3<g> zzf;
    private y1 zzc = s1.f3161r;

    public static final class a extends q1.b<g, a> implements y2 {
        public a() {
            super(g.zze);
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [q0.d, com.google.android.gms.internal.vision.x1<java.lang.Integer, com.google.android.gms.internal.vision.i0>] */
    static {
        g gVar = new g();
        zze = gVar;
        q1.l(g.class, gVar);
    }

    /* JADX WARNING: type inference failed for: r4v13, types: [com.google.android.gms.internal.vision.i3<com.google.android.gms.internal.vision.g>, com.google.android.gms.internal.vision.q1$a] */
    public final Object i(int i10) {
        i3<g> i3Var;
        switch (v.f3176a[i10 - 1]) {
            case 1:
                return new g();
            case 2:
                return new a();
            case 3:
                return new k3(zze, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001e", new Object[]{"zzc", i0.zzb()});
            case 4:
                return zze;
            case 5:
                i3<g> i3Var2 = zzf;
                i3<g> i3Var3 = i3Var2;
                if (i3Var2 == null) {
                    synchronized (g.class) {
                        i3<g> i3Var4 = zzf;
                        i3Var = i3Var4;
                        if (i3Var4 == null) {
                            ? aVar = new q1.a();
                            zzf = aVar;
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
