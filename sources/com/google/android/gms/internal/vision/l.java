package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.q1;

public final class l extends q1<l, a> implements y2 {
    /* access modifiers changed from: private */
    public static final l zzj;
    private static volatile i3<l> zzk;
    private int zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private boolean zzg;
    private boolean zzh;
    private float zzi;

    public static final class a extends q1.b<l, a> implements y2 {
        public a() {
            super(l.zzj);
        }
    }

    public enum b implements t1 {
        CLASSIFICATION_UNKNOWN(0),
        CLASSIFICATION_NONE(1),
        CLASSIFICATION_ALL(2);
        
        private static final w1<b> zzd = null;
        private final int zze;

        /* access modifiers changed from: public */
        static {
            zzd = new a0();
        }

        private b(int i10) {
            this.zze = i10;
        }

        public static b zza(int i10) {
            if (i10 == 0) {
                return CLASSIFICATION_UNKNOWN;
            }
            if (i10 == 1) {
                return CLASSIFICATION_NONE;
            }
            if (i10 != 2) {
                return null;
            }
            return CLASSIFICATION_ALL;
        }

        public static v1 zzb() {
            return b0.f3057a;
        }

        public final String toString() {
            return "<" + b.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zze + " name=" + name() + '>';
        }

        public final int zza() {
            return this.zze;
        }
    }

    public enum c implements t1 {
        LANDMARK_UNKNOWN(0),
        LANDMARK_NONE(1),
        LANDMARK_ALL(2),
        LANDMARK_CONTOUR(3);
        
        private static final w1<c> zze = null;
        private final int zzf;

        /* access modifiers changed from: public */
        static {
            zze = new d0();
        }

        private c(int i10) {
            this.zzf = i10;
        }

        public static c zza(int i10) {
            if (i10 == 0) {
                return LANDMARK_UNKNOWN;
            }
            if (i10 == 1) {
                return LANDMARK_NONE;
            }
            if (i10 == 2) {
                return LANDMARK_ALL;
            }
            if (i10 != 3) {
                return null;
            }
            return LANDMARK_CONTOUR;
        }

        public static v1 zzb() {
            return c0.f3067a;
        }

        public final String toString() {
            return "<" + c.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzf + " name=" + name() + '>';
        }

        public final int zza() {
            return this.zzf;
        }
    }

    public enum d implements t1 {
        MODE_UNKNOWN(0),
        MODE_ACCURATE(1),
        MODE_FAST(2),
        MODE_SELFIE(3);
        
        private static final w1<d> zze = null;
        private final int zzf;

        /* access modifiers changed from: public */
        static {
            zze = new e0();
        }

        private d(int i10) {
            this.zzf = i10;
        }

        public static d zza(int i10) {
            if (i10 == 0) {
                return MODE_UNKNOWN;
            }
            if (i10 == 1) {
                return MODE_ACCURATE;
            }
            if (i10 == 2) {
                return MODE_FAST;
            }
            if (i10 != 3) {
                return null;
            }
            return MODE_SELFIE;
        }

        public static v1 zzb() {
            return f0.f3086a;
        }

        public final String toString() {
            return "<" + d.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzf + " name=" + name() + '>';
        }

        public final int zza() {
            return this.zzf;
        }
    }

    static {
        l lVar = new l();
        zzj = lVar;
        q1.l(l.class, lVar);
    }

    /* JADX WARNING: type inference failed for: r4v13, types: [com.google.android.gms.internal.vision.q1$a, com.google.android.gms.internal.vision.i3<com.google.android.gms.internal.vision.l>] */
    public final Object i(int i10) {
        i3<l> i3Var;
        switch (v.f3176a[i10 - 1]) {
            case 1:
                return new l();
            case 2:
                return new a();
            case 3:
                return new k3(zzj, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ခ\u0005", new Object[]{"zzc", "zzd", d.zzb(), "zze", c.zzb(), "zzf", b.zzb(), "zzg", "zzh", "zzi"});
            case 4:
                return zzj;
            case 5:
                i3<l> i3Var2 = zzk;
                i3<l> i3Var3 = i3Var2;
                if (i3Var2 == null) {
                    synchronized (l.class) {
                        i3<l> i3Var4 = zzk;
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
