package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.q1;
import java.util.ArrayList;

public final class n extends q1<n, a> implements y2 {
    /* access modifiers changed from: private */
    public static final n zzg;
    private static volatile i3<n> zzh;
    private int zzc;
    private o zzd;
    private q zze;
    private a2<k> zzf = l3.f3115r;

    public static final class a extends q1.b<n, a> implements y2 {
        public a() {
            super(n.zzg);
        }
    }

    static {
        n nVar = new n();
        zzg = nVar;
        q1.l(n.class, nVar);
    }

    public static void o(n nVar, o oVar) {
        nVar.getClass();
        nVar.zzd = oVar;
        nVar.zzc |= 1;
    }

    public static void p(n nVar, ArrayList arrayList) {
        int i10;
        a2<k> a2Var = nVar.zzf;
        if (!a2Var.zza()) {
            int size = a2Var.size();
            if (size == 0) {
                i10 = 10;
            } else {
                i10 = size << 1;
            }
            nVar.zzf = a2Var.d(i10);
        }
        n0.a(arrayList, nVar.zzf);
    }

    public static a q() {
        return (a) ((q1.b) zzg.i(5));
    }

    /* JADX WARNING: type inference failed for: r4v13, types: [com.google.android.gms.internal.vision.i3<com.google.android.gms.internal.vision.n>, com.google.android.gms.internal.vision.q1$a] */
    public final Object i(int i10) {
        i3<n> i3Var;
        switch (v.f3176a[i10 - 1]) {
            case 1:
                return new n();
            case 2:
                return new a();
            case 3:
                return new k3(zzg, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001b", new Object[]{"zzc", "zzd", "zze", "zzf", k.class});
            case 4:
                return zzg;
            case 5:
                i3<n> i3Var2 = zzh;
                i3<n> i3Var3 = i3Var2;
                if (i3Var2 == null) {
                    synchronized (n.class) {
                        i3<n> i3Var4 = zzh;
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
