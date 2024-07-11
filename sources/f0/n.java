package f0;

import android.os.Handler;
import java.util.concurrent.Callable;

public final class n<T> implements Runnable {

    /* renamed from: o  reason: collision with root package name */
    public final Callable<T> f4585o;

    /* renamed from: p  reason: collision with root package name */
    public final h0.a<T> f4586p;

    /* renamed from: q  reason: collision with root package name */
    public final Handler f4587q;

    public class a implements Runnable {

        /* renamed from: o  reason: collision with root package name */
        public final /* synthetic */ h0.a f4588o;

        /* renamed from: p  reason: collision with root package name */
        public final /* synthetic */ Object f4589p;

        public a(h0.a aVar, Object obj) {
            this.f4588o = aVar;
            this.f4589p = obj;
        }

        public final void run() {
            this.f4588o.accept(this.f4589p);
        }
    }

    public n(Handler handler, h hVar, i iVar) {
        this.f4585o = hVar;
        this.f4586p = iVar;
        this.f4587q = handler;
    }

    public final void run() {
        T t10;
        try {
            t10 = this.f4585o.call();
        } catch (Exception unused) {
            t10 = null;
        }
        this.f4587q.post(new a(this.f4586p, t10));
    }
}
