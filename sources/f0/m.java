package f0;

import android.os.Process;
import java.util.concurrent.ThreadFactory;

public final class m implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public final String f4582a = "fonts-androidx";

    /* renamed from: b  reason: collision with root package name */
    public final int f4583b = 10;

    public static class a extends Thread {

        /* renamed from: o  reason: collision with root package name */
        public final int f4584o;

        public a(Runnable runnable, String str, int i10) {
            super(runnable, str);
            this.f4584o = i10;
        }

        public final void run() {
            Process.setThreadPriority(this.f4584o);
            super.run();
        }
    }

    public final Thread newThread(Runnable runnable) {
        return new a(runnable, this.f4582a, this.f4583b);
    }
}
