package m5;

import java.util.concurrent.Executor;

public final class q implements Executor {
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
