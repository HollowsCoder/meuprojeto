package v2;

import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class a implements ExecutorService {

    /* renamed from: p  reason: collision with root package name */
    public static final long f9122p = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: q  reason: collision with root package name */
    public static volatile int f9123q;

    /* renamed from: o  reason: collision with root package name */
    public final ExecutorService f9124o;

    /* renamed from: v2.a$a  reason: collision with other inner class name */
    public static final class C0139a implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        public final String f9125a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f9126b;

        /* renamed from: c  reason: collision with root package name */
        public int f9127c;

        /* renamed from: v2.a$a$a  reason: collision with other inner class name */
        public class C0140a extends Thread {
            public C0140a(Runnable runnable, String str) {
                super(runnable, str);
            }

            public final void run() {
                Process.setThreadPriority(9);
                if (C0139a.this.f9126b) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    super.run();
                } catch (Throwable th) {
                    if (Log.isLoggable("GlideExecutor", 6)) {
                        Log.e("GlideExecutor", "Request threw uncaught throwable", th);
                    }
                }
            }
        }

        public C0139a(String str, boolean z) {
            this.f9125a = str;
            this.f9126b = z;
        }

        public final synchronized Thread newThread(Runnable runnable) {
            C0140a aVar;
            aVar = new C0140a(runnable, "glide-" + this.f9125a + "-thread-" + this.f9127c);
            this.f9127c = this.f9127c + 1;
            return aVar;
        }
    }

    public a(ThreadPoolExecutor threadPoolExecutor) {
        this.f9124o = threadPoolExecutor;
    }

    public final boolean awaitTermination(long j8, TimeUnit timeUnit) {
        return this.f9124o.awaitTermination(j8, timeUnit);
    }

    public final void execute(Runnable runnable) {
        this.f9124o.execute(runnable);
    }

    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) {
        return this.f9124o.invokeAll(collection);
    }

    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j8, TimeUnit timeUnit) {
        return this.f9124o.invokeAll(collection, j8, timeUnit);
    }

    public final <T> T invokeAny(Collection<? extends Callable<T>> collection) {
        return this.f9124o.invokeAny(collection);
    }

    public final <T> T invokeAny(Collection<? extends Callable<T>> collection, long j8, TimeUnit timeUnit) {
        return this.f9124o.invokeAny(collection, j8, timeUnit);
    }

    public final boolean isShutdown() {
        return this.f9124o.isShutdown();
    }

    public final boolean isTerminated() {
        return this.f9124o.isTerminated();
    }

    public final void shutdown() {
        this.f9124o.shutdown();
    }

    public final List<Runnable> shutdownNow() {
        return this.f9124o.shutdownNow();
    }

    public final Future<?> submit(Runnable runnable) {
        return this.f9124o.submit(runnable);
    }

    public final <T> Future<T> submit(Runnable runnable, T t10) {
        return this.f9124o.submit(runnable, t10);
    }

    public final <T> Future<T> submit(Callable<T> callable) {
        return this.f9124o.submit(callable);
    }

    public final String toString() {
        return this.f9124o.toString();
    }
}
