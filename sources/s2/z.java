package s2;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

public final class z {

    /* renamed from: a  reason: collision with root package name */
    public boolean f8711a;

    /* renamed from: b  reason: collision with root package name */
    public final Handler f8712b = new Handler(Looper.getMainLooper(), new a());

    public static final class a implements Handler.Callback {
        public final boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((w) message.obj).d();
            return true;
        }
    }

    public final synchronized void a(w<?> wVar, boolean z) {
        if (!this.f8711a) {
            if (!z) {
                this.f8711a = true;
                wVar.d();
                this.f8711a = false;
            }
        }
        this.f8712b.obtainMessage(1, wVar).sendToTarget();
    }
}
