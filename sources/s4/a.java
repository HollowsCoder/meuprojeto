package s4;

import androidx.annotation.RecentlyNonNull;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public final class a implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public final String f8781a;

    /* renamed from: b  reason: collision with root package name */
    public final ThreadFactory f8782b = Executors.defaultThreadFactory();

    public a(@RecentlyNonNull String str) {
        this.f8781a = str;
    }

    @RecentlyNonNull
    public final Thread newThread(@RecentlyNonNull Runnable runnable) {
        Thread newThread = this.f8782b.newThread(new b(runnable));
        newThread.setName(this.f8781a);
        return newThread;
    }
}
