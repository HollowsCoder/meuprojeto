package j9;

import java.util.concurrent.ThreadFactory;

public final class b implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f6600a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f6601b;

    public b(String str, boolean z) {
        this.f6600a = str;
        this.f6601b = z;
    }

    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.f6600a);
        thread.setDaemon(this.f6601b);
        return thread;
    }
}
