package n9;

import f9.h;
import i9.b0;
import i9.c0;
import i9.d0;
import i9.k;
import i9.q;
import i9.r;
import i9.s;
import i9.t;
import i9.x;
import j9.c;
import n.e;
import o8.j;
import w9.n;
import z8.g;

public final class a implements s {

    /* renamed from: a  reason: collision with root package name */
    public final k f7502a;

    public a(k kVar) {
        g.f(kVar, "cookieJar");
        this.f7502a = kVar;
    }

    public final c0 a(f fVar) {
        boolean z;
        a aVar;
        d0 d0Var;
        f fVar2 = fVar;
        x xVar = fVar2.f7511f;
        xVar.getClass();
        x.a aVar2 = new x.a(xVar);
        b0 b0Var = xVar.f6368e;
        if (b0Var != null) {
            t b10 = b0Var.b();
            if (b10 != null) {
                aVar2.b("Content-Type", b10.f6321a);
            }
            long a10 = b0Var.a();
            if (a10 != -1) {
                aVar2.b("Content-Length", String.valueOf(a10));
                aVar2.f6372c.f("Transfer-Encoding");
            } else {
                aVar2.b("Transfer-Encoding", "chunked");
                aVar2.f6372c.f("Content-Length");
            }
        }
        q qVar = xVar.d;
        String e10 = qVar.e("Host");
        int i10 = 0;
        r rVar = xVar.f6366b;
        if (e10 == null) {
            aVar2.b("Host", c.u(rVar, false));
        }
        if (qVar.e("Connection") == null) {
            aVar2.b("Connection", "Keep-Alive");
        }
        if (qVar.e("Accept-Encoding") == null && qVar.e("Range") == null) {
            aVar2.b("Accept-Encoding", "gzip");
            aVar = this;
            z = true;
        } else {
            aVar = this;
            z = false;
        }
        k kVar = aVar.f7502a;
        kVar.e(rVar);
        if (!true) {
            StringBuilder sb = new StringBuilder();
            j jVar = j.f7763o;
            while (jVar.hasNext()) {
                Object next = jVar.next();
                int i11 = i10 + 1;
                if (i10 >= 0) {
                    i9.j jVar2 = (i9.j) next;
                    if (i10 > 0) {
                        sb.append("; ");
                    }
                    sb.append(jVar2.f6273a);
                    sb.append('=');
                    sb.append(jVar2.f6274b);
                    i10 = i11;
                } else {
                    throw new ArithmeticException("Index overflow has happened.");
                }
            }
            String sb2 = sb.toString();
            g.e(sb2, "StringBuilder().apply(builderAction).toString()");
            aVar2.b("Cookie", sb2);
        }
        if (qVar.e("User-Agent") == null) {
            aVar2.b("User-Agent", "okhttp/4.9.0");
        }
        c0 b11 = fVar2.b(aVar2.a());
        q qVar2 = b11.u;
        e.b(kVar, rVar, qVar2);
        c0.a aVar3 = new c0.a(b11);
        aVar3.f6199a = xVar;
        if (z && h.V("gzip", c0.b(b11, "Content-Encoding")) && e.a(b11) && (d0Var = b11.f6196v) != null) {
            n nVar = new n(d0Var.c());
            q.a i12 = qVar2.i();
            i12.f("Content-Encoding");
            i12.f("Content-Length");
            aVar3.c(i12.d());
            aVar3.f6204g = new g(c0.b(b11, "Content-Type"), -1, e.o(nVar));
        }
        return aVar3.a();
    }
}
