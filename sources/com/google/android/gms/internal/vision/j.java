package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.q1;
import com.karumi.dexter.BuildConfig;

public final class j extends q1<j, a> implements y2 {
    /* access modifiers changed from: private */
    public static final j zzl;
    private static volatile i3<j> zzm;
    private int zzc;
    private String zzd = BuildConfig.FLAVOR;
    private boolean zze;
    private int zzf;
    private long zzg;
    private long zzh;
    private long zzi;
    private String zzj = BuildConfig.FLAVOR;
    private boolean zzk;

    public static final class a extends q1.b<j, a> implements y2 {
        public a() {
            super(j.zzl);
        }
    }

    public enum b implements t1 {
        REASON_UNKNOWN(0),
        REASON_MISSING(1),
        REASON_UPGRADE(2),
        REASON_INVALID(3);
        
        private static final w1<b> zze = null;
        private final int zzf;

        /* access modifiers changed from: public */
        static {
            zze = new w();
        }

        private b(int i10) {
            this.zzf = i10;
        }

        public static b zza(int i10) {
            if (i10 == 0) {
                return REASON_UNKNOWN;
            }
            if (i10 == 1) {
                return REASON_MISSING;
            }
            if (i10 == 2) {
                return REASON_UPGRADE;
            }
            if (i10 != 3) {
                return null;
            }
            return REASON_INVALID;
        }

        public static v1 zzb() {
            return x.f3185a;
        }

        public final String toString() {
            return "<" + b.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzf + " name=" + name() + '>';
        }

        public final int zza() {
            return this.zzf;
        }
    }

    static {
        j jVar = new j();
        zzl = jVar;
        q1.l(j.class, jVar);
    }

    /* JADX WARNING: type inference failed for: r4v13, types: [com.google.android.gms.internal.vision.q1$a, com.google.android.gms.internal.vision.i3<com.google.android.gms.internal.vision.j>] */
    public final Object i(int i10) {
        i3<j> i3Var;
        switch (v.f3176a[i10 - 1]) {
            case 1:
                return new j();
            case 2:
                return new a();
            case 3:
                return new k3(zzl, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဌ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဈ\u0006\bဇ\u0007", new Object[]{"zzc", "zzd", "zze", "zzf", b.zzb(), "zzg", "zzh", "zzi", "zzj", "zzk"});
            case 4:
                return zzl;
            case 5:
                i3<j> i3Var2 = zzm;
                i3<j> i3Var3 = i3Var2;
                if (i3Var2 == null) {
                    synchronized (j.class) {
                        i3<j> i3Var4 = zzm;
                        i3Var = i3Var4;
                        if (i3Var4 == null) {
                            ? aVar = new q1.a();
                            zzm = aVar;
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
