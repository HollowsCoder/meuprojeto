package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteCallbackList;
import java.util.HashMap;

public class MultiInstanceInvalidationService extends Service {

    /* renamed from: o  reason: collision with root package name */
    public int f1870o = 0;

    /* renamed from: p  reason: collision with root package name */
    public final HashMap<Integer, String> f1871p = new HashMap<>();

    /* renamed from: q  reason: collision with root package name */
    public final a f1872q = new a();

    /* renamed from: r  reason: collision with root package name */
    public final b f1873r = new b();

    public class a extends RemoteCallbackList<z0.a> {
        public a() {
        }

        public final void onCallbackDied(IInterface iInterface, Object obj) {
            z0.a aVar = (z0.a) iInterface;
            MultiInstanceInvalidationService.this.f1871p.remove(Integer.valueOf(((Integer) obj).intValue()));
        }
    }

    public class b extends z0.b {
        public b() {
        }
    }

    public final IBinder onBind(Intent intent) {
        return this.f1873r;
    }
}
