package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.p0;
import com.karumi.dexter.BuildConfig;
import java.io.IOException;

public final class v3 extends p0<v3, a> implements t1 {
    private static volatile b2<v3> zzbg;
    /* access modifiers changed from: private */
    public static final v3 zzbir;
    private u0<b> zzbiq = e2.f2413q;

    public static final class a extends p0.a<v3, a> implements t1 {
        public a() {
            super(v3.zzbir);
        }
    }

    public static final class b extends p0<b, a> implements t1 {
        private static volatile b2<b> zzbg;
        /* access modifiers changed from: private */
        public static final b zzbiv;
        private int zzbb;
        private String zzbis = BuildConfig.FLAVOR;
        private long zzbit;
        private long zzbiu;
        private int zzya;

        public static final class a extends p0.a<b, a> implements t1 {
            public a() {
                super(b.zzbiv);
            }
        }

        static {
            b bVar = new b();
            zzbiv = bVar;
            p0.m(b.class, bVar);
        }

        public static void p(b bVar, long j8) {
            bVar.zzbb |= 4;
            bVar.zzbit = j8;
        }

        public static void q(b bVar, String str) {
            bVar.getClass();
            str.getClass();
            bVar.zzbb |= 2;
            bVar.zzbis = str;
        }

        public static void r(b bVar, long j8) {
            bVar.zzbb |= 8;
            bVar.zzbiu = j8;
        }

        public static a w() {
            return (a) ((p0.a) zzbiv.e(5));
        }

        /* JADX WARNING: type inference failed for: r4v13, types: [com.google.android.gms.internal.clearcut.p0$b, com.google.android.gms.internal.clearcut.b2<com.google.android.gms.internal.clearcut.v3$b>] */
        public final Object e(int i10) {
            b2<b> b2Var;
            switch (w3.f2575a[i10 - 1]) {
                case 1:
                    return new b();
                case 2:
                    return new a();
                case 3:
                    return new f2(zzbiv, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0005\u0000\u0000\u0000\u0001\u0004\u0000\u0002\b\u0001\u0003\u0002\u0002\u0004\u0002\u0003", new Object[]{"zzbb", "zzya", "zzbis", "zzbit", "zzbiu"});
                case 4:
                    return zzbiv;
                case 5:
                    b2<b> b2Var2 = zzbg;
                    b2<b> b2Var3 = b2Var2;
                    if (b2Var2 == null) {
                        synchronized (b.class) {
                            b2<b> b2Var4 = zzbg;
                            b2Var = b2Var4;
                            if (b2Var4 == null) {
                                ? bVar = new p0.b();
                                zzbg = bVar;
                                b2Var = bVar;
                            }
                        }
                        b2Var3 = b2Var;
                    }
                    return b2Var3;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public final int o() {
            return this.zzya;
        }

        public final boolean s() {
            return (this.zzbb & 1) == 1;
        }

        public final String t() {
            return this.zzbis;
        }

        public final long u() {
            return this.zzbit;
        }

        public final long v() {
            return this.zzbiu;
        }
    }

    static {
        v3 v3Var = new v3();
        zzbir = v3Var;
        p0.m(v3.class, v3Var);
    }

    public static v3 p() {
        return zzbir;
    }

    public static v3 r(byte[] bArr) {
        p0 p0Var = (p0) zzbir.e(4);
        try {
            d2 d2Var = d2.f2398c;
            d2Var.getClass();
            d2Var.a(p0Var.getClass()).c(p0Var, bArr, 0, bArr.length, new r());
            d2Var.a(p0Var.getClass()).a(p0Var);
            if (p0Var.zzex == 0) {
                boolean z = true;
                byte byteValue = ((Byte) p0Var.e(1)).byteValue();
                if (byteValue != 1) {
                    if (byteValue == 0) {
                        z = false;
                    } else {
                        z = d2Var.a(p0Var.getClass()).h(p0Var);
                        p0Var.e(2);
                    }
                }
                if (z) {
                    return (v3) p0Var;
                }
                throw new v0(new t2().getMessage());
            }
            throw new RuntimeException();
        } catch (IOException e10) {
            if (e10.getCause() instanceof v0) {
                throw ((v0) e10.getCause());
            }
            throw new v0(e10.getMessage());
        } catch (IndexOutOfBoundsException unused) {
            throw v0.a();
        }
    }

    /* JADX WARNING: type inference failed for: r4v13, types: [com.google.android.gms.internal.clearcut.b2<com.google.android.gms.internal.clearcut.v3>, com.google.android.gms.internal.clearcut.p0$b] */
    public final Object e(int i10) {
        b2<v3> b2Var;
        switch (w3.f2575a[i10 - 1]) {
            case 1:
                return new v3();
            case 2:
                return new a();
            case 3:
                return new f2(zzbir, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0002\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzbiq", b.class});
            case 4:
                return zzbir;
            case 5:
                b2<v3> b2Var2 = zzbg;
                b2<v3> b2Var3 = b2Var2;
                if (b2Var2 == null) {
                    synchronized (v3.class) {
                        b2<v3> b2Var4 = zzbg;
                        b2Var = b2Var4;
                        if (b2Var4 == null) {
                            ? bVar = new p0.b();
                            zzbg = bVar;
                            b2Var = bVar;
                        }
                    }
                    b2Var3 = b2Var;
                }
                return b2Var3;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final u0 o() {
        return this.zzbiq;
    }
}
