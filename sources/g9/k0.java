package g9;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import n8.i;
import y8.l;

public final class k0 extends n0 {

    /* renamed from: t  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f5023t = AtomicIntegerFieldUpdater.newUpdater(k0.class, "_invoked");
    private volatile /* synthetic */ int _invoked = 0;

    /* renamed from: s  reason: collision with root package name */
    public final l<Throwable, i> f5024s;

    public k0(p0 p0Var) {
        this.f5024s = p0Var;
    }

    public final /* bridge */ /* synthetic */ Object k(Object obj) {
        q((Throwable) obj);
        return i.f7501a;
    }

    public final void q(Throwable th) {
        if (f5023t.compareAndSet(this, 0, 1)) {
            this.f5024s.k(th);
        }
    }
}
