package z4;

import android.os.Handler;
import android.os.Looper;

public class c extends Handler {
    public c(Looper looper) {
        super(looper);
    }

    public c(Looper looper, Handler.Callback callback) {
        super(looper, callback);
    }
}
