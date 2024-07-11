package s4;

import android.os.Process;

public final class b implements Runnable {

    /* renamed from: o  reason: collision with root package name */
    public final Runnable f8783o;

    public b(Runnable runnable) {
        this.f8783o = runnable;
    }

    public final void run() {
        Process.setThreadPriority(0);
        this.f8783o.run();
    }
}
