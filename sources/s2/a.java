package s2;

import android.os.Process;
import java.util.concurrent.ThreadFactory;

public final class a implements ThreadFactory {

    /* renamed from: s2.a$a  reason: collision with other inner class name */
    public class C0127a implements Runnable {

        /* renamed from: o  reason: collision with root package name */
        public final /* synthetic */ Runnable f8553o;

        public C0127a(Runnable runnable) {
            this.f8553o = runnable;
        }

        public final void run() {
            Process.setThreadPriority(10);
            this.f8553o.run();
        }
    }

    public final Thread newThread(Runnable runnable) {
        return new Thread(new C0127a(runnable), "glide-active-resources");
    }
}
