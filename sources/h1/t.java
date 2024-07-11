package h1;

import android.os.Handler;
import android.os.Looper;
import java.util.LinkedHashSet;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public final class t<T> {

    /* renamed from: e  reason: collision with root package name */
    public static final ExecutorService f5209e = Executors.newCachedThreadPool();

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashSet f5210a;

    /* renamed from: b  reason: collision with root package name */
    public final LinkedHashSet f5211b;

    /* renamed from: c  reason: collision with root package name */
    public final Handler f5212c;
    public volatile r<T> d;

    public class a extends FutureTask<r<T>> {
        public a(Callable<r<T>> callable) {
            super(callable);
        }

        public final void done() {
            t tVar = t.this;
            if (!isCancelled()) {
                try {
                    tVar.a((r) get());
                } catch (InterruptedException | ExecutionException e10) {
                    tVar.a(new r(e10));
                }
            }
        }
    }

    public t() {
        throw null;
    }

    public t(Callable<r<T>> callable, boolean z) {
        this.f5210a = new LinkedHashSet(1);
        this.f5211b = new LinkedHashSet(1);
        this.f5212c = new Handler(Looper.getMainLooper());
        this.d = null;
        if (z) {
            try {
                a(callable.call());
            } catch (Throwable th) {
                a(new r(th));
            }
        } else {
            f5209e.execute(new a(callable));
        }
    }

    public final void a(r<T> rVar) {
        if (this.d == null) {
            this.d = rVar;
            this.f5212c.post(new s(this));
            return;
        }
        throw new IllegalStateException("A task may only be set once.");
    }
}
