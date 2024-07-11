package d7;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

public final class e0 implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f4216a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AtomicLong f4217b;

    public class a extends c {

        /* renamed from: o  reason: collision with root package name */
        public final /* synthetic */ Runnable f4218o;

        public a(Runnable runnable) {
            this.f4218o = runnable;
        }

        public final void a() {
            this.f4218o.run();
        }
    }

    public e0(String str, AtomicLong atomicLong) {
        this.f4216a = str;
        this.f4217b = atomicLong;
    }

    public final Thread newThread(Runnable runnable) {
        Thread newThread = Executors.defaultThreadFactory().newThread(new a(runnable));
        newThread.setName(this.f4216a + this.f4217b.getAndIncrement());
        return newThread;
    }
}
