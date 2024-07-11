package i4;

import android.content.Context;
import android.util.Log;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import m5.r;
import s4.a;

public final class u {

    /* renamed from: e  reason: collision with root package name */
    public static u f6105e;

    /* renamed from: a  reason: collision with root package name */
    public final Context f6106a;

    /* renamed from: b  reason: collision with root package name */
    public final ScheduledExecutorService f6107b;

    /* renamed from: c  reason: collision with root package name */
    public p f6108c = new p(this);
    public int d = 1;

    public u(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f6107b = scheduledExecutorService;
        this.f6106a = context.getApplicationContext();
    }

    public static synchronized u a(Context context) {
        u uVar;
        synchronized (u.class) {
            if (f6105e == null) {
                f6105e = new u(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new a("MessengerIpcClient"))));
            }
            uVar = f6105e;
        }
        return uVar;
    }

    public final synchronized r b(r rVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(rVar);
            StringBuilder sb = new StringBuilder(valueOf.length() + 9);
            sb.append("Queueing ");
            sb.append(valueOf);
            Log.d("MessengerIpcClient", sb.toString());
        }
        if (!this.f6108c.d(rVar)) {
            p pVar = new p(this);
            this.f6108c = pVar;
            pVar.d(rVar);
        }
        return rVar.f6103b.f7089a;
    }
}
