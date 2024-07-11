package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.q1;
import com.karumi.dexter.BuildConfig;

public final class k extends q1<k, b> implements y2 {
    /* access modifiers changed from: private */
    public static final k zzl;
    private static volatile i3<k> zzm;
    private int zzc;
    private String zzd = BuildConfig.FLAVOR;
    private String zze = BuildConfig.FLAVOR;
    private a2<String> zzf;
    private int zzg;
    private String zzh;
    private long zzi;
    private long zzj;
    private a2<s> zzk;

    public enum a implements t1 {
        RESULT_UNKNOWN(0),
        RESULT_SUCCESS(1),
        RESULT_FAIL(2),
        RESULT_SKIPPED(3);
        
        private static final w1<a> zze = null;
        private final int zzf;

        /* access modifiers changed from: public */
        static {
            zze = new z();
        }

        private a(int i10) {
            this.zzf = i10;
        }

        public static a zza(int i10) {
            if (i10 == 0) {
                return RESULT_UNKNOWN;
            }
            if (i10 == 1) {
                return RESULT_SUCCESS;
            }
            if (i10 == 2) {
                return RESULT_FAIL;
            }
            if (i10 != 3) {
                return null;
            }
            return RESULT_SKIPPED;
        }

        public static v1 zzb() {
            return y.f3188a;
        }

        public final String toString() {
            return "<" + a.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzf + " name=" + name() + '>';
        }

        public final int zza() {
            return this.zzf;
        }
    }

    public static final class b extends q1.b<k, b> implements y2 {
        public b() {
            super(k.zzl);
        }
    }

    static {
        k kVar = new k();
        zzl = kVar;
        q1.l(k.class, kVar);
    }

    public k() {
        l3<Object> l3Var = l3.f3115r;
        this.zzf = l3Var;
        this.zzh = BuildConfig.FLAVOR;
        this.zzk = l3Var;
    }

    public static void o(k kVar, long j8) {
        kVar.zzc |= 16;
        kVar.zzi = j8;
    }

    public static void p(k kVar, Iterable iterable) {
        int i10;
        a2<s> a2Var = kVar.zzk;
        if (!a2Var.zza()) {
            int size = a2Var.size();
            if (size == 0) {
                i10 = 10;
            } else {
                i10 = size << 1;
            }
            kVar.zzk = a2Var.d(i10);
        }
        n0.a(iterable, kVar.zzk);
    }

    public static void q(k kVar, String str) {
        kVar.getClass();
        str.getClass();
        kVar.zzc |= 1;
        kVar.zzd = str;
    }

    public static b r() {
        return (b) ((q1.b) zzl.i(5));
    }

    public static void t(k kVar, long j8) {
        kVar.zzc |= 32;
        kVar.zzj = j8;
    }

    /* JADX WARNING: type inference failed for: r4v13, types: [com.google.android.gms.internal.vision.i3<com.google.android.gms.internal.vision.k>, com.google.android.gms.internal.vision.q1$a] */
    public final Object i(int i10) {
        i3<k> i3Var;
        switch (v.f3176a[i10 - 1]) {
            case 1:
                return new k();
            case 2:
                return new b();
            case 3:
                return new k3(zzl, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0002\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003\u001a\u0004ဌ\u0002\u0005ဈ\u0003\u0006ဂ\u0004\u0007ဂ\u0005\b\u001b", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", a.zzb(), "zzh", "zzi", "zzj", "zzk", s.class});
            case 4:
                return zzl;
            case 5:
                i3<k> i3Var2 = zzm;
                i3<k> i3Var3 = i3Var2;
                if (i3Var2 == null) {
                    synchronized (k.class) {
                        i3<k> i3Var4 = zzm;
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
