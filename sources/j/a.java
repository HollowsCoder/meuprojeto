package j;

import android.os.Looper;
import androidx.activity.result.c;

public final class a extends c {

    /* renamed from: p  reason: collision with root package name */
    public static volatile a f6378p;

    /* renamed from: o  reason: collision with root package name */
    public final b f6379o = new b();

    public static a E() {
        if (f6378p != null) {
            return f6378p;
        }
        synchronized (a.class) {
            if (f6378p == null) {
                f6378p = new a();
            }
        }
        return f6378p;
    }

    public final void F(Runnable runnable) {
        b bVar = this.f6379o;
        if (bVar.f6381p == null) {
            synchronized (bVar.f6380o) {
                if (bVar.f6381p == null) {
                    bVar.f6381p = b.E(Looper.getMainLooper());
                }
            }
        }
        bVar.f6381p.post(runnable);
    }
}
