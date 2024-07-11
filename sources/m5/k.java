package m5;

import android.os.Looper;
import java.util.concurrent.Executor;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static final a f7090a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static final q f7091b = new q();

    public static final class a implements Executor {

        /* renamed from: o  reason: collision with root package name */
        public final f5.a f7092o = new f5.a(Looper.getMainLooper());

        public final void execute(Runnable runnable) {
            this.f7092o.post(runnable);
        }
    }
}
