package m3;

import java.util.concurrent.Executor;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final a f7071a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static final b f7072b = new b();

    public class a implements Executor {
        public final void execute(Runnable runnable) {
            j.e().post(runnable);
        }
    }

    public class b implements Executor {
        public final void execute(Runnable runnable) {
            runnable.run();
        }
    }
}
