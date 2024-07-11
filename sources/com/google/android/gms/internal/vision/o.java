package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.q1;

public final class o extends q1<o, b> implements y2 {
    /* access modifiers changed from: private */
    public static final o zzi;
    private static volatile i3<o> zzj;
    private int zzc;
    private int zzd;
    private long zze;
    private long zzf;
    private long zzg;
    private long zzh;

    public enum a implements t1 {
        FORMAT_UNKNOWN(0),
        FORMAT_LUMINANCE(1),
        FORMAT_RGB8(2),
        FORMAT_MONOCHROME(3);
        
        private static final w1<a> zze = null;
        private final int zzf;

        /* access modifiers changed from: public */
        static {
            zze = new h0();
        }

        private a(int i10) {
            this.zzf = i10;
        }

        public static a zza(int i10) {
            if (i10 == 0) {
                return FORMAT_UNKNOWN;
            }
            if (i10 == 1) {
                return FORMAT_LUMINANCE;
            }
            if (i10 == 2) {
                return FORMAT_RGB8;
            }
            if (i10 != 3) {
                return null;
            }
            return FORMAT_MONOCHROME;
        }

        public static v1 zzb() {
            return g0.f3090a;
        }

        public final String toString() {
            return "<" + a.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzf + " name=" + name() + '>';
        }

        public final int zza() {
            return this.zzf;
        }
    }

    public static final class b extends q1.b<o, b> implements y2 {
        public b() {
            super(o.zzi);
        }
    }

    static {
        o oVar = new o();
        zzi = oVar;
        q1.l(o.class, oVar);
    }

    public static void o(o oVar, long j8) {
        oVar.zzc |= 2;
        oVar.zze = j8;
    }

    public static b p() {
        return (b) ((q1.b) zzi.i(5));
    }

    public static void r(o oVar, long j8) {
        oVar.zzc |= 4;
        oVar.zzf = j8;
    }

    public static void s(o oVar, long j8) {
        oVar.zzc |= 8;
        oVar.zzg = j8;
    }

    public static void t(o oVar, long j8) {
        oVar.zzc |= 16;
        oVar.zzh = j8;
    }

    /* JADX WARNING: type inference failed for: r4v13, types: [com.google.android.gms.internal.vision.i3<com.google.android.gms.internal.vision.o>, com.google.android.gms.internal.vision.q1$a] */
    public final Object i(int i10) {
        i3<o> i3Var;
        switch (v.f3176a[i10 - 1]) {
            case 1:
                return new o();
            case 2:
                return new b();
            case 3:
                return new k3(zzi, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0004\u0005ဂ\u0003", new Object[]{"zzc", "zzd", a.zzb(), "zze", "zzf", "zzh", "zzg"});
            case 4:
                return zzi;
            case 5:
                i3<o> i3Var2 = zzj;
                i3<o> i3Var3 = i3Var2;
                if (i3Var2 == null) {
                    synchronized (o.class) {
                        i3<o> i3Var4 = zzj;
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
