package t3;

import android.util.Log;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

public final class q implements Executor {

    /* renamed from: o  reason: collision with root package name */
    public final Executor f8973o;

    public static class a implements Runnable {

        /* renamed from: o  reason: collision with root package name */
        public final Runnable f8974o;

        public a(Runnable runnable) {
            this.f8974o = runnable;
        }

        public final void run() {
            try {
                this.f8974o.run();
            } catch (Exception e10) {
                Log.e(androidx.databinding.a.o("Executor"), "Background execution failure.", e10);
            }
        }
    }

    public q(ExecutorService executorService) {
        this.f8973o = executorService;
    }

    public final void execute(Runnable runnable) {
        this.f8973o.execute(new a(runnable));
    }
}
