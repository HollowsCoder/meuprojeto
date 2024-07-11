package d7;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import m5.i;
import m5.l;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f4219a;

    /* renamed from: b  reason: collision with root package name */
    public i<Void> f4220b = l.e((Object) null);

    /* renamed from: c  reason: collision with root package name */
    public final Object f4221c = new Object();
    public final ThreadLocal<Boolean> d = new ThreadLocal<>();

    public class a implements Runnable {
        public a() {
        }

        public final void run() {
            f.this.d.set(Boolean.TRUE);
        }
    }

    public f(Executor executor) {
        this.f4219a = executor;
        executor.execute(new a());
    }

    public final <T> i<T> a(Callable<T> callable) {
        i<TContinuationResult> e10;
        synchronized (this.f4221c) {
            e10 = this.f4220b.e(this.f4219a, new g(callable));
            this.f4220b = e10.e(this.f4219a, new h());
        }
        return e10;
    }
}
