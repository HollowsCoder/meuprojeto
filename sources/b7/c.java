package b7;

import android.os.Bundle;
import android.util.Log;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import q1.d;
import s6.a;

public final class c implements b, a {

    /* renamed from: o  reason: collision with root package name */
    public final d f1966o;

    /* renamed from: p  reason: collision with root package name */
    public final TimeUnit f1967p;

    /* renamed from: q  reason: collision with root package name */
    public final Object f1968q = new Object();

    /* renamed from: r  reason: collision with root package name */
    public CountDownLatch f1969r;

    public c(d dVar, TimeUnit timeUnit) {
        this.f1966o = dVar;
        this.f1967p = timeUnit;
    }

    public final void a(String str, Bundle bundle) {
        CountDownLatch countDownLatch = this.f1969r;
        if (countDownLatch != null && "_ae".equals(str)) {
            countDownLatch.countDown();
        }
    }

    public final void i(Bundle bundle) {
        synchronized (this.f1968q) {
            a aVar = a.f8805s;
            aVar.L("Logging event _ae to Firebase Analytics with params " + bundle);
            this.f1969r = new CountDownLatch(1);
            this.f1966o.i(bundle);
            aVar.L("Awaiting app exception callback from Analytics...");
            try {
                if (this.f1969r.await((long) 500, this.f1967p)) {
                    aVar.L("App exception callback received from Analytics listener.");
                } else {
                    aVar.M("Timeout exceeded while awaiting app exception callback from Analytics listener.", (Exception) null);
                }
            } catch (InterruptedException unused) {
                Log.e("FirebaseCrashlytics", "Interrupted while awaiting app exception callback from Analytics listener.", (Throwable) null);
            }
            this.f1969r = null;
        }
    }
}
