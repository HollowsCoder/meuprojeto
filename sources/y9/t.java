package y9;

import i9.a0;
import i9.b0;
import i9.c0;
import i9.d0;
import i9.e;
import i9.e0;
import i9.f;
import i9.o;
import i9.q;
import i9.r;
import i9.u;
import i9.x;
import java.io.IOException;
import java.util.ArrayList;
import w9.i;
import w9.l;
import w9.v;
import y9.z;
import z8.g;

public final class t<T> implements b<T> {

    /* renamed from: o  reason: collision with root package name */
    public final a0 f9715o;

    /* renamed from: p  reason: collision with root package name */
    public final Object[] f9716p;

    /* renamed from: q  reason: collision with root package name */
    public final e.a f9717q;

    /* renamed from: r  reason: collision with root package name */
    public final f<d0, T> f9718r;

    /* renamed from: s  reason: collision with root package name */
    public volatile boolean f9719s;

    /* renamed from: t  reason: collision with root package name */
    public e f9720t;
    public Throwable u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f9721v;

    public class a implements f {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d f9722a;

        public a(d dVar) {
            this.f9722a = dVar;
        }

        public final void a(Throwable th) {
            try {
                this.f9722a.a(t.this, th);
            } catch (Throwable th2) {
                h0.n(th2);
                th2.printStackTrace();
            }
        }

        public final void b(c0 c0Var) {
            t tVar = t.this;
            try {
                try {
                    this.f9722a.b(tVar, tVar.e(c0Var));
                } catch (Throwable th) {
                    h0.n(th);
                    th.printStackTrace();
                }
            } catch (Throwable th2) {
                h0.n(th2);
                a(th2);
            }
        }
    }

    public static final class b extends d0 {

        /* renamed from: q  reason: collision with root package name */
        public final d0 f9724q;

        /* renamed from: r  reason: collision with root package name */
        public final v f9725r;

        /* renamed from: s  reason: collision with root package name */
        public IOException f9726s;

        public class a extends l {
            public a(i iVar) {
                super(iVar);
            }

            public final long w(w9.f fVar, long j8) {
                try {
                    return super.w(fVar, j8);
                } catch (IOException e10) {
                    b.this.f9726s = e10;
                    throw e10;
                }
            }
        }

        public b(d0 d0Var) {
            this.f9724q = d0Var;
            this.f9725r = n.e.o(new a(d0Var.c()));
        }

        public final long a() {
            return this.f9724q.a();
        }

        public final i9.t b() {
            return this.f9724q.b();
        }

        public final i c() {
            return this.f9725r;
        }

        public final void close() {
            this.f9724q.close();
        }
    }

    public static final class c extends d0 {

        /* renamed from: q  reason: collision with root package name */
        public final i9.t f9728q;

        /* renamed from: r  reason: collision with root package name */
        public final long f9729r;

        public c(i9.t tVar, long j8) {
            this.f9728q = tVar;
            this.f9729r = j8;
        }

        public final long a() {
            return this.f9729r;
        }

        public final i9.t b() {
            return this.f9728q;
        }

        public final i c() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    public t(a0 a0Var, Object[] objArr, e.a aVar, f<d0, T> fVar) {
        this.f9715o = a0Var;
        this.f9716p = objArr;
        this.f9717q = aVar;
        this.f9718r = fVar;
    }

    public final synchronized x a() {
        try {
        } catch (IOException e10) {
            throw new RuntimeException("Unable to create request.", e10);
        }
        return d().a();
    }

    public final boolean b() {
        boolean z = true;
        if (this.f9719s) {
            return true;
        }
        synchronized (this) {
            e eVar = this.f9720t;
            if (eVar == null || !eVar.b()) {
                z = false;
            }
        }
        return z;
    }

    public final e c() {
        r rVar;
        r.a aVar;
        a0 a0Var = this.f9715o;
        a0Var.getClass();
        Object[] objArr = this.f9716p;
        int length = objArr.length;
        x<?>[] xVarArr = a0Var.f9637j;
        if (length == xVarArr.length) {
            z zVar = new z(a0Var.f9631c, a0Var.f9630b, a0Var.d, a0Var.f9632e, a0Var.f9633f, a0Var.f9634g, a0Var.f9635h, a0Var.f9636i);
            if (a0Var.f9638k) {
                length--;
            }
            ArrayList arrayList = new ArrayList(length);
            for (int i10 = 0; i10 < length; i10++) {
                arrayList.add(objArr[i10]);
                xVarArr[i10].a(zVar, objArr[i10]);
            }
            r.a aVar2 = zVar.d;
            if (aVar2 != null) {
                rVar = aVar2.a();
            } else {
                String str = zVar.f9777c;
                r rVar2 = zVar.f9776b;
                rVar2.getClass();
                g.f(str, "link");
                try {
                    aVar = new r.a();
                    aVar.c(rVar2, str);
                } catch (IllegalArgumentException unused) {
                    aVar = null;
                }
                if (aVar != null) {
                    rVar = aVar.a();
                } else {
                    rVar = null;
                }
                if (rVar == null) {
                    throw new IllegalArgumentException("Malformed URL. Base: " + rVar2 + ", Relative: " + zVar.f9777c);
                }
            }
            z.a aVar3 = zVar.f9784k;
            if (aVar3 == null) {
                o.a aVar4 = zVar.f9783j;
                if (aVar4 != null) {
                    aVar3 = new o(aVar4.f6289a, aVar4.f6290b);
                } else {
                    u.a aVar5 = zVar.f9782i;
                    if (aVar5 != null) {
                        ArrayList arrayList2 = aVar5.f6334c;
                        if (!arrayList2.isEmpty()) {
                            aVar3 = new u(aVar5.f6332a, aVar5.f6333b, j9.c.v(arrayList2));
                        } else {
                            throw new IllegalStateException("Multipart body must have at least one part.".toString());
                        }
                    } else if (zVar.f9781h) {
                        byte[] bArr = new byte[0];
                        b0.f6166a.getClass();
                        long j8 = (long) 0;
                        byte[] bArr2 = j9.c.f6602a;
                        if ((j8 | j8) < 0 || j8 > j8 || j8 - j8 < j8) {
                            throw new ArrayIndexOutOfBoundsException();
                        }
                        aVar3 = new a0((i9.t) null, bArr, 0, 0);
                    }
                }
            }
            i9.t tVar = zVar.f9780g;
            q.a aVar6 = zVar.f9779f;
            if (tVar != null) {
                if (aVar3 != null) {
                    aVar3 = new z.a(aVar3, tVar);
                } else {
                    aVar6.a("Content-Type", tVar.f6321a);
                }
            }
            x.a aVar7 = zVar.f9778e;
            aVar7.getClass();
            aVar7.f6370a = rVar;
            aVar7.f6372c = aVar6.d().i();
            aVar7.c(zVar.f9775a, aVar3);
            aVar7.d(l.class, new l(a0Var.f9629a, arrayList));
            m9.e c10 = this.f9717q.c(aVar7.a());
            if (c10 != null) {
                return c10;
            }
            throw new NullPointerException("Call.Factory returned null.");
        }
        throw new IllegalArgumentException("Argument count (" + length + ") doesn't match expected count (" + xVarArr.length + ")");
    }

    public final void cancel() {
        e eVar;
        this.f9719s = true;
        synchronized (this) {
            eVar = this.f9720t;
        }
        if (eVar != null) {
            eVar.cancel();
        }
    }

    public final Object clone() {
        return new t(this.f9715o, this.f9716p, this.f9717q, this.f9718r);
    }

    public final e d() {
        e eVar = this.f9720t;
        if (eVar != null) {
            return eVar;
        }
        Throwable th = this.u;
        if (th == null) {
            try {
                e c10 = c();
                this.f9720t = c10;
                return c10;
            } catch (IOException | Error | RuntimeException e10) {
                h0.n(e10);
                this.u = e10;
                throw e10;
            }
        } else if (th instanceof IOException) {
            throw ((IOException) th);
        } else if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        } else {
            throw ((Error) th);
        }
    }

    public final b0<T> e(c0 c0Var) {
        c0.a aVar = new c0.a(c0Var);
        d0 d0Var = c0Var.f6196v;
        aVar.f6204g = new c(d0Var.b(), d0Var.a());
        c0 a10 = aVar.a();
        int i10 = a10.f6194s;
        if (i10 < 200 || i10 >= 300) {
            try {
                e0 a11 = h0.a(d0Var);
                if (!a10.c()) {
                    return new b0<>(a10, (Object) null, a11);
                }
                throw new IllegalArgumentException("rawResponse should not be successful response");
            } finally {
                d0Var.close();
            }
        } else if (i10 == 204 || i10 == 205) {
            d0Var.close();
            if (a10.c()) {
                return new b0<>(a10, (Object) null, (e0) null);
            }
            throw new IllegalArgumentException("rawResponse must be successful response");
        } else {
            b bVar = new b(d0Var);
            try {
                T a12 = this.f9718r.a(bVar);
                if (a10.c()) {
                    return new b0<>(a10, a12, (e0) null);
                }
                throw new IllegalArgumentException("rawResponse must be successful response");
            } catch (RuntimeException e10) {
                IOException iOException = bVar.f9726s;
                if (iOException == null) {
                    throw e10;
                }
                throw iOException;
            }
        }
    }

    public final void o(d<T> dVar) {
        e eVar;
        Throwable th;
        synchronized (this) {
            if (!this.f9721v) {
                this.f9721v = true;
                eVar = this.f9720t;
                th = this.u;
                if (eVar == null && th == null) {
                    try {
                        e c10 = c();
                        this.f9720t = c10;
                        eVar = c10;
                    } catch (Throwable th2) {
                        th = th2;
                        h0.n(th);
                        this.u = th;
                    }
                }
            } else {
                throw new IllegalStateException("Already executed.");
            }
        }
        if (th != null) {
            dVar.a(this, th);
            return;
        }
        if (this.f9719s) {
            eVar.cancel();
        }
        eVar.g(new a(dVar));
    }

    /* renamed from: clone  reason: collision with other method in class */
    public final b m19clone() {
        return new t(this.f9715o, this.f9716p, this.f9717q, this.f9718r);
    }
}
