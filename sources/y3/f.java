package y3;

import a4.d;
import android.content.Context;
import c4.c;
import m8.a;
import w3.b;
import z3.e;
import z3.q;

public final class f implements b<q> {

    /* renamed from: a  reason: collision with root package name */
    public final a<Context> f9548a;

    /* renamed from: b  reason: collision with root package name */
    public final a<d> f9549b;

    /* renamed from: c  reason: collision with root package name */
    public final a<e> f9550c;
    public final a<c4.a> d;

    public f(a aVar, a aVar2, e eVar) {
        c cVar = c.a.f2139a;
        this.f9548a = aVar;
        this.f9549b = aVar2;
        this.f9550c = eVar;
        this.d = cVar;
    }

    public final Object get() {
        c4.a aVar = this.d.get();
        return new z3.d(this.f9548a.get(), this.f9549b.get(), this.f9550c.get());
    }
}
