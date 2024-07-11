package o9;

import androidx.appcompat.widget.x0;
import f9.l;
import i9.c0;
import i9.q;
import i9.r;
import i9.v;
import i9.w;
import i9.x;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.util.concurrent.TimeUnit;
import m9.h;
import n9.i;
import w9.b0;
import w9.c0;
import w9.i;
import w9.m;
import w9.z;
import z8.g;

public final class b implements n9.d {

    /* renamed from: a  reason: collision with root package name */
    public int f7769a;

    /* renamed from: b  reason: collision with root package name */
    public final a f7770b;

    /* renamed from: c  reason: collision with root package name */
    public q f7771c;
    public final v d;

    /* renamed from: e  reason: collision with root package name */
    public final h f7772e;

    /* renamed from: f  reason: collision with root package name */
    public final i f7773f;

    /* renamed from: g  reason: collision with root package name */
    public final w9.h f7774g;

    public abstract class a implements b0 {

        /* renamed from: o  reason: collision with root package name */
        public final m f7775o;

        /* renamed from: p  reason: collision with root package name */
        public boolean f7776p;

        public a() {
            this.f7775o = new m(b.this.f7773f.h());
        }

        public final void a() {
            b bVar = b.this;
            int i10 = bVar.f7769a;
            if (i10 != 6) {
                if (i10 == 5) {
                    b.i(bVar, this.f7775o);
                    bVar.f7769a = 6;
                    return;
                }
                throw new IllegalStateException("state: " + bVar.f7769a);
            }
        }

        public final c0 h() {
            return this.f7775o;
        }

        public long w(w9.f fVar, long j8) {
            b bVar = b.this;
            g.f(fVar, "sink");
            try {
                return bVar.f7773f.w(fVar, j8);
            } catch (IOException e10) {
                bVar.f7772e.k();
                a();
                throw e10;
            }
        }
    }

    /* renamed from: o9.b$b  reason: collision with other inner class name */
    public final class C0113b implements z {

        /* renamed from: o  reason: collision with root package name */
        public final m f7778o;

        /* renamed from: p  reason: collision with root package name */
        public boolean f7779p;

        public C0113b() {
            this.f7778o = new m(b.this.f7774g.h());
        }

        public final void H(w9.f fVar, long j8) {
            g.f(fVar, "source");
            if (!(!this.f7779p)) {
                throw new IllegalStateException("closed".toString());
            } else if (j8 != 0) {
                b bVar = b.this;
                bVar.f7774g.p(j8);
                bVar.f7774g.Y("\r\n");
                bVar.f7774g.H(fVar, j8);
                bVar.f7774g.Y("\r\n");
            }
        }

        public final synchronized void close() {
            if (!this.f7779p) {
                this.f7779p = true;
                b.this.f7774g.Y("0\r\n\r\n");
                b.i(b.this, this.f7778o);
                b.this.f7769a = 3;
            }
        }

        public final synchronized void flush() {
            if (!this.f7779p) {
                b.this.f7774g.flush();
            }
        }

        public final c0 h() {
            return this.f7778o;
        }
    }

    public final class c extends a {

        /* renamed from: r  reason: collision with root package name */
        public long f7781r = -1;

        /* renamed from: s  reason: collision with root package name */
        public boolean f7782s = true;

        /* renamed from: t  reason: collision with root package name */
        public final r f7783t;
        public final /* synthetic */ b u;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(b bVar, r rVar) {
            super();
            g.f(rVar, "url");
            this.u = bVar;
            this.f7783t = rVar;
        }

        public final void close() {
            if (!this.f7776p) {
                if (this.f7782s && !j9.c.g(this, TimeUnit.MILLISECONDS)) {
                    this.u.f7772e.k();
                    a();
                }
                this.f7776p = true;
            }
        }

        public final long w(w9.f fVar, long j8) {
            boolean z;
            g.f(fVar, "sink");
            boolean z10 = true;
            if (j8 >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                throw new IllegalArgumentException(b0.d.d("byteCount < 0: ", j8).toString());
            } else if (!(!this.f7776p)) {
                throw new IllegalStateException("closed".toString());
            } else if (!this.f7782s) {
                return -1;
            } else {
                long j10 = this.f7781r;
                int i10 = (j10 > 0 ? 1 : (j10 == 0 ? 0 : -1));
                b bVar = this.u;
                if (i10 == 0 || j10 == -1) {
                    if (j10 != -1) {
                        bVar.f7773f.D();
                    }
                    try {
                        this.f7781r = bVar.f7773f.c0();
                        String D = bVar.f7773f.D();
                        if (D != null) {
                            String obj = l.q0(D).toString();
                            if (this.f7781r >= 0) {
                                if (obj.length() <= 0) {
                                    z10 = false;
                                }
                                if (!z10 || f9.h.a0(obj, ";", false)) {
                                    if (this.f7781r == 0) {
                                        this.f7782s = false;
                                        bVar.f7771c = bVar.f7770b.a();
                                        v vVar = bVar.d;
                                        g.c(vVar);
                                        q qVar = bVar.f7771c;
                                        g.c(qVar);
                                        n9.e.b(vVar.f6345x, this.f7783t, qVar);
                                        a();
                                    }
                                    if (!this.f7782s) {
                                        return -1;
                                    }
                                }
                            }
                            throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f7781r + obj + '\"');
                        }
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
                    } catch (NumberFormatException e10) {
                        throw new ProtocolException(e10.getMessage());
                    }
                }
                long w = super.w(fVar, Math.min(j8, this.f7781r));
                if (w != -1) {
                    this.f7781r -= w;
                    return w;
                }
                bVar.f7772e.k();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                a();
                throw protocolException;
            }
        }
    }

    public final class d extends a {

        /* renamed from: r  reason: collision with root package name */
        public long f7784r;

        public d(long j8) {
            super();
            this.f7784r = j8;
            if (j8 == 0) {
                a();
            }
        }

        public final void close() {
            if (!this.f7776p) {
                if (this.f7784r != 0 && !j9.c.g(this, TimeUnit.MILLISECONDS)) {
                    b.this.f7772e.k();
                    a();
                }
                this.f7776p = true;
            }
        }

        public final long w(w9.f fVar, long j8) {
            boolean z;
            g.f(fVar, "sink");
            if (j8 >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                throw new IllegalArgumentException(b0.d.d("byteCount < 0: ", j8).toString());
            } else if (!this.f7776p) {
                long j10 = this.f7784r;
                if (j10 == 0) {
                    return -1;
                }
                long w = super.w(fVar, Math.min(j10, j8));
                if (w != -1) {
                    long j11 = this.f7784r - w;
                    this.f7784r = j11;
                    if (j11 == 0) {
                        a();
                    }
                    return w;
                }
                b.this.f7772e.k();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                a();
                throw protocolException;
            } else {
                throw new IllegalStateException("closed".toString());
            }
        }
    }

    public final class e implements z {

        /* renamed from: o  reason: collision with root package name */
        public final m f7786o;

        /* renamed from: p  reason: collision with root package name */
        public boolean f7787p;

        public e() {
            this.f7786o = new m(b.this.f7774g.h());
        }

        public final void H(w9.f fVar, long j8) {
            g.f(fVar, "source");
            if (!this.f7787p) {
                long j10 = fVar.f9325p;
                byte[] bArr = j9.c.f6602a;
                if ((0 | j8) < 0 || 0 > j10 || j10 - 0 < j8) {
                    throw new ArrayIndexOutOfBoundsException();
                }
                b.this.f7774g.H(fVar, j8);
                return;
            }
            throw new IllegalStateException("closed".toString());
        }

        public final void close() {
            if (!this.f7787p) {
                this.f7787p = true;
                m mVar = this.f7786o;
                b bVar = b.this;
                b.i(bVar, mVar);
                bVar.f7769a = 3;
            }
        }

        public final void flush() {
            if (!this.f7787p) {
                b.this.f7774g.flush();
            }
        }

        public final c0 h() {
            return this.f7786o;
        }
    }

    public final class f extends a {

        /* renamed from: r  reason: collision with root package name */
        public boolean f7789r;

        public f(b bVar) {
            super();
        }

        public final void close() {
            if (!this.f7776p) {
                if (!this.f7789r) {
                    a();
                }
                this.f7776p = true;
            }
        }

        public final long w(w9.f fVar, long j8) {
            boolean z;
            g.f(fVar, "sink");
            if (j8 >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                throw new IllegalArgumentException(b0.d.d("byteCount < 0: ", j8).toString());
            } else if (!(!this.f7776p)) {
                throw new IllegalStateException("closed".toString());
            } else if (this.f7789r) {
                return -1;
            } else {
                long w = super.w(fVar, j8);
                if (w != -1) {
                    return w;
                }
                this.f7789r = true;
                a();
                return -1;
            }
        }
    }

    public b(v vVar, h hVar, i iVar, w9.h hVar2) {
        g.f(hVar, "connection");
        this.d = vVar;
        this.f7772e = hVar;
        this.f7773f = iVar;
        this.f7774g = hVar2;
        this.f7770b = new a(iVar);
    }

    public static final void i(b bVar, m mVar) {
        bVar.getClass();
        c0 c0Var = mVar.f9334e;
        c0.a aVar = c0.d;
        g.f(aVar, "delegate");
        mVar.f9334e = aVar;
        c0Var.a();
        c0Var.b();
    }

    public final void a() {
        this.f7774g.flush();
    }

    public final void b() {
        this.f7774g.flush();
    }

    public final long c(i9.c0 c0Var) {
        if (!n9.e.a(c0Var)) {
            return 0;
        }
        if (f9.h.V("chunked", i9.c0.b(c0Var, "Transfer-Encoding"))) {
            return -1;
        }
        return j9.c.j(c0Var);
    }

    public final void cancel() {
        Socket socket = this.f7772e.f7253b;
        if (socket != null) {
            j9.c.d(socket);
        }
    }

    public final z d(x xVar, long j8) {
        boolean z = true;
        if (f9.h.V("chunked", xVar.d.e("Transfer-Encoding"))) {
            if (this.f7769a != 1) {
                z = false;
            }
            if (z) {
                this.f7769a = 2;
                return new C0113b();
            }
            throw new IllegalStateException(("state: " + this.f7769a).toString());
        } else if (j8 != -1) {
            if (this.f7769a != 1) {
                z = false;
            }
            if (z) {
                this.f7769a = 2;
                return new e();
            }
            throw new IllegalStateException(("state: " + this.f7769a).toString());
        } else {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
    }

    public final b0 e(i9.c0 c0Var) {
        if (!n9.e.a(c0Var)) {
            return j(0);
        }
        boolean z = true;
        if (f9.h.V("chunked", i9.c0.b(c0Var, "Transfer-Encoding"))) {
            r rVar = c0Var.f6191p.f6366b;
            if (this.f7769a != 4) {
                z = false;
            }
            if (z) {
                this.f7769a = 5;
                return new c(this, rVar);
            }
            throw new IllegalStateException(("state: " + this.f7769a).toString());
        }
        long j8 = j9.c.j(c0Var);
        if (j8 != -1) {
            return j(j8);
        }
        if (this.f7769a != 4) {
            z = false;
        }
        if (z) {
            this.f7769a = 5;
            this.f7772e.k();
            return new f(this);
        }
        throw new IllegalStateException(("state: " + this.f7769a).toString());
    }

    public final c0.a f(boolean z) {
        a aVar = this.f7770b;
        int i10 = this.f7769a;
        boolean z10 = true;
        if (!(i10 == 1 || i10 == 3)) {
            z10 = false;
        }
        if (z10) {
            try {
                String R = aVar.f7768b.R(aVar.f7767a);
                aVar.f7767a -= (long) R.length();
                n9.i a10 = i.a.a(R);
                int i11 = a10.f7520b;
                c0.a aVar2 = new c0.a();
                w wVar = a10.f7519a;
                g.f(wVar, "protocol");
                aVar2.f6200b = wVar;
                aVar2.f6201c = i11;
                String str = a10.f7521c;
                g.f(str, "message");
                aVar2.d = str;
                aVar2.c(aVar.a());
                if (z && i11 == 100) {
                    return null;
                }
                if (i11 == 100) {
                    this.f7769a = 3;
                    return aVar2;
                }
                this.f7769a = 4;
                return aVar2;
            } catch (EOFException e10) {
                throw new IOException(x0.e("unexpected end of stream on ", this.f7772e.f7266q.f6237a.f6152a.f()), e10);
            }
        } else {
            throw new IllegalStateException(("state: " + this.f7769a).toString());
        }
    }

    public final void g(x xVar) {
        boolean z;
        Proxy.Type type = this.f7772e.f7266q.f6238b.type();
        g.e(type, "connection.route().proxy.type()");
        StringBuilder sb = new StringBuilder();
        sb.append(xVar.f6367c);
        sb.append(' ');
        r rVar = xVar.f6366b;
        if (rVar.f6303a || type != Proxy.Type.HTTP) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            sb.append(rVar);
        } else {
            String b10 = rVar.b();
            String d10 = rVar.d();
            if (d10 != null) {
                b10 = b10 + '?' + d10;
            }
            sb.append(b10);
        }
        sb.append(" HTTP/1.1");
        String sb2 = sb.toString();
        g.e(sb2, "StringBuilder().apply(builderAction).toString()");
        k(xVar.d, sb2);
    }

    public final h h() {
        return this.f7772e;
    }

    public final d j(long j8) {
        if (this.f7769a == 4) {
            this.f7769a = 5;
            return new d(j8);
        }
        throw new IllegalStateException(("state: " + this.f7769a).toString());
    }

    public final void k(q qVar, String str) {
        boolean z;
        g.f(qVar, "headers");
        g.f(str, "requestLine");
        if (this.f7769a == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            w9.h hVar = this.f7774g;
            hVar.Y(str).Y("\r\n");
            int length = qVar.f6300o.length / 2;
            for (int i10 = 0; i10 < length; i10++) {
                hVar.Y(qVar.h(i10)).Y(": ").Y(qVar.k(i10)).Y("\r\n");
            }
            hVar.Y("\r\n");
            this.f7769a = 1;
            return;
        }
        throw new IllegalStateException(("state: " + this.f7769a).toString());
    }
}
