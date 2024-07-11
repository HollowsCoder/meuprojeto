package h5;

import java.util.concurrent.Callable;
import n4.m;

public final class x6 implements Callable<String> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ i7 f5808a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ z6 f5809b;

    public x6(z6 z6Var, i7 i7Var) {
        this.f5809b = z6Var;
        this.f5808a = i7Var;
    }

    public final Object call() {
        i7 i7Var = this.f5808a;
        String str = i7Var.f5468o;
        m.h(str);
        z6 z6Var = this.f5809b;
        if (z6Var.M(str).e() && f.b(i7Var.J).e()) {
            return z6Var.q(i7Var).y();
        }
        z6Var.e().B.a("Analytics storage consent denied. Returning null app instance id");
        return null;
    }
}
