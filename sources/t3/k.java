package t3;

import a4.g;
import a4.q;
import a4.r;
import a4.w;
import android.content.Context;
import c4.b;
import c4.c;
import java.util.concurrent.Executor;
import m8.a;
import t3.o;
import u3.j;
import u3.l;
import w3.c;
import y3.e;
import y3.f;
import z3.n;
import z3.p;

public final class k extends y {

    /* renamed from: o  reason: collision with root package name */
    public a<Executor> f8964o = w3.a.a(o.a.f8971a);

    /* renamed from: p  reason: collision with root package name */
    public c f8965p;

    /* renamed from: q  reason: collision with root package name */
    public a f8966q;

    /* renamed from: r  reason: collision with root package name */
    public a<q> f8967r;

    /* renamed from: s  reason: collision with root package name */
    public a<x> f8968s;

    public k(Context context) {
        Context context2 = context;
        if (context2 != null) {
            c cVar = new c(context2);
            this.f8965p = cVar;
            b bVar = b.a.f2138a;
            c4.c cVar2 = c.a.f2139a;
            this.f8966q = w3.a.a(new l(cVar, new j(cVar)));
            w3.c cVar3 = this.f8965p;
            a<q> a10 = w3.a.a(new r(new w(cVar3), new g(cVar3)));
            this.f8967r = a10;
            e eVar = new e();
            w3.c cVar4 = this.f8965p;
            f fVar = new f(cVar4, a10, eVar);
            a<Executor> aVar = this.f8964o;
            a aVar2 = this.f8966q;
            z zVar = new z(aVar, aVar2, fVar, a10, a10, 1);
            this.f8968s = w3.a.a(new z(bVar, cVar2, zVar, new n(cVar4, aVar2, a10, fVar, aVar, a10, a10), new p(aVar, a10, fVar, a10), 0));
            return;
        }
        throw new NullPointerException("instance cannot be null");
    }
}
