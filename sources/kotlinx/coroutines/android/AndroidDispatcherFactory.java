package kotlinx.coroutines.android;

import android.os.Looper;
import h9.a;
import h9.c;
import java.util.List;
import kotlinx.coroutines.internal.MainDispatcherFactory;

public final class AndroidDispatcherFactory implements MainDispatcherFactory {
    public a createDispatcher(List<? extends MainDispatcherFactory> list) {
        return new a(c.a(Looper.getMainLooper()));
    }

    public int getLoadPriority() {
        return 1073741823;
    }

    public String hintOnError() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }
}
