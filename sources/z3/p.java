package z3;

import a4.d;
import java.util.concurrent.Executor;
import m8.a;
import w3.b;
import y3.f;

public final class p implements b<o> {

    /* renamed from: a  reason: collision with root package name */
    public final a<Executor> f9925a;

    /* renamed from: b  reason: collision with root package name */
    public final a<d> f9926b;

    /* renamed from: c  reason: collision with root package name */
    public final a<q> f9927c;
    public final a<b4.b> d;

    public p(a aVar, a aVar2, f fVar, a aVar3) {
        this.f9925a = aVar;
        this.f9926b = aVar2;
        this.f9927c = fVar;
        this.d = aVar3;
    }

    public final Object get() {
        return new o(this.f9925a.get(), this.f9926b.get(), this.f9927c.get(), this.d.get());
    }
}
