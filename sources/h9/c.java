package h9;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import n.e;
import n8.e;

public final class c {
    private static volatile Choreographer choreographer;

    static {
        Object obj;
        try {
            obj = new a(a(Looper.getMainLooper()));
        } catch (Throwable th) {
            obj = e.s(th);
        }
        if (obj instanceof e.a) {
            obj = null;
        }
        b bVar = (b) obj;
    }

    public static final Handler a(Looper looper) {
        Class<Looper> cls = Looper.class;
        Class<Handler> cls2 = Handler.class;
        if (Build.VERSION.SDK_INT >= 28) {
            Object invoke = cls2.getDeclaredMethod("createAsync", new Class[]{cls}).invoke((Object) null, new Object[]{looper});
            if (invoke != null) {
                return (Handler) invoke;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.os.Handler");
        }
        try {
            return cls2.getDeclaredConstructor(new Class[]{cls, Handler.Callback.class, Boolean.TYPE}).newInstance(new Object[]{looper, null, Boolean.TRUE});
        } catch (NoSuchMethodException unused) {
            return new Handler(looper);
        }
    }
}
