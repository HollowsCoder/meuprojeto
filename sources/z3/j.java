package z3;

import a4.d;
import b4.b;
import f7.c0;
import t3.s;
import v7.a;

public final /* synthetic */ class j implements b.a, a.C0141a {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ long f9897o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ Object f9898p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ Object f9899q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ Object f9900r;

    public /* synthetic */ j(String str, String str2, long j8, c0 c0Var) {
        this.f9898p = str;
        this.f9899q = str2;
        this.f9897o = j8;
        this.f9900r = c0Var;
    }

    public /* synthetic */ j(m mVar, Iterable iterable, s sVar, long j8) {
        this.f9898p = mVar;
        this.f9899q = iterable;
        this.f9900r = sVar;
        this.f9897o = j8;
    }

    public final Object b() {
        m mVar = (m) this.f9898p;
        d dVar = mVar.f9908c;
        dVar.W((Iterable) this.f9899q);
        dVar.a0(mVar.f9911g.a() + this.f9897o, (s) this.f9900r);
        return null;
    }

    public final void d(v7.b bVar) {
        ((a7.a) bVar.get()).c((String) this.f9898p, (String) this.f9899q, this.f9897o, (c0) this.f9900r);
    }
}
