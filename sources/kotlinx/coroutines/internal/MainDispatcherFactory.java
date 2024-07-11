package kotlinx.coroutines.internal;

import g9.s0;
import java.util.List;

public interface MainDispatcherFactory {
    s0 createDispatcher(List<? extends MainDispatcherFactory> list);

    int getLoadPriority();

    String hintOnError();
}
