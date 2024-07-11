package z6;

import d7.o0;
import d7.p0;
import d7.v;
import d7.x;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import k7.c;
import m5.j;

public final class d implements Callable<Void> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ boolean f9937a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ x f9938b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ c f9939c;

    public d(boolean z, x xVar, c cVar) {
        this.f9937a = z;
        this.f9938b = xVar;
        this.f9939c = cVar;
    }

    public final Object call() {
        if (!this.f9937a) {
            return null;
        }
        x xVar = this.f9938b;
        xVar.getClass();
        v vVar = new v(xVar, this.f9939c);
        ExecutorService executorService = p0.f4263a;
        xVar.f4298k.execute(new o0(vVar, new j()));
        return null;
    }
}
