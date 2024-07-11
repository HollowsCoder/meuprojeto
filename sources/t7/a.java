package t7;

import java.util.concurrent.ThreadFactory;

public final /* synthetic */ class a implements ThreadFactory {
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "heartbeat-information-executor");
    }
}
