package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.q1;
import java.util.Iterator;
import java.util.Map;

public final class c3<T> implements m3<T> {

    /* renamed from: a  reason: collision with root package name */
    public final w2 f3070a;

    /* renamed from: b  reason: collision with root package name */
    public final w3<?, ?> f3071b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f3072c;
    public final f1<?> d;

    public c3(w3<?, ?> w3Var, f1<?> f1Var, w2 w2Var) {
        this.f3071b = w3Var;
        this.f3072c = f1Var.d(w2Var);
        this.d = f1Var;
        this.f3070a = w2Var;
    }

    public final void a(T t10) {
        this.f3071b.h(t10);
        this.d.g(t10);
    }

    public final boolean b(T t10, T t11) {
        w3<?, ?> w3Var = this.f3071b;
        if (!w3Var.e(t10).equals(w3Var.e(t11))) {
            return false;
        }
        if (!this.f3072c) {
            return true;
        }
        f1<?> f1Var = this.d;
        return f1Var.a(t10).equals(f1Var.a(t11));
    }

    public final void c(T t10, T t11) {
        Class<?> cls = n3.f3120a;
        w3<?, ?> w3Var = this.f3071b;
        w3Var.d(t10, w3Var.g(w3Var.e(t10), w3Var.e(t11)));
        if (this.f3072c) {
            n3.j(this.d, t10, t11);
        }
    }

    public final int d(T t10) {
        int hashCode = this.f3071b.e(t10).hashCode();
        return this.f3072c ? (hashCode * 53) + this.d.a(t10).hashCode() : hashCode;
    }

    public final int e(T t10) {
        p3<T, Object> p3Var;
        w3<?, ?> w3Var = this.f3071b;
        int i10 = 0;
        int i11 = w3Var.i(w3Var.e(t10)) + 0;
        if (!this.f3072c) {
            return i11;
        }
        j1<?> a10 = this.d.a(t10);
        int i12 = 0;
        while (true) {
            p3Var = a10.f3101a;
            if (i10 >= p3Var.e()) {
                break;
            }
            i12 += j1.h(p3Var.d(i10));
            i10++;
        }
        for (Map.Entry<T, Object> h10 : p3Var.g()) {
            i12 += j1.h(h10);
        }
        return i11 + i12;
    }

    public final boolean f(T t10) {
        return this.d.a(t10).k();
    }

    public final void g(T t10, byte[] bArr, int i10, int i11, t0 t0Var) {
        Throwable th;
        byte[] bArr2 = bArr;
        int i12 = i11;
        t0 t0Var2 = t0Var;
        q1 q1Var = (q1) t10;
        y3 y3Var = q1Var.zzb;
        if (y3Var == y3.f3189f) {
            y3Var = new y3();
            q1Var.zzb = y3Var;
        }
        y3 y3Var2 = y3Var;
        ((q1.c) t10).o();
        Throwable th2 = null;
        int i13 = i10;
        q1.d dVar = null;
        while (i13 < i12) {
            int i14 = s0.i(bArr2, i13, t0Var2);
            int i15 = t0Var2.f3164a;
            int i16 = 2;
            w2 w2Var = this.f3070a;
            f1<?> f1Var = this.d;
            d1 d1Var = t0Var2.d;
            if (i15 == 11) {
                int i17 = 0;
                Object obj = th2;
                while (true) {
                    if (i14 >= i12) {
                        th = th2;
                        break;
                    }
                    i14 = s0.i(bArr2, i14, t0Var2);
                    int i18 = t0Var2.f3164a;
                    int i19 = i18 >>> 3;
                    int i20 = i18 & 7;
                    if (i19 != i16) {
                        if (i19 == 3) {
                            if (dVar != null) {
                                j3 j3Var = j3.f3104c;
                                throw null;
                            } else if (i20 == 2) {
                                i14 = s0.q(bArr2, i14, t0Var2);
                                obj = (w0) t0Var2.f3166c;
                                th = null;
                                th2 = th;
                                i16 = 2;
                            }
                        }
                        th = null;
                    } else {
                        th = null;
                        if (i20 == 0) {
                            int i21 = s0.i(bArr2, i14, t0Var2);
                            int i22 = t0Var2.f3164a;
                            i14 = i21;
                            i17 = i22;
                            dVar = f1Var.b(d1Var, w2Var, i22);
                            th2 = th;
                            i16 = 2;
                        }
                    }
                    if (i18 == 12) {
                        break;
                    }
                    i14 = s0.b(i18, bArr2, i14, i12, t0Var2);
                    th2 = th;
                    i16 = 2;
                }
                if (obj != null) {
                    y3Var2.a((i17 << 3) | 2, obj);
                }
                i13 = i14;
                th2 = th;
            } else if ((i15 & 7) == 2) {
                q1.d b10 = f1Var.b(d1Var, w2Var, i15 >>> 3);
                if (b10 == null) {
                    i13 = s0.d(i15, bArr, i14, i11, y3Var2, t0Var);
                    dVar = b10;
                } else {
                    j3 j3Var2 = j3.f3104c;
                    throw th2;
                }
            } else {
                i13 = s0.b(i15, bArr2, i14, i12, t0Var2);
            }
        }
        if (i13 != i12) {
            throw z1.c();
        }
    }

    public final T h() {
        return this.f3070a.m().q();
    }

    public final void i(Object obj, b1 b1Var) {
        Object obj2;
        Iterator<Map.Entry<?, Object>> i10 = this.d.a(obj).i();
        while (i10.hasNext()) {
            Map.Entry next = i10.next();
            l1 l1Var = (l1) next.getKey();
            if (l1Var.zzc() == n4.MESSAGE) {
                l1Var.b();
                l1Var.c();
                boolean z = next instanceof f2;
                l1Var.zza();
                if (z) {
                    obj2 = ((f2) next).f3087o.getValue().b();
                } else {
                    obj2 = next.getValue();
                }
                b1Var.g(0, obj2);
            } else {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
        }
        w3<?, ?> w3Var = this.f3071b;
        w3Var.f(w3Var.e(obj), b1Var);
    }
}
