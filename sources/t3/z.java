package t3;

import java.util.concurrent.Executor;
import m8.a;
import u3.e;
import w3.b;
import y3.c;
import y3.d;
import z3.m;
import z3.o;
import z3.q;

public final class z implements b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8987a;

    /* renamed from: b  reason: collision with root package name */
    public final a f8988b;

    /* renamed from: c  reason: collision with root package name */
    public final a f8989c;
    public final a d;

    /* renamed from: e  reason: collision with root package name */
    public final a f8990e;

    /* renamed from: f  reason: collision with root package name */
    public final a f8991f;

    public /* synthetic */ z(a aVar, a aVar2, b bVar, a aVar3, a aVar4, int i10) {
        this.f8987a = i10;
        this.f8988b = aVar;
        this.f8989c = aVar2;
        this.d = bVar;
        this.f8990e = aVar3;
        this.f8991f = aVar4;
    }

    public final Object get() {
        int i10 = this.f8987a;
        a aVar = this.f8991f;
        a aVar2 = this.f8990e;
        a aVar3 = this.d;
        a aVar4 = this.f8989c;
        a aVar5 = this.f8988b;
        switch (i10) {
            case 0:
                return new x((c4.a) aVar5.get(), (c4.a) aVar4.get(), (d) aVar3.get(), (m) aVar2.get(), (o) aVar.get());
            default:
                return new c((Executor) aVar5.get(), (e) aVar4.get(), (q) aVar3.get(), (a4.d) aVar2.get(), (b4.b) aVar.get());
        }
    }
}
