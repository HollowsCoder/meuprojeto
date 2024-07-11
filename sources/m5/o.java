package m5;

import i4.l;
import java.util.concurrent.Executor;

public final class o<TResult> implements p<TResult> {

    /* renamed from: o  reason: collision with root package name */
    public final Executor f7109o;

    /* renamed from: p  reason: collision with root package name */
    public final Object f7110p = new Object();

    /* renamed from: q  reason: collision with root package name */
    public c f7111q;

    public o(Executor executor, c cVar) {
        this.f7109o = executor;
        this.f7111q = cVar;
    }

    public final void a(i<TResult> iVar) {
        if (iVar.k()) {
            synchronized (this.f7110p) {
                if (this.f7111q != null) {
                    this.f7109o.execute(new l(4, this));
                }
            }
        }
    }

    public final void d() {
        synchronized (this.f7110p) {
            this.f7111q = null;
        }
    }
}
