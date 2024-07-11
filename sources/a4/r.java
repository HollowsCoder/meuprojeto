package a4;

import a4.i;
import c4.b;
import c4.c;
import m8.a;
import w3.b;

public final class r implements b<q> {

    /* renamed from: a  reason: collision with root package name */
    public final a<c4.a> f96a;

    /* renamed from: b  reason: collision with root package name */
    public final a<c4.a> f97b;

    /* renamed from: c  reason: collision with root package name */
    public final a<e> f98c;
    public final a<v> d;

    /* renamed from: e  reason: collision with root package name */
    public final a<String> f99e;

    public r(w wVar, g gVar) {
        c4.b bVar = b.a.f2138a;
        c cVar = c.a.f2139a;
        i iVar = i.a.f73a;
        this.f96a = bVar;
        this.f97b = cVar;
        this.f98c = iVar;
        this.d = wVar;
        this.f99e = gVar;
    }

    public final Object get() {
        w3.a aVar;
        c4.a aVar2 = this.f96a.get();
        c4.a aVar3 = this.f97b.get();
        e eVar = this.f98c.get();
        v vVar = this.d.get();
        Object obj = w3.a.f9232c;
        a<String> aVar4 = this.f99e;
        if (aVar4 instanceof v3.a) {
            aVar = (v3.a) aVar4;
        } else {
            aVar4.getClass();
            aVar = new w3.a(aVar4);
        }
        return new q(aVar2, aVar3, eVar, vVar, aVar);
    }
}
