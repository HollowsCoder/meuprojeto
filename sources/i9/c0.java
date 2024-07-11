package i9;

import i9.d;
import i9.q;
import java.io.Closeable;
import m9.c;
import z8.g;

public final class c0 implements Closeable {
    public final long A;
    public final c B;

    /* renamed from: o  reason: collision with root package name */
    public d f6190o;

    /* renamed from: p  reason: collision with root package name */
    public final x f6191p;

    /* renamed from: q  reason: collision with root package name */
    public final w f6192q;

    /* renamed from: r  reason: collision with root package name */
    public final String f6193r;

    /* renamed from: s  reason: collision with root package name */
    public final int f6194s;

    /* renamed from: t  reason: collision with root package name */
    public final p f6195t;
    public final q u;

    /* renamed from: v  reason: collision with root package name */
    public final d0 f6196v;
    public final c0 w;

    /* renamed from: x  reason: collision with root package name */
    public final c0 f6197x;

    /* renamed from: y  reason: collision with root package name */
    public final c0 f6198y;
    public final long z;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public x f6199a;

        /* renamed from: b  reason: collision with root package name */
        public w f6200b;

        /* renamed from: c  reason: collision with root package name */
        public int f6201c;
        public String d;

        /* renamed from: e  reason: collision with root package name */
        public p f6202e;

        /* renamed from: f  reason: collision with root package name */
        public q.a f6203f;

        /* renamed from: g  reason: collision with root package name */
        public d0 f6204g;

        /* renamed from: h  reason: collision with root package name */
        public c0 f6205h;

        /* renamed from: i  reason: collision with root package name */
        public c0 f6206i;

        /* renamed from: j  reason: collision with root package name */
        public c0 f6207j;

        /* renamed from: k  reason: collision with root package name */
        public long f6208k;
        public long l;

        /* renamed from: m  reason: collision with root package name */
        public c f6209m;

        public a() {
            this.f6201c = -1;
            this.f6203f = new q.a();
        }

        public a(c0 c0Var) {
            g.f(c0Var, "response");
            this.f6199a = c0Var.f6191p;
            this.f6200b = c0Var.f6192q;
            this.f6201c = c0Var.f6194s;
            this.d = c0Var.f6193r;
            this.f6202e = c0Var.f6195t;
            this.f6203f = c0Var.u.i();
            this.f6204g = c0Var.f6196v;
            this.f6205h = c0Var.w;
            this.f6206i = c0Var.f6197x;
            this.f6207j = c0Var.f6198y;
            this.f6208k = c0Var.z;
            this.l = c0Var.A;
            this.f6209m = c0Var.B;
        }

        public static void b(String str, c0 c0Var) {
            if (c0Var != null) {
                boolean z = true;
                if (c0Var.f6196v == null) {
                    if (c0Var.w == null) {
                        if (c0Var.f6197x == null) {
                            if (c0Var.f6198y != null) {
                                z = false;
                            }
                            if (!z) {
                                throw new IllegalArgumentException(str.concat(".priorResponse != null").toString());
                            }
                            return;
                        }
                        throw new IllegalArgumentException(str.concat(".cacheResponse != null").toString());
                    }
                    throw new IllegalArgumentException(str.concat(".networkResponse != null").toString());
                }
                throw new IllegalArgumentException(str.concat(".body != null").toString());
            }
        }

        public final c0 a() {
            int i10 = this.f6201c;
            if (i10 >= 0) {
                x xVar = this.f6199a;
                if (xVar != null) {
                    w wVar = this.f6200b;
                    if (wVar != null) {
                        String str = this.d;
                        if (str != null) {
                            return new c0(xVar, wVar, str, i10, this.f6202e, this.f6203f.d(), this.f6204g, this.f6205h, this.f6206i, this.f6207j, this.f6208k, this.l, this.f6209m);
                        }
                        throw new IllegalStateException("message == null".toString());
                    }
                    throw new IllegalStateException("protocol == null".toString());
                }
                throw new IllegalStateException("request == null".toString());
            }
            throw new IllegalStateException(("code < 0: " + this.f6201c).toString());
        }

        public final void c(q qVar) {
            g.f(qVar, "headers");
            this.f6203f = qVar.i();
        }
    }

    public c0(x xVar, w wVar, String str, int i10, p pVar, q qVar, d0 d0Var, c0 c0Var, c0 c0Var2, c0 c0Var3, long j8, long j10, c cVar) {
        this.f6191p = xVar;
        this.f6192q = wVar;
        this.f6193r = str;
        this.f6194s = i10;
        this.f6195t = pVar;
        this.u = qVar;
        this.f6196v = d0Var;
        this.w = c0Var;
        this.f6197x = c0Var2;
        this.f6198y = c0Var3;
        this.z = j8;
        this.A = j10;
        this.B = cVar;
    }

    public static String b(c0 c0Var, String str) {
        c0Var.getClass();
        String e10 = c0Var.u.e(str);
        if (e10 != null) {
            return e10;
        }
        return null;
    }

    public final d a() {
        d dVar = this.f6190o;
        if (dVar != null) {
            return dVar;
        }
        d.f6211o.getClass();
        d a10 = d.b.a(this.u);
        this.f6190o = a10;
        return a10;
    }

    public final boolean c() {
        int i10 = this.f6194s;
        return 200 <= i10 && 299 >= i10;
    }

    public final void close() {
        d0 d0Var = this.f6196v;
        if (d0Var != null) {
            d0Var.close();
            return;
        }
        throw new IllegalStateException("response is not eligible for a body and must not be closed".toString());
    }

    public final String toString() {
        return "Response{protocol=" + this.f6192q + ", code=" + this.f6194s + ", message=" + this.f6193r + ", url=" + this.f6191p.f6366b + '}';
    }
}
