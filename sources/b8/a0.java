package b8;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.firebase.messaging.FirebaseMessaging;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;

public final /* synthetic */ class a0 implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f1973a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ScheduledExecutorService f1974b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ FirebaseMessaging f1975c;
    public final /* synthetic */ p d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ m f1976e;

    public /* synthetic */ a0(Context context, FirebaseMessaging firebaseMessaging, m mVar, p pVar, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.f1973a = context;
        this.f1974b = scheduledThreadPoolExecutor;
        this.f1975c = firebaseMessaging;
        this.d = pVar;
        this.f1976e = mVar;
    }

    public final Object call() {
        z zVar;
        Context context = this.f1973a;
        ScheduledExecutorService scheduledExecutorService = this.f1974b;
        FirebaseMessaging firebaseMessaging = this.f1975c;
        p pVar = this.d;
        m mVar = this.f1976e;
        synchronized (z.class) {
            WeakReference<z> weakReference = z.f2062b;
            if (weakReference != null) {
                zVar = weakReference.get();
            } else {
                zVar = null;
            }
            if (zVar == null) {
                SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
                z zVar2 = new z(sharedPreferences, scheduledExecutorService);
                synchronized (zVar2) {
                    zVar2.f2063a = w.a(sharedPreferences, scheduledExecutorService);
                }
                z.f2062b = new WeakReference<>(zVar2);
                zVar = zVar2;
            }
        }
        return new b0(firebaseMessaging, pVar, zVar, mVar, context, scheduledExecutorService);
    }
}
