package h5;

import java.lang.Thread;

public final class e4 implements Thread.UncaughtExceptionHandler {

    /* renamed from: a  reason: collision with root package name */
    public final String f5352a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ h4 f5353b;

    public e4(h4 h4Var, String str) {
        this.f5353b = h4Var;
        this.f5352a = str;
    }

    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        g3 g3Var = this.f5353b.f5649o.w;
        i4.n(g3Var);
        g3Var.f5397t.b(th, this.f5352a);
    }
}
